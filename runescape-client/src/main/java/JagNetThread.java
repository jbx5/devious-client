import java.io.IOException;
import java.util.zip.CRC32;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oz")
@Implements("JagNetThread")
public class JagNetThread {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	AbstractSocket field4323;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -988179881
	)
	int field4320;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = 3020955250564587419L
	)
	long field4340;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ltw;"
	)
	NodeHashTable field4322;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1358418643
	)
	int field4333;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ltw;"
	)
	NodeHashTable field4324;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1223039407
	)
	int field4328;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lod;"
	)
	DualNodeDeque field4326;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ltw;"
	)
	NodeHashTable field4319;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -2089805869
	)
	int field4341;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ltw;"
	)
	NodeHashTable field4329;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1260303295
	)
	int field4330;
	@ObfuscatedName("ax")
	boolean field4331;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	class369 field4332;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	Buffer field4342;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	Buffer field4334;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 553152759
	)
	int field4335;
	@ObfuscatedName("aq")
	CRC32 field4336;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Luj;"
	)
	Buffer field4337;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Loh;"
	)
	Archive[] field4338;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1234441809
	)
	int field4339;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -210806841
	)
	int field4325;
	@ObfuscatedName("ag")
	byte field4321;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1596192069
	)
	public int field4343;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1084636023
	)
	public int field4327;

	public JagNetThread() {
		this.field4320 = 0;
		this.field4322 = new NodeHashTable(4096);
		this.field4333 = 0;
		this.field4324 = new NodeHashTable(32);
		this.field4328 = 0;
		this.field4326 = new DualNodeDeque();
		this.field4319 = new NodeHashTable(4096);
		this.field4341 = 0;
		this.field4329 = new NodeHashTable(4096);
		this.field4330 = 0;
		this.field4342 = new Buffer(8);
		this.field4335 = 0;
		this.field4336 = new CRC32();
		this.field4338 = new Archive[256];
		this.field4339 = -1;
		this.field4325 = 255;
		this.field4321 = 0;
		this.field4343 = 0;
		this.field4327 = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-63"
	)
	public boolean method7044() {
		long var1 = SpotAnimationDefinition.method3775();
		int var3 = (int)(var1 - this.field4340);
		this.field4340 = var1;
		if (var3 > 200) {
			var3 = 200;
		}

		this.field4320 += var3;
		if (this.field4330 == 0 && this.field4328 == 0 && this.field4341 == 0 && this.field4333 == 0) {
			return true;
		} else if (this.field4323 == null) {
			return false;
		} else {
			try {
				if (this.field4320 > 30000) {
					throw new IOException();
				} else {
					class369 var4;
					Buffer var5;
					while (this.field4328 < 200 && this.field4333 > 0) {
						var4 = (class369)this.field4322.first();
						var5 = new Buffer(4);
						var5.writeByte(1);
						var5.writeMedium((int)var4.key);
						this.field4323.write(var5.array, 0, 4);
						this.field4324.put(var4, var4.key);
						--this.field4333;
						++this.field4328;
					}

					while (this.field4330 < 200 && this.field4341 > 0) {
						var4 = (class369)this.field4326.removeLast();
						var5 = new Buffer(4);
						var5.writeByte(0);
						var5.writeMedium((int)var4.key);
						this.field4323.write(var5.array, 0, 4);
						var4.removeDual();
						this.field4329.put(var4, var4.key);
						--this.field4341;
						++this.field4330;
					}

					for (int var16 = 0; var16 < 100; ++var16) {
						int var17 = this.field4323.available();
						if (var17 < 0) {
							throw new IOException();
						}

						if (var17 == 0) {
							break;
						}

						this.field4320 = 0;
						byte var6 = 0;
						if (this.field4332 == null) {
							var6 = 8;
						} else if (this.field4335 == 0) {
							var6 = 1;
						}

						int var7;
						int var8;
						int var9;
						byte[] var10000;
						int var10001;
						Buffer var22;
						if (var6 > 0) {
							var7 = var6 - this.field4342.offset;
							if (var7 > var17) {
								var7 = var17;
							}

							this.field4323.read(this.field4342.array, this.field4342.offset, var7);
							if (this.field4321 != 0) {
								for (var8 = 0; var8 < var7; ++var8) {
									var10000 = this.field4342.array;
									var10001 = var8 + this.field4342.offset;
									var10000[var10001] ^= this.field4321;
								}
							}

							var22 = this.field4342;
							var22.offset += var7;
							if (this.field4342.offset < var6) {
								break;
							}

							if (this.field4332 == null) {
								this.field4342.offset = 0;
								var8 = this.field4342.readUnsignedByte();
								var9 = this.field4342.readUnsignedShort();
								int var10 = this.field4342.readUnsignedByte();
								int var11 = this.field4342.readInt();
								long var12 = (long)(var9 + (var8 << 16));
								class369 var14 = (class369)this.field4324.get(var12);
								this.field4331 = true;
								if (var14 == null) {
									var14 = (class369)this.field4329.get(var12);
									this.field4331 = false;
								}

								if (var14 == null) {
									throw new IOException();
								}

								int var15 = var10 == 0 ? 5 : 9;
								this.field4332 = var14;
								this.field4334 = new Buffer(this.field4332.field4295 + var11 + var15);
								this.field4334.writeByte(var10);
								this.field4334.writeInt(var11);
								this.field4335 = 8;
								this.field4342.offset = 0;
							} else if (this.field4335 == 0) {
								if (this.field4342.array[0] == -1) {
									this.field4335 = 1;
									this.field4342.offset = 0;
								} else {
									this.field4332 = null;
								}
							}
						} else {
							var7 = this.field4334.array.length - this.field4332.field4295;
							var8 = 512 - this.field4335;
							if (var8 > var7 - this.field4334.offset) {
								var8 = var7 - this.field4334.offset;
							}

							if (var8 > var17) {
								var8 = var17;
							}

							this.field4323.read(this.field4334.array, this.field4334.offset, var8);
							if (this.field4321 != 0) {
								for (var9 = 0; var9 < var8; ++var9) {
									var10000 = this.field4334.array;
									var10001 = this.field4334.offset + var9;
									var10000[var10001] ^= this.field4321;
								}
							}

							var22 = this.field4334;
							var22.offset += var8;
							this.field4335 += var8;
							if (this.field4334.offset == var7) {
								if (this.field4332.key == 16711935L) {
									this.field4337 = this.field4334;

									for (var9 = 0; var9 < 256; ++var9) {
										Archive var18 = this.field4338[var9];
										if (var18 != null) {
											this.method7043(var18, var9);
										}
									}
								} else {
									this.field4336.reset();
									this.field4336.update(this.field4334.array, 0, var7);
									var9 = (int)this.field4336.getValue();
									if (this.field4332.field4294 != var9) {
										try {
											this.field4323.close();
										} catch (Exception var20) {
										}

										++this.field4343;
										this.field4323 = null;
										this.field4321 = (byte)((int)(Math.random() * 255.0D + 1.0D));
										return false;
									}

									this.field4343 = 0;
									this.field4327 = 0;
									this.field4332.field4296.write((int)(this.field4332.key & 65535L), this.field4334.array, (this.field4332.key & 16711680L) == 16711680L, this.field4331);
								}

								this.field4332.remove();
								if (this.field4331) {
									--this.field4328;
								} else {
									--this.field4330;
								}

								this.field4335 = 0;
								this.field4332 = null;
								this.field4334 = null;
							} else {
								if (this.field4335 != 512) {
									break;
								}

								this.field4335 = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var21) {
				try {
					this.field4323.close();
				} catch (Exception var19) {
				}

				++this.field4327;
				this.field4323 = null;
				return false;
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-438812293"
	)
	public void method7045(boolean var1) {
		if (this.field4323 != null) {
			try {
				Buffer var2 = new Buffer(4);
				var2.writeByte(var1 ? 2 : 3);
				var2.writeMedium(0);
				this.field4323.write(var2.array, 0, 4);
			} catch (IOException var5) {
				try {
					this.field4323.close();
				} catch (Exception var4) {
				}

				++this.field4327;
				this.field4323 = null;
			}

		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lro;ZI)V",
		garbageValue = "1047063145"
	)
	public void method7046(AbstractSocket var1, boolean var2) {
		if (this.field4323 != null) {
			try {
				this.field4323.close();
			} catch (Exception var7) {
			}

			this.field4323 = null;
		}

		this.field4323 = var1;
		this.method7045(var2);
		this.field4342.offset = 0;
		this.field4332 = null;
		this.field4334 = null;
		this.field4335 = 0;

		while (true) {
			class369 var3 = (class369)this.field4324.first();
			if (var3 == null) {
				while (true) {
					var3 = (class369)this.field4329.first();
					if (var3 == null) {
						if (this.field4321 != 0) {
							try {
								Buffer var8 = new Buffer(4);
								var8.writeByte(4);
								var8.writeByte(this.field4321);
								var8.writeShort(0);
								this.field4323.write(var8.array, 0, 4);
							} catch (IOException var6) {
								try {
									this.field4323.close();
								} catch (Exception var5) {
								}

								++this.field4327;
								this.field4323 = null;
							}
						}

						this.field4320 = 0;
						this.field4340 = SpotAnimationDefinition.method3775();
						return;
					}

					this.field4326.method7213(var3);
					this.field4319.put(var3, var3.key);
					++this.field4341;
					--this.field4330;
				}
			}

			this.field4322.put(var3, var3.key);
			++this.field4333;
			--this.field4328;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Loh;II)V",
		garbageValue = "-1796726180"
	)
	void method7047(Archive var1, int var2) {
		if (var1.field4283 && !var1.field4290) {
			if (var2 <= this.field4339) {
				throw new RuntimeException("");
			}

			if (var2 < this.field4325) {
				this.field4325 = var2;
			}
		} else {
			if (var2 >= this.field4325) {
				throw new RuntimeException("");
			}

			if (var2 > this.field4339) {
				this.field4339 = var2;
			}
		}

		if (this.field4337 != null) {
			this.method7043(var1, var2);
		} else {
			this.method7054((Archive)null, 255, 255, 0, (byte)0, true);
			this.field4338[var2] = var1;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Loh;IB)V",
		garbageValue = "-34"
	)
	void method7043(Archive var1, int var2) {
		this.field4337.offset = var2 * 8 + 5;
		if (this.field4337.offset >= this.field4337.array.length) {
			if (var1.field4283) {
				var1.method6902();
			} else {
				throw new RuntimeException("");
			}
		} else {
			int var3 = this.field4337.readInt();
			int var4 = this.field4337.readInt();
			var1.loadIndex(var3, var4);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Loh;IIIBZB)V",
		garbageValue = "71"
	)
	void method7054(Archive var1, int var2, int var3, int var4, byte var5, boolean var6) {
		long var7 = (long)(var3 + (var2 << 16));
		class369 var9 = (class369)this.field4322.get(var7);
		if (var9 == null) {
			var9 = (class369)this.field4324.get(var7);
			if (var9 == null) {
				var9 = (class369)this.field4319.get(var7);
				if (var9 != null) {
					if (var6) {
						var9.removeDual();
						this.field4322.put(var9, var7);
						--this.field4341;
						++this.field4333;
					}

				} else {
					if (!var6) {
						var9 = (class369)this.field4329.get(var7);
						if (var9 != null) {
							return;
						}
					}

					var9 = new class369();
					var9.field4296 = var1;
					var9.field4294 = var4;
					var9.field4295 = var5;
					if (var6) {
						this.field4322.put(var9, var7);
						++this.field4333;
					} else {
						this.field4326.method7215(var9);
						this.field4319.put(var9, var7);
						++this.field4341;
					}

				}
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "880980368"
	)
	void method7050(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		class369 var5 = (class369)this.field4319.get(var3);
		if (var5 != null) {
			this.field4326.method7213(var5);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "480276269"
	)
	int method7051(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		return this.field4332 != null && this.field4332.key == var3 ? this.field4334.offset * 99 / (this.field4334.array.length - this.field4332.field4295) + 1 : 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ZZB)I",
		garbageValue = "-122"
	)
	public int method7052(boolean var1, boolean var2) {
		byte var3 = 0;
		int var4 = var3 + this.field4333 + this.field4328;
		return var4;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1516647272"
	)
	public void method7049() {
		if (this.field4323 != null) {
			this.field4323.close();
		}

	}
}
