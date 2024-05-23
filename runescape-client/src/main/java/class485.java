import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sz")
public class class485 implements class490 {
	@ObfuscatedName("iv")
	@ObfuscatedGetter(
		intValue = -190120109
	)
	static int field5007;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Luv;"
	)
	public final class520 field5008;

	@ObfuscatedSignature(
		descriptor = "(Luq;)V"
	)
	class485(class521 var1) {
		this.field5008 = var1;
	}

	@ObfuscatedSignature(
		descriptor = "(Lsa;)V"
	)
	public class485(class486 var1) {
		this(new class521(var1));
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-16"
	)
	public int method8893(int var1) {
		return this.field5008.vmethod9382(var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ldt;[BIIIII)V",
		garbageValue = "-193301539"
	)
	static final void method8896(class101 var0, byte[] var1, int var2, int var3, int var4, int var5) {
		int var7;
		int var8;
		if (var0.field1332 != null) {
			for (int var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 64; ++var7) {
					for (var8 = 0; var8 < 64; ++var8) {
						if (var7 + var2 > 0 && var7 + var2 < var0.field1332[var6].flags.length && var3 + var8 > 0 && var3 + var8 < var0.field1332[var6].flags[var7 + var2].length) {
							int[] var10000 = var0.field1332[var6].flags[var7 + var2];
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
					class151.method3269(var0, var12, var7, var10, var11, var10 + var4, var5 + var11, 0);
				}
			}
		}

	}
}
