import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("fz")
public class class167 {
    @ObfuscatedName("v")
    @ObfuscatedGetter(intValue = -806878739)
    @Export("musicTrackVolume")
    public static int musicTrackVolume;

    @ObfuscatedName("hu")
    @ObfuscatedSignature(descriptor = "(III)I", garbageValue = "-2122770392")
    static int method3254(int var0, int var1) {
        int var2 = var1 - 334;
        if (var2 < 0) {
            var2 = 0;
        } else if (var2 > 100) {
            var2 = 100;
        }
        int var3 = (((Client.zoomWidth - Client.zoomHeight) * var2) / 100) + Client.zoomHeight;
        return (var0 * var3) / 256;
    }
}