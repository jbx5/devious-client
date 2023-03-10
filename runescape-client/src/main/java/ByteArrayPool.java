import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ot")
@Implements("ByteArrayPool")
public class ByteArrayPool {
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -868010203
   )
   @Export("ByteArrayPool_smallCount")
   static int ByteArrayPool_smallCount = 0;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -376683317
   )
   @Export("ByteArrayPool_mediumCount")
   static int ByteArrayPool_mediumCount = 0;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 105173507
   )
   @Export("ByteArrayPool_largeCount")
   static int ByteArrayPool_largeCount = 0;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -1943183323
   )
   static int field4417 = 0;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 1880973257
   )
   static int field4420 = 1000;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 182947453
   )
   static int field4421 = 250;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 2013212249
   )
   static int field4422 = 100;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -2032532103
   )
   static int field4413 = 50;
   @ObfuscatedName("as")
   @Export("ByteArrayPool_small")
   static byte[][] ByteArrayPool_small = new byte[1000][];
   @ObfuscatedName("ay")
   @Export("ByteArrayPool_medium")
   static byte[][] ByteArrayPool_medium = new byte[250][];
   @ObfuscatedName("am")
   @Export("ByteArrayPool_large")
   static byte[][] ByteArrayPool_large = new byte[100][];
   @ObfuscatedName("az")
   static byte[][] field4427 = new byte[50][];
   @ObfuscatedName("at")
   public static ArrayList field4424 = new ArrayList();

   static {
      SpriteMask.method5743();
      new HashMap();
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(IZI)[B",
      garbageValue = "1201755418"
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
      } else if ((var0 == 30000 || var0 < 30000 && var1) && field4417 > 0) {
         var4 = field4427[--field4417];
         field4427[field4417] = null;
         return var4;
      } else {
         int var2;
         if (InterfaceParent.ByteArrayPool_arrays != null) {
            for(var2 = 0; var2 < class212.ByteArrayPool_alternativeSizes.length; ++var2) {
               if ((class212.ByteArrayPool_alternativeSizes[var2] == var0 || var0 < class212.ByteArrayPool_alternativeSizes[var2] && var1) && SoundSystem.ByteArrayPool_altSizeArrayCounts[var2] > 0) {
                  byte[] var3 = InterfaceParent.ByteArrayPool_arrays[var2][--SoundSystem.ByteArrayPool_altSizeArrayCounts[var2]];
                  InterfaceParent.ByteArrayPool_arrays[var2][SoundSystem.ByteArrayPool_altSizeArrayCounts[var2]] = null;
                  return var3;
               }
            }
         }

         if (var1 && class212.ByteArrayPool_alternativeSizes != null) {
            for(var2 = 0; var2 < class212.ByteArrayPool_alternativeSizes.length; ++var2) {
               if (var0 <= class212.ByteArrayPool_alternativeSizes[var2] && SoundSystem.ByteArrayPool_altSizeArrayCounts[var2] < InterfaceParent.ByteArrayPool_arrays[var2].length) {
                  return new byte[class212.ByteArrayPool_alternativeSizes[var2]];
               }
            }
         }

         return new byte[var0];
      }
   }
}
