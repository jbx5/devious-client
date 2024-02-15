import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kj")
@Implements("FloorDecoration")
public final class FloorDecoration {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -152793447
	)
	@Export("z")
	int z;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -885091771
	)
	@Export("x")
	int x;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1519580623
	)
	@Export("y")
	int y;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = -3151258421166268253L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -735397959
	)
	@Export("flags")
	int flags;

	FloorDecoration() {
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "371254580"
	)
	public static void method5268() {
		HealthBarDefinition.HealthBarDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
	}
}
