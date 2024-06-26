import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lu")
@Implements("WallDecoration")
public final class WallDecoration {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1179187821
	)
	@Export("z")
	int z;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1356321823
	)
	@Export("x")
	int x;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 2051646557
	)
	@Export("y")
	int y;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -598645379
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1519899315
	)
	@Export("orientation2")
	int orientation2;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 871683133
	)
	@Export("xOffset")
	int xOffset;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1574211657
	)
	@Export("yOffset")
	int yOffset;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("renderable1")
	public Renderable renderable1;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("renderable2")
	public Renderable renderable2;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = -6295974171581436599L
	)
	@Export("tag")
	public long tag;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1567816115
	)
	@Export("flags")
	int flags;

	WallDecoration() {
		this.tag = 0L;
		this.flags = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)[Loi;",
		garbageValue = "136735128"
	)
	static GameBuild[] method6029() {
		return new GameBuild[]{GameBuild.WIP, GameBuild.RC, GameBuild.BUILDLIVE, GameBuild.LIVE};
	}
}
