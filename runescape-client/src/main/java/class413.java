import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pr")
public class class413 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpp;"
	)
	class409 field4551;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1839239665
	)
	int field4553;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1840423911
	)
	int field4552;

	@ObfuscatedSignature(
		descriptor = "(Lpp;II)V"
	)
	class413(class409 var1, int var2, int var3) {
		this.field4553 = 0;
		this.field4552 = 0;
		this.field4551 = var1;
		this.field4553 = var2;
		this.field4552 = var3;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1895014245"
	)
	public String method7720() {
		if (this.method7707()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7709());

			for (int var2 = this.field4553; var2 < this.field4552; ++var2) {
				class411 var3 = this.field4551.method7463(var2);
				var1.append(var3.field4523);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-819207986"
	)
	boolean method7706(int var1) {
		return this.field4551.method7494() == 2 || this.field4551.method7494() == 1 && (!this.field4551.field4514 || this.field4552 - 1 != var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-70"
	)
	public boolean method7707() {
		return this.field4552 == this.field4553;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-40"
	)
	public int method7709() {
		return this.field4552 - this.field4553;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lpe;B)Z",
		garbageValue = "4"
	)
	boolean method7723(class411 var1) {
		if (this.field4551.field4518 == 2) {
			return true;
		} else if (this.field4551.field4518 == 0) {
			return false;
		} else {
			return this.field4551.method7602() != var1;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1508488797"
	)
	int method7721() {
		if (this.method7707()) {
			return 0;
		} else {
			class411 var1 = this.field4551.method7463(this.field4552 - 1);
			if (var1.field4523 == '\n') {
				return 0;
			} else if (this.method7723(var1)) {
				return this.field4551.field4506.advances[42];
			} else {
				int var2 = this.field4551.field4506.advances[var1.field4523];
				if (var2 == 0) {
					return var1.field4523 == '\t' ? this.field4551.field4506.advances[32] * 3 : this.field4551.field4506.advances[32];
				} else {
					return var2;
				}
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ltw;",
		garbageValue = "-1209602899"
	)
	public class500 method7711() {
		if (this.method7707()) {
			return new class500(0, 0);
		} else {
			class411 var1 = this.field4551.method7463(this.field4552 - 1);
			return new class500(var1.field4524 + this.method7721(), var1.field4525);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)Lpe;",
		garbageValue = "-52"
	)
	public class411 method7712(int var1) {
		return var1 >= 0 && var1 < this.method7709() ? this.field4551.method7463(this.field4553 + var1) : null;
	}
}
