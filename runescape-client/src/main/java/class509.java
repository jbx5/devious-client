import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ty")
public class class509 extends class511 {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1151427827
	)
	int field5103;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -2076905609
	)
	int field5104;

	public class509(int var1, int var2, int var3, int var4) {
		super(var3, var4);
		this.field5103 = 0;
		this.field5104 = 0;
		this.field5103 = var1;
		this.field5104 = var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1510700582"
	)
	public int method9042() {
		double var1 = this.method9058();
		return (int)Math.round((double)this.field5103 + var1 * (double)(this.field5104 - this.field5103));
	}
}
