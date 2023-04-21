package net.runelite.client.plugins.jrczulrah.data.phases;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@RequiredArgsConstructor
public final class ZulrahNode
{
    private final List<ZulrahNode> children = new ArrayList<>();
    private final ZulrahNode parent;
    private final ZulrahCycle zulrahCycle;

    public ZulrahNode add(ZulrahCycle child)
    {
        ZulrahNode cn = new ZulrahNode(this, child);
        this.children.add(cn);

        return cn;
    }
}