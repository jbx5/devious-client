import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("du")
public class class93 {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-263879451"
	)
	static int method2370() {
		return Login.loginIndex;
	}

	@ObfuscatedName("hn")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1274720283"
	)
	static final void method2369() {
		if (Client.logoutTimer > 0) {
			WorldMapScaleHandler.logOut();
		} else {
			Client.timer.method7724();
			class129.updateGameState(40);
			UserComparator5.field1461 = Client.packetWriter.getSocket();
			Client.packetWriter.removeSocket();
		}
	}
}
