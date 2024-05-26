import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qv")
public class class435 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	static IndexedSprite field4776;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lqw;"
	)
	class431 field4778;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -435297999
	)
	int field4775;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -7168045
	)
	int field4777;

	@ObfuscatedSignature(
		descriptor = "(Lqw;II)V"
	)
	class435(class431 var1, int var2, int var3) {
		this.field4775 = 0;
		this.field4777 = 0;
		this.field4778 = var1;
		this.field4775 = var2;
		this.field4777 = var3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2085917085"
	)
	public String method8254() {
		if (this.method8242()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method8243());

			for (int var2 = this.field4775; var2 < this.field4777; ++var2) {
				class433 var3 = this.field4778.method7995(var2);
				var1.append(var3.field4749);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-108"
	)
	boolean method8241(int var1) {
		return this.field4778.method8026() == 2 || this.field4778.method8026() == 1 && (!this.field4778.field4740 || this.field4777 - 1 != var1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1710448943"
	)
	public boolean method8242() {
		return this.field4777 == this.field4775;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1752424767"
	)
	public int method8243() {
		return this.field4777 - this.field4775;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lqo;I)Z",
		garbageValue = "833622859"
	)
	boolean method8244(class433 var1) {
		if (this.field4778.field4744 == 2) {
			return true;
		} else if (this.field4778.field4744 == 0) {
			return false;
		} else {
			return this.field4778.method7996() != var1;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-61"
	)
	int method8245() {
		if (this.method8242()) {
			return 0;
		} else {
			class433 var1 = this.field4778.method7995(this.field4777 - 1);
			if (var1.field4749 == '\n') {
				return 0;
			} else if (this.method8244(var1)) {
				return this.field4778.field4731.advances[42];
			} else {
				int var2 = this.field4778.field4731.advances[var1.field4749];
				if (var2 == 0) {
					return var1.field4749 == '\t' ? this.field4778.field4731.advances[32] * 3 : this.field4778.field4731.advances[32];
				} else {
					return var2;
				}
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lto;",
		garbageValue = "2111037491"
	)
	public class516 method8246() {
		if (this.method8242()) {
			return new class516(0, 0);
		} else {
			class433 var1 = this.field4778.method7995(this.field4777 - 1);
			return new class516(var1.field4750 + this.method8245(), var1.field4751);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lqo;",
		garbageValue = "-2109715852"
	)
	public class433 method8247(int var1) {
		return var1 >= 0 && var1 < this.method8243() ? this.field4778.method7995(this.field4775 + var1) : null;
	}
}
