package net.unethicalite.mixins;

import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.rs.api.RSPacketBuffer;

@Mixin(RSPacketBuffer.class)
public abstract class HPacketBufferMixin implements RSPacketBuffer
{
	@Inject
	private boolean automated = false;

	@Inject
	public boolean isAutomated()
	{
		return automated;
	}

	@Inject
	public void setAutomated(boolean modified)
	{
		this.automated = modified;
	}
}
