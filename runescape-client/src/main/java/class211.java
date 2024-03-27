import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("in")
public class class211 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	static final class211 field2165;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	static final class211 field2163;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	static final class211 field2170;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	static final class211 field2168;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	static final class211 field2166;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	static final class211 field2167;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	static final class211 field2171;

	static {
		field2165 = new class211(0, class225.field2404);
		field2163 = new class211(1, class225.field2407);
		field2170 = new class211(2, class225.field2409);
		field2168 = new class211(3, class225.field2401);
		field2166 = new class211(4, class225.field2410);
		field2167 = new class211(5, class225.field2408);
		field2171 = new class211(6, class225.field2411);
	}

	@ObfuscatedSignature(
		descriptor = "(ILiv;)V"
	)
	class211(int var1, class225 var2) {
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "123"
	)
	public static int method3933(int var0) {
		return class7.method60(ViewportMouse.ViewportMouse_entityTags[var0]);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Lud;",
		garbageValue = "1"
	)
	public static class522 method3931(int var0) {
		int var1 = class520.field5151[var0];
		if (var1 == 1) {
			return class522.field5158;
		} else if (var1 == 2) {
			return class522.field5155;
		} else {
			return var1 == 3 ? class522.field5160 : null;
		}
	}

	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-181082999"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = FadeInTask.getPacketBufferNode(ClientPacket.field3265, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(0);
		Client.packetWriter.addNode(var0);
	}
}
