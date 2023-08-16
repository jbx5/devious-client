import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pj")
public class class394 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1258596067
	)
	int field4459;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 2089434589
	)
	int field4458;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 633771027
	)
	int field4455;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1403151291
	)
	int field4462;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1719851919
	)
	int field4464;
	@ObfuscatedName("as")
	boolean field4466;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpk;"
	)
	AbstractFont field4465;
	@ObfuscatedName("aj")
	ArrayList field4452;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 1637064671
	)
	int field4467;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 884828437
	)
	int field4468;

	public class394() {
		this.field4459 = Integer.MAX_VALUE;
		this.field4458 = Integer.MAX_VALUE;
		this.field4455 = 0;
		this.field4462 = 0;
		this.field4464 = 0;
		this.field4466 = true;
		this.field4452 = new ArrayList();
		this.field4467 = 0;
		this.field4468 = 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Lpz;",
		garbageValue = "425318611"
	)
	public class396 method7303(int var1) {
		return (class396)this.field4452.get(var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lpz;",
		garbageValue = "1830163512"
	)
	class396 method7276() {
		return this.field4452.size() == 0 ? null : (class396)this.field4452.get(this.field4452.size() - 1);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1992869018"
	)
	public boolean method7371() {
		return this.field4452.size() == 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-675218118"
	)
	boolean method7401() {
		return this.field4458 > 1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1688510031"
	)
	public int method7281() {
		return this.field4452.size();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "163147996"
	)
	public String method7282() {
		if (this.method7371()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7281());

			for (int var2 = 0; var2 < this.method7281(); ++var2) {
				class396 var3 = this.method7303(var2);
				var1.append(var3.field4476);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-32"
	)
	public void method7328(int var1) {
		if (this.field4465 != null && var1 < this.field4465.ascent * 2) {
			var1 = Integer.MAX_VALUE;
		}

		if (this.field4459 != var1) {
			this.field4459 = var1;
			this.method7392();
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1949241738"
	)
	public void method7280(int var1) {
		if (this.field4458 != var1) {
			this.field4458 = var1;
			this.method7392();
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-38"
	)
	public void method7285(int var1) {
		if (this.field4468 != var1) {
			this.field4468 = var1;
			this.method7392();
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lpk;I)V",
		garbageValue = "1103184746"
	)
	public void method7286(AbstractFont var1) {
		if (var1 != this.field4465) {
			this.field4465 = var1;
			if (this.field4465 != null) {
				if (this.field4464 == 0) {
					this.field4464 = this.field4465.ascent;
				}

				if (!this.method7371()) {
					this.method7392();
				}
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1772052418"
	)
	public void method7350(int var1) {
		if (this.field4467 != var1) {
			this.field4467 = var1;
			this.method7392();
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1456021058"
	)
	public boolean method7288(int var1, int var2) {
		if (this.field4455 != var1 || var2 != this.field4462) {
			this.field4455 = var1;
			this.field4462 = var2;
			this.method7392();
		}

		return true;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1080029038"
	)
	public void method7289(int var1) {
		if (this.field4464 != var1) {
			this.field4464 = var1;
			this.method7392();
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)Lpl;",
		garbageValue = "-1114977482"
	)
	public class398 method7290(int var1, int var2) {
		if (var2 == var1) {
			return new class398(this, 0, 0);
		} else if (var1 <= this.field4452.size() && var2 <= this.field4452.size()) {
			return var2 < var1 ? new class398(this, var2, var1) : new class398(this, var1, var2);
		} else {
			return new class398(this, 0, 0);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(CIII)Lpu;",
		garbageValue = "-803390242"
	)
	public class395 method7346(char var1, int var2, int var3) {
		return this.method7292(Character.toString(var1), var2, var3);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;III)Lpu;",
		garbageValue = "-522015714"
	)
	public class395 method7292(String var1, int var2, int var3) {
		if (var3 == 0) {
			var3 = Integer.MAX_VALUE;
		}

		int var4 = var2;
		if (this.field4452.size() >= var3) {
			this.method7277(var2, var2);
			return new class395(var2, true);
		} else {
			this.field4452.ensureCapacity(this.field4452.size() + var1.length());

			for (int var5 = 0; var5 < var1.length() && this.field4452.size() < var3; ++var5) {
				class396 var6 = new class396();
				var6.field4476 = var1.charAt(var5);
				this.field4452.add(var4, var6);
				++var4;
			}

			this.method7277(var2, var4);
			if (this.field4458 != 0 && this.method7341() > this.field4458) {
				while (var4 != var2) {
					--var4;
					this.method7296(var4);
					if (this.method7341() <= this.field4458) {
						break;
					}
				}

				return new class395(var4, true);
			} else {
				return new class395(var4, false);
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lpu;",
		garbageValue = "-584459098"
	)
	class395 method7339(String var1, int var2) {
		return this.method7292(var1, this.field4452.size(), var2);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Lpu;",
		garbageValue = "67"
	)
	public class395 method7358(String var1) {
		this.method7295();
		return this.method7339(var1, 0);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1865432397"
	)
	void method7295() {
		this.field4452.clear();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "2"
	)
	public int method7296(int var1) {
		return this.method7297(var1, var1 + 1);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1605170962"
	)
	public int method7297(int var1, int var2) {
		int var3;
		if (var2 < var1) {
			var3 = var2;
			var2 = var1;
			var1 = var3;
		}

		this.field4452.subList(var1, var2).clear();
		var3 = var1;
		if (this.method7401() && this.field4467 == 1) {
			while (var3 > 0) {
				--var3;
				char var4 = ((class396)this.field4452.get(var3)).field4476;
				if (var4 == ' ' || var4 == '\t') {
					break;
				}
			}
		}

		this.method7277(var3, var2);
		return var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "194"
	)
	public int method7327(int var1, int var2) {
		if (this.field4465 == null) {
			return 0;
		} else if (this.method7401() && var1 > this.field4459) {
			return this.field4452.size();
		} else {
			if (!this.field4452.isEmpty()) {
				for (int var3 = 0; var3 < this.field4452.size(); ++var3) {
					class396 var4 = (class396)this.field4452.get(var3);
					if (var2 <= var4.field4478 + this.method7302()) {
						if (var2 < var4.field4478) {
							break;
						}

						if (var1 < var4.field4475) {
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (1 + var3 != this.field4452.size() && ((class396)this.field4452.get(1 + var3)).field4478 != var4.field4478) {
							int var5 = this.method7322((class396)this.field4452.get(var3), false);
							if (var1 < var5 + var4.field4475) {
								return var3;
							}

							if (var2 <= var4.field4478 + this.method7302()) {
								return var3 + 1;
							}
						}
					}
				}

				class396 var6 = (class396)this.field4452.get(this.field4452.size() - 1);
				if (var1 >= var6.field4475 && var1 <= var6.field4475 + this.method7304() && var2 >= var6.field4478 && var2 <= var6.field4478 + this.method7302()) {
					return this.field4452.size() - 1;
				}
			}

			return this.field4452.size();
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "139"
	)
	public int method7299(int var1, int var2) {
		if (this.field4465 != null && !this.method7371() && var1 <= this.field4452.size()) {
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
				class396 var6 = (class396)this.field4452.get(var1 - 1);
				var4 = var6.field4475 + this.method7313(var1 - 1);
				var5 = var6.field4478;
			} else if (var3 == -1 && var1 == 0) {
				return 0;
			}

			int var14 = 16777215;
			int var7 = 0;
			int var8 = var1;
			int var9 = 16777215;
			int var10 = var3 == 1 ? this.field4452.size() + 1 : 0;

			for (int var11 = var3 + var1; var10 != var11; var11 += var3) {
				class396 var12 = (class396)this.field4452.get(var11 - 1);
				if (var5 != var12.field4478) {
					++var7;
					var5 = var12.field4478;
					if (var7 > var2) {
						return var8;
					}
				}

				if (var7 == var2) {
					int var13 = Math.abs(var12.field4475 + this.method7313(var11 - 1) - var4);
					if (var13 >= var9) {
						return var8;
					}

					var8 = var11;
					var9 = var13;
				}
			}

			if (var3 == 1) {
				return this.field4452.size();
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-540646519"
	)
	public int method7300() {
		if (!this.field4452.isEmpty() && this.method7341() == 1) {
			return this.field4452.isEmpty() ? 0 : ((class396)this.field4452.get(this.field4452.size() - 1)).field4475 + this.method7304();
		} else {
			int var1 = -1;
			int var2 = 0;

			for (int var3 = this.field4452.size() - 1; var3 >= 0; --var3) {
				class396 var4 = (class396)this.field4452.get(var3);
				if (var1 != var4.field4478) {
					int var5 = this.method7322(var4, false) + var4.field4475;
					var2 = Math.max(var5, var2);
					var1 = var4.field4478;
				}
			}

			return var2;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "872153542"
	)
	public int method7301() {
		return this.method7371() ? 0 : this.field4465.ascent + ((class396)this.field4452.get(this.field4452.size() - 1)).field4478;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1220139043"
	)
	public int method7302() {
		return this.field4464;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "106"
	)
	public int method7341() {
		return this.method7301() / this.field4465.ascent;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1975027491"
	)
	int method7304() {
		return this.method7371() ? 0 : this.method7322((class396)this.field4452.get(this.field4452.size() - 1), false);
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "103"
	)
	public int method7403() {
		return this.field4459;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2030708038"
	)
	public int method7306() {
		return this.field4458;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "106"
	)
	public int method7325() {
		return this.field4467;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "326799918"
	)
	public int method7308() {
		return this.field4468;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "0"
	)
	public int method7309(int var1) {
		switch(this.field4455) {
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
		descriptor = "(IB)I",
		garbageValue = "59"
	)
	public int method7310(int var1) {
		switch(this.field4462) {
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
		descriptor = "(I)V",
		garbageValue = "2042432438"
	)
	void method7392() {
		this.method7277(0, this.field4452.size());
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2146351228"
	)
	void method7277(int var1, int var2) {
		if (!this.method7371() && this.field4465 != null) {
			class485 var3 = this.method7315(var1, var2);
			boolean var4 = (Integer)var3.field4966 == 0 && (Integer)var3.field4965 == this.field4452.size();
			int var5 = (Integer)var3.field4966;
			int var6 = 0;
			int var7 = var4 ? 0 : ((class396)this.field4452.get((Integer)var3.field4966)).field4478;
			int var8 = 0;

			int var9;
			for (var9 = (Integer)var3.field4966; var9 <= (Integer)var3.field4965; ++var9) {
				boolean var10 = var9 >= this.field4452.size();
				class396 var21 = (class396)this.field4452.get(!var10 ? var9 : this.field4452.size() - 1);
				int var22 = !var10 ? this.method7322(var21, false) : 0;
				boolean var13 = !var10 && var21.field4476 == '\n';
				boolean var14 = !var10 && this.method7401() && var22 + var6 > this.field4459;
				if (var13 || var14 || var10) {
					int var15 = var9;
					int var16 = 0;
					int var17;
					int var18;
					class396 var19;
					if (var14) {
						var17 = 0;
						if (this.field4467 == 1) {
							for (var18 = var9; var18 > var5; --var18) {
								var19 = (class396)this.field4452.get(var18);
								var17 += var18 < var15 ? this.method7322(var19, false) : 0;
								if (var19.field4476 == ' ' || var19.field4476 == '\n') {
									var15 = var18;
									var6 -= var17;
									var16 = var17;
									break;
								}
							}
						}
					}

					var17 = -this.method7309(var6);

					for (var18 = var5; var18 < var15; ++var18) {
						var19 = (class396)this.field4452.get(var18);
						int var20 = this.method7322(var19, false);
						var19.field4475 = var17;
						var19.field4478 = var7;
						var17 += var20;
					}

					var5 = var15;
					var6 = var16;
					var7 += this.method7302();
					++var8;
				}

				var6 += !var10 ? var22 : 0;
			}

			if (this.field4462 != 0 && var4) {
				var9 = var8 * this.method7302();
				int var23 = this.method7310(var9);

				for (int var11 = 0; var11 < this.field4452.size(); ++var11) {
					class396 var12 = (class396)this.field4452.get(var11);
					var12.field4478 -= var23;
				}
			}

		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "369306860"
	)
	int method7313(int var1) {
		return var1 < this.field4452.size() ? this.method7322((class396)this.field4452.get(var1), false) : 0;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lpz;ZI)I",
		garbageValue = "1524622539"
	)
	int method7322(class396 var1, boolean var2) {
		if (var1.field4476 == '\n') {
			return 0;
		} else if (this.field4468 == 0) {
			int var3 = this.field4465.advances[var1.field4476];
			if (var3 == 0) {
				return var1.field4476 == '\t' ? this.field4465.advances[32] * 3 : this.field4465.advances[32];
			} else {
				return var3;
			}
		} else {
			return this.field4465.advances[42];
		}
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lss;",
		garbageValue = "0"
	)
	class485 method7315(int var1, int var2) {
		int var3 = Math.min(var1, var2);
		int var4 = Math.max(var1, var2);
		int var5 = this.field4452.size();
		if (var3 == 0 && var4 == var5) {
			return new class485(0, var5);
		} else {
			int var6 = this.method7316(var3, false);
			int var7 = this.method7326(var4, false);
			int var8;
			switch(this.field4462) {
			case 0:
				if (this.field4455 == 0) {
					return new class485(var6, var5);
				}

				var8 = this.method7316(var3, true);
				return new class485(var8, var5);
			case 1:
				return new class485(0, var5);
			case 2:
				if (this.field4455 == 2) {
					return new class485(0, var7);
				}

				var8 = this.method7326(var4, true);
				return new class485(0, var8);
			default:
				return new class485(0, var5);
			}
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-1605508090"
	)
	int method7316(int var1, boolean var2) {
		if (var1 < this.field4452.size()) {
			int var3 = ((class396)this.field4452.get(var1)).field4478;

			for (int var4 = var1; var4 > 0; --var4) {
				if (((class396)this.field4452.get(var4 - 1)).field4478 < var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class396)this.field4452.get(var4 - 1)).field4478;
				}
			}
		}

		return 0;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "1892979097"
	)
	int method7326(int var1, boolean var2) {
		if (var1 < this.field4452.size()) {
			int var3 = ((class396)this.field4452.get(var1)).field4478;

			for (int var4 = var1; var4 < this.field4452.size() - 1; ++var4) {
				if (((class396)this.field4452.get(var4 + 1)).field4478 > var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class396)this.field4452.get(var4 + 1)).field4478;
				}
			}
		}

		return this.field4452.size();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1123926703"
	)
	public static void method7382() {
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.field2149.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
	}
}
