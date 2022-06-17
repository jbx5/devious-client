package net.unethicalite.api.movement.pathfinder.model;

import lombok.Builder;
import lombok.Value;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.movement.pathfinder.TransportLoader;

@Value
@Builder(toBuilder = true)
public class TransportDto
{
    WorldPoint source;
    WorldPoint destination;
    String action;
    String objectName;
    Integer objectId;
    TransportRequirement[] requirements;

    public Transport toTransport()
    {
        return TransportLoader.objectTransport(source, destination, objectId, action, requirements);
    }
}
