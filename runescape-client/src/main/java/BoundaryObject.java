import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ku")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1391582221
	)
	@Export("z")
	int z;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -258914059
	)
	@Export("x")
	int x;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -583966167
	)
	@Export("y")
	int y;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 337133155
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2005342059
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = -8815954421268300977L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1136520437
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L;
		this.flags = 0;
	}
}
