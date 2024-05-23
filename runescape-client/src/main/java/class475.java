import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("st")
public class class475 implements class67 {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -80661597
	)
	int field4948;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1752845815
	)
	public int field4940;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 860602333
	)
	public int field4941;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1722351887
	)
	public int field4944;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 557794071
	)
	public int field4943;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 781049511
	)
	public int field4946;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 937986921
	)
	public int field4945;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1069997611
	)
	public int field4939;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	public class101 field4947;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -79032087
	)
	int field4949;
	@ObfuscatedName("ah")
	public int[] field4942;
	@ObfuscatedName("av")
	public int[] field4950;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Ljv;"
	)
	class237[] field4951;

	public class475(int var1, int var2, int var3, int var4) {
		this.field4948 = 0;
		this.field4940 = 0;
		this.field4941 = 2;
		this.field4944 = 0;
		this.field4943 = -1;
		this.field4946 = -1;
		this.field4945 = -1;
		this.field4939 = 0;
		this.field4949 = 0;
		this.field4942 = new int[10];
		this.field4950 = new int[10];
		this.field4951 = new class237[10];
		this.field4947 = new class101(var1, var2, var3, var4);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1854674602"
	)
	public int vmethod8779() {
		return this.field4943;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2039495018"
	)
	public int vmethod8773() {
		return this.field4945;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-53"
	)
	public int vmethod8774() {
		return this.field4948;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public void method8761() {
		this.field4947.field1331.field2746 = this.field4947.field1348;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IILjv;I)V",
		garbageValue = "1670810435"
	)
	public final void method8762(int var1, int var2, class237 var3) {
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
			if (this.field4942[0] >= 0 && this.field4942[0] < 104 && this.field4950[0] >= 0 && this.field4950[0] < 104) {
				this.method8764(var1, var2, var3);
			} else {
				this.method8763(var1, var2);
			}
		} else {
			this.method8763(var1, var2);
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2147134108"
	)
	public void method8763(int var1, int var2) {
		this.field4949 = 0;
		this.field4942[0] = var1;
		this.field4950[0] = var2;
		byte var3 = 1;
		this.field4943 = this.field4942[0] * 128 + var3 * 64;
		this.field4945 = var3 * 64 + this.field4950[0] * 128;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IILjv;I)V",
		garbageValue = "-223838312"
	)
	final void method8764(int var1, int var2, class237 var3) {
		if (this.field4949 < 9) {
			++this.field4949;
		}

		for (int var4 = this.field4949; var4 > 0; --var4) {
			this.field4942[var4] = this.field4942[var4 - 1];
			this.field4950[var4] = this.field4950[var4 - 1];
			this.field4951[var4] = this.field4951[var4 - 1];
		}

		this.field4942[0] = var1;
		this.field4950[0] = var2;
		this.field4951[0] = var3;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-390419213"
	)
	public final void method8758() {
		int var1 = this.field4940 - this.field4939 & 2047;
		if (var1 != 0) {
			boolean var2 = true;
			boolean var3 = true;
			int var4 = var1 > 1024 ? -1 : 1;
			this.field4939 += (this.field4944 > 0 ? 1 + this.field4941 : this.field4941) * var4;
			--this.field4944;
			if (var1 < this.field4941 || var1 > 2048 - this.field4941) {
				this.field4939 = this.field4940;
			}

			this.field4939 &= 2047;
		}

		if (this.field4949 == 0) {
			this.method8763(this.field4942[0], this.field4950[0]);
		} else {
			int var10 = this.field4943;
			int var11 = this.field4945;
			byte var12 = 1;
			int var5 = var12 * 64 + this.field4942[this.field4949 - 1] * 128;
			int var6 = var12 * 64 + this.field4950[this.field4949 - 1] * 128;
			class237 var7 = this.field4951[this.field4949 - 1];
			int var8 = (int)(Math.ceil((double)var7.field2527) * 128.0D);
			if (var5 - var10 <= var8 && var5 - var10 >= -var8 && var6 - var11 <= var8 && var6 - var11 >= -var8) {
				byte var9 = 4;
				if (this.field4949 > 2) {
					var9 = 6;
				}

				if (this.field4949 > 3) {
					var9 = 8;
				}

				int var13 = (int)((float)var9 * var7.field2527);
				if (var10 != var5 || var11 != var6) {
					if (var10 < var5) {
						this.field4943 += var13;
						if (this.field4943 > var5) {
							this.field4943 = var5;
						}
					} else if (var10 > var5) {
						this.field4943 -= var13;
						if (this.field4943 < var5) {
							this.field4943 = var5;
						}
					}

					if (var11 < var6) {
						this.field4945 += var13;
						if (this.field4945 > var6) {
							this.field4945 = var6;
						}
					} else if (var11 > var6) {
						this.field4945 -= var13;
						if (this.field4945 < var6) {
							this.field4945 = var6;
						}
					}
				}

				if (var5 == this.field4943 && var6 == this.field4945) {
					--this.field4949;
				}

			} else {
				this.field4943 = var5;
				this.field4945 = var6;
				--this.field4949;
			}
		}
	}
}
