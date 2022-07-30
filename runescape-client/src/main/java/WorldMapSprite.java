import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import java.awt.FontMetrics;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ic")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("af")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;

	@ObfuscatedName("q")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096];
	}

	WorldMapSprite(int[] var1) {
		this.tileColors = var1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(IIB)I", garbageValue = "-78")
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var2 * 64 + var1];
	}
}