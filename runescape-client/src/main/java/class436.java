import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ql")
public class class436 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -488962989
	)
	int field4821;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1509907247
	)
	int field4831;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1127878367
	)
	int field4829;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 833808137
	)
	int field4830;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -351902059
	)
	int field4836;
	@ObfuscatedName("av")
	boolean field4832;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lqa;"
	)
	AbstractFont field4833;
	@ObfuscatedName("aq")
	ArrayList field4818;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1590781633
	)
	int field4825;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1391543025
	)
	int field4834;

	public class436() {
		this.field4821 = Integer.MAX_VALUE;
		this.field4831 = Integer.MAX_VALUE;
		this.field4829 = 0;
		this.field4830 = 0;
		this.field4836 = 0;
		this.field4832 = true;
		this.field4818 = new ArrayList();
		this.field4825 = 0;
		this.field4834 = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Lqm;",
		garbageValue = "-499972178"
	)
	public class438 method8444(int var1) {
		return (class438)this.field4818.get(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lqm;",
		garbageValue = "-1714403207"
	)
	class438 method8411() {
		return this.field4818.size() == 0 ? null : (class438)this.field4818.get(this.field4818.size() - 1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1315777449"
	)
	public boolean method8412() {
		return this.field4818.size() == 0;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "8"
	)
	boolean method8413() {
		return this.field4831 > 1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-1478"
	)
	public int method8414() {
		return this.field4818.size();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "800425151"
	)
	public String method8415() {
		if (this.method8412()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method8414());

			for (int var2 = 0; var2 < this.method8414(); ++var2) {
				class438 var3 = this.method8444(var2);
				var1.append(var3.field4839);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2010190062"
	)
	public void method8506(int var1) {
		if (this.field4833 != null && var1 < this.field4833.ascent * 2) {
			var1 = Integer.MAX_VALUE;
		}

		if (this.field4821 != var1) {
			this.field4821 = var1;
			this.method8458();
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1192969865"
	)
	public void method8417(int var1) {
		if (this.field4831 != var1) {
			this.field4831 = var1;
			this.method8458();
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1175712138"
	)
	public void method8425(int var1) {
		if (this.field4834 != var1) {
			this.field4834 = var1;
			this.method8458();
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lqa;B)V",
		garbageValue = "76"
	)
	public void method8477(AbstractFont var1) {
		if (var1 != this.field4833) {
			this.field4833 = var1;
			if (this.field4833 != null) {
				if (this.field4836 == 0) {
					this.field4836 = this.field4833.ascent;
				}

				if (!this.method8412()) {
					this.method8458();
				}
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	public void method8409(int var1) {
		if (this.field4825 != var1) {
			this.field4825 = var1;
			this.method8458();
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-95"
	)
	public boolean method8421(int var1, int var2) {
		if (this.field4829 != var1 || var2 != this.field4830) {
			this.field4829 = var1;
			this.field4830 = var2;
			this.method8458();
		}

		return true;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "916192412"
	)
	public void method8422(int var1) {
		if (this.field4836 != var1) {
			this.field4836 = var1;
			this.method8458();
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lqb;",
		garbageValue = "-85"
	)
	public class440 method8423(int var1, int var2) {
		if (var2 == var1) {
			return new class440(this, 0, 0);
		} else if (var1 <= this.field4818.size() && var2 <= this.field4818.size()) {
			return var2 < var1 ? new class440(this, var2, var1) : new class440(this, var1, var2);
		} else {
			return new class440(this, 0, 0);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(CIII)Lqd;",
		garbageValue = "747339975"
	)
	public class437 method8410(char var1, int var2, int var3) {
		return this.method8476(Character.toString(var1), var2, var3);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIB)Lqd;",
		garbageValue = "19"
	)
	public class437 method8476(String var1, int var2, int var3) {
		if (var3 == 0) {
			var3 = Integer.MAX_VALUE;
		}

		int var4 = var2;
		if (this.field4818.size() >= var3) {
			this.method8445(var2, var2);
			return new class437(var2, true);
		} else {
			this.field4818.ensureCapacity(this.field4818.size() + var1.length());

			for (int var5 = 0; var5 < var1.length() && this.field4818.size() < var3; ++var5) {
				class438 var6 = new class438();
				var6.field4839 = var1.charAt(var5);
				this.field4818.add(var4, var6);
				++var4;
			}

			this.method8445(var2, var4);
			if (this.field4831 != 0 && this.method8436() > this.field4831) {
				while (var4 != var2) {
					--var4;
					this.method8429(var4);
					if (this.method8436() <= this.field4831) {
						break;
					}
				}

				return new class437(var4, true);
			} else {
				return new class437(var4, false);
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lqd;",
		garbageValue = "991801761"
	)
	class437 method8488(String var1, int var2) {
		return this.method8476(var1, this.field4818.size(), var2);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lqd;",
		garbageValue = "1503214666"
	)
	public class437 method8427(String var1) {
		this.method8428();
		return this.method8488(var1, 0);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1242250643"
	)
	void method8428() {
		this.field4818.clear();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "100139959"
	)
	public int method8429(int var1) {
		return this.method8521(var1, var1 + 1);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1737897204"
	)
	public int method8521(int var1, int var2) {
		int var3;
		if (var2 < var1) {
			var3 = var2;
			var2 = var1;
			var1 = var3;
		}

		this.field4818.subList(var1, var2).clear();
		var3 = var1;
		if (this.method8413() && this.field4825 == 1) {
			while (var3 > 0) {
				--var3;
				char var4 = ((class438)this.field4818.get(var3)).field4839;
				if (var4 == ' ' || var4 == '\t') {
					break;
				}
			}
		}

		this.method8445(var3, var2);
		return var1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1476498838"
	)
	public int method8431(int var1, int var2) {
		if (this.field4833 == null) {
			return 0;
		} else if (this.method8413() && var1 > this.field4821) {
			return this.field4818.size();
		} else {
			if (!this.field4818.isEmpty()) {
				for (int var3 = 0; var3 < this.field4818.size(); ++var3) {
					class438 var4 = (class438)this.field4818.get(var3);
					if (var2 <= var4.field4841 + this.method8435()) {
						if (var2 < var4.field4841) {
							break;
						}

						if (var1 < var4.field4840) {
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (var3 + 1 != this.field4818.size() && ((class438)this.field4818.get(1 + var3)).field4841 != var4.field4841) {
							int var5 = this.method8447((class438)this.field4818.get(var3), false);
							if (var1 < var5 + var4.field4840) {
								return var3;
							}

							if (var2 <= var4.field4841 + this.method8435()) {
								return var3 + 1;
							}
						}
					}
				}

				class438 var6 = (class438)this.field4818.get(this.field4818.size() - 1);
				if (var1 >= var6.field4840 && var1 <= var6.field4840 + this.method8437() && var2 >= var6.field4841 && var2 <= var6.field4841 + this.method8435()) {
					return this.field4818.size() - 1;
				}
			}

			return this.field4818.size();
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-902087666"
	)
	public int method8432(int var1, int var2) {
		if (this.field4833 != null && !this.method8412() && var1 <= this.field4818.size()) {
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
				class438 var6 = (class438)this.field4818.get(var1 - 1);
				var4 = var6.field4840 + this.method8523(var1 - 1);
				var5 = var6.field4841;
			} else if (var3 == -1 && var1 == 0) {
				return 0;
			}

			int var14 = 16777215;
			int var7 = 0;
			int var8 = var1;
			int var9 = 16777215;
			int var10 = var3 == 1 ? this.field4818.size() + 1 : 0;

			for (int var11 = var3 + var1; var10 != var11; var11 += var3) {
				class438 var12 = (class438)this.field4818.get(var11 - 1);
				if (var5 != var12.field4841) {
					++var7;
					var5 = var12.field4841;
					if (var7 > var2) {
						return var8;
					}
				}

				if (var7 == var2) {
					int var13 = Math.abs(var12.field4840 + this.method8523(var11 - 1) - var4);
					if (var13 >= var9) {
						return var8;
					}

					var8 = var11;
					var9 = var13;
				}
			}

			if (var3 == 1) {
				return this.field4818.size();
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1801806460"
	)
	public int method8433() {
		if (!this.field4818.isEmpty() && this.method8436() == 1) {
			return this.field4818.isEmpty() ? 0 : ((class438)this.field4818.get(this.field4818.size() - 1)).field4840 + this.method8437();
		} else {
			int var1 = -1;
			int var2 = 0;

			for (int var3 = this.field4818.size() - 1; var3 >= 0; --var3) {
				class438 var4 = (class438)this.field4818.get(var3);
				if (var1 != var4.field4841) {
					int var5 = this.method8447(var4, false) + var4.field4840;
					var2 = Math.max(var5, var2);
					var1 = var4.field4841;
				}
			}

			return var2;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-66"
	)
	public int method8430() {
		return this.method8412() ? 0 : this.field4833.ascent + ((class438)this.field4818.get(this.field4818.size() - 1)).field4841;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1716703994"
	)
	public int method8435() {
		return this.field4836;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-559436886"
	)
	public int method8436() {
		return this.method8430() / this.field4833.ascent;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1696443178"
	)
	int method8437() {
		return this.method8412() ? 0 : this.method8447((class438)this.field4818.get(this.field4818.size() - 1), false);
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-219247297"
	)
	public int method8438() {
		return this.field4821;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2139521045"
	)
	public int method8470() {
		return this.field4831;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1896314469"
	)
	public int method8440() {
		return this.field4825;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "811558661"
	)
	public int method8515() {
		return this.field4834;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1709222360"
	)
	public int method8442(int var1) {
		switch(this.field4829) {
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

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1943092066"
	)
	public int method8443(int var1) {
		switch(this.field4830) {
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
		descriptor = "(I)V",
		garbageValue = "1545933570"
	)
	void method8458() {
		this.method8445(0, this.field4818.size());
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1774920026"
	)
	void method8445(int var1, int var2) {
		if (!this.method8412() && this.field4833 != null) {
			class527 var3 = this.method8535(var1, var2);
			boolean var4 = (Integer)var3.field5316 == 0 && (Integer)var3.field5317 == this.field4818.size();
			int var5 = (Integer)var3.field5316;
			int var6 = 0;
			int var7 = var4 ? 0 : ((class438)this.field4818.get((Integer)var3.field5316)).field4841;
			int var8 = 0;

			int var9;
			for (var9 = (Integer)var3.field5316; var9 <= (Integer)var3.field5317; ++var9) {
				boolean var10 = var9 >= this.field4818.size();
				class438 var21 = (class438)this.field4818.get(!var10 ? var9 : this.field4818.size() - 1);
				int var22 = !var10 ? this.method8447(var21, false) : 0;
				boolean var13 = !var10 && var21.field4839 == '\n';
				boolean var14 = !var10 && this.method8413() && var6 + var22 > this.field4821;
				if (var13 || var14 || var10) {
					int var15 = var9;
					int var16 = 0;
					int var17;
					int var18;
					class438 var19;
					if (var14) {
						var17 = 0;
						if (this.field4825 == 1) {
							for (var18 = var9; var18 > var5; --var18) {
								var19 = (class438)this.field4818.get(var18);
								var17 += var18 < var15 ? this.method8447(var19, false) : 0;
								if (var19.field4839 == ' ' || var19.field4839 == '\n') {
									var15 = var18;
									var6 -= var17;
									var16 = var17;
									break;
								}
							}
						}
					}

					var17 = -this.method8442(var6);

					for (var18 = var5; var18 < var15; ++var18) {
						var19 = (class438)this.field4818.get(var18);
						int var20 = this.method8447(var19, false);
						var19.field4840 = var17;
						var19.field4841 = var7;
						var17 += var20;
					}

					var5 = var15;
					var6 = var16;
					var7 += this.method8435();
					++var8;
				}

				var6 += !var10 ? var22 : 0;
			}

			if (this.field4830 != 0 && var4) {
				var9 = var8 * this.method8435();
				int var23 = this.method8443(var9);

				for (int var11 = 0; var11 < this.field4818.size(); ++var11) {
					class438 var12 = (class438)this.field4818.get(var11);
					var12.field4841 -= var23;
				}
			}

		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1387148518"
	)
	int method8523(int var1) {
		return var1 < this.field4818.size() ? this.method8447((class438)this.field4818.get(var1), false) : 0;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(Lqm;ZI)I",
		garbageValue = "-1751669833"
	)
	int method8447(class438 var1, boolean var2) {
		if (var1.field4839 == '\n') {
			return 0;
		} else if (this.field4834 == 0) {
			int var3 = this.field4833.advances[var1.field4839];
			if (var3 == 0) {
				return var1.field4839 == '\t' ? this.field4833.advances[32] * 3 : this.field4833.advances[32];
			} else {
				return var3;
			}
		} else {
			return this.field4833.advances[42];
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(III)Luy;",
		garbageValue = "1866370416"
	)
	class527 method8535(int var1, int var2) {
		int var3 = Math.min(var1, var2);
		int var4 = Math.max(var1, var2);
		int var5 = this.field4818.size();
		if (var3 == 0 && var4 == var5) {
			return new class527(0, var5);
		} else {
			int var6 = this.method8449(var3, false);
			int var7 = this.method8450(var4, false);
			int var8;
			switch(this.field4830) {
			case 0:
				if (this.field4829 == 0) {
					return new class527(var6, var5);
				}

				var8 = this.method8449(var3, true);
				return new class527(var8, var5);
			case 1:
				return new class527(0, var5);
			case 2:
				if (this.field4829 == 2) {
					return new class527(0, var7);
				}

				var8 = this.method8450(var4, true);
				return new class527(0, var8);
			default:
				return new class527(0, var5);
			}
		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "534280745"
	)
	int method8449(int var1, boolean var2) {
		if (var1 < this.field4818.size()) {
			int var3 = ((class438)this.field4818.get(var1)).field4841;

			for (int var4 = var1; var4 > 0; --var4) {
				if (((class438)this.field4818.get(var4 - 1)).field4841 < var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class438)this.field4818.get(var4 - 1)).field4841;
				}
			}
		}

		return 0;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-1821531790"
	)
	int method8450(int var1, boolean var2) {
		if (var1 < this.field4818.size()) {
			int var3 = ((class438)this.field4818.get(var1)).field4841;

			for (int var4 = var1; var4 < this.field4818.size() - 1; ++var4) {
				if (((class438)this.field4818.get(var4 + 1)).field4841 > var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class438)this.field4818.get(var4 + 1)).field4841;
				}
			}
		}

		return this.field4818.size();
	}
}
