import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("iq")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1339195025
	)
	@Export("x")
	int x;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -233741861
	)
	@Export("y")
	int y;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1805768811
	)
	@Export("z")
	int z;

	FaceNormal() {
	}
}
