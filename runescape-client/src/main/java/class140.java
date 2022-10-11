import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
public class class140 extends class135 {
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "Lkn;"
   )
   @Export("scriptDotWidget")
   static Widget scriptDotWidget;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -584515193
   )
   int field1625;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -1635278101
   )
   int field1622;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1633329395
   )
   int field1623;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1944544005
   )
   int field1624;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lel;"
   )
   final class138 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lel;)V"
   )
   class140(class138 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lqr;I)V",
      garbageValue = "-1428026624"
   )
   void vmethod3254(Buffer var1) {
      this.field1625 = var1.readInt();
      this.field1624 = var1.readInt();
      this.field1622 = var1.readUnsignedByte();
      this.field1623 = var1.readUnsignedByte();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ler;B)V",
      garbageValue = "-110"
   )
   void vmethod3248(ClanSettings var1) {
      var1.method3090(this.field1625, this.field1624, this.field1622, this.field1623);
   }

   @ObfuscatedName("hs")
   @ObfuscatedSignature(
      descriptor = "(Lcl;II)V",
      garbageValue = "-1812147921"
   )
   static final void method3021(Actor var0, int var1) {
      Skeleton.worldToScreen(var0.x, var0.y, var1);
   }

   @ObfuscatedName("ij")
   @ObfuscatedSignature(
      descriptor = "(IIIIIB)V",
      garbageValue = "-10"
   )
   @Export("drawObject")
   static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
      long var5 = class139.scene.getBoundaryObjectTag(var0, var1, var2);
      int var7;
      int var8;
      int var9;
      int var10;
      int var12;
      int var13;
      if (0L != var5) {
         var7 = class139.scene.getObjectFlags(var0, var1, var2, var5);
         var8 = var7 >> 6 & 3;
         var9 = var7 & 31;
         var10 = var3;
         if (AbstractByteArrayCopier.method6222(var5)) {
            var10 = var4;
         }

         int[] var11 = Calendar.sceneMinimapSprite.pixels;
         var12 = var1 * 4 + (103 - var2) * 2048 + 24624;
         var13 = AttackOption.Entity_unpackID(var5);
         ObjectComposition var14 = InterfaceParent.getObjectDefinition(var13);
         if (var14.mapSceneId != -1) {
            IndexedSprite var15 = HealthBar.mapSceneSprites[var14.mapSceneId];
            if (var15 != null) {
               int var16 = (var14.sizeX * 4 - var15.subWidth) / 2;
               int var17 = (var14.sizeY * 4 - var15.subHeight) / 2;
               var15.drawAt(var16 + var1 * 4 + 48, (104 - var2 - var14.sizeY) * 4 + var17 + 48);
            }
         } else {
            if (var9 == 0 || var9 == 2) {
               if (var8 == 0) {
                  var11[var12] = var10;
                  var11[var12 + 512] = var10;
                  var11[var12 + 1024] = var10;
                  var11[var12 + 1536] = var10;
               } else if (var8 == 1) {
                  var11[var12] = var10;
                  var11[var12 + 1] = var10;
                  var11[var12 + 2] = var10;
                  var11[var12 + 3] = var10;
               } else if (var8 == 2) {
                  var11[var12 + 3] = var10;
                  var11[var12 + 512 + 3] = var10;
                  var11[var12 + 1024 + 3] = var10;
                  var11[var12 + 1536 + 3] = var10;
               } else if (var8 == 3) {
                  var11[var12 + 1536] = var10;
                  var11[var12 + 1536 + 1] = var10;
                  var11[var12 + 1536 + 2] = var10;
                  var11[var12 + 1536 + 3] = var10;
               }
            }

            if (var9 == 3) {
               if (var8 == 0) {
                  var11[var12] = var10;
               } else if (var8 == 1) {
                  var11[var12 + 3] = var10;
               } else if (var8 == 2) {
                  var11[var12 + 1536 + 3] = var10;
               } else if (var8 == 3) {
                  var11[var12 + 1536] = var10;
               }
            }

            if (var9 == 2) {
               if (var8 == 3) {
                  var11[var12] = var10;
                  var11[var12 + 512] = var10;
                  var11[var12 + 1024] = var10;
                  var11[var12 + 1536] = var10;
               } else if (var8 == 0) {
                  var11[var12] = var10;
                  var11[var12 + 1] = var10;
                  var11[var12 + 2] = var10;
                  var11[var12 + 3] = var10;
               } else if (var8 == 1) {
                  var11[var12 + 3] = var10;
                  var11[var12 + 512 + 3] = var10;
                  var11[var12 + 1024 + 3] = var10;
                  var11[var12 + 1536 + 3] = var10;
               } else if (var8 == 2) {
                  var11[var12 + 1536] = var10;
                  var11[var12 + 1536 + 1] = var10;
                  var11[var12 + 1536 + 2] = var10;
                  var11[var12 + 1536 + 3] = var10;
               }
            }
         }
      }

      var5 = class139.scene.getGameObjectTag(var0, var1, var2);
      if (0L != var5) {
         var7 = class139.scene.getObjectFlags(var0, var1, var2, var5);
         var8 = var7 >> 6 & 3;
         var9 = var7 & 31;
         var10 = AttackOption.Entity_unpackID(var5);
         ObjectComposition var24 = InterfaceParent.getObjectDefinition(var10);
         int var19;
         if (var24.mapSceneId != -1) {
            IndexedSprite var20 = HealthBar.mapSceneSprites[var24.mapSceneId];
            if (var20 != null) {
               var13 = (var24.sizeX * 4 - var20.subWidth) / 2;
               var19 = (var24.sizeY * 4 - var20.subHeight) / 2;
               var20.drawAt(var13 + var1 * 4 + 48, var19 + (104 - var2 - var24.sizeY) * 4 + 48);
            }
         } else if (var9 == 9) {
            var12 = 15658734;
            if (AbstractByteArrayCopier.method6222(var5)) {
               var12 = 15597568;
            }

            int[] var18 = Calendar.sceneMinimapSprite.pixels;
            var19 = var1 * 4 + (103 - var2) * 2048 + 24624;
            if (var8 != 0 && var8 != 2) {
               var18[var19] = var12;
               var18[var19 + 1 + 512] = var12;
               var18[var19 + 1024 + 2] = var12;
               var18[var19 + 1536 + 3] = var12;
            } else {
               var18[var19 + 1536] = var12;
               var18[var19 + 1 + 1024] = var12;
               var18[var19 + 512 + 2] = var12;
               var18[var19 + 3] = var12;
            }
         }
      }

      var5 = class139.scene.getFloorDecorationTag(var0, var1, var2);
      if (0L != var5) {
         var7 = AttackOption.Entity_unpackID(var5);
         ObjectComposition var21 = InterfaceParent.getObjectDefinition(var7);
         if (var21.mapSceneId != -1) {
            IndexedSprite var22 = HealthBar.mapSceneSprites[var21.mapSceneId];
            if (var22 != null) {
               var10 = (var21.sizeX * 4 - var22.subWidth) / 2;
               int var23 = (var21.sizeY * 4 - var22.subHeight) / 2;
               var22.drawAt(var10 + var1 * 4 + 48, var23 + (104 - var2 - var21.sizeY) * 4 + 48);
            }
         }
      }

   }
}
