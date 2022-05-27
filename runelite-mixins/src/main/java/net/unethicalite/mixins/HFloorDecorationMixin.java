package net.unethicalite.mixins;

import net.runelite.api.ObjectComposition;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.rs.api.RSFloorDecoration;
import net.runelite.rs.api.RSObjectComposition;

@Mixin(RSFloorDecoration.class)
public abstract class HFloorDecorationMixin implements RSFloorDecoration
{
    @Inject
    private RSObjectComposition transformedFloorDecoration = null;

    @Override
    @Inject
    public ObjectComposition getTransformedComposition()
    {
        return transformedFloorDecoration;
    }

    @Override
    @Inject
    public void setTransformedComposition(ObjectComposition composition)
    {
        transformedFloorDecoration = (RSObjectComposition) composition;
    }
}
