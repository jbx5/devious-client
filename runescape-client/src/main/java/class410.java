import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("px")
public class class410 {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1474112745
	)
	int field4533;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 279928273
	)
	int field4534;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1391112247
	)
	int field4535;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -287439239
	)
	int field4536;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 177575975
	)
	int field4524;
	@ObfuscatedName("ab")
	boolean field4538;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	AbstractFont field4529;
	@ObfuscatedName("ai")
	ArrayList field4540;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1680495705
	)
	int field4541;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1299057227
	)
	int field4528;

	public class410() {
		this.field4533 = Integer.MAX_VALUE;
		this.field4534 = Integer.MAX_VALUE;
		this.field4535 = 0;
		this.field4536 = 0;
		this.field4524 = 0;
		this.field4538 = true;
		this.field4540 = new ArrayList();
		this.field4541 = 0;
		this.field4528 = 0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)Lpc;",
		garbageValue = "37"
	)
	public class412 method7603(int var1) {
		return (class412)this.field4540.get(var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Lpc;",
		garbageValue = "65"
	)
	class412 method7604() {
		return this.field4540.size() == 0 ? null : (class412)this.field4540.get(this.field4540.size() - 1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1670700416"
	)
	public boolean method7605() {
		return this.field4540.size() == 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	boolean method7718() {
		return this.field4534 > 1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "37"
	)
	public int method7701() {
		return this.field4540.size();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "404384418"
	)
	public String method7608() {
		if (this.method7605()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7701());

			for (int var2 = 0; var2 < this.method7701(); ++var2) {
				class412 var3 = this.method7603(var2);
				var1.append(var3.field4545);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1806466912"
	)
	public void method7609(int var1) {
		if (this.field4529 != null && var1 < this.field4529.ascent * 2) {
			var1 = Integer.MAX_VALUE;
		}

		if (this.field4533 != var1) {
			this.field4533 = var1;
			this.method7650();
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-100"
	)
	public void method7606(int var1) {
		if (this.field4534 != var1) {
			this.field4534 = var1;
			this.method7650();
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1334958848"
	)
	public void method7611(int var1) {
		if (this.field4528 != var1) {
			this.field4528 = var1;
			this.method7650();
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lpw;I)V",
		garbageValue = "1098246793"
	)
	public void method7610(AbstractFont var1) {
		if (var1 != this.field4529) {
			this.field4529 = var1;
			if (this.field4529 != null) {
				if (this.field4524 == 0) {
					this.field4524 = this.field4529.ascent;
				}

				if (!this.method7605()) {
					this.method7650();
				}
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1042043941"
	)
	public void method7674(int var1) {
		if (this.field4541 != var1) {
			this.field4541 = var1;
			this.method7650();
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-581964094"
	)
	public boolean method7634(int var1, int var2) {
		if (this.field4535 != var1 || var2 != this.field4536) {
			this.field4535 = var1;
			this.field4536 = var2;
			this.method7650();
		}

		return true;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "32"
	)
	public void method7735(int var1) {
		if (this.field4524 != var1) {
			this.field4524 = var1;
			this.method7650();
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lpo;",
		garbageValue = "57"
	)
	public class414 method7616(int var1, int var2) {
		if (var2 == var1) {
			return new class414(this, 0, 0);
		} else if (var1 <= this.field4540.size() && var2 <= this.field4540.size()) {
			return var2 < var1 ? new class414(this, var2, var1) : new class414(this, var1, var2);
		} else {
			return new class414(this, 0, 0);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(CIII)Lpi;",
		garbageValue = "120272136"
	)
	public class411 method7620(char var1, int var2, int var3) {
		return this.method7618(Character.toString(var1), var2, var3);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;III)Lpi;",
		garbageValue = "39755345"
	)
	public class411 method7618(String var1, int var2, int var3) {
		if (var3 == 0) {
			var3 = Integer.MAX_VALUE;
		}

		int var4 = var2;
		if (this.field4540.size() >= var3) {
			this.method7638(var2, var2);
			return new class411(var2, true);
		} else {
			this.field4540.ensureCapacity(this.field4540.size() + var1.length());

			for (int var5 = 0; var5 < var1.length() && this.field4540.size() < var3; ++var5) {
				class412 var6 = new class412();
				var6.field4545 = var1.charAt(var5);
				this.field4540.add(var4, var6);
				++var4;
			}

			this.method7638(var2, var4);
			if (this.field4534 != 0 && this.method7629() > this.field4534) {
				while (var4 != var2) {
					--var4;
					this.method7622(var4);
					if (this.method7629() <= this.field4534) {
						break;
					}
				}

				return new class411(var4, true);
			} else {
				return new class411(var4, false);
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)Lpi;",
		garbageValue = "-119"
	)
	class411 method7703(String var1, int var2) {
		return this.method7618(var1, this.field4540.size(), var2);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lpi;",
		garbageValue = "-802396749"
	)
	public class411 method7635(String var1) {
		this.method7621();
		return this.method7703(var1, 0);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1332297375"
	)
	void method7621() {
		this.field4540.clear();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-473590389"
	)
	public int method7622(int var1) {
		return this.method7646(var1, var1 + 1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1185034139"
	)
	public int method7646(int var1, int var2) {
		int var3;
		if (var2 < var1) {
			var3 = var2;
			var2 = var1;
			var1 = var3;
		}

		this.field4540.subList(var1, var2).clear();
		var3 = var1;
		if (this.method7718() && this.field4541 == 1) {
			while (var3 > 0) {
				--var3;
				char var4 = ((class412)this.field4540.get(var3)).field4545;
				if (var4 == ' ' || var4 == '\t') {
					break;
				}
			}
		}

		this.method7638(var3, var2);
		return var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "25"
	)
	public int method7624(int var1, int var2) {
		if (this.field4529 == null) {
			return 0;
		} else if (this.method7718() && var1 > this.field4533) {
			return this.field4540.size();
		} else {
			if (!this.field4540.isEmpty()) {
				for (int var3 = 0; var3 < this.field4540.size(); ++var3) {
					class412 var4 = (class412)this.field4540.get(var3);
					if (var2 <= var4.field4546 + this.method7628()) {
						if (var2 < var4.field4546) {
							break;
						}

						if (var1 < var4.field4544) {
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (1 + var3 != this.field4540.size() && ((class412)this.field4540.get(var3 + 1)).field4546 != var4.field4546) {
							int var5 = this.method7640((class412)this.field4540.get(var3), false);
							if (var1 < var5 + var4.field4544) {
								return var3;
							}

							if (var2 <= var4.field4546 + this.method7628()) {
								return var3 + 1;
							}
						}
					}
				}

				class412 var6 = (class412)this.field4540.get(this.field4540.size() - 1);
				if (var1 >= var6.field4544 && var1 <= var6.field4544 + this.method7658() && var2 >= var6.field4546 && var2 <= var6.field4546 + this.method7628()) {
					return this.field4540.size() - 1;
				}
			}

			return this.field4540.size();
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1413550972"
	)
	public int method7734(int var1, int var2) {
		if (this.field4529 != null && !this.method7605() && var1 <= this.field4540.size()) {
			byte var3;
			if (var2 > 0) {
				var3 = 1;
			} else {
				var3 = -1;
				var2 = -var2;
			}

			int var4 = 0;
			int var5 = 0;
			if (var1 > 0) {
				class412 var6 = (class412)this.field4540.get(var1 - 1);
				var4 = var6.field4544 + this.method7693(var1 - 1);
				var5 = var6.field4546;
			} else if (var3 == -1 && var1 == 0) {
				return 0;
			}

			int var14 = 16777215;
			int var7 = 0;
			int var8 = var1;
			int var9 = 16777215;
			int var10 = var3 == 1 ? this.field4540.size() + 1 : 0;

			for (int var11 = var3 + var1; var10 != var11; var11 += var3) {
				class412 var12 = (class412)this.field4540.get(var11 - 1);
				if (var5 != var12.field4546) {
					++var7;
					var5 = var12.field4546;
					if (var7 > var2) {
						return var8;
					}
				}

				if (var7 == var2) {
					int var13 = Math.abs(var12.field4544 + this.method7693(var11 - 1) - var4);
					if (var13 >= var9) {
						return var8;
					}

					var8 = var11;
					var9 = var13;
				}
			}

			if (var3 == 1) {
				return this.field4540.size();
			} else {
				if (var5 != 0) {
					++var7;
				}

				return var9 == 16777215 || var7 == var2 && var4 < var9 ? 0 : var8;
			}
		} else {
			return 0;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1266876120"
	)
	public int method7626() {
		if (!this.field4540.isEmpty() && this.method7629() == 1) {
			return this.field4540.isEmpty() ? 0 : ((class412)this.field4540.get(this.field4540.size() - 1)).field4544 + this.method7658();
		} else {
			int var1 = -1;
			int var2 = 0;

			for (int var3 = this.field4540.size() - 1; var3 >= 0; --var3) {
				class412 var4 = (class412)this.field4540.get(var3);
				if (var1 != var4.field4546) {
					int var5 = this.method7640(var4, false) + var4.field4544;
					var2 = Math.max(var5, var2);
					var1 = var4.field4546;
				}
			}

			return var2;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-15823"
	)
	public int method7725() {
		return this.method7605() ? 0 : this.field4529.ascent + ((class412)this.field4540.get(this.field4540.size() - 1)).field4546;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1584925586"
	)
	public int method7628() {
		return this.field4524;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2094790441"
	)
	public int method7629() {
		return this.method7725() / this.field4529.ascent;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "466444559"
	)
	int method7658() {
		return this.method7605() ? 0 : this.method7640((class412)this.field4540.get(this.field4540.size() - 1), false);
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "11"
	)
	public int method7631() {
		return this.field4533;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2053078791"
	)
	public int method7632() {
		return this.field4534;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "770454930"
	)
	public int method7633() {
		return this.field4541;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1064852684"
	)
	public int method7699() {
		return this.field4528;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-19"
	)
	public int method7623(int var1) {
		switch(this.field4535) {
		case 0:
			return 0;
		case 1:
			return var1 / 2;
		case 2:
			return var1;
		default:
			return 0;
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1272661550"
	)
	public int method7636(int var1) {
		switch(this.field4536) {
		case 0:
			return 0;
		case 1:
			return var1 / 2;
		case 2:
			return var1;
		default:
			return 0;
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "601733397"
	)
	void method7650() {
		this.method7638(0, this.field4540.size());
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-274568040"
	)
	void method7638(int var1, int var2) {
		if (!this.method7605() && this.field4529 != null) {
			class501 var3 = this.method7683(var1, var2);
			boolean var4 = (Integer)var3.field5041 == 0 && (Integer)var3.field5042 == this.field4540.size();
			int var5 = (Integer)var3.field5041;
			int var6 = 0;
			int var7 = var4 ? 0 : ((class412)this.field4540.get((Integer)var3.field5041)).field4546;
			int var8 = 0;

			int var9;
			for (var9 = (Integer)var3.field5041; var9 <= (Integer)var3.field5042; ++var9) {
				boolean var10 = var9 >= this.field4540.size();
				class412 var21 = (class412)this.field4540.get(!var10 ? var9 : this.field4540.size() - 1);
				int var22 = !var10 ? this.method7640(var21, false) : 0;
				boolean var13 = !var10 && var21.field4545 == '\n';
				boolean var14 = !var10 && this.method7718() && var22 + var6 > this.field4533;
				if (var13 || var14 || var10) {
					int var15 = var9;
					int var16 = 0;
					int var17;
					int var18;
					class412 var19;
					if (var14) {
						var17 = 0;
						if (this.field4541 == 1) {
							for (var18 = var9; var18 > var5; --var18) {
								var19 = (class412)this.field4540.get(var18);
								var17 += var18 < var15 ? this.method7640(var19, false) : 0;
								if (var19.field4545 == ' ' || var19.field4545 == '\n') {
									var15 = var18;
									var6 -= var17;
									var16 = var17;
									break;
								}
							}
						}
					}

					var17 = -this.method7623(var6);

					for (var18 = var5; var18 < var15; ++var18) {
						var19 = (class412)this.field4540.get(var18);
						int var20 = this.method7640(var19, false);
						var19.field4544 = var17;
						var19.field4546 = var7;
						var17 += var20;
					}

					var5 = var15;
					var6 = var16;
					var7 += this.method7628();
					++var8;
				}

				var6 += !var10 ? var22 : 0;
			}

			if (this.field4536 != 0 && var4) {
				var9 = var8 * this.method7628();
				int var23 = this.method7636(var9);

				for (int var11 = 0; var11 < this.field4540.size(); ++var11) {
					class412 var12 = (class412)this.field4540.get(var11);
					var12.field4546 -= var23;
				}
			}

		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "250951846"
	)
	int method7693(int var1) {
		return var1 < this.field4540.size() ? this.method7640((class412)this.field4540.get(var1), false) : 0;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lpc;ZB)I",
		garbageValue = "-14"
	)
	int method7640(class412 var1, boolean var2) {
		if (var1.field4545 == '\n') {
			return 0;
		} else if (this.field4528 == 0) {
			int var3 = this.field4529.advances[var1.field4545];
			if (var3 == 0) {
				return var1.field4545 == '\t' ? this.field4529.advances[32] * 3 : this.field4529.advances[32];
			} else {
				return var3;
			}
		} else {
			return this.field4529.advances[42];
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(III)Ltg;",
		garbageValue = "-1753222514"
	)
	class501 method7683(int var1, int var2) {
		int var3 = Math.min(var1, var2);
		int var4 = Math.max(var1, var2);
		int var5 = this.field4540.size();
		if (var3 == 0 && var4 == var5) {
			return new class501(0, var5);
		} else {
			int var6 = this.method7642(var3, false);
			int var7 = this.method7602(var4, false);
			int var8;
			switch(this.field4536) {
			case 0:
				if (this.field4535 == 0) {
					return new class501(var6, var5);
				}

				var8 = this.method7642(var3, true);
				return new class501(var8, var5);
			case 1:
				return new class501(0, var5);
			case 2:
				if (this.field4535 == 2) {
					return new class501(0, var7);
				}

				var8 = this.method7602(var4, true);
				return new class501(0, var8);
			default:
				return new class501(0, var5);
			}
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IZB)I",
		garbageValue = "120"
	)
	int method7642(int var1, boolean var2) {
		if (var1 < this.field4540.size()) {
			int var3 = ((class412)this.field4540.get(var1)).field4546;

			for (int var4 = var1; var4 > 0; --var4) {
				if (((class412)this.field4540.get(var4 - 1)).field4546 < var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class412)this.field4540.get(var4 - 1)).field4546;
				}
			}
		}

		return 0;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-520047140"
	)
	int method7602(int var1, boolean var2) {
		if (var1 < this.field4540.size()) {
			int var3 = ((class412)this.field4540.get(var1)).field4546;

			for (int var4 = var1; var4 < this.field4540.size() - 1; ++var4) {
				if (((class412)this.field4540.get(var4 + 1)).field4546 > var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class412)this.field4540.get(var4 + 1)).field4546;
				}
			}
		}

		return this.field4540.size();
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "63"
	)
	static final void method7742() {
		Client.field621 = 0;
		int var0 = HealthBarDefinition.baseX * 64 + (KeyHandler.localPlayer.x >> 7);
		int var1 = WorldMapScaleHandler.baseY * 64 + (KeyHandler.localPlayer.y >> 7);
		if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
			Client.field621 = 1;
		}

		if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
			Client.field621 = 1;
		}

		if (Client.field621 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
			Client.field621 = 0;
		}

	}
}
