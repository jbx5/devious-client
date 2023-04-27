import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
public enum class123 implements MouseWheel {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lex;"
   )
   field1496(0, 0),
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lex;"
   )
   field1487(1, 1),
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lex;"
   )
   field1489(2, 2),
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lex;"
   )
   field1490(3, 3),
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Lex;"
   )
   field1491(4, 4);

   @ObfuscatedName("uo")
   @ObfuscatedGetter(
      intValue = -1828372480
   )
   static int field1499;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Ltq;"
   )
   @Export("leftTitleSprite")
   static SpritePixels leftTitleSprite;
   @ObfuscatedName("rk")
   @ObfuscatedSignature(
      descriptor = "Lgf;"
   )
   @Export("mouseWheel")
   static class170 mouseWheel;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 446031691
   )
   final int field1495;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 355070857
   )
   final int field1493;

   class123(int var3, int var4) {
      this.field1495 = var3;
      this.field1493 = var4;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "741942848"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field1493;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "([Lcl;II[I[II)V",
      garbageValue = "-139825594"
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

                  if (var12 != var11) {
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
}
