import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ln")
@Implements("WorldMapRectangle")
public final class WorldMapRectangle {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 431844209
	)
	@Export("width")
	int width;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2085513005
	)
	@Export("height")
	int height;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 812447689
	)
	@Export("x")
	int x;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1476495151
	)
	@Export("y")
	int y;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	final WorldMapRenderer this$0;

	@ObfuscatedSignature(
		descriptor = "(Llb;)V"
	)
	WorldMapRectangle(WorldMapRenderer var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1376732723"
	)
	public static int method6188(int var0) {
		return var0 >>> 12;
	}
}
