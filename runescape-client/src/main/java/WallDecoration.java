import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("Widget_fontsArchive")
	public static AbstractArchive Widget_fontsArchive;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1446438165
	)
	@Export("z")
	int z;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2017840623
	)
	@Export("x")
	int x;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 448727349
	)
	@Export("y")
	int y;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 844723307
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -757999873
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 621012193
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -830283377
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = 3448042175855343097L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1288984241
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "63"
	)
	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var2 = (VarbitComposition)VarbitComposition.VarbitDefinition_cached.get((long)var0);
		VarbitComposition var1;
		if (var2 != null) {
			var1 = var2;
		} else {
			byte[] var3 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
			var2 = new VarbitComposition();
			if (var3 != null) {
				var2.decode(new Buffer(var3));
			}

			VarbitComposition.VarbitDefinition_cached.put(var2, (long)var0);
			var1 = var2;
		}

		int var7 = var1.baseVar;
		int var4 = var1.startBit;
		int var5 = var1.endBit;
		int var6 = Varps.Varps_masks[var5 - var4];
		return Varps.Varps_main[var7] >> var4 & var6;
	}
}
