import java.io.IOException;
import java.util.zip.CRC32;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nf")
@Implements("JagNetThread")
public class JagNetThread {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	AbstractSocket field4324;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 593542457
	)
	int field4322;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = 8908412595310329561L
	)
	long field4302;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lso;"
	)
	NodeHashTable field4314;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 278498079
	)
	int field4313;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lso;"
	)
	NodeHashTable field4305;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 986152519
	)
	int field4306;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Los;"
	)
	DualNodeDeque field4307;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lso;"
	)
	NodeHashTable field4308;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1119998937
	)
	int field4318;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lso;"
	)
	NodeHashTable field4310;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1738247723
	)
	int field4311;
	@ObfuscatedName("al")
	boolean field4312;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnj;"
	)
	class357 field4309;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ltm;"
	)
	Buffer field4301;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ltm;"
	)
	Buffer field4315;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1397653743
	)
	int field4316;
	@ObfuscatedName("ax")
	CRC32 field4317;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ltm;"
	)
	Buffer field4304;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Lnk;"
	)
	Archive[] field4319;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1707785745
	)
	int field4320;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1369154899
	)
	int field4321;
	@ObfuscatedName("av")
	byte field4303;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1933667131
	)
	public int field4300;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -322958283
	)
	public int field4323;

	public JagNetThread() {
		this.field4322 = 0;
		this.field4314 = new NodeHashTable(4096);
		this.field4313 = 0;
		this.field4305 = new NodeHashTable(32);
		this.field4306 = 0;
		this.field4307 = new DualNodeDeque();
		this.field4308 = new NodeHashTable(4096);
		this.field4318 = 0;
		this.field4310 = new NodeHashTable(4096);
		this.field4311 = 0;
		this.field4301 = new Buffer(8);
		this.field4316 = 0;
		this.field4317 = new CRC32();
		this.field4319 = new Archive[256];
		this.field4320 = -1;
		this.field4321 = 255;
		this.field4303 = 0;
		this.field4300 = 0;
		this.field4323 = 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "935597926"
	)
	public boolean method6797() {
		long var1 = GameEngine.method661();
		int var3 = (int)(var1 - this.field4302);
		this.field4302 = var1;
		if (var3 > 200) {
			var3 = 200;
		}

		this.field4322 += var3;
		if (this.field4311 == 0 && this.field4306 == 0 && this.field4318 == 0 && this.field4313 == 0) {
			return true;
		} else if (this.field4324 == null) {
			return false;
		} else {
			try {
				if (this.field4322 > 30000) {
					throw new IOException();
				} else {
					class357 var4;
					Buffer var5;
					while (this.field4306 < 200 && this.field4313 > 0) {
						var4 = (class357)this.field4314.first();
						var5 = new Buffer(4);
						var5.writeByte(1);
						var5.writeMedium((int)var4.key);
						this.field4324.write(var5.array, 0, 4);
						this.field4305.put(var4, var4.key);
						--this.field4313;
						++this.field4306;
					}

					while (this.field4311 < 200 && this.field4318 > 0) {
						var4 = (class357)this.field4307.removeLast();
						var5 = new Buffer(4);
						var5.writeByte(0);
						var5.writeMedium((int)var4.key);
						this.field4324.write(var5.array, 0, 4);
						var4.removeDual();
						this.field4310.put(var4, var4.key);
						--this.field4318;
						++this.field4311;
					}

					for (int var16 = 0; var16 < 100; ++var16) {
						int var17 = this.field4324.available();
						if (var17 < 0) {
							throw new IOException();
						}

						if (var17 == 0) {
							break;
						}

						this.field4322 = 0;
						byte var6 = 0;
						if (this.field4309 == null) {
							var6 = 8;
						} else if (this.field4316 == 0) {
							var6 = 1;
						}

						int var7;
						int var8;
						int var9;
						byte[] var10000;
						int var10001;
						Buffer var22;
						if (var6 > 0) {
							var7 = var6 - this.field4301.offset;
							if (var7 > var17) {
								var7 = var17;
							}

							this.field4324.read(this.field4301.array, this.field4301.offset, var7);
							if (this.field4303 != 0) {
								for (var8 = 0; var8 < var7; ++var8) {
									var10000 = this.field4301.array;
									var10001 = var8 + this.field4301.offset;
									var10000[var10001] ^= this.field4303;
								}
							}

							var22 = this.field4301;
							var22.offset += var7;
							if (this.field4301.offset < var6) {
								break;
							}

							if (this.field4309 == null) {
								this.field4301.offset = 0;
								var8 = this.field4301.readUnsignedByte();
								var9 = this.field4301.readUnsignedShort();
								int var10 = this.field4301.readUnsignedByte();
								int var11 = this.field4301.readInt();
								long var12 = (long)(var9 + (var8 << 16));
								class357 var14 = (class357)this.field4305.get(var12);
								this.field4312 = true;
								if (var14 == null) {
									var14 = (class357)this.field4310.get(var12);
									this.field4312 = false;
								}

								if (var14 == null) {
									throw new IOException();
								}

								int var15 = var10 == 0 ? 5 : 9;
								this.field4309 = var14;
								this.field4315 = new Buffer(this.field4309.field4278 + var11 + var15);
								this.field4315.writeByte(var10);
								this.field4315.writeInt(var11);
								this.field4316 = 8;
								this.field4301.offset = 0;
							} else if (this.field4316 == 0) {
								if (this.field4301.array[0] == -1) {
									this.field4316 = 1;
									this.field4301.offset = 0;
								} else {
									this.field4309 = null;
								}
							}
						} else {
							var7 = this.field4315.array.length - this.field4309.field4278;
							var8 = 512 - this.field4316;
							if (var8 > var7 - this.field4315.offset) {
								var8 = var7 - this.field4315.offset;
							}

							if (var8 > var17) {
								var8 = var17;
							}

							this.field4324.read(this.field4315.array, this.field4315.offset, var8);
							if (this.field4303 != 0) {
								for (var9 = 0; var9 < var8; ++var9) {
									var10000 = this.field4315.array;
									var10001 = var9 + this.field4315.offset;
									var10000[var10001] ^= this.field4303;
								}
							}

							var22 = this.field4315;
							var22.offset += var8;
							this.field4316 += var8;
							if (this.field4315.offset == var7) {
								if (16711935L == this.field4309.key) {
									this.field4304 = this.field4315;

									for (var9 = 0; var9 < 256; ++var9) {
										Archive var18 = this.field4319[var9];
										if (var18 != null) {
											this.method6795(var18, var9);
										}
									}
								} else {
									this.field4317.reset();
									this.field4317.update(this.field4315.array, 0, var7);
									var9 = (int)this.field4317.getValue();
									if (this.field4309.field4276 != var9) {
										try {
											this.field4324.close();
										} catch (Exception var20) {
										}

										++this.field4300;
										this.field4324 = null;
										this.field4303 = (byte)((int)(Math.random() * 255.0D + 1.0D));
										return false;
									}

									this.field4300 = 0;
									this.field4323 = 0;
									this.field4309.field4277.write((int)(this.field4309.key & 65535L), this.field4315.array, 16711680L == (this.field4309.key & 16711680L), this.field4312);
								}

								this.field4309.remove();
								if (this.field4312) {
									--this.field4306;
								} else {
									--this.field4311;
								}

								this.field4316 = 0;
								this.field4309 = null;
								this.field4315 = null;
							} else {
								if (this.field4316 != 512) {
									break;
								}

								this.field4316 = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var21) {
				try {
					this.field4324.close();
				} catch (Exception var19) {
				}

				++this.field4323;
				this.field4324 = null;
				return false;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-2147075944"
	)
	public void method6793(boolean var1) {
		if (this.field4324 != null) {
			try {
				Buffer var2 = new Buffer(4);
				var2.writeByte(var1 ? 2 : 3);
				var2.writeMedium(0);
				this.field4324.write(var2.array, 0, 4);
			} catch (IOException var5) {
				try {
					this.field4324.close();
				} catch (Exception var4) {
				}

				++this.field4323;
				this.field4324 = null;
			}

		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lqi;ZI)V",
		garbageValue = "-1755212969"
	)
	public void method6792(AbstractSocket var1, boolean var2) {
		if (this.field4324 != null) {
			try {
				this.field4324.close();
			} catch (Exception var7) {
			}

			this.field4324 = null;
		}

		this.field4324 = var1;
		this.method6793(var2);
		this.field4301.offset = 0;
		this.field4309 = null;
		this.field4315 = null;
		this.field4316 = 0;

		while (true) {
			class357 var3 = (class357)this.field4305.first();
			if (var3 == null) {
				while (true) {
					var3 = (class357)this.field4310.first();
					if (var3 == null) {
						if (this.field4303 != 0) {
							try {
								Buffer var8 = new Buffer(4);
								var8.writeByte(4);
								var8.writeByte(this.field4303);
								var8.writeShort(0);
								this.field4324.write(var8.array, 0, 4);
							} catch (IOException var6) {
								try {
									this.field4324.close();
								} catch (Exception var5) {
								}

								++this.field4323;
								this.field4324 = null;
							}
						}

						this.field4322 = 0;
						this.field4302 = GameEngine.method661();
						return;
					}

					this.field4307.method6965(var3);
					this.field4308.put(var3, var3.key);
					++this.field4318;
					--this.field4311;
				}
			}

			this.field4314.put(var3, var3.key);
			++this.field4313;
			--this.field4306;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lnk;II)V",
		garbageValue = "1859946409"
	)
	void method6794(Archive var1, int var2) {
		if (var1.field4262) {
			if (var2 <= this.field4320) {
				throw new RuntimeException("");
			}

			if (var2 < this.field4321) {
				this.field4321 = var2;
			}
		} else {
			if (var2 >= this.field4321) {
				throw new RuntimeException("");
			}

			if (var2 > this.field4320) {
				this.field4320 = var2;
			}
		}

		if (this.field4304 != null) {
			this.method6795(var1, var2);
		} else {
			this.method6796((Archive)null, 255, 255, 0, (byte)0, true);
			this.field4319[var2] = var1;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lnk;II)V",
		garbageValue = "-1785545796"
	)
	void method6795(Archive var1, int var2) {
		this.field4304.offset = var2 * 8 + 5;
		if (this.field4304.offset >= this.field4304.array.length) {
			if (var1.field4262) {
				var1.method6675();
			} else {
				throw new RuntimeException("");
			}
		} else {
			int var3 = this.field4304.readInt();
			int var4 = this.field4304.readInt();
			var1.loadIndex(var3, var4);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lnk;IIIBZB)V",
		garbageValue = "-83"
	)
	void method6796(Archive var1, int var2, int var3, int var4, byte var5, boolean var6) {
		long var7 = (long)(var3 + (var2 << 16));
		class357 var9 = (class357)this.field4314.get(var7);
		if (var9 == null) {
			var9 = (class357)this.field4305.get(var7);
			if (var9 == null) {
				var9 = (class357)this.field4308.get(var7);
				if (var9 != null) {
					if (var6) {
						var9.removeDual();
						this.field4314.put(var9, var7);
						--this.field4318;
						++this.field4313;
					}

				} else {
					if (!var6) {
						var9 = (class357)this.field4310.get(var7);
						if (var9 != null) {
							return;
						}
					}

					var9 = new class357();
					var9.field4277 = var1;
					var9.field4276 = var4;
					var9.field4278 = var5;
					if (var6) {
						this.field4314.put(var9, var7);
						++this.field4313;
					} else {
						this.field4307.method6971(var9);
						this.field4308.put(var9, var7);
						++this.field4318;
					}

				}
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1960227475"
	)
	void method6803(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		class357 var5 = (class357)this.field4308.get(var3);
		if (var5 != null) {
			this.field4307.method6965(var5);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1437295059"
	)
	int method6814(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		return this.field4309 != null && var3 == this.field4309.key ? this.field4315.offset * 99 / (this.field4315.array.length - this.field4309.field4278) + 1 : 0;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ZZS)I",
		garbageValue = "-10235"
	)
	public int method6810(boolean var1, boolean var2) {
		byte var3 = 0;
		int var4 = var3 + this.field4306 + this.field4313;
		return var4;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1866561588"
	)
	public void method6800() {
		if (this.field4324 != null) {
			this.field4324.close();
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldc;",
		garbageValue = "569243283"
	)
	static AttackOption[] method6821() {
		return new AttackOption[]{AttackOption.field1356, AttackOption.AttackOption_dependsOnCombatLevels, AttackOption.AttackOption_hidden, AttackOption.AttackOption_alwaysRightClick, AttackOption.field1355};
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "-162809884"
	)
	static char method6815(char var0) {
		if (var0 == 198) {
			return 'E';
		} else if (var0 == 230) {
			return 'e';
		} else if (var0 == 223) {
			return 's';
		} else if (var0 == 338) {
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000');
		}
	}
}
