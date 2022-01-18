package dev.hoot.api.plugins;

import dev.hoot.api.commons.Time;
import dev.hoot.bot.script.Task;

public abstract class TaskPlugin extends LoopedPlugin
{
    @Override
    protected void loop()
    {
        for (Task task : getTasks())
        {
            if (task.validate())
            {
                int delay = task.execute();
                if (task.isBlocking())
                {
                    Time.sleep(delay);
                    return;
                }
            }
        }
    }

    protected abstract Task[] getTasks();
}
