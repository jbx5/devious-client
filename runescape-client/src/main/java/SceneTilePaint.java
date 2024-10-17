import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 101319007
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -299037217
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1442215975
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -180116541
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 860316531
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("ay")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1197868651
	)
	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true;
		this.swColor = var1;
		this.seColor = var2;
		this.neColor = var3;
		this.nwColor = var4;
		this.texture = var5;
		this.rgb = var6;
		this.isFlat = var7;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-1"
	)
	static final void method5490() {
		Object var10000 = null;
		String var0 = "Your ignore list is full. Max of 100 for free users, and 400 for members";
		class430.addGameMessage(30, "", var0);
	}
}
