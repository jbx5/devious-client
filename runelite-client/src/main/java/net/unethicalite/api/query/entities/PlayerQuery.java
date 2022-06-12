package net.unethicalite.api.query.entities;

import net.unethicalite.api.query.results.SceneEntityQueryResults;
import net.runelite.api.Player;
import org.apache.commons.lang3.ArrayUtils;

import java.util.List;
import java.util.function.Supplier;

public class PlayerQuery extends ActorQuery<Player, PlayerQuery>
{
	private int[] pids = null;

	public PlayerQuery(Supplier<List<Player>> supplier)
	{
		super(supplier);
	}

	public PlayerQuery playerIds(int... pids)
	{
		this.pids = pids;
		return this;
	}

	@Override
	protected SceneEntityQueryResults<Player> results(List<Player> list)
	{
		return new SceneEntityQueryResults<>(list);
	}

	@Override
	public boolean test(Player player)
	{
		if (pids != null && !ArrayUtils.contains(pids, player.getIndex()))
		{
			return false;
		}

		return super.test(player);
	}
}
