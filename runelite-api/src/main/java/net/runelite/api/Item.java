/*
 * Copyright (c) 2019, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.api;

import lombok.Data;
import net.runelite.api.util.Text;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetID;
import net.runelite.api.widgets.WidgetInfo;
import net.unethicalite.api.EntityNameable;
import net.unethicalite.api.Identifiable;
import net.unethicalite.api.Interactable;
import net.unethicalite.api.events.MenuAutomated;
import net.unethicalite.api.util.Randomizer;

import java.awt.Rectangle;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

@Data
public class Item implements Interactable, Identifiable, EntityNameable
{
	private static final ThreadLocalRandom random = ThreadLocalRandom.current();
	private static final int BASE_ACTION_PARAM = 451;
	private static final int MAX_CUSTOM_ACTIONS = 8;

	private final int id;
	private final int quantity;

	private Client client;
	private int slot;

	// Interaction
	private int widgetId;

	@Override
	public String getName()
	{
		String name = getComposition().getName();
		if (name == null)
		{
			return "null";
		}

		return Text.removeTags(Text.sanitize(name));
	}

	public void drop()
	{
		interact("Drop");
	}

	public void useOn(Interactable entity)
	{
		if (entity instanceof TileItem)
		{
			useOn((TileItem) entity);
			return;
		}

		if (entity instanceof TileObject)
		{
			useOn((TileObject) entity);
			return;
		}

		if (entity instanceof Item)
		{
			useOn((Item) entity);
			return;
		}

		if (entity instanceof Actor)
		{
			useOn((Actor) entity);
			return;
		}

		if (entity instanceof Widget)
		{
			useOn((Widget) entity);
		}
	}

	public void use()
	{
		client.setSelectedSpellWidget(widgetId);
		client.setSelectedSpellChildIndex(slot);
		client.setSelectedSpellItemId(id);
		client.setSpellSelected(true);

		Widget selectedWidget = client.getSelectedWidget();
		if (selectedWidget != null && selectedWidget.isIf3())
		{
			client.setSelectedSpellActionName("Use");
			client.setSelectedSpellName(selectedWidget.getName() + "<col=" + Integer.toHexString(16777215) + ">");
		}
	}

	public void useOn(TileItem object)
	{
		use();
		object.interact(0, MenuAction.WIDGET_TARGET_ON_GROUND_ITEM.getId());
	}

	public void useOn(TileObject object)
	{
		use();
		object.interact(0, MenuAction.WIDGET_TARGET_ON_GAME_OBJECT.getId());
	}

	public void useOn(Item item)
	{
		use();
		item.interact(0, MenuAction.WIDGET_TARGET_ON_WIDGET.getId());
	}

	public void useOn(Actor actor)
	{
		MenuAction menuAction = actor instanceof NPC ? MenuAction.WIDGET_TARGET_ON_NPC : MenuAction.WIDGET_TARGET_ON_PLAYER;
		use();
		actor.interact(0, menuAction.getId());
	}

	public void useOn(Widget widget)
	{
		use();
		widget.interact(0, MenuAction.WIDGET_TARGET_ON_WIDGET.getId());
	}

	public Type getType()
	{
		return Type.get(widgetId);
	}

	public int calculateWidgetId(WidgetInfo containerInfo)
	{
		return calculateWidgetId(client.getWidget(containerInfo));
	}

	public int calculateWidgetId(Widget containerWidget)
	{
		if (containerWidget == null)
		{
			return -1;
		}

		Widget[] children = containerWidget.getChildren();
		if (children == null)
		{
			return -1;
		}

		return Arrays.stream(children)
			.filter(x -> x.getItemId() == getId()).findFirst()
			.map(Widget::getId)
			.orElse(-1);
	}

	public ItemComposition getComposition()
	{
		return client.getItemComposition(getId());
	}

	public boolean isTradable()
	{
		return getComposition().isTradeable();
	}

	public boolean isStackable()
	{
		return getComposition().isStackable();
	}

	public boolean isMembers()
	{
		return getComposition().isMembers();
	}

	public int getNotedId()
	{
		return getComposition().getLinkedNoteId();
	}

	public boolean isNoted()
	{
		return getComposition().getNote() > -1;
	}

	public boolean isPlaceholder()
	{
		return getComposition().getPlaceholderTemplateId() > -1;
	}

	public int getStorePrice()
	{
		return getComposition().getPrice();
	}

	@Override
	public Point getClickPoint()
	{
		return Randomizer.getRandomPointIn(getBounds());
	}

	@Override
	public String[] getActions()
	{
		if (getType() == Type.EQUIPMENT)
		{
			ItemComposition composition = getComposition();

			if (composition == null)
			{
				return null;
			}

			String[] actions = new String[8];
			actions[0] = "Remove";

			int index = 1;
			for (int param = BASE_ACTION_PARAM; param < (BASE_ACTION_PARAM + MAX_CUSTOM_ACTIONS) - 1; param++)
			{
				actions[index++] = composition.getStringValue(param);
			}
			return actions;
		}

		Widget widget = client.getWidget(widgetId);
		if (widget != null)
		{
			Widget itemChild = widget.getChild(slot);
			if (itemChild != null)
			{
				return itemChild.getActions();
			}

			return widget.getActions();
		}

		return null;
	}

	@Override
	public int getActionOpcode(int action)
	{
		if (action == 0)
		{
			if (getActions()[0] == null)
			{
				return MenuAction.WIDGET_TARGET.getId();
			}
		}

		return action >= 4 ? MenuAction.CC_OP_LOW_PRIORITY.getId()
			: MenuAction.CC_OP.getId();
	}

	@Override
	public void interact(int index)
	{
		client.interact(getMenu(index));
	}

	@Override
	public void interact(int index, int opcode)
	{
		client.interact(getMenu(index, opcode));
	}

	@Override
	public void interact(int identifier, int opcode, int param0, int param1)
	{
		client.interact(getMenu(identifier, opcode, param0, param1));
	}

	@Override
	public MenuAutomated getMenu(int actionIndex)
	{
		switch (getType())
		{
			case TRADE:
			case TRADE_INVENTORY:
				Widget widget = client.getWidget(widgetId);
				if (widget != null)
				{
					Widget itemChild = widget.getChild(slot);
					if (itemChild != null)
					{
						return itemChild.getMenu(actionIndex);
					}
				}

				break;
			case EQUIPMENT:
			case INVENTORY:
			case BANK:
			case BANK_INVENTORY:
				return getMenu(actionIndex, actionIndex > 4 ? MenuAction.CC_OP_LOW_PRIORITY.getId()
					: MenuAction.CC_OP.getId());
			case UNKNOWN:
				client.getLogger().error("Couldn't determine item type for: {}, widgetid: {}", id, widgetId);
				break;
		}

		return null;
	}

	@Override
	public MenuAutomated getMenu(int actionIndex, int opcode)
	{
		switch (getType())
		{
			case TRADE:
			case TRADE_INVENTORY:
				Widget itemWidget = client.getWidget(widgetId);
				if (itemWidget == null)
				{
					return null;
				}

				return itemWidget.getMenu(actionIndex, opcode);
			case EQUIPMENT:
				return getMenu(actionIndex + 1, opcode, -1, widgetId, id);
			case INVENTORY:
				return getMenu(actionIndex == 0 ? 0 : actionIndex + 1, opcode, getSlot(), widgetId, id);
			case BANK:
				return getMenu(actionIndex, opcode, getSlot(), WidgetInfo.BANK_ITEM_CONTAINER.getPackedId(), id);
			case BANK_INVENTORY:
				return getMenu(actionIndex + 1, opcode, getSlot(), WidgetInfo.BANK_INVENTORY_ITEMS_CONTAINER.getPackedId(), id);
			case UNKNOWN:
				client.getLogger().error("Couldn't determine item type for: {}, widgetid: {}, itemid: {}", id, widgetId, id);
				break;
		}

		return null;
	}

	private Rectangle getBounds()
	{
		Widget widget = client.getWidget(getWidgetId());
		if (widget == null)
		{
			return new Rectangle(-1, -1, 0, 0);
		}

		if (getType() != Item.Type.EQUIPMENT)
		{
			Widget slot = widget.getChild(getSlot());
			if (slot != null)
			{
				return slot.getBounds() != null ? slot.getBounds() : new Rectangle(-1, -1, 0, 0);
			}
		}

		Rectangle bounds = widget.getBounds();
		if (bounds == null)
		{
			Rectangle itemBounds = widget.getWidgetItem(getSlot()).getCanvasBounds();
			return itemBounds != null ? itemBounds : new Rectangle(-1, -1, 0, 0);
		}

		return bounds;
	}

	public enum Type
	{
		INVENTORY(InventoryID.INVENTORY),
		EQUIPMENT(InventoryID.EQUIPMENT),
		BANK(InventoryID.BANK),
		BANK_INVENTORY(InventoryID.INVENTORY),
		TRADE(InventoryID.TRADE),
		TRADE_INVENTORY(InventoryID.INVENTORY),
		UNKNOWN(null);

		private final InventoryID inventoryID;

		Type(InventoryID inventoryID)
		{
			this.inventoryID = inventoryID;
		}

		private static Type get(int widgetId)
		{
			switch (WidgetInfo.TO_GROUP(widgetId))
			{
				case WidgetID.PLAYER_TRADE_SCREEN_GROUP_ID:
					return TRADE;
				case WidgetID.PLAYER_TRADE_INVENTORY_GROUP_ID:
					return TRADE_INVENTORY;
				case WidgetID.EQUIPMENT_GROUP_ID:
					return EQUIPMENT;
				case WidgetID.BANK_GROUP_ID:
					return BANK;
				case WidgetID.BANK_INVENTORY_GROUP_ID:
					return BANK_INVENTORY;
				case WidgetID.INVENTORY_GROUP_ID:
					return INVENTORY;
				default:
					return UNKNOWN;
			}
		}

		public InventoryID getInventoryID()
		{
			return inventoryID;
		}
	}
}
