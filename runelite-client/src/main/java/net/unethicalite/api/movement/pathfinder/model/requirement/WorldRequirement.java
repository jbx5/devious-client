package net.unethicalite.api.movement.pathfinder.model.requirement;

import lombok.Value;
import net.unethicalite.api.game.Worlds;

@Value
public class WorldRequirement implements Requirement
{
    boolean memberWorld;

    @Override
    public Boolean get()
    {
        return !memberWorld || Worlds.inMembersWorld();
    }
}