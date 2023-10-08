import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pp")
public class class409 {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1588449787
	)
	int field4503;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2098903433
	)
	int field4510;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1317961943
	)
	int field4505;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1771748723
	)
	int field4512;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1917451765
	)
	int field4513;
	@ObfuscatedName("aw")
	boolean field4514;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	AbstractFont field4506;
	@ObfuscatedName("az")
	ArrayList field4516;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 562309037
	)
	int field4517;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1714577535
	)
	int field4518;

	public class409() {
		this.field4503 = Integer.MAX_VALUE;
		this.field4510 = Integer.MAX_VALUE;
		this.field4505 = 0;
		this.field4512 = 0;
		this.field4513 = 0;
		this.field4514 = true;
		this.field4516 = new ArrayList();
		this.field4517 = 0;
		this.field4518 = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Lpe;",
		garbageValue = "391282708"
	)
	public class411 method7463(int var1) {
		return (class411)this.field4516.get(var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lpe;",
		garbageValue = "-2102583593"
	)
	class411 method7602() {
		return this.field4516.size() == 0 ? null : (class411)this.field4516.get(this.field4516.size() - 1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-15"
	)
	public boolean method7477() {
		return this.field4516.size() == 0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-122"
	)
	boolean method7466() {
		return this.field4510 > 1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1628091187"
	)
	public int method7467() {
		return this.field4516.size();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "1"
	)
	public String method7468() {
		if (this.method7477()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7467());

			for (int var2 = 0; var2 < this.method7467(); ++var2) {
				class411 var3 = this.method7463(var2);
				var1.append(var3.field4523);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1556362413"
	)
	public void method7527(int var1) {
		if (this.field4506 != null && var1 < this.field4506.ascent * 2) {
			var1 = Integer.MAX_VALUE;
		}

		if (this.field4503 != var1) {
			this.field4503 = var1;
			this.method7497();
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "36"
	)
	public void method7470(int var1) {
		if (this.field4510 != var1) {
			this.field4510 = var1;
			this.method7497();
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1148190983"
	)
	public void method7471(int var1) {
		if (this.field4518 != var1) {
			this.field4518 = var1;
			this.method7497();
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lpk;I)V",
		garbageValue = "1676896473"
	)
	public void method7472(AbstractFont var1) {
		if (var1 != this.field4506) {
			this.field4506 = var1;
			if (this.field4506 != null) {
				if (this.field4513 == 0) {
					this.field4513 = this.field4506.ascent;
				}

				if (!this.method7477()) {
					this.method7497();
				}
			}
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "903704871"
	)
	public void method7473(int var1) {
		if (this.field4517 != var1) {
			this.field4517 = var1;
			this.method7497();
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "2058162248"
	)
	public boolean method7474(int var1, int var2) {
		if (this.field4505 != var1 || var2 != this.field4512) {
			this.field4505 = var1;
			this.field4512 = var2;
			this.method7497();
		}

		return true;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1814750102"
	)
	public void method7475(int var1) {
		if (this.field4513 != var1) {
			this.field4513 = var1;
			this.method7497();
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)Lpr;",
		garbageValue = "1762179013"
	)
	public class413 method7549(int var1, int var2) {
		if (var2 == var1) {
			return new class413(this, 0, 0);
		} else if (var1 <= this.field4516.size() && var2 <= this.field4516.size()) {
			return var2 < var1 ? new class413(this, var2, var1) : new class413(this, var1, var2);
		} else {
			return new class413(this, 0, 0);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(CIIS)Lpb;",
		garbageValue = "7902"
	)
	public class410 method7583(char var1, int var2, int var3) {
		return this.method7478(Character.toString(var1), var2, var3);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIB)Lpb;",
		garbageValue = "-45"
	)
	public class410 method7478(String var1, int var2, int var3) {
		if (var3 == 0) {
			var3 = Integer.MAX_VALUE;
		}

		int var4 = var2;
		if (this.field4516.size() >= var3) {
			this.method7498(var2, var2);
			return new class410(var2, true);
		} else {
			this.field4516.ensureCapacity(this.field4516.size() + var1.length());

			for (int var5 = 0; var5 < var1.length() && this.field4516.size() < var3; ++var5) {
				class411 var6 = new class411();
				var6.field4523 = var1.charAt(var5);
				this.field4516.add(var4, var6);
				++var4;
			}

			this.method7498(var2, var4);
			if (this.field4510 != 0 && this.method7489() > this.field4510) {
				while (var4 != var2) {
					--var4;
					this.method7482(var4);
					if (this.method7489() <= this.field4510) {
						break;
					}
				}

				return new class410(var4, true);
			} else {
				return new class410(var4, false);
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lpb;",
		garbageValue = "-2106167498"
	)
	class410 method7479(String var1, int var2) {
		return this.method7478(var1, this.field4516.size(), var2);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lpb;",
		garbageValue = "-2022964950"
	)
	public class410 method7552(String var1) {
		this.method7481();
		return this.method7479(var1, 0);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-14773"
	)
	void method7481() {
		this.field4516.clear();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "398036956"
	)
	public int method7482(int var1) {
		return this.method7483(var1, var1 + 1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "895943109"
	)
	public int method7483(int var1, int var2) {
		int var3;
		if (var2 < var1) {
			var3 = var2;
			var2 = var1;
			var1 = var3;
		}

		this.field4516.subList(var1, var2).clear();
		var3 = var1;
		if (this.method7466() && this.field4517 == 1) {
			while (var3 > 0) {
				--var3;
				char var4 = ((class411)this.field4516.get(var3)).field4523;
				if (var4 == ' ' || var4 == '\t') {
					break;
				}
			}
		}

		this.method7498(var3, var2);
		return var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1582951780"
	)
	public int method7484(int var1, int var2) {
		if (this.field4506 == null) {
			return 0;
		} else if (this.method7466() && var1 > this.field4503) {
			return this.field4516.size();
		} else {
			if (!this.field4516.isEmpty()) {
				for (int var3 = 0; var3 < this.field4516.size(); ++var3) {
					class411 var4 = (class411)this.field4516.get(var3);
					if (var2 <= var4.field4525 + this.method7488()) {
						if (var2 < var4.field4525) {
							break;
						}

						if (var1 < var4.field4524) {
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (1 + var3 != this.field4516.size() && ((class411)this.field4516.get(var3 + 1)).field4525 != var4.field4525) {
							int var5 = this.method7578((class411)this.field4516.get(var3), false);
							if (var1 < var5 + var4.field4524) {
								return var3;
							}

							if (var2 <= var4.field4525 + this.method7488()) {
								return var3 + 1;
							}
						}
					}
				}

				class411 var6 = (class411)this.field4516.get(this.field4516.size() - 1);
				if (var1 >= var6.field4524 && var1 <= var6.field4524 + this.method7579() && var2 >= var6.field4525 && var2 <= var6.field4525 + this.method7488()) {
					return this.field4516.size() - 1;
				}
			}

			return this.field4516.size();
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1702844331"
	)
	public int method7485(int var1, int var2) {
		if (this.field4506 != null && !this.method7477() && var1 <= this.field4516.size()) {
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
				class411 var6 = (class411)this.field4516.get(var1 - 1);
				var4 = var6.field4524 + this.method7465(var1 - 1);
				var5 = var6.field4525;
			} else if (var3 == -1 && var1 == 0) {
				return 0;
			}

			int var14 = 16777215;
			int var7 = 0;
			int var8 = var1;
			int var9 = 16777215;
			int var10 = var3 == 1 ? this.field4516.size() + 1 : 0;

			for (int var11 = var3 + var1; var10 != var11; var11 += var3) {
				class411 var12 = (class411)this.field4516.get(var11 - 1);
				if (var5 != var12.field4525) {
					++var7;
					var5 = var12.field4525;
					if (var7 > var2) {
						return var8;
					}
				}

				if (var7 == var2) {
					int var13 = Math.abs(var12.field4524 + this.method7465(var11 - 1) - var4);
					if (var13 >= var9) {
						return var8;
					}

					var8 = var11;
					var9 = var13;
				}
			}

			if (var3 == 1) {
				return this.field4516.size();
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-512196245"
	)
	public int method7486() {
		if (!this.field4516.isEmpty() && this.method7489() == 1) {
			return this.field4516.isEmpty() ? 0 : ((class411)this.field4516.get(this.field4516.size() - 1)).field4524 + this.method7579();
		} else {
			int var1 = -1;
			int var2 = 0;

			for (int var3 = this.field4516.size() - 1; var3 >= 0; --var3) {
				class411 var4 = (class411)this.field4516.get(var3);
				if (var1 != var4.field4525) {
					int var5 = this.method7578(var4, false) + var4.field4524;
					var2 = Math.max(var5, var2);
					var1 = var4.field4525;
				}
			}

			return var2;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "67"
	)
	public int method7487() {
		return this.method7477() ? 0 : this.field4506.ascent + ((class411)this.field4516.get(this.field4516.size() - 1)).field4525;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-51"
	)
	public int method7488() {
		return this.field4513;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "458527670"
	)
	public int method7489() {
		return this.method7487() / this.field4506.ascent;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-317463978"
	)
	int method7579() {
		return this.method7477() ? 0 : this.method7578((class411)this.field4516.get(this.field4516.size() - 1), false);
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "4"
	)
	public int method7476() {
		return this.field4503;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-59557509"
	)
	public int method7504() {
		return this.field4510;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1977390124"
	)
	public int method7493() {
		return this.field4517;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "13"
	)
	public int method7494() {
		return this.field4518;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1372497203"
	)
	public int method7495(int var1) {
		switch(this.field4505) {
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

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1982314148"
	)
	public int method7595(int var1) {
		switch(this.field4512) {
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

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2112190855"
	)
	void method7497() {
		this.method7498(0, this.field4516.size());
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2040581189"
	)
	void method7498(int var1, int var2) {
		if (!this.method7477() && this.field4506 != null) {
			class500 var3 = this.method7501(var1, var2);
			boolean var4 = (Integer)var3.field5003 == 0 && (Integer)var3.field5004 == this.field4516.size();
			int var5 = (Integer)var3.field5003;
			int var6 = 0;
			int var7 = var4 ? 0 : ((class411)this.field4516.get((Integer)var3.field5003)).field4525;
			int var8 = 0;

			int var9;
			for (var9 = (Integer)var3.field5003; var9 <= (Integer)var3.field5004; ++var9) {
				boolean var10 = var9 >= this.field4516.size();
				class411 var21 = (class411)this.field4516.get(!var10 ? var9 : this.field4516.size() - 1);
				int var22 = !var10 ? this.method7578(var21, false) : 0;
				boolean var13 = !var10 && var21.field4523 == '\n';
				boolean var14 = !var10 && this.method7466() && var22 + var6 > this.field4503;
				if (var13 || var14 || var10) {
					int var15 = var9;
					int var16 = 0;
					int var17;
					int var18;
					class411 var19;
					if (var14) {
						var17 = 0;
						if (this.field4517 == 1) {
							for (var18 = var9; var18 > var5; --var18) {
								var19 = (class411)this.field4516.get(var18);
								var17 += var18 < var15 ? this.method7578(var19, false) : 0;
								if (var19.field4523 == ' ' || var19.field4523 == '\n') {
									var15 = var18;
									var6 -= var17;
									var16 = var17;
									break;
								}
							}
						}
					}

					var17 = -this.method7495(var6);

					for (var18 = var5; var18 < var15; ++var18) {
						var19 = (class411)this.field4516.get(var18);
						int var20 = this.method7578(var19, false);
						var19.field4524 = var17;
						var19.field4525 = var7;
						var17 += var20;
					}

					var5 = var15;
					var6 = var16;
					var7 += this.method7488();
					++var8;
				}

				var6 += !var10 ? var22 : 0;
			}

			if (this.field4512 != 0 && var4) {
				var9 = var8 * this.method7488();
				int var23 = this.method7595(var9);

				for (int var11 = 0; var11 < this.field4516.size(); ++var11) {
					class411 var12 = (class411)this.field4516.get(var11);
					var12.field4525 -= var23;
				}
			}

		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1039874623"
	)
	int method7465(int var1) {
		return var1 < this.field4516.size() ? this.method7578((class411)this.field4516.get(var1), false) : 0;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(Lpe;ZI)I",
		garbageValue = "1478006177"
	)
	int method7578(class411 var1, boolean var2) {
		if (var1.field4523 == '\n') {
			return 0;
		} else if (this.field4518 == 0) {
			int var3 = this.field4506.advances[var1.field4523];
			if (var3 == 0) {
				return var1.field4523 == '\t' ? this.field4506.advances[32] * 3 : this.field4506.advances[32];
			} else {
				return var3;
			}
		} else {
			return this.field4506.advances[42];
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(IIB)Ltw;",
		garbageValue = "26"
	)
	class500 method7501(int var1, int var2) {
		int var3 = Math.min(var1, var2);
		int var4 = Math.max(var1, var2);
		int var5 = this.field4516.size();
		if (var3 == 0 && var4 == var5) {
			return new class500(0, var5);
		} else {
			int var6 = this.method7502(var3, false);
			int var7 = this.method7503(var4, false);
			int var8;
			switch(this.field4512) {
			case 0:
				if (this.field4505 == 0) {
					return new class500(var6, var5);
				}

				var8 = this.method7502(var3, true);
				return new class500(var8, var5);
			case 1:
				return new class500(0, var5);
			case 2:
				if (this.field4505 == 2) {
					return new class500(0, var7);
				}

				var8 = this.method7503(var4, true);
				return new class500(0, var8);
			default:
				return new class500(0, var5);
			}
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IZS)I",
		garbageValue = "-9654"
	)
	int method7502(int var1, boolean var2) {
		if (var1 < this.field4516.size()) {
			int var3 = ((class411)this.field4516.get(var1)).field4525;

			for (int var4 = var1; var4 > 0; --var4) {
				if (((class411)this.field4516.get(var4 - 1)).field4525 < var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class411)this.field4516.get(var4 - 1)).field4525;
				}
			}
		}

		return 0;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-1749016193"
	)
	int method7503(int var1, boolean var2) {
		if (var1 < this.field4516.size()) {
			int var3 = ((class411)this.field4516.get(var1)).field4525;

			for (int var4 = var1; var4 < this.field4516.size() - 1; ++var4) {
				if (((class411)this.field4516.get(var4 + 1)).field4525 > var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class411)this.field4516.get(var4 + 1)).field4525;
				}
			}
		}

		return this.field4516.size();
	}

	@ObfuscatedName("ov")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-1"
	)
	static void method7554(int var0) {
		if (var0 != Client.loginState) {
			Client.loginState = var0;
		}
	}
}
