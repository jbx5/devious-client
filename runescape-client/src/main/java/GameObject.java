import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("GameObject")
public final class GameObject {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1027557271
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -182206681
	)
	@Export("z")
	int z;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1534899335
	)
	@Export("centerX")
	int centerX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1471596043
	)
	@Export("centerY")
	int centerY;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("renderable")
	public Renderable renderable;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -497027543
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -828213771
	)
	@Export("startX")
	int startX;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1367333585
	)
	@Export("endX")
	int endX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -893053889
	)
	@Export("startY")
	int startY;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1749368149
	)
	@Export("endY")
	int endY;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1016749909
	)
	int field2843;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1404462655
	)
	@Export("lastDrawn")
	int lastDrawn;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = -7279541089025291297L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -685372259
	)
	@Export("flags")
	int flags;

	GameObject() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)I",
		garbageValue = "37"
	)
	public static int method5072(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1);
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-982961579"
	)
	static int method5073(int var0) {
		return (int)Math.pow(2.0D, (double)((float)var0 / 256.0F + 7.0F));
	}
}
