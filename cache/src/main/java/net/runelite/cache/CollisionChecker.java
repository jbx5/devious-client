package net.runelite.cache;

import net.runelite.cache.definitions.OverlayDefinition;
import net.runelite.cache.definitions.UnderlayDefinition;
import net.runelite.cache.definitions.loaders.OverlayLoader;
import net.runelite.cache.definitions.loaders.UnderlayLoader;
import net.runelite.cache.fs.Archive;
import net.runelite.cache.fs.ArchiveFiles;
import net.runelite.cache.fs.FSFile;
import net.runelite.cache.fs.Index;
import net.runelite.cache.fs.Storage;
import net.runelite.cache.fs.Store;
import net.runelite.cache.region.Location;
import net.runelite.cache.region.Position;
import net.runelite.cache.region.Region;
import net.runelite.cache.region.RegionLoader;
import net.runelite.cache.util.XteaKeyManager;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CollisionChecker
{
	private static final Map<Integer, UnderlayDefinition> underlays = new HashMap<>();
	private static final Map<Integer, OverlayDefinition> overlays = new HashMap<>();

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Options options = new Options();
		options.addOption(Option.builder().longOpt("cachedir").hasArg().required().build());
		options.addOption(Option.builder().longOpt("xteapath").hasArg().required().build());
		options.addOption(Option.builder().longOpt("x").hasArg().build());
		options.addOption(Option.builder().longOpt("y").hasArg().build());
		options.addOption(Option.builder().longOpt("z").hasArg().build());
		int userX;
		int userY;
		int userZ;

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
		userX = Integer.parseInt(cmd.getOptionValue("x", "0"));
		userY = Integer.parseInt(cmd.getOptionValue("y", "0"));
		userZ = Integer.parseInt(cmd.getOptionValue("z", "0"));
		System.out.println("Enter object ID: ");
		final int objId = scanner.nextInt();

		XteaKeyManager keyManager = new XteaKeyManager();
		try (FileInputStream fin = new FileInputStream(xteaJSONPath))
		{
			keyManager.loadKeys(fin);
		}
		catch (Exception ex)
		{
			System.err.println("Error loading XTEA keys: " + ex.getMessage());
			System.exit(-1);
		}

		File base = new File(cacheDirectory);

		try (Store store = new Store(base))
		{
			store.load();
			CollisionMapDumper dumper = new CollisionMapDumper(store, keyManager);
			dumper.load();
			RegionLoader regionLoader = new RegionLoader(store, keyManager);
			regionLoader.loadRegions();
			loadUnderlays(store);
			loadOverlays(store);

			Region region = regionLoader.findRegionForWorldCoordinates(userX, userY);
			if (region != null)
			{
				int baseX = region.getBaseX();
				int baseY = region.getBaseY();
				int convUserX = userX >> 6;
				int convUserY = userY >> 6;
				System.out.println("Searching for object " + objId + " in region " + region.getRegionID() + " at " + userX + ", " + userY + ", " + userZ);
				System.out.println("TileHeight: " + region.getTileHeight( userZ, convUserX, convUserY));
				System.out.println("TileSettings: " + region.getTileSetting(userZ, convUserX, convUserY));
				int overlayId = region.getOverlayId(userZ, convUserX, convUserY);
				int underlayId = region.getUnderlayId(userZ, convUserX, convUserY);
				System.out.println("OverlayId: " + overlayId);
				OverlayDefinition overlay = findOverlay(overlayId);
				System.out.println("Overlay: " + overlay);
				UnderlayDefinition underlay = findUnderlay(underlayId);
				System.out.println("Underlay: " + underlay);
				System.out.println("OverlayPath: " + region.getOverlayPath(userZ, convUserX, convUserY));
				System.out.println("OverlayRotation: " + region.getOverlayRotation(userZ, convUserX, convUserY));
				System.out.println("UnderlayId: " + underlayId);
				// Nomove
				boolean isBridge = (region.getTileSetting(1, convUserX, convUserY) & 2) != 0;
				int tileZ = userZ + (isBridge ? 1 : 0);
				int floorType = region.getTileSetting(userZ < 3 ? tileZ : userZ, convUserX, convUserY);
				System.out.println("FloorType: " + floorType);




				for (int z = 0; z < Region.Z; ++z)
				{
					for (int x = 0; x < Region.X; ++x)
					{
						int regionX = baseX + x;
						for (int y = 0; y < Region.Y; ++y)
						{
							int regionY = baseY + y;
							for (Location loc : region.getLocations())
							{
								Position pos = loc.getPosition();
								if (pos.getX() != regionX || pos.getY() != regionY || pos.getZ() != z)
								{
									continue;
								}
								if (loc.getId() == objId || (pos.getX() == userX && pos.getY() == userY && pos.getZ() == userZ))
								{
									System.out.println("Found object at " + regionX + ", " + regionY + ", " + z);
									System.out.println(loc);
									System.out.println(dumper.getObjectManager().getObject(loc.getId()));
								}
							}
						}
					}
				}
			}

		}
		catch (IOException e)
		{
			throw new RuntimeException(e);
		}
	}

	private static void loadUnderlays(Store store) throws IOException
	{
		Storage storage = store.getStorage();
		Index index = store.getIndex(IndexType.CONFIGS);
		Archive archive = index.getArchive(ConfigType.UNDERLAY.getId());

		byte[] archiveData = storage.loadArchive(archive);
		ArchiveFiles files = archive.getFiles(archiveData);

		for (FSFile file : files.getFiles())
		{
			UnderlayLoader loader = new UnderlayLoader();
			UnderlayDefinition underlay = loader.load(file.getFileId(), file.getContents());

			underlays.put(underlay.getId(), underlay);
		}
	}

	private static UnderlayDefinition findUnderlay(int id)
	{
		return underlays.get(id);
	}

	private static void loadOverlays(Store store) throws IOException
	{
		Storage storage = store.getStorage();
		Index index = store.getIndex(IndexType.CONFIGS);
		Archive archive = index.getArchive(ConfigType.OVERLAY.getId());

		byte[] archiveData = storage.loadArchive(archive);
		ArchiveFiles files = archive.getFiles(archiveData);

		for (FSFile file : files.getFiles())
		{
			OverlayLoader loader = new OverlayLoader();
			OverlayDefinition overlay = loader.load(file.getFileId(), file.getContents());

			overlays.put(overlay.getId(), overlay);
		}
	}

	private static OverlayDefinition findOverlay(int id)
	{
		return overlays.get(id);
	}
}
