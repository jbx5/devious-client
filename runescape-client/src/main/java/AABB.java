import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
@Implements("AABB")
public class AABB {
	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	static Archive field2658;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1398982731
	)
	@Export("xMid")
	int xMid;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 583230925
	)
	@Export("yMid")
	int yMid;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1122805789
	)
	@Export("zMid")
	int zMid;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1670821269
	)
	@Export("xMidOffset")
	int xMidOffset;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1521768023
	)
	@Export("yMidOffset")
	int yMidOffset;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1443189283
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
