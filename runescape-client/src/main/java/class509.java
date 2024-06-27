import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ts")
public class class509 extends class511 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1074800777
	)
	int field5131;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1493674541
	)
	int field5129;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 161810591
	)
	int field5128;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 176892205
	)
	int field5130;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1385835369
	)
	int field5132;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1343005253
	)
	int field5133;

	public class509(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		super(var7, var8);
		this.field5131 = 0;
		this.field5129 = 0;
		this.field5128 = 0;
		this.field5130 = 0;
		this.field5132 = 0;
		this.field5133 = 0;
		this.field5131 = var1;
		this.field5129 = var2;
		this.field5128 = var3;
		this.field5130 = var4;
		this.field5132 = var5;
		this.field5133 = var6;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2083196394"
	)
	public int vmethod8962() {
		double var1 = this.method8971();
		return (int)Math.round(var1 * (double)(this.field5130 - this.field5131) + (double)this.field5131);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "599491827"
	)
	public int vmethod8963() {
		double var1 = this.method8971();
		return (int)Math.round((double)this.field5129 + var1 * (double)(this.field5132 - this.field5129));
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1194956978"
	)
	public int vmethod8964() {
		double var1 = this.method8971();
		return (int)Math.round((double)(this.field5133 - this.field5128) * var1 + (double)this.field5128);
	}
}
