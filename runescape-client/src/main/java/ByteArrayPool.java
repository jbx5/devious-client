import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oj")
@Implements("ByteArrayPool")
public class ByteArrayPool {
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -300357261
   )
   @Export("ByteArrayPool_smallCount")
   static int ByteArrayPool_smallCount = 0;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 481846585
   )
   @Export("ByteArrayPool_mediumCount")
   static int ByteArrayPool_mediumCount = 0;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -926544205
   )
   @Export("ByteArrayPool_largeCount")
   static int ByteArrayPool_largeCount = 0;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 767381159
   )
   static int field4476 = 0;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 255163693
   )
   static int field4469 = 1000;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 1720410087
   )
   static int field4470 = 250;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -1922603885
   )
   static int field4471 = 100;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1866109675
   )
   static int field4463 = 50;
   @ObfuscatedName("ax")
   @Export("ByteArrayPool_small")
   static byte[][] ByteArrayPool_small = new byte[1000][];
   @ObfuscatedName("ai")
   @Export("ByteArrayPool_medium")
   static byte[][] ByteArrayPool_medium = new byte[250][];
   @ObfuscatedName("ag")
   @Export("ByteArrayPool_large")
   static byte[][] ByteArrayPool_large = new byte[100][];
   @ObfuscatedName("ah")
   static byte[][] field4474 = new byte[50][];
   @ObfuscatedName("as")
   static ArrayList field4472 = new ArrayList();
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lki;"
   )
   @Export("worldMapEvent")
   static WorldMapEvent worldMapEvent;
   @ObfuscatedName("ck")
   @ObfuscatedGetter(
      intValue = -431815809
   )
   static int field4478;

   static {
      class273.method5614();
      new HashMap();
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IZB)[B",
      garbageValue = "20"
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
      } else if ((var0 == 30000 || var0 < 30000 && var1) && field4476 > 0) {
         var4 = field4474[--field4476];
         field4474[field4476] = null;
         return var4;
      } else {
         int var2;
         if (UserComparator3.ByteArrayPool_arrays != null) {
            for(var2 = 0; var2 < ClanChannel.ByteArrayPool_alternativeSizes.length; ++var2) {
               if ((ClanChannel.ByteArrayPool_alternativeSizes[var2] == var0 || var0 < ClanChannel.ByteArrayPool_alternativeSizes[var2] && var1) && class136.ByteArrayPool_altSizeArrayCounts[var2] > 0) {
                  byte[] var3 = UserComparator3.ByteArrayPool_arrays[var2][--class136.ByteArrayPool_altSizeArrayCounts[var2]];
                  UserComparator3.ByteArrayPool_arrays[var2][class136.ByteArrayPool_altSizeArrayCounts[var2]] = null;
                  return var3;
               }
            }
         }

         if (var1 && ClanChannel.ByteArrayPool_alternativeSizes != null) {
            for(var2 = 0; var2 < ClanChannel.ByteArrayPool_alternativeSizes.length; ++var2) {
               if (var0 <= ClanChannel.ByteArrayPool_alternativeSizes[var2] && class136.ByteArrayPool_altSizeArrayCounts[var2] < UserComparator3.ByteArrayPool_arrays[var2].length) {
                  return new byte[ClanChannel.ByteArrayPool_alternativeSizes[var2]];
               }
            }
         }

         return new byte[var0];
      }
   }

   @ObfuscatedName("kj")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1906032667"
   )
   static final boolean method7595() {
      return Client.isMenuOpen;
   }
}
