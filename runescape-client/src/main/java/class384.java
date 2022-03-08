import net.runelite.mapping.ObfuscatedName;
@ObfuscatedName("nx")
public class class384 {
    @ObfuscatedName("a")
    static final int[] field4287;

    @ObfuscatedName("y")
    static final int[] field4288;

    static {
        field4287 = new int[2048];
        field4288 = new int[2048];
        double var0 = 0.0030679615757712823;
        for (int var2 = 0; var2 < 2048; ++var2) {
            field4287[var2] = ((int) (65536.0 * Math.sin(var0 * ((double) (var2)))));
            field4288[var2] = ((int) (65536.0 * Math.cos(((double) (var2)) * var0)));
        }
    }
}