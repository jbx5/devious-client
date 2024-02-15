import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tp")
public abstract class class499 {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 531678303
	)
	int field4981;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1713945335
	)
	int field4980;
	@ObfuscatedName("au")
	double field4979;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1186043735
	)
	int field4982;

	class499(int var1, int var2) {
		this.field4981 = 0;
		this.field4980 = 0;
		this.field4979 = 0.0D;
		this.field4982 = 0;
		this.field4981 = var1;
		this.field4980 = 0;
		this.field4982 = var2 >= 0 && var2 <= 27 ? var2 : 0;
		this.field4979 = class328.method6345(this.field4980, this.field4981, this.field4982);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-13291"
	)
	public void method8882() {
		if (this.field4980 < this.field4981) {
			++this.field4980;
			this.field4979 = class328.method6345(this.field4980, this.field4981, this.field4982);
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "-623438626"
	)
	double method8876() {
		return this.field4979;
	}
}
