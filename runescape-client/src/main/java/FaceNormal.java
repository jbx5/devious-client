import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -22124443
	)
	@Export("x")
	int x;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 140913233
	)
	@Export("y")
	int y;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 598024359
	)
	@Export("z")
	int z;

	FaceNormal() {
	}

	@ObfuscatedName("nc")
	@ObfuscatedSignature(
		descriptor = "(Lnn;I)V",
		garbageValue = "740324846"
	)
	@Export("invalidateWidget")
	public static void invalidateWidget(Widget var0) {
		if (var0 != null && var0.cycle == Client.field607) {
			Client.validRootWidgets[var0.rootIndex] = true;
		}

	}
}
