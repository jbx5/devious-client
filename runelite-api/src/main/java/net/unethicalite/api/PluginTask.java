package net.unethicalite.api;

public interface PluginTask
{
	/**
	 * The check to validate the execution of the task.
	 * @return whether the task should be executed or not.
	 */
	boolean validate();

	/**
	 * The loop logic.
	 * @return the amount of milliseconds to sleep after execution.
	 */
	int execute();

	/**
	 * @return true if the task blocks subsequent tasks.
	 */
	default boolean blocking()
	{
		return true;
	}
}
