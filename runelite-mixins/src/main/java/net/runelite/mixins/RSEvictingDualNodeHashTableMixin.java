package net.runelite.mixins;

import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSEvictingDualNodeHashTable;
import net.runelite.rs.api.RSIterableNodeHashTable;

@Mixin(RSEvictingDualNodeHashTable.class)
public abstract class RSEvictingDualNodeHashTableMixin implements RSEvictingDualNodeHashTable
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	public float threshold;

	@Inject
	public int tmpCapacity;

	@Inject
	RSEvictingDualNodeHashTableMixin()
	{
		setTmpCapacity(this.getCapacity());
	}

	@Inject
	public float getThreshold()
	{
		return threshold;
	}

	@Inject
	public void setThreshold(float threshold)
	{
		this.threshold = threshold;
	}

	@Inject
	public int getTmpCapacity()
	{
		return tmpCapacity;
	}

	@Inject
	public void setTmpCapacity(int tmpCapacity)
	{
		this.tmpCapacity = tmpCapacity;
	}

	@Inject
	public boolean isTrashing()
	{
		return this.getRemainingCapacity() <= 0 && this.getDualNode().previousDual() == null;
	}

	@Inject
	public void resize(int newSize)
	{
		this.increaseCapacity(newSize);
		this.tmpCapacity = this.getCapacity();
	}

	@Inject
	public void increaseCapacity(int newSize)
	{
		if (newSize > this.getCapacity())
		{
			int i;

			for (i = 1; i < newSize; i += i)
			{
				// ignore
			}

			this.setCapacity(i);
			this.reset();

			RSIterableNodeHashTable iterableNodeHashTable = client.createIterableNodeHashTable(i);
			this.setHashTable(iterableNodeHashTable);
		}
	}

	@Inject
	public static void check(String name, RSEvictingDualNodeHashTable dualNodeHashTable)
	{
		boolean var3 = dualNodeHashTable.isTrashing();
		dualNodeHashTable.setThreshold(dualNodeHashTable.getThreshold() * 0.92F + (var3 ? 0.07999998F : 0.0F));
		if (var3)
		{
			if (dualNodeHashTable.getThreshold() > 0.2F)
			{
				client.getLogger().trace("cache {} is thrashing", name);
			}

			if (dualNodeHashTable.getThreshold() > 0.9F && dualNodeHashTable.getCapacity() < dualNodeHashTable.getTmpCapacity() * 8)
			{
				dualNodeHashTable.increaseCapacity(dualNodeHashTable.getCapacity() * 2);
				client.getLogger().info("cache {} thrashing, enlarging to {} entries", name, dualNodeHashTable.getCapacity());
			}
		}

		dualNodeHashTable.getDeque().add(dualNodeHashTable.getDualNode());
	}
}
