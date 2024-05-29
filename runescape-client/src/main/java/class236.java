import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ji")
public class class236 {
	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "Lux;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("ak")
	final int[][] field2514;
	@ObfuscatedName("al")
	final int[][] field2513;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1470630343
	)
	int field2521;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -251425913
	)
	int field2516;
	@ObfuscatedName("af")
	final int[] field2517;
	@ObfuscatedName("aa")
	final int[] field2518;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1566139879
	)
	final int field2519;

	class236(int var1, int var2) {
		this.field2514 = new int[var1][var2];
		this.field2513 = new int[var1][var2];
		int var3 = var2 * var1;
		int var4 = Skeleton.method4848(var3 / 4);
		this.field2517 = new int[var4];
		this.field2518 = new int[var4];
		this.field2519 = var4 - 1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1050189932"
	)
	void method4506() {
		for (int var1 = 0; var1 < this.field2514.length; ++var1) {
			for (int var2 = 0; var2 < this.field2514[var1].length; ++var2) {
				this.field2514[var1][var2] = 0;
				this.field2513[var1][var2] = 99999999;
			}
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-210755607"
	)
	void method4507(int var1, int var2) {
		this.field2521 = var1;
		this.field2516 = var2;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-27"
	)
	int method4508() {
		return this.field2521;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1650758633"
	)
	int method4530() {
		return this.field2516;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-277328343"
	)
	int method4510() {
		return this.field2514.length;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-981883622"
	)
	int method4519() {
		return this.field2514[0].length;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "-1741393979"
	)
	int[][] method4529() {
		return this.field2514;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "-978084632"
	)
	int[][] method4513() {
		return this.field2513;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1500503665"
	)
	int[] method4521() {
		return this.field2517;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-555825863"
	)
	int[] method4515() {
		return this.field2518;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2147483647"
	)
	int method4516() {
		return this.field2519;
	}
}
