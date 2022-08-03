package net.unethicalite.api.items;

import net.unethicalite.api.widgets.Widgets;
import net.runelite.api.widgets.Widget;

import java.util.function.Supplier;

public class DepositBox
{
	private DepositBox()
	{
	}

	private static final Supplier<Widget> DEPOSIT_INV = () -> Widgets.get(192, 4);
	private static final Supplier<Widget> DEPOSIT_EQUIPS = () -> Widgets.get(192, 6);
	private static final Supplier<Widget> DEPOSIT_LOOTINGBAG = () -> Widgets.get(192, 8);
	private static final Supplier<Widget> ROOT = () -> Widgets.get(192, 1);
	private static final Supplier<Widget> EXIT = () -> Widgets.get(192, 1, 11);
	private static final Supplier<Widget> QUANTITY_ONE = () -> Widgets.get(192, 11);
	private static final Supplier<Widget> QUANTITY_FIVE = () -> Widgets.get(192, 13);
	private static final Supplier<Widget> QUANTITY_TEN = () -> Widgets.get(192, 15);
	private static final Supplier<Widget> QUANTITY_X = () -> Widgets.get(192, 17);
	private static final Supplier<Widget> QUANTITY_ALL = () -> Widgets.get(192, 19);
	
	public static void depositInventory()
	{
		Widget depositInventory = DEPOSIT_INV.get();
		if (!Widgets.isVisible(depositInventory))
		{
			return;
		}

		depositInventory.interact(0);
	}

	public static void depositEquipment()
	{
		Widget depositEquipment = DEPOSIT_EQUIPS.get();
		if (!Widgets.isVisible(depositEquipment))
		{
			return;
		}

		depositEquipment.interact(0);
	}

	public static void depositLootingBag()
	{
		Widget depositLootingbag = DEPOSIT_LOOTINGBAG.get();
		if (!Widgets.isVisible(depositLootingbag))
		{
			return;
		}

		depositLootingbag.interact(0);
	}

		public static void selectQuantityOne()
	{
		Widget selectQuantityOne = QUANTITY_ONE.get();
		if (!Widgets.isVisible(selectQuantityOne))
		{
			return;
		}

		selectQuantityOne.interact(0);
	}

	public static void selectQuantityFive()
	{
		Widget selectQuantityFive = QUANTITY_FIVE.get();
		if (!Widgets.isVisible(selectQuantityFive))
		{
			return;
		}

		selectQuantityFive.interact(0);
	}

	public static void selectQuantityTen()
	{
		Widget selectQuantityTen = QUANTITY_TEN.get();
		if (!Widgets.isVisible(selectQuantityTen))
		{
			return;
		}

		selectQuantityTen.interact(0);
	}

	public static void selectQuantityX()
	{
		Widget selectQuantityX = QUANTITY_X.get();
		if (!Widgets.isVisible(selectQuantityX))
		{
			return;
		}

		selectQuantityX.interact(0);
	}

	public static void selectQuantityAll()
	{
		Widget selectQuantityAll = QUANTITY_ALL.get();
		if (!Widgets.isVisible(selectQuantityAll))
		{
			return;
		}

		selectQuantityAll.interact(0);
	}
	
	public static boolean isOpen()
	{
		Widget depositBox = ROOT.get();
		return Widgets.isVisible(depositBox);
	}

	public static void close()
	{
		Widget exitDepositBox = EXIT.get();
		if (!Widgets.isVisible(exitDepositBox))
		{
			return;
		}

		exitDepositBox.interact(0);
	}
}
