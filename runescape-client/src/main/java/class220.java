import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
public class class220 {
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "[Lek;"
   )
   class124[] field2493;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 834771481
   )
   int field2495;

   @ObfuscatedSignature(
      descriptor = "(Lsy;I)V"
   )
   class220(Buffer var1, int var2) {
      this.field2493 = new class124[var2];
      this.field2495 = var1.readUnsignedByte();

      for(int var3 = 0; var3 < this.field2493.length; ++var3) {
         class124 var4 = new class124(this.field2495, var1, false);
         this.field2493[var3] = var4;
      }

      this.method4358();
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-80"
   )
   void method4358() {
      class124[] var1 = this.field2493;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class124 var3 = var1[var2];
         if (var3.field1465 >= 0) {
            var3.field1474 = this.field2493[var3.field1465];
         }
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1674364647"
   )
   public int method4357() {
      return this.field2493.length;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IS)Lek;",
      garbageValue = "-12649"
   )
   class124 method4360(int var1) {
      return var1 >= this.method4357() ? null : this.field2493[var1];
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)[Lek;",
      garbageValue = "-487937251"
   )
   class124[] method4372() {
      return this.field2493;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lfl;II)V",
      garbageValue = "-613367397"
   )
   void method4362(class134 var1, int var2) {
      this.method4371(var1, var2, (boolean[])null, false);
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Lfl;I[ZZI)V",
      garbageValue = "-914349223"
   )
   void method4371(class134 var1, int var2, boolean[] var3, boolean var4) {
      int var5 = var1.method3058();
      int var6 = 0;
      class124[] var7 = this.method4372();

      for(int var8 = 0; var8 < var7.length; ++var8) {
         class124 var9 = var7[var8];
         if (var3 == null || var4 == var3[var6]) {
            var1.method3047(var2, var9, var6, var5);
         }

         ++var6;
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "([BIIIIIIIII[Liz;I)V",
      garbageValue = "-707722380"
   )
   static final void method4359(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, CollisionMap[] var10) {
      int var12;
      for(int var11 = 0; var11 < 8; ++var11) {
         for(var12 = 0; var12 < 8; ++var12) {
            if (var11 + var2 > 0 && var11 + var2 < 103 && var3 + var12 > 0 && var3 + var12 < 103) {
               int[] var10000 = var10[var1].flags[var11 + var2];
               var10000[var12 + var3] &= -16777217;
            }
         }
      }

      Buffer var29 = new Buffer(var0);

      for(var12 = 0; var12 < 4; ++var12) {
         for(int var13 = 0; var13 < 64; ++var13) {
            for(int var14 = 0; var14 < 64; ++var14) {
               if (var12 == var4 && var13 >= var5 && var13 < var5 + 8 && var14 >= var6 && var14 < var6 + 8) {
                  int var17 = var13 & 7;
                  int var18 = var14 & 7;
                  int var19 = var7 & 3;
                  int var16;
                  if (var19 == 0) {
                     var16 = var17;
                  } else if (var19 == 1) {
                     var16 = var18;
                  } else if (var19 == 2) {
                     var16 = 7 - var17;
                  } else {
                     var16 = 7 - var18;
                  }

                  int var20 = var2 + var16;
                  int var23 = var13 & 7;
                  int var24 = var14 & 7;
                  int var25 = var7 & 3;
                  int var22;
                  if (var25 == 0) {
                     var22 = var24;
                  } else if (var25 == 1) {
                     var22 = 7 - var23;
                  } else if (var25 == 2) {
                     var22 = 7 - var24;
                  } else {
                     var22 = var23;
                  }

                  int var26 = var22 + var3;
                  int var27 = (var13 & 7) + var8 + var2;
                  int var28 = var3 + (var14 & 7) + var9;
                  WorldMapScaleHandler.loadTerrain(var29, var1, var20, var26, var27, var28, var7);
               } else {
                  WorldMapScaleHandler.loadTerrain(var29, 0, -1, -1, 0, 0, 0);
               }
            }
         }
      }

   }

   @ObfuscatedName("is")
   @ObfuscatedSignature(
      descriptor = "(Ldh;ZS)V",
      garbageValue = "-22438"
   )
   @Export("addPlayerToScene")
   static void addPlayerToScene(Player var0, boolean var1) {
      if (var0 != null && var0.isVisible() && !var0.isHidden) {
         var0.isUnanimated = false;
         if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.idleSequence == var0.movementSequence) {
            var0.isUnanimated = true;
         }

         int var2 = var0.x >> 7;
         int var3 = var0.y >> 7;
         if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
            long var4 = class103.calculateTag(0, 0, 0, false, var0.index);
            if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) {
               var0.isUnanimated = false;
               var0.tileHeight = WorldMapDecorationType.getTileHeight(var0.x, var0.y, TaskHandler.Client_plane);
               var0.playerCycle = Client.cycle;
               class1.scene.addNullableObject(TaskHandler.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY);
            } else {
               if ((var0.x & 127) == 64 && (var0.y & 127) == 64) {
                  if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) {
                     return;
                  }

                  Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount;
               }

               var0.tileHeight = WorldMapDecorationType.getTileHeight(var0.x, var0.y, TaskHandler.Client_plane);
               var0.playerCycle = Client.cycle;
               class1.scene.drawEntity(TaskHandler.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking);
            }
         }
      }

   }
}
