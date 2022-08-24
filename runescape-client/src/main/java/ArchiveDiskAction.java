import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ks")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1360611527
   )
   @Export("type")
   int type;
   @ObfuscatedName("h")
   @Export("data")
   public byte[] data;
   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "Lnk;"
   )
   @Export("archiveDisk")
   public ArchiveDisk archiveDisk;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("archive")
   public Archive archive;

   ArchiveDiskAction() {
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(B)[Lql;",
      garbageValue = "90"
   )
   @Export("FillMode_values")
   public static class454[] FillMode_values() {
      return new class454[]{class454.SOLID, class454.field4781, class454.field4784};
   }

   @ObfuscatedName("hw")
   @ObfuscatedSignature(
      descriptor = "(IIIILjava/lang/String;I)V",
      garbageValue = "-1771551760"
   )
   @Export("widgetDefaultMenuAction")
   static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
      Widget var5 = class128.getWidgetChild(var1, var2);
      if (var5 != null) {
         if (var5.onOp != null) {
            ScriptEvent var6 = new ScriptEvent();
            var6.widget = var5;
            var6.opIndex = var0;
            var6.targetName = var4;
            var6.args = var5.onOp;
            SceneTilePaint.runScriptEvent(var6);
         }

         boolean var8 = true;
         if (var5.contentType > 0) {
            var8 = class18.method263(var5);
         }

         if (var8) {
            if (TaskHandler.method3189(class193.getWidgetFlags(var5), var0 - 1)) {
               PacketBufferNode var7;
               if (var0 == 1) {
                  var7 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3003, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 2) {
                  var7 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2933, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 3) {
                  var7 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2993, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 4) {
                  var7 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2928, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 5) {
                  var7 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2935, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 6) {
                  var7 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2915, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 7) {
                  var7 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2940, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 8) {
                  var7 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field3004, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 9) {
                  var7 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2968, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 10) {
                  var7 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2973, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

            }
         }
      }
   }
}
