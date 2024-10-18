import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
@Implements("WorldMapData_0")
public class WorldMapData_0 extends AbstractWorldMapData {
	WorldMapData_0() {
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvl;B)V",
		garbageValue = "101"
	)
	@Export("init")
	void init(Buffer var1) {
		int var2 = var1.readUnsignedByte();
		if (var2 != WorldMapID.field3244.value) {
			throw new IllegalStateException("");
		} else {
			super.minPlane = var1.readUnsignedByte();
			super.planes = var1.readUnsignedByte();
			super.regionXLow = var1.readUnsignedShort() * 4096;
			super.regionYLow = var1.readUnsignedShort() * 64;
			super.regionX = var1.readUnsignedShort();
			super.regionY = var1.readUnsignedShort();
			super.groupId = var1.readNullableLargeSmart();
			super.fileId = var1.readNullableLargeSmart();
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V",
		garbageValue = "506593636"
	)
	@Export("readGeography")
	void readGeography(Buffer var1) {
		super.planes = Math.min(super.planes, 4);
		super.floorUnderlayIds = new short[1][64][64];
		super.floorOverlayIds = new short[super.planes][64][64];
		super.field3210 = new byte[super.planes][64][64];
		super.field3211 = new byte[super.planes][64][64];
		super.decorations = new WorldMapDecoration[super.planes][64][64][];
		int var2 = var1.readUnsignedByte();
		if (var2 != class298.field3238.value) {
			throw new IllegalStateException("");
		} else {
			int var3 = var1.readUnsignedByte();
			int var4 = var1.readUnsignedByte();
			if (var3 == super.regionX && var4 == super.regionY) {
				for (int var5 = 0; var5 < 64; ++var5) {
					for (int var6 = 0; var6 < 64; ++var6) {
						this.readTile(var5, var6, var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof WorldMapData_0)) {
			return false;
		} else {
			WorldMapData_0 var2 = (WorldMapData_0)var1;
			return super.regionX == var2.regionX && var2.regionY == super.regionY;
		}
	}

	public int hashCode() {
		return super.regionX | super.regionY << 8;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lfv;FZI)F",
		garbageValue = "-142044248"
	)
	static float method5869(class137 var0, float var1, boolean var2) {
		float var3 = 0.0F;
		if (var0 != null && var0.method3452() != 0) {
			float var4 = (float)var0.field1596[0].field1538;
			float var5 = (float)var0.field1596[var0.method3452() - 1].field1538;
			float var6 = var5 - var4;
			if (var6 == 0.0F) {
				return var0.field1596[0].field1541;
			} else {
				float var7 = 0.0F;
				if (var1 > var5) {
					var7 = (var1 - var5) / var6;
				} else {
					var7 = (var1 - var4) / var6;
				}

				float var8 = (float)((int)var7);
				float var9 = Math.abs(var7 - var8);
				float var10 = var6 * var9;
				var8 = Math.abs(1.0F + var8);
				float var11 = var8 / 2.0F;
				float var12 = (float)((int)var11);
				var9 = var11 - var12;
				float var13;
				float var14;
				if (var2) {
					if (var0.field1605 == class135.field1580) {
						if (0.0F != var9) {
							var10 += var4;
						} else {
							var10 = var5 - var10;
						}
					} else if (var0.field1605 != class135.field1583 && var0.field1605 != class135.field1579) {
						if (var0.field1605 == class135.field1577) {
							var10 = var4 - var1;
							var13 = var0.field1596[0].field1542;
							var14 = var0.field1596[0].field1540;
							var3 = var0.field1596[0].field1541;
							if (0.0F != var13) {
								var3 -= var14 * var10 / var13;
							}

							return var3;
						}
					} else {
						var10 = var5 - var10;
					}
				} else if (var0.field1595 == class135.field1580) {
					if (0.0F != var9) {
						var10 = var5 - var10;
					} else {
						var10 += var4;
					}
				} else if (var0.field1595 != class135.field1583 && var0.field1595 != class135.field1579) {
					if (var0.field1595 == class135.field1577) {
						var10 = var1 - var5;
						var13 = var0.field1596[var0.method3452() - 1].field1543;
						var14 = var0.field1596[var0.method3452() - 1].field1537;
						var3 = var0.field1596[var0.method3452() - 1].field1541;
						if (0.0F != var13) {
							var3 += var10 * var14 / var13;
						}

						return var3;
					}
				} else {
					var10 += var4;
				}

				var3 = Occluder.method5268(var0, var10);
				float var15;
				if (var2 && var0.field1605 == class135.field1579) {
					var15 = var0.field1596[var0.method3452() - 1].field1541 - var0.field1596[0].field1541;
					var3 -= var8 * var15;
				} else if (!var2 && var0.field1595 == class135.field1579) {
					var15 = var0.field1596[var0.method3452() - 1].field1541 - var0.field1596[0].field1541;
					var3 += var8 * var15;
				}

				return var3;
			}
		} else {
			return var3;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-86"
	)
	static void method5862(int var0, int var1, int var2, int var3) {
		for (ObjectSound var4 = (ObjectSound)ObjectSound.objectSounds.last(); var4 != null; var4 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var4.soundEffectId != -1 || var4.soundEffectIds != null) {
				int var5 = 0;
				if (var1 > var4.maxX * 16384) {
					var5 += var1 - var4.maxX * 16384;
				} else if (var1 < var4.x * 16384) {
					var5 += var4.x * 16384 - var1;
				}

				if (var2 > var4.maxY * 128) {
					var5 += var2 - var4.maxY * 128;
				} else if (var2 < var4.y * 128) {
					var5 += var4.y * 128 - var2;
				}

				var5 = Math.max(var5 - 64, 0);
				if (var5 < var4.field832 && TaskHandler.clientPreferences.getAreaSoundEffectsVolume() != 0 && var0 == var4.plane) {
					float var6 = var4.field839 < var4.field832 ? Math.min(Math.max((float)(var4.field832 - var5) / (float)(var4.field832 - var4.field839), 0.0F), 1.0F) : 1.0F;
					int var7 = (int)(var6 * (float)TaskHandler.clientPreferences.getAreaSoundEffectsVolume());
					if (var4.stream1 == null) {
						if (var4.soundEffectId >= 0) {
							SoundEffect var8 = SoundEffect.readSoundEffect(ObjectComposition.soundEffectsArchive, var4.soundEffectId, 0);
							if (var8 != null) {
								RawSound var9 = var8.toRawSound().resample(class333.decimator);
								RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var7);
								var10.setNumLoops(-1);
								Widget.pcmStreamMixer.addSubStream(var10);
								var4.stream1 = var10;
							}
						}
					} else {
						var4.stream1.method904(var7);
					}

					if (var4.stream2 == null) {
						if (var4.soundEffectIds != null && (var4.field845 -= var3) <= 0) {
							int var12 = (int)(Math.random() * (double)var4.soundEffectIds.length);
							SoundEffect var13 = SoundEffect.readSoundEffect(ObjectComposition.soundEffectsArchive, var4.soundEffectIds[var12], 0);
							if (var13 != null) {
								RawSound var14 = var13.toRawSound().resample(class333.decimator);
								RawPcmStream var11 = RawPcmStream.createRawPcmStream(var14, 100, var7);
								var11.setNumLoops(0);
								Widget.pcmStreamMixer.addSubStream(var11);
								var4.stream2 = var11;
								var4.field845 = var4.field842 + (int)(Math.random() * (double)(var4.field841 - var4.field842));
							}
						}
					} else {
						var4.stream2.method904(var7);
						if (!var4.stream2.hasNext()) {
							var4.stream2 = null;
						}
					}
				} else {
					if (var4.stream1 != null) {
						Widget.pcmStreamMixer.removeSubStream(var4.stream1);
						var4.stream1 = null;
					}

					if (var4.stream2 != null) {
						Widget.pcmStreamMixer.removeSubStream(var4.stream2);
						var4.stream2 = null;
					}
				}
			}
		}

	}
}
