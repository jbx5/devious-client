package dev.hoot.api;

import net.runelite.api.Actor;
import net.runelite.api.Locatable;
import net.runelite.api.TileItem;
import net.runelite.api.TileObject;

public interface SceneEntity extends Locatable, Identifiable, Interactable, EntityNameable
{
    default long getTag()
    {
        if (this instanceof TileObject)
        {
            return ((TileObject) this).getHash();
        }

        if (this instanceof Actor || this instanceof TileItem)
        {
            return (this.getId() & 4294967295L) << 17;
        }

        return -1337;
    }
}
