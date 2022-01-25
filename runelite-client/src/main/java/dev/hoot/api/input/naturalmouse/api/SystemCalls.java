package dev.hoot.api.input.naturalmouse.api;

import java.awt.*;

/**
 * Abstracts ordinary static System calls away
 */
public interface SystemCalls {
    long currentTimeMillis();

    void sleep(long time) throws InterruptedException;

    Dimension getScreenSize();

    void setMousePosition(int x, int y);
}
