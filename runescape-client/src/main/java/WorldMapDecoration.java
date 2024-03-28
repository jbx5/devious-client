import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("kx")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1943305357
	)
	public static int field3118;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1090051195
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -112787079
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 150458509
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}
}
