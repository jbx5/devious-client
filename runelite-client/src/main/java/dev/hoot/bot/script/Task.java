package dev.hoot.bot.script;

public interface Task
{
    boolean validate();

    int execute();

    default boolean isBlocking()
    {
        return true;
    }

    default boolean subscribe()
    {
        return false;
    }
}
