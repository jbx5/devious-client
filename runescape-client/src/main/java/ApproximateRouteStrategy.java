import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bc")
@Implements("ApproximateRouteStrategy")
public class ApproximateRouteStrategy extends RouteStrategy {
   @ObfuscatedName("lb")
   @ObfuscatedGetter(
      intValue = 1258940689
   )
   @Export("Client_plane")
   static int Client_plane;

   ApproximateRouteStrategy() {
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(IIILgr;I)Z",
      garbageValue = "-376004430"
   )
   @Export("hasArrived")
   public boolean hasArrived(int var1, int var2, int var3, CollisionMap var4) {
      return var2 == super.approxDestinationX && var3 == super.approxDestinationY;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(IB)Lfu;",
      garbageValue = "-17"
   )
   @Export("getInvDefinition")
   public static InvDefinition getInvDefinition(int var0) {
      InvDefinition var1 = (InvDefinition)InvDefinition.InvDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = class357.InvDefinition_archive.takeFile(5, var0);
         var1 = new InvDefinition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         InvDefinition.InvDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)V",
      garbageValue = "18"
   )
   static void method1163(int var0, int var1, int var2, int var3) {
      for(ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) {
         if (var4.soundEffectId != -1 || var4.soundEffectIds != null) {
            int var5 = 0;
            if (var1 > var4.maxX * 16384) {
               var5 += var1 - var4.maxX * 16384;
            } else if (var1 < var4.x * 16384) {
               var5 += var4.x * 16384 - var1;
            }

            if (var2 > var4.maxY * 128) {
               var5 += var2 - var4.maxY * 128;
            } else if (var2 < var4.y * 128) {
               var5 += var4.y * 128 - var2;
            }

            if (var5 - 64 <= var4.field824 && BufferedSink.clientPreferences.method2411() != 0 && var0 == var4.plane) {
               var5 -= 64;
               if (var5 < 0) {
                  var5 = 0;
               }

               int var6 = (var4.field824 - var5) * BufferedSink.clientPreferences.method2411() / var4.field824;
               if (var4.stream1 == null) {
                  if (var4.soundEffectId >= 0) {
                     SoundEffect var7 = SoundEffect.readSoundEffect(Canvas.archive4, var4.soundEffectId, 0);
                     if (var7 != null) {
                        RawSound var8 = var7.toRawSound().resample(FaceNormal.decimator);
                        RawPcmStream var9 = RawPcmStream.createRawPcmStream(var8, 100, var6);
                        var9.setNumLoops(-1);
                        class453.pcmStreamMixer.addSubStream(var9);
                        var4.stream1 = var9;
                     }
                  }
               } else {
                  var4.stream1.method892(var6);
               }

               if (var4.stream2 == null) {
                  if (var4.soundEffectIds != null && (var4.field821 -= var3) <= 0) {
                     int var11 = (int)(Math.random() * (double)var4.soundEffectIds.length);
                     SoundEffect var12 = SoundEffect.readSoundEffect(Canvas.archive4, var4.soundEffectIds[var11], 0);
                     if (var12 != null) {
                        RawSound var13 = var12.toRawSound().resample(FaceNormal.decimator);
                        RawPcmStream var10 = RawPcmStream.createRawPcmStream(var13, 100, var6);
                        var10.setNumLoops(0);
                        class453.pcmStreamMixer.addSubStream(var10);
                        var4.stream2 = var10;
                        var4.field821 = var4.field830 + (int)(Math.random() * (double)(var4.field831 - var4.field830));
                     }
                  }
               } else {
                  var4.stream2.method892(var6);
                  if (!var4.stream2.hasNext()) {
                     var4.stream2 = null;
                  }
               }
            } else {
               if (var4.stream1 != null) {
                  class453.pcmStreamMixer.removeSubStream(var4.stream1);
                  var4.stream1 = null;
               }

               if (var4.stream2 != null) {
                  class453.pcmStreamMixer.removeSubStream(var4.stream2);
                  var4.stream2 = null;
               }
            }
         }
      }

   }
}
