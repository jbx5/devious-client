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
		for (PendingSpawn var0 = (PendingSpawn)class358.scene.field1342.last(); var0 != null; var0 = (PendingSpawn)class358.scene.field1342.previous()) {
			if (var0.field1203 == -1) {
				var0.field1202 = 0;
				GraphicsObject.method2099(class358.scene, var0);
			} else {
				var0.remove();
			}
		}

	}
}
