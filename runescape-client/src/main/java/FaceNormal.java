import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gh")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("ed")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("archive11")
	static Archive archive11;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -2023044953
	)
	@Export("x")
	int x;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1127308585
	)
	@Export("y")
	int y;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1704901571
	)
	@Export("z")
	int z;

	FaceNormal() {
	} // L: 8

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1756706503"
	)
	static void method4466() {
		Players.Players_count = 0; // L: 634

		for (int var0 = 0; var0 < 2048; ++var0) { // L: 635
			Players.field1292[var0] = null; // L: 636
			Players.field1291[var0] = class193.field2246; // L: 637
		}

	} // L: 639
}
