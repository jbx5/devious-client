import java.nio.ByteBuffer;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("oa")
@Implements("DirectByteArrayCopier")
public class DirectByteArrayCopier extends AbstractByteArrayCopier {
	@ObfuscatedName("ap")
	@Export("directBuffer")
	ByteBuffer directBuffer;

	DirectByteArrayCopier() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-1554576635"
	)
	@Export("get")
	byte[] get() {
		byte[] var1 = new byte[this.directBuffer.capacity()];
		this.directBuffer.position(0);
		this.directBuffer.get(var1);
		return var1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1596326651"
	)
	@Export("set")
	void set(byte[] var1) {
		this.directBuffer = ByteBuffer.allocateDirect(var1.length);
		this.directBuffer.position(0);
		this.directBuffer.put(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZI)[B",
		garbageValue = "1036440399"
	)
	public static byte[] method7507(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var6 = (byte[])((byte[])var0);
			if (var1) {
				int var4 = var6.length;
				byte[] var5 = new byte[var4];
				System.arraycopy(var6, 0, var5, 0, var4);
				return var5;
			} else {
				return var6;
			}
		} else if (var0 instanceof AbstractByteArrayCopier) {
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0;
			return var2.get();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZI)I",
		garbageValue = "1364691607"
	)
	static int method7503(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = class416.widgetDefinition.method6911(Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? UserComparator2.scriptDotWidget : HttpRequestTask.scriptActiveWidget;
		}

		String var4 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
		int[] var5 = null;
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
			int var6 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
			if (var6 > 0) {
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize]) {
				}
			}

			var4 = var4.substring(0, var4.length() - 1);
		}

		Object[] var9 = new Object[var4.length() + 1];

		int var7;
		for (var7 = var9.length - 1; var7 >= 1; --var7) {
			if (var4.charAt(var7 - 1) == 's') {
				var9[var7] = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
			} else {
				var9[var7] = new Integer(Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize]);
			}
		}

		var7 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
		if (var7 != -1) {
			var9[0] = new Integer(var7);
		} else {
			var9 = null;
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) {
			var3.onClick = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) {
			var3.onHold = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) {
			var3.onRelease = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) {
			var3.onMouseOver = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) {
			var3.onMouseLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) {
			var3.onDrag = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) {
			var3.onTargetLeave = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) {
			var3.onVarTransmit = var9;
			var3.varTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) {
			var3.onTimer = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) {
			var3.onOp = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) {
			var3.onDragComplete = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) {
			var3.onClickRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) {
			var3.onMouseRepeat = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) {
			var3.onInvTransmit = var9;
			var3.invTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) {
			var3.onStatTransmit = var9;
			var3.statTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) {
			var3.onTargetEnter = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) {
			var3.onScroll = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) {
			var3.onChatTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) {
			var3.onKey = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) {
			var3.onFriendTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) {
			var3.onClanTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) {
			var3.onMiscTransmit = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) {
			var3.onDialogAbort = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) {
			var3.onSubChange = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) {
			var3.onStockTransmit = var9;
		} else if (var0 == 1426) {
			var3.field4007 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) {
			var3.onResize = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) {
			var3.field3965 = var9;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) {
			var3.field4001 = var9;
		} else if (var0 == 1430) {
			var3.field3916 = var9;
		} else if (var0 == 1431) {
			var3.field3997 = var9;
		} else if (var0 == 1434) {
			var3.field3991 = var9;
		} else if (var0 == 1435) {
			var3.field3918 = var9;
		} else {
			if (var0 < 1436 || var0 > 1439) {
				return 2;
			}

			class357 var8 = var3.method7287();
			if (var8 != null) {
				if (var0 == 1436) {
					var8.field3812 = var9;
				} else if (var0 == 1437) {
					var8.field3811 = var9;
				} else if (var0 == 1438) {
					var8.field3814 = var9;
				} else if (var0 == 1439) {
					var8.field3808 = var9;
				}
			}
		}

		var3.hasListener = true;
		return 1;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZI)I",
		garbageValue = "-1608024146"
	)
	static int method7506(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Client.publicChatMode;
			return 1;
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) {
			class96.Interpreter_intStackSize -= 3;
			Client.publicChatMode = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
			class374.privateChatMode = class550.method10014(Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1]);
			if (class374.privateChatMode == null) {
				class374.privateChatMode = PrivateChatMode.field5619;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 2];
			PacketBufferNode var13 = class113.getPacketBufferNode(ClientPacket.CHAT_SETFILTER, Client.packetWriter.isaacCipher);
			var13.packetBuffer.writeByte(Client.publicChatMode);
			var13.packetBuffer.writeByte(class374.privateChatMode.field5618);
			var13.packetBuffer.writeByte(Client.tradeChatMode);
			Client.packetWriter.addNode(var13);
			return 1;
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) {
				var8 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
				class96.Interpreter_intStackSize -= 2;
				var7 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
				var9 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
				var6 = class113.getPacketBufferNode(ClientPacket.CHAT_SENDABUSEREPORT, Client.packetWriter.isaacCipher);
				var6.packetBuffer.writeByte(World.stringCp1252NullTerminatedByteSize(var8) + 2);
				var6.packetBuffer.writeStringCp1252NullTerminated(var8);
				var6.packetBuffer.writeByte(var7 - 1);
				var6.packetBuffer.writeByte(var9);
				Client.packetWriter.addNode(var6);
				return 1;
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) {
					class96.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
					var7 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
					var5 = MilliClock.Messages_getByChannelAndID(var3, var7);
					if (var5 != null) {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var5.count;
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var5.cycle;
						Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
						Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
						Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
					} else {
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
						var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
						var4 = Client.Messages_getMessage(var3);
						if (var4 != null) {
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var4.type;
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var4.cycle;
							Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
							Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
							Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
						} else {
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
						if (class374.privateChatMode == null) {
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = class374.privateChatMode.field5618;
						}

						return 1;
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) {
							var8 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
							var7 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
							var12 = HttpResponse.method305(var7, var8, WorldMapCacheName.clientLanguage, -1);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) {
							class208.Interpreter_stringStackSize -= 2;
							var8 = Interpreter.Interpreter_stringStack[class208.Interpreter_stringStackSize];
							String var11 = Interpreter.Interpreter_stringStack[class208.Interpreter_stringStackSize + 1];
							var12 = class113.getPacketBufferNode(ClientPacket.CHAT_SENDPRIVATE, Client.packetWriter.isaacCipher);
							var12.packetBuffer.writeShort(0);
							int var10 = var12.packetBuffer.offset;
							var12.packetBuffer.writeStringCp1252NullTerminated(var8);
							class217.method4484(var12.packetBuffer, var11);
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) {
							var8 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
							class96.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
							var6 = HttpResponse.method305(var7, var8, WorldMapCacheName.clientLanguage, var9);
							Client.packetWriter.addNode(var6);
							return 1;
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) {
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) {
								Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Client.tradeChatMode;
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
								var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = InvDefinition.Messages_getHistorySize(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) {
								var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = class229.Messages_getLastChatID(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) {
								var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = class545.method9958(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.DOCHEAT) {
								var8 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
								HttpRequestTask.doCheat(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
								Client.field730 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize].toLowerCase().trim();
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
								Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = Client.field730;
								return 1;
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) {
								var8 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
								System.out.println(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) {
								class96.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
								var7 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
								var5 = MilliClock.Messages_getByChannelAndID(var3, var7);
								if (var5 != null) {
									Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var5.count;
									Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var5.cycle;
									Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
									Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
									Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
									Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) {
								var3 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
								var4 = Client.Messages_getMessage(var3);
								if (var4 != null) {
									Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var4.type;
									Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var4.cycle;
									Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
									Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
									Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
									Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else {
								return 2;
							}
						} else {
							if (SpriteMask.localPlayer != null && SpriteMask.localPlayer.username != null) {
								var8 = SpriteMask.localPlayer.username.getName();
							} else {
								var8 = "";
							}

							Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var8;
							return 1;
						}
					}
				}
			}
		}
	}
}
