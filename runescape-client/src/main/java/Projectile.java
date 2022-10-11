import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
@Implements("Projectile")
public final class Projectile extends Renderable {
   @ObfuscatedName("qf")
   @ObfuscatedSignature(
      descriptor = "Lds;"
   )
   @Export("varcs")
   static Varcs varcs;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 595172913
   )
   @Export("id")
   int id;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -5998967
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 690031167
   )
   @Export("sourceX")
   int sourceX;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 283085205
   )
   @Export("sourceY")
   int sourceY;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 608529881
   )
   @Export("sourceZ")
   int sourceZ;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -631008697
   )
   @Export("endHeight")
   int endHeight;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -887941297
   )
   @Export("cycleStart")
   int cycleStart;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 1493959093
   )
   @Export("cycleEnd")
   int cycleEnd;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -564297443
   )
   @Export("slope")
   int slope;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -1973645943
   )
   @Export("startHeight")
   int startHeight;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 1207313733
   )
   @Export("targetIndex")
   int targetIndex;
   @ObfuscatedName("s")
   @Export("isMoving")
   boolean isMoving = false;
   @ObfuscatedName("p")
   @Export("x")
   double x;
   @ObfuscatedName("b")
   @Export("y")
   double y;
   @ObfuscatedName("o")
   @Export("z")
   double z;
   @ObfuscatedName("u")
   @Export("speedX")
   double speedX;
   @ObfuscatedName("z")
   @Export("speedY")
   double speedY;
   @ObfuscatedName("t")
   @Export("speed")
   double speed;
   @ObfuscatedName("w")
   @Export("speedZ")
   double speedZ;
   @ObfuscatedName("m")
   @Export("accelerationZ")
   double accelerationZ;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1240153
   )
   @Export("yaw")
   int yaw;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 154218097
   )
   @Export("pitch")
   int pitch;
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lgg;"
   )
   @Export("sequenceDefinition")
   SequenceDefinition sequenceDefinition;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -1988816403
   )
   @Export("frame")
   int frame = 0;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1177008613
   )
   @Export("frameCycle")
   int frameCycle = 0;

   Projectile(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      this.id = var1;
      this.plane = var2;
      this.sourceX = var3;
      this.sourceY = var4;
      this.sourceZ = var5;
      this.cycleStart = var6;
      this.cycleEnd = var7;
      this.slope = var8;
      this.startHeight = var9;
      this.targetIndex = var10;
      this.endHeight = var11;
      this.isMoving = false;
      int var12 = ReflectionCheck.SpotAnimationDefinition_get(this.id).sequence;
      if (var12 != -1) {
         this.sequenceDefinition = WorldMapElement.SequenceDefinition_get(var12);
      } else {
         this.sequenceDefinition = null;
      }

   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "2016917672"
   )
   @Export("setDestination")
   final void setDestination(int var1, int var2, int var3, int var4) {
      double var5;
      if (!this.isMoving) {
         var5 = (double)(var1 - this.sourceX);
         double var7 = (double)(var2 - this.sourceY);
         double var9 = Math.sqrt(var7 * var7 + var5 * var5);
         this.x = (double)this.sourceX + var5 * (double)this.startHeight / var9;
         this.y = var7 * (double)this.startHeight / var9 + (double)this.sourceY;
         this.z = (double)this.sourceZ;
      }

      var5 = (double)(this.cycleEnd + 1 - var4);
      this.speedX = ((double)var1 - this.x) / var5;
      this.speedY = ((double)var2 - this.y) / var5;
      this.speed = Math.sqrt(this.speedX * this.speedX + this.speedY * this.speedY);
      if (!this.isMoving) {
         this.speedZ = -this.speed * Math.tan((double)this.slope * 0.02454369);
      }

      this.accelerationZ = ((double)var3 - this.z - this.speedZ * var5) * 2.0 / (var5 * var5);
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)Lha;",
      garbageValue = "-157507070"
   )
   @Export("getModel")
   protected final Model getModel() {
      SpotAnimationDefinition var1 = ReflectionCheck.SpotAnimationDefinition_get(this.id);
      Model var2 = var1.getModel(this.frame);
      if (var2 == null) {
         return null;
      } else {
         var2.rotateZ(this.pitch);
         return var2;
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-2128904402"
   )
   @Export("advance")
   final void advance(int var1) {
      this.isMoving = true;
      this.x += this.speedX * (double)var1;
      this.y += this.speedY * (double)var1;
      this.z += this.speedZ * (double)var1 + (double)var1 * 0.5 * this.accelerationZ * (double)var1;
      this.speedZ += this.accelerationZ * (double)var1;
      this.yaw = (int)(Math.atan2(this.speedX, this.speedY) * 325.949) + 1024 & 2047;
      this.pitch = (int)(Math.atan2(this.speedZ, this.speed) * 325.949) & 2047;
      if (this.sequenceDefinition != null) {
         if (!this.sequenceDefinition.isCachedModelIdSet()) {
            this.frameCycle += var1;

            while(true) {
               do {
                  do {
                     if (this.frameCycle <= this.sequenceDefinition.frameLengths[this.frame]) {
                        return;
                     }

                     this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
                     ++this.frame;
                  } while(this.frame < this.sequenceDefinition.frameIds.length);

                  this.frame -= this.sequenceDefinition.frameCount;
               } while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

               this.frame = 0;
            }
         } else {
            this.frame += var1;
            int var2 = this.sequenceDefinition.method3876();
            if (this.frame >= var2) {
               this.frame = var2 - this.sequenceDefinition.frameCount;
            }
         }
      }

   }

   @ObfuscatedName("ie")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "258452239"
   )
   static final void method2096() {
      for(PendingSpawn var0 = (PendingSpawn)Client.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)Client.pendingSpawns.previous()) {
         if (var0.hitpoints == -1) {
            var0.delay = 0;
            EnumComposition.method3528(var0);
         } else {
            var0.remove();
         }
      }

   }
}
