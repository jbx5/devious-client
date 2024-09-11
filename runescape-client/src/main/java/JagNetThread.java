import java.io.IOException;
import java.util.zip.CRC32;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("py")
@Implements("JagNetThread")
public class JagNetThread {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lsk;"
	)
	AbstractSocket field4568;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1391152695
	)
	int field4573;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = 5966083092179502869L
	)
	long field4570;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	NodeHashTable field4577;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 2093487795
	)
	int field4572;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	NodeHashTable field4575;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 960424965
	)
	int field4574;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	DualNodeDeque field4582;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	NodeHashTable field4576;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1356237333
	)
	int field4591;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	NodeHashTable field4578;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1654481421
	)
	int field4587;
	@ObfuscatedName("ai")
	boolean field4580;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	class389 field4581;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	Buffer field4563;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	Buffer field4583;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 443704883
	)
	int field4584;
	@ObfuscatedName("aw")
	CRC32 field4585;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	Buffer field4586;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Lof;"
	)
	Archive[] field4569;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -2125951925
	)
	int field4588;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 184642493
	)
	int field4589;
	@ObfuscatedName("bd")
	byte field4590;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -917542575
	)
	public int field4564;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -576794723
	)
	public int field4592;

	public JagNetThread() {
		this.field4573 = 0;
		this.field4577 = new NodeHashTable(4096);
		this.field4572 = 0;
		this.field4575 = new NodeHashTable(32);
		this.field4574 = 0;
		this.field4582 = new DualNodeDeque();
		this.field4576 = new NodeHashTable(4096);
		this.field4591 = 0;
		this.field4578 = new NodeHashTable(4096);
		this.field4587 = 0;
		this.field4563 = new Buffer(8);
		this.field4584 = 0;
		this.field4585 = new CRC32();
		this.field4569 = new Archive[256];
		this.field4588 = -1;
		this.field4589 = 255;
		this.field4590 = 0;
		this.field4564 = 0;
		this.field4592 = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "18"
	)
	public boolean method7617() {
		long var1 = WorldMapElement.method3843();
		int var3 = (int)(var1 - this.field4570);
		this.field4570 = var1;
		if (var3 > 200) {
			var3 = 200;
		}

		this.field4573 += var3;
		if (this.field4587 == 0 && this.field4574 == 0 && this.field4591 == 0 && this.field4572 == 0) {
			return true;
		} else if (this.field4568 == null) {
			return false;
		} else {
			try {
				if (this.field4573 > 30000) {
					throw new IOException();
				} else {
					class389 var4;
					Buffer var5;
					while (this.field4574 < 200 && this.field4572 > 0) {
						var4 = (class389)this.field4577.first();
						var5 = new Buffer(4);
						var5.writeByte(1);
						var5.writeMedium((int)var4.key);
						this.field4568.write(var5.array, 0, 4);
						this.field4575.put(var4, var4.key);
						--this.field4572;
						++this.field4574;
					}

					while (this.field4587 < 200 && this.field4591 > 0) {
						var4 = (class389)this.field4582.removeLast();
						var5 = new Buffer(4);
						var5.writeByte(0);
						var5.writeMedium((int)var4.key);
						this.field4568.write(var5.array, 0, 4);
						var4.removeDual();
						this.field4578.put(var4, var4.key);
						--this.field4591;
						++this.field4587;
					}

					for (int var16 = 0; var16 < 100; ++var16) {
						int var17 = this.field4568.available();
						if (var17 < 0) {
							throw new IOException();
						}

						if (var17 == 0) {
							break;
						}

						this.field4573 = 0;
						byte var6 = 0;
						if (this.field4581 == null) {
							var6 = 8;
						} else if (this.field4584 == 0) {
							var6 = 1;
						}

						int var7;
						int var8;
						int var9;
						byte[] var10000;
						int var10001;
						Buffer var22;
						if (var6 > 0) {
							var7 = var6 - this.field4563.offset;
							if (var7 > var17) {
								var7 = var17;
							}

							this.field4568.read(this.field4563.array, this.field4563.offset, var7);
							if (this.field4590 != 0) {
								for (var8 = 0; var8 < var7; ++var8) {
									var10000 = this.field4563.array;
									var10001 = this.field4563.offset + var8;
									var10000[var10001] ^= this.field4590;
								}
							}

							var22 = this.field4563;
							var22.offset += var7;
							if (this.field4563.offset < var6) {
								break;
							}

							if (this.field4581 == null) {
								this.field4563.offset = 0;
								var8 = this.field4563.readUnsignedByte();
								var9 = this.field4563.readUnsignedShort();
								int var10 = this.field4563.readUnsignedByte();
								int var11 = this.field4563.readInt();
								long var12 = (long)(var9 + (var8 << 16));
								class389 var14 = (class389)this.field4575.get(var12);
								this.field4580 = true;
								if (var14 == null) {
									var14 = (class389)this.field4578.get(var12);
									this.field4580 = false;
								}

								if (var14 == null) {
									throw new IOException();
								}

								int var15 = var10 == 0 ? 5 : 9;
								this.field4581 = var14;
								this.field4583 = new Buffer(this.field4581.field4545 + var11 + var15);
								this.field4583.writeByte(var10);
								this.field4583.writeInt(var11);
								this.field4584 = 8;
								this.field4563.offset = 0;
							} else if (this.field4584 == 0) {
								if (this.field4563.array[0] == -1) {
									this.field4584 = 1;
									this.field4563.offset = 0;
								} else {
									this.field4581 = null;
								}
							}
						} else {
							var7 = this.field4583.array.length - this.field4581.field4545;
							var8 = 512 - this.field4584;
							if (var8 > var7 - this.field4583.offset) {
								var8 = var7 - this.field4583.offset;
							}

							if (var8 > var17) {
								var8 = var17;
							}

							this.field4568.read(this.field4583.array, this.field4583.offset, var8);
							if (this.field4590 != 0) {
								for (var9 = 0; var9 < var8; ++var9) {
									var10000 = this.field4583.array;
									var10001 = this.field4583.offset + var9;
									var10000[var10001] ^= this.field4590;
								}
							}

							var22 = this.field4583;
							var22.offset += var8;
							this.field4584 += var8;
							if (this.field4583.offset == var7) {
								if (this.field4581.key == 16711935L) {
									this.field4586 = this.field4583;

									for (var9 = 0; var9 < 256; ++var9) {
										Archive var18 = this.field4569[var9];
										if (var18 != null) {
											this.method7646(var18, var9);
										}
									}
								} else {
									this.field4585.reset();
									this.field4585.update(this.field4583.array, 0, var7);
									var9 = (int)this.field4585.getValue();
									if (this.field4581.field4543 != var9) {
										try {
											this.field4568.close();
										} catch (Exception var20) {
										}

										++this.field4564;
										this.field4568 = null;
										this.field4590 = (byte)((int)(Math.random() * 255.0D + 1.0D));
										return false;
									}

									this.field4564 = 0;
									this.field4592 = 0;
									this.field4581.field4544.write((int)(this.field4581.key & 65535L), this.field4583.array, (this.field4581.key & 16711680L) == 16711680L, this.field4580);
								}

								this.field4581.remove();
								if (this.field4580) {
									--this.field4574;
								} else {
									--this.field4587;
								}

								this.field4584 = 0;
								this.field4581 = null;
								this.field4583 = null;
							} else {
								if (this.field4584 != 512) {
									break;
								}

								this.field4584 = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var21) {
				try {
					this.field4568.close();
				} catch (Exception var19) {
				}

				++this.field4592;
				this.field4568 = null;
				return false;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1176406268"
	)
	public void method7641(boolean var1) {
		if (this.field4568 != null) {
			try {
				Buffer var2 = new Buffer(4);
				var2.writeByte(var1 ? 2 : 3);
				var2.writeMedium(0);
				this.field4568.write(var2.array, 0, 4);
			} catch (IOException var5) {
				try {
					this.field4568.close();
				} catch (Exception var4) {
				}

				++this.field4592;
				this.field4568 = null;
			}

		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lsk;ZI)V",
		garbageValue = "785557590"
	)
	public void method7618(AbstractSocket var1, boolean var2) {
		if (this.field4568 != null) {
			try {
				this.field4568.close();
			} catch (Exception var7) {
			}

			this.field4568 = null;
		}

		this.field4568 = var1;
		this.method7641(var2);
		this.field4563.offset = 0;
		this.field4581 = null;
		this.field4583 = null;
		this.field4584 = 0;

		while (true) {
			class389 var3 = (class389)this.field4575.first();
			if (var3 == null) {
				while (true) {
					var3 = (class389)this.field4578.first();
					if (var3 == null) {
						if (this.field4590 != 0) {
							try {
								Buffer var8 = new Buffer(4);
								var8.writeByte(4);
								var8.writeByte(this.field4590);
								var8.writeShort(0);
								this.field4568.write(var8.array, 0, 4);
							} catch (IOException var6) {
								try {
									this.field4568.close();
								} catch (Exception var5) {
								}

								++this.field4592;
								this.field4568 = null;
							}
						}

						this.field4573 = 0;
						this.field4570 = WorldMapElement.method3843();
						return;
					}

					this.field4582.method7786(var3);
					this.field4576.put(var3, var3.key);
					++this.field4591;
					--this.field4587;
				}
			}

			this.field4577.put(var3, var3.key);
			++this.field4572;
			--this.field4574;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lof;II)V",
		garbageValue = "2052758475"
	)
	void method7619(Archive var1, int var2) {
		if (var1.field4515 && !var1.field4502) {
			if (var2 <= this.field4588) {
				throw new RuntimeException("");
			}

			if (var2 < this.field4589) {
				this.field4589 = var2;
			}
		} else {
			if (var2 >= this.field4589) {
				throw new RuntimeException("");
			}

			if (var2 > this.field4588) {
				this.field4588 = var2;
			}
		}

		if (this.field4586 != null) {
			this.method7646(var1, var2);
		} else {
			this.method7630((Archive)null, class388.field4535.field4541, 255, 0, (byte)0, true);
			this.field4569[var2] = var1;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lof;IB)V",
		garbageValue = "0"
	)
	void method7646(Archive var1, int var2) {
		this.field4586.offset = var2 * 8 + 5;
		if (this.field4586.offset >= this.field4586.array.length) {
			if (var1.field4515) {
				var1.method7504();
			} else {
				throw new RuntimeException("");
			}
		} else {
			int var3 = this.field4586.readInt();
			int var4 = this.field4586.readInt();
			var1.loadIndex(var3, var4);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lof;IIIBZB)V",
		garbageValue = "116"
	)
	void method7630(Archive var1, int var2, int var3, int var4, byte var5, boolean var6) {
		long var7 = (long)(var3 + (var2 << 16));
		class389 var9 = (class389)this.field4577.get(var7);
		if (var9 == null) {
			var9 = (class389)this.field4575.get(var7);
			if (var9 == null) {
				var9 = (class389)this.field4576.get(var7);
				if (var9 != null) {
					if (var6) {
						var9.removeDual();
						this.field4577.put(var9, var7);
						--this.field4591;
						++this.field4572;
					}

				} else {
					if (!var6) {
						var9 = (class389)this.field4578.get(var7);
						if (var9 != null) {
							return;
						}
					}

					var9 = new class389();
					var9.field4544 = var1;
					var9.field4543 = var4;
					var9.field4545 = var5;
					if (var6) {
						this.field4577.put(var9, var7);
						++this.field4572;
					} else {
						this.field4582.method7781(var9);
						this.field4576.put(var9, var7);
						++this.field4591;
					}

				}
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2124436262"
	)
	void method7622(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		class389 var5 = (class389)this.field4576.get(var3);
		if (var5 != null) {
			this.field4582.method7786(var5);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "489617895"
	)
	int method7623(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		return this.field4581 != null && var3 == this.field4581.key ? this.field4583.offset * 99 / (this.field4583.array.length - this.field4581.field4545) + 1 : 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(ZZS)I",
		garbageValue = "284"
	)
	public int method7624(boolean var1, boolean var2) {
		byte var3 = 0;
		int var4 = var3 + this.field4574 + this.field4572;
		return var4;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public void method7625() {
		if (this.field4568 != null) {
			try {
				this.field4568.close();
			} catch (Exception var2) {
			}

			this.field4568 = null;
		}

	}
}
