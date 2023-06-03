import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lu")
@Implements("MusicPatchNode2")
public class MusicPatchNode2 {
   @ObfuscatedName("hp")
   static String field3380;
   @ObfuscatedName("at")
   byte[] field3374;
   @ObfuscatedName("an")
   byte[] field3381;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 890722773
   )
   int field3373;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = 326247471
   )
   int field3375;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -1214878621
   )
   int field3376;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -929568749
   )
   int field3379;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1825442637
   )
   int field3378;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -1031731101
   )
   int field3372;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -1573016247
   )
   int field3377;

   MusicPatchNode2() {
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "([BIII)Ljava/lang/String;",
      garbageValue = "412264069"
   )
   @Export("decodeStringCp1252")
   public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
      char[] var3 = new char[var2];
      int var4 = 0;

      for(int var5 = 0; var5 < var2; ++var5) {
         int var6 = var0[var5 + var1] & 255;
         if (var6 != 0) {
            if (var6 >= 128 && var6 < 160) {
               char var7 = class382.cp1252AsciiExtension[var6 - 128];
               if (var7 == 0) {
                  var7 = '?';
               }

               var6 = var7;
            }

            var3[var4++] = (char)var6;
         }
      }

      return new String(var3, 0, var4);
   }
}
