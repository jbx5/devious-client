import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kh")
public class class266 extends Node {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1534421177
	)
	public int field2912;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -274591305
	)
	public int field2913;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1122311063
	)
	public int field2914;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	public Widget field2915;

	@ObfuscatedSignature(
		descriptor = "(IIILnq;)V"
	)
	public class266(int var1, int var2, int var3, Widget var4) {
		this.field2914 = var1;
		this.field2912 = var2;
		this.field2913 = var3;
		this.field2915 = var4;
	}

	@ObfuscatedName("le")
	@ObfuscatedSignature(
		descriptor = "(Lvw;B)V",
		garbageValue = "-89"
	)
	static final void method5348(class567 var0) {
		boolean var1 = false;

		while (!var1) {
			var1 = true;

			for (int var2 = 0; var2 < var0.field5518 - 1; ++var2) {
				if (var0.field5521[var2] < 1000 && var0.field5521[var2 + 1] > 1000) {
					String var3 = var0.field5522[var2];
					var0.field5522[var2] = var0.field5522[var2 + 1];
					var0.field5522[var2 + 1] = var3;
					String var4 = var0.field5525[var2];
					var0.field5525[var2] = var0.field5525[var2 + 1];
					var0.field5525[var2 + 1] = var4;
					class567 var5 = var0.field5526[var2];
					var0.field5526[var2] = var0.field5526[var2 + 1];
					var0.field5526[var2 + 1] = var5;
					int var6 = var0.field5521[var2];
					var0.field5521[var2] = var0.field5521[var2 + 1];
					var0.field5521[var2 + 1] = var6;
					var6 = var0.field5517[var2];
					var0.field5517[var2] = var0.field5517[var2 + 1];
					var0.field5517[var2 + 1] = var6;
					var6 = var0.field5520[var2];
					var0.field5520[var2] = var0.field5520[var2 + 1];
					var0.field5520[var2 + 1] = var6;
					var6 = var0.field5519[var2];
					var0.field5519[var2] = var0.field5519[var2 + 1];
					var0.field5519[var2 + 1] = var6;
					var6 = var0.field5523[var2];
					var0.field5523[var2] = var0.field5523[var2 + 1];
					var0.field5523[var2 + 1] = var6;
					var6 = var0.field5527[var2];
					var0.field5527[var2] = var0.field5527[var2 + 1];
					var0.field5527[var2 + 1] = var6;
					boolean var7 = var0.field5528[var2];
					var0.field5528[var2] = var0.field5528[var2 + 1];
					var0.field5528[var2 + 1] = var7;
					var1 = false;
				}
			}
		}

	}
}
