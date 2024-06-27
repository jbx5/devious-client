import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ql")
public class class432 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -21565275
	)
	int field4747;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -59088811
	)
	int field4748;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -746841467
	)
	int field4751;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1599545561
	)
	int field4753;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 199041437
	)
	int field4756;
	@ObfuscatedName("as")
	boolean field4752;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lqz;"
	)
	AbstractFont field4740;
	@ObfuscatedName("at")
	ArrayList field4754;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1840112385
	)
	int field4755;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1391544929
	)
	int field4744;

	public class432() {
		this.field4747 = Integer.MAX_VALUE;
		this.field4748 = Integer.MAX_VALUE;
		this.field4751 = 0;
		this.field4753 = 0;
		this.field4756 = 0;
		this.field4752 = true;
		this.field4754 = new ArrayList();
		this.field4755 = 0;
		this.field4744 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqf;",
		garbageValue = "28"
	)
	public class434 method7919(int var1) {
		return (class434)this.field4754.get(var1);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)Lqf;",
		garbageValue = "-648"
	)
	class434 method7999() {
		return this.field4754.size() == 0 ? null : (class434)this.field4754.get(this.field4754.size() - 1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	public boolean method7936() {
		return this.field4754.size() == 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2009455501"
	)
	boolean method7922() {
		return this.field4748 > 1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "113"
	)
	public int method7984() {
		return this.field4754.size();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-98"
	)
	public String method7924() {
		if (this.method7936()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7984());

			for (int var2 = 0; var2 < this.method7984(); ++var2) {
				class434 var3 = this.method7919(var2);
				var1.append(var3.field4763);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	public void method8009(int var1) {
		if (this.field4740 != null && var1 < this.field4740.ascent * 2) {
			var1 = Integer.MAX_VALUE;
		}

		if (this.field4747 != var1) {
			this.field4747 = var1;
			this.method7952();
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-51"
	)
	public void method8030(int var1) {
		if (this.field4748 != var1) {
			this.field4748 = var1;
			this.method7952();
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-23776401"
	)
	public void method7927(int var1) {
		if (this.field4744 != var1) {
			this.field4744 = var1;
			this.method7952();
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lqz;B)V",
		garbageValue = "-51"
	)
	public void method7974(AbstractFont var1) {
		if (var1 != this.field4740) {
			this.field4740 = var1;
			if (this.field4740 != null) {
				if (this.field4756 == 0) {
					this.field4756 = this.field4740.ascent;
				}

				if (!this.method7936()) {
					this.method7952();
				}
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "15"
	)
	public void method7929(int var1) {
		if (this.field4755 != var1) {
			this.field4755 = var1;
			this.method7952();
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1099939946"
	)
	public boolean method8029(int var1, int var2) {
		if (this.field4751 != var1 || var2 != this.field4753) {
			this.field4751 = var1;
			this.field4753 = var2;
			this.method7952();
		}

		return true;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "110"
	)
	public void method7931(int var1) {
		if (this.field4756 != var1) {
			this.field4756 = var1;
			this.method7952();
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lqw;",
		garbageValue = "-39"
	)
	public class436 method7932(int var1, int var2) {
		if (var2 == var1) {
			return new class436(this, 0, 0);
		} else if (var1 <= this.field4754.size() && var2 <= this.field4754.size()) {
			return var2 < var1 ? new class436(this, var2, var1) : new class436(this, var1, var2);
		} else {
			return new class436(this, 0, 0);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(CIIS)Lqk;",
		garbageValue = "2731"
	)
	public class433 method8019(char var1, int var2, int var3) {
		return this.method8045(Character.toString(var1), var2, var3);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;III)Lqk;",
		garbageValue = "-2128379129"
	)
	public class433 method8045(String var1, int var2, int var3) {
		if (var3 == 0) {
			var3 = Integer.MAX_VALUE;
		}

		int var4 = var2;
		if (this.field4754.size() >= var3) {
			this.method7953(var2, var2);
			return new class433(var2, true);
		} else {
			this.field4754.ensureCapacity(this.field4754.size() + var1.length());

			for (int var5 = 0; var5 < var1.length() && this.field4754.size() < var3; ++var5) {
				class434 var6 = new class434();
				var6.field4763 = var1.charAt(var5);
				this.field4754.add(var4, var6);
				++var4;
			}

			this.method7953(var2, var4);
			if (this.field4748 != 0 && this.method8035() > this.field4748) {
				while (var4 != var2) {
					--var4;
					this.method7981(var4);
					if (this.method8035() <= this.field4748) {
						break;
					}
				}

				return new class433(var4, true);
			} else {
				return new class433(var4, false);
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)Lqk;",
		garbageValue = "1"
	)
	class433 method7935(String var1, int var2) {
		return this.method8045(var1, this.field4754.size(), var2);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Lqk;",
		garbageValue = "3"
	)
	public class433 method8040(String var1) {
		this.method8070();
		return this.method7935(var1, 0);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1394688149"
	)
	void method8070() {
		this.field4754.clear();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-110"
	)
	public int method7981(int var1) {
		return this.method7938(var1, var1 + 1);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "26"
	)
	public int method7938(int var1, int var2) {
		int var3;
		if (var2 < var1) {
			var3 = var2;
			var2 = var1;
			var1 = var3;
		}

		this.field4754.subList(var1, var2).clear();
		var3 = var1;
		if (this.method7922() && this.field4755 == 1) {
			while (var3 > 0) {
				--var3;
				char var4 = ((class434)this.field4754.get(var3)).field4763;
				if (var4 == ' ' || var4 == '\t') {
					break;
				}
			}
		}

		this.method7953(var3, var2);
		return var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1082082870"
	)
	public int method7926(int var1, int var2) {
		if (this.field4740 == null) {
			return 0;
		} else if (this.method7922() && var1 > this.field4747) {
			return this.field4754.size();
		} else {
			if (!this.field4754.isEmpty()) {
				for (int var3 = 0; var3 < this.field4754.size(); ++var3) {
					class434 var4 = (class434)this.field4754.get(var3);
					if (var2 <= var4.field4764 + this.method7943()) {
						if (var2 < var4.field4764) {
							break;
						}

						if (var1 < var4.field4766) {
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (1 + var3 != this.field4754.size() && ((class434)this.field4754.get(var3 + 1)).field4764 != var4.field4764) {
							int var5 = this.method7955((class434)this.field4754.get(var3), false);
							if (var1 < var5 + var4.field4766) {
								return var3;
							}

							if (var2 <= var4.field4764 + this.method7943()) {
								return var3 + 1;
							}
						}
					}
				}

				class434 var6 = (class434)this.field4754.get(this.field4754.size() - 1);
				if (var1 >= var6.field4766 && var1 <= var6.field4766 + this.method7994() && var2 >= var6.field4764 && var2 <= var6.field4764 + this.method7943()) {
					return this.field4754.size() - 1;
				}
			}

			return this.field4754.size();
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "42"
	)
	public int method7940(int var1, int var2) {
		if (this.field4740 != null && !this.method7936() && var1 <= this.field4754.size()) {
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
				class434 var6 = (class434)this.field4754.get(var1 - 1);
				var4 = var6.field4766 + this.method8043(var1 - 1);
				var5 = var6.field4764;
			} else if (var3 == -1 && var1 == 0) {
				return 0;
			}

			int var14 = 16777215;
			int var7 = 0;
			int var8 = var1;
			int var9 = 16777215;
			int var10 = var3 == 1 ? this.field4754.size() + 1 : 0;

			for (int var11 = var3 + var1; var11 != var10; var11 += var3) {
				class434 var12 = (class434)this.field4754.get(var11 - 1);
				if (var5 != var12.field4764) {
					++var7;
					var5 = var12.field4764;
					if (var7 > var2) {
						return var8;
					}
				}

				if (var7 == var2) {
					int var13 = Math.abs(var12.field4766 + this.method8043(var11 - 1) - var4);
					if (var13 >= var9) {
						return var8;
					}

					var8 = var11;
					var9 = var13;
				}
			}

			if (var3 == 1) {
				return this.field4754.size();
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-266636187"
	)
	public int method7941() {
		if (!this.field4754.isEmpty() && this.method8035() == 1) {
			return this.field4754.isEmpty() ? 0 : ((class434)this.field4754.get(this.field4754.size() - 1)).field4766 + this.method7994();
		} else {
			int var1 = -1;
			int var2 = 0;

			for (int var3 = this.field4754.size() - 1; var3 >= 0; --var3) {
				class434 var4 = (class434)this.field4754.get(var3);
				if (var1 != var4.field4764) {
					int var5 = this.method7955(var4, false) + var4.field4766;
					var2 = Math.max(var5, var2);
					var1 = var4.field4764;
				}
			}

			return var2;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1720822945"
	)
	public int method7942() {
		return this.method7936() ? 0 : this.field4740.ascent + ((class434)this.field4754.get(this.field4754.size() - 1)).field4764;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-61"
	)
	public int method7943() {
		return this.field4756;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-8"
	)
	public int method8035() {
		return this.method7942() / this.field4740.ascent;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1587256532"
	)
	int method7994() {
		return this.method7936() ? 0 : this.method7955((class434)this.field4754.get(this.field4754.size() - 1), false);
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-448656674"
	)
	public int method7944() {
		return this.field4747;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "89"
	)
	public int method7993() {
		return this.field4748;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "25354"
	)
	public int method7948() {
		return this.field4755;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "873450139"
	)
	public int method7949() {
		return this.field4744;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-73"
	)
	public int method8059(int var1) {
		switch(this.field4751) {
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

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2086051673"
	)
	public int method7928(int var1) {
		switch(this.field4753) {
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

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1780781047"
	)
	void method7952() {
		this.method7953(0, this.field4754.size());
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-656423559"
	)
	void method7953(int var1, int var2) {
		if (!this.method7936() && this.field4740 != null) {
			class517 var3 = this.method7956(var1, var2);
			boolean var4 = (Integer)var3.field5225 == 0 && (Integer)var3.field5222 == this.field4754.size();
			int var5 = (Integer)var3.field5225;
			int var6 = 0;
			int var7 = var4 ? 0 : ((class434)this.field4754.get((Integer)var3.field5225)).field4764;
			int var8 = 0;

			int var9;
			for (var9 = (Integer)var3.field5225; var9 <= (Integer)var3.field5222; ++var9) {
				boolean var10 = var9 >= this.field4754.size();
				class434 var21 = (class434)this.field4754.get(!var10 ? var9 : this.field4754.size() - 1);
				int var22 = !var10 ? this.method7955(var21, false) : 0;
				boolean var13 = !var10 && var21.field4763 == '\n';
				boolean var14 = !var10 && this.method7922() && var6 + var22 > this.field4747;
				if (var13 || var14 || var10) {
					int var15 = var9;
					int var16 = 0;
					int var17;
					int var18;
					class434 var19;
					if (var14) {
						var17 = 0;
						if (this.field4755 == 1) {
							for (var18 = var9; var18 > var5; --var18) {
								var19 = (class434)this.field4754.get(var18);
								var17 += var18 < var15 ? this.method7955(var19, false) : 0;
								if (var19.field4763 == ' ' || var19.field4763 == '\n') {
									var15 = var18;
									var6 -= var17;
									var16 = var17;
									break;
								}
							}
						}
					}

					var17 = -this.method8059(var6);

					for (var18 = var5; var18 < var15; ++var18) {
						var19 = (class434)this.field4754.get(var18);
						int var20 = this.method7955(var19, false);
						var19.field4766 = var17;
						var19.field4764 = var7;
						var17 += var20;
					}

					var5 = var15;
					var6 = var16;
					var7 += this.method7943();
					++var8;
				}

				var6 += !var10 ? var22 : 0;
			}

			if (this.field4753 != 0 && var4) {
				var9 = var8 * this.method7943();
				int var23 = this.method7928(var9);

				for (int var11 = 0; var11 < this.field4754.size(); ++var11) {
					class434 var12 = (class434)this.field4754.get(var11);
					var12.field4764 -= var23;
				}
			}

		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-816906531"
	)
	int method8043(int var1) {
		return var1 < this.field4754.size() ? this.method7955((class434)this.field4754.get(var1), false) : 0;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lqf;ZB)I",
		garbageValue = "27"
	)
	int method7955(class434 var1, boolean var2) {
		if (var1.field4763 == '\n') {
			return 0;
		} else if (this.field4744 == 0) {
			int var3 = this.field4740.advances[var1.field4763];
			if (var3 == 0) {
				return var1.field4763 == '\t' ? this.field4740.advances[32] * 3 : this.field4740.advances[32];
			} else {
				return var3;
			}
		} else {
			return this.field4740.advances[42];
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(III)Ltu;",
		garbageValue = "2141372027"
	)
	class517 method7956(int var1, int var2) {
		int var3 = Math.min(var1, var2);
		int var4 = Math.max(var1, var2);
		int var5 = this.field4754.size();
		if (var3 == 0 && var4 == var5) {
			return new class517(0, var5);
		} else {
			int var6 = this.method7957(var3, false);
			int var7 = this.method7958(var4, false);
			int var8;
			switch(this.field4753) {
			case 0:
				if (this.field4751 == 0) {
					return new class517(var6, var5);
				}

				var8 = this.method7957(var3, true);
				return new class517(var8, var5);
			case 1:
				return new class517(0, var5);
			case 2:
				if (this.field4751 == 2) {
					return new class517(0, var7);
				}

				var8 = this.method7958(var4, true);
				return new class517(0, var8);
			default:
				return new class517(0, var5);
			}
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "2020988141"
	)
	int method7957(int var1, boolean var2) {
		if (var1 < this.field4754.size()) {
			int var3 = ((class434)this.field4754.get(var1)).field4764;

			for (int var4 = var1; var4 > 0; --var4) {
				if (((class434)this.field4754.get(var4 - 1)).field4764 < var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class434)this.field4754.get(var4 - 1)).field4764;
				}
			}
		}

		return 0;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-330254717"
	)
	int method7958(int var1, boolean var2) {
		if (var1 < this.field4754.size()) {
			int var3 = ((class434)this.field4754.get(var1)).field4764;

			for (int var4 = var1; var4 < this.field4754.size() - 1; ++var4) {
				if (((class434)this.field4754.get(var4 + 1)).field4764 > var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class434)this.field4754.get(var4 + 1)).field4764;
				}
			}
		}

		return this.field4754.size();
	}

	@ObfuscatedName("ag")
	static int method8071(long var0) {
		return (int)(var0 >>> 7 & 127L);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lvp;J)V"
	)
	static void method8013(Buffer var0, long var1) {
		var1 /= 10L;
		if (var1 < 0L) {
			var1 = 0L;
		} else if (var1 > 65535L) {
			var1 = 65535L;
		}

		var0.writeShort((int)var1);
	}
}
