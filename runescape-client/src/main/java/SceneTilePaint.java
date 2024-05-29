import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("ez")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 2059256981
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -631865327
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1859225255
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 157049983
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1479354403
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("aa")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -864693021
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
}
