import java.io.IOException;
import java.util.zip.CRC32;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oo")
@Implements("JagNetThread")
public class JagNetThread {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	AbstractSocket field4341;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1124398085
	)
	int field4349;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		longValue = -6457768251632415827L
	)
	long field4342;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	NodeHashTable field4343;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -681120725
	)
	int field4365;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	NodeHashTable field4345;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 219618431
	)
	int field4346;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	DualNodeDeque field4347;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	NodeHashTable field4348;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 970560235
	)
	int field4358;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ltf;"
	)
	NodeHashTable field4350;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 444442581
	)
	int field4351;
	@ObfuscatedName("ap")
	boolean field4352;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lou;"
	)
	class372 field4340;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lul;"
	)
	Buffer field4354;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lul;"
	)
	Buffer field4355;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1081663389
	)
	int field4344;
	@ObfuscatedName("ai")
	CRC32 field4353;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lul;"
	)
	Buffer field4360;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lok;"
	)
	Archive[] field4359;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 231357973
	)
	int field4361;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 35787895
	)
	int field4362;
	@ObfuscatedName("at")
	byte field4363;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 2001722695
	)
	public int field4364;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -414989845
	)
	public int field4356;

	public JagNetThread() {
		this.field4349 = 0;
		this.field4343 = new NodeHashTable(4096);
		this.field4365 = 0;
		this.field4345 = new NodeHashTable(32);
		this.field4346 = 0;
		this.field4347 = new DualNodeDeque();
		this.field4348 = new NodeHashTable(4096);
		this.field4358 = 0;
		this.field4350 = new NodeHashTable(4096);
		this.field4351 = 0;
		this.field4354 = new Buffer(8);
		this.field4344 = 0;
		this.field4353 = new CRC32();
		this.field4359 = new Archive[256];
		this.field4361 = -1;
		this.field4362 = 255;
		this.field4363 = 0;
		this.field4364 = 0;
		this.field4356 = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "877525740"
	)
	public boolean method7027() {
		long var1 = GrandExchangeOfferTotalQuantityComparator.method7049();
		int var3 = (int)(var1 - this.field4342);
		this.field4342 = var1;
		if (var3 > 200) {
			var3 = 200;
		}

		this.field4349 += var3;
		if (this.field4351 == 0 && this.field4346 == 0 && this.field4358 == 0 && this.field4365 == 0) {
			return true;
		} else if (this.field4341 == null) {
			return false;
		} else {
			try {
				if (this.field4349 > 30000) {
					throw new IOException();
				} else {
					class372 var4;
					Buffer var5;
					while (this.field4346 < 200 && this.field4365 > 0) {
						var4 = (class372)this.field4343.first();
						var5 = new Buffer(4);
						var5.writeByte(1);
						var5.writeMedium((int)var4.key);
						this.field4341.write(var5.array, 0, 4);
						this.field4345.put(var4, var4.key);
						--this.field4365;
						++this.field4346;
					}

					while (this.field4351 < 200 && this.field4358 > 0) {
						var4 = (class372)this.field4347.removeLast();
						var5 = new Buffer(4);
						var5.writeByte(0);
						var5.writeMedium((int)var4.key);
						this.field4341.write(var5.array, 0, 4);
						var4.removeDual();
						this.field4350.put(var4, var4.key);
						--this.field4358;
						++this.field4351;
					}

					for (int var16 = 0; var16 < 100; ++var16) {
						int var17 = this.field4341.available();
						if (var17 < 0) {
							throw new IOException();
						}

						if (var17 == 0) {
							break;
						}

						this.field4349 = 0;
						byte var6 = 0;
						if (this.field4340 == null) {
							var6 = 8;
						} else if (this.field4344 == 0) {
							var6 = 1;
						}

						int var7;
						int var8;
						int var9;
						byte[] var10000;
						int var10001;
						Buffer var22;
						if (var6 > 0) {
							var7 = var6 - this.field4354.offset;
							if (var7 > var17) {
								var7 = var17;
							}

							this.field4341.read(this.field4354.array, this.field4354.offset, var7);
							if (this.field4363 != 0) {
								for (var8 = 0; var8 < var7; ++var8) {
									var10000 = this.field4354.array;
									var10001 = var8 + this.field4354.offset;
									var10000[var10001] ^= this.field4363;
								}
							}

							var22 = this.field4354;
							var22.offset += var7;
							if (this.field4354.offset < var6) {
								break;
							}

							if (this.field4340 == null) {
								this.field4354.offset = 0;
								var8 = this.field4354.readUnsignedByte();
								var9 = this.field4354.readUnsignedShort();
								int var10 = this.field4354.readUnsignedByte();
								int var11 = this.field4354.readInt();
								long var12 = (long)(var9 + (var8 << 16));
								class372 var14 = (class372)this.field4345.get(var12);
								this.field4352 = true;
								if (var14 == null) {
									var14 = (class372)this.field4350.get(var12);
									this.field4352 = false;
								}

								if (var14 == null) {
									throw new IOException();
								}

								int var15 = var10 == 0 ? 5 : 9;
								this.field4340 = var14;
								this.field4355 = new Buffer(this.field4340.field4320 + var15 + var11);
								this.field4355.writeByte(var10);
								this.field4355.writeInt(var11);
								this.field4344 = 8;
								this.field4354.offset = 0;
							} else if (this.field4344 == 0) {
								if (this.field4354.array[0] == -1) {
									this.field4344 = 1;
									this.field4354.offset = 0;
								} else {
									this.field4340 = null;
								}
							}
						} else {
							var7 = this.field4355.array.length - this.field4340.field4320;
							var8 = 512 - this.field4344;
							if (var8 > var7 - this.field4355.offset) {
								var8 = var7 - this.field4355.offset;
							}

							if (var8 > var17) {
								var8 = var17;
							}

							this.field4341.read(this.field4355.array, this.field4355.offset, var8);
							if (this.field4363 != 0) {
								for (var9 = 0; var9 < var8; ++var9) {
									var10000 = this.field4355.array;
									var10001 = var9 + this.field4355.offset;
									var10000[var10001] ^= this.field4363;
								}
							}

							var22 = this.field4355;
							var22.offset += var8;
							this.field4344 += var8;
							if (this.field4355.offset == var7) {
								if (16711935L == this.field4340.key) {
									this.field4360 = this.field4355;

									for (var9 = 0; var9 < 256; ++var9) {
										Archive var18 = this.field4359[var9];
										if (var18 != null) {
											this.method6999(var18, var9);
										}
									}
								} else {
									this.field4353.reset();
									this.field4353.update(this.field4355.array, 0, var7);
									var9 = (int)this.field4353.getValue();
									if (this.field4340.field4321 != var9) {
										try {
											this.field4341.close();
										} catch (Exception var20) {
										}

										++this.field4364;
										this.field4341 = null;
										this.field4363 = (byte)((int)(Math.random() * 255.0D + 1.0D));
										return false;
									}

									this.field4364 = 0;
									this.field4356 = 0;
									this.field4340.field4319.write((int)(this.field4340.key & 65535L), this.field4355.array, (this.field4340.key & 16711680L) == 16711680L, this.field4352);
								}

								this.field4340.remove();
								if (this.field4352) {
									--this.field4346;
								} else {
									--this.field4351;
								}

								this.field4344 = 0;
								this.field4340 = null;
								this.field4355 = null;
							} else {
								if (this.field4344 != 512) {
									break;
								}

								this.field4344 = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var21) {
				try {
					this.field4341.close();
				} catch (Exception var19) {
				}

				++this.field4356;
				this.field4341 = null;
				return false;
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "1"
	)
	public void method7000(boolean var1) {
		if (this.field4341 != null) {
			try {
				Buffer var2 = new Buffer(4);
				var2.writeByte(var1 ? 2 : 3);
				var2.writeMedium(0);
				this.field4341.write(var2.array, 0, 4);
			} catch (IOException var5) {
				try {
					this.field4341.close();
				} catch (Exception var4) {
				}

				++this.field4356;
				this.field4341 = null;
			}

		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lre;ZB)V",
		garbageValue = "-76"
	)
	public void method7001(AbstractSocket var1, boolean var2) {
		if (this.field4341 != null) {
			try {
				this.field4341.close();
			} catch (Exception var7) {
			}

			this.field4341 = null;
		}

		this.field4341 = var1;
		this.method7000(var2);
		this.field4354.offset = 0;
		this.field4340 = null;
		this.field4355 = null;
		this.field4344 = 0;

		while (true) {
			class372 var3 = (class372)this.field4345.first();
			if (var3 == null) {
				while (true) {
					var3 = (class372)this.field4350.first();
					if (var3 == null) {
						if (this.field4363 != 0) {
							try {
								Buffer var8 = new Buffer(4);
								var8.writeByte(4);
								var8.writeByte(this.field4363);
								var8.writeShort(0);
								this.field4341.write(var8.array, 0, 4);
							} catch (IOException var6) {
								try {
									this.field4341.close();
								} catch (Exception var5) {
								}

								++this.field4356;
								this.field4341 = null;
							}
						}

						this.field4349 = 0;
						this.field4342 = GrandExchangeOfferTotalQuantityComparator.method7049();
						return;
					}

					this.field4347.method7185(var3);
					this.field4348.put(var3, var3.key);
					++this.field4358;
					--this.field4351;
				}
			}

			this.field4343.put(var3, var3.key);
			++this.field4365;
			--this.field4346;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lok;II)V",
		garbageValue = "-699589985"
	)
	void method7002(Archive var1, int var2) {
		if (var1.field4315 && !var1.field4316) {
			if (var2 <= this.field4361) {
				throw new RuntimeException("");
			}

			if (var2 < this.field4362) {
				this.field4362 = var2;
			}
		} else {
			if (var2 >= this.field4362) {
				throw new RuntimeException("");
			}

			if (var2 > this.field4361) {
				this.field4361 = var2;
			}
		}

		if (this.field4360 != null) {
			this.method6999(var1, var2);
		} else {
			this.method7004((Archive)null, 255, 255, 0, (byte)0, true);
			this.field4359[var2] = var1;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lok;II)V",
		garbageValue = "-1352429107"
	)
	void method6999(Archive var1, int var2) {
		this.field4360.offset = var2 * 8 + 5;
		if (this.field4360.offset >= this.field4360.array.length) {
			if (var1.field4315) {
				var1.method6860();
			} else {
				throw new RuntimeException("");
			}
		} else {
			int var3 = this.field4360.readInt();
			int var4 = this.field4360.readInt();
			var1.loadIndex(var3, var4);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lok;IIIBZI)V",
		garbageValue = "-1546984161"
	)
	void method7004(Archive var1, int var2, int var3, int var4, byte var5, boolean var6) {
		long var7 = (long)(var3 + (var2 << 16));
		class372 var9 = (class372)this.field4343.get(var7);
		if (var9 == null) {
			var9 = (class372)this.field4345.get(var7);
			if (var9 == null) {
				var9 = (class372)this.field4348.get(var7);
				if (var9 != null) {
					if (var6) {
						var9.removeDual();
						this.field4343.put(var9, var7);
						--this.field4358;
						++this.field4365;
					}

				} else {
					if (!var6) {
						var9 = (class372)this.field4350.get(var7);
						if (var9 != null) {
							return;
						}
					}

					var9 = new class372();
					var9.field4319 = var1;
					var9.field4321 = var4;
					var9.field4320 = var5;
					if (var6) {
						this.field4343.put(var9, var7);
						++this.field4365;
					} else {
						this.field4347.method7184(var9);
						this.field4348.put(var9, var7);
						++this.field4358;
					}

				}
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "223399065"
	)
	void method7005(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		class372 var5 = (class372)this.field4348.get(var3);
		if (var5 != null) {
			this.field4347.method7185(var5);
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "823173998"
	)
	int method7006(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		return this.field4340 != null && var3 == this.field4340.key ? this.field4355.offset * 99 / (this.field4355.array.length - this.field4340.field4320) + 1 : 0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ZZB)I",
		garbageValue = "-84"
	)
	public int method7007(boolean var1, boolean var2) {
		byte var3 = 0;
		int var4 = var3 + this.field4346 + this.field4365;
		return var4;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "45"
	)
	public void method7008() {
		if (this.field4341 != null) {
			this.field4341.close();
		}

	}
}
