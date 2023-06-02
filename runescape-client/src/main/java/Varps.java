import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mq")
@Implements("Varps")
public class Varps {
   @ObfuscatedName("at")
   @Export("Varps_masks")
   static int[] Varps_masks = new int[32];
   @ObfuscatedName("an")
   @Export("Varps_temp")
   public static int[] Varps_temp;
   @ObfuscatedName("av")
   @Export("Varps_main")
   public static int[] Varps_main;

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         Varps_masks[var1] = var0 - 1;
         var0 += var0;
      }

      Varps_temp = new int[4000];
      Varps_main = new int[4000];
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/Object;ZI)[B",
      garbageValue = "-2086195684"
   )
   public static byte[] method5964(Object var0, boolean var1) {
      if (var0 == null) {
         return null;
      } else if (var0 instanceof byte[]) {
         byte[] var6 = (byte[])((byte[])var0);
         if (var1) {
            int var4 = var6.length;
            byte[] var5 = new byte[var4];
            System.arraycopy(var6, 0, var5, 0, var4);
            return var5;
         } else {
            return var6;
         }
      } else if (var0 instanceof AbstractByteArrayCopier) {
         AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0;
         return var2.get();
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(CLoj;I)C",
      garbageValue = "1799848772"
   )
   @Export("standardizeChar")
   static char standardizeChar(char var0, Language var1) {
      if (var0 >= 192 && var0 <= 255) {
         if (var0 >= 192 && var0 <= 198) {
            return 'A';
         }

         if (var0 == 199) {
            return 'C';
         }

         if (var0 >= 200 && var0 <= 203) {
            return 'E';
         }

         if (var0 >= 204 && var0 <= 207) {
            return 'I';
         }

         if (var0 == 209 && var1 != Language.Language_ES) {
            return 'N';
         }

         if (var0 >= 210 && var0 <= 214) {
            return 'O';
         }

         if (var0 >= 217 && var0 <= 220) {
            return 'U';
         }

         if (var0 == 221) {
            return 'Y';
         }

         if (var0 == 223) {
            return 's';
         }

         if (var0 >= 224 && var0 <= 230) {
            return 'a';
         }

         if (var0 == 231) {
            return 'c';
         }

         if (var0 >= 232 && var0 <= 235) {
            return 'e';
         }

         if (var0 >= 236 && var0 <= 239) {
            return 'i';
         }

         if (var0 == 241 && var1 != Language.Language_ES) {
            return 'n';
         }

         if (var0 >= 242 && var0 <= 246) {
            return 'o';
         }

         if (var0 >= 249 && var0 <= 252) {
            return 'u';
         }

         if (var0 == 253 || var0 == 255) {
            return 'y';
         }
      }

      if (var0 == 338) {
         return 'O';
      } else if (var0 == 339) {
         return 'o';
      } else if (var0 == 376) {
         return 'Y';
      } else {
         return var0;
      }
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(IB)Lfg;",
      garbageValue = "70"
   )
   static class130 method5963(int var0) {
      class130 var1 = (class130)GameObject.findEnumerated(class166.method3387(), var0);
      if (var1 == null) {
         var1 = class130.field1534;
      }

      return var1;
   }
}
