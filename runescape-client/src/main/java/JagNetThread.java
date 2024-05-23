import java.io.IOException;
import java.util.zip.CRC32;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oj")
@Implements("JagNetThread")
public class JagNetThread {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lsm;"
	)
	AbstractSocket field4532;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -483096973
	)
	int field4520;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 6110918487643816679L
	)
	long field4521;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ltx;"
	)
	NodeHashTable field4519;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1463847027
	)
	int field4523;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ltx;"
	)
	NodeHashTable field4538;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -800424895
	)
	int field4525;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	DualNodeDeque field4526;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ltx;"
	)
	NodeHashTable field4522;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 718751813
	)
	int field4528;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ltx;"
	)
	NodeHashTable field4541;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 229825985
	)
	int field4530;
	@ObfuscatedName("au")
	boolean field4531;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	class385 field4527;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lua;"
	)
	Buffer field4533;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lua;"
	)
	Buffer field4529;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 2055313653
	)
	int field4535;
	@ObfuscatedName("am")
	CRC32 field4536;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lua;"
	)
	Buffer field4537;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "[Lot;"
	)
	Archive[] field4524;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1159083227
	)
	int field4539;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -542213403
	)
	int field4540;
	@ObfuscatedName("bo")
	byte field4517;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1672950355
	)
	public int field4542;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = -271424419
	)
	public int field4543;

	public JagNetThread() {
		this.field4520 = 0;
		this.field4519 = new NodeHashTable(4096);
		this.field4523 = 0;
		this.field4538 = new NodeHashTable(32);
		this.field4525 = 0;
		this.field4526 = new DualNodeDeque();
		this.field4522 = new NodeHashTable(4096);
		this.field4528 = 0;
		this.field4541 = new NodeHashTable(4096);
		this.field4530 = 0;
		this.field4533 = new Buffer(8);
		this.field4535 = 0;
		this.field4536 = new CRC32();
		this.field4524 = new Archive[256];
		this.field4539 = -1;
		this.field4540 = 255;
		this.field4517 = 0;
		this.field4542 = 0;
		this.field4543 = 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-28"
	)
	public boolean method7342() {
		long var1 = class129.method3033();
		int var3 = (int)(var1 - this.field4521);
		this.field4521 = var1;
		if (var3 > 200) {
			var3 = 200;
		}

		this.field4520 += var3;
		if (this.field4530 == 0 && this.field4525 == 0 && this.field4528 == 0 && this.field4523 == 0) {
			return true;
		} else if (this.field4532 == null) {
			return false;
		} else {
			try {
				if (this.field4520 > 30000) {
					throw new IOException();
				} else {
					class385 var4;
					Buffer var5;
					while (this.field4525 < 200 && this.field4523 > 0) {
						var4 = (class385)this.field4519.first();
						var5 = new Buffer(4);
						var5.writeByte(1);
						var5.writeMedium((int)var4.key);
						this.field4532.write(var5.array, 0, 4);
						this.field4538.put(var4, var4.key);
						--this.field4523;
						++this.field4525;
					}

					while (this.field4530 < 200 && this.field4528 > 0) {
						var4 = (class385)this.field4526.removeLast();
						var5 = new Buffer(4);
						var5.writeByte(0);
						var5.writeMedium((int)var4.key);
						this.field4532.write(var5.array, 0, 4);
						var4.removeDual();
						this.field4541.put(var4, var4.key);
						--this.field4528;
						++this.field4530;
					}

					for (int var16 = 0; var16 < 100; ++var16) {
						int var17 = this.field4532.available();
						if (var17 < 0) {
							throw new IOException();
						}

						if (var17 == 0) {
							break;
						}

						this.field4520 = 0;
						byte var6 = 0;
						if (this.field4527 == null) {
							var6 = 8;
						} else if (this.field4535 == 0) {
							var6 = 1;
						}

						int var7;
						int var8;
						int var9;
						byte[] var10000;
						int var10001;
						Buffer var22;
						if (var6 > 0) {
							var7 = var6 - this.field4533.offset;
							if (var7 > var17) {
								var7 = var17;
							}

							this.field4532.read(this.field4533.array, this.field4533.offset, var7);
							if (this.field4517 != 0) {
								for (var8 = 0; var8 < var7; ++var8) {
									var10000 = this.field4533.array;
									var10001 = var8 + this.field4533.offset;
									var10000[var10001] ^= this.field4517;
								}
							}

							var22 = this.field4533;
							var22.offset += var7;
							if (this.field4533.offset < var6) {
								break;
							}

							if (this.field4527 == null) {
								this.field4533.offset = 0;
								var8 = this.field4533.readUnsignedByte();
								var9 = this.field4533.readUnsignedShort();
								int var10 = this.field4533.readUnsignedByte();
								int var11 = this.field4533.readInt();
								long var12 = (long)(var9 + (var8 << 16));
								class385 var14 = (class385)this.field4538.get(var12);
								this.field4531 = true;
								if (var14 == null) {
									var14 = (class385)this.field4541.get(var12);
									this.field4531 = false;
								}

								if (var14 == null) {
									throw new IOException();
								}

								int var15 = var10 == 0 ? 5 : 9;
								this.field4527 = var14;
								this.field4529 = new Buffer(this.field4527.field4498 + var15 + var11);
								this.field4529.writeByte(var10);
								this.field4529.writeInt(var11);
								this.field4535 = 8;
								this.field4533.offset = 0;
							} else if (this.field4535 == 0) {
								if (this.field4533.array[0] == -1) {
									this.field4535 = 1;
									this.field4533.offset = 0;
								} else {
									this.field4527 = null;
								}
							}
						} else {
							var7 = this.field4529.array.length - this.field4527.field4498;
							var8 = 512 - this.field4535;
							if (var8 > var7 - this.field4529.offset) {
								var8 = var7 - this.field4529.offset;
							}

							if (var8 > var17) {
								var8 = var17;
							}

							this.field4532.read(this.field4529.array, this.field4529.offset, var8);
							if (this.field4517 != 0) {
								for (var9 = 0; var9 < var8; ++var9) {
									var10000 = this.field4529.array;
									var10001 = this.field4529.offset + var9;
									var10000[var10001] ^= this.field4517;
								}
							}

							var22 = this.field4529;
							var22.offset += var8;
							this.field4535 += var8;
							if (this.field4529.offset == var7) {
								if (this.field4527.key == 16711935L) {
									this.field4537 = this.field4529;

									for (var9 = 0; var9 < 256; ++var9) {
										Archive var18 = this.field4524[var9];
										if (var18 != null) {
											this.method7325(var18, var9);
										}
									}
								} else {
									this.field4536.reset();
									this.field4536.update(this.field4529.array, 0, var7);
									var9 = (int)this.field4536.getValue();
									if (this.field4527.field4495 != var9) {
										try {
											this.field4532.close();
										} catch (Exception var20) {
										}

										++this.field4542;
										this.field4532 = null;
										this.field4517 = (byte)((int)(Math.random() * 255.0D + 1.0D));
										return false;
									}

									this.field4542 = 0;
									this.field4543 = 0;
									this.field4527.field4497.write((int)(this.field4527.key & 65535L), this.field4529.array, (this.field4527.key & 16711680L) == 16711680L, this.field4531);
								}

								this.field4527.remove();
								if (this.field4531) {
									--this.field4525;
								} else {
									--this.field4530;
								}

								this.field4535 = 0;
								this.field4527 = null;
								this.field4529 = null;
							} else {
								if (this.field4535 != 512) {
									break;
								}

								this.field4535 = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var21) {
				try {
					this.field4532.close();
				} catch (Exception var19) {
				}

				++this.field4543;
				this.field4532 = null;
				return false;
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1580240950"
	)
	public void method7335(boolean var1) {
		if (this.field4532 != null) {
			try {
				Buffer var2 = new Buffer(4);
				var2.writeByte(var1 ? 2 : 3);
				var2.writeMedium(0);
				this.field4532.write(var2.array, 0, 4);
			} catch (IOException var5) {
				try {
					this.field4532.close();
				} catch (Exception var4) {
				}

				++this.field4543;
				this.field4532 = null;
			}

		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lsm;ZI)V",
		garbageValue = "1159626015"
	)
	public void method7323(AbstractSocket var1, boolean var2) {
		if (this.field4532 != null) {
			try {
				this.field4532.close();
			} catch (Exception var7) {
			}

			this.field4532 = null;
		}

		this.field4532 = var1;
		this.method7335(var2);
		this.field4533.offset = 0;
		this.field4527 = null;
		this.field4529 = null;
		this.field4535 = 0;

		while (true) {
			class385 var3 = (class385)this.field4538.first();
			if (var3 == null) {
				while (true) {
					var3 = (class385)this.field4541.first();
					if (var3 == null) {
						if (this.field4517 != 0) {
							try {
								Buffer var8 = new Buffer(4);
								var8.writeByte(4);
								var8.writeByte(this.field4517);
								var8.writeShort(0);
								this.field4532.write(var8.array, 0, 4);
							} catch (IOException var6) {
								try {
									this.field4532.close();
								} catch (Exception var5) {
								}

								++this.field4543;
								this.field4532 = null;
							}
						}

						this.field4520 = 0;
						this.field4521 = class129.method3033();
						return;
					}

					this.field4526.method7493(var3);
					this.field4522.put(var3, var3.key);
					++this.field4528;
					--this.field4530;
				}
			}

			this.field4519.put(var3, var3.key);
			++this.field4523;
			--this.field4525;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lot;II)V",
		garbageValue = "2088168026"
	)
	void method7324(Archive var1, int var2) {
		if (var1.field4462 && !var1.field4468) {
			if (var2 <= this.field4539) {
				throw new RuntimeException("");
			}

			if (var2 < this.field4540) {
				this.field4540 = var2;
			}
		} else {
			if (var2 >= this.field4540) {
				throw new RuntimeException("");
			}

			if (var2 > this.field4539) {
				this.field4539 = var2;
			}
		}

		if (this.field4537 != null) {
			this.method7325(var1, var2);
		} else {
			this.method7326((Archive)null, class384.field4473.field4493, 255, 0, (byte)0, true);
			this.field4524[var2] = var1;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lot;II)V",
		garbageValue = "-1902622701"
	)
	void method7325(Archive var1, int var2) {
		this.field4537.offset = var2 * 8 + 5;
		if (this.field4537.offset >= this.field4537.array.length) {
			if (var1.field4462) {
				var1.method7181();
			} else {
				throw new RuntimeException("");
			}
		} else {
			int var3 = this.field4537.readInt();
			int var4 = this.field4537.readInt();
			var1.loadIndex(var3, var4);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lot;IIIBZI)V",
		garbageValue = "223224087"
	)
	void method7326(Archive var1, int var2, int var3, int var4, byte var5, boolean var6) {
		long var7 = (long)(var3 + (var2 << 16));
		class385 var9 = (class385)this.field4519.get(var7);
		if (var9 == null) {
			var9 = (class385)this.field4538.get(var7);
			if (var9 == null) {
				var9 = (class385)this.field4522.get(var7);
				if (var9 != null) {
					if (var6) {
						var9.removeDual();
						this.field4519.put(var9, var7);
						--this.field4528;
						++this.field4523;
					}

				} else {
					if (!var6) {
						var9 = (class385)this.field4541.get(var7);
						if (var9 != null) {
							return;
						}
					}

					var9 = new class385();
					var9.field4497 = var1;
					var9.field4495 = var4;
					var9.field4498 = var5;
					if (var6) {
						this.field4519.put(var9, var7);
						++this.field4523;
					} else {
						this.field4526.method7496(var9);
						this.field4522.put(var9, var7);
						++this.field4528;
					}

				}
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-92"
	)
	void method7334(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		class385 var5 = (class385)this.field4522.get(var3);
		if (var5 != null) {
			this.field4526.method7493(var5);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "4"
	)
	int method7328(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		return this.field4527 != null && var3 == this.field4527.key ? this.field4529.offset * 99 / (this.field4529.array.length - this.field4527.field4498) + 1 : 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ZZB)I",
		garbageValue = "-32"
	)
	public int method7330(boolean var1, boolean var2) {
		byte var3 = 0;
		int var4 = var3 + this.field4523 + this.field4525;
		return var4;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2113144882"
	)
	public void method7345() {
		if (this.field4532 != null) {
			try {
				this.field4532.close();
			} catch (Exception var2) {
			}

			this.field4532 = null;
		}

	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(Lnb;IIB)V",
		garbageValue = "83"
	)
	public static void method7358(Widget var0, int var1, int var2) {
		PlayerComposition var3 = var0.field3902;
		boolean var4 = var2 != var3.gender;
		var3.gender = var2;
		if (var4) {
			int var5;
			int var10;
			if (var3.gender == var1) {
				for (var5 = 0; var5 < PlayerComposition.equipmentIndices.length; ++var5) {
					var10 = PlayerComposition.equipmentIndices[var5];
					if (var3.equipment[var10] > 0 && var3.equipment[var10] < 512) {
						var3.equipment[var10] = var3.field3762[var10];
					}
				}
			} else {
				label102: {
					if (var3.equipment[0] >= 512) {
						boolean var11;
						if (var3.equipment[0] < 512) {
							var11 = false;
						} else {
							ItemComposition var6 = KeyHandler.ItemDefinition_get(var3.equipment[0] - 512);
							var11 = var6.maleModel1 != class227.field2446.field2449 && var6.maleModel2 != class227.field2446.field2449;
						}

						if (!var11) {
							break label102;
						}
					}

					var3.equipment[class227.field2446.field2449] = 1;
				}

				for (var5 = 0; var5 < 7; ++var5) {
					var10 = PlayerComposition.equipmentIndices[var5];
					if (var3.equipment[var10] > 0 && var3.equipment[var10] < 512) {
						int[] var7 = var3.equipment;

						for (int var8 = 0; var8 < class420.KitDefinition_fileCount; ++var8) {
							KitDefinition var9 = class140.KitDefinition_get(var8);
							if (var9 != null && !var9.nonSelectable && var5 + (var2 == 1 ? 7 : 0) == var9.bodypartID) {
								var7[PlayerComposition.equipmentIndices[var5]] = var8 + 256;
								break;
							}
						}
					}
				}
			}
		}

		var3.method6576();
	}
}
