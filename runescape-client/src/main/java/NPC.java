import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cc")
@Implements("NPC")
public final class NPC extends Actor {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lgu;"
   )
   @Export("definition")
   NPCComposition definition;
   @ObfuscatedName("f")
   String field1265 = "";
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1190695941
   )
   int field1268 = 31;

   NPC() {
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)V",
      garbageValue = "1936513030"
   )
   void method2488(String var1) {
      this.field1265 = var1 == null ? "" : var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)Lha;",
      garbageValue = "-157507070"
   )
   @Export("getModel")
   protected final Model getModel() {
      if (this.definition == null) {
         return null;
      } else {
         SequenceDefinition var1 = super.sequence != -1 && super.sequenceDelay == 0 ? WorldMapElement.SequenceDefinition_get(super.sequence) : null;
         SequenceDefinition var2 = super.movementSequence != -1 && (super.idleSequence != super.movementSequence || var1 == null) ? WorldMapElement.SequenceDefinition_get(super.movementSequence) : null;
         Model var3 = this.definition.getModel(var1, super.sequenceFrame, var2, super.movementFrame);
         if (var3 == null) {
            return null;
         } else {
            var3.calculateBoundsCylinder();
            super.defaultHeight = var3.height;
            int var4 = var3.indicesCount;
            if (super.spotAnimation != -1 && super.spotAnimationFrame != -1) {
               Model var5 = ReflectionCheck.SpotAnimationDefinition_get(super.spotAnimation).getModel(super.spotAnimationFrame);
               if (var5 != null) {
                  var5.offsetBy(0, -super.spotAnimationHeight, 0);
                  Model[] var6 = new Model[]{var3, var5};
                  var3 = new Model(var6, 2);
               }
            }

            if (this.definition.size == 1) {
               var3.isSingleTile = true;
            }

            if (super.field1202 != 0 && Client.cycle >= super.field1197 && Client.cycle < super.field1198) {
               var3.overrideHue = super.field1199;
               var3.overrideSaturation = super.field1200;
               var3.overrideLuminance = super.field1185;
               var3.overrideAmount = super.field1202;
               var3.field2667 = (short)var4;
            } else {
               var3.overrideAmount = 0;
            }

            return var3;
         }
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "44"
   )
   void method2489(int var1) {
      this.field1268 = var1;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "-41"
   )
   boolean method2511(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return (this.field1268 & 1 << var1) != 0;
      } else {
         return true;
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/lang/String;",
      garbageValue = "659712992"
   )
   final String method2492() {
      if (!this.field1265.isEmpty()) {
         return this.field1265;
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

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(ILgo;B)V",
      garbageValue = "-73"
   )
   final void method2487(int var1, class202 var2) {
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

      if (super.sequence != -1 && WorldMapElement.SequenceDefinition_get(super.sequence).field2211 == 1) {
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

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(IIZS)V",
      garbageValue = "-22787"
   )
   final void method2497(int var1, int var2, boolean var3) {
      if (super.sequence != -1 && WorldMapElement.SequenceDefinition_get(super.sequence).field2211 == 1) {
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
            super.pathTraversed[0] = class202.field2282;
            return;
         }
      }

      super.pathLength = 0;
      super.field1211 = 0;
      super.field1172 = 0;
      super.pathX[0] = var1;
      super.pathY[0] = var2;
      super.x = super.field1201 * 64 + super.pathX[0] * 128;
      super.y = super.field1201 * 64 + super.pathY[0] * 128;
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "246357037"
   )
   @Export("isVisible")
   final boolean isVisible() {
      return this.definition != null;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Z",
      garbageValue = "-621878720"
   )
   static boolean method2494(String var0) {
      if (var0 == null) {
         return false;
      } else {
         try {
            new URL(var0);
            return true;
         } catch (MalformedURLException var2) {
            return false;
         }
      }
   }
}
