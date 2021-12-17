package dev.hoot.api.items;

import dev.hoot.api.widgets.Widgets;
import net.runelite.api.widgets.Widget;

import java.util.function.Supplier;

public class DepositBox {
    private static final Supplier<Widget> DEPOSIT_INV = () -> Widgets.get(192, 4);
    private static final Supplier<Widget> DEPOSIT_EQUIPS = () -> Widgets.get(192, 6);
    private static final Supplier<Widget> DEPOSIT_LOOTINGBAG = () -> Widgets.get(192, 8);
    private static final Supplier<Widget> ROOT = () -> Widgets.get(192, 1);
    private static final Supplier<Widget> EXIT = () -> Widgets.get(192, 1, 11);

    public static void depositInventory() {
        Widget depositInventory = DEPOSIT_INV.get();
        if (!Widgets.isVisible(depositInventory)) {
            return;
        }

        depositInventory.interact(0);
    }

    public static void depositEquipment() {
        Widget depositEquipment = DEPOSIT_EQUIPS.get();
        if (!Widgets.isVisible(depositEquipment)) {
            return;
        }

        depositEquipment.interact(0);
    }

    public static void depositLootingBag() {
        Widget depositLootingbag = DEPOSIT_LOOTINGBAG.get();
        if (!Widgets.isVisible(depositLootingbag)) {
            return;
        }

        depositLootingbag.interact(0);
    }

    public static boolean isOpen() {
        Widget depositBox = ROOT.get();
        return Widgets.isVisible(depositBox);
    }

    public static void close() {
        Widget exitDepositBox = EXIT.get();
        if (!Widgets.isVisible(exitDepositBox)) {
            return;
        }

        exitDepositBox.interact(0);
    }
}
