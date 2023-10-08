import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	static final WorldMapID field3069;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lki;"
	)
	static final WorldMapID field3067;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 158021367
	)
	@Export("value")
	final int value;

	static {
		field3069 = new WorldMapID(0);
		field3067 = new WorldMapID(1);
	}

	WorldMapID(int var1) {
		this.value = var1;
	}
}
