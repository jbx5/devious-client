import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
@Implements("NPC")
public final class NPC extends Actor {
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = -274576993
   )
   static int field1295 = 1;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1747239789
   )
   static int field1296 = 1;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lgo;"
   )
   @Export("definition")
   NPCComposition definition;
   @ObfuscatedName("w")
   String field1293 = "";
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = 908915155
   )
   int field1291 = 31;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Lrx;"
   )
   class474 field1292;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lgj;"
   )
   NewStuff field1290;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lgj;"
   )
   NewStuff field1289;

   NPC() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "-549866424"
   )
   void method2613(String var1) {
      this.field1293 = var1 == null ? "" : var1;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(I)Lhs;",
      garbageValue = "922199662"
   )
   @Export("getModel")
   protected final Model getModel() {
      if (this.definition == null) {
         return null;
      } else {
         SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? class85.SequenceDefinition_get(super.sequence) : null;
         SequenceDefinition var2 = super.movementSequence == -1 || super.idleSequence == super.movementSequence && var1 != null ? null : class85.SequenceDefinition_get(super.movementSequence);
         Model var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame, this.field1290);
         if (var3 == null) {
            return null;
         } else {
            var3.calculateBoundsCylinder();
            super.defaultHeight = var3.height;
            int var4 = var3.indicesCount;
            if (super.spotAnimation != -1 && super.spotAnimationFrame != -1) {
               Model var5 = MouseRecorder.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame);
               if (var5 != null) {
                  var5.offsetBy(0, -super.spotAnimationHeight, 0);
                  Model[] var6 = new Model[]{var3, var5};
                  var3 = new Model(var6, 2);
               }
            }

            if (this.definition.size == 1) {
               var3.isSingleTile = true;
            }

            if (super.field1225 != 0 && Client.cycle >= super.field1176 && Client.cycle < super.field1221) {
               var3.overrideHue = super.field1180;
               var3.overrideSaturation = super.field1227;
               var3.overrideLuminance = super.field1224;
               var3.overrideAmount = super.field1225;
               var3.field2743 = (short)var4;
            } else {
               var3.overrideAmount = 0;
            }

            return var3;
         }
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-92"
   )
   void method2614(int var1) {
      this.field1291 = var1;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "2024396637"
   )
   boolean method2615(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return (this.field1291 & 1 << var1) != 0;
      } else {
         return true;
      }
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "2101442521"
   )
   final String method2616() {
      if (!this.field1293.isEmpty()) {
         return this.field1293;
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

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(ILhz;I)V",
      garbageValue = "-565213758"
   )
   final void method2624(int var1, class208 var2) {
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

      if (super.sequence != -1 && class85.SequenceDefinition_get(super.sequence).field2301 == 1) {
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

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(IIZI)V",
      garbageValue = "-1025885682"
   )
   final void method2618(int var1, int var2, boolean var3) {
      if (super.sequence != -1 && class85.SequenceDefinition_get(super.sequence).field2301 == 1) {
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
            super.pathTraversed[0] = class208.field2360;
            return;
         }
      }

      super.pathLength = 0;
      super.field1230 = 0;
      super.field1175 = 0;
      super.pathX[0] = var1;
      super.pathY[0] = var2;
      super.x = super.field1163 * 64 + super.pathX[0] * 128;
      super.y = super.field1163 * 64 + super.pathY[0] * 128;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(I)[I",
      garbageValue = "1225308448"
   )
   int[] method2655() {
      return this.field1292 != null ? this.field1292.method8894() : this.definition.method3757();
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(S)[S",
      garbageValue = "4096"
   )
   short[] method2643() {
      return this.field1292 != null ? this.field1292.method8895() : this.definition.method3749();
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(IISB)V",
      garbageValue = "-45"
   )
   void method2623(int var1, int var2, short var3) {
      if (this.field1292 == null) {
         this.field1292 = new class474(this.definition);
      }

      this.field1292.method8896(var1, var2, var3);
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "([I[SI)V",
      garbageValue = "-1227705445"
   )
   void method2612(int[] var1, short[] var2) {
      if (this.field1292 == null) {
         this.field1292 = new class474(this.definition);
      }

      this.field1292.method8899(var1, var2);
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-431556971"
   )
   void method2628() {
      this.field1292 = null;
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(Lgj;B)V",
      garbageValue = "103"
   )
   void method2626(NewStuff var1) {
      this.field1289 = var1;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(B)Lgj;",
      garbageValue = "47"
   )
   NewStuff method2633() {
      return this.field1289;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Lgj;I)V",
      garbageValue = "49596576"
   )
   void method2639(NewStuff var1) {
      this.field1290 = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1591490422"
   )
   @Export("isVisible")
   final boolean isVisible() {
      return this.definition != null;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1330268400"
   )
   void method2674() {
      this.field1289 = null;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1759648321"
   )
   void method2630() {
      this.field1290 = null;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "384292747"
   )
   public static int method2679(int var0) {
      return class431.field4688[var0 & 16383];
   }

   @ObfuscatedName("kw")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1446356611"
   )
   static final void method2678(int var0) {
      var0 = Math.min(Math.max(var0, 0), 127);
      PacketWriter.clientPreferences.method2481(var0);
   }
}
