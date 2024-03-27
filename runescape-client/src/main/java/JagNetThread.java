import java.io.IOException;
import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ow")
@Implements("JagNetThread")
public class JagNetThread {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lrq;"
	)
	AbstractSocket field4433;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1829934123
	)
	int field4437;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 6443011435548712151L
	)
	long field4438;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	NodeHashTable field4436;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1857331349
	)
	int field4430;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	NodeHashTable field4444;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1536710015
	)
	int field4434;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpq;"
	)
	DualNodeDeque field4454;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	NodeHashTable field4441;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1728128561
	)
	int field4442;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ltv;"
	)
	NodeHashTable field4443;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1722370453
	)
	int field4440;
	@ObfuscatedName("ay")
	boolean field4445;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	class377 field4446;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	Buffer field4447;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	Buffer field4448;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 314684017
	)
	int field4449;
	@ObfuscatedName("ac")
	CRC32 field4450;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lur;"
	)
	Buffer field4451;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Lov;"
	)
	Archive[] field4452;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1898360451
	)
	int field4453;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 863131193
	)
	int field4439;
	@ObfuscatedName("bc")
	byte field4455;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -694316703
	)
	public int field4456;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = -1140025679
	)
	public int field4457;

	public JagNetThread() {
		this.field4437 = 0;
		this.field4436 = new NodeHashTable(4096);
		this.field4430 = 0;
		this.field4444 = new NodeHashTable(32);
		this.field4434 = 0;
		this.field4454 = new DualNodeDeque();
		this.field4441 = new NodeHashTable(4096);
		this.field4442 = 0;
		this.field4443 = new NodeHashTable(4096);
		this.field4440 = 0;
		this.field4447 = new Buffer(8);
		this.field4449 = 0;
		this.field4450 = new CRC32();
		this.field4452 = new Archive[256];
		this.field4453 = -1;
		this.field4439 = 255;
		this.field4455 = 0;
		this.field4456 = 0;
		this.field4457 = 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1001268301"
	)
	public boolean method7050() {
		long var1 = VerticalAlignment.method3924();
		int var3 = (int)(var1 - this.field4438);
		this.field4438 = var1;
		if (var3 > 200) {
			var3 = 200;
		}

		this.field4437 += var3;
		if (this.field4440 == 0 && this.field4434 == 0 && this.field4442 == 0 && this.field4430 == 0) {
			return true;
		} else if (this.field4433 == null) {
			return false;
		} else {
			try {
				if (this.field4437 > 30000) {
					throw new IOException();
				} else {
					class377 var4;
					Buffer var5;
					while (this.field4434 < 200 && this.field4430 > 0) {
						var4 = (class377)this.field4436.first();
						var5 = new Buffer(4);
						var5.writeByte(1);
						var5.writeMedium((int)var4.key);
						this.field4433.write(var5.array, 0, 4);
						this.field4444.put(var4, var4.key);
						--this.field4430;
						++this.field4434;
					}

					while (this.field4440 < 200 && this.field4442 > 0) {
						var4 = (class377)this.field4454.removeLast();
						var5 = new Buffer(4);
						var5.writeByte(0);
						var5.writeMedium((int)var4.key);
						this.field4433.write(var5.array, 0, 4);
						var4.removeDual();
						this.field4443.put(var4, var4.key);
						--this.field4442;
						++this.field4440;
					}

					for (int var16 = 0; var16 < 100; ++var16) {
						int var17 = this.field4433.available();
						if (var17 < 0) {
							throw new IOException();
						}

						if (var17 == 0) {
							break;
						}

						this.field4437 = 0;
						byte var6 = 0;
						if (this.field4446 == null) {
							var6 = 8;
						} else if (this.field4449 == 0) {
							var6 = 1;
						}

						int var7;
						int var8;
						int var9;
						byte[] var10000;
						int var10001;
						Buffer var22;
						if (var6 > 0) {
							var7 = var6 - this.field4447.offset;
							if (var7 > var17) {
								var7 = var17;
							}

							this.field4433.read(this.field4447.array, this.field4447.offset, var7);
							if (this.field4455 != 0) {
								for (var8 = 0; var8 < var7; ++var8) {
									var10000 = this.field4447.array;
									var10001 = var8 + this.field4447.offset;
									var10000[var10001] ^= this.field4455;
								}
							}

							var22 = this.field4447;
							var22.offset += var7;
							if (this.field4447.offset < var6) {
								break;
							}

							if (this.field4446 == null) {
								this.field4447.offset = 0;
								var8 = this.field4447.readUnsignedByte();
								var9 = this.field4447.readUnsignedShort();
								int var10 = this.field4447.readUnsignedByte();
								int var11 = this.field4447.readInt();
								long var12 = (long)(var9 + (var8 << 16));
								class377 var14 = (class377)this.field4444.get(var12);
								this.field4445 = true;
								if (var14 == null) {
									var14 = (class377)this.field4443.get(var12);
									this.field4445 = false;
								}

								if (var14 == null) {
									throw new IOException();
								}

								int var15 = var10 == 0 ? 5 : 9;
								this.field4446 = var14;
								this.field4448 = new Buffer(this.field4446.field4410 + var11 + var15);
								this.field4448.writeByte(var10);
								this.field4448.writeInt(var11);
								this.field4449 = 8;
								this.field4447.offset = 0;
							} else if (this.field4449 == 0) {
								if (this.field4447.array[0] == -1) {
									this.field4449 = 1;
									this.field4447.offset = 0;
								} else {
									this.field4446 = null;
								}
							}
						} else {
							var7 = this.field4448.array.length - this.field4446.field4410;
							var8 = 512 - this.field4449;
							if (var8 > var7 - this.field4448.offset) {
								var8 = var7 - this.field4448.offset;
							}

							if (var8 > var17) {
								var8 = var17;
							}

							this.field4433.read(this.field4448.array, this.field4448.offset, var8);
							if (this.field4455 != 0) {
								for (var9 = 0; var9 < var8; ++var9) {
									var10000 = this.field4448.array;
									var10001 = this.field4448.offset + var9;
									var10000[var10001] ^= this.field4455;
								}
							}

							var22 = this.field4448;
							var22.offset += var8;
							this.field4449 += var8;
							if (this.field4448.offset == var7) {
								if (this.field4446.key == 16711935L) {
									this.field4451 = this.field4448;

									for (var9 = 0; var9 < 256; ++var9) {
										Archive var18 = this.field4452[var9];
										if (var18 != null) {
											this.method7055(var18, var9);
										}
									}
								} else {
									this.field4450.reset();
									this.field4450.update(this.field4448.array, 0, var7);
									var9 = (int)this.field4450.getValue();
									if (this.field4446.field4409 != var9) {
										try {
											this.field4433.close();
										} catch (Exception var20) {
										}

										++this.field4456;
										this.field4433 = null;
										this.field4455 = (byte)((int)(Math.random() * 255.0D + 1.0D));
										return false;
									}

									this.field4456 = 0;
									this.field4457 = 0;
									this.field4446.field4411.write((int)(this.field4446.key & 65535L), this.field4448.array, (this.field4446.key & 16711680L) == 16711680L, this.field4445);
								}

								this.field4446.remove();
								if (this.field4445) {
									--this.field4434;
								} else {
									--this.field4440;
								}

								this.field4449 = 0;
								this.field4446 = null;
								this.field4448 = null;
							} else {
								if (this.field4449 != 512) {
									break;
								}

								this.field4449 = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var21) {
				try {
					this.field4433.close();
				} catch (Exception var19) {
				}

				++this.field4457;
				this.field4433 = null;
				return false;
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "496042186"
	)
	public void method7052(boolean var1) {
		if (this.field4433 != null) {
			try {
				Buffer var2 = new Buffer(4);
				var2.writeByte(var1 ? 2 : 3);
				var2.writeMedium(0);
				this.field4433.write(var2.array, 0, 4);
			} catch (IOException var5) {
				try {
					this.field4433.close();
				} catch (Exception var4) {
				}

				++this.field4457;
				this.field4433 = null;
			}

		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lrq;ZB)V",
		garbageValue = "-65"
	)
	public void method7053(AbstractSocket var1, boolean var2) {
		if (this.field4433 != null) {
			try {
				this.field4433.close();
			} catch (Exception var7) {
			}

			this.field4433 = null;
		}

		this.field4433 = var1;
		this.method7052(var2);
		this.field4447.offset = 0;
		this.field4446 = null;
		this.field4448 = null;
		this.field4449 = 0;

		while (true) {
			class377 var3 = (class377)this.field4444.first();
			if (var3 == null) {
				while (true) {
					var3 = (class377)this.field4443.first();
					if (var3 == null) {
						if (this.field4455 != 0) {
							try {
								Buffer var8 = new Buffer(4);
								var8.writeByte(4);
								var8.writeByte(this.field4455);
								var8.writeShort(0);
								this.field4433.write(var8.array, 0, 4);
							} catch (IOException var6) {
								try {
									this.field4433.close();
								} catch (Exception var5) {
								}

								++this.field4457;
								this.field4433 = null;
							}
						}

						this.field4437 = 0;
						this.field4438 = VerticalAlignment.method3924();
						return;
					}

					this.field4454.method7215(var3);
					this.field4441.put(var3, var3.key);
					++this.field4442;
					--this.field4440;
				}
			}

			this.field4436.put(var3, var3.key);
			++this.field4430;
			--this.field4434;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lov;II)V",
		garbageValue = "-695664096"
	)
	void method7051(Archive var1, int var2) {
		if (var1.field4380 && !var1.field4381) {
			if (var2 <= this.field4453) {
				throw new RuntimeException("");
			}

			if (var2 < this.field4439) {
				this.field4439 = var2;
			}
		} else {
			if (var2 >= this.field4439) {
				throw new RuntimeException("");
			}

			if (var2 > this.field4453) {
				this.field4453 = var2;
			}
		}

		if (this.field4451 != null) {
			this.method7055(var1, var2);
		} else {
			this.method7056((Archive)null, class376.field4389.field4407, 255, 0, (byte)0, true);
			this.field4452[var2] = var1;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lov;IS)V",
		garbageValue = "321"
	)
	void method7055(Archive var1, int var2) {
		this.field4451.offset = var2 * 8 + 5;
		if (this.field4451.offset >= this.field4451.array.length) {
			if (var1.field4380) {
				var1.method6941();
			} else {
				throw new RuntimeException("");
			}
		} else {
			int var3 = this.field4451.readInt();
			int var4 = this.field4451.readInt();
			var1.loadIndex(var3, var4);
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lov;IIIBZI)V",
		garbageValue = "-1005831971"
	)
	void method7056(Archive var1, int var2, int var3, int var4, byte var5, boolean var6) {
		long var7 = (long)(var3 + (var2 << 16));
		class377 var9 = (class377)this.field4436.get(var7);
		if (var9 == null) {
			var9 = (class377)this.field4444.get(var7);
			if (var9 == null) {
				var9 = (class377)this.field4441.get(var7);
				if (var9 != null) {
					if (var6) {
						var9.removeDual();
						this.field4436.put(var9, var7);
						--this.field4442;
						++this.field4430;
					}

				} else {
					if (!var6) {
						var9 = (class377)this.field4443.get(var7);
						if (var9 != null) {
							return;
						}
					}

					var9 = new class377();
					var9.field4411 = var1;
					var9.field4409 = var4;
					var9.field4410 = var5;
					if (var6) {
						this.field4436.put(var9, var7);
						++this.field4430;
					} else {
						this.field4454.method7212(var9);
						this.field4441.put(var9, var7);
						++this.field4442;
					}

				}
			}
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "411398064"
	)
	void method7057(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		class377 var5 = (class377)this.field4441.get(var3);
		if (var5 != null) {
			this.field4454.method7215(var5);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1209863367"
	)
	int method7058(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		return this.field4446 != null && var3 == this.field4446.key ? this.field4448.offset * 99 / (this.field4448.array.length - this.field4446.field4410) + 1 : 0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ZZI)I",
		garbageValue = "-1156290683"
	)
	public int method7059(boolean var1, boolean var2) {
		byte var3 = 0;
		int var4 = var3 + this.field4434 + this.field4430;
		return var4;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-242564343"
	)
	public void method7078() {
		if (this.field4433 != null) {
			try {
				this.field4433.close();
			} catch (Exception var2) {
			}

			this.field4433 = null;
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIILis;IB)V",
		garbageValue = "59"
	)
	@Export("createObjectSound")
	static void createObjectSound(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound();
		var5.plane = var0;
		var5.x = var1 * 16384;
		var5.y = var2 * 128;
		int var6 = var3.sizeX;
		int var7 = var3.sizeY;
		if (var4 == 1 || var4 == 3) {
			var6 = var3.sizeY;
			var7 = var3.sizeX;
		}

		var5.maxX = (var6 + var1) * 128;
		var5.maxY = (var7 + var2) * 128;
		var5.soundEffectId = var3.ambientSoundId;
		var5.field846 = var3.int7 * 16384;
		var5.field847 = Math.max(var3.int8 * 16384 - 128, 0);
		var5.field841 = var3.int5;
		var5.field854 = var3.int6;
		var5.soundEffectIds = var3.soundEffectIds;
		if (var3.transforms != null) {
			var5.obj = var3;
			var5.set();
		}

		ObjectSound.objectSounds.addFirst(var5);
		if (var5.soundEffectIds != null) {
			var5.field843 = var5.field841 + (int)(Math.random() * (double)(var5.field854 - var5.field841));
		}

	}
}
