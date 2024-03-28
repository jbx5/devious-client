import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qs")
public class class418 {
	@ObfuscatedName("rj")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	class414 field4635;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1228229277
	)
	int field4633;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -468077919
	)
	int field4634;

	@ObfuscatedSignature(
		descriptor = "(Lpl;II)V"
	)
	class418(class414 var1, int var2, int var3) {
		this.field4633 = 0;
		this.field4634 = 0;
		this.field4635 = var1;
		this.field4633 = var2;
		this.field4634 = var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-116"
	)
	public String method7763() {
		if (this.method7783()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7766());

			for (int var2 = this.field4633; var2 < this.field4634; ++var2) {
				class416 var3 = this.field4635.method7509(var2);
				var1.append(var3.field4607);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "43"
	)
	boolean method7764(int var1) {
		return this.field4635.method7534() == 2 || this.field4635.method7534() == 1 && (!this.field4635.field4599 || this.field4634 - 1 != var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1778918719"
	)
	public boolean method7783() {
		return this.field4634 == this.field4633;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1514158815"
	)
	public int method7766() {
		return this.field4634 - this.field4633;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lqt;I)Z",
		garbageValue = "-488948469"
	)
	boolean method7767(class416 var1) {
		if (this.field4635.field4603 == 2) {
			return true;
		} else if (this.field4635.field4603 == 0) {
			return false;
		} else {
			return this.field4635.method7536() != var1;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-737043768"
	)
	int method7772() {
		if (this.method7783()) {
			return 0;
		} else {
			class416 var1 = this.field4635.method7509(this.field4634 - 1);
			if (var1.field4607 == '\n') {
				return 0;
			} else if (this.method7767(var1)) {
				return this.field4635.field4602.advances[42];
			} else {
				int var2 = this.field4635.field4602.advances[var1.field4607];
				if (var2 == 0) {
					return var1.field4607 == '\t' ? this.field4635.field4602.advances[32] * 3 : this.field4635.field4602.advances[32];
				} else {
					return var2;
				}
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ltd;",
		garbageValue = "-1654376587"
	)
	public class505 method7768() {
		if (this.method7783()) {
			return new class505(0, 0);
		} else {
			class416 var1 = this.field4635.method7509(this.field4634 - 1);
			return new class505(var1.field4606 + this.method7772(), var1.field4605);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqt;",
		garbageValue = "46"
	)
	public class416 method7762(int var1) {
		return var1 >= 0 && var1 < this.method7766() ? this.field4635.method7509(this.field4633 + var1) : null;
	}
}
