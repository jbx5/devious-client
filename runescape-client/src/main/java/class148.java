import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
public class class148 extends class139 {
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "[Ltc;"
   )
   @Export("title_muteSprite")
   static IndexedSprite[] title_muteSprite;
   @ObfuscatedName("af")
   String field1700;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lfa;"
   )
   final class142 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lfa;)V"
   )
   class148(class142 var1) {
      this.this$0 = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lsg;I)V",
      garbageValue = "168736686"
   )
   void vmethod3461(Buffer var1) {
      this.field1700 = var1.readStringCp1252NullTerminated();
      var1.readInt();
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lfj;I)V",
      garbageValue = "1712319228"
   )
   void vmethod3458(ClanSettings var1) {
      var1.name = this.field1700;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IB)Lhx;",
      garbageValue = "15"
   )
   @Export("getEnum")
   public static EnumComposition getEnum(int var0) {
      EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0);
      if (var1 != null) {
         return var1;
      } else {
         byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0);
         var1 = new EnumComposition();
         if (var2 != null) {
            var1.decode(new Buffer(var2));
         }

         EnumComposition.EnumDefinition_cached.put(var1, (long)var0);
         return var1;
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(I)Lgv;",
      garbageValue = "450057476"
   )
   public static Clock method3284() {
      try {
         return new NanoClock();
      } catch (Throwable var1) {
         return new MilliClock();
      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Lgd;III)Lbu;",
      garbageValue = "1831095645"
   )
   public static final PcmPlayer method3290(TaskHandler var0, int var1, int var2) {
      if (PcmPlayer.field306 * 586337296 == 0) {
         throw new IllegalStateException();
      } else if (var1 >= 0 && var1 < 2) {
         if (var2 < 256) {
            var2 = 256;
         }

         try {
            PcmPlayer var3 = PcmPlayer.pcmPlayerProvider.player();
            var3.samples = new int[256 * (PcmPlayer.PcmPlayer_stereo ? 2 : 1)];
            var3.field305 = var2;
            var3.init();
            var3.capacity = (var2 & -1024) + 1024;
            if (var3.capacity > 16384) {
               var3.capacity = 16384;
            }

            var3.open(var3.capacity);
            if (UrlRequest.field1410 > 0 && class354.soundSystem == null) {
               class354.soundSystem = new SoundSystem();
               SoundSystem.soundSystemExecutor = Executors.newScheduledThreadPool(1);
               SoundSystem.soundSystemExecutor.scheduleAtFixedRate(class354.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
            }

            if (class354.soundSystem != null) {
               if (class354.soundSystem.players[var1] != null) {
                  throw new IllegalArgumentException();
               }

               class354.soundSystem.players[var1] = var3;
            }

            return var3;
         } catch (Throwable var4) {
            return new PcmPlayer();
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("ml")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1480705530"
   )
   static final void method3291() {
      PacketBufferNode var0 = class330.getPacketBufferNode(ClientPacket.CLOSE_MODAL, Client.packetWriter.isaacCipher);
      Client.packetWriter.addNode(var0);
      Interpreter.field853 = true;

      for(InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
         if (var1.type == 0 || var1.type == 3) {
            class357.closeInterface(var1, true);
         }
      }

      if (Client.meslayerContinueWidget != null) {
         class144.invalidateWidget(Client.meslayerContinueWidget);
         Client.meslayerContinueWidget = null;
      }

      Interpreter.field853 = false;
   }
}
