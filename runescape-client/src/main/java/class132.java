import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
public class class132 {
	@ObfuscatedName("aq")
	boolean field1565;
	@ObfuscatedName("aw")
	boolean field1555;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	class130 field1557;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	class130 field1574;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[Leo;"
	)
	class127[] field1559;
	@ObfuscatedName("as")
	boolean field1560;
	@ObfuscatedName("aa")
	float field1561;
	@ObfuscatedName("az")
	float field1556;
	@ObfuscatedName("ao")
	float field1563;
	@ObfuscatedName("au")
	float field1564;
	@ObfuscatedName("ak")
	float field1562;
	@ObfuscatedName("ah")
	float field1566;
	@ObfuscatedName("aj")
	float field1567;
	@ObfuscatedName("af")
	float field1569;
	@ObfuscatedName("ax")
	float field1573;
	@ObfuscatedName("an")
	float field1570;
	@ObfuscatedName("ag")
	boolean field1571;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -493396629
	)
	int field1572;
	@ObfuscatedName("ad")
	float[] field1558;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 643966185
	)
	int field1568;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -232735027
	)
	int field1575;
	@ObfuscatedName("ae")
	float field1576;
	@ObfuscatedName("ac")
	float field1577;

	class132() {
		this.field1571 = true;
		this.field1572 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;IB)I",
		garbageValue = "-26"
	)
	int method3099(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort();
		class218.method4258(var1.readUnsignedByte());
		int var5 = var1.readUnsignedByte();
		class130 var6 = (class130)class356.findEnumerated(class328.method6344(), var5);
		if (var6 == null) {
			var6 = class130.field1548;
		}

		this.field1557 = var6;
		int var7 = var1.readUnsignedByte();
		class130 var8 = (class130)class356.findEnumerated(class328.method6344(), var7);
		if (var8 == null) {
			var8 = class130.field1548;
		}

		this.field1574 = var8;
		this.field1565 = var1.readUnsignedByte() != 0;
		this.field1559 = new class127[var3];
		class127 var11 = null;

		for (int var9 = 0; var9 < var3; ++var9) {
			class127 var10 = new class127();
			var10.method2994(var1, var2);
			this.field1559[var9] = var10;
			if (var11 != null) {
				var11.field1505 = var10;
			}

			var11 = var10;
		}

		return var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "46"
	)
	void method3100() {
		this.field1568 = this.field1559[0].field1501;
		this.field1575 = this.field1559[this.method3091() - 1].field1501;
		this.field1558 = new float[this.method3084() + 1];

		for (int var1 = this.method3086(); var1 <= this.method3101(); ++var1) {
			this.field1558[var1 - this.method3086()] = Tile.method5276(this, (float)var1);
		}

		this.field1559 = null;
		this.field1576 = Tile.method5276(this, (float)(this.method3086() - 1));
		this.field1577 = Tile.method5276(this, (float)(this.method3101() + 1));
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "848750842"
	)
	public float method3085(int var1) {
		if (var1 < this.method3086()) {
			return this.field1576;
		} else {
			return var1 > this.method3101() ? this.field1577 : this.field1558[var1 - this.method3086()];
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-125"
	)
	int method3086() {
		return this.field1568;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1086345403"
	)
	int method3101() {
		return this.field1575;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2017937444"
	)
	int method3084() {
		return this.method3101() - this.method3086();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(FI)I",
		garbageValue = "-1790231226"
	)
	int method3089(float var1) {
		if (this.field1572 < 0 || (float)this.field1559[this.field1572].field1501 > var1 || this.field1559[this.field1572].field1505 != null && (float)this.field1559[this.field1572].field1505.field1501 <= var1) {
			if (var1 >= (float)this.method3086() && var1 <= (float)this.method3101()) {
				int var2 = this.method3091();
				int var3 = this.field1572;
				if (var2 > 0) {
					int var4 = 0;
					int var5 = var2 - 1;

					do {
						int var6 = var4 + var5 >> 1;
						if (var1 < (float)this.field1559[var6].field1501) {
							if (var1 > (float)this.field1559[var6 - 1].field1501) {
								var3 = var6 - 1;
								break;
							}

							var5 = var6 - 1;
						} else {
							if (var1 <= (float)this.field1559[var6].field1501) {
								var3 = var6;
								break;
							}

							if (var1 < (float)this.field1559[var6 + 1].field1501) {
								var3 = var6;
								break;
							}

							var4 = var6 + 1;
						}
					} while(var4 <= var5);
				}

				if (var3 != this.field1572) {
					this.field1572 = var3;
					this.field1571 = true;
				}

				return this.field1572;
			} else {
				return -1;
			}
		} else {
			return this.field1572;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(FI)Leo;",
		garbageValue = "1624046263"
	)
	class127 method3090(float var1) {
		int var2 = this.method3089(var1);
		return var2 >= 0 && var2 < this.field1559.length ? this.field1559[var2] : null;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "12"
	)
	int method3091() {
		return this.field1559 == null ? 0 : this.field1559.length;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "306288239"
	)
	public static void method3109() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
	}
}
