import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ti")
public class class519 extends class521 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1818958291
	)
	int field5222;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1456569865
	)
	int field5220;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 532918097
	)
	int field5221;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -8743521
	)
	int field5219;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1355704699
	)
	int field5223;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1902395061
	)
	int field5224;

	public class519(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		super(var7, var8);
		this.field5222 = 0;
		this.field5220 = 0;
		this.field5221 = 0;
		this.field5219 = 0;
		this.field5223 = 0;
		this.field5224 = 0;
		this.field5222 = var1;
		this.field5220 = var2;
		this.field5221 = var3;
		this.field5219 = var4;
		this.field5223 = var5;
		this.field5224 = var6;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1457830566"
	)
	public int vmethod9495() {
		double var1 = this.method9504();
		return (int)Math.round((double)this.field5222 + (double)(this.field5219 - this.field5222) * var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "72"
	)
	public int vmethod9498() {
		double var1 = this.method9504();
		return (int)Math.round((double)this.field5220 + (double)(this.field5223 - this.field5220) * var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2006354984"
	)
	public int vmethod9496() {
		double var1 = this.method9504();
		return (int)Math.round((double)this.field5221 + (double)(this.field5224 - this.field5221) * var1);
	}
}
