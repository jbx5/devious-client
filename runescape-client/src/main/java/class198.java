import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
public class class198 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	static final class198 field2065;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	static final class198 field2073;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	static final class198 field2063;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	static final class198 field2066;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	static final class198 field2067;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	static final class198 field2064;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	static final class198 field2069;
	@ObfuscatedName("ar")
	public static int[] field2072;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1305619521
	)
	final int field2071;

	static {
		field2065 = new class198(0);
		field2073 = new class198(1);
		field2063 = new class198(2);
		field2066 = new class198(3);
		field2067 = new class198(4);
		field2064 = new class198(5);
		field2069 = new class198(6);
		field2072 = null;
	}

	class198(int var1) {
		this.field2071 = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-56"
	)
	public static void method4025() {
		field2072 = new int[7];
		field2072[field2065.field2071] = class213.field2341.field2347;
		field2072[field2073.field2071] = class213.field2344.field2347;
		field2072[field2063.field2071] = class213.field2337.field2347;
		field2072[field2066.field2071] = class213.field2340.field2347;
		field2072[field2067.field2071] = class213.field2335.field2347;
		field2072[field2064.field2071] = class213.field2343.field2347;
		field2072[field2069.field2071] = class213.field2336.field2347;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ldd;[BIIIII)V",
		garbageValue = "-1529648638"
	)
	static final void method4027(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5) {
		int var7;
		int var8;
		if (var0.collisionMaps != null) {
			for (int var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 64; ++var7) {
					for (var8 = 0; var8 < 64; ++var8) {
						if (var7 + var2 > 0 && var7 + var2 < var0.collisionMaps[var6].flags.length && var3 + var8 > 0 && var3 + var8 < var0.collisionMaps[var6].flags[var7 + var2].length) {
							int[] var10000 = var0.collisionMaps[var6].flags[var7 + var2];
							var10000[var8 + var3] &= -1073741825;
						}
					}
				}
			}
		}

		Buffer var12 = new Buffer(var1);

		for (var7 = 0; var7 < 4; ++var7) {
			for (var8 = 0; var8 < 64; ++var8) {
				for (int var9 = 0; var9 < 64; ++var9) {
					int var10 = var8 + var2;
					int var11 = var3 + var9;
					class537.loadTerrain(var0, var12, var7, var10, var11, var10 + var4, var5 + var11, 0);
				}
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldq;",
		garbageValue = "818731681"
	)
	static class93[] method4028() {
		return new class93[]{class93.field1136, class93.field1135, class93.field1134, class93.field1133, class93.field1132, class93.field1137};
	}
}
