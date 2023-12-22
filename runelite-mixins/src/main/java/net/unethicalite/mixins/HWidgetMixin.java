package net.unethicalite.mixins;

import java.util.Arrays;
import net.unethicalite.api.events.MenuAutomated;
import net.unethicalite.api.util.Randomizer;
import net.unethicalite.api.util.Text;
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
	private boolean visible = !isHidden();

	@Inject
	@Override
	public int getActionOpcode(int actionIndex)
	{
		switch (getType())
		{
			case WidgetType.GRAPHIC:
				return getTargetVerb() == null || getTargetVerb().isEmpty() || Arrays.asList(getActions()).contains("Cast") && !getTargetVerb().startsWith("Cast")
						? MenuAction.CC_OP.getId() : MenuAction.WIDGET_TARGET.getId();
			case WidgetType.INVENTORY:
				return MenuAction.WIDGET_TARGET.getId();
			case WidgetType.TEXT:
				return MenuAction.WIDGET_CONTINUE.getId();
			default:
				return MenuAction.CC_OP.getId();
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
			case WidgetType.GRAPHIC:
				return getTargetVerb() == null || getTargetVerb().isEmpty() || Arrays.asList(getActions()).contains("Cast")  && !getTargetVerb().startsWith("Cast") ? actionIndex + 1 : 0;
			case WidgetType.TEXT:
				return 0;
			default:
				return actionIndex + 1;
		}
	}

	@Inject
	public Point getClickPoint()
	{
		return Randomizer.getRandomPointIn(getBounds());
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

	@Override
	@Inject
	public String[] getActions()
	{
		String[] rawActions = getRawActions();
		if (rawActions == null)
		{
			return null;
		}

		String[] sanitized = new String[rawActions.length];
		for (int i = 0; i < rawActions.length; i++)
		{
			sanitized[i] = Text.sanitize(rawActions[i]);
		}

		return sanitized;
	}

	@Inject
	@FieldHook("isHidden")
	public void onHiddenChanged(int idx)
	{
		broadcastHidden(isHidden());
	}

	@Inject
	public MenuAutomated getMenu(int actionIndex)
	{
		return getMenu(actionIndex, getActionOpcode(actionIndex));
	}

	@Inject
	public MenuAutomated getMenu(int actionIndex, int opcode)
	{
		return getMenu(getMenuIdentifier(actionIndex), opcode, getIndex(), getId(), getItemId());
	}
}
