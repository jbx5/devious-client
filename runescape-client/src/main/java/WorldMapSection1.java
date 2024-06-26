import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kw")
@Implements("WorldMapSection1")
public class WorldMapSection1 implements WorldMapSection {
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 502415749
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1809402251
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1715220047
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1345453013
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 407425227
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1317582751
	)
	@Export("regionEndY")
	int regionEndY;

	WorldMapSection1() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljm;I)V",
		garbageValue = "1568670940"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.regionEndX) {
			var1.regionLowX = this.regionEndX;
		}

		if (var1.regionHighX < this.regionEndX) {
			var1.regionHighX = this.regionEndX;
		}

		if (var1.regionLowY > this.regionEndY) {
			var1.regionLowY = this.regionEndY;
		}

		if (var1.regionHighY < this.regionEndY) {
			var1.regionHighY = this.regionEndY;
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "115"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.planes + this.minPlane) {
			return var2 >> 6 == this.regionStartX && var3 >> 6 == this.regionStartY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-898385408"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 == this.regionEndX && var2 >> 6 == this.regionEndY;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "-35"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.regionEndX * 64 - this.regionStartX * 64 + var2, var3 + (this.regionEndY * 64 - this.regionStartY * 64)};
			return var4;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)Lnl;",
		garbageValue = "-55064754"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.regionStartX * 64 - this.regionEndX * 64 + var1;
			int var4 = this.regionStartY * 64 - this.regionEndY * 64 + var2;
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "301668137"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "26437"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lde;Lvp;IIIIIII)V",
		garbageValue = "-1270068304"
	)
	@Export("loadTerrain")
	static final void loadTerrain(WorldView var0, Buffer var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int[][][] var8 = var0.tileHeights;
		byte[][][] var9 = var0.tileSettings;
		int var10;
		if (var2 >= 0 && var2 < 4 && var3 >= 0 && var3 < var8[0].length - 1 && var4 >= 0 && var4 < var8[0][0].length - 1) {
			var9[var2][var3][var4] = 0;

			while (true) {
				var10 = var1.readUnsignedShort();
				if (var10 == 0) {
					if (var2 == 0) {
						var8[0][var3][var4] = -class177.method3567(var5 + 932731, 556238 + var6) * 8;
					} else {
						var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - 240;
					}
					break;
				}

				if (var10 == 1) {
					int var11 = var1.readUnsignedByte();
					if (var11 == 1) {
						var11 = 0;
					}

					if (var2 == 0) {
						var8[0][var3][var4] = -var11 * 8;
					} else {
						var8[var2][var3][var4] = var8[var2 - 1][var3][var4] - var11 * 8;
					}
					break;
				}

				if (var10 <= 49) {
					Tiles.Tiles_overlays[var2][var3][var4] = (short)var1.readShort();
					Tiles.Tiles_shapes[var2][var3][var4] = (byte)((var10 - 2) / 4);
					class356.field3810[var2][var3][var4] = (byte)(var10 - 2 + var7 & 3);
				} else if (var10 <= 81) {
					var9[var2][var3][var4] = (byte)(var10 - 49);
				} else {
					Tiles.Tiles_underlays[var2][var3][var4] = (short)(var10 - 81);
				}
			}
		} else {
			while (true) {
				var10 = var1.readUnsignedShort();
				if (var10 == 0) {
					break;
				}

				if (var10 == 1) {
					var1.readUnsignedByte();
					break;
				}

				if (var10 <= 49) {
					var1.readShort();
				}
			}
		}

	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(Lde;B)V",
		garbageValue = "-9"
	)
	static final void method5042(WorldView var0) {
		for (Projectile var1 = (Projectile)var0.projectiles.last(); var1 != null; var1 = (Projectile)var0.projectiles.previous()) {
			if (var0.plane == var1.plane && Client.cycle <= var1.cycleEnd) {
				if (Client.cycle >= var1.cycleStart) {
					NPC var2;
					int var3;
					Player var4;
					if (!var1.isMoving && var1.field975 != 0) {
						if (var1.field975 > 0) {
							var2 = HttpResponse.worldView.npcs[var1.field975 - 1];
							if (var2 != null && 0 <= var2.x && var2.x < 13312 && 0 <= var2.y && var2.y < 13312) {
								var1.sourceX = var2.x;
								var1.sourceY = var2.y;
								var1.setDestination(var1.field968, var1.field985, var1.field970, Client.cycle);
							}
						} else {
							var3 = -var1.field975 - 1;
							if (var3 == Client.localPlayerIndex) {
								var4 = SoundCache.localPlayer;
							} else {
								var4 = HttpResponse.worldView.players[var3];
							}

							if (var4 != null && 0 <= var4.x && var4.x < 13312 && 0 <= var4.y && var4.y < 13312) {
								var1.sourceX = var4.x;
								var1.sourceY = var4.y;
								var1.setDestination(var1.field968, var1.field985, var1.field970, Client.cycle);
							}
						}
					}

					if (var1.targetIndex > 0) {
						var2 = var0.npcs[var1.targetIndex - 1];
						if (var2 != null && 0 <= var2.x && var2.x < 13312 && 0 <= var2.y && var2.y < 13312) {
							var1.setDestination(var2.x, var2.y, class169.getTileHeight(var0, var2.x, var2.y, var1.plane) - var1.endHeight, Client.cycle);
						}
					}

					if (var1.targetIndex < 0) {
						var3 = -var1.targetIndex - 1;
						if (var3 == Client.localPlayerIndex) {
							var4 = SoundCache.localPlayer;
						} else {
							var4 = var0.players[var3];
						}

						if (var4 != null && 0 <= var4.x && var4.x < 13312 && 0 <= var4.y && var4.y < 13312) {
							var1.setDestination(var4.x, var4.y, class169.getTileHeight(var0, var4.x, var4.y, var1.plane) - var1.endHeight, Client.cycle);
						}
					}

					var1.advance(Client.graphicsCycle);
					var0.scene.drawEntity(var0.plane, (int)var1.x, (int)var1.y, (int)var1.z, 60, var1, var1.yaw, -1L, false);
				}
			} else {
				var1.remove();
			}
		}

	}
}
