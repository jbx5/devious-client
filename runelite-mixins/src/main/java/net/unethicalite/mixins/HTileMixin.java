package net.unethicalite.mixins;

import net.runelite.api.MenuAction;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSTile;

@Mixin(RSTile.class)
public abstract class HTileMixin implements RSTile
{
	@Shadow("client")
	private static RSClient client;

	@Override
	@Inject
	public void walkHere()
	{
		client.interact(0, MenuAction.WALK.getId(), getX(), getY());
	}

	@Override
	@Inject
	public int getWorldX()
	{
		return getX() + client.getBaseX();
	}

	@Override
	@Inject
	public int getWorldY()
	{
		return getY() + client.getBaseY();
	}
}
