import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	public static AbstractArchive field2818;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -806416889
	)
	@Export("z")
	int z;
	@ObfuscatedName("ay")
	@Export("x")
	@ObfuscatedGetter(
			intValue = -1332468171
	)
	int x;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 448426013
	)
	@Export("y")
	int y;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1744818139
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 547702737
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = 2261307453963258309L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1559752195
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L;
		this.flags = 0;
	}
}
