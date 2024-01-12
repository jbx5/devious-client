import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 2084419831
	)
	@Export("width")
	int width;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1215993933
	)
	@Export("height")
	int height;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -213602905
	)
	@Export("x")
	int x;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 762996225
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ljj;"
	)
	final WorldMapRenderer this$0;

	@ObfuscatedSignature(
		descriptor = "(Ljj;)V"
	)
	WorldMapRectangle(WorldMapRenderer var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "17"
	)
	public static void method5019(int var0, int var1, int var2, int var3) {
		class319.musicPlayerStatus = var0;
		class319.field3464 = var1;
		class319.field3465 = var2;
		class319.field3454 = var3;
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1151527319"
	)
	static final void method5020() {
		if (WorldMap.pcmPlayer1 != null) {
			WorldMap.pcmPlayer1.run();
		}

	}
}
