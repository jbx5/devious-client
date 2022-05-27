package net.unethicalite.mixins;

import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSNPCComposition;

@Mixin(RSNPCComposition.class)
public abstract class HNpcCompositionMixin implements RSNPCComposition
{
    @Shadow("client")
    private static RSClient client;

    @Inject
    private int index;

    @Inject
    public void setIndex(int idx)
    {
        index = idx;
    }

    @Inject
    public int getIndex()
    {
        return index;
    }
}
