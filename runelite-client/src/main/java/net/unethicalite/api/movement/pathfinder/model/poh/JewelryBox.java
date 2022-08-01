package net.unethicalite.api.movement.pathfinder.model.poh;

import lombok.Getter;
import net.runelite.api.NullObjectID;

@Getter
public enum JewelryBox
{
    NONE(-1),
    BASIC(NullObjectID.NULL_29154),
    FANCY(NullObjectID.NULL_29155),
    ORNATE(NullObjectID.NULL_29156)
    ;

    private final int objectId;

    JewelryBox(int objectId)
    {
        this.objectId = objectId;
    }

}