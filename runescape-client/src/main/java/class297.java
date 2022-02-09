import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("kv")
public class class297 {
    @ObfuscatedName("an")
    @Export("hasFocus")
    protected static boolean hasFocus;

    @ObfuscatedName("fu")
    @ObfuscatedGetter(intValue = 2033353769)
    @Export("js5Port")
    static int js5Port;

    static {
        int var0 = 0;
        int var1 = 0;
        class293[] var2 = new class293[]{ class293.field3485, class293.field3483 };
        class293[] var3 = var2;
        for (int var4 = 0; var4 < var3.length; ++var4) {
            class293 var5 = var3[var4];
            if (var5.field3484 > var0) {
                var0 = var5.field3484;
            }
            if (var5.field3482 > var1) {
                var1 = var5.field3482;
            }
        }
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lpi;Lon;B)Lon;", garbageValue = "13")
    @Export("readStringIntParameters")
    static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
        int var2 = var0.readUnsignedByte();
        int var3;
        if (var1 == null) {
            var3 = GrandExchangeOfferNameComparator.method5702(var2);
            var1 = new IterableNodeHashTable(var3);
        }
        for (var3 = 0; var3 < var2; ++var3) {
            boolean var4 = var0.readUnsignedByte() == 1;
            int var5 = var0.readMedium();
            Object var6;
            if (var4) {
                var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
            } else {
                var6 = new IntegerNode(var0.readInt());
            }
            var1.put(((Node) (var6)), ((long) (var5)));
        }
        return var1;
    }
}