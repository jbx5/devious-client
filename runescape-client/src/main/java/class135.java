import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fd")
public class class135 {
	@ObfuscatedName("vm")
	@ObfuscatedSignature(
		descriptor = "Lci;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("aq")
	boolean field1575;
	@ObfuscatedName("ad")
	boolean field1576;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	class133 field1580;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	class133 field1583;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lff;"
	)
	class130[] field1579;
	@ObfuscatedName("an")
	boolean field1594;
	@ObfuscatedName("aj")
	float field1592;
	@ObfuscatedName("av")
	float field1591;
	@ObfuscatedName("ab")
	float field1581;
	@ObfuscatedName("ai")
	float field1590;
	@ObfuscatedName("ae")
	float field1585;
	@ObfuscatedName("au")
	float field1586;
	@ObfuscatedName("ah")
	float field1587;
	@ObfuscatedName("az")
	float field1588;
	@ObfuscatedName("ax")
	float field1589;
	@ObfuscatedName("ac")
	float field1582;
	@ObfuscatedName("al")
	boolean field1578;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1309993249
	)
	int field1577;
	@ObfuscatedName("ao")
	float[] field1593;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1857339093
	)
	int field1584;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -988948789
	)
	int field1595;
	@ObfuscatedName("aw")
	float field1596;
	@ObfuscatedName("at")
	float field1597;

	class135() {
		this.field1578 = true;
		this.field1577 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvp;II)I",
		garbageValue = "1218892832"
	)
	int method3135(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort();
		PlayerCompositionColorTextureOverride.method3537(var1.readUnsignedByte());
		this.field1580 = SoundCache.method887(var1.readUnsignedByte());
		this.field1583 = SoundCache.method887(var1.readUnsignedByte());
		this.field1575 = var1.readUnsignedByte() != 0;
		this.field1579 = new class130[var3];
		class130 var4 = null;

		for (int var5 = 0; var5 < var3; ++var5) {
			class130 var6 = new class130();
			var6.method3052(var1, var2);
			this.field1579[var5] = var6;
			if (var4 != null) {
				var4.field1532 = var6;
			}

			var4 = var6;
		}

		return var3;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2096276357"
	)
	void method3139() {
		this.field1584 = this.field1579[0].field1526;
		this.field1595 = this.field1579[this.method3150() - 1].field1526;
		this.field1593 = new float[this.method3153() + 1];

		for (int var1 = this.method3138(); var1 <= this.method3134(); ++var1) {
			this.field1593[var1 - this.method3138()] = AuthenticationScheme.method3050(this, (float)var1);
		}

		this.field1579 = null;
		this.field1596 = AuthenticationScheme.method3050(this, (float)(this.method3138() - 1));
		this.field1597 = AuthenticationScheme.method3050(this, (float)(this.method3134() + 1));
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "239145230"
	)
	public float method3137(int var1) {
		if (var1 < this.method3138()) {
			return this.field1596;
		} else {
			return var1 > this.method3134() ? this.field1597 : this.field1593[var1 - this.method3138()];
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-587543936"
	)
	int method3138() {
		return this.field1584;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "960225045"
	)
	int method3134() {
		return this.field1595;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "52"
	)
	int method3153() {
		return this.method3134() - this.method3138();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(FI)I",
		garbageValue = "-1777719385"
	)
	int method3140(float var1) {
		if (this.field1577 < 0 || (float)this.field1579[this.field1577].field1526 > var1 || this.field1579[this.field1577].field1532 != null && (float)this.field1579[this.field1577].field1532.field1526 <= var1) {
			if (var1 >= (float)this.method3138() && var1 <= (float)this.method3134()) {
				int var2 = this.method3150();
				int var3 = this.field1577;
				if (var2 > 0) {
					int var4 = 0;
					int var5 = var2 - 1;

					do {
						int var6 = var5 + var4 >> 1;
						if (var1 < (float)this.field1579[var6].field1526) {
							if (var1 > (float)this.field1579[var6 - 1].field1526) {
								var3 = var6 - 1;
								break;
							}

							var5 = var6 - 1;
						} else {
							if (var1 <= (float)this.field1579[var6].field1526) {
								var3 = var6;
								break;
							}

							if (var1 < (float)this.field1579[var6 + 1].field1526) {
								var3 = var6;
								break;
							}

							var4 = var6 + 1;
						}
					} while(var4 <= var5);
				}

				if (var3 != this.field1577) {
					this.field1577 = var3;
					this.field1578 = true;
				}

				return this.field1577;
			} else {
				return -1;
			}
		} else {
			return this.field1577;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(FI)Lff;",
		garbageValue = "-721484232"
	)
	class130 method3159(float var1) {
		int var2 = this.method3140(var1);
		return var2 >= 0 && var2 < this.field1579.length ? this.field1579[var2] : null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "100"
	)
	int method3150() {
		return this.field1579 == null ? 0 : this.field1579.length;
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "54"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close();
		PendingSpawn.clear();
		class511.topLevelWorldView.clear();
		Client.field740.method4349();
		System.gc();
		class137.method3187(0, 0);
		WorldMapIcon_1.method4578();
		Client.playingJingle = false;
		class60.method1172();
		ClanChannelMember.updateGameState(10);
		Client.serverCycle = 0;
		class433.method8077().method4247();
		class433.method8077().method4248();
	}
}
