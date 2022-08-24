import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("gf")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("u")
	static int[] field2453;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = -1878115833)
	@Export("x")
	int x;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = -1558170339)
	@Export("y")
	int y;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 307646535)
	@Export("z")
	int z;

	FaceNormal() {
	}
}