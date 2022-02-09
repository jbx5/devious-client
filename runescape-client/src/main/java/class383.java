import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ns")
public class class383 {
    @ObfuscatedName("r")
    static final int[] field4278;

    @ObfuscatedName("o")
    static final int[] field4276;

    static {
        field4278 = new int[16384];
        field4276 = new int[16384];
        double var0 = 3.834951969714103E-4;
        for (int var2 = 0; var2 < 16384; ++var2) {
            field4278[var2] = ((int) (16384.0 * Math.sin(var0 * ((double) (var2)))));
            field4276[var2] = ((int) (16384.0 * Math.cos(var0 * ((double) (var2)))));
        }
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(II)J", garbageValue = "-9742028")
    public static long method6818(int var0) {
        return ViewportMouse.ViewportMouse_entityTags[var0];
    }
}