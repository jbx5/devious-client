import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kj")
public class class273 {
	@ObfuscatedName("ap")
	final int[][] field3038;
	@ObfuscatedName("aw")
	final int[][] field3039;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1527812105
	)
	int field3035;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 945293983
	)
	int field3036;
	@ObfuscatedName("ai")
	final int[] field3037;
	@ObfuscatedName("ay")
	final int[] field3033;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1862952049
	)
	final int field3034;

	class273(int var1, int var2) {
		this.field3038 = new int[var1][var2];
		this.field3039 = new int[var1][var2];
		int var3 = var2 * var1;
		int var4 = ClientPreferences.method2941(var3 / 4);
		this.field3037 = new int[var4];
		this.field3033 = new int[var4];
		this.field3034 = var4 - 1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "124"
	)
	void method5732() {
		for (int var1 = 0; var1 < this.field3038.length; ++var1) {
			for (int var2 = 0; var2 < this.field3038[var1].length; ++var2) {
				this.field3038[var1][var2] = 0;
				this.field3039[var1][var2] = 99999999;
			}
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1610299533"
	)
	void method5733(int var1, int var2) {
		this.field3035 = var1;
		this.field3036 = var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-676966193"
	)
	int method5734() {
		return this.field3035;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "22"
	)
	int method5735() {
		return this.field3036;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "83"
	)
	int method5736() {
		return this.field3038.length;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-8741"
	)
	int method5737() {
		return this.field3038[0].length;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "2037559208"
	)
	int[][] method5750() {
		return this.field3038;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "735112624"
	)
	int[][] method5739() {
		return this.field3039;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "2078856697"
	)
	int[] method5744() {
		return this.field3037;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-56736632"
	)
	int[] method5741() {
		return this.field3033;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "19"
	)
	int method5751() {
		return this.field3034;
	}
}
