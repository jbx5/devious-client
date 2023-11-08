import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ku")
@Implements("AABB")
public class AABB {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 517586271
	)
	@Export("xMid")
	int xMid;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1569437235
	)
	@Export("yMid")
	int yMid;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1260146143
	)
	@Export("zMid")
	int zMid;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1759108515
	)
	@Export("xMidOffset")
	int xMidOffset;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1093118037
	)
	@Export("yMidOffset")
	int yMidOffset;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1310847177
	)
	@Export("zMidOffset")
	int zMidOffset;

	AABB(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.xMid = var1;
		this.yMid = var2;
		this.zMid = var3;
		this.xMidOffset = var4;
		this.yMidOffset = var5;
		this.zMidOffset = var6;
	}
}
