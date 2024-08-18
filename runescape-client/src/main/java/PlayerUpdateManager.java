import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
@Implements("PlayerUpdateManager")
public class PlayerUpdateManager {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ldy;"
	)
	@Export("worldView")
	WorldView worldView;
	@ObfuscatedName("au")
	byte[] field1395;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Lko;"
	)
	MoveSpeed[] field1392;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	Buffer[] field1402;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 63121795
	)
	@Export("playerCount")
	int playerCount;
	@ObfuscatedName("ac")
	@Export("playerIndices")
	int[] playerIndices;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -166651229
	)
	@Export("Players_emptyIdxCount")
	int Players_emptyIdxCount;
	@ObfuscatedName("ad")
	@Export("Players_emptyIndices")
	int[] Players_emptyIndices;
	@ObfuscatedName("aq")
	@Export("Players_regions")
	int[] Players_regions;
	@ObfuscatedName("al")
	@Export("Players_orientations")
	int[] Players_orientations;
	@ObfuscatedName("aj")
	@Export("Players_targetIndices")
	int[] Players_targetIndices;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1250922667
	)
	@Export("Players_pendingUpdateCount")
	int Players_pendingUpdateCount;
	@ObfuscatedName("aw")
	@Export("Players_pendingUpdateIndices")
	int[] Players_pendingUpdateIndices;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	Buffer field1407;

	@ObfuscatedSignature(
		descriptor = "(Ldy;)V"
	)
	PlayerUpdateManager(WorldView var1) {
		this.field1395 = new byte[2048];
		this.field1392 = new MoveSpeed[2048];
		this.field1402 = new Buffer[2048];
		this.playerCount = 0;
		this.playerIndices = new int[2048];
		this.Players_emptyIdxCount = 0;
		this.Players_emptyIndices = new int[2048];
		this.Players_regions = new int[2048];
		this.Players_orientations = new int[2048];
		this.Players_targetIndices = new int[2048];
		this.Players_pendingUpdateCount = 0;
		this.Players_pendingUpdateIndices = new int[2048];
		this.field1407 = new Buffer(new byte[5000]);
		this.worldView = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvs;ZI)V",
		garbageValue = "-612404647"
	)
	@Export("updatePlayer")
	final void updatePlayer(PacketBuffer var1, boolean var2) {
		var1.importIndex();
		Player var3 = new Player();
		int var4 = Client.localPlayerIndex;
		if (var2) {
			class253.localPlayer = var3;
			ConcurrentMidiTask.topLevelWorldView.players[var4] = var3;
		} else {
			this.worldView.players[var4] = var3;
		}

		var3.index = var4;
		int var5 = var1.readBits(30);
		byte var6 = (byte)Coord.method6505(var5);
		int var7 = Coord.method6506(var5);
		int var8 = Coord.method6507(var5);
		var3.pathX[0] = var7 - this.worldView.baseX;
		var3.x = (var3.pathX[0] << 7) + (var3.transformedSize() << 6);
		var3.pathY[0] = var8 - this.worldView.baseY;
		var3.y = (var3.pathY[0] << 7) + (var3.transformedSize() << 6);
		if (var2) {
			this.worldView.plane = var3.plane = var6;
		}

		if (this.field1402[var4] != null) {
			var3.read(this.field1402[var4]);
		}

		this.playerCount = 0;
		this.playerIndices[++this.playerCount - 1] = var4;
		this.field1395[var4] = 0;
		this.Players_emptyIdxCount = 0;

		for (int var9 = 1; var9 < 2048; ++var9) {
			if (var9 != var4) {
				int var10 = var1.readBits(18);
				int var11 = var10 >> 16;
				int var12 = var10 >> 8 & 597;
				int var13 = var10 & 597;
				this.Players_regions[var9] = Coord.method6504(var11, var12, var13);
				this.Players_orientations[var9] = 0;
				this.Players_targetIndices[var9] = -1;
				this.Players_emptyIndices[++this.Players_emptyIdxCount - 1] = var9;
				this.field1395[var9] = 0;
			}
		}

		var1.exportIndex();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvs;II)V",
		garbageValue = "-1091919770"
	)
	final void method2866(PacketBuffer var1, int var2) {
		int var3 = var1.offset;
		this.Players_pendingUpdateCount = 0;
		this.method2875(var1);
		this.updatePlayers(var1);
		if (var2 != var1.offset - var3) {
			throw new RuntimeException(var1.offset - var3 + " " + var2);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvs;I)V",
		garbageValue = "-1585761604"
	)
	final void method2875(PacketBuffer var1) {
		int var2 = 0;
		var1.importIndex();

		byte[] var10000;
		int var3;
		int var5;
		int var6;
		for (var3 = 0; var3 < this.playerCount; ++var3) {
			var6 = this.playerIndices[var3];
			if ((this.field1395[var6] & 1) == 0) {
				if (var2 > 0) {
					--var2;
					var10000 = this.field1395;
					var10000[var6] = (byte)(var10000[var6] | 2);
				} else {
					var5 = var1.readBits(1);
					if (var5 == 0) {
						var2 = this.method2868(var1);
						var10000 = this.field1395;
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
				if ((this.field1395[var6] & 1) != 0) {
					if (var2 > 0) {
						--var2;
						var10000 = this.field1395;
						var10000[var6] = (byte)(var10000[var6] | 2);
					} else {
						var5 = var1.readBits(1);
						if (var5 == 0) {
							var2 = this.method2868(var1);
							var10000 = this.field1395;
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
					if ((this.field1395[var6] & 1) != 0) {
						if (var2 > 0) {
							--var2;
							var10000 = this.field1395;
							var10000[var6] = (byte)(var10000[var6] | 2);
						} else {
							var5 = var1.readBits(1);
							if (var5 == 0) {
								var2 = this.method2868(var1);
								var10000 = this.field1395;
								var10000[var6] = (byte)(var10000[var6] | 2);
							} else if (this.method2870(var1, var6)) {
								var10000 = this.field1395;
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
						if ((this.field1395[var6] & 1) == 0) {
							if (var2 > 0) {
								--var2;
								var10000 = this.field1395;
								var10000[var6] = (byte)(var10000[var6] | 2);
							} else {
								var5 = var1.readBits(1);
								if (var5 == 0) {
									var2 = this.method2868(var1);
									var10000 = this.field1395;
									var10000[var6] = (byte)(var10000[var6] | 2);
								} else if (this.method2870(var1, var6)) {
									var10000 = this.field1395;
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
							var10000 = this.field1395;
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvs;I)I",
		garbageValue = "1857851351"
	)
	int method2868(PacketBuffer var1) {
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lvs;II)V",
		garbageValue = "-423910997"
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
				var5.field1128 = false;
			} else if (var2 == Client.localPlayerIndex) {
				throw new RuntimeException();
			} else {
				this.Players_regions[var2] = Coord.method6504(var5.plane, this.worldView.baseX + var5.pathX[0] >> 13, this.worldView.baseY + var5.pathY[0] >> 13);
				if (var5.field1254 != -1) {
					this.Players_orientations[var2] = var5.field1254;
				} else {
					this.Players_orientations[var2] = var5.orientation;
				}

				this.Players_targetIndices[var2] = var5.targetIndex;
				this.worldView.players[var2] = null;
				if (var1.readBits(1) != 0) {
					this.method2870(var1, var2);
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

				if (var2 == Client.localPlayerIndex && this.worldView.isTopLevelWorldView() && (var5.x < 1536 || var5.y < 1536 || var5.x >= 11776 || var5.y >= 11776)) {
					var5.resetPath(var7, var8);
					var5.field1128 = false;
				} else if (var3) {
					var5.field1128 = true;
					var5.tileX = var7;
					var5.tileY = var8;
				} else {
					var5.field1128 = false;
					var5.method2458(this.worldView, var7, var8, this.field1392[var2]);
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

				if (var2 == Client.localPlayerIndex && this.worldView.isTopLevelWorldView() && (var5.x < 1536 || var5.y < 1536 || var5.x >= 11776 || var5.y >= 11776)) {
					var5.resetPath(var7, var8);
					var5.field1128 = false;
				} else if (var3) {
					var5.field1128 = true;
					var5.tileX = var7;
					var5.tileY = var8;
				} else {
					var5.field1128 = false;
					var5.method2458(this.worldView, var7, var8, this.field1392[var2]);
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
					if (var2 != Client.localPlayerIndex || !this.worldView.isTopLevelWorldView() || var5.x >= 1536 && var5.y >= 1536 && var5.x < 11776 && var5.y < 11776) {
						if (var3) {
							var5.field1128 = true;
							var5.tileX = var11;
							var5.tileY = var12;
						} else {
							var5.field1128 = false;
							var5.method2458(this.worldView, var11, var12, this.field1392[var2]);
						}
					} else {
						var5.resetPath(var11, var12);
						var5.field1128 = false;
					}

					var5.plane = (byte)(var8 + var5.plane & 3);
					if (var2 == Client.localPlayerIndex && this.worldView.isTopLevelWorldView()) {
						this.worldView.plane = var5.plane;
					}

				} else {
					var7 = var1.readBits(30);
					var8 = Coord.method6505(var7);
					var9 = Coord.method6506(var7);
					var10 = Coord.method6507(var7);
					var11 = (this.worldView.baseX + var9 + var5.pathX[0] & 16383) - this.worldView.baseX;
					var12 = (this.worldView.baseY + var10 + var5.pathY[0] & 16383) - this.worldView.baseY;
					if (var2 == Client.localPlayerIndex && this.worldView.isTopLevelWorldView() && (var5.x < 1536 || var5.y < 1536 || var5.x >= 11776 || var5.y >= 11776)) {
						var5.resetPath(var11, var12);
						var5.field1128 = false;
					} else if (var3) {
						var5.field1128 = true;
						var5.tileX = var11;
						var5.tileY = var12;
					} else {
						var5.field1128 = false;
						var5.method2458(this.worldView, var11, var12, this.field1392[var2]);
					}

					var5.plane = (byte)(var8 + var5.plane & 3);
					if (var2 == Client.localPlayerIndex && this.worldView.isTopLevelWorldView()) {
						this.worldView.plane = var5.plane;
					}

				}
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvs;II)Z",
		garbageValue = "-1795048412"
	)
	boolean method2870(PacketBuffer var1, int var2) {
		int var3 = var1.readBits(2);
		int var4;
		int var5;
		int var8;
		int var9;
		int var10;
		int var11;
		if (var3 == 0) {
			if (var1.readBits(1) != 0) {
				this.method2870(var1, var2);
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
				if (this.field1402[var2] != null) {
					var12.read(this.field1402[var2]);
				}

				var12.orientation = this.Players_orientations[var2];
				var12.targetIndex = this.Players_targetIndices[var2];
				var8 = this.Players_regions[var2];
				var9 = var8 >> 28;
				var10 = var8 >> 14 & 255;
				var11 = var8 & 255;
				var12.pathTraversed[0] = this.field1392[var2];
				var12.plane = (byte)var9;
				var12.resetPath((var10 << 13) + var4 - this.worldView.baseX, (var11 << 13) + var5 - this.worldView.baseY);
				var12.field1128 = false;
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

				this.Players_regions[var2] = Coord.method6504(var8, var9, var10);
				return false;
			} else {
				var4 = var1.readBits(18);
				var5 = var4 >> 16;
				var6 = var4 >> 8 & 255;
				var7 = var4 & 255;
				var8 = this.Players_regions[var2];
				var9 = (var8 >> 28) + var5 & 3;
				var10 = var6 + (var8 >> 14) & 255;
				var11 = var8 + var7 & 255;
				this.Players_regions[var2] = Coord.method6504(var9, var10, var11);
				return false;
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lvs;I)V",
		garbageValue = "577564304"
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

			this.method2872(var1, var3, var4, var5);
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvs;ILdw;IB)V",
		garbageValue = "-81"
	)
	final void method2872(PacketBuffer var1, int var2, Player var3, int var4) {
		byte var5 = MoveSpeed.field2982.id;
		int var6;
		int var7;
		int var8;
		int var10;
		int var26;
		if ((var4 & 65536) != 0) {
			var6 = var1.readUnsignedByteAdd();

			for (var7 = 0; var7 < var6; ++var7) {
				var8 = var1.readUnsignedByte();
				var26 = var1.readUnsignedShortAddLE();
				var10 = var1.readInt();
				var3.updateSpotAnimation(var8, var26, var10 >> 16, var10 & 65535);
			}
		}

		int var11;
		int var12;
		if ((var4 & 2048) != 0) {
			var6 = var1.readUnsignedShort();
			var7 = var6 >> 8;
			var8 = var7 >= 13 && var7 <= 20 ? var7 - 12 : 0;
			PlayerType var9 = (PlayerType)class134.findEnumerated(class345.PlayerType_values(), var1.readUnsignedByteNeg());
			boolean var29 = var1.readUnsignedByteSub() == 1;
			var11 = var1.readUnsignedByteAdd();
			var12 = var1.offset;
			if (var3.username != null && var3.appearance != null) {
				boolean var13 = false;
				if (var9.isUser && class277.friendSystem.isIgnored(var3.username)) {
					var13 = true;
				}

				if (!var13 && Client.field586 == 0 && !var3.isHidden) {
					this.field1407.offset = 0;
					var1.method9757(this.field1407.array, 0, var11);
					this.field1407.offset = 0;
					String var14 = AbstractFont.escapeBrackets(Skeleton.method3886(BufferedNetSocket.method8811(this.field1407)));
					var3.overheadText = var14.trim();
					var3.field1204 = var6 >> 8;
					var3.field1205 = var6 & 255;
					var3.overheadTextCyclesRemaining = 150;
					byte[] var15 = null;
					if (var8 > 0 && var8 <= 8) {
						var15 = new byte[var8];

						for (int var16 = 0; var16 < var8; ++var16) {
							var15[var16] = var1.readByte();
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

							if (var18[var20] < 0 || var18[var20] >= class572.field5548.length) {
								var17 = null;
								break;
							}

							var19[var20] = class572.field5548[var18[var20]];
							++var20;
						}
					} else {
						var17 = null;
					}

					var3.field1206 = var17;
					var3.field1201 = var29;
					var3.field1208 = var3 != class253.localPlayer && var9.isUser && !Client.field731.isEmpty() && var14.toLowerCase().indexOf(Client.field731) == -1;
					int var22;
					if (var9.isPrivileged) {
						var22 = var29 ? 91 : 1;
					} else {
						var22 = var29 ? 90 : 2;
					}

					if (var9.modIcon != -1) {
						class269.addGameMessage(var22, class152.method3376(var9.modIcon) + var3.username.getName(), var14);
					} else {
						class269.addGameMessage(var22, var3.username.getName(), var14);
					}
				}
			}

			var1.offset = var11 + var12 + var8;
		}

		if ((var4 & 32768) != 0) {
			var3.field1231 = var1.readByte();
			var3.field1233 = var1.readByteNeg();
			var3.field1232 = var1.readByteNeg();
			var3.field1234 = var1.readByteAdd();
			var3.spotAnimation = var1.readUnsignedShortAdd() + Client.cycle;
			var3.field1236 = var1.readUnsignedShortAdd() + Client.cycle;
			var3.field1237 = var1.readUnsignedShortAddLE();
			if (var3.field1128) {
				var3.field1231 += var3.tileX;
				var3.field1233 += var3.tileY;
				var3.field1232 += var3.tileX;
				var3.field1234 += var3.tileY;
				var3.pathLength = 0;
			} else {
				var3.field1231 += var3.pathX[0];
				var3.field1233 += var3.pathY[0];
				var3.field1232 += var3.pathX[0];
				var3.field1234 += var3.pathY[0];
				var3.pathLength = 1;
			}

			var3.field1255 = 0;
		}

		if ((var4 & 8192) != 0) {
			MoveSpeed[] var23 = this.field1392;
			MoveSpeed[] var24 = new MoveSpeed[]{MoveSpeed.field2986, MoveSpeed.field2988, MoveSpeed.field2991, MoveSpeed.field2982, MoveSpeed.field2983, MoveSpeed.field2987, MoveSpeed.field2984, MoveSpeed.field2985, MoveSpeed.field2981};
			var23[var2] = (MoveSpeed)class134.findEnumerated(var24, var1.readByteNeg());
		}

		int var31;
		if ((var4 & 2) != 0) {
			var6 = var1.readUnsignedShort();
			PlayerType var25 = (PlayerType)class134.findEnumerated(class345.PlayerType_values(), var1.readUnsignedByte());
			boolean var28 = var1.readUnsignedByteNeg() == 1;
			var26 = var1.readUnsignedByteAdd();
			var10 = var1.offset;
			if (var3.username != null && var3.appearance != null) {
				boolean var30 = false;
				if (var25.isUser && class277.friendSystem.isIgnored(var3.username)) {
					var30 = true;
				}

				if (!var30 && Client.field586 == 0 && !var3.isHidden) {
					this.field1407.offset = 0;
					var1.method9666(this.field1407.array, 0, var26);
					this.field1407.offset = 0;
					String var27 = AbstractFont.escapeBrackets(Skeleton.method3886(BufferedNetSocket.method8811(this.field1407)));
					var3.overheadText = var27.trim();
					var3.field1204 = var6 >> 8;
					var3.field1205 = var6 & 255;
					var3.overheadTextCyclesRemaining = 150;
					var3.field1206 = null;
					var3.field1201 = var28;
					var3.field1208 = var3 != class253.localPlayer && var25.isUser && !Client.field731.isEmpty() && var27.toLowerCase().indexOf(Client.field731) == -1;
					if (var25.isPrivileged) {
						var31 = var28 ? 91 : 1;
					} else {
						var31 = var28 ? 90 : 2;
					}

					if (var25.modIcon != -1) {
						class269.addGameMessage(var31, class152.method3376(var25.modIcon) + var3.username.getName(), var27);
					} else {
						class269.addGameMessage(var31, var3.username.getName(), var27);
					}
				}
			}

			var1.offset = var10 + var26;
		}

		if ((var4 & 1024) != 0) {
			for (var6 = 0; var6 < 3; ++var6) {
				var3.actions[var6] = var1.readStringCp1252NullTerminated();
			}
		}

		if ((var4 & 256) != 0) {
			var3.field1244 = Client.cycle + var1.readUnsignedShortAddLE();
			var3.field1241 = Client.cycle + var1.readUnsignedShortAdd();
			var3.field1242 = var1.readByteAdd();
			var3.field1243 = var1.readByteAdd();
			var3.field1240 = var1.readByte();
			var3.field1220 = (byte)var1.readUnsignedByteNeg();
		}

		if ((var4 & 64) != 0) {
			var3.targetIndex = var1.readUnsignedShortAddLE();
			var3.targetIndex += var1.readUnsignedByteNeg() << 16;
			var6 = 16777215;
			if (var6 == var3.targetIndex) {
				var3.targetIndex = -1;
			}
		}

		if ((var4 & 4) != 0) {
			var6 = var1.readUnsignedByteAdd();
			byte[] var34 = new byte[var6];
			Buffer var33 = new Buffer(var34);
			var1.method9666(var34, 0, var6);
			this.field1402[var2] = var33;
			var3.read(var33);
		}

		if ((var4 & 1) != 0) {
			var3.field1254 = var1.readUnsignedShortAddLE();
			if (var3.pathLength == 0) {
				var3.orientation = var3.field1254;
				var3.method2528();
			}
		}

		if ((var4 & 128) != 0) {
			var6 = var1.readUnsignedShort();
			if (var6 == 65535) {
				var6 = -1;
			}

			var7 = var1.readUnsignedByte();
			Login.performPlayerAnimation(var3, var6, var7);
		}

		if ((var4 & 512) != 0) {
			var5 = var1.readByteAdd();
		}

		if ((var4 & 32) != 0) {
			var6 = var1.readUnsignedByteSub();
			if (var6 > 0) {
				for (var7 = 0; var7 < var6; ++var7) {
					var26 = -1;
					var10 = -1;
					var11 = -1;
					var8 = var1.readUShortSmart();
					if (var8 == 32767) {
						var8 = var1.readUShortSmart();
						var10 = var1.readUShortSmart();
						var26 = var1.readUShortSmart();
						var11 = var1.readUShortSmart();
					} else if (var8 != 32766) {
						var10 = var1.readUShortSmart();
					} else {
						var8 = -1;
					}

					var12 = var1.readUShortSmart();
					var3.addHitSplat(var8, var10, var26, var11, Client.cycle, var12);
				}
			}

			var7 = var1.readUnsignedByte();
			if (var7 > 0) {
				for (var8 = 0; var8 < var7; ++var8) {
					var26 = var1.readUShortSmart();
					var10 = var1.readUShortSmart();
					if (var10 != 32767) {
						var11 = var1.readUShortSmart();
						var12 = var1.readUnsignedByteNeg();
						var31 = var10 > 0 ? var1.readUnsignedByteNeg() : var12;
						var3.addHealthBar(var26, Client.cycle, var10, var11, var12, var31);
					} else {
						var3.removeHealthBar(var26);
					}
				}
			}
		}

		if ((var4 & 8) != 0) {
			var3.overheadText = var1.readStringCp1252NullTerminated();
			if (var3.overheadText.charAt(0) == '~') {
				var3.overheadText = var3.overheadText.substring(1);
				class269.addGameMessage(2, var3.username.getName(), var3.overheadText);
			} else if (var3 == class253.localPlayer) {
				class269.addGameMessage(2, var3.username.getName(), var3.overheadText);
			}

			var3.field1201 = false;
			var3.field1204 = 0;
			var3.field1205 = 0;
			var3.overheadTextCyclesRemaining = 150;
		}

		if (var3.field1128) {
			if (var5 == 127) {
				var3.resetPath(var3.tileX, var3.tileY);
			} else {
				MoveSpeed var32;
				if (var5 != MoveSpeed.field2982.id) {
					MoveSpeed[] var35 = new MoveSpeed[]{MoveSpeed.field2986, MoveSpeed.field2988, MoveSpeed.field2991, MoveSpeed.field2982, MoveSpeed.field2983, MoveSpeed.field2987, MoveSpeed.field2984, MoveSpeed.field2985, MoveSpeed.field2981};
					var32 = (MoveSpeed)class134.findEnumerated(var35, var5);
				} else {
					var32 = this.field1392[var2];
				}

				var3.method2458(this.worldView, var3.tileX, var3.tileY, var32);
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IS)F",
		garbageValue = "4032"
	)
	public static float method2892(int var0) {
		var0 &= 16383;
		return (float)((double)((float)var0 / 16384.0F) * 6.283185307179586D);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-51"
	)
	public static void method2893() {
		WorldMapElement.HitSplatDefinition_cached.clear();
	}
}
