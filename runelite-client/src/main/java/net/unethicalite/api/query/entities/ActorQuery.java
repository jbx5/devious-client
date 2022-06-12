package net.unethicalite.api.query.entities;

import net.unethicalite.api.Interactable;
import net.runelite.api.Actor;
import org.apache.commons.lang3.ArrayUtils;

import java.util.List;
import java.util.function.Supplier;

public abstract class ActorQuery<T extends Actor, Q extends ActorQuery<T, Q>>
		extends SceneEntityQuery<T, Q>
{
	private int[] levels = null;
	private int[] animations = null;
	private Interactable[] targeting = null;
	private Boolean moving = null;

	protected ActorQuery(Supplier<List<T>> supplier)
	{
		super(supplier);
	}

	public Q levels(int... levels)
	{
		this.levels = levels;
		return (Q) this;
	}

	public Q animations(int... animations)
	{
		this.animations = animations;
		return (Q) this;
	}

	public Q targeting(Interactable... targets)
	{
		this.targeting = targets;
		return (Q) this;
	}

	public Q moving(Boolean moving)
	{
		this.moving = moving;
		return (Q) this;
	}

	@Override
	public boolean test(T t)
	{
		if (levels != null && ArrayUtils.contains(levels, t.getCombatLevel()))
		{
			return false;
		}

		if (animations != null && ArrayUtils.contains(animations, t.getAnimation()))
		{
			return false;
		}

		if (moving != null && moving != t.isMoving())
		{
			return false;
		}

		if (targeting != null && !ArrayUtils.contains(targeting, t.getInteracting()))
		{
			return false;
		}

		return super.test(t);
	}
}
