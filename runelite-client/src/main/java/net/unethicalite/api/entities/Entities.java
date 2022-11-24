package net.unethicalite.api.entities;

import net.unethicalite.api.SceneEntity;
import net.unethicalite.api.commons.Predicates;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.api.Tile;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.client.Static;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public abstract class Entities<T extends SceneEntity>
{
	protected abstract List<T> all(Predicate<? super T> filter);

	protected List<T> all(String... names)
	{
		return all(Predicates.names(names));
	}

	protected List<T> all(int... ids)
	{
		return all(Predicates.ids(ids));
	}

	protected T nearest(WorldPoint to, Predicate<? super T> filter)
	{
		return all(x -> x.getId() != -1 && filter.test(x)).stream()
				.min(Comparator.comparingDouble(t -> t.getWorldLocation().distanceToHypotenuse(to)))
				.orElse(null);
	}

	protected T nearest(WorldPoint to, String... names)
	{
		return nearest(to, Predicates.names(names));
	}

	protected T nearest(WorldPoint to, int... ids)
	{
		return nearest(to, Predicates.ids(ids));
	}

	public static List<? extends SceneEntity> getHoveredEntities()
	{
		MenuEntry[] menuEntries = Static.getClient().getMenuEntries();
		if (menuEntries.length == 0)
		{
			return Collections.emptyList();
		}

		List<SceneEntity> out = new ArrayList<>();

		for (MenuEntry menuEntry : menuEntries)
		{
			MenuAction menuAction = menuEntry.getType();

			switch (menuAction)
			{
				case EXAMINE_OBJECT:
				case ITEM_USE_ON_GAME_OBJECT:
				case WIDGET_TARGET_ON_GAME_OBJECT:
				case GAME_OBJECT_FIRST_OPTION:
				case GAME_OBJECT_SECOND_OPTION:
				case GAME_OBJECT_THIRD_OPTION:
				case GAME_OBJECT_FOURTH_OPTION:
				case GAME_OBJECT_FIFTH_OPTION:
				{
					int x = menuEntry.getParam0();
					int y = menuEntry.getParam1();
					int id = menuEntry.getIdentifier();
					Tile tile = Static.getClient().getScene().getTiles()[Static.getClient().getPlane()][x][y];
					out.addAll(TileObjects.getAt(tile, id));
					break;
				}

				case EXAMINE_NPC:
				case ITEM_USE_ON_NPC:
				case WIDGET_TARGET_ON_NPC:
				case NPC_FIRST_OPTION:
				case NPC_SECOND_OPTION:
				case NPC_THIRD_OPTION:
				case NPC_FOURTH_OPTION:
				case NPC_FIFTH_OPTION:
				{
					int index = menuEntry.getIdentifier();
					out.add(Static.getClient().getCachedNPCs()[index]);
					break;
				}

				case EXAMINE_ITEM_GROUND:
				case ITEM_USE_ON_GROUND_ITEM:
				case WIDGET_TARGET_ON_GROUND_ITEM:
				case GROUND_ITEM_FIRST_OPTION:
				case GROUND_ITEM_SECOND_OPTION:
				case GROUND_ITEM_THIRD_OPTION:
				case GROUND_ITEM_FOURTH_OPTION:
				case GROUND_ITEM_FIFTH_OPTION:
				{
					int x = menuEntry.getParam0();
					int y = menuEntry.getParam1();
					int id = menuEntry.getIdentifier();
					Tile tile = Static.getClient().getScene().getTiles()[Static.getClient().getPlane()][x][y];
					out.addAll(TileItems.getAt(tile, id));
					break;
				}

				case ITEM_USE_ON_PLAYER:
				case WIDGET_TARGET_ON_PLAYER:
				case PLAYER_FIRST_OPTION:
				case PLAYER_SECOND_OPTION:
				case PLAYER_THIRD_OPTION:
				case PLAYER_FOURTH_OPTION:
				case PLAYER_FIFTH_OPTION:
				case PLAYER_SIXTH_OPTION:
				case PLAYER_SEVENTH_OPTION:
				case PLAYER_EIGHTH_OPTION:
				{
					out.add(Static.getClient().getCachedPlayers()[menuEntry.getIdentifier()]);
					break;
				}

				default:
					break;
			}
		}

		return out;
	}
}
