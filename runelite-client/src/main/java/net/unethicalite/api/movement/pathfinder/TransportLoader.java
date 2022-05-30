package net.unethicalite.api.movement.pathfinder;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.runelite.api.*;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.GameThread;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.game.Worlds;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
import net.unethicalite.api.movement.pathfinder.model.FairyRingLocation;
import net.unethicalite.api.quests.Quest;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import net.unethicalite.client.minimal.config.UnethicaliteProperties;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.coords.Direction;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;

@Slf4j
public class TransportLoader
{
	public static final List<SpiritTree> SPIRIT_TREES = List.of(
		new SpiritTree(new WorldPoint(2542, 3170, 0), "Tree gnome Village"),
		new SpiritTree(new WorldPoint(2461, 3444, 0), "Gnome Stronghold"),
		new SpiritTree(new WorldPoint(2555, 3259, 0), "Battlefield of Khazard"),
		new SpiritTree(new WorldPoint(3185, 3508, 0), "Grand Exchange"),
		new SpiritTree(new WorldPoint(2488, 2850, 0), "Feldip Hills")
	);
	public static final List<MagicMushtree> MUSHTREES = List.of(
		new MagicMushtree(new WorldPoint(3676, 3871, 0), WidgetInfo.FOSSIL_MUSHROOM_MEADOW),
		new MagicMushtree(new WorldPoint(3764, 3879, 0), WidgetInfo.FOSSIL_MUSHROOM_HOUSE),
		new MagicMushtree(new WorldPoint(3676, 3755, 0), WidgetInfo.FOSSIL_MUSHROOM_SWAMP),
		new MagicMushtree(new WorldPoint(3760, 3758, 0), WidgetInfo.FOSSIL_MUSHROOM_VALLEY)
	);
	private static final Gson GSON = new GsonBuilder().create();
	private static int LAST_BUILD_TICK = 0;
	private static final List<Transport> STATIC_TRANSPORTS = new ArrayList<>();
	private static final WorldArea MLM = new WorldArea(3714, 5633, 60, 62, 0);
	private static List<Transport> LAST_TRANSPORT_LIST = Collections.emptyList();

	static
	{
		// Try to initialize the static transports before usage
		loadStaticTransports();
	}

