import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jx")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "[Ljx;"
   )
   @Export("PacketBufferNode_packetBufferNodes")
   static PacketBufferNode[] PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1114776315
   )
   @Export("PacketBufferNode_packetBufferNodeCount")
   static int PacketBufferNode_packetBufferNodeCount = 0;
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   @Export("Widget_fontsArchive")
   static AbstractArchive Widget_fontsArchive;
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   @Export("clientPacket")
   public ClientPacket clientPacket;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -554924555
   )
   @Export("clientPacketLength")
   public int clientPacketLength;
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Lqx;"
   )
   @Export("packetBuffer")
   public PacketBuffer packetBuffer;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = -1351842287
   )
   @Export("index")
   public int index;

   PacketBufferNode() {
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-383779244"
   )
   @Export("release")
   public void release() {
      if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) {
         PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this;
      }
   }
}
