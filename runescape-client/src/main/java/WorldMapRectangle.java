import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jb")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 461321989
	)
	@Export("width")
	int width;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1928726943
	)
	@Export("height")
	int height;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 965704867
	)
	@Export("x")
	int x;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -2135639707
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	final WorldMapRenderer this$0;

	@ObfuscatedSignature(
		descriptor = "(Ljn;)V"
	)
	WorldMapRectangle(WorldMapRenderer var1) {
		this.this$0 = var1;
	}
}
