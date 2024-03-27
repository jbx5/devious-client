import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("th")
public class class497 extends class499 {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -137122063
	)
	int field5001;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1150962037
	)
	int field4999;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -100609877
	)
	int field5000;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1409035683
	)
	int field4998;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1094571569
	)
	int field5002;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 924137701
	)
	int field5003;

	public class497(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		super(var7, var8);
		this.field5001 = 0;
		this.field4999 = 0;
		this.field5000 = 0;
		this.field4998 = 0;
		this.field5002 = 0;
		this.field5003 = 0;
		this.field5001 = var1;
		this.field4999 = var2;
		this.field5000 = var3;
		this.field4998 = var4;
		this.field5002 = var5;
		this.field5003 = var6;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "126"
	)
	public int vmethod8668() {
		double var1 = this.method8680();
		return (int)Math.round((double)this.field5001 + var1 * (double)(this.field4998 - this.field5001));
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "72"
	)
	public int vmethod8669() {
		double var1 = this.method8680();
		return (int)Math.round((double)(this.field5002 - this.field4999) * var1 + (double)this.field4999);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-723802647"
	)
	public int vmethod8674() {
		double var1 = this.method8680();
		return (int)Math.round((double)(this.field5003 - this.field5000) * var1 + (double)this.field5000);
	}
}
