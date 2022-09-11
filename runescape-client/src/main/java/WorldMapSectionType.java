import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ho")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(2, (byte)0),
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(0, (byte)1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(1, (byte)2),
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lho;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(3, (byte)3);

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "Lkg;"
	)
	static GameBuild field2825;
	@ObfuscatedName("dy")
	static boolean field2826;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 835199385
	)
	@Export("type")
	final int type;
	@ObfuscatedName("w")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3;
		this.id = var4; // L: 18
	} // L: 19

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "1"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Lfz;",
		garbageValue = "868263071"
	)
	public static FloorUnderlayDefinition method5074(int var0) {
		FloorUnderlayDefinition var1 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var0); // L: 21
		if (var1 != null) { // L: 22
			return var1;
		} else {
			byte[] var2 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var0); // L: 23
			var1 = new FloorUnderlayDefinition(); // L: 24
			if (var2 != null) { // L: 25
				var1.decode(new Buffer(var2), var0);
			}

			var1.postDecode(); // L: 26
			FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var1, (long)var0); // L: 27
			return var1; // L: 28
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-81878930"
	)
	public static int method5075(int var0) {
		return var0 >> 17 & 7; // L: 17
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1882015735"
	)
	static final void method5077() {
		Object var10000 = null; // L: 169
		String var0 = "Your ignore list is full. Max of 100 for free users, and 400 for members";
		class65.addGameMessage(30, "", var0); // L: 171
	} // L: 173

	@ObfuscatedName("hx")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "313894914"
	)
	static final void method5076(int var0, int var1, boolean var2) {
		if (!var2 || var0 != class6.field17 || class146.field1684 != var1) { // L: 5423
			class6.field17 = var0; // L: 5426
			class146.field1684 = var1; // L: 5427
			Coord.updateGameState(25); // L: 5428
			class146.drawLoadingMessage("Loading - please wait.", true); // L: 5429
			int var3 = class128.baseX * 64; // L: 5430
			int var4 = WorldMapData_1.baseY * 64; // L: 5431
			class128.baseX = (var0 - 6) * 8; // L: 5432
			WorldMapData_1.baseY = (var1 - 6) * 8; // L: 5433
			int var5 = class128.baseX * 64 - var3; // L: 5434
			int var6 = WorldMapData_1.baseY * 64 - var4; // L: 5435
			var3 = class128.baseX * 64; // L: 5436
			var4 = WorldMapData_1.baseY * 64; // L: 5437

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 32768; ++var7) { // L: 5438
				NPC var19 = Client.npcs[var7]; // L: 5439
				if (var19 != null) { // L: 5440
					for (var9 = 0; var9 < 10; ++var9) { // L: 5441
						var10000 = var19.pathX; // L: 5442
						var10000[var9] -= var5;
						var10000 = var19.pathY; // L: 5443
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128; // L: 5445
					var19.y -= var6 * 128; // L: 5446
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) { // L: 5449
				Player var22 = Client.players[var7]; // L: 5450
				if (var22 != null) { // L: 5451
					for (var9 = 0; var9 < 10; ++var9) { // L: 5452
						var10000 = var22.pathX; // L: 5453
						var10000[var9] -= var5;
						var10000 = var22.pathY; // L: 5454
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128; // L: 5456
					var22.y -= var6 * 128; // L: 5457
				}
			}

			byte var20 = 0; // L: 5460
			byte var8 = 104; // L: 5461
			byte var21 = 1; // L: 5462
			if (var5 < 0) { // L: 5463
				var20 = 103; // L: 5464
				var8 = -1; // L: 5465
				var21 = -1; // L: 5466
			}

			byte var10 = 0; // L: 5468
			byte var11 = 104; // L: 5469
			byte var12 = 1; // L: 5470
			if (var6 < 0) { // L: 5471
				var10 = 103; // L: 5472
				var11 = -1; // L: 5473
				var12 = -1; // L: 5474
			}

			int var14;
			for (int var13 = var20; var13 != var8; var13 += var21) { // L: 5476
				for (var14 = var10; var14 != var11; var14 += var12) { // L: 5477
					int var15 = var5 + var13; // L: 5478
					int var16 = var6 + var14; // L: 5479

					for (int var17 = 0; var17 < 4; ++var17) { // L: 5480
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) { // L: 5481
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16];
						} else {
							Client.groundItems[var17][var13][var14] = null; // L: 5482
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)Client.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)Client.pendingSpawns.previous()) { // L: 5486 5487 5491
				var18.x -= var5; // L: 5488
				var18.y -= var6; // L: 5489
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) { // L: 5490
					var18.remove();
				}
			}

			if (Client.destinationX != 0) { // L: 5493
				Client.destinationX -= var5; // L: 5494
				Client.destinationY -= var6; // L: 5495
			}

			Client.soundEffectCount = 0; // L: 5497
			Client.isCameraLocked = false; // L: 5498
			TaskHandler.cameraX -= var5 << 7; // L: 5499
			ApproximateRouteStrategy.cameraZ -= var6 << 7; // L: 5500
			class147.oculusOrbFocalPointX -= var5 << 7; // L: 5501
			Language.oculusOrbFocalPointY -= var6 << 7; // L: 5502
			Client.field736 = -1; // L: 5503
			Client.graphicsObjects.clear(); // L: 5504
			Client.projectiles.clear(); // L: 5505

			for (var14 = 0; var14 < 4; ++var14) { // L: 5506
				Client.collisionMaps[var14].clear();
			}

		}
	} // L: 5424 5507
}
