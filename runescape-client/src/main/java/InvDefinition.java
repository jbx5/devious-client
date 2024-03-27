import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
@Implements("InvDefinition")
public class InvDefinition extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("InvDefinition_archive")
	public static AbstractArchive InvDefinition_archive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("InvDefinition_cached")
	static EvictingDualNodeHashTable InvDefinition_cached;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1271664897
	)
	@Export("size")
	public int size;

	static {
		InvDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	InvDefinition() {
		this.size = 0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "1210197869"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lur;IB)V",
		garbageValue = "70"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 2) {
			this.size = var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-490434356"
	)
	static final int method3695(int var0, int var1, int var2) {
		int var3 = var0 / var2;
		int var4 = var0 & var2 - 1;
		int var5 = var1 / var2;
		int var6 = var1 & var2 - 1;
		int var7 = MilliClock.method3544(var3, var5);
		int var8 = MilliClock.method3544(var3 + 1, var5);
		int var9 = MilliClock.method3544(var3, var5 + 1);
		int var10 = MilliClock.method3544(var3 + 1, var5 + 1);
		int var11 = class165.method3401(var7, var8, var4, var2);
		int var12 = class165.method3401(var9, var10, var4, var2);
		return class165.method3401(var11, var12, var6, var2);
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "1849013746"
	)
	static final void method3708(int var0, int var1, boolean var2) {
		if (!var2 || var0 != HttpRequestTask.field85 || HttpMethod.field36 != var1) {
			HttpRequestTask.field85 = var0;
			HttpMethod.field36 = var1;
			FaceNormal.updateGameState(25);
			WorldMapSectionType.drawLoadingMessage("Loading - please wait.", true);
			int var3 = GrandExchangeOfferOwnWorldComparator.baseX * 64;
			int var4 = DevicePcmPlayerProvider.baseY * 64;
			GrandExchangeOfferOwnWorldComparator.baseX = (var0 - 6) * 8;
			DevicePcmPlayerProvider.baseY = (var1 - 6) * 8;
			int var5 = GrandExchangeOfferOwnWorldComparator.baseX * 64 - var3;
			int var6 = DevicePcmPlayerProvider.baseY * 64 - var4;
			var3 = GrandExchangeOfferOwnWorldComparator.baseX * 64;
			var4 = DevicePcmPlayerProvider.baseY * 64;

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 65536; ++var7) {
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
			for (int var13 = var20; var13 != var8; var13 += var21) {
				for (var14 = var10; var11 != var14; var14 += var12) {
					int var15 = var13 + var5;
					int var16 = var6 + var14;

					for (int var17 = 0; var17 < 4; ++var17) {
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16];
						} else {
							Client.groundItems[var17][var13][var14] = null;
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) {
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
			class193.cameraZ -= var6 << 7;
			class185.oculusOrbFocalPointX -= var5 << 7;
			Skeleton.oculusOrbFocalPointY -= var6 << 7;
			Client.field756 = -1;
			Client.graphicsObjects.clear();
			Client.projectiles.clear();

			for (var14 = 0; var14 < 4; ++var14) {
				Client.collisionMaps[var14].clear();
			}

		}
	}

	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2083220223"
	)
	@Export("setMusicVolume")
	static final void setMusicVolume(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != NPC.clientPreferences.getMusicVolume()) {
			label60: {
				if (NPC.clientPreferences.getMusicVolume() == 0) {
					boolean var1 = !class321.field3496.isEmpty();
					if (var1) {
						class190.method3711(UserComparator6.archive6, var0);
						Client.playingJingle = false;
						break label60;
					}
				}

				if (var0 == 0) {
					class11.method108(0, 0);
					Client.playingJingle = false;
				} else if (!class321.musicSongs.isEmpty()) {
					Iterator var3 = class321.musicSongs.iterator();

					while (var3.hasNext()) {
						MusicSong var2 = (MusicSong)var3.next();
						if (var2 != null) {
							var2.musicTrackVolume = var0;
						}
					}

					MusicSong var4 = (MusicSong)class321.musicSongs.get(0);
					if (var4 != null && var4.midiPcmStream != null && var4.midiPcmStream.isReady() && !var4.field3604) {
						var4.midiPcmStream.setPcmStreamVolume(var0);
						var4.field3608 = (float)var0;
					}
				}
			}

			NPC.clientPreferences.updateMusicVolume(var0);
		}

	}
}
