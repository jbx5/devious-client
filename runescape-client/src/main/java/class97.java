import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ci")
public class class97 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lci;"
	)
	static final class97 field1307;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lci;"
	)
	static final class97 field1306;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lci;"
	)
	static final class97 field1308;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lci;"
	)
	static final class97 field1313;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lci;"
	)
	static final class97 field1309;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lci;"
	)
	static final class97 field1311;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lci;"
	)
	static final class97 field1312;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lci;"
	)
	static final class97 field1305;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lci;"
	)
	static final class97 field1310;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lci;"
	)
	static final class97 field1314;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lci;"
	)
	static final class97 field1315;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lci;"
	)
	static final class97 field1316;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lci;"
	)
	static final class97 field1317;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lci;"
	)
	static final class97 field1318;
	@ObfuscatedName("fi")
	@ObfuscatedGetter(
		intValue = -702734009
	)
	static int field1320;
	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "[Lqi;"
	)
	@Export("mapMarkerSprites")
	static SpritePixels[] mapMarkerSprites;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = -323102541
	)
	int field1319;

	static {
		field1307 = new class97(0); // L: 2016
		field1306 = new class97(1); // L: 2017
		field1308 = new class97(2); // L: 2018
		field1313 = new class97(3); // L: 2019
		field1309 = new class97(4); // L: 2020
		field1311 = new class97(5); // L: 2021
		field1312 = new class97(6); // L: 2022
		field1305 = new class97(7); // L: 2023
		field1310 = new class97(8); // L: 2024
		field1314 = new class97(9); // L: 2025
		field1315 = new class97(10); // L: 2026
		field1316 = new class97(11); // L: 2027
		field1317 = new class97(12); // L: 2028
		field1318 = new class97(13); // L: 2029
	}

	class97(int var1) {
		this.field1319 = var1; // L: 2033
	} // L: 2034

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)[Ldc;",
		garbageValue = "44"
	)
	static class124[] method2586() {
		return new class124[]{class124.field1531, class124.field1528, class124.field1525, class124.field1523, class124.field1527, class124.field1526, class124.field1529, class124.field1530, class124.field1524}; // L: 113
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public static void method2584() {
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear(); // L: 122
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear(); // L: 123
	} // L: 124

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-40"
	)
	public static void method2587() {
		HitSplatDefinition.HitSplatDefinition_cached.clear(); // L: 171
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear(); // L: 172
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear(); // L: 173
	} // L: 174

	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "27"
	)
	static final void method2585() {
		Scene.Scene_isLowDetail = false; // L: 863
		Client.isLowDetail = false; // L: 864
	} // L: 865

	@ObfuscatedName("ld")
	@ObfuscatedSignature(
		descriptor = "(Lkw;I)I",
		garbageValue = "1838036367"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get(((long)var0.id << 32) + (long)var0.childIndex); // L: 12024
		return var1 != null ? var1.integer : var0.flags; // L: 12025 12026
	}
}
