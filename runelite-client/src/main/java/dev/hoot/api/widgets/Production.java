package dev.hoot.api.widgets;

import dev.hoot.api.game.GameThread;
import dev.hoot.api.input.Keyboard;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetID;
import net.runelite.api.widgets.WidgetInfo;

import java.util.function.Supplier;

public class Production {
    private static final Supplier<Widget> OPTIONS = () -> Widgets.get(WidgetID.MULTISKILL_MENU_GROUP_ID, 13);
    private static final Supplier<Widget> OTHER_QUANTITY = () -> Widgets.get(WidgetID.MULTISKILL_MENU_GROUP_ID, 11);
    public static boolean isOpen() {
        Widget widget = Widgets.get(WidgetInfo.MULTI_SKILL_MENU);
        return widget != null && !GameThread.invokeLater(widget::isHidden);
    }

    public static void chooseOption(String option) {
        if (!isOpen()) {
            return;
        }

        Widget optionsWidget = OPTIONS.get();
        if (optionsWidget == null || GameThread.invokeLater(optionsWidget::isHidden)) {
            return;
        }

        int options = optionsWidget.getChildren() != null ? optionsWidget.getChildren().length : 1;
        for (int i = 0; i < options; i++) {
            Widget currentOption = Widgets.get(WidgetID.MULTISKILL_MENU_GROUP_ID, 14 + i);
            if (currentOption != null && currentOption.getName().toLowerCase().contains(option.toLowerCase())) {
                chooseOption(i + 1);
                return;
            }
        }
    }

    public static void selectOtherQuantity() {
        Widget otherQuantity = OTHER_QUANTITY.get();
        if (otherQuantity != null && !GameThread.invokeLater(otherQuantity::isHidden)) {
            otherQuantity.interact(0);
        }
    }

    public static void chooseOption(int index) {
        if (isOpen()) {
            Keyboard.type(index);
        }
    }

    public static void choosePreviousOption() {
        if (isOpen()) {
            Keyboard.sendSpace();
        }
    }

    public static boolean isEnterInputOpen() {
        return Dialog.isEnterInputOpen();
    }

    public static void enterInput(int amount) {
        Dialog.enterInput(amount);
    }

    public static void enterInput(String input) {
        Dialog.enterInput(input);
    }
}
