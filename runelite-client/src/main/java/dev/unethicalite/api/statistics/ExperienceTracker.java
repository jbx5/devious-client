package dev.unethicalite.api.statistics;

import dev.unethicalite.api.game.Skills;
import lombok.Value;
import net.runelite.api.Skill;

@Value
public class ExperienceTracker
{
	Skill skill;
	int startExp;
	int startLevel;

	public int getExperienceGained()
	{
		return Skills.getExperience(skill) - startExp;
	}

	public int getLevelsGained()
	{
		return Skills.getLevel(skill) - startLevel;
	}
}
