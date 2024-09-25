/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
 * Copyright (c) 2022, Skretzo <https://github.com/Skretzo>
 * Copyright (c) 2024, Jmlundeen <https://github.com/Jmlundeen>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.cache;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.zip.GZIPOutputStream;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.cache.definitions.ObjectDefinition;
import net.runelite.cache.fs.Store;
import net.runelite.cache.region.Location;
import net.runelite.cache.region.Position;
import net.runelite.cache.region.Region;
import net.runelite.cache.region.RegionLoader;
import net.runelite.cache.util.KeyProvider;
import net.runelite.cache.util.XteaKeyManager;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/**
 * Collision map dumper
 *
 * Cache and XTEA keys can be downloaded from:
 * https://archive.openrs2.org/caches
 * add these parameters to the command line with paths to the cache and XTEA keys files:
 * --cachedir "path\to\cache folder"
 * --xteapath "path\to\xtea keys file"
 * --outputdir "path\to\output folder"
 */
@Slf4j
@Getter
public class CollisionMapDumper
{
	private final RegionLoader regionLoader;
	private final ObjectManager objectManager;
	private final FlagMap[] regions = new FlagMap[256 * 256];

	public CollisionMapDumper(Store store, KeyProvider keyProvider)
	{
		this(store, new RegionLoader(store, keyProvider));
	}

	public CollisionMapDumper(Store store, RegionLoader regionLoader)
	{
		this.regionLoader = regionLoader;
		this.objectManager = new ObjectManager(store);
	}

	public CollisionMapDumper load() throws IOException
	{
		objectManager.load();
		regionLoader.loadRegions();
		regionLoader.calculateBounds();

		return this;
	}

	private ObjectDefinition findObject(int id)
	{
		return objectManager.getObject(id);
	}

	public byte[] toBytes()
	{
		var regionCount = (int) Arrays.stream(regions).filter(Objects::nonNull).count();
		var buffer = ByteBuffer.allocate(regionCount * (2 + 64 * 64 * 4 * 2 / 8));

		for (var i = 0; i < regions.length; i++)
		{
			if (regions[i] != null)
			{
				buffer.putShort((short) i);
				regions[i].write(buffer);
			}
		}

		return buffer.array();
	}

