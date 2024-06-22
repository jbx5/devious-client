package net.runelite.mixins;

import net.runelite.api.ScriptEvent;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.api.widgets.Widget;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSScriptEvent;

@Mixin(RSScriptEvent.class)
public abstract class RSScriptEventMixin implements RSScriptEvent
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	@Override
	public void run()
	{
		client.runScriptEvent(this);
	}

	@Inject
	@Override
	public Widget getTarget()
	{
		return this.getDragTarget();
	}

	@Inject
	@Override
	public ScriptEvent setTarget(Widget target)
	{
		this.setDragTarget(target);
		return this;
	}
}
