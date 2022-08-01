package net.unethicalite.api.commons;

import net.runelite.api.TileObject;
import net.unethicalite.api.EntityNameable;
import net.unethicalite.api.Identifiable;

import java.util.Collection;
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

	public static Predicate<String> texts(String... texts)
	{
		return t ->
		{
			for (String text : texts)
			{
				if (t != null && t.equals(text))
				{
					return true;
				}
			}

			return false;
		};
	}

	public static Predicate<String> textContains(String subString, boolean caseSensitive)
	{
		return t ->
		{
			if (caseSensitive)
			{
				return t.contains(subString);
			}
			else
			{
				return t.toLowerCase().contains(subString.toLowerCase());
			}
		};
	}

	public static Predicate<String> textContains(String subString)
	{
		return textContains(subString, true);
	}

	public static <T extends EntityNameable> Predicate<T> names(Collection<String> names)
	{
		return t -> names.contains(t.getName());
	}

	public static <T extends EntityNameable> Predicate<T> nameContains(String subString, boolean caseSensitive)
	{
		return t ->
		{
			if (t.getName() == null)
			{
				return false;
			}

			if (caseSensitive)
			{
				return t.getName().contains(subString);
			}
			else
			{
				return t.getName().toLowerCase().contains(subString.toLowerCase());
			}
		};
	}

	public static <T extends EntityNameable> Predicate<T> nameContains(String subString)
	{
		return nameContains(subString, true);
	}

	public static <T extends EntityNameable> Predicate<T> nameContains(Collection<String> subStrings, boolean caseSensitive)
	{
		return t ->
		{
			if (t.getName() == null)
			{
				return false;
			}

			for (String subString : subStrings)
			{
				if (caseSensitive)
				{
					if (t.getName().contains(subString))
					{
						return true;
					}
				}
				else
				{
					if (t.getName().toLowerCase().contains(subString.toLowerCase()))
					{
						return true;
					}
				}
			}

			return false;
		};
	}

	public static <T extends EntityNameable> Predicate<T> nameContains(Collection<String> subStrings)
	{
		return nameContains(subStrings, true);
	}

	public static <T extends Identifiable> Predicate<T> ids(int... ids)
	{
		return t ->
		{
			for (int id : ids)
			{
				if (t.getId() == id || (t instanceof TileObject && ((TileObject) t).getActualId() == id))
				{
					return true;
				}
			}

			return false;
		};
	}

	public static <T extends Identifiable> Predicate<T> ids(Collection<Integer> ids)
	{
		return t -> t instanceof TileObject ? ids.contains(((TileObject) t).getActualId()) || ids.contains(t.getId()) : ids.contains(t.getId());
	}
}
