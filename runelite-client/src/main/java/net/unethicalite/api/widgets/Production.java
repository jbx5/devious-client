package net.unethicalite.api.widgets;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetID;
import static net.runelite.api.widgets.WidgetInfo.MULTI_SKILL_MENU;
import net.unethicalite.api.input.Keyboard;

public class Production
{
	private static final Supplier<Widget> OPTIONS = () -> Widgets.get(WidgetID.MULTISKILL_MENU_GROUP_ID, 13);
	private static final Supplier<Widget> OTHER_QUANTITY = () -> Widgets.get(WidgetID.MULTISKILL_MENU_GROUP_ID, 11);

	public static boolean isOpen()
	{
		return Widgets.isVisible(Widgets.get(MULTI_SKILL_MENU));
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

	/**
	 * Get the default option index. <br>
	 * The option has the key <b>"Space"</b> assigned to it,
	 * when there are more than one option. <br>
	 *
	 * @return Index when there is a default option, else -1
	 */
	public static int getDefaultOptionIndex()
	{
		Widget options = OPTIONS.get();

		if (!Widgets.isVisible(options))
		{
			return -1;
		}

		Widget[] optionKeys = options.getChildren();

		if (optionKeys == null || optionKeys.length <= 1)
		{
			return 0;
		}

		List<String> keyStrings = Arrays.stream(optionKeys)
			.map(Widget::getText)
			.collect(Collectors.toList());

		return keyStrings.indexOf("Space");
	}

	/**
	 * Gets the default option within the production. <br>
	 * This is usually the name of the ingredient/result item.
	 *
	 * @return Name, if it exists
	 */
	public static @Nullable String getDefaultOption()
	{
		int index = getDefaultOptionIndex();

		if (index == -1)
		{
			return null;
		}

		Widget defaultOption = Widgets.get(
			MULTI_SKILL_MENU.getGroupId(),
			14 + index
		);

		if (!defaultOption.isVisible())
		{
			return null;
		}

		return defaultOption.getName()
			.replace("<col=ff9040>", "")
			.replace("</col>", "");
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
