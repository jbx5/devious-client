import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bp")
@Implements("Projectile")
public final class Projectile extends Renderable {
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 251394351
   )
   @Export("id")
   int id;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 335846275
   )
   @Export("plane")
   int plane;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -728775885
   )
   @Export("sourceX")
   int sourceX;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -415717997
   )
   @Export("sourceY")
   int sourceY;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -822093379
   )
   @Export("sourceZ")
   int sourceZ;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1617929179
   )
   @Export("endHeight")
   int endHeight;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 711061639
   )
   @Export("cycleStart")
   int cycleStart;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = -1324925051
   )
   @Export("cycleEnd")
   int cycleEnd;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 494881873
   )
   @Export("slope")
   int slope;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1000853405
   )
   @Export("startHeight")
   int startHeight;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 469129851
   )
   @Export("targetIndex")
   int targetIndex;
   @ObfuscatedName("r")
   @Export("isMoving")
   boolean isMoving = false;
   @ObfuscatedName("b")
   @Export("x")
   double x;
   @ObfuscatedName("m")
   @Export("y")
   double y;
   @ObfuscatedName("t")
   @Export("z")
   double z;
   @ObfuscatedName("h")
   @Export("speedX")
   double speedX;
   @ObfuscatedName("p")
   @Export("speedY")
   double speedY;
   @ObfuscatedName("o")
   @Export("speed")
   double speed;
   @ObfuscatedName("u")
   @Export("speedZ")
   double speedZ;
   @ObfuscatedName("x")
   @Export("accelerationZ")
   double accelerationZ;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = -1551462227
   )
   @Export("yaw")
   int yaw;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1109608205
   )
   @Export("pitch")
   int pitch;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Lge;"
   )
   @Export("sequenceDefinition")
   SequenceDefinition sequenceDefinition;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -1012909031
   )
   @Export("frame")
   int frame = 0;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = -999189837
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
      int var12 = MouseRecorder.SpotAnimationDefinition_get(this.id).sequence;
      if (var12 != -1) {
         this.sequenceDefinition = class85.SequenceDefinition_get(var12);
      } else {
         this.sequenceDefinition = null;
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "1751077990"
   )
   @Export("setDestination")
   final void setDestination(int var1, int var2, int var3, int var4) {
      double var5;
      if (!this.isMoving) {
         var5 = (double)(var1 - this.sourceX);
         double var7 = (double)(var2 - this.sourceY);
         double var9 = Math.sqrt(var7 * var7 + var5 * var5);
         this.x = var5 * (double)this.startHeight / var9 + (double)this.sourceX;
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

      this.accelerationZ = 2.0 * ((double)var3 - this.z - var5 * this.speedZ) / (var5 * var5);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(I)Lhs;",
      garbageValue = "922199662"
   )
   @Export("getModel")
   protected final Model getModel() {
      SpotAnimationDefinition var1 = MouseRecorder.SpotAnimationDefinition_get(this.id);
      Model var2 = var1.getModel(this.frame);
      if (var2 == null) {
         return null;
      } else {
         var2.rotateZ(this.pitch);
         return var2;
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-15"
   )
   @Export("advance")
   final void advance(int var1) {
      this.isMoving = true;
      this.x += this.speedX * (double)var1;
      this.y += this.speedY * (double)var1;
      this.z += (double)var1 * this.accelerationZ * 0.5 * (double)var1 + this.speedZ * (double)var1;
      this.speedZ += (double)var1 * this.accelerationZ;
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
            int var2 = this.sequenceDefinition.method4055();
            if (this.frame >= var2) {
               this.frame = var2 - this.sequenceDefinition.frameCount;
            }
         }
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lmn;B)I",
      garbageValue = "13"
   )
   @Export("compareStrings")
   public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
      int var3 = var0.length();
      int var4 = var1.length();
      int var5 = 0;
      int var6 = 0;
      char var7 = 0;
      char var8 = 0;

      int var9;
      int var10;
      while(var5 - var7 < var3 || var6 - var8 < var4) {
         if (var5 - var7 >= var3) {
            return -1;
         }

         if (var6 - var8 >= var4) {
            return 1;
         }

         if (var7 != 0) {
            var9 = var7;
            boolean var14 = false;
         } else {
            var9 = var0.charAt(var5++);
         }

         if (var8 != 0) {
            var10 = var8;
            boolean var15 = false;
         } else {
            var10 = var1.charAt(var6++);
         }

         var7 = class81.method2306((char)var9);
         var8 = class81.method2306((char)var10);
         var9 = WorldMapDecoration.standardizeChar((char)var9, var2);
         var10 = WorldMapDecoration.standardizeChar((char)var10, var2);
         if (var9 != var10 && Character.toUpperCase((char)var9) != Character.toUpperCase((char)var10)) {
            var9 = Character.toLowerCase((char)var9);
            var10 = Character.toLowerCase((char)var10);
            if (var9 != var10) {
               return WorldMapEvent.lowercaseChar((char)var9, var2) - WorldMapEvent.lowercaseChar((char)var10, var2);
            }
         }
      }

      var9 = Math.min(var3, var4);

      int var11;
      char var12;
      for(var10 = 0; var10 < var9; ++var10) {
         if (var2 == Language.Language_FR) {
            var5 = var3 - 1 - var10;
            var6 = var4 - 1 - var10;
         } else {
            var6 = var10;
            var5 = var10;
         }

         var11 = var0.charAt(var5);
         var12 = var1.charAt(var6);
         if (var12 != var11 && Character.toUpperCase((char)var11) != Character.toUpperCase(var12)) {
            var11 = Character.toLowerCase((char)var11);
            var12 = Character.toLowerCase(var12);
            if (var12 != var11) {
               return WorldMapEvent.lowercaseChar((char)var11, var2) - WorldMapEvent.lowercaseChar(var12, var2);
            }
         }
      }

      var10 = var3 - var4;
      if (var10 != 0) {
         return var10;
      } else {
         for(var11 = 0; var11 < var9; ++var11) {
            var12 = var0.charAt(var11);
            char var13 = var1.charAt(var11);
            if (var12 != var13) {
               return WorldMapEvent.lowercaseChar(var12, var2) - WorldMapEvent.lowercaseChar(var13, var2);
            }
         }

         return 0;
      }
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "-49"
   )
   @Export("Messages_getHistorySize")
   static int Messages_getHistorySize(int var0) {
      ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0);
      return var1 == null ? 0 : var1.size();
   }

   @ObfuscatedName("hu")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-2085895323"
   )
   static final void method2173(boolean var0) {
      HorizontalAlignment.playPcmPlayers();
      ++Client.packetWriter.pendingWrites;
      if (Client.packetWriter.pendingWrites >= 50 || var0) {
         Client.packetWriter.pendingWrites = 0;
         if (!Client.hadNetworkError && Client.packetWriter.getSocket() != null) {
            PacketBufferNode var1 = Renderable.getPacketBufferNode(ClientPacket.NO_TIMEOUT, Client.packetWriter.isaacCipher);
            Client.packetWriter.addNode(var1);

            try {
               Client.packetWriter.flush();
            } catch (IOException var3) {
               Client.hadNetworkError = true;
            }
         }

      }
   }
}
