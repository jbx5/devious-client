package net.unethicalite.mixins;

import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
import net.runelite.api.mixins.Shadow;
import net.runelite.mixins.RSClientMixin;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSRuneLiteMenuEntry;

import static net.runelite.api.MenuAction.CANCEL;
import static net.runelite.api.MenuAction.UNKNOWN;

@Mixin(RSClient.class)
public abstract class HInteractionMixin extends RSClientMixin implements RSClient
{
	@Shadow("client")
	private static RSClient client;

	@Shadow("rl$menuEntries")
	private static RSRuneLiteMenuEntry[] rl$menuEntries;

	@Shadow("printMenuActions")
	private static boolean printMenuActions;

	@Copy("menuAction")
	@Replace("menuAction")
	static void copy$menuAction(int param0, int param1, int opcode, int id, String option, String target, int canvasX, int canvasY)
	{
		RSRuneLiteMenuEntry menuEntry = null;

		for (int i = client.getMenuOptionCount() - 1; i >= 0; --i)
		{
			if (client.getMenuOpcodes()[i] == opcode
					&& client.getMenuIdentifiers()[i] == id
					&& client.getMenuArguments1()[i] == param0
					&& client.getMenuArguments2()[i] == param1
					&& option.equals(client.getMenuOptions()[i])
					&& (option.equals(target) || target.equals(client.getMenuTargets()[i]))
			)
			{
				menuEntry = rl$menuEntries[i];
				break;
			}
		}

		if (menuEntry == null && option.equals(target))
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

			client.getMenuOpcodes()[i] = opcode;
			client.getMenuIdentifiers()[i] = id;
			client.getMenuOptions()[i] = option;
			client.getMenuTargets()[i] = target;
			client.getMenuArguments1()[i] = param0;
			client.getMenuArguments2()[i] = param1;
			client.getMenuForceLeftClick()[i] = false;
			menuEntry = rl$menuEntries[i];
			if (menuEntry == null)
			{
				menuEntry = rl$menuEntries[i] = newRuneliteMenuEntry(i);
			}
		}

		MenuOptionClicked event;
		if (menuEntry == null)
		{
			MenuEntry tmpEntry = client.createMenuEntry(option, target, id, opcode, param0, param1, false);
			event = new MenuOptionClicked(tmpEntry);

			if (canvasX != -1 || canvasY != -1)
			{
				client.getLogger().warn("Unable to find clicked menu op {} targ {} action {} id {} p0 {} p1 {}", option, target, opcode, id, param0, param1);
			}
		}
		else
		{
			client.getLogger().trace("Menu click op {} targ {} action {} id {} p0 {} p1 {}", option, target, opcode, id, param0, param1);
			event = new MenuOptionClicked(menuEntry);

			client.getCallbacks().post(event);

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

		if ("Automated".equals(option) && opcode == MenuAction.WALK.getId())
		{
			client.setSelectedSceneTileX(param0);
			client.setSelectedSceneTileY(param1);
			client.setViewportWalking(true);

			copy$menuAction(0, 0, CANCEL.getId(), 0, "Automated", "", canvasX, canvasY);
			return;
		}

		/*
		 * The RuneScape client may deprioritize an action in the menu by incrementing the opcode with 2000,
		 * undo it here so we can get the correct opcode
		 */
		boolean decremented = false;
		if (opcode >= 2000)
		{
			decremented = true;
			opcode -= 2000;
		}

		if (printMenuActions)
		{
			client.getLogger().info(
					"|MenuAction|: MenuOption={} MenuTarget={} Id={} Opcode={}/{} Param0={} Param1={} CanvasX={} CanvasY={}",
					event.getMenuOption(), event.getMenuTarget(), event.getId(),
					event.getMenuAction(), opcode + (decremented ? 2000 : 0),
					event.getParam0(), event.getParam1(), canvasX, canvasY
			);

			if (menuEntry != null)
			{
				client.getLogger().info(
						"|MenuEntry|: Idx={} MenuOption={} MenuTarget={} Id={} MenuAction={} Param0={} Param1={} Consumer={} IsItemOp={} ItemOp={} ItemID={} Widget={}",
						menuEntry.getIdx(), menuEntry.getOption(), menuEntry.getTarget(), menuEntry.getIdentifier(), menuEntry.getType(), menuEntry.getParam0(), menuEntry.getParam1(), menuEntry.getConsumer(), menuEntry.isItemOp(), menuEntry.getItemOp(), menuEntry.getItemId(), menuEntry.getWidget()
				);
			}
		}


		if ("Automated".equals(option)
				&& (opcode == MenuAction.CC_OP.getId() || opcode == MenuAction.CC_OP_LOW_PRIORITY.getId())
				&& menuEntry != null
				&& menuEntry.getItemId() > -1)
		{
			client.invokeWidgetAction(event.getId(), event.getParam1(), event.getParam0(), menuEntry.getItemId(),
					event.getMenuTarget());
		}
		else
		{
			copy$menuAction(event.getParam0(), event.getParam1(),
					event.getMenuAction() == UNKNOWN ? opcode : event.getMenuAction().getId(),
					event.getId(), event.getMenuOption(), event.getMenuTarget(),
					canvasX, canvasY);
		}
	}
}
