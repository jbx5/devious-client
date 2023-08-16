import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
@Implements("HealthBarUpdate")
public class HealthBarUpdate extends Node {
	@ObfuscatedName("ai")
	@Export("SpriteBuffer_spriteWidths")
	static int[] SpriteBuffer_spriteWidths;
	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1944068325
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -749589017
	)
	@Export("health")
	int health;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 942133651
	)
	@Export("health2")
	int health2;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 243458057
	)
	@Export("cycleOffset")
	int cycleOffset;

	HealthBarUpdate(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "75"
	)
	@Export("set")
	void set(int var1, int var2, int var3, int var4) {
		this.cycle = var1;
		this.health = var2;
		this.health2 = var3;
		this.cycleOffset = var4;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-2006181389"
	)
	public static int method2412(CharSequence var0) {
		return DevicePcmPlayerProvider.method316(var0, 10, true);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lch;Lch;IZIZI)I",
		garbageValue = "1278568965"
	)
	static int method2411(World var0, World var1, int var2, boolean var3, int var4, boolean var5) {
		int var6 = class139.compareWorlds(var0, var1, var2, var3);
		if (var6 != 0) {
			return var3 ? -var6 : var6;
		} else if (var4 == -1) {
			return 0;
		} else {
			int var7 = class139.compareWorlds(var0, var1, var4, var5);
			return var5 ? -var7 : var7;
		}
	}

	@ObfuscatedName("na")
	static final void method2410(double var0) {
		Rasterizer3D.method4377(var0);
		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness(var0);
		UrlRequester.method2832();
		class449.clientPreferences.method2516(var0);
	}
}
