/*
 * Copyright (c) 2019, Ron Young <https://github.com/raiyni>
 * All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *     list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *     this list of conditions and the following disclaimer in the documentation
 *     and/or other materials provided with the distribution.
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

import java.util.Arrays;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.api.events.MenuEntryAdded;
import net.runelite.api.mixins.FieldHook;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.MethodHook;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSMenu;
import net.runelite.rs.api.RSRuneLiteMenuEntry;

@Mixin(RSMenu.class)
public abstract class MenuMixin implements RSMenu
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	private RSRuneLiteMenuEntry[] rl$menuEntries;

	@Inject
	private int rl$menuEntriesSize;

	@MethodHook(value = "<init>", end = true)
	@Inject
	public void init(boolean var1)
	{
		int var2 = var1 ? 500 : 64;
		rl$menuEntriesSize = var2;
		rl$menuEntries = new RSRuneLiteMenuEntry[var2];
	}

	@Inject
	private int tmpMenuOptionsCount;

	@Inject
	@Override
	public MenuEntry createMenuEntry(String option, String target, int identifier, int opcode, int param1, int param2, int itemId, boolean forceLeftClick)
	{
		//RSRuneLiteMenuEntry menuEntry = newBareRuneliteMenuEntry();
		RSRuneLiteMenuEntry menuEntry = newRSRuneLiteMenuEntry(this, getMenuOptionCount());

		menuEntry.setOption(option);
		menuEntry.setTarget(target);
		menuEntry.setIdentifier(identifier);
		menuEntry.setType(MenuAction.of(opcode));
		menuEntry.setParam0(param1);
		menuEntry.setParam1(param2);
		menuEntry.setWorldViewId(-1);
		menuEntry.setConsumer(null);
		menuEntry.setForceLeftClick(forceLeftClick);
		menuEntry.setItemId(itemId);

		return menuEntry;
	}

	@Inject
	@Override
	public MenuEntry createMenuEntry(int idx)
	{
		if (this.getMenuOptionCount() >= 500)
		{
			throw new IllegalStateException();
		}
		else
		{
			if (idx < 0)
			{
				idx = this.getMenuOptionCount() + idx + 1;
				if (idx < 0)
				{
					throw new IllegalArgumentException();
				}
			}

			RSRuneLiteMenuEntry menuEntry;
			if (idx < this.getMenuOptionCount())
			{
				RSRuneLiteMenuEntry tmpEntry = rl$menuEntries[this.getMenuOptionCount()];
				if (tmpEntry == null)
				{
					tmpEntry = rl$menuEntries[this.getMenuOptionCount()] = newRSRuneLiteMenuEntry(this, getMenuOptionCount());
				}

				for (int i = this.getMenuOptionCount(); i > idx; rl$menuEntries[i].setIdx(i--))
				{
					this.getMenuOptions()[i] = this.getMenuOptions()[i - 1];
					this.getMenuTargets()[i] = this.getMenuTargets()[i - 1];
					this.getMenuIdentifiers()[i] = this.getMenuIdentifiers()[i - 1];
					this.getMenuOpcodes()[i] = this.getMenuOpcodes()[i - 1];
					this.getMenuArguments1()[i] = this.getMenuArguments1()[i - 1];
					this.getMenuArguments2()[i] = this.getMenuArguments2()[i - 1];
					this.getMenuItemIds()[i] = this.getMenuItemIds()[i - 1];
					this.getMenuWorldViewIds()[i] = this.getMenuWorldViewIds()[i - 1];
					this.getMenuForceLeftClick()[i] = this.getMenuForceLeftClick()[i - 1];

					this.getSubMenus()[i] = this.getSubMenus()[i - 1];

					rl$menuEntries[i] = rl$menuEntries[i - 1];
				}

				this.setMenuOptionCount(this.getMenuOptionCount() + 1);
				tmpMenuOptionsCount = this.getMenuOptionCount();

				menuEntry = tmpEntry;
				rl$menuEntries[idx] = tmpEntry;

				tmpEntry.setIdx(idx);
			}
			else
			{
				if (idx != this.getMenuOptionCount())
				{
					throw new IllegalArgumentException();
				}

				menuEntry = rl$menuEntries[this.getMenuOptionCount()];

				if (menuEntry == null)
				{
					menuEntry = rl$menuEntries[this.getMenuOptionCount()] = newRSRuneLiteMenuEntry(this, getMenuOptionCount());
				}

				this.setMenuOptionCount(this.getMenuOptionCount() + 1);
				tmpMenuOptionsCount = this.getMenuOptionCount();
			}

			menuEntry.setOption("");
			menuEntry.setTarget("");
			menuEntry.setIdentifier(0);
			menuEntry.setType(MenuAction.RUNELITE);
			menuEntry.setParam0(0);
			menuEntry.setParam1(0);
			menuEntry.setItemId(-1);
			menuEntry.setWorldViewId(-1);
			menuEntry.setConsumer(null);

			return menuEntry;
		}
	}

	@Inject
	@Override
	public void removeMenuEntry(MenuEntry var1)
	{
		RSRuneLiteMenuEntry menuEntry = (RSRuneLiteMenuEntry) var1;
		int idx = menuEntry.getIdx();
		if (menuEntry.getMenu() != this)
		{
			throw new IllegalArgumentException("entry doesn't belong to menu");
		}
		else
		{
			assert idx >= 0 && idx < getMenuOptionCount();

			for (int i = idx; i < this.getMenuOptionCount() - 1; rl$menuEntries[i].setIdx(i++))
			{
				this.getMenuOptions()[i] = this.getMenuOptions()[i + 1];
				this.getMenuTargets()[i] = this.getMenuTargets()[i + 1];
				this.getMenuIdentifiers()[i] = this.getMenuIdentifiers()[i + 1];
				this.getMenuOpcodes()[i] = this.getMenuOpcodes()[i + 1];
				this.getMenuArguments1()[i] = this.getMenuArguments1()[i + 1];
				this.getMenuArguments2()[i] = this.getMenuArguments2()[i + 1];
				this.getMenuItemIds()[i] = this.getMenuItemIds()[i + 1];
				this.getMenuWorldViewIds()[i] = this.getMenuWorldViewIds()[i + 1];
				this.getMenuForceLeftClick()[i] = this.getMenuForceLeftClick()[i + 1];

				rl$menuEntries[i] = rl$menuEntries[i + 1];
			}

			menuEntry.setIdx(getMenuOptionCount() - 1);
			rl$menuEntries[getMenuOptionCount() - 1] = menuEntry;
			this.setMenuOptionCount(getMenuOptionCount() - 1);
			tmpMenuOptionsCount = getMenuOptionCount();
		}
	}

	@Inject
	@Override
	public MenuEntry[] getMenuEntries()
	{
		RSRuneLiteMenuEntry[] menuEntries = Arrays.copyOf(rl$menuEntries, this.getMenuOptionCount());

		for (RSRuneLiteMenuEntry menuEntry : menuEntries)
		{
			if (menuEntry.getOption() == null)
			{
				menuEntry.setOption("null");
			}

			if (menuEntry.getTarget() == null)
			{
				menuEntry.setTarget("null");
			}
		}

		return menuEntries;
	}

	@Inject
	@Override
	public void setMenuEntries(MenuEntry[] menuEntries)
	{
		boolean var2 = false;

		if (client.getTempMenuAction() != null && this.getMenuOptionCount() > 0)
		{
			var2 = client.getTempMenuAction().getOpcode() == this.getMenuOpcodes()[this.getMenuOptionCount() - 1] &&
				client.getTempMenuAction().getIdentifier() == this.getMenuIdentifiers()[this.getMenuOptionCount() - 1] &&
				client.getTempMenuAction().getOption().equals(this.getMenuOptions()[this.getMenuOptionCount() - 1]) &&
				client.getTempMenuAction().getTarget().equals(this.getMenuTargets()[this.getMenuOptionCount() - 1]) &&
				client.getTempMenuAction().getParam0() == this.getMenuArguments1()[this.getMenuOptionCount() - 1] &&
				client.getTempMenuAction().getParam1() == this.getMenuArguments2()[this.getMenuOptionCount() - 1] &&
				client.getTempMenuAction().getItemId() == this.getMenuItemIds()[this.getMenuOptionCount() - 1] &&
				client.getTempMenuAction().getWorldViewId() == this.getMenuWorldViewIds()[this.getMenuOptionCount() - 1];
		}

		for (int i = 0; i < menuEntries.length; ++i)
		{
			RSRuneLiteMenuEntry menuEntry = (RSRuneLiteMenuEntry) menuEntries[i];
			if (menuEntry.getIdx() != i)
			{
				sortMenuEntries(menuEntry.getIdx(), i);
			}
		}

		this.setMenuOptionCount(menuEntries.length);
		tmpMenuOptionsCount = menuEntries.length;

		if (var2 && this.getMenuOptionCount() > 0)
		{
			client.getTempMenuAction().setOpcode(this.getMenuOpcodes()[this.getMenuOptionCount() - 1]);
			client.getTempMenuAction().setIdentifier(this.getMenuIdentifiers()[this.getMenuOptionCount() - 1]);
			client.getTempMenuAction().setOption(this.getMenuOptions()[this.getMenuOptionCount() - 1]);
			client.getTempMenuAction().setTarget(this.getMenuTargets()[this.getMenuOptionCount() - 1]);
			client.getTempMenuAction().setParam0(this.getMenuArguments1()[this.getMenuOptionCount() - 1]);
			client.getTempMenuAction().setParam1(this.getMenuArguments2()[this.getMenuOptionCount() - 1]);
			client.getTempMenuAction().setItemId(this.getMenuItemIds()[this.getMenuOptionCount() - 1]);
			client.getTempMenuAction().setWorldViewId(this.getMenuWorldViewIds()[this.getMenuOptionCount() - 1]);
		}
	}

	@Inject
	@Override
	public void sortMenuEntries(int left, int right)
	{
		String menuOption = this.getMenuOptions()[left];
		this.getMenuOptions()[left] = this.getMenuOptions()[right];
		this.getMenuOptions()[right] = menuOption;

		String menuTarget = this.getMenuTargets()[left];
		this.getMenuTargets()[left] = this.getMenuTargets()[right];
		this.getMenuTargets()[right] = menuTarget;

		int menuIdentifier = this.getMenuIdentifiers()[left];
		this.getMenuIdentifiers()[left] = this.getMenuIdentifiers()[right];
		this.getMenuIdentifiers()[right] = menuIdentifier;

		RSMenu submenu = this.getSubMenus()[left];
		this.getSubMenus()[left] = this.getSubMenus()[right];
		this.getSubMenus()[right] = submenu;

		int menuOpcode = this.getMenuOpcodes()[left];
		this.getMenuOpcodes()[left] = this.getMenuOpcodes()[right];
		this.getMenuOpcodes()[right] = menuOpcode;

		int menuArguments1 = this.getMenuArguments1()[left];
		this.getMenuArguments1()[left] = this.getMenuArguments1()[right];
		this.getMenuArguments1()[right] = menuArguments1;

		int menuArgument2 = this.getMenuArguments2()[left];
		this.getMenuArguments2()[left] = this.getMenuArguments2()[right];
		this.getMenuArguments2()[right] = menuArgument2;

		int itemId = this.getMenuItemIds()[left];
		this.getMenuItemIds()[left] = this.getMenuItemIds()[right];
		this.getMenuItemIds()[right] = itemId;

		int worldViewId = this.getMenuWorldViewIds()[left];
		this.getMenuWorldViewIds()[left] = this.getMenuWorldViewIds()[right];
		this.getMenuWorldViewIds()[right] = worldViewId;

		boolean menuForceLeftClick = this.getMenuForceLeftClick()[left];
		this.getMenuForceLeftClick()[left] = this.getMenuForceLeftClick()[right];
		this.getMenuForceLeftClick()[right] = menuForceLeftClick;

		RSRuneLiteMenuEntry var2 = rl$menuEntries[left];
		rl$menuEntries[left] = rl$menuEntries[right];
		rl$menuEntries[right] = var2;

		rl$menuEntries[left].setIdx(left);
		rl$menuEntries[right].setIdx(right);
	}

	@Inject
	@Override
	public void swapMenuEntries(int var0)
	{
		RSRuneLiteMenuEntry var1 = rl$menuEntries[var0];
		RSRuneLiteMenuEntry var2 = rl$menuEntries[var0 + 1];

		assert var1.getIdx() == var0;
		assert var2.getIdx() == var0 + 1;

		rl$menuEntries[var0] = var2;
		rl$menuEntries[var0 + 1] = var1;

		var1.setIdx(var0 + 1);
		var2.setIdx(var0);
	}

	@Replace("insertMenuItem")
	public final int insertMenuItem(String action, String target, int opcode, int identifier, int argument1, int argument2, int itemId, boolean forceLeftClick, int worldViewId)
	{
		if (this.getMenuOptionCount() < this.getMenuOptions().length)
		{
			this.getMenuOptions()[this.getMenuOptionCount()] = action;
			this.getMenuTargets()[this.getMenuOptionCount()] = target;
			this.getMenuOpcodes()[this.getMenuOptionCount()] = opcode;
			this.getMenuIdentifiers()[this.getMenuOptionCount()] = identifier;
			this.getMenuArguments1()[this.getMenuOptionCount()] = argument1;
			this.getMenuArguments2()[this.getMenuOptionCount()] = argument2;
			this.getMenuItemIds()[this.getMenuOptionCount()] = itemId;
			this.getMenuWorldViewIds()[this.getMenuOptionCount()] = worldViewId;
			this.getMenuForceLeftClick()[this.getMenuOptionCount()] = forceLeftClick;
			this.getSubMenus()[this.getMenuOptionCount()] = null;

			setMenuOptionCount(getMenuOptionCount() + 1);
			onMenuOptionsChanged(-1);
			return getMenuOptionCount() - 1;
		}
		else
		{
			return -1;
		}
	}

	@FieldHook("menuOptionsCount")
	@Inject
	public final void onMenuOptionsChanged(int idx)
	{
		int tmpOptionsCount = tmpMenuOptionsCount;
		int optionCount = this.getMenuOptionCount();
		this.tmpMenuOptionsCount = optionCount;

		if (optionCount < tmpOptionsCount)
		{
			for (int i = optionCount; i < tmpOptionsCount; ++i)
			{
				this.rl$menuEntries[i].setConsumer(null);
			}
		}
		else if (optionCount == tmpOptionsCount + 1)
		{
			if (this.getMenuOptions()[tmpOptionsCount] == null)
			{
				this.getMenuOptions()[tmpOptionsCount] = "null";
			}

			if (this.getMenuTargets()[tmpOptionsCount] == null)
			{
				this.getMenuTargets()[tmpOptionsCount] = "null";
			}

			RSRuneLiteMenuEntry entry = this.rl$menuEntries[tmpOptionsCount];
			if (entry == null)
			{
				entry = this.rl$menuEntries[tmpOptionsCount] = newRSRuneLiteMenuEntry(this, tmpOptionsCount);
			}
			else
			{
				entry.setConsumer(null);
			}

			MenuEntryAdded menuEntryAdded = new MenuEntryAdded(entry);
			client.getCallbacks().post(menuEntryAdded);

			if (menuEntryAdded.isModified() && this.getMenuOptionCount() == optionCount)
			{
				this.getMenuOptions()[tmpOptionsCount] = menuEntryAdded.getOption();
				this.getMenuTargets()[tmpOptionsCount] = menuEntryAdded.getTarget();
				this.getMenuIdentifiers()[tmpOptionsCount] = menuEntryAdded.getIdentifier();
				this.getMenuOpcodes()[tmpOptionsCount] = menuEntryAdded.getType();
				this.getMenuArguments1()[tmpOptionsCount] = menuEntryAdded.getActionParam0();
				this.getMenuArguments2()[tmpOptionsCount] = menuEntryAdded.getActionParam1();
				this.getMenuForceLeftClick()[tmpOptionsCount] = menuEntryAdded.isForceLeftClick();
				this.getMenuItemIds()[tmpOptionsCount] = menuEntryAdded.getItemId();
			}
		}
	}
}
