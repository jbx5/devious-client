import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kr")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1476618981
	)
	@Export("z")
	int z;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -683767197
	)
	@Export("x")
	int x;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -405650921
	)
	@Export("y")
	int y;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -250017227
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 696350689
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = -6116645888661800441L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1705883383
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L;
		this.flags = 0;
	}
}
