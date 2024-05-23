import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("ed")
public class class110 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	class101 field1411;
	@ObfuscatedName("az")
	byte[] field1412;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[Ljv;"
	)
	class237[] field1413;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[Lua;"
	)
	Buffer[] field1414;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 205673623
	)
	int field1415;
	@ObfuscatedName("ab")
	int[] field1416;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 972284945
	)
	int field1426;
	@ObfuscatedName("ao")
	int[] field1418;
	@ObfuscatedName("ah")
	int[] field1419;
	@ObfuscatedName("av")
	int[] field1420;
	@ObfuscatedName("aq")
	int[] field1409;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 730056931
	)
	int field1423;
	@ObfuscatedName("ae")
	int[] field1422;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lua;"
	)
	Buffer field1424;

	@ObfuscatedSignature(
		descriptor = "(Ldt;)V"
	)
	class110(class101 var1) {
		this.field1412 = new byte[2048];
		this.field1413 = new class237[2048];
		this.field1414 = new Buffer[2048];
		this.field1415 = 0;
		this.field1416 = new int[2048];
		this.field1426 = 0;
		this.field1418 = new int[2048];
		this.field1419 = new int[2048];
		this.field1420 = new int[2048];
		this.field1409 = new int[2048];
		this.field1423 = 0;
		this.field1422 = new int[2048];
		this.field1424 = new Buffer(new byte[5000]);
		this.field1411 = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Luk;ZI)V",
		garbageValue = "162993127"
	)
	final void method2776(PacketBuffer var1, boolean var2) {
		var1.importIndex();
		Player var3 = new Player();
		int var4 = Client.localPlayerIndex;
		if (var2) {
			class17.localPlayer = var3;
			class358.scene.field1341[var4] = var3;
		} else {
			this.field1411.field1341[var4] = var3;
			class17.localPlayer.field1134 = this.field1411;
		}

		var3.field1157 = var4;
		int var5 = var1.readBits(30);
		byte var6 = (byte)(var5 >> 28);
		int var7 = var5 >> 14 & 16383;
		int var8 = var5 & 16383;
		var3.field1229[0] = var7 - this.field1411.field1337;
		var3.x = (var3.field1229[0] << 7) + (var3.transformedSize() << 6);
		var3.field1276[0] = var8 - this.field1411.field1333;
		var3.y = (var3.field1276[0] << 7) + (var3.transformedSize() << 6);
		if (var2) {
			this.field1411.field1348 = var3.plane = var6;
		}

		if (this.field1414[var4] != null) {
			var3.read(this.field1414[var4]);
		}

		this.field1415 = 0;
		this.field1416[++this.field1415 - 1] = var4;
		this.field1412[var4] = 0;
		this.field1426 = 0;

		for (int var9 = 1; var9 < 2048; ++var9) {
			if (var4 != var9) {
				int var10 = var1.readBits(18);
				int var11 = var10 >> 16;
				int var12 = var10 >> 8 & 597;
				int var13 = var10 & 597;
				this.field1419[var9] = (var12 << 14) + var13 + (var11 << 28);
				this.field1420[var9] = 0;
				this.field1409[var9] = -1;
				this.field1418[++this.field1426 - 1] = var9;
				this.field1412[var9] = 0;
			}
		}

		var1.exportIndex();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Luk;II)V",
		garbageValue = "766973044"
	)
	final void method2777(PacketBuffer var1, int var2) {
		int var3 = var1.offset;
		this.field1423 = 0;
		this.method2778(var1);
		this.method2799(var1);
		if (var2 != var1.offset - var3) {
			throw new RuntimeException(var1.offset - var3 + " " + var2);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "1195870550"
	)
	final void method2778(PacketBuffer var1) {
		int var2 = 0;
		var1.importIndex();

		byte[] var10000;
		int var3;
		int var5;
		int var6;
		for (var3 = 0; var3 < this.field1415; ++var3) {
			var6 = this.field1416[var3];
			if ((this.field1412[var6] & 1) == 0) {
				if (var2 > 0) {
					--var2;
					var10000 = this.field1412;
					var10000[var6] = (byte)(var10000[var6] | 2);
				} else {
					var5 = var1.readBits(1);
					if (var5 == 0) {
						var2 = this.method2779(var1);
						var10000 = this.field1412;
						var10000[var6] = (byte)(var10000[var6] | 2);
					} else {
						this.method2780(var1, var6);
					}
				}
			}
		}

		var1.exportIndex();
		if (var2 != 0) {
			throw new RuntimeException();
		} else {
			var1.importIndex();

			for (var3 = 0; var3 < this.field1415; ++var3) {
				var6 = this.field1416[var3];
				if ((this.field1412[var6] & 1) != 0) {
					if (var2 > 0) {
						--var2;
						var10000 = this.field1412;
						var10000[var6] = (byte)(var10000[var6] | 2);
					} else {
						var5 = var1.readBits(1);
						if (var5 == 0) {
							var2 = this.method2779(var1);
							var10000 = this.field1412;
							var10000[var6] = (byte)(var10000[var6] | 2);
						} else {
							this.method2780(var1, var6);
						}
					}
				}
			}

			var1.exportIndex();
			if (var2 != 0) {
				throw new RuntimeException();
			} else {
				var1.importIndex();

				for (var3 = 0; var3 < this.field1426; ++var3) {
					var6 = this.field1418[var3];
					if ((this.field1412[var6] & 1) != 0) {
						if (var2 > 0) {
							--var2;
							var10000 = this.field1412;
							var10000[var6] = (byte)(var10000[var6] | 2);
						} else {
							var5 = var1.readBits(1);
							if (var5 == 0) {
								var2 = this.method2779(var1);
								var10000 = this.field1412;
								var10000[var6] = (byte)(var10000[var6] | 2);
							} else if (this.method2781(var1, var6)) {
								var10000 = this.field1412;
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

					for (var3 = 0; var3 < this.field1426; ++var3) {
						var6 = this.field1418[var3];
						if ((this.field1412[var6] & 1) == 0) {
							if (var2 > 0) {
								--var2;
								var10000 = this.field1412;
								var10000[var6] = (byte)(var10000[var6] | 2);
							} else {
								var5 = var1.readBits(1);
								if (var5 == 0) {
									var2 = this.method2779(var1);
									var10000 = this.field1412;
									var10000[var6] = (byte)(var10000[var6] | 2);
								} else if (this.method2781(var1, var6)) {
									var10000 = this.field1412;
									var10000[var6] = (byte)(var10000[var6] | 2);
								}
							}
						}
					}

					var1.exportIndex();
					if (var2 != 0) {
						throw new RuntimeException();
					} else {
						this.field1415 = 0;
						this.field1426 = 0;

						for (var3 = 1; var3 < 2048; ++var3) {
							var10000 = this.field1412;
							var10000[var3] = (byte)(var10000[var3] >> 1);
							Player var4 = this.field1411.field1341[var3];
							if (var4 != null) {
								this.field1416[++this.field1415 - 1] = var3;
							} else {
								this.field1418[++this.field1426 - 1] = var3;
							}
						}

					}
				}
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Luk;S)I",
		garbageValue = "9935"
	)
	int method2779(PacketBuffer var1) {
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Luk;II)V",
		garbageValue = "-2121476471"
	)
	void method2780(PacketBuffer var1, int var2) {
		boolean var3 = var1.readBits(1) == 1;
		if (var3) {
			this.field1422[++this.field1423 - 1] = var2;
		}

		int var4 = var1.readBits(2);
		Player var5 = this.field1411.field1341[var2];
		if (var4 == 0) {
			if (var3) {
				var5.field1161 = false;
			} else if (var2 == Client.localPlayerIndex) {
				throw new RuntimeException();
			} else {
				this.field1419[var2] = (var5.plane << 28) + (this.field1411.field1337 + var5.field1229[0] >> 13 << 14) + (this.field1411.field1333 + var5.field1276[0] >> 13);
				if (var5.field1204 != -1) {
					this.field1420[var2] = var5.field1204;
				} else {
					this.field1420[var2] = var5.field1282;
				}

				this.field1409[var2] = var5.field1219;
				this.field1411.field1341[var2] = null;
				if (var1.readBits(1) != 0) {
					this.method2781(var1, var2);
				}

			}
		} else {
			int var6;
			int var7;
			int var8;
			if (var4 == 1) {
				var6 = var1.readBits(3);
				var7 = var5.field1229[0];
				var8 = var5.field1276[0];
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

				if (var2 == Client.localPlayerIndex && this.field1411.method2634() && (var5.x < 1536 || var5.y < 1536 || var5.x >= 11776 || var5.y >= 11776)) {
					var5.resetPath(var7, var8);
					var5.field1161 = false;
				} else if (var3) {
					var5.field1161 = true;
					var5.field1162 = var7;
					var5.field1163 = var8;
				} else {
					var5.field1161 = false;
					var5.method2370(this.field1411, var7, var8, this.field1413[var2]);
				}

			} else if (var4 == 2) {
				var6 = var1.readBits(4);
				var7 = var5.field1229[0];
				var8 = var5.field1276[0];
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

				if (var2 == Client.localPlayerIndex && this.field1411.method2634() && (var5.x < 1536 || var5.y < 1536 || var5.x >= 11776 || var5.y >= 11776)) {
					var5.resetPath(var7, var8);
					var5.field1161 = false;
				} else if (var3) {
					var5.field1161 = true;
					var5.field1162 = var7;
					var5.field1163 = var8;
				} else {
					var5.field1161 = false;
					var5.method2370(this.field1411, var7, var8, this.field1413[var2]);
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

					var11 = var9 + var5.field1229[0];
					var12 = var10 + var5.field1276[0];
					if (var2 != Client.localPlayerIndex || !this.field1411.method2634() || var5.x >= 1536 && var5.y >= 1536 && var5.x < 11776 && var5.y < 11776) {
						if (var3) {
							var5.field1161 = true;
							var5.field1162 = var11;
							var5.field1163 = var12;
						} else {
							var5.field1161 = false;
							var5.method2370(this.field1411, var11, var12, this.field1413[var2]);
						}
					} else {
						var5.resetPath(var11, var12);
						var5.field1161 = false;
					}

					var5.plane = (byte)(var8 + var5.plane & 3);
					if (var2 == Client.localPlayerIndex && this.field1411.method2634()) {
						this.field1411.field1348 = var5.plane;
					}

				} else {
					var7 = var1.readBits(30);
					var8 = var7 >> 28;
					var9 = var7 >> 14 & 16383;
					var10 = var7 & 16383;
					var11 = (this.field1411.field1337 + var9 + var5.field1229[0] & 16383) - this.field1411.field1337;
					var12 = (this.field1411.field1333 + var10 + var5.field1276[0] & 16383) - this.field1411.field1333;
					if (var2 == Client.localPlayerIndex && this.field1411.method2634() && (var5.x < 1536 || var5.y < 1536 || var5.x >= 11776 || var5.y >= 11776)) {
						var5.resetPath(var11, var12);
						var5.field1161 = false;
					} else if (var3) {
						var5.field1161 = true;
						var5.field1162 = var11;
						var5.field1163 = var12;
					} else {
						var5.field1161 = false;
						var5.method2370(this.field1411, var11, var12, this.field1413[var2]);
					}

					var5.plane = (byte)(var8 + var5.plane & 3);
					if (var2 == Client.localPlayerIndex && this.field1411.method2634()) {
						this.field1411.field1348 = var5.plane;
					}

				}
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Luk;II)Z",
		garbageValue = "1774032358"
	)
	boolean method2781(PacketBuffer var1, int var2) {
		int var3 = var1.readBits(2);
		int var4;
		int var5;
		int var8;
		int var9;
		int var10;
		int var11;
		if (var3 == 0) {
			if (var1.readBits(1) != 0) {
				this.method2781(var1, var2);
			}

			var4 = var1.readBits(13);
			var5 = var1.readBits(13);
			boolean var13 = var1.readBits(1) == 1;
			if (var13) {
				this.field1422[++this.field1423 - 1] = var2;
			}

			if (this.field1411.field1341[var2] != null) {
				throw new RuntimeException();
			} else {
				Player var12 = this.field1411.field1341[var2] = new Player();
				var12.field1157 = var2;
				if (this.field1414[var2] != null) {
					var12.read(this.field1414[var2]);
				}

				var12.field1282 = this.field1420[var2];
				var12.field1219 = this.field1409[var2];
				var8 = this.field1419[var2];
				var9 = var8 >> 28;
				var10 = var8 >> 14 & 255;
				var11 = var8 & 255;
				var12.field1277[0] = this.field1413[var2];
				var12.plane = (byte)var9;
				var12.resetPath((var10 << 13) + var4 - this.field1411.field1337, (var11 << 13) + var5 - this.field1411.field1333);
				var12.field1161 = false;
				return true;
			}
		} else if (var3 == 1) {
			var4 = var1.readBits(2);
			var5 = this.field1419[var2];
			this.field1419[var2] = (var5 & 268435455) + (((var5 >> 28) + var4 & 3) << 28);
			return false;
		} else {
			int var6;
			int var7;
			if (var3 == 2) {
				var4 = var1.readBits(5);
				var5 = var4 >> 3;
				var6 = var4 & 7;
				var7 = this.field1419[var2];
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

				this.field1419[var2] = (var9 << 14) + var10 + (var8 << 28);
				return false;
			} else {
				var4 = var1.readBits(18);
				var5 = var4 >> 16;
				var6 = var4 >> 8 & 255;
				var7 = var4 & 255;
				var8 = this.field1419[var2];
				var9 = (var8 >> 28) + var5 & 3;
				var10 = var6 + (var8 >> 14) & 255;
				var11 = var7 + var8 & 255;
				this.field1419[var2] = (var10 << 14) + var11 + (var9 << 28);
				return false;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-1230553577"
	)
	final void method2799(PacketBuffer var1) {
		for (int var2 = 0; var2 < this.field1423; ++var2) {
			int var3 = this.field1422[var2];
			Player var4 = this.field1411.field1341[var3];
			int var5 = var1.readUnsignedByte();
			if ((var5 & 64) != 0) {
				var5 += var1.readUnsignedByte() << 8;
			}

			if ((var5 & 32768) != 0) {
				var5 += var1.readUnsignedByte() << 16;
			}

			this.method2783(var1, var3, var4, var5);
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Luk;ILde;II)V",
		garbageValue = "922665628"
	)
	final void method2783(PacketBuffer var1, int var2, Player var3, int var4) {
		byte var5 = class237.field2523.field2532;
		int var6;
		int var7;
		int var8;
		int var9;
		int var10;
		int var11;
		int var13;
		int var23;
		if ((var4 & 128) != 0) {
			var6 = var1.readShortLE();
			if (var6 > 0) {
				for (var7 = 0; var7 < var6; ++var7) {
					var9 = -1;
					var10 = -1;
					var11 = -1;
					var8 = var1.readUShortSmart();
					if (var8 == 32767) {
						var8 = var1.readUShortSmart();
						var10 = var1.readUShortSmart();
						var9 = var1.readUShortSmart();
						var11 = var1.readUShortSmart();
					} else if (var8 != 32766) {
						var10 = var1.readUShortSmart();
					} else {
						var8 = -1;
					}

					var23 = var1.readUShortSmart();
					var3.addHitSplat(var8, var10, var9, var11, Client.cycle, var23);
				}
			}

			var7 = var1.readShortLE();
			if (var7 > 0) {
				for (var8 = 0; var8 < var7; ++var8) {
					var9 = var1.readUShortSmart();
					var10 = var1.readUShortSmart();
					if (var10 != 32767) {
						var11 = var1.readUShortSmart();
						var23 = var1.readUnsignedByteSub();
						var13 = var10 > 0 ? var1.readShortLE() : var23;
						var3.addHealthBar(var9, Client.cycle, var10, var11, var23, var13);
					} else {
						var3.removeHealthBar(var9);
					}
				}
			}
		}

		if ((var4 & 2) != 0) {
			var6 = var1.readUnsignedIntLE();
			PlayerType var21 = (PlayerType)MenuAction.findEnumerated(class108.PlayerType_values(), var1.readUnsignedShortAdd());
			boolean var28 = var1.readUnsignedByteSub() == 1;
			var9 = var1.readUnsignedByte();
			var10 = var1.offset;
			if (var3.username != null && var3.appearance != null) {
				boolean var30 = false;
				if (var21.isUser && class33.friendSystem.isIgnored(var3.username)) {
					var30 = true;
				}

				if (!var30 && Client.field650 == 0 && !var3.field1142) {
					this.field1424.offset = 0;
					var1.readBytes(this.field1424.array, 0, var9);
					this.field1424.offset = 0;
					String var12 = AbstractFont.escapeBrackets(class370.method7126(class323.method6188(this.field1424)));
					var3.field1224 = var12.trim();
					var3.field1253 = var6 >> 8;
					var3.field1230 = var6 & 255;
					var3.field1218 = 150;
					var3.field1211 = null;
					var3.field1221 = var28;
					var3.field1227 = var3 != class17.localPlayer && var21.isUser && !Client.field525.isEmpty() && var12.toLowerCase().indexOf(Client.field525) == -1;
					if (var21.isPrivileged) {
						var13 = var28 ? 91 : 1;
					} else {
						var13 = var28 ? 90 : 2;
					}

					if (var21.modIcon != -1) {
						UrlRequest.addGameMessage(var13, class322.method6186(var21.modIcon) + var3.username.getName(), var12);
					} else {
						UrlRequest.addGameMessage(var13, var3.username.getName(), var12);
					}
				}
			}

			var1.offset = var10 + var9;
		}

		if ((var4 & 32) != 0) {
			var3.field1224 = var1.readStringCp1252NullTerminated();
			if (var3.field1224.charAt(0) == '~') {
				var3.field1224 = var3.field1224.substring(1);
				UrlRequest.addGameMessage(2, var3.username.getName(), var3.field1224);
			} else if (var3 == class17.localPlayer) {
				UrlRequest.addGameMessage(2, var3.username.getName(), var3.field1224);
			}

			var3.field1221 = false;
			var3.field1253 = 0;
			var3.field1230 = 0;
			var3.field1218 = 150;
		}

		if ((var4 & 512) != 0) {
			var6 = var1.readUnsignedShort();
			var7 = var6 >> 8;
			var8 = var7 >= 13 && var7 <= 20 ? var7 - 12 : 0;
			PlayerType var22 = (PlayerType)MenuAction.findEnumerated(class108.PlayerType_values(), var1.readUnsignedByteSub());
			boolean var29 = var1.readUnsignedShortAdd() == 1;
			var11 = var1.readUnsignedShortAdd();
			var23 = var1.offset;
			if (var3.username != null && var3.appearance != null) {
				boolean var31 = false;
				if (var22.isUser && class33.friendSystem.isIgnored(var3.username)) {
					var31 = true;
				}

				if (!var31 && Client.field650 == 0 && !var3.field1142) {
					this.field1424.offset = 0;
					var1.method9655(this.field1424.array, 0, var11);
					this.field1424.offset = 0;
					String var14 = AbstractFont.escapeBrackets(class370.method7126(class323.method6188(this.field1424)));
					var3.field1224 = var14.trim();
					var3.field1253 = var6 >> 8;
					var3.field1230 = var6 & 255;
					var3.field1218 = 150;
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

							if (var18[var20] < 0 || var18[var20] >= class568.field5492.length) {
								var17 = null;
								break;
							}

							var19[var20] = class568.field5492[var18[var20]];
							++var20;
						}
					} else {
						var17 = null;
					}

					var3.field1211 = var17;
					var3.field1221 = var29;
					var3.field1227 = var3 != class17.localPlayer && var22.isUser && !Client.field525.isEmpty() && var14.toLowerCase().indexOf(Client.field525) == -1;
					int var25;
					if (var22.isPrivileged) {
						var25 = var29 ? 91 : 1;
					} else {
						var25 = var29 ? 90 : 2;
					}

					if (var22.modIcon != -1) {
						UrlRequest.addGameMessage(var25, class322.method6186(var22.modIcon) + var3.username.getName(), var14);
					} else {
						UrlRequest.addGameMessage(var25, var3.username.getName(), var14);
					}
				}
			}

			var1.offset = var8 + var23 + var11;
		}

		if ((var4 & 256) != 0) {
			class237[] var26 = this.field1413;
			class237[] var27 = new class237[]{class237.field2522, class237.field2526, class237.field2524, class237.field2528, class237.field2529, class237.field2530, class237.field2531, class237.field2525, class237.field2523};
			var26[var2] = (class237)MenuAction.findEnumerated(var27, var1.readByte());
		}

		if ((var4 & 8192) != 0) {
			var5 = var1.readByteSub();
		}

		if ((var4 & 4) != 0) {
			var6 = var1.readUnsignedByte();
			byte[] var32 = new byte[var6];
			Buffer var35 = new Buffer(var32);
			var1.readBytes(var32, 0, var6);
			this.field1414[var2] = var35;
			var3.read(var35);
		}

		if ((var4 & 1) != 0) {
			var3.field1204 = var1.readUnsignedIntLE();
			if (var3.field1274 == 0) {
				var3.field1282 = var3.field1204;
				var3.method2447();
			}
		}

		if ((var4 & 16384) != 0) {
			for (var6 = 0; var6 < 3; ++var6) {
				var3.field1139[var6] = var1.readStringCp1252NullTerminated();
			}
		}

		if ((var4 & 2048) != 0) {
			var3.field1265 = Client.cycle + var1.readUnsignedShort();
			var3.field1266 = Client.cycle + var1.readUnsignedIntLE();
			var3.field1267 = var1.readByteAdd();
			var3.field1268 = var1.readByteNeg();
			var3.field1269 = var1.readByte();
			var3.field1270 = (byte)var1.readShortLE();
		}

		if ((var4 & 1024) != 0) {
			var3.field1256 = var1.readByte();
			var3.field1258 = var1.readByteAdd();
			var3.field1257 = var1.readByteNeg();
			var3.field1259 = var1.readByteAdd();
			var3.field1260 = var1.readUnsignedShort() + Client.cycle;
			var3.field1261 = var1.readUnsignedIntLE() + Client.cycle;
			var3.field1262 = var1.readUnsignedShortAddLE();
			if (var3.field1161) {
				var3.field1256 += var3.field1162;
				var3.field1258 += var3.field1163;
				var3.field1257 += var3.field1162;
				var3.field1259 += var3.field1163;
				var3.field1274 = 0;
			} else {
				var3.field1256 += var3.field1229[0];
				var3.field1258 += var3.field1276[0];
				var3.field1257 += var3.field1229[0];
				var3.field1259 += var3.field1276[0];
				var3.field1274 = 1;
			}

			var3.field1226 = 0;
		}

		if ((var4 & 16) != 0) {
			var6 = var1.readUnsignedShort();
			if (var6 == 65535) {
				var6 = -1;
			}

			var7 = var1.readUnsignedByte();
			class162.method3413(var3, var6, var7);
		}

		if ((var4 & 8) != 0) {
			var3.field1219 = var1.readUnsignedIntLE();
			var3.field1219 += var1.readShortLE() << 16;
			var6 = 16777215;
			if (var6 == var3.field1219) {
				var3.field1219 = -1;
			}
		}

		if ((var4 & 65536) != 0) {
			var6 = var1.readUnsignedByte();

			for (var7 = 0; var7 < var6; ++var7) {
				var8 = var1.readUnsignedByte();
				var9 = var1.readUnsignedShortAddLE();
				var10 = var1.readInt();
				var3.updateSpotAnimation(var8, var9, var10 >> 16, var10 & 65535);
			}
		}

		if (var3.field1161) {
			if (var5 == 127) {
				var3.resetPath(var3.field1162, var3.field1163);
			} else {
				class237 var34;
				if (var5 != class237.field2523.field2532) {
					class237[] var33 = new class237[]{class237.field2522, class237.field2526, class237.field2524, class237.field2528, class237.field2529, class237.field2530, class237.field2531, class237.field2525, class237.field2523};
					var34 = (class237)MenuAction.findEnumerated(var33, var5);
				} else {
					var34 = this.field1413[var2];
				}

				var3.method2370(this.field1411, var3.field1162, var3.field1163, var34);
			}
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lua;IS)V",
		garbageValue = "1668"
	)
	@Export("readReflectionCheck")
	public static void readReflectionCheck(Buffer var0, int var1) {
		ReflectionCheck var2 = new ReflectionCheck();
		var2.size = var0.readUnsignedByte();
		var2.id = var0.readInt();
		var2.operations = new int[var2.size];
		var2.creationErrors = new int[var2.size];
		var2.fields = new Field[var2.size];
		var2.intReplaceValues = new int[var2.size];
		var2.methods = new Method[var2.size];
		var2.arguments = new byte[var2.size][][];

		for (int var3 = 0; var3 < var2.size; ++var3) {
			try {
				int var4 = var0.readUnsignedByte();
				String var5;
				String var6;
				int var7;
				if (var4 != 0 && var4 != 1 && var4 != 2) {
					if (var4 == 3 || var4 == 4) {
						var5 = var0.readStringCp1252NullTerminated();
						var6 = var0.readStringCp1252NullTerminated();
						var7 = var0.readUnsignedByte();
						String[] var8 = new String[var7];

						for (int var9 = 0; var9 < var7; ++var9) {
							var8[var9] = var0.readStringCp1252NullTerminated();
						}

						String var20 = var0.readStringCp1252NullTerminated();
						byte[][] var10 = new byte[var7][];
						int var12;
						if (var4 == 3) {
							for (int var11 = 0; var11 < var7; ++var11) {
								var12 = var0.readInt();
								var10[var11] = new byte[var12];
								var0.readBytes(var10[var11], 0, var12);
							}
						}

						var2.operations[var3] = var4;
						Class[] var21 = new Class[var7];

						for (var12 = 0; var12 < var7; ++var12) {
							var21[var12] = SecureRandomFuture.loadClassFromDescriptor(var8[var12]);
						}

						Class var22 = SecureRandomFuture.loadClassFromDescriptor(var20);
						if (SecureRandomFuture.loadClassFromDescriptor(var5).getClassLoader() == null) {
							throw new SecurityException();
						}

						Method[] var13 = SecureRandomFuture.loadClassFromDescriptor(var5).getDeclaredMethods();
						Method[] var14 = var13;

						for (int var15 = 0; var15 < var14.length; ++var15) {
							Method var16 = var14[var15];
							if (Reflection.getMethodName(var16).equals(var6)) {
								Class[] var17 = Reflection.getParameterTypes(var16);
								if (var17.length == var21.length) {
									boolean var18 = true;

									for (int var19 = 0; var19 < var21.length; ++var19) {
										if (var17[var19] != var21[var19]) {
											var18 = false;
											break;
										}
									}

									if (var18 && var22 == var16.getReturnType()) {
										var2.methods[var3] = var16;
									}
								}
							}
						}

						var2.arguments[var3] = var10;
					}
				} else {
					var5 = var0.readStringCp1252NullTerminated();
					var6 = var0.readStringCp1252NullTerminated();
					var7 = 0;
					if (var4 == 1) {
						var7 = var0.readInt();
					}

					var2.operations[var3] = var4;
					var2.intReplaceValues[var3] = var7;
					if (SecureRandomFuture.loadClassFromDescriptor(var5).getClassLoader() == null) {
						throw new SecurityException();
					}

					var2.fields[var3] = Reflection.findField(SecureRandomFuture.loadClassFromDescriptor(var5), var6);
				}
			} catch (ClassNotFoundException var24) {
				var2.creationErrors[var3] = -1;
			} catch (SecurityException var25) {
				var2.creationErrors[var3] = -2;
			} catch (NullPointerException var26) {
				var2.creationErrors[var3] = -3;
			} catch (Exception var27) {
				var2.creationErrors[var3] = -4;
			} catch (Throwable var28) {
				var2.creationErrors[var3] = -5;
			}
		}

		class36.reflectionChecks.addFirst(var2);
	}
}
