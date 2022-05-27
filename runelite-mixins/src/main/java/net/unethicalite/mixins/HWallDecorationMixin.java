package net.unethicalite.mixins;

import net.runelite.api.ObjectComposition;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.rs.api.RSObjectComposition;
import net.runelite.rs.api.RSWallDecoration;

@Mixin(RSWallDecoration.class)
public abstract class HWallDecorationMixin implements RSWallDecoration
{
    @Inject
    private RSObjectComposition transformedComposition = null;

    @Override
    @Inject
    public ObjectComposition getTransformedComposition()
    {
        return transformedComposition;
    }

    @Override
    @Inject
    public void setTransformedComposition(ObjectComposition composition)
    {
        transformedComposition = (RSObjectComposition) composition;
    }
}
