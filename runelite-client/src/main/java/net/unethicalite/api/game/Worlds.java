package net.unethicalite.api.game;

import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Tab;
import net.unethicalite.api.widgets.Tabs;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.GameState;
import net.runelite.api.MenuAction;
import net.runelite.api.World;
import net.runelite.api.WorldType;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.http.api.worlds.WorldResult;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;

@Slf4j
public class Worlds
{
	private static List<World> lookup()
	{
		List<World> out = new ArrayList<>();
		WorldResult lookup = Static.getWorldService().getWorlds();
		if (lookup == null)
		{
			return Collections.emptyList();
		}

		lookup.getWorlds().forEach(w ->
		{
			World world = Static.getClient().createWorld();
			world.setActivity(w.getActivity());
			world.setAddress(w.getAddress());
			world.setId(w.getId());
			world.setPlayerCount(w.getPlayers());
			world.setLocation(w.getLocation());
			EnumSet<WorldType> types = EnumSet.noneOf(WorldType.class);
			w.getTypes().stream().map(Worlds::toApiWorldType).forEach(types::add);
			world.setTypes(types);
			out.add(world);
		});

		Static.getClient().setWorldList(out.toArray(new World[0]));

		return out;
	}

	public static List<World> getAll(Predicate<World> filter)
	{
		List<World> out = new ArrayList<>();
		List<World> loadedWorlds;

		try
		{
			World[] worlds = Static.getClient().getWorldList();
			if (worlds == null)
			{
				loadWorlds();
				return out;
			}

			loadedWorlds = Arrays.asList(worlds);
		}
		catch (Exception e)
		{
			log.warn("Game couldn't load worlds, falling back to RuneLite API.");
			loadedWorlds = lookup();
		}

		for (World world : loadedWorlds)
		{
			if (filter.test(world))
			{
				out.add(world);
			}
		}

		return out;
	}

	public static World getFirst(Predicate<World> filter)
	{
		return getAll(filter)
				.stream()
				.findFirst()
				.orElse(null);
	}

	public static World getFirst(int id)
	{
		return getFirst(x -> x.getId() == id);
	}

	public static World getRandom(Predicate<World> filter)
	{
		List<World> all = getAll(filter);
		if (all.isEmpty())
		{
			return null;
		}

		return all.get(Rand.nextInt(0, all.size()));
	}

	public static int getCurrentId()
	{
		return Static.getClient().getWorld();
	}

	public static void hopTo(World world)
	{
		hopTo(world, false);
	}

	public static void hopTo(World world, boolean spam)
	{
		if (!isHopperOpen())
		{
			openHopper();
			Time.sleepUntil(Worlds::isHopperOpen, 3000);
		}

		Widget rememberOption = Dialog.getOptions().stream()
				.filter(x -> x.getText().contains("Yes. In future, only warn about"))
				.findFirst()
				.orElse(null);
		if (Widgets.isVisible(rememberOption))
		{
			Dialog.chooseOption(2);
			Time.sleepUntil(() -> Game.getState() == GameState.HOPPING, 3000);
			return;
		}

		log.debug("Hoping to world {}", world.getId());
		Static.getClient().interact(1, MenuAction.CC_OP.getId(), world.getId(), WidgetInfo.WORLD_SWITCHER_LIST.getId());
		if (!spam)
		{
			Time.sleepUntil(() -> Game.getState() == GameState.HOPPING, 3000);
		}

		if (Dialog.isViewingOptions())
		{
			Dialog.chooseOption(2);
			Time.sleepUntil(() -> Game.getState() == GameState.HOPPING, 3000);
		}
	}

	public static World getCurrentWorld()
	{
		return getFirst(Static.getClient().getWorld());
	}

	public static boolean inMembersWorld()
	{
		return inMembersWorld(false);
	}

	public static boolean inMembersWorld(boolean useLookUp)
	{
		if (useLookUp)
		{
			World currentWorld = lookup().stream()
					.filter(x -> x.getId() == getCurrentId())
					.findFirst()
					.orElse(null);
			if (currentWorld != null)
			{
				return currentWorld.isMembers();
			}
		}
		return Static.getClient().isMembersWorld();
	}

	public static void loadWorlds()
	{
		if (Game.isOnLoginScreen())
		{
			openLobbyWorlds();
			Time.sleep(200);
			closeLobbyWorlds();
			return;
		}

		if (Game.isLoggedIn())
		{
			openHopper();
		}
	}

	public static void openHopper()
	{
		if (!Tabs.isOpen(Tab.LOG_OUT))
		{
			Tabs.open(Tab.LOG_OUT);
		}

		Static.getClient().interact(1, MenuAction.CC_OP.getId(), -1, WidgetInfo.WORLD_SWITCHER_BUTTON.getId());
	}

	public static void openLobbyWorlds()
	{
		Static.getClient().loadWorlds();
		Static.getClient().setWorldSelectOpen(true);
	}

	public static void closeLobbyWorlds()
	{
		Static.getClient().setWorldSelectOpen(false);
	}

	public static boolean isHopperOpen()
	{
		return Widgets.isVisible(Widgets.get(WidgetInfo.WORLD_SWITCHER_LIST));
	}

	private static WorldType toApiWorldType(net.runelite.http.api.worlds.WorldType httpWorld)
	{
		if (httpWorld == net.runelite.http.api.worlds.WorldType.TOURNAMENT)
		{
			return WorldType.TOURNAMENT_WORLD;
		}

		return WorldType.valueOf(httpWorld.name());
	}
}
