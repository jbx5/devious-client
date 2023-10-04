import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gj")
public class class158 extends class161 {
	@ObfuscatedName("am")
	static int[][] field1739;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1695262627
	)
	int field1735;
	@ObfuscatedName("al")
	byte field1733;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -2077408315
	)
	int field1736;
	@ObfuscatedName("ax")
	String field1737;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgf;"
	)
	final class162 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgf;)V"
	)
	class158(class162 var1) {
		this.this$0 = var1;
		this.field1735 = -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;B)V",
		garbageValue = "0"
	)
	void vmethod3405(Buffer var1) {
		var1.readUnsignedByte();
		this.field1735 = var1.readUnsignedShort();
		this.field1733 = var1.readByte();
		this.field1736 = var1.readUnsignedShort();
		var1.readLong();
		this.field1737 = var1.readStringCp1252NullTerminated();
		var1.readUnsignedByte();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgb;B)V",
		garbageValue = "0"
	)
	void vmethod3411(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1735);
		var2.rank = this.field1733;
		var2.world = this.field1736;
		var2.username = new Username(this.field1737);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ldl;Lds;III)V",
		garbageValue = "-1880567886"
	)
	@Export("runScriptLogic")
	static void runScriptLogic(ScriptEvent var0, Script var1, int var2, int var3) {
		Object[] var4 = var0.args;
		Interpreter.Interpreter_intStackSize = 0;
		class180.Interpreter_stringStackSize = 0;
		int var5 = -1;
		int[] var6 = var1.opcodes;
		int[] var7 = var1.intOperands;
		byte var8 = -1;
		Interpreter.Interpreter_frameDepth = 0;
		Interpreter.field882 = false;
		boolean var9 = false;
		int var10 = 0;
		boolean var29 = false;

		label933: {
			label934: {
				try {
					int var13;
					try {
						var29 = true;
						Interpreter.Interpreter_intLocals = new int[var1.localIntCount];
						int var11 = 0;
						class160.Interpreter_stringLocals = new String[var1.localStringCount];
						int var12 = 0;

						int var14;
						String var20;
						for (var13 = 1; var13 < var4.length; ++var13) {
							if (var4[var13] instanceof Integer) {
								var14 = (Integer)var4[var13];
								if (var14 == -2147483647) {
									var14 = var0.mouseX;
								}

								if (var14 == -2147483646) {
									var14 = var0.mouseY;
								}

								if (var14 == -2147483645) {
									var14 = var0.widget != null ? var0.widget.id : -1;
								}

								if (var14 == -2147483644) {
									var14 = var0.opIndex;
								}

								if (var14 == -2147483643) {
									var14 = var0.widget != null ? var0.widget.childIndex : -1;
								}

								if (var14 == -2147483642) {
									var14 = var0.dragTarget != null ? var0.dragTarget.id : -1;
								}

								if (var14 == -2147483641) {
									var14 = var0.dragTarget != null ? var0.dragTarget.childIndex : -1;
								}

								if (var14 == -2147483640) {
									var14 = var0.keyTyped;
								}

								if (var14 == -2147483639) {
									var14 = var0.keyPressed;
								}

								Interpreter.Interpreter_intLocals[var11++] = var14;
							} else if (var4[var13] instanceof String) {
								var20 = (String)var4[var13];
								if (var20.equals("event_opbase")) {
									var20 = var0.targetName;
								}

								class160.Interpreter_stringLocals[var12++] = var20;
							}
						}

						Interpreter.field878 = var0.field1078;

						while (true) {
							++var10;
							if (var10 > var2) {
								throw new RuntimeException();
							}

							++var5;
							int var32 = var6[var5];
							if (var32 >= 100) {
								boolean var34;
								if (var1.intOperands[var5] == 1) {
									var34 = true;
								} else {
									var34 = false;
								}

								var14 = ViewportMouse.method5046(var32, var1, var34);
								switch(var14) {
								case 0:
									var29 = false;
									break label934;
								case 1:
								default:
									break;
								case 2:
									throw new IllegalStateException();
								}
							} else if (var32 == 0) {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7[var5];
							} else if (var32 == 1) {
								var13 = var7[var5];
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Varps.Varps_main[var13];
							} else if (var32 == 2) {
								var13 = var7[var5];
								Varps.Varps_main[var13] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								ScriptEvent.changeGameOptions(var13);
							} else if (var32 == 3) {
								Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var1.stringOperands[var5];
							} else if (var32 == 6) {
								var5 += var7[var5];
							} else if (var32 == 7) {
								Interpreter.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] != Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 8) {
								Interpreter.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] == Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 9) {
								Interpreter.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] < Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 10) {
								Interpreter.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] > Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 21) {
								if (Interpreter.Interpreter_frameDepth == 0) {
									var29 = false;
									break label933;
								}

								ScriptFrame var39 = Interpreter.Interpreter_frames[--Interpreter.Interpreter_frameDepth];
								var1 = var39.script;
								var6 = var1.opcodes;
								var7 = var1.intOperands;
								var5 = var39.pc;
								Interpreter.Interpreter_intLocals = var39.intLocals;
								class160.Interpreter_stringLocals = var39.stringLocals;
							} else if (var32 == 25) {
								var13 = var7[var5];
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class36.getVarbit(var13);
							} else if (var32 == 27) {
								var13 = var7[var5];
								class130.method3012(var13, Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
							} else if (var32 == 31) {
								Interpreter.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] <= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 32) {
								Interpreter.Interpreter_intStackSize -= 2;
								if (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize] >= Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]) {
									var5 += var7[var5];
								}
							} else if (var32 == 33) {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.Interpreter_intLocals[var7[var5]];
							} else if (var32 == 34) {
								Interpreter.Interpreter_intLocals[var7[var5]] = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							} else if (var32 == 35) {
								Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = class160.Interpreter_stringLocals[var7[var5]];
							} else if (var32 == 36) {
								class160.Interpreter_stringLocals[var7[var5]] = Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize];
							} else if (var32 == 37) {
								var13 = var7[var5];
								class180.Interpreter_stringStackSize -= var13;
								var20 = class316.method5906(Interpreter.Interpreter_stringStack, class180.Interpreter_stringStackSize, var13);
								Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var20;
							} else if (var32 == 38) {
								--Interpreter.Interpreter_intStackSize;
							} else if (var32 == 39) {
								--class180.Interpreter_stringStackSize;
							} else {
								int var17;
								if (var32 != 40) {
									if (var32 == 42) {
										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class33.varcs.getInt(var7[var5]);
									} else if (var32 == 43) {
										class33.varcs.setInt(var7[var5], Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
									} else if (var32 == 44) {
										var13 = var7[var5] >> 16;
										var14 = var7[var5] & 65535;
										int var23 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
										if (var23 < 0 || var23 > 5000) {
											throw new RuntimeException();
										}

										Interpreter.Interpreter_arrayLengths[var13] = var23;
										byte var24 = -1;
										if (var14 == 105) {
											var24 = 0;
										}

										for (var17 = 0; var17 < var23; ++var17) {
											Interpreter.Interpreter_arrays[var13][var17] = var24;
										}
									} else if (var32 == 45) {
										var13 = var7[var5];
										var14 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
											throw new RuntimeException();
										}

										Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Interpreter.Interpreter_arrays[var13][var14];
									} else if (var32 == 46) {
										var13 = var7[var5];
										Interpreter.Interpreter_intStackSize -= 2;
										var14 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
										if (var14 < 0 || var14 >= Interpreter.Interpreter_arrayLengths[var13]) {
											throw new RuntimeException();
										}

										Interpreter.Interpreter_arrays[var13][var14] = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
									} else {
										String var21;
										if (var32 == 47) {
											var21 = class33.varcs.getStringOld(var7[var5]);
											if (var21 == null) {
												var21 = "null";
											}

											Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var21;
										} else if (var32 == 48) {
											class33.varcs.setStringOld(var7[var5], Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]);
										} else if (var32 == 49) {
											var21 = class33.varcs.getString(var7[var5]);
											Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var21;
										} else if (var32 == 50) {
											class33.varcs.setString(var7[var5], Interpreter.Interpreter_stringStack[--class180.Interpreter_stringStackSize]);
										} else if (var32 == 60) {
											IterableNodeHashTable var37 = var1.switches[var7[var5]];
											IntegerNode var36 = (IntegerNode)var37.get((long)Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
											if (var36 != null) {
												var5 += var36.integer;
											}
										} else {
											Integer var38;
											if (var32 == 74) {
												var38 = class295.field3108.getTitleGroupValue(var7[var5]);
												if (var38 == null) {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var38;
												}
											} else {
												if (var32 != 76) {
													throw new IllegalStateException();
												}

												var38 = SequenceDefinition.field2316.method8445(var7[var5]);
												if (var38 == null) {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var38;
												}
											}
										}
									}
								} else {
									var13 = var7[var5];
									Script var35 = class28.getScript(var13);
									int[] var15 = new int[var35.localIntCount];
									String[] var16 = new String[var35.localStringCount];

									for (var17 = 0; var17 < var35.intArgumentCount; ++var17) {
										var15[var17] = Interpreter.Interpreter_intStack[var17 + (Interpreter.Interpreter_intStackSize - var35.intArgumentCount)];
									}

									for (var17 = 0; var17 < var35.stringArgumentCount; ++var17) {
										var16[var17] = Interpreter.Interpreter_stringStack[var17 + (class180.Interpreter_stringStackSize - var35.stringArgumentCount)];
									}

									Interpreter.Interpreter_intStackSize -= var35.intArgumentCount;
									class180.Interpreter_stringStackSize -= var35.stringArgumentCount;
									ScriptFrame var22 = new ScriptFrame();
									var22.script = var1;
									var22.pc = var5;
									var22.intLocals = Interpreter.Interpreter_intLocals;
									var22.stringLocals = class160.Interpreter_stringLocals;
									Interpreter.Interpreter_frames[++Interpreter.Interpreter_frameDepth - 1] = var22;
									var1 = var35;
									var6 = var35.opcodes;
									var7 = var35.intOperands;
									var5 = -1;
									Interpreter.Interpreter_intLocals = var15;
									class160.Interpreter_stringLocals = var16;
								}
							}
						}
					} catch (Exception var30) {
						var9 = true;
						StringBuilder var26 = new StringBuilder(30);
						var26.append("").append(var1.key).append(" ");
						var13 = Interpreter.Interpreter_frameDepth - 1;

						while (true) {
							if (var13 < 0) {
								var26.append("").append(var8);
								class190.RunException_sendStackTrace(var26.toString(), var30);
								var29 = false;
								break;
							}

							var26.append("").append(Interpreter.Interpreter_frames[var13].script.key).append(" ");
							--var13;
						}
					}
				} finally {
					if (var29) {
						while (Interpreter.field886.size() > 0) {
							class104 var19 = (class104)Interpreter.field886.remove(0);
							TextureProvider.widgetDefaultMenuAction(var19.method2706(), var19.method2695(), var19.method2707(), var19.method2694(), "");
						}

						if (Interpreter.field882) {
							Interpreter.field882 = false;
							GrandExchangeOfferOwnWorldComparator.method1240();
						}

						if (!var9 && var3 > 0 && var10 >= var3) {
							class190.RunException_sendStackTrace("Warning: Script " + var1.field1004 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
						}

					}
				}

				while (Interpreter.field886.size() > 0) {
					class104 var25 = (class104)Interpreter.field886.remove(0);
					TextureProvider.widgetDefaultMenuAction(var25.method2706(), var25.method2695(), var25.method2707(), var25.method2694(), "");
				}

				if (Interpreter.field882) {
					Interpreter.field882 = false;
					GrandExchangeOfferOwnWorldComparator.method1240();
				}

				if (!var9 && var3 > 0 && var10 >= var3) {
					class190.RunException_sendStackTrace("Warning: Script " + var1.field1004 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
				}

				return;
			}

			while (Interpreter.field886.size() > 0) {
				class104 var33 = (class104)Interpreter.field886.remove(0);
				TextureProvider.widgetDefaultMenuAction(var33.method2706(), var33.method2695(), var33.method2707(), var33.method2694(), "");
			}

			if (Interpreter.field882) {
				Interpreter.field882 = false;
				GrandExchangeOfferOwnWorldComparator.method1240();
			}

			if (!var9 && var3 > 0 && var10 >= var3) {
				class190.RunException_sendStackTrace("Warning: Script " + var1.field1004 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
			}

			return;
		}

		while (Interpreter.field886.size() > 0) {
			class104 var40 = (class104)Interpreter.field886.remove(0);
			TextureProvider.widgetDefaultMenuAction(var40.method2706(), var40.method2695(), var40.method2707(), var40.method2694(), "");
		}

		if (Interpreter.field882) {
			Interpreter.field882 = false;
			GrandExchangeOfferOwnWorldComparator.method1240();
		}

		if (!var9 && var3 > 0 && var10 >= var3) {
			class190.RunException_sendStackTrace("Warning: Script " + var1.field1004 + " finished at op count " + var10 + " of max " + var2, (Throwable)null);
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)Lud;",
		garbageValue = "2006480609"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) {
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) {
			var4 = 1;
		}

		long var6 = ((long)var4 << 40) + ((long)var1 << 16) + (long)var0 + ((long)var2 << 38) + ((long)var3 << 42);
		SpritePixels var8;
		if (!var5) {
			var8 = (SpritePixels)ItemComposition.ItemDefinition_cachedSprites.get(var6);
			if (var8 != null) {
				return var8;
			}
		}

		ItemComposition var9 = class214.ItemDefinition_get(var0);
		if (var1 > 1 && var9.countobj != null) {
			int var10 = -1;

			for (int var11 = 0; var11 < 10; ++var11) {
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) {
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) {
				var9 = class214.ItemDefinition_get(var10);
			}
		}

		Model var20 = var9.getModel(1);
		if (var20 == null) {
			return null;
		} else {
			SpritePixels var21 = null;
			if (var9.noteTemplate != -1) {
				var21 = getItemSprite(var9.note, 10, 1, 0, 0, true);
				if (var21 == null) {
					return null;
				}
			} else if (var9.notedId != -1) {
				var21 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false);
				if (var21 == null) {
					return null;
				}
			} else if (var9.placeholderTemplate != -1) {
				var21 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false);
				if (var21 == null) {
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels;
			int var13 = Rasterizer2D.Rasterizer2D_width;
			int var14 = Rasterizer2D.Rasterizer2D_height;
			float[] var15 = Rasterizer2D.field5209;
			int[] var16 = new int[4];
			Rasterizer2D.Rasterizer2D_getClipArray(var16);
			var8 = new SpritePixels(36, 32);
			Rasterizer3D.method4530(var8.pixels, 36, 32, (float[])null);
			Rasterizer2D.Rasterizer2D_clear();
			Rasterizer3D.method4535();
			Rasterizer3D.method4534(16, 16);
			Rasterizer3D.clips.rasterGouraudLowRes = false;
			if (var9.placeholderTemplate != -1) {
				var21.drawTransBgAt(0, 0);
			}

			int var17 = var9.zoom2d;
			if (var5) {
				var17 = (int)(1.5D * (double)var17);
			} else if (var2 == 2) {
				var17 = (int)(1.04D * (double)var17);
			}

			int var18 = var17 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16;
			int var19 = var17 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16;
			var20.calculateBoundsCylinder();
			var20.method4933(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var20.height / 2 + var18 + var9.offsetY2d, var19 + var9.offsetY2d);
			if (var9.notedId != -1) {
				var21.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) {
				var8.outline(1);
			}

			if (var2 >= 2) {
				var8.outline(16777215);
			}

			if (var3 != 0) {
				var8.shadow(var3);
			}

			Rasterizer3D.method4530(var8.pixels, 36, 32, (float[])null);
			if (var9.noteTemplate != -1) {
				var21.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) {
				class142.ItemDefinition_fontPlain11.draw(class481.method8541(var1), 0, 9, 16776960, 1);
			}

			if (!var5) {
				ItemComposition.ItemDefinition_cachedSprites.put(var8, var6);
			}

			Rasterizer3D.method4530(var12, var13, var14, var15);
			Rasterizer2D.Rasterizer2D_setClipArray(var16);
			Rasterizer3D.method4535();
			Rasterizer3D.clips.rasterGouraudLowRes = true;
			return var8;
		}
	}
}
