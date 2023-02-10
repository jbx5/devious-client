import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("no")
@Implements("ByteArrayPool")
public class ByteArrayPool {
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1615203993
   )
   @Export("ByteArrayPool_smallCount")
   static int ByteArrayPool_smallCount = 0;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 11864649
   )
   @Export("ByteArrayPool_mediumCount")
   static int ByteArrayPool_mediumCount = 0;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 1586651023
   )
   @Export("ByteArrayPool_largeCount")
   static int ByteArrayPool_largeCount = 0;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -436333049
   )
   static int field4449 = 0;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = -1375098291
   )
   static int field4450 = 1000;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1502991471
   )
   static int field4455 = 250;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 309881497
   )
   static int field4456 = 100;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = 322972771
   )
   static int field4452 = 50;
   @ObfuscatedName("b")
   @Export("ByteArrayPool_small")
   static byte[][] ByteArrayPool_small = new byte[1000][];
   @ObfuscatedName("m")
   @Export("ByteArrayPool_medium")
   static byte[][] ByteArrayPool_medium = new byte[250][];
   @ObfuscatedName("t")
   @Export("ByteArrayPool_large")
   static byte[][] ByteArrayPool_large = new byte[100][];
   @ObfuscatedName("h")
   static byte[][] field4453 = new byte[50][];
   @ObfuscatedName("x")
   public static ArrayList field4443 = new ArrayList();

   static {
      class36.method694();
      new HashMap();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(IZI)[B",
      garbageValue = "513950466"
   )
   @Export("ByteArrayPool_getArrayBool")
   public static synchronized byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
      byte[] var4;
      if ((var0 == 100 || var0 < 100 && var1) && ByteArrayPool_smallCount > 0) {
         var4 = ByteArrayPool_small[--ByteArrayPool_smallCount];
         ByteArrayPool_small[ByteArrayPool_smallCount] = null;
         return var4;
      } else if ((var0 == 5000 || var0 < 5000 && var1) && ByteArrayPool_mediumCount > 0) {
         var4 = ByteArrayPool_medium[--ByteArrayPool_mediumCount];
         ByteArrayPool_medium[ByteArrayPool_mediumCount] = null;
         return var4;
      } else if ((var0 == 10000 || var0 < 10000 && var1) && ByteArrayPool_largeCount > 0) {
         var4 = ByteArrayPool_large[--ByteArrayPool_largeCount];
         ByteArrayPool_large[ByteArrayPool_largeCount] = null;
         return var4;
      } else if ((var0 == 30000 || var0 < 30000 && var1) && field4449 > 0) {
         var4 = field4453[--field4449];
         field4453[field4449] = null;
         return var4;
      } else {
         int var2;
         if (class9.ByteArrayPool_arrays != null) {
            for(var2 = 0; var2 < class172.ByteArrayPool_alternativeSizes.length; ++var2) {
               if ((class172.ByteArrayPool_alternativeSizes[var2] == var0 || var0 < class172.ByteArrayPool_alternativeSizes[var2] && var1) && class132.ByteArrayPool_altSizeArrayCounts[var2] > 0) {
                  byte[] var3 = class9.ByteArrayPool_arrays[var2][--class132.ByteArrayPool_altSizeArrayCounts[var2]];
                  class9.ByteArrayPool_arrays[var2][class132.ByteArrayPool_altSizeArrayCounts[var2]] = null;
                  return var3;
               }
            }
         }

         if (var1 && class172.ByteArrayPool_alternativeSizes != null) {
            for(var2 = 0; var2 < class172.ByteArrayPool_alternativeSizes.length; ++var2) {
               if (var0 <= class172.ByteArrayPool_alternativeSizes[var2] && class132.ByteArrayPool_altSizeArrayCounts[var2] < class9.ByteArrayPool_arrays[var2].length) {
                  return new byte[class172.ByteArrayPool_alternativeSizes[var2]];
               }
            }
         }

         return new byte[var0];
      }
   }
}
