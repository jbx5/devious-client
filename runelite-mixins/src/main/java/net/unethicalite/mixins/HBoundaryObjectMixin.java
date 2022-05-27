package net.unethicalite.mixins;

import net.runelite.api.ObjectComposition;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.rs.api.RSBoundaryObject;
import net.runelite.rs.api.RSObjectComposition;

@Mixin(RSBoundaryObject.class)
public abstract class HBoundaryObjectMixin implements RSBoundaryObject
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
