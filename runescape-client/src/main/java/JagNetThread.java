import java.io.IOException;
import java.util.zip.CRC32;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("oe")
@Implements("JagNetThread")
public class JagNetThread {
	@ObfuscatedName("fp")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field4545;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	AbstractSocket field4547;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1469341211
	)
	int field4567;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = -831200158254530275L
	)
	long field4548;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	NodeHashTable field4554;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 893442467
	)
	int field4550;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	NodeHashTable field4551;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1839274781
	)
	int field4552;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpz;"
	)
	DualNodeDeque field4553;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	NodeHashTable field4562;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -175499425
	)
	int field4555;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	NodeHashTable field4556;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 538790613
	)
	int field4557;
	@ObfuscatedName("ay")
	boolean field4558;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	class386 field4543;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lvp;"
	)
	Buffer field4560;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lvp;"
	)
	Buffer field4561;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -2124691059
	)
	int field4546;
	@ObfuscatedName("af")
	CRC32 field4571;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lvp;"
	)
	Buffer field4564;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[Loz;"
	)
	Archive[] field4565;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 1848769151
	)
	int field4566;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1957149133
	)
	int field4559;
	@ObfuscatedName("be")
	byte field4568;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -784341467
	)
	public int field4569;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -944356257
	)
	public int field4570;

	public JagNetThread() {
		this.field4567 = 0;
		this.field4554 = new NodeHashTable(4096);
		this.field4550 = 0;
		this.field4551 = new NodeHashTable(32);
		this.field4552 = 0;
		this.field4553 = new DualNodeDeque();
		this.field4562 = new NodeHashTable(4096);
		this.field4555 = 0;
		this.field4556 = new NodeHashTable(4096);
		this.field4557 = 0;
		this.field4560 = new Buffer(8);
		this.field4546 = 0;
		this.field4571 = new CRC32();
		this.field4565 = new Archive[256];
		this.field4566 = -1;
		this.field4559 = 255;
		this.field4568 = 0;
		this.field4569 = 0;
		this.field4570 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-70"
	)
	public boolean method7270() {
		long var1 = WorldMapData_1.method4861();
		int var3 = (int)(var1 - this.field4548);
		this.field4548 = var1;
		if (var3 > 200) {
			var3 = 200;
		}

		this.field4567 += var3;
		if (this.field4557 == 0 && this.field4552 == 0 && this.field4555 == 0 && this.field4550 == 0) {
			return true;
		} else if (this.field4547 == null) {
			return false;
		} else {
			try {
				if (this.field4567 > 30000) {
					throw new IOException();
				} else {
					class386 var4;
					Buffer var5;
					while (this.field4552 < 200 && this.field4550 > 0) {
						var4 = (class386)this.field4554.first();
						var5 = new Buffer(4);
						var5.writeByte(1);
						var5.writeMedium((int)var4.key);
						this.field4547.write(var5.array, 0, 4);
						this.field4551.put(var4, var4.key);
						--this.field4550;
						++this.field4552;
					}

					while (this.field4557 < 200 && this.field4555 > 0) {
						var4 = (class386)this.field4553.removeLast();
						var5 = new Buffer(4);
						var5.writeByte(0);
						var5.writeMedium((int)var4.key);
						this.field4547.write(var5.array, 0, 4);
						var4.removeDual();
						this.field4556.put(var4, var4.key);
						--this.field4555;
						++this.field4557;
					}

					for (int var16 = 0; var16 < 100; ++var16) {
						int var17 = this.field4547.available();
						if (var17 < 0) {
							throw new IOException();
						}

						if (var17 == 0) {
							break;
						}

						this.field4567 = 0;
						byte var6 = 0;
						if (this.field4543 == null) {
							var6 = 8;
						} else if (this.field4546 == 0) {
							var6 = 1;
						}

						int var7;
						int var8;
						int var9;
						byte[] var10000;
						int var10001;
						Buffer var22;
						if (var6 > 0) {
							var7 = var6 - this.field4560.offset;
							if (var7 > var17) {
								var7 = var17;
							}

							this.field4547.read(this.field4560.array, this.field4560.offset, var7);
							if (this.field4568 != 0) {
								for (var8 = 0; var8 < var7; ++var8) {
									var10000 = this.field4560.array;
									var10001 = this.field4560.offset + var8;
									var10000[var10001] ^= this.field4568;
								}
							}

							var22 = this.field4560;
							var22.offset += var7;
							if (this.field4560.offset < var6) {
								break;
							}

							if (this.field4543 == null) {
								this.field4560.offset = 0;
								var8 = this.field4560.readUnsignedByte();
								var9 = this.field4560.readUnsignedShort();
								int var10 = this.field4560.readUnsignedByte();
								int var11 = this.field4560.readInt();
								long var12 = (long)(var9 + (var8 << 16));
								class386 var14 = (class386)this.field4551.get(var12);
								this.field4558 = true;
								if (var14 == null) {
									var14 = (class386)this.field4556.get(var12);
									this.field4558 = false;
								}

								if (var14 == null) {
									throw new IOException();
								}

								int var15 = var10 == 0 ? 5 : 9;
								this.field4543 = var14;
								this.field4561 = new Buffer(this.field4543.field4522 + var11 + var15);
								this.field4561.writeByte(var10);
								this.field4561.writeInt(var11);
								this.field4546 = 8;
								this.field4560.offset = 0;
							} else if (this.field4546 == 0) {
								if (this.field4560.array[0] == -1) {
									this.field4546 = 1;
									this.field4560.offset = 0;
								} else {
									this.field4543 = null;
								}
							}
						} else {
							var7 = this.field4561.array.length - this.field4543.field4522;
							var8 = 512 - this.field4546;
							if (var8 > var7 - this.field4561.offset) {
								var8 = var7 - this.field4561.offset;
							}

							if (var8 > var17) {
								var8 = var17;
							}

							this.field4547.read(this.field4561.array, this.field4561.offset, var8);
							if (this.field4568 != 0) {
								for (var9 = 0; var9 < var8; ++var9) {
									var10000 = this.field4561.array;
									var10001 = this.field4561.offset + var9;
									var10000[var10001] ^= this.field4568;
								}
							}

							var22 = this.field4561;
							var22.offset += var8;
							this.field4546 += var8;
							if (this.field4561.offset == var7) {
								if (16711935L == this.field4543.key) {
									this.field4564 = this.field4561;

									for (var9 = 0; var9 < 256; ++var9) {
										Archive var18 = this.field4565[var9];
										if (var18 != null) {
											this.method7292(var18, var9);
										}
									}
								} else {
									this.field4571.reset();
									this.field4571.update(this.field4561.array, 0, var7);
									var9 = (int)this.field4571.getValue();
									if (this.field4543.field4524 != var9) {
										try {
											this.field4547.close();
										} catch (Exception var20) {
										}

										++this.field4569;
										this.field4547 = null;
										this.field4568 = (byte)((int)(Math.random() * 255.0D + 1.0D));
										return false;
									}

									this.field4569 = 0;
									this.field4570 = 0;
									this.field4543.field4523.write((int)(this.field4543.key & 65535L), this.field4561.array, 16711680L == (this.field4543.key & 16711680L), this.field4558);
								}

								this.field4543.remove();
								if (this.field4558) {
									--this.field4552;
								} else {
									--this.field4557;
								}

								this.field4546 = 0;
								this.field4543 = null;
								this.field4561 = null;
							} else {
								if (this.field4546 != 512) {
									break;
								}

								this.field4546 = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var21) {
				try {
					this.field4547.close();
				} catch (Exception var19) {
				}

				++this.field4570;
				this.field4547 = null;
				return false;
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "95"
	)
	public void method7271(boolean var1) {
		if (this.field4547 != null) {
			try {
				Buffer var2 = new Buffer(4);
				var2.writeByte(var1 ? 2 : 3);
				var2.writeMedium(0);
				this.field4547.write(var2.array, 0, 4);
			} catch (IOException var5) {
				try {
					this.field4547.close();
				} catch (Exception var4) {
				}

				++this.field4570;
				this.field4547 = null;
			}

		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lsp;ZB)V",
		garbageValue = "-26"
	)
	public void method7272(AbstractSocket var1, boolean var2) {
		if (this.field4547 != null) {
			try {
				this.field4547.close();
			} catch (Exception var7) {
			}

			this.field4547 = null;
		}

		this.field4547 = var1;
		this.method7271(var2);
		this.field4560.offset = 0;
		this.field4543 = null;
		this.field4561 = null;
		this.field4546 = 0;

		while (true) {
			class386 var3 = (class386)this.field4551.first();
			if (var3 == null) {
				while (true) {
					var3 = (class386)this.field4556.first();
					if (var3 == null) {
						if (this.field4568 != 0) {
							try {
								Buffer var8 = new Buffer(4);
								var8.writeByte(4);
								var8.writeByte(this.field4568);
								var8.writeShort(0);
								this.field4547.write(var8.array, 0, 4);
							} catch (IOException var6) {
								try {
									this.field4547.close();
								} catch (Exception var5) {
								}

								++this.field4570;
								this.field4547 = null;
							}
						}

						this.field4567 = 0;
						this.field4548 = WorldMapData_1.method4861();
						return;
					}

					this.field4553.method7436(var3);
					this.field4562.put(var3, var3.key);
					++this.field4555;
					--this.field4557;
				}
			}

			this.field4554.put(var3, var3.key);
			++this.field4550;
			--this.field4552;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Loz;II)V",
		garbageValue = "-1515384832"
	)
	void method7273(Archive var1, int var2) {
		if (var1.field4490 && !var1.field4488) {
			if (var2 <= this.field4566) {
				throw new RuntimeException("");
			}

			if (var2 < this.field4559) {
				this.field4559 = var2;
			}
		} else {
			if (var2 >= this.field4559) {
				throw new RuntimeException("");
			}

			if (var2 > this.field4566) {
				this.field4566 = var2;
			}
		}

		if (this.field4564 != null) {
			this.method7292(var1, var2);
		} else {
			this.method7275((Archive)null, class385.field4513.field4518, 255, 0, (byte)0, true);
			this.field4565[var2] = var1;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Loz;II)V",
		garbageValue = "1266819270"
	)
	void method7292(Archive var1, int var2) {
		this.field4564.offset = var2 * 8 + 5;
		if (this.field4564.offset >= this.field4564.array.length) {
			if (var1.field4490) {
				var1.method7132();
			} else {
				throw new RuntimeException("");
			}
		} else {
			int var3 = this.field4564.readInt();
			int var4 = this.field4564.readInt();
			var1.loadIndex(var3, var4);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Loz;IIIBZI)V",
		garbageValue = "-561026136"
	)
	void method7275(Archive var1, int var2, int var3, int var4, byte var5, boolean var6) {
		long var7 = (long)(var3 + (var2 << 16));
		class386 var9 = (class386)this.field4554.get(var7);
		if (var9 == null) {
			var9 = (class386)this.field4551.get(var7);
			if (var9 == null) {
				var9 = (class386)this.field4562.get(var7);
				if (var9 != null) {
					if (var6) {
						var9.removeDual();
						this.field4554.put(var9, var7);
						--this.field4555;
						++this.field4550;
					}

				} else {
					if (!var6) {
						var9 = (class386)this.field4556.get(var7);
						if (var9 != null) {
							return;
						}
					}

					var9 = new class386();
					var9.field4523 = var1;
					var9.field4524 = var4;
					var9.field4522 = var5;
					if (var6) {
						this.field4554.put(var9, var7);
						++this.field4550;
					} else {
						this.field4553.method7435(var9);
						this.field4562.put(var9, var7);
						++this.field4555;
					}

				}
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-59"
	)
	void method7279(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		class386 var5 = (class386)this.field4562.get(var3);
		if (var5 != null) {
			this.field4553.method7436(var5);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-256203628"
	)
	int method7285(int var1, int var2) {
		long var3 = (long)((var1 << 16) + var2);
		return this.field4543 != null && this.field4543.key == var3 ? this.field4561.offset * 99 / (this.field4561.array.length - this.field4543.field4522) + 1 : 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(ZZB)I",
		garbageValue = "43"
	)
	public int method7278(boolean var1, boolean var2) {
		byte var3 = 0;
		int var4 = var3 + this.field4550 + this.field4552;
		return var4;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "108"
	)
	public void method7282() {
		if (this.field4547 != null) {
			try {
				this.field4547.close();
			} catch (Exception var2) {
			}

			this.field4547 = null;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "77707455"
	)
	static int method7305(int var0, Script var1, boolean var2) {
		int var4 = -1;
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
			var3 = ModeWhere.widgetDefinition.method6519(var4);
		} else {
			var3 = var2 ? Interpreter.scriptDotWidget : class30.scriptActiveWidget;
		}

		int var23;
		if (var0 == ScriptOpcodes.CC_SETSCROLLPOS) {
			class130.Interpreter_intStackSize -= 2;
			var23 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
			int var16 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
			if (var3.type == 12) {
				class356 var17 = var3.method6991();
				if (var17 != null && var17.method6730(var23, var16)) {
					TriBool.invalidateWidget(var3);
				}
			} else {
				var3.scrollX = var23;
				if (var3.scrollX > var3.scrollWidth - var3.width) {
					var3.scrollX = var3.scrollWidth - var3.width;
				}

				if (var3.scrollX < 0) {
					var3.scrollX = 0;
				}

				var3.scrollY = var16;
				if (var3.scrollY > var3.scrollHeight - var3.height) {
					var3.scrollY = var3.scrollHeight - var3.height;
				}

				if (var3.scrollY < 0) {
					var3.scrollY = 0;
				}

				TriBool.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETCOLOUR) {
			var3.color = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
			TriBool.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETFILL) {
			var3.fill = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
			TriBool.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTRANS) {
			var3.transparencyTop = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
			TriBool.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETLINEWID) {
			var3.lineWid = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
			TriBool.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETGRAPHIC) {
			var3.spriteId2 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
			TriBool.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SET2DANGLE) {
			var3.spriteAngle = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
			TriBool.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETTILING) {
			var3.spriteTiling = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
			TriBool.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODEL) {
			var3.modelType = 1;
			var3.modelId = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
			TriBool.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANGLE) {
			class130.Interpreter_intStackSize -= 6;
			var3.modelOffsetX = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
			var3.modelOffsetY = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
			var3.modelAngleX = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2];
			var3.modelAngleY = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 3];
			var3.modelAngleZ = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 4];
			var3.modelZoom = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 5];
			TriBool.invalidateWidget(var3);
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELANIM) {
			var23 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
			if (var23 != var3.sequenceId) {
				var3.sequenceId = var23;
				var3.modelFrame = 0;
				var3.modelFrameCycle = 0;
				TriBool.invalidateWidget(var3);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETMODELORTHOG) {
			var3.modelOrthog = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
			TriBool.invalidateWidget(var3);
			return 1;
		} else {
			String var15;
			class356 var21;
			if (var0 == ScriptOpcodes.CC_SETTEXT) {
				var15 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
				if (var3.type == 12) {
					var21 = var3.method6991();
					if (var21 != null && var21.method6640()) {
						var21.method6658(var15);
					} else {
						var3.text = var15;
					}

					TriBool.invalidateWidget(var3);
				} else if (!var15.equals(var3.text)) {
					var3.text = var15;
					TriBool.invalidateWidget(var3);
				}

				return 1;
			} else {
				class356 var19;
				if (var0 == ScriptOpcodes.CC_SETTEXTFONT) {
					var3.fontId = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
					if (var3.type == 12) {
						var19 = var3.method6991();
						if (var19 != null) {
							var19.method6600();
						}
					}

					TriBool.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTALIGN) {
					class130.Interpreter_intStackSize -= 3;
					if (var3.type == 12) {
						var19 = var3.method6991();
						if (var19 != null) {
							var19.method6649(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]);
							var19.method6620(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2]);
						}
					} else {
						var3.textXAlignment = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
						var3.textYAlignment = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
						var3.textLineHeight = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2];
					}

					TriBool.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETTEXTSHADOW) {
					var3.textShadowed = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
					TriBool.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETOUTLINE) {
					var3.outline = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
					TriBool.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETGRAPHICSHADOW) {
					var3.spriteShadow = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
					TriBool.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETVFLIP) {
					var3.spriteFlipV = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
					TriBool.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETHFLIP) {
					var3.spriteFlipH = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
					TriBool.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETSCROLLSIZE) {
					class130.Interpreter_intStackSize -= 2;
					var3.scrollWidth = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
					var3.scrollHeight = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
					TriBool.invalidateWidget(var3);
					if (var4 != -1 && var3.type == 0) {
						class238.revalidateWidgetScroll(ModeWhere.widgetDefinition.Widget_interfaceComponents[var4 >> 16], var3, false);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CC_RESUME_PAUSEBUTTON) {
					ClanSettings.resumePauseWidget(var3.id, var3.childIndex);
					Client.meslayerContinueWidget = var3;
					TriBool.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1122) {
					var3.spriteId = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
					TriBool.invalidateWidget(var3);
					return 1;
				} else if (var0 == ScriptOpcodes.CC_SETFILLCOLOUR) {
					var3.color2 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
					TriBool.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1124) {
					var3.transparencyBot = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
					TriBool.invalidateWidget(var3);
					return 1;
				} else if (var0 == 1125) {
					var23 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
					FillMode var22 = (FillMode)class210.findEnumerated(class142.FillMode_values(), var23);
					if (var22 != null) {
						var3.fillMode = var22;
						TriBool.invalidateWidget(var3);
					}

					return 1;
				} else {
					boolean var14;
					if (var0 == ScriptOpcodes.CC_SETLINEDIRECTION) {
						var14 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
						var3.field3880 = var14;
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETMODELTRANSPARENT) {
						var14 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
						var3.modelTransparency = var14;
						return 1;
					} else if (var0 == 1129) {
						var3.field3868 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
						TriBool.invalidateWidget(var3);
						return 1;
					} else if (var0 == 1130) {
						var3.method6872(Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize], "", ByteArrayPool.urlRequester, class452.getUserId());
						return 1;
					} else if (var0 == 1131) {
						class130.Interpreter_intStackSize -= 2;
						var3.method6876(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]);
						return 1;
					} else if (var0 == 1132) {
						var3.method6981(Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize], Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]);
						return 1;
					} else {
						class350 var20;
						if (var0 == 1133) {
							--class130.Interpreter_intStackSize;
							var20 = var3.method6890();
							if (var20 != null) {
								var20.field3752 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
								TriBool.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1134) {
							--class130.Interpreter_intStackSize;
							var20 = var3.method6890();
							if (var20 != null) {
								var20.field3751 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
								TriBool.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1135) {
							--class337.Interpreter_stringStackSize;
							var19 = var3.method6991();
							if (var19 != null) {
								var3.text2 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize];
							}

							return 1;
						} else if (var0 == 1136) {
							--class130.Interpreter_intStackSize;
							var20 = var3.method6890();
							if (var20 != null) {
								var20.field3750 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
								TriBool.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1137) {
							--class130.Interpreter_intStackSize;
							var19 = var3.method6991();
							if (var19 != null && var19.method6716(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize])) {
								TriBool.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1138) {
							--class130.Interpreter_intStackSize;
							var19 = var3.method6991();
							if (var19 != null && var19.method6591(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize])) {
								TriBool.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1139) {
							--class130.Interpreter_intStackSize;
							var19 = var3.method6991();
							if (var19 != null && var19.method6592(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize])) {
								TriBool.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1140) {
							var14 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
							Client.field740.method4349();
							var21 = var3.method6991();
							if (var21 != null && var21.method6763(var14)) {
								if (var14) {
									Client.field740.method4347(var3);
								}

								TriBool.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1141) {
							var14 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1;
							if (!var14 && Client.field740.method4348() == var3) {
								Client.field740.method4349();
								TriBool.invalidateWidget(var3);
							}

							var21 = var3.method6991();
							if (var21 != null) {
								var21.method6585(var14);
							}

							return 1;
						} else if (var0 == 1142) {
							class130.Interpreter_intStackSize -= 2;
							var19 = var3.method6991();
							if (var19 != null && var19.method6608(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1])) {
								TriBool.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1143) {
							--class130.Interpreter_intStackSize;
							var19 = var3.method6991();
							if (var19 != null && var19.method6608(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize])) {
								TriBool.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1144) {
							--class130.Interpreter_intStackSize;
							var19 = var3.method6991();
							if (var19 != null) {
								var19.method6597(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]);
								TriBool.invalidateWidget(var3);
							}

							return 1;
						} else if (var0 == 1145) {
							--class130.Interpreter_intStackSize;
							var19 = var3.method6991();
							if (var19 != null) {
								var19.method6749(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1146) {
							--class130.Interpreter_intStackSize;
							var19 = var3.method6991();
							if (var19 != null) {
								var19.method6599(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]);
							}

							return 1;
						} else if (var0 == 1147) {
							--class130.Interpreter_intStackSize;
							var19 = var3.method6991();
							if (var19 != null) {
								var19.method6613(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]);
								TriBool.invalidateWidget(var3);
							}

							return 1;
						} else {
							class27 var18;
							if (var0 == 1148) {
								class130.Interpreter_intStackSize -= 2;
								var18 = var3.method6940();
								if (var18 != null) {
									var18.method392(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1149) {
								class130.Interpreter_intStackSize -= 2;
								var18 = var3.method6940();
								if (var18 != null) {
									var18.method393((char)Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize], Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]);
								}

								return 1;
							} else if (var0 == 1150) {
								var3.method6874(Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize], ByteArrayPool.urlRequester);
								return 1;
							} else if (var0 == 1151) {
								class337.Interpreter_stringStackSize -= 3;
								var15 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize];
								String var13 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize + 1];
								String var7 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize + 2];
								long var8 = class452.getUserId();
								long var10 = class229.getUserHash();
								String var12 = class446.getPlatformInfo().getDeviceId(class446.getPlatformInfo().os);
								if (var8 != -1L) {
									var15 = var15.replaceAll("%userid%", Long.toString(var8));
								}

								if (-1L != var10) {
									var15 = var15.replaceAll("%userhash%", Long.toString(var10));
								}

								if (!var12.isEmpty()) {
									var15 = var15.replaceAll("%deviceid%", var12);
								}

								var3.method6869(var15, var13, var7, var12, Long.toString(var10), ByteArrayPool.urlRequester);
								return 1;
							} else if (var0 == 1152) {
								if (var3.type != 11) {
									throw new RuntimeException();
								} else {
									class213 var5 = var3.method6920();
									boolean var6 = var5 != null && class433.method8077().method4250(var5.method4132());
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var6 ? 1 : 0;
									return 1;
								}
							} else {
								return 2;
							}
						}
					}
				}
			}
		}
	}
}
