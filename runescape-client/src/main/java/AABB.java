import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ka")
@Implements("AABB")
public class AABB {
	@ObfuscatedName("ji")
	static int[] field3014;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 2047755405
	)
	@Export("xMid")
	int xMid;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1256249609
	)
	@Export("yMid")
	int yMid;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -738662181
	)
	@Export("zMid")
	int zMid;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -462676723
	)
	@Export("xMidOffset")
	int xMidOffset;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 942113713
	)
	@Export("yMidOffset")
	int yMidOffset;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1574879219
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
