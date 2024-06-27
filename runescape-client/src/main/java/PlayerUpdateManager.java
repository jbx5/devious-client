import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
@Implements("PlayerUpdateManager")
public class PlayerUpdateManager {
	@ObfuscatedName("il")
	@ObfuscatedGetter(
		intValue = -1135168521
	)
	static int field1418;
	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	@Export("crossSprites")
	static SpritePixels[] crossSprites;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	@Export("worldView")
	WorldView worldView;
	@ObfuscatedName("ak")
	byte[] field1405;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Ljb;"
	)
	class238[] field1406;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "[Lvp;"
	)
	Buffer[] field1407;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1390831493
	)
	@Export("playerCount")
	int playerCount;
	@ObfuscatedName("av")
	@Export("playerIndices")
	int[] playerIndices;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1634733587
	)
	@Export("Players_emptyIdxCount")
	int Players_emptyIdxCount;
	@ObfuscatedName("ai")
	@Export("Players_emptyIndices")
	int[] Players_emptyIndices;
	@ObfuscatedName("ae")
	@Export("Players_regions")
	int[] Players_regions;
	@ObfuscatedName("au")
	@Export("Players_orientations")
	int[] Players_orientations;
	@ObfuscatedName("ah")
	@Export("Players_targetIndices")
	int[] Players_targetIndices;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1077360317
	)
	@Export("Players_pendingUpdateCount")
	int Players_pendingUpdateCount;
	@ObfuscatedName("ax")
	@Export("Players_pendingUpdateIndices")
	int[] Players_pendingUpdateIndices;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lvp;"
	)
	Buffer field1417;

	@ObfuscatedSignature(
		descriptor = "(Lde;)V"
	)
	PlayerUpdateManager(WorldView var1) {
		this.field1405 = new byte[2048];
		this.field1406 = new class238[2048];
		this.field1407 = new Buffer[2048];
		this.playerCount = 0;
		this.playerIndices = new int[2048];
		this.Players_emptyIdxCount = 0;
		this.Players_emptyIndices = new int[2048];
		this.Players_regions = new int[2048];
		this.Players_orientations = new int[2048];
		this.Players_targetIndices = new int[2048];
		this.Players_pendingUpdateCount = 0;
		this.Players_pendingUpdateIndices = new int[2048];
		this.field1417 = new Buffer(new byte[5000]);
		this.worldView = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lug;ZI)V",
		garbageValue = "-1557479044"
	)
	@Export("updatePlayer")
	final void updatePlayer(PacketBuffer var1, boolean var2) {
		var1.importIndex();
		Player var3 = new Player();
		int var4 = Client.localPlayerIndex;
		if (var2) {
			SoundCache.localPlayer = var3;
			class511.topLevelWorldView.players[var4] = var3;
		} else {
			this.worldView.players[var4] = var3;
		}

		var3.index = var4;
		int var5 = var1.readBits(30);
		byte var6 = (byte)Coord.method6469(var5);
		int var7 = Coord.method6468(var5);
		int var8 = Coord.method6474(var5);
		var3.pathX[0] = var7 - this.worldView.baseX;
		var3.x = (var3.pathX[0] << 7) + (var3.transformedSize() << 6);
		var3.pathY[0] = var8 - this.worldView.baseY;
		var3.y = (var3.pathY[0] << 7) + (var3.transformedSize() << 6);
		if (var2) {
			this.worldView.plane = var3.plane = var6;
		}

		if (this.field1407[var4] != null) {
			var3.read(this.field1407[var4]);
		}

		this.playerCount = 0;
		this.playerIndices[++this.playerCount - 1] = var4;
		this.field1405[var4] = 0;
		this.Players_emptyIdxCount = 0;

		for (int var9 = 1; var9 < 2048; ++var9) {
			if (var9 != var4) {
				int var10 = var1.readBits(18);
				int var11 = var10 >> 16;
				int var12 = var10 >> 8 & 597;
				int var13 = var10 & 597;
				this.Players_regions[var9] = Coord.method6460(var11, var12, var13);
				this.Players_orientations[var9] = 0;
				this.Players_targetIndices[var9] = -1;
				this.Players_emptyIndices[++this.Players_emptyIdxCount - 1] = var9;
				this.field1405[var9] = 0;
			}
		}

		var1.exportIndex();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lug;II)V",
		garbageValue = "1679600610"
	)
	final void method2826(PacketBuffer var1, int var2) {
		int var3 = var1.offset;
		this.Players_pendingUpdateCount = 0;
		this.method2821(var1);
		this.updatePlayers(var1);
		if (var2 != var1.offset - var3) {
			throw new RuntimeException(var1.offset - var3 + " " + var2);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lug;B)V",
		garbageValue = "38"
	)
	final void method2821(PacketBuffer var1) {
		int var2 = 0;
		var1.importIndex();

		byte[] var10000;
		int var3;
		int var5;
		int var6;
		for (var3 = 0; var3 < this.playerCount; ++var3) {
			var6 = this.playerIndices[var3];
			if ((this.field1405[var6] & 1) == 0) {
				if (var2 > 0) {
					--var2;
					var10000 = this.field1405;
					var10000[var6] = (byte)(var10000[var6] | 2);
				} else {
					var5 = var1.readBits(1);
					if (var5 == 0) {
						var2 = this.method2822(var1);
						var10000 = this.field1405;
						var10000[var6] = (byte)(var10000[var6] | 2);
					} else {
						this.readPlayerUpdate(var1, var6);
					}
				}
			}
		}

		var1.exportIndex();
		if (var2 != 0) {
			throw new RuntimeException();
		} else {
			var1.importIndex();

			for (var3 = 0; var3 < this.playerCount; ++var3) {
				var6 = this.playerIndices[var3];
				if ((this.field1405[var6] & 1) != 0) {
					if (var2 > 0) {
						--var2;
						var10000 = this.field1405;
						var10000[var6] = (byte)(var10000[var6] | 2);
					} else {
						var5 = var1.readBits(1);
						if (var5 == 0) {
							var2 = this.method2822(var1);
							var10000 = this.field1405;
							var10000[var6] = (byte)(var10000[var6] | 2);
						} else {
							this.readPlayerUpdate(var1, var6);
						}
					}
				}
			}

			var1.exportIndex();
			if (var2 != 0) {
				throw new RuntimeException();
			} else {
				var1.importIndex();

				for (var3 = 0; var3 < this.Players_emptyIdxCount; ++var3) {
					var6 = this.Players_emptyIndices[var3];
					if ((this.field1405[var6] & 1) != 0) {
						if (var2 > 0) {
							--var2;
							var10000 = this.field1405;
							var10000[var6] = (byte)(var10000[var6] | 2);
						} else {
							var5 = var1.readBits(1);
							if (var5 == 0) {
								var2 = this.method2822(var1);
								var10000 = this.field1405;
								var10000[var6] = (byte)(var10000[var6] | 2);
							} else if (this.method2847(var1, var6)) {
								var10000 = this.field1405;
								var10000[var6] = (byte)(var10000[var6] | 2);
							}
						}
					}
				}

				var1.exportIndex();
				if (var2 != 0) {
					throw new RuntimeException();
				} else {
					var1.importIndex();

					for (var3 = 0; var3 < this.Players_emptyIdxCount; ++var3) {
						var6 = this.Players_emptyIndices[var3];
						if ((this.field1405[var6] & 1) == 0) {
							if (var2 > 0) {
								--var2;
								var10000 = this.field1405;
								var10000[var6] = (byte)(var10000[var6] | 2);
							} else {
								var5 = var1.readBits(1);
								if (var5 == 0) {
									var2 = this.method2822(var1);
									var10000 = this.field1405;
									var10000[var6] = (byte)(var10000[var6] | 2);
								} else if (this.method2847(var1, var6)) {
									var10000 = this.field1405;
									var10000[var6] = (byte)(var10000[var6] | 2);
								}
							}
						}
					}

					var1.exportIndex();
					if (var2 != 0) {
						throw new RuntimeException();
					} else {
						this.playerCount = 0;
						this.Players_emptyIdxCount = 0;

						for (var3 = 1; var3 < 2048; ++var3) {
							var10000 = this.field1405;
							var10000[var3] = (byte)(var10000[var3] >> 1);
							Player var4 = this.worldView.players[var3];
							if (var4 != null) {
								this.playerIndices[++this.playerCount - 1] = var3;
							} else {
								this.Players_emptyIndices[++this.Players_emptyIdxCount - 1] = var3;
							}
						}

					}
				}
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lug;I)I",
		garbageValue = "1114269"
	)
	int method2822(PacketBuffer var1) {
		int var2 = var1.readBits(2);
		int var3;
		if (var2 == 0) {
			var3 = 0;
		} else if (var2 == 1) {
			var3 = var1.readBits(5);
		} else if (var2 == 2) {
			var3 = var1.readBits(8);
		} else {
			var3 = var1.readBits(11);
		}

		return var3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lug;II)V",
		garbageValue = "715158123"
	)
	@Export("readPlayerUpdate")
	void readPlayerUpdate(PacketBuffer var1, int var2) {
		boolean var3 = var1.readBits(1) == 1;
		if (var3) {
			this.Players_pendingUpdateIndices[++this.Players_pendingUpdateCount - 1] = var2;
		}

		int var4 = var1.readBits(2);
		Player var5 = this.worldView.players[var2];
		if (var4 == 0) {
			if (var3) {
				var5.field1144 = false;
			} else if (var2 == Client.localPlayerIndex) {
				throw new RuntimeException();
			} else {
				this.Players_regions[var2] = Coord.method6460(var5.plane, this.worldView.baseX + var5.pathX[0] >> 13, this.worldView.baseY + var5.pathY[0] >> 13);
				if (var5.field1227 != -1) {
					this.Players_orientations[var2] = var5.field1227;
				} else {
					this.Players_orientations[var2] = var5.orientation;
				}

				this.Players_targetIndices[var2] = var5.targetIndex;
				this.worldView.players[var2] = null;
				if (var1.readBits(1) != 0) {
					this.method2847(var1, var2);
				}

			}
		} else {
			int var6;
			int var7;
			int var8;
			if (var4 == 1) {
				var6 = var1.readBits(3);
				var7 = var5.pathX[0];
				var8 = var5.pathY[0];
				if (var6 == 0) {
					--var7;
					--var8;
				} else if (var6 == 1) {
					--var8;
				} else if (var6 == 2) {
					++var7;
					--var8;
				} else if (var6 == 3) {
					--var7;
				} else if (var6 == 4) {
					++var7;
				} else if (var6 == 5) {
					--var7;
					++var8;
				} else if (var6 == 6) {
					++var8;
				} else if (var6 == 7) {
					++var7;
					++var8;
				}

				if (var2 == Client.localPlayerIndex && this.worldView.method2676() && (var5.x < 1536 || var5.y < 1536 || var5.x >= 11776 || var5.y >= 11776)) {
					var5.resetPath(var7, var8);
					var5.field1144 = false;
				} else if (var3) {
					var5.field1144 = true;
					var5.tileX = var7;
					var5.tileY = var8;
				} else {
					var5.field1144 = false;
					var5.method2437(this.worldView, var7, var8, this.field1406[var2]);
				}

			} else if (var4 == 2) {
				var6 = var1.readBits(4);
				var7 = var5.pathX[0];
				var8 = var5.pathY[0];
				if (var6 == 0) {
					var7 -= 2;
					var8 -= 2;
				} else if (var6 == 1) {
					--var7;
					var8 -= 2;
				} else if (var6 == 2) {
					var8 -= 2;
				} else if (var6 == 3) {
					++var7;
					var8 -= 2;
				} else if (var6 == 4) {
					var7 += 2;
					var8 -= 2;
				} else if (var6 == 5) {
					var7 -= 2;
					--var8;
				} else if (var6 == 6) {
					var7 += 2;
					--var8;
				} else if (var6 == 7) {
					var7 -= 2;
				} else if (var6 == 8) {
					var7 += 2;
				} else if (var6 == 9) {
					var7 -= 2;
					++var8;
				} else if (var6 == 10) {
					var7 += 2;
					++var8;
				} else if (var6 == 11) {
					var7 -= 2;
					var8 += 2;
				} else if (var6 == 12) {
					--var7;
					var8 += 2;
				} else if (var6 == 13) {
					var8 += 2;
				} else if (var6 == 14) {
					++var7;
					var8 += 2;
				} else if (var6 == 15) {
					var7 += 2;
					var8 += 2;
				}

				if (var2 == Client.localPlayerIndex && this.worldView.method2676() && (var5.x < 1536 || var5.y < 1536 || var5.x >= 11776 || var5.y >= 11776)) {
					var5.resetPath(var7, var8);
					var5.field1144 = false;
				} else if (var3) {
					var5.field1144 = true;
					var5.tileX = var7;
					var5.tileY = var8;
				} else {
					var5.field1144 = false;
					var5.method2437(this.worldView, var7, var8, this.field1406[var2]);
				}

			} else {
				var6 = var1.readBits(1);
				int var9;
				int var10;
				int var11;
				int var12;
				if (var6 == 0) {
					var7 = var1.readBits(12);
					var8 = var7 >> 10;
					var9 = var7 >> 5 & 31;
					if (var9 > 15) {
						var9 -= 32;
					}

					var10 = var7 & 31;
					if (var10 > 15) {
						var10 -= 32;
					}

					var11 = var9 + var5.pathX[0];
					var12 = var10 + var5.pathY[0];
					if (var2 == Client.localPlayerIndex && this.worldView.method2676() && (var5.x < 1536 || var5.y < 1536 || var5.x >= 11776 || var5.y >= 11776)) {
						var5.resetPath(var11, var12);
						var5.field1144 = false;
					} else if (var3) {
						var5.field1144 = true;
						var5.tileX = var11;
						var5.tileY = var12;
					} else {
						var5.field1144 = false;
						var5.method2437(this.worldView, var11, var12, this.field1406[var2]);
					}

					var5.plane = (byte)(var8 + var5.plane & 3);
					if (var2 == Client.localPlayerIndex && this.worldView.method2676()) {
						this.worldView.plane = var5.plane;
					}

				} else {
					var7 = var1.readBits(30);
					var8 = Coord.method6469(var7);
					var9 = Coord.method6468(var7);
					var10 = Coord.method6474(var7);
					var11 = (this.worldView.baseX + var9 + var5.pathX[0] & 16383) - this.worldView.baseX;
					var12 = (this.worldView.baseY + var10 + var5.pathY[0] & 16383) - this.worldView.baseY;
					if (var2 == Client.localPlayerIndex && this.worldView.method2676() && (var5.x < 1536 || var5.y < 1536 || var5.x >= 11776 || var5.y >= 11776)) {
						var5.resetPath(var11, var12);
						var5.field1144 = false;
					} else if (var3) {
						var5.field1144 = true;
						var5.tileX = var11;
						var5.tileY = var12;
					} else {
						var5.field1144 = false;
						var5.method2437(this.worldView, var11, var12, this.field1406[var2]);
					}

					var5.plane = (byte)(var8 + var5.plane & 3);
					if (var2 == Client.localPlayerIndex && this.worldView.method2676()) {
						this.worldView.plane = var5.plane;
					}

				}
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lug;II)Z",
		garbageValue = "-455914517"
	)
	boolean method2847(PacketBuffer var1, int var2) {
		int var3 = var1.readBits(2);
		int var4;
		int var5;
		int var8;
		int var9;
		int var10;
		int var11;
		if (var3 == 0) {
			if (var1.readBits(1) != 0) {
				this.method2847(var1, var2);
			}

			var4 = var1.readBits(13);
			var5 = var1.readBits(13);
			boolean var13 = var1.readBits(1) == 1;
			if (var13) {
				this.Players_pendingUpdateIndices[++this.Players_pendingUpdateCount - 1] = var2;
			}

			if (this.worldView.players[var2] != null) {
				throw new RuntimeException();
			} else {
				Player var12 = this.worldView.players[var2] = new Player();
				var12.index = var2;
				if (this.field1407[var2] != null) {
					var12.read(this.field1407[var2]);
				}

				var12.orientation = this.Players_orientations[var2];
				var12.targetIndex = this.Players_targetIndices[var2];
				var8 = this.Players_regions[var2];
				var9 = var8 >> 28;
				var10 = var8 >> 14 & 255;
				var11 = var8 & 255;
				var12.pathTraversed[0] = this.field1406[var2];
				var12.plane = (byte)var9;
				var12.resetPath((var10 << 13) + var4 - this.worldView.baseX, (var11 << 13) + var5 - this.worldView.baseY);
				var12.field1144 = false;
				return true;
			}
		} else if (var3 == 1) {
			var4 = var1.readBits(2);
			var5 = this.Players_regions[var2];
			this.Players_regions[var2] = (((var5 >> 28) + var4 & 3) << 28) + (var5 & 268435455);
			return false;
		} else {
			int var6;
			int var7;
			if (var3 == 2) {
				var4 = var1.readBits(5);
				var5 = var4 >> 3;
				var6 = var4 & 7;
				var7 = this.Players_regions[var2];
				var8 = (var7 >> 28) + var5 & 3;
				var9 = var7 >> 14 & 255;
				var10 = var7 & 255;
				if (var6 == 0) {
					--var9;
					--var10;
				}

				if (var6 == 1) {
					--var10;
				}

				if (var6 == 2) {
					++var9;
					--var10;
				}

				if (var6 == 3) {
					--var9;
				}

				if (var6 == 4) {
					++var9;
				}

				if (var6 == 5) {
					--var9;
					++var10;
				}

				if (var6 == 6) {
					++var10;
				}

				if (var6 == 7) {
					++var9;
					++var10;
				}

				this.Players_regions[var2] = Coord.method6460(var8, var9, var10);
				return false;
			} else {
				var4 = var1.readBits(18);
				var5 = var4 >> 16;
				var6 = var4 >> 8 & 255;
				var7 = var4 & 255;
				var8 = this.Players_regions[var2];
				var9 = (var8 >> 28) + var5 & 3;
				var10 = var6 + (var8 >> 14) & 255;
				var11 = var7 + var8 & 255;
				this.Players_regions[var2] = Coord.method6460(var9, var10, var11);
				return false;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lug;B)V",
		garbageValue = "-32"
	)
	@Export("updatePlayers")
	final void updatePlayers(PacketBuffer var1) {
		for (int var2 = 0; var2 < this.Players_pendingUpdateCount; ++var2) {
			int var3 = this.Players_pendingUpdateIndices[var2];
			Player var4 = this.worldView.players[var3];
			int var5 = var1.readUnsignedByte();
			if ((var5 & 16) != 0) {
				var5 += var1.readUnsignedByte() << 8;
			}

			if ((var5 & 4096) != 0) {
				var5 += var1.readUnsignedByte() << 16;
			}

			this.method2833(var1, var3, var4, var5);
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lug;ILdb;II)V",
		garbageValue = "-311624259"
	)
	final void method2833(PacketBuffer var1, int var2, Player var3, int var4) {
		byte var5 = class238.field2512.field2515;
		if ((var4 & 2048) != 0) {
			this.field1406[var2] = (class238)class210.findEnumerated(class193.method3759(), var1.readByteSub());
		}

		if ((var4 & 256) != 0) {
			var5 = var1.readByte();
		}

		if ((var4 & 2) != 0) {
			var3.overheadText = var1.readStringCp1252NullTerminated();
			if (var3.overheadText.charAt(0) == '~') {
				var3.overheadText = var3.overheadText.substring(1);
				VarbitComposition.addGameMessage(2, var3.username.getName(), var3.overheadText);
			} else if (var3 == SoundCache.localPlayer) {
				VarbitComposition.addGameMessage(2, var3.username.getName(), var3.overheadText);
			}

			var3.field1212 = false;
			var3.field1226 = 0;
			var3.field1216 = 0;
			var3.overheadTextCyclesRemaining = 150;
		}

		int var6;
		if ((var4 & 32768) != 0) {
			for (var6 = 0; var6 < 3; ++var6) {
				var3.actions[var6] = var1.readStringCp1252NullTerminated();
			}
		}

		if ((var4 & 8192) != 0) {
			var3.field1251 = Client.cycle + var1.readUnsignedShortLE();
			var3.field1215 = Client.cycle + var1.readUnsignedShortAddLE();
			var3.field1223 = var1.readByteAdd();
			var3.field1254 = var1.readByteSub();
			var3.field1255 = var1.readByteAdd();
			var3.field1239 = (byte)var1.readUnsignedByteNeg();
		}

		int var7;
		if ((var4 & 64) != 0) {
			var6 = var1.readUnsignedShort();
			if (var6 == 65535) {
				var6 = -1;
			}

			var7 = var1.readUnsignedByteNeg();
			Canvas.performPlayerAnimation(var3, var6, var7);
		}

		if ((var4 & 1) != 0) {
			var6 = var1.readUnsignedByteSub();
			byte[] var21 = new byte[var6];
			Buffer var8 = new Buffer(var21);
			var1.method9559(var21, 0, var6);
			this.field1407[var2] = var8;
			var3.read(var8);
		}

		if ((var4 & 512) != 0) {
			var3.field1242 = var1.readByteNeg();
			var3.field1244 = var1.readByteAdd();
			var3.field1243 = var1.readByteSub();
			var3.field1245 = var1.readByte();
			var3.spotAnimation = var1.readUnsignedShortAdd() + Client.cycle;
			var3.field1260 = var1.readUnsignedShortAdd() + Client.cycle;
			var3.field1248 = var1.readUnsignedShortLE();
			if (var3.field1144) {
				var3.field1242 += var3.tileX;
				var3.field1244 += var3.tileY;
				var3.field1243 += var3.tileX;
				var3.field1245 += var3.tileY;
				var3.pathLength = 0;
			} else {
				var3.field1242 += var3.pathX[0];
				var3.field1244 += var3.pathY[0];
				var3.field1243 += var3.pathX[0];
				var3.field1245 += var3.pathY[0];
				var3.pathLength = 1;
			}

			var3.field1265 = 0;
		}

		int var9;
		int var10;
		int var22;
		if ((var4 & 65536) != 0) {
			var6 = var1.readUnsignedByteNeg();

			for (var7 = 0; var7 < var6; ++var7) {
				var22 = var1.readUnsignedByteSub();
				var9 = var1.readUnsignedShortAdd();
				var10 = var1.readUnsignedIntLE();
				var3.updateSpotAnimation(var22, var9, var10 >> 16, var10 & 65535);
			}
		}

		int var11;
		int var13;
		int var24;
		if ((var4 & 8) != 0) {
			var6 = var1.readUnsignedByteSub();
			if (var6 > 0) {
				for (var7 = 0; var7 < var6; ++var7) {
					var9 = -1;
					var10 = -1;
					var11 = -1;
					var22 = var1.readUShortSmart();
					if (var22 == 32767) {
						var22 = var1.readUShortSmart();
						var10 = var1.readUShortSmart();
						var9 = var1.readUShortSmart();
						var11 = var1.readUShortSmart();
					} else if (var22 != 32766) {
						var10 = var1.readUShortSmart();
					} else {
						var22 = -1;
					}

					var24 = var1.readUShortSmart();
					var3.addHitSplat(var22, var10, var9, var11, Client.cycle, var24);
				}
			}

			var7 = var1.readUnsignedByteAdd();
			if (var7 > 0) {
				for (var22 = 0; var22 < var7; ++var22) {
					var9 = var1.readUShortSmart();
					var10 = var1.readUShortSmart();
					if (var10 != 32767) {
						var11 = var1.readUShortSmart();
						var24 = var1.readUnsignedByteSub();
						var13 = var10 > 0 ? var1.readUnsignedByteAdd() : var24;
						var3.addHealthBar(var9, Client.cycle, var10, var11, var24, var13);
					} else {
						var3.removeHealthBar(var9);
					}
				}
			}
		}

		if ((var4 & 32) != 0) {
			var3.targetIndex = var1.readUnsignedShortAddLE();
			var3.targetIndex += var1.readUnsignedByteSub() << 16;
			var6 = 16777215;
			if (var6 == var3.targetIndex) {
				var3.targetIndex = -1;
			}
		}

		if ((var4 & 4) != 0) {
			var6 = var1.readUnsignedShortLE();
			PlayerType var31 = (PlayerType)class210.findEnumerated(class136.PlayerType_values(), var1.readUnsignedByteSub());
			boolean var32 = var1.readUnsignedByteNeg() == 1;
			var9 = var1.readUnsignedByteSub();
			var10 = var1.offset;
			if (var3.username != null && var3.appearance != null) {
				boolean var28 = false;
				if (var31.isUser && class135.friendSystem.isIgnored(var3.username)) {
					var28 = true;
				}

				if (!var28 && Client.field625 == 0 && !var3.isHidden) {
					this.field1417.offset = 0;
					var1.method9615(this.field1417.array, 0, var9);
					this.field1417.offset = 0;
					String var12 = AbstractFont.escapeBrackets(Interpreter.method2025(SpotAnimationDefinition.method3789(this.field1417)));
					var3.overheadText = var12.trim();
					var3.field1226 = var6 >> 8;
					var3.field1216 = var6 & 255;
					var3.overheadTextCyclesRemaining = 150;
					var3.field1217 = null;
					var3.field1212 = var32;
					var3.field1213 = var3 != SoundCache.localPlayer && var31.isUser && !Client.field736.isEmpty() && var12.toLowerCase().indexOf(Client.field736) == -1;
					if (var31.isPrivileged) {
						var13 = var32 ? 91 : 1;
					} else {
						var13 = var32 ? 90 : 2;
					}

					if (var31.modIcon != -1) {
						VarbitComposition.addGameMessage(var13, class385.method7175(var31.modIcon) + var3.username.getName(), var12);
					} else {
						VarbitComposition.addGameMessage(var13, var3.username.getName(), var12);
					}
				}
			}

			var1.offset = var9 + var10;
		}

		if ((var4 & 16384) != 0) {
			var6 = var1.readUnsignedShortAddLE();
			var7 = var6 >> 8;
			var22 = var7 >= 13 && var7 <= 20 ? var7 - 12 : 0;
			PlayerType var23 = (PlayerType)class210.findEnumerated(class136.PlayerType_values(), var1.readUnsignedByteAdd());
			boolean var29 = var1.readUnsignedByteNeg() == 1;
			var11 = var1.readUnsignedByteSub();
			var24 = var1.offset;
			if (var3.username != null && var3.appearance != null) {
				boolean var30 = false;
				if (var23.isUser && class135.friendSystem.isIgnored(var3.username)) {
					var30 = true;
				}

				if (!var30 && Client.field625 == 0 && !var3.isHidden) {
					this.field1417.offset = 0;
					var1.method9615(this.field1417.array, 0, var11);
					this.field1417.offset = 0;
					String var14 = AbstractFont.escapeBrackets(Interpreter.method2025(SpotAnimationDefinition.method3789(this.field1417)));
					var3.overheadText = var14.trim();
					var3.field1226 = var6 >> 8;
					var3.field1216 = var6 & 255;
					var3.overheadTextCyclesRemaining = 150;
					byte[] var15 = null;
					if (var22 > 0 && var22 <= 8) {
						var15 = new byte[var22];

						for (int var16 = 0; var16 < var22; ++var16) {
							var15[var16] = var1.readByteNeg();
						}
					}

					byte[] var18 = var15;
					int[] var17;
					if (var15 != null && var15.length != 0 && var15.length <= 8) {
						int[] var19 = new int[var15.length];
						int var20 = 0;

						while (true) {
							if (var20 >= var18.length) {
								var17 = var19;
								break;
							}

							if (var18[var20] < 0 || var18[var20] >= class569.field5515.length) {
								var17 = null;
								break;
							}

							var19[var20] = class569.field5515[var18[var20]];
							++var20;
						}
					} else {
						var17 = null;
					}

					var3.field1217 = var17;
					var3.field1212 = var29;
					var3.field1213 = var3 != SoundCache.localPlayer && var23.isUser && !Client.field736.isEmpty() && var14.toLowerCase().indexOf(Client.field736) == -1;
					int var26;
					if (var23.isPrivileged) {
						var26 = var29 ? 91 : 1;
					} else {
						var26 = var29 ? 90 : 2;
					}

					if (var23.modIcon != -1) {
						VarbitComposition.addGameMessage(var26, class385.method7175(var23.modIcon) + var3.username.getName(), var14);
					} else {
						VarbitComposition.addGameMessage(var26, var3.username.getName(), var14);
					}
				}
			}

			var1.offset = var24 + var11 + var22;
		}

		if ((var4 & 128) != 0) {
			var3.field1227 = var1.readUnsignedShortLE();
			if (var3.pathLength == 0) {
				var3.orientation = var3.field1227;
				var3.method2485();
			}
		}

		if (var3.field1144) {
			if (var5 == 127) {
				var3.resetPath(var3.tileX, var3.tileY);
			} else {
				class238 var27;
				if (var5 != class238.field2512.field2515) {
					var27 = (class238)class210.findEnumerated(class193.method3759(), var5);
				} else {
					var27 = this.field1406[var2];
				}

				var3.method2437(this.worldView, var3.tileX, var3.tileY, var27);
			}
		}

	}
}
