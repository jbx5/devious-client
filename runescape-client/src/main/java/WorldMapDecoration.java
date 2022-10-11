import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ie")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1187895399
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -508855771
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -992636429
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1; // L: 9
		this.decoration = var2; // L: 10
		this.rotation = var3; // L: 11
	} // L: 12
}
