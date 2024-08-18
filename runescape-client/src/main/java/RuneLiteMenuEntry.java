import net.runelite.api.MenuEntry;
import java.util.function.Consumer;
import net.runelite.api.Actor;
import net.runelite.api.Player;
import net.runelite.api.widgets.Widget;
import net.runelite.api.NPC;
import net.runelite.api.MenuAction;
import net.runelite.rs.api.RSClient;
public class RuneLiteMenuEntry implements MenuEntry {
	private static RSClient client;

	public final Menu menu;
	public Consumer consumer;
	public int idx;

	public RuneLiteMenuEntry(Menu menu, int idx) {
		this.menu = menu;
		this.idx = idx;
	}

	public net.runelite.api.Menu getMenu() {
		return (net.runelite.api.Menu) menu;
	}

	public Consumer getConsumer() {
		return consumer;
	}

	public void setConsumer(Consumer consumer) {
		this.consumer = consumer;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	@Override
	public String getOption() {
		return this.menu.menuActions[this.idx];
	}

	@Override
	public MenuEntry setOption(String option) {
		this.menu.menuActions[this.idx] = option;
		return this;
	}

	@Override
	public String getTarget() {
		return this.menu.menuTargets[this.idx];
	}

	@Override
	public MenuEntry setTarget(String target) {
		this.menu.menuTargets[this.idx] = target;
		return this;
	}

	@Override
	public MenuAction getType() {
		int opcode = this.menu.menuOpcodes[this.idx];
		if (opcode >= 2000) {
			opcode -= 2000;
		}
		return MenuAction.of(opcode);
	}

	@Override
	public MenuAction getMenuAction() {
		return this.getType();
	}

	@Override
	public MenuEntry setType(MenuAction menuAction) {
		int opcode = this.menu.menuOpcodes[this.idx];
		short mod = 0;
		if (opcode >= 2000) {
			mod = 2000;
		}
		this.menu.menuOpcodes[this.idx] = menuAction.getId() + mod;
		return this;
	}

	@Override
	public net.runelite.api.Menu createSubMenu()
	{
		return (net.runelite.api.Menu) (this.menu.subMenus[this.idx] = new Menu(false));
	}

	@Override
	public void deleteSubMenu() {
		this.menu.subMenus[this.idx] = null;
	}

	@Override
	public net.runelite.api.Menu getSubMenu() {
		return (net.runelite.api.Menu) this.menu.subMenus[this.idx];
	}

	@Override
	public int getOpcode() {
		int opcode = this.menu.menuOpcodes[this.idx];
		if (opcode >= 2000) {
			opcode -= 2000;
		}
		return opcode;
	}

	@Override
	public void setOpcode(int code) {
		int opcode = this.menu.menuOpcodes[this.idx];
		short mod = 0;
		if (opcode >= 2000) {
			mod = 2000;
		}
		this.menu.menuOpcodes[this.idx] = code + mod;
	}

	@Override
	public int getIdentifier() {
		return this.menu.menuIdentifiers[this.idx];
	}

	@Override
	public MenuEntry setIdentifier(int identifier) {
		this.menu.menuIdentifiers[this.idx] = identifier;
		return this;
	}

	@Override
	public int getParam0() {
		return this.menu.menuArguments1[this.idx];
	}

	@Override
	public MenuEntry setParam0(int param0) {
		this.menu.menuArguments1[this.idx] = param0;
		return this;
	}

	@Override
	public int getActionParam0() {
		return this.getParam0();
	}

	@Override
	public void setActionParam0(int param0) {
		this.setParam0(param0);
	}

	@Override
	public int getParam1() {
		return this.menu.menuArguments2[this.idx];
	}

	@Override
	public MenuEntry setParam1(int param1) {
		this.menu.menuArguments2[this.idx] = param1;
		return this;
	}

	@Override
	public int getActionParam1() {
		return this.getParam1();
	}

	@Override
	public void setActionParam1(int param1) {
		this.setParam1(param1);
	}

	@Override
	public boolean isDeprioritized() {
		return this.menu.menuOpcodes[this.idx] >= 2000;
	}

	@Override
	public MenuEntry setDeprioritized(boolean deprioritize) {
		int[] opcodes;
		if (deprioritize) {
			if (this.menu.menuOpcodes[this.idx] < 2000) {
				opcodes = this.menu.menuOpcodes;
				opcodes[this.idx] += 2000;
			}
		} else if (this.menu.menuOpcodes[this.idx] >= 2000) {
			opcodes = this.menu.menuOpcodes;
			opcodes[this.idx] -= 2000;
		}
		return this;
	}

	@Override
	public MenuEntry onClick(Consumer<MenuEntry> callback)
	{
		this.consumer = callback;
		return this;
	}

	@Override
	public Consumer<MenuEntry> onClick()
	{
		return this.consumer;
	}

	public WorldView getWorldView()
	{
		return (WorldView) client.getWorldView(this.getWorldViewId());
	}

	@Override
	public boolean isForceLeftClick() {
		return this.menu.menuShiftClick[this.idx];
	}

	@Override
	public MenuEntry setForceLeftClick(boolean forceLeftClick) {
		this.menu.menuShiftClick[this.idx] = forceLeftClick;
		return this;
	}

	@Override
	public int getWorldViewId()
	{
		return this.menu.menuWorldViewIds[this.idx];
	}

	@Override
	public MenuEntry setWorldViewId(int worldViewId)
	{
		this.menu.menuWorldViewIds[this.idx] = worldViewId;
		return this;
	}

	public boolean instanceOf(Object o) {
		return o instanceof RuneLiteMenuEntry;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this) {
			return true;
		} else if (!(o instanceof RuneLiteMenuEntry)) {
			return false;
		} else {
			RuneLiteMenuEntry menuEntry = ((RuneLiteMenuEntry) (o));
			if (!menuEntry.instanceOf(this)) {
				return false;
			} else if (this.getIdentifier() != menuEntry.getIdentifier()) {
				return false;
			} else if (this.getParam0() != menuEntry.getParam0()) {
				return false;
			} else if (this.getParam1() != menuEntry.getParam1()) {
				return false;
			} else if (this.getItemId() != menuEntry.getItemId()) {
				return false;
			} else if (this.isForceLeftClick() != menuEntry.isForceLeftClick()) {
				return false;
			} else if (this.getWorldViewId() != menuEntry.getWorldViewId()) {
				return false;
			} else if (this.isDeprioritized() != menuEntry.isDeprioritized()) {
				return false;
			} else {
				String option = this.getOption();
				String menuEntryOption = menuEntry.getOption();
				if (option == null) {
					if (menuEntryOption != null) {
						return false;
					}
				} else if (!option.equals(menuEntryOption)) {
					return false;
				}
				label55 : {
					String target = this.getTarget();
					String menuEntryTarget = menuEntry.getTarget();
					if (target == null) {
						if (menuEntryTarget != null) {
							return false;
						}
					} else if (!target.equals(menuEntryTarget)) {
						break label55;
					}
					return false;
				}
				MenuAction type = this.getType();
				MenuAction menuEntryType = menuEntry.getType();
				if (type == null) {
					if (menuEntryType == null) {
						return true;
					}
				} else if (type.equals(menuEntryType)) {
					return true;
				}
				return false;
			}
		}
	}

