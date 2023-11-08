import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pv")
public class class406 {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -109936177
	)
	int field4494;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -447744753
	)
	int field4503;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1365167301
	)
	int field4497;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1111353095
	)
	int field4500;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1955205547
	)
	int field4498;
	@ObfuscatedName("aw")
	boolean field4499;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpa;"
	)
	AbstractFont field4489;
	@ObfuscatedName("an")
	ArrayList field4501;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1384749697
	)
	int field4502;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 162079711
	)
	int field4505;

	public class406() {
		this.field4494 = Integer.MAX_VALUE;
		this.field4503 = Integer.MAX_VALUE;
		this.field4497 = 0;
		this.field4500 = 0;
		this.field4498 = 0;
		this.field4499 = true;
		this.field4501 = new ArrayList();
		this.field4502 = 0;
		this.field4505 = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lpn;",
		garbageValue = "-1648887293"
	)
	public class408 method7552(int var1) {
		return (class408)this.field4501.get(var1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lpn;",
		garbageValue = "-1618780366"
	)
	class408 method7572() {
		return this.field4501.size() == 0 ? null : (class408)this.field4501.get(this.field4501.size() - 1);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2001561937"
	)
	public boolean method7520() {
		return this.field4501.size() == 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-607330455"
	)
	boolean method7521() {
		return this.field4503 > 1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-917985217"
	)
	public int method7522() {
		return this.field4501.size();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1548157009"
	)
	public String method7523() {
		if (this.method7520()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7522());

			for (int var2 = 0; var2 < this.method7522(); ++var2) {
				class408 var3 = this.method7552(var2);
				var1.append(var3.field4509);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1319008258"
	)
	public void method7524(int var1) {
		if (this.field4489 != null && var1 < this.field4489.ascent * 2) {
			var1 = Integer.MAX_VALUE;
		}

		if (this.field4494 != var1) {
			this.field4494 = var1;
			this.method7543();
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1206229207"
	)
	public void method7525(int var1) {
		if (this.field4503 != var1) {
			this.field4503 = var1;
			this.method7543();
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2046388223"
	)
	public void method7526(int var1) {
		if (this.field4505 != var1) {
			this.field4505 = var1;
			this.method7543();
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lpa;B)V",
		garbageValue = "83"
	)
	public void method7527(AbstractFont var1) {
		if (var1 != this.field4489) {
			this.field4489 = var1;
			if (this.field4489 != null) {
				if (this.field4498 == 0) {
					this.field4498 = this.field4489.ascent;
				}

				if (!this.method7520()) {
					this.method7543();
				}
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1301835621"
	)
	public void method7625(int var1) {
		if (this.field4502 != var1) {
			this.field4502 = var1;
			this.method7543();
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "203029050"
	)
	public boolean method7529(int var1, int var2) {
		if (this.field4497 != var1 || var2 != this.field4500) {
			this.field4497 = var1;
			this.field4500 = var2;
			this.method7543();
		}

		return true;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-36"
	)
	public void method7530(int var1) {
		if (this.field4498 != var1) {
			this.field4498 = var1;
			this.method7543();
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lpd;",
		garbageValue = "-125"
	)
	public class410 method7531(int var1, int var2) {
		if (var2 == var1) {
			return new class410(this, 0, 0);
		} else if (var1 <= this.field4501.size() && var2 <= this.field4501.size()) {
			return var2 < var1 ? new class410(this, var2, var1) : new class410(this, var1, var2);
		} else {
			return new class410(this, 0, 0);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(CIIB)Lpx;",
		garbageValue = "51"
	)
	public class407 method7631(char var1, int var2, int var3) {
		return this.method7533(Character.toString(var1), var2, var3);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;III)Lpx;",
		garbageValue = "1271891096"
	)
	public class407 method7533(String var1, int var2, int var3) {
		if (var3 == 0) {
			var3 = Integer.MAX_VALUE;
		}

		int var4 = var2;
		if (this.field4501.size() >= var3) {
			this.method7594(var2, var2);
			return new class407(var2, true);
		} else {
			this.field4501.ensureCapacity(this.field4501.size() + var1.length());

			for (int var5 = 0; var5 < var1.length() && this.field4501.size() < var3; ++var5) {
				class408 var6 = new class408();
				var6.field4509 = var1.charAt(var5);
				this.field4501.add(var4, var6);
				++var4;
			}

			this.method7594(var2, var4);
			if (this.field4503 != 0 && this.method7544() > this.field4503) {
				while (var4 != var2) {
					--var4;
					this.method7569(var4);
					if (this.method7544() <= this.field4503) {
						break;
					}
				}

				return new class407(var4, true);
			} else {
				return new class407(var4, false);
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)Lpx;",
		garbageValue = "-98"
	)
	class407 method7534(String var1, int var2) {
		return this.method7533(var1, this.field4501.size(), var2);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Lpx;",
		garbageValue = "-83"
	)
	public class407 method7535(String var1) {
		this.method7536();
		return this.method7534(var1, 0);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "95"
	)
	void method7536() {
		this.field4501.clear();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-620955221"
	)
	public int method7569(int var1) {
		return this.method7538(var1, var1 + 1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "58"
	)
	public int method7538(int var1, int var2) {
		int var3;
		if (var2 < var1) {
			var3 = var2;
			var2 = var1;
			var1 = var3;
		}

		this.field4501.subList(var1, var2).clear();
		var3 = var1;
		if (this.method7521() && this.field4502 == 1) {
			while (var3 > 0) {
				--var3;
				char var4 = ((class408)this.field4501.get(var3)).field4509;
				if (var4 == ' ' || var4 == '\t') {
					break;
				}
			}
		}

		this.method7594(var3, var2);
		return var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-769092328"
	)
	public int method7539(int var1, int var2) {
		if (this.field4489 == null) {
			return 0;
		} else if (this.method7521() && var1 > this.field4494) {
			return this.field4501.size();
		} else {
			if (!this.field4501.isEmpty()) {
				for (int var3 = 0; var3 < this.field4501.size(); ++var3) {
					class408 var4 = (class408)this.field4501.get(var3);
					if (var2 <= var4.field4507 + this.method7614()) {
						if (var2 < var4.field4507) {
							break;
						}

						if (var1 < var4.field4508) {
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (1 + var3 != this.field4501.size() && ((class408)this.field4501.get(1 + var3)).field4507 != var4.field4507) {
							int var5 = this.method7555((class408)this.field4501.get(var3), false);
							if (var1 < var5 + var4.field4508) {
								return var3;
							}

							if (var2 <= var4.field4507 + this.method7614()) {
								return var3 + 1;
							}
						}
					}
				}

				class408 var6 = (class408)this.field4501.get(this.field4501.size() - 1);
				if (var1 >= var6.field4508 && var1 <= var6.field4508 + this.method7545() && var2 >= var6.field4507 && var2 <= var6.field4507 + this.method7614()) {
					return this.field4501.size() - 1;
				}
			}

			return this.field4501.size();
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "795729934"
	)
	public int method7540(int var1, int var2) {
		if (this.field4489 != null && !this.method7520() && var1 <= this.field4501.size()) {
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
				class408 var6 = (class408)this.field4501.get(var1 - 1);
				var4 = var6.field4508 + this.method7610(var1 - 1);
				var5 = var6.field4507;
			} else if (var3 == -1 && var1 == 0) {
				return 0;
			}

			int var14 = 16777215;
			int var7 = 0;
			int var8 = var1;
			int var9 = 16777215;
			int var10 = var3 == 1 ? this.field4501.size() + 1 : 0;

			for (int var11 = var3 + var1; var11 != var10; var11 += var3) {
				class408 var12 = (class408)this.field4501.get(var11 - 1);
				if (var5 != var12.field4507) {
					++var7;
					var5 = var12.field4507;
					if (var7 > var2) {
						return var8;
					}
				}

				if (var7 == var2) {
					int var13 = Math.abs(var12.field4508 + this.method7610(var11 - 1) - var4);
					if (var13 >= var9) {
						return var8;
					}

					var8 = var11;
					var9 = var13;
				}
			}

			if (var3 == 1) {
				return this.field4501.size();
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-612896858"
	)
	public int method7653() {
		if (!this.field4501.isEmpty() && this.method7544() == 1) {
			return this.field4501.isEmpty() ? 0 : ((class408)this.field4501.get(this.field4501.size() - 1)).field4508 + this.method7545();
		} else {
			int var1 = -1;
			int var2 = 0;

			for (int var3 = this.field4501.size() - 1; var3 >= 0; --var3) {
				class408 var4 = (class408)this.field4501.get(var3);
				if (var1 != var4.field4507) {
					int var5 = this.method7555(var4, false) + var4.field4508;
					var2 = Math.max(var5, var2);
					var1 = var4.field4507;
				}
			}

			return var2;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "6"
	)
	public int method7618() {
		return this.method7520() ? 0 : this.field4489.ascent + ((class408)this.field4501.get(this.field4501.size() - 1)).field4507;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-593841574"
	)
	public int method7614() {
		return this.field4498;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "93"
	)
	public int method7544() {
		return this.method7618() / this.field4489.ascent;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-918826426"
	)
	int method7545() {
		return this.method7520() ? 0 : this.method7555((class408)this.field4501.get(this.field4501.size() - 1), false);
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-379034894"
	)
	public int method7546() {
		return this.field4494;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2096364291"
	)
	public int method7547() {
		return this.field4503;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1926453895"
	)
	public int method7548() {
		return this.field4502;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-163729135"
	)
	public int method7549() {
		return this.field4505;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1438354732"
	)
	public int method7560(int var1) {
		switch(this.field4497) {
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

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1172186374"
	)
	public int method7551(int var1) {
		switch(this.field4500) {
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

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method7543() {
		this.method7594(0, this.field4501.size());
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "605694861"
	)
	void method7594(int var1, int var2) {
		if (!this.method7520() && this.field4489 != null) {
			class497 var3 = this.method7556(var1, var2);
			boolean var4 = (Integer)var3.field4996 == 0 && (Integer)var3.field4997 == this.field4501.size();
			int var5 = (Integer)var3.field4996;
			int var6 = 0;
			int var7 = var4 ? 0 : ((class408)this.field4501.get((Integer)var3.field4996)).field4507;
			int var8 = 0;

			int var9;
			for (var9 = (Integer)var3.field4996; var9 <= (Integer)var3.field4997; ++var9) {
				boolean var10 = var9 >= this.field4501.size();
				class408 var21 = (class408)this.field4501.get(!var10 ? var9 : this.field4501.size() - 1);
				int var22 = !var10 ? this.method7555(var21, false) : 0;
				boolean var13 = !var10 && var21.field4509 == '\n';
				boolean var14 = !var10 && this.method7521() && var22 + var6 > this.field4494;
				if (var13 || var14 || var10) {
					int var15 = var9;
					int var16 = 0;
					int var17;
					int var18;
					class408 var19;
					if (var14) {
						var17 = 0;
						if (this.field4502 == 1) {
							for (var18 = var9; var18 > var5; --var18) {
								var19 = (class408)this.field4501.get(var18);
								var17 += var18 < var15 ? this.method7555(var19, false) : 0;
								if (var19.field4509 == ' ' || var19.field4509 == '\n') {
									var15 = var18;
									var6 -= var17;
									var16 = var17;
									break;
								}
							}
						}
					}

					var17 = -this.method7560(var6);

					for (var18 = var5; var18 < var15; ++var18) {
						var19 = (class408)this.field4501.get(var18);
						int var20 = this.method7555(var19, false);
						var19.field4508 = var17;
						var19.field4507 = var7;
						var17 += var20;
					}

					var5 = var15;
					var6 = var16;
					var7 += this.method7614();
					++var8;
				}

				var6 += !var10 ? var22 : 0;
			}

			if (this.field4500 != 0 && var4) {
				var9 = var8 * this.method7614();
				int var23 = this.method7551(var9);

				for (int var11 = 0; var11 < this.field4501.size(); ++var11) {
					class408 var12 = (class408)this.field4501.get(var11);
					var12.field4507 -= var23;
				}
			}

		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1124192376"
	)
	int method7610(int var1) {
		return var1 < this.field4501.size() ? this.method7555((class408)this.field4501.get(var1), false) : 0;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(Lpn;ZI)I",
		garbageValue = "2090126332"
	)
	int method7555(class408 var1, boolean var2) {
		if (var1.field4509 == '\n') {
			return 0;
		} else if (this.field4505 == 0) {
			int var3 = this.field4489.advances[var1.field4509];
			if (var3 == 0) {
				return var1.field4509 == '\t' ? this.field4489.advances[32] * 3 : this.field4489.advances[32];
			} else {
				return var3;
			}
		} else {
			return this.field4489.advances[42];
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(III)Lti;",
		garbageValue = "-139251767"
	)
	class497 method7556(int var1, int var2) {
		int var3 = Math.min(var1, var2);
		int var4 = Math.max(var1, var2);
		int var5 = this.field4501.size();
		if (var3 == 0 && var4 == var5) {
			return new class497(0, var5);
		} else {
			int var6 = this.method7557(var3, false);
			int var7 = this.method7558(var4, false);
			int var8;
			switch(this.field4500) {
			case 0:
				if (this.field4497 == 0) {
					return new class497(var6, var5);
				}

				var8 = this.method7557(var3, true);
				return new class497(var8, var5);
			case 1:
				return new class497(0, var5);
			case 2:
				if (this.field4497 == 2) {
					return new class497(0, var7);
				}

				var8 = this.method7558(var4, true);
				return new class497(0, var8);
			default:
				return new class497(0, var5);
			}
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(IZB)I",
		garbageValue = "-36"
	)
	int method7557(int var1, boolean var2) {
		if (var1 < this.field4501.size()) {
			int var3 = ((class408)this.field4501.get(var1)).field4507;

			for (int var4 = var1; var4 > 0; --var4) {
				if (((class408)this.field4501.get(var4 - 1)).field4507 < var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class408)this.field4501.get(var4 - 1)).field4507;
				}
			}
		}

		return 0;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-1768880978"
	)
	int method7558(int var1, boolean var2) {
		if (var1 < this.field4501.size()) {
			int var3 = ((class408)this.field4501.get(var1)).field4507;

			for (int var4 = var1; var4 < this.field4501.size() - 1; ++var4) {
				if (((class408)this.field4501.get(var4 + 1)).field4507 > var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class408)this.field4501.get(var4 + 1)).field4507;
				}
			}
		}

		return this.field4501.size();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lol;Lol;ZI)V",
		garbageValue = "-180086044"
	)
	public static void method7652(AbstractArchive var0, AbstractArchive var1, boolean var2) {
		ObjectComposition.ObjectDefinition_archive = var0;
		ObjectComposition.ObjectDefinition_modelsArchive = var1;
		ObjectComposition.ObjectDefinition_isLowDetail = var2;
	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "51"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (HealthBarDefinition.widgetDefinition.loadInterface(var0)) {
			AbstractWorldMapData.updateInterface(HealthBarDefinition.widgetDefinition.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6);
		}
	}
}
