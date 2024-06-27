import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iz")
public class class233 {
	@ObfuscatedName("wq")
	@ObfuscatedSignature(
		descriptor = "Loe;"
	)
	static JagNetThread field2486;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	static final class233 field2477;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	static final class233 field2476;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	static final class233 field2478;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	static final class233 field2484;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	static final class233 field2479;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	static final class233 field2480;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Liz;"
	)
	static final class233 field2481;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Liz;"
	)
	static final class233[] field2485;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1780844367
	)
	final int field2482;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1921123689
	)
	final int field2483;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -120925093
	)
	final int field2475;

	static {
		field2477 = new class233(0, 8, 8);
		field2476 = new class233(5, 16, 16);
		field2478 = new class233(3, 32, 32);
		field2484 = new class233(2, 48, 48);
		field2479 = new class233(1, 64, 64);
		field2480 = new class233(4, 96, 96);
		field2481 = new class233(6, 128, 128);
		field2485 = Actor.method2477();
		Arrays.sort(field2485, new class241());
	}

	class233(int var1, int var2, int var3) {
		this.field2482 = var1;
		this.field2483 = var2;
		this.field2475 = var3;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "124"
	)
	int method4441() {
		return this.field2483 * this.field2475;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(Lnx;IS)V",
		garbageValue = "303"
	)
	public static void method4446(Widget var0, int var1) {
		ItemComposition var2 = class164.ItemDefinition_get(var1);
		var0.field3838.equipment[var2.maleModel] = var1 + 512;
		if (var2.maleModel1 != -1) {
			var0.field3838.equipment[var2.maleModel1] = 0;
		}

		if (var2.maleModel2 != -1) {
			var0.field3838.equipment[var2.maleModel2] = 0;
		}

		var0.field3838.method6538();
	}
}
