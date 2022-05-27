package net.unethicalite.api.query;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public abstract class Query<T, Q, R> implements Predicate<T>
{
	protected final Supplier<List<T>> supplier;

	private Predicate<T> customFilter = null;

	protected Query(Supplier<List<T>> supplier)
	{
		this.supplier = supplier;
	}

	public R results()
	{
		return results(supplier.get().stream().filter(this).collect(Collectors.toList()));
	}

	public Q filter(Predicate<T> filter)
	{
		if (customFilter != null)
		{
			Predicate<? super T> old = customFilter;
			customFilter = t -> old.test(t) && filter.test(t);
		}
		else
		{
			customFilter = filter;
		}

		return (Q) this;
	}

	@Override
	public boolean test(T t)
	{
		return customFilter == null || customFilter.test(t);
	}

	protected abstract R results(List<T> list);
}
