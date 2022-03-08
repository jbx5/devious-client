import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ea")
public class class132 extends class142 {
    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = 1174252823)
    int field1551;

    @ObfuscatedName("l")
    byte field1552;

    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 1922387489)
    int field1553;

    @ObfuscatedName("e")
    String field1554;

    @ObfuscatedSignature(descriptor = "Led;")
    final class143 this$0;

    @ObfuscatedSignature(descriptor = "(Led;)V")
    class132(class143 var1) {
        this.this$0 = var1;
        this.field1551 = -1;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lpi;B)V", garbageValue = "-103")
    void vmethod3014(Buffer var1) {
        this.field1551 = var1.readUnsignedShort();
        this.field1552 = var1.readByte();
        this.field1553 = var1.readUnsignedShort();
        var1.readLong();
        this.field1554 = var1.readStringCp1252NullTerminated();
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Leg;B)V", garbageValue = "48")
    void vmethod3015(ClanChannel var1) {
        ClanChannelMember var2 = ((ClanChannelMember) (var1.members.get(this.field1551)));
        var2.rank = this.field1552;
        var2.world = this.field1553;
        var2.username = new Username(this.field1554);
    }
}