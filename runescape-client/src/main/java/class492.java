import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("so")
public abstract class class492 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -866448335
	)
	int field4915;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1489920287
	)
	int field4914;
	@ObfuscatedName("az")
	double field4913;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -18135297
	)
	int field4916;

	class492(int var1, int var2) {
		this.field4915 = 0;
		this.field4914 = 0;
		this.field4913 = 0.0D;
		this.field4916 = 0;
		this.field4915 = var1;
		this.field4914 = 0;
		this.field4916 = var2 >= 0 && var2 <= 27 ? var2 : 0;
		this.field4913 = PlayerType.method6883(this.field4914, this.field4915, this.field4916);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1511635495"
	)
	public void method8684() {
		if (this.field4914 < this.field4915) {
			++this.field4914;
			this.field4913 = PlayerType.method6883(this.field4914, this.field4915, this.field4916);
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)D",
		garbageValue = "-60"
	)
	double method8685() {
		return this.field4913;
	}
}
