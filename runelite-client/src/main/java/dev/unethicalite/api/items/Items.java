package dev.unethicalite.api.items;

import dev.unethicalite.api.commons.Predicates;
import net.runelite.api.Item;

import java.util.List;
import java.util.function.Predicate;

public abstract class Items
{
	protected abstract List<Item> all(Predicate<Item> filter);

	protected List<Item> all(String... names)
	{
		return all(Predicates.names(names));
	}

	protected List<Item> all(int... ids)
	{
		return all(Predicates.ids(ids));
	}

	protected Item first(Predicate<Item> filter)
	{
		return all(filter).stream().findFirst().orElse(null);
	}

	protected Item first(int... ids)
	{
		return first(Predicates.ids(ids));
	}

	protected Item first(String... names)
	{
		return first(Predicates.names(names));
	}

	protected boolean exists(Predicate<Item> filter)
	{
		return first(filter) != null;
	}

	protected boolean exists(String... name)
	{
		return first(name) != null;
	}

	protected boolean exists(int... id)
	{
		return first(id) != null;
	}

	protected int count(boolean stacks, Predicate<Item> filter)
	{
		return all(filter).stream().mapToInt(x -> stacks ? x.getQuantity() : 1).sum();
	}

	protected int count(boolean stacks, int... ids)
	{
		return all(ids).stream().mapToInt(x -> stacks ? x.getQuantity() : 1).sum();
	}

	protected int count(boolean stacks, String... names)
	{
		return all(names).stream().mapToInt(x -> stacks ? x.getQuantity() : 1).sum();
	}
}
