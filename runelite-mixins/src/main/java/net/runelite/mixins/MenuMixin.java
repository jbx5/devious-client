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

import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.api.events.WidgetPressed;
import net.runelite.api.mixins.FieldHook;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSFont;
import net.runelite.rs.api.RSMenuAction;
import net.runelite.rs.api.RSRuneLiteMenuEntry;

@Mixin(RSClient.class)
public abstract class MenuMixin implements RSClient
{
	private static final int MENU_BORDER_OUTER_2010 = 0x6D6A5B;
	private static final int MENU_BORDER_INNER_2010 = 0x524A3D;
	private static final int MENU_PADDING_2010 = 0x2B2622;
	private static final int MENU_BACKGROUND_2010 = 0x2B271C;
	private static final int MENU_TEXT_2010 = 0xC6B895;
	private static final int MENU_HEADER_GRADIENT_TOP_2010 = 0x322E22;
	private static final int MENU_HEADER_GRADIENT_BOTTOM_2010 = 0x090A04;
	private static final int ORIGINAL_BG = 0x5D5447;

	@Shadow("client")
	private static RSClient client;

	@Shadow("tempMenuAction")
	private static RSMenuAction tempMenuAction;

	@Inject
	void initSubmenu(int x, int y)
	{
		if (client.getSubmenuIdx() != -1)
		{
			RSRuneLiteMenuEntry rootEntry = (RSRuneLiteMenuEntry) client.getMenuEntries()[client.getSubmenuIdx()];
			String s = rootEntry.getOption();
			if (!rootEntry.getTarget().isEmpty())
			{
				s = s + " " + rootEntry.getTarget();
			}

			if (rootEntry.getType() == MenuAction.RUNELITE_SUBMENU)
			{
				s = s + " <col=ffffff><gt>";
			}
			int tempWidth = client.getFontBold12().getTextWidth(s);
			int realCount = 0;

			for (MenuEntry me : client.getMenuEntries())
			{
				if (me.getParent() == null) continue;
				if (((RSRuneLiteMenuEntry)me.getParent()).getIdx() == rootEntry.getIdx())
				{
					realCount++;
					tempWidth = Math.max(client.getFontBold12().getTextWidth(
							(me.getTarget().length() > 0 ? me.getOption() + " " + me.getTarget() : me.getOption())
					), tempWidth);
				}
			}
			tempWidth += 8;
			int var4 = realCount * 15 + 22;
			int var5 = x/* - tempWidth / 2*/;
			if (var5 + tempWidth > client.getCanvasWidth())
			{
				var5 = client.getCanvasWidth() - tempWidth;
			}

			if (var5 < 0)
			{
				var5 = 0;
			}

			int var6 = y;
			if (var4 + y > client.getCanvasHeight())
			{
				var6 = client.getCanvasHeight() - var4;
			}

			if (var6 < 0)
			{
				var6 = 0;
			}

			client.setSubmenuX(var5);
			client.setSubmenuY(var6);
			client.setSubmenuWidth(tempWidth);
			client.setSubmenuHeight(realCount * 15 + 22);

			client.setSubmenuScroll(0);
			client.setSubmenuScrollMax(0);
			if (var4 > this.getCanvasHeight())
			{
				client.setSubmenuScrollMax(var4 - this.getCanvasHeight() + 14 / 15);
			}
		}
	}
	@Inject
	private void draw2010MenuNest(MenuEntry parent, int x, int y, int w, int h, int scroll, int alpha)
	{
		// Outside border
		rasterizerDrawHorizontalLineAlpha(x + 2, y, w - 4, MENU_BORDER_OUTER_2010, alpha);
		rasterizerDrawHorizontalLineAlpha(x + 2, y + h - 1, w - 4, MENU_BORDER_OUTER_2010, alpha);
		rasterizerDrawVerticalLineAlpha(x, y + 2, h - 4, MENU_BORDER_OUTER_2010, alpha);
		rasterizerDrawVerticalLineAlpha(x + w - 1, y + 2, h - 4, MENU_BORDER_OUTER_2010, alpha);

		// Padding
		rasterizerDrawRectangleAlpha(x + 1, y + 5, w - 2, h - 6, MENU_PADDING_2010, alpha);
		rasterizerDrawHorizontalLineAlpha(x + 1, y + 17, w - 2, MENU_PADDING_2010, alpha);
		rasterizerDrawCircleAlpha(x + 2, y + h - 3, 0, MENU_PADDING_2010, alpha);
		rasterizerDrawCircleAlpha(x + w - 3, y + h - 3, 0, MENU_PADDING_2010, alpha);

		// Header
		rasterizerDrawGradientAlpha(x + 2, y + 1, w - 4, 16, MENU_HEADER_GRADIENT_TOP_2010, MENU_HEADER_GRADIENT_BOTTOM_2010, alpha, alpha);
		rasterizerFillRectangleAlpha(x + 1, y + 1, 2, 4, MENU_PADDING_2010, alpha);
		rasterizerFillRectangleAlpha(x + w - 3, y + 1, 2, 4, MENU_PADDING_2010, alpha);

		// Inside border
		rasterizerDrawHorizontalLineAlpha(x + 2, y + 18, w - 4, MENU_BORDER_INNER_2010, alpha);
		rasterizerDrawHorizontalLineAlpha(x + 3, y + h - 3, w - 6, MENU_BORDER_INNER_2010, alpha);
		rasterizerDrawVerticalLineAlpha(x + 2, y + 18, h - 21, MENU_BORDER_INNER_2010, alpha);
		rasterizerDrawVerticalLineAlpha(x + w - 3, y + 18, h - 21, MENU_BORDER_INNER_2010, alpha);

		// Options background
		rasterizerFillRectangleAlpha(x + 3, y + 19, w - 6, h - 22, MENU_BACKGROUND_2010, alpha);

		// Corner insets
		rasterizerDrawCircleAlpha(x + 1, y + 1, 0, MENU_BORDER_OUTER_2010, alpha);
		rasterizerDrawCircleAlpha(x + w - 2, y + 1, 0, MENU_BORDER_OUTER_2010, alpha);
		rasterizerDrawCircleAlpha(x + 1, y + h - 2, 0, MENU_BORDER_OUTER_2010, alpha);
		rasterizerDrawCircleAlpha(x + w - 2, y + h - 2, 0, MENU_BORDER_OUTER_2010, alpha);

		RSFont font = getFontBold12();
		String option = parent == null ? "Choose Option" : parent.getTarget();
		font.drawTextLeftAligned(option, x + 3, y + 14, MENU_TEXT_2010, -1);

		MenuEntry[] entries = getMenuEntries();

		int mouseX = getMouseX();
		int mouseY = getMouseY();
		int realCount = 0;
		for (int i = 0; i < entries.length; i++)
		{
			if (entries[i].getParent() == parent)
			{
				realCount++;
			}
		}
		int realIdx = 0;
		for (int i = 0; i < entries.length; i++)
		{
			MenuEntry entry = entries[i];
			if (entry.getParent() == parent && realCount - 1 - realIdx >= scroll)
			{
				int rowY = y + (realCount - 1 - realIdx - scroll) * 15 + 31;
				realIdx++;
				String s = entry.getOption();
				if (!entry.getTarget().isEmpty())
				{
					s = s + " " + entry.getTarget();
				}

				if (entry.getType() == MenuAction.RUNELITE_SUBMENU)
				{
					s = s + " <col=ffffff><gt>";
				}

				font.drawTextLeftAligned(s, x + 3, rowY, MENU_TEXT_2010, -1);
				if (mouseX > x && mouseX < w + x && mouseY > rowY - 13 && mouseY < rowY + 3)
				{
					rasterizerFillRectangleAlpha(x + 3, rowY - 12, w - 6, 15, 0xffffff, 80);
					if (entry.getType() == MenuAction.RUNELITE_SUBMENU)
					{
						setSubmenuIdx(i);
						initSubmenu(x + w, rowY - 31);
					}
				}
				if (client.getSubmenuIdx() == i)
				{
					this.draw2010MenuNest(entry, getSubmenuX(), getSubmenuY(), getSubmenuWidth(), getSubmenuHeight(), getSubmenuScroll(), alpha);
				}
			}
		}
		client.invalidateWidgetsUnder(x, y, w, h);
	}
	@Inject
	@Override
	public void draw2010Menu(int alpha)
	{
		int x = getMenuX();
		int y = getMenuY();
		int w = getMenuWidth();
		int h = getMenuHeight();

		draw2010MenuNest(null, x, y, w, h, getMenuScroll(), alpha);

	}

	@Inject
	private void drawOriginalMenuNest(MenuEntry parent, int x, int y, int w, int h, int scroll, int alpha)
	{
		if (alpha != 255)
		{
			rasterizerFillRectangleAlpha(x, y, w, h, ORIGINAL_BG, alpha);
			rasterizerFillRectangleAlpha(x + 1, y + 1, w - 2, 16, 0, alpha);
			rasterizerDrawRectangleAlpha(x + 1, y + 18, w - 2, h - 19, 0, alpha);
		}
		else
		{
			rasterizerFillRectangle(x, y, w, h, ORIGINAL_BG);
			rasterizerFillRectangle(x + 1, y + 1, w - 2, 16, 0);
			rasterizerDrawRectangle(x + 1, y + 18, w - 2, h - 19, 0);
		}

		RSFont font = getFontBold12();
		String option = parent == null ? "Choose Option" : parent.getTarget();
		font.drawTextLeftAligned(option, x + 3, y + 14, ORIGINAL_BG, -1);

		MenuEntry[] entries = getMenuEntries();

		int mouseX = getMouseX();
		int mouseY = getMouseY();
		int realCount = 0;
		for (int i = 0; i < entries.length; i++)
		{
			if (entries[i].getParent() == parent)
			{
				realCount++;
			}
		}
		int realIdx = 0;
		for (int i = 0; i < entries.length; i++)
		{
			MenuEntry entry = entries[i];
			if (entry.getParent() == parent && realCount - 1 - realIdx >= scroll)
			{
				int rowY = y + (realCount - 1 - realIdx - scroll) * 15 + 31;
				realIdx++;
				String s = entry.getOption();
				if (!entry.getTarget().isEmpty())
				{
					s = s + " " + entry.getTarget();
				}

				if (entry.getType() == MenuAction.RUNELITE_SUBMENU)
				{
					s = s + " <col=ffffff><gt>";
				}
				int highlight = 0xFFFFFF;
				if (mouseX > x && mouseX < w + x && mouseY > rowY - 13 && mouseY < rowY + 3)
				{
					highlight = 0xFFFF00;
					if (entry.getType() == MenuAction.RUNELITE_SUBMENU)
					{
						setSubmenuIdx(i);
						initSubmenu(x + w, rowY - 31);
					}
				}
				font.drawTextLeftAligned(s, x + 3, rowY, highlight, 0);
				if (client.getSubmenuIdx() == i)
				{
					this.drawOriginalMenuNest(entry, getSubmenuX(), getSubmenuY(), getSubmenuWidth(), getSubmenuHeight(), getSubmenuScroll(), alpha);
				}
			}
		}
		client.invalidateWidgetsUnder(x, y, w, h);
	}

	@Inject
	@Override
	public void drawOriginalMenu(int alpha)
	{
		int x = getMenuX();
		int y = getMenuY();
		int w = getMenuWidth();
		int h = getMenuHeight();
		drawOriginalMenuNest(null, x, y, w, h, getMenuScroll(), alpha);
	}

	@Inject
	@FieldHook("tempMenuAction")
	public static void onTempMenuActionChanged(int idx)
	{
		if (tempMenuAction != null)
		{
			client.getCallbacks().post(new WidgetPressed());
		}
	}

	@Inject
	@Override
	public void setTempMenuEntry(MenuEntry entry)
	{
		if (entry == null || tempMenuAction == null)
		{
			return;
		}

		tempMenuAction.setOption(entry.getOption());
		tempMenuAction.setOpcode(entry.getType().getId());
		tempMenuAction.setIdentifier(entry.getIdentifier());
		tempMenuAction.setParam0(entry.getParam0());
		tempMenuAction.setParam1(entry.getParam1());
	}
}
