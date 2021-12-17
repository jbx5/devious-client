package dev.hoot.api.entities;

import dev.hoot.api.game.Game;
import net.runelite.api.Actor;
import net.runelite.api.Projectile;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Projectiles {
	public static List<Projectile> getAll(Predicate<Projectile> filter) {
		return Game.getClient().getProjectiles().stream()
						.filter(projectile -> projectile != null && filter.test(projectile))
						.collect(Collectors.toList());
	}

	public static List<Projectile> getAll(int... ids) {
		return getAll(x -> {
			for (int id : ids) {
				if (id == x.getId()) {
					return true;
				}
			}

			return false;
		});
	}

	public static Projectile getNearest(Predicate<Projectile> filter) {
		return getAll(filter).stream()
						.min(Comparator.comparingInt(p ->
										WorldPoint.fromLocal(Game.getClient(), (int) p.getX(), (int) p.getY(), Game.getClient().getPlane())
														.distanceTo(Players.getLocal().getWorldLocation()))
						)
						.orElse(null);
	}

	public static Projectile getNearest(int... ids) {
		return getNearest(x -> {
			for (int id : ids) {
				if (id == x.getId()) {
					return true;
				}
			}

			return false;
		});
	}

	public static Projectile getNearest(Actor target) {
		return getNearest(x -> x.getInteracting() != null && x.getInteracting().equals(target));
	}

	public static Projectile getNearest(WorldPoint startPoint) {
		LocalPoint localPoint = LocalPoint.fromWorld(Game.getClient(), startPoint);
		if (localPoint == null) {
			return null;
		}

		return getNearest(x -> x.getX1() == localPoint.getX() && x.getY1() == localPoint.getY());
	}
}
