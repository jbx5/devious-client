package dev.hoot.api.commons;

import dev.hoot.api.game.Game;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;
import java.util.function.BooleanSupplier;

public class Time {
    private static final Logger logger = LoggerFactory.getLogger(Time.class);
    private static final int DEFAULT_POLLING_RATE = 100;

    public static void sleep(long ms) {
        if (Game.getClient().isClientThread()) {
            logger.debug("Tried to sleep on client thread!");
            return;
        }

        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void sleep(int min, int max) {
        sleep(Rand.nextInt(min, max));
    }

    public static void sleepUntil(BooleanSupplier supplier, int pollingRate, int timeOut) {
        if (Game.getClient().isClientThread()) {
            logger.debug("Tried to sleep on client thread!");
            return;
        }

        long start = System.currentTimeMillis();
        while (!supplier.getAsBoolean()) {
            if (System.currentTimeMillis() > start + timeOut) {
                break;
            }

            sleep(pollingRate);
        }
    }

    public static void sleepUntil(BooleanSupplier supplier, int timeOut) {
        sleepUntil(supplier, DEFAULT_POLLING_RATE, timeOut);
    }

    public static String format(Duration duration) {
        long secs = Math.abs(duration.getSeconds());
        return String.format("%02d:%02d:%02d", secs / 3600L, secs % 3600L / 60L, secs % 60L);
    }
}
