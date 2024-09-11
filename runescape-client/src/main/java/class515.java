import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tf")
public abstract class class515 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -698067003
	)
	int field5177;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -985757321
	)
	int field5178;
	@ObfuscatedName("ar")
	double field5179;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 96895019
	)
	int field5180;

	class515(int var1, int var2) {
		this.field5177 = 0;
		this.field5178 = 0;
		this.field5179 = 0.0D;
		this.field5180 = 0;
		this.field5177 = var1;
		this.field5178 = 0;
		this.field5180 = var2 >= 0 && var2 <= 27 ? var2 : 0;
		this.field5179 = FloorOverlayDefinition.method4312(this.field5178, this.field5177, this.field5180);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1564704352"
	)
	public void method9322() {
		if (this.field5178 < this.field5177) {
			++this.field5178;
			this.field5179 = FloorOverlayDefinition.method4312(this.field5178, this.field5177, this.field5180);
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "1017011228"
	)
	double method9323() {
		return this.field5179;
	}
}
