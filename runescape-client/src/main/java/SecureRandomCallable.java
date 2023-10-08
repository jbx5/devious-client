import java.security.SecureRandom;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "[Lud;"
	)
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;
	@ObfuscatedName("uo")
	@ObfuscatedGetter(
		intValue = 1269976827
	)
	static int field1049;

	SecureRandomCallable() {
	}

	public Object call() {
		SecureRandom var2 = new SecureRandom();
		var2.nextInt();
		return var2;
	}

	@ObfuscatedName("oy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2097515012"
	)
	static void method2285() {
		if (WallDecoration.field2871 != null) {
			Client.field814 = Client.cycle;
			WallDecoration.field2871.method7120();

			for (int var0 = 0; var0 < Client.players.length; ++var0) {
				if (Client.players[var0] != null) {
					WallDecoration.field2871.method7119(class20.baseX * 64 + (Client.players[var0].x >> 7), class19.baseY * 64 + (Client.players[var0].y >> 7));
				}
			}
		}

	}
}
