import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("ej")
public class class139 extends class142 {
    @ObfuscatedName("sl")
    @ObfuscatedGetter(intValue = -839412529)
    static int field1624;

    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = 1184963117)
    int field1618;

    @ObfuscatedName("l")
    byte field1620;

    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 266467011)
    int field1623;

    @ObfuscatedName("e")
    String field1621;

    @ObfuscatedSignature(descriptor = "Led;")
    final class143 this$0;

    @ObfuscatedSignature(descriptor = "(Led;)V")
    class139(class143 var1) {
        this.this$0 = var1;
        this.field1618 = -1;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lpi;B)V", garbageValue = "-103")
    void vmethod3014(Buffer var1) {
        var1.readUnsignedByte();
        this.field1618 = var1.readUnsignedShort();
        this.field1620 = var1.readByte();
        this.field1623 = var1.readUnsignedShort();
        var1.readLong();
        this.field1621 = var1.readStringCp1252NullTerminated();
        var1.readUnsignedByte();
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(Leg;B)V", garbageValue = "48")
    void vmethod3015(ClanChannel var1) {
        ClanChannelMember var2 = ((ClanChannelMember) (var1.members.get(this.field1618)));
        var2.rank = this.field1620;
        var2.world = this.field1623;
        var2.username = new Username(this.field1621);
    }

    @ObfuscatedName("y")
    @ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "1814466450")
    static final boolean method2923() {
        return ViewportMouse.ViewportMouse_isInViewport;
    }
}