import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Lch;"
   )
   @Export("loginScreenRunesAnimation")
   static LoginScreenAnimation loginScreenRunesAnimation;
   @ObfuscatedName("fw")
   @ObfuscatedGetter(
      intValue = -436041021
   )
   static int field860;
   @ObfuscatedName("fd")
   @ObfuscatedGetter(
      intValue = 1798031895
   )
   static int field867;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -68505291
   )
   @Export("id")
   int id;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -920232415
   )
   @Export("cycleStart")
   int cycleStart;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 133796587
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1057690621
   )
   @Export("y")
   int y;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1798404105
   )
   @Export("x")
   int x;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = 196496071
   )
   @Export("z")
   int z;
   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "Lgg;"
   )
   @Export("sequenceDefinition")
   SequenceDefinition sequenceDefinition;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 523642659
   )
   @Export("frame")
   int frame;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -876922623
   )
   @Export("frameCycle")
   int frameCycle;
   @ObfuscatedName("r")
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
      int var8 = ReflectionCheck.SpotAnimationDefinition_get(this.id).sequence;
      if (var8 != -1) {
         this.isFinished = false;
         this.sequenceDefinition = WorldMapElement.SequenceDefinition_get(var8);
      } else {
         this.isFinished = true;
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-64584955"
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
            if (this.frame >= this.sequenceDefinition.method3876()) {
               this.isFinished = true;
            }
         }

      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)Lha;",
      garbageValue = "-157507070"
   )
   @Export("getModel")
   protected final Model getModel() {
      SpotAnimationDefinition var1 = ReflectionCheck.SpotAnimationDefinition_get(this.id);
      Model var2;
      if (!this.isFinished) {
         var2 = var1.getModel(this.frame);
      } else {
         var2 = var1.getModel(-1);
      }

      return var2 == null ? null : var2;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(IS)Ldn;",
      garbageValue = "497"
   )
   static class123 method2016(int var0) {
      class123 var1 = (class123)WallDecoration.findEnumerated(SceneTilePaint.method4639(), var0);
      if (var1 == null) {
         var1 = class123.field1470;
      }

      return var1;
   }

   public GraphicsObject() {
   }
}
