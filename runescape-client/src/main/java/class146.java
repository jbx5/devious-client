import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public class class146 extends class156 {
   @ObfuscatedName("pw")
   @ObfuscatedSignature(
      descriptor = "[Lmy;"
   )
   static Widget[] field1660;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 58880927
   )
   int field1661;
   @ObfuscatedName("al")
   byte field1655;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 216286647
   )
   int field1656;
   @ObfuscatedName("ab")
   String field1659;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lgk;"
   )
   final class157 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lgk;)V"
   )
   class146(class157 var1) {
      this.this$0 = var1;
      this.field1661 = -1;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)V",
      garbageValue = "2070491057"
   )
   void vmethod3353(Buffer var1) {
      this.field1661 = var1.readUnsignedShort();
      this.field1655 = var1.readByte();
      this.field1656 = var1.readUnsignedShort();
      var1.readLong();
      this.field1659 = var1.readStringCp1252NullTerminated();
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lgn;B)V",
      garbageValue = "-82"
   )
   void vmethod3354(ClanChannel var1) {
      ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1661);
      var2.rank = this.field1655;
      var2.world = this.field1656;
      var2.username = new Username(this.field1659);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1114170738"
   )
   @Export("savePreferences")
   static void savePreferences() {
      AccessFile var0 = null;

      try {
         var0 = class350.getPreferencesFile("", DbTableType.field4870.name, true);
         Buffer var1 = WorldMapSectionType.clientPreferences.toBuffer();
         var0.write(var1.array, 0, var1.offset);
      } catch (Exception var3) {
      }

      try {
         if (var0 != null) {
            var0.closeSync(true);
         }
      } catch (Exception var2) {
      }

   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;IZB)I",
      garbageValue = "84"
   )
   static int method3156(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            int var8 = var0.charAt(var7);
            if (var7 == 0) {
               if (var8 == 45) {
                  var3 = true;
                  continue;
               }

               if (var8 == 43) {
                  continue;
               }
            }

            if (var8 >= 48 && var8 <= 57) {
               var8 -= 48;
            } else if (var8 >= 65 && var8 <= 90) {
               var8 -= 55;
            } else {
               if (var8 < 97 || var8 > 122) {
                  throw new NumberFormatException();
               }

               var8 -= 87;
            }

            if (var8 >= var1) {
               throw new NumberFormatException();
            }

            if (var3) {
               var8 = -var8;
            }

            int var9 = var8 + var5 * var1;
            if (var9 / var1 != var5) {
               throw new NumberFormatException();
            }

            var5 = var9;
            var4 = true;
         }

         if (!var4) {
            throw new NumberFormatException();
         } else {
            return var5;
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }
}
