import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	static final WorldMapID field3192;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Llo;"
	)
	static final WorldMapID field3191;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1057214995
	)
	@Export("value")
	final int value;

	static {
		field3192 = new WorldMapID(0);
		field3191 = new WorldMapID(1);
	}

	WorldMapID(int var1) {
		this.value = var1;
	}
}
