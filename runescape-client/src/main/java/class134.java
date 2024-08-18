import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
public class class134 {
	@ObfuscatedName("ab")
	boolean field1578;
	@ObfuscatedName("ay")
	boolean field1573;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	class132 field1559;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	class132 field1560;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Leg;"
	)
	class129[] field1561;
	@ObfuscatedName("ao")
	boolean field1562;
	@ObfuscatedName("am")
	float field1563;
	@ObfuscatedName("ac")
	float field1558;
	@ObfuscatedName("ae")
	float field1571;
	@ObfuscatedName("ad")
	float field1557;
	@ObfuscatedName("aq")
	float field1567;
	@ObfuscatedName("al")
	float field1568;
	@ObfuscatedName("aj")
	float field1574;
	@ObfuscatedName("as")
	float field1570;
	@ObfuscatedName("aw")
	float field1564;
	@ObfuscatedName("af")
	float field1572;
	@ObfuscatedName("aa")
	boolean field1569;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -900530175
	)
	int field1566;
	@ObfuscatedName("ag")
	float[] field1575;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1579416293
	)
	int field1576;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1057147743
	)
	int field1577;
	@ObfuscatedName("ap")
	float field1565;
	@ObfuscatedName("ak")
	float field1579;

	class134() {
		this.field1569 = true;
		this.field1566 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvg;II)I",
		garbageValue = "-557722334"
	)
	int method3216(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort();
		NpcOverrides.method4909(var1.readUnsignedByte());
		this.field1559 = class27.method397(var1.readUnsignedByte());
		this.field1560 = class27.method397(var1.readUnsignedByte());
		this.field1578 = var1.readUnsignedByte() != 0;
		this.field1561 = new class129[var3];
		class129 var4 = null;

		for (int var5 = 0; var5 < var3; ++var5) {
			class129 var6 = new class129();
			var6.method3111(var1, var2);
			this.field1561[var5] = var6;
			if (var4 != null) {
				var4.field1500 = var6;
			}

			var4 = var6;
		}

		return var3;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-574257784"
	)
	void method3187() {
		this.field1576 = this.field1561[0].field1507;
		this.field1577 = this.field1561[this.method3194() - 1].field1507;
		this.field1575 = new float[this.method3191() + 1];

		for (int var1 = this.method3202(); var1 <= this.method3185(); ++var1) {
			this.field1575[var1 - this.method3202()] = HttpRequest.method98(this, (float)var1);
		}

		this.field1561 = null;
		this.field1565 = HttpRequest.method98(this, (float)(this.method3202() - 1));
		this.field1579 = HttpRequest.method98(this, (float)(this.method3185() + 1));
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IS)F",
		garbageValue = "22282"
	)
	public float method3188(int var1) {
		if (var1 < this.method3202()) {
			return this.field1565;
		} else {
			return var1 > this.method3185() ? this.field1579 : this.field1575[var1 - this.method3202()];
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1617418693"
	)
	int method3202() {
		return this.field1576;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1878061295"
	)
	int method3185() {
		return this.field1577;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "868293450"
	)
	int method3191() {
		return this.method3185() - this.method3202();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(FI)I",
		garbageValue = "-116809371"
	)
	int method3192(float var1) {
		if (this.field1566 < 0 || (float)this.field1561[this.field1566].field1507 > var1 || this.field1561[this.field1566].field1500 != null && (float)this.field1561[this.field1566].field1500.field1507 <= var1) {
			if (var1 >= (float)this.method3202() && var1 <= (float)this.method3185()) {
				int var2 = this.method3194();
				int var3 = this.field1566;
				if (var2 > 0) {
					int var4 = 0;
					int var5 = var2 - 1;

					do {
						int var6 = var4 + var5 >> 1;
						if (var1 < (float)this.field1561[var6].field1507) {
							if (var1 > (float)this.field1561[var6 - 1].field1507) {
								var3 = var6 - 1;
								break;
							}

							var5 = var6 - 1;
						} else {
							if (var1 <= (float)this.field1561[var6].field1507) {
								var3 = var6;
								break;
							}

							if (var1 < (float)this.field1561[var6 + 1].field1507) {
								var3 = var6;
								break;
							}

							var4 = var6 + 1;
						}
					} while(var4 <= var5);
				}

				if (var3 != this.field1566) {
					this.field1566 = var3;
					this.field1569 = true;
				}

				return this.field1566;
			} else {
				return -1;
			}
		} else {
			return this.field1566;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(FI)Leg;",
		garbageValue = "396038905"
	)
	class129 method3201(float var1) {
		int var2 = this.method3192(var1);
		return var2 >= 0 && var2 < this.field1561.length ? this.field1561[var2] : null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-520829770"
	)
	int method3194() {
		return this.field1561 == null ? 0 : this.field1561.length;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([Lpy;II)Lpy;",
		garbageValue = "810185530"
	)
	@Export("findEnumerated")
	public static Enum findEnumerated(Enum[] var0, int var1) {
		Enum[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Enum var4 = var2[var3];
			if (var1 == var4.rsOrdinal()) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lob;I)V",
		garbageValue = "1470285074"
	)
	public static void method3219(AbstractArchive var0) {
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1108992397"
	)
	static final String method3220(int var0) {
		if (var0 < 100000) {
			return "<col=ffff00>" + var0 + "</col>";
		} else {
			return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>";
		}
	}

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "([Lnq;IIIZI)V",
		garbageValue = "-1548067768"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) {
			Widget var6 = var0[var5];
			if (var6 != null && var6.parentId == var1) {
				class299.alignWidgetSize(var6, var2, var3, var4);
				KeyHandler.alignWidgetPosition(var6, var2, var3);
				if (var6.scrollX > var6.scrollWidth - var6.width) {
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) {
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) {
					var6.scrollY = var6.scrollHeight - var6.height;
				}

				if (var6.scrollY < 0) {
					var6.scrollY = 0;
				}

				if (var6.type == 0) {
					class165.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	}
}