	public File writeToFile(String outputDir)
	{
		byte[] bytes = toBytes();
		if (outputDir == null || outputDir.equals("null/regions"))
		{
			outputDir = "runelite-client/src/main/resources/regions";
		}
		System.out.println("Writing collision map to " + outputDir);
		File fileLoc = new File(outputDir);
		if (!fileLoc.isFile())
		{
			try
			{
				fileLoc.createNewFile();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}

		try (ByteArrayOutputStream bos = new ByteArrayOutputStream(bytes.length);
		     GZIPOutputStream gos = new GZIPOutputStream(bos);
		     FileOutputStream fos = new FileOutputStream(fileLoc))
		{
			gos.write(bytes);
			gos.finish();
			fos.write(bos.toByteArray());
			gos.flush();
			fos.flush();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		return fileLoc;
	}

	public static void main(String[] args) throws IOException
	{
		Options options = new Options();
		options.addOption(Option.builder().longOpt("cachedir").hasArg().required().build());
		options.addOption(Option.builder().longOpt("xteapath").hasArg().required().build());
		options.addOption(Option.builder().longOpt("outputdir").hasArg().build());

		CommandLineParser parser = new DefaultParser();
		CommandLine cmd;
		try
		{
			cmd = parser.parse(options, args);
		}
		catch (ParseException ex)
		{
			System.err.println("Error parsing command line options: " + ex.getMessage());
			System.exit(-1);
			return;
		}

		final String cacheDirectory = cmd.getOptionValue("cachedir");
		final String xteaJSONPath = cmd.getOptionValue("xteapath");
		final String outputDirectory = cmd.getOptionValue("outputdir") + "/regions";

		XteaKeyManager xteaKeyManager = new XteaKeyManager();
		try (FileInputStream fin = new FileInputStream(xteaJSONPath))
		{
			xteaKeyManager.loadKeys(fin);
		}

		File base = new File(cacheDirectory);

		try (Store store = new Store(base))
		{
			store.load();

			CollisionMapDumper dumper = new CollisionMapDumper(store, xteaKeyManager);
			dumper.load();

			Collection<Region> regions = dumper.regionLoader.getRegions();

			int total = regions.size();

			ExecutorService executor = Executors.newFixedThreadPool(6);
			List<Future<Void>> futures = new ArrayList<>();

			for (Region region : regions)
			{
				futures.add(executor.submit(() ->
				{
					dumper.makeCollisionMap(region);
					return null;
				}));
			}

			executor.shutdown();

			int n = 0;
			for (Future<Void> future : futures)
			{
				future.get(); // wait for task to complete
				if (++n % 100 == 0)
				{
					log.info("Processed " + n + " / " + total + " regions");
				}
			}

			File file = dumper.writeToFile(outputDirectory);
			if (file != null)
			{
				log.info("Wrote collision map to " + file);
			}
		}
		catch (ExecutionException | InterruptedException e)
		{
			throw new RuntimeException(e);
		}
	}

	private void makeCollisionMap(Region region)
	{
		int baseX = region.getBaseX();
		int baseY = region.getBaseY();

		FlagMap flagMap = new FlagMap(baseX, baseY, baseX + Region.X - 1, baseY + Region.Y - 1);

		addCollisions(flagMap, region);
		addNeighborCollisions(flagMap, region, -1, -1);
		addNeighborCollisions(flagMap, region, -1, 0);
		addNeighborCollisions(flagMap, region, -1, 1);
		addNeighborCollisions(flagMap, region, 0, -1);
		addNeighborCollisions(flagMap, region, 0, 1);
		addNeighborCollisions(flagMap, region, 1, -1);
		addNeighborCollisions(flagMap, region, 1, 0);
		addNeighborCollisions(flagMap, region, 1, 1);
		regions[region.getRegionID()] = flagMap;
	}

	private void addNeighborCollisions(FlagMap flagMap, Region region, int dx, int dy)
	{
		Region neighbor = regionLoader.findRegionForRegionCoordinates(region.getRegionX() + dx, region.getRegionY() + dy);
		if (neighbor == null)
		{
			return;
		}
		if (region == neighbor)
		{
			return;
		}
		addCollisions(flagMap, neighbor);
	}

	private void addCollisions(FlagMap flagMap, Region region)
	{
		int baseX = region.getBaseX();
		int baseY = region.getBaseY();

		for (int z = 0; z < Region.Z; z++)
		{
			for (int localX = 0; localX < Region.X; localX++)
			{
				int regionX = baseX + localX;
				for (int localY = 0; localY < Region.Y; localY++)
				{
					int regionY = baseY + localY;

					boolean isBridge = (region.getTileSetting(1, localX, localY) & 2) != 0;
					int tileZ = z + (isBridge ? 1 : 0);

					for (Location loc : region.getLocations())
					{
						Position pos = loc.getPosition();
						if (pos.getX() != regionX || pos.getY() != regionY || pos.getZ() != tileZ)
						{
							continue;
						}
						boolean tile = FlagMap.TILE_BLOCKED;
						Boolean exclusion = Exclusion.matches(loc.getId());

						int X = loc.getPosition().getX();
						int Y = loc.getPosition().getY();
						int Z = z;

						int type = loc.getType();
						int orientation = loc.getOrientation();

						ObjectDefinition object = findObject(loc.getId());

						int sizeX = (orientation == 1 || orientation == 3) ? object.getSizeY() : object.getSizeX();
						int sizeY = (orientation == 1 || orientation == 3) ? object.getSizeX() : object.getSizeY();

						// Walls
						if (type >= 0 && type <= 3)
						{
							Z = z != tileZ ? z : loc.getPosition().getZ();

							if (object.getMapSceneID() != -1)
							{
								if (exclusion != null)
								{
									tile = exclusion;
								}
								else if (object.getInteractType() == 0)
								{
									continue;
								}
								for (int sx = 0; sx < sizeX; sx++)
								{
									for (int sy = 0; sy < sizeY; sy++)
									{
										if (type == 0 || type == 2)
										{
											if (orientation == 0) // wall on west
											{
												flagMap.set(X + sx - 1, Y + sy, Z, FlagMap.FLAG_WEST, tile);
											}
											else if (orientation == 1) // wall on north
											{
												flagMap.set(X + sx, Y + sy, Z, FlagMap.FLAG_NORTH, tile);
											}
											else if (orientation == 2) // wall on east
											{
												flagMap.set(X + sx, Y + sy, Z, FlagMap.FLAG_EAST, tile);
											}
											else if (orientation == 3) // wall on south
											{
												flagMap.set(X + sx, Y + sy - 1, Z, FlagMap.FLAG_SOUTH, tile);
											}
										}
										else
										{
											setNeighborTileFlags(flagMap, X, Y, Z, tile, sx, sy);
										}
									}
								}
							}
							else
							{
								boolean door = object.getWallOrDoor() != 0;
								boolean doorway = !door && object.getInteractType() == 0 && type == 0;
								tile = door ? FlagMap.TILE_DEFAULT : FlagMap.TILE_BLOCKED;
								if (exclusion != null)
								{
									tile = exclusion;
								}
								else if (doorway)
								{
									continue;
								}

								if (type == 0 || type == 2)
								{
									if (orientation == 0) // wall on west
									{
										flagMap.set(X - 1, Y, Z, FlagMap.FLAG_WEST, tile);
									}
									else if (orientation == 1) // wall on north
									{
										flagMap.set(X, Y, Z, FlagMap.FLAG_NORTH, tile);
									}
									else if (orientation == 2) // wall on east
									{
										flagMap.set(X, Y, Z, FlagMap.FLAG_EAST, tile);
									}
									else if (orientation == 3) // wall on south
									{
										flagMap.set(X, Y - 1, Z, FlagMap.FLAG_SOUTH, tile);
									}
								}

								/*
								if (type == 3)
								{
									if (orientation == 0) // corner north-west
									{
										flagMap.set(X - 1, Y, Z, FlagMap.FLAG_WEST, tile);
									}
									else if (orientation == 1) // corner north-east
									{
										flagMap.set(X, Y, Z, FlagMap.FLAG_NORTH, tile);
									}
									else if (orientation == 2) // corner south-east
									{
										flagMap.set(X, Y, Z, FlagMap.FLAG_EAST, tile);
									}
									else if (orientation == 3) // corner south-west
									{
										flagMap.set(X, Y - 1, Z, FlagMap.FLAG_SOUTH, tile);
									}
								}
								*/

								if (type == 2) // double walls
								{
									if (orientation == 3)
									{
										flagMap.set(X - 1, Y, Z, FlagMap.FLAG_WEST, tile);
									}
									else if (orientation == 0)
									{
										flagMap.set(X, Y, Z, FlagMap.FLAG_NORTH, tile);
									}
									else if (orientation == 1)
									{
										flagMap.set(X, Y, Z, FlagMap.FLAG_EAST, tile);
									}
									else if (orientation == 2)
									{
										flagMap.set(X, Y - 1, Z, FlagMap.FLAG_SOUTH, tile);
									}
								}
							}
						}

						// Diagonal walls
						if (type == 9)
						{
							if (object.getMapSceneID() != -1)
							{
								if (exclusion != null)
								{
									tile = exclusion;
								}
								setObjectTileFlags(flagMap, sizeX, sizeY, X, Y, Z, tile);
							}
							else
							{
								boolean door = object.getWallOrDoor() != 0;
								tile = door ? FlagMap.TILE_DEFAULT : FlagMap.TILE_BLOCKED;
								if (exclusion != null)
								{
									tile = exclusion;
								}

								if (orientation != 0 && orientation != 2) // diagonal wall pointing north-east
								{
									flagMap.set(X, Y, Z, FlagMap.FLAG_NORTH, tile);
									flagMap.set(X, Y, Z, FlagMap.FLAG_EAST, tile);
									flagMap.set(X, Y - 1, Z, FlagMap.FLAG_NORTH, tile);
									flagMap.set(X - 1, Y, Z, FlagMap.FLAG_EAST, tile);
								}
								else // diagonal wall pointing north-west
								{
									flagMap.set(X, Y, Z, FlagMap.FLAG_NORTH, tile);
									flagMap.set(X, Y, Z, FlagMap.FLAG_WEST, tile);
									flagMap.set(X, Y - 1, Z, FlagMap.FLAG_NORTH, tile);
									flagMap.set(X - 1, Y, Z, FlagMap.FLAG_WEST, tile);
								}
							}
						}

						// Remaining objects
						if (type == 22 || (type >= 9 && type <= 11) || (type >= 12 && type <= 21))
						{
							// Some hidden objects (like herbiboar tracks) have no object models, but were counted as
							// being blocked in the collision map. We should skip these.
							if (object.getObjectModels() == null)
							{
								continue;
							}
							if (object.getInteractType() != 0 && (object.getWallOrDoor() == 1 || (type >= 10 && type <= 21)))
							{
								if (exclusion != null)
								{
									tile = exclusion;
								}

								setObjectTileFlags(flagMap, sizeX, sizeY, X, Y, Z, tile);
							}
						}
					}

					// Tile without floor / floating in the air ("noclip" tiles, typically found where z > 0)
					int underlayId = region.getUnderlayId(z < 3 ? tileZ : z, localX, localY);
					int overlayId = region.getOverlayId(z < 3 ? tileZ : z, localX, localY);
					boolean noFloor = underlayId == 0 && overlayId == 0;

					// Nomove
					int floorType = region.getTileSetting(z < 3 ? tileZ : z, localX, localY);
					if (floorType == 1 || // water, rooftop wall
						floorType == 3 || // bridge wall
						floorType == 5 || // house wall/roof
						floorType == 7 || // house wall
						noFloor)
					{
						flagMap.set(regionX, regionY, z, FlagMap.FLAG_NORTH, FlagMap.TILE_BLOCKED);
						flagMap.set(regionX, regionY, z, FlagMap.FLAG_EAST, FlagMap.TILE_BLOCKED);
						flagMap.set(regionX, regionY - 1, z, FlagMap.FLAG_NORTH, FlagMap.TILE_BLOCKED);
						flagMap.set(regionX - 1, regionY, z, FlagMap.FLAG_EAST, FlagMap.TILE_BLOCKED);
					}
				}
			}
		}
	}

	private static void setObjectTileFlags(FlagMap flagMap, int sizeX, int sizeY, int X, int Y, int Z, boolean tile)
	{
		for (int sx = 0; sx < sizeX; sx++)
		{
			for (int sy = 0; sy < sizeY; sy++)
			{
				setNeighborTileFlags(flagMap, X, Y, Z, tile, sx, sy);
			}
		}
	}

	private static void setNeighborTileFlags(FlagMap flagMap, int X, int Y, int Z, boolean tile, int sx, int sy)
	{
		flagMap.set(X + sx, Y + sy, Z, FlagMap.FLAG_NORTH, tile);
		flagMap.set(X + sx, Y + sy, Z, FlagMap.FLAG_EAST, tile);
		flagMap.set(X + sx, Y + sy - 1, Z, FlagMap.FLAG_NORTH, tile);
		flagMap.set(X + sx - 1, Y + sy, Z, FlagMap.FLAG_EAST, tile);
	}

	private static class FlagMap
	{
		/**
		 * The default value of a tile in the compressed collision map
		 */
		public static final boolean TILE_DEFAULT = true;

		/**
		 * The value of a blocked tile in the compressed collision map
		 */
		public static final boolean TILE_BLOCKED = false;

		/**
		 * Number of possible z-planes: 0, 1, 2, 3
		 */
		private static final int PLANE_COUNT = 4;

		/**
		 * Number of possible flags: 0 = north/south, 1 = east/west
		 */
		private static final int FLAG_COUNT = 2;
		public static final int FLAG_NORTH = 0;
		public static final int FLAG_SOUTH = 0;
		public static final int FLAG_EAST = 1;
		public static final int FLAG_WEST = 1;

		public final BitSet flags;
		private final int minX;
		private final int minY;
		private final int maxX;
		private final int maxY;
		private final int width;
		private final int height;

		public FlagMap(int minX, int minY, int maxX, int maxY)
		{
			this(minX, minY, maxX, maxY, TILE_DEFAULT);
		}

		public FlagMap(int minX, int minY, int maxX, int maxY, boolean value)
		{
			this.minX = minX;
			this.minY = minY;
			this.maxX = maxX;
			this.maxY = maxY;
			width = (maxX - minX + 1);
			height = (maxY - minY + 1);
			flags = new BitSet(width * height * PLANE_COUNT * FLAG_COUNT);
			flags.set(0, flags.size(), value);
		}

		public byte[] toBytes()
		{
			return flags.toByteArray();
		}

		public void write(ByteBuffer buffer)
		{
			var startPos = buffer.position();
			buffer.put(toBytes());
			buffer.position(startPos + (width * height * PLANE_COUNT * FLAG_COUNT + 7) / 8);
		}

		public void set(int x, int y, int z, int flag, boolean value)
		{
			if (isValidIndex(x, y, z, flag))
			{
				flags.set(index(x, y, z, flag), value);
			}
		}

		private boolean isValidIndex(int x, int y, int z, int flag)
		{
			return x >= minX && x <= maxX && y >= minY && y <= maxY && z >= 0 && z <= PLANE_COUNT - 1 && flag >= 0 && flag <= FLAG_COUNT - 1;
		}

		private int index(int x, int y, int z, int flag)
		{
			if (isValidIndex(x, y, z, flag))
			{
				return (z * width * height + (y - minY) * width + (x - minX)) * FLAG_COUNT + flag;
			}
			throw new IndexOutOfBoundsException(x + " " + y + " " + z);
		}
	}

	private enum Exclusion
	{
		AMETHYST_CRYSTALS_EMPTY_WALL_11393(11393),

		APE_ATOLL_JAIL_DOOR_4800(4800),
		APE_ATOLL_JAIL_DOOR_4801(4801),

		AL_KHARID_GATE_44599(44599),
		AL_KHARID_GATE_44598(44598),

		ARDOUGNE_BASEMENT_CELL_DOOR_35795(35795),

		BRIMHAVEN_DUNGEON_EXIT_20878(20878),
		BRIMHAVEN_GATE_1728(1728, FlagMap.TILE_DEFAULT),
		BRIMHAVEN_GATE_1727(1727, FlagMap.TILE_DEFAULT),
		BRIMHAVEN_DOOR_2628(2628),
		BRIMHAVEN_DOOR_1722(1722),

		BLACK_KNIGHTS_FORTRESS_DOOR_73(73),
		BLACK_KNIGHTS_FORTRESS_DOOR_74(74),
		BLACK_KNIGHTS_FORTRESS_DOOR_2337(2337),
		BLACK_KNIGHTS_FORTRESS_DOOR_2338(2338),
		BLACK_KNIGHTS_FORTRESS_WALL_2341(2341),


		CELL_DOOR_9562(9562),

		COOKING_GUILD_DOOR_10045(10045),
		COOKING_GUILD_DOOR_24958(24958),

		CRAFTING_GUILD_DOOR_14910(14910),

		DARKMEYER_CELL_DOOR_38014(38014),

		DESERT_MINING_CAMP_PRISON_DOOR_2689(2689),

		DRAYNOR_MANOR_LARGE_DOOR_134(134),
		DRAYNOR_MANOR_LARGE_DOOR_135(135),

		DRUIDS_ROBES_4035(4035),
		DRUIDS_ROBES_4036(4036),

		DWARF_CANNON_RAILING_15601(15601), // type = 9 is full blocked diagonal, type = 0 is wall, type = 1 is corner
		DWARF_CANNON_RAILING_15602(15602),
		DWARF_CANNON_RAILING_15603(15603),
		DWARF_CANNON_GATE_15604(15604),
		DWARF_CANNON_GATE_15605(15605),
		DWARF_CANNON_RAILING_15590(15590),
		DWARF_CANNON_RAILING_15591(15591),
		DWARF_CANNON_RAILING_15592(15592),
		DWARF_CANNON_RAILING_15593(15593),
		DWARF_CANNON_RAILING_15594(15594),
		DWARF_CANNON_RAILING_15595(15595),

		EDGEVILLE_DUNGEON_DOOR_1804(1804),

		FALADOR_GRAPPLE_WALL_17049(17049),
		FALADOR_GRAPPLE_WALL_17050(17050),
		FALADOR_GRAPPLE_WALL_17051(17051),
		FALADOR_GRAPPLE_WALL_17052(17052),

		FEROX_ENCLAVE_BARRIER_39652(39652),
		FEROX_ENCLAVE_BARRIER_39653(39653),

		FIGHT_ARENA_PRISON_DOOR_79(79),
		FIGHT_ARENA_PRISON_DOOR_80(80),

		FISHING_TRAWLER_RAIL_41400(41400),

		FORTHOS_DUNGEON_WALL_34854(34854),

		GOBLIN_TEMPLE_PRISON_DOOR_43457(43457),

		GNOME_BATTLEFIELD_CRUMBLED_WALL(2185),

		GRAND_EXCHANGE_BOOTH_10060(10060),
		GRAND_EXCHANGE_BOOTH_10061(10061),
		GRAND_EXCHANGE_BOOTH_30390(30390),

		GREAT_KOUREND_CELL_DOOR_41801(41801),

		GRIM_TALES_DOOR_24759(24759),

		HARDWOOD_GROVE_DOORS_9038(9038),
		HARDWOOD_GROVE_DOORS_9039(9039),

		HAUNTED_MINE_DOOR_4963(4963),
		HAUNTED_MINE_DOOR_4964(4964),

		HOSIDIUS_VINES_41814(41814),
		HOSIDIUS_VINES_41815(41815),
		HOSIDIUS_VINES_41816(41816),
		HOSIDIUS_VINES_46380(46380),
		HOSIDIUS_VINES_46381(46381),
		HOSIDIUS_VINES_46382(46382),

		KENDAL_STANDING_SPEARS_5860(5860),

		KRUKS_DUNGEON_WALL_28681(28681),
		KRUKS_DUNGEON_WALL_28798(28798),

		LUMBRIDGE_RECIPE_FOR_DISASTER_DOOR_12348(12348),
		LUMBRIDGE_RECIPE_FOR_DISASTER_DOOR_12349(12349),
		LUMBRIDGE_RECIPE_FOR_DISASTER_DOOR_12350(12350),

		MAGIC_AXE_HUT_DOOR_11726(11726),

		MCGRUBORS_WOOD_GATE_52(52),
		MCGRUBORS_WOOD_GATE_53(53),

		MELZARS_MAZE_BLUE_DOOR_2599(2599),
		MELZARS_MAZE_DOOR_2595(2595),
		MELZARS_MAZE_EXIT_DOOR_2602(2602),
		MELZARS_MAZE_GREEN_DOOR_2601(2601),
		MELZARS_MAZE_MAGENTA_DOOR_2600(2600),
		MELZARS_MAZE_ORANGE_DOOR_2597(2597),
		MELZARS_MAZE_RED_DOOR_2596(2596),
		MELZARS_MAZE_YELLOW_DOOR_2598(2598),

		MISTHALIN_MANOR_DOOR_30114(30114),
		MISTHALIN_MANOR_DOOR_30113(30113),
		MISTHALIN_MANOR_DAMAGED_WALL_29657(29657),
		MISTHALIN_MANOR_DAMAGED_WALL_29656(29656),

		// MEMBERS_GATE_1727(1727), // Taverley, Falador, Brimhaven, Wilderness, Edgeville Dungeon
		// MEMBERS_GATE_1728(1728), // Taverley, Falador, Brimhaven, Wilderness, Edgeville Dungeon

		OLD_SCHOOL_MUSEUM_CURTAIN_31885(31885), // type = 9 is full blocked diagonal, type = 0 is wall

		PATERDOMUS_TEMPLE_CELL_DOOR_3463(3463),

		PEST_CONTROL_WALL_14216(14216),
		PEST_CONTROL_WALL_14217(14217),
		PEST_CONTROL_WALL_14218(14218),
		PEST_CONTROL_WALL_14219(14219),
		PEST_CONTROL_WALL_14225(14225),
		PEST_CONTROL_WALL_14226(14226),
		PEST_CONTROL_WALL_14228(14228),
		PEST_CONTROL_WALL_14229(14229),
		PEST_CONTROL_WALL_25636(25636), // type = 9 is full blocked diagonal, type = 0 is wall

		PORT_SARIM_PRISON_DOOR_9563(9563),
		PORT_SARIM_PRISON_DOOR_9565(9565),

		PRINCE_ALI_RESCUE_PRISON_GATE_2881(2881),

		RANGING_GUILD_DOOR_11665(11665),

		RAT_PITS_RAT_WALL_10335(10335), // type = 9 is full blocked diagonal, type = 2 is wall
		RAT_PITS_RAT_WALL_10337(10337), // type = 9 is full blocked diagonal, type = 2 is wall
		RAT_PITS_RAT_WALL_10342(10342), // type = 9 is full blocked diagonal, type = 2 is wall
		RAT_PITS_RAT_WALL_10344(10344), // type = 9 is full blocked diagonal, type = 2 is wall

		SINCLAIR_MANOR_WINDOW_26123(26123),

		SCRUBFOOTS_CAVE_CREVICE_40889(40889),

		SHANTAY_PASS_PRISON_DOOR_2692(2692),

		TAI_BWO_WANNAI_ROTTEN_VILLAGE_FENCE_9025(9025),
		TAI_BWO_WANNAI_PARTIAL_FENCE_9026(9026),
		TAI_BWO_WANNAI_SHORT_FENCE_9027(9027),
		TAI_BWO_WANNAI_MEDIUM_FENCE_9028(9028),
		TAI_BWO_WANNAI_VILLAGE_FENCE_9029(9029),

		TAVERLEY_DUNGEON_PRISON_DOOR_2143(2143),
		TAVERLEY_DUNGEON_PRISON_DOOR_2144(2144),
		TAVERLEY_DUNGEON_DUSTY_KEY_DOOR_2623(2623),
		TAVERLY_MEMBERS_GATE_1727(1727),
		TAVERLY_MEMBERS_GATE_1728(1728),

		TEMPLE_OF_IKOV_DOOR_102(102),

		TEMPLE_OF_MARIMBO_DUNGEON_EXIT_16061(16061),
		TEMPLE_OF_MARIMBO_DUNGEON_EXIT_16100(16100),

		TREE_GNOME_STRONGHOLD_PRISON_DOOR_3367(3367),

		TROLL_STRONGHOLD_CELL_DOOR_3763(3763),
		TROLL_STRONGHOLD_CELL_DOOR_3765(3765),
		TROLL_STRONGHOLD_CELL_DOOR_3767(3767),
		TROLL_STRONGHOLD_EXIT_3772(3772),
		TROLL_STRONGHOLD_EXIT_3773(3773),
		TROLL_STRONGHOLD_EXIT_3774(3774),
		TROLL_STRONGHOLD_PRISON_DOOR_3780(3780),

		VARROCK_MUSEUM_GATE_24536(24536),

		VIYELDI_CAVES_CREVICE_2918(2918),

		WATERFALL_DUNGEON_DOOR_2002(2002),

		WEST_ARDOUGNE_MOURNER_HOUSE_DOOR_37321(37321),

		WILDERNESS_RESOURCE_AREA_GATE_26760(26760),

		WIZARDS_GUILD_DOOR_1732(1732),
		WIZARDS_GUILD_DOOR_1733(1733),

		YANILLE_GRAPPLE_WALL_17047(17047),
		YANILLE_GRAPPLE_WALL_17048(17058),

		ZANARIS_SHED_DOOR_2406(2406),
		;

		/**
		 * The object ID to be excluded
		 */
		private final int id;

		/**
		 * Whether the exclusion tile should be blocked or empty
		 */
		private final boolean tile;

		Exclusion(int id)
		{
			this(id, FlagMap.TILE_BLOCKED);
		}

		Exclusion(int id, boolean tile)
		{
			this.id = id;
			this.tile = tile;
		}

		public static Boolean matches(int id)
		{
			for (Exclusion exclusion : values())
			{
				if (exclusion.id == id)
				{
					return exclusion.tile;
				}
			}
			return null;
		}
	}
}