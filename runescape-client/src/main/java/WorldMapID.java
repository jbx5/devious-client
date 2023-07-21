import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	static final WorldMapID field3024;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	static final WorldMapID field3022;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -383521267
	)
	@Export("value")
	final int value;

	static {
		field3024 = new WorldMapID(0);
		field3022 = new WorldMapID(1);
	}

	WorldMapID(int var1) {
		this.value = var1;
	}
}
