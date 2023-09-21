import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("jz")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 857101947
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1433788915
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1941083859
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -404964921
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1645053527
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("ah")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1079250789
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
