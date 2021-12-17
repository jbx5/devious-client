package net.runelite.api.packets;

import net.runelite.api.Buffer;

public interface PacketBuffer extends Buffer {
    IsaacCipher getIsaacCipher();
}
