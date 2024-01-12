/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
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
package net.runelite.mixins;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.runelite.api.HashTable;
import net.runelite.api.Node;
import net.runelite.api.Point;
import net.runelite.api.WidgetNode;
import net.runelite.api.events.WidgetHiddenChanged;
import net.runelite.api.events.WidgetPositioned;
import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.FieldHook;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetItem;
import net.runelite.api.widgets.WidgetPositionMode;
import net.runelite.api.widgets.WidgetUtil;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSFont;
import net.runelite.rs.api.RSModel;
import net.runelite.rs.api.RSNPCComposition;
import net.runelite.rs.api.RSWidgetDefinition;
import net.runelite.rs.api.RSNpcOverrides;
import net.runelite.rs.api.RSNode;
import net.runelite.rs.api.RSNodeHashTable;
import net.runelite.rs.api.RSPlayerComposition;
import net.runelite.rs.api.RSSequenceDefinition;
import net.runelite.rs.api.RSWidget;

@Mixin(RSWidget.class)
public abstract class RSWidgetMixin implements RSWidget
{
	private static final int ITEM_SLOT_SIZE = 32;
	private static final int ITEM_EMPTY = 6512;
	@Shadow("client")
	private static RSClient client;
	@Inject
	private static int rl$widgetLastPosChanged;
	@Inject
	private int rl$parentId;
	@Inject
	private int rl$x;
	@Inject
	private int rl$y;
	@Inject
	private short forcedX;
	@Inject
	private short forcedY;

	@Inject
	RSWidgetMixin()
	{
		rl$parentId = -1;
		rl$x = -1;
		rl$y = -1;
		forcedX = -1;
		forcedY = -1;
	}

	@Inject
	@Override
	public void broadcastHidden(boolean hidden)
	{
		WidgetHiddenChanged event = new WidgetHiddenChanged();
		event.setWidget(this);
		event.setHidden(hidden);

		client.getCallbacks().postDeferred(event);

		RSWidget[] children = getChildren();

		if (children != null)
		{
			// recursive through children
			for (RSWidget child : children)
			{
				// if the widget is hidden it will not magically unhide from its parent changing
				if (child == null || child.isSelfHidden())
				{
					continue;
				}

				child.broadcastHidden(hidden);
			}
		}

		// make sure we iterate nested children as well
		// cannot be null
		Widget[] nestedChildren = getNestedChildren();

		for (Widget nestedChild : nestedChildren)
		{
			if (nestedChild == null || nestedChild.isSelfHidden())
			{
				continue;
			}

			((RSWidget) nestedChild).broadcastHidden(hidden);
		}
	}

	@Inject
	@Override
	public void setRenderParentId(int parentId)
	{
		rl$parentId = parentId;
	}

	@Inject
	@Override
	public void setRenderX(int x)
	{
		rl$x = x;
	}

	@Inject
	@Override
	public void setRenderY(int y)
	{
		rl$y = y;
	}

	@Inject
	@Override
	public Widget getParent()
	{
		int id = getParentId();
		return id == -1 ? null : client.getWidget(id);
	}

	@Inject
	@Override
	public int getParentId()
	{
		assert client.isClientThread() : "getParentId must be called on client thread";

		int rsParentId = getRSParentId();
		if (rsParentId != -1)
		{
			return rsParentId;
		}

		final int id = getId();
		if (WidgetUtil.componentToInterface(id) == client.getTopLevelInterfaceId())
		{
			// this is a root widget
			return -1;
		}

		int parentId = rl$parentId;
		if (parentId != -1)
		{
			// if this happens, the widget is or was nested.
			// rl$parentId is updated when drawing, but will not be updated when
			// the widget is no longer reachable in the tree, leaving
			// parent id potentially incorrect

			// check the parent in the component table
			@SuppressWarnings("unchecked") HashTable<WidgetNode> componentTable = client.getComponentTable();
			WidgetNode widgetNode = componentTable.get(parentId);
			if (widgetNode == null || widgetNode.getId() != WidgetUtil.componentToInterface(id))
			{
				// invalidate parent
				rl$parentId = -1;
			}
			else
			{
				return parentId;
			}
		}

		// also the widget may not have been drawn, yet
		int groupId = WidgetUtil.componentToInterface(getId());
		RSNodeHashTable componentTable = client.getComponentTable();
		RSNode[] buckets = componentTable.getBuckets();
		for (RSNode node : buckets)
		{
			// It looks like the first node in the bucket is always
			// a sentinel
			Node cur = node.getNext();
			while (cur != node)
			{
				WidgetNode wn = (WidgetNode) cur;

				if (groupId == wn.getId())
				{
					return (int) wn.getHash();
				}

				cur = cur.getNext();
			}
		}

		return -1;
	}

	@Inject
	@Override
	public String getButtonText()
	{
		return getRSButtonText().replace('\u00A0', ' ');
	}

	@Inject
	@Override
	public String getText()
	{
		return getRSText().replace('\u00A0', ' ');
	}

	@Inject
	@Override
	public String getName()
	{
		return getRSName().replace('\u00A0', ' ');
	}

	@Inject
	@Override
	public Widget setName(String name)
	{
		setRSName(name.replace(' ', '\u00A0'));

		return this;
	}

	@Inject
	@Override
	public boolean isHidden()
	{
		assert client.isClientThread() : "isHidden must be called on client thread";

		if (isSelfHidden())
		{
			return true;
		}

		Widget parent = getParent();

		// If the parent is hidden, this widget is also hidden.
		// Widget has no parent and is not the root widget (which is always visible),
		// so it's not visible.
		return parent == null ? WidgetUtil.componentToInterface(getId()) != client.getTopLevelInterfaceId() : parent.isHidden();
	}

	@Inject
	@Override
	public Point getCanvasLocation()
	{
		return new Point(rl$x, rl$y);
	}

	@Inject
	@Override
	public Rectangle getBounds()
	{
		Point canvasLocation = getCanvasLocation();
		return new Rectangle(canvasLocation.getX(), canvasLocation.getY(), getWidth(), getHeight());
	}

	@Inject
	@FieldHook("cycle")
	public void onCycle(int cycle)
	{
		Widget[] children = getDynamicChildren();
		int[] itemIds = new int[children.length];
		for (int i = 0; i < children.length; i++)
		{
			Widget child = children[i];
			int itemId = child.getItemId();
			if (itemId != -1)
			{
				itemIds[i] = itemId;
			}
		}

		if (itemIds == null)
		{
			return;
		}

		setItemIds(itemIds);
	}

	@Inject
	@Override
	public List<WidgetItem> getWidgetItems()
	{
		int[] itemIds = getItemIds();

		if (itemIds == null)
		{
			return null;
		}

		List<WidgetItem> items = new ArrayList<WidgetItem>(itemIds.length);

		for (int i = 0; i < itemIds.length; ++i)
		{
			if (itemIds[i] <= 0 || itemIds[i] == ITEM_EMPTY)
			{
				continue;
			}

			WidgetItem item = getWidgetItem(i);

			if (item != null)
			{
				items.add(item);
			}
		}

		return items;
	}

	@Inject
	@Override
	public WidgetItem getWidgetItem(int index)
	{
		Widget child = getDynamicChildren()[index];
		boolean isDragged = child.isWidgetItemDragged(index);
		int dragOffsetX = 0;
		int dragOffsetY = 0;

		if (isDragged)
		{
			Point p = child.getWidgetItemDragOffsets();
			dragOffsetX = p.getX();
			dragOffsetY = p.getY();
		}

		// set bounds to same size as default inventory
		Rectangle bounds = child.getBounds();
		bounds.setBounds(bounds.x - 1, bounds.y - 1, ITEM_SLOT_SIZE, ITEM_SLOT_SIZE);
		Rectangle dragBounds = child.getBounds();
		dragBounds.setBounds(bounds.x + dragOffsetX, bounds.y + dragOffsetY, ITEM_SLOT_SIZE, ITEM_SLOT_SIZE);
		return new WidgetItem(child.getItemId(), child.getItemQuantity(), index, bounds, child, dragBounds);
	}

	@Inject
	@Override
	public Widget getChild(int index)
	{
		RSWidget[] widgets = getChildren();
		return widgets != null && index >= 0 && index < widgets.length ? widgets[index] : null;
	}

	@Inject
	@Override
	public Widget[] getDynamicChildren()
	{
		RSWidget[] children = getChildren();

		if (children == null)
		{
			return new Widget[0];
		}

		List<Widget> widgets = new ArrayList<Widget>();
		for (RSWidget widget : children)
		{
			if (widget != null && widget.getRSParentId() == getId())
			{
				widgets.add(widget);
			}
		}
		return widgets.toArray(new Widget[widgets.size()]);
	}

	@Inject
	@Override
	public Widget[] getStaticChildren()
	{
		if (getRSParentId() == getId())
		{
			// This is a dynamic widget, so it can't have static children
			return new Widget[0];
		}

		List<Widget> widgets = new ArrayList<Widget>();
		RSWidget[] group = client.getGroup(WidgetUtil.componentToInterface(getId()));
		if (group == null)
		{
			return new Widget[0];
		}

		for (RSWidget widget : group)
		{
			if (widget != null && widget.getRSParentId() == getId())
			{
				widgets.add(widget);
			}
		}
		return widgets.toArray(new RSWidget[widgets.size()]);
	}

