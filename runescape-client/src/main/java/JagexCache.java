import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gn")
@Implements("JagexCache")
public class JagexCache {
   @ObfuscatedName("as")
   @Export("JagexCache_locationFile")
   static File JagexCache_locationFile;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -386043945
   )
   @Export("idxCount")
   public static int idxCount;
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Lsq;"
   )
   @Export("JagexCache_randomDat")
   public static BufferedFile JagexCache_randomDat = null;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lsq;"
   )
   @Export("JagexCache_dat2File")
   public static BufferedFile JagexCache_dat2File = null;
   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "Lsq;"
   )
   @Export("JagexCache_idx255File")
   public static BufferedFile JagexCache_idx255File = null;
   @ObfuscatedName("az")
   @Export("ByteArrayPool_arrays")
   static byte[][][] ByteArrayPool_arrays;

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "([Ljava/lang/CharSequence;III)Ljava/lang/String;",
      garbageValue = "-1324290995"
   )
   public static String method3497(CharSequence[] var0, int var1, int var2) {
      if (var2 == 0) {
         return "";
      } else if (var2 == 1) {
         CharSequence var10 = var0[var1];
         return var10 == null ? "null" : var10.toString();
      } else {
         int var3 = var2 + var1;
         int var4 = 0;

         for(int var5 = var1; var5 < var3; ++var5) {
            CharSequence var9 = var0[var5];
            if (var9 == null) {
               var4 += 4;
            } else {
               var4 += var9.length();
            }
         }

         StringBuilder var8 = new StringBuilder(var4);

         for(int var6 = var1; var6 < var3; ++var6) {
            CharSequence var7 = var0[var6];
            if (var7 == null) {
               var8.append("null");
            } else {
               var8.append(var7);
            }
         }

         return var8.toString();
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "53"
   )
   public static boolean method3499(int var0) {
      return (var0 & 1) != 0;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(CLoj;I)I",
      garbageValue = "1972392533"
   )
   @Export("lowercaseChar")
   static int lowercaseChar(char var0, Language var1) {
      int var2 = var0 << 4;
      if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var2 = (var0 << 4) + 1;
      }

      if (var0 == 241 && var1 == Language.Language_ES) {
         var2 = 1762;
      }

      return var2;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(IIIII)I",
      garbageValue = "-158956344"
   )
   static final int method3498(int var0, int var1, int var2, int var3) {
      return var0 * var2 + var3 * var1 >> 16;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Lmb;IIII)V",
      garbageValue = "670377109"
   )
   @Export("Widget_setKeyRate")
   static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
      if (var0.field3639 == null) {
         throw new RuntimeException();
      } else {
         var0.field3639[var1] = var2;
         var0.field3681[var1] = var3;
      }
   }
}
