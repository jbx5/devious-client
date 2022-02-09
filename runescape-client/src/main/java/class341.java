import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("mf")
public class class341 {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(IIB)I", garbageValue = "-7")
    static int method6228(int var0, int var1) {
        ItemContainer var2 = ((ItemContainer) (ItemContainer.itemContainers.get(((long) (var0)))));
        if (var2 == null) {
            return -1;
        } else {
            return (var1 >= 0) && (var1 < var2.ids.length) ? var2.ids[var1] : -1;
        }
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(IIB)I", garbageValue = "16")
    public static int method6227(int var0, int var1) {
        return ((int) (Math.round(Math.atan2(((double) (var0)), ((double) (var1))) * 2607.5945876176133))) & 16383;
    }
}