import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
public class class145 extends class155 {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1706146983
   )
   int field1679;
   @ObfuscatedName("an")
   byte field1680;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 928863875
   )
   int field1684;
   @ObfuscatedName("ac")
   String field1682;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lgr;"
   )
   final class156 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lgr;)V"
   )
   class145(class156 var1) {
      this.this$0 = var1;
      this.field1679 = -1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lsg;I)V",
      garbageValue = "-1949352075"
   )
   void vmethod3448(Buffer var1) {
      this.field1679 = var1.readUnsignedShort();
      this.field1680 = var1.readByte();
      this.field1684 = var1.readUnsignedShort();
      var1.readLong();
      this.field1682 = var1.readStringCp1252NullTerminated();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lgj;B)V",
      garbageValue = "-49"
   )
   void vmethod3450(ClanChannel var1) {
      ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1679);
      var2.rank = this.field1680;
      var2.world = this.field1684;
      var2.username = new Username(this.field1682);
   }
}