	@Inject
	@Override
	public Widget[] getNestedChildren()
	{
		assert client.isClientThread() : "getNestedChildren must be called on client thread";

		if (getRSParentId() == getId())
		{
			// This is a dynamic widget, so it can't have nested children
			return new Widget[0];
		}

		@SuppressWarnings("unchecked") HashTable<WidgetNode> componentTable = client.getComponentTable();

		WidgetNode wn = componentTable.get(getId());
		if (wn == null)
		{
			return new RSWidget[0];
		}

		int group = wn.getId();

		List<RSWidget> widgets = new ArrayList<RSWidget>();
		for (RSWidget widget : client.getGroup(group))
		{
			if (widget != null && widget.getRSParentId() == -1)
			{
				widgets.add(widget);
			}
		}
		return widgets.toArray(new RSWidget[widgets.size()]);
	}

	@Inject
	@Override
	public boolean contains(Point point)
	{
		Rectangle bounds = getBounds();
		return bounds != null && bounds.contains(new java.awt.Point(point.getX(), point.getY()));
	}

	@Inject
	@Override
	public Widget setPos(int x, int y)
	{
		setOriginalX(x);
		setOriginalY(y);

		return this;
	}

	@Inject
	@Override
	public Widget setPos(int x, int y, int xMode, int yMode)
	{
		setOriginalX(x);
		setOriginalY(y);
		setXPositionMode(xMode);
		setYPositionMode(yMode);

		return this;
	}

	@Inject
	@Override
	public Widget setSize(int width, int height)
	{
		setOriginalWidth(width);
		setOriginalHeight(height);

		return this;
	}

	@Inject
	@Override
	public Widget setSize(int width, int height, int widthMode, int heightMode)
	{
		setOriginalWidth(width);
		setOriginalHeight(height);
		setWidthMode(widthMode);
		setHeightMode(heightMode);

		return this;
	}

	@FieldHook("y")
	@Inject
	public void onPositionChanged(int idx)
	{
		int id = getId();
		if (id == -1)
		{
			return;
		}

		int tick = client.getGameCycle();
		if (tick == rl$widgetLastPosChanged)
		{
			return;
		}

		rl$widgetLastPosChanged = tick;

		client.getLogger().trace("Posting widget position changed");

		client.getCallbacks().postDeferred(new WidgetPositioned());
	}

	@Inject
	@Override
	public Widget createStaticChild(int type)
	{
		assert client.isClientThread() : "createStaticChild must be called on client thread";

		int id = this.getId();
		int groupId = id >> 16;
		RSWidget[] widgets = client.getWidgetDefinition().getWidgets()[groupId];
		widgets = Arrays.copyOf(widgets, widgets.length + 1);
		int packedId = groupId << 16 | widgets.length - 1;
		RSWidget widget = client.createWidget();
		widget.setIsIf3(true);
		widget.setType(type);
		widget.setParentId(id);
		widget.setId(packedId);
		widgets[widgets.length - 1] = widget;
		client.getWidgetDefinition().getWidgets()[groupId] = widgets;
		return widget;
	}

	@Inject
	@Override
	public Widget createChild(int index, int type)
	{
		assert client.isClientThread() : "createChild must be called on client thread";

		RSWidget w = client.createWidget();
		w.setIsIf3(true);
		w.setType(type);
		w.setParentId(getId());
		w.setId(getId());

		RSWidget[] siblings = getChildren();

		if (index < 0)
		{
			if (siblings == null)
			{
				index = 0;
			}
			else
			{
				index = 0;
				for (int i = siblings.length - 1; i >= 0; i--)
				{
					if (siblings[i] != null)
					{
						index = i + 1;
						break;
					}
				}
			}
		}

		if (siblings == null)
		{
			siblings = new RSWidget[index + 1];
			setChildren(siblings);
		}
		else if (siblings.length <= index)
		{
			RSWidget[] newSiblings = new RSWidget[index + 1];
			System.arraycopy(siblings, 0, newSiblings, 0, siblings.length);
			siblings = newSiblings;
			setChildren(siblings);
		}

		siblings[index] = w;
		w.setIndex(index);

		return w;
	}

	@Inject
	@Override
	public void revalidate()
	{
		assert client.isClientThread() : "revalidate must be called on client thread";

		client.revalidateWidget(this);
	}

	@Inject
	@Override
	public void revalidateScroll()
	{
		assert client.isClientThread() : "revalidateScroll must be called on client thread";

		client.revalidateWidget(this);
		client.revalidateWidgetScroll(client.getWidgetDefinition().getWidgets()[WidgetUtil.componentToInterface(this.getId())], this, false);
	}

	@Inject
	@Override
	public void deleteAllChildren()
	{
		if (getChildren() != null)
		{
			Arrays.fill(getChildren(), null);
		}
	}

