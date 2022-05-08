package dev.unethicalite.api.query;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public abstract class Query<T, Q, R> implements Predicate<T>
{
	protected final Supplier<List<T>> supplier;

	private Predicate<T> filter = null;

	protected Query(Supplier<List<T>> supplier)
	{
		this.supplier = supplier;
	}

	public R results()
	{
		return results(supplier.get());
	}

	public Q filter(Predicate<T> filter)
	{
		this.filter = filter;
		return (Q) this;
	}

	@Override
	public boolean test(T t)
	{
		return filter == null || filter.test(t);
	}

	protected abstract R results(List<T> list);
}
