import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("km")
@Implements("ModelData0")
public class ModelData0 {
	@ObfuscatedName("ao")
	@Export("SpriteBuffer_yOffsets")
	public static int[] SpriteBuffer_yOffsets;
	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "[Lun;"
	)
	@Export("worldSelectArrows")
	static IndexedSprite[] worldSelectArrows;

	ModelData0() {
	}
}
