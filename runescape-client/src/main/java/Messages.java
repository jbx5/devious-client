import net.runelite.mapping.ObfuscatedName;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.util.Map;
import net.runelite.mapping.Export;
@ObfuscatedName("cb")
@Implements("Messages")
public class Messages {
	@ObfuscatedName("c")
	@Export("Messages_channels")
	static final Map Messages_channels;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lpb;")
	@Export("Messages_hashTable")
	static final IterableNodeHashTable Messages_hashTable;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lmh;")
	@Export("Messages_queue")
	static final IterableDualNodeQueue Messages_queue;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 2048371745)
	@Export("Messages_count")
	static int Messages_count;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 46362835)
	@Export("gameCyclesToDo")
	static int gameCyclesToDo;

	static {
		Messages_channels = new HashMap();
		Messages_hashTable = new IterableNodeHashTable(1024);
		Messages_queue = new IterableDualNodeQueue();
		Messages_count = 0;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "-472438759")
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var1 += 16;
		}
		if (var0 >= 256) {
			var0 >>>= 8;
			var1 += 8;
		}
		if (var0 >= 16) {
			var0 >>>= 4;
			var1 += 4;
		}
		if (var0 >= 4) {
			var0 >>>= 2;
			var1 += 2;
		}
		if (var0 >= 1) {
			var0 >>>= 1;
			++var1;
		}
		return var0 + var1;
	}

	@ObfuscatedName("gf")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-587731325")
	static final void method2494() {
		if (Client.field725 != PacketWriter.Client_plane) {
			Client.field725 = PacketWriter.Client_plane;
			int var0 = PacketWriter.Client_plane;
			int[] var1 = FloorUnderlayDefinition.sceneMinimapSprite.pixels;
			int var2 = var1.length;
			int var3;
			for (var3 = 0; var3 < var2; ++var3) {
				var1[var3] = 0;
			}
			int var4;
			int var5;
			for (var3 = 1; var3 < 103; ++var3) {
				var4 = (103 - var3) * 2048 + 24628;
				for (var5 = 1; var5 < 103; ++var5) {
					if ((Tiles.Tiles_renderFlags[var0][var5][var3] & 24) == 0) {
						class356.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
					}
					if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0) {
						class356.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
					}
					var4 += 4;
				}
			}
			var3 = (238 + ((int) (Math.random() * 20.0)) - 10 << 16) + (238 + ((int) (Math.random() * 20.0)) - 10 << 8) + (238 + ((int) (Math.random() * 20.0)) - 10);
			var4 = 238 + ((int) (Math.random() * 20.0)) - 10 << 16;
			FloorUnderlayDefinition.sceneMinimapSprite.setRaster();
			int var6;
			for (var5 = 1; var5 < 103; ++var5) {
				for (var6 = 1; var6 < 103; ++var6) {
					if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) {
						Decimator.drawObject(var0, var6, var5, var3, var4);
					}
					if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0) {
						Decimator.drawObject(var0 + 1, var6, var5, var3, var4);
					}
				}
			}
			Client.mapIconCount = 0;
			for (var5 = 0; var5 < 104; ++var5) {
				for (var6 = 0; var6 < 104; ++var6) {
					long var7 = class356.scene.getFloorDecorationTag(PacketWriter.Client_plane, var5, var6);
					if (0L != var7) {
						int var9 = Decimator.Entity_unpackID(var7);
						int var10 = class162.getObjectDefinition(var9).mapIconId;
						if (var10 >= 0 && class432.WorldMapElement_get(var10).field1837) {
							Client.mapIcons[Client.mapIconCount] = class432.WorldMapElement_get(var10).getSpriteBool(false);
							Client.mapIconXs[Client.mapIconCount] = var5;
							Client.mapIconYs[Client.mapIconCount] = var6;
							++Client.mapIconCount;
						}
					}
				}
			}
			Message.rasterProvider.apply();
		}
	}
}