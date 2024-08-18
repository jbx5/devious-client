package net.unethicalite.mixins;

import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetID;
import net.runelite.mixins.RSClientMixin;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSRuneLiteMenuEntry;
import net.unethicalite.api.events.MenuAutomated;

import java.util.concurrent.atomic.AtomicReference;

import static net.runelite.api.MenuAction.CANCEL;
import static net.runelite.api.MenuAction.UNKNOWN;

@Mixin(RSClient.class)
public abstract class HInteractionMixin extends RSClientMixin implements RSClient
{
	@Shadow("client")
	private static RSClient client;

	@Shadow("automatedMenu")
	private static AtomicReference<MenuAutomated> automatedMenu;

	@Shadow("printMenuActions")
	private static boolean printMenuActions;

	// Fixes old invoke
	@Inject
	@Override
	public void invokeMenuAction(String option, String target, int identifier, int opcode, int param0, int param1, int screenX, int screenY)
	{
		invokeMenuAction(option, target, identifier, opcode, param0, param1, getItemId(identifier, opcode, param0, param1, -1), screenX, screenY);
	}

	@Inject
	private static int getItemId(int identifier, int opcode, int param0, int param1, int currentItemId)
	{
		switch (opcode)
		{
			case 1006:
				currentItemId = 0;
				break;
			case 25:
			case 31:
			case 32:
			case 33:
			case 34:
			case 35:
			case 36:
			case 37:
			case 38:
			case 39:
			case 40:
			case 41:
			case 42:
			case 43:
			case 58:
			case 1005:
				currentItemId = getItemId(param0, param1, currentItemId);
				break;

			case 57:
			case 1007:
				if (identifier >= 1 && identifier <= 10)
				{
					currentItemId = getItemId(param0, param1, currentItemId);
				}

				break;
		}

		return currentItemId;
	}

	@Inject
	private static int getItemId(int param0, int param1, int currentItemId)
	{
		Widget widget = client.getWidget(param1);
		if (widget != null)
		{
			int group = param1 >>> 16;
			Widget[] children = widget.getChildren();
			if (children != null && children.length >= 2 && group == WidgetID.EQUIPMENT_GROUP_ID)
			{
				param0 = 1;
			}

			Widget child = widget.getChild(param0);
			if (child != null)
			{
				if (currentItemId != child.getItemId())
				{
					return child.getItemId();
				}
			}
		}

		return currentItemId;
	}

	@Copy("menuAction")
	@Replace("menuAction")
	static void copy$menuAction(int param0, int param1, int opcode, int id, int itemId, int worldViewId, String option, String target, int canvasX, int canvasY)
	{
		RSRuneLiteMenuEntry menuEntry = (RSRuneLiteMenuEntry) client.getClickedMenuEntry();
		if (menuEntry == null)
		{
			for (int i = client.getMenu().getMenuOptionCount() - 1; i >= 0; --i)
			{
				if (client.getMenu().getMenuOpcodes()[i] == opcode
						&& client.getMenu().getMenuIdentifiers()[i] == id
						&& client.getMenu().getMenuArguments1()[i] == param0
						&& client.getMenu().getMenuArguments2()[i] == param1
						&& client.getMenu().getMenuItemIds()[i] == itemId
					        && client.getMenu().getMenuWorldViewIds()[i] == worldViewId
						&& option.equals(client.getMenu().getMenuOptions()[i])
						&& target.equals(client.getMenu().getMenuTargets()[i])
				)
				{
					menuEntry = (RSRuneLiteMenuEntry) client.getMenu().getMenuEntries()[i];
					break;
				}
			}
		}

		boolean isTemp = false;
		if (client.getTempMenuAction() != null)
		{
			isTemp = client.getTempMenuAction().getOpcode() == opcode &&
					client.getTempMenuAction().getIdentifier() == id &&
					client.getTempMenuAction().getOption().equals(option) &&
					client.getTempMenuAction().getTarget().equals(target) &&
					client.getTempMenuAction().getParam0() == param0 &&
					client.getTempMenuAction().getParam1() == param1 &&
					client.getTempMenuAction().getItemId() == itemId &&
				        client.getTempMenuAction().getWorldViewId() == worldViewId;
		}

		if (menuEntry == null && isTemp)
		{
			int i;
			if (client.getMenuOptionCount() < 500)
			{
				i = client.getMenuOptionCount();
				client.setMenuOptionCount(client.getMenuOptionCount() + 1);
			}
			else
			{
				i = 0;
			}

			client.getMenu().getMenuOpcodes()[i] = opcode;
			client.getMenu().getMenuIdentifiers()[i] = id;
			client.getMenu().getMenuOptions()[i] = option;
			client.getMenu().getMenuTargets()[i] = target;
			client.getMenu().getMenuArguments1()[i] = param0;
			client.getMenu().getMenuArguments2()[i] = param1;
			client.getMenu().getMenuItemIds()[i] = itemId;
			client.getMenu().getMenuWorldViewIds()[i] = worldViewId;
			client.getMenu().getMenuForceLeftClick()[i] = false;
			menuEntry = (RSRuneLiteMenuEntry) client.getMenu().getMenuEntries()[i];

			if (menuEntry == null)
			{
				menuEntry = (RSRuneLiteMenuEntry) (client.getMenu().getMenuEntries()[i] = client.getMenu().newRSRuneLiteMenuEntry(client.getMenu(), i));
			}
		}

		MenuOptionClicked event;
		if (menuEntry == null)
		{
			MenuEntry tmpEntry = client.createMenuEntry(option, target, id, opcode, param0, param1, itemId, false);
			tmpEntry.setWorldViewId(-1);
			event = new MenuOptionClicked(tmpEntry);

			if (canvasX != -1 || canvasY != -1)
			{
				client.getLogger().warn("Unable to find clicked menu op {} targ {} action {} id {} p0 {} p1 {} item {}", option, target, opcode, id, param0, param1, itemId);
			}
		}
		else
		{
			MenuAutomated menu = automatedMenu.getAndSet(null);
			if (menu != null)
			{
				menuEntry.setIdentifier(menu.getIdentifier());
				menuEntry.setType(menu.getOpcode());
				menuEntry.setParam0(menu.getParam0());
				menuEntry.setParam1(menu.getParam1());
				menuEntry.setItemId(menu.getItemId());
				menuEntry.setWorldViewId(menu.getWorldViewId());
				menuEntry.setOption(menu.getOption());
				menuEntry.setTarget(menu.getTarget());
			}

			client.getLogger().trace("Menu click op {} targ {} action {} id {} p0 {} p1 {}", option, target, opcode, id, param0, param1);
			event = new MenuOptionClicked(menuEntry);
			client.getCallbacks().post(event);

			// Set new item id here in case event is modified
			int newItemId = getItemId(event.getId(), event.getMenuAction().getId(), event.getParam0(), event.getParam1(), event.getItemId());
			event.setItemId(newItemId);

			if (menuEntry.getConsumer() != null)
			{
				try
				{
					menuEntry.getConsumer().accept(menuEntry);
				}
				catch (Exception ex)
				{
					client.getLogger().warn("exception in menu callback", ex);
				}
			}

			if (event.isConsumed())
			{
				return;
			}
		}

		if ("Automated".equals(event.getMenuOption()) && event.getMenuAction() == MenuAction.WALK)
		{
			client.getTopLevelWorldView().getScene().setBaseX(event.getParam0());
			client.getTopLevelWorldView().getScene().setBaseY(event.getParam1());
			client.getTopLevelWorldView().getScene().setViewportWalking(true);

			copy$menuAction(0, 0, CANCEL.getId(), 0, 0, -1, "Automated", "", canvasX, canvasY);
			return;
		}

		if ("Automated".equals(event.getMenuOption())
				&& (event.getMenuAction() == MenuAction.CC_OP || event.getMenuAction() == MenuAction.CC_OP_LOW_PRIORITY)
				&& event.getItemId() > -1)
		{
			client.invokeWidgetAction(event.getId(), event.getParam1(), event.getParam0(), event.getItemId(), event.getMenuTarget());
		}
		else
		{
			copy$menuAction(event.getParam0(), event.getParam1(),
					event.getMenuAction() == UNKNOWN ? opcode : event.getMenuAction().getId(),
					event.getId(), event.getItemId(), event.getWorldViewId(), event.getMenuOption(), event.getMenuTarget(),
					canvasX, canvasY);
		}
	}

	@Inject
	@Override
	public void insertMenuItem(String action, String target, int opcode, int identifier, int argument1, int argument2, boolean forceLeftClick)
	{
		client.rsInsertMenuItem(action, target, opcode, identifier, argument1, argument2, getItemId(argument1, argument2, -1), forceLeftClick, -1);
	}

	@Inject
	@Override
	public void insertMenuItem(String action, String target, int opcode, int identifier, int argument1, int argument2, int itemId, boolean forceLeftClick)
	{
		client.rsInsertMenuItem(action, target, opcode, identifier, argument1, argument2, itemId, forceLeftClick, -1);
	}

	@Inject
	@Override
	public MenuEntry createMenuEntry(String option, String target, int identifier, int opcode, int param1, int param2, boolean forceLeftClick)
	{
		return createMenuEntry(option, target, identifier, opcode, param1, param2, getItemId(identifier, opcode, param1, param2, -1), forceLeftClick);
	}
}
