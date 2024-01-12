package net.runelite.api.script;

import lombok.Getter;
import lombok.Setter;
import net.runelite.api.QueueSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public abstract class AbstractScript implements Script {

    private final QueueSet<Runnable>[] exec;
    protected final Map<String, Object> properties;
    protected long startTime = 0;
    private Script delegate = null;

    @Getter
    @Setter
    private ScriptState state = ScriptState.START;

    public AbstractScript(final Map<String, Object> properties) {
        this.properties = properties;

        exec = new QueueSet[ScriptState.values().length];

        for (int i = 0; i < exec.length; i++) {
            exec[i] = new QueueSet<>();
        }
    }

    @Override
    public Script getDelegate() {
        return delegate;
    }

    @Override
    public void yield(final Script script) {
        this.delegate = script;
        state = ScriptState.START;
//        Thread.currentThread().stop();
    }

    public AbstractScript() {
        this(new HashMap<>());
    }

    public long getRuntime() {
        return System.currentTimeMillis() - startTime;
    }

    public ScriptManifest getManifest() {
        return getClass().getAnnotation(ScriptManifest.class);
    }

    public String getName() {
        return getManifest().name();
    }

    public String getDescription() {
        return getManifest().desc();
    }

    public boolean insertExecQueue(final ScriptState state, final Runnable runnable) {
        return getExecQueue(state).offer(runnable);
    }

    @Override
    public Queue<Runnable> getExecQueue(final ScriptState state) {
        return exec[state.ordinal()];
    }

    @Override
    public Object getProperty(String name) {
        return properties.get(name);
    }

    @Override
    public void setProperty(final String name, final Object value) {
        properties.put(name, value);
    }

    @Override
    public void addProperties(final Map<String, Object> properties) {
        this.properties.putAll(properties);
    }

}
