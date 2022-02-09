import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("eo")
public class class149 extends class142 {
    @ObfuscatedName("c")
    String field1677;

    @ObfuscatedName("l")
    byte field1675;

    @ObfuscatedName("s")
    byte field1676;

    @ObfuscatedSignature(descriptor = "Led;")
    final class143 this$0;

    @ObfuscatedSignature(descriptor = "(Led;)V")
    class149(class143 var1) {
        this.this$0 = var1;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lpi;B)V", garbageValue = "-103")
    void vmethod3014(Buffer var1) {
        this.field1677 = var1.readStringCp1252NullTerminatedOrNull();
        if (this.field1677 != null) {
            var1.readUnsignedByte();
            this.field1675 = var1.readByte();
            this.field1676 = var1.readByte();
        }
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Leg;B)V", garbageValue = "48")
    void vmethod3015(ClanChannel var1) {
        var1.name = this.field1677;
        if (this.field1677 != null) {
            var1.field1656 = this.field1675;
            var1.field1658 = this.field1676;
        }
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(II)Lfb;", garbageValue = "-457788454")
    @Export("KitDefinition_get")
    public static KitDefinition KitDefinition_get(int var0) {
        KitDefinition var1 = ((KitDefinition) (KitDefinition.KitDefinition_cached.get(((long) (var0)))));
        if (var1 != null) {
            return var1;
        } else {
            byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0);
            var1 = new KitDefinition();
            if (var2 != null) {
                var1.decode(new Buffer(var2));
            }
            KitDefinition.KitDefinition_cached.put(var1, ((long) (var0)));
            return var1;
        }
    }
}