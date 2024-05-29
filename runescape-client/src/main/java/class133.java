import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
public class class133 {
	@ObfuscatedName("fx")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	static Archive field1602;
	@ObfuscatedName("ak")
	boolean field1586;
	@ObfuscatedName("al")
	boolean field1579;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	class131 field1600;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	class131 field1581;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[Leo;"
	)
	class128[] field1582;
	@ObfuscatedName("aa")
	boolean field1583;
	@ObfuscatedName("at")
	float field1584;
	@ObfuscatedName("ab")
	float field1585;
	@ObfuscatedName("ac")
	float field1596;
	@ObfuscatedName("ao")
	float field1587;
	@ObfuscatedName("ah")
	float field1601;
	@ObfuscatedName("av")
	float field1589;
	@ObfuscatedName("aq")
	float field1590;
	@ObfuscatedName("ap")
	float field1591;
	@ObfuscatedName("ae")
	float field1592;
	@ObfuscatedName("ax")
	float field1578;
	@ObfuscatedName("ay")
	boolean field1594;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -273377871
	)
	int field1593;
	@ObfuscatedName("as")
	float[] field1580;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -32107801
	)
	int field1597;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 375556369
	)
	int field1598;
	@ObfuscatedName("ai")
	float field1599;
	@ObfuscatedName("an")
	float field1595;

	class133() {
		this.field1594 = true;
		this.field1593 = 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lua;II)I",
		garbageValue = "-1218566178"
	)
	int method3097(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort();
		int var4 = var1.readUnsignedByte();
		class142 var5 = (class142)MenuAction.findEnumerated(NPC.method2725(), var4);
		if (var5 == null) {
			var5 = class142.field1657;
		}

		this.field1600 = BuddyRankComparator.method3011(var1.readUnsignedByte());
		this.field1581 = BuddyRankComparator.method3011(var1.readUnsignedByte());
		this.field1586 = var1.readUnsignedByte() != 0;
		this.field1582 = new class128[var3];
		class128 var8 = null;

		for (int var6 = 0; var6 < var3; ++var6) {
			class128 var7 = new class128();
			var7.method3023(var1, var2);
			this.field1582[var6] = var7;
			if (var8 != null) {
				var8.field1537 = var7;
			}

			var8 = var7;
		}

		return var3;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2026297561"
	)
	void method3091() {
		this.field1597 = this.field1582[0].field1534;
		this.field1598 = this.field1582[this.method3085() - 1].field1534;
		this.field1580 = new float[this.method3082() + 1];

		for (int var1 = this.method3080(); var1 <= this.method3081(); ++var1) {
			this.field1580[var1 - this.method3080()] = ModelData0.method5452(this, (float)var1);
		}

		this.field1582 = null;
		this.field1599 = ModelData0.method5452(this, (float)(this.method3080() - 1));
		this.field1595 = ModelData0.method5452(this, (float)(this.method3081() + 1));
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "-938950866"
	)
	public float method3079(int var1) {
		if (var1 < this.method3080()) {
			return this.field1599;
		} else {
			return var1 > this.method3081() ? this.field1595 : this.field1580[var1 - this.method3080()];
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1339018594"
	)
	int method3080() {
		return this.field1597;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "189"
	)
	int method3081() {
		return this.field1598;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1068751769"
	)
	int method3082() {
		return this.method3081() - this.method3080();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(FB)I",
		garbageValue = "19"
	)
	int method3098(float var1) {
		if (this.field1593 < 0 || (float)this.field1582[this.field1593].field1534 > var1 || this.field1582[this.field1593].field1537 != null && (float)this.field1582[this.field1593].field1537.field1534 <= var1) {
			if (var1 >= (float)this.method3080() && var1 <= (float)this.method3081()) {
				int var2 = this.method3085();
				int var3 = this.field1593;
				if (var2 > 0) {
					int var4 = 0;
					int var5 = var2 - 1;

					do {
						int var6 = var4 + var5 >> 1;
						if (var1 < (float)this.field1582[var6].field1534) {
							if (var1 > (float)this.field1582[var6 - 1].field1534) {
								var3 = var6 - 1;
								break;
							}

							var5 = var6 - 1;
						} else {
							if (var1 <= (float)this.field1582[var6].field1534) {
								var3 = var6;
								break;
							}

							if (var1 < (float)this.field1582[var6 + 1].field1534) {
								var3 = var6;
								break;
							}

							var4 = var6 + 1;
						}
					} while(var4 <= var5);
				}

				if (var3 != this.field1593) {
					this.field1593 = var3;
					this.field1594 = true;
				}

				return this.field1593;
			} else {
				return -1;
			}
		} else {
			return this.field1593;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(FI)Leo;",
		garbageValue = "-1559897641"
	)
	class128 method3096(float var1) {
		int var2 = this.method3098(var1);
		return var2 >= 0 && var2 < this.field1582.length ? this.field1582[var2] : null;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-114"
	)
	int method3085() {
		return this.field1582 == null ? 0 : this.field1582.length;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "444853038"
	)
	public static int method3101(int var0) {
		return var0 >>> 4 & class539.field5293;
	}
}
