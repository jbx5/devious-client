import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tf")
public abstract class class496 {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1027722541
	)
	int field4952;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -655717521
	)
	int field4949;
	@ObfuscatedName("aa")
	double field4951;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -893308173
	)
	int field4950;

	class496(int var1, int var2) {
		this.field4952 = 0;
		this.field4949 = 0;
		this.field4951 = 0.0D;
		this.field4950 = 0;
		this.field4952 = var1;
		this.field4949 = 0;
		this.field4950 = var2 >= 0 && var2 <= 27 ? var2 : 0;
		this.field4951 = class209.method4207(this.field4949, this.field4952, this.field4950);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	public void method8831() {
		if (this.field4949 < this.field4952) {
			++this.field4949;
			this.field4951 = class209.method4207(this.field4949, this.field4952, this.field4950);
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "-38619419"
	)
	double method8828() {
		return this.field4951;
	}
}
