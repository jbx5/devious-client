import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nn")
public final class class388 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lnn;"
	)
	static class388[] field4429;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -842987581
	)
	static int field4430;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1861704181
	)
	static int field4434;
	@ObfuscatedName("n")
	float field4432;
	@ObfuscatedName("k")
	float field4433;
	@ObfuscatedName("s")
	float field4431;
	@ObfuscatedName("q")
	float field4435;

	static {
		field4429 = new class388[0]; // L: 4
		Skeleton.method4247(100); // L: 9
		new class388();
	} // L: 14

	class388() {
		this.method7157(); // L: 44
	} // L: 45

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-814630220"
	)
	public void method7143() {
		synchronized(field4429) { // L: 38
			if (field4434 < field4430 - 1) { // L: 39
				field4429[++field4434 - 1] = this;
			}

		}
	} // L: 41

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "-1516201827"
	)
	void method7141(float var1, float var2, float var3, float var4) {
		this.field4432 = var1; // L: 48
		this.field4433 = var2; // L: 49
		this.field4431 = var3; // L: 50
		this.field4435 = var4; // L: 51
	} // L: 52

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(FFFFB)V",
		garbageValue = "2"
	)
	public void method7144(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(var4 * 0.5F)); // L: 55
		float var6 = (float)Math.cos((double)(0.5F * var4)); // L: 56
		this.field4432 = var1 * var5; // L: 57
		this.field4433 = var2 * var5; // L: 58
		this.field4431 = var3 * var5; // L: 59
		this.field4435 = var6; // L: 60
	} // L: 61

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2126804452"
	)
	final void method7157() {
		this.field4431 = 0.0F; // L: 64
		this.field4433 = 0.0F; // L: 65
		this.field4432 = 0.0F; // L: 66
		this.field4435 = 1.0F; // L: 67
	} // L: 68

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lnn;B)V",
		garbageValue = "65"
	)
	public final void method7163(class388 var1) {
		this.method7141(var1.field4433 * this.field4431 + var1.field4435 * this.field4432 + var1.field4432 * this.field4435 - this.field4433 * var1.field4431, this.field4435 * var1.field4433 + (this.field4433 * var1.field4435 - this.field4431 * var1.field4432) + var1.field4431 * this.field4432, var1.field4432 * this.field4433 + var1.field4435 * this.field4431 - this.field4432 * var1.field4433 + var1.field4431 * this.field4435, var1.field4435 * this.field4435 - this.field4432 * var1.field4432 - this.field4433 * var1.field4433 - this.field4431 * var1.field4431); // L: 71
	} // L: 72

	public boolean equals(Object var1) {
		if (!(var1 instanceof class388)) { // L: 76
			return false; // L: 80
		} else {
			class388 var2 = (class388)var1; // L: 77
			return this.field4432 == var2.field4432 && var2.field4433 == this.field4433 && var2.field4431 == this.field4431 && this.field4435 == var2.field4435; // L: 78
		}
	}

	public int hashCode() {
		boolean var1 = true; // L: 85
		float var2 = 1.0F; // L: 86
		var2 = this.field4432 + 31.0F * var2; // L: 87
		var2 = this.field4433 + var2 * 31.0F; // L: 88
		var2 = this.field4431 + var2 * 31.0F; // L: 89
		var2 = this.field4435 + 31.0F * var2;
		return (int)var2; // L: 91
	}

	public String toString() {
		return this.field4432 + "," + this.field4433 + "," + this.field4431 + "," + this.field4435; // L: 96
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Ldt;",
		garbageValue = "-1154602557"
	)
	static class120 method7152(int var0) {
		class120[] var1 = new class120[]{class120.field1498, class120.field1486, class120.field1492, class120.field1488, class120.field1489, class120.field1487, class120.field1491, class120.field1501, class120.field1490, class120.field1494, class120.field1495, class120.field1496, class120.field1497, class120.field1503, class120.field1499, class120.field1500, class120.field1493}; // L: 90
		class120 var2 = (class120)Varps.findEnumerated(var1, var0); // L: 92
		if (var2 == null) { // L: 93
			var2 = class120.field1498;
		}

		return var2; // L: 94
	}
}
