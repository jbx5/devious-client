package net.unethicalite.api.query.results;

import net.unethicalite.api.SceneEntity;
import net.unethicalite.api.entities.Players;
import net.runelite.api.Locatable;
import net.runelite.api.coords.WorldPoint;

import java.util.Comparator;
import java.util.List;

public class SceneEntityQueryResults<T extends SceneEntity> extends QueryResults<T, SceneEntityQueryResults<T>>
{
	public SceneEntityQueryResults(List<T> results)
	{
		super(results);
	}

	public SceneEntityQueryResults<T> sortedByDistance(WorldPoint to)
	{
		return sorted(Comparator.comparingDouble(entity -> entity.distanceTo(to)));
	}

	public SceneEntityQueryResults<T> sortedByDistance(Locatable to)
	{
		return sortedByDistance(to.getWorldLocation());
	}

	public SceneEntityQueryResults<T> sortedByDistance()
	{
		return sortedByDistance(Players.getLocal());
	}

	public T nearest()
	{
		return sortedByDistance().first();
	}

	public T nearest(Locatable to)
	{
		return sortedByDistance(to).first();
	}

	public T nearest(WorldPoint to)
	{
		return sortedByDistance(to).first();
	}

	public T farthest()
	{
		return sortedByDistance().last();
	}

	public T farthest(Locatable locatable)
	{
		return sortedByDistance(locatable).last();
	}

	public T farthest(WorldPoint to)
	{
		return sortedByDistance(to).last();
	}
}
