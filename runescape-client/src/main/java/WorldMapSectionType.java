import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
@Implements("WorldMapSectionType")
public enum WorldMapSectionType implements MouseWheel {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("WORLDMAPSECTIONTYPE0")
	WORLDMAPSECTIONTYPE0(0, (byte)0),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("WORLDMAPSECTIONTYPE1")
	WORLDMAPSECTIONTYPE1(2, (byte)1),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("WORLDMAPSECTIONTYPE2")
	WORLDMAPSECTIONTYPE2(1, (byte)2),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("WORLDMAPSECTIONTYPE3")
	WORLDMAPSECTIONTYPE3(3, (byte)3);

	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -701150667
	)
	@Export("type")
	final int type;
	@ObfuscatedName("ah")
	@Export("id")
	final byte id;

	WorldMapSectionType(int var3, byte var4) {
		this.type = var3;
		this.id = var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1243971674"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Luy;II)V",
		garbageValue = "2004765344"
	)
	@Export("readPlayerUpdate")
	static void readPlayerUpdate(PacketBuffer var0, int var1) {
		boolean var2 = var0.readBits(1) == 1;
		if (var2) {
			Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
		}

		int var3 = var0.readBits(2);
		Player var4 = Client.players[var1];
		if (var3 == 0) {
			if (var2) {
				var4.field1124 = false;
			} else if (Client.localPlayerIndex == var1) {
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = (var4.plane << 28) + (class20.baseX * 64 + var4.pathX[0] >> 13 << 14) + (class19.baseY * 64 + var4.pathY[0] >> 13);
				if (var4.field1223 != -1) {
					Players.Players_orientations[var1] = var4.field1223;
				} else {
					Players.Players_orientations[var1] = var4.orientation;
				}

				Players.Players_targetIndices[var1] = var4.targetIndex;
				Client.players[var1] = null;
				if (var0.readBits(1) != 0) {
					class304.updateExternalPlayer(var0, var1);
				}

			}
		} else {
			int var5;
			int var6;
			int var7;
			if (var3 == 1) {
				var5 = var0.readBits(3);
				var6 = var4.pathX[0];
				var7 = var4.pathY[0];
				if (var5 == 0) {
					--var6;
					--var7;
				} else if (var5 == 1) {
					--var7;
				} else if (var5 == 2) {
					++var6;
					--var7;
				} else if (var5 == 3) {
					--var6;
				} else if (var5 == 4) {
					++var6;
				} else if (var5 == 5) {
					--var6;
					++var7;
				} else if (var5 == 6) {
					++var7;
				} else if (var5 == 7) {
					++var6;
					++var7;
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
					var4.resetPath(var6, var7);
					var4.field1124 = false;
				} else if (var2) {
					var4.field1124 = true;
					var4.tileX = var6;
					var4.tileY = var7;
				} else {
					var4.field1124 = false;
					var4.method2374(var6, var7, Players.field1370[var1]);
				}

			} else if (var3 == 2) {
				var5 = var0.readBits(4);
				var6 = var4.pathX[0];
				var7 = var4.pathY[0];
				if (var5 == 0) {
					var6 -= 2;
					var7 -= 2;
				} else if (var5 == 1) {
					--var6;
					var7 -= 2;
				} else if (var5 == 2) {
					var7 -= 2;
				} else if (var5 == 3) {
					++var6;
					var7 -= 2;
				} else if (var5 == 4) {
					var6 += 2;
					var7 -= 2;
				} else if (var5 == 5) {
					var6 -= 2;
					--var7;
				} else if (var5 == 6) {
					var6 += 2;
					--var7;
				} else if (var5 == 7) {
					var6 -= 2;
				} else if (var5 == 8) {
					var6 += 2;
				} else if (var5 == 9) {
					var6 -= 2;
					++var7;
				} else if (var5 == 10) {
					var6 += 2;
					++var7;
				} else if (var5 == 11) {
					var6 -= 2;
					var7 += 2;
				} else if (var5 == 12) {
					--var6;
					var7 += 2;
				} else if (var5 == 13) {
					var7 += 2;
				} else if (var5 == 14) {
					++var6;
					var7 += 2;
				} else if (var5 == 15) {
					var6 += 2;
					var7 += 2;
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
					var4.resetPath(var6, var7);
					var4.field1124 = false;
				} else if (var2) {
					var4.field1124 = true;
					var4.tileX = var6;
					var4.tileY = var7;
				} else {
					var4.field1124 = false;
					var4.method2374(var6, var7, Players.field1370[var1]);
				}

			} else {
				var5 = var0.readBits(1);
				int var8;
				int var9;
				int var10;
				int var11;
				if (var5 == 0) {
					var6 = var0.readBits(12);
					var7 = var6 >> 10;
					var8 = var6 >> 5 & 31;
					if (var8 > 15) {
						var8 -= 32;
					}

					var9 = var6 & 31;
					if (var9 > 15) {
						var9 -= 32;
					}

					var10 = var8 + var4.pathX[0];
					var11 = var9 + var4.pathY[0];
					if (Client.localPlayerIndex != var1 || var4.x >= 1536 && var4.y >= 1536 && var4.x < 11776 && var4.y < 11776) {
						if (var2) {
							var4.field1124 = true;
							var4.tileX = var10;
							var4.tileY = var11;
						} else {
							var4.field1124 = false;
							var4.method2374(var10, var11, Players.field1370[var1]);
						}
					} else {
						var4.resetPath(var10, var11);
						var4.field1124 = false;
					}

					var4.plane = (byte)(var7 + var4.plane & 3);
					if (Client.localPlayerIndex == var1) {
						class87.Client_plane = var4.plane;
					}

				} else {
					var6 = var0.readBits(30);
					var7 = var6 >> 28;
					var8 = var6 >> 14 & 16383;
					var9 = var6 & 16383;
					var10 = (class20.baseX * 64 + var8 + var4.pathX[0] & 16383) - class20.baseX * 64;
					var11 = (class19.baseY * 64 + var9 + var4.pathY[0] & 16383) - class19.baseY * 64;
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
						var4.resetPath(var10, var11);
						var4.field1124 = false;
					} else if (var2) {
						var4.field1124 = true;
						var4.tileX = var10;
						var4.tileY = var11;
					} else {
						var4.field1124 = false;
						var4.method2374(var10, var11, Players.field1370[var1]);
					}

					var4.plane = (byte)(var7 + var4.plane & 3);
					if (Client.localPlayerIndex == var1) {
						class87.Client_plane = var4.plane;
					}

				}
			}
		}
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1356138757"
	)
	static final void method5616(int var0, int var1, int var2) {
		if (Client.cameraX < var0) {
			Client.cameraX = (var0 - Client.cameraX) * class131.field1535 / 1000 + Client.cameraX + SecureRandomCallable.field1049;
			if (Client.cameraX > var0) {
				Client.cameraX = var0;
			}
		}

		if (Client.cameraX > var0) {
			Client.cameraX -= (Client.cameraX - var0) * class131.field1535 / 1000 + SecureRandomCallable.field1049;
			if (Client.cameraX < var0) {
				Client.cameraX = var0;
			}
		}

		if (class17.cameraY < var1) {
			class17.cameraY = (var1 - class17.cameraY) * class131.field1535 / 1000 + class17.cameraY + SecureRandomCallable.field1049;
			if (class17.cameraY > var1) {
				class17.cameraY = var1;
			}
		}

		if (class17.cameraY > var1) {
			class17.cameraY -= (class17.cameraY - var1) * class131.field1535 / 1000 + SecureRandomCallable.field1049;
			if (class17.cameraY < var1) {
				class17.cameraY = var1;
			}
		}

		if (WorldMapArea.cameraZ < var2) {
			WorldMapArea.cameraZ = (var2 - WorldMapArea.cameraZ) * class131.field1535 / 1000 + WorldMapArea.cameraZ + SecureRandomCallable.field1049;
			if (WorldMapArea.cameraZ > var2) {
				WorldMapArea.cameraZ = var2;
			}
		}

		if (WorldMapArea.cameraZ > var2) {
			WorldMapArea.cameraZ -= (WorldMapArea.cameraZ - var2) * class131.field1535 / 1000 + SecureRandomCallable.field1049;
			if (WorldMapArea.cameraZ < var2) {
				WorldMapArea.cameraZ = var2;
			}
		}

	}
}
