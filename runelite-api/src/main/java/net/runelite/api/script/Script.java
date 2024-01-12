package net.runelite.api.script;

import java.util.Map;
import java.util.Queue;

public interface Script {

    Queue<Runnable> getExecQueue(ScriptState state);

    Object getProperty(String name);

    void setProperty(String name, Object value);

    void addProperties(Map<String, Object> properties);

    ScriptState getState();

    void setState(ScriptState state);

    Script getDelegate();

    void yield(Script script);

}
