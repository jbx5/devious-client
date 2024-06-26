import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("la")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("lw")
	@ObfuscatedGetter(
		intValue = 48501363
	)
	@Export("oculusOrbFocalPointZ")
	static int oculusOrbFocalPointZ;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 813042761
	)
	@Export("z")
	int z;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -35525971
	)
	@Export("x")
	int x;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1279477689
	)
	@Export("y")
	int y;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1427307041
	)
	@Export("orientationA")
	int orientationA;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1529712313
	)
	@Export("orientationB")
	int orientationB;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = 7437302260060701101L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 696972967
	)
	@Export("flags")
	int flags;

	BoundaryObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "101"
	)
	@Export("Widget_unpackTargetMask")
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lok;IB)Lvv;",
		garbageValue = "3"
	)
	public static IndexedSprite method6014(AbstractArchive var0, int var1) {
		byte[] var3 = var0.takeFileFlat(var1);
		boolean var2;
		if (var3 == null) {
			var2 = false;
		} else {
			DefaultsGroup.SpriteBuffer_decode(var3);
			var2 = true;
		}

		return !var2 ? null : class159.method3419();
	}
}
