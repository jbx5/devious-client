package dev.hoot.api.commons;

import java.util.concurrent.ThreadLocalRandom;

public class Rand {

    public static synchronized int nextInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }

    public static synchronized int nextInt() {
        return ThreadLocalRandom.current().nextInt();
    }

    public static synchronized boolean nextBool() {
        return ThreadLocalRandom.current().nextBoolean();
    }
}
