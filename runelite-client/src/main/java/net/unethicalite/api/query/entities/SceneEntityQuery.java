package net.unethicalite.api.query.entities;

import net.unethicalite.api.SceneEntity;
import net.unethicalite.api.commons.Predicates;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.query.Query;
import net.unethicalite.api.query.results.SceneEntityQueryResults;
import net.runelite.api.Locatable;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public abstract class SceneEntityQuery<T extends SceneEntity, Q extends SceneEntityQuery<T, Q>>
		extends Query<T, Q, SceneEntityQueryResults<T>>
{
	private Integer maxDistance = null;
	private WorldPoint distanceSrc = null;
	private int[] ids = null;
	private String[] names = null;
	private String[] actions = null;
	private WorldPoint[] locations = null;
	private LocalPoint[] localLocations = null;

	protected SceneEntityQuery(Supplier<List<T>> supplier)
	{
		super(supplier);
	}

	public Q ids(int... ids)
	{
		this.ids = ids;
		return (Q) this;
	}

	public Q names(String... names)
	{
		this.names = names;
		return (Q) this;
	}

	public Q actions(String... actions)
	{
		this.actions = actions;
		return (Q) this;
	}

	public Q locations(WorldPoint... locations)
	{
		this.locations = locations;
		return (Q) this;
	}

	public Q localLocations(LocalPoint... localLocations)
	{
		this.localLocations = localLocations;
		return (Q) this;
	}

	public Q distance(Locatable source, int maxDistance)
	{
		return this.distance(source.getWorldLocation(), maxDistance);
	}

	public Q distance(WorldPoint source, int maxDistance)
	{
		this.distanceSrc = source;
		this.maxDistance = maxDistance;
		return (Q) this;
	}

	public Q distance(int maxDistance)
	{
		this.maxDistance = maxDistance;
		return (Q) this;
	}

	@Override
	public boolean test(T t)
	{
		if (ids != null && !ArrayUtils.contains(ids, t.getId()))
		{
			return false;
		}

		if (names != null && !ArrayUtils.contains(names, t.getName()))
		{
			return false;
		}

		if (locations != null && !ArrayUtils.contains(locations, t.getWorldLocation()))
		{
			return false;
		}

		if (localLocations != null && !ArrayUtils.contains(localLocations, t.getLocalLocation()))
		{
			return false;
		}

		if (actions != null && Arrays.stream(actions).noneMatch(Predicates.texts(t.getActions())))
		{
			return false;
		}

		if (maxDistance != null)
		{
			if (distanceSrc == null)
			{
				distanceSrc = Players.getLocal().getWorldLocation();
			}

			if (distanceSrc.distanceTo(t.getWorldLocation()) > maxDistance)
			{
				return false;
			}
		}

		return super.test(t);
	}
}
