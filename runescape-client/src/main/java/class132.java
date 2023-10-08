import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fz")
public class class132 {
	@ObfuscatedName("ac")
	boolean field1558;
	@ObfuscatedName("al")
	boolean field1548;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	class130 field1547;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfj;"
	)
	class130 field1553;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lef;"
	)
	class127[] field1541;
	@ObfuscatedName("ah")
	boolean field1556;
	@ObfuscatedName("ar")
	float field1543;
	@ObfuscatedName("ab")
	float field1544;
	@ObfuscatedName("am")
	float field1545;
	@ObfuscatedName("av")
	float field1546;
	@ObfuscatedName("ag")
	float field1538;
	@ObfuscatedName("aa")
	float field1542;
	@ObfuscatedName("ap")
	float field1549;
	@ObfuscatedName("ay")
	float field1550;
	@ObfuscatedName("as")
	float field1551;
	@ObfuscatedName("aj")
	float field1554;
	@ObfuscatedName("an")
	boolean field1552;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 801900729
	)
	int field1539;
	@ObfuscatedName("ai")
	float[] field1555;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -742290347
	)
	int field1537;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -912700741
	)
	int field1557;
	@ObfuscatedName("aq")
	float field1540;
	@ObfuscatedName("az")
	float field1559;

	class132() {
		this.field1552 = true;
		this.field1539 = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;II)I",
		garbageValue = "-1968596819"
	)
	int method3029(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort();
		AbstractByteArrayCopier.method6759(var1.readUnsignedByte());
		int var5 = var1.readUnsignedByte();
		class130 var6 = (class130)SequenceDefinition.findEnumerated(class186.method3601(), var5);
		if (var6 == null) {
			var6 = class130.field1524;
		}

		this.field1547 = var6;
		int var7 = var1.readUnsignedByte();
		class130 var8 = (class130)SequenceDefinition.findEnumerated(class186.method3601(), var7);
		if (var8 == null) {
			var8 = class130.field1524;
		}

		this.field1553 = var8;
		this.field1558 = var1.readUnsignedByte() != 0;
		this.field1541 = new class127[var3];
		class127 var11 = null;

		for (int var9 = 0; var9 < var3; ++var9) {
			class127 var10 = new class127();
			var10.method2943(var1, var2);
			this.field1541[var9] = var10;
			if (var11 != null) {
				var11.field1493 = var10;
			}

			var11 = var10;
		}

		return var3;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "25701091"
	)
	void method3021() {
		this.field1537 = this.field1541[0].field1492;
		this.field1557 = this.field1541[this.method3017() - 1].field1492;
		this.field1555 = new float[this.method3023() + 1];

		for (int var1 = this.method3018(); var1 <= this.method3020(); ++var1) {
			this.field1555[var1 - this.method3018()] = class183.method3586(this, (float)var1);
		}

		this.field1541 = null;
		this.field1540 = class183.method3586(this, (float)(this.method3018() - 1));
		this.field1559 = class183.method3586(this, (float)(this.method3020() + 1));
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "-1862749488"
	)
	public float method3022(int var1) {
		if (var1 < this.method3018()) {
			return this.field1540;
		} else {
			return var1 > this.method3020() ? this.field1559 : this.field1555[var1 - this.method3018()];
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "103"
	)
	int method3018() {
		return this.field1537;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "115"
	)
	int method3020() {
		return this.field1557;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	int method3023() {
		return this.method3020() - this.method3018();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(FI)I",
		garbageValue = "1249933275"
	)
	int method3024(float var1) {
		if (this.field1539 < 0 || (float)this.field1541[this.field1539].field1492 > var1 || this.field1541[this.field1539].field1493 != null && (float)this.field1541[this.field1539].field1493.field1492 <= var1) {
			if (var1 >= (float)this.method3018() && var1 <= (float)this.method3020()) {
				int var2 = this.method3017();
				int var3 = this.field1539;
				if (var2 > 0) {
					int var4 = 0;
					int var5 = var2 - 1;

					do {
						int var6 = var5 + var4 >> 1;
						if (var1 < (float)this.field1541[var6].field1492) {
							if (var1 > (float)this.field1541[var6 - 1].field1492) {
								var3 = var6 - 1;
								break;
							}

							var5 = var6 - 1;
						} else {
							if (var1 <= (float)this.field1541[var6].field1492) {
								var3 = var6;
								break;
							}

							if (var1 < (float)this.field1541[var6 + 1].field1492) {
								var3 = var6;
								break;
							}

							var4 = var6 + 1;
						}
					} while(var4 <= var5);
				}

				if (var3 != this.field1539) {
					this.field1539 = var3;
					this.field1552 = true;
				}

				return this.field1539;
			} else {
				return -1;
			}
		} else {
			return this.field1539;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(FB)Lef;",
		garbageValue = "6"
	)
	class127 method3030(float var1) {
		int var2 = this.method3024(var1);
		return var2 >= 0 && var2 < this.field1541.length ? this.field1541[var2] : null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2119570978"
	)
	int method3017() {
		return this.field1541 == null ? 0 : this.field1541.length;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1742739576"
	)
	public static int method3046(int var0, int var1) {
		return (var0 << 8) + var1;
	}
}
