import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1763916019
   )
   @Export("id")
   int id;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1296860225
   )
   @Export("cycleStart")
   int cycleStart;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1267714979
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -983407105
   )
   @Export("y")
   int y;
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -1470591223
   )
   @Export("x")
   int x;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1313330391
   )
   @Export("z")
   int z;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lga;"
   )
   @Export("sequenceDefinition")
   SequenceDefinition sequenceDefinition;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1859823171
   )
   @Export("frame")
   int frame;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 2082705889
   )
   @Export("frameCycle")
   int frameCycle;
   @ObfuscatedName("b")
   @Export("isFinished")
   boolean isFinished;

   GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.frame = 0;
      this.frameCycle = 0;
      this.isFinished = false;
      this.id = var1;
      this.plane = var2;
      this.x = var3;
      this.y = var4;
      this.z = var5;
      this.cycleStart = var7 + var6;
      int var8 = ClanSettings.SpotAnimationDefinition_get(this.id).sequence;
      if (var8 != -1) {
         this.isFinished = false;
         this.sequenceDefinition = AABB.SequenceDefinition_get(var8);
      } else {
         this.isFinished = true;
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "110882397"
   )
   @Export("advance")
   final void advance(int var1) {
      if (!this.isFinished) {
         this.frameCycle += var1;
         if (!this.sequenceDefinition.isCachedModelIdSet()) {
            while(this.frameCycle > this.sequenceDefinition.frameLengths[this.frame]) {
               this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
               ++this.frame;
               if (this.frame >= this.sequenceDefinition.frameIds.length) {
                  this.isFinished = true;
                  break;
               }
            }
         } else {
            this.frame += var1;
            if (this.frame >= this.sequenceDefinition.method4024()) {
               this.isFinished = true;
            }
         }

      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(I)Lhh;",
      garbageValue = "-1279733976"
   )
   @Export("getModel")
   protected final Model getModel() {
      SpotAnimationDefinition var1 = ClanSettings.SpotAnimationDefinition_get(this.id);
      Model var2;
      if (!this.isFinished) {
         var2 = var1.getModel(this.frame);
      } else {
         var2 = var1.getModel(-1);
      }

      return var2 == null ? null : var2;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)[Lom;",
      garbageValue = "-2061778903"
   )
   static class413[] method2028() {
      return new class413[]{class413.field4637, class413.field4636, class413.field4635, class413.field4639};
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "44034066"
   )
   static int method2024() {
      return Login.loginIndex;
   }

   @ObfuscatedName("gu")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "51"
   )
   static int method2021() {
      if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
         int var0 = 0;

         for(int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
            var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount;
         }

         return var0 * 10000 / Client.field804;
      } else {
         return 10000;
      }
   }

   @ObfuscatedName("im")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1124455620"
   )
   static boolean method2026() {
      return (Client.drawPlayerNames & 8) != 0;
   }

   @ObfuscatedName("kk")
   @ObfuscatedSignature(
      descriptor = "(Lkd;II)I",
      garbageValue = "-1546792935"
   )
   static final int method2025(Widget var0, int var1) {
      if (var0.cs1Instructions != null && var1 < var0.cs1Instructions.length) {
         try {
            int[] var2 = var0.cs1Instructions[var1];
            int var3 = 0;
            int var4 = 0;
            byte var5 = 0;

            while(true) {
               int var6 = var2[var4++];
               int var7 = 0;
               byte var8 = 0;
               if (var6 == 0) {
                  return var3;
               }

               if (var6 == 1) {
                  var7 = Client.currentLevels[var2[var4++]];
               }

               if (var6 == 2) {
                  var7 = Client.levels[var2[var4++]];
               }

               if (var6 == 3) {
                  var7 = Client.experience[var2[var4++]];
               }

               int var9;
               Widget var10;
               int var11;
               int var12;
               if (var6 == 4) {
                  var9 = var2[var4++] << 16;
                  var9 += var2[var4++];
                  var10 = PlayerCompositionColorTextureOverride.getWidget(var9);
                  var11 = var2[var4++];
                  if (var11 != -1 && (!NPCComposition.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
                     for(var12 = 0; var12 < var10.itemIds.length; ++var12) {
                        if (var11 + 1 == var10.itemIds[var12]) {
                           var7 += var10.itemQuantities[var12];
                        }
                     }
                  }
               }

               if (var6 == 5) {
                  var7 = Varps.Varps_main[var2[var4++]];
               }

               if (var6 == 6) {
                  var7 = Skills.Skills_experienceTable[Client.levels[var2[var4++]] - 1];
               }

               if (var6 == 7) {
                  var7 = Varps.Varps_main[var2[var4++]] * 100 / '뜛';
               }

               if (var6 == 8) {
                  var7 = class155.localPlayer.combatLevel;
               }

               if (var6 == 9) {
                  for(var9 = 0; var9 < 25; ++var9) {
                     if (Skills.Skills_enabled[var9]) {
                        var7 += Client.levels[var9];
                     }
                  }
               }

               if (var6 == 10) {
                  var9 = var2[var4++] << 16;
                  var9 += var2[var4++];
                  var10 = PlayerCompositionColorTextureOverride.getWidget(var9);
                  var11 = var2[var4++];
                  if (var11 != -1 && (!NPCComposition.ItemDefinition_get(var11).isMembersOnly || Client.isMembersWorld)) {
                     for(var12 = 0; var12 < var10.itemIds.length; ++var12) {
                        if (var11 + 1 == var10.itemIds[var12]) {
                           var7 = 999999999;
                           break;
                        }
                     }
                  }
               }

               if (var6 == 11) {
                  var7 = Client.runEnergy;
               }

               if (var6 == 12) {
                  var7 = Client.weight;
               }

               if (var6 == 13) {
                  var9 = Varps.Varps_main[var2[var4++]];
                  int var13 = var2[var4++];
                  var7 = (var9 & 1 << var13) != 0 ? 1 : 0;
               }

               if (var6 == 14) {
                  var9 = var2[var4++];
                  var7 = PlayerCompositionColorTextureOverride.getVarbit(var9);
               }

               if (var6 == 15) {
                  var8 = 1;
               }

               if (var6 == 16) {
                  var8 = 2;
               }

               if (var6 == 17) {
                  var8 = 3;
               }

               if (var6 == 18) {
                  var7 = class154.baseX * 64 + (class155.localPlayer.x >> 7);
               }

               if (var6 == 19) {
                  var7 = class365.baseY * 64 + (class155.localPlayer.y >> 7);
               }

               if (var6 == 20) {
                  var7 = var2[var4++];
               }

               if (var8 == 0) {
                  if (var5 == 0) {
                     var3 += var7;
                  }

                  if (var5 == 1) {
                     var3 -= var7;
                  }

                  if (var5 == 2 && var7 != 0) {
                     var3 /= var7;
                  }

                  if (var5 == 3) {
                     var3 *= var7;
                  }

                  var5 = 0;
               } else {
                  var5 = var8;
               }
            }
         } catch (Exception var14) {
            return -1;
         }
      } else {
         return -2;
      }
   }

   public GraphicsObject() {
   }
}
