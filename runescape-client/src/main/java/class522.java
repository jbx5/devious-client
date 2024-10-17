import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ug")
public abstract class class522 {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -474494705
	)
	int field5229;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1529757277
	)
	int field5233;
	@ObfuscatedName("at")
	double field5231;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -345540663
	)
	int field5232;

	class522(int var1, int var2) {
		this.field5229 = 0;
		this.field5233 = 0;
		this.field5231 = 0.0D;
		this.field5232 = 0;
		this.field5229 = var1;
		this.field5233 = 0;
		this.field5232 = var2 >= 0 && var2 <= 27 ? var2 : 0;
		this.field5231 = class163.method3740(this.field5233, this.field5229, this.field5232);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "591801956"
	)
	public void method9503() {
		if (this.field5233 < this.field5229) {
			++this.field5233;
			this.field5231 = class163.method3740(this.field5233, this.field5229, this.field5232);
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "-1373898259"
	)
	double method9504() {
		return this.field5231;
	}
}
