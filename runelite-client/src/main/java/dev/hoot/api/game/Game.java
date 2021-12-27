package dev.hoot.api.game;

import dev.hoot.api.movement.pathfinder.GlobalCollisionMap;
import dev.hoot.api.widgets.Tab;
import dev.hoot.api.widgets.Tabs;
import dev.hoot.api.widgets.Widgets;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.packets.ClientPacket;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetID;
import net.runelite.api.widgets.WidgetInfo;

import javax.inject.Inject;

public class Game
{
	private static final int MEMBER_DAYS_VARP = 1780;
	private static final int CUTSCENE_VARBIT = 542;
	private static final String LOGOUT_ACTION = "Logout";

	@Inject
	private static Client client;

	@Inject
	private static ClientPacket clientPacket;

	@Inject
	private static GlobalCollisionMap globalCollisionMap;

	public static Client getClient()
	{
		return client;
	}

	public static ClientPacket getClientPacket()
	{
		return clientPacket;
	}

	public static boolean isLoggedIn()
	{
		return getState() == GameState.LOGGED_IN || getState() == GameState.LOADING;
	}

	public static boolean isOnLoginScreen()
	{
		return getState() == GameState.LOGIN_SCREEN
				|| getState() == GameState.LOGIN_SCREEN_AUTHENTICATOR;
	}

	public static GameState getState()
	{
		return client.getGameState();
	}

	public static int getWildyLevel()
	{
		Widget wildyLevelWidget = Widgets.get(WidgetInfo.PVP_WILDERNESS_LEVEL);
		if (wildyLevelWidget == null || GameThread.invokeLater(wildyLevelWidget::isHidden))
		{
			return 0;
		}

		// Dmm
		if (wildyLevelWidget.getText().contains("Guarded")
				|| wildyLevelWidget.getText().contains("Protection"))
		{
			return 0;
		}

		if (wildyLevelWidget.getText().contains("Deadman"))
		{
			return Integer.MAX_VALUE;
		}

		return Integer.parseInt(wildyLevelWidget.getText().replace("Level: ", ""));
	}

	public static int getMembershipDays()
	{
		return Vars.getVarp(MEMBER_DAYS_VARP);
	}

	public static boolean isInCutscene()
	{
		return Vars.getBit(CUTSCENE_VARBIT) > 0;
	}

	public static void logout()
	{
		Widget logOutHopper = Widgets.get(WidgetID.WORLD_SWITCHER_GROUP_ID, x -> x.hasAction(LOGOUT_ACTION));
		if (logOutHopper != null)
		{
			logOutHopper.interact(LOGOUT_ACTION);
			return;
		}

		Widget logOut = Widgets.get(WidgetID.LOGOUT_PANEL_ID, x -> x.hasAction(LOGOUT_ACTION));
		if (logOut != null)
		{
			logOut.interact(LOGOUT_ACTION);
			return;
		}

		if (!Tabs.isOpen(Tab.LOG_OUT))
		{
			Tabs.open(Tab.LOG_OUT);
		}
	}

	public static GlobalCollisionMap getGlobalCollisionMap()
	{
		return globalCollisionMap;
	}
}
