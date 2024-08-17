import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jz")
@Implements("VarbitComposition")
public class VarbitComposition extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	@Export("VarbitDefinition_archive")
	public static AbstractArchive VarbitDefinition_archive;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("VarbitDefinition_cached")
	public static EvictingDualNodeHashTable VarbitDefinition_cached;
	@ObfuscatedName("ao")
	static final int[] field2686;
	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	static Archive field2680;
	@ObfuscatedName("gw")
	@ObfuscatedGetter(
		intValue = 479906515
	)
	static int field2687;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -30861727
	)
	@Export("baseVar")
	public int baseVar;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 96028407
	)
	@Export("startBit")
	public int startBit;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -320928113
	)
	@Export("endBit")
	public int endBit;

	static {
		VarbitDefinition_cached = new EvictingDualNodeHashTable(64);
		field2686 = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field2686[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "1854809717"
	)
	@Export("decode")
	public void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvg;II)V",
		garbageValue = "2047575353"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.baseVar = var1.readUnsignedShort();
			this.startBit = var1.readUnsignedByte();
			this.endBit = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1793928479"
	)
	@Export("setWindowedMode")
	static void setWindowedMode(int var0) {
		Client.field724 = 0L;
		if (var0 >= 2) {
			Client.isResizable = true;
		} else {
			Client.isResizable = false;
		}

		if (LoginPacket.getWindowedMode() == 1) {
			DynamicObject.client.setMaxCanvasSize(765, 503);
		} else {
			DynamicObject.client.setMaxCanvasSize(7680, 2160);
		}

		if (Client.gameState >= 25 && Client.packetWriter != null && Client.packetWriter.isaacCipher != null) {
			PacketBufferNode var1 = class218.getPacketBufferNode(ClientPacket.EVENT_WINDOW_SETTING, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(LoginPacket.getWindowedMode());
			var1.packetBuffer.writeShort(NPC.canvasWidth);
			var1.packetBuffer.writeShort(ApproximateRouteStrategy.canvasHeight);
			Client.packetWriter.addNode(var1);
		}

	}
}
