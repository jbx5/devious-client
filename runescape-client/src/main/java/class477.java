import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sk")
public class class477 extends class479 {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 479610193
	)
	int field4867;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2053401073
	)
	int field4864;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1621911947
	)
	int field4865;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1883870413
	)
	int field4866;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 373417651
	)
	int field4863;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 198014367
	)
	int field4868;

	public class477(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		super(var7, var8);
		this.field4867 = 0;
		this.field4864 = 0;
		this.field4865 = 0;
		this.field4866 = 0;
		this.field4863 = 0;
		this.field4868 = 0;
		this.field4867 = var1;
		this.field4864 = var2;
		this.field4865 = var3;
		this.field4866 = var4;
		this.field4863 = var5;
		this.field4868 = var6;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "818000115"
	)
	public int vmethod8458() {
		double var1 = this.method8473();
		return (int)Math.round((double)(this.field4866 - this.field4867) * var1 + (double)this.field4867);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "363084355"
	)
	public int vmethod8459() {
		double var1 = this.method8473();
		return (int)Math.round(var1 * (double)(this.field4863 - this.field4864) + (double)this.field4864);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1706544959"
	)
	public int vmethod8460() {
		double var1 = this.method8473();
		return (int)Math.round((double)this.field4865 + (double)(this.field4868 - this.field4865) * var1);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([I[IIII)V",
		garbageValue = "-1387907364"
	)
	public static void method8446(int[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			int var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;
			int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;

			for (int var9 = var2; var9 < var3; ++var9) {
				if (var0[var9] < (var9 & var8) + var6) {
					int var10 = var0[var9];
					var0[var9] = var0[var5];
					var0[var5] = var10;
					int var11 = var1[var9];
					var1[var9] = var1[var5];
					var1[var5++] = var11;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method8446(var0, var1, var2, var5 - 1);
			method8446(var0, var1, var5 + 1, var3);
		}

	}
}
