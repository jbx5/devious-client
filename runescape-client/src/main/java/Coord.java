import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lt")
@Implements("Coord")
public class Coord {
   @ObfuscatedName("uv")
   @ObfuscatedGetter(
      intValue = 1885285715
   )
   static int field3432;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 656241637
   )
   @Export("plane")
   public int plane;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -2064471179
   )
   @Export("x")
   public int x;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 2141185315
   )
   @Export("y")
   public int y;

   @ObfuscatedSignature(
      descriptor = "(Llt;)V"
   )
   public Coord(Coord var1) {
      this.plane = var1.plane;
      this.x = var1.x;
      this.y = var1.y;
   }

   public Coord(int var1, int var2, int var3) {
      this.plane = var1;
      this.x = var2;
      this.y = var3;
   }

   public Coord(int var1) {
      if (var1 == -1) {
         this.plane = -1;
      } else {
         this.plane = var1 >> 28 & 3;
         this.x = var1 >> 14 & 16383;
         this.y = var1 & 16383;
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-2027408234"
   )
   @Export("packed")
   public int packed() {
      return class249.method5137(this.plane, this.x, this.y);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Llt;I)Z",
      garbageValue = "2032380368"
   )
   @Export("equalsCoord")
   boolean equalsCoord(Coord var1) {
      if (this.plane != var1.plane) {
         return false;
      } else if (this.x != var1.x) {
         return false;
      } else {
         return this.y == var1.y;
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "-11455619"
   )
   @Export("toString")
   String toString(String var1) {
      return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63);
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof Coord) ? false : this.equalsCoord((Coord)var1);
      }
   }

   public int hashCode() {
      return this.packed();
   }

   public String toString() {
      return this.toString(",");
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(II)Lhx;",
      garbageValue = "218692626"
   )
   @Export("SequenceDefinition_get")
   public static SequenceDefinition SequenceDefinition_get(int var0) {
      SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = HealthBar.SequenceDefinition_archive.takeFile(12, var0);
         var1 = new SequenceDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         var1.postDecode();
         SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("ib")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-286114668"
   )
   static final void method5753(int var0, int var1) {
      if (Client.hintArrowType == 2) {
         GrandExchangeOfferUnitPriceComparator.worldToScreen(Client.hintArrowSubX * 64 + (Client.hintArrowX - GameEngine.baseX * 64 << 7), Client.hintArrowSubY * 64 + (Client.hintArrowY - class178.baseY * 64 << 7), Client.hintArrowHeight * 2);
         if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
            EnumComposition.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
         }

      }
   }

   @ObfuscatedName("il")
   @ObfuscatedSignature(
      descriptor = "(IIZS)V",
      garbageValue = "-321"
   )
   static final void method5773(int var0, int var1, boolean var2) {
      if (!var2 || var0 != class124.field1471 || ArchiveDiskActionHandler.field4161 != var1) {
         class124.field1471 = var0;
         ArchiveDiskActionHandler.field4161 = var1;
         class19.updateGameState(25);
         class16.drawLoadingMessage("Loading - please wait.", true);
         int var3 = GameEngine.baseX * 64;
         int var4 = class178.baseY * 64;
         GameEngine.baseX = (var0 - 6) * 8;
         class178.baseY = (var1 - 6) * 8;
         int var5 = GameEngine.baseX * 64 - var3;
         int var6 = class178.baseY * 64 - var4;
         var3 = GameEngine.baseX * 64;
         var4 = class178.baseY * 64;

         int var7;
         int var9;
         int[] var10000;
         for(var7 = 0; var7 < 65536; ++var7) {
            NPC var19 = Client.npcs[var7];
            if (var19 != null) {
               for(var9 = 0; var9 < 10; ++var9) {
                  var10000 = var19.pathX;
                  var10000[var9] -= var5;
                  var10000 = var19.pathY;
                  var10000[var9] -= var6;
               }

               var19.x -= var5 * 128;
               var19.y -= var6 * 128;
            }
         }

         for(var7 = 0; var7 < 2048; ++var7) {
            Player var22 = Client.players[var7];
            if (var22 != null) {
               for(var9 = 0; var9 < 10; ++var9) {
                  var10000 = var22.pathX;
                  var10000[var9] -= var5;
                  var10000 = var22.pathY;
                  var10000[var9] -= var6;
               }

               var22.x -= var5 * 128;
               var22.y -= var6 * 128;
            }
         }

         byte var20 = 0;
         byte var8 = 104;
         byte var21 = 1;
         if (var5 < 0) {
            var20 = 103;
            var8 = -1;
            var21 = -1;
         }

         byte var10 = 0;
         byte var11 = 104;
         byte var12 = 1;
         if (var6 < 0) {
            var10 = 103;
            var11 = -1;
            var12 = -1;
         }

         int var14;
         for(int var13 = var20; var13 != var8; var13 += var21) {
            for(var14 = var10; var14 != var11; var14 += var12) {
               int var15 = var13 + var5;
               int var16 = var14 + var6;

               for(int var17 = 0; var17 < 4; ++var17) {
                  if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
                     Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16];
                  } else {
                     Client.groundItems[var17][var13][var14] = null;
                  }
               }
            }
         }

         for(PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) {
            var18.x -= var5;
            var18.y -= var6;
            if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) {
               var18.remove();
            }
         }

         if (Client.destinationX != 0) {
            Client.destinationX -= var5;
            Client.destinationY -= var6;
         }

         Client.soundEffectCount = 0;
         Client.isCameraLocked = false;
         class381.cameraX -= var5 << 7;
         class471.cameraZ -= var6 << 7;
         GrandExchangeOfferOwnWorldComparator.oculusOrbFocalPointX -= var5 << 7;
         ReflectionCheck.oculusOrbFocalPointY -= var6 << 7;
         Client.field720 = -1;
         Client.graphicsObjects.clear();
         Client.projectiles.clear();

         for(var14 = 0; var14 < 4; ++var14) {
            Client.collisionMaps[var14].clear();
         }

      }
   }

   @ObfuscatedName("lf")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1041793614"
   )
   @Export("getTapToDrop")
   static boolean getTapToDrop() {
      return Client.tapToDrop;
   }
}