	@Copy("getModel")
	@Replace("getModel")
	@SuppressWarnings("InfiniteRecursion")
	public RSModel copy$getModel(RSWidgetDefinition widgetDefinition, RSSequenceDefinition sequence, int frame, boolean alternate, RSPlayerComposition playerComposition, RSNPCComposition npcComposition, RSNpcOverrides npcOverrides)
	{
		if (frame != -1 && client.isInterpolateWidgetAnimations())
		{
			frame = frame | getModelFrameCycle() << 16 | Integer.MIN_VALUE;
		}
		return copy$getModel(widgetDefinition, sequence, frame, alternate, playerComposition, npcComposition, npcOverrides);
	}

	@Inject
	@Override
	public boolean isWidgetItemDragged(int index)
	{
		return client.getDraggedWidget() == this && client.getDragTime() >= 5 &&
			client.getDraggedWidget().getIndex() == index;
	}

	@Inject
	public Point getWidgetItemDragOffsets()
	{
		int dragOffsetX = client.getMouseX() - client.getWidgetClickX();
		int dragOffsetY = client.getMouseY() - client.getWidgetClickY();

		if (dragOffsetX < 5 && dragOffsetX > -5)
		{
			dragOffsetX = 0;
		}

		if (dragOffsetY < 5 && dragOffsetY > -5)
		{
			dragOffsetY = 0;
		}

		return new Point(dragOffsetX, dragOffsetY);
	}

	@Inject
	public void setForcedX()
	{
		if (this.forcedX > -1)
		{
			this.setRelativeX(this.forcedX);
		}
	}

	@Inject
	public void setForcedY()
	{
		if (this.forcedY > -1)
		{
			this.setRelativeY(this.forcedY);
		}
	}

	@Inject
	@Override
	public void setForcedPosition(int x, int y)
	{
		this.forcedX = (short) x;
		this.forcedY = (short) y;
		this.setRelativeX(x);
		this.setRelativeY(y);
	}

	@Copy("alignWidgetPosition")
	@Replace("alignWidgetPosition")
	public static void alignWidgetPosition(Widget widget, int x, int y)
	{
		if (widget.getXPositionMode() == WidgetPositionMode.ABSOLUTE_LEFT)
		{
			widget.setRelativeX(widget.getOriginalX());
			widget.setForcedX();
		}
		else if (widget.getXPositionMode() == WidgetPositionMode.ABSOLUTE_CENTER)
		{
			widget.setRelativeX(widget.getOriginalX() + (x - widget.getWidth()) / 2);
			widget.setForcedX();
		}
		else if (widget.getXPositionMode() == WidgetPositionMode.ABSOLUTE_RIGHT)
		{
			widget.setRelativeX(x - widget.getWidth() - widget.getOriginalX());
			widget.setForcedX();
		}
		else if (widget.getXPositionMode() == WidgetPositionMode.LEFT_16384THS)
		{
			widget.setRelativeX(widget.getOriginalX() * x >> 14);
			widget.setForcedX();
		}
		else if (widget.getXPositionMode() == WidgetPositionMode.CENTER_16384THS)
		{
			widget.setRelativeX((widget.getOriginalX() * x >> 14) + (x - widget.getWidth()) / 2);
			widget.setForcedX();
		}
		else
		{
			widget.setRelativeX(x - widget.getWidth() - (widget.getOriginalX() * x >> 14));
			widget.setForcedX();
		}

		if (widget.getYPositionMode() == WidgetPositionMode.ABSOLUTE_TOP)
		{
			widget.setRelativeY(widget.getOriginalY());
			widget.setForcedY();
		}
		else if (widget.getYPositionMode() == WidgetPositionMode.ABSOLUTE_CENTER)
		{
			widget.setRelativeY((y - widget.getHeight()) / 2 + widget.getOriginalY());
			widget.setForcedY();
		}
		else if (widget.getYPositionMode() == WidgetPositionMode.ABSOLUTE_BOTTOM)
		{
			widget.setRelativeY(y - widget.getHeight() - widget.getOriginalY());
			widget.setForcedY();
		}
		else if (widget.getYPositionMode() == WidgetPositionMode.TOP_16384THS)
		{
			widget.setRelativeY(y * widget.getOriginalY() >> 14);
			widget.setForcedY();
		}
		else if (widget.getYPositionMode() == WidgetPositionMode.CENTER_16384THS)
		{
			widget.setRelativeY((y - widget.getHeight()) / 2 + (y * widget.getOriginalY() >> 14));
			widget.setForcedY();
		}
		else
		{
			widget.setRelativeY(y - widget.getHeight() - (y * widget.getOriginalY() >> 14));
			widget.setForcedY();
		}
	}

	@Inject
	@Override
	public RSFont getFont()
	{
		return getRSFont(client.getWidgetDefinition());
	}
}