	private static List<Transport> loadStaticTransports()
	{
		if (!STATIC_TRANSPORTS.isEmpty())
		{
			return STATIC_TRANSPORTS;
		}

		try (InputStream txt = new URL(UnethicaliteProperties.getApiUrl() + "/transports").openStream())
		{
			TransportDto[] json = GSON.fromJson(new String(txt.readAllBytes()), TransportDto[].class);

			for (TransportDto transportDto : json)
			{
				STATIC_TRANSPORTS.add(transportDto.toModel());
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		return STATIC_TRANSPORTS;
	}

	public static List<Transport> buildTransports()
	{
		List<Transport> transports = new ArrayList<>();

		boolean princeAliCompleted = Vars.getVarp(Quest.PRINCE_ALI_RESCUE.getVarPlayer().getId()) >= 110;
		int gold = Inventory.getFirst(995) != null ? Inventory.getFirst(995).getQuantity() : 0;
		if (gold >= 10 || princeAliCompleted)
		{
			// The door here is weird, the transform actions and name return null
			transports.add(objectTransport(
				new WorldPoint(3267, 3228, 0),
				new WorldPoint(3268, 3228, 0),
				TileObjects.getFirstAt(3268, 3228, 0, 44599),
				princeAliCompleted ? 0 : 3)
			);
			transports.add(objectTransport(
				new WorldPoint(3268, 3228, 0),
				new WorldPoint(3267, 3228, 0),
				TileObjects.getFirstAt(3268, 3228, 0, 44599),
				princeAliCompleted ? 0 : 3)
			);
			transports.add(objectTransport(
				new WorldPoint(3267, 3227, 0),
				new WorldPoint(3268, 3227, 0),
				TileObjects.getFirstAt(3268, 3227, 0, 44598),
				princeAliCompleted ? 0 : 3)
			);
			transports.add(objectTransport(
				new WorldPoint(3268, 3227, 0),
				new WorldPoint(3267, 3227, 0),
				TileObjects.getFirstAt(3268, 3227, 0, 44598),
				princeAliCompleted ? 0 : 3)
			);
		}

		if (Worlds.inMembersWorld())
		{
			// Edgeville
			if (Skills.getBoostedLevel(Skill.AGILITY) >= 21)
			{
				transports.add(objectTransport(
					new WorldPoint(3142, 3513, 0),
					new WorldPoint(3137, 3516, 0),
					16530,
					"Climb-into")
				);
				transports.add(objectTransport(
					new WorldPoint(3137, 3516, 0),
					new WorldPoint(3142, 3513, 0),
					16529,
					"Climb-into")
				);
			}

			// Crabclaw island
			if (gold >= 10_000)
			{
				transports.add(npcTransport(new WorldPoint(1782, 3458, 0), new WorldPoint(1778, 3417, 0), 7483, "Travel"));
			}

			transports.add(npcTransport(new WorldPoint(1779, 3418, 0), new WorldPoint(1784, 3458, 0), 7484, "Travel"));

			// Port sarim
			if (Vars.getBit(4897) == 0)
			{
				if (Vars.getBit(8063) >= 7)
				{
					transports.add(npcDialogTransport(new WorldPoint(3054, 3245, 0),
						new WorldPoint(1824, 3691, 0),
						8484,
						"Can you take me to Great Kourend?"));
				}
				else
				{
					transports.add(npcDialogTransport(new WorldPoint(3054, 3245, 0),
						new WorldPoint(1824, 3691, 0),
						8484,
						"That's great, can you take me there please?"));
				}
			}
			else
			{
				transports.add(npcTransport(new WorldPoint(3054, 3245, 0),
					new WorldPoint(1824, 3695, 1),
					10724,
					"Port Piscarilius"));
			}

			// Spirit Trees
			if (Quest.TREE_GNOME_VILLAGE.getState() == QuestState.FINISHED)
			{
				for (var source : SPIRIT_TREES)
				{
					if (source.location.equals("Gnome Stronghold") && Quest.THE_GRAND_TREE.getState() != QuestState.FINISHED)
					{
						continue;
					}
					for (var target : SPIRIT_TREES)
					{
						if (source == target)
						{
							continue;
						}

						transports.add(spritTreeTransport(source.position, target.position, target.location));
					}
				}
			}

			if (Quest.THE_LOST_TRIBE.getState() == QuestState.FINISHED)
			{
				transports.add(npcTransport(new WorldPoint(3229, 9610, 0), new WorldPoint(3316, 9613, 0), NpcID.KAZGAR_7301, "Mines"));
				transports.add(npcTransport(new WorldPoint(3316, 9613, 0), new WorldPoint(3229, 9610, 0), NpcID.MISTAG_7299, "Cellar"));
			}

			// Tree Gnome Village
			if (Quest.TREE_GNOME_VILLAGE.getState() != QuestState.NOT_STARTED)
			{
				transports.add(npcTransport(new WorldPoint(2504, 3192, 0), new WorldPoint(2515, 3159, 0), 4968, "Follow"));
				transports.add(npcTransport(new WorldPoint(2515, 3159, 0), new WorldPoint(2504, 3192, 0), 4968, "Follow"));
			}

			// Eagles peak cave
			if (Vars.getVarp(934) >= 15)
			{
				// Entrance
				transports.add(objectTransport(new WorldPoint(2328, 3496, 0), new WorldPoint(1994, 4983, 3), 19790,
					"Enter"));
				transports.add(objectTransport(new WorldPoint(1994, 4983, 3), new WorldPoint(2328, 3496, 0), 19891,
					"Exit"));
			}

			// Waterbirth island
			if (Quest.THE_FREMENNIK_TRIALS.getState() == QuestState.FINISHED || gold >= 1000)
			{
				transports.add(npcTransport(new WorldPoint(2544, 3760, 0), new WorldPoint(2620, 3682, 0), 10407, "Rellekka"));
				transports.add(npcTransport(new WorldPoint(2620, 3682, 0), new WorldPoint(2547, 3759, 0), 5937, "Waterbirth Island"));
			}

			// Motherload Mine
			if (MLM.contains(Players.getLocal()))
			{
				transports.addAll(motherloadMineTransport(new WorldPoint(3726, 5643, 0)));
				transports.addAll(motherloadMineTransport(new WorldPoint(3726, 5654, 0)));
				transports.addAll(motherloadMineTransport(new WorldPoint(3727, 5652, 0)));
				transports.addAll(motherloadMineTransport(new WorldPoint(3727, 5683, 0)));
				transports.addAll(motherloadMineTransport(new WorldPoint(3728, 5651, 0)));
				transports.addAll(motherloadMineTransport(new WorldPoint(3728, 5688, 0)));
				transports.addAll(motherloadMineTransport(new WorldPoint(3731, 5683, 0)));
				transports.addAll(motherloadMineTransport(new WorldPoint(3733, 5680, 0)));
				transports.addAll(motherloadMineTransport(new WorldPoint(3745, 5689, 0)));
				transports.addAll(motherloadMineTransport(new WorldPoint(3748, 5684, 0)));
				transports.addAll(motherloadMineTransport(new WorldPoint(3748, 5689, 0)));
				transports.addAll(motherloadMineTransport(new WorldPoint(3755, 5640, 0)));
				transports.addAll(motherloadMineTransport(new WorldPoint(3756, 5639, 0)));
				transports.addAll(motherloadMineTransport(new WorldPoint(3757, 5677, 0)));
				transports.addAll(motherloadMineTransport(new WorldPoint(3759, 5690, 0)));
				transports.addAll(motherloadMineTransport(new WorldPoint(3762, 5652, 0)));
				transports.addAll(motherloadMineTransport(new WorldPoint(3762, 5668, 0)));
				transports.addAll(motherloadMineTransport(new WorldPoint(3765, 5688, 0)));
				transports.addAll(motherloadMineTransport(new WorldPoint(3766, 5639, 0)));
				transports.addAll(motherloadMineTransport(new WorldPoint(3766, 5647, 0)));
				transports.addAll(motherloadMineTransport(new WorldPoint(3768, 5674, 0)));
				transports.addAll(motherloadMineTransport(new WorldPoint(3768, 5679, 0)));
				transports.addAll(motherloadMineTransport(new WorldPoint(3769, 5642, 0)));
				transports.addAll(motherloadMineTransport(new WorldPoint(3769, 5658, 0)));
				transports.addAll(motherloadMineTransport(new WorldPoint(3769, 5680, 0)));
				transports.addAll(motherloadMineTransport(new WorldPoint(3770, 5659, 0)));
				transports.addAll(motherloadMineTransport(new WorldPoint(3771, 5638, 0)));
				transports.addAll(motherloadMineTransport(new WorldPoint(3762, 5687, 0)));
				transports.addAll(motherloadMineTransport(new WorldPoint(3766, 5670, 0)));
				transports.addAll(motherloadMineTransport(new WorldPoint(3719, 5664, 0)));
				transports.addAll(motherloadMineTransport(new WorldPoint(3720, 5665, 0)));
			}

			// Corsair's Cove
			if (Skills.getBoostedLevel(Skill.AGILITY) >= 10)
			{
				transports.add(objectTransport(new WorldPoint(2546, 2871, 0), new WorldPoint(2546, 2873, 0), 31757,
					"Climb"));
				transports.add(objectTransport(new WorldPoint(2546, 2873, 0), new WorldPoint(2546, 2871, 0), 31757,
					"Climb"));
			}

			GameThread.invoke(() ->
			{
				// Lumbridge castle dining room, ignore if RFD is in progress.
				if (Quest.RECIPE_FOR_DISASTER.getState() != QuestState.IN_PROGRESS)
				{
					transports.add(objectTransport(new WorldPoint(3213, 3221, 0), new WorldPoint(3212, 3221, 0), 12349, "Open"));
					transports.add(objectTransport(new WorldPoint(3212, 3221, 0), new WorldPoint(3213, 3221, 0), 12349, "Open"));
					transports.add(objectTransport(new WorldPoint(3213, 3222, 0), new WorldPoint(3212, 3222, 0), 12350, "Open"));
					transports.add(objectTransport(new WorldPoint(3212, 3222, 0), new WorldPoint(3213, 3222, 0), 12350, "Open"));
					transports.add(objectTransport(new WorldPoint(3207, 3218, 0), new WorldPoint(3207, 3217, 0), 12348, "Open"));
					transports.add(objectTransport(new WorldPoint(3207, 3217, 0), new WorldPoint(3207, 3218, 0), 12348, "Open"));
				}

				// Digsite gate
				if (Vars.getBit(3637) >= 153)
				{
					transports.add(objectTransport(new WorldPoint(3295, 3429, 0), new WorldPoint(3296, 3429, 0), 24561,
						"Open"));
					transports.add(objectTransport(new WorldPoint(3296, 3429, 0), new WorldPoint(3295, 3429, 0), 24561,
						"Open"));
					transports.add(objectTransport(new WorldPoint(3295, 3428, 0), new WorldPoint(3296, 3428, 0), 24561,
						"Open"));
					transports.add(objectTransport(new WorldPoint(3296, 3428, 0), new WorldPoint(3295, 3428, 0), 24561,
						"Open"));
				}
			});

			// Fairy Rings
			if (Equipment.contains(ItemID.DRAMEN_STAFF, ItemID.LUNAR_STAFF)
					&& Quest.FAIRYTALE_II__CURE_A_QUEEN.getState() != QuestState.NOT_STARTED)
			{
				for (FairyRingLocation sourceRing : FairyRingLocation.values())
				{
					for (FairyRingLocation destRing : FairyRingLocation.values())
					{
						if (sourceRing != destRing)
						{
							transports.add(fairyRingTransport(sourceRing, destRing));
						}
					}
				}
			}
		}

		if (LAST_BUILD_TICK == Static.getClient().getTickCount())
		{
			transports.addAll(LAST_TRANSPORT_LIST);
			return List.copyOf(transports);
		}

		LAST_BUILD_TICK = Static.getClient().getTickCount();
		LAST_TRANSPORT_LIST = buildCachedTransportList();
		transports.addAll(LAST_TRANSPORT_LIST);

		return List.copyOf(transports);
	}

	public static List<Transport> buildCachedTransportList()
	{
		List<Transport> transports = new ArrayList<>(loadStaticTransports());

		// Entrana
		transports.add(npcTransport(new WorldPoint(3041, 3237, 0), new WorldPoint(2834, 3331, 1), 1166, "Take-boat"));
		transports.add(npcTransport(new WorldPoint(2834, 3335, 0), new WorldPoint(3048, 3231, 1), 1170, "Take-boat"));
		transports.add(npcDialogTransport(new WorldPoint(2821, 3374, 0),
			new WorldPoint(2822, 9774, 0),
			1164,
			"Well that is a risk I will have to take."));

		// Fossil Island
		transports.add(npcTransport(new WorldPoint(3362, 3445, 0),
			new WorldPoint(3724, 3808, 0),
			8012,
			"Quick-Travel"));

		transports.add(objectDialogTransport(new WorldPoint(3724, 3808, 0),
			new WorldPoint(3362, 3445, 0),
			30914,
			new String[]{"Travel"},
			"Row to the barge and travel to the Digsite."));

		// Magic Mushtrees
		for (var source : MUSHTREES)
		{
			for (var target : MUSHTREES)
			{
				transports.add(mushtreeTransport(source.position, target.position, target.widget));
			}
		}

		// Gnome stronghold
		transports.add(objectDialogTransport(new WorldPoint(2461, 3382, 0),
			new WorldPoint(2461, 3385, 0),
			190,
			new String[]{"Open"},
			"Sorry, I'm a bit busy."));

		// Paterdomus
		transports.add(trapDoorTransport(new WorldPoint(3405, 3506, 0), new WorldPoint(3405, 9906, 0), 1579, 1581));
		transports.add(trapDoorTransport(new WorldPoint(3423, 3485, 0), new WorldPoint(3440, 9887, 0), 3432, 3433));
		transports.add(trapDoorTransport(new WorldPoint(3422, 3484, 0), new WorldPoint(3440, 9887, 0), 3432, 3433));

		// Port Piscarilius
		transports.add(npcTransport(new WorldPoint(1824, 3691, 0), new WorldPoint(3055, 3242, 1), 10727, "Port Sarim"));

		// Glarial's tomb
		transports.add(itemUseTransport(new WorldPoint(2557, 3444, 0), new WorldPoint(2555, 9844, 0), 294, 1992));
		transports.add(itemUseTransport(new WorldPoint(2557, 3445, 0), new WorldPoint(2555, 9844, 0), 294, 1992));
		transports.add(itemUseTransport(new WorldPoint(2558, 3443, 0), new WorldPoint(2555, 9844, 0), 294, 1992));
		transports.add(itemUseTransport(new WorldPoint(2559, 3443, 0), new WorldPoint(2555, 9844, 0), 294, 1992));
		transports.add(itemUseTransport(new WorldPoint(2560, 3444, 0), new WorldPoint(2555, 9844, 0), 294, 1992));
		transports.add(itemUseTransport(new WorldPoint(2560, 3445, 0), new WorldPoint(2555, 9844, 0), 294, 1992));
		transports.add(itemUseTransport(new WorldPoint(2558, 3446, 0), new WorldPoint(2555, 9844, 0), 294, 1992));
		transports.add(itemUseTransport(new WorldPoint(2559, 3446, 0), new WorldPoint(2555, 9844, 0), 294, 1992));

		// Waterfall Island
		transports.add(itemUseTransport(new WorldPoint(2512, 3476, 0), new WorldPoint(2513, 3468, 0), 954, 1996));
		transports.add(itemUseTransport(new WorldPoint(2512, 3466, 0), new WorldPoint(2511, 3463, 0), 954, 2020));

		return transports;
	}

	public static Transport parseTransportLine(String line)
	{
		String[] split = line.split(" ");
		return objectTransport(
			new WorldPoint(
				Integer.parseInt(split[0]),
				Integer.parseInt(split[1]),
				Integer.parseInt(split[2])
			),
			new WorldPoint(
				Integer.parseInt(split[3]),
				Integer.parseInt(split[4]),
				Integer.parseInt(split[5])
			),
			Integer.parseInt(split[split.length - 1]), split[6]
		);
	}

	public static Transport trapDoorTransport(
		WorldPoint source,
		WorldPoint destination,
		int closedId,
		int openedId
	)
	{
		return new Transport(source, destination, Integer.MAX_VALUE, 0, () ->
		{
			TileObject openedTrapdoor = TileObjects.getFirstSurrounding(source, 5, openedId);
			if (openedTrapdoor != null)
			{
				openedTrapdoor.interact(0);
				return;
			}

			TileObject closedTrapDoor = TileObjects.getFirstSurrounding(source, 5, closedId);
			if (closedTrapDoor != null)
			{
				closedTrapDoor.interact(0);
			}
		}, null);
	}

	public static Transport fairyRingTransport(
			FairyRingLocation source,
			FairyRingLocation destination
	)
	{
		return new Transport(source.getLocation(), destination.getLocation(), Integer.MAX_VALUE, 0, () ->
		{
			TileObject ring = TileObjects.getNearest("Fairy ring");

			if (destination == FairyRingLocation.ZANARIS)
			{
				ring.interact("Zanaris");
				return;
			}

			if (Widgets.isVisible(Widgets.get(WidgetInfo.FAIRY_RING)))
			{
				destination.travel();
				return;
			}

			ring.interact("Configure");
		}, null);
	}

	public static Transport itemUseTransport(
		WorldPoint source,
		WorldPoint destination,
		int itemId,
		int objId
	)
	{
		return new Transport(source, destination, Integer.MAX_VALUE, 0, () ->
		{
			Item item = Inventory.getFirst(itemId);
			if (item == null)
			{
				return;
			}

			TileObject transport = TileObjects.getFirstSurrounding(source, 5, objId);
			if (transport != null)
			{
				item.useOn(transport);
			}
		}, null);
	}

	public static Transport npcTransport(
		WorldPoint source,
		WorldPoint destination,
		int npcId,
		String... actions
	)
	{
		return new Transport(source, destination, 10, 0, () ->
		{
			NPC npc = NPCs.getNearest(x -> x.getWorldLocation().distanceTo(source) <= 10 && x.getId() == npcId);
			if (npc != null)
			{
				npc.interact(actions);
			}
		}, actions);
	}

	public static Transport npcDialogTransport(
		WorldPoint source,
		WorldPoint destination,
		int npcId,
		String... chatOptions
	)
	{
		return new Transport(source, destination, 10, 0, () ->
		{
			if (Dialog.isViewingOptions())
			{
				if (Dialog.canContinue())
				{
					Dialog.continueSpace();
					return;
				}

				if (Dialog.chooseOption(chatOptions))
				{
					return;
				}

				return;
			}

			NPC npc = NPCs.getNearest(x -> x.getWorldLocation().distanceTo(source) <= 10 && x.getId() == npcId);
			if (npc != null)
			{
				npc.interact(0);
			}
		}, null);
	}

	public static List<Transport> motherloadMineTransport(
		WorldPoint rockfall
	)
	{
		return Arrays.stream(Direction.values()).map(dir ->
		{
			WorldPoint neighbor = Reachable.getNeighbour(dir, rockfall);
			if (!Reachable.isObstacle(neighbor))
			{
				WorldPoint dest = null;
				switch (dir)
				{
					case NORTH:
						dest = rockfall.dy(-1);
						break;
					case SOUTH:
						dest = rockfall.dy(1);
						break;
					case WEST:
						dest = rockfall.dx(1);
						break;
					case EAST:
						dest = rockfall.dx(-1);
						break;
				}
				if (dest != null)
				{
					WorldPoint finalDest = dest;
					return new Transport(neighbor, finalDest, Integer.MAX_VALUE, 0, () ->
					{
						TileObjects.getAt(rockfall, x -> x.getName().equalsIgnoreCase("Rockfall")).stream()
							.findFirst()
							.ifPresentOrElse(obj -> obj.interact("Mine"), () -> Movement.walk(finalDest));
					}, new String[]{"Mine"});
				}
			}
			return null;
		}).filter(Objects::nonNull).collect(Collectors.toList());
	}

	public static Transport objectTransport(
		WorldPoint source,
		WorldPoint destination,
		int objId,
		String... actions
	)
	{
		return new Transport(source, destination, Integer.MAX_VALUE, 0, () ->
		{
			TileObject first = TileObjects.getFirstAt(source, objId);
			if (first != null)
			{
				first.interact(actions);
				return;
			}

			TileObjects.getSurrounding(source, 5, x -> x.getId() == objId).stream()
				.min(Comparator.comparingInt(o -> o.distanceTo(source)))
				.ifPresent(obj -> obj.interact(actions));
		}, actions);
	}

	public static Transport objectTransport(
		WorldPoint source,
		WorldPoint destination,
		TileObject tileObject,
		int actionIndex
	)
	{
		return new Transport(source, destination, Integer.MAX_VALUE, 0, () ->
		{
			if (tileObject == null)
			{
				return;
			}

			tileObject.interact(actionIndex);
		}, null);
	}

	public static Transport objectDialogTransport(
		WorldPoint source,
		WorldPoint destination,
		int objId,
		String[] actions,
		String... chatOptions
	)
	{
		return new Transport(source, destination, Integer.MAX_VALUE, 0, () ->
		{
			if (Dialog.isViewingOptions())
			{
				if (Dialog.canContinue())
				{
					Dialog.continueSpace();
					return;
				}

				if (Dialog.chooseOption(chatOptions))
				{
					return;
				}

				return;
			}

			TileObject transport = TileObjects.getFirstSurrounding(source, 5, objId);
			if (transport != null)
			{
				transport.interact(actions);
			}
		}, actions);
	}

	private static Transport spritTreeTransport(WorldPoint source, WorldPoint target, String location)
	{
		return new Transport(
			source,
			target,
			5,
			0,
			() ->
			{
				Widget treeWidget = Widgets.get(187, 3);
				if (Widgets.isVisible(treeWidget))
				{
					Arrays.stream(treeWidget.getDynamicChildren())
						.filter(child -> child.getText().contains(location))
						.findFirst()
						.ifPresent(child -> child.interact(0, MenuAction.WIDGET_CONTINUE.getId(), child.getIndex(), child.getId()));
					return;
				}

				TileObject tree = TileObjects.getNearest(1293, 1294, 1295);
				if (tree != null)
				{
					final Point point = tree.menuPoint();
					tree.interact(tree.getId(), MenuAction.GAME_OBJECT_FIRST_OPTION.getId(), point.getX(), point.getY());
				}

			}, new String[]{"Travel"});
	}

	private static Transport mushtreeTransport(WorldPoint source, WorldPoint target, WidgetInfo widget)
	{
		return new Transport(
			source,
			target,
			5,
			0,
			() ->
			{
				Widget treeWidget = Widgets.get(widget);
				if (Widgets.isVisible(treeWidget))
				{
					treeWidget.interact(0, MenuAction.WIDGET_CONTINUE.getId(), treeWidget.getIndex(), treeWidget.getId());
					return;
				}

				TileObject tree = TileObjects.getNearest("Magic Mushtree");
				if (tree != null)
				{
					tree.interact("Use");
				}
			}, new String[]{"Use"});
	}

	public static class MagicMushtree
	{
		private final WorldPoint position;
		private final WidgetInfo widget;

		public MagicMushtree(WorldPoint position, WidgetInfo widget)
		{
			this.position = position;
			this.widget = widget;
		}
	}

	public static class SpiritTree
	{
		private final WorldPoint position;
		private final String location;

		public SpiritTree(WorldPoint position, String location)
		{
			this.position = position;
			this.location = location;
		}
	}

	@Value
	private static class TransportDto
	{
		int objId;
		String objName;
		String source;
		String destination;
		String action;

		private static WorldPoint stringToWorldPoint(String text)
		{
			Integer[] points = Arrays.stream(text.split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
			return new WorldPoint(points[0], points[1], points[2]);
		}

		private Transport toModel()
		{
			return objectTransport(stringToWorldPoint(source), stringToWorldPoint(destination), objId, action);
		}
	}
}
