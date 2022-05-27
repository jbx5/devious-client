package net.unethicalite.client.devtools.widgetinspector;

import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;

import javax.swing.tree.DefaultMutableTreeNode;

import static net.runelite.api.widgets.WidgetInfo.TO_CHILD;
import static net.runelite.api.widgets.WidgetInfo.TO_GROUP;

class WidgetTreeNode extends DefaultMutableTreeNode
{
	private final String type;

	public WidgetTreeNode(String type, Widget widget)
	{
		super(widget);
		this.type = type;
	}

	public Widget getWidget()
	{
		return (Widget) getUserObject();
	}

	@Override
	public String toString()
	{
		Widget widget = getWidget();

		int id = widget.getId();
		String str = type + " " + TO_GROUP(id) + "." + TO_CHILD(id);

		if (widget.getIndex() != -1)
		{
			str += "[" + widget.getIndex() + "]";
		}

		WidgetInfo info = WidgetInspector.getWidgetInfo(id);
		if (info != null)
		{
			str += " " + info.name();
		}

		return str;
	}
}
