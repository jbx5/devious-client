import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sy")
public class class478 extends class480 {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1265993553
	)
	int field4870;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1614524249
	)
	int field4871;

	public class478(int var1, int var2, int var3, int var4) {
		super(var3, var4);
		this.field4870 = 0;
		this.field4871 = 0;
		this.field4870 = var1;
		this.field4871 = var2;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-814952381"
	)
	public int method8455() {
		double var1 = this.method8473();
		return (int)Math.round((double)this.field4870 + var1 * (double)(this.field4871 - this.field4870));
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2077618476"
	)
	static void method8456(String var0) {
		Login.field953 = HorizontalAlignment.method3677(var0);
	}
}
