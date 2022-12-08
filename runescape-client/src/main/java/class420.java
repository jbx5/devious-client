import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ph")
public class class420 {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lph;"
   )
   public static final class420 field4652 = new class420("application/json");
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lph;"
   )
   static final class420 field4653 = new class420("text/plain");
   @ObfuscatedName("fz")
   @ObfuscatedGetter(
      intValue = -405163687
   )
   static int field4655;
   @ObfuscatedName("v")
   String field4654;

   class420(String var1) {
      this.field4654 = var1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-1073877249"
   )
   public String method7905() {
      return this.field4654;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "([Lbz;II[I[IB)V",
      garbageValue = "1"
   )
   @Export("sortWorlds")
   static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
      if (var1 < var2) {
         int var5 = var1 - 1;
         int var6 = var2 + 1;
         int var7 = (var2 + var1) / 2;
         World var8 = var0[var7];
         var0[var7] = var0[var1];
         var0[var1] = var8;

         while(var5 < var6) {
            boolean var9 = true;

            int var10;
            int var11;
            int var12;
            do {
               --var6;

               for(var10 = 0; var10 < 4; ++var10) {
                  if (var3[var10] == 2) {
                     var11 = var0[var6].index;
                     var12 = var8.index;
                  } else if (var3[var10] == 1) {
                     var11 = var0[var6].population;
                     var12 = var8.population;
                     if (var11 == -1 && var4[var10] == 1) {
                        var11 = 2001;
                     }

                     if (var12 == -1 && var4[var10] == 1) {
                        var12 = 2001;
                     }
                  } else if (var3[var10] == 3) {
                     var11 = var0[var6].isMembersOnly() ? 1 : 0;
                     var12 = var8.isMembersOnly() ? 1 : 0;
                  } else {
                     var11 = var0[var6].id;
                     var12 = var8.id;
                  }

                  if (var11 != var12) {
                     if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) {
                        var9 = false;
                     }
                     break;
                  }

                  if (var10 == 3) {
                     var9 = false;
                  }
               }
            } while(var9);

            var9 = true;

            do {
               ++var5;

               for(var10 = 0; var10 < 4; ++var10) {
                  if (var3[var10] == 2) {
                     var11 = var0[var5].index;
                     var12 = var8.index;
                  } else if (var3[var10] == 1) {
                     var11 = var0[var5].population;
                     var12 = var8.population;
                     if (var11 == -1 && var4[var10] == 1) {
                        var11 = 2001;
                     }

                     if (var12 == -1 && var4[var10] == 1) {
                        var12 = 2001;
                     }
                  } else if (var3[var10] == 3) {
                     var11 = var0[var5].isMembersOnly() ? 1 : 0;
                     var12 = var8.isMembersOnly() ? 1 : 0;
                  } else {
                     var11 = var0[var5].id;
                     var12 = var8.id;
                  }

                  if (var11 != var12) {
                     if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) {
                        var9 = false;
                     }
                     break;
                  }

                  if (var10 == 3) {
                     var9 = false;
                  }
               }
            } while(var9);

            if (var5 < var6) {
               World var13 = var0[var5];
               var0[var5] = var0[var6];
               var0[var6] = var13;
            }
         }

         sortWorlds(var0, var1, var6, var3, var4);
         sortWorlds(var0, var6 + 1, var2, var3, var4);
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1926979042"
   )
   public static void method7904() {
      DbRowType.DBRowType_cache.clear();
   }
}
