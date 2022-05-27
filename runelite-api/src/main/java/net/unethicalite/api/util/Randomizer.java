package net.unethicalite.api.util;

import net.runelite.api.Point;

import java.awt.Rectangle;
import java.util.concurrent.ThreadLocalRandom;

public class Randomizer
{

    public static Point getRandomPointIn(Rectangle rect)
    {
        if (rect == null)
        {
            return new Point(0, 0);
        }

        int xDeviation = (int) Math.log(rect.getWidth() * Math.PI);
        int yDeviation = (int) Math.log(rect.getHeight() * Math.PI);
        return getRandomPointIn(rect, xDeviation, yDeviation);
    }

    public static Point getRandomPointIn(Rectangle rect, int xDeviation, int yDeviation)
    {
        double centerX = rect.getCenterX();
        double centerY = rect.getCenterY();

        double randX = Math.max(
                Math.min(centerX + xDeviation * ThreadLocalRandom.current().nextGaussian(), rect.getMaxX()),
                rect.getMinX());

        double randY = Math.max(
                Math.min(centerY + yDeviation * ThreadLocalRandom.current().nextGaussian(), rect.getMaxY()),
                rect.getMinY());

        return new Point((int) randX, (int) randY);
    }
}
