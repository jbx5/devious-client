package net.unethicalite.api.widgets;

import net.unethicalite.api.input.Keyboard;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetID;
import net.runelite.api.widgets.WidgetInfo;

import java.util.function.Supplier;

public class Production
{
	private static final Supplier<Widget> OPTIONS = () -> Widgets.get(WidgetID.MULTISKILL_MENU_GROUP_ID, 13);
	private static final Supplier<Widget> OTHER_QUANTITY = () -> Widgets.get(WidgetID.MULTISKILL_MENU_GROUP_ID, 11);

	public static boolean isOpen()
	{
		return Widgets.isVisible(Widgets.get(WidgetInfo.MULTI_SKILL_MENU));
	}

	public static void chooseOption(String option)
	{
		if (!isOpen())
		{
			return;
		}

		Widget optionsWidget = OPTIONS.get();
		if (!Widgets.isVisible(optionsWidget))
		{
			return;
		}

		int options = optionsWidget.getChildren() != null ? optionsWidget.getChildren().length : 1;
		for (int i = 0; i < options; i++)
		{
			Widget currentOption = Widgets.get(WidgetID.MULTISKILL_MENU_GROUP_ID, 14 + i);
			if (currentOption != null && currentOption.getName().toLowerCase().contains(option.toLowerCase()))
			{
				chooseOption(i + 1);
				return;
			}
		}
	}

	public static void selectOtherQuantity()
	{
		Widget otherQuantity = OTHER_QUANTITY.get();
		if (Widgets.isVisible(otherQuantity))
		{
			otherQuantity.interact(0);
		}
	}

	public static void chooseOption(int index)
	{
		if (isOpen())
		{
			Keyboard.type(index);
		}
	}

	public static void choosePreviousOption()
	{
		if (isOpen())
		{
			Keyboard.sendSpace();
		}
	}

	public static boolean isEnterInputOpen()
	{
		return Dialog.isEnterInputOpen();
	}

	public static void enterAmount(int amount)
	{
		Dialog.enterAmount(amount);
	}

	public static void enterName(String input)
	{
		Dialog.enterName(input);
	}
}
