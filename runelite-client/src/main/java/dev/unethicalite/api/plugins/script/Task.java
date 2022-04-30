package dev.unethicalite.api.plugins.script;

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
