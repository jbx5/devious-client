import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hd")
public class class184 extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("field2023")
	public static EvictingDualNodeHashTable field2023;
	@ObfuscatedName("ab")
	@Export("osNameLowercase")
	public static String osNameLowercase;
	@ObfuscatedName("jp")
	@ObfuscatedGetter(
		intValue = 1270171629
	)
	static int field1925;

	static {
		field2023 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)[Lok;",
		garbageValue = "218055804"
	)
	@Export("PlayerType_values")
	public static PlayerType[] PlayerType_values() {
		return new PlayerType[]{PlayerType.field4310, PlayerType.PlayerType_ironman, PlayerType.field4303, PlayerType.PlayerType_ultimateIronman, PlayerType.field4318, PlayerType.PlayerType_hardcoreIronman, PlayerType.field4299, PlayerType.PlayerType_playerModerator, PlayerType.PlayerType_jagexModerator, PlayerType.field4319, PlayerType.field4311, PlayerType.field4312, PlayerType.field4304, PlayerType.PlayerType_normal, PlayerType.field4305, PlayerType.field4309, PlayerType.field4308};
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "-1951581624"
	)
	static int method3709(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.publicChatMode;
			return 1;
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) {
			UserComparator6.Interpreter_intStackSize -= 3;
			Client.publicChatMode = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
			class401.privateChatMode = GrandExchangeOfferAgeComparator.method7184(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]);
			if (class401.privateChatMode == null) {
				class401.privateChatMode = PrivateChatMode.field5314;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2];
			PacketBufferNode var13 = class482.getPacketBufferNode(ClientPacket.CHAT_SETFILTER, Client.packetWriter.isaacCipher);
			var13.packetBuffer.writeByte(Client.publicChatMode);
			var13.packetBuffer.writeByte(class401.privateChatMode.field5317);
			var13.packetBuffer.writeByte(Client.tradeChatMode);
			Client.packetWriter.addNode(var13);
			return 1;
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) {
				var8 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
				UserComparator6.Interpreter_intStackSize -= 2;
				var7 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
				var6 = class482.getPacketBufferNode(ClientPacket.CHAT_SENDABUSEREPORT, Client.packetWriter.isaacCipher);
				var6.packetBuffer.writeByte(CollisionMap.stringCp1252NullTerminatedByteSize(var8) + 2);
				var6.packetBuffer.writeStringCp1252NullTerminated(var8);
				var6.packetBuffer.writeByte(var7 - 1);
				var6.packetBuffer.writeByte(var9);
				Client.packetWriter.addNode(var6);
				return 1;
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) {
					UserComparator6.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
					var7 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
					var5 = FloorDecoration.Messages_getByChannelAndID(var3, var7);
					if (var5 != null) {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var5.count;
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var5.cycle;
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
					} else {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
						var4 = AsyncHttpResponse.Messages_getMessage(var3);
						if (var4 != null) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4.type;
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4.cycle;
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
						} else {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
						if (class401.privateChatMode == null) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class401.privateChatMode.field5317;
						}

						return 1;
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) {
							var8 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
							var7 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
							var12 = GrandExchangeOfferOwnWorldComparator.method1249(var7, var8, class92.clientLanguage, -1);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) {
							class211.Interpreter_stringStackSize -= 2;
							var8 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize];
							String var11 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize + 1];
							var12 = class482.getPacketBufferNode(ClientPacket.CHAT_SENDPRIVATE, Client.packetWriter.isaacCipher);
							var12.packetBuffer.writeShort(0);
							int var10 = var12.packetBuffer.offset;
							var12.packetBuffer.writeStringCp1252NullTerminated(var8);
							class228.method4502(var12.packetBuffer, var11);
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) {
							var8 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
							UserComparator6.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
							var6 = GrandExchangeOfferOwnWorldComparator.method1249(var7, var8, class92.clientLanguage, var9);
							Client.packetWriter.addNode(var6);
							return 1;
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) {
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) {
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.tradeChatMode;
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
								var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = GrandExchangeOfferOwnWorldComparator.Messages_getHistorySize(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) {
								var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class231.Messages_getLastChatID(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) {
								var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class211.method4229(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.DOCHEAT) {
								var8 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
								class230.doCheat(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
								Client.field733 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize].toLowerCase().trim();
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
								Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = Client.field733;
								return 1;
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) {
								var8 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
								System.out.println(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) {
								UserComparator6.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
								var7 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
								var5 = FloorDecoration.Messages_getByChannelAndID(var3, var7);
								if (var5 != null) {
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var5.count;
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var5.cycle;
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) {
								var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
								var4 = AsyncHttpResponse.Messages_getMessage(var3);
								if (var4 != null) {
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4.type;
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4.cycle;
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else {
								return 2;
							}
						} else {
							if (KeyHandler.localPlayer != null && KeyHandler.localPlayer.username != null) {
								var8 = KeyHandler.localPlayer.username.getName();
							} else {
								var8 = "";
							}

							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var8;
							return 1;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "1255872498"
	)
	static int method3708(int var0, Script var1, boolean var2) {
		return 2;
	}
}
