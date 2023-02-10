import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public class class156 {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      longValue = 4578511467478170483L
   )
   long field1775;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      longValue = 1193244438836580063L
   )
   long field1772 = -1L;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lmt;"
   )
   IterableNodeDeque field1773 = new IterableNodeDeque();

   @ObfuscatedSignature(
      descriptor = "(Lrd;)V"
   )
   public class156(Buffer var1) {
      this.method3336(var1);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lrd;I)V",
      garbageValue = "-2055199078"
   )
   void method3336(Buffer var1) {
      this.field1775 = var1.readLong();
      this.field1772 = var1.readLong();

      for(int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
         Object var3;
         if (var2 == 1) {
            var3 = new class151(this);
         } else if (var2 == 4) {
            var3 = new class162(this);
         } else if (var2 == 3) {
            var3 = new class147(this);
         } else if (var2 == 2) {
            var3 = new class145(this);
         } else {
            if (var2 != 5) {
               throw new RuntimeException("");
            }

            var3 = new class152(this);
         }

         ((class155)var3).vmethod3387(var1);
         this.field1773.addFirst((Node)var3);
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(Lfm;B)V",
      garbageValue = "0"
   )
   public void method3335(ClanChannel var1) {
      if (var1.key == this.field1775 && this.field1772 == var1.field1792) {
         for(class155 var2 = (class155)this.field1773.last(); var2 != null; var2 = (class155)this.field1773.previous()) {
            var2.vmethod3388(var1);
         }

         ++var1.field1792;
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "([Lbw;II[I[II)V",
      garbageValue = "1537846162"
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
