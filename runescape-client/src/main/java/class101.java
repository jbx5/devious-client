import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
public class class101 {
	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("js5SocketTask")
	static Task js5SocketTask;
	@ObfuscatedName("jq")
	@ObfuscatedGetter(
		intValue = 719406161
	)
	@Export("baseY")
	static int baseY;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lhu;",
		garbageValue = "-1222371777"
	)
	public static FloorUnderlayDefinition method2723(int var0) {
		FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var0);
			var1 = new FloorUnderlayDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode();
			FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)Z",
		garbageValue = "-429343938"
	)
	static final boolean method2724(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 205) {
			Client.logoutTimer = 250;
			return true;
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) {
				var2 = (var1 - 300) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.changeAppearance(var2, var3 == 1);
			}

			if (var1 >= 314 && var1 <= 323) {
				var2 = (var1 - 314) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.method6317(var2, var3 == 1);
			}

			if (var1 == 324) {
				Client.playerAppearance.method6322(0);
			}

			if (var1 == 325) {
				Client.playerAppearance.method6322(1);
			}

			if (var1 == 326) {
				PacketBufferNode var4 = class113.getPacketBufferNode(ClientPacket.field3200, Client.packetWriter.isaacCipher);
				Client.playerAppearance.write(var4.packetBuffer);
				Client.packetWriter.addNode(var4);
				return true;
			} else {
				return false;
			}
		}
	}
}
