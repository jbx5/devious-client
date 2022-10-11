import java.io.File;
import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("uh")
	@ObfuscatedGetter(
		longValue = 4139438951691168581L
	)
	static long field2649;
	@ObfuscatedName("sw")
	@ObfuscatedGetter(
		intValue = 741348224
	)
	static int field2638;
	@ObfuscatedName("ah")
	static String field2648;
	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "Lkw;"
	)
	@Export("hoveredItemContainer")
	static Widget hoveredItemContainer;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 313526917
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1400554561
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 645705857
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 855976187
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1928669257
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("w")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1925546141
	)
	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true; // L: 9
		this.swColor = var1; // L: 13
		this.seColor = var2; // L: 14
		this.neColor = var3; // L: 15
		this.nwColor = var4; // L: 16
		this.texture = var5; // L: 17
		this.rgb = var6; // L: 18
		this.isFlat = var7; // L: 19
	} // L: 20

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)Lpk;",
		garbageValue = "526697035"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(JagexCache.cacheDir, "preferences" + var0 + ".dat"); // L: 282
		if (var3.exists()) { // L: 283
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L); // L: 285
				return var10; // L: 286
			} catch (IOException var9) { // L: 288
			}
		}

		String var4 = ""; // L: 290
		if (class151.cacheGamebuild == 33) { // L: 291
			var4 = "_rc";
		} else if (class151.cacheGamebuild == 34) { // L: 292
			var4 = "_wip";
		}

		File var5 = new File(JagexCache.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat"); // L: 293
		AccessFile var6;
		if (!var2 && var5.exists()) { // L: 294
			try {
				var6 = new AccessFile(var5, "rw", 10000L); // L: 296
				return var6; // L: 297
			} catch (IOException var8) { // L: 299
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L); // L: 302
			return var6; // L: 303
		} catch (IOException var7) { // L: 305
			throw new RuntimeException(); // L: 306
		}
	}

	@ObfuscatedName("gm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "759233642"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1; // L: 4257
	}
}
