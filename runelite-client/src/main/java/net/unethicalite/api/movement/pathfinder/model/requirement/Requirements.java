package net.unethicalite.api.movement.pathfinder.model.requirement;

import lombok.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@Value
public class Requirements
{
    List<ItemRequirement> itemRequirements = new ArrayList<>();
    List<SkillRequirement> skillRequirements = new ArrayList<>();
    List<VarRequirement> varRequirements = new ArrayList<>();
    List<QuestRequirement> questRequirements = new ArrayList<>();
    List<WorldRequirement> worldRequirements = new ArrayList<>();

    public boolean fulfilled()
    {
        List<Requirement> all = new ArrayList<>();
        all.addAll(itemRequirements);
        all.addAll(skillRequirements);
        all.addAll(varRequirements);
        all.addAll(questRequirements);
        all.addAll(worldRequirements);
        return all.stream().allMatch(Supplier::get);
    }
}
