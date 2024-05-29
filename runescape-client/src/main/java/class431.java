import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qw")
public class class431 {
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 70421391
	)
	int field4735;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1116390161
	)
	int field4726;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 165652517
	)
	int field4737;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1941414583
	)
	int field4738;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 606194281
	)
	int field4739;
	@ObfuscatedName("ad")
	boolean field4740;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	AbstractFont field4731;
	@ObfuscatedName("an")
	ArrayList field4742;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1715301841
	)
	int field4736;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 689064625
	)
	int field4744;

	public class431() {
		this.field4735 = Integer.MAX_VALUE;
		this.field4726 = Integer.MAX_VALUE;
		this.field4737 = 0;
		this.field4738 = 0;
		this.field4739 = 0;
		this.field4740 = true;
		this.field4742 = new ArrayList();
		this.field4736 = 0;
		this.field4744 = 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqo;",
		garbageValue = "111"
	)
	public class433 method7995(int var1) {
		return (class433)this.field4742.get(var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Lqo;",
		garbageValue = "0"
	)
	class433 method7996() {
		return this.field4742.size() == 0 ? null : (class433)this.field4742.get(this.field4742.size() - 1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "285809855"
	)
	public boolean method7997() {
		return this.field4742.size() == 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "10"
	)
	boolean method7998() {
		return this.field4726 > 1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1464220360"
	)
	public int method8050() {
		return this.field4742.size();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-540956589"
	)
	public String method8000() {
		if (this.method7997()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method8050());

			for (int var2 = 0; var2 < this.method8050(); ++var2) {
				class433 var3 = this.method7995(var2);
				var1.append(var3.field4749);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-6"
	)
	public void method8001(int var1) {
		if (this.field4731 != null && var1 < this.field4731.ascent * 2) {
			var1 = Integer.MAX_VALUE;
		}

		if (this.field4735 != var1) {
			this.field4735 = var1;
			this.method8029();
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-286893188"
	)
	public void method8002(int var1) {
		if (this.field4726 != var1) {
			this.field4726 = var1;
			this.method8029();
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1570265335"
	)
	public void method8003(int var1) {
		if (this.field4744 != var1) {
			this.field4744 = var1;
			this.method8029();
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)V",
		garbageValue = "-781096856"
	)
	public void method8004(AbstractFont var1) {
		if (var1 != this.field4731) {
			this.field4731 = var1;
			if (this.field4731 != null) {
				if (this.field4739 == 0) {
					this.field4739 = this.field4731.ascent;
				}

				if (!this.method7997()) {
					this.method8029();
				}
			}
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "394070821"
	)
	public void method8005(int var1) {
		if (this.field4736 != var1) {
			this.field4736 = var1;
			this.method8029();
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "381440295"
	)
	public boolean method8006(int var1, int var2) {
		if (this.field4737 != var1 || var2 != this.field4738) {
			this.field4737 = var1;
			this.field4738 = var2;
			this.method8029();
		}

		return true;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	public void method8045(int var1) {
		if (this.field4739 != var1) {
			this.field4739 = var1;
			this.method8029();
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)Lqv;",
		garbageValue = "1217416503"
	)
	public class435 method8008(int var1, int var2) {
		if (var2 == var1) {
			return new class435(this, 0, 0);
		} else if (var1 <= this.field4742.size() && var2 <= this.field4742.size()) {
			return var2 < var1 ? new class435(this, var2, var1) : new class435(this, var1, var2);
		} else {
			return new class435(this, 0, 0);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(CIII)Lqs;",
		garbageValue = "1282623596"
	)
	public class432 method8095(char var1, int var2, int var3) {
		return this.method8010(Character.toString(var1), var2, var3);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;III)Lqs;",
		garbageValue = "2120745423"
	)
	public class432 method8010(String var1, int var2, int var3) {
		if (var3 == 0) {
			var3 = Integer.MAX_VALUE;
		}

		int var4 = var2;
		if (this.field4742.size() >= var3) {
			this.method8030(var2, var2);
			return new class432(var2, true);
		} else {
			this.field4742.ensureCapacity(this.field4742.size() + var1.length());

			for (int var5 = 0; var5 < var1.length() && this.field4742.size() < var3; ++var5) {
				class433 var6 = new class433();
				var6.field4749 = var1.charAt(var5);
				this.field4742.add(var4, var6);
				++var4;
			}

			this.method8030(var2, var4);
			if (this.field4726 != 0 && this.method8035() > this.field4726) {
				while (var4 != var2) {
					--var4;
					this.method8065(var4);
					if (this.method8035() <= this.field4726) {
						break;
					}
				}

				return new class432(var4, true);
			} else {
				return new class432(var4, false);
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lqs;",
		garbageValue = "55026336"
	)
	class432 method8011(String var1, int var2) {
		return this.method8010(var1, this.field4742.size(), var2);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Lqs;",
		garbageValue = "-98"
	)
	public class432 method8044(String var1) {
		this.method8013();
		return this.method8011(var1, 0);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "3607503"
	)
	void method8013() {
		this.field4742.clear();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "355870964"
	)
	public int method8065(int var1) {
		return this.method8015(var1, var1 + 1);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "382848676"
	)
	public int method8015(int var1, int var2) {
		int var3;
		if (var2 < var1) {
			var3 = var2;
			var2 = var1;
			var1 = var3;
		}

		this.field4742.subList(var1, var2).clear();
		var3 = var1;
		if (this.method7998() && this.field4736 == 1) {
			while (var3 > 0) {
				--var3;
				char var4 = ((class433)this.field4742.get(var3)).field4749;
				if (var4 == ' ' || var4 == '\t') {
					break;
				}
			}
		}

		this.method8030(var3, var2);
		return var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-12538087"
	)
	public int method8016(int var1, int var2) {
		if (this.field4731 == null) {
			return 0;
		} else if (this.method7998() && var1 > this.field4735) {
			return this.field4742.size();
		} else {
			if (!this.field4742.isEmpty()) {
				for (int var3 = 0; var3 < this.field4742.size(); ++var3) {
					class433 var4 = (class433)this.field4742.get(var3);
					if (var2 <= var4.field4751 + this.method8020()) {
						if (var2 < var4.field4751) {
							break;
						}

						if (var1 < var4.field4750) {
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (var3 + 1 != this.field4742.size() && ((class433)this.field4742.get(var3 + 1)).field4751 != var4.field4751) {
							int var5 = this.method8032((class433)this.field4742.get(var3), false);
							if (var1 < var5 + var4.field4750) {
								return var3;
							}

							if (var2 <= var4.field4751 + this.method8020()) {
								return var3 + 1;
							}
						}
					}
				}

				class433 var6 = (class433)this.field4742.get(this.field4742.size() - 1);
				if (var1 >= var6.field4750 && var1 <= var6.field4750 + this.method8081() && var2 >= var6.field4751 && var2 <= var6.field4751 + this.method8020()) {
					return this.field4742.size() - 1;
				}
			}

			return this.field4742.size();
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1661266526"
	)
	public int method8017(int var1, int var2) {
		if (this.field4731 != null && !this.method7997() && var1 <= this.field4742.size()) {
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
				class433 var6 = (class433)this.field4742.get(var1 - 1);
				var4 = var6.field4750 + this.method8031(var1 - 1);
				var5 = var6.field4751;
			} else if (var3 == -1 && var1 == 0) {
				return 0;
			}

			int var14 = 16777215;
			int var7 = 0;
			int var8 = var1;
			int var9 = 16777215;
			int var10 = var3 == 1 ? this.field4742.size() + 1 : 0;

			for (int var11 = var3 + var1; var10 != var11; var11 += var3) {
				class433 var12 = (class433)this.field4742.get(var11 - 1);
				if (var5 != var12.field4751) {
					++var7;
					var5 = var12.field4751;
					if (var7 > var2) {
						return var8;
					}
				}

				if (var7 == var2) {
					int var13 = Math.abs(var12.field4750 + this.method8031(var11 - 1) - var4);
					if (var13 >= var9) {
						return var8;
					}

					var8 = var11;
					var9 = var13;
				}
			}

			if (var3 == 1) {
				return this.field4742.size();
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-59"
	)
	public int method8018() {
		if (!this.field4742.isEmpty() && this.method8035() == 1) {
			return this.field4742.isEmpty() ? 0 : ((class433)this.field4742.get(this.field4742.size() - 1)).field4750 + this.method8081();
		} else {
			int var1 = -1;
			int var2 = 0;

			for (int var3 = this.field4742.size() - 1; var3 >= 0; --var3) {
				class433 var4 = (class433)this.field4742.get(var3);
				if (var1 != var4.field4751) {
					int var5 = this.method8032(var4, false) + var4.field4750;
					var2 = Math.max(var5, var2);
					var1 = var4.field4751;
				}
			}

			return var2;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1602894459"
	)
	public int method8075() {
		return this.method7997() ? 0 : this.field4731.ascent + ((class433)this.field4742.get(this.field4742.size() - 1)).field4751;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-298646312"
	)
	public int method8020() {
		return this.field4739;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "18"
	)
	public int method8035() {
		return this.method8075() / this.field4731.ascent;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-63"
	)
	int method8081() {
		return this.method7997() ? 0 : this.method8032((class433)this.field4742.get(this.field4742.size() - 1), false);
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "103"
	)
	public int method8023() {
		return this.field4735;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-805790122"
	)
	public int method8024() {
		return this.field4726;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	public int method8007() {
		return this.field4736;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1717407572"
	)
	public int method8026() {
		return this.field4744;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-771143131"
	)
	public int method8027(int var1) {
		switch(this.field4737) {
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

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "-4405"
	)
	public int method8028(int var1) {
		switch(this.field4738) {
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

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-85321086"
	)
	void method8029() {
		this.method8030(0, this.field4742.size());
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "-7203"
	)
	void method8030(int var1, int var2) {
		if (!this.method7997() && this.field4731 != null) {
			class516 var3 = this.method8033(var1, var2);
			boolean var4 = (Integer)var3.field5199 == 0 && (Integer)var3.field5198 == this.field4742.size();
			int var5 = (Integer)var3.field5199;
			int var6 = 0;
			int var7 = var4 ? 0 : ((class433)this.field4742.get((Integer)var3.field5199)).field4751;
			int var8 = 0;

			int var9;
			for (var9 = (Integer)var3.field5199; var9 <= (Integer)var3.field5198; ++var9) {
				boolean var10 = var9 >= this.field4742.size();
				class433 var21 = (class433)this.field4742.get(!var10 ? var9 : this.field4742.size() - 1);
				int var22 = !var10 ? this.method8032(var21, false) : 0;
				boolean var13 = !var10 && var21.field4749 == '\n';
				boolean var14 = !var10 && this.method7998() && var6 + var22 > this.field4735;
				if (var13 || var14 || var10) {
					int var15 = var9;
					int var16 = 0;
					int var17;
					int var18;
					class433 var19;
					if (var14) {
						var17 = 0;
						if (this.field4736 == 1) {
							for (var18 = var9; var18 > var5; --var18) {
								var19 = (class433)this.field4742.get(var18);
								var17 += var18 < var15 ? this.method8032(var19, false) : 0;
								if (var19.field4749 == ' ' || var19.field4749 == '\n') {
									var15 = var18;
									var6 -= var17;
									var16 = var17;
									break;
								}
							}
						}
					}

					var17 = -this.method8027(var6);

					for (var18 = var5; var18 < var15; ++var18) {
						var19 = (class433)this.field4742.get(var18);
						int var20 = this.method8032(var19, false);
						var19.field4750 = var17;
						var19.field4751 = var7;
						var17 += var20;
					}

					var5 = var15;
					var6 = var16;
					var7 += this.method8020();
					++var8;
				}

				var6 += !var10 ? var22 : 0;
			}

			if (this.field4738 != 0 && var4) {
				var9 = var8 * this.method8020();
				int var23 = this.method8028(var9);

				for (int var11 = 0; var11 < this.field4742.size(); ++var11) {
					class433 var12 = (class433)this.field4742.get(var11);
					var12.field4751 -= var23;
				}
			}

		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "6"
	)
	int method8031(int var1) {
		return var1 < this.field4742.size() ? this.method8032((class433)this.field4742.get(var1), false) : 0;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lqo;ZB)I",
		garbageValue = "10"
	)
	int method8032(class433 var1, boolean var2) {
		if (var1.field4749 == '\n') {
			return 0;
		} else if (this.field4744 == 0) {
			int var3 = this.field4731.advances[var1.field4749];
			if (var3 == 0) {
				return var1.field4749 == '\t' ? this.field4731.advances[32] * 3 : this.field4731.advances[32];
			} else {
				return var3;
			}
		} else {
			return this.field4731.advances[42];
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lto;",
		garbageValue = "-46"
	)
	class516 method8033(int var1, int var2) {
		int var3 = Math.min(var1, var2);
		int var4 = Math.max(var1, var2);
		int var5 = this.field4742.size();
		if (var3 == 0 && var4 == var5) {
			return new class516(0, var5);
		} else {
			int var6 = this.method8034(var3, false);
			int var7 = this.method8099(var4, false);
			int var8;
			switch(this.field4738) {
			case 0:
				if (this.field4737 == 0) {
					return new class516(var6, var5);
				}

				var8 = this.method8034(var3, true);
				return new class516(var8, var5);
			case 1:
				return new class516(0, var5);
			case 2:
				if (this.field4737 == 2) {
					return new class516(0, var7);
				}

				var8 = this.method8099(var4, true);
				return new class516(0, var8);
			default:
				return new class516(0, var5);
			}
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-1861748468"
	)
	int method8034(int var1, boolean var2) {
		if (var1 < this.field4742.size()) {
			int var3 = ((class433)this.field4742.get(var1)).field4751;

			for (int var4 = var1; var4 > 0; --var4) {
				if (((class433)this.field4742.get(var4 - 1)).field4751 < var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class433)this.field4742.get(var4 - 1)).field4751;
				}
			}
		}

		return 0;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-1771710175"
	)
	int method8099(int var1, boolean var2) {
		if (var1 < this.field4742.size()) {
			int var3 = ((class433)this.field4742.get(var1)).field4751;

			for (int var4 = var1; var4 < this.field4742.size() - 1; ++var4) {
				if (((class433)this.field4742.get(var4 + 1)).field4751 > var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class433)this.field4742.get(var4 + 1)).field4751;
				}
			}
		}

		return this.field4742.size();
	}
}
