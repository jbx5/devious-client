import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dk")
@Implements("DynamicObject")
public class DynamicObject extends Renderable {
	@ObfuscatedName("tf")
	@ObfuscatedGetter(
		intValue = -570521507
	)
	static int field1049;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	@Export("worldView")
	final WorldView worldView;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1229616605
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1106917505
	)
	@Export("type")
	final int type;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -229054585
	)
	@Export("orientation")
	final int orientation;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -279200905
	)
	@Export("plane")
	final int plane;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 378589425
	)
	@Export("x")
	final int x;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1588561167
	)
	@Export("y")
	final int y;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1034526735
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1815809313
	)
	@Export("cycleStart")
	int cycleStart;

	@ObfuscatedSignature(
		descriptor = "(Ldd;IIIIIIIZLju;)V"
	)
	DynamicObject(WorldView var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, Renderable var10) {
		this.worldView = var1;
		this.id = var2;
		this.type = var3;
		this.orientation = var4;
		this.plane = var5;
		this.x = var6;
		this.y = var7;
		if (var8 != -1) {
			this.sequenceDefinition = HealthBarUpdate.SequenceDefinition_get(var8);
			this.frame = 0;
			this.cycleStart = Client.cycle - 1;
			if (this.sequenceDefinition.restartMode == 0 && var10 instanceof DynamicObject) {
				DynamicObject var11 = (DynamicObject)var10;
				if (var11.sequenceDefinition == this.sequenceDefinition) {
					this.frame = var11.frame;
					this.cycleStart = var11.cycleStart;
					return;
				}
			}

			if (var9 && this.sequenceDefinition.frameCount != -1) {
				if (!this.sequenceDefinition.isCachedModelIdSet()) {
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.frameIds.length);
					this.cycleStart -= (int)(Math.random() * (double)this.sequenceDefinition.frameLengths[this.frame]);
				} else {
					this.frame = (int)(Math.random() * (double)this.sequenceDefinition.method4368());
				}
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Ljm;",
		garbageValue = "-75"
	)
	@Export("getModel")
	protected final Model getModel() {
		ObjectComposition var1 = class273.getObjectDefinition(this.id);
		if (var1.transforms != null) {
			var1 = var1.transform();
		}

		if (var1 == null) {
			return null;
		} else {
			int var2;
			int var3;
			if (this.orientation != 1 && this.orientation != 3) {
				var2 = var1.sizeX;
				var3 = var1.sizeY;
			} else {
				var2 = var1.sizeY;
				var3 = var1.sizeX;
			}

			int var4 = (var2 >> 1) + this.x;
			int var5 = (var2 + 1 >> 1) + this.x;
			int var6 = (var3 >> 1) + this.y;
			int var7 = (var3 + 1 >> 1) + this.y;
			int[][] var8 = this.worldView.tileHeights[this.plane];
			int var9 = var8[var5][var7] + var8[var5][var6] + var8[var4][var6] + var8[var4][var7] >> 2;
			int var10 = (this.x << 7) + (var2 << 6);
			int var11 = (this.y << 7) + (var3 << 6);
			if (this.sequenceDefinition != null) {
				int var12 = Client.cycle - this.cycleStart;
				if (var12 > 100 && this.sequenceDefinition.frameCount > 0) {
					var12 = 100;
				}

				if (!this.sequenceDefinition.isCachedModelIdSet()) {
					label61: {
						do {
							while (true) {
								if (var12 <= this.sequenceDefinition.frameLengths[this.frame]) {
									break label61;
								}

								var12 -= this.sequenceDefinition.frameLengths[this.frame];
								++this.frame;
								if (this.frame >= this.sequenceDefinition.frameIds.length) {
									this.frame -= this.sequenceDefinition.frameCount;
									break;
								}

								class93.method2538(this.sequenceDefinition, this.frame, var10, var11, false);
							}
						} while(this.frame >= 0 && this.frame < this.sequenceDefinition.frameIds.length);

						this.sequenceDefinition = null;
					}
				} else {
					int var13 = this.sequenceDefinition.method4368();
					this.frame += var12;
					var12 = 0;
					if (this.frame >= var13) {
						this.frame = var13 - this.sequenceDefinition.frameCount;
						if (this.frame < 0 || this.frame > var13) {
							this.sequenceDefinition = null;
						}
					}

					if (this.sequenceDefinition != null) {
						Canvas.method318(this.sequenceDefinition, this.frame, var10, var11, false);
					}
				}

				this.cycleStart = Client.cycle - var12;
			}

			return var1.getModelDynamic(this.type, this.orientation, var8, var10, var9, var11, this.sequenceDefinition, this.frame);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lfr;FS)F",
		garbageValue = "30655"
	)
	static float method2401(class137 var0, float var1) {
		if (var0 != null && var0.method3328() != 0) {
			if (var1 < (float)var0.field1607[0].field1554) {
				return var0.field1605 == class135.field1590 ? var0.field1607[0].field1555 : UserComparator6.method3242(var0, var1, true);
			} else if (var1 > (float)var0.field1607[var0.method3328() - 1].field1554) {
				return var0.field1606 == class135.field1590 ? var0.field1607[var0.method3328() - 1].field1555 : UserComparator6.method3242(var0, var1, false);
			} else if (var0.field1604) {
				return var0.field1607[0].field1555;
			} else {
				class132 var2 = var0.method3327(var1);
				boolean var3 = false;
				boolean var4 = false;
				if (var2 == null) {
					return 0.0F;
				} else {
					if (0.0F == var2.field1558 && 0.0F == var2.field1559) {
						var3 = true;
					} else if (Float.MAX_VALUE == var2.field1558 && Float.MAX_VALUE == var2.field1559) {
						var4 = true;
					} else if (var2.field1560 != null) {
						if (var0.field1619) {
							float var5 = (float)var2.field1554;
							float var9 = var2.field1555;
							float var6 = var5 + var2.field1558 * 0.33333334F;
							float var10 = var9 + var2.field1559 * 0.33333334F;
							float var8 = (float)var2.field1560.field1554;
							float var12 = var2.field1560.field1555;
							float var7 = var8 - var2.field1560.field1556 * 0.33333334F;
							float var11 = var12 - var2.field1560.field1557 * 0.33333334F;
							float var15;
							float var16;
							float var17;
							float var18;
							float var19;
							if (var0.field1618) {
								var15 = var10;
								var16 = var11;
								if (var0 != null) {
									var17 = var8 - var5;
									if (0.0F != var17) {
										var18 = var6 - var5;
										var19 = var7 - var5;
										float[] var23 = new float[]{var18 / var17, var19 / var17};
										var0.field1603 = 0.33333334F == var23[0] && 0.6666667F == var23[1];
										float var21 = var23[0];
										float var22 = var23[1];
										if (var23[0] < 0.0F) {
											var23[0] = 0.0F;
										}

										if (var23[1] > 1.0F) {
											var23[1] = 1.0F;
										}

										if (var23[0] > 1.0F || var23[1] < -1.0F) {
											class310.method6339(var23);
										}

										float var10000;
										if (var21 != var23[0]) {
											var10000 = var5 + var17 * var23[0];
											if (0.0F != var21) {
												var15 = var9 + (var10 - var9) * var23[0] / var21;
											}
										}

										if (var23[1] != var22) {
											var10000 = var5 + var23[1] * var17;
											if (1.0F != var22) {
												var16 = var12 - (1.0F - var23[1]) * (var12 - var11) / (1.0F - var22);
											}
										}

										var0.field1609 = var5;
										var0.field1610 = var8;
										AsyncHttpResponse.method276(0.0F, var23[0], var23[1], 1.0F, var0);
										class149.method3468(var9, var15, var16, var12, var0);
									}
								}
							} else if (var0 != null) {
								var0.field1609 = var5;
								float var13 = var8 - var5;
								float var14 = var12 - var9;
								var15 = var6 - var5;
								var16 = 0.0F;
								var17 = 0.0F;
								if (var15 != 0.0F) {
									var16 = (var10 - var9) / var15;
								}

								var15 = var8 - var7;
								if (var15 != 0.0F) {
									var17 = (var12 - var11) / var15;
								}

								var18 = 1.0F / (var13 * var13);
								var19 = var16 * var13;
								float var20 = var17 * var13;
								var0.field1623 = (var19 + var20 - var14 - var14) * var18 / var13;
								var0.field1612 = var18 * (var14 + var14 + var14 - var19 - var19 - var20);
								var0.field1613 = var16;
								var0.field1614 = var9;
							}

							var0.field1619 = false;
						}
					} else {
						var3 = true;
					}

					if (var3) {
						return var2.field1555;
					} else if (var4) {
						return (float)var2.field1554 != var1 && var2.field1560 != null ? var2.field1560.field1555 : var2.field1555;
					} else {
						return var0.field1618 ? class357.method6875(var0, var1) : ChatChannel.method2420(var0, var1);
					}
				}
			}
		} else {
			return 0.0F;
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZS)I",
		garbageValue = "19894"
	)
	static int method2398(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Client.publicChatMode;
			return 1;
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) {
			class320.Interpreter_intStackSize -= 3;
			Client.publicChatMode = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
			class160.privateChatMode = ChatChannel.method2411(Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1]);
			if (class160.privateChatMode == null) {
				class160.privateChatMode = PrivateChatMode.field5569;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 2];
			PacketBufferNode var13 = class141.getPacketBufferNode(ClientPacket.CHAT_SETFILTER, Client.packetWriter.isaacCipher);
			var13.packetBuffer.writeByte(Client.publicChatMode);
			var13.packetBuffer.writeByte(class160.privateChatMode.field5567);
			var13.packetBuffer.writeByte(Client.tradeChatMode);
			Client.packetWriter.addNode(var13);
			return 1;
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) {
				var8 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
				class320.Interpreter_intStackSize -= 2;
				var7 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
				var9 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
				var6 = class141.getPacketBufferNode(ClientPacket.CHAT_SENDABUSEREPORT, Client.packetWriter.isaacCipher);
				var6.packetBuffer.writeByte(class536.stringCp1252NullTerminatedByteSize(var8) + 2);
				var6.packetBuffer.writeStringCp1252NullTerminated(var8);
				var6.packetBuffer.writeByte(var7 - 1);
				var6.packetBuffer.writeByte(var9);
				Client.packetWriter.addNode(var6);
				return 1;
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) {
					class320.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
					var7 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
					var5 = MouseRecorder.Messages_getByChannelAndID(var3, var7);
					if (var5 != null) {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var5.count;
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var5.cycle;
						Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
						Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
						Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
					} else {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
						var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
						var4 = ApproximateRouteStrategy.Messages_getMessage(var3);
						if (var4 != null) {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var4.type;
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var4.cycle;
							Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
							Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
							Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
						} else {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
						if (class160.privateChatMode == null) {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = class160.privateChatMode.field5567;
						}

						return 1;
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) {
							var8 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
							var7 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
							var12 = class421.method8029(var7, var8, LoginScreenAnimation.clientLanguage, -1);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) {
							class465.Interpreter_stringStackSize -= 2;
							var8 = Interpreter.Interpreter_stringStack[class465.Interpreter_stringStackSize];
							String var11 = Interpreter.Interpreter_stringStack[class465.Interpreter_stringStackSize + 1];
							var12 = class141.getPacketBufferNode(ClientPacket.CHAT_SENDPRIVATE, Client.packetWriter.isaacCipher);
							var12.packetBuffer.writeShort(0);
							int var10 = var12.packetBuffer.offset;
							var12.packetBuffer.writeStringCp1252NullTerminated(var8);
							WorldMapSprite.method6191(var12.packetBuffer, var11);
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) {
							var8 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
							class320.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
							var6 = class421.method8029(var7, var8, LoginScreenAnimation.clientLanguage, var9);
							Client.packetWriter.addNode(var6);
							return 1;
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) {
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) {
								Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Client.tradeChatMode;
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
								var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = WorldMapElement.Messages_getHistorySize(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) {
								var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = ClanSettings.Messages_getLastChatID(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) {
								var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = LoginState.method1282(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.DOCHEAT) {
								var8 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
								class178.doCheat(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
								Client.field745 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize].toLowerCase().trim();
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
								Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = Client.field745;
								return 1;
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) {
								var8 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
								System.out.println(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) {
								class320.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
								var7 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
								var5 = MouseRecorder.Messages_getByChannelAndID(var3, var7);
								if (var5 != null) {
									Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var5.count;
									Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var5.cycle;
									Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
									Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
									Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
									Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) {
								var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
								var4 = ApproximateRouteStrategy.Messages_getMessage(var3);
								if (var4 != null) {
									Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var4.type;
									Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var4.cycle;
									Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
									Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
									Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
									Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else {
								return 2;
							}
						} else {
							if (AddRequestTask.localPlayer != null && AddRequestTask.localPlayer.username != null) {
								var8 = AddRequestTask.localPlayer.username.getName();
							} else {
								var8 = "";
							}

							Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var8;
							return 1;
						}
					}
				}
			}
		}
	}
}
