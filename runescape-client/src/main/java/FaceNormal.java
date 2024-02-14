import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("kx")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 586224973
	)
	@Export("x")
	int x;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 644707845
	)
	@Export("y")
	int y;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1302107757
	)
	@Export("z")
	int z;

	FaceNormal() {
	}
}
