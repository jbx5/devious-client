package dev.hoot.api.items;

import net.runelite.api.Item;

import java.util.List;
import java.util.function.Predicate;

public abstract class Items {
	protected abstract List<Item> all(Predicate<Item> filter);

	public List<Item> all(String... names) {
		return all(x -> {
			if (x.getName() == null) {
				return false;
			}

			for (String name : names) {
				if (name.equals(x.getName())) {
					return true;
				}
			}

			return false;
		});
	}

	public List<Item> all(int... ids) {
		return all(x -> {
			for (int id : ids) {
				if (id == x.getId()) {
					return true;
				}
			}

			return false;
		});
	}

	public Item first(Predicate<Item> filter) {
		return all(filter).stream().findFirst().orElse(null);
	}

	public Item first(int... ids) {
		return first(x -> {
			for (int id : ids) {
				if (id == x.getId()) {
					return true;
				}
			}

			return false;
		});
	}

	public Item first(String... names) {
		return first(x -> {
			if (x.getName() == null) {
				return false;
			}

			for (String name : names) {
				if (name.equals(x.getName())) {
					return true;
				}
			}

			return false;
		});
	}

	public boolean exists(Predicate<Item> filter) {
		return first(filter) != null;
	}

	public boolean exists(String name) {
		return first(name) != null;
	}

	public boolean exists(int id) {
		return first(id) != null;
	}
}
