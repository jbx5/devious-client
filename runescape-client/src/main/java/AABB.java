import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ip")
@Implements("AABB")
public class AABB {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1104288701
	)
	@Export("xMid")
	int xMid;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1180301801
	)
	@Export("yMid")
	int yMid;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -742951477
	)
	@Export("zMid")
	int zMid;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1274816969
	)
	@Export("xMidOffset")
	int xMidOffset;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -848919819
	)
	@Export("yMidOffset")
	int yMidOffset;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -623625245
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
