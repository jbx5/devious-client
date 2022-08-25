import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("dx")
public class class114 {
	@ObfuscatedName("v")
	public static final float field1410 = Math.ulp(1.0F);

	@ObfuscatedName("c")
	public static final float field1407;

	static {
		field1407 = 2.0F * field1410;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1923556377")
	public static void method2637() {
		ObjectComposition.ObjectDefinition_cached.clear();
		ObjectComposition.ObjectDefinition_cachedModelData.clear();
		ObjectComposition.ObjectDefinition_cachedEntities.clear();
		ObjectComposition.ObjectDefinition_cachedModels.clear();
	}

	@ObfuscatedName("kk")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1368697061")
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.CLAN_LEAVECHAT, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(0);
		Client.packetWriter.addNode(var0);
	}
}