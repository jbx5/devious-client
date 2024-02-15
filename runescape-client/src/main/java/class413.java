import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pv")
public class class413 {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -696110365
	)
	int field4574;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1341617493
	)
	int field4572;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1977329711
	)
	int field4573;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1653074747
	)
	int field4575;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -230505229
	)
	int field4578;
	@ObfuscatedName("ay")
	boolean field4576;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	AbstractFont field4577;
	@ObfuscatedName("ac")
	ArrayList field4570;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1720012413
	)
	int field4579;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1675231519
	)
	int field4580;

	public class413() {
		this.field4574 = Integer.MAX_VALUE;
		this.field4572 = Integer.MAX_VALUE;
		this.field4573 = 0;
		this.field4575 = 0;
		this.field4578 = 0;
		this.field4576 = true;
		this.field4570 = new ArrayList();
		this.field4579 = 0;
		this.field4580 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lpu;",
		garbageValue = "-470457898"
	)
	public class415 method7775(int var1) {
		return (class415)this.field4570.get(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lpu;",
		garbageValue = "-1049497783"
	)
	class415 method7828() {
		return this.field4570.size() == 0 ? null : (class415)this.field4570.get(this.field4570.size() - 1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1148407571"
	)
	public boolean method7778() {
		return this.field4570.size() == 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2118676254"
	)
	boolean method7693() {
		return this.field4572 > 1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "2"
	)
	public int method7711() {
		return this.field4570.size();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1754226121"
	)
	public String method7754() {
		if (this.method7778()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7711());

			for (int var2 = 0; var2 < this.method7711(); ++var2) {
				class415 var3 = this.method7775(var2);
				var1.append(var3.field4583);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "227737662"
	)
	public void method7700(int var1) {
		if (this.field4577 != null && var1 < this.field4577.ascent * 2) {
			var1 = Integer.MAX_VALUE;
		}

		if (this.field4574 != var1) {
			this.field4574 = var1;
			this.method7728();
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "30"
	)
	public void method7701(int var1) {
		if (this.field4572 != var1) {
			this.field4572 = var1;
			this.method7728();
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-120"
	)
	public void method7731(int var1) {
		if (this.field4580 != var1) {
			this.field4580 = var1;
			this.method7728();
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lqi;I)V",
		garbageValue = "1754226121"
	)
	public void method7800(AbstractFont var1) {
		if (var1 != this.field4577) {
			this.field4577 = var1;
			if (this.field4577 != null) {
				if (this.field4578 == 0) {
					this.field4578 = this.field4577.ascent;
				}

				if (!this.method7778()) {
					this.method7728();
				}
			}
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2133459477"
	)
	public void method7779(int var1) {
		if (this.field4579 != var1) {
			this.field4579 = var1;
			this.method7728();
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1656678434"
	)
	public boolean method7705(int var1, int var2) {
		if (this.field4573 != var1 || var2 != this.field4575) {
			this.field4573 = var1;
			this.field4575 = var2;
			this.method7728();
		}

		return true;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1497702314"
	)
	public void method7706(int var1) {
		if (this.field4578 != var1) {
			this.field4578 = var1;
			this.method7728();
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lqz;",
		garbageValue = "114"
	)
	public class417 method7707(int var1, int var2) {
		if (var2 == var1) {
			return new class417(this, 0, 0);
		} else if (var1 <= this.field4570.size() && var2 <= this.field4570.size()) {
			return var2 < var1 ? new class417(this, var2, var1) : new class417(this, var1, var2);
		} else {
			return new class417(this, 0, 0);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(CIIB)Lpa;",
		garbageValue = "8"
	)
	public class414 method7708(char var1, int var2, int var3) {
		return this.method7709(Character.toString(var1), var2, var3);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IIB)Lpa;",
		garbageValue = "1"
	)
	public class414 method7709(String var1, int var2, int var3) {
		if (var3 == 0) {
			var3 = Integer.MAX_VALUE;
		}

		int var4 = var2;
		if (this.field4570.size() >= var3) {
			this.method7729(var2, var2);
			return new class414(var2, true);
		} else {
			this.field4570.ensureCapacity(this.field4570.size() + var1.length());

			for (int var5 = 0; var5 < var1.length() && this.field4570.size() < var3; ++var5) {
				class415 var6 = new class415();
				var6.field4583 = var1.charAt(var5);
				this.field4570.add(var4, var6);
				++var4;
			}

			this.method7729(var2, var4);
			if (this.field4572 != 0 && this.method7720() > this.field4572) {
				while (var4 != var2) {
					--var4;
					this.method7713(var4);
					if (this.method7720() <= this.field4572) {
						break;
					}
				}

				return new class414(var4, true);
			} else {
				return new class414(var4, false);
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;II)Lpa;",
		garbageValue = "414119716"
	)
	class414 method7710(String var1, int var2) {
		return this.method7709(var1, this.field4570.size(), var2);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lpa;",
		garbageValue = "1824140523"
	)
	public class414 method7792(String var1) {
		this.method7712();
		return this.method7710(var1, 0);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-102"
	)
	void method7712() {
		this.field4570.clear();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "24"
	)
	public int method7713(int var1) {
		return this.method7798(var1, var1 + 1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1811154260"
	)
	public int method7798(int var1, int var2) {
		int var3;
		if (var2 < var1) {
			var3 = var2;
			var2 = var1;
			var1 = var3;
		}

		this.field4570.subList(var1, var2).clear();
		var3 = var1;
		if (this.method7693() && this.field4579 == 1) {
			while (var3 > 0) {
				--var3;
				char var4 = ((class415)this.field4570.get(var3)).field4583;
				if (var4 == ' ' || var4 == '\t') {
					break;
				}
			}
		}

		this.method7729(var3, var2);
		return var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIS)I",
		garbageValue = "-24793"
	)
	public int method7715(int var1, int var2) {
		if (this.field4577 == null) {
			return 0;
		} else if (this.method7693() && var1 > this.field4574) {
			return this.field4570.size();
		} else {
			if (!this.field4570.isEmpty()) {
				for (int var3 = 0; var3 < this.field4570.size(); ++var3) {
					class415 var4 = (class415)this.field4570.get(var3);
					if (var2 <= var4.field4585 + this.method7719()) {
						if (var2 < var4.field4585) {
							break;
						}

						if (var1 < var4.field4584) {
							return var3 > 0 ? var3 - 1 : 0;
						}

						if (var3 + 1 != this.field4570.size() && ((class415)this.field4570.get(var3 + 1)).field4585 != var4.field4585) {
							int var5 = this.method7697((class415)this.field4570.get(var3), false);
							if (var1 < var5 + var4.field4584) {
								return var3;
							}

							if (var2 <= var4.field4585 + this.method7719()) {
								return var3 + 1;
							}
						}
					}
				}

				class415 var6 = (class415)this.field4570.get(this.field4570.size() - 1);
				if (var1 >= var6.field4584 && var1 <= var6.field4584 + this.method7721() && var2 >= var6.field4585 && var2 <= var6.field4585 + this.method7719()) {
					return this.field4570.size() - 1;
				}
			}

			return this.field4570.size();
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2096658446"
	)
	public int method7716(int var1, int var2) {
		if (this.field4577 != null && !this.method7778() && var1 <= this.field4570.size()) {
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
				class415 var6 = (class415)this.field4570.get(var1 - 1);
				var4 = var6.field4584 + this.method7722(var1 - 1);
				var5 = var6.field4585;
			} else if (var3 == -1 && var1 == 0) {
				return 0;
			}

			int var14 = 16777215;
			int var7 = 0;
			int var8 = var1;
			int var9 = 16777215;
			int var10 = var3 == 1 ? this.field4570.size() + 1 : 0;

			for (int var11 = var3 + var1; var10 != var11; var11 += var3) {
				class415 var12 = (class415)this.field4570.get(var11 - 1);
				if (var5 != var12.field4585) {
					++var7;
					var5 = var12.field4585;
					if (var7 > var2) {
						return var8;
					}
				}

				if (var7 == var2) {
					int var13 = Math.abs(var12.field4584 + this.method7722(var11 - 1) - var4);
					if (var13 >= var9) {
						return var8;
					}

					var8 = var11;
					var9 = var13;
				}
			}

			if (var3 == 1) {
				return this.field4570.size();
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	public int method7717() {
		if (!this.field4570.isEmpty() && this.method7720() == 1) {
			return this.field4570.isEmpty() ? 0 : ((class415)this.field4570.get(this.field4570.size() - 1)).field4584 + this.method7721();
		} else {
			int var1 = -1;
			int var2 = 0;

			for (int var3 = this.field4570.size() - 1; var3 >= 0; --var3) {
				class415 var4 = (class415)this.field4570.get(var3);
				if (var1 != var4.field4585) {
					int var5 = this.method7697(var4, false) + var4.field4584;
					var2 = Math.max(var5, var2);
					var1 = var4.field4585;
				}
			}

			return var2;
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-740474028"
	)
	public int method7735() {
		return this.method7778() ? 0 : this.field4577.ascent + ((class415)this.field4570.get(this.field4570.size() - 1)).field4585;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1472959115"
	)
	public int method7719() {
		return this.field4578;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-24667"
	)
	public int method7720() {
		return this.method7735() / this.field4577.ascent;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "138917302"
	)
	int method7721() {
		return this.method7778() ? 0 : this.method7697((class415)this.field4570.get(this.field4570.size() - 1), false);
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-2"
	)
	public int method7767() {
		return this.field4574;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1765465217"
	)
	public int method7808() {
		return this.field4572;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-354001801"
	)
	public int method7724() {
		return this.field4579;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1338784417"
	)
	public int method7765() {
		return this.field4580;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "95"
	)
	public int method7773(int var1) {
		switch(this.field4573) {
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

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(IS)I",
		garbageValue = "32479"
	)
	public int method7786(int var1) {
		switch(this.field4575) {
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
		garbageValue = "383944727"
	)
	void method7728() {
		this.method7729(0, this.field4570.size());
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-788622491"
	)
	void method7729(int var1, int var2) {
		if (!this.method7778() && this.field4577 != null) {
			class504 var3 = this.method7730(var1, var2);
			boolean var4 = (Integer)var3.field5063 == 0 && (Integer)var3.field5064 == this.field4570.size();
			int var5 = (Integer)var3.field5063;
			int var6 = 0;
			int var7 = var4 ? 0 : ((class415)this.field4570.get((Integer)var3.field5063)).field4585;
			int var8 = 0;

			int var9;
			for (var9 = (Integer)var3.field5063; var9 <= (Integer)var3.field5064; ++var9) {
				boolean var10 = var9 >= this.field4570.size();
				class415 var21 = (class415)this.field4570.get(!var10 ? var9 : this.field4570.size() - 1);
				int var22 = !var10 ? this.method7697(var21, false) : 0;
				boolean var13 = !var10 && var21.field4583 == '\n';
				boolean var14 = !var10 && this.method7693() && var22 + var6 > this.field4574;
				if (var13 || var14 || var10) {
					int var15 = var9;
					int var16 = 0;
					int var17;
					int var18;
					class415 var19;
					if (var14) {
						var17 = 0;
						if (this.field4579 == 1) {
							for (var18 = var9; var18 > var5; --var18) {
								var19 = (class415)this.field4570.get(var18);
								var17 += var18 < var15 ? this.method7697(var19, false) : 0;
								if (var19.field4583 == ' ' || var19.field4583 == '\n') {
									var15 = var18;
									var6 -= var17;
									var16 = var17;
									break;
								}
							}
						}
					}

					var17 = -this.method7773(var6);

					for (var18 = var5; var18 < var15; ++var18) {
						var19 = (class415)this.field4570.get(var18);
						int var20 = this.method7697(var19, false);
						var19.field4584 = var17;
						var19.field4585 = var7;
						var17 += var20;
					}

					var5 = var15;
					var6 = var16;
					var7 += this.method7719();
					++var8;
				}

				var6 += !var10 ? var22 : 0;
			}

			if (this.field4575 != 0 && var4) {
				var9 = var8 * this.method7719();
				int var23 = this.method7786(var9);

				for (int var11 = 0; var11 < this.field4570.size(); ++var11) {
					class415 var12 = (class415)this.field4570.get(var11);
					var12.field4585 -= var23;
				}
			}

		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1626730503"
	)
	int method7722(int var1) {
		return var1 < this.field4570.size() ? this.method7697((class415)this.field4570.get(var1), false) : 0;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(Lpu;ZB)I",
		garbageValue = "6"
	)
	int method7697(class415 var1, boolean var2) {
		if (var1.field4583 == '\n') {
			return 0;
		} else if (this.field4580 == 0) {
			int var3 = this.field4577.advances[var1.field4583];
			if (var3 == 0) {
				return var1.field4583 == '\t' ? this.field4577.advances[32] * 3 : this.field4577.advances[32];
			} else {
				return var3;
			}
		} else {
			return this.field4577.advances[42];
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lth;",
		garbageValue = "5"
	)
	class504 method7730(int var1, int var2) {
		int var3 = Math.min(var1, var2);
		int var4 = Math.max(var1, var2);
		int var5 = this.field4570.size();
		if (var3 == 0 && var4 == var5) {
			return new class504(0, var5);
		} else {
			int var6 = this.method7733(var3, false);
			int var7 = this.method7788(var4, false);
			int var8;
			switch(this.field4575) {
			case 0:
				if (this.field4573 == 0) {
					return new class504(var6, var5);
				}

				var8 = this.method7733(var3, true);
				return new class504(var8, var5);
			case 1:
				return new class504(0, var5);
			case 2:
				if (this.field4573 == 2) {
					return new class504(0, var7);
				}

				var8 = this.method7788(var4, true);
				return new class504(0, var8);
			default:
				return new class504(0, var5);
			}
		}
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "-336171947"
	)
	int method7733(int var1, boolean var2) {
		if (var1 < this.field4570.size()) {
			int var3 = ((class415)this.field4570.get(var1)).field4585;

			for (int var4 = var1; var4 > 0; --var4) {
				if (((class415)this.field4570.get(var4 - 1)).field4585 < var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class415)this.field4570.get(var4 - 1)).field4585;
				}
			}
		}

		return 0;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(IZB)I",
		garbageValue = "-67"
	)
	int method7788(int var1, boolean var2) {
		if (var1 < this.field4570.size()) {
			int var3 = ((class415)this.field4570.get(var1)).field4585;

			for (int var4 = var1; var4 < this.field4570.size() - 1; ++var4) {
				if (((class415)this.field4570.get(var4 + 1)).field4585 > var3) {
					if (!var2) {
						return var4;
					}

					var2 = false;
					var3 = ((class415)this.field4570.get(var4 + 1)).field4585;
				}
			}
		}

		return this.field4570.size();
	}
}
