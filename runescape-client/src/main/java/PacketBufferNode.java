import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "[Lkp;"
   )
   @Export("PacketBufferNode_packetBufferNodes")
   static PacketBufferNode[] PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -367873173
   )
   @Export("PacketBufferNode_packetBufferNodeCount")
   static int PacketBufferNode_packetBufferNodeCount = 0;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lkb;"
   )
   @Export("clientPacket")
   ClientPacket clientPacket;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -1667084847
   )
   @Export("clientPacketLength")
   int clientPacketLength;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lsq;"
   )
   @Export("packetBuffer")
   public PacketBuffer packetBuffer;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 997120047
   )
   @Export("index")
   public int index;

   PacketBufferNode() {
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-957261976"
   )
   @Export("release")
   public void release() {
      if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) {
         PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this;
      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
      garbageValue = "1565722343"
   )
   public static String method5467(String var0) {
      StringBuilder var1 = new StringBuilder(var0.length());
      int var2 = 0;
      int var3 = -1;

      for(int var4 = 0; var4 < var0.length(); ++var4) {
         char var5 = var0.charAt(var4);
         if (var5 == '<') {
            var1.append(var0.substring(var2, var4));
            var3 = var4;
         } else if (var5 == '>' && var3 != -1) {
            String var6 = var0.substring(var3 + 1, var4);
            var3 = -1;
            if (var6.equals("lt")) {
               var1.append("<");
            } else if (var6.equals("gt")) {
               var1.append(">");
            } else if (var6.equals("br")) {
               var1.append("\n");
            }

            var2 = var4 + 1;
         }
      }

      if (var2 < var0.length()) {
         var1.append(var0.substring(var2, var0.length()));
      }

      return var1.toString();
   }
}
