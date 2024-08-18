package net.runelite.rs.api;

import net.runelite.api.Menu;
import net.runelite.mapping.Construct;
import net.runelite.mapping.Import;

public interface RSMenu extends Menu
{
	@Import("menuOptionsCount")
	int getMenuOptionCount();

	@Import("menuOptionsCount")
	void setMenuOptionCount(int menuOptionCount);

	@Import("menuArguments1")
	int[] getMenuArguments1();

	@Import("menuArguments2")
	int[] getMenuArguments2();

	@Import("menuOpcodes")
	int[] getMenuOpcodes();

	@Import("menuIdentifiers")
	int[] getMenuIdentifiers();

	@Import("menuItemIds")
	int[] getMenuItemIds();

	@Import("menuWorldViewIds")
	int[] getMenuWorldViewIds();

	@Import("menuActions")
	String[] getMenuOptions();

	@Import("menuTargets")
	String[] getMenuTargets();

	@Import("subMenus")
	RSMenu[] getSubMenus();

	@Import("menuShiftClick")
	boolean[] getMenuForceLeftClick();

	@Import("menuX")
	@Override
	int getMenuX();

	@Import("menuY")
	@Override
	int getMenuY();

	@Import("menuWidth")
	@Override
	int getMenuWidth();

	@Import("menuHeight")
	@Override
	int getMenuHeight();

	@Import("menuX")
	void setMenuX(int x);

	@Import("menuY")
	void setMenuY(int y);

	@Import("menuWidth")
	void setMenuWidth(int w);

	@Import("menuHeight")
	void setMenuHeight(int h);

	@Import("insertMenuItem")
	int rsInsertMenuItem(String action, String target, int opcode, int identifier, int argument1, int argument2, int itemId, boolean forceLeftClick, int worldViewId);

	@Import("invalidateWidgetsUnder")
	void invalidateWidgetsUnder();

	@Construct
	RSRuneLiteMenuEntry newRSRuneLiteMenuEntry(RSMenu menu, int idx);
}