	@Override
	public boolean isItemOp() {
		MenuAction menuAction = this.getType();
		if (menuAction == MenuAction.CC_OP || menuAction == MenuAction.CC_OP_LOW_PRIORITY || menuAction == MenuAction.RUNELITE_WIDGET) {
			int identifier = this.getIdentifier();
			int param1 = this.getParam1();
			if (param1 == 9764864) {
				switch (identifier) {
					case 1 :
					case 2 :
					case 3 :
					case 4 :
					case 6 :
					case 7 :
						return true;
					case 5 :
				}
			}
		}
		return false;
	}

	@Override
	public int getItemOp() {
		MenuAction menuAction = this.getType();
		if (menuAction == MenuAction.CC_OP || menuAction == MenuAction.CC_OP_LOW_PRIORITY || menuAction == MenuAction.RUNELITE_WIDGET) {
			int identifier = this.getIdentifier();
			int param0 = this.getParam0();
			int param1 = this.getParam1();
			if (param1 == 9764864) {
				switch (identifier) {
					case 1 :
						Widget widget = client.getWidget(param1);
						if (widget != null && param0 != -1) {
							widget = widget.getChild(param0);
							if (widget != null && widget.getItemId() > -1) {
								int shiftClickActionIndex = client.getItemComposition(widget.getItemId()).getShiftClickActionIndex();
								if (shiftClickActionIndex >= 0) {
									return shiftClickActionIndex + 1;
								}
							}
						}
						break;
					case 2 :
						return 1;
					case 3 :
						return 2;
					case 4 :
						return 3;
					case 5 :
					default :
						break;
					case 6 :
						return 4;
					case 7 :
						return 5;
				}
			}
		}
		return -1;
	}

	@Override
	public MenuEntry setItemId(int itemId) {
		this.menu.menuItemIds[this.idx] = itemId;
		return this;
	}

	@Override
	public int getItemId() {
		return this.menu.menuItemIds[this.idx];
	}

	@Override
	public Widget getWidget() {
		int param1 = this.getParam1();
		int param0 = this.getParam0();
		Widget widget = client.getWidget(param1);
		if (widget == null) {
			return null;
		}
		if (param0 != -1) {
			Widget child = widget.getChild(param0);
			if (child != null) {
				return child;
			}
		}
		return widget;
	}

	@Override
	public NPC getNpc() {
		NPC[] npcs = client.getCachedNPCs();
		NPC npc = null;
		MenuAction menuAction = this.getType();
		if (menuAction == MenuAction.NPC_FIRST_OPTION || menuAction == MenuAction.NPC_SECOND_OPTION || menuAction == MenuAction.NPC_THIRD_OPTION || menuAction == MenuAction.NPC_FOURTH_OPTION || menuAction == MenuAction.NPC_FIFTH_OPTION || menuAction == MenuAction.WIDGET_TARGET_ON_NPC || menuAction == MenuAction.EXAMINE_NPC) {
			int identifier = this.getIdentifier();
			if (identifier >= 0 && identifier < npcs.length) {
				npc = npcs[identifier];
			}
		}
		return npc;
	}

	@Override
	public Player getPlayer() {
		Player[] players = client.getCachedPlayers();
		Player player = null;
		MenuAction menuAction = this.getType();
		if (menuAction == MenuAction.PLAYER_FIRST_OPTION || menuAction == MenuAction.PLAYER_SECOND_OPTION || menuAction == MenuAction.PLAYER_THIRD_OPTION || menuAction == MenuAction.PLAYER_FOURTH_OPTION || menuAction == MenuAction.PLAYER_FIFTH_OPTION || menuAction == MenuAction.PLAYER_SIXTH_OPTION || menuAction == MenuAction.PLAYER_SEVENTH_OPTION || menuAction == MenuAction.PLAYER_EIGHTH_OPTION || menuAction == MenuAction.WIDGET_TARGET_ON_PLAYER || menuAction == MenuAction.RUNELITE_PLAYER) {
			int identifier = this.getIdentifier();
			if (identifier >= 0 && identifier < players.length) {
				player = players[identifier];
			}
		}
		return player;
	}

	@Override
	public Actor getActor() {
		NPC npc = getNpc();
		if (npc != null) {
			return npc;
		}
		Player player = getPlayer();
		if (player != null) {
			return player;
		}
		return null;
	}

	@Override
	public int hashCode() {
		byte b = 1;
		int hash = b * 59 + this.getIdentifier();
		hash = hash * 59 + this.getParam0();
		hash = hash * 59 + this.getParam1();
		hash = hash * 59 + this.getItemId();
		hash = hash * 59 + (this.isForceLeftClick() ? 79 : 97);
		hash = hash * 59 + this.getWorldViewId();
		hash = hash * 59 + (this.isDeprioritized() ? 79 : 97);
		String option = this.getOption();
		hash = hash * 59 + (option == null ? 43 : option.hashCode());
		String target = this.getTarget();
		hash = hash * 59 + (target == null ? 43 : target.hashCode());
		MenuAction type = this.getType();
		hash = hash * 59 + (type == null ? 43 : type.hashCode());
		return hash;
	}

	@Override
	public String toString()
	{
		String option = this.getOption();
		return "MenuEntryImpl(getOption=" + option + ", getTarget=" + this.getTarget() + ", getIdentifier=" + this.getIdentifier() + ", getType=" + this.getType() + ", getParam0=" + this.getParam0() + ", getParam1=" + this.getParam1() + ", getItemId=" + this.getItemId() + ", isForceLeftClick=" + this.isForceLeftClick() + ", getWorldViewId=" + this.getWorldViewId() + ", isDeprioritized=" + this.isDeprioritized() + ")";
	}
}