import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("td")
public class class512 extends class514 {
	@ObfuscatedName("af")
	static int[][] field5171;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1711043277
	)
	int field5174;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -991811559
	)
	int field5173;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -123236479
	)
	int field5170;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1697348155
	)
	int field5169;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1286258365
	)
	int field5172;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1833082827
	)
	int field5168;

	public class512(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		super(var7, var8);
		this.field5174 = 0;
		this.field5173 = 0;
		this.field5170 = 0;
		this.field5169 = 0;
		this.field5172 = 0;
		this.field5168 = 0;
		this.field5174 = var1;
		this.field5173 = var2;
		this.field5170 = var3;
		this.field5169 = var4;
		this.field5172 = var5;
		this.field5168 = var6;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "220008079"
	)
	public int vmethod9311() {
		double var1 = this.method9323();
		return (int)Math.round(var1 * (double)(this.field5169 - this.field5174) + (double)this.field5174);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "77"
	)
	public int vmethod9314() {
		double var1 = this.method9323();
		return (int)Math.round((double)(this.field5172 - this.field5173) * var1 + (double)this.field5173);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "33"
	)
	public int vmethod9313() {
		double var1 = this.method9323();
		return (int)Math.round((double)this.field5170 + (double)(this.field5168 - this.field5170) * var1);
	}
}
