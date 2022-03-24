




import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.Implements; import net.runelite.mapping.ObfuscatedGetter; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("t")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class47 {
	@ObfuscatedName("sj")
	@ObfuscatedGetter(intValue = 
	-637981437)

	static int field146;
	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"Llq;")

	@Export("SequenceDefinition_skeletonsArchive")
	public static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 
	798256057)

	@Export("musicTrackVolume")
	public static int musicTrackVolume;
	@ObfuscatedName("el")
	@ObfuscatedSignature(descriptor = 
	"Llu;")

	@Export("archive14")
	static Archive archive14;

	DevicePcmPlayerProvider() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)Lao;", garbageValue = 
	"-1472980183")

	@Export("player")
	public PcmPlayer player() {
		return new DevicePcmPlayer();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)[Lda;", garbageValue = 
	"-1114679532")

	static class123[] method383() {
		return new class123[]{ class123.field1505, class123.field1494, class123.field1495, class123.field1496, class123.field1497, class123.field1498, class123.field1493, class123.field1500, class123.field1501 };
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(descriptor = 
	"(ILbo;ZI)I", garbageValue = 
	"1263905668")

	static int method384(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Client.publicChatMode;
			return 1;
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) {
			class295.Interpreter_intStackSize -= 3;
			Client.publicChatMode = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
			Varps.privateChatMode = class83.method2124(Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]);
			if (Varps.privateChatMode == null) {
				Varps.privateChatMode = PrivateChatMode.field4738;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2];
			PacketBufferNode var13 = ItemContainer.getPacketBufferNode(ClientPacket.field2907, Client.packetWriter.isaacCipher);
			var13.packetBuffer.writeByte(Client.publicChatMode);
			var13.packetBuffer.writeByte(Varps.privateChatMode.field4737);
			var13.packetBuffer.writeByte(Client.tradeChatMode);
			Client.packetWriter.addNode(var13);
			return 1;
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) {
				var8 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
				class295.Interpreter_intStackSize -= 2;
				var7 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
				var9 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
				var6 = ItemContainer.getPacketBufferNode(ClientPacket.field2926, Client.packetWriter.isaacCipher);
				var6.packetBuffer.writeByte(ItemLayer.stringCp1252NullTerminatedByteSize(var8) + 2);
				var6.packetBuffer.writeStringCp1252NullTerminated(var8);
				var6.packetBuffer.writeByte(var7 - 1);
				var6.packetBuffer.writeByte(var9);
				Client.packetWriter.addNode(var6);
				return 1;
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) {
					class295.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
					var7 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
					var5 = Tiles.Messages_getByChannelAndID(var3, var7);
					if (var5 != null) {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var5.count;
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var5.cycle;
						Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = (var5.sender != null) ? var5.sender : "";
						Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = (var5.prefix != null) ? var5.prefix : "";
						Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = (var5.text != null) ? var5.text : "";
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (var5.isFromFriend()) ? 1 : var5.isFromIgnored() ? 2 : 0;
					} else {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
						Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
						Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
						Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
					}

					return 1;
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
						var4 = Strings.Messages_getMessage(var3);
						if (var4 != null) {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var4.type;
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var4.cycle;
							Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = (var4.sender != null) ? var4.sender : "";
							Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = (var4.prefix != null) ? var4.prefix : "";
							Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = (var4.text != null) ? var4.text : "";
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (var4.isFromFriend()) ? 1 : var4.isFromIgnored() ? 2 : 0;
						} else {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
							Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
							Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
							Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
						if (Varps.privateChatMode == null) {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Varps.privateChatMode.field4737;
						}

						return 1;
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) {
							var8 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
							var7 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
							var12 = class388.method7151(var7, var8, FriendSystem.clientLanguage, -1);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) {
							ChatChannel.Interpreter_stringStackSize -= 2;
							var8 = Interpreter.Interpreter_stringStack[ChatChannel.Interpreter_stringStackSize];
							String var11 = Interpreter.Interpreter_stringStack[ChatChannel.Interpreter_stringStackSize + 1];
							var12 = ItemContainer.getPacketBufferNode(ClientPacket.field2990, Client.packetWriter.isaacCipher);
							var12.packetBuffer.writeShort(0);
							int var10 = var12.packetBuffer.offset;
							var12.packetBuffer.writeStringCp1252NullTerminated(var8);
							WorldMapIcon_0.method4900(var12.packetBuffer, var11);
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) {
							var8 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
							class295.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
							var6 = class388.method7151(var7, var8, FriendSystem.clientLanguage, var9);
							Client.packetWriter.addNode(var6);
							return 1;
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) {
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) {
								Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Client.tradeChatMode;
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
								var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = Message.Messages_getHistorySize(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) {
								var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = class18.Messages_getLastChatID(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) {
								var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = WorldMapSectionType.method4942(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.DOCHEAT) {
								var8 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
								class9.doCheat(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
								Client.field712 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize].toLowerCase().trim();
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
								Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = Client.field712;
								return 1;
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) {
								var8 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
								System.out.println(var8);
								return 1;
							} else if (var0 == 5024) {
								--class295.Interpreter_intStackSize;
								return 1;
							} else if (var0 == 5025) {
								++class295.Interpreter_intStackSize;
								return 1;
							} else if (var0 == 5030) {
								class295.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
								var7 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
								var5 = Tiles.Messages_getByChannelAndID(var3, var7);
								if (var5 != null) {
									Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var5.count;
									Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var5.cycle;
									Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = (var5.sender != null) ? var5.sender : "";
									Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = (var5.prefix != null) ? var5.prefix : "";
									Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = (var5.text != null) ? var5.text : "";
									Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (var5.isFromFriend()) ? 1 : var5.isFromIgnored() ? 2 : 0;
									Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
									Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
									Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
									Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
									Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
									Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
									Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
									Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
									Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
								}

								return 1;
							} else if (var0 == 5031) {
								var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
								var4 = Strings.Messages_getMessage(var3);
								if (var4 != null) {
									Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var4.type;
									Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var4.cycle;
									Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = (var4.sender != null) ? var4.sender : "";
									Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = (var4.prefix != null) ? var4.prefix : "";
									Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = (var4.text != null) ? var4.text : "";
									Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (var4.isFromFriend()) ? 1 : var4.isFromIgnored() ? 2 : 0;
									Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
									Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
									Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
									Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
									Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
									Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
									Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
									Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
									Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
								}

								return 1;
							} else {
								return 2;
							}
						} else {
							if ((class19.localPlayer != null) && (class19.localPlayer.username != null)) {
								var8 = class19.localPlayer.username.getName();
							} else {
								var8 = "";
							}

							Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var8;
							return 1;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(descriptor = 
	"(II)I", garbageValue = 
	"632699476")

	static int method385(int var0) {
		return (var0 * 3) + 600;
	}

	@ObfuscatedName("ko")
	@ObfuscatedSignature(descriptor = 
	"(Lkn;I)Lkn;", garbageValue = 
	"2084106709")

	static Widget method381(Widget var0) {
		Widget var1 = UserComparator3.method2601(var0);
		if (var1 == null) {
			var1 = var0.parent;
		}

		return var1;
	}
}