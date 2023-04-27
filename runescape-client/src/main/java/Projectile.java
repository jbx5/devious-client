import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cw")
@Implements("Projectile")
public final class Projectile extends Renderable {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = 19084173
   )
   @Export("id")
   int id;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -850668143
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -1024822263
   )
   @Export("sourceX")
   int sourceX;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -650340219
   )
   @Export("sourceY")
   int sourceY;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 1797140989
   )
   @Export("sourceZ")
   int sourceZ;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -860121869
   )
   @Export("endHeight")
   int endHeight;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = -2048301599
   )
   @Export("cycleStart")
   int cycleStart;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1203783373
   )
   @Export("cycleEnd")
   int cycleEnd;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1173139343
   )
   @Export("slope")
   int slope;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 1485806481
   )
   @Export("startHeight")
   int startHeight;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 803751093
   )
   @Export("targetIndex")
   int targetIndex;
   @ObfuscatedName("ao")
   @Export("isMoving")
   boolean isMoving = false;
   @ObfuscatedName("ax")
   @Export("x")
   double x;
   @ObfuscatedName("ai")
   @Export("y")
   double y;
   @ObfuscatedName("ag")
   @Export("z")
   double z;
   @ObfuscatedName("ah")
   @Export("speedX")
   double speedX;
   @ObfuscatedName("av")
   @Export("speedY")
   double speedY;
   @ObfuscatedName("ar")
   @Export("speed")
   double speed;
   @ObfuscatedName("am")
   @Export("speedZ")
   double speedZ;
   @ObfuscatedName("as")
   @Export("accelerationZ")
   double accelerationZ;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 650783873
   )
   @Export("yaw")
   int yaw;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -1585330521
   )
   @Export("pitch")
   int pitch;
   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "Lha;"
   )
   @Export("sequenceDefinition")
   SequenceDefinition sequenceDefinition;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -693399445
   )
   @Export("frame")
   int frame = 0;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 723631841
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
      int var12 = ItemContainer.SpotAnimationDefinition_get(this.id).sequence;
      if (var12 != -1) {
         this.sequenceDefinition = ItemContainer.SequenceDefinition_get(var12);
      } else {
         this.sequenceDefinition = null;
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "-335674854"
   )
   @Export("setDestination")
   final void setDestination(int var1, int var2, int var3, int var4) {
      double var5;
      if (!this.isMoving) {
         var5 = (double)(var1 - this.sourceX);
         double var7 = (double)(var2 - this.sourceY);
         double var9 = Math.sqrt(var7 * var7 + var5 * var5);
         this.x = (double)this.sourceX + (double)this.startHeight * var5 / var9;
         this.y = (double)this.startHeight * var7 / var9 + (double)this.sourceY;
         this.z = (double)this.sourceZ;
      }

      var5 = (double)(this.cycleEnd + 1 - var4);
      this.speedX = ((double)var1 - this.x) / var5;
      this.speedY = ((double)var2 - this.y) / var5;
      this.speed = Math.sqrt(this.speedY * this.speedY + this.speedX * this.speedX);
      if (!this.isMoving) {
         this.speedZ = -this.speed * Math.tan(0.02454369 * (double)this.slope);
      }

      this.accelerationZ = 2.0 * ((double)var3 - this.z - this.speedZ * var5) / (var5 * var5);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(B)Lit;",
      garbageValue = "-112"
   )
   @Export("getModel")
   protected final Model getModel() {
      SpotAnimationDefinition var1 = ItemContainer.SpotAnimationDefinition_get(this.id);
      Model var2 = var1.getModel(this.frame);
      if (var2 == null) {
         return null;
      } else {
         var2.rotateZ(this.pitch);
         return var2;
      }
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1703494104"
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
            int var2 = this.sequenceDefinition.method4135();
            if (this.frame >= var2) {
               this.frame = var2 - this.sequenceDefinition.frameCount;
            }
         }
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(ILsg;I)Lgx;",
      garbageValue = "-1162920359"
   )
   public static PlayerCompositionColorTextureOverride method2116(int var0, Buffer var1) {
      int var2 = var1.readUnsignedByte();
      boolean var3 = (var2 & 1) != 0;
      boolean var4 = (var2 & 2) != 0;
      PlayerCompositionColorTextureOverride var5 = new PlayerCompositionColorTextureOverride(var0);
      int var6;
      int[] var7;
      boolean var8;
      int var9;
      short var10;
      if (var3) {
         var6 = var1.readUnsignedByte();
         var7 = new int[]{var6 & 15, var6 >> 4 & 15};
         var8 = var5.playerCompositionRecolorTo != null && var7.length == var5.playerCompositionRecolorTo.length;

         for(var9 = 0; var9 < 2; ++var9) {
            if (var7[var9] != 15) {
               var10 = (short)var1.readUnsignedShort();
               if (var8) {
                  var5.playerCompositionRecolorTo[var7[var9]] = var10;
               }
            }
         }
      }

      if (var4) {
         var6 = var1.readUnsignedByte();
         var7 = new int[]{var6 & 15, var6 >> 4 & 15};
         var8 = var5.playerCompositionRetextureTo != null && var7.length == var5.playerCompositionRetextureTo.length;

         for(var9 = 0; var9 < 2; ++var9) {
            if (var7[var9] != 15) {
               var10 = (short)var1.readUnsignedShort();
               if (var8) {
                  var5.playerCompositionRetextureTo[var7[var9]] = var10;
               }
            }
         }
      }

      return var5;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-678191257"
   )
   static final int method2117() {
      return ViewportMouse.ViewportMouse_x;
   }

   @ObfuscatedName("ho")
   @ObfuscatedSignature(
      descriptor = "(I)J",
      garbageValue = "-451145787"
   )
   static long method2111() {
      return Client.field613;
   }
}
