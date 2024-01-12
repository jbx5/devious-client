import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
@Implements("AABB")
public class AABB {
	@ObfuscatedName("fl")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field2907;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1926024547
	)
	@Export("xMid")
	int xMid;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -507873455
	)
	@Export("yMid")
	int yMid;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1217721029
	)
	@Export("zMid")
	int zMid;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 2003252025
	)
	@Export("xMidOffset")
	int xMidOffset;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2016643991
	)
	@Export("yMidOffset")
	int yMidOffset;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 119232111
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
