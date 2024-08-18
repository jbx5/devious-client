import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qd")
public class class433 {
	@ObfuscatedName("cp")
	static String field4740;
	@ObfuscatedName("ke")
	@ObfuscatedGetter(
		intValue = -1662123705
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 2088693905
	)
	int field4730;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 87341953
	)
	int field4741;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1162923259
	)
	int field4733;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1859059377
	)
	int field4723;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1464135467
	)
	int field4734;
	@ObfuscatedName("ar")
	boolean field4736;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	AbstractFont field4727;
	@ObfuscatedName("ak")
	ArrayList field4731;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1889602621
	)
	int field4732;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -499219025
	)
	int field4739;

	public class433() {
		this.field4730 = Integer.MAX_VALUE;
		this.field4741 = Integer.MAX_VALUE;
		this.field4733 = 0;
		this.field4723 = 0;
		this.field4734 = 0;
		this.field4736 = true;
		this.field4731 = new ArrayList();
		this.field4732 = 0;
		this.field4739 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lqu;",
		garbageValue = "612431775"
	)
	public class435 method8017(int var1) {
		return (class435)this.field4731.get(var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Lqu;",
		garbageValue = "0"
	)
	class435 method8018() {
		return this.field4731.size() == 0 ? null : (class435)this.field4731.get(this.field4731.size() - 1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "14824"
	)
	public boolean method8019() {
		return this.field4731.size() == 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1905530410"
	)
	boolean method8020() {
		return this.field4741 > 1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-65"
	)
	public int method8021() {
		return this.field4731.size();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "0"
	)
	public String method8107() {
		if (this.method8019()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method8021());

			for (int var2 = 0; var2 < this.method8021(); ++var2) {
				class435 var3 = this.method8017(var2);
				var1.append(var3.field4747);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "49"
	)
	public void method8023(int var1) {
		if (this.field4727 != null && var1 < this.field4727.ascent * 2) {
			var1 = Integer.MAX_VALUE;
		}

		if (this.field4730 != var1) {
			this.field4730 = var1;
			this.method8051();
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "973840843"
	)
	public void method8144(int var1) {
		if (this.field4741 != var1) {
			this.field4741 = var1;
			this.method8051();
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1828744557"
	)
	public void method8025(int var1) {
		if (this.field4739 != var1) {
			this.field4739 = var1;
			this.method8051();
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lqv;B)V",
		garbageValue = "9"
	)
	public void method8026(AbstractFont var1) {
		if (var1 != this.field4727) {
			this.field4727 = var1;
			if (this.field4727 != null) {
				if (this.field4734 == 0) {
					this.field4734 = this.field4727.ascent;
				}

				if (!this.method8019()) {
					this.method8051();
				}
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "63880644"
	)
	public void method8027(int var1) {
		if (this.field4732 != var1) {
			this.field4732 = var1;
			this.method8051();
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1855304857"
	)
	public boolean method8028(int var1, int var2) {
		if (this.field4733 != var1 || var2 != this.field4723) {
			this.field4733 = var1;
			this.field4723 = var2;
			this.method8051();
		}

		return true;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-130650418"
	)
	public void method8123(int var1) {
		if (this.field4734 != var1) {
			this.field4734 = var1;
			this.method8051();
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lqx;",
		garbageValue = "43"
	)
	public class437 method8099(int var1, int var2) {
		if (var2 == var1) {
			return new class437(this, 0, 0);
		} else if (var1 <= this.field4731.size() && var2 <= this.field4731.size()) {
			return var2 < var1 ? new class437(this, var2, var1) : new class437(this, var1, var2);
		} else {
			return new class437(this, 0, 0);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(CIII)Lqg;",
		garbageValue = "2147442647"
	)
	public class434 method8016(char var1, int var2, int var3) {
		return this.method8032(Character.toString(var1), var2, var3);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;III)Lqg;",
		garbageValue = "1777395016"
	)
	public class434 method8032(String var1, int var2, int var3) {
		if (var3 == 0) {
			var3 = Integer.MAX_VALUE;
		}

		int var4 = var2;
		if (this.field4731.size() >= var3) {
			this.method8052(var2, var2);
			return new class434(var2, true);
		} else {
			this.field4731.ensureCapacity(this.field4731.size() + var1.length());

			for (int var5 = 0; var5 < var1.length() && this.field4731.size() < var3; ++var5) {
				class435 var6 = new class435();
				var6.field4747 = var1.charAt(var5);
				this.field4731.add(var4, var6);
				++var4;
			}

			this.method8052(var2, var4);
			if (this.field4741 != 0 && this.method8089() > this.field4741) {
				while (var4 != var2) {
					--var4;
					this.method8036(var4);
					if (this.method8089() <= this.field4741) {
						break;
					}
				}

				return new class434(var4, true);
			} else {
				return new class434(var4, false);
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)Lqg;",
		garbageValue = "-26"
	)
	class434 method8033(String var1, int var2) {
		return this.method8032(var1, this.field4731.size(), var2);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lqg;",
		garbageValue = "1398554069"
	)
	public class434 method8034(String var1) {
		this.method8035();
		return this.method8033(var1, 0);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2043748056"
	)
	void method8035() {
		this.field4731.clear();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2107090462"
	)
	public int method8036(int var1) {
		return this.method8057(var1, var1 + 1);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1243599387"
	)
	public int method8057(int var1, int var2) {
		int var3;
		if (var2 < var1) {
			var3 = var2;
			var2 = var1;
			var1 = var3;
		}

		this.field4731.subList(var1, var2).clear();
		var3 = var1;
		if (this.method8020() && this.field4732 == 1) {
			while (var3 > 0) {
				--var3;
				char var4 = ((class435)this.field4731.get(var3)).field4747;
				if (var4 == ' ' || var4 == '\t') {
					break;
				}
			}
		}

		this.method8052(var3, var2);
		return var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1111638528"
	)
	public int method8065(int var1, int var2) {
		if (this.field4727 == null) {
			return 0;
		} else if (this.method8020() && var1 > this.field4730) {
			return this.field4731.size();
		} else {
			if (!this.field4731.isEmpty()) {
				for (int var3 = 0; var3 < this.field4731.size(); ++var3) {
					class435 var4 = (class435)this.field4731.get(var3);
					if (var2 <= var4.field4746 + this.method8146()) {
						if (var2 < var4.field4746) {
							break;
						}

						if (var1 < var4.field4744) {
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (1 + var3 != this.field4731.size() && ((class435)this.field4731.get(var3 + 1)).field4746 != var4.field4746) {
							int var5 = this.method8054((class435)this.field4731.get(var3), false);
							if (var1 < var5 + var4.field4744) {
								return var3;
							}

							if (var2 <= var4.field4746 + this.method8146()) {
								return var3 + 1;
							}
						}
					}
				}

				class435 var6 = (class435)this.field4731.get(this.field4731.size() - 1);
				if (var1 >= var6.field4744 && var1 <= var6.field4744 + this.method8049() && var2 >= var6.field4746 && var2 <= var6.field4746 + this.method8146()) {
					return this.field4731.size() - 1;
				}
			}

			return this.field4731.size();
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1078052244"
	)
	public int method8039(int var1, int var2) {
		if (this.field4727 != null && !this.method8019() && var1 <= this.field4731.size()) {
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
				class435 var6 = (class435)this.field4731.get(var1 - 1);
				var4 = var6.field4744 + this.method8053(var1 - 1);
				var5 = var6.field4746;
			} else if (var3 == -1 && var1 == 0) {
				return 0;
			}

			int var14 = 16777215;
			int var7 = 0;
			int var8 = var1;
			int var9 = 16777215;
			int var10 = var3 == 1 ? this.field4731.size() + 1 : 0;

			for (int var11 = var3 + var1; var10 != var11; var11 += var3) {
				class435 var12 = (class435)this.field4731.get(var11 - 1);
				if (var5 != var12.field4746) {
					++var7;
					var5 = var12.field4746;
					if (var7 > var2) {
						return var8;
					}
				}

				if (var7 == var2) {
					int var13 = Math.abs(var12.field4744 + this.method8053(var11 - 1) - var4);
					if (var13 >= var9) {
						return var8;
					}

					var8 = var11;
					var9 = var13;
				}
			}

			if (var3 == 1) {
				return this.field4731.size();
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-598311792"
	)
	public int method8047() {
		if (!this.field4731.isEmpty() && this.method8089() == 1) {
			return this.field4731.isEmpty() ? 0 : ((class435)this.field4731.get(this.field4731.size() - 1)).field4744 + this.method8049();
		} else {
			int var1 = -1;
			int var2 = 0;

			for (int var3 = this.field4731.size() - 1; var3 >= 0; --var3) {
				class435 var4 = (class435)this.field4731.get(var3);
				if (var1 != var4.field4746) {
					int var5 = this.method8054(var4, false) + var4.field4744;
					var2 = Math.max(var5, var2);
					var1 = var4.field4746;
				}
			}

			return var2;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	public int method8038() {
		return this.method8019() ? 0 : this.field4727.ascent + ((class435)this.field4731.get(this.field4731.size() - 1)).field4746;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-599523217"
	)
	public int method8146() {
		return this.field4734;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "273"
	)
	public int method8089() {
		return this.method8038() / this.field4727.ascent;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "204"
	)
	int method8049() {
		return this.method8019() ? 0 : this.method8054((class435)this.field4731.get(this.field4731.size() - 1), false);
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-996081651"
	)
	public int method8045() {
		return this.field4730;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "297333828"
	)
	public int method8086() {
		return this.field4741;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "48"
	)
	public int method8056() {
		return this.field4732;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1127860173"
	)
	public int method8048() {
		return this.field4739;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "93"
	)
	public int method8085(int var1) {
		switch(this.field4733) {
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

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "918134957"
	)
	public int method8069(int var1) {
		switch(this.field4723) {
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
		garbageValue = "876353226"
	)
	void method8051() {
		this.method8052(0, this.field4731.size());
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "18"
	)
	void method8052(int var1, int var2) {
		if (!this.method8019() && this.field4727 != null) {
			class518 var3 = this.method8031(var1, var2);
			boolean var4 = (Integer)var3.field5229 == 0 && (Integer)var3.field5227 == this.field4731.size();
			int var5 = (Integer)var3.field5229;
			int var6 = 0;
			int var7 = var4 ? 0 : ((class435)this.field4731.get((Integer)var3.field5229)).field4746;
			int var8 = 0;

			int var9;
			for (var9 = (Integer)var3.field5229; var9 <= (Integer)var3.field5227; ++var9) {
				boolean var10 = var9 >= this.field4731.size();
				class435 var21 = (class435)this.field4731.get(!var10 ? var9 : this.field4731.size() - 1);
				int var22 = !var10 ? this.method8054(var21, false) : 0;
				boolean var13 = !var10 && var21.field4747 == '\n';
				boolean var14 = !var10 && this.method8020() && var22 + var6 > this.field4730;
				if (var13 || var14 || var10) {
					int var15 = var9;
					int var16 = 0;
					int var17;
					int var18;
					class435 var19;
					if (var14) {
						var17 = 0;
						if (this.field4732 == 1) {
							for (var18 = var9; var18 > var5; --var18) {
								var19 = (class435)this.field4731.get(var18);
								var17 += var18 < var15 ? this.method8054(var19, false) : 0;
								if (var19.field4747 == ' ' || var19.field4747 == '\n') {
									var15 = var18;
									var6 -= var17;
									var16 = var17;
									break;
								}
							}
						}
					}

					var17 = -this.method8085(var6);

					for (var18 = var5; var18 < var15; ++var18) {
						var19 = (class435)this.field4731.get(var18);
						int var20 = this.method8054(var19, false);
						var19.field4744 = var17;
						var19.field4746 = var7;
						var17 += var20;
					}

					var5 = var15;
					var6 = var16;
					var7 += this.method8146();
					++var8;
				}

				var6 += !var10 ? var22 : 0;
			}

			if (this.field4723 != 0 && var4) {
				var9 = var8 * this.method8146();
				int var23 = this.method8069(var9);

				for (int var11 = 0; var11 < this.field4731.size(); ++var11) {
					class435 var12 = (class435)this.field4731.get(var11);
					var12.field4746 -= var23;
				}
			}

		}
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1215428150"
	)
	int method8053(int var1) {
		return var1 < this.field4731.size() ? this.method8054((class435)this.field4731.get(var1), false) : 0;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(Lqu;ZS)I",
		garbageValue = "8544"
	)
	int method8054(class435 var1, boolean var2) {
		if (var1.field4747 == '\n') {
			return 0;
		} else if (this.field4739 == 0) {
			int var3 = this.field4727.advances[var1.field4747];
			if (var3 == 0) {
				return var1.field4747 == '\t' ? this.field4727.advances[32] * 3 : this.field4727.advances[32];
			} else {
				return var3;
			}
		} else {
			return this.field4727.advances[42];
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(III)Ltj;",
		garbageValue = "-823077808"
	)
	class518 method8031(int var1, int var2) {
		int var3 = Math.min(var1, var2);
		int var4 = Math.max(var1, var2);
		int var5 = this.field4731.size();
		if (var3 == 0 && var4 == var5) {
			return new class518(0, var5);
		} else {
			int var6 = this.method8050(var3, false);
			int var7 = this.method8070(var4, false);
			int var8;
			switch(this.field4723) {
			case 0:
				if (this.field4733 == 0) {
					return new class518(var6, var5);
				}

				var8 = this.method8050(var3, true);
				return new class518(var8, var5);
			case 1:
				return new class518(0, var5);
			case 2:
				if (this.field4733 == 2) {
					return new class518(0, var7);
				}

				var8 = this.method8070(var4, true);
				return new class518(0, var8);
			default:
				return new class518(0, var5);
			}
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "1656780139"
	)
	int method8050(int var1, boolean var2) {
		if (var1 < this.field4731.size()) {
			int var3 = ((class435)this.field4731.get(var1)).field4746;

			for (int var4 = var1; var4 > 0; --var4) {
				if (((class435)this.field4731.get(var4 - 1)).field4746 < var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class435)this.field4731.get(var4 - 1)).field4746;
				}
			}
		}

		return 0;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-1578125709"
	)
	int method8070(int var1, boolean var2) {
		if (var1 < this.field4731.size()) {
			int var3 = ((class435)this.field4731.get(var1)).field4746;

			for (int var4 = var1; var4 < this.field4731.size() - 1; ++var4) {
				if (((class435)this.field4731.get(var4 + 1)).field4746 > var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class435)this.field4731.get(var4 + 1)).field4746;
				}
			}
		}

		return this.field4731.size();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(FB)F",
		garbageValue = "-21"
	)
	public static final float method8148(float var0) {
		float var1 = 75.0F;
		float var2 = 10000.0F;
		float var3 = 750000.0F / (10000.0F - 9925.0F * var0);
		return (var3 - 75.0F) / 9925.0F;
	}
}
