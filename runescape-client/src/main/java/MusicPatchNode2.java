import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ms")
@Implements("MusicPatchNode2")
public class MusicPatchNode2 {
	@ObfuscatedName("ak")
	byte[] field3570;
	@ObfuscatedName("al")
	byte[] field3567;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1867182897
	)
	int field3568;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1012427105
	)
	int field3569;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1466766773
	)
	int field3571;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1707440877
	)
	int field3574;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1317239111
	)
	int field3572;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 398882389
	)
	int field3573;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 932959883
	)
	int field3566;

	MusicPatchNode2() {
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZB)I",
		garbageValue = "-98"
	)
	static int method6224(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Client.publicChatMode;
			return 1;
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) {
			class13.Interpreter_intStackSize -= 3;
			Client.publicChatMode = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
			WorldMap.privateChatMode = class104.method2727(Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1]);
			if (WorldMap.privateChatMode == null) {
				WorldMap.privateChatMode = PrivateChatMode.field5483;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 2];
			PacketBufferNode var13 = WorldMapElement.getPacketBufferNode(ClientPacket.CHAT_SETFILTER, Client.packetWriter.isaacCipher);
			var13.packetBuffer.writeByte(Client.publicChatMode);
			var13.packetBuffer.writeByte(WorldMap.privateChatMode.field5482);
			var13.packetBuffer.writeByte(Client.tradeChatMode);
			Client.packetWriter.addNode(var13);
			return 1;
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) {
				var8 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
				class13.Interpreter_intStackSize -= 2;
				var7 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
				var9 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
				var6 = WorldMapElement.getPacketBufferNode(ClientPacket.CHAT_SENDABUSEREPORT, Client.packetWriter.isaacCipher);
				var6.packetBuffer.writeByte(class432.stringCp1252NullTerminatedByteSize(var8) + 2);
				var6.packetBuffer.writeStringCp1252NullTerminated(var8);
				var6.packetBuffer.writeByte(var7 - 1);
				var6.packetBuffer.writeByte(var9);
				Client.packetWriter.addNode(var6);
				return 1;
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) {
					class13.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
					var7 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
					var5 = class412.Messages_getByChannelAndID(var3, var7);
					if (var5 != null) {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var5.count;
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var5.cycle;
						Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
						Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
						Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
					} else {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
						var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
						var4 = PcmPlayer.Messages_getMessage(var3);
						if (var4 != null) {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var4.type;
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var4.cycle;
							Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
							Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
							Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
						} else {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
						if (WorldMap.privateChatMode == null) {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = WorldMap.privateChatMode.field5482;
						}

						return 1;
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) {
							var8 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
							var7 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
							var12 = class160.method3402(var7, var8, class188.clientLanguage, -1);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) {
							class166.Interpreter_stringStackSize -= 2;
							var8 = Interpreter.Interpreter_stringStack[class166.Interpreter_stringStackSize];
							String var11 = Interpreter.Interpreter_stringStack[class166.Interpreter_stringStackSize + 1];
							var12 = WorldMapElement.getPacketBufferNode(ClientPacket.CHAT_SENDPRIVATE, Client.packetWriter.isaacCipher);
							var12.packetBuffer.writeShort(0);
							int var10 = var12.packetBuffer.offset;
							var12.packetBuffer.writeStringCp1252NullTerminated(var8);
							class152.method3277(var12.packetBuffer, var11);
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) {
							var8 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
							class13.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
							var6 = class160.method3402(var7, var8, class188.clientLanguage, var9);
							Client.packetWriter.addNode(var6);
							return 1;
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) {
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) {
								Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Client.tradeChatMode;
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
								var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = HealthBarUpdate.Messages_getHistorySize(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) {
								var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class91.Messages_getLastChatID(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) {
								var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = ClientPreferences.method2629(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.DOCHEAT) {
								var8 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
								class92.doCheat(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
								Client.field525 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize].toLowerCase().trim();
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
								Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = Client.field525;
								return 1;
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) {
								var8 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
								System.out.println(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) {
								class13.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
								var7 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
								var5 = class412.Messages_getByChannelAndID(var3, var7);
								if (var5 != null) {
									Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var5.count;
									Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var5.cycle;
									Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
									Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
									Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
									Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) {
								var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
								var4 = PcmPlayer.Messages_getMessage(var3);
								if (var4 != null) {
									Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var4.type;
									Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var4.cycle;
									Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
									Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
									Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
									Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else {
								return 2;
							}
						} else {
							if (class17.localPlayer != null && class17.localPlayer.username != null) {
								var8 = class17.localPlayer.username.getName();
							} else {
								var8 = "";
							}

							Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var8;
							return 1;
						}
					}
				}
			}
		}
	}
}
