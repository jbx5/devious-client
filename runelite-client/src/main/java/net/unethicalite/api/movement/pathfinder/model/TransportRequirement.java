package net.unethicalite.api.movement.pathfinder.model;

import lombok.Value;
import net.runelite.api.Quest;
import net.runelite.api.QuestState;
import net.runelite.api.Skill;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.quests.Quests;

import java.util.List;

@Value
public class TransportRequirement
{

    public enum TransportRequirementType
    {
        SKILL,
        QUEST,
        ITEM,
        VARBIT,
    }

    TransportRequirementType type;

    Integer level;
    Skill skill;

    Quest quest;
    List<QuestState> questState;

    Integer itemId;
    Integer quantity;

    Integer varbit;
    Integer varbitValue;


    public boolean fulfilled()
    {
        switch (type)
        {
            case SKILL:
                return Skills.getLevel(skill) >= level;
            case QUEST:
                return questState.contains(Quests.getState(quest));
            case ITEM:
                return Inventory.getCount(true, itemId) >= quantity;
            case VARBIT:
                return Vars.getBit(varbit) == varbitValue;
        }
        return false;
    }
}