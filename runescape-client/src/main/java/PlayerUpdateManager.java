import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
@Implements("PlayerUpdateManager")
public class PlayerUpdateManager {
	@ObfuscatedName("bv")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Lcw;"
	)
	@Export("Players_regions")
	final class73[] Players_regions;
	@ObfuscatedName("aj")
	final boolean[] field1421;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[Lkk;"
	)
	final MoveSpeed[] field1429;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	final Buffer field1420;
	@ObfuscatedName("as")
	final String[] field1424;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -562349667
	)
	@Export("playerCount")
	int playerCount;
	@ObfuscatedName("am")
	@Export("playerIndices")
	final int[] playerIndices;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1811009939
	)
	@Export("Players_emptyIdxCount")
	int Players_emptyIdxCount;
	@ObfuscatedName("au")
	@Export("Players_emptyIndices")
	final int[] Players_emptyIndices;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1305871505
	)
	int field1418;
	@ObfuscatedName("ao")
	@Export("Players_targetIndices")
	final int[] Players_targetIndices;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1634602615
	)
	@Export("Players_pendingUpdateCount")
	int Players_pendingUpdateCount;
	@ObfuscatedName("ar")
	@Export("Players_pendingUpdateIndices")
	final int[] Players_pendingUpdateIndices;

	PlayerUpdateManager() {
		this.Players_regions = new class73[2048];
		this.field1421 = new boolean[2048];
		this.field1429 = new MoveSpeed[2048];
		this.field1420 = new Buffer(new byte[5000]);
		this.field1424 = new String[3];
		this.playerCount = 0;
		this.playerIndices = new int[2048];
		this.Players_emptyIdxCount = 0;
		this.Players_emptyIndices = new int[2048];
		this.field1418 = 0;
		this.Players_targetIndices = new int[2048];
		this.Players_pendingUpdateCount = 0;
		this.Players_pendingUpdateIndices = new int[2048];

		for (int var1 = 0; var1 < 2048; ++var1) {
			this.Players_regions[var1] = new class73(var1);
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvm;I)V",
		garbageValue = "-1822349264"
	)
	@Export("updatePlayer")
	final void updatePlayer(PacketBuffer var1) {
		this.method3090();
		var1.importIndex();
		int var2 = Client.localPlayerIndex;
		class73 var3 = this.Players_regions[var2];
		int var4 = var1.readBits(30);
		var3.method2256(-1);
		var3.coord.method6842(var4);
		var3.field874 = 0;
		Player var5 = var3.method2245(var2, class198.topLevelWorldView);
		var3.method2243(var5);
		class198.topLevelWorldView.players[var2] = var5;
		SpriteMask.localPlayer = var5;
		this.playerCount = 0;
		this.playerIndices[++this.playerCount - 1] = var2;
		this.Players_emptyIdxCount = 0;

		for (int var6 = 1; var6 < 2048; ++var6) {
			if (var6 != var2) {
				int var7 = var1.readBits(18);
				int var8 = var7 >> 16;
				int var9 = var7 >> 8 & 255;
				int var10 = var7 & 255;
				this.Players_regions[var6].method2256(Coord.method6849(var8, var9, var10));
				this.Players_emptyIndices[++this.Players_emptyIdxCount - 1] = var6;
			}
		}

		var1.exportIndex();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lvm;II)V",
		garbageValue = "238362611"
	)
	final void method3081(PacketBuffer var1, int var2) {
		int var3 = var1.offset;
		this.Players_pendingUpdateCount = 0;
		this.method3082(var1);
		this.method3091();
		this.method3100();
		this.updatePlayers(var1);
		this.method3088();
		if (var2 != var1.offset - var3) {
			throw new RuntimeException(var1.offset - var3 + " " + var2);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvm;I)V",
		garbageValue = "-1689308347"
	)
	void method3082(PacketBuffer var1) {
		this.field1418 = 0;
		int var2 = 0;
		var1.importIndex();

		class73 var10000;
		int var3;
		int var4;
		int var5;
		for (var3 = 0; var3 < this.playerCount; ++var3) {
			var4 = this.playerIndices[var3];
			if ((this.Players_regions[var4].field874 & 1) == 0) {
				if (var2 > 0) {
					--var2;
					var10000 = this.Players_regions[var4];
					var10000.field874 = (byte)(var10000.field874 | 2);
				} else {
					var5 = var1.readBits(1);
					if (var5 == 0) {
						var2 = this.method3083(var1);
						var10000 = this.Players_regions[var4];
						var10000.field874 = (byte)(var10000.field874 | 2);
					} else {
						this.readPlayerUpdate(var1, var4);
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
				var4 = this.playerIndices[var3];
				if ((this.Players_regions[var4].field874 & 1) != 0) {
					if (var2 > 0) {
						--var2;
						var10000 = this.Players_regions[var4];
						var10000.field874 = (byte)(var10000.field874 | 2);
					} else {
						var5 = var1.readBits(1);
						if (var5 == 0) {
							var2 = this.method3083(var1);
							var10000 = this.Players_regions[var4];
							var10000.field874 = (byte)(var10000.field874 | 2);
						} else {
							this.readPlayerUpdate(var1, var4);
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
					var4 = this.Players_emptyIndices[var3];
					if ((this.Players_regions[var4].field874 & 1) != 0) {
						if (var2 > 0) {
							--var2;
							var10000 = this.Players_regions[var4];
							var10000.field874 = (byte)(var10000.field874 | 2);
						} else {
							var5 = var1.readBits(1);
							if (var5 == 0) {
								var2 = this.method3083(var1);
								var10000 = this.Players_regions[var4];
								var10000.field874 = (byte)(var10000.field874 | 2);
							} else if (this.method3084(var1, var4)) {
								var10000 = this.Players_regions[var4];
								var10000.field874 = (byte)(var10000.field874 | 2);
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
						var4 = this.Players_emptyIndices[var3];
						if ((this.Players_regions[var4].field874 & 1) == 0) {
							if (var2 > 0) {
								--var2;
								var10000 = this.Players_regions[var4];
								var10000.field874 = (byte)(var10000.field874 | 2);
							} else {
								var5 = var1.readBits(1);
								if (var5 == 0) {
									var2 = this.method3083(var1);
									var10000 = this.Players_regions[var4];
									var10000.field874 = (byte)(var10000.field874 | 2);
								} else if (this.method3084(var1, var4)) {
									var10000 = this.Players_regions[var4];
									var10000.field874 = (byte)(var10000.field874 | 2);
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
							var10000 = this.Players_regions[var3];
							var10000.field874 = (byte)(var10000.field874 >> 1);
							if (this.Players_regions[var3].method2246()) {
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lvm;B)I",
		garbageValue = "4"
	)
	int method3083(PacketBuffer var1) {
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lvm;II)V",
		garbageValue = "-914022754"
	)
	@Export("readPlayerUpdate")
	void readPlayerUpdate(PacketBuffer var1, int var2) {
		boolean var3 = var1.readBits(1) == 1;
		if (var3) {
			this.Players_pendingUpdateIndices[++this.Players_pendingUpdateCount - 1] = var2;
		}

		int var4 = var1.readBits(2);
		class73 var5 = this.Players_regions[var2];
		if (var4 == 0) {
			if (var3) {
				this.field1421[var2] = false;
			} else if (var2 == Client.localPlayerIndex) {
				throw new RuntimeException();
			} else {
				var5.method2268();
				if (var1.readBits(1) != 0) {
					this.method3084(var1, var2);
				}

				this.Players_targetIndices[++this.field1418 - 1] = var2;
			}
		} else {
			int var6;
			Coord var12;
			if (var4 == 1) {
				var6 = var1.readBits(3);
				var12 = var5.coord;
				if (var6 == 0) {
					--var12.x;
					--var12.y;
				} else if (var6 == 1) {
					--var12.y;
				} else if (var6 == 2) {
					++var12.x;
					--var12.y;
				} else if (var6 == 3) {
					--var12.x;
				} else if (var6 == 4) {
					++var12.x;
				} else if (var6 == 5) {
					--var12.x;
					++var12.y;
				} else if (var6 == 6) {
					++var12.y;
				} else if (var6 == 7) {
					++var12.x;
					++var12.y;
				}

				this.field1421[var2] = true;
				this.field1429[var2] = var5.pathTraversed;
			} else if (var4 == 2) {
				var6 = var1.readBits(4);
				var12 = var5.coord;
				if (var6 == 0) {
					var12.x -= 2;
					var12.y -= 2;
				} else if (var6 == 1) {
					--var12.x;
					var12.y -= 2;
				} else if (var6 == 2) {
					var12.y -= 2;
				} else if (var6 == 3) {
					++var12.x;
					var12.y -= 2;
				} else if (var6 == 4) {
					var12.x += 2;
					var12.y -= 2;
				} else if (var6 == 5) {
					var12.x -= 2;
					--var12.y;
				} else if (var6 == 6) {
					var12.x += 2;
					--var12.y;
				} else if (var6 == 7) {
					var12.x -= 2;
				} else if (var6 == 8) {
					var12.x += 2;
				} else if (var6 == 9) {
					var12.x -= 2;
					++var12.y;
				} else if (var6 == 10) {
					var12.x += 2;
					++var12.y;
				} else if (var6 == 11) {
					var12.x -= 2;
					var12.y += 2;
				} else if (var6 == 12) {
					--var12.x;
					var12.y += 2;
				} else if (var6 == 13) {
					var12.y += 2;
				} else if (var6 == 14) {
					++var12.x;
					var12.y += 2;
				} else if (var6 == 15) {
					var12.x += 2;
					var12.y += 2;
				}

				this.field1421[var2] = true;
				this.field1429[var2] = var5.pathTraversed;
			} else {
				var6 = var1.readBits(1);
				int var7;
				int var8;
				int var9;
				int var10;
				Coord var11;
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

					var11 = var5.coord;
					var11.plane = (byte)(var8 + var11.plane & 3);
					var11.x += var9;
					var11.y += var10;
					this.field1421[var2] = true;
					this.field1429[var2] = var5.pathTraversed;
				} else {
					var7 = var1.readBits(30);
					var8 = Coord.method6862(var7);
					var9 = Coord.method6845(var7);
					var10 = Coord.method6882(var7);
					var11 = var5.coord;
					var11.plane = (byte)(var8 + var11.plane & 3);
					var11.x = var9 + var11.x & 16383;
					var11.y = var10 + var11.y & 16383;
					this.field1421[var2] = true;
					this.field1429[var2] = var5.pathTraversed;
				}
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvm;IB)Z",
		garbageValue = "-113"
	)
	boolean method3084(PacketBuffer var1, int var2) {
		class73 var3 = this.Players_regions[var2];
		int var4 = var1.readBits(2);
		int var5;
		int var6;
		if (var4 == 0) {
			if (var1.readBits(1) != 0) {
				this.method3084(var1, var2);
			}

			var5 = var1.readBits(13);
			var6 = var1.readBits(13);
			boolean var13 = var1.readBits(1) == 1;
			if (var13) {
				this.Players_pendingUpdateIndices[++this.Players_pendingUpdateCount - 1] = var2;
			}

			if (var3.method2246()) {
				throw new RuntimeException();
			} else {
				var3.method2313(var5, var6);
				this.field1421[var2] = false;
				return true;
			}
		} else {
			int var7;
			if (var4 == 1) {
				var5 = var1.readBits(2);
				var6 = var3.field872;
				var7 = Coord.method6862(var6) + var5 & 3;
				var3.method2250(var7);
				var3.field872 = (var6 & 268435455) + (var7 << 28);
				return false;
			} else {
				int var8;
				int var9;
				int var10;
				int var11;
				if (var4 == 2) {
					var5 = var1.readBits(5);
					var6 = var5 >> 3;
					var7 = var5 & 7;
					var8 = var3.field872;
					var9 = Coord.method6862(var8) + var6 & 3;
					var10 = var8 >> 14 & 255;
					var11 = var8 & 255;
					if (var7 == 0) {
						--var10;
						--var11;
					}

					if (var7 == 1) {
						--var11;
					}

					if (var7 == 2) {
						++var10;
						--var11;
					}

					if (var7 == 3) {
						--var10;
					}

					if (var7 == 4) {
						++var10;
					}

					if (var7 == 5) {
						--var10;
						++var11;
					}

					if (var7 == 6) {
						++var11;
					}

					if (var7 == 7) {
						++var10;
						++var11;
					}

					var3.method2250(var9);
					var3.field872 = Coord.method6849(var9, var10, var11);
					return false;
				} else {
					var5 = var1.readBits(18);
					var6 = var5 >> 16;
					var7 = var5 >> 8 & 255;
					var8 = var5 & 255;
					var9 = var3.field872;
					var10 = Coord.method6862(var9) + var6 & 3;
					var3.method2250(var10);
					var11 = Coord.method6845(var9) + var7 & 255;
					int var12 = Coord.method6882(var9) + var8 & 255;
					var3.field872 = Coord.method6849(var3.method2249(), var11, var12);
					return false;
				}
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "840503184"
	)
	void method3091() {
		for (int var1 = 0; var1 < this.field1418; ++var1) {
			int var2 = this.Players_targetIndices[var1];
			class73 var3 = this.Players_regions[var2];
			Iterator var4 = Client.worldViewManager.iterator();

			while (var4.hasNext()) {
				WorldView var5 = (WorldView)var4.next();
				Player var6 = var5.players[var2];
				if (var6 != null) {
					var3.method2244(var6);
					var5.players[var2] = null;
				}
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "255"
	)
	void method3100() {
		class229.field2458 = -1;

		label69:
		for (int var1 = 0; var1 < this.playerCount; ++var1) {
			int var2 = this.playerIndices[var1];
			class73 var3 = this.Players_regions[var2];
			Coord var4 = var3.coord;
			Iterator var5 = Client.worldViewManager.iterator();

			while (true) {
				while (true) {
					if (!var5.hasNext()) {
						continue label69;
					}

					WorldView var6 = (WorldView)var5.next();
					Player var7 = var6.players[var2];
					boolean var8 = var4.x > var6.baseX && var4.y > var6.baseY && var4.x < var6.sizeX + var6.baseX && var4.y < var6.baseY + var6.sizeY;
					if (var2 == Client.localPlayerIndex && var8 && var6.id != -1) {
						class229.field2458 = var6.id;
					}

					if (var8 && var7 == null) {
						var7 = var3.method2245(var2, var6);
						var3.method2243(var7);
						var6.players[var2] = var7;
					} else if (!var8 && var7 != null && var7 != SpriteMask.localPlayer) {
						var3.method2244(var7);
						var6.players[var2] = null;
					}
				}
			}
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lvm;B)V",
		garbageValue = "98"
	)
	@Export("updatePlayers")
	void updatePlayers(PacketBuffer var1) {
		for (int var2 = 0; var2 < this.Players_pendingUpdateCount; ++var2) {
			int var3 = this.Players_pendingUpdateIndices[var2];
			int var4 = var1.readUnsignedByte();
			if ((var4 & 2) != 0) {
				var4 += var1.readUnsignedByte() << 8;
			}

			if ((var4 & 16384) != 0) {
				var4 += var1.readUnsignedByte() << 16;
			}

			this.method3089(var1, var3, var4);
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "165986221"
	)
	void method3088() {
		for (int var1 = 0; var1 < this.playerCount; ++var1) {
			int var2 = this.playerIndices[var1];
			if (this.field1421[var2]) {
				class73 var3 = this.Players_regions[var2];
				var3.method2251(this.field1429[var2]);
				this.field1421[var2] = false;
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvm;IIB)V",
		garbageValue = "25"
	)
	void method3089(PacketBuffer var1, int var2, int var3) {
		class73 var4 = this.Players_regions[var2];
		int var5;
		if ((var3 & 4096) != 0) {
			for (var5 = 0; var5 < 3; ++var5) {
				this.field1424[var5] = var1.readStringCp1252NullTerminated();
			}

			var4.method2310(this.field1424);
		}

		int var6;
		int var7;
		int var8;
		int var9;
		if ((var3 & 65536) != 0) {
			var5 = var1.readUnsignedByte();

			for (var6 = 0; var6 < var5; ++var6) {
				var7 = var1.readUnsignedByte();
				var8 = var1.readUnsignedShortAdd();
				var9 = var1.readUnsignedIntLE();
				var4.method2264(var7, var8, var9 >> 16, var9 & 65535);
			}
		}

		int var10;
		int var11;
		byte var20;
		byte var22;
		byte var23;
		if ((var3 & 256) != 0) {
			var20 = var1.readByteSub();
			byte var21 = var1.readByte();
			var22 = var1.readByteNeg();
			var23 = var1.readByte();
			var9 = var1.readUnsignedShort() + Client.cycle;
			var10 = var1.readUnsignedShortAdd() + Client.cycle;
			var11 = var1.readUnsignedShortLE();
			var4.method2262(var20, var21, var22, var23, var9, var10, var11, this.field1421[var2]);
		}

		if ((var3 & 1024) != 0) {
			var5 = Client.cycle + var1.readUnsignedShortAddLE();
			var6 = Client.cycle + var1.readUnsignedShortAdd();
			var22 = var1.readByte();
			var23 = var1.readByteAdd();
			byte var24 = var1.readByteSub();
			byte var26 = (byte)var1.readUnsignedByteSub();
			var4.method2315(var5, var6, var22, var23, var24, var26);
		}

		MoveSpeed[] var14;
		if ((var3 & 8192) != 0) {
			var20 = var1.readByteNeg();
			if (var20 == 127) {
				this.field1429[var2] = MoveSpeed.field3052;
			} else {
				var14 = this.field1429;
				MoveSpeed[] var15 = new MoveSpeed[]{MoveSpeed.field3057, MoveSpeed.field3046, MoveSpeed.field3051, MoveSpeed.field3049, MoveSpeed.field3052, MoveSpeed.field3053, MoveSpeed.field3047, MoveSpeed.field3048, MoveSpeed.field3050};
				var14[var2] = (MoveSpeed)class177.findEnumerated(var15, var20);
			}
		}

		if ((var3 & 16) != 0) {
			String var16 = var1.readStringCp1252NullTerminated();
			var4.method2289(var16);
		}

		if ((var3 & 8) != 0) {
			var1.readUnsignedShortAdd();
			var1.readUnsignedByteAdd();
			var1.readUnsignedByte();
			var5 = var1.readUnsignedByte();
			this.field1420.offset = 0;
			var1.method10149(this.field1420.array, 0, var5);
			this.field1420.offset = 0;
		}

		if ((var3 & 2048) != 0) {
			var5 = var1.readUnsignedShortLE();
			var6 = var5 >> 8;
			var7 = var6 >= 13 && var6 <= 20 ? var6 - 12 : 0;
			PlayerType var28 = (PlayerType)class177.findEnumerated(WorldMapEvent.PlayerType_values(), var1.readUnsignedByte());
			boolean var25 = var1.readUnsignedByteAdd() == 1;
			var10 = var1.readUnsignedByteSub();
			this.field1420.offset = 0;
			var1.method10150(this.field1420.array, 0, var10);
			this.field1420.offset = 0;
			String var17 = AbstractFont.escapeBrackets(FileSystem.method4540(class416.method8056(this.field1420)));
			byte[] var12 = null;
			if (var7 > 0 && var7 <= 8) {
				var12 = new byte[var7];

				for (int var13 = 0; var13 < var7; ++var13) {
					var12[var13] = var1.readByteSub();
				}
			}

			var4.method2260(var5, var28, var25, var17, var12);
		}

		if ((var3 & 32768) != 0) {
			var14 = new MoveSpeed[]{MoveSpeed.field3057, MoveSpeed.field3046, MoveSpeed.field3051, MoveSpeed.field3049, MoveSpeed.field3052, MoveSpeed.field3053, MoveSpeed.field3047, MoveSpeed.field3048, MoveSpeed.field3050};
			var4.pathTraversed = (MoveSpeed)class177.findEnumerated(var14, var1.readByteNeg());
			this.field1429[var2] = var4.pathTraversed;
		}

		if ((var3 & 32) != 0) {
			var5 = var1.readUnsignedShortAdd();
			var4.method2307(var5);
		}

		if ((var3 & 64) != 0) {
			var5 = var1.readUnsignedShort();
			if (var5 == 65535) {
				var5 = -1;
			}

			var6 = var1.readUnsignedByteAdd();
			var4.method2294(var5, var6);
		}

		if ((var3 & 1) != 0) {
			var6 = var1.readUnsignedShortLE();
			var6 += var1.readUnsignedByteSub() << 16;
			var5 = 16777215;
			if (var5 == var6) {
				var6 = -1;
			}

			var4.method2254(var6);
		}

		if ((var3 & 128) != 0) {
			var5 = var1.readUnsignedByte();
			byte[] var27 = new byte[var5];
			Buffer var18 = new Buffer(var27);
			var1.method10072(var27, 0, var5);
			var4.method2259(var18);
		}

		if ((var3 & 4) != 0) {
			var5 = var1.readUnsignedByte();
			if (var5 > 0) {
				for (var6 = 0; var6 < var5; ++var6) {
					var8 = -1;
					var9 = -1;
					var10 = -1;
					var7 = var1.readUShortSmart();
					if (var7 == 32767) {
						var7 = var1.readUShortSmart();
						var9 = var1.readUShortSmart();
						var8 = var1.readUShortSmart();
						var10 = var1.readUShortSmart();
					} else if (var7 != 32766) {
						var9 = var1.readUShortSmart();
					} else {
						var7 = -1;
					}

					var11 = var1.readUShortSmart();
					var4.method2323(var7, var9, var8, var10, var11);
				}
			}

			var6 = var1.readUnsignedByteNeg();
			if (var6 > 0) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var1.readUShortSmart();
					var9 = var1.readUShortSmart();
					if (var9 != 32767) {
						var10 = var1.readUShortSmart();
						var11 = var1.readUnsignedByteSub();
						int var19 = var9 > 0 ? var1.readUnsignedByteAdd() : var11;
						var4.method2257(var8, var9, var10, var11, var19);
					} else {
						var4.method2258(var8);
					}
				}
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1711003386"
	)
	void method3090() {
		this.playerCount = 0;

		for (int var1 = 0; var1 < 2048; ++var1) {
			this.Players_regions[var1].method2241();
		}

	}
}
