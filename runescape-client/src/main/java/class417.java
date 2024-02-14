import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qz")
public class class417 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpv;"
	)
	class413 field4610;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1776506823
	)
	int field4612;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 400331547
	)
	int field4611;

	@ObfuscatedSignature(
		descriptor = "(Lpv;II)V"
	)
	class417(class413 var1, int var2, int var3) {
		this.field4612 = 0;
		this.field4611 = 0;
		this.field4610 = var1;
		this.field4612 = var2;
		this.field4611 = var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-418333105"
	)
	public String method7960() {
		if (this.method7956()) {
			return "";
		} else {
			StringBuilder var1 = new StringBuilder(this.method7957());

			for (int var2 = this.field4612; var2 < this.field4611; ++var2) {
				class415 var3 = this.field4610.method7775(var2);
				var1.append(var3.field4583);
			}

			return var1.toString();
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "15"
	)
	boolean method7955(int var1) {
		return this.field4610.method7765() == 2 || this.field4610.method7765() == 1 && (!this.field4610.field4576 || this.field4611 - 1 != var1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "277524048"
	)
	public boolean method7956() {
		return this.field4611 == this.field4612;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-76"
	)
	public int method7957() {
		return this.field4611 - this.field4612;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lpu;I)Z",
		garbageValue = "718811765"
	)
	boolean method7958(class415 var1) {
		if (this.field4610.field4580 == 2) {
			return true;
		} else if (this.field4610.field4580 == 0) {
			return false;
		} else {
			return this.field4610.method7828() != var1;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "51"
	)
	int method7959() {
		if (this.method7956()) {
			return 0;
		} else {
			class415 var1 = this.field4610.method7775(this.field4611 - 1);
			if (var1.field4583 == '\n') {
				return 0;
			} else if (this.method7958(var1)) {
				return this.field4610.field4577.advances[42];
			} else {
				int var2 = this.field4610.field4577.advances[var1.field4583];
				if (var2 == 0) {
					return var1.field4583 == '\t' ? this.field4610.field4577.advances[32] * 3 : this.field4610.field4577.advances[32];
				} else {
					return var2;
				}
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lth;",
		garbageValue = "-1055719771"
	)
	public class504 method7963() {
		if (this.method7956()) {
			return new class504(0, 0);
		} else {
			class415 var1 = this.field4610.method7775(this.field4611 - 1);
			return new class504(var1.field4584 + this.method7959(), var1.field4585);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)Lpu;",
		garbageValue = "-113"
	)
	public class415 method7971(int var1) {
		return var1 >= 0 && var1 < this.method7957() ? this.field4610.method7775(this.field4612 + var1) : null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lof;Lof;I)V",
		garbageValue = "-2012193885"
	)
	public static void method7969(AbstractArchive var0, AbstractArchive var1) {
		KitDefinition.KitDefinition_archive = var0;
		class4.KitDefinition_modelsArchive = var1;
		KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
	}
}
