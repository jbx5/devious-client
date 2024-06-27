import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tt")
public class class510 extends class512 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1565062035
	)
	int field5134;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1298917515
	)
	int field5135;

	public class510(int var1, int var2, int var3, int var4) {
		super(var3, var4);
		this.field5134 = 0;
		this.field5135 = 0;
		this.field5134 = var1;
		this.field5135 = var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-368810206"
	)
	public int method8959() {
		double var1 = this.method8971();
		return (int)Math.round((double)this.field5134 + var1 * (double)(this.field5135 - this.field5134));
	}
}
