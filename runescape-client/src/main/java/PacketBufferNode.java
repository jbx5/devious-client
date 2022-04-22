import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"[Ljd;")

	@Export("PacketBufferNode_packetBufferNodes")
	public static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	294123919)

	@Export("PacketBufferNode_packetBufferNodeCount")
	public static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Ljl;")

	@Export("clientPacket")
	public ClientPacket clientPacket;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	-147579925)

	@Export("clientPacketLength")
	public int clientPacketLength;
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Lpz;")

	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	843582305)

	@Export("index")
	public int index;
	static 
	{
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];
		PacketBufferNode_packetBufferNodeCount = 0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"2142638680")

	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode.PacketBufferNode_packetBufferNodes.length) {
			PacketBufferNode_packetBufferNodes[(++PacketBufferNode_packetBufferNodeCount) - 1] = this;
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(II)Z", garbageValue = 
	"-1834860972")

	public static boolean method5187(int var0) {
		return (var0 >= 0) && (var0 < 112) ? KeyHandler.KeyHandler_pressedKeys[var0] : false;
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(descriptor = 
	"(Lcz;I)Z", garbageValue = 
	"71882365")

	static boolean method5188(Player var0) {
		if (Client.drawPlayerNames == 0) {
			return false;
		} else if (GrandExchangeEvents.localPlayer == var0) {
			return class6.method36();
		} else {
			boolean var1 = NPCComposition.method3531() || (Varcs.method2441() && var0.isFriend());
			if (!var1) {
				boolean var2 = (Client.drawPlayerNames & 2) != 0;
				var1 = var2 && var0.isFriendsChatMember();
			}

			return var1;
		}
	}
}