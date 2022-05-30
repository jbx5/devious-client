package net.unethicalite.api.script.blocking_events;

import net.runelite.api.Client;
import net.runelite.api.MenuAction;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

public class WelcomeScreenEvent extends BlockingEvent
{
	@Override
	public boolean validate()
	{
		return isWelcomeScreenOpen();
	}

	@Override
	public int loop()
	{
		Client client = Static.getClient();
		Widget old = Widgets.get(378, x -> x.hasAction("Play"));
		if (Widgets.isVisible(old))
		{
			client.interact(1, MenuAction.CC_OP.getId(), -1, old.getId());
			return -1;
		}

		Widget nu = Widgets.get(413, x -> x.hasAction("Play"));
		if (Widgets.isVisible(nu))
		{
			client.interact(1, MenuAction.CC_OP.getId(), -1, nu.getId());
			return -1;
		}

		return -1;
	}

	public static boolean isWelcomeScreenOpen()
	{
		return Widgets.isVisible(Widgets.get(378, x -> x.hasAction("Play")))
				|| Widgets.isVisible(Widgets.get(413, x -> x.hasAction("Play")));
	}
}
