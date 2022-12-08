import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
public class class148 extends class152 {
   @ObfuscatedName("h")
   String field1748;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -489906031
   )
   int field1747;
   @ObfuscatedName("v")
   byte field1749;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Led;"
   )
   final class153 this$0;

   @ObfuscatedSignature(
      descriptor = "(Led;)V"
   )
   class148(class153 var1) {
      this.this$0 = var1;
      this.field1748 = null;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "468341515"
   )
   void vmethod3336(Buffer var1) {
      if (var1.readUnsignedByte() != 255) {
         --var1.offset;
         var1.readLong();
      }

      this.field1748 = var1.readStringCp1252NullTerminatedOrNull();
      this.field1747 = var1.readUnsignedShort();
      this.field1749 = var1.readByte();
      var1.readLong();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lfn;I)V",
      garbageValue = "1227548281"
   )
   void vmethod3337(ClanChannel var1) {
      ClanChannelMember var2 = new ClanChannelMember();
      var2.username = new Username(this.field1748);
      var2.world = this.field1747;
      var2.rank = this.field1749;
      var1.addMember(var2);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(CI)Z",
      garbageValue = "2023912721"
   )
   @Export("isCharPrintable")
   public static boolean isCharPrintable(char var0) {
      if (var0 >= ' ' && var0 <= '~') {
         return true;
      } else if (var0 >= 160 && var0 <= 255) {
         return true;
      } else {
         return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376;
      }
   }
}
