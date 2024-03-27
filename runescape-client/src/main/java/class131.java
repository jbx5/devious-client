import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
public class class131 {
	@ObfuscatedName("az")
	boolean field1558;
	@ObfuscatedName("ah")
	boolean field1559;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	class129 field1573;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	class129 field1561;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Leg;"
	)
	class126[] field1562;
	@ObfuscatedName("ao")
	boolean field1563;
	@ObfuscatedName("ab")
	float field1560;
	@ObfuscatedName("aw")
	float field1565;
	@ObfuscatedName("ad")
	float field1581;
	@ObfuscatedName("al")
	float field1580;
	@ObfuscatedName("as")
	float field1564;
	@ObfuscatedName("ag")
	float field1569;
	@ObfuscatedName("ai")
	float field1577;
	@ObfuscatedName("ax")
	float field1571;
	@ObfuscatedName("ar")
	float field1572;
	@ObfuscatedName("aj")
	float field1570;
	@ObfuscatedName("au")
	boolean field1574;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 744600689
	)
	int field1575;
	@ObfuscatedName("ap")
	float[] field1576;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1552902251
	)
	int field1579;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1360708771
	)
	int field1578;
	@ObfuscatedName("aq")
	float field1567;
	@ObfuscatedName("am")
	float field1568;

	class131() {
		this.field1574 = true;
		this.field1575 = 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;IB)I",
		garbageValue = "0"
	)
	int method3017(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort();
		class135.method3074(var1.readUnsignedByte());
		int var5 = var1.readUnsignedByte();
		class129 var6 = (class129)KitDefinition.findEnumerated(class60.method1135(), var5);
		if (var6 == null) {
			var6 = class129.field1548;
		}

		this.field1573 = var6;
		int var7 = var1.readUnsignedByte();
		class129 var8 = (class129)KitDefinition.findEnumerated(class60.method1135(), var7);
		if (var8 == null) {
			var8 = class129.field1548;
		}

		this.field1561 = var8;
		this.field1558 = var1.readUnsignedByte() != 0;
		this.field1562 = new class126[var3];
		class126 var11 = null;

		for (int var9 = 0; var9 < var3; ++var9) {
			class126 var10 = new class126();
			var10.method2945(var1, var2);
			this.field1562[var9] = var10;
			if (var11 != null) {
				var11.field1515 = var10;
			}

			var11 = var10;
		}

		return var3;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "582132918"
	)
	void method3018() {
		this.field1579 = this.field1562[0].field1512;
		this.field1578 = this.field1562[this.method3020() - 1].field1512;
		this.field1576 = new float[this.method3022() + 1];

		for (int var1 = this.method3033(); var1 <= this.method3016(); ++var1) {
			this.field1576[var1 - this.method3033()] = class406.method7449(this, (float)var1);
		}

		this.field1562 = null;
		this.field1567 = class406.method7449(this, (float)(this.method3033() - 1));
		this.field1568 = class406.method7449(this, (float)(this.method3016() + 1));
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "33410223"
	)
	public float method3025(int var1) {
		if (var1 < this.method3033()) {
			return this.field1567;
		} else {
			return var1 > this.method3016() ? this.field1568 : this.field1576[var1 - this.method3033()];
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-49258900"
	)
	int method3033() {
		return this.field1579;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "4"
	)
	int method3016() {
		return this.field1578;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1004983097"
	)
	int method3022() {
		return this.method3016() - this.method3033();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(FB)I",
		garbageValue = "14"
	)
	int method3036(float var1) {
		if (this.field1575 < 0 || (float)this.field1562[this.field1575].field1512 > var1 || this.field1562[this.field1575].field1515 != null && (float)this.field1562[this.field1575].field1515.field1512 <= var1) {
			if (var1 >= (float)this.method3033() && var1 <= (float)this.method3016()) {
				int var2 = this.method3020();
				int var3 = this.field1575;
				if (var2 > 0) {
					int var4 = 0;
					int var5 = var2 - 1;

					do {
						int var6 = var4 + var5 >> 1;
						if (var1 < (float)this.field1562[var6].field1512) {
							if (var1 > (float)this.field1562[var6 - 1].field1512) {
								var3 = var6 - 1;
								break;
							}

							var5 = var6 - 1;
						} else {
							if (var1 <= (float)this.field1562[var6].field1512) {
								var3 = var6;
								break;
							}

							if (var1 < (float)this.field1562[var6 + 1].field1512) {
								var3 = var6;
								break;
							}

							var4 = var6 + 1;
						}
					} while(var4 <= var5);
				}

				if (var3 != this.field1575) {
					this.field1575 = var3;
					this.field1574 = true;
				}

				return this.field1575;
			} else {
				return -1;
			}
		} else {
			return this.field1575;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(FB)Leg;",
		garbageValue = "1"
	)
	class126 method3035(float var1) {
		int var2 = this.method3036(var1);
		return var2 >= 0 && var2 < this.field1562.length ? this.field1562[var2] : null;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "34"
	)
	int method3020() {
		return this.field1562 == null ? 0 : this.field1562.length;
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "(I)Lps;",
		garbageValue = "-2118995919"
	)
	public static NodeDeque method3048() {
		return Client.scriptEvents;
	}
}
