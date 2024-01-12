package net.runelite.api.script;

import lombok.Setter;
import net.runelite.api.Client;
import net.runelite.api.Perspective;

import javax.inject.Inject;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class PollingScript extends AbstractScript {

    private final NavigableSet<PollingScript> threshold;

    private final AtomicInteger priority;

    @Setter
    private PollingScript parent;

    protected long lastPacket = 0;

    private Object plugin;

    public PollingScript(final PollingScript parent, final int priority) {
        threshold = new ConcurrentSkipListSet<>(Comparator.comparingInt(p -> p.priority.get()));
        this.priority = new AtomicInteger(priority);
        this.parent = parent;

        insertExecQueue(ScriptState.SUSPEND, this::suspend);
        insertExecQueue(ScriptState.RESUME, this::resume);
        insertExecQueue(ScriptState.START, this::start);
        insertExecQueue(ScriptState.START, new Runnable() {
            @Override
            public void run() {
                try {
                    if (threshold.isEmpty() || threshold.first().priority.get() <= PollingScript.this.priority.get()) {
                        getExecQueue(ScriptState.START).offer(this);
                        if(validate()) {
                            priorityBlock();
                            poll();

                        } else {
                            priorityUnblock();
                        }

                    }
                } catch (Throwable e) {
                    setState(ScriptState.STOP);
                    e.printStackTrace();
                    System.err.println("Script \"" + getName() + "\" has crashed!");
                }
            }
        });
    }

    public PollingScript(final int priority) {
        this(null, priority);
    }

    protected void priorityBlock() {
        threshold.add(this);
    }

    protected void priorityUnblock() {
        threshold.remove(this);
    }

    public abstract void poll();
//
    public abstract boolean validate();

    public void start() { }

    public void suspend() { }

    public void resume() { }

//    public static PollingScript of(final int priority, final Runnable runnable) {
//
//        return new PollingScript(priority) {
//            @Override
//            public void poll() {
//                runnable.run();
//            }
//        };
//    }

    protected void sleep(int n) {
        try {
            Thread.sleep(n);
        } catch (InterruptedException e) {
        }
    }

    @Inject
    protected Client client;


}
