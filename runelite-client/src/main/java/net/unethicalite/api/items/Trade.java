package net.unethicalite.api.items;

import net.unethicalite.api.commons.Predicates;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.api.VarClientStr;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetID;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.client.Static;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Trade
{
	private static final Supplier<Widget> OUR_ITEMS = () -> Widgets.get(WidgetID.PLAYER_TRADE_SCREEN_GROUP_ID, 25);
	private static final Supplier<Widget> THEIR_ITEMS = () -> Widgets.get(WidgetID.PLAYER_TRADE_SCREEN_GROUP_ID, 28);
	private static final Supplier<Widget> INVENTORY = () -> Widgets.get(WidgetID.PLAYER_TRADE_INVENTORY_GROUP_ID, 0);
	private static final Supplier<Widget> ACCEPT_1 = () -> Widgets.get(WidgetID.PLAYER_TRADE_SCREEN_GROUP_ID, 10);
	private static final Supplier<Widget> ACCEPT_2 = () -> Widgets.get(WidgetInfo.SECOND_TRADING_WITH_ACCEPT_BUTTON);
	private static final Supplier<Widget> DECLINE_1 = () -> Widgets.get(WidgetID.PLAYER_TRADE_SCREEN_GROUP_ID, 13);
	private static final Supplier<Widget> DECLINE_2 = () -> Widgets.get(WidgetID.PLAYER_TRADE_CONFIRM_GROUP_ID, WidgetID.TradeScreen.SECOND_DECLINE_FUNC);
	private static final Supplier<Widget> ACCEPT_STATUS_1 = () -> Widgets.get(WidgetID.PLAYER_TRADE_SCREEN_GROUP_ID, 30);
	private static final Supplier<Widget> ACCEPT_STATUS_2 = () -> Widgets.get(WidgetID.PLAYER_TRADE_CONFIRM_GROUP_ID, 4);

	public static boolean isOpen()
	{
		return isFirstScreenOpen() || isSecondScreenOpen();
	}

	public static boolean isSecondScreenOpen()
	{
		return Widgets.isVisible(ACCEPT_2.get());
	}

	public static boolean isFirstScreenOpen()
	{
		return Widgets.isVisible(ACCEPT_1.get());
	}

	public static void accept()
	{
		acceptFirstScreen();
		acceptSecondScreen();
	}

	public static void acceptFirstScreen()
	{
		Widget button = ACCEPT_1.get();
		if (Widgets.isVisible(button))
		{
			button.interact("Accept");
		}
	}

	public static void acceptSecondScreen()
	{
		Widget button = ACCEPT_2.get();
		if (Widgets.isVisible(button))
		{
			button.interact("Accept");
		}
	}

	public static void decline()
	{
		declineFirstScreen();
		declineSecondScreen();
	}

	public static void declineFirstScreen()
	{
		Widget button = DECLINE_1.get();
		if (Widgets.isVisible(button))
		{
			button.interact("Decline");
		}
	}

	public static void declineSecondScreen()
	{
		Widget button = DECLINE_2.get();
		if (Widgets.isVisible(button))
		{
			button.interact("Decline");
		}
	}

	public static boolean hasAccepted(boolean them)
	{
		return hasAcceptedFirstScreen(them) || hasAcceptedSecondScreen(them);
	}

	public static boolean hasAcceptedFirstScreen(boolean them)
	{
		Widget widget = ACCEPT_STATUS_1.get();
		return widget != null && widget.getText().equals(them ? "Other player has accepted." : "Waiting for other player...");
	}

	public static boolean hasAcceptedSecondScreen(boolean them)
	{
		Widget widget = ACCEPT_STATUS_2.get();
		return widget != null && widget.getText().equals(them ? "Other player has accepted." : "Waiting for other player...");
	}

	public static void offer(Predicate<Item> filter, int quantity)
	{
		Item item = Trade.getInventory(filter).stream().findFirst().orElse(null);
		if (item == null)
		{
			return;
		}

		switch (quantity)
		{
			case 1:
				item.interact("Offer");
				break;
			case 5:
				item.interact("Offer-5");
				break;
			case 10:
				item.interact("Offer-10");
				break;
			default:
				if (quantity >= Inventory.getCount(true, item.getId()))
				{
					item.interact("Offer-All");
				}
				else
				{
					item.interact("Offer-X");
					Dialog.enterAmount(quantity);
					Time.sleepTick();
				}
				break;
		}
	}

	public static void offer(int id, int quantity)
	{
		offer(x -> x.getId() == id, quantity);
	}

	public static void offer(String name, int quantity)
	{
		offer(x -> x.getName() != null && x.getName().equals(name), quantity);
	}

	/**
	 * Pass true as first parameter if you want to get the other side's items
	 */
	public static List<Item> getAll(boolean theirs, Predicate<Item> filter)
	{
		List<Item> items = new ArrayList<>();
		ItemContainer container = Static.getClient().getItemContainer(theirs ? InventoryID.TRADEOTHER : InventoryID.TRADE);
		if (container == null)
		{
			return items;
		}

		Item[] containerItems = container.getItems();
		for (int i = 0, containerItemsLength = containerItems.length; i < containerItemsLength; i++)
		{
			Item item = containerItems[i];
			if (item.getId() != -1 && item.getName() != null && !item.getName().equals("null"))
			{
				Widget containerWidget = theirs ? THEIR_ITEMS.get() : OUR_ITEMS.get();
				item.setWidgetId(item.calculateWidgetId(containerWidget));
				item.setSlot(i);

				if (filter.test(item))
				{
					items.add(item);
				}
			}
		}

		return items;
	}

	public static List<Item> getInventory(Predicate<Item> filter)
	{
		List<Item> items = new ArrayList<>();
		ItemContainer container = Static.getClient().getItemContainer(InventoryID.INVENTORY);
		if (container == null)
		{
			return items;
		}

		Item[] containerItems = container.getItems();
		for (int i = 0, containerItemsLength = containerItems.length; i < containerItemsLength; i++)
		{
			Item item = containerItems[i];
			if (item.getId() != -1 && item.getName() != null && !item.getName().equals("null"))
			{
				item.setWidgetId(item.calculateWidgetId(INVENTORY.get()));
				item.setSlot(i);

				if (filter.test(item))
				{
					items.add(item);
				}
			}
		}

		return items;
	}

	public static List<Item> getAll(boolean theirs)
	{
		return getAll(theirs, x -> true);
	}

	public static List<Item> getAll(boolean theirs, int... ids)
	{
		return getAll(theirs, Predicates.ids(ids));
	}

	public static List<Item> getAll(boolean theirs, String... names)
	{
		return getAll(theirs, Predicates.names(names));
	}

	public static Item getFirst(boolean theirs, Predicate<Item> filter)
	{
		return getAll(theirs, filter).stream().findFirst().orElse(null);
	}

	public static Item getFirst(boolean theirs, int... ids)
	{
		return getFirst(theirs, Predicates.ids(ids));
	}

	public static Item getFirst(boolean theirs, String... names)
	{
		return getFirst(theirs, Predicates.names(names));
	}

	public static boolean contains(boolean theirs, Predicate<Item> filter)
	{
		return getFirst(theirs, filter) != null;
	}

	public static boolean contains(boolean theirs, int... ids)
	{
		return contains(theirs, Predicates.ids(ids));
	}

	public static boolean contains(boolean theirs, String... names)
	{
		return contains(theirs, Predicates.names(names));
	}

	public static String getTradingPlayer()
	{
		return Vars.getVarcStr(VarClientStr.DUEL_OPPONENT_NAME);
	}
}
