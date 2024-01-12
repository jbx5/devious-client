import java.io.IOException;
import java.util.zip.CRC32;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("or")
@Implements("JagNetThread")
public class JagNetThread {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lri;"
	)
	AbstractSocket field4376;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 590881255
	)
	int field4375;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = -2566440090942884179L
	)
	long field4380;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lts;"
	)
	NodeHashTable field4392;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 517844601
	)
	int field4378;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lts;"
	)
	NodeHashTable field4379;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 647263993
	)
	int field4390;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpy;"
	)
	DualNodeDeque field4381;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lts;"
	)
	NodeHashTable field4382;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -540887497
	)
	int field4374;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lts;"
	)
	NodeHashTable field4384;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -270507287
	)
	int field4385;
	@ObfuscatedName("ad")
	boolean field4386;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	class373 field4387;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	Buffer field4395;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	Buffer field4389;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -50585685
	)
	int field4388;
	@ObfuscatedName("ay")
	CRC32 field4399;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	Buffer field4393;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Loz;"
	)
	Archive[] field4394;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -783422919
	)
	int field4383;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 763904105
	)
	int field4396;
	@ObfuscatedName("ac")
	byte field4397;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 345416301
	)
	public int field4377;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1860121777
	)
	public int field4398;

	public JagNetThread() {
		this.field4375 = 0;
		this.field4392 = new NodeHashTable(4096);
		this.field4378 = 0;
		this.field4379 = new NodeHashTable(32);
		this.field4390 = 0;
		this.field4381 = new DualNodeDeque();
		this.field4382 = new NodeHashTable(4096);
		this.field4374 = 0;
		this.field4384 = new NodeHashTable(4096);
		this.field4385 = 0;
		this.field4395 = new Buffer(8);
		this.field4388 = 0;
		this.field4399 = new CRC32();
		this.field4394 = new Archive[256];
		this.field4383 = -1;
		this.field4396 = 255;
		this.field4397 = 0;
		this.field4377 = 0;
		this.field4398 = 0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1661624624"
	)
	public boolean method7139() {
		long var1 = UserComparator9.method2973();
		int var3 = (int)(var1 - this.field4380);
		this.field4380 = var1;
		if (var3 > 200) {
			var3 = 200;
		}

		this.field4375 += var3;
		if (this.field4385 == 0 && this.field4390 == 0 && this.field4374 == 0 && this.field4378 == 0) {
			return true;
		} else if (this.field4376 == null) {
			return false;
		} else {
			try {
				if (this.field4375 > 30000) {
					throw new IOException();
				} else {
					class373 var4;
					Buffer var5;
					while (this.field4390 < 200 && this.field4378 > 0) {
						var4 = (class373)this.field4392.first();
						var5 = new Buffer(4);
						var5.writeByte(1);
						var5.writeMedium((int)var4.key);
						this.field4376.write(var5.array, 0, 4);
						this.field4379.put(var4, var4.key);
						--this.field4378;
						++this.field4390;
					}

					while (this.field4385 < 200 && this.field4374 > 0) {
						var4 = (class373)this.field4381.removeLast();
						var5 = new Buffer(4);
						var5.writeByte(0);
						var5.writeMedium((int)var4.key);
						this.field4376.write(var5.array, 0, 4);
						var4.removeDual();
						this.field4384.put(var4, var4.key);
						--this.field4374;
						++this.field4385;
					}

					for (int var16 = 0; var16 < 100; ++var16) {
						int var17 = this.field4376.available();
						if (var17 < 0) {
							throw new IOException();
						}

						if (var17 == 0) {
							break;
						}

						this.field4375 = 0;
						byte var6 = 0;
						if (this.field4387 == null) {
							var6 = 8;
						} else if (this.field4388 == 0) {
							var6 = 1;
						}

						int var7;
						int var8;
						int var9;
						byte[] var10000;
						int var10001;
						Buffer var22;
						if (var6 > 0) {
							var7 = var6 - this.field4395.offset;
							if (var7 > var17) {
								var7 = var17;
							}

							this.field4376.read(this.field4395.array, this.field4395.offset, var7);
							if (this.field4397 != 0) {
								for (var8 = 0; var8 < var7; ++var8) {
									var10000 = this.field4395.array;
									var10001 = var8 + this.field4395.offset;
									var10000[var10001] ^= this.field4397;
								}
							}

							var22 = this.field4395;
							var22.offset += var7;
							if (this.field4395.offset < var6) {
								break;
							}

							if (this.field4387 == null) {
								this.field4395.offset = 0;
								var8 = this.field4395.readUnsignedByte();
								var9 = this.field4395.readUnsignedShort();
								int var10 = this.field4395.readUnsignedByte();
								int var11 = this.field4395.readInt();
								long var12 = (long)(var9 + (var8 << 16));
								class373 var14 = (class373)this.field4379.get(var12);
								this.field4386 = true;
								if (var14 == null) {
									var14 = (class373)this.field4384.get(var12);
									this.field4386 = false;
								}

								if (var14 == null) {
									throw new IOException();
								}

								int var15 = var10 == 0 ? 5 : 9;
								this.field4387 = var14;
								this.field4389 = new Buffer(this.field4387.field4353 + var11 + var15);
								this.field4389.writeByte(var10);
								this.field4389.writeInt(var11);
								this.field4388 = 8;
								this.field4395.offset = 0;
							} else if (this.field4388 == 0) {
								if (this.field4395.array[0] == -1) {
									this.field4388 = 1;
									this.field4395.offset = 0;
								} else {
									this.field4387 = null;
								}
							}
						} else {
							var7 = this.field4389.array.length - this.field4387.field4353;
							var8 = 512 - this.field4388;
							if (var8 > var7 - this.field4389.offset) {
								var8 = var7 - this.field4389.offset;
							}

							if (var8 > var17) {
								var8 = var17;
							}

							this.field4376.read(this.field4389.array, this.field4389.offset, var8);
							if (this.field4397 != 0) {
								for (var9 = 0; var9 < var8; ++var9) {
									var10000 = this.field4389.array;
									var10001 = this.field4389.offset + var9;
									var10000[var10001] ^= this.field4397;
								}
							}

							var22 = this.field4389;
							var22.offset += var8;
							this.field4388 += var8;
							if (this.field4389.offset == var7) {
								if (this.field4387.key == 16711935L) {
									this.field4393 = this.field4389;

									for (var9 = 0; var9 < 256; ++var9) {
										Archive var18 = this.field4394[var9];
										if (var18 != null) {
											this.method7129(var18, var9);
										}
									}
								} else {
									this.field4399.reset();
									this.field4399.update(this.field4389.array, 0, var7);
									var9 = (int)this.field4399.getValue();
									if (this.field4387.field4354 != var9) {
										try {
											this.field4376.close();
										} catch (Exception var20) {
										}

										++this.field4377;
										this.field4376 = null;
										this.field4397 = (byte)((int)(Math.random() * 255.0D + 1.0D));
										return false;
									}

									this.field4377 = 0;
									this.field4398 = 0;
									this.field4387.field4352.write((int)(this.field4387.key & 65535L), this.field4389.array, 16711680L == (this.field4387.key & 16711680L), this.field4386);
								}

								this.field4387.remove();
								if (this.field4386) {
									--this.field4390;
								} else {
									--this.field4385;
								}

								this.field4388 = 0;
								this.field4387 = null;
								this.field4389 = null;
							} else {
								if (this.field4388 != 512) {
									break;
								}

								this.field4388 = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var21) {
				try {
					this.field4376.close();
				} catch (Exception var19) {
				}

				++this.field4398;
				this.field4376 = null;
				return false;
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-115"
	)
	public void method7126(boolean var1) {
		if (this.field4376 != null) {
			try {
				Buffer var2 = new Buffer(4);
				var2.writeByte(var1 ? 2 : 3);
				var2.writeMedium(0);
				this.field4376.write(var2.array, 0, 4);
			} catch (IOException var5) {
				try {
					this.field4376.close();
				} catch (Exception var4) {
				}

				++this.field4398;
				this.field4376 = null;
			}

		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lri;ZB)V",
		garbageValue = "-117"
	)
	public void method7127(AbstractSocket var1, boolean var2) {
		if (this.field4376 != null) {
			try {
				this.field4376.close();
			} catch (Exception var7) {
			}

			this.field4376 = null;
		}

		this.field4376 = var1;
		this.method7126(var2);
		this.field4395.offset = 0;
		this.field4387 = null;
		this.field4389 = null;
		this.field4388 = 0;

		while (true) {
			class373 var3 = (class373)this.field4379.first();
			if (var3 == null) {
				while (true) {
					var3 = (class373)this.field4384.first();
					if (var3 == null) {
						if (this.field4397 != 0) {
							try {
								Buffer var8 = new Buffer(4);
								var8.writeByte(4);
								var8.writeByte(this.field4397);
								var8.writeShort(0);
								this.field4376.write(var8.array, 0, 4);
							} catch (IOException var6) {
								try {
									this.field4376.close();
								} catch (Exception var5) {
								}

								++this.field4398;
								this.field4376 = null;
							}
						}

						this.field4375 = 0;
						this.field4380 = UserComparator9.method2973();
						return;
					}

					this.field4381.method7309(var3);
					this.field4382.put(var3, var3.key);
					++this.field4374;
					--this.field4385;
				}
			}

			this.field4392.put(var3, var3.key);
			++this.field4378;
			--this.field4390;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Loz;II)V",
		garbageValue = "-664243707"
	)
	void method7125(Archive var1, int var2) {
		if (var1.field4348 && !var1.field4349) {
			if (var2 <= this.field4383) {
				throw new RuntimeException("");
			}

			if (var2 < this.field4396) {
				this.field4396 = var2;
			}
		} else {
			if (var2 >= this.field4396) {
				throw new RuntimeException("");
			}

			if (var2 > this.field4383) {
				this.field4383 = var2;
			}
		}

		if (this.field4393 != null) {
			this.method7129(var1, var2);
		} else {
			this.method7136((Archive)null, 255, 255, 0, (byte)0, true);
			this.field4394[var2] = var1;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Loz;II)V",
		garbageValue = "-6662946"
	)
	void method7129(Archive var1, int var2) {
		this.field4393.offset = var2 * 8 + 5;
		if (this.field4393.offset >= this.field4393.array.length) {
			if (var1.field4348) {
				var1.method7014();
			} else {
				throw new RuntimeException("");
			}
		} else {
			int var3 = this.field4393.readInt();
			int var4 = this.field4393.readInt();
			var1.loadIndex(var3, var4);
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Loz;IIIBZB)V",
		garbageValue = "-21"
	)
	void method7136(Archive var1, int var2, int var3, int var4, byte var5, boolean var6) {
		long var7 = (long)(var3 + (var2 << 16));
		class373 var9 = (class373)this.field4392.get(var7);
		if (var9 == null) {
			var9 = (class373)this.field4379.get(var7);
			if (var9 == null) {
				var9 = (class373)this.field4382.get(var7);
				if (var9 != null) {
					if (var6) {
						var9.removeDual();
						this.field4392.put(var9, var7);
						--this.field4374;
						++this.field4378;
					}

				} else {
					if (!var6) {
						var9 = (class373)this.field4384.get(var7);
						if (var9 != null) {
							return;
						}
					}

					var9 = new class373();
					var9.field4352 = var1;
					var9.field4354 = var4;
					var9.field4353 = var5;
					if (var6) {
						this.field4392.put(var9, var7);
						++this.field4378;
					} else {
						this.field4381.method7310(var9);
						this.field4382.put(var9, var7);
						++this.field4374;
					}

				}
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "18001"
	)
	void method7133(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		class373 var5 = (class373)this.field4382.get(var3);
		if (var5 != null) {
			this.field4381.method7309(var5);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "986043639"
	)
	int method7132(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		return this.field4387 != null && var3 == this.field4387.key ? this.field4389.offset * 99 / (this.field4389.array.length - this.field4387.field4353) + 1 : 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ZZB)I",
		garbageValue = "37"
	)
	public int method7146(boolean var1, boolean var2) {
		byte var3 = 0;
		int var4 = var3 + this.field4390 + this.field4378;
		return var4;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "12032"
	)
	public void method7134() {
		if (this.field4376 != null) {
			this.field4376.close();
		}

	}
}
