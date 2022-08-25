import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ii")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
	@ObfuscatedName("nv")
	@ObfuscatedSignature(descriptor = "Lba;")
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;

	@ObfuscatedName("h")
	@Export("tileColors")
	final int[] tileColors;

	WorldMapSprite() {
		this.tileColors = new int[4096];
	}

	WorldMapSprite(int[] var1) {
		this.tileColors = var1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(III)I", garbageValue = "83994940")
	@Export("getTileColor")
	final int getTileColor(int var1, int var2) {
		return this.tileColors[var2 * 64 + var1];
	}
}