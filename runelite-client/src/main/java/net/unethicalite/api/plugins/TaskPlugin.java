package net.unethicalite.api.plugins;

public abstract class TaskPlugin extends LoopedPlugin
{
	public abstract Task[] getTasks();

	@Override
	protected int loop()
	{
		for (Task task : getTasks())
		{
			if (task.validate())
			{
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
