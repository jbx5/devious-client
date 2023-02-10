import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1204155087
   )
   @Export("gameCyclesToDo")
   static int gameCyclesToDo;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1937938003
   )
   @Export("group")
   int group;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -1208870165
   )
   @Export("type")
   int type;
   @ObfuscatedName("v")
   boolean field1055 = false;

   InterfaceParent() {
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)Lji;",
      garbageValue = "73"
   )
   static PacketBufferNode method2309() {
      return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
   }
}
