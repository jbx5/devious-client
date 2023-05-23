package net.unethicalite.api.items;

import net.runelite.api.GrandExchangeOffer;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.VarClientInt;
import net.runelite.api.VarPlayer;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetID;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.commons.Predicates;
import net.unethicalite.api.commons.Time;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.GameThread;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class GrandExchange
{
	private static final int F2P_SLOTS = 3;
	private static final int P2P_SLOTS = 8;
	private static final int PRICE_VARBIT = 4398;
	private static final int QUANTITY_VARBIT = 4396;
	private static final Supplier<Widget> COLLECT_BUTTON = () -> Widgets.get(WidgetID.GRAND_EXCHANGE_GROUP_ID, 6, 0);
	private static final Supplier<Widget> CONFIRM_BUTTON = () -> Widgets.get(WidgetID.GRAND_EXCHANGE_GROUP_ID, 29);
	private static final Supplier<Widget> OFFER_PRICE = () -> Widgets.get(WidgetID.GRAND_EXCHANGE_GROUP_ID, 27);
	private static final Supplier<Widget> EXIT = () -> Widgets.get(WidgetID.GRAND_EXCHANGE_GROUP_ID, 2, 11);

	public static View getView()
	{
		Widget setupWindow = Widgets.get(WidgetInfo.GRAND_EXCHANGE_OFFER_CONTAINER);
		if (Widgets.isVisible(setupWindow))
		{
			String text = setupWindow.getChild(18).getText();
			if (text == null || text.isEmpty())
			{
				return View.UNKNOWN;
			}

			if (text.equals("Sell offer"))
			{
				return View.SELLING;
			}

			if (text.equals("Buy offer"))
			{
				return View.BUYING;
			}

			// Widgets broke
			return View.UNKNOWN;
		}

		Widget geWindow = Widgets.get(WidgetInfo.GRAND_EXCHANGE_WINDOW_CONTAINER);
		if (Widgets.isVisible(geWindow))
		{
			return View.OFFERS;
		}

		return View.CLOSED;
	}

	public static boolean isOpen()
	{
		return getView() != View.CLOSED && getView() != View.UNKNOWN;
	}

	public static boolean isSetupOpen()
	{
		return getView() == View.BUYING || getView() == View.SELLING;
	}

	public static void openBank()
	{
		TileObject bank = TileObjects.getFirstSurrounding(3163, 3490, 0, 5, x -> x.getName() != null
				&& x.getName().toLowerCase().contains("exchange booth") && x.hasAction("Bank"));
		if (bank != null)
		{
			bank.interact("Bank");
		}
	}

	public static boolean isSelling()
	{
		return getView() == View.SELLING;
	}

	public static boolean isBuying()
	{
		return getView() == View.BUYING;
	}

	public static int getItemId()
	{
		return Vars.getVarp(VarPlayer.CURRENT_GE_ITEM.getId());
	}

	public static void setItem(int id)
	{
		GameThread.invoke(() -> Static.getClient().runScript(754, id, 84));
	}

	public static int getPrice()
	{
		return Vars.getBit(PRICE_VARBIT);
	}

	public static void setPrice(int price)
	{
		Widget enterPriceButton = Widgets.get(WidgetInfo.GRAND_EXCHANGE_OFFER_CONTAINER);
		if (enterPriceButton != null && enterPriceButton.getChild(12) != null)
		{
			enterPriceButton.getChild(12).interact("Enter price");
			Dialog.enterAmount(price);
		}
	}

	public static int getQuantity()
	{
		return Vars.getBit(QUANTITY_VARBIT);
	}

	public static void setQuantity(int quantity)
	{
		Widget enterPriceButton = Widgets.get(WidgetInfo.GRAND_EXCHANGE_OFFER_CONTAINER);
		if (enterPriceButton != null && enterPriceButton.getChild(7) != null)
		{
			enterPriceButton.getChild(7).interact("Enter quantity");
			Dialog.enterAmount(quantity);
		}
	}

	public static int getGuidePrice()
	{
		Widget priceWidget = OFFER_PRICE.get();
		if (priceWidget != null)
		{
			return Integer.parseInt(priceWidget.getText().replaceAll("[^0-9]", ""));
		}

		return -1;
	}

	public static void open()
	{
		TileObject booth = TileObjects.getFirstSurrounding(3163, 3490, 0, 5, x -> x.hasAction("Exchange"));
		if (booth != null)
		{
			booth.interact("Exchange");
		}
	}

	public static void close()
	{
		Widget exitButton = EXIT.get();
		if (!Widgets.isVisible(exitButton))
		{
			return;
		}

		exitButton.interact("Close");
	}

	public static void sell(Predicate<Item> filter)
	{
		Item item = Inventory.getFirst(filter);
		if (item != null)
		{
			Static.getClient().interact(1, 57, item.getSlot(), 30605312);
		}
	}

	public static void sell(int... ids)
	{
		sell(x -> Arrays.stream(ids).anyMatch(y -> y == x.getId() || y == x.getNotedId()));
	}

	public static void sell(String... names)
	{
		sell(Predicates.names(names));
	}

	public static void createBuyOffer()
	{
		List<Widget> geRoot = Widgets.get(465);

		if (isFull())
		{
			return;
		}

		if (geRoot == null)
		{
			return;
		}

		for (int i = 7; i < 15; i++)
		{
			Widget box = geRoot.get(i);
			if (box == null)
			{
				continue;
			}

			Widget buyButton = box.getChild(3);
			if (!Widgets.isVisible(buyButton))
			{
				continue;
			}

			buyButton.interact(0);
			return;
		}
	}

	public static void abortOffer(int itemId)
	{
		List<Widget> geRoot = Widgets.get(465);

		if (isEmpty())
		{
			return;
		}

		if (geRoot == null)
		{
			return;
		}

		for (int i = 7; i < 15; i++)
		{
			Widget box = geRoot.get(i);
			if (box == null)
			{
				continue;
			}

			Widget abortBox = box.getChild(2);
			if (abortBox == null || !abortBox.hasAction("Abort offer") || !abortBox.isVisible())
			{
				continue;
			}

			Widget itemIdBox = box.getChild(18);
			if (itemIdBox == null || !itemIdBox.isVisible())
			{
				continue;
			}

			if (itemIdBox.getItemId() == itemId)
			{
				abortBox.interact("Abort offer");
				return;
			}
		}
	}

	public static boolean isFull()
	{
		return getEmptySlots() == 0;
	}

	public static boolean isEmpty()
	{
		return getOffers().size() == 0;
	}

	public static int getEmptySlots()
	{
		return Game.getMembershipDays() <= 0 ? F2P_SLOTS - getOffers().size() : P2P_SLOTS - getOffers().size();
	}

	public static List<GrandExchangeOffer> getOffers()
	{
		List<GrandExchangeOffer> out = new ArrayList<>();
		GrandExchangeOffer[] offers = Static.getClient().getGrandExchangeOffers();
		if (offers != null)
		{
			for (GrandExchangeOffer offer : offers)
			{
				if (offer.getItemId() > 0)
				{
					out.add(offer);
				}
			}
		}

		return out;
	}

	public static boolean canCollect()
	{
		return Widgets.isVisible(COLLECT_BUTTON.get());
	}

	public static void collect()
	{
		collect(false);
	}

	public static void collect(boolean toBank)
	{
		Widget collect = COLLECT_BUTTON.get();
		if (Widgets.isVisible(collect))
		{
			collect.interact(toBank ? "Collect to bank" : "Collect to inventory");
		}
	}

	public static void confirm()
	{
		Widget confirm = CONFIRM_BUTTON.get();
		if (Widgets.isVisible(confirm))
		{
			confirm.interact("Confirm");
		}
	}

	public static boolean isSearchingItem()
	{
		return Vars.getVarcInt(VarClientInt.INPUT_TYPE) == 14;
	}

	public static void openItemSearch()
	{
		Static.getClient().interact(1, 57, 0, 30474264);
	}

	public static boolean sell(int itemId, int quantity, int price)
	{
		return exchange(false, itemId, quantity, price, true, false);
	}

	public static boolean sell(int itemId, int quantity, int price, boolean collect, boolean toBank)
	{
		return exchange(false, itemId, quantity, price, collect, toBank);
	}

	public static boolean buy(int itemId, int quantity, int price)
	{
		return exchange(true, itemId, quantity, price, true, false);
	}

	public static boolean buy(int itemId, int quantity, int price, boolean collect, boolean toBank)
	{
		return exchange(true, itemId, quantity, price, collect, toBank);
	}

	public static boolean exchange(boolean buy, int itemId, int quantity, int price)
	{
		return exchange(buy, itemId, quantity, price, true, false);
	}

	public static boolean exchange(boolean buy, int itemId, int quantity, int price, boolean collect, boolean toBank)
	{
		if (!isOpen())
		{
			open();
			return false;
		}

		if (collect && canCollect())
		{
			collect(toBank);
			return false;
		}

		if (buy)
		{
			if (!isBuying())
			{
				createBuyOffer();
				return false;
			}
		}
		else
		{
			if (!isSelling())
			{
				sell(itemId);
				return false;
			}
		}

		int notedId = Static.getClient().isItemDefinitionCached(itemId) ?
			Static.getClient().getItemComposition(itemId).getLinkedNoteId() :
			GameThread.invokeLater(() -> Static.getClient().getItemComposition(itemId).getLinkedNoteId());

		if (getItemId() == -1 || (getItemId() != itemId && getItemId() != notedId))
		{
			if (buy)
			{
				if (!isSearchingItem())
				{
					openItemSearch();
				}

				setItem(itemId);
			}
			else
			{
				sell(itemId);
			}

			return false;
		}

		if (getPrice() != price)
		{
			setPrice(price);
		}

		if (getQuantity() != quantity)
		{
			setQuantity(quantity);
		}

		Time.sleepUntil(() -> getPrice() == price && getQuantity() == quantity, 3000);

		if (getPrice() == price && getQuantity() == quantity)
		{
			confirm();
			return true;
		}

		return false;
	}

	public enum View
	{
		CLOSED, OFFERS, BUYING, SELLING, UNKNOWN
	}
}
