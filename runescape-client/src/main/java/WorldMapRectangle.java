import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kx")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -492167873
	)
	@Export("width")
	int width;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 263744651
	)
	@Export("height")
	int height;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -797779095
	)
	@Export("x")
	int x;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1754221743
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lkk;"
	)
	final WorldMapRenderer this$0;

	@ObfuscatedSignature(
		descriptor = "(Lkk;)V"
	)
	WorldMapRectangle(WorldMapRenderer var1) {
		this.this$0 = var1;
	}
}
