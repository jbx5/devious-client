import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
public class class275 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	static final class275 field2999;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	static final class275 field2997;

	static {
		field2999 = new class275(-1);
		field2997 = new class275(1);
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1"
	)
	class275(int var1) {
	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1650376321"
	)
	static final void method5488() {
		if (Client.logoutTimer > 0) {
			class138.logOut();
		} else {
			Client.timer.method8426();
			UserComparator3.updateGameState(40);
			class91.field1091 = Client.packetWriter.getSocket();
			Client.packetWriter.removeSocket();
		}
	}
}
