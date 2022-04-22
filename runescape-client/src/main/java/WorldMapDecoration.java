import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("hl")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	37157343)

	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	1991740145)

	@Export("decoration")
	final int decoration;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	-1682517797)

	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}
}