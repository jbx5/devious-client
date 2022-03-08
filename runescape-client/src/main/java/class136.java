import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ee")
public class class136 extends class126 {
    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = -35384725)
    int field1578;

    @ObfuscatedName("l")
    String field1579;

    @ObfuscatedSignature(descriptor = "Ldk;")
    final class129 this$0;

    @ObfuscatedSignature(descriptor = "(Ldk;)V")
    class136(class129 var1) {
        this.this$0 = var1;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lpi;I)V", garbageValue = "703192976")
    void vmethod3019(Buffer var1) {
        this.field1578 = var1.readInt();
        this.field1579 = var1.readStringCp1252NullTerminated();
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Ley;I)V", garbageValue = "750335300")
    void vmethod3020(ClanSettings var1) {
        var1.method2864(this.field1578, this.field1579);
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(II)Lfe;", garbageValue = "2041648826")
    @Export("StructDefinition_getStructDefinition")
    public static StructComposition StructDefinition_getStructDefinition(int var0) {
        StructComposition var1 = ((StructComposition) (StructComposition.StructDefinition_cached.get(((long) (var0)))));
        if (var1 != null) {
            return var1;
        } else {
            byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0);
            var1 = new StructComposition();
            if (var2 != null) {
                var1.decode(new Buffer(var2));
            }
            var1.postDecode();
            StructComposition.StructDefinition_cached.put(var1, ((long) (var0)));
            return var1;
        }
    }
}