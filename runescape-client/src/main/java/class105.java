import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
public class class105 {
	@ObfuscatedName("wh")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("au")
	public static short[][] field1371;
	@ObfuscatedName("do")
	@ObfuscatedSignature(
		descriptor = "[Lvv;"
	)
	@Export("worldSelectFlagSprites")
	static IndexedSprite[] worldSelectFlagSprites;
	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "Lli;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;
	@ObfuscatedName("ny")
	@ObfuscatedGetter(
		intValue = 336627821
	)
	@Export("menuX")
	static int menuX;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 480813799
	)
	int field1368;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 712505425
	)
	int field1367;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1216371257
	)
	int field1373;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1154260291
	)
	int field1369;

	class105(int var1, int var2, int var3, int var4) {
		this.field1368 = var1;
		this.field1367 = var2;
		this.field1373 = var3;
		this.field1369 = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "977908339"
	)
	int method2772() {
		return this.field1368;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1345596466"
	)
	int method2777() {
		return this.field1367;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "2472"
	)
	int method2779() {
		return this.field1373;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "46"
	)
	int method2776() {
		return this.field1369;
	}

	@ObfuscatedName("ng")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	static final void method2785(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		clientPreferences.updateSoundEffectVolume(var0);
	}
}
