package net.unethicalite.api.plugins;

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
