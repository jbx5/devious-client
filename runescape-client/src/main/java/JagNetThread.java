import java.io.IOException;
import java.util.zip.CRC32;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("pk")
@Implements("JagNetThread")
public class JagNetThread {
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	AbstractSocket field4608;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -85142099
	)
	int field4612;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = -8413539928166424643L
	)
	long field4614;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	NodeHashTable field4611;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 966864885
	)
	int field4622;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	NodeHashTable field4613;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 537068201
	)
	int field4609;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	DualNodeDeque field4615;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	NodeHashTable field4618;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1325717689
	)
	int field4617;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	NodeHashTable field4616;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -326104939
	)
	int field4619;
	@ObfuscatedName("ag")
	boolean field4626;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lpg;"
	)
	class390 field4621;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	Buffer field4633;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	Buffer field4623;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -322852667
	)
	int field4624;
	@ObfuscatedName("al")
	CRC32 field4625;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	Buffer field4604;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lor;"
	)
	Archive[] field4627;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 136156211
	)
	int field4628;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1382275455
	)
	int field4629;
	@ObfuscatedName("bv")
	byte field4630;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 1416824085
	)
	public int field4631;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 638348411
	)
	public int field4632;

	public JagNetThread() {
		this.field4612 = 0;
		this.field4611 = new NodeHashTable(4096);
		this.field4622 = 0;
		this.field4613 = new NodeHashTable(32);
		this.field4609 = 0;
		this.field4615 = new DualNodeDeque();
		this.field4618 = new NodeHashTable(4096);
		this.field4617 = 0;
		this.field4616 = new NodeHashTable(4096);
		this.field4619 = 0;
		this.field4633 = new Buffer(8);
		this.field4624 = 0;
		this.field4625 = new CRC32();
		this.field4627 = new Archive[256];
		this.field4628 = -1;
		this.field4629 = 255;
		this.field4630 = 0;
		this.field4631 = 0;
		this.field4632 = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1956858846"
	)
	public boolean method7705() {
		long var1 = class77.method2338();
		int var3 = (int)(var1 - this.field4614);
		this.field4614 = var1;
		if (var3 > 200) {
			var3 = 200;
		}

		this.field4612 += var3;
		if (this.field4619 == 0 && this.field4609 == 0 && this.field4617 == 0 && this.field4622 == 0) {
			return true;
		} else if (this.field4608 == null) {
			return false;
		} else {
			try {
				if (this.field4612 > 30000) {
					throw new IOException();
				} else {
					class390 var4;
					Buffer var5;
					while (this.field4609 < 200 && this.field4622 > 0) {
						var4 = (class390)this.field4611.first();
						var5 = new Buffer(4);
						var5.writeByte(1);
						var5.writeMedium((int)var4.key);
						this.field4608.write(var5.array, 0, 4);
						this.field4613.put(var4, var4.key);
						--this.field4622;
						++this.field4609;
					}

					while (this.field4619 < 200 && this.field4617 > 0) {
						var4 = (class390)this.field4615.removeLast();
						var5 = new Buffer(4);
						var5.writeByte(0);
						var5.writeMedium((int)var4.key);
						this.field4608.write(var5.array, 0, 4);
						var4.removeDual();
						this.field4616.put(var4, var4.key);
						--this.field4617;
						++this.field4619;
					}

					for (int var16 = 0; var16 < 100; ++var16) {
						int var17 = this.field4608.available();
						if (var17 < 0) {
							throw new IOException();
						}

						if (var17 == 0) {
							break;
						}

						this.field4612 = 0;
						byte var6 = 0;
						if (this.field4621 == null) {
							var6 = 8;
						} else if (this.field4624 == 0) {
							var6 = 1;
						}

						int var7;
						int var8;
						int var9;
						byte[] var10000;
						int var10001;
						Buffer var22;
						if (var6 > 0) {
							var7 = var6 - this.field4633.offset;
							if (var7 > var17) {
								var7 = var17;
							}

							this.field4608.read(this.field4633.array, this.field4633.offset, var7);
							if (this.field4630 != 0) {
								for (var8 = 0; var8 < var7; ++var8) {
									var10000 = this.field4633.array;
									var10001 = this.field4633.offset + var8;
									var10000[var10001] ^= this.field4630;
								}
							}

							var22 = this.field4633;
							var22.offset += var7;
							if (this.field4633.offset < var6) {
								break;
							}

							if (this.field4621 == null) {
								this.field4633.offset = 0;
								var8 = this.field4633.readUnsignedByte();
								var9 = this.field4633.readUnsignedShort();
								int var10 = this.field4633.readUnsignedByte();
								int var11 = this.field4633.readInt();
								long var12 = (long)(var9 + (var8 << 16));
								class390 var14 = (class390)this.field4613.get(var12);
								this.field4626 = true;
								if (var14 == null) {
									var14 = (class390)this.field4616.get(var12);
									this.field4626 = false;
								}

								if (var14 == null) {
									throw new IOException();
								}

								int var15 = var10 == 0 ? 5 : 9;
								this.field4621 = var14;
								this.field4623 = new Buffer(this.field4621.field4580 + var11 + var15);
								this.field4623.writeByte(var10);
								this.field4623.writeInt(var11);
								this.field4624 = 8;
								this.field4633.offset = 0;
							} else if (this.field4624 == 0) {
								if (this.field4633.array[0] == -1) {
									this.field4624 = 1;
									this.field4633.offset = 0;
								} else {
									this.field4621 = null;
								}
							}
						} else {
							var7 = this.field4623.array.length - this.field4621.field4580;
							var8 = 512 - this.field4624;
							if (var8 > var7 - this.field4623.offset) {
								var8 = var7 - this.field4623.offset;
							}

							if (var8 > var17) {
								var8 = var17;
							}

							this.field4608.read(this.field4623.array, this.field4623.offset, var8);
							if (this.field4630 != 0) {
								for (var9 = 0; var9 < var8; ++var9) {
									var10000 = this.field4623.array;
									var10001 = var9 + this.field4623.offset;
									var10000[var10001] ^= this.field4630;
								}
							}

							var22 = this.field4623;
							var22.offset += var8;
							this.field4624 += var8;
							if (this.field4623.offset == var7) {
								if (this.field4621.key == 16711935L) {
									this.field4604 = this.field4623;

									for (var9 = 0; var9 < 256; ++var9) {
										Archive var18 = this.field4627[var9];
										if (var18 != null) {
											this.method7709(var18, var9);
										}
									}
								} else {
									this.field4625.reset();
									this.field4625.update(this.field4623.array, 0, var7);
									var9 = (int)this.field4625.getValue();
									if (this.field4621.field4581 != var9) {
										try {
											this.field4608.close();
										} catch (Exception var20) {
										}

										++this.field4631;
										this.field4608 = null;
										this.field4630 = (byte)((int)(Math.random() * 255.0D + 1.0D));
										return false;
									}

									this.field4631 = 0;
									this.field4632 = 0;
									this.field4621.field4584.write((int)(this.field4621.key & 65535L), this.field4623.array, 16711680L == (this.field4621.key & 16711680L), this.field4626);
								}

								this.field4621.remove();
								if (this.field4626) {
									--this.field4609;
								} else {
									--this.field4619;
								}

								this.field4624 = 0;
								this.field4621 = null;
								this.field4623 = null;
							} else {
								if (this.field4624 != 512) {
									break;
								}

								this.field4624 = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var21) {
				try {
					this.field4608.close();
				} catch (Exception var19) {
				}

				++this.field4632;
				this.field4608 = null;
				return false;
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-832029151"
	)
	public void method7706(boolean var1) {
		if (this.field4608 != null) {
			try {
				Buffer var2 = new Buffer(4);
				var2.writeByte(var1 ? 2 : 3);
				var2.writeMedium(0);
				this.field4608.write(var2.array, 0, 4);
			} catch (IOException var5) {
				try {
					this.field4608.close();
				} catch (Exception var4) {
				}

				++this.field4632;
				this.field4608 = null;
			}

		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lsw;ZI)V",
		garbageValue = "1916954030"
	)
	public void method7707(AbstractSocket var1, boolean var2) {
		if (this.field4608 != null) {
			try {
				this.field4608.close();
			} catch (Exception var7) {
			}

			this.field4608 = null;
		}

		this.field4608 = var1;
		this.method7706(var2);
		this.field4633.offset = 0;
		this.field4621 = null;
		this.field4623 = null;
		this.field4624 = 0;

		while (true) {
			class390 var3 = (class390)this.field4613.first();
			if (var3 == null) {
				while (true) {
					var3 = (class390)this.field4616.first();
					if (var3 == null) {
						if (this.field4630 != 0) {
							try {
								Buffer var8 = new Buffer(4);
								var8.writeByte(4);
								var8.writeByte(this.field4630);
								var8.writeShort(0);
								this.field4608.write(var8.array, 0, 4);
							} catch (IOException var6) {
								try {
									this.field4608.close();
								} catch (Exception var5) {
								}

								++this.field4632;
								this.field4608 = null;
							}
						}

						this.field4612 = 0;
						this.field4614 = class77.method2338();
						return;
					}

					this.field4615.method7868(var3);
					this.field4618.put(var3, var3.key);
					++this.field4617;
					--this.field4619;
				}
			}

			this.field4611.put(var3, var3.key);
			++this.field4622;
			--this.field4609;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lor;II)V",
		garbageValue = "1734803559"
	)
	void method7708(Archive var1, int var2) {
		if (var1.field4553 && !var1.field4542) {
			if (var2 <= this.field4628) {
				throw new RuntimeException("");
			}

			if (var2 < this.field4629) {
				this.field4629 = var2;
			}
		} else {
			if (var2 >= this.field4629) {
				throw new RuntimeException("");
			}

			if (var2 > this.field4628) {
				this.field4628 = var2;
			}
		}

		if (this.field4604 != null) {
			this.method7709(var1, var2);
		} else {
			this.method7710((Archive)null, class389.field4565.field4579, 255, 0, (byte)0, true);
			this.field4627[var2] = var1;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lor;II)V",
		garbageValue = "-2119927791"
	)
	void method7709(Archive var1, int var2) {
		this.field4604.offset = var2 * 8 + 5;
		if (this.field4604.offset >= this.field4604.array.length) {
			if (var1.field4553) {
				var1.method7569();
			} else {
				throw new RuntimeException("");
			}
		} else {
			int var3 = this.field4604.readInt();
			int var4 = this.field4604.readInt();
			var1.loadIndex(var3, var4);
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lor;IIIBZI)V",
		garbageValue = "1473483156"
	)
	void method7710(Archive var1, int var2, int var3, int var4, byte var5, boolean var6) {
		long var7 = (long)(var3 + (var2 << 16));
		class390 var9 = (class390)this.field4611.get(var7);
		if (var9 == null) {
			var9 = (class390)this.field4613.get(var7);
			if (var9 == null) {
				var9 = (class390)this.field4618.get(var7);
				if (var9 != null) {
					if (var6) {
						var9.removeDual();
						this.field4611.put(var9, var7);
						--this.field4617;
						++this.field4622;
					}

				} else {
					if (!var6) {
						var9 = (class390)this.field4616.get(var7);
						if (var9 != null) {
							return;
						}
					}

					var9 = new class390();
					var9.field4584 = var1;
					var9.field4581 = var4;
					var9.field4580 = var5;
					if (var6) {
						this.field4611.put(var9, var7);
						++this.field4622;
					} else {
						this.field4615.method7867(var9);
						this.field4618.put(var9, var7);
						++this.field4617;
					}

				}
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1045199720"
	)
	void method7711(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		class390 var5 = (class390)this.field4618.get(var3);
		if (var5 != null) {
			this.field4615.method7868(var5);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-986766796"
	)
	int method7725(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		return this.field4621 != null && this.field4621.key == var3 ? this.field4623.offset * 99 / (this.field4623.array.length - this.field4621.field4580) + 1 : 0;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(ZZB)I",
		garbageValue = "1"
	)
	public int method7730(boolean var1, boolean var2) {
		byte var3 = 0;
		int var4 = var3 + this.field4622 + this.field4609;
		return var4;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-27"
	)
	public void method7714() {
		if (this.field4608 != null) {
			try {
				this.field4608.close();
			} catch (Exception var2) {
			}

			this.field4608 = null;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZI)I",
		garbageValue = "-1212502861"
	)
	static int method7713(int var0, Script var1, boolean var2) {
		Widget var3 = class416.widgetDefinition.method6911(Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = class93.Widget_unpackTargetMask(class171.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.IF_GETOP) {
			if (var0 == ScriptOpcodes.IF_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}
}
