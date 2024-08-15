import java.io.IOException;
import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("or")
@Implements("JagNetThread")
public class JagNetThread {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lsx;"
	)
	AbstractSocket field4531;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1003754329
	)
	int field4514;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = 8814547299036792573L
	)
	long field4510;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	NodeHashTable field4516;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1586014975
	)
	int field4517;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	NodeHashTable field4518;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1742624911
	)
	int field4519;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpw;"
	)
	DualNodeDeque field4513;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	NodeHashTable field4527;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1429067229
	)
	int field4522;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	NodeHashTable field4533;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 612789125
	)
	int field4524;
	@ObfuscatedName("ah")
	boolean field4525;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	class387 field4526;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	Buffer field4515;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	Buffer field4528;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1555654999
	)
	int field4529;
	@ObfuscatedName("ai")
	CRC32 field4530;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	Buffer field4536;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[Loj;"
	)
	Archive[] field4523;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 29133183
	)
	int field4520;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -853349371
	)
	int field4532;
	@ObfuscatedName("bj")
	byte field4535;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1757350559
	)
	public int field4534;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -1311822301
	)
	public int field4537;

	public JagNetThread() {
		this.field4514 = 0;
		this.field4516 = new NodeHashTable(4096);
		this.field4517 = 0;
		this.field4518 = new NodeHashTable(32);
		this.field4519 = 0;
		this.field4513 = new DualNodeDeque();
		this.field4527 = new NodeHashTable(4096);
		this.field4522 = 0;
		this.field4533 = new NodeHashTable(4096);
		this.field4524 = 0;
		this.field4515 = new Buffer(8);
		this.field4529 = 0;
		this.field4530 = new CRC32();
		this.field4523 = new Archive[256];
		this.field4520 = -1;
		this.field4532 = 255;
		this.field4535 = 0;
		this.field4534 = 0;
		this.field4537 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1555205351"
	)
	public boolean method7349() {
		long var1 = RouteStrategy.method5439();
		int var3 = (int)(var1 - this.field4510);
		this.field4510 = var1;
		if (var3 > 200) {
			var3 = 200;
		}

		this.field4514 += var3;
		if (this.field4524 == 0 && this.field4519 == 0 && this.field4522 == 0 && this.field4517 == 0) {
			return true;
		} else if (this.field4531 == null) {
			return false;
		} else {
			try {
				if (this.field4514 > 30000) {
					throw new IOException();
				} else {
					class387 var4;
					Buffer var5;
					while (this.field4519 < 200 && this.field4517 > 0) {
						var4 = (class387)this.field4516.first();
						var5 = new Buffer(4);
						var5.writeByte(1);
						var5.writeMedium((int)var4.key);
						this.field4531.write(var5.array, 0, 4);
						this.field4518.put(var4, var4.key);
						--this.field4517;
						++this.field4519;
					}

					while (this.field4524 < 200 && this.field4522 > 0) {
						var4 = (class387)this.field4513.removeLast();
						var5 = new Buffer(4);
						var5.writeByte(0);
						var5.writeMedium((int)var4.key);
						this.field4531.write(var5.array, 0, 4);
						var4.removeDual();
						this.field4533.put(var4, var4.key);
						--this.field4522;
						++this.field4524;
					}

					for (int var16 = 0; var16 < 100; ++var16) {
						int var17 = this.field4531.available();
						if (var17 < 0) {
							throw new IOException();
						}

						if (var17 == 0) {
							break;
						}

						this.field4514 = 0;
						byte var6 = 0;
						if (this.field4526 == null) {
							var6 = 8;
						} else if (this.field4529 == 0) {
							var6 = 1;
						}

						int var7;
						int var8;
						int var9;
						byte[] var10000;
						int var10001;
						Buffer var22;
						if (var6 > 0) {
							var7 = var6 - this.field4515.offset;
							if (var7 > var17) {
								var7 = var17;
							}

							this.field4531.read(this.field4515.array, this.field4515.offset, var7);
							if (this.field4535 != 0) {
								for (var8 = 0; var8 < var7; ++var8) {
									var10000 = this.field4515.array;
									var10001 = var8 + this.field4515.offset;
									var10000[var10001] ^= this.field4535;
								}
							}

							var22 = this.field4515;
							var22.offset += var7;
							if (this.field4515.offset < var6) {
								break;
							}

							if (this.field4526 == null) {
								this.field4515.offset = 0;
								var8 = this.field4515.readUnsignedByte();
								var9 = this.field4515.readUnsignedShort();
								int var10 = this.field4515.readUnsignedByte();
								int var11 = this.field4515.readInt();
								long var12 = (long)(var9 + (var8 << 16));
								class387 var14 = (class387)this.field4518.get(var12);
								this.field4525 = true;
								if (var14 == null) {
									var14 = (class387)this.field4533.get(var12);
									this.field4525 = false;
								}

								if (var14 == null) {
									throw new IOException();
								}

								int var15 = var10 == 0 ? 5 : 9;
								this.field4526 = var14;
								this.field4528 = new Buffer(this.field4526.field4488 + var11 + var15);
								this.field4528.writeByte(var10);
								this.field4528.writeInt(var11);
								this.field4529 = 8;
								this.field4515.offset = 0;
							} else if (this.field4529 == 0) {
								if (this.field4515.array[0] == -1) {
									this.field4529 = 1;
									this.field4515.offset = 0;
								} else {
									this.field4526 = null;
								}
							}
						} else {
							var7 = this.field4528.array.length - this.field4526.field4488;
							var8 = 512 - this.field4529;
							if (var8 > var7 - this.field4528.offset) {
								var8 = var7 - this.field4528.offset;
							}

							if (var8 > var17) {
								var8 = var17;
							}

							this.field4531.read(this.field4528.array, this.field4528.offset, var8);
							if (this.field4535 != 0) {
								for (var9 = 0; var9 < var8; ++var9) {
									var10000 = this.field4528.array;
									var10001 = this.field4528.offset + var9;
									var10000[var10001] ^= this.field4535;
								}
							}

							var22 = this.field4528;
							var22.offset += var8;
							this.field4529 += var8;
							if (this.field4528.offset == var7) {
								if (this.field4526.key == 16711935L) {
									this.field4536 = this.field4528;

									for (var9 = 0; var9 < 256; ++var9) {
										Archive var18 = this.field4523[var9];
										if (var18 != null) {
											this.method7353(var18, var9);
										}
									}
								} else {
									this.field4530.reset();
									this.field4530.update(this.field4528.array, 0, var7);
									var9 = (int)this.field4530.getValue();
									if (this.field4526.field4491 != var9) {
										try {
											this.field4531.close();
										} catch (Exception var20) {
										}

										++this.field4534;
										this.field4531 = null;
										this.field4535 = (byte)((int)(Math.random() * 255.0D + 1.0D));
										return false;
									}

									this.field4534 = 0;
									this.field4537 = 0;
									this.field4526.field4490.write((int)(this.field4526.key & 65535L), this.field4528.array, (this.field4526.key & 16711680L) == 16711680L, this.field4525);
								}

								this.field4526.remove();
								if (this.field4525) {
									--this.field4519;
								} else {
									--this.field4524;
								}

								this.field4529 = 0;
								this.field4526 = null;
								this.field4528 = null;
							} else {
								if (this.field4529 != 512) {
									break;
								}

								this.field4529 = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var21) {
				try {
					this.field4531.close();
				} catch (Exception var19) {
				}

				++this.field4537;
				this.field4531 = null;
				return false;
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1980745165"
	)
	public void method7360(boolean var1) {
		if (this.field4531 != null) {
			try {
				Buffer var2 = new Buffer(4);
				var2.writeByte(var1 ? 2 : 3);
				var2.writeMedium(0);
				this.field4531.write(var2.array, 0, 4);
			} catch (IOException var5) {
				try {
					this.field4531.close();
				} catch (Exception var4) {
				}

				++this.field4537;
				this.field4531 = null;
			}

		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lsx;ZB)V",
		garbageValue = "-102"
	)
	public void method7351(AbstractSocket var1, boolean var2) {
		if (this.field4531 != null) {
			try {
				this.field4531.close();
			} catch (Exception var7) {
			}

			this.field4531 = null;
		}

		this.field4531 = var1;
		this.method7360(var2);
		this.field4515.offset = 0;
		this.field4526 = null;
		this.field4528 = null;
		this.field4529 = 0;

		while (true) {
			class387 var3 = (class387)this.field4518.first();
			if (var3 == null) {
				while (true) {
					var3 = (class387)this.field4533.first();
					if (var3 == null) {
						if (this.field4535 != 0) {
							try {
								Buffer var8 = new Buffer(4);
								var8.writeByte(4);
								var8.writeByte(this.field4535);
								var8.writeShort(0);
								this.field4531.write(var8.array, 0, 4);
							} catch (IOException var6) {
								try {
									this.field4531.close();
								} catch (Exception var5) {
								}

								++this.field4537;
								this.field4531 = null;
							}
						}

						this.field4514 = 0;
						this.field4510 = RouteStrategy.method5439();
						return;
					}

					this.field4513.method7510(var3);
					this.field4527.put(var3, var3.key);
					++this.field4522;
					--this.field4524;
				}
			}

			this.field4516.put(var3, var3.key);
			++this.field4517;
			--this.field4519;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Loj;II)V",
		garbageValue = "-49892336"
	)
	void method7372(Archive var1, int var2) {
		if (var1.field4459 && !var1.field4445) {
			if (var2 <= this.field4520) {
				throw new RuntimeException("");
			}

			if (var2 < this.field4532) {
				this.field4532 = var2;
			}
		} else {
			if (var2 >= this.field4532) {
				throw new RuntimeException("");
			}

			if (var2 > this.field4520) {
				this.field4520 = var2;
			}
		}

		if (this.field4536 != null) {
			this.method7353(var1, var2);
		} else {
			this.method7354((Archive)null, class386.field4485.field4469, 255, 0, (byte)0, true);
			this.field4523[var2] = var1;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Loj;II)V",
		garbageValue = "-1120176741"
	)
	void method7353(Archive var1, int var2) {
		this.field4536.offset = var2 * 8 + 5;
		if (this.field4536.offset >= this.field4536.array.length) {
			if (var1.field4459) {
				var1.method7198();
			} else {
				throw new RuntimeException("");
			}
		} else {
			int var3 = this.field4536.readInt();
			int var4 = this.field4536.readInt();
			var1.loadIndex(var3, var4);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Loj;IIIBZB)V",
		garbageValue = "22"
	)
	void method7354(Archive var1, int var2, int var3, int var4, byte var5, boolean var6) {
		long var7 = (long)(var3 + (var2 << 16));
		class387 var9 = (class387)this.field4516.get(var7);
		if (var9 == null) {
			var9 = (class387)this.field4518.get(var7);
			if (var9 == null) {
				var9 = (class387)this.field4527.get(var7);
				if (var9 != null) {
					if (var6) {
						var9.removeDual();
						this.field4516.put(var9, var7);
						--this.field4522;
						++this.field4517;
					}

				} else {
					if (!var6) {
						var9 = (class387)this.field4533.get(var7);
						if (var9 != null) {
							return;
						}
					}

					var9 = new class387();
					var9.field4490 = var1;
					var9.field4491 = var4;
					var9.field4488 = var5;
					if (var6) {
						this.field4516.put(var9, var7);
						++this.field4517;
					} else {
						this.field4513.method7509(var9);
						this.field4527.put(var9, var7);
						++this.field4522;
					}

				}
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1649390562"
	)
	void method7355(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		class387 var5 = (class387)this.field4527.get(var3);
		if (var5 != null) {
			this.field4513.method7510(var5);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "704663694"
	)
	int method7356(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		return this.field4526 != null && var3 == this.field4526.key ? this.field4528.offset * 99 / (this.field4528.array.length - this.field4526.field4488) + 1 : 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ZZI)I",
		garbageValue = "878703594"
	)
	public int method7375(boolean var1, boolean var2) {
		byte var3 = 0;
		int var4 = var3 + this.field4519 + this.field4517;
		return var4;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-6891"
	)
	public void method7358() {
		if (this.field4531 != null) {
			try {
				this.field4531.close();
			} catch (Exception var2) {
			}

			this.field4531 = null;
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([Lcf;II[I[II)V",
		garbageValue = "-1050512079"
	)
	@Export("sortWorlds")
	static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) {
			int var5 = var1 - 1;
			int var6 = var2 + 1;
			int var7 = (var2 + var1) / 2;
			World var8 = var0[var7];
			var0[var7] = var0[var1];
			var0[var1] = var8;

			while (var5 < var6) {
				boolean var9 = true;

				int var10;
				int var11;
				int var12;
				do {
					--var6;

					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var6].index;
							var12 = var8.index;
						} else if (var3[var10] == 1) {
							var11 = var0[var6].population;
							var12 = var8.population;
							if (var11 == -1 && var4[var10] == 1) {
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = var0[var6].isMembersOnly() ? 1 : 0;
							var12 = var8.isMembersOnly() ? 1 : 0;
						} else {
							var11 = var0[var6].id;
							var12 = var8.id;
						}

						if (var11 != var12) {
							if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) {
								var9 = false;
							}
							break;
						}

						if (var10 == 3) {
							var9 = false;
						}
					}
				} while(var9);

				var9 = true;

				do {
					++var5;

					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var5].index;
							var12 = var8.index;
						} else if (var3[var10] == 1) {
							var11 = var0[var5].population;
							var12 = var8.population;
							if (var11 == -1 && var4[var10] == 1) {
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = var0[var5].isMembersOnly() ? 1 : 0;
							var12 = var8.isMembersOnly() ? 1 : 0;
						} else {
							var11 = var0[var5].id;
							var12 = var8.id;
						}

						if (var11 != var12) {
							if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) {
								var9 = false;
							}
							break;
						}

						if (var10 == 3) {
							var9 = false;
						}
					}
				} while(var9);

				if (var5 < var6) {
					World var13 = var0[var5];
					var0[var5] = var0[var6];
					var0[var6] = var13;
				}
			}

			sortWorlds(var0, var1, var6, var3, var4);
			sortWorlds(var0, var6 + 1, var2, var3, var4);
		}

	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "707940603"
	)
	static final void method7359(int var0, int var1) {
		if (var0 < 128) {
			var0 = 128;
		} else if (var0 > 383) {
			var0 = 383;
		}

		if (UserComparator6.cameraPitch < var0) {
			UserComparator6.cameraPitch = (var0 - UserComparator6.cameraPitch) * Message.field461 / 1000 + UserComparator6.cameraPitch + NPCComposition.field2613;
			if (UserComparator6.cameraPitch > var0) {
				UserComparator6.cameraPitch = var0;
			}
		} else if (UserComparator6.cameraPitch > var0) {
			UserComparator6.cameraPitch -= (UserComparator6.cameraPitch - var0) * Message.field461 / 1000 + NPCComposition.field2613;
			if (UserComparator6.cameraPitch < var0) {
				UserComparator6.cameraPitch = var0;
			}
		}

		var1 &= 2047;
		int var2 = var1 - class264.cameraYaw;
		if (var2 > 1024) {
			var2 -= 2048;
		} else if (var2 < -1024) {
			var2 += 2048;
		}

		if (var2 > 0) {
			class264.cameraYaw = var2 * Message.field461 / 1000 + class264.cameraYaw + NPCComposition.field2613;
			class264.cameraYaw &= 2047;
		} else if (var2 < 0) {
			class264.cameraYaw -= -var2 * Message.field461 / 1000 + NPCComposition.field2613;
			class264.cameraYaw &= 2047;
		}

		int var3 = var1 - class264.cameraYaw;
		if (var3 > 1024) {
			var3 -= 2048;
		} else if (var3 < -1024) {
			var3 += 2048;
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
			class264.cameraYaw = var1;
		}

	}
}
