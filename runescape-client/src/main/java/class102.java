import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dj")
public class class102 {
	@ObfuscatedName("tl")
	@ObfuscatedSignature(
		descriptor = "Luz;"
	)
	@Export("sceneMinimapSprite")
	static SpritePixels sceneMinimapSprite;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1867358049
	)
	int field1331;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -774659485
	)
	int field1326;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1791518877
	)
	int field1327;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1398606761
	)
	int field1325;

	class102(int var1, int var2, int var3, int var4) {
		this.field1331 = var1;
		this.field1326 = var2;
		this.field1327 = var3;
		this.field1325 = var4;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "664232090"
	)
	int method2734() {
		return this.field1331;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1580269670"
	)
	int method2730() {
		return this.field1326;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-21"
	)
	int method2731() {
		return this.field1327;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	int method2732() {
		return this.field1325;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Lko;",
		garbageValue = "-1983844659"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			var1 = class135.method3151(SequenceDefinition.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, var0, false);
			if (var1 != null) {
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var1, (long)var0);
			}

			return var1;
		}
	}

	@ObfuscatedName("hk")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1556654633"
	)
	static void method2743(int var0, int var1) {
		int[] var2 = new int[9];

		for (int var3 = 0; var3 < var2.length; ++var3) {
			int var4 = var3 * 32 + 15 + 128;
			int var5 = class158.method3414(var4);
			int var6 = Rasterizer3D.Rasterizer3D_sine[var4];
			var5 = class395.method7401(var5, var1);
			var2[var3] = var5 * var6 >> 16;
		}

		Scene.Scene_buildVisiblityMap(var2, 500, 800, var0 * 334 / var1, 334);
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-702066776"
	)
	static final void method2728() {
		if (MusicPatchPcmStream.pcmPlayer1 != null) {
			MusicPatchPcmStream.pcmPlayer1.run();
		}

	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-100"
	)
	@Export("playSong")
	static void playSong(int var0) {
		if (var0 == -1 && !Client.playingJingle) {
			WorldMapRenderer.method4769(0, 0);
		} else if (var0 != -1) {
			boolean var1;
			if (class316.field3424.isEmpty()) {
				var1 = false;
			} else {
				MusicSong var2 = (MusicSong)class316.field3424.get(0);
				var1 = var2 != null && var0 == var2.musicTrackGroupId;
			}

			if (!var1 && WorldMapIcon_1.clientPreferences.getMusicVolume() != 0) {
				ArrayList var3 = new ArrayList();
				var3.add(new MusicSong(class514.archive6, var0, 0, WorldMapIcon_1.clientPreferences.getMusicVolume(), false));
				if (Client.playingJingle) {
					class316.field3424.clear();
					class316.field3424.addAll(var3);
					EnumComposition.method3678(0, 100, 100, 0);
				} else {
					PendingSpawn.method2459(var3, 0, 100, 100, 0, false);
				}
			}
		}

	}
}
