import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("pl")
public class class414 {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -588286243
	)
	int field4594;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1017194117
	)
	int field4595;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2020790823
	)
	int field4597;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -236109549
	)
	int field4588;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1772364515
	)
	int field4598;
	@ObfuscatedName("aa")
	boolean field4599;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	AbstractFont field4602;
	@ObfuscatedName("am")
	ArrayList field4601;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -989964373
	)
	int field4589;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1411711645
	)
	int field4603;

	public class414() {
		this.field4594 = Integer.MAX_VALUE;
		this.field4595 = Integer.MAX_VALUE;
		this.field4597 = 0;
		this.field4588 = 0;
		this.field4598 = 0;
		this.field4599 = true;
		this.field4601 = new ArrayList();
		this.field4589 = 0;
		this.field4603 = 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Lqt;",
		garbageValue = "1881970922"
	)
	public class416 method7509(int var1) {
		return (class416)this.field4601.get(var1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Lqt;",
		garbageValue = "811849070"
	)
	class416 method7536() {
		return this.field4601.size() == 0 ? null : (class416)this.field4601.get(this.field4601.size() - 1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1979767872"
	)
	public boolean method7566() {
		return this.field4601.size() == 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2117760630"
	)
	boolean method7512() {
		return this.field4595 > 1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1729552299"
	)
	public int method7513() {
		return this.field4601.size();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1922526698"
	)
	public String method7539() {
		if (this.method7566()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7513());

			for (int var2 = 0; var2 < this.method7513(); ++var2) {
				class416 var3 = this.method7509(var2);
				var1.append(var3.field4607);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-328663437"
	)
	public void method7515(int var1) {
		if (this.field4602 != null && var1 < this.field4602.ascent * 2) {
			var1 = Integer.MAX_VALUE;
		}

		if (this.field4594 != var1) {
			this.field4594 = var1;
			this.method7609();
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2099925001"
	)
	public void method7560(int var1) {
		if (this.field4595 != var1) {
			this.field4595 = var1;
			this.method7609();
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-35"
	)
	public void method7618(int var1) {
		if (this.field4603 != var1) {
			this.field4603 = var1;
			this.method7609();
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lqu;I)V",
		garbageValue = "-22972686"
	)
	public void method7518(AbstractFont var1) {
		if (var1 != this.field4602) {
			this.field4602 = var1;
			if (this.field4602 != null) {
				if (this.field4598 == 0) {
					this.field4598 = this.field4602.ascent;
				}

				if (!this.method7566()) {
					this.method7609();
				}
			}
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1651583512"
	)
	public void method7519(int var1) {
		if (this.field4589 != var1) {
			this.field4589 = var1;
			this.method7609();
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1516408267"
	)
	public boolean method7520(int var1, int var2) {
		if (this.field4597 != var1 || var2 != this.field4588) {
			this.field4597 = var1;
			this.field4588 = var2;
			this.method7609();
		}

		return true;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "98"
	)
	public void method7514(int var1) {
		if (this.field4598 != var1) {
			this.field4598 = var1;
			this.method7609();
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lqs;",
		garbageValue = "40"
	)
	public class418 method7522(int var1, int var2) {
		if (var2 == var1) {
			return new class418(this, 0, 0);
		} else if (var1 <= this.field4601.size() && var2 <= this.field4601.size()) {
			return var2 < var1 ? new class418(this, var2, var1) : new class418(this, var1, var2);
		} else {
			return new class418(this, 0, 0);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(CIII)Lpf;",
		garbageValue = "-1858024048"
	)
	public class415 method7523(char var1, int var2, int var3) {
		return this.method7524(Character.toString(var1), var2, var3);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIB)Lpf;",
		garbageValue = "0"
	)
	public class415 method7524(String var1, int var2, int var3) {
		if (var3 == 0) {
			var3 = Integer.MAX_VALUE;
		}

		int var4 = var2;
		if (this.field4601.size() >= var3) {
			this.method7543(var2, var2);
			return new class415(var2, true);
		} else {
			this.field4601.ensureCapacity(this.field4601.size() + var1.length());

			for (int var5 = 0; var5 < var1.length() && this.field4601.size() < var3; ++var5) {
				class416 var6 = new class416();
				var6.field4607 = var1.charAt(var5);
				this.field4601.add(var4, var6);
				++var4;
			}

			this.method7543(var2, var4);
			if (this.field4595 != 0 && this.method7535() > this.field4595) {
				while (var4 != var2) {
					--var4;
					this.method7579(var4);
					if (this.method7535() <= this.field4595) {
						break;
					}
				}

				return new class415(var4, true);
			} else {
				return new class415(var4, false);
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lpf;",
		garbageValue = "1324056167"
	)
	class415 method7525(String var1, int var2) {
		return this.method7524(var1, this.field4601.size(), var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Lpf;",
		garbageValue = "46"
	)
	public class415 method7531(String var1) {
		this.method7562();
		return this.method7525(var1, 0);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "138770399"
	)
	void method7562() {
		this.field4601.clear();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "412178640"
	)
	public int method7579(int var1) {
		return this.method7529(var1, var1 + 1);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "49298"
	)
	public int method7529(int var1, int var2) {
		int var3;
		if (var2 < var1) {
			var3 = var2;
			var2 = var1;
			var1 = var3;
		}

		this.field4601.subList(var1, var2).clear();
		var3 = var1;
		if (this.method7512() && this.field4589 == 1) {
			while (var3 > 0) {
				--var3;
				char var4 = ((class416)this.field4601.get(var3)).field4607;
				if (var4 == ' ' || var4 == '\t') {
					break;
				}
			}
		}

		this.method7543(var3, var2);
		return var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "254864710"
	)
	public int method7587(int var1, int var2) {
		if (this.field4602 == null) {
			return 0;
		} else if (this.method7512() && var1 > this.field4594) {
			return this.field4601.size();
		} else {
			if (!this.field4601.isEmpty()) {
				for (int var3 = 0; var3 < this.field4601.size(); ++var3) {
					class416 var4 = (class416)this.field4601.get(var3);
					if (var2 <= var4.field4605 + this.method7511()) {
						if (var2 < var4.field4605) {
							break;
						}

						if (var1 < var4.field4606) {
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (var3 + 1 != this.field4601.size() && ((class416)this.field4601.get(var3 + 1)).field4605 != var4.field4605) {
							int var5 = this.method7585((class416)this.field4601.get(var3), false);
							if (var1 < var5 + var4.field4606) {
								return var3;
							}

							if (var2 <= var4.field4605 + this.method7511()) {
								return var3 + 1;
							}
						}
					}
				}

				class416 var6 = (class416)this.field4601.get(this.field4601.size() - 1);
				if (var1 >= var6.field4606 && var1 <= var6.field4606 + this.method7635() && var2 >= var6.field4605 && var2 <= var6.field4605 + this.method7511()) {
					return this.field4601.size() - 1;
				}
			}

			return this.field4601.size();
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "564964147"
	)
	public int method7601(int var1, int var2) {
		if (this.field4602 != null && !this.method7566() && var1 <= this.field4601.size()) {
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
				class416 var6 = (class416)this.field4601.get(var1 - 1);
				var4 = var6.field4606 + this.method7545(var1 - 1);
				var5 = var6.field4605;
			} else if (var3 == -1 && var1 == 0) {
				return 0;
			}

			int var14 = 16777215;
			int var7 = 0;
			int var8 = var1;
			int var9 = 16777215;
			int var10 = var3 == 1 ? this.field4601.size() + 1 : 0;

			for (int var11 = var3 + var1; var11 != var10; var11 += var3) {
				class416 var12 = (class416)this.field4601.get(var11 - 1);
				if (var5 != var12.field4605) {
					++var7;
					var5 = var12.field4605;
					if (var7 > var2) {
						return var8;
					}
				}

				if (var7 == var2) {
					int var13 = Math.abs(var12.field4606 + this.method7545(var11 - 1) - var4);
					if (var13 >= var9) {
						return var8;
					}

					var8 = var11;
					var9 = var13;
				}
			}

			if (var3 == 1) {
				return this.field4601.size();
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
		garbageValue = "-1143912558"
	)
	public int method7532() {
		if (!this.field4601.isEmpty() && this.method7535() == 1) {
			return this.field4601.isEmpty() ? 0 : ((class416)this.field4601.get(this.field4601.size() - 1)).field4606 + this.method7635();
		} else {
			int var1 = -1;
			int var2 = 0;

			for (int var3 = this.field4601.size() - 1; var3 >= 0; --var3) {
				class416 var4 = (class416)this.field4601.get(var3);
				if (var1 != var4.field4605) {
					int var5 = this.method7585(var4, false) + var4.field4606;
					var2 = Math.max(var5, var2);
					var1 = var4.field4605;
				}
			}

			return var2;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-811444924"
	)
	public int method7533() {
		return this.method7566() ? 0 : this.field4602.ascent + ((class416)this.field4601.get(this.field4601.size() - 1)).field4605;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-68"
	)
	public int method7511() {
		return this.field4598;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "80"
	)
	public int method7535() {
		return this.method7533() / this.field4602.ascent;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1582650784"
	)
	int method7635() {
		return this.method7566() ? 0 : this.method7585((class416)this.field4601.get(this.field4601.size() - 1), false);
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-232369431"
	)
	public int method7537() {
		return this.field4594;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "43"
	)
	public int method7642() {
		return this.field4595;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	public int method7540() {
		return this.field4589;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-84"
	)
	public int method7534() {
		return this.field4603;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "98463606"
	)
	public int method7549(int var1) {
		switch(this.field4597) {
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

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "-11019"
	)
	public int method7542(int var1) {
		switch(this.field4588) {
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

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1759796625"
	)
	void method7609() {
		this.method7543(0, this.field4601.size());
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1526902675"
	)
	void method7543(int var1, int var2) {
		if (!this.method7566() && this.field4602 != null) {
			class505 var3 = this.method7547(var1, var2);
			boolean var4 = (Integer)var3.field5090 == 0 && (Integer)var3.field5089 == this.field4601.size();
			int var5 = (Integer)var3.field5090;
			int var6 = 0;
			int var7 = var4 ? 0 : ((class416)this.field4601.get((Integer)var3.field5090)).field4605;
			int var8 = 0;

			int var9;
			for (var9 = (Integer)var3.field5090; var9 <= (Integer)var3.field5089; ++var9) {
				boolean var10 = var9 >= this.field4601.size();
				class416 var21 = (class416)this.field4601.get(!var10 ? var9 : this.field4601.size() - 1);
				int var22 = !var10 ? this.method7585(var21, false) : 0;
				boolean var13 = !var10 && var21.field4607 == '\n';
				boolean var14 = !var10 && this.method7512() && var6 + var22 > this.field4594;
				if (var13 || var14 || var10) {
					int var15 = var9;
					int var16 = 0;
					int var17;
					int var18;
					class416 var19;
					if (var14) {
						var17 = 0;
						if (this.field4589 == 1) {
							for (var18 = var9; var18 > var5; --var18) {
								var19 = (class416)this.field4601.get(var18);
								var17 += var18 < var15 ? this.method7585(var19, false) : 0;
								if (var19.field4607 == ' ' || var19.field4607 == '\n') {
									var15 = var18;
									var6 -= var17;
									var16 = var17;
									break;
								}
							}
						}
					}

					var17 = -this.method7549(var6);

					for (var18 = var5; var18 < var15; ++var18) {
						var19 = (class416)this.field4601.get(var18);
						int var20 = this.method7585(var19, false);
						var19.field4606 = var17;
						var19.field4605 = var7;
						var17 += var20;
					}

					var5 = var15;
					var6 = var16;
					var7 += this.method7511();
					++var8;
				}

				var6 += !var10 ? var22 : 0;
			}

			if (this.field4588 != 0 && var4) {
				var9 = var8 * this.method7511();
				int var23 = this.method7542(var9);

				for (int var11 = 0; var11 < this.field4601.size(); ++var11) {
					class416 var12 = (class416)this.field4601.get(var11);
					var12.field4605 -= var23;
				}
			}

		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1292347002"
	)
	int method7545(int var1) {
		return var1 < this.field4601.size() ? this.method7585((class416)this.field4601.get(var1), false) : 0;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(Lqt;ZI)I",
		garbageValue = "335030106"
	)
	int method7585(class416 var1, boolean var2) {
		if (var1.field4607 == '\n') {
			return 0;
		} else if (this.field4603 == 0) {
			int var3 = this.field4602.advances[var1.field4607];
			if (var3 == 0) {
				return var1.field4607 == '\t' ? this.field4602.advances[32] * 3 : this.field4602.advances[32];
			} else {
				return var3;
			}
		} else {
			return this.field4602.advances[42];
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(III)Ltd;",
		garbageValue = "457213877"
	)
	class505 method7547(int var1, int var2) {
		int var3 = Math.min(var1, var2);
		int var4 = Math.max(var1, var2);
		int var5 = this.field4601.size();
		if (var3 == 0 && var4 == var5) {
			return new class505(0, var5);
		} else {
			int var6 = this.method7548(var3, false);
			int var7 = this.method7527(var4, false);
			int var8;
			switch(this.field4588) {
			case 0:
				if (this.field4597 == 0) {
					return new class505(var6, var5);
				}

				var8 = this.method7548(var3, true);
				return new class505(var8, var5);
			case 1:
				return new class505(0, var5);
			case 2:
				if (this.field4597 == 2) {
					return new class505(0, var7);
				}

				var8 = this.method7527(var4, true);
				return new class505(0, var8);
			default:
				return new class505(0, var5);
			}
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IZB)I",
		garbageValue = "51"
	)
	int method7548(int var1, boolean var2) {
		if (var1 < this.field4601.size()) {
			int var3 = ((class416)this.field4601.get(var1)).field4605;

			for (int var4 = var1; var4 > 0; --var4) {
				if (((class416)this.field4601.get(var4 - 1)).field4605 < var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class416)this.field4601.get(var4 - 1)).field4605;
				}
			}
		}

		return 0;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IZB)I",
		garbageValue = "104"
	)
	int method7527(int var1, boolean var2) {
		if (var1 < this.field4601.size()) {
			int var3 = ((class416)this.field4601.get(var1)).field4605;

			for (int var4 = var1; var4 < this.field4601.size() - 1; ++var4) {
				if (((class416)this.field4601.get(var4 + 1)).field4605 > var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class416)this.field4601.get(var4 + 1)).field4605;
				}
			}
		}

		return this.field4601.size();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "2054306844"
	)
	static int method7646(int var0, Script var1, boolean var2) {
		boolean var3 = true;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = class243.widgetDefinition.method6281(Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize]);
			var3 = false;
		} else {
			var4 = var2 ? class475.scriptDotWidget : class535.scriptActiveWidget;
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) {
			var11 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize] - 1;
			if (var11 >= 0 && var11 <= 9) {
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize]);
				return 1;
			} else {
				--AbstractWorldMapIcon.Interpreter_stringStackSize;
				return 1;
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) {
				HttpRequestTask.Interpreter_intStackSize -= 2;
				var11 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
				var6 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
				var4.parent = class243.widgetDefinition.getWidgetChild(var11, var6);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) {
				var4.isScrollBar = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) {
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) {
				var4.dragThreshold = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) {
				var4.dataText = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) {
				var4.spellActionName = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) {
				var4.actions = null;
				return 1;
			} else if (var0 == 1308) {
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == 1309) {
				--HttpRequestTask.Interpreter_intStackSize;
				return 1;
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) {
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) {
						HttpRequestTask.Interpreter_intStackSize -= 2;
						var5 = 10;
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize]};
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1]};
						ModeWhere.Widget_setKey(var4, var5, var8, var9);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) {
						HttpRequestTask.Interpreter_intStackSize -= 3;
						var11 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize] - 1;
						var6 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
						var7 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 2];
						if (var11 >= 0 && var11 <= 9) {
							class432.Widget_setKeyRate(var4, var11, var6, var7);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) {
						var5 = 10;
						var6 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
						var7 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
						class432.Widget_setKeyRate(var4, var5, var6, var7);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) {
						--HttpRequestTask.Interpreter_intStackSize;
						var11 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize] - 1;
						if (var11 >= 0 && var11 <= 9) {
							LoginScreenAnimation.Widget_setKeyIgnoreHeld(var4, var11);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) {
						var5 = 10;
						LoginScreenAnimation.Widget_setKeyIgnoreHeld(var4, var5);
						return 1;
					} else {
						return 2;
					}
				} else {
					byte[] var10 = null;
					var8 = null;
					if (var3) {
						HttpRequestTask.Interpreter_intStackSize -= 10;

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + HttpRequestTask.Interpreter_intStackSize] >= 0; var7 += 2) {
						}

						if (var7 > 0) {
							var10 = new byte[var7 / 2];
							var8 = new byte[var7 / 2];

							for (var7 -= 2; var7 >= 0; var7 -= 2) {
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + HttpRequestTask.Interpreter_intStackSize];
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + HttpRequestTask.Interpreter_intStackSize + 1];
							}
						}
					} else {
						HttpRequestTask.Interpreter_intStackSize -= 2;
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize]};
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1]};
					}

					var7 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize] - 1;
					if (var7 >= 0 && var7 <= 9) {
						ModeWhere.Widget_setKey(var4, var7, var10, var8);
						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
	}
}
