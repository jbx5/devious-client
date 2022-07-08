import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("dq")
public class class118 implements MouseWheel {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Ldq;")
	static final class118 field1481;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Ldq;")
	static final class118 field1477;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Ldq;")
	static final class118 field1478;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Ldq;")
	static final class118 field1479;

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Ldq;")
	static final class118 field1480;

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "Ldq;")
	static final class118 field1484;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = -451186485)
	final int field1482;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -1492168119)
	final int field1483;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = 1225507013)
	final int field1486;

	static {
		field1481 = new class118(0, 0, ((String) (null)), 0);
		field1477 = new class118(1, 1, ((String) (null)), 9);
		field1478 = new class118(2, 2, ((String) (null)), 3);
		field1479 = new class118(3, 3, ((String) (null)), 6);
		field1480 = new class118(4, 4, ((String) (null)), 1);
		field1484 = new class118(5, 5, ((String) (null)), 3);
	}

	class118(int var1, int var2, String var3, int var4) {
		this.field1482 = var1;
		this.field1483 = var2;
		this.field1486 = var4;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-100")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1483;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-2129901712")
	int method2736() {
		return this.field1486;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-533774728")
	static void method2738() {
		if (class136.loadWorlds()) {
			Login.worldSelectOpen = true;
			Login.worldSelectPage = 0;
			Login.worldSelectPagesCount = 0;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(descriptor = "(ILbi;ZB)I", garbageValue = "-81")
	static int method2742(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.publicChatMode;
			return 1;
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) {
			class446.Interpreter_intStackSize -= 3;
			Client.publicChatMode = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
			class339.privateChatMode = Ignored.method6780(Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]);
			if (class339.privateChatMode == null) {
				class339.privateChatMode = PrivateChatMode.field4817;
			}
			Client.tradeChatMode = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2];
			PacketBufferNode var13 = EnumComposition.getPacketBufferNode(ClientPacket.CHAT_SETFILTER, Client.packetWriter.isaacCipher);
			var13.packetBuffer.writeByte(Client.publicChatMode);
			var13.packetBuffer.writeByte(class339.privateChatMode.field4820);
			var13.packetBuffer.writeByte(Client.tradeChatMode);
			Client.packetWriter.addNode(var13);
			return 1;
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) {
				var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
				class446.Interpreter_intStackSize -= 2;
				var7 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
				var9 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
				var6 = EnumComposition.getPacketBufferNode(ClientPacket.CHAT_SENDABUSEREPORT, Client.packetWriter.isaacCipher);
				var6.packetBuffer.writeByte(ScriptEvent.stringCp1252NullTerminatedByteSize(var8) + 2);
				var6.packetBuffer.writeStringCp1252NullTerminated(var8);
				var6.packetBuffer.writeByte(var7 - 1);
				var6.packetBuffer.writeByte(var9);
				Client.packetWriter.addNode(var6);
				return 1;
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) {
					class446.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
					var7 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
					var5 = class18.Messages_getByChannelAndID(var3, var7);
					if (var5 != null) {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var5.count;
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var5.cycle;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = (var5.sender != null) ? var5.sender : "";
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = (var5.prefix != null) ? var5.prefix : "";
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = (var5.text != null) ? var5.text : "";
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (var5.isFromFriend()) ? 1 : var5.isFromIgnored() ? 2 : 0;
					} else {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
					}
					return 1;
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
						var4 = UserComparator7.Messages_getMessage(var3);
						if (var4 != null) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var4.type;
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var4.cycle;
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = (var4.sender != null) ? var4.sender : "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = (var4.prefix != null) ? var4.prefix : "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = (var4.text != null) ? var4.text : "";
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (var4.isFromFriend()) ? 1 : var4.isFromIgnored() ? 2 : 0;
						} else {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
						}
						return 1;
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
						if (class339.privateChatMode == null) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class339.privateChatMode.field4820;
						}
						return 1;
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) {
							var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
							var12 = PlayerComposition.method5600(var7, var8, class134.clientLanguage, -1);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) {
							Interpreter.Interpreter_stringStackSize -= 2;
							var8 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
							String var11 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
							var12 = EnumComposition.getPacketBufferNode(ClientPacket.CHAT_SENDPRIVATE, Client.packetWriter.isaacCipher);
							var12.packetBuffer.writeShort(0);
							int var10 = var12.packetBuffer.offset;
							var12.packetBuffer.writeStringCp1252NullTerminated(var8);
							PcmPlayer.method720(var12.packetBuffer, var11);
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) {
							var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							class446.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
							var6 = PlayerComposition.method5600(var7, var8, class134.clientLanguage, var9);
							Client.packetWriter.addNode(var6);
							return 1;
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) {
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) {
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.tradeChatMode;
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
								var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = ClanChannelMember.Messages_getHistorySize(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) {
								var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = DirectByteArrayCopier.Messages_getLastChatID(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) {
								var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = DevicePcmPlayerProvider.method305(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.DOCHEAT) {
								var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
								class115.doCheat(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
								Client.field716 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize].toLowerCase().trim();
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Client.field716;
								return 1;
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) {
								var8 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
								System.out.println(var8);
								return 1;
							} else if (var0 == 5024) {
								--class446.Interpreter_intStackSize;
								return 1;
							} else if (var0 == 5025) {
								++class446.Interpreter_intStackSize;
								return 1;
							} else if (var0 == 5030) {
								class446.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
								var7 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
								var5 = class18.Messages_getByChannelAndID(var3, var7);
								if (var5 != null) {
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var5.count;
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var5.cycle;
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = (var5.sender != null) ? var5.sender : "";
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = (var5.prefix != null) ? var5.prefix : "";
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = (var5.text != null) ? var5.text : "";
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (var5.isFromFriend()) ? 1 : var5.isFromIgnored() ? 2 : 0;
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
								}
								return 1;
							} else if (var0 == 5031) {
								var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
								var4 = UserComparator7.Messages_getMessage(var3);
								if (var4 != null) {
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var4.type;
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var4.cycle;
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = (var4.sender != null) ? var4.sender : "";
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = (var4.prefix != null) ? var4.prefix : "";
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = (var4.text != null) ? var4.text : "";
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (var4.isFromFriend()) ? 1 : var4.isFromIgnored() ? 2 : 0;
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
								}
								return 1;
							} else {
								return 2;
							}
						} else {
							if (class101.localPlayer != null && class101.localPlayer.username != null) {
								var8 = class101.localPlayer.username.getName();
							} else {
								var8 = "";
							}
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var8;
							return 1;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(descriptor = "(ILbi;ZB)I", garbageValue = "-58")
	static int method2744(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.CAM_FORCEANGLE) {
			class446.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
			int var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
			if (!Client.isCameraLocked) {
				Client.camAngleX = var3;
				Client.camAngleY = var4;
			}
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_XA) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.camAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETANGLE_YA) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.camAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_SETFOLLOWHEIGHT) {
			var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
			if (var3 < 0) {
				var3 = 0;
			}
			Client.camFollowHeight = var3;
			return 1;
		} else if (var0 == ScriptOpcodes.CAM_GETFOLLOWHEIGHT) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.camFollowHeight;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(descriptor = "([Lkb;IIIZB)V", garbageValue = "84")
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) {
			Widget var6 = var0[var5];
			if (var6 != null && var6.parentId == var1) {
				Decimator.alignWidgetSize(var6, var2, var3, var4);
				class240.alignWidgetPosition(var6, var2, var3);
				if (var6.scrollX > var6.scrollWidth - var6.width) {
					var6.scrollX = var6.scrollWidth - var6.width;
				}
				if (var6.scrollX < 0) {
					var6.scrollX = 0;
				}
				if (var6.scrollY > var6.scrollHeight - var6.height) {
					var6.scrollY = var6.scrollHeight - var6.height;
				}
				if (var6.scrollY < 0) {
					var6.scrollY = 0;
				}
				if (var6.type == 0) {
					BufferedNetSocket.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}
	}
}