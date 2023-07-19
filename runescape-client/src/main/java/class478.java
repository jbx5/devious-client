import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sd")
public class class478 extends class480 {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1816600337
	)
	int field4865;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1220188325
	)
	int field4869;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 307662591
	)
	int field4866;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -498007277
	)
	int field4867;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1900359283
	)
	int field4868;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1437635813
	)
	int field4864;

	public class478(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		super(var7, var8);
		this.field4865 = 0;
		this.field4869 = 0;
		this.field4866 = 0;
		this.field4867 = 0;
		this.field4868 = 0;
		this.field4864 = 0;
		this.field4865 = var1;
		this.field4869 = var2;
		this.field4866 = var3;
		this.field4867 = var4;
		this.field4868 = var5;
		this.field4864 = var6;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "2587"
	)
	public int vmethod8499() {
		double var1 = this.method8504();
		return (int)Math.round((double)this.field4865 + (double)(this.field4867 - this.field4865) * var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1657628972"
	)
	public int vmethod8496() {
		double var1 = this.method8504();
		return (int)Math.round(var1 * (double)(this.field4868 - this.field4869) + (double)this.field4869);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "10605"
	)
	public int vmethod8497() {
		double var1 = this.method8504();
		return (int)Math.round(var1 * (double)(this.field4864 - this.field4866) + (double)this.field4866);
	}
}
