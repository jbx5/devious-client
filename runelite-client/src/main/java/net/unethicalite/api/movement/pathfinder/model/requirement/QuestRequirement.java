package net.unethicalite.api.movement.pathfinder.model.requirement;

import lombok.Value;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.unethicalite.api.quests.Quests;

import java.util.Set;

@Value
public class QuestRequirement implements Requirement
{
    Quest quest;
    Set<QuestState> states;

    @Override
    public Boolean get()
    {
        return states.contains(Quests.getState(quest));
    }
}
