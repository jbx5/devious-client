import java.security.SecureRandom;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("me")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[Lme;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -330622723
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("hm")
	static SecureRandom field3435;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmm;"
	)
	@Export("clientPacket")
	ClientPacket clientPacket;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1532461933
	)
	@Export("clientPacketLength")
	int clientPacketLength;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lvm;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 291766849
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];
		PacketBufferNode_packetBufferNodeCount = 0;
	}

	PacketBufferNode() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1592111820"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) {
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this;
		}
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(IIIIISISIII)V",
		garbageValue = "-2139560932"
	)
	static void method6524(int var0, int var1, int var2, int var3, int var4, short var5, int var6, short var7, int var8, int var9) {
		NodeDeque var10 = class344.worldView.groundItems[var0][var1][var2];
		if (var10 != null) {
			for (TileItem var11 = (TileItem)var10.last(); var11 != null; var11 = (TileItem)var10.previous()) {
				if ((var3 & 32767) == var11.id && var4 == var11.quantity) {
					PlayerCompositionColorTextureOverride var12 = var11.method3050();
					if (var12 == null) {
						var12 = new PlayerCompositionColorTextureOverride(var3);
					}

					if (var12.method3829() && var6 > -1 && var6 < var12.playerCompositionRecolorTo.length) {
						var12.playerCompositionRecolorTo[var6] = var5;
					}

					if (var12.method3830() && var8 > -1 && var8 < var12.playerCompositionRetextureTo.length) {
						var12.playerCompositionRetextureTo[var8] = var7;
					}

					if (var9 > -1) {
						var12.field1876 = var9;
						var12.field1867 = null;
					}

					var11.method3054(var12);
					break;
				}
			}

			class397.updateItemPile(var0, var1, var2);
		}

	}
}
