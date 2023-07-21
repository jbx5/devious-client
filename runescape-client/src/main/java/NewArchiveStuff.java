import java.io.IOException;
import java.util.zip.CRC32;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nq")
@Implements("NewArchiveStuff")
public class NewArchiveStuff {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lqh;"
	)
	AbstractSocket field4309;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1326278367
	)
	int field4296;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = 5111253564935352545L
	)
	long field4319;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lsm;"
	)
	NodeHashTable field4315;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1733862673
	)
	int field4310;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lsm;"
	)
	NodeHashTable field4300;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1885285113
	)
	int field4301;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	DualNodeDeque field4302;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lsm;"
	)
	NodeHashTable field4303;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 559168533
	)
	int field4304;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lsm;"
	)
	NodeHashTable field4305;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1580470631
	)
	int field4297;
	@ObfuscatedName("ah")
	boolean field4307;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	class358 field4308;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	Buffer field4299;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	Buffer field4314;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1812214555
	)
	int field4311;
	@ObfuscatedName("ad")
	CRC32 field4312;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	Buffer field4295;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lny;"
	)
	Archive[] field4306;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1132099311
	)
	int field4316;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 453148723
	)
	int field4313;
	@ObfuscatedName("af")
	byte field4317;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1233230695
	)
	public int field4318;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1207655929
	)
	public int field4298;

	public NewArchiveStuff() {
		this.field4296 = 0;
		this.field4315 = new NodeHashTable(4096);
		this.field4310 = 0;
		this.field4300 = new NodeHashTable(32);
		this.field4301 = 0;
		this.field4302 = new DualNodeDeque();
		this.field4303 = new NodeHashTable(4096);
		this.field4304 = 0;
		this.field4305 = new NodeHashTable(4096);
		this.field4297 = 0;
		this.field4299 = new Buffer(8);
		this.field4311 = 0;
		this.field4312 = new CRC32();
		this.field4306 = new Archive[256];
		this.field4316 = -1;
		this.field4313 = 255;
		this.field4317 = 0;
		this.field4318 = 0;
		this.field4298 = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-1782"
	)
	public boolean method6858() {
		long var1 = class113.method2835();
		int var3 = (int)(var1 - this.field4319);
		this.field4319 = var1;
		if (var3 > 200) {
			var3 = 200;
		}

		this.field4296 += var3;
		if (this.field4297 == 0 && this.field4301 == 0 && this.field4304 == 0 && this.field4310 == 0) {
			return true;
		} else if (this.field4309 == null) {
			return false;
		} else {
			try {
				if (this.field4296 > 30000) {
					throw new IOException();
				} else {
					class358 var4;
					Buffer var5;
					while (this.field4301 < 200 && this.field4310 > 0) {
						var4 = (class358)this.field4315.first();
						var5 = new Buffer(4);
						var5.writeByte(1);
						var5.writeMedium((int)var4.key);
						this.field4309.write(var5.array, 0, 4);
						this.field4300.put(var4, var4.key);
						--this.field4310;
						++this.field4301;
					}

					while (this.field4297 < 200 && this.field4304 > 0) {
						var4 = (class358)this.field4302.removeLast();
						var5 = new Buffer(4);
						var5.writeByte(0);
						var5.writeMedium((int)var4.key);
						this.field4309.write(var5.array, 0, 4);
						var4.removeDual();
						this.field4305.put(var4, var4.key);
						--this.field4304;
						++this.field4297;
					}

					for (int var16 = 0; var16 < 100; ++var16) {
						int var17 = this.field4309.available();
						if (var17 < 0) {
							throw new IOException();
						}

						if (var17 == 0) {
							break;
						}

						this.field4296 = 0;
						byte var6 = 0;
						if (this.field4308 == null) {
							var6 = 8;
						} else if (this.field4311 == 0) {
							var6 = 1;
						}

						int var7;
						int var8;
						int var9;
						byte[] var10000;
						int var10001;
						Buffer var22;
						if (var6 > 0) {
							var7 = var6 - this.field4299.offset;
							if (var7 > var17) {
								var7 = var17;
							}

							this.field4309.read(this.field4299.array, this.field4299.offset, var7);
							if (this.field4317 != 0) {
								for (var8 = 0; var8 < var7; ++var8) {
									var10000 = this.field4299.array;
									var10001 = this.field4299.offset + var8;
									var10000[var10001] ^= this.field4317;
								}
							}

							var22 = this.field4299;
							var22.offset += var7;
							if (this.field4299.offset < var6) {
								break;
							}

							if (this.field4308 == null) {
								this.field4299.offset = 0;
								var8 = this.field4299.readUnsignedByte();
								var9 = this.field4299.readUnsignedShort();
								int var10 = this.field4299.readUnsignedByte();
								int var11 = this.field4299.readInt();
								long var12 = (long)(var9 + (var8 << 16));
								class358 var14 = (class358)this.field4300.get(var12);
								this.field4307 = true;
								if (var14 == null) {
									var14 = (class358)this.field4305.get(var12);
									this.field4307 = false;
								}

								if (var14 == null) {
									throw new IOException();
								}

								int var15 = var10 == 0 ? 5 : 9;
								this.field4308 = var14;
								this.field4314 = new Buffer(this.field4308.field4270 + var15 + var11);
								this.field4314.writeByte(var10);
								this.field4314.writeInt(var11);
								this.field4311 = 8;
								this.field4299.offset = 0;
							} else if (this.field4311 == 0) {
								if (this.field4299.array[0] == -1) {
									this.field4311 = 1;
									this.field4299.offset = 0;
								} else {
									this.field4308 = null;
								}
							}
						} else {
							var7 = this.field4314.array.length - this.field4308.field4270;
							var8 = 512 - this.field4311;
							if (var8 > var7 - this.field4314.offset) {
								var8 = var7 - this.field4314.offset;
							}

							if (var8 > var17) {
								var8 = var17;
							}

							this.field4309.read(this.field4314.array, this.field4314.offset, var8);
							if (this.field4317 != 0) {
								for (var9 = 0; var9 < var8; ++var9) {
									var10000 = this.field4314.array;
									var10001 = var9 + this.field4314.offset;
									var10000[var10001] ^= this.field4317;
								}
							}

							var22 = this.field4314;
							var22.offset += var8;
							this.field4311 += var8;
							if (this.field4314.offset == var7) {
								if (this.field4308.key == 16711935L) {
									this.field4295 = this.field4314;

									for (var9 = 0; var9 < 256; ++var9) {
										Archive var18 = this.field4306[var9];
										if (var18 != null) {
											this.method6862(var18, var9);
										}
									}
								} else {
									this.field4312.reset();
									this.field4312.update(this.field4314.array, 0, var7);
									var9 = (int)this.field4312.getValue();
									if (this.field4308.field4271 != var9) {
										try {
											this.field4309.close();
										} catch (Exception var20) {
										}

										++this.field4318;
										this.field4309 = null;
										this.field4317 = (byte)((int)(Math.random() * 255.0D + 1.0D));
										return false;
									}

									this.field4318 = 0;
									this.field4298 = 0;
									this.field4308.field4272.write((int)(this.field4308.key & 65535L), this.field4314.array, (this.field4308.key & 16711680L) == 16711680L, this.field4307);
								}

								this.field4308.remove();
								if (this.field4307) {
									--this.field4301;
								} else {
									--this.field4297;
								}

								this.field4311 = 0;
								this.field4308 = null;
								this.field4314 = null;
							} else {
								if (this.field4311 != 512) {
									break;
								}

								this.field4311 = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var21) {
				try {
					this.field4309.close();
				} catch (Exception var19) {
				}

				++this.field4298;
				this.field4309 = null;
				return false;
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-89"
	)
	public void method6845(boolean var1) {
		if (this.field4309 != null) {
			try {
				Buffer var2 = new Buffer(4);
				var2.writeByte(var1 ? 2 : 3);
				var2.writeMedium(0);
				this.field4309.write(var2.array, 0, 4);
			} catch (IOException var5) {
				try {
					this.field4309.close();
				} catch (Exception var4) {
				}

				++this.field4298;
				this.field4309 = null;
			}

		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lqh;ZB)V",
		garbageValue = "64"
	)
	public void method6846(AbstractSocket var1, boolean var2) {
		if (this.field4309 != null) {
			try {
				this.field4309.close();
			} catch (Exception var7) {
			}

			this.field4309 = null;
		}

		this.field4309 = var1;
		this.method6845(var2);
		this.field4299.offset = 0;
		this.field4308 = null;
		this.field4314 = null;
		this.field4311 = 0;

		while (true) {
			class358 var3 = (class358)this.field4300.first();
			if (var3 == null) {
				while (true) {
					var3 = (class358)this.field4305.first();
					if (var3 == null) {
						if (this.field4317 != 0) {
							try {
								Buffer var8 = new Buffer(4);
								var8.writeByte(4);
								var8.writeByte(this.field4317);
								var8.writeShort(0);
								this.field4309.write(var8.array, 0, 4);
							} catch (IOException var6) {
								try {
									this.field4309.close();
								} catch (Exception var5) {
								}

								++this.field4298;
								this.field4309 = null;
							}
						}

						this.field4296 = 0;
						this.field4319 = class113.method2835();
						return;
					}

					this.field4302.method7016(var3);
					this.field4303.put(var3, var3.key);
					++this.field4304;
					--this.field4297;
				}
			}

			this.field4315.put(var3, var3.key);
			++this.field4310;
			--this.field4301;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lny;II)V",
		garbageValue = "-830735706"
	)
	void method6874(Archive var1, int var2) {
		if (var1.field4267) {
			if (var2 <= this.field4316) {
				throw new RuntimeException("");
			}

			if (var2 < this.field4313) {
				this.field4313 = var2;
			}
		} else {
			if (var2 >= this.field4313) {
				throw new RuntimeException("");
			}

			if (var2 > this.field4316) {
				this.field4316 = var2;
			}
		}

		if (this.field4295 != null) {
			this.method6862(var1, var2);
		} else {
			this.method6849((Archive)null, 255, 255, 0, (byte)0, true);
			this.field4306[var2] = var1;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lny;IB)V",
		garbageValue = "5"
	)
	void method6862(Archive var1, int var2) {
		this.field4295.offset = var2 * 8 + 5;
		if (this.field4295.offset >= this.field4295.array.length) {
			if (var1.field4267) {
				var1.method6703();
			} else {
				throw new RuntimeException("");
			}
		} else {
			int var3 = this.field4295.readInt();
			int var4 = this.field4295.readInt();
			var1.loadIndex(var3, var4);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lny;IIIBZI)V",
		garbageValue = "-1002085673"
	)
	void method6849(Archive var1, int var2, int var3, int var4, byte var5, boolean var6) {
		long var7 = (long)(var3 + (var2 << 16));
		class358 var9 = (class358)this.field4315.get(var7);
		if (var9 == null) {
			var9 = (class358)this.field4300.get(var7);
			if (var9 == null) {
				var9 = (class358)this.field4303.get(var7);
				if (var9 != null) {
					if (var6) {
						var9.removeDual();
						this.field4315.put(var9, var7);
						--this.field4304;
						++this.field4310;
					}

				} else {
					if (!var6) {
						var9 = (class358)this.field4305.get(var7);
						if (var9 != null) {
							return;
						}
					}

					var9 = new class358();
					var9.field4272 = var1;
					var9.field4271 = var4;
					var9.field4270 = var5;
					if (var6) {
						this.field4315.put(var9, var7);
						++this.field4310;
					} else {
						this.field4302.method7015(var9);
						this.field4303.put(var9, var7);
						++this.field4304;
					}

				}
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2091914027"
	)
	void method6850(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		class358 var5 = (class358)this.field4303.get(var3);
		if (var5 != null) {
			this.field4302.method7016(var5);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "106"
	)
	int method6851(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		return this.field4308 != null && this.field4308.key == var3 ? this.field4314.offset * 99 / (this.field4314.array.length - this.field4308.field4270) + 1 : 0;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ZZI)I",
		garbageValue = "-988136504"
	)
	public int method6852(boolean var1, boolean var2) {
		byte var3 = 0;
		int var4 = var3 + this.field4310 + this.field4301;
		return var4;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-102"
	)
	public void method6853() {
		if (this.field4309 != null) {
			this.field4309.close();
		}

	}
}
