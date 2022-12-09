import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ev")
public abstract class class136 extends Node {
   class136() {
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lqy;I)V",
      garbageValue = "1101327225"
   )
   abstract void vmethod3349(Buffer var1);

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Lep;I)V",
      garbageValue = "839088249"
   )
   abstract void vmethod3350(ClanSettings var1);

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(Ljp;Lrg;B)Ljx;",
      garbageValue = "107"
   )
   @Export("getPacketBufferNode")
   public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
      PacketBufferNode var2 = class109.method2781();
      var2.clientPacket = var0;
      var2.clientPacketLength = var0.length;
      if (var2.clientPacketLength == -1) {
         var2.packetBuffer = new PacketBuffer(260);
      } else if (var2.clientPacketLength == -2) {
         var2.packetBuffer = new PacketBuffer(10000);
      } else if (var2.clientPacketLength <= 18) {
         var2.packetBuffer = new PacketBuffer(20);
      } else if (var2.clientPacketLength <= 98) {
         var2.packetBuffer = new PacketBuffer(100);
      } else {
         var2.packetBuffer = new PacketBuffer(260);
      }

      var2.packetBuffer.setIsaacCipher(var1);
      var2.packetBuffer.writeByteIsaac(var2.clientPacket.id);
      var2.index = 0;
      return var2;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-2080647324"
   )
   public static boolean method3075(int var0) {
      return (var0 >> 20 & 1) != 0;
   }

   @ObfuscatedName("lh")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "6278"
   )
   static void method3073() {
      for(InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) {
         int var1 = var0.group;
         if (Players.loadInterface(var1)) {
            boolean var2 = true;
            Widget[] var3 = class71.Widget_interfaceComponents[var1];

            int var4;
            for(var4 = 0; var4 < var3.length; ++var4) {
               if (var3[var4] != null) {
                  var2 = var3[var4].isIf3;
                  break;
               }
            }

            if (!var2) {
               var4 = (int)var0.key;
               Widget var5 = PlayerCompositionColorTextureOverride.getWidget(var4);
               if (var5 != null) {
                  class69.invalidateWidget(var5);
               }
            }
         }
      }

   }
}
