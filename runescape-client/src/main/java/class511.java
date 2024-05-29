import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("te")
public abstract class class511 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 568884467
	)
	int field5111;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -2130128105
	)
	int field5109;
	@ObfuscatedName("ao")
	double field5107;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -492825881
	)
	int field5110;

	class511(int var1, int var2) {
		this.field5111 = 0;
		this.field5109 = 0;
		this.field5107 = 0.0D;
		this.field5110 = 0;
		this.field5111 = var1;
		this.field5109 = 0;
		this.field5110 = var2 >= 0 && var2 <= 27 ? var2 : 0;
		this.field5107 = class76.method2119(this.field5109, this.field5111, this.field5110);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1380617509"
	)
	public void method9057() {
		if (this.field5109 < this.field5111) {
			++this.field5109;
			this.field5107 = class76.method2119(this.field5109, this.field5111, this.field5110);
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "632414568"
	)
	double method9058() {
		return this.field5107;
	}
}
