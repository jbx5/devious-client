import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("df")
@Implements("NPC")
public final class NPC extends Actor {
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1770985255
   )
   static int field1277 = 1;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 413681233
   )
   static int field1274 = 1;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lhs;"
   )
   @Export("definition")
   NPCComposition definition;
   @ObfuscatedName("aw")
   String field1272 = "";
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -189357307
   )
   int field1271 = 31;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lsx;"
   )
   class489 field1282;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lhv;"
   )
   NewStuff field1275;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lhv;"
   )
   NewStuff field1278;

   NPC() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-1586819780"
   )
   void method2558(String var1) {
      this.field1272 = var1 == null ? "" : var1;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(B)Lit;",
      garbageValue = "-112"
   )
   @Export("getModel")
   protected final Model getModel() {
      if (this.definition == null) {
         return null;
      } else {
         SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? ItemContainer.SequenceDefinition_get(super.sequence) : null;
         SequenceDefinition var2 = super.movementSequence == -1 || super.movementSequence == super.idleSequence && var1 != null ? null : ItemContainer.SequenceDefinition_get(super.movementSequence);
         Model var3 = null;
         if (this.field1275 != null && this.field1275.field2004) {
            var3 = MusicPatchNode.localPlayer.appearance.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
         } else {
            var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame, this.field1275);
         }

         if (var3 == null) {
            return null;
         } else {
            var3.calculateBoundsCylinder();
            super.defaultHeight = var3.height;
            int var4 = var3.indicesCount;
            var3 = this.method2374(var3);
            if (this.definition.size == 1) {
               var3.isSingleTile = true;
            }

            if (super.field1208 != 0 && Client.cycle >= super.field1168 && Client.cycle < super.field1156) {
               var3.overrideHue = super.field1180;
               var3.overrideSaturation = super.field1199;
               var3.overrideLuminance = super.field1200;
               var3.overrideAmount = super.field1208;
               var3.field2755 = (short)var4;
            } else {
               var3.overrideAmount = 0;
            }

            return var3;
         }
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1826007749"
   )
   void method2613(int var1) {
      this.field1271 = var1;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1164667978"
   )
   boolean method2596(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return (this.field1271 & 1 << var1) != 0;
      } else {
         return true;
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "-1379499313"
   )
   final String method2599() {
      if (!this.field1272.isEmpty()) {
         return this.field1272;
      } else {
         NPCComposition var1 = this.definition;
         if (var1.transforms != null) {
            var1 = var1.transform();
            if (var1 == null) {
               var1 = this.definition;
            }
         }

         return var1.name;
      }
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(ILiu;B)V",
      garbageValue = "110"
   )
   final void method2562(int var1, class210 var2) {
      int var3 = super.pathX[0];
      int var4 = super.pathY[0];
      if (var1 == 0) {
         --var3;
         ++var4;
      }

      if (var1 == 1) {
         ++var4;
      }

      if (var1 == 2) {
         ++var3;
         ++var4;
      }

      if (var1 == 3) {
         --var3;
      }

      if (var1 == 4) {
         ++var3;
      }

      if (var1 == 5) {
         --var3;
         --var4;
      }

      if (var1 == 6) {
         --var4;
      }

      if (var1 == 7) {
         ++var3;
         --var4;
      }

      if (super.sequence != -1 && ItemContainer.SequenceDefinition_get(super.sequence).field2313 == 1) {
         super.sequence = -1;
      }

      if (super.pathLength < 9) {
         ++super.pathLength;
      }

      for(int var5 = super.pathLength; var5 > 0; --var5) {
         super.pathX[var5] = super.pathX[var5 - 1];
         super.pathY[var5] = super.pathY[var5 - 1];
         super.pathTraversed[var5] = super.pathTraversed[var5 - 1];
      }

      super.pathX[0] = var3;
      super.pathY[0] = var4;
      super.pathTraversed[0] = var2;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(IIZI)V",
      garbageValue = "-208577848"
   )
   final void method2563(int var1, int var2, boolean var3) {
      if (super.sequence != -1 && ItemContainer.SequenceDefinition_get(super.sequence).field2313 == 1) {
         super.sequence = -1;
      }

      if (!var3) {
         int var4 = var1 - super.pathX[0];
         int var5 = var2 - super.pathY[0];
         if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
            if (super.pathLength < 9) {
               ++super.pathLength;
            }

            for(int var6 = super.pathLength; var6 > 0; --var6) {
               super.pathX[var6] = super.pathX[var6 - 1];
               super.pathY[var6] = super.pathY[var6 - 1];
               super.pathTraversed[var6] = super.pathTraversed[var6 - 1];
            }

            super.pathX[0] = var1;
            super.pathY[0] = var2;
            super.pathTraversed[0] = class210.field2389;
            return;
         }
      }

      super.pathLength = 0;
      super.field1210 = 0;
      super.field1209 = 0;
      super.pathX[0] = var1;
      super.pathY[0] = var2;
      super.x = super.field1140 * 64 + super.pathX[0] * 128;
      super.y = super.field1140 * 64 + super.pathY[0] * 128;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(B)[I",
      garbageValue = "14"
   )
   int[] method2566() {
      return this.field1282 != null ? this.field1282.method9309() : this.definition.method3777();
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)[S",
      garbageValue = "438914513"
   )
   short[] method2578() {
      return this.field1282 != null ? this.field1282.method9302() : this.definition.method3779();
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(IISI)V",
      garbageValue = "2033131793"
   )
   void method2568(int var1, int var2, short var3) {
      if (this.field1282 == null) {
         this.field1282 = new class489(this.definition);
      }

      this.field1282.method9303(var1, var2, var3);
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "([I[SI)V",
      garbageValue = "1712497596"
   )
   void method2593(int[] var1, short[] var2) {
      if (this.field1282 == null) {
         this.field1282 = new class489(this.definition);
      }

      this.field1282.method9315(var1, var2);
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "47"
   )
   void method2609() {
      this.field1282 = null;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Lhv;I)V",
      garbageValue = "-1457608941"
   )
   void method2571(NewStuff var1) {
      this.field1278 = var1;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(I)Lhv;",
      garbageValue = "-767962512"
   )
   NewStuff method2572() {
      return this.field1278;
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(Lhv;I)V",
      garbageValue = "1428478753"
   )
   void method2573(NewStuff var1) {
      this.field1275 = var1;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1666539507"
   )
   @Export("isVisible")
   final boolean isVisible() {
      return this.definition != null;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "17996"
   )
   void method2618() {
      this.field1278 = null;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-112"
   )
   void method2575() {
      this.field1275 = null;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lnm;B)V",
      garbageValue = "-54"
   )
   public static void method2627(AbstractArchive var0) {
      InvDefinition.InvDefinition_archive = var0;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(II)F",
      garbageValue = "1228620083"
   )
   static final float method2626(int var0) {
      float var1 = 10075.0F - (float)var0;
      return (var1 * 1.0075567F - 75.56675F) / var1;
   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "599275396"
   )
   protected static final void method2628() {
      class399.clock.mark();

      int var0;
      for(var0 = 0; var0 < 32; ++var0) {
         GameEngine.graphicsTickTimes[var0] = 0L;
      }

      for(var0 = 0; var0 < 32; ++var0) {
         GameEngine.clientTickTimes[var0] = 0L;
      }

      DirectByteArrayCopier.gameCyclesToDo = 0;
   }
}
