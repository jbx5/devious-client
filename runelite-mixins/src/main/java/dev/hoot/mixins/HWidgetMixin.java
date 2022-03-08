package dev.hoot.mixins;

import dev.hoot.api.events.AutomatedMenu;
import dev.hoot.api.util.Randomizer;
import net.runelite.api.MenuAction;
import net.runelite.api.Point;
import net.runelite.api.mixins.FieldHook;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.api.widgets.WidgetType;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSWidget;

@Mixin(RSWidget.class)
public abstract class HWidgetMixin implements RSWidget
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	private boolean visible = isHidden();

	@Inject
	@Override
	public int getActionOpcode(int actionIndex)
	{
		switch (getType())
		{
			case WidgetType.LAYER:
			case WidgetType.RECTANGLE:
				return MenuAction.CC_OP.getId();
			case WidgetType.GRAPHIC:
				return getTargetVerb() == null || getTargetVerb().isEmpty()
						? MenuAction.CC_OP.getId() : MenuAction.WIDGET_TYPE_2.getId();
			case WidgetType.INVENTORY:
				return MenuAction.WIDGET_TYPE_2.getId();
			case WidgetType.TEXT:
				return MenuAction.WIDGET_TYPE_6.getId();
			case WidgetType.MODEL:
				return MenuAction.WIDGET_TYPE_1.getId();
			default:
				throw new IllegalArgumentException("Widget: no identifier for " + actionIndex);
		}
	}

	@Inject
	@Override
	public void interact(int index)
	{
		interact(index, getActionOpcode(index));
	}

	@Inject
	@Override
	public void interact(int index, int opcode)
	{
		interact(getMenuIdentifier(index), opcode, getIndex(), getId());
	}

	@Inject
	@Override
	public void interact(int identifier, int opcode, int param0, int param1)
	{
		client.interact(getMenu(identifier, opcode, param0, param1));
	}

	@Inject
	public int getMenuIdentifier(int actionIndex)
	{
		switch (getType())
		{
			case WidgetType.LAYER:
			case WidgetType.RECTANGLE:
				return actionIndex + 1;
			case WidgetType.GRAPHIC:
				return getTargetVerb() == null || getTargetVerb().isEmpty() ? actionIndex + 1 : 0;
			case WidgetType.TEXT:
			case WidgetType.MODEL:
				return 0;
			default:
				throw new IllegalArgumentException("Widget: no identifier for " + actionIndex);
		}
	}

	@Inject
	public Point getClickPoint()
	{
		java.awt.Point point = Randomizer.getRandomPointIn(getBounds());
		return new Point(point.x, point.y);
	}

	@Inject
	public boolean isVisible()
	{
		return visible;
	}

	@Inject
	public void setVisible(boolean visible)
	{
		this.visible = visible;
	}

	@Inject
	@FieldHook("isHidden")
	public void onHiddenChanged(int idx)
	{
		broadcastHidden(isHidden());
	}

	@Inject
	public AutomatedMenu getMenu(int actionIndex)
	{
		return getMenu(actionIndex, getActionOpcode(actionIndex));
	}

	@Inject
	public AutomatedMenu getMenu(int actionIndex, int opcode)
	{
		return getMenu(getMenuIdentifier(actionIndex), opcode, getIndex(), getId());
	}
}
