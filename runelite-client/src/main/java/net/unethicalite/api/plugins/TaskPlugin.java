package net.unethicalite.api.plugins;

import lombok.Getter;

public abstract class TaskPlugin extends LoopedPlugin
{
	public abstract Task[] getTasks();

	@Getter
	private String currentTask = null;

	@Override
	protected int loop()
	{
		for (Task task : getTasks())
		{
			if (task.validate())
			{
				currentTask = task.getClass().getSimpleName();
				int delay = task.execute();
				if (task.isBlocking())
				{
					return delay;
				}
			}
		}

		return 1000;
	}
}
