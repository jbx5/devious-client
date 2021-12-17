package dev.hoot.api.statistics;

import dev.hoot.api.commons.NumericFormat;
import dev.hoot.api.commons.StopWatch;

import java.util.function.Supplier;

public final class Statistic {
	private final boolean header;
	private final Supplier<String> supplier;

	public Statistic(boolean header, Supplier<String> supplier) {
		this.header = header;
		this.supplier = supplier;
	}

	public Statistic(Supplier<String> supplier) {
		this(false, supplier);
	}

	public Statistic(StopWatch timer, Supplier<Integer> rate, boolean format) {
		this(false, () -> {
			int value = rate.get();
			long hourly = (long) timer.getHourlyRate(value);
			String valueText = format ? NumericFormat.apply(value) : String.valueOf(value);
			String hourlyText = format ? NumericFormat.apply(hourly) : String.valueOf(hourly);

			return valueText + " (" + hourlyText + " / hr)";
		});
	}

	public Statistic(StopWatch timer, Supplier<Integer> rate) {
		this(timer, rate, true);
	}

	public boolean isHeader() {
		return header;
	}

	public Supplier<String> getSupplier() {
		return supplier;
	}

	@Override
	public String toString() {
		return supplier.get();
	}
}
