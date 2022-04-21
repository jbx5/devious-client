/*
 * Copyright (c) 2017, Robin <robin.weymans@gmail.com>
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
package net.runelite.api.events;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.api.widgets.Widget;

/**
 * An event where a menu option has been clicked.
 * <p>
 * This event does not only trigger when clicking an option in a
 * right-clicked menu. The event will trigger for any left click
 * action performed (ie. clicking an item, walking to a tile, etc) as
 * well as any right-click menu option.
 * <p>
 * By default, when there is no action performed when left-clicking,
 * it seems that this event still triggers with the "Cancel" action.
 */
@Setter
@Getter
@NoArgsConstructor
public class MenuOptionClicked
{
	private String menuOption;
	private String menuTarget;
	private int id;
	private MenuAction menuAction;
	private int param0;
	private int param1;
	private int selectedItemIndex;

	private int clickX;
	private int clickY;
	/**
	 * Whether or not the event has been consumed by a subscriber.
	 */
	@Getter
	@Setter
	private boolean consumed;
	private int canvasX;
	private int canvasY;
	public MenuOptionClicked(MenuEntry entry)
	{
		this.menuOption = entry.getOption();
		this.menuTarget = entry.getTarget();
		this.id = entry.getIdentifier();
		this.menuAction = entry.getType();
		this.param0 = entry.getParam0();
		this.param1 = entry.getParam1();
	}

	public boolean isItemOp()
	{
		MenuAction var1 = this.getMenuAction();
		if (var1 == MenuAction.CC_OP || var1 == MenuAction.CC_OP_LOW_PRIORITY)
		{
			int var2 = this.getId();
			int var3 = this.getParam1();
			if (var3 == 9764864)
			{
				switch (var2)
				{
					case 2:
					case 3:
					case 4:
					case 6:
					case 7:
						return true;
					case 5:
				}
			}
		}

		return false;
	}

	public int getItemOp()
	{
		MenuAction var1 = this.getMenuAction();
		if (var1 == MenuAction.CC_OP || var1 == MenuAction.CC_OP_LOW_PRIORITY)
		{
			int var2 = this.getId();
			int var3 = this.getParam1();
			if (var3 == 9764864)
			{
				switch (var2)
				{
					case 2:
						return 1;
					case 3:
						return 2;
					case 4:
						return 3;
					case 5:
					default:
						break;
					case 6:
						return 4;
					case 7:
						return 5;
				}
			}
		}

		return -1;
	}

	public int getItemId()
	{
		return -1;
	}

	public Widget getWidget()
	{
		return null;
	}

	public int getCanvasX()
	{
		return canvasX;
	}

	public int getCanvasY()
	{
		return canvasY;
	}

	/**
	 * Marks the event as having been consumed.
	 * <p>
	 * Setting this state indicates that a plugin has processed the menu
	 * option being clicked and that the event will not be passed on
	 * for handling by vanilla client code.
	 */
	public void consume()
	{
		this.consumed = true;
	}

	public void setMenuEntry(MenuEntry entry)
	{
		this.setMenuOption(entry.getOption());
		this.setMenuTarget(entry.getTarget());
		this.setId(entry.getIdentifier());
		this.setMenuAction(entry.getType());
		this.setParam0(entry.getParam0());
		this.setParam1(entry.getParam1());
	}

	@Deprecated
	public int getActionParam()
	{
		return getParam0();
	}

	@Deprecated
	public void setActionParam(int i)
	{
		setParam0(i);
	}

	@Deprecated
	public int getWidgetId()
	{
		return getParam1();
	}

	@Deprecated
	public void setWidgetId(int i)
	{
		setParam1(i);
	}

	public boolean isAutomated()
	{
		return "Automated".equals(getMenuOption());
	}
}
