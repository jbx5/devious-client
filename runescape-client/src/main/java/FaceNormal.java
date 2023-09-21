import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jv")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 514745329
	)
	@Export("x")
	int x;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -350302109
	)
	@Export("y")
	int y;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1715062155
	)
	@Export("z")
	int z;

	FaceNormal() {
	}

	@ObfuscatedName("mo")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2079902231"
	)
	static final int method4845() {
		float var0 = 200.0F * ((float)class91.clientPreferences.method2513() - 0.5F);
		return 100 - Math.round(var0);
	}
}
