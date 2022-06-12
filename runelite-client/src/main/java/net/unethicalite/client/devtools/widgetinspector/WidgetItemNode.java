package net.unethicalite.client.devtools.widgetinspector;

import net.runelite.api.widgets.WidgetItem;

import javax.swing.tree.DefaultMutableTreeNode;

class WidgetItemNode extends DefaultMutableTreeNode
{
	private final WidgetItem widgetItem;

	public WidgetItemNode(WidgetItem widgetItem)
	{
		super(widgetItem);
		this.widgetItem = widgetItem;
	}

	public WidgetItem getWidgetItem()
	{
		return widgetItem;
	}

	@Override
	public String toString()
	{
		return "I " + widgetItem.getIndex();
	}
}
