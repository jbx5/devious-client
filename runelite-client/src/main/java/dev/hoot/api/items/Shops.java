package dev.hoot.api.items;

import dev.hoot.api.game.GameThread;
import dev.hoot.api.widgets.Widgets;
import net.runelite.api.widgets.Widget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Shops {
	private static final Supplier<Widget> SHOP = () -> Widgets.get(300, 0);
	private static final Supplier<Widget> SHOP_ITEMS = () -> Widgets.get(300, 16);
	private static final Supplier<Widget> INVENTORY = () -> Widgets.get(301, 0);

	public static boolean isOpen() {
		Widget widget = SHOP.get();
		return widget != null && !GameThread.invokeLater(widget::isHidden);
	}

	public static int getStock(int itemId) {
		Widget items = SHOP_ITEMS.get();
		if (items == null || GameThread.invokeLater(items::isHidden)) {
			return 0;
		}

		Widget[] children = items.getChildren();
		if (children == null) {
			return 0;
		}

		return Arrays.stream(children)
						.filter(child -> child.getItemId() == itemId)
						.mapToInt(Widget::getItemQuantity)
						.sum();
	}

	public static void buyOne(int itemId) {
		buy(itemId, 1);
	}

	public static void buyFive(int itemId) {
		buy(itemId, 5);
	}

	public static void buyTen(int itemId) {
		buy(itemId, 10);
	}

	public static void buyFifty(int itemId) {
		buy(itemId, 50);
	}

	public static void sellOne(int itemId) {
		sell(itemId, 1);
	}

	public static void sellFive(int itemId) {
		sell(itemId, 5);
	}

	public static void sellTen(int itemId) {
		sell(itemId, 10);
	}

	public static void sellFifty(int itemId) {
		sell(itemId, 50);
	}

	public static List<Integer> getItems() {
		List<Integer> out = new ArrayList<>();
		Widget container = SHOP_ITEMS.get();
		if (container == null) {
			return out;
		}

		Widget[] items = container.getChildren();
		if (items == null) {
			return out;
		}

		for (Widget item : items) {
			if (item.getId() != -1) {
				out.add(item.getId());
			}
		}

		return out;
	}

	private static void buy(int itemId, int amount) {
		Widget container = SHOP_ITEMS.get();
		exchange(itemId, amount, container);
	}

	private static void sell(int itemId, int amount) {
		Widget container = INVENTORY.get();
		exchange(itemId, amount, container);
	}

	private static void exchange(int itemId, int amount, Widget container) {
		if (container == null) {
			return;
		}

		Widget[] items = container.getChildren();
		if (items == null) {
			return;
		}

		for (Widget item : items) {
			if (item.getItemId() == itemId) {
				String action = item.getActions().stream()
								.filter(x -> x != null && x.contains(String.valueOf(amount)))
								.findFirst()
								.orElse(null);
				if (action == null) {
					return;
				}

				item.interact(action);
				return;
			}
		}
	}
}
