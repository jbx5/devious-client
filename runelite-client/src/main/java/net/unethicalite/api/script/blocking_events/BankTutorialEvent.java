package net.unethicalite.api.script.blocking_events;

import org.jetbrains.annotations.Nullable;
import net.runelite.api.MenuAction;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

/**
 * Event for clearing the tutorial if present
 * The initial tutorial state is stored server-side
 * Bank is still interactable through the API while the tutorial is open, but a real player probably always clear it if present
 * @see net.runelite.api.Varbits#BANK_TUTORIAL_COMPLETED
 */
public class BankTutorialEvent extends BlockingEvent
{
	@Override
	public boolean validate()
	{
		return isBankTutorialVisible();
	}

	private boolean isBankTutorialVisible()
	{
		return Widgets.isVisible(Widgets.get(WidgetInfo.BANK_TUTORIAL_CONTAINER)) &&
			Widgets.isVisible(getCloseButton());
	}

	@Nullable
	private static Widget getCloseButton()
	{
		return Widgets.getChildren(WidgetInfo.BANK_TUTORIAL_CLOSE_BUTTON_CONTAINER, w -> w.hasAction("Close"))
			.stream()
			.findFirst()
			.orElse(null);
	}

	@Override
	public int loop()
	{
		Widget closeButton = getCloseButton();

		if (closeButton != null)
		{
			Static.getClient().interact(1, MenuAction.CC_OP.getId(), 0, closeButton.getId());
		}

		return -1;
	}
}
