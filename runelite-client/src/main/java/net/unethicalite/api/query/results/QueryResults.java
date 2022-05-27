package net.unethicalite.api.query.results;

import net.unethicalite.api.commons.Rand;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public abstract class QueryResults<T, R> implements Collection<T>
{
	protected final List<T> results;

	public QueryResults(List<T> results)
	{
		this.results = results;
	}

	public T get(int index)
	{
		return results.get(index);
	}

	public boolean isEmpty()
	{
		return size() == 0;
	}

	public final R sorted(Comparator<? super T> comparator)
	{
		results.sort(comparator);
		return (R) this;
	}

	public int lastIndexOf(T o)
	{
		return results.lastIndexOf(o);
	}

	public boolean addAll(Collection<? extends T> c)
	{
		return results.addAll(c);
	}

	public final R limit(int startIndex, int amount)
	{
		List<T> limit = new ArrayList<>(amount);

		for (int i = startIndex; i < size() && i - startIndex < amount; i++)
		{
			limit.add(get(i));
		}

		results.retainAll(limit);
		return (R) this;
	}

	public List<T> list()
	{
		return results;
	}

	public void clear()
	{
		results.clear();
	}

	public int size()
	{
		return results.size();
	}

	public boolean removeAll(Collection<?> c)
	{
		return results.removeAll(c);
	}

	public boolean remove(Object o)
	{
		return results.remove(o);
	}

	public boolean add(T t)
	{
		return results.add(t);
	}

	public final R reversed()
	{
		Collections.reverse(results);
		return (R) this;
	}

	public T first()
	{
		return this.size() == 0 ? null : this.get(0);
	}

	public int indexOf(T o)
	{
		return results.indexOf(o);
	}

	public final boolean accept(Consumer<T> consumer, Function<R, T> target)
	{
		T value = target.apply((R) this);
		if (value != null)
		{
			consumer.accept(value);
			return true;
		}

		return false;
	}

	public final T random()
	{
		int index = size() - 1;
		return index != -1 ? get(Rand.nextInt(0, index)) : null;
	}

	public boolean contains(Object o)
	{
		return results.contains(o);
	}

	public final R shuffled()
	{
		Collections.shuffle(results);
		return (R) this;
	}

	public boolean containsAll(Collection<?> c)
	{
		return new HashSet<>(results).containsAll(c);
	}

	public Iterator<T> iterator()
	{
		return results.iterator();
	}

	public final R limit(int entries)
	{
		return limit(0, entries);
	}

	public final T last()
	{
		int index = size() - 1;
		return index != -1 ? get(index) : null;
	}

	@Deprecated
	public Object[] toArray()
	{
		return results.toArray();
	}

	public T[] toArray(Object[] o)
	{
		return (T[]) results.toArray(o);
	}

	public boolean retainAll(Collection<?> c)
	{
		return results.retainAll(c);
	}
}
