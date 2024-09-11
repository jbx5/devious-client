import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qn")
public class class435 {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1509824461
	)
	int field4778;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -912927653
	)
	int field4780;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1193214755
	)
	int field4781;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1012868367
	)
	int field4782;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 994678983
	)
	int field4783;
	@ObfuscatedName("ay")
	boolean field4784;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lqk;"
	)
	AbstractFont field4785;
	@ObfuscatedName("av")
	ArrayList field4786;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -170380961
	)
	int field4787;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1093560235
	)
	int field4788;

	public class435() {
		this.field4778 = Integer.MAX_VALUE;
		this.field4780 = Integer.MAX_VALUE;
		this.field4781 = 0;
		this.field4782 = 0;
		this.field4783 = 0;
		this.field4784 = true;
		this.field4786 = new ArrayList();
		this.field4787 = 0;
		this.field4788 = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Lqe;",
		garbageValue = "2141334575"
	)
	public class437 method8279(int var1) {
		return (class437)this.field4786.get(var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Lqe;",
		garbageValue = "55"
	)
	class437 method8385() {
		return this.field4786.size() == 0 ? null : (class437)this.field4786.get(this.field4786.size() - 1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1456277072"
	)
	public boolean method8281() {
		return this.field4786.size() == 0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-48"
	)
	boolean method8353() {
		return this.field4780 > 1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1338007785"
	)
	public int method8345() {
		return this.field4786.size();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1172492054"
	)
	public String method8367() {
		if (this.method8281()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method8345());

			for (int var2 = 0; var2 < this.method8345(); ++var2) {
				class437 var3 = this.method8279(var2);
				var1.append(var3.field4794);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2055932975"
	)
	public void method8284(int var1) {
		if (this.field4785 != null && var1 < this.field4785.ascent * 2) {
			var1 = Integer.MAX_VALUE;
		}

		if (this.field4778 != var1) {
			this.field4778 = var1;
			this.method8358();
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-125"
	)
	public void method8285(int var1) {
		if (this.field4780 != var1) {
			this.field4780 = var1;
			this.method8358();
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1093808757"
	)
	public void method8309(int var1) {
		if (this.field4788 != var1) {
			this.field4788 = var1;
			this.method8358();
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lqk;I)V",
		garbageValue = "-1907536213"
	)
	public void method8287(AbstractFont var1) {
		if (var1 != this.field4785) {
			this.field4785 = var1;
			if (this.field4785 != null) {
				if (this.field4783 == 0) {
					this.field4783 = this.field4785.ascent;
				}

				if (!this.method8281()) {
					this.method8358();
				}
			}
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2052919848"
	)
	public void method8288(int var1) {
		if (this.field4787 != var1) {
			this.field4787 = var1;
			this.method8358();
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1983549050"
	)
	public boolean method8289(int var1, int var2) {
		if (this.field4781 != var1 || var2 != this.field4782) {
			this.field4781 = var1;
			this.field4782 = var2;
			this.method8358();
		}

		return true;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1910583090"
	)
	public void method8290(int var1) {
		if (this.field4783 != var1) {
			this.field4783 = var1;
			this.method8358();
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lqw;",
		garbageValue = "-49"
	)
	public class439 method8291(int var1, int var2) {
		if (var2 == var1) {
			return new class439(this, 0, 0);
		} else if (var1 <= this.field4786.size() && var2 <= this.field4786.size()) {
			return var2 < var1 ? new class439(this, var2, var1) : new class439(this, var1, var2);
		} else {
			return new class439(this, 0, 0);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(CIII)Lqc;",
		garbageValue = "-1434733039"
	)
	public class436 method8292(char var1, int var2, int var3) {
		return this.method8357(Character.toString(var1), var2, var3);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIB)Lqc;",
		garbageValue = "-85"
	)
	public class436 method8357(String var1, int var2, int var3) {
		if (var3 == 0) {
			var3 = Integer.MAX_VALUE;
		}

		int var4 = var2;
		if (this.field4786.size() >= var3) {
			this.method8303(var2, var2);
			return new class436(var2, true);
		} else {
			this.field4786.ensureCapacity(this.field4786.size() + var1.length());

			for (int var5 = 0; var5 < var1.length() && this.field4786.size() < var3; ++var5) {
				class437 var6 = new class437();
				var6.field4794 = var1.charAt(var5);
				this.field4786.add(var4, var6);
				++var4;
			}

			this.method8303(var2, var4);
			if (this.field4780 != 0 && this.method8283() > this.field4780) {
				while (var4 != var2) {
					--var4;
					this.method8312(var4);
					if (this.method8283() <= this.field4780) {
						break;
					}
				}

				return new class436(var4, true);
			} else {
				return new class436(var4, false);
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lqc;",
		garbageValue = "-2001293364"
	)
	class436 method8294(String var1, int var2) {
		return this.method8357(var1, this.field4786.size(), var2);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)Lqc;",
		garbageValue = "-11649"
	)
	public class436 method8350(String var1) {
		this.method8296();
		return this.method8294(var1, 0);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1698112060"
	)
	void method8296() {
		this.field4786.clear();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "64"
	)
	public int method8312(int var1) {
		return this.method8396(var1, var1 + 1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "-23799"
	)
	public int method8396(int var1, int var2) {
		int var3;
		if (var2 < var1) {
			var3 = var2;
			var2 = var1;
			var1 = var3;
		}

		this.field4786.subList(var1, var2).clear();
		var3 = var1;
		if (this.method8353() && this.field4787 == 1) {
			while (var3 > 0) {
				--var3;
				char var4 = ((class437)this.field4786.get(var3)).field4794;
				if (var4 == ' ' || var4 == '\t') {
					break;
				}
			}
		}

		this.method8303(var3, var2);
		return var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2097928951"
	)
	public int method8299(int var1, int var2) {
		if (this.field4785 == null) {
			return 0;
		} else if (this.method8353() && var1 > this.field4778) {
			return this.field4786.size();
		} else {
			if (!this.field4786.isEmpty()) {
				for (int var3 = 0; var3 < this.field4786.size(); ++var3) {
					class437 var4 = (class437)this.field4786.get(var3);
					if (var2 <= var4.field4795 + this.method8340()) {
						if (var2 < var4.field4795) {
							break;
						}

						if (var1 < var4.field4793) {
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (var3 + 1 != this.field4786.size() && ((class437)this.field4786.get(1 + var3)).field4795 != var4.field4795) {
							int var5 = this.method8315((class437)this.field4786.get(var3), false);
							if (var1 < var5 + var4.field4793) {
								return var3;
							}

							if (var2 <= var4.field4795 + this.method8340()) {
								return var3 + 1;
							}
						}
					}
				}

				class437 var6 = (class437)this.field4786.get(this.field4786.size() - 1);
				if (var1 >= var6.field4793 && var1 <= var6.field4793 + this.method8280() && var2 >= var6.field4795 && var2 <= var6.field4795 + this.method8340()) {
					return this.field4786.size() - 1;
				}
			}

			return this.field4786.size();
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1234184176"
	)
	public int method8300(int var1, int var2) {
		if (this.field4785 != null && !this.method8281() && var1 <= this.field4786.size()) {
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
				class437 var6 = (class437)this.field4786.get(var1 - 1);
				var4 = var6.field4793 + this.method8314(var1 - 1);
				var5 = var6.field4795;
			} else if (var3 == -1 && var1 == 0) {
				return 0;
			}

			int var14 = 16777215;
			int var7 = 0;
			int var8 = var1;
			int var9 = 16777215;
			int var10 = var3 == 1 ? this.field4786.size() + 1 : 0;

			for (int var11 = var3 + var1; var11 != var10; var11 += var3) {
				class437 var12 = (class437)this.field4786.get(var11 - 1);
				if (var5 != var12.field4795) {
					++var7;
					var5 = var12.field4795;
					if (var7 > var2) {
						return var8;
					}
				}

				if (var7 == var2) {
					int var13 = Math.abs(var12.field4793 + this.method8314(var11 - 1) - var4);
					if (var13 >= var9) {
						return var8;
					}

					var8 = var11;
					var9 = var13;
				}
			}

			if (var3 == 1) {
				return this.field4786.size();
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1783178792"
	)
	public int method8301() {
		if (!this.field4786.isEmpty() && this.method8283() == 1) {
			return this.field4786.isEmpty() ? 0 : ((class437)this.field4786.get(this.field4786.size() - 1)).field4793 + this.method8280();
		} else {
			int var1 = -1;
			int var2 = 0;

			for (int var3 = this.field4786.size() - 1; var3 >= 0; --var3) {
				class437 var4 = (class437)this.field4786.get(var3);
				if (var1 != var4.field4795) {
					int var5 = this.method8315(var4, false) + var4.field4793;
					var2 = Math.max(var5, var2);
					var1 = var4.field4795;
				}
			}

			return var2;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-776937676"
	)
	public int method8302() {
		return this.method8281() ? 0 : this.field4785.ascent + ((class437)this.field4786.get(this.field4786.size() - 1)).field4795;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "56"
	)
	public int method8340() {
		return this.field4783;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "10"
	)
	public int method8283() {
		return this.method8302() / this.field4785.ascent;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1897012729"
	)
	int method8280() {
		return this.method8281() ? 0 : this.method8315((class437)this.field4786.get(this.field4786.size() - 1), false);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-5"
	)
	public int method8306() {
		return this.field4778;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1710311151"
	)
	public int method8307() {
		return this.field4780;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "1926"
	)
	public int method8308() {
		return this.field4787;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-65"
	)
	public int method8320() {
		return this.field4788;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "6"
	)
	public int method8310(int var1) {
		switch(this.field4781) {
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

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-46"
	)
	public int method8311(int var1) {
		switch(this.field4782) {
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
		descriptor = "(I)V",
		garbageValue = "1331468239"
	)
	void method8358() {
		this.method8303(0, this.field4786.size());
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	void method8303(int var1, int var2) {
		if (!this.method8281() && this.field4785 != null) {
			class520 var3 = this.method8316(var1, var2);
			boolean var4 = (Integer)var3.field5264 == 0 && (Integer)var3.field5265 == this.field4786.size();
			int var5 = (Integer)var3.field5264;
			int var6 = 0;
			int var7 = var4 ? 0 : ((class437)this.field4786.get((Integer)var3.field5264)).field4795;
			int var8 = 0;

			int var9;
			for (var9 = (Integer)var3.field5264; var9 <= (Integer)var3.field5265; ++var9) {
				boolean var10 = var9 >= this.field4786.size();
				class437 var21 = (class437)this.field4786.get(!var10 ? var9 : this.field4786.size() - 1);
				int var22 = !var10 ? this.method8315(var21, false) : 0;
				boolean var13 = !var10 && var21.field4794 == '\n';
				boolean var14 = !var10 && this.method8353() && var6 + var22 > this.field4778;
				if (var13 || var14 || var10) {
					int var15 = var9;
					int var16 = 0;
					int var17;
					int var18;
					class437 var19;
					if (var14) {
						var17 = 0;
						if (this.field4787 == 1) {
							for (var18 = var9; var18 > var5; --var18) {
								var19 = (class437)this.field4786.get(var18);
								var17 += var18 < var15 ? this.method8315(var19, false) : 0;
								if (var19.field4794 == ' ' || var19.field4794 == '\n') {
									var15 = var18;
									var6 -= var17;
									var16 = var17;
									break;
								}
							}
						}
					}

					var17 = -this.method8310(var6);

					for (var18 = var5; var18 < var15; ++var18) {
						var19 = (class437)this.field4786.get(var18);
						int var20 = this.method8315(var19, false);
						var19.field4793 = var17;
						var19.field4795 = var7;
						var17 += var20;
					}

					var5 = var15;
					var6 = var16;
					var7 += this.method8340();
					++var8;
				}

				var6 += !var10 ? var22 : 0;
			}

			if (this.field4782 != 0 && var4) {
				var9 = var8 * this.method8340();
				int var23 = this.method8311(var9);

				for (int var11 = 0; var11 < this.field4786.size(); ++var11) {
					class437 var12 = (class437)this.field4786.get(var11);
					var12.field4795 -= var23;
				}
			}

		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-565143629"
	)
	int method8314(int var1) {
		return var1 < this.field4786.size() ? this.method8315((class437)this.field4786.get(var1), false) : 0;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lqe;ZI)I",
		garbageValue = "-1493087529"
	)
	int method8315(class437 var1, boolean var2) {
		if (var1.field4794 == '\n') {
			return 0;
		} else if (this.field4788 == 0) {
			int var3 = this.field4785.advances[var1.field4794];
			if (var3 == 0) {
				return var1.field4794 == '\t' ? this.field4785.advances[32] * 3 : this.field4785.advances[32];
			} else {
				return var3;
			}
		} else {
			return this.field4785.advances[42];
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(III)Lue;",
		garbageValue = "-2084091373"
	)
	class520 method8316(int var1, int var2) {
		int var3 = Math.min(var1, var2);
		int var4 = Math.max(var1, var2);
		int var5 = this.field4786.size();
		if (var3 == 0 && var4 == var5) {
			return new class520(0, var5);
		} else {
			int var6 = this.method8317(var3, false);
			int var7 = this.method8318(var4, false);
			int var8;
			switch(this.field4782) {
			case 0:
				if (this.field4781 == 0) {
					return new class520(var6, var5);
				}

				var8 = this.method8317(var3, true);
				return new class520(var8, var5);
			case 1:
				return new class520(0, var5);
			case 2:
				if (this.field4781 == 2) {
					return new class520(0, var7);
				}

				var8 = this.method8318(var4, true);
				return new class520(0, var8);
			default:
				return new class520(0, var5);
			}
		}
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "1710335350"
	)
	int method8317(int var1, boolean var2) {
		if (var1 < this.field4786.size()) {
			int var3 = ((class437)this.field4786.get(var1)).field4795;

			for (int var4 = var1; var4 > 0; --var4) {
				if (((class437)this.field4786.get(var4 - 1)).field4795 < var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class437)this.field4786.get(var4 - 1)).field4795;
				}
			}
		}

		return 0;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "1157148875"
	)
	int method8318(int var1, boolean var2) {
		if (var1 < this.field4786.size()) {
			int var3 = ((class437)this.field4786.get(var1)).field4795;

			for (int var4 = var1; var4 < this.field4786.size() - 1; ++var4) {
				if (((class437)this.field4786.get(var4 + 1)).field4795 > var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class437)this.field4786.get(var4 + 1)).field4795;
				}
			}
		}

		return this.field4786.size();
	}
}
