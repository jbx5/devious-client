import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qw")
public class class439 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -958204205
	)
	static int field4819;
	@ObfuscatedName("os")
	@ObfuscatedSignature(
		descriptor = "Lce;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lqn;"
	)
	class435 field4822;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1950382601
	)
	int field4820;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 630248125
	)
	int field4821;

	@ObfuscatedSignature(
		descriptor = "(Lqn;II)V"
	)
	class439(class435 var1, int var2, int var3) {
		this.field4820 = 0;
		this.field4821 = 0;
		this.field4822 = var1;
		this.field4820 = var2;
		this.field4821 = var3;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1733008356"
	)
	public String method8547() {
		if (this.method8549()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method8563());

			for (int var2 = this.field4820; var2 < this.field4821; ++var2) {
				class437 var3 = this.field4822.method8279(var2);
				var1.append(var3.field4794);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1693093212"
	)
	boolean method8573(int var1) {
		return this.field4822.method8320() == 2 || this.field4822.method8320() == 1 && (!this.field4822.field4784 || this.field4821 - 1 != var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "606852601"
	)
	public boolean method8549() {
		return this.field4820 == this.field4821;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "83"
	)
	public int method8563() {
		return this.field4821 - this.field4820;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lqe;I)Z",
		garbageValue = "-1041318777"
	)
	boolean method8546(class437 var1) {
		if (this.field4822.field4788 == 2) {
			return true;
		} else if (this.field4822.field4788 == 0) {
			return false;
		} else {
			return this.field4822.method8385() != var1;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2007714983"
	)
	int method8571() {
		if (this.method8549()) {
			return 0;
		} else {
			class437 var1 = this.field4822.method8279(this.field4821 - 1);
			if (var1.field4794 == '\n') {
				return 0;
			} else if (this.method8546(var1)) {
				return this.field4822.field4785.advances[42];
			} else {
				int var2 = this.field4822.field4785.advances[var1.field4794];
				if (var2 == 0) {
					return var1.field4794 == '\t' ? this.field4822.field4785.advances[32] * 3 : this.field4822.field4785.advances[32];
				} else {
					return var2;
				}
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Lue;",
		garbageValue = "58"
	)
	public class520 method8552() {
		if (this.method8549()) {
			return new class520(0, 0);
		} else {
			class437 var1 = this.field4822.method8279(this.field4821 - 1);
			return new class520(var1.field4793 + this.method8571(), var1.field4795);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqe;",
		garbageValue = "-54"
	)
	public class437 method8548(int var1) {
		return var1 >= 0 && var1 < this.method8563() ? this.field4822.method8279(this.field4820 + var1) : null;
	}
}
