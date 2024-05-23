import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
public class class197 extends DualNode {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("field1864")
	static EvictingDualNodeHashTable field1864;
	@ObfuscatedName("al")
	@Export("Tiles_underlays")
	static short[][][] Tiles_underlays;
	@ObfuscatedName("qf")
	@ObfuscatedSignature(
		descriptor = "[Lnb;"
	)
	static Widget[] field2010;

	static {
		field1864 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZI)V",
		garbageValue = "2142881619"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var6 = (var0 + var1) / 2;
			int var7 = var0;
			World var8 = class415.World_worlds[var6];
			class415.World_worlds[var6] = class415.World_worlds[var1];
			class415.World_worlds[var1] = var8;

			for (int var9 = var0; var9 < var1; ++var9) {
				if (class173.method3504(class415.World_worlds[var9], var8, var2, var3, var4, var5) <= 0) {
					World var10 = class415.World_worlds[var9];
					class415.World_worlds[var9] = class415.World_worlds[var7];
					class415.World_worlds[var7++] = var10;
				}
			}

			class415.World_worlds[var1] = class415.World_worlds[var7];
			class415.World_worlds[var7] = var8;
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5);
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5);
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lnb;IIII)V",
		garbageValue = "-1281338571"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3835 == null) {
			throw new RuntimeException();
		} else {
			var0.field3835[var1] = var2;
			var0.field3894[var1] = var3;
		}
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "532477484"
	)
	static int method3822(int var0, Script var1, boolean var2) {
		return 2;
	}
}
