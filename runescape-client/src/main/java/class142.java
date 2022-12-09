import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
public class class142 extends class152 {
   @ObfuscatedName("pw")
   @ObfuscatedGetter(
      intValue = -1273089953
   )
   static int field1691;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 778268445
   )
   int field1687;
   @ObfuscatedName("e")
   byte field1690;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1782561811
   )
   int field1689;
   @ObfuscatedName("x")
   String field1688;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Led;"
   )
   final class153 this$0;

   @ObfuscatedSignature(
      descriptor = "(Led;)V"
   )
   class142(class153 var1) {
      this.this$0 = var1;
      this.field1687 = -1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "468341515"
   )
   void vmethod3336(Buffer var1) {
      this.field1687 = var1.readUnsignedShort();
      this.field1690 = var1.readByte();
      this.field1689 = var1.readUnsignedShort();
      var1.readLong();
      this.field1688 = var1.readStringCp1252NullTerminated();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lfn;I)V",
      garbageValue = "1227548281"
   )
   void vmethod3337(ClanChannel var1) {
      ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1687);
      var2.rank = this.field1690;
      var2.world = this.field1689;
      var2.username = new Username(this.field1688);
   }
}
