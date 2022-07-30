import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("hl")
@Implements("BoundaryObject")
public final class BoundaryObject {
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 831610123)
	@Export("z")
	int z;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 507454547)
	@Export("x")
	int x;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -1495536097)
	@Export("y")
	int y;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = -167272539)
	@Export("orientationA")
	int orientationA;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -62535915)
	@Export("orientationB")
	int orientationB;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lgk;")
	@Export("renderable1")
	public Renderable renderable1;

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "Lgk;")
	@Export("renderable2")
	public Renderable renderable2;

	@ObfuscatedName("j")
	@ObfuscatedGetter(longValue = -7062648959881461387L)
	@Export("tag")
	public long tag = 0L;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = -582315537)
	@Export("flags")
	int flags = 0;

	BoundaryObject() {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "-1207780885")
	@Export("Widget_unpackTargetMask")
	public static int Widget_unpackTargetMask(int var0) {
		return var0 >> 11 & 63;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "([Lbk;II[I[II)V", garbageValue = "809053443")
	@Export("sortWorlds")
	static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) {
			int var5 = var1 - 1;
			int var6 = var2 + 1;
			int var7 = (var2 + var1) / 2;
			World var8 = var0[var7];
			var0[var7] = var0[var1];
			var0[var1] = var8;
			while (var5 < var6) {
				boolean var9 = true;
				int var10;
				int var11;
				int var12;
				do {
					--var6;
					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var6].index;
							var12 = var8.index;
						} else if (var3[var10] == 1) {
							var11 = var0[var6].population;
							var12 = var8.population;
							if (var11 == -1 && var4[var10] == 1) {
								var11 = 2001;
							}
							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = (var0[var6].isMembersOnly()) ? 1 : 0;
							var12 = (var8.isMembersOnly()) ? 1 : 0;
						} else {
							var11 = var0[var6].id;
							var12 = var8.id;
						}
						if (var11 != var12) {
							if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) {
								var9 = false;
							}
							break;
						}
						if (var10 == 3) {
							var9 = false;
						}
					}
				} while (var9 );
				var9 = true;
				do {
					++var5;
					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var5].index;
							var12 = var8.index;
						} else if (var3[var10] == 1) {
							var11 = var0[var5].population;
							var12 = var8.population;
							if (var11 == -1 && var4[var10] == 1) {
								var11 = 2001;
							}
							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = (var0[var5].isMembersOnly()) ? 1 : 0;
							var12 = (var8.isMembersOnly()) ? 1 : 0;
						} else {
							var11 = var0[var5].id;
							var12 = var8.id;
						}
						if (var12 != var11) {
							if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) {
								var9 = false;
							}
							break;
						}
						if (var10 == 3) {
							var9 = false;
						}
					}
				} while (var9 );
				if (var5 < var6) {
					World var13 = var0[var5];
					var0[var5] = var0[var6];
					var0[var6] = var13;
				}
			} 
			sortWorlds(var0, var1, var6, var3, var4);
			sortWorlds(var0, var6 + 1, var2, var3, var4);
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)[Lcg;", garbageValue = "1721549658")
	static class82[] method4494() {
		return new class82[]{ class82.field1065, class82.field1062, class82.field1064, class82.field1072, class82.field1069 };
	}
}