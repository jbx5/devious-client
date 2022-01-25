package dev.hoot.api.events;

import lombok.Value;
import net.runelite.api.NPCComposition;

@Value
public class NPCTransformsChanged {
    int npcIndex;
}
