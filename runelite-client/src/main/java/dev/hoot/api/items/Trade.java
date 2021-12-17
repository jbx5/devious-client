package dev.hoot.api.items;

import dev.hoot.api.game.Game;
import dev.hoot.api.game.GameThread;
import dev.hoot.api.game.Vars;
import dev.hoot.api.widgets.Dialog;
import dev.hoot.api.widgets.Widgets;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.api.VarClientStr;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetID;
import net.runelite.api.widgets.WidgetInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Trade {
	private static final Supplier<Widget> OUR_ITEMS = () -> Widgets.get(WidgetID.PLAYER_TRADE_SCREEN_GROUP_ID, 25);
	private static final Supplier<Widget> THEIR_ITEMS = () -> Widgets.get(WidgetID.PLAYER_TRADE_SCREEN_GROUP_ID, 28);
	private static final Supplier<Widget> INVENTORY = () -> Widgets.get(WidgetID.PLAYER_TRADE_INVENTORY_GROUP_ID, 0);
	private static final Supplier<Widget> ACCEPT_1 = () -> Widgets.get(WidgetID.PLAYER_TRADE_SCREEN_GROUP_ID, 10);
	private static final Supplier<Widget> ACCEPT_2 = () -> Widgets.get(WidgetInfo.SECOND_TRADING_WITH_ACCEPT_BUTTON);
	private static final Supplier<Widget> DECLINE_1 = () -> Widgets.get(WidgetID.PLAYER_TRADE_SCREEN_GROUP_ID, 13);
	private static final Supplier<Widget> DECLINE_2 = () -> Widgets.get(WidgetID.PLAYER_TRADE_CONFIRM_GROUP_ID, WidgetID.TradeScreen.SECOND_DECLINE_FUNC);

	public static boolean isOpen() {
		return isFirstScreenOpen() || isSecondScreenOpen();
	}

	public static boolean isSecondScreenOpen() {
		Widget accept = ACCEPT_2.get();
		return accept != null && !GameThread.invokeLater(accept::isHidden);
	}

	public static boolean isFirstScreenOpen() {
		Widget accept = ACCEPT_1.get();
		return accept != null && !GameThread.invokeLater(accept::isHidden);
	}

	public static void accept() {
		acceptFirstScreen();
		acceptSecondScreen();
	}

	public static void acceptFirstScreen() {
		Widget button = ACCEPT_1.get();
		if (button != null && !GameThread.invokeLater(button::isHidden)) {
			button.interact("Accept");
		}
	}

	public static void acceptSecondScreen() {
		Widget button = ACCEPT_2.get();
		if (button != null && !GameThread.invokeLater(button::isHidden)) {
			button.interact("Accept");
		}
	}

	public static void decline() {
		declineFirstScreen();
		declineSecondScreen();
	}

	public static void declineFirstScreen() {
		Widget button = DECLINE_1.get();
		if (button != null && !GameThread.invokeLater(button::isHidden)) {
			button.interact("Decline");
		}
	}

	public static void declineSecondScreen() {
		Widget button = DECLINE_2.get();
		if (button != null && !GameThread.invokeLater(button::isHidden)) {
			button.interact("Decline");
		}
	}

	public static void offer(Predicate<Item> filter, int quantity) {
		Item item = Trade.getInventory(filter).stream().findFirst().orElse(null);
		if (item == null) {
			return;
		}

		switch (quantity) {
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
				if (quantity > item.getQuantity()) {
					item.interact("Offer-All");
				} else {
					item.interact("Offer-X");
					Dialog.enterInput(quantity);
				}
				break;
		}
	}

	public static void offer(int id, int quantity) {
		offer(x -> x.getId() == id, quantity);
	}

	public static void offer(String name, int quantity) {
		offer(x -> x.getName() != null && x.getName().equals(name), quantity);
	}

	/**
	 * Pass true as first parameter if you want to get the other side's items
	 */
	public static List<Item> getAll(boolean theirs, Predicate<Item> filter) {
		List<Item> items = new ArrayList<>();
		ItemContainer container = Game.getClient().getItemContainer(theirs ? InventoryID.TRADEOTHER : InventoryID.TRADE);
		if (container == null) {
			return items;
		}

		Inventory.cacheItems(container);

		Item[] containerItems = container.getItems();
		for (int i = 0, containerItemsLength = containerItems.length; i < containerItemsLength; i++) {
			Item item = containerItems[i];
			if (item.getId() != -1 && item.getName() != null && !item.getName().equals("null")) {
				Widget containerWidget = theirs ? THEIR_ITEMS.get() : OUR_ITEMS.get();
				item.setWidgetId(item.calculateWidgetId(containerWidget));
				item.setSlot(i);

				if (filter.test(item)) {
					items.add(item);
				}
			}
		}

		return items;
	}

	public static List<Item> getInventory(Predicate<Item> filter) {
		List<Item> items = new ArrayList<>();
		ItemContainer container = Game.getClient().getItemContainer(InventoryID.INVENTORY);
		if (container == null) {
			return items;
		}

		Inventory.cacheItems(container);

		Item[] containerItems = container.getItems();
		for (int i = 0, containerItemsLength = containerItems.length; i < containerItemsLength; i++) {
			Item item = containerItems[i];
			if (item.getId() != -1 && item.getName() != null && !item.getName().equals("null")) {
				item.setWidgetId(item.calculateWidgetId(INVENTORY.get()));
				item.setSlot(i);

				if (filter.test(item)) {
					items.add(item);
				}
			}
		}

		return items;
	}

	public static List<Item> getAll(boolean theirs) {
		return getAll(theirs, x -> true);
	}

	public static List<Item> getAll(boolean theirs, int... ids) {
		return getAll(theirs, x -> {
			for (int id : ids) {
				if (id == x.getId()) {
					return true;
				}
			}

			return false;
		});
	}

	public static List<Item> getAll(boolean theirs, String... names) {
		return getAll(theirs, x -> {
			if (x.getName() == null) {
				return false;
			}

			for (String name : names) {
				if (name.equals(x.getName())) {
					return true;
				}
			}

			return false;
		});
	}

	public static Item getFirst(boolean theirs, Predicate<Item> filter) {
		return getAll(theirs, filter).stream().findFirst().orElse(null);
	}

	public static Item getFirst(boolean theirs, int... ids) {
		return getFirst(theirs, x -> {
			for (int id : ids) {
				if (id == x.getId()) {
					return true;
				}
			}

			return false;
		});
	}

	public static Item getFirst(boolean theirs, String... names) {
		return getFirst(theirs, x -> {
			if (x.getName() == null) {
				return false;
			}

			for (String name : names) {
				if (name.equals(x.getName())) {
					return true;
				}
			}

			return false;
		});
	}

	public static boolean contains(boolean theirs, Predicate<Item> filter) {
		return getFirst(theirs, filter) != null;
	}

	public static boolean contains(boolean theirs, int... ids) {
		return contains(theirs, x -> {
			for (int id : ids) {
				if (id == x.getId()) {
					return true;
				}
			}

			return false;
		});
	}

	public static boolean contains(boolean theirs, String... names) {
		return contains(theirs, x -> {
			if (x.getName() == null) {
				return false;
			}

			for (String name : names) {
				if (name.equals(x.getName())) {
					return true;
				}
			}

			return false;
		});
	}

	public static String getTradingPlayer() {
		return Vars.getVarcStr(VarClientStr.DUEL_OPPONENT_NAME);
	}
}
