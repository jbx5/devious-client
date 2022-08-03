package net.unethicalite.api.quests;

import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.unethicalite.client.managers.QuestManager;

public class Quests
{

    public static QuestState getState(Quest quest)
    {
        return QuestManager.getQuestStates().get(quest);
    }

    public static boolean isFinished(Quest quest)
    {
        return QuestManager.getQuestStates().get(quest) == QuestState.FINISHED;
    }

}
