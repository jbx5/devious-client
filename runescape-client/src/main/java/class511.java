import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tv")
final class class511 implements class510 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Luj;B)V",
		garbageValue = "-42"
	)
	public void vmethod9135(Object var1, Buffer var2) {
		this.method9091((Integer)var1, var2);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Luj;B)Ljava/lang/Object;",
		garbageValue = "-69"
	)
	public Object vmethod9141(Buffer var1) {
		return var1.readInt();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Luj;I)V",
		garbageValue = "-1691146966"
	)
	void method9091(Integer var1, Buffer var2) {
		var2.writeInt(var1);
	}

	@ObfuscatedName("jj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "-83"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = class36.scene.getBoundaryObjectTag(var0, var1, var2);
		int var7;
		int var8;
		int var9;
		int var10;
		int var12;
		int var13;
		if (0L != var5) {
			var7 = class36.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = var3;
			if (class207.method4113(var5)) {
				var10 = var4;
			}

			int[] var11 = class102.sceneMinimapSprite.pixels;
			var12 = var1 * 4 + (103 - var2) * 2048 + 24624;
			var13 = class232.Entity_unpackID(var5);
			ObjectComposition var14 = WorldMapSection2.getObjectDefinition(var13);
			if (var14.mapSceneId != -1) {
				IndexedSprite var15 = VarpDefinition.mapSceneSprites[var14.mapSceneId];
				if (var15 != null) {
					int var16 = (var14.sizeX * 4 - var15.subWidth) / 2;
					int var17 = (var14.sizeY * 4 - var15.subHeight) / 2;
					var15.drawAt(var16 + var1 * 4 + 48, (104 - var2 - var14.sizeY) * 4 + var17 + 48);
				}
			} else {
				if (var9 == 0 || var9 == 2) {
					if (var8 == 0) {
						var11[var12] = var10;
						var11[var12 + 512] = var10;
						var11[var12 + 1024] = var10;
						var11[var12 + 1536] = var10;
					} else if (var8 == 1) {
						var11[var12] = var10;
						var11[var12 + 1] = var10;
						var11[var12 + 2] = var10;
						var11[var12 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 3] = var10;
						var11[var12 + 512 + 3] = var10;
						var11[var12 + 1024 + 3] = var10;
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var11[var12 + 1536] = var10;
						var11[var12 + 1536 + 1] = var10;
						var11[var12 + 1536 + 2] = var10;
						var11[var12 + 1536 + 3] = var10;
					}
				}

				if (var9 == 3) {
					if (var8 == 0) {
						var11[var12] = var10;
					} else if (var8 == 1) {
						var11[var12 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var11[var12 + 1536] = var10;
					}
				}

				if (var9 == 2) {
					if (var8 == 3) {
						var11[var12] = var10;
						var11[var12 + 512] = var10;
						var11[var12 + 1024] = var10;
						var11[var12 + 1536] = var10;
					} else if (var8 == 0) {
						var11[var12] = var10;
						var11[var12 + 1] = var10;
						var11[var12 + 2] = var10;
						var11[var12 + 3] = var10;
					} else if (var8 == 1) {
						var11[var12 + 3] = var10;
						var11[var12 + 512 + 3] = var10;
						var11[var12 + 1024 + 3] = var10;
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 1536] = var10;
						var11[var12 + 1536 + 1] = var10;
						var11[var12 + 1536 + 2] = var10;
						var11[var12 + 1536 + 3] = var10;
					}
				}
			}
		}

		var5 = class36.scene.getGameObjectTag(var0, var1, var2);
		if (var5 != 0L) {
			var7 = class36.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = class232.Entity_unpackID(var5);
			ObjectComposition var24 = WorldMapSection2.getObjectDefinition(var10);
			int var19;
			if (var24.mapSceneId != -1) {
				IndexedSprite var20 = VarpDefinition.mapSceneSprites[var24.mapSceneId];
				if (var20 != null) {
					var13 = (var24.sizeX * 4 - var20.subWidth) / 2;
					var19 = (var24.sizeY * 4 - var20.subHeight) / 2;
					var20.drawAt(var13 + var1 * 4 + 48, var19 + (104 - var2 - var24.sizeY) * 4 + 48);
				}
			} else if (var9 == 9) {
				var12 = 15658734;
				if (class207.method4113(var5)) {
					var12 = 15597568;
				}

				int[] var18 = class102.sceneMinimapSprite.pixels;
				var19 = var1 * 4 + (103 - var2) * 2048 + 24624;
				if (var8 != 0 && var8 != 2) {
					var18[var19] = var12;
					var18[var19 + 1 + 512] = var12;
					var18[var19 + 1024 + 2] = var12;
					var18[var19 + 1536 + 3] = var12;
				} else {
					var18[var19 + 1536] = var12;
					var18[var19 + 1 + 1024] = var12;
					var18[var19 + 512 + 2] = var12;
					var18[var19 + 3] = var12;
				}
			}
		}

		var5 = class36.scene.getFloorDecorationTag(var0, var1, var2);
		if (var5 != 0L) {
			var7 = class232.Entity_unpackID(var5);
			ObjectComposition var21 = WorldMapSection2.getObjectDefinition(var7);
			if (var21.mapSceneId != -1) {
				IndexedSprite var22 = VarpDefinition.mapSceneSprites[var21.mapSceneId];
				if (var22 != null) {
					var10 = (var21.sizeX * 4 - var22.subWidth) / 2;
					int var23 = (var21.sizeY * 4 - var22.subHeight) / 2;
					var22.drawAt(var10 + var1 * 4 + 48, (104 - var2 - var21.sizeY) * 4 + var23 + 48);
				}
			}
		}

	}
}
