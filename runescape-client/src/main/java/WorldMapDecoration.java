import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("le")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -86955387
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -366743665
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2066973857
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}
}
