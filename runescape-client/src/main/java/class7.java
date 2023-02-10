import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("n")
public class class7 {
   @ObfuscatedName("nk")
   @ObfuscatedGetter(
      intValue = -814181313
   )
   @Export("menuWidth")
   static int menuWidth;
   @ObfuscatedName("f")
   ExecutorService field24 = Executors.newSingleThreadExecutor();
   @ObfuscatedName("w")
   Future field23;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lrd;"
   )
   final Buffer field22;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Ls;"
   )
   final class3 field25;

   @ObfuscatedSignature(
      descriptor = "(Lrd;Ls;)V"
   )
   public class7(Buffer var1, class3 var2) {
      this.field22 = var1;
      this.field25 = var2;
      this.method67();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-504541602"
   )
   public boolean method54() {
      return this.field23.isDone();
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2078703024"
   )
   public void method55() {
      this.field24.shutdown();
      this.field24 = null;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)Lrd;",
      garbageValue = "-338612782"
   )
   public Buffer method66() {
      try {
         return (Buffer)this.field23.get();
      } catch (Exception var2) {
         return null;
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2134403401"
   )
   void method67() {
      this.field23 = this.field24.submit(new class1(this, this.field22, this.field25));
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lrs;IIIB)V",
      garbageValue = "1"
   )
   static void method65(SpritePixels var0, int var1, int var2, int var3) {
      WorldMapRegion.WorldMapRegion_cachedSprites.put(var0, ParamComposition.method3840(var1, var2, var3), var0.pixels.length * 4);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "833552828"
   )
   @Export("Messages_getLastChatID")
   static int Messages_getLastChatID(int var0) {
      Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
      if (var1 == null) {
         return -1;
      } else {
         return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count;
      }
   }

   @ObfuscatedName("ga")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1889949053"
   )
   static final void method64() {
      for(int var0 = 0; var0 < Client.soundEffectCount; ++var0) {
         int var10002 = Client.queuedSoundEffectDelays[var0]--;
         if (Client.queuedSoundEffectDelays[var0] >= -10) {
            SoundEffect var1 = Client.soundEffects[var0];
            if (var1 == null) {
               Object var10000 = null;
               var1 = SoundEffect.readSoundEffect(DynamicObject.field1001, Client.soundEffectIds[var0], 0);
               if (var1 == null) {
                  continue;
               }

               int[] var12 = Client.queuedSoundEffectDelays;
               var12[var0] += var1.calculateDelay();
               Client.soundEffects[var0] = var1;
            }

            if (Client.queuedSoundEffectDelays[var0] < 0) {
               int var2;
               if (Client.soundLocations[var0] != 0) {
                  int var3 = (Client.soundLocations[var0] & 255) * 128;
                  int var4 = Client.soundLocations[var0] >> 16 & 255;
                  int var5 = var4 * 128 + 64 - class387.localPlayer.x;
                  if (var5 < 0) {
                     var5 = -var5;
                  }

                  int var6 = Client.soundLocations[var0] >> 8 & 255;
                  int var7 = var6 * 128 + 64 - class387.localPlayer.y;
                  if (var7 < 0) {
                     var7 = -var7;
                  }

                  int var8 = var7 + var5 - 128;
                  if (var8 > var3) {
                     Client.queuedSoundEffectDelays[var0] = -100;
                     continue;
                  }

                  if (var8 < 0) {
                     var8 = 0;
                  }

                  var2 = (var3 - var8) * PacketWriter.clientPreferences.method2499() / var3;
               } else {
                  var2 = PacketWriter.clientPreferences.method2497();
               }

               if (var2 > 0) {
                  RawSound var9 = var1.toRawSound().resample(class257.decimator);
                  RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var2);
                  var10.setNumLoops(Client.queuedSoundEffectLoops[var0] - 1);
                  class209.pcmStreamMixer.addSubStream(var10);
               }

               Client.queuedSoundEffectDelays[var0] = -100;
            }
         } else {
            --Client.soundEffectCount;

            for(int var11 = var0; var11 < Client.soundEffectCount; ++var11) {
               Client.soundEffectIds[var11] = Client.soundEffectIds[var11 + 1];
               Client.soundEffects[var11] = Client.soundEffects[var11 + 1];
               Client.queuedSoundEffectLoops[var11] = Client.queuedSoundEffectLoops[var11 + 1];
               Client.queuedSoundEffectDelays[var11] = Client.queuedSoundEffectDelays[var11 + 1];
               Client.soundLocations[var11] = Client.soundLocations[var11 + 1];
            }

            --var0;
         }
      }

      if (Client.playingJingle && !DynamicObject.method2208()) {
         if (PacketWriter.clientPreferences.method2495() != 0 && Client.currentTrackGroupId != -1) {
            class148.method3216(class153.archive6, Client.currentTrackGroupId, 0, PacketWriter.clientPreferences.method2495(), false);
         }

         Client.playingJingle = false;
      }

   }

   @ObfuscatedName("is")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)V",
      garbageValue = "-70"
   )
   static final void method70(int var0, int var1, int var2, int var3) {
      for(int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
         if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
            Client.field678[var4] = true;
         }
      }

   }
}
