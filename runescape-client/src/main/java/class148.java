import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
public class class148 extends class151 {
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1171548611
   )
   int field1697;
   @ObfuscatedName("f")
   byte field1695;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 63087175
   )
   int field1696;
   @ObfuscatedName("x")
   String field1694;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lem;"
   )
   final class152 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lem;)V"
   )
   class148(class152 var1) {
      this.this$0 = var1;
      this.field1697 = -1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lqr;B)V",
      garbageValue = "85"
   )
   void vmethod3238(Buffer var1) {
      var1.readUnsignedByte();
      this.field1697 = var1.readUnsignedShort();
      this.field1695 = var1.readByte();
      this.field1696 = var1.readUnsignedShort();
      var1.readLong();
      this.field1694 = var1.readStringCp1252NullTerminated();
      var1.readUnsignedByte();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Leq;I)V",
      garbageValue = "-1303116736"
   )
   void vmethod3239(ClanChannel var1) {
      ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1697);
      var2.rank = this.field1695;
      var2.world = this.field1696;
      var2.username = new Username(this.field1694);
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "7"
   )
   public static void method3155() {
      FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear();
   }
}
