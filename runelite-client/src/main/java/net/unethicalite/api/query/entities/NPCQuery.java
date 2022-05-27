package net.unethicalite.api.query.entities;

import net.unethicalite.api.query.results.SceneEntityQueryResults;
import net.runelite.api.NPC;
import org.apache.commons.lang3.ArrayUtils;

import java.util.List;
import java.util.function.Supplier;

public class NPCQuery extends ActorQuery<NPC, NPCQuery>
{
	private int[] indices = null;

	public NPCQuery(Supplier<List<NPC>> supplier)
	{
		super(supplier);
	}

	public NPCQuery indices(int... indices)
	{
		this.indices = indices;
		return this;
	}

	@Override
	protected SceneEntityQueryResults<NPC> results(List<NPC> list)
	{
		return new SceneEntityQueryResults<>(list);
	}

	@Override
	public boolean test(NPC npc)
	{
		if (indices != null && !ArrayUtils.contains(indices, npc.getIndex()))
		{
			return false;
		}

		return super.test(npc);
	}
}
