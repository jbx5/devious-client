package dev.hoot.mixins;

import dev.hoot.api.util.Randomizer;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSActor;
import net.runelite.rs.api.RSClient;

import java.awt.*;

@Mixin(RSActor.class)
public abstract class HActorMixin implements RSActor
{

    @Shadow("client")
    private static RSClient client;

    @Inject
    public Point getClickPoint()
    {
        java.awt.Point point = Randomizer.getRandomPointIn(getBounds());
        return new Point(point.x, point.y);
    }

    @Inject
    private Rectangle getBounds()
    {
        Shape shape = Perspective.getClickbox(client, getModel(), 0, getLocalLocation());
        if (shape != null)
        {
            return shape.getBounds();
        }
        else
        {
            return getCanvasTilePoly().getBounds();
        }
    }
}
