import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
public class class165 extends class150 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = -5149943919065830407L
	)
	long field1808;
	@ObfuscatedName("aw")
	String field1814;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 944662403
	)
	int field1809;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	class165(class153 var1) {
		this.this$0 = var1;
		this.field1808 = -1L;
		this.field1814 = null;
		this.field1809 = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V",
		garbageValue = "-1813719027"
	)
	void vmethod3822(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1808 = var1.readLong();
		}

		this.field1814 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1809 = var1.readUnsignedShort();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgy;I)V",
		garbageValue = "-2079483058"
	)
	void vmethod3821(ClanSettings var1) {
		var1.method3659(this.field1808, this.field1814, this.field1809);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "40"
	)
	static void method3755(String var0) {
		Login.displayName = class458.method8815(var0);
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(
		descriptor = "(Ldn;IIIIIIIII)V",
		garbageValue = "1500868973"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Scene var9 = var0.scene;
		if (var3 >= 1 && var4 >= 1 && var3 <= var0.sizeX - 1 && var4 <= var0.sizeY - 1) {
			if (Client.isLowDetail && var0.plane != var1) {
				return;
			}

			long var10 = 0L;
			boolean var12 = true;
			boolean var13 = false;
			boolean var14 = false;
			if (var2 == 0) {
				var10 = var9.getBoundaryObjectTag(var1, var3, var4);
			}

			if (var2 == 1) {
				var10 = var9.getWallDecorationTag(var1, var3, var4);
			}

			if (var2 == 2) {
				var10 = var9.getGameObjectTag(var1, var3, var4);
			}

			if (var2 == 3) {
				var10 = var9.getFloorDecorationTag(var1, var3, var4);
			}

			int var15;
			ObjectComposition var16;
			if (0L != var10) {
				var15 = var9.getObjectFlags(var1, var3, var4, var10);
				int var27 = class309.Entity_unpackID(var10);
				int var28 = var15 & 31;
				int var29 = var15 >> 6 & 3;
				var16 = UrlRequest.getObjectDefinition(var27);
				if (var16 != null && var16.hasSound()) {
					int var19 = var16.sizeX;
					int var20 = var16.sizeY;
					if (var29 == 1 || var29 == 3) {
						var19 = var16.sizeY;
						var20 = var16.sizeX;
					}

					int var21 = (var3 + var19) * 128;
					int var22 = (var20 + var4) * 128;
					int var17 = var3 * 128;
					int var18 = var4 * 128;
					int var23 = var16.ambientSoundId;
					int var24 = var16.int7 * 16384;
					int var25 = var16.int8 * 16384;
					if (var16.transforms != null) {
						ObjectComposition var26 = var16.transform();
						if (var26 != null) {
							var23 = var26.ambientSoundId;
							var24 = var26.int7 * 16384;
							var25 = var26.int8 * 16384;
						}
					}

					Object var10000 = null;

					for (ObjectSound var30 = (ObjectSound)ObjectSound.objectSounds.last(); var30 != null; var30 = (ObjectSound)ObjectSound.objectSounds.previous()) {
						if (var30.plane == var1 && var17 == var30.x * 16384 && var18 == var30.y * 128 && var21 == var30.maxX * 16384 && var22 == var30.maxY * 128 && var23 == var30.soundEffectId && var24 == var30.field832 && var25 == var30.field839) {
							if (var30.stream1 != null) {
								Widget.pcmStreamMixer.removeSubStream(var30.stream1);
								var30.stream1 = null;
							}

							if (var30.stream2 != null) {
								Widget.pcmStreamMixer.removeSubStream(var30.stream2);
								var30.stream2 = null;
							}

							var30.remove();
							break;
						}

						var10000 = null;
					}
				}

				if (var2 == 0) {
					var9.removeBoundaryObject(var1, var3, var4);
					if (var16.interactType != 0) {
						var0.collisionMaps[var1].method5716(var3, var4, var28, var29, var16.boolean1);
					}
				}

				if (var2 == 1) {
					var9.removeWallDecoration(var1, var3, var4);
				}

				if (var2 == 2) {
					var9.removeGameObject(var1, var3, var4);
					if (var3 + var16.sizeX > var0.sizeX - 1 || var4 + var16.sizeX > var0.sizeY - 1 || var3 + var16.sizeY > var0.sizeX - 1 || var4 + var16.sizeY > var0.sizeY - 1) {
						return;
					}

					if (var16.interactType != 0) {
						var0.collisionMaps[var1].setFlagOffNonSquare(var3, var4, var16.sizeX, var16.sizeY, var29, var16.boolean1);
					}
				}

				if (var2 == 3) {
					var9.removeFloorDecoration(var1, var3, var4);
					if (var16.interactType == 1) {
						var0.collisionMaps[var1].method5718(var3, var4);
					}
				}
			}

			if (var5 >= 0) {
				var15 = var1;
				if (var1 < 3 && (var0.tileSettings[1][var3][var4] & 2) == 2) {
					var15 = var1 + 1;
				}

				MouseHandler.method665(var0, var1, var15, var3, var4, var5, var6, var7, var8, var0.collisionMaps[var1]);
				var16 = UrlRequest.getObjectDefinition(var5);
				if (var16 != null && var16.hasSound()) {
					class138.createObjectSound(var15, var3, var4, var16, var6);
				}
			}
		}

	}
}
