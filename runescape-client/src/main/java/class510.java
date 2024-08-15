import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tx")
public class class510 extends class512 {
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lqe;"
	)
	@Export("ItemDefinition_fontPlain11")
	static Font ItemDefinition_fontPlain11;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -439839279
	)
	int field5128;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 632982411
	)
	int field5126;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -365277085
	)
	int field5127;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 2139804679
	)
	int field5132;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1887724733
	)
	int field5130;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1228102925
	)
	int field5129;

	public class510(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		super(var7, var8);
		this.field5128 = 0;
		this.field5126 = 0;
		this.field5127 = 0;
		this.field5132 = 0;
		this.field5130 = 0;
		this.field5129 = 0;
		this.field5128 = var1;
		this.field5126 = var2;
		this.field5127 = var3;
		this.field5132 = var4;
		this.field5130 = var5;
		this.field5129 = var6;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "232112566"
	)
	public int vmethod9031() {
		double var1 = this.method9044();
		return (int)Math.round(var1 * (double)(this.field5132 - this.field5128) + (double)this.field5128);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "78"
	)
	public int vmethod9035() {
		double var1 = this.method9044();
		return (int)Math.round(var1 * (double)(this.field5130 - this.field5126) + (double)this.field5126);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2134013300"
	)
	public int vmethod9033() {
		double var1 = this.method9044();
		return (int)Math.round((double)this.field5127 + var1 * (double)(this.field5129 - this.field5127));
	}
}
