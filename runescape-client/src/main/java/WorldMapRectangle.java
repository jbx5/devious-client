import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ls")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1460416259
	)
	@Export("width")
	int width;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1775400951
	)
	@Export("height")
	int height;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 527392937
	)
	@Export("x")
	int x;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -63485769
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	final WorldMapRenderer this$0;

	@ObfuscatedSignature(
		descriptor = "(Llu;)V"
	)
	WorldMapRectangle(WorldMapRenderer var1) {
		this.this$0 = var1;
	}
}
