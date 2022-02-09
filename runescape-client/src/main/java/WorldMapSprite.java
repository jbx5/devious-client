import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("hl")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
    @ObfuscatedName("lx")
    @ObfuscatedSignature(descriptor = "Lcw;")
    @Export("localPlayer")
    static Player localPlayer;

    @ObfuscatedName("l")
    @Export("tileColors")
    final int[] tileColors;

    WorldMapSprite() {
        this.tileColors = new int[4096];
    }

    WorldMapSprite(int[] var1) {
        this.tileColors = var1;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(III)I", garbageValue = "725600811")
    @Export("getTileColor")
    final int getTileColor(int var1, int var2) {
        return this.tileColors[var1 + (var2 * 64)];
    }
}