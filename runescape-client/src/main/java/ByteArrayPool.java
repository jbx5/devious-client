import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nf")
@Implements("ByteArrayPool")
public class ByteArrayPool {
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = 165480711
   )
   @Export("ByteArrayPool_smallCount")
   static int ByteArrayPool_smallCount = 0;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -458850417
   )
   @Export("ByteArrayPool_mediumCount")
   static int ByteArrayPool_mediumCount = 0;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 408344857
   )
   @Export("ByteArrayPool_largeCount")
   static int ByteArrayPool_largeCount = 0;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1119030477
   )
   static int field4437 = 0;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -559970069
   )
   static int field4438 = 1000;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 700428281
   )
   static int field4431 = 250;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 1503025801
   )
   static int field4440 = 100;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 822016073
   )
   static int field4439 = 50;
   @ObfuscatedName("i")
   @Export("ByteArrayPool_small")
   static byte[][] ByteArrayPool_small = new byte[1000][];
   @ObfuscatedName("o")
   @Export("ByteArrayPool_medium")
   static byte[][] ByteArrayPool_medium = new byte[250][];
   @ObfuscatedName("n")
   @Export("ByteArrayPool_large")
   static byte[][] ByteArrayPool_large = new byte[100][];
   @ObfuscatedName("k")
   static byte[][] field4445 = new byte[50][];
   @ObfuscatedName("t")
   public static ArrayList field4446 = new ArrayList();

   static {
      field4446.clear();
      field4446.add(100);
      field4446.add(5000);
      field4446.add(10000);
      field4446.add(30000);
      new HashMap();
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(IZB)[B",
      garbageValue = "80"
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
      } else if ((var0 == 30000 || var0 < 30000 && var1) && field4437 > 0) {
         var4 = field4445[--field4437];
         field4445[field4437] = null;
         return var4;
      } else {
         int var2;
         if (SceneTilePaint.ByteArrayPool_arrays != null) {
            for(var2 = 0; var2 < Frames.ByteArrayPool_alternativeSizes.length; ++var2) {
               if ((Frames.ByteArrayPool_alternativeSizes[var2] == var0 || var0 < Frames.ByteArrayPool_alternativeSizes[var2] && var1) && ModelData0.ByteArrayPool_altSizeArrayCounts[var2] > 0) {
                  byte[] var3 = SceneTilePaint.ByteArrayPool_arrays[var2][--ModelData0.ByteArrayPool_altSizeArrayCounts[var2]];
                  SceneTilePaint.ByteArrayPool_arrays[var2][ModelData0.ByteArrayPool_altSizeArrayCounts[var2]] = null;
                  return var3;
               }
            }
         }

         if (var1 && Frames.ByteArrayPool_alternativeSizes != null) {
            for(var2 = 0; var2 < Frames.ByteArrayPool_alternativeSizes.length; ++var2) {
               if (var0 <= Frames.ByteArrayPool_alternativeSizes[var2] && ModelData0.ByteArrayPool_altSizeArrayCounts[var2] < SceneTilePaint.ByteArrayPool_arrays[var2].length) {
                  return new byte[Frames.ByteArrayPool_alternativeSizes[var2]];
               }
            }
         }

         return new byte[var0];
      }
   }

   @ObfuscatedName("kt")
   @ObfuscatedSignature(
      descriptor = "(IIIZB)V",
      garbageValue = "101"
   )
   static final void method7319(int var0, int var1, int var2, boolean var3) {
      if (Players.loadInterface(var0)) {
         ItemContainer.resizeInterface(class71.Widget_interfaceComponents[var0], -1, var1, var2, var3);
      }
   }
}
