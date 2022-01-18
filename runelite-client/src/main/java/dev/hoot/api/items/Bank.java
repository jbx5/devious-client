package dev.hoot.api.items;

import dev.hoot.api.commons.Time;
import dev.hoot.api.game.Game;
import dev.hoot.api.game.Vars;
import dev.hoot.api.widgets.Dialog;
import dev.hoot.api.widgets.Widgets;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.api.Varbits;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetID;
import net.runelite.api.widgets.WidgetInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Bank extends Items
{
	private Bank()
	{
	}

	private static final Bank BANK = new Bank();
	private static final int WITHDRAW_MODE_VARBIT = 3958;
	private static final int QUANTITY_MODE_VARP = 6590;
	private static final Supplier<Widget> MAIN_TAB = () -> Widgets.get(12, 11, 0);
	private static final Supplier<Widget> BANK_CAPACITY = () -> Widgets.get(12, 9);
	private static final Supplier<Widget> RELEASE_PLACEHOLDERS = () -> Widgets.get(12, 56);
	private static final Supplier<Widget> SETTINGS_CONTAINER = () -> Widgets.get(12, 48);
	private static final Supplier<Widget> WITHDRAW_ITEM = () -> Widgets.get(12, Component.BANK_WITHDRAW_ITEM.childId);
	private static final Supplier<Widget> WITHDRAW_NOTE = () -> Widgets.get(12, Component.BANK_WITHDRAW_NOTE.childId);

	@Override
	protected List<Item> all(Predicate<Item> filter)
	{
		List<Item> items = new ArrayList<>();
		ItemContainer container = Game.getClient().getItemContainer(InventoryID.BANK);
		if (container == null)
		{
			return items;
		}

		Inventory.cacheItems(container);

		Item[] containerItems = container.getItems();
		for (int i = 0, containerItemsLength = containerItems.length; i < containerItemsLength; i++)
		{
			Item item = containerItems[i];
			if (item.getId() != -1 && item.getName() != null && !item.getName().equals("null"))
			{
				item.setWidgetId(item.calculateWidgetId(WidgetInfo.BANK_ITEM_CONTAINER));
				item.setSlot(i);

				if (filter.test(item))
				{
					items.add(item);
				}
			}
		}

		return items;
	}


	public static void setQuantityMode(QuantityMode quantityMode)
	{
		if (getQuantityMode() != quantityMode)
		{
			Widget component = Widgets.get(quantityMode.widget.groupId, quantityMode.widget.childId);
			if (Widgets.isVisible(component))
			{
				component.interact(0);
			}
		}
	}

	public static QuantityMode getQuantityMode()
	{
		return QuantityMode.getCurrent();
	}

	public static int getFreeSlots()
	{
		if (!isOpen())
		{
			return -1;
		}

		return getCapacity() - getOccupiedSlots();
	}

	public static int getCapacity()
	{
		Widget widget = BANK_CAPACITY.get();
		if (Widgets.isVisible(widget))
		{
			return Integer.parseInt(widget.getText());
		}

		return -1;
	}

	public static int getOccupiedSlots()
	{
		Widget widget = Widgets.get(WidgetInfo.BANK_ITEM_COUNT_TOP);
		if (Widgets.isVisible(widget))
		{
			return Integer.parseInt(widget.getText());
		}

		return -1;
	}

	public static void releasePlaceholders()
	{
		if (!isSettingsOpen())
		{
			toggleSettings();
			Time.sleepUntil(Bank::isSettingsOpen, 5000);
		}

		Widget widget = RELEASE_PLACEHOLDERS.get();
		if (widget != null)
		{
			widget.interact(5);
		}
	}

	public static void toggleSettings()
	{
		Widget settingsButton = Widgets.get(WidgetInfo.BANK_SETTINGS_BUTTON);
		if (settingsButton != null)
		{
			settingsButton.interact(0);
		}
	}

	public static boolean isSettingsOpen()
	{
		return Widgets.isVisible(SETTINGS_CONTAINER.get());
	}

	public static void depositInventory()
	{
		Widget widget = Widgets.get(WidgetInfo.BANK_DEPOSIT_INVENTORY);
		if (widget != null)
		{
			widget.interact("Deposit inventory");
		}
	}

	public static void depositEquipment()
	{
		Widget widget = Widgets.get(WidgetInfo.BANK_DEPOSIT_EQUIPMENT);
		if (widget != null)
		{
			widget.interact("Deposit worn items");
		}
	}

	public static boolean isOpen()
	{
		return Widgets.isVisible(Widgets.get(WidgetInfo.BANK_ITEM_CONTAINER));
	}

	public static boolean isEmpty()
	{
		return getAll().isEmpty();
	}

	public static void depositAll(String name)
	{
		depositAll(x -> Objects.equals(x.getName(), name));
	}

	public static void depositAll(int id)
	{
		depositAll(x -> x.getId() == id);
	}

	public static void depositAll(Predicate<Item> filter)
	{
		deposit(filter, Integer.MAX_VALUE);
	}

	public static void deposit(String name, int amount)
	{
		deposit(x -> Objects.equals(x.getName(), name), amount);
	}

	public static void deposit(int id, int amount)
	{
		deposit(x -> x.getId() == id, amount);
	}

	public static void deposit(Predicate<Item> filter, int amount)
	{
		Item item = getInventory(filter).stream()
				.findFirst()
				.orElse(null);
		if (item == null)
		{
			return;
		}

		WithdrawOption withdrawOption = WithdrawOption.ofAmount(item, amount);


		if (withdrawOption == WithdrawOption.X && item.hasAction("Deposit-" + amount))
		{
			item.interact(WithdrawOption.LAST_QUANTITY.getMenuIndex() + 1);
		}
		else
		{
			item.interact(withdrawOption.menuIndex + 1);

			if (withdrawOption == WithdrawOption.X)
			{
				Dialog.enterInput(amount);
			}
		}

	}


	public static void withdrawAll(String name, WithdrawMode withdrawMode)
	{
		withdrawAll(x -> Objects.equals(x.getName(), name), withdrawMode);
	}

	public static void withdrawAll(int id, WithdrawMode withdrawMode)
	{
		withdrawAll(x -> x.getId() == id, withdrawMode);
	}

	public static void withdrawAll(Predicate<Item> filter, WithdrawMode withdrawMode)
	{
		withdraw(filter, Integer.MAX_VALUE, withdrawMode);
	}

	public static void withdraw(String name, int amount, WithdrawMode withdrawMode)
	{
		withdraw(x -> Objects.equals(x.getName(), name), amount, withdrawMode);
	}

	public static void withdraw(int id, int amount, WithdrawMode withdrawMode)
	{
		withdraw(x -> x.getId() == id, amount, withdrawMode);
	}

	public static void withdraw(Predicate<Item> filter, int amount, WithdrawMode withdrawMode)
	{
		Item item = getFirst(filter.and(x -> !x.isPlaceholder()));

		if (item == null)
		{
			return;
		}

		WithdrawOption withdrawOption = WithdrawOption.ofAmount(item, amount);
		if (withdrawMode == WithdrawMode.NOTED && !isNotedWithdrawMode())
		{
			setWithdrawMode(true);
			Time.sleepUntil(Bank::isNotedWithdrawMode, 1200);
		}

		if (withdrawMode == WithdrawMode.ITEM && isNotedWithdrawMode())
		{
			setWithdrawMode(false);
			Time.sleepUntil(() -> !isNotedWithdrawMode(), 1200);
		}

		if (withdrawOption == WithdrawOption.X && item.hasAction("Withdraw-" + amount))
		{
			item.interact(WithdrawOption.LAST_QUANTITY.getMenuIndex());
		}
		else
		{
			item.interact(withdrawOption.getMenuIndex());
			if (withdrawOption == WithdrawOption.X)
			{
				Time.sleepUntil(Dialog::isEnterInputOpen, 1200);
				Dialog.enterInput(amount);
			}
		}

	}

	public static void withdrawLastQuantity(String name, WithdrawMode withdrawMode)
	{
		withdrawLastQuantity(x -> Objects.equals(name, x.getName()), withdrawMode);
	}

	public static void withdrawLastQuantity(int id, WithdrawMode withdrawMode)
	{
		withdrawLastQuantity(x -> x.getId() == id, withdrawMode);
	}

	public static void withdrawLastQuantity(Predicate<Item> filter, WithdrawMode withdrawMode)
	{
		Item item = getFirst(filter.and(x -> !x.isPlaceholder()));

		if (item == null)
		{
			return;
		}

		WithdrawOption withdrawOption = WithdrawOption.LAST_QUANTITY;
		if (withdrawMode == WithdrawMode.NOTED && !isNotedWithdrawMode())
		{
			setWithdrawMode(true);
		}

		if (withdrawMode == WithdrawMode.ITEM && isNotedWithdrawMode())
		{
			setWithdrawMode(false);
		}

		item.interact(withdrawOption.getMenuIndex());
	}

	public static void setWithdrawMode(boolean noted)
	{
		Widget widget = noted ? WITHDRAW_NOTE.get() : WITHDRAW_ITEM.get();
		if (widget != null)
		{
			widget.interact(0);
		}
	}

	public static boolean isNotedWithdrawMode()
	{
		return Vars.getBit(WITHDRAW_MODE_VARBIT) == 1;
	}

	public static List<Item> getInventory(Predicate<Item> filter)
	{
		List<Item> items = new ArrayList<>();
		ItemContainer container = Game.getClient().getItemContainer(InventoryID.INVENTORY);
		if (container == null)
		{
			return items;
		}

		Inventory.cacheItems(container);

		Item[] containerItems = container.getItems();
		for (int i = 0, containerItemsLength = containerItems.length; i < containerItemsLength; i++)
		{
			Item item = containerItems[i];
			if (item.getId() != -1 && item.getName() != null && !item.getName().equals("null"))
			{
				item.setWidgetId(item.calculateWidgetId(WidgetInfo.BANK_INVENTORY_ITEMS_CONTAINER));
				item.setSlot(i);

				if (filter.test(item))
				{
					items.add(item);
				}
			}
		}

		return items;
	}

	public static List<Item> getAll(Predicate<Item> filter)
	{
		return BANK.all(filter);
	}

	public static List<Item> getAll()
	{
		return getAll(x -> true);
	}

	public static List<Item> getAll(int... ids)
	{
		return BANK.all(ids);
	}

	public static List<Item> getAll(String... names)
	{
		return BANK.all(names);
	}

	public static Item getFirst(Predicate<Item> filter)
	{
		return BANK.first(filter);
	}

	public static Item getFirst(int... ids)
	{
		return BANK.first(ids);
	}

	public static Item getFirst(String... names)
	{
		return BANK.first(names);
	}

	public static boolean contains(Predicate<Item> filter)
	{
		return BANK.exists(filter);
	}

	public static boolean contains(int... id)
	{
		return BANK.exists(id);
	}

	public static boolean contains(String... name)
	{
		return BANK.exists(name);
	}

	public static int getCount(boolean stacks, Predicate<Item> filter)
	{
		return BANK.count(stacks, filter);
	}

	public static int getCount(boolean stacks, int... ids)
	{
		return BANK.count(stacks, ids);
	}

	public static int getCount(boolean stacks, String... names)
	{
		return BANK.count(stacks, names);
	}

	public static int getCount(Predicate<Item> filter)
	{
		return BANK.count(false, filter);
	}

	public static int getCount(int... ids)
	{
		return BANK.count(false, ids);
	}

	public static int getCount(String... names)
	{
		return BANK.count(false, names);
	}

	public static List<Widget> getTabs()
	{
		return Widgets.getChildren(WidgetInfo.BANK_TAB_CONTAINER, x -> x.hasAction("Collapse tab"));
	}

	public static boolean hasTabs()
	{
		return !getTabs().isEmpty();
	}

	public static void collapseTabs()
	{
		for (int i = 0; i < getTabs().size(); i++)
		{
			Widget tab = getTabs().get(i);
			Game.getClient().interact(6, 1007, 11 + i, tab.getId());
		}
	}

	public static void collapseTab(int index)
	{
		Widget tabContainer = Widgets.get(WidgetInfo.BANK_TAB_CONTAINER);
		if (!Widgets.isVisible(tabContainer))
		{
			return;
		}

		int tabIdx = 11 + index;
		Widget tab = tabContainer.getChild(tabIdx);
		if (!Widgets.isVisible(tab))
		{
			return;
		}

		Game.getClient().interact(6, 1007, tabIdx, tab.getId());
	}

	public static boolean isMainTabOpen()
	{
		return Vars.getBit(Varbits.CURRENT_BANK_TAB.getId()) == 0;
	}

	public static void openMainTab()
	{
		Widget mainTab = MAIN_TAB.get();
		if (Widgets.isVisible(mainTab))
		{
			mainTab.interact(0);
		}
	}

	public enum Component
	{
		BANK_REARRANGE_SWAP(WidgetID.BANK_GROUP_ID, 17),
		BANK_REARRANGE_INSERT(WidgetID.BANK_GROUP_ID, 19),
		BANK_WITHDRAW_ITEM(WidgetID.BANK_GROUP_ID, 22),
		BANK_WITHDRAW_NOTE(WidgetID.BANK_GROUP_ID, 24),
		BANK_QUANTITY_BUTTONS_CONTAINER(WidgetID.BANK_GROUP_ID, 26),
		BANK_QUANTITY_ONE(WidgetID.BANK_GROUP_ID, 28),
		BANK_QUANTITY_FIVE(WidgetID.BANK_GROUP_ID, 30),
		BANK_QUANTITY_TEN(WidgetID.BANK_GROUP_ID, 32),
		BANK_QUANTITY_X(WidgetID.BANK_GROUP_ID, 34),
		BANK_QUANTITY_ALL(WidgetID.BANK_GROUP_ID, 36),
		BANK_PLACEHOLDERS_BUTTON(WidgetID.BANK_GROUP_ID, 38),
		EMPTY(-1, -1);

		private final int groupId;
		private final int childId;

		Component(int groupId, int childId)
		{
			this.groupId = groupId;
			this.childId = childId;
		}
	}

	public enum QuantityMode
	{
		ONE(Component.BANK_QUANTITY_ONE, 0),
		FIVE(Component.BANK_QUANTITY_FIVE, 1),
		TEN(Component.BANK_QUANTITY_TEN, 2),
		X(Component.BANK_QUANTITY_X, 3),
		ALL(Component.BANK_QUANTITY_ALL, 4),
		UNKNOWN(Component.EMPTY, -1);

		private final Component widget;
		private final int bitValue;

		QuantityMode(Component widget, int bitValue)
		{
			this.widget = widget;
			this.bitValue = bitValue;
		}

		public static QuantityMode getCurrent()
		{
			switch (Vars.getBit(QUANTITY_MODE_VARP))
			{
				case 0:
					return QuantityMode.ONE;
				case 1:
					return QuantityMode.FIVE;
				case 2:
					return QuantityMode.TEN;
				case 3:
					return QuantityMode.X;
				case 4:
					return QuantityMode.ALL;
				default:
					return UNKNOWN;
			}
		}
	}

	public enum WithdrawMode
	{
		NOTED, ITEM, DEFAULT
	}

	private enum WithdrawOption
	{
		ONE(2), FIVE(3), TEN(4), LAST_QUANTITY(5), X(6),
		ALL(7), ALL_BUT_1(8);

		private final int menuIndex;

		WithdrawOption(int menuIndex)
		{
			this.menuIndex = menuIndex;
		}

		public int getMenuIndex()
		{
			//Special case
			if (getQuantityMode() == QuantityMode.ONE && this == WithdrawOption.ONE)
			{
				return 1;
			}
			return menuIndex;
		}

		public static WithdrawOption ofAmount(Item item, int amount)
		{
			if (amount <= 1)
			{
				return WithdrawOption.ONE;
			}

			if (amount == 5)
			{
				return WithdrawOption.FIVE;
			}

			if (amount == 10)
			{
				return WithdrawOption.TEN;
			}

			if (amount > item.getQuantity())
			{
				return WithdrawOption.ALL;
			}

			return WithdrawOption.X;
		}
	}
}
