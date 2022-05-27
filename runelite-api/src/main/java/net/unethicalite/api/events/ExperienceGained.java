package net.unethicalite.api.events;

import lombok.Data;
import net.runelite.api.Skill;

@Data
public class ExperienceGained
{
	private final Skill skill;
	private final int xpGained;
	private final int xp;
	private final int level;
}
