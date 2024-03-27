import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hg")
@Implements("NpcOverrides")
public class NpcOverrides {
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 892952431
	)
	static int field2094;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = -4123509286183528355L
	)
	public long field2101;
	@ObfuscatedName("ah")
	@Export("modelIds")
	int[] modelIds;
	@ObfuscatedName("af")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("at")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("an")
	@Export("useLocalPlayer")
	public boolean useLocalPlayer;

	public NpcOverrides(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
		this.useLocalPlayer = false;
		this.field2101 = var1;
		this.modelIds = var3;
		this.recolorTo = var4;
		this.retextureTo = var5;
		this.useLocalPlayer = var6;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "1074875981"
	)
	static final int method3857(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "18"
	)
	public static int method3858(int var0) {
		return var0 >> 17 & 7;
	}

	@ObfuscatedName("ab")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L);
	}
}
