import java.awt.FontMetrics;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
public class class137 {
	@ObfuscatedName("bx")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("ac")
	boolean field1618;
	@ObfuscatedName("ae")
	boolean field1604;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	class135 field1605;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	class135 field1606;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Lfe;"
	)
	class132[] field1607;
	@ObfuscatedName("aq")
	boolean field1603;
	@ObfuscatedName("af")
	float field1609;
	@ObfuscatedName("at")
	float field1610;
	@ObfuscatedName("au")
	float field1623;
	@ObfuscatedName("ar")
	float field1612;
	@ObfuscatedName("al")
	float field1613;
	@ObfuscatedName("ad")
	float field1614;
	@ObfuscatedName("ah")
	float field1615;
	@ObfuscatedName("ap")
	float field1616;
	@ObfuscatedName("ab")
	float field1608;
	@ObfuscatedName("az")
	float field1624;
	@ObfuscatedName("aa")
	boolean field1619;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -381938415
	)
	int field1620;
	@ObfuscatedName("ao")
	float[] field1621;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -2016018927
	)
	int field1622;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1477631925
	)
	int field1625;
	@ObfuscatedName("aj")
	float field1617;
	@ObfuscatedName("av")
	float field1626;

	class137() {
		this.field1619 = true;
		this.field1620 = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvf;II)I",
		garbageValue = "-1566665919"
	)
	int method3320(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort();
		int var4 = var1.readUnsignedByte();
		class146[] var5 = new class146[]{class146.field1690, class146.field1681, class146.field1682, class146.field1692, class146.field1684, class146.field1685, class146.field1683, class146.field1687, class146.field1688};
		class146 var6 = (class146)ArchiveDiskAction.findEnumerated(var5, var4);
		if (var6 == null) {
			var6 = class146.field1688;
		}

		int var12 = var1.readUnsignedByte();
		class135 var7 = (class135)ArchiveDiskAction.findEnumerated(class268.method5565(), var12);
		if (var7 == null) {
			var7 = class135.field1590;
		}

		this.field1605 = var7;
		int var8 = var1.readUnsignedByte();
		class135 var9 = (class135)ArchiveDiskAction.findEnumerated(class268.method5565(), var8);
		if (var9 == null) {
			var9 = class135.field1590;
		}

		this.field1606 = var9;
		this.field1618 = var1.readUnsignedByte() != 0;
		this.field1607 = new class132[var3];
		class132 var13 = null;

		for (int var10 = 0; var10 < var3; ++var10) {
			class132 var11 = new class132();
			var11.method3249(var1, var2);
			this.field1607[var10] = var11;
			if (var13 != null) {
				var13.field1560 = var11;
			}

			var13 = var11;
		}

		return var3;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-432810519"
	)
	void method3330() {
		this.field1622 = this.field1607[0].field1554;
		this.field1625 = this.field1607[this.method3328() - 1].field1554;
		this.field1621 = new float[this.method3325() + 1];

		for (int var1 = this.method3342(); var1 <= this.method3353(); ++var1) {
			this.field1621[var1 - this.method3342()] = DynamicObject.method2401(this, (float)var1);
		}

		this.field1607 = null;
		this.field1617 = DynamicObject.method2401(this, (float)(this.method3342() - 1));
		this.field1626 = DynamicObject.method2401(this, (float)(this.method3353() + 1));
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "-1617719116"
	)
	public float method3323(int var1) {
		if (var1 < this.method3342()) {
			return this.field1617;
		} else {
			return var1 > this.method3353() ? this.field1626 : this.field1621[var1 - this.method3342()];
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-926328084"
	)
	int method3342() {
		return this.field1622;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-607611015"
	)
	int method3353() {
		return this.field1625;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-768090856"
	)
	int method3325() {
		return this.method3353() - this.method3342();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(FI)I",
		garbageValue = "2075280937"
	)
	int method3326(float var1) {
		if (this.field1620 < 0 || (float)this.field1607[this.field1620].field1554 > var1 || this.field1607[this.field1620].field1560 != null && (float)this.field1607[this.field1620].field1560.field1554 <= var1) {
			if (var1 >= (float)this.method3342() && var1 <= (float)this.method3353()) {
				int var2 = this.method3328();
				int var3 = this.field1620;
				if (var2 > 0) {
					int var4 = 0;
					int var5 = var2 - 1;

					do {
						int var6 = var4 + var5 >> 1;
						if (var1 < (float)this.field1607[var6].field1554) {
							if (var1 > (float)this.field1607[var6 - 1].field1554) {
								var3 = var6 - 1;
								break;
							}

							var5 = var6 - 1;
						} else {
							if (var1 <= (float)this.field1607[var6].field1554) {
								var3 = var6;
								break;
							}

							if (var1 < (float)this.field1607[var6 + 1].field1554) {
								var3 = var6;
								break;
							}

							var4 = var6 + 1;
						}
					} while(var4 <= var5);
				}

				if (var3 != this.field1620) {
					this.field1620 = var3;
					this.field1619 = true;
				}

				return this.field1620;
			} else {
				return -1;
			}
		} else {
			return this.field1620;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(FI)Lfe;",
		garbageValue = "1777514058"
	)
	class132 method3327(float var1) {
		int var2 = this.method3326(var1);
		return var2 >= 0 && var2 < this.field1607.length ? this.field1607[var2] : null;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "108"
	)
	int method3328() {
		return this.field1607 == null ? 0 : this.field1607.length;
	}

	@ObfuscatedName("ov")
	@ObfuscatedSignature(
		descriptor = "(Lny;S)Z",
		garbageValue = "174"
	)
	static final boolean method3343(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 205) {
			Client.logoutTimer = 250;
			return true;
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) {
				var2 = (var1 - 300) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.changeAppearance(var2, var3 == 1);
			}

			if (var1 >= 314 && var1 <= 323) {
				var2 = (var1 - 314) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.method6929(var2, var3 == 1);
			}

			if (var1 == 324) {
				Client.playerAppearance.method6916(0);
			}

			if (var1 == 325) {
				Client.playerAppearance.method6916(1);
			}

			if (var1 == 326) {
				PacketBufferNode var4 = class141.getPacketBufferNode(class548.field5407 >= 224 ? ClientPacket.field3394 : ClientPacket.field3341, Client.packetWriter.isaacCipher);
				Client.playerAppearance.write(var4.packetBuffer);
				Client.packetWriter.addNode(var4);
				return true;
			} else {
				return false;
			}
		}
	}
}
