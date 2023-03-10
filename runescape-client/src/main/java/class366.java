import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ok")
public class class366 {
   @ObfuscatedName("aj")
   static char[] field4340 = new char[64];
   @ObfuscatedName("al")
   static char[] field4336;
   @ObfuscatedName("ac")
   static char[] field4337;
   @ObfuscatedName("ab")
   static int[] field4339;
   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "Lfi;"
   )
   static ClanSettings field4338;

   static {
      int var0;
      for(var0 = 0; var0 < 26; ++var0) {
         field4340[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field4340[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field4340[var0] = (char)(var0 + 48 - 52);
      }

      field4340[62] = '+';
      field4340[63] = '/';
      field4336 = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         field4336[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field4336[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field4336[var0] = (char)(var0 + 48 - 52);
      }

      field4336[62] = '*';
      field4336[63] = '-';
      field4337 = new char[64];

      for(var0 = 0; var0 < 26; ++var0) {
         field4337[var0] = (char)(var0 + 65);
      }

      for(var0 = 26; var0 < 52; ++var0) {
         field4337[var0] = (char)(var0 + 97 - 26);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         field4337[var0] = (char)(var0 + 48 - 52);
      }

      field4337[62] = '-';
      field4337[63] = '_';
      field4339 = new int[128];

      for(var0 = 0; var0 < field4339.length; ++var0) {
         field4339[var0] = -1;
      }

      for(var0 = 65; var0 <= 90; ++var0) {
         field4339[var0] = var0 - 65;
      }

      for(var0 = 97; var0 <= 122; ++var0) {
         field4339[var0] = var0 - 97 + 26;
      }

      for(var0 = 48; var0 <= 57; ++var0) {
         field4339[var0] = var0 - 48 + 52;
      }

      int[] var2 = field4339;
      field4339[43] = 62;
      var2[42] = 62;
      int[] var1 = field4339;
      field4339[47] = 63;
      var1[45] = 63;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "([BI)V",
      garbageValue = "681579235"
   )
   @Export("ByteArrayPool_release")
   public static synchronized void ByteArrayPool_release(byte[] var0) {
      if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4420) {
         ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0;
      } else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4421) {
         ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0;
      } else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4422) {
         ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0;
      } else if (var0.length == 30000 && ByteArrayPool.field4417 < ByteArrayPool.field4413) {
         ByteArrayPool.field4427[++ByteArrayPool.field4417 - 1] = var0;
      } else {
         if (InterfaceParent.ByteArrayPool_arrays != null) {
            for(int var1 = 0; var1 < class212.ByteArrayPool_alternativeSizes.length; ++var1) {
               if (var0.length == class212.ByteArrayPool_alternativeSizes[var1] && SoundSystem.ByteArrayPool_altSizeArrayCounts[var1] < InterfaceParent.ByteArrayPool_arrays[var1].length) {
                  InterfaceParent.ByteArrayPool_arrays[var1][SoundSystem.ByteArrayPool_altSizeArrayCounts[var1]++] = var0;
                  return;
               }
            }
         }

      }
   }
}
