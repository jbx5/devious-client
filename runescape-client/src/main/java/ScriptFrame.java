import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bl")
@Implements("ScriptFrame")
public class ScriptFrame {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lbm;"
   )
   @Export("script")
   Script script;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = 1822027501
   )
   @Export("pc")
   int pc = -1;
   @ObfuscatedName("v")
   @Export("intLocals")
   int[] intLocals;
   @ObfuscatedName("x")
   @Export("stringLocals")
   String[] stringLocals;

   ScriptFrame() {
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-50"
   )
   public static void method1174() {
      VarpDefinition.VarpDefinition_cached.clear();
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "277790421"
   )
   static final void method1170(int var0, int var1, int var2) {
      int var3;
      for(var3 = 0; var3 < 8; ++var3) {
         for(int var4 = 0; var4 < 8; ++var4) {
            Tiles.Tiles_heights[var0][var3 + var1][var4 + var2] = 0;
         }
      }

      if (var1 > 0) {
         for(var3 = 1; var3 < 8; ++var3) {
            Tiles.Tiles_heights[var0][var1][var3 + var2] = Tiles.Tiles_heights[var0][var1 - 1][var3 + var2];
         }
      }

      if (var2 > 0) {
         for(var3 = 1; var3 < 8; ++var3) {
            Tiles.Tiles_heights[var0][var3 + var1][var2] = Tiles.Tiles_heights[var0][var3 + var1][var2 - 1];
         }
      }

      if (var1 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2] != 0) {
         Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2];
      } else if (var2 > 0 && Tiles.Tiles_heights[var0][var1][var2 - 1] != 0) {
         Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1][var2 - 1];
      } else if (var1 > 0 && var2 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2 - 1] != 0) {
         Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2 - 1];
      }

   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2050810740"
   )
   public static void method1173() {
      KitDefinition.KitDefinition_cached.clear();
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Lfp;IIB)Lax;",
      garbageValue = "113"
   )
   public static final PcmPlayer method1168(TaskHandler var0, int var1, int var2) {
      if (PcmPlayer.field325 * 22050 == 0) {
         throw new IllegalStateException();
      } else if (var1 >= 0 && var1 < 2) {
         if (var2 < 256) {
            var2 = 256;
         }

         try {
            PcmPlayer var3 = class20.pcmPlayerProvider.player();
            var3.samples = new int[256 * (class286.PcmPlayer_stereo ? 2 : 1)];
            var3.field320 = var2;
            var3.init();
            var3.capacity = (var2 & -1024) + 1024;
            if (var3.capacity > 16384) {
               var3.capacity = 16384;
            }

            var3.open(var3.capacity);
            if (class34.field205 > 0 && PcmPlayer.soundSystem == null) {
               PcmPlayer.soundSystem = new SoundSystem();
               class11.soundSystemExecutor = Executors.newScheduledThreadPool(1);
               class11.soundSystemExecutor.scheduleAtFixedRate(PcmPlayer.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
            }

            if (PcmPlayer.soundSystem != null) {
               if (PcmPlayer.soundSystem.players[var1] != null) {
                  throw new IllegalArgumentException();
               }

               PcmPlayer.soundSystem.players[var1] = var3;
            }

            return var3;
         } catch (Throwable var4) {
            return new PcmPlayer();
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfuscatedName("ir")
   @ObfuscatedSignature(
      descriptor = "(IIIB)V",
      garbageValue = "-9"
   )
   @Export("worldToScreen")
   static final void worldToScreen(int var0, int var1, int var2) {
      if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
         int var3 = SpotAnimationDefinition.getTileHeight(var0, var1, class383.Client_plane) - var2;
         var0 -= class145.cameraX;
         var3 -= class414.cameraY;
         var1 -= ClanChannel.cameraZ;
         int var4 = Rasterizer3D.Rasterizer3D_sine[class97.cameraPitch];
         int var5 = Rasterizer3D.Rasterizer3D_cosine[class97.cameraPitch];
         int var6 = Rasterizer3D.Rasterizer3D_sine[class128.cameraYaw];
         int var7 = Rasterizer3D.Rasterizer3D_cosine[class128.cameraYaw];
         int var8 = var6 * var1 + var0 * var7 >> 16;
         var1 = var7 * var1 - var0 * var6 >> 16;
         var0 = var8;
         var8 = var3 * var5 - var4 * var1 >> 16;
         var1 = var3 * var4 + var5 * var1 >> 16;
         if (var1 >= 50) {
            Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2;
            Client.viewportTempY = Client.viewportHeight / 2 + var8 * Client.viewportZoom / var1;
         } else {
            Client.viewportTempX = -1;
            Client.viewportTempY = -1;
         }

      } else {
         Client.viewportTempX = -1;
         Client.viewportTempY = -1;
      }
   }

   @ObfuscatedName("kn")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIB)V",
      garbageValue = "-124"
   )
   static final void method1172(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
      class37.insertMenuItem(var0, var1, var2, var3, var4, var5, var6, false);
   }

   @ObfuscatedName("md")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1601276556"
   )
   static final void method1171(int var0, int var1) {
      ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : VarcInt.guestClanChannel;
      if (var2 != null && var1 >= 0 && var1 < var2.method3312()) {
         ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1);
         if (var3.rank == -1) {
            String var4 = var3.username.getName();
            PacketBufferNode var5 = class136.getPacketBufferNode(ClientPacket.field3142, Client.packetWriter.isaacCipher);
            var5.packetBuffer.writeByte(3 + class13.stringCp1252NullTerminatedByteSize(var4));
            var5.packetBuffer.writeByte(var0);
            var5.packetBuffer.writeShort(var1);
            var5.packetBuffer.writeStringCp1252NullTerminated(var4);
            Client.packetWriter.addNode(var5);
         }
      }
   }

   @ObfuscatedName("mj")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;ZI)Ljava/lang/String;",
      garbageValue = "-1986308833"
   )
   static String method1169(String var0, boolean var1) {
      String var2 = var1 ? "https://" : "http://";
      if (Client.gameBuild == 1) {
         var0 = var0 + "-wtrc";
      } else if (Client.gameBuild == 2) {
         var0 = var0 + "-wtqa";
      } else if (Client.gameBuild == 3) {
         var0 = var0 + "-wtwip";
      } else if (Client.gameBuild == 5) {
         var0 = var0 + "-wti";
      } else if (Client.gameBuild == 4) {
         var0 = "local";
      }

      String var3 = "";
      if (class133.field1635 != null) {
         var3 = "/p=" + class133.field1635;
      }

      String var4 = "runescape.com";
      return var2 + var0 + "." + var4 + "/l=" + class173.clientLanguage + "/a=" + WallDecoration.field2799 + var3 + "/";
   }
}
