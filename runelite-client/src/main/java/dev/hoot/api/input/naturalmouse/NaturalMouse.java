package dev.hoot.api.input.naturalmouse;

import dev.hoot.api.game.Game;
import dev.hoot.api.input.Mouse;
import dev.hoot.api.input.naturalmouse.api.MouseInfoAccessor;
import dev.hoot.api.input.naturalmouse.api.MouseMotionFactory;
import dev.hoot.api.input.naturalmouse.api.SystemCalls;
import dev.hoot.api.input.naturalmouse.support.*;
import dev.hoot.api.input.naturalmouse.util.FlowTemplates;
import dev.hoot.api.input.naturalmouse.util.Pair;
import lombok.Getter;
import lombok.Setter;

import java.awt.Dimension;
import java.awt.Point;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class NaturalMouse
{
    private final ThreadLocalRandom random = ThreadLocalRandom.current();
    private final MouseMotionNature nature;

    @Getter
    @Setter
    private List<Flow> flows = List.of(
            new Flow(FlowTemplates.variatingFlow()),
            new Flow(FlowTemplates.slowStartupFlow()),
            new Flow(FlowTemplates.slowStartup2Flow()),
            new Flow(FlowTemplates.jaggedFlow()),
            new Flow(FlowTemplates.interruptedFlow()),
            new Flow(FlowTemplates.interruptedFlow2()),
            new Flow(FlowTemplates.stoppingFlow()),
            new Flow(FlowTemplates.adjustingFlow()),
            new Flow(FlowTemplates.random())
    );

    public NaturalMouse()
    {
        nature = new DefaultMouseMotionNature();
        nature.setSystemCalls(new SystemCallsImpl());
        nature.setMouseInfo(new MouseInfoImpl());
    }

    public synchronized void moveTo(int dx, int dy)
    {
        var motion = getFactory().build(dx, dy);
        try
        {
            motion.move();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public MouseMotionFactory getFactory()
    {
        var factory = new MouseMotionFactory();
        factory.setNature(nature);
        factory.setRandom(random);

        var manager = new SpeedManagerImpl(flows);
        factory.setDeviationProvider(new SinusoidalDeviationProvider(10.0));
        factory.setNoiseProvider(new DefaultNoiseProvider(2.0));
        factory.getNature().setReactionTimeVariationMs(75);
        manager.setMouseMovementBaseTimeMs(150);

        var overshootManager = (DefaultOvershootManager) factory.getOvershootManager();
        overshootManager.setOvershoots(4);
        factory.setSpeedManager(manager);

        return factory;
    }

    private static class SpeedManagerImpl extends DefaultSpeedManager
    {
        private SpeedManagerImpl(Collection<Flow> flows)
        {
            super(flows);
        }

        @Override
        public Pair<Flow, Long> getFlowWithTime(double distance) {
            var pair = super.getFlowWithTime(distance);
            return new Pair<>(pair.x, pair.y);
        }
    }

    private static class MouseInfoImpl implements MouseInfoAccessor
    {
        @Override
        public Point getMousePosition()
        {
            return Mouse.getPosition();
        }
    }

    private static class SystemCallsImpl implements SystemCalls
    {
        @Override
        public long currentTimeMillis()
        {
            return System.currentTimeMillis();
        }

        @Override
        public void sleep(long time) throws InterruptedException
        {
            Thread.sleep(time);
        }

        @Override
        public Dimension getScreenSize()
        {
            return Game.getClient().getCanvas().getSize();
        }

        @Override
        public void setMousePosition(int x, int y)
        {
            Game.getClient().getMouseHandler().sendMovement(x, y);
        }
    }
}
