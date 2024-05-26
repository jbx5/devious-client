import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rb")
public class class451 {
	@ObfuscatedName("lq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "86374774"
	)
	static final void method8409() {
		for (PendingSpawn var0 = (PendingSpawn)class358.topLevelWorldView.pendingSpawns.last(); var0 != null; var0 = (PendingSpawn)class358.topLevelWorldView.pendingSpawns.previous()) {
			if (var0.hitpoints == -1) {
				var0.delay = 0;
				GraphicsObject.method2099(class358.topLevelWorldView, var0);
			} else {
				var0.remove();
			}
		}

	}
}
