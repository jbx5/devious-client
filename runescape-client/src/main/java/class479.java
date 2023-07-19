import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ss")
public class class479 extends class481 {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 515837457
	)
	int field4870;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1926180899
	)
	int field4871;

	public class479(int var1, int var2, int var3, int var4) {
		super(var3, var4);
		this.field4870 = 0;
		this.field4871 = 0;
		this.field4870 = var1;
		this.field4871 = var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-84"
	)
	public int method8493() {
		double var1 = this.method8504();
		return (int)Math.round(var1 * (double)(this.field4871 - this.field4870) + (double)this.field4870);
	}
}
