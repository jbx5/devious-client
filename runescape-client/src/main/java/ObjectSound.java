import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cv")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lps;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -927953281
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -784486528
	)
	@Export("x")
	int x;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 762373049
	)
	@Export("y")
	int y;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1924527011
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1003361881
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -632801265
	)
	int field846;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 912132477
	)
	int field847;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 426447249
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lbm;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1111981983
	)
	int field841;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 997080131
	)
	int field854;
	@ObfuscatedName("ai")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1341306061
	)
	int field843;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lbm;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque();
	}

	ObjectSound() {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1862821053"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field846 = var2.int7 * 16384;
			this.field847 = var2.int8 * 16384;
			this.field841 = var2.int5;
			this.field854 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field846 = 0;
			this.field847 = 0;
			this.field841 = 0;
			this.field854 = 0;
			this.soundEffectIds = null;
		}

		if (var1 != this.soundEffectId && this.stream1 != null) {
			HealthBarUpdate.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("gc")
	@ObfuscatedSignature(
		descriptor = "(I)Lta;",
		garbageValue = "398370712"
	)
	@Export("getPlatformInfo")
	static PlatformInfo getPlatformInfo() {
		return class166.platformInfo;
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "-1343112272"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
			if (Client.isLowDetail && var0 != class172.Client_plane) {
				return;
			}

			long var8 = 0L;
			boolean var10 = true;
			boolean var11 = false;
			boolean var12 = false;
			if (var1 == 0) {
				var8 = LoginType.scene.getBoundaryObjectTag(var0, var2, var3);
			}

			if (var1 == 1) {
				var8 = LoginType.scene.getWallDecorationTag(var0, var2, var3);
			}

			if (var1 == 2) {
				var8 = LoginType.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) {
				var8 = LoginType.scene.getFloorDecorationTag(var0, var2, var3);
			}

			int var13;
			ObjectComposition var14;
			if (var8 != 0L) {
				var13 = LoginType.scene.getObjectFlags(var0, var2, var3, var8);
				int var25 = NpcOverrides.Entity_unpackID(var8);
				int var26 = var13 & 31;
				int var27 = var13 >> 6 & 3;
				var14 = MouseRecorder.getObjectDefinition(var25);
				if (var14 != null && var14.hasSound()) {
					int var17 = var14.sizeX;
					int var18 = var14.sizeY;
					if (var27 == 1 || var27 == 3) {
						var17 = var14.sizeY;
						var18 = var14.sizeX;
					}

					int var19 = (var17 + var2) * 128;
					int var20 = (var18 + var3) * 128;
					int var15 = var2 * 128;
					int var16 = var3 * 128;
					int var21 = var14.ambientSoundId;
					int var22 = var14.int7 * 16384;
					int var23 = var14.int8 * 16384;
					if (var14.transforms != null) {
						ObjectComposition var24 = var14.transform();
						if (var24 != null) {
							var21 = var24.ambientSoundId;
							var22 = var24.int7 * 16384;
							var23 = var24.int8 * 16384;
						}
					}

					Object var10000 = null;

					for (ObjectSound var28 = (ObjectSound)objectSounds.last(); var28 != null; var28 = (ObjectSound)objectSounds.previous()) {
						if (var0 == var28.plane && var15 == var28.x * 128 && var16 == var28.y * 16384 && var19 == var28.maxX * 16384 && var20 == var28.maxY * 16384 && var21 == var28.soundEffectId && var22 == var28.field846 && var23 == var28.field847) {
							if (var28.stream1 != null) {
								HealthBarUpdate.pcmStreamMixer.removeSubStream(var28.stream1);
								var28.stream1 = null;
							}

							if (var28.stream2 != null) {
								HealthBarUpdate.pcmStreamMixer.removeSubStream(var28.stream2);
								var28.stream2 = null;
							}

							var28.remove();
							break;
						}

						var10000 = null;
					}
				}

				if (var1 == 0) {
					LoginType.scene.removeBoundaryObject(var0, var2, var3);
					if (var14.interactType != 0) {
						Client.collisionMaps[var0].method4358(var2, var3, var26, var27, var14.boolean1);
					}
				}

				if (var1 == 1) {
					LoginType.scene.removeWallDecoration(var0, var2, var3);
				}

				if (var1 == 2) {
					LoginType.scene.removeGameObject(var0, var2, var3);
					if (var2 + var14.sizeX > 103 || var3 + var14.sizeX > 103 || var2 + var14.sizeY > 103 || var3 + var14.sizeY > 103) {
						return;
					}

					if (var14.interactType != 0) {
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var14.sizeX, var14.sizeY, var27, var14.boolean1);
					}
				}

				if (var1 == 3) {
					LoginType.scene.removeFloorDecoration(var0, var2, var3);
					if (var14.interactType == 1) {
						Client.collisionMaps[var0].method4361(var2, var3);
					}
				}
			}

			if (var4 >= 0) {
				var13 = var0;
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) {
					var13 = var0 + 1;
				}

				ServerPacket.method5935(var0, var13, var2, var3, var4, var5, var6, var7, LoginType.scene, Client.collisionMaps[var0]);
				var14 = MouseRecorder.getObjectDefinition(var4);
				if (var14 != null && var14.hasSound()) {
					JagNetThread.createObjectSound(var13, var2, var3, var14, var5);
				}
			}
		}

	}

	@ObfuscatedName("no")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	static final void method1921(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		NPC.clientPreferences.updateAreaSoundEffectsVolume(var0);
	}
}
