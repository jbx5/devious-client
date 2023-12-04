import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("my")
public class class314 {
	@ObfuscatedName("at")
	static int[] field3402;
	@ObfuscatedName("hu")
	@Export("authServiceBaseUrl")
	static String authServiceBaseUrl;

	static {
		new Object();
		field3402 = new int[33];
		field3402[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field3402[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "26"
	)
	static final void method5953(int var0, int var1, int var2) {
		if (ViewportMouse.cameraX < var0) {
			ViewportMouse.cameraX = (var0 - ViewportMouse.cameraX) * class1.field2 / 1000 + ViewportMouse.cameraX + WorldMapIcon_0.field2529;
			if (ViewportMouse.cameraX > var0) {
				ViewportMouse.cameraX = var0;
			}
		}

		if (ViewportMouse.cameraX > var0) {
			ViewportMouse.cameraX -= (ViewportMouse.cameraX - var0) * class1.field2 / 1000 + WorldMapIcon_0.field2529;
			if (ViewportMouse.cameraX < var0) {
				ViewportMouse.cameraX = var0;
			}
		}

		if (SecureRandomFuture.cameraY < var1) {
			SecureRandomFuture.cameraY = (var1 - SecureRandomFuture.cameraY) * class1.field2 / 1000 + SecureRandomFuture.cameraY + WorldMapIcon_0.field2529;
			if (SecureRandomFuture.cameraY > var1) {
				SecureRandomFuture.cameraY = var1;
			}
		}

		if (SecureRandomFuture.cameraY > var1) {
			SecureRandomFuture.cameraY -= (SecureRandomFuture.cameraY - var1) * class1.field2 / 1000 + WorldMapIcon_0.field2529;
			if (SecureRandomFuture.cameraY < var1) {
				SecureRandomFuture.cameraY = var1;
			}
		}

		if (class36.cameraZ < var2) {
			class36.cameraZ = (var2 - class36.cameraZ) * class1.field2 / 1000 + class36.cameraZ + WorldMapIcon_0.field2529;
			if (class36.cameraZ > var2) {
				class36.cameraZ = var2;
			}
		}

		if (class36.cameraZ > var2) {
			class36.cameraZ -= (class36.cameraZ - var2) * class1.field2 / 1000 + WorldMapIcon_0.field2529;
			if (class36.cameraZ < var2) {
				class36.cameraZ = var2;
			}
		}

	}
}
