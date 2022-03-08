import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("iw")
public class class252 {
    @ObfuscatedName("en")
    @ObfuscatedSignature(descriptor = "Lkz;")
    @Export("archive11")
    static Archive archive11;

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Ldt;FI)F", garbageValue = "-884085349")
    static float method4974(class115 var0, float var1) {
        if (var0 == null) {
            return 0.0F;
        } else {
            float var2;
            if (var1 == var0.field1423) {
                var2 = 0.0F;
            } else if (var1 == var0.field1424) {
                var2 = 1.0F;
            } else {
                var2 = (var1 - var0.field1423) / (var0.field1424 - var0.field1423);
            }
            float var3;
            if (var0.field1421) {
                var3 = var2;
            } else {
                float[] var4 = new float[]{ var0.field1425[0] - var2, var0.field1425[1], var0.field1425[2], var0.field1425[3] };
                float[] var5 = new float[5];
                int var6 = WorldMapIcon_1.method4329(var4, 3, 0.0F, true, 1.0F, true, var5);
                if (var6 == 1) {
                    var3 = var5[0];
                } else {
                    var3 = 0.0F;
                }
            }
            return (var3 * (var0.field1426[1] + ((var0.field1426[2] + (var0.field1426[3] * var3)) * var3))) + var0.field1426[0];
        }
    }
}