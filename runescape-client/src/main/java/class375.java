import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("nh")
public class class375 implements class380 {
    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "Loq;")
    public final class402 field4268;

    @ObfuscatedSignature(descriptor = "(Lou;)V")
    class375(class403 var1) {
        this.field4268 = var1;
    }

    @ObfuscatedSignature(descriptor = "(Lny;)V")
    public class375(class376 var1) {
        this(new class403(var1));
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(IB)I", garbageValue = "64")
    public int method6778(int var1) {
        return this.field4268.vmethod7139(var1);
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(II)I", garbageValue = "-1209442134")
    @Export("getVarbit")
    public static int getVarbit(int var0) {
        VarbitComposition var2 = ((VarbitComposition) (VarbitComposition.VarbitDefinition_cached.get(((long) (var0)))));
        VarbitComposition var1;
        if (var2 != null) {
            var1 = var2;
        } else {
            byte[] var3 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
            var2 = new VarbitComposition();
            if (var3 != null) {
                var2.decode(new Buffer(var3));
            }
            VarbitComposition.VarbitDefinition_cached.put(var2, ((long) (var0)));
            var1 = var2;
        }
        int var7 = var1.baseVar;
        int var4 = var1.startBit;
        int var5 = var1.endBit;
        int var6 = Varps.Varps_masks[var5 - var4];
        return (Varps.Varps_main[var7] >> var4) & var6;
    }
}