import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jm")
public class class276 {
   @ObfuscatedName("hs")
   @ObfuscatedSignature(
      descriptor = "Lnv;"
   )
   @Export("fontPlain11")
   static Font fontPlain11;

   @ObfuscatedName("lk")
   @ObfuscatedSignature(
      descriptor = "(Lkz;I)Z",
      garbageValue = "536221061"
   )
   static final boolean method5534(Widget var0) {
      int var1 = var0.contentType;
      if (var1 == 205) {
         Client.logoutTimer = 250;
         return true;
      } else {
         int var2;
         int var3;
         if (var1 >= 300 && var1 <= 313) {
            var2 = (var1 - 300) / 2;
            var3 = var1 & 1;
            Client.playerAppearance.changeAppearance(var2, var3 == 1);
         }

         if (var1 >= 314 && var1 <= 323) {
            var2 = (var1 - 314) / 2;
            var3 = var1 & 1;
            Client.playerAppearance.method5885(var2, var3 == 1);
         }

         if (var1 == 324) {
            Client.playerAppearance.method5898(0);
         }

         if (var1 == 325) {
            Client.playerAppearance.method5898(1);
         }

         if (var1 == 326) {
            PacketBufferNode var4 = Renderable.getPacketBufferNode(ClientPacket.field3101, Client.packetWriter.isaacCipher);
            Client.playerAppearance.write(var4.packetBuffer);
            Client.packetWriter.addNode(var4);
            return true;
         } else {
            return false;
         }
      }
   }
}
