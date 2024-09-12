import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
@Implements("PlayerUpdateManager")
public class PlayerUpdateManager {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Lcp;"
	)
	@Export("Players_regions")
	final class73[] Players_regions;
	@ObfuscatedName("am")
	final boolean[] field1432;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Lkk;"
	)
	final MoveSpeed[] field1439;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	final Buffer field1430;
	@ObfuscatedName("af")
	final String[] field1428;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -396152079
	)
	@Export("playerCount")
	int playerCount;
	@ObfuscatedName("au")
	@Export("playerIndices")
	final int[] playerIndices;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1589110569
	)
	@Export("Players_emptyIdxCount")
	int Players_emptyIdxCount;
	@ObfuscatedName("al")
	@Export("Players_emptyIndices")
	final int[] Players_emptyIndices;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -14593931
	)
	int field1438;
	@ObfuscatedName("ah")
	@Export("Players_targetIndices")
	final int[] Players_targetIndices;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -370359835
	)
	@Export("Players_pendingUpdateCount")
	int Players_pendingUpdateCount;
	@ObfuscatedName("ab")
	@Export("Players_pendingUpdateIndices")
	final int[] Players_pendingUpdateIndices;

	PlayerUpdateManager() {
		this.Players_regions = new class73[2048];
		this.field1432 = new boolean[2048];
		this.field1439 = new MoveSpeed[2048];
		this.field1430 = new Buffer(new byte[5000]);
		this.field1428 = new String[3];
		this.playerCount = 0;
		this.playerIndices = new int[2048];
		this.Players_emptyIdxCount = 0;
		this.Players_emptyIndices = new int[2048];
		this.field1438 = 0;
		this.Players_targetIndices = new int[2048];
		this.Players_pendingUpdateCount = 0;
		this.Players_pendingUpdateIndices = new int[2048];

		for (int var1 = 0; var1 < 2048; ++var1) {
			this.Players_regions[var1] = new class73(var1);
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lva;B)V",
		garbageValue = "47"
	)
	@Export("updatePlayer")
	final void updatePlayer(PacketBuffer var1) {
		this.method3008();
		var1.importIndex();
		int var2 = Client.localPlayerIndex;
		class73 var3 = this.Players_regions[var2];
		int var4 = var1.readBits(30);
		var3.method2276(-1);
		var3.coord.method6783(var4);
		var3.field895 = 0;
		Player var5 = var3.method2202(var2, ClientPreferences.topLevelWorldView);
		var3.method2200(var5);
		ClientPreferences.topLevelWorldView.players[var2] = var5;
		AddRequestTask.localPlayer = var5;
		this.playerCount = 0;
		this.playerIndices[++this.playerCount - 1] = var2;
		this.Players_emptyIdxCount = 0;

		for (int var6 = 1; var6 < 2048; ++var6) {
			if (var2 != var6) {
				int var7 = var1.readBits(18);
				int var8 = var7 >> 16;
				int var9 = var7 >> 8 & 255;
				int var10 = var7 & 255;
				this.Players_regions[var6].method2276(Coord.method6781(var8, var9, var10));
				this.Players_emptyIndices[++this.Players_emptyIdxCount - 1] = var6;
			}
		}

		var1.exportIndex();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lva;II)V",
		garbageValue = "-2120805593"
	)
	final void method3014(PacketBuffer var1, int var2) {
		int var3 = var1.offset;
		this.Players_pendingUpdateCount = 0;
		this.method2999(var1);
		this.method3003();
		this.method2996();
		this.updatePlayers(var1);
		this.method3006();
		if (var2 != var1.offset - var3) {
			throw new RuntimeException(var1.offset - var3 + " " + var2);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lva;I)V",
		garbageValue = "164394153"
	)
	void method2999(PacketBuffer var1) {
		this.field1438 = 0;
		int var2 = 0;
		var1.importIndex();

		class73 var10000;
		int var3;
		int var4;
		int var5;
		for (var3 = 0; var3 < this.playerCount; ++var3) {
			var4 = this.playerIndices[var3];
			if ((this.Players_regions[var4].field895 & 1) == 0) {
				if (var2 > 0) {
					--var2;
					var10000 = this.Players_regions[var4];
					var10000.field895 = (byte)(var10000.field895 | 2);
				} else {
					var5 = var1.readBits(1);
					if (var5 == 0) {
						var2 = this.method3000(var1);
						var10000 = this.Players_regions[var4];
						var10000.field895 = (byte)(var10000.field895 | 2);
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
				if ((this.Players_regions[var4].field895 & 1) != 0) {
					if (var2 > 0) {
						--var2;
						var10000 = this.Players_regions[var4];
						var10000.field895 = (byte)(var10000.field895 | 2);
					} else {
						var5 = var1.readBits(1);
						if (var5 == 0) {
							var2 = this.method3000(var1);
							var10000 = this.Players_regions[var4];
							var10000.field895 = (byte)(var10000.field895 | 2);
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
					if ((this.Players_regions[var4].field895 & 1) != 0) {
						if (var2 > 0) {
							--var2;
							var10000 = this.Players_regions[var4];
							var10000.field895 = (byte)(var10000.field895 | 2);
						} else {
							var5 = var1.readBits(1);
							if (var5 == 0) {
								var2 = this.method3000(var1);
								var10000 = this.Players_regions[var4];
								var10000.field895 = (byte)(var10000.field895 | 2);
							} else if (this.method2998(var1, var4)) {
								var10000 = this.Players_regions[var4];
								var10000.field895 = (byte)(var10000.field895 | 2);
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
						if ((this.Players_regions[var4].field895 & 1) == 0) {
							if (var2 > 0) {
								--var2;
								var10000 = this.Players_regions[var4];
								var10000.field895 = (byte)(var10000.field895 | 2);
							} else {
								var5 = var1.readBits(1);
								if (var5 == 0) {
									var2 = this.method3000(var1);
									var10000 = this.Players_regions[var4];
									var10000.field895 = (byte)(var10000.field895 | 2);
								} else if (this.method2998(var1, var4)) {
									var10000 = this.Players_regions[var4];
									var10000.field895 = (byte)(var10000.field895 | 2);
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
							var10000.field895 = (byte)(var10000.field895 >> 1);
							if (this.Players_regions[var3].method2203()) {
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lva;B)I",
		garbageValue = "-77"
	)
	int method3000(PacketBuffer var1) {
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
		descriptor = "(Lva;II)V",
		garbageValue = "-1040233307"
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
				this.field1432[var2] = false;
			} else if (var2 == Client.localPlayerIndex) {
				throw new RuntimeException();
			} else {
				var5.method2204();
				if (var1.readBits(1) != 0) {
					this.method2998(var1, var2);
				}

				this.Players_targetIndices[++this.field1438 - 1] = var2;
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

				this.field1432[var2] = true;
				this.field1439[var2] = var5.pathTraversed;
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

				this.field1432[var2] = true;
				this.field1439[var2] = var5.pathTraversed;
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
					this.field1432[var2] = true;
					this.field1439[var2] = var5.pathTraversed;
				} else {
					var7 = var1.readBits(30);
					var8 = Coord.method6786(var7);
					var9 = Coord.method6817(var7);
					var10 = Coord.method6788(var7);
					var11 = var5.coord;
					var11.plane = (byte)(var8 + var11.plane & 3);
					var11.x = var9 + var11.x & 16383;
					var11.y = var10 + var11.y & 16383;
					this.field1432[var2] = true;
					this.field1439[var2] = var5.pathTraversed;
				}
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lva;II)Z",
		garbageValue = "2005822368"
	)
	boolean method2998(PacketBuffer var1, int var2) {
		class73 var3 = this.Players_regions[var2];
		int var4 = var1.readBits(2);
		int var5;
		int var6;
		if (var4 == 0) {
			if (var1.readBits(1) != 0) {
				this.method2998(var1, var2);
			}

			var5 = var1.readBits(13);
			var6 = var1.readBits(13);
			boolean var13 = var1.readBits(1) == 1;
			if (var13) {
				this.Players_pendingUpdateIndices[++this.Players_pendingUpdateCount - 1] = var2;
			}

			if (var3.method2203()) {
				throw new RuntimeException();
			} else {
				var3.method2205(var5, var6);
				this.field1432[var2] = false;
				return true;
			}
		} else {
			int var7;
			if (var4 == 1) {
				var5 = var1.readBits(2);
				var6 = var3.field898;
				var7 = Coord.method6786(var6) + var5 & 3;
				var3.method2257(var7);
				var3.field898 = (var6 & 268435455) + (var7 << 28);
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
					var8 = var3.field898;
					var9 = Coord.method6786(var8) + var6 & 3;
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

					var3.method2257(var9);
					var3.field898 = Coord.method6781(var9, var10, var11);
					return false;
				} else {
					var5 = var1.readBits(18);
					var6 = var5 >> 16;
					var7 = var5 >> 8 & 255;
					var8 = var5 & 255;
					var9 = var3.field898;
					var10 = Coord.method6786(var9) + var6 & 3;
					var3.method2257(var10);
					var11 = Coord.method6817(var9) + var7 & 255;
					int var12 = Coord.method6788(var9) + var8 & 255;
					var3.field898 = Coord.method6781(var3.method2206(), var11, var12);
					return false;
				}
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "65280"
	)
	void method3003() {
		for (int var1 = 0; var1 < this.field1438; ++var1) {
			int var2 = this.Players_targetIndices[var1];
			class73 var3 = this.Players_regions[var2];
			Iterator var4 = Client.worldViewManager.iterator();

			while (var4.hasNext()) {
				WorldView var5 = (WorldView)var4.next();
				Player var6 = var5.players[var2];
				if (var6 != null) {
					var3.method2201(var6);
					var5.players[var2] = null;
				}
			}
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-921367562"
	)
	void method2996() {
		HealthBarUpdate.field1304 = -1;

		label68:
		for (int var1 = 0; var1 < this.playerCount; ++var1) {
			int var2 = this.playerIndices[var1];
			class73 var3 = this.Players_regions[var2];
			Coord var4 = var3.coord;
			Iterator var5 = Client.worldViewManager.iterator();

			while (true) {
				while (true) {
					if (!var5.hasNext()) {
						continue label68;
					}

					WorldView var6 = (WorldView)var5.next();
					Player var7 = var6.players[var2];
					boolean var8 = var4.x > var6.baseX && var4.y > var6.baseY && var4.x < var6.baseX + var6.sizeX && var4.y < var6.baseY + var6.sizeY;
					if (var2 == Client.localPlayerIndex && var8 && var6.id != -1) {
						HealthBarUpdate.field1304 = var6.id;
					}

					if (var8 && var7 == null) {
						var7 = var3.method2202(var2, var6);
						var3.method2200(var7);
						var6.players[var2] = var7;
					} else if (!var8 && var7 != null && var7 != AddRequestTask.localPlayer) {
						var3.method2201(var7);
						var6.players[var2] = null;
					}
				}
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lva;S)V",
		garbageValue = "-21455"
	)
	@Export("updatePlayers")
	void updatePlayers(PacketBuffer var1) {
		for (int var2 = 0; var2 < this.Players_pendingUpdateCount; ++var2) {
			int var3 = this.Players_pendingUpdateIndices[var2];
			int var4 = var1.readUnsignedByte();
			if ((var4 & 8) != 0) {
				var4 += var1.readUnsignedByte() << 8;
			}

			if ((var4 & 1024) != 0) {
				var4 += var1.readUnsignedByte() << 16;
			}

			this.method3032(var1, var3, var4);
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "12749"
	)
	void method3006() {
		for (int var1 = 0; var1 < this.playerCount; ++var1) {
			int var2 = this.playerIndices[var1];
			if (this.field1432[var2]) {
				class73 var3 = this.Players_regions[var2];
				var3.method2197(this.field1439[var2]);
				this.field1432[var2] = false;
			}
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lva;III)V",
		garbageValue = "-1424485394"
	)
	void method3032(PacketBuffer var1, int var2, int var3) {
		class73 var4 = this.Players_regions[var2];
		MoveSpeed[] var6;
		if ((var3 & 256) != 0) {
			var6 = new MoveSpeed[]{MoveSpeed.field3036, MoveSpeed.field3040, MoveSpeed.field3047, MoveSpeed.field3038, MoveSpeed.field3044, MoveSpeed.field3042, MoveSpeed.field3039, MoveSpeed.field3041, MoveSpeed.field3037};
			var4.pathTraversed = (MoveSpeed)ArchiveDiskAction.findEnumerated(var6, var1.readByteNeg());
			this.field1439[var2] = var4.pathTraversed;
		}

		int var14;
		if ((var3 & 32768) != 0) {
			for (var14 = 0; var14 < 3; ++var14) {
				this.field1428[var14] = var1.readStringCp1252NullTerminated();
			}

			var4.method2219(this.field1428);
		}

		int var7;
		int var9;
		int var15;
		int var17;
		if ((var3 & 65536) != 0) {
			var14 = var1.readUnsignedByteSub();

			for (var15 = 0; var15 < var14; ++var15) {
				var7 = var1.readUnsignedByteNeg();
				var17 = var1.readUnsignedShort();
				var9 = var1.readUnsignedIntIME();
				var4.method2221(var7, var17, var9 >> 16, var9 & 65535);
			}
		}

		byte var26;
		if ((var3 & 2048) != 0) {
			var26 = var1.readByteSub();
			if (var26 == 127) {
				this.field1439[var2] = MoveSpeed.field3038;
			} else {
				var6 = this.field1439;
				MoveSpeed[] var8 = new MoveSpeed[]{MoveSpeed.field3036, MoveSpeed.field3040, MoveSpeed.field3047, MoveSpeed.field3038, MoveSpeed.field3044, MoveSpeed.field3042, MoveSpeed.field3039, MoveSpeed.field3041, MoveSpeed.field3037};
				var6[var2] = (MoveSpeed)ArchiveDiskAction.findEnumerated(var8, var26);
			}
		}

		if ((var3 & 32) != 0) {
			var14 = var1.readUnsignedByteNeg();
			byte[] var20 = new byte[var14];
			Buffer var16 = new Buffer(var20);
			var1.method10133(var20, 0, var14);
			var4.method2209(var16);
		}

		int var10;
		int var18;
		if ((var3 & 128) != 0) {
			var14 = var1.readUnsignedByteNeg();
			if (var14 > 0) {
				for (var15 = 0; var15 < var14; ++var15) {
					var17 = -1;
					var9 = -1;
					var10 = -1;
					var7 = var1.readUShortSmart();
					if (var7 == 32767) {
						var7 = var1.readUShortSmart();
						var9 = var1.readUShortSmart();
						var17 = var1.readUShortSmart();
						var10 = var1.readUShortSmart();
					} else if (var7 != 32766) {
						var9 = var1.readUShortSmart();
					} else {
						var7 = -1;
					}

					var18 = var1.readUShortSmart();
					var4.method2213(var7, var9, var17, var10, var18);
				}
			}

			var15 = var1.readUnsignedByteAdd();
			if (var15 > 0) {
				for (var7 = 0; var7 < var15; ++var7) {
					var17 = var1.readUShortSmart();
					var9 = var1.readUShortSmart();
					if (var9 != 32767) {
						var10 = var1.readUShortSmart();
						var18 = var1.readUnsignedByte();
						int var19 = var9 > 0 ? var1.readUnsignedByteSub() : var18;
						var4.method2207(var17, var9, var10, var18, var19);
					} else {
						var4.method2215(var17);
					}
				}
			}
		}

		if ((var3 & 8192) != 0) {
			var14 = var1.readUnsignedShort();
			var15 = var14 >> 8;
			var7 = var15 >= 13 && var15 <= 20 ? var15 - 12 : 0;
			PlayerType var21 = (PlayerType)ArchiveDiskAction.findEnumerated(class188.PlayerType_values(), var1.readUnsignedByteNeg());
			boolean var23 = var1.readUnsignedByteAdd() == 1;
			var10 = var1.readUnsignedByteSub();
			this.field1430.offset = 0;
			var1.method9987(this.field1430.array, 0, var10);
			this.field1430.offset = 0;
			String var11 = AbstractFont.escapeBrackets(class162.method3641(class501.method9239(this.field1430)));
			byte[] var12 = null;
			if (var7 > 0 && var7 <= 8) {
				var12 = new byte[var7];

				for (int var13 = 0; var13 < var7; ++var13) {
					var12[var13] = var1.readByteNeg();
				}
			}

			var4.method2217(var14, var21, var23, var11, var12);
		}

		byte var22;
		byte var28;
		if ((var3 & 16384) != 0) {
			var26 = var1.readByteAdd();
			byte var27 = var1.readByteSub();
			var22 = var1.readByteSub();
			var28 = var1.readByteNeg();
			var9 = var1.readUnsignedShortLE() + Client.cycle;
			var10 = var1.readUnsignedShortLE() + Client.cycle;
			var18 = var1.readUnsignedShortAddLE();
			var4.method2275(var26, var27, var22, var28, var9, var10, var18, this.field1432[var2]);
		}

		if ((var3 & 64) != 0) {
			var15 = var1.readUnsignedShortAddLE();
			var15 += var1.readUnsignedByteNeg() << 16;
			var14 = 16777215;
			if (var14 == var15) {
				var15 = -1;
			}

			var4.method2253(var15);
		}

		if ((var3 & 16) != 0) {
			var14 = var1.readUnsignedShortLE();
			if (var14 == 65535) {
				var14 = -1;
			}

			var15 = var1.readUnsignedByteNeg();
			var4.method2263(var14, var15);
		}

		if ((var3 & 1) != 0) {
			String var5 = var1.readStringCp1252NullTerminated();
			var4.method2212(var5);
		}

		if ((var3 & 4) != 0) {
			var1.readUnsignedShortAdd();
			var1.readUnsignedByteAdd();
			var1.readUnsignedByte();
			var14 = var1.readUnsignedByte();
			this.field1430.offset = 0;
			var1.method10133(this.field1430.array, 0, var14);
			this.field1430.offset = 0;
		}

		if ((var3 & 2) != 0) {
			var14 = var1.readUnsignedShortAdd();
			var4.method2216(var14);
		}

		if ((var3 & 512) != 0) {
			var14 = Client.cycle + var1.readUnsignedShort();
			var15 = Client.cycle + var1.readUnsignedShort();
			var22 = var1.readByteNeg();
			var28 = var1.readByte();
			byte var24 = var1.readByteNeg();
			byte var25 = (byte)var1.readUnsignedByteSub();
			var4.method2240(var14, var15, var22, var28, var24, var25);
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method3008() {
		this.playerCount = 0;

		for (int var1 = 0; var1 < 2048; ++var1) {
			this.Players_regions[var1].method2198();
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2044580055"
	)
	static void method3035() {
		Tiles.Tiles_minPlane = 99;
		class442.Tiles_underlays = new short[4][104][104];
		AbstractByteArrayCopier.Tiles_overlays = new short[4][104][104];
		UserComparator2.Tiles_shapes = new byte[4][104][104];
		Tiles.field1065 = new byte[4][104][104];
		SoundSystem.field294 = new int[4][105][105];
		TriBool.Tiles_underlays2 = new byte[4][105][105];
		class512.field5171 = new int[105][105];
		class328.Tiles_hue = new int[104];
		HealthBarConfig.Tiles_saturation = new int[104];
		Tiles.Tiles_lightness = new int[104];
		class77.Tiles_hueMultiplier = new int[104];
		Tiles.field1056 = new int[104];
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "581694528"
	)
	static final int method3033(int var0, int var1, int var2) {
		int var3 = var0 / var2;
		int var4 = var0 & var2 - 1;
		int var5 = var1 / var2;
		int var6 = var1 & var2 - 1;
		int var7 = HttpRequestTask.method286(var3, var5);
		int var8 = HttpRequestTask.method286(var3 + 1, var5);
		int var9 = HttpRequestTask.method286(var3, var5 + 1);
		int var10 = HttpRequestTask.method286(var3 + 1, var5 + 1);
		int var11 = WorldMapDecorationType.method7425(var7, var8, var4, var2);
		int var12 = WorldMapDecorationType.method7425(var9, var10, var4, var2);
		return WorldMapDecorationType.method7425(var11, var12, var6, var2);
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-68"
	)
	static int method3015() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) {
			int var0 = 0;

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
				var0 += ((ArchiveLoader)Client.archiveLoaders.get(var1)).loadedCount;
			}

			return var0 * 10000 / Client.field814;
		} else {
			return 10000;
		}
	}

	@ObfuscatedName("mk")
	@ObfuscatedSignature(
		descriptor = "([Lny;IIIIIIIII)V",
		garbageValue = "-656530420"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
		Rasterizer3D.resetRasterClipping();

		for (int var9 = 0; var9 < var0.length; ++var9) {
			Widget var10 = var0[var9];
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) {
				int var11;
				if (var8 == -1) {
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6;
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y;
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width;
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height;
					var11 = ++Client.rootWidgetCount - 1;
				} else {
					var11 = var8;
				}

				var10.rootIndex = var11;
				var10.cycle = Client.cycle;
				if (!var10.isIf3 || !class172.isComponentHidden(var10)) {
					if (var10.contentType > 0) {
						Frames.method5160(var10);
					}

					int var12 = var10.x + var6;
					int var13 = var7 + var10.y;
					int var14 = var10.transparencyTop;
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) {
						if (var1 != -1412584499 && !var10.isScrollBar) {
							class321.field3302 = var0;
							class146.field1680 = var6;
							Strings.field4449 = var7;
							continue;
						}

						if (Client.isDraggingWidget && Client.field697) {
							var15 = MouseHandler.MouseHandler_x;
							var16 = MouseHandler.MouseHandler_y;
							var15 -= Client.widgetClickX;
							var16 -= Client.widgetClickY;
							if (var15 < Client.field576) {
								var15 = Client.field576;
							}

							if (var15 + var10.width > Client.field576 + Client.clickedWidgetParent.width) {
								var15 = Client.field576 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field684) {
								var16 = Client.field684;
							}

							if (var16 + var10.height > Client.field684 + Client.clickedWidgetParent.height) {
								var16 = Client.field684 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15;
							var13 = var16;
						}

						if (!var10.isScrollBar) {
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 9) {
						var19 = var12;
						var20 = var13;
						var21 = var12 + var10.width;
						var22 = var13 + var10.height;
						if (var21 < var12) {
							var19 = var21;
							var21 = var12;
						}

						if (var22 < var13) {
							var20 = var22;
							var22 = var13;
						}

						++var21;
						++var22;
						var15 = var19 > var2 ? var19 : var2;
						var16 = var20 > var3 ? var20 : var3;
						var17 = var21 < var4 ? var21 : var4;
						var18 = var22 < var5 ? var22 : var5;
					} else {
						var19 = var12 + var10.width;
						var20 = var13 + var10.height;
						var15 = var12 > var2 ? var12 : var2;
						var16 = var13 > var3 ? var13 : var3;
						var17 = var19 < var4 ? var19 : var4;
						var18 = var20 < var5 ? var20 : var5;
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) {
						if (var10.contentType != 0) {
							if (var10.contentType == 1336) {
								if (class461.clientPreferences.isDisplayingFps()) {
									var13 += 15;
									UserComparator9.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1);
									var13 += 15;
									Runtime var41 = Runtime.getRuntime();
									var20 = (int)((var41.totalMemory() - var41.freeMemory()) / 1024L);
									var21 = 16776960;
									if (var20 > 327680 && !Client.isLowDetail) {
										var21 = 16711680;
									}

									UserComparator9.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1);
									var13 += 15;
								}
								continue;
							}

							if (var10.contentType == 1337) {
								Client.viewportX = var12;
								Client.viewportY = var13;
								GrandExchangeEvent.drawEntities(var12, var13, var10.width, var10.height);
								Client.validRootWidgets[var10.rootIndex] = true;
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}

							if (var10.contentType == 1338) {
								ArchiveLoader.drawMinimap(var10, var12, var13, var11);
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}

							if (var10.contentType == 1339) {
								FriendSystem.method2046(var10, var12, var13, var11);
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}

							if (var10.contentType == 1400) {
								UserComparator8.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle, class461.clientPreferences.getBrightness());
							}

							if (var10.contentType == 1401) {
								UserComparator8.worldMap.drawOverview(var12, var13, var10.width, var10.height);
							}

							if (var10.contentType == 1402) {
								class268.loginScreenRunesAnimation.draw(var12, Client.cycle);
							}
						}

						if (var10.type == 0) {
							if (!var10.isIf3 && class172.isComponentHidden(var10) && var10 != class275.mousedOverWidgetIf1) {
								continue;
							}

							if (!var10.isIf3) {
								if (var10.scrollY > var10.scrollHeight - var10.height) {
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) {
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							if (var10.children != null) {
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var28 = (InterfaceParent)Client.interfaceParents.get((long)var10.id);
							if (var28 != null) {
								InterfaceParent.drawWidgets(var28.group, var15, var16, var17, var18, var12, var13, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
							Rasterizer3D.resetRasterClipping();
						} else if (var10.type == 11) {
							if (class172.isComponentHidden(var10) && var10 != class275.mousedOverWidgetIf1) {
								continue;
							}

							if (var10.children != null) {
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
							Rasterizer3D.resetRasterClipping();
						}

						if (Client.isResizable || Client.field732[var11] || Client.gameDrawingMode > 1) {
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) {
								class537.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) {
								if (var10.type == 3) {
									if (PacketWriter.runCs1(var10)) {
										var19 = var10.color2;
										if (var10 == class275.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) {
											var19 = var10.mouseOverColor2;
										}
									} else {
										var19 = var10.color;
										if (var10 == class275.mousedOverWidgetIf1 && var10.mouseOverColor != 0) {
											var19 = var10.mouseOverColor;
										}
									}

									if (var10.fill) {
										switch(var10.fillMode.field5497) {
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2);
											break;
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255));
											break;
										default:
											if (var14 == 0) {
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255));
											}
										}
									} else if (var14 == 0) {
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255));
									}
								} else if (var10.type == 4) {
									Font var40 = var10.getFont(TaskHandler.widgetDefinition);
									if (var40 == null) {
										if (Widget.field3987) {
											SecureRandomCallable.invalidateWidget(var10);
										}
									} else {
										String var42 = var10.text;
										if (PacketWriter.runCs1(var10)) {
											var20 = var10.color2;
											if (var10 == class275.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) {
												var20 = var10.mouseOverColor2;
											}

											if (var10.text2.length() > 0) {
												var42 = var10.text2;
											}
										} else {
											var20 = var10.color;
											if (var10 == class275.mousedOverWidgetIf1 && var10.mouseOverColor != 0) {
												var20 = var10.mouseOverColor;
											}
										}

										if (var10.isIf3 && var10.itemId != -1) {
											ItemComposition var43 = MouseRecorder.ItemDefinition_get(var10.itemId);
											var42 = var43.name;
											if (var42 == null) {
												var42 = "null";
											}

											if ((var43.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) {
												var42 = HttpMethod.colorStartTag(16748608) + var42 + "</col>" + " " + 'x' + class28.formatItemStacks(var10.itemQuantity);
											}
										}

										if (var10 == Client.meslayerContinueWidget) {
											var42 = "Please wait...";
											var20 = var10.color;
										}

										if (!var10.isIf3) {
											var42 = class358.method6876(var42, var10);
										}

										var40.drawWidgetText(var42, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, class501.method9229(var10.transparencyTop), var10.textXAlignment, var10.textYAlignment, var10.textLineHeight);
									}
								} else {
									int var23;
									int var24;
									int var25;
									if (var10.type == 5) {
										SpritePixels var38;
										if (!var10.isIf3) {
											var38 = var10.getSprite(TaskHandler.widgetDefinition, PacketWriter.runCs1(var10), AsyncHttpResponse.urlRequester);
											if (var38 != null) {
												var38.drawTransBgAt(var12, var13);
											} else if (Widget.field3987) {
												SecureRandomCallable.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) {
												var38 = class4.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var38 = var10.getSprite(TaskHandler.widgetDefinition, false, AsyncHttpResponse.urlRequester);
											}

											if (var38 == null) {
												if (Widget.field3987) {
													SecureRandomCallable.invalidateWidget(var10);
												}
											} else {
												var20 = var38.width;
												var21 = var38.height;
												if (!var10.spriteTiling) {
													var22 = var10.width * 4096 / var20;
													if (var10.spriteAngle != 0) {
														var38.method10419(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) {
														var38.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) {
														var38.drawTransBgAt(var12, var13);
													} else {
														var38.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height);
													var22 = (var20 - 1 + var10.width) / var20;
													var23 = (var21 - 1 + var10.height) / var21;

													for (var24 = 0; var24 < var22; ++var24) {
														for (var25 = 0; var25 < var23; ++var25) {
															if (var10.spriteAngle != 0) {
																var38.method10419(var20 / 2 + var12 + var24 * var20, var21 / 2 + var13 + var21 * var25, var10.spriteAngle, 4096);
															} else if (var14 != 0) {
																var38.drawTransAt(var12 + var24 * var20, var13 + var25 * var21, 256 - (var14 & 255));
															} else {
																var38.drawTransBgAt(var12 + var24 * var20, var13 + var21 * var25);
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
												}
											}
										}
									} else {
										int var26;
										if (var10.type == 6) {
											boolean var36 = PacketWriter.runCs1(var10);
											if (var36) {
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId;
											}

											Model var39 = null;
											var22 = 0;
											if (var10.itemId != -1) {
												ItemComposition var44 = MouseRecorder.ItemDefinition_get(var10.itemId);
												if (var44 != null) {
													var44 = var44.getCountObj(var10.itemQuantity);
													var39 = var44.getModel(1);
													if (var39 != null) {
														var39.calculateBoundsCylinder();
														var22 = var39.height / 2;
													} else {
														SecureRandomCallable.invalidateWidget(var10);
													}
												}
											} else if (var10.modelType == 5) {
												if (var10.modelId == 0) {
													var39 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var39 = AddRequestTask.localPlayer.getModel();
												}
											} else if (var10.modelType == 7) {
												var39 = var10.field3910.getModel((SequenceDefinition)null, -1, HealthBarUpdate.SequenceDefinition_get(AddRequestTask.localPlayer.idleSequence), AddRequestTask.localPlayer.movementFrame);
											} else {
												NPCComposition var45 = null;
												NpcOverrides var33 = null;
												if (var10.modelType == 6) {
													var25 = var10.modelId;
													if (var25 >= 0 && var25 < ClientPreferences.topLevelWorldView.npcs.length) {
														NPC var34 = ClientPreferences.topLevelWorldView.npcs[var25];
														if (var34 != null && var34.definition != null) {
															var45 = var34.definition;
															if (var45.transforms != null) {
																var45 = var45.transform();
															}

															var33 = var34.method2943();
														}
													}
												} else if (var10.modelType == 2) {
													var25 = var10.modelId;
													var45 = class168.getNpcDefinition(var25);
													if (var45.transforms != null) {
														var45 = var45.transform();
													}
												}

												SequenceDefinition var35 = null;
												var26 = -1;
												if (var20 != -1) {
													var35 = HealthBarUpdate.SequenceDefinition_get(var20);
													var26 = var10.modelFrame;
												}

												var39 = var10.getModel(TaskHandler.widgetDefinition, var35, var26, var36, AddRequestTask.localPlayer.appearance, var45, var33);
												if (var39 == null && Widget.field3987) {
													SecureRandomCallable.invalidateWidget(var10);
												}
											}

											Rasterizer3D.setCustomClipBounds(var10.width / 2 + var12, var10.height / 2 + var13);
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16;
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16;
											if (var39 != null) {
												if (!var10.isIf3) {
													var39.drawFrustum(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var39.calculateBoundsCylinder();
													if (var10.modelOrthog) {
														var39.drawOrtho(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var39.drawFrustum(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY);
													}
												}
											}

											Rasterizer3D.setClipBounds();
										} else {
											Font var29;
											if (var10.type == 8 && var10 == class7.field22 && Client.field672 == Client.field766) {
												var19 = 0;
												var20 = 0;
												var29 = UserComparator9.fontPlain12;
												String var30 = var10.text;

												String var31;
												for (var30 = class358.method6876(var30, var10); var30.length() > 0; var20 = var20 + var29.ascent + 1) {
													var24 = var30.indexOf("<br>");
													if (var24 != -1) {
														var31 = var30.substring(0, var24);
														var30 = var30.substring(var24 + 4);
													} else {
														var31 = var30;
														var30 = "";
													}

													var25 = var29.stringWidth(var31);
													if (var25 > var19) {
														var19 = var25;
													}
												}

												var19 += 6;
												var20 += 7;
												var24 = var12 + var10.width - 5 - var19;
												var25 = var13 + var10.height + 5;
												if (var24 < var12 + 5) {
													var24 = var12 + 5;
												}

												if (var24 + var19 > var4) {
													var24 = var4 - var19;
												}

												if (var25 + var20 > var5) {
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120);
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0);
												var30 = var10.text;
												var26 = var25 + var29.ascent + 2;

												for (var30 = class358.method6876(var30, var10); var30.length() > 0; var26 = var26 + var29.ascent + 1) {
													int var27 = var30.indexOf("<br>");
													if (var27 != -1) {
														var31 = var30.substring(0, var27);
														var30 = var30.substring(var27 + 4);
													} else {
														var31 = var30;
														var30 = "";
													}

													var29.draw(var31, var24 + 3, var26, 0, -1);
												}
											}

											if (var10.type == 9) {
												if (var10.field3886) {
													var19 = var12;
													var20 = var13 + var10.height;
													var21 = var12 + var10.width;
													var22 = var13;
												} else {
													var19 = var12;
													var20 = var13;
													var21 = var12 + var10.width;
													var22 = var13 + var10.height;
												}

												if (var10.lineWid == 1) {
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color);
												} else {
													class363.method7378(var19, var20, var21, var22, var10.color, var10.lineWid);
												}
											} else if (var10.type == 12) {
												class360 var37 = var10.method7268();
												class354 var32 = var10.method7303();
												if (var37 != null && var32 != null && var37.method7009()) {
													var29 = var10.getFont(TaskHandler.widgetDefinition);
													if (var29 != null) {
														Client.field722.method10525(var12, var13, var10.width, var10.height, var37.method7010(), var37.method6956(), var37.method7007(), var37.method7087(), var37.method7006());
														var22 = var10.textShadowed ? var10.spriteShadow : -1;
														if (!var37.method7004() && var37.method7048().method8281()) {
															Client.field722.method10526(var32.field3772, var22, var32.field3774, var32.field3771);
															Client.field722.method10527(var37.method7002(), var29);
														} else {
															Client.field722.method10526(var10.color, var22, var32.field3774, var32.field3771);
															Client.field722.method10527(var37.method7048(), var29);
														}

														Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}

	}
}
