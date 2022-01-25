package dev.hoot.mixins;

import net.runelite.api.ObjectComposition;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.rs.api.RSBoundaryObject;
import net.runelite.rs.api.RSObjectComposition;

@Mixin(RSBoundaryObject.class)
public abstract class HBoundaryObjectMixin implements RSBoundaryObject
{
    @Inject
    private RSObjectComposition transformedWallObject = null;

    @Override
    @Inject
    public ObjectComposition getTransformedDefinition()
    {
        return transformedWallObject;
    }

    @Override
    @Inject
    public void setTransformedDefinition(ObjectComposition composition)
    {
        transformedWallObject = (RSObjectComposition) composition;
    }
}
