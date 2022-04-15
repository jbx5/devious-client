package dev.unethicalite.api.commons;

import dev.unethicalite.api.EntityNameable;
import dev.unethicalite.api.Identifiable;

import java.util.function.Predicate;

public class Predicates
{
	public static <T extends EntityNameable> Predicate<T> names(String... names)
	{
		return t ->
		{
			if (t.getName() == null)
			{
				return false;
			}

			for (String name : names)
			{
				if (t.getName().equals(name))
				{
					return true;
				}
			}

			return false;
		};
	}

	public static <T extends Identifiable> Predicate<T> ids(int... ids)
	{
		return t ->
		{
			for (int id : ids)
			{
				if (t.getId() == id)
				{
					return true;
				}
			}

			return false;
		};
	}
}
