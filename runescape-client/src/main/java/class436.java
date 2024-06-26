import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qw")
public class class436 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lql;"
	)
	class432 field4795;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 637367841
	)
	int field4791;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -808876763
	)
	int field4794;

	@ObfuscatedSignature(
		descriptor = "(Lql;II)V"
	)
	class436(class432 var1, int var2, int var3) {
		this.field4791 = 0;
		this.field4794 = 0;
		this.field4795 = var1;
		this.field4791 = var2;
		this.field4794 = var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-494307176"
	)
	public String method8195() {
		if (this.method8197()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method8198());

			for (int var2 = this.field4791; var2 < this.field4794; ++var2) {
				class434 var3 = this.field4795.method7919(var2);
				var1.append(var3.field4763);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "307944174"
	)
	boolean method8207(int var1) {
		return this.field4795.method7949() == 2 || this.field4795.method7949() == 1 && (!this.field4795.field4752 || this.field4794 - 1 != var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2045005258"
	)
	public boolean method8197() {
		return this.field4791 == this.field4794;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "295"
	)
	public int method8198() {
		return this.field4794 - this.field4791;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lqf;S)Z",
		garbageValue = "7106"
	)
	boolean method8199(class434 var1) {
		if (this.field4795.field4744 == 2) {
			return true;
		} else if (this.field4795.field4744 == 0) {
			return false;
		} else {
			return this.field4795.method7999() != var1;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-992528631"
	)
	int method8200() {
		if (this.method8197()) {
			return 0;
		} else {
			class434 var1 = this.field4795.method7919(this.field4794 - 1);
			if (var1.field4763 == '\n') {
				return 0;
			} else if (this.method8199(var1)) {
				return this.field4795.field4740.advances[42];
			} else {
				int var2 = this.field4795.field4740.advances[var1.field4763];
				if (var2 == 0) {
					return var1.field4763 == '\t' ? this.field4795.field4740.advances[32] * 3 : this.field4795.field4740.advances[32];
				} else {
					return var2;
				}
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Ltu;",
		garbageValue = "-886673182"
	)
	public class517 method8201() {
		if (this.method8197()) {
			return new class517(0, 0);
		} else {
			class434 var1 = this.field4795.method7919(this.field4794 - 1);
			return new class517(var1.field4766 + this.method8200(), var1.field4764);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Lqf;",
		garbageValue = "1509116099"
	)
	public class434 method8206(int var1) {
		return var1 >= 0 && var1 < this.method8198() ? this.field4795.method7919(this.field4791 + var1) : null;
	}
}
