import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
public class class114 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -922141965
	)
	int field1407;
	@ObfuscatedName("p")
	float field1409;
	@ObfuscatedName("f")
	float field1406;
	@ObfuscatedName("n")
	float field1412;
	@ObfuscatedName("k")
	float field1410;
	@ObfuscatedName("w")
	float field1411;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ldz;"
	)
	class114 field1414;

	class114() {
		this.field1406 = Float.MAX_VALUE;
		this.field1412 = Float.MAX_VALUE; // L: 9
		this.field1410 = Float.MAX_VALUE;
		this.field1411 = Float.MAX_VALUE;
	} // L: 14

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqq;II)V",
		garbageValue = "1931269991"
	)
	void method2807(Buffer var1, int var2) {
		this.field1407 = var1.readShort(); // L: 17
		this.field1409 = var1.method7930(); // L: 18
		this.field1406 = var1.method7930(); // L: 19
		this.field1412 = var1.method7930(); // L: 20
		this.field1410 = var1.method7930(); // L: 21
		this.field1411 = var1.method7930(); // L: 22
	} // L: 23

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Llv;III)Lqi;",
		garbageValue = "1230406258"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		if (!Occluder.method4475(var0, var1, var2)) { // L: 38
			return null;
		} else {
			SpritePixels var4 = new SpritePixels(); // L: 41
			var4.width = SecureRandomCallable.SpriteBuffer_spriteWidth; // L: 42
			var4.height = class402.SpriteBuffer_spriteHeight; // L: 43
			var4.xOffset = class458.SpriteBuffer_xOffsets[0]; // L: 44
			var4.yOffset = class458.SpriteBuffer_yOffsets[0]; // L: 45
			var4.subWidth = ApproximateRouteStrategy.SpriteBuffer_spriteWidths[0]; // L: 46
			var4.subHeight = UserComparator9.SpriteBuffer_spriteHeights[0]; // L: 47
			int var5 = var4.subWidth * var4.subHeight; // L: 48
			byte[] var6 = FileSystem.SpriteBuffer_pixels[0]; // L: 49
			var4.pixels = new int[var5]; // L: 50

			for (int var7 = 0; var7 < var5; ++var7) { // L: 51
				var4.pixels[var7] = class458.SpriteBuffer_spritePalette[var6[var7] & 255];
			}

			class458.SpriteBuffer_xOffsets = null; // L: 53
			class458.SpriteBuffer_yOffsets = null; // L: 54
			ApproximateRouteStrategy.SpriteBuffer_spriteWidths = null; // L: 55
			UserComparator9.SpriteBuffer_spriteHeights = null; // L: 56
			class458.SpriteBuffer_spritePalette = null; // L: 57
			FileSystem.SpriteBuffer_pixels = null; // L: 58
			return var4; // L: 62
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "55"
	)
	public static boolean method2806(int var0) {
		return var0 >= 0 && var0 < 112 ? KeyHandler.field133[var0] : false; // L: 232 233
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)Lfx;",
		garbageValue = "0"
	)
	public static Clock method2805() {
		try {
			return new NanoClock(); // L: 8
		} catch (Throwable var1) { // L: 10
			return new MilliClock(); // L: 11
		}
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(ZLqf;B)V",
		garbageValue = "85"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0; // L: 5338
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		if (!Client.isInInstance) { // L: 5339
			int var2 = var1.readUnsignedShortLE(); // L: 5340
			var3 = var1.readUnsignedShortLE(); // L: 5341
			var4 = var1.readUnsignedShort(); // L: 5342
			class202.xteaKeys = new int[var4][4]; // L: 5343

			for (var5 = 0; var5 < var4; ++var5) { // L: 5344
				for (var6 = 0; var6 < 4; ++var6) { // L: 5345
					class202.xteaKeys[var5][var6] = var1.readInt(); // L: 5346
				}
			}

			class269.regions = new int[var4]; // L: 5349
			class124.regionMapArchiveIds = new int[var4]; // L: 5350
			HitSplatDefinition.regionLandArchiveIds = new int[var4]; // L: 5351
			class269.regionLandArchives = new byte[var4][]; // L: 5352
			class33.regionMapArchives = new byte[var4][]; // L: 5353
			var4 = 0; // L: 5354

			for (var5 = (var3 - 6) / 8; var5 <= (var3 + 6) / 8; ++var5) { // L: 5355
				for (var6 = (var2 - 6) / 8; var6 <= (var2 + 6) / 8; ++var6) { // L: 5356
					var7 = var6 + (var5 << 8); // L: 5357
					class269.regions[var4] = var7; // L: 5358
					class124.regionMapArchiveIds[var4] = class434.archive9.getGroupId("m" + var5 + "_" + var6); // L: 5359
					HitSplatDefinition.regionLandArchiveIds[var4] = class434.archive9.getGroupId("l" + var5 + "_" + var6); // L: 5360
					++var4; // L: 5361
				}
			}

			WorldMapSectionType.method5076(var3, var2, true); // L: 5364
		} else {
			boolean var15 = var1.readUnsignedByteSub() == 1; // L: 5367
			var3 = var1.readUnsignedShortAddLE(); // L: 5368
			var4 = var1.readUnsignedShortAdd(); // L: 5369
			var5 = var1.readUnsignedShort(); // L: 5370
			var1.importIndex(); // L: 5371

			int var8;
			int var9;
			for (var6 = 0; var6 < 4; ++var6) { // L: 5372
				for (var7 = 0; var7 < 13; ++var7) { // L: 5373
					for (var8 = 0; var8 < 13; ++var8) { // L: 5374
						var9 = var1.readBits(1); // L: 5375
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26); // L: 5376
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1; // L: 5377
						}
					}
				}
			}

			var1.exportIndex(); // L: 5381
			class202.xteaKeys = new int[var5][4]; // L: 5382

			for (var6 = 0; var6 < var5; ++var6) { // L: 5383
				for (var7 = 0; var7 < 4; ++var7) { // L: 5384
					class202.xteaKeys[var6][var7] = var1.readInt(); // L: 5385
				}
			}

			class269.regions = new int[var5]; // L: 5388
			class124.regionMapArchiveIds = new int[var5]; // L: 5389
			HitSplatDefinition.regionLandArchiveIds = new int[var5]; // L: 5390
			class269.regionLandArchives = new byte[var5][]; // L: 5391
			class33.regionMapArchives = new byte[var5][]; // L: 5392
			var5 = 0; // L: 5393

			for (var6 = 0; var6 < 4; ++var6) { // L: 5394
				for (var7 = 0; var7 < 13; ++var7) { // L: 5395
					for (var8 = 0; var8 < 13; ++var8) { // L: 5396
						var9 = Client.instanceChunkTemplates[var6][var7][var8]; // L: 5397
						if (var9 != -1) { // L: 5398
							int var10 = var9 >> 14 & 1023; // L: 5399
							int var11 = var9 >> 3 & 2047; // L: 5400
							int var12 = (var10 / 8 << 8) + var11 / 8; // L: 5401

							int var13;
							for (var13 = 0; var13 < var5; ++var13) { // L: 5402
								if (class269.regions[var13] == var12) {
									var12 = -1; // L: 5403
									break;
								}
							}

							if (var12 != -1) { // L: 5406
								class269.regions[var5] = var12; // L: 5407
								var13 = var12 >> 8 & 255; // L: 5408
								int var14 = var12 & 255; // L: 5409
								class124.regionMapArchiveIds[var5] = class434.archive9.getGroupId("m" + var13 + "_" + var14); // L: 5410
								HitSplatDefinition.regionLandArchiveIds[var5] = class434.archive9.getGroupId("l" + var13 + "_" + var14); // L: 5411
								++var5; // L: 5412
							}
						}
					}
				}
			}

			WorldMapSectionType.method5076(var3, var4, !var15); // L: 5418
		}

	} // L: 5420
}
