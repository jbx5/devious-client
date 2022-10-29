import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("q")
public class class20 implements Callable {
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Ll;"
   )
   final class10 field110;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lo;"
   )
   final class14 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lo;Ll;)V"
   )
   class20(class14 var1, class10 var2) {
      this.this$0 = var1;
      this.field110 = var2;
   }

   public Object call() throws Exception {
      try {
         while(this.field110.method84()) {
            class197.method3946(10L);
         }
      } catch (IOException var2) {
         return new class21("Error servicing REST query: " + var2.getMessage());
      }

      return this.field110.method83();
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(II)Lbk;",
      garbageValue = "-1428844357"
   )
   @Export("Messages_getMessage")
   static Message Messages_getMessage(int var0) {
      return (Message)Messages.Messages_hashTable.get((long)var0);
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
      garbageValue = "1011849235"
   )
   static void method291(String var0, String var1, String var2) {
      GrandExchangeOfferOwnWorldComparator.method1171(7);
      MusicPatchNode2.setLoginResponseString(var0, var1, var2);
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-35273894"
   )
   static void method289() {
      Login.worldSelectOpen = false;
      class313.leftTitleSprite.drawAt(Login.xPadding, 0);
      HealthBar.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
      MouseRecorder.logoSprite.drawAt(Login.xPadding + 382 - MouseRecorder.logoSprite.subWidth / 2, 18);
   }

   @ObfuscatedName("hf")
   @ObfuscatedSignature(
      descriptor = "(Lco;ZI)V",
      garbageValue = "960632480"
   )
   @Export("addPlayerToScene")
   static void addPlayerToScene(Player var0, boolean var1) {
      if (var0 != null && var0.isVisible() && !var0.isHidden) {
         var0.isUnanimated = false;
         if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.movementSequence == var0.idleSequence) {
            var0.isUnanimated = true;
         }

         int var2 = var0.x >> 7;
         int var3 = var0.y >> 7;
         if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
            long var4 = SpotAnimationDefinition.calculateTag(0, 0, 0, false, var0.index);
            if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) {
               var0.isUnanimated = false;
               var0.tileHeight = class132.getTileHeight(var0.x, var0.y, ApproximateRouteStrategy.Client_plane);
               var0.playerCycle = Client.cycle;
               class139.scene.addNullableObject(ApproximateRouteStrategy.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY);
            } else {
               if ((var0.x & 127) == 64 && (var0.y & 127) == 64) {
                  if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) {
                     return;
                  }

                  Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount;
               }

               var0.tileHeight = class132.getTileHeight(var0.x, var0.y, ApproximateRouteStrategy.Client_plane);
               var0.playerCycle = Client.cycle;
               class139.scene.drawEntity(ApproximateRouteStrategy.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking);
            }
         }
      }

   }

   @ObfuscatedName("ka")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "101"
   )
   static final void method288(int var0) {
      var0 = Math.min(Math.max(var0, 0), 255);
      if (var0 != BufferedSink.clientPreferences.method2391()) {
         if (BufferedSink.clientPreferences.method2391() == 0 && Client.currentTrackGroupId != -1) {
            class18.method266(ReflectionCheck.archive6, Client.currentTrackGroupId, 0, var0, false);
            Client.playingJingle = false;
         } else if (var0 == 0) {
            class283.midiPcmStream.clear();
            class283.musicPlayerStatus = 1;
            DevicePcmPlayerProvider.musicTrackArchive = null;
            Client.playingJingle = false;
         } else {
            class248.method5162(var0);
         }

         BufferedSink.clientPreferences.method2390(var0);
      }

   }

   @ObfuscatedName("me")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "27419"
   )
   static void method292() {
      Client.packetWriter.addNode(FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.FREECAM_EXIT, Client.packetWriter.isaacCipher));
      Client.oculusOrbState = 0;
   }
}
