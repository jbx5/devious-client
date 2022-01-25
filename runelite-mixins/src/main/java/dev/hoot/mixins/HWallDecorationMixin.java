package dev.hoot.mixins;

import net.runelite.api.ObjectComposition;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.rs.api.RSObjectComposition;
import net.runelite.rs.api.RSWallDecoration;

@Mixin(RSWallDecoration.class)
public abstract class HWallDecorationMixin implements RSWallDecoration
{
    @Inject
    private RSObjectComposition transformedDecorativeObject = null;

    @Override
    @Inject
    public ObjectComposition getTransformedDefinition()
    {
        return transformedDecorativeObject;
    }

    @Override
    @Inject
    public void setTransformedDefinition(ObjectComposition composition)
    {
        transformedDecorativeObject = (RSObjectComposition) composition;
    }
}
