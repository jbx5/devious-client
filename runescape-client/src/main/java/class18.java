import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

import java.util.Comparator;
import java.util.Map;
@ObfuscatedName("k")
class class18 implements Comparator {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lja;")
	@Export("huffman")
	public static Huffman huffman;

	@ObfuscatedName("fn")
	@ObfuscatedGetter(intValue = 2076836845)
	@Export("worldPort")
	static int worldPort;

	@ObfuscatedSignature(descriptor = "Ld;")
	final class10 this$0;

	@ObfuscatedSignature(descriptor = "(Ld;)V")
	class18(class10 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Ljava/util/Map$Entry;Ljava/util/Map$Entry;S)I", garbageValue = "-13980")
	int method266(Map.Entry var1, Map.Entry var2) {
		return ((Float) (var2.getValue())).compareTo(((Float) (var1.getValue())));
	}

	public int compare(Object var1, Object var2) {
		return this.method266(((Map.Entry) (var1)), ((Map.Entry) (var2)));
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/Float;Ljava/lang/Float;B)V", garbageValue = "-87")
	static void method270(Float var0, Float var1) {
		if (var0 + class114.field1399 < 1.3333334F) {
			float var2 = var0 - 2.0F;
			float var3 = var0 - 1.0F;
			float var4 = ((float) (Math.sqrt(((double) (var2 * var2 - var3 * var3 * 4.0F)))));
			float var5 = (var4 + -var2) * 0.5F;
			if (var1 + class114.field1399 > var5) {
				var1 = var5 - class114.field1399;
			} else {
				var5 = (-var2 - var4) * 0.5F;
				if (var1 < class114.field1399 + var5) {
					var1 = class114.field1399 + var5;
				}
			}
		} else {
			var0 = 1.3333334F - class114.field1399;
			var1 = 0.33333334F - class114.field1399;
		}
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(descriptor = "(IIZI)V", garbageValue = "737086376")
	static final void method265(int var0, int var1, boolean var2) {
		if (!var2 || var0 != WorldMapCacheName.field2868 || SoundSystem.field319 != var1) {
			WorldMapCacheName.field2868 = var0;
			SoundSystem.field319 = var1;
			class82.updateGameState(25);
			class273.drawLoadingMessage("Loading - please wait.", true);
			int var3 = class300.baseX * 8;
			int var4 = Message.baseY * 64;
			class300.baseX = (var0 - 6) * 64;
			Message.baseY = (var1 - 6) * 8;
			int var5 = class300.baseX * 8 - var3;
			int var6 = Message.baseY * 64 - var4;
			var3 = class300.baseX * 8;
			var4 = Message.baseY * 64;
			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 32768; ++var7) {
				NPC var19 = Client.npcs[var7];
				if (var19 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var10000 = var19.pathX;
						var10000[var9] -= var5;
						var10000 = var19.pathY;
						var10000[var9] -= var6;
					}
					var19.x -= var5 * 128;
					var19.y -= var6 * 128;
				}
			}
			for (var7 = 0; var7 < 2048; ++var7) {
				Player var22 = Client.players[var7];
				if (var22 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var10000 = var22.pathX;
						var10000[var9] -= var5;
						var10000 = var22.pathY;
						var10000[var9] -= var6;
					}
					var22.x -= var5 * 128;
					var22.y -= var6 * 128;
				}
			}
			byte var20 = 0;
			byte var8 = 104;
			byte var21 = 1;
			if (var5 < 0) {
				var20 = 103;
				var8 = -1;
				var21 = -1;
			}
			byte var10 = 0;
			byte var11 = 104;
			byte var12 = 1;
			if (var6 < 0) {
				var10 = 103;
				var11 = -1;
				var12 = -1;
			}
			int var14;
			for (int var13 = var20; var8 != var13; var13 += var21) {
				for (var14 = var10; var11 != var14; var14 += var12) {
					int var15 = var5 + var13;
					int var16 = var14 + var6;
					for (int var17 = 0; var17 < 4; ++var17) {
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16];
						} else {
							Client.groundItems[var17][var13][var14] = null;
						}
					}
				}
			}
			for (PendingSpawn var18 = ((PendingSpawn) (Client.pendingSpawns.last())); var18 != null; var18 = ((PendingSpawn) (Client.pendingSpawns.previous()))) {
				var18.x -= var5;
				var18.y -= var6;
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) {
					var18.remove();
				}
			}
			if (Client.destinationX != 0) {
				Client.destinationX -= var5;
				Client.destinationY -= var6;
			}
			Client.soundEffectCount = 0;
			Client.isCameraLocked = false;
			WorldMapLabelSize.cameraX -= var5 << 7;
			Widget.cameraZ -= var6 << 7;
			ObjectSound.oculusOrbFocalPointX -= var5 << 7;
			class306.oculusOrbFocalPointY -= var6 << 7;
			Client.field518 = -1;
			Client.graphicsObjects.clear();
			Client.projectiles.clear();
			for (var14 = 0; var14 < 4; ++var14) {
				Client.collisionMaps[var14].clear();
			}
		}
	}
}