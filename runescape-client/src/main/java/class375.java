import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("og")
public class class375 {
	static {
		Math.sqrt(8192.0D);
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1182350132"
	)
	static final void method7427() {
		if (Client.logoutTimer > 0) {
			PcmPlayer.logOut();
		} else {
			Client.timer.method8666();
			class464.updateGameState(40);
			class30.field141 = Client.packetWriter.getSocket();
			Client.packetWriter.removeSocket();
		}
	}
}
