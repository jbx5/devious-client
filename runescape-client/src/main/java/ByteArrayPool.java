import net.runelite.mapping.ObfuscatedName;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.util.ArrayList;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("mm")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = -2132533809)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 1551258163)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 28601155)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -562517075)
	static int field4216;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = -30790003)
	static int field4207;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 677494483)
	static int field4208;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = -479475671)
	static int field4209;

	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = 714035553)
	static int field4210;

	@ObfuscatedName("z")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;

	@ObfuscatedName("r")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;

	@ObfuscatedName("u")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;

	@ObfuscatedName("k")
	static byte[][] field4214;

	@ObfuscatedName("a")
	public static ArrayList field4202;

	static {
		ByteArrayPool_smallCount = 0;
		ByteArrayPool_mediumCount = 0;
		ByteArrayPool_largeCount = 0;
		field4216 = 0;
		field4207 = 1000;
		field4208 = 250;
		field4209 = 100;
		field4210 = 50;
		ByteArrayPool_small = new byte[1000][];
		ByteArrayPool_medium = new byte[250][];
		ByteArrayPool_large = new byte[100][];
		field4214 = new byte[50][];
		field4202 = new ArrayList();
		class228.method4899();
		new HashMap();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(IZB)[B", garbageValue = "-1")
	@Export("ByteArrayPool_getArrayBool")
	static synchronized byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		byte[] var4;
		if (var0 != 100) {
			if (var0 < 100) {
			}
		} else if (ByteArrayPool_smallCount > 0) {
			var4 = ByteArrayPool_small[--ByteArrayPool_smallCount];
			ByteArrayPool_small[ByteArrayPool_smallCount] = null;
			return var4;
		}
		if (var0 != 5000) {
			if (var0 < 5000) {
			}
		} else if (ByteArrayPool_mediumCount > 0) {
			var4 = ByteArrayPool_medium[--ByteArrayPool_mediumCount];
			ByteArrayPool_medium[ByteArrayPool_mediumCount] = null;
			return var4;
		}
		if (var0 != 10000) {
			if (var0 < 10000) {
			}
		} else if (ByteArrayPool_largeCount > 0) {
			var4 = ByteArrayPool_large[--ByteArrayPool_largeCount];
			ByteArrayPool_large[ByteArrayPool_largeCount] = null;
			return var4;
		}
		if (var0 != 30000) {
			if (var0 < 30000) {
			}
		} else if (field4216 > 0) {
			var4 = field4214[--field4216];
			field4214[field4216] = null;
			return var4;
		}
		if (class464.ByteArrayPool_arrays != null) {
			for (int var2 = 0; var2 < Canvas.ByteArrayPool_alternativeSizes.length; ++var2) {
				if (Canvas.ByteArrayPool_alternativeSizes[var2] != var0) {
					if (var0 < Canvas.ByteArrayPool_alternativeSizes[var2]) {
					}
				} else if (class17.ByteArrayPool_altSizeArrayCounts[var2] > 0) {
					byte[] var3 = class464.ByteArrayPool_arrays[var2][--class17.ByteArrayPool_altSizeArrayCounts[var2]];
					class464.ByteArrayPool_arrays[var2][class17.ByteArrayPool_altSizeArrayCounts[var2]] = null;
					return var3;
				}
			}
		}
		return new byte[var0];
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(descriptor = "(Lci;ZI)V", garbageValue = "1209232624")
	@Export("addPlayerToScene")
	static void addPlayerToScene(Player var0, boolean var1) {
		if (var0 != null && var0.isVisible() && !var0.isHidden) {
			var0.isUnanimated = false;
			if ((Client.isLowDetail && Players.Players_count > 50 || Players.Players_count > 200) && var1 && var0.idleSequence == var0.movementSequence) {
				var0.isUnanimated = true;
			}
			int var2 = var0.x >> 7;
			int var3 = var0.y >> 7;
			if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
				long var4 = TaskHandler.calculateTag(0, 0, 0, false, var0.index);
				if (var0.model0 != null && Client.cycle >= var0.animationCycleStart && Client.cycle < var0.animationCycleEnd) {
					var0.isUnanimated = false;
					var0.tileHeight = SceneTilePaint.getTileHeight(var0.x, var0.y, PacketWriter.Client_plane);
					var0.playerCycle = Client.cycle;
					class356.scene.addNullableObject(PacketWriter.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.minX, var0.minY, var0.maxX, var0.maxY);
				} else {
					if ((var0.x & 127) == 64 && (var0.y & 127) == 64) {
						if (Client.tileLastDrawnActor[var2][var3] == Client.viewportDrawCount) {
							return;
						}
						Client.tileLastDrawnActor[var2][var3] = Client.viewportDrawCount;
					}
					var0.tileHeight = SceneTilePaint.getTileHeight(var0.x, var0.y, PacketWriter.Client_plane);
					var0.playerCycle = Client.cycle;
					class356.scene.drawEntity(PacketWriter.Client_plane, var0.x, var0.y, var0.tileHeight, 60, var0, var0.rotation, var4, var0.isWalking);
				}
			}
		}
	}
}