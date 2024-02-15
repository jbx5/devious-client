import java.io.IOException;
import java.util.zip.CRC32;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ot")
@Implements("JagNetThread")
public class JagNetThread {
	@ObfuscatedName("ia")
	@ObfuscatedGetter(
		intValue = 533169709
	)
	static int field4434;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lrr;"
	)
	AbstractSocket field4409;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 185234751
	)
	int field4410;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = 1041861590998961167L
	)
	long field4411;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	NodeHashTable field4407;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1866097039
	)
	int field4413;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	NodeHashTable field4414;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -429867019
	)
	int field4415;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpd;"
	)
	DualNodeDeque field4419;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	NodeHashTable field4417;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1322847467
	)
	int field4418;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	NodeHashTable field4423;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -692620981
	)
	int field4428;
	@ObfuscatedName("am")
	boolean field4431;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Log;"
	)
	class376 field4422;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	Buffer field4421;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	Buffer field4424;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1041918623
	)
	int field4425;
	@ObfuscatedName("ab")
	CRC32 field4426;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Luq;"
	)
	Buffer field4427;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lom;"
	)
	Archive[] field4412;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -671057713
	)
	int field4429;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 547118089
	)
	int field4430;
	@ObfuscatedName("bd")
	byte field4420;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 288994003
	)
	public int field4416;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1534428973
	)
	public int field4433;

	public JagNetThread() {
		this.field4410 = 0;
		this.field4407 = new NodeHashTable(4096);
		this.field4413 = 0;
		this.field4414 = new NodeHashTable(32);
		this.field4415 = 0;
		this.field4419 = new DualNodeDeque();
		this.field4417 = new NodeHashTable(4096);
		this.field4418 = 0;
		this.field4423 = new NodeHashTable(4096);
		this.field4428 = 0;
		this.field4421 = new Buffer(8);
		this.field4425 = 0;
		this.field4426 = new CRC32();
		this.field4412 = new Archive[256];
		this.field4429 = -1;
		this.field4430 = 255;
		this.field4420 = 0;
		this.field4416 = 0;
		this.field4433 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1381298903"
	)
	public boolean method7210() {
		long var1 = SecureRandomCallable.method2320();
		int var3 = (int)(var1 - this.field4411);
		this.field4411 = var1;
		if (var3 > 200) {
			var3 = 200;
		}

		this.field4410 += var3;
		if (this.field4428 == 0 && this.field4415 == 0 && this.field4418 == 0 && this.field4413 == 0) {
			return true;
		} else if (this.field4409 == null) {
			return false;
		} else {
			try {
				if (this.field4410 > 30000) {
					throw new IOException();
				} else {
					class376 var4;
					Buffer var5;
					while (this.field4415 < 200 && this.field4413 > 0) {
						var4 = (class376)this.field4407.first();
						var5 = new Buffer(4);
						var5.writeByte(1);
						var5.writeMedium((int)var4.key);
						this.field4409.write(var5.array, 0, 4);
						this.field4414.put(var4, var4.key);
						--this.field4413;
						++this.field4415;
					}

					while (this.field4428 < 200 && this.field4418 > 0) {
						var4 = (class376)this.field4419.removeLast();
						var5 = new Buffer(4);
						var5.writeByte(0);
						var5.writeMedium((int)var4.key);
						this.field4409.write(var5.array, 0, 4);
						var4.removeDual();
						this.field4423.put(var4, var4.key);
						--this.field4418;
						++this.field4428;
					}

					for (int var16 = 0; var16 < 100; ++var16) {
						int var17 = this.field4409.available();
						if (var17 < 0) {
							throw new IOException();
						}

						if (var17 == 0) {
							break;
						}

						this.field4410 = 0;
						byte var6 = 0;
						if (this.field4422 == null) {
							var6 = 8;
						} else if (this.field4425 == 0) {
							var6 = 1;
						}

						int var7;
						int var8;
						int var9;
						byte[] var10000;
						int var10001;
						Buffer var22;
						if (var6 > 0) {
							var7 = var6 - this.field4421.offset;
							if (var7 > var17) {
								var7 = var17;
							}

							this.field4409.read(this.field4421.array, this.field4421.offset, var7);
							if (this.field4420 != 0) {
								for (var8 = 0; var8 < var7; ++var8) {
									var10000 = this.field4421.array;
									var10001 = var8 + this.field4421.offset;
									var10000[var10001] ^= this.field4420;
								}
							}

							var22 = this.field4421;
							var22.offset += var7;
							if (this.field4421.offset < var6) {
								break;
							}

							if (this.field4422 == null) {
								this.field4421.offset = 0;
								var8 = this.field4421.readUnsignedByte();
								var9 = this.field4421.readUnsignedShort();
								int var10 = this.field4421.readUnsignedByte();
								int var11 = this.field4421.readInt();
								long var12 = (long)(var9 + (var8 << 16));
								class376 var14 = (class376)this.field4414.get(var12);
								this.field4431 = true;
								if (var14 == null) {
									var14 = (class376)this.field4423.get(var12);
									this.field4431 = false;
								}

								if (var14 == null) {
									throw new IOException();
								}

								int var15 = var10 == 0 ? 5 : 9;
								this.field4422 = var14;
								this.field4424 = new Buffer(this.field4422.field4386 + var11 + var15);
								this.field4424.writeByte(var10);
								this.field4424.writeInt(var11);
								this.field4425 = 8;
								this.field4421.offset = 0;
							} else if (this.field4425 == 0) {
								if (this.field4421.array[0] == -1) {
									this.field4425 = 1;
									this.field4421.offset = 0;
								} else {
									this.field4422 = null;
								}
							}
						} else {
							var7 = this.field4424.array.length - this.field4422.field4386;
							var8 = 512 - this.field4425;
							if (var8 > var7 - this.field4424.offset) {
								var8 = var7 - this.field4424.offset;
							}

							if (var8 > var17) {
								var8 = var17;
							}

							this.field4409.read(this.field4424.array, this.field4424.offset, var8);
							if (this.field4420 != 0) {
								for (var9 = 0; var9 < var8; ++var9) {
									var10000 = this.field4424.array;
									var10001 = this.field4424.offset + var9;
									var10000[var10001] ^= this.field4420;
								}
							}

							var22 = this.field4424;
							var22.offset += var8;
							this.field4425 += var8;
							if (this.field4424.offset == var7) {
								if (16711935L == this.field4422.key) {
									this.field4427 = this.field4424;

									for (var9 = 0; var9 < 256; ++var9) {
										Archive var18 = this.field4412[var9];
										if (var18 != null) {
											this.method7214(var18, var9);
										}
									}
								} else {
									this.field4426.reset();
									this.field4426.update(this.field4424.array, 0, var7);
									var9 = (int)this.field4426.getValue();
									if (this.field4422.field4384 != var9) {
										try {
											this.field4409.close();
										} catch (Exception var20) {
										}

										++this.field4416;
										this.field4409 = null;
										this.field4420 = (byte)((int)(Math.random() * 255.0D + 1.0D));
										return false;
									}

									this.field4416 = 0;
									this.field4433 = 0;
									this.field4422.field4385.write((int)(this.field4422.key & 65535L), this.field4424.array, 16711680L == (this.field4422.key & 16711680L), this.field4431);
								}

								this.field4422.remove();
								if (this.field4431) {
									--this.field4415;
								} else {
									--this.field4428;
								}

								this.field4425 = 0;
								this.field4422 = null;
								this.field4424 = null;
							} else {
								if (this.field4425 != 512) {
									break;
								}

								this.field4425 = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var21) {
				try {
					this.field4409.close();
				} catch (Exception var19) {
				}

				++this.field4433;
				this.field4409 = null;
				return false;
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "3"
	)
	public void method7212(boolean var1) {
		if (this.field4409 != null) {
			try {
				Buffer var2 = new Buffer(4);
				var2.writeByte(var1 ? 2 : 3);
				var2.writeMedium(0);
				this.field4409.write(var2.array, 0, 4);
			} catch (IOException var5) {
				try {
					this.field4409.close();
				} catch (Exception var4) {
				}

				++this.field4433;
				this.field4409 = null;
			}

		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lrr;ZI)V",
		garbageValue = "1973212289"
	)
	public void method7218(AbstractSocket var1, boolean var2) {
		if (this.field4409 != null) {
			try {
				this.field4409.close();
			} catch (Exception var7) {
			}

			this.field4409 = null;
		}

		this.field4409 = var1;
		this.method7212(var2);
		this.field4421.offset = 0;
		this.field4422 = null;
		this.field4424 = null;
		this.field4425 = 0;

		while (true) {
			class376 var3 = (class376)this.field4414.first();
			if (var3 == null) {
				while (true) {
					var3 = (class376)this.field4423.first();
					if (var3 == null) {
						if (this.field4420 != 0) {
							try {
								Buffer var8 = new Buffer(4);
								var8.writeByte(4);
								var8.writeByte(this.field4420);
								var8.writeShort(0);
								this.field4409.write(var8.array, 0, 4);
							} catch (IOException var6) {
								try {
									this.field4409.close();
								} catch (Exception var5) {
								}

								++this.field4433;
								this.field4409 = null;
							}
						}

						this.field4410 = 0;
						this.field4411 = SecureRandomCallable.method2320();
						return;
					}

					this.field4419.method7381(var3);
					this.field4417.put(var3, var3.key);
					++this.field4418;
					--this.field4428;
				}
			}

			this.field4407.put(var3, var3.key);
			++this.field4413;
			--this.field4415;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lom;IB)V",
		garbageValue = "-50"
	)
	void method7225(Archive var1, int var2) {
		if (var1.field4382 && !var1.field4381) {
			if (var2 <= this.field4429) {
				throw new RuntimeException("");
			}

			if (var2 < this.field4430) {
				this.field4430 = var2;
			}
		} else {
			if (var2 >= this.field4430) {
				throw new RuntimeException("");
			}

			if (var2 > this.field4429) {
				this.field4429 = var2;
			}
		}

		if (this.field4427 != null) {
			this.method7214(var1, var2);
		} else {
			this.method7220((Archive)null, 255, 255, 0, (byte)0, true);
			this.field4412[var2] = var1;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lom;II)V",
		garbageValue = "1747803025"
	)
	void method7214(Archive var1, int var2) {
		this.field4427.offset = var2 * 8 + 5;
		if (this.field4427.offset >= this.field4427.array.length) {
			if (var1.field4382) {
				var1.method7053();
			} else {
				throw new RuntimeException("");
			}
		} else {
			int var3 = this.field4427.readInt();
			int var4 = this.field4427.readInt();
			var1.loadIndex(var3, var4);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lom;IIIBZS)V",
		garbageValue = "-12032"
	)
	void method7220(Archive var1, int var2, int var3, int var4, byte var5, boolean var6) {
		long var7 = (long)(var3 + (var2 << 16));
		class376 var9 = (class376)this.field4407.get(var7);
		if (var9 == null) {
			var9 = (class376)this.field4414.get(var7);
			if (var9 == null) {
				var9 = (class376)this.field4417.get(var7);
				if (var9 != null) {
					if (var6) {
						var9.removeDual();
						this.field4407.put(var9, var7);
						--this.field4418;
						++this.field4413;
					}

				} else {
					if (!var6) {
						var9 = (class376)this.field4423.get(var7);
						if (var9 != null) {
							return;
						}
					}

					var9 = new class376();
					var9.field4385 = var1;
					var9.field4384 = var4;
					var9.field4386 = var5;
					if (var6) {
						this.field4407.put(var9, var7);
						++this.field4413;
					} else {
						this.field4419.method7379(var9);
						this.field4417.put(var9, var7);
						++this.field4418;
					}

				}
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1602227051"
	)
	void method7216(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		class376 var5 = (class376)this.field4417.get(var3);
		if (var5 != null) {
			this.field4419.method7381(var5);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-725249284"
	)
	int method7217(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		return this.field4422 != null && this.field4422.key == var3 ? this.field4424.offset * 99 / (this.field4424.array.length - this.field4422.field4386) + 1 : 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ZZI)I",
		garbageValue = "1411825896"
	)
	public int method7211(boolean var1, boolean var2) {
		byte var3 = 0;
		int var4 = var3 + this.field4413 + this.field4415;
		return var4;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2003230890"
	)
	public void method7213() {
		if (this.field4409 != null) {
			try {
				this.field4409.close();
			} catch (Exception var2) {
			}

			this.field4409 = null;
		}

	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-35"
	)
	static int method7241(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field890 - 7.0D) * 256.0D);
	}
}
