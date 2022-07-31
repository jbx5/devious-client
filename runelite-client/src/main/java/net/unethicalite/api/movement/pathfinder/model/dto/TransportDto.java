package net.unethicalite.api.movement.pathfinder.model.dto;

import lombok.Value;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.movement.pathfinder.TransportLoader;
import net.unethicalite.api.movement.pathfinder.model.Transport;
import net.unethicalite.api.movement.pathfinder.model.requirement.Requirements;

@Value
public class TransportDto
{
    WorldPoint source;
    WorldPoint destination;
    String action;
    Integer objectId;
    Requirements requirements;

    public Transport toTransport()
    {
        return TransportLoader.objectTransport(source, destination, objectId, action, requirements);
    }
}
