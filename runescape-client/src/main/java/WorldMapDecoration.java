import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jn")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field2627;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 394542689
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -2000261319
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1201614091
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-90"
	)
	public static void method5021() {
		WorldMapElement.HitSplatDefinition_cached.clear();
	}
}
