import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sg")
public class class493 extends class495 {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 336480751
	)
	int field4942;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -308468125
	)
	int field4940;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -740799699
	)
	int field4943;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 456857885
	)
	int field4939;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1272622989
	)
	int field4941;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -2056643627
	)
	int field4944;

	public class493(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		super(var7, var8);
		this.field4942 = 0;
		this.field4940 = 0;
		this.field4943 = 0;
		this.field4939 = 0;
		this.field4941 = 0;
		this.field4944 = 0;
		this.field4942 = var1;
		this.field4940 = var2;
		this.field4943 = var3;
		this.field4939 = var4;
		this.field4941 = var5;
		this.field4944 = var6;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1318162338"
	)
	public int vmethod8819() {
		double var1 = this.method8828();
		return (int)Math.round(var1 * (double)(this.field4939 - this.field4942) + (double)this.field4942);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-19"
	)
	public int vmethod8820() {
		double var1 = this.method8828();
		return (int)Math.round(var1 * (double)(this.field4941 - this.field4940) + (double)this.field4940);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-12"
	)
	public int vmethod8814() {
		double var1 = this.method8828();
		return (int)Math.round((double)(this.field4944 - this.field4943) * var1 + (double)this.field4943);
	}
}
