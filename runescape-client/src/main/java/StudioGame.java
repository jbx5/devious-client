import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("kz")
@Implements("StudioGame")
public enum StudioGame implements MouseWheel {

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lkz;")
	@Export("runescape")
	runescape("runescape", "RuneScape", 0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lkz;")
	@Export("stellardawn")
	stellardawn("stellardawn", "Stellar Dawn", 1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lkz;")
	@Export("game3")
	game3("game3", "Game 3", 2),
	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lkz;")
	@Export("game4")
	game4("game4", "Game 4", 3),
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lkz;")
	@Export("game5")
	game5("game5", "Game 5", 4),
	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lkz;")
	@Export("oldscape")
	oldscape("oldscape", "RuneScape 2007", 5);
	@ObfuscatedName("z")
	@Export("name")
	public final String name;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 344312613)
	@Export("id")
	final int id;

	StudioGame(String var3, String var4, int var5) {
		this.name = var3;
		this.id = var5;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1790946346")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "([BI)V", garbageValue = "886664804")
	@Export("ByteArrayPool_release")
	public static synchronized void ByteArrayPool_release(byte[] var0) {
		if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4231) {
			ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0;
		} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4232) {
			ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0;
		} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4234) {
			ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0;
		} else if (var0.length == 30000 && ByteArrayPool.field4233 < ByteArrayPool.field4238) {
			ByteArrayPool.field4224[++ByteArrayPool.field4233 - 1] = var0;
		} else if (ModeWhere.ByteArrayPool_arrays != null) {
			for (int var1 = 0; var1 < WorldMapSectionType.ByteArrayPool_alternativeSizes.length; ++var1) {
				if (var0.length == WorldMapSectionType.ByteArrayPool_alternativeSizes[var1] && Frames.ByteArrayPool_altSizeArrayCounts[var1] < ModeWhere.ByteArrayPool_arrays[var1].length) {
					ModeWhere.ByteArrayPool_arrays[var1][Frames.ByteArrayPool_altSizeArrayCounts[var1]++] = var0;
					return;
				}
			}
		}
	}

	@ObfuscatedName("hi")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1717154967")
	static final void method5763() {
		for (GraphicsObject var0 = ((GraphicsObject) (Client.graphicsObjects.last())); var0 != null; var0 = ((GraphicsObject) (Client.graphicsObjects.previous()))) {
			if (var0.plane == FriendSystem.Client_plane && !var0.isFinished) {
				if (Client.cycle >= var0.cycleStart) {
					var0.advance(Client.field744);
					if (var0.isFinished) {
						var0.remove();
					} else {
						Decimator.scene.drawEntity(var0.plane, var0.x, var0.y, var0.z, 60, var0, 0, -1L, false);
					}
				}
			} else {
				var0.remove();
			}
		}
	}
}