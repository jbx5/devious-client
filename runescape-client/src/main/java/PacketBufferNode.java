import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Llv;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -791568639
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	static ClanSettings field3212;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	@Export("clientPacket")
	public ClientPacket clientPacket;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1893237517
	)
	@Export("clientPacketLength")
	public int clientPacketLength;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1954647975
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];
		PacketBufferNode_packetBufferNodeCount = 0;
	}

	PacketBufferNode() {
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "488598402"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) {
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1856308846"
	)
	static int method5736(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "758333384"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var1 == null ? 0 : var1.size();
	}

	@ObfuscatedName("ns")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-33"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (Canvas.friendsChat != null) {
			PacketBufferNode var1 = class503.getPacketBufferNode(ClientPacket.CLAN_KICKUSER, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class501.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}
}
