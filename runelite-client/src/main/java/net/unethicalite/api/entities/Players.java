package net.unethicalite.api.entities;

import net.unethicalite.api.query.entities.PlayerQuery;
import net.unethicalite.client.Static;
import net.runelite.api.Player;
import net.runelite.api.coords.WorldPoint;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Players extends Entities<Player>
{
	private Players()
	{
	}

	private static final Players PLAYERS = new Players();

	@Override
	protected List<Player> all(Predicate<? super Player> filter)
	{
		return Static.getClient().getPlayers()
				.stream()
				.filter(filter)
				.collect(Collectors.toList());
	}

	public static PlayerQuery query()
	{
		return query(Players::getAll);
	}

	public static PlayerQuery query(Supplier<List<Player>> supplier)
	{
		return new PlayerQuery(supplier);
	}

	public static List<Player> getAll()
	{
		return getAll(player -> true);
	}

	public static List<Player> getAll(Predicate<Player> filter)
	{
		return PLAYERS.all(filter);
	}

	public static List<Player> getAll(String... names)
	{
		return PLAYERS.all(names);
	}

	public static Player getNearest(Predicate<Player> filter)
	{
		return getNearest(getLocal().getWorldLocation(), filter);
	}

	public static Player getNearest(String... names)
	{
		return getNearest(getLocal().getWorldLocation(), names);
	}

	public static Player getNearest(WorldPoint to, Predicate<Player> filter)
	{
		return PLAYERS.nearest(to, filter);
	}

	public static Player getNearest(WorldPoint to, String... names)
	{
		return PLAYERS.nearest(to, names);
	}

	public static Player getHintArrowed()
	{
		return Static.getClient().getHintArrowPlayer();
	}

	public static Player getLocal()
	{
		Player local = Static.getClient().getLocalPlayer();
		if (local == null)
		{
			throw new IllegalStateException("Local player was null, are you logged in?");
		}

		return local;
	}
}
