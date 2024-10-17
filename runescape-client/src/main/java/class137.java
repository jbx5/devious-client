import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
public class class137 {
	@ObfuscatedName("ap")
	boolean field1599;
	@ObfuscatedName("aw")
	boolean field1593;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	class135 field1605;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfp;"
	)
	class135 field1595;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[Lfa;"
	)
	class132[] field1596;
	@ObfuscatedName("ay")
	boolean field1597;
	@ObfuscatedName("as")
	float field1598;
	@ObfuscatedName("ae")
	float field1611;
	@ObfuscatedName("am")
	float field1600;
	@ObfuscatedName("at")
	float field1601;
	@ObfuscatedName("au")
	float field1592;
	@ObfuscatedName("an")
	float field1603;
	@ObfuscatedName("ao")
	float field1604;
	@ObfuscatedName("af")
	float field1607;
	@ObfuscatedName("ar")
	float field1606;
	@ObfuscatedName("ab")
	float field1594;
	@ObfuscatedName("az")
	boolean field1608;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -181312503
	)
	int field1609;
	@ObfuscatedName("ad")
	float[] field1610;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1792485691
	)
	int field1602;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -2046795869
	)
	int field1612;
	@ObfuscatedName("ax")
	float field1613;
	@ObfuscatedName("aq")
	float field1614;

	class137() {
		this.field1608 = true;
		this.field1609 = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvl;II)I",
		garbageValue = "1283905719"
	)
	int method3458(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort();
		int var4 = var1.readUnsignedByte();
		class146[] var5 = new class146[]{class146.field1675, class146.field1682, class146.field1674, class146.field1673, class146.field1678, class146.field1677, class146.field1672, class146.field1679, class146.field1680};
		class146 var6 = (class146)class177.findEnumerated(var5, var4);
		if (var6 == null) {
			var6 = class146.field1680;
		}

		this.field1605 = FadeOutTask.method8713(var1.readUnsignedByte());
		this.field1595 = FadeOutTask.method8713(var1.readUnsignedByte());
		this.field1599 = var1.readUnsignedByte() != 0;
		this.field1596 = new class132[var3];
		class132 var9 = null;

		for (int var8 = 0; var8 < var3; ++var8) {
			class132 var7 = new class132();
			var7.method3358(var1, var2);
			this.field1596[var8] = var7;
			if (var9 != null) {
				var9.field1539 = var7;
			}

			var9 = var7;
		}

		return var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2060306768"
	)
	void method3444() {
		this.field1602 = this.field1596[0].field1538;
		this.field1612 = this.field1596[this.method3452() - 1].field1538;
		this.field1610 = new float[this.method3448() + 1];

		for (int var1 = this.method3446(); var1 <= this.method3447(); ++var1) {
			this.field1610[var1 - this.method3446()] = Occluder.method5268(this, (float)var1);
		}

		this.field1596 = null;
		this.field1613 = Occluder.method5268(this, (float)(this.method3446() - 1));
		this.field1614 = Occluder.method5268(this, (float)(this.method3447() + 1));
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "-2075944089"
	)
	public float method3445(int var1) {
		if (var1 < this.method3446()) {
			return this.field1613;
		} else {
			return var1 > this.method3447() ? this.field1614 : this.field1610[var1 - this.method3446()];
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	int method3446() {
		return this.field1602;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1743720230"
	)
	int method3447() {
		return this.field1612;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-23598"
	)
	int method3448() {
		return this.method3447() - this.method3446();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(FI)I",
		garbageValue = "1759605146"
	)
	int method3449(float var1) {
		if (this.field1609 < 0 || (float)this.field1596[this.field1609].field1538 > var1 || this.field1596[this.field1609].field1539 != null && (float)this.field1596[this.field1609].field1539.field1538 <= var1) {
			if (var1 >= (float)this.method3446() && var1 <= (float)this.method3447()) {
				int var2 = this.method3452();
				int var3 = this.field1609;
				if (var2 > 0) {
					int var4 = 0;
					int var5 = var2 - 1;

					do {
						int var6 = var4 + var5 >> 1;
						if (var1 < (float)this.field1596[var6].field1538) {
							if (var1 > (float)this.field1596[var6 - 1].field1538) {
								var3 = var6 - 1;
								break;
							}

							var5 = var6 - 1;
						} else {
							if (var1 <= (float)this.field1596[var6].field1538) {
								var3 = var6;
								break;
							}

							if (var1 < (float)this.field1596[var6 + 1].field1538) {
								var3 = var6;
								break;
							}

							var4 = var6 + 1;
						}
					} while(var4 <= var5);
				}

				if (var3 != this.field1609) {
					this.field1609 = var3;
					this.field1608 = true;
				}

				return this.field1609;
			} else {
				return -1;
			}
		} else {
			return this.field1609;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(FI)Lfa;",
		garbageValue = "1136385562"
	)
	class132 method3463(float var1) {
		int var2 = this.method3449(var1);
		return var2 >= 0 && var2 < this.field1596.length ? this.field1596[var2] : null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2000079342"
	)
	int method3452() {
		return this.field1596 == null ? 0 : this.field1596.length;
	}
}
