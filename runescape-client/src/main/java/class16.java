import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("p")
public class class16 implements ThreadFactory {
   @ObfuscatedName("ui")
   @ObfuscatedGetter(
      intValue = -57356017
   )
   static int field88;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("SequenceDefinition_skeletonsArchive")
   static AbstractArchive SequenceDefinition_skeletonsArchive;
   @ObfuscatedName("f")
   final ThreadGroup field90;
   @ObfuscatedName("w")
   final AtomicInteger field86;
   // $FF: synthetic field
   @ObfuscatedSignature(
      descriptor = "Lt;"
   )
   final class14 this$0;

   @ObfuscatedSignature(
      descriptor = "(Lt;)V"
   )
   class16(class14 var1) {
      this.this$0 = var1;
      this.field86 = new AtomicInteger(1);
      SecurityManager var2 = System.getSecurityManager();
      this.field90 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup();
   }

   public Thread newThread(Runnable var1) {
      Thread var2 = new Thread(this.field90, var1, this.this$0.field73 + "-rest-request-" + this.field86.getAndIncrement(), 0L);
      var2.setDaemon(true);
      var2.setPriority(5);
      return var2;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "370941901"
   )
   public static boolean method216(int var0) {
      return (var0 >> 29 & 1) != 0;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "33"
   )
   static int method218() {
      return Login.loginIndex;
   }

   @ObfuscatedName("jl")
   @ObfuscatedSignature(
      descriptor = "(IIIILjava/lang/String;I)V",
      garbageValue = "-1439250814"
   )
   @Export("widgetDefaultMenuAction")
   static void widgetDefaultMenuAction(int var0, int var1, int var2, int var3, String var4) {
      Widget var5 = class135.getWidgetChild(var1, var2);
      if (var5 != null) {
         if (var5.onOp != null) {
            ScriptEvent var6 = new ScriptEvent();
            var6.widget = var5;
            var6.opIndex = var0;
            var6.targetName = var4;
            var6.args = var5.onOp;
            WorldMapAreaData.runScriptEvent(var6);
         }

         boolean var8 = true;
         if (var5.contentType > 0) {
            var8 = class276.method5534(var5);
         }

         if (var8) {
            if (ItemLayer.method4229(class173.getWidgetFlags(var5), var0 - 1)) {
               PacketBufferNode var7;
               if (var0 == 1) {
                  var7 = Renderable.getPacketBufferNode(ClientPacket.IF_BUTTON1, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 2) {
                  var7 = Renderable.getPacketBufferNode(ClientPacket.IF_BUTTON2, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 3) {
                  var7 = Renderable.getPacketBufferNode(ClientPacket.IF_BUTTON3, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 4) {
                  var7 = Renderable.getPacketBufferNode(ClientPacket.IF_BUTTON4, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 5) {
                  var7 = Renderable.getPacketBufferNode(ClientPacket.IF_BUTTON5, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 6) {
                  var7 = Renderable.getPacketBufferNode(ClientPacket.IF_BUTTON6, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 7) {
                  var7 = Renderable.getPacketBufferNode(ClientPacket.IF_BUTTON7, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 8) {
                  var7 = Renderable.getPacketBufferNode(ClientPacket.IF_BUTTON8, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 9) {
                  var7 = Renderable.getPacketBufferNode(ClientPacket.IF_BUTTON9, Client.packetWriter.isaacCipher);
                  var7.packetBuffer.writeInt(var1);
                  var7.packetBuffer.writeShort(var2);
                  var7.packetBuffer.writeShort(var3);
                  Client.packetWriter.addNode(var7);
               }

               if (var0 == 10) {
                  var7 = Renderable.getPacketBufferNode(ClientPacket.IF_BUTTON10, Client.packetWriter.isaacCipher);
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
