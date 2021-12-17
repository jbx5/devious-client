package dev.hoot.api.widgets;

import dev.hoot.api.entities.Players;
import dev.hoot.api.game.Game;
import dev.hoot.api.game.GameThread;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Minigames {
	private static final Supplier<Widget> MINIGAMES_TAB_BUTTON = () -> Widgets.get(707, 6);
	private static final Supplier<Widget> MINIGAMES_DESTINATION = () -> Widgets.get(76, 8);

	public static void teleport(Destination destination) {
		Widget minigamesTeleportButton = Widgets.get(WidgetInfo.MINIGAME_TELEPORT_BUTTON);
		List<Integer> teleportGraphics = List.of(800, 802, 803, 804);
		if (isOpen() && minigamesTeleportButton != null) {
			if (Destination.getCurrent() != destination) {
				GameThread.invoke(() -> Game.getClient().runScript(124, destination.index));
				return;
			}

			if (teleportGraphics.contains(Players.getLocal().getGraphic())) {
				return;
			}

			Game.getClient().interact(1, 57, destination.index, 4980762);
		} else {
			open();
		}
	}

	public static boolean open() {
		if (!isTabOpen()) {
			Tabs.open(Tab.QUESTS);
			return false;
		}

		if (!isOpen()) {
			Widget widget = MINIGAMES_TAB_BUTTON.get();
			if (widget != null && !GameThread.invokeLater(widget::isHidden)) {
				widget.interact("Grouping");
				return false;
			}
		}

		return isOpen();
	}

	public static boolean isOpen() {
		Widget minigamesButton = Widgets.get(WidgetInfo.MINIGAME_TELEPORT_BUTTON);
		return minigamesButton != null && !GameThread.invokeLater(minigamesButton::isHidden);
	}
	public static boolean isTabOpen() {
		return Tabs.isOpen(Tab.CLAN_CHAT);
	}

	public enum Destination {
		BARBARIAN_ASSAULT(1, "Barbarian Assault"),
		BLAST_FURNACE(2, "Blast Furnace"),
		BURTHORPE_GAMES_ROOM(3, "Burthorpe Games Room"),
		CASTLE_WARS(4, "Castle Wars"),
		CLAN_WARS(5, "Clan Wars"),
		DAGANNOTH_KINGS(6, "Dagannoth Kings"),
		FISHING_TRAWLER(7, "Fishing Trawler"),
		GOD_WARS(8, "God Wars"),
		LAST_MAN_STANDING(9, "Last Man Standing"),
		NIGHTMARE_ZONE(10, "Nightmare Zone"),
		PEST_CONTROL(11, "Pest Control"),
		PLAYER_OWNED_HOUSES(12, "Player Owned Houses"),
		RAT_PITS(13, "Rat Pits"),
		SHADES_OF_MORTTON(14, "Shades of Mort'ton"),
		SHIELD_OF_ARRAV(15, "Shield of Arrav"),
		THEATRE_OF_BLOOD(16, "Theatre of Blood"),
		TITHE_FARM(17, "Tithe Farm"),
		TROUBLE_BREWING(18, "Trouble Brewing"),
		TZHAAR_FIGHT_PIT(19, "TzHaar Fight Pit"),
		VOLCANIC_MINE(20, "Volcanic Mine"),
		NONE(-1, "None")
		;

		private final int index;
		private final String name;

		Destination(int index, String name) {
			this.index = index;
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public int getIndex() {
			return index;
		}

		public static Destination getCurrent() {
			Widget selectedTeleport = MINIGAMES_DESTINATION.get();
			if (selectedTeleport != null && !GameThread.invokeLater(selectedTeleport::isHidden)) {
				return byName(selectedTeleport.getText());
			}

			return NONE;
		}

		public static Destination byName(String name) {
			return Arrays.stream(values())
							.filter(x -> x.getName().equals(name))
							.findFirst()
							.orElse(NONE);
		}
	}
}
