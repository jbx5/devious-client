import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ms")
public enum class324 implements MouseWheel {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lms;"
   )
   field3742(0),
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lms;"
   )
   field3741(1),
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Lms;"
   )
   field3744(2),
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lms;"
   )
   field3743(3),
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Lms;"
   )
   field3745(4);

   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1109405995
   )
   final int field3746;

   class324(int var3) {
      this.field3746 = var3;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "741942848"
   )
   @Export("rsOrdinal")
   public int rsOrdinal() {
      return this.field3746;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(IIIIS)V",
      garbageValue = "-14431"
   )
   static void method6566(int var0, int var1, int var2, int var3) {
      for(ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) {
         if (var4.soundEffectId != -1 || var4.soundEffectIds != null) {
            int var5 = 0;
            if (var1 > var4.maxX * 16384) {
               var5 += var1 - var4.maxX * 16384;
            } else if (var1 < var4.x * 128) {
               var5 += var4.x * 128 - var1;
            }

            if (var2 > var4.maxY * 16384) {
               var5 += var2 - var4.maxY * 16384;
            } else if (var2 < var4.y * 16384) {
               var5 += var4.y * 16384 - var2;
            }

            if (var5 - 64 <= var4.field815 && class20.clientPreferences.method2465() != 0 && var0 == var4.plane) {
               var5 -= 64;
               if (var5 < 0) {
                  var5 = 0;
               }

               int var6 = (var4.field815 - var5) * class20.clientPreferences.method2465() / var4.field815;
               if (var4.stream1 == null) {
                  if (var4.soundEffectId >= 0) {
                     SoundEffect var7 = SoundEffect.readSoundEffect(class426.field4687, var4.soundEffectId, 0);
                     if (var7 != null) {
                        RawSound var8 = var7.toRawSound().resample(WorldMapSectionType.decimator);
                        RawPcmStream var9 = RawPcmStream.createRawPcmStream(var8, 100, var6);
                        var9.setNumLoops(-1);
                        class130.pcmStreamMixer.addSubStream(var9);
                        var4.stream1 = var9;
                     }
                  }
               } else {
                  var4.stream1.method979(var6);
               }

               if (var4.stream2 == null) {
                  if (var4.soundEffectIds != null && (var4.field822 -= var3) <= 0) {
                     int var11 = (int)(Math.random() * (double)var4.soundEffectIds.length);
                     SoundEffect var12 = SoundEffect.readSoundEffect(class426.field4687, var4.soundEffectIds[var11], 0);
                     if (var12 != null) {
                        RawSound var13 = var12.toRawSound().resample(WorldMapSectionType.decimator);
                        RawPcmStream var10 = RawPcmStream.createRawPcmStream(var13, 100, var6);
                        var10.setNumLoops(0);
                        class130.pcmStreamMixer.addSubStream(var10);
                        var4.stream2 = var10;
                        var4.field822 = var4.field824 + (int)(Math.random() * (double)(var4.field825 - var4.field824));
                     }
                  }
               } else {
                  var4.stream2.method979(var6);
                  if (!var4.stream2.hasNext()) {
                     var4.stream2 = null;
                  }
               }
            } else {
               if (var4.stream1 != null) {
                  class130.pcmStreamMixer.removeSubStream(var4.stream1);
                  var4.stream1 = null;
               }

               if (var4.stream2 != null) {
                  class130.pcmStreamMixer.removeSubStream(var4.stream2);
                  var4.stream2 = null;
               }
            }
         }
      }

   }

   @ObfuscatedName("ni")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "896497182"
   )
   static void method6565() {
      if (Client.field585 && MusicPatchNode.localPlayer != null) {
         int var0 = MusicPatchNode.localPlayer.pathX[0];
         int var1 = MusicPatchNode.localPlayer.pathY[0];
         if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
         }

         class33.oculusOrbFocalPointX = MusicPatchNode.localPlayer.x;
         int var2 = class147.getTileHeight(MusicPatchNode.localPlayer.x, MusicPatchNode.localPlayer.y, GameEngine.Client_plane) - Client.camFollowHeight;
         if (var2 < class96.field1296) {
            class96.field1296 = var2;
         }

         class144.oculusOrbFocalPointY = MusicPatchNode.localPlayer.y;
         Client.field585 = false;
      }

   }
}
