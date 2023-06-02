import java.util.concurrent.locks.ReentrantLock;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("br")
public class class47 {
   @ObfuscatedName("iw")
   @ObfuscatedSignature(
      descriptor = "Lea;"
   )
   @Export("urlRequester")
   static UrlRequester urlRequester;
   @ObfuscatedName("jl")
   @ObfuscatedSignature(
      descriptor = "[Ltj;"
   )
   @Export("mapSceneSprites")
   static IndexedSprite[] mapSceneSprites;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lca;"
   )
   VorbisSample field333;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lbp;"
   )
   RawSound field332;
   @ObfuscatedName("av")
   ReentrantLock field331;

   @ObfuscatedSignature(
      descriptor = "(Lca;Lbp;)V"
   )
   class47(VorbisSample var1, RawSound var2) {
      this.field333 = var1;
      this.field332 = var2;
      this.field331 = new ReentrantLock();
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1898758545"
   )
   static void method844() {
      class390.method7249(24);
      class478.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");
   }

   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      descriptor = "(ILdd;ZB)I",
      garbageValue = "-53"
   )
   static int method843(int var0, Script var1, boolean var2) {
      return 2;
   }

   @ObfuscatedName("kv")
   @ObfuscatedSignature(
      descriptor = "(ILjava/lang/String;I)V",
      garbageValue = "-1940419951"
   )
   static void method845(int var0, String var1) {
      int var2 = Players.Players_count;
      int[] var3 = Players.Players_indices;
      boolean var4 = false;
      Username var5 = new Username(var1, WorldMapScaleHandler.loginType);

      for(int var6 = 0; var6 < var2; ++var6) {
         Player var7 = Client.players[var3[var6]];
         if (var7 != null && var7 != Projectile.localPlayer && var7.username != null && var7.username.equals(var5)) {
            PacketBufferNode var8;
            if (var0 == 1) {
               var8 = ObjectComposition.getPacketBufferNode(ClientPacket.OPPLAYER1, Client.packetWriter.isaacCipher);
               var8.packetBuffer.writeByteSub(0);
               var8.packetBuffer.writeShortAdd(var3[var6]);
               Client.packetWriter.addNode(var8);
            } else if (var0 == 4) {
               var8 = ObjectComposition.getPacketBufferNode(ClientPacket.OPPLAYER4, Client.packetWriter.isaacCipher);
               var8.packetBuffer.writeShortLE(var3[var6]);
               var8.packetBuffer.writeByteAdd(0);
               Client.packetWriter.addNode(var8);
            } else if (var0 == 6) {
               var8 = ObjectComposition.getPacketBufferNode(ClientPacket.OPPLAYER6, Client.packetWriter.isaacCipher);
               var8.packetBuffer.writeByteNeg(0);
               var8.packetBuffer.writeShort(var3[var6]);
               Client.packetWriter.addNode(var8);
            } else if (var0 == 7) {
               var8 = ObjectComposition.getPacketBufferNode(ClientPacket.OPPLAYER7, Client.packetWriter.isaacCipher);
               var8.packetBuffer.writeByte(0);
               var8.packetBuffer.writeShortAddLE(var3[var6]);
               Client.packetWriter.addNode(var8);
            }

            var4 = true;
            break;
         }
      }

      if (!var4) {
         class59.addGameMessage(4, "", "Unable to find " + var1);
      }

   }
}
