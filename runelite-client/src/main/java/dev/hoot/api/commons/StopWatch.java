package dev.hoot.api.commons;

import java.time.Duration;
import java.time.Instant;
import java.util.function.Supplier;

public class StopWatch {
    private Instant start;
    private Instant end;

    private StopWatch(Supplier<Instant> supplier, Duration duration) {
        start = supplier.get();
        if (duration != null) {
            end = start.plus(duration);
        }
    }

    public static StopWatch start(Supplier<Instant> supplier) {
        return new StopWatch(supplier, null);
    }

    public static StopWatch start() {
        return start(Instant::now);
    }

    public boolean exceeds(Duration duration) {
        return getElapsed().getSeconds() > duration.getSeconds();
    }

    public void setEndIn(Duration duration) {
        end = Instant.now().plus(duration);
    }

    public boolean isRunning() {
        return end == null || Instant.now().isBefore(end);
    }

    public Duration getElapsed() {
        return Duration.between(start, Instant.now());
    }

    public Duration getRemaining() {
        return end != null ? Duration.between(end, Instant.now()) : Duration.ZERO;
    }

    public String toElapsedString() {
        return Time.format(getElapsed());
    }

    public String toRemainingString() {
        return Time.format(getRemaining());
    }

    public void reset() {
        Instant prevStart = start;
        start = Instant.now();
        if (end != null) {
            Duration duration = Duration.between(prevStart, end);
            setEndIn(duration);
        }
    }

    public double getRate(long value, Duration rate) {
        long elapsed = getElapsed().toMillis();
        if (elapsed == 0) {
            return 0;
        }

        return (double) (value * rate.toMillis() / getElapsed().toMillis());
    }

    public double getHourlyRate(long value) {
        return getRate(value, Duration.ofHours(1));
    }
}
