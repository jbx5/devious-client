import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ny")
@Implements("ArchiveDiskActionHandler")
public class ArchiveDiskActionHandler implements Runnable {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("ArchiveDiskActionHandler_requestQueue")
	public static final NodeDeque ArchiveDiskActionHandler_requestQueue;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("ArchiveDiskActionHandler_responseQueue")
	public static NodeDeque ArchiveDiskActionHandler_responseQueue;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -721787149
	)
	static int field4257;
	@ObfuscatedName("at")
	static boolean field4261;
	@ObfuscatedName("ac")
	static Object field4259;

	static {
		ArchiveDiskActionHandler_requestQueue = new NodeDeque();
		ArchiveDiskActionHandler_responseQueue = new NodeDeque();
		field4257 = 0;
		field4261 = false;
		field4259 = new Object();
	}

	ArchiveDiskActionHandler() {
	}

	public void run() {
		try {
			while (true) {
				ArchiveDiskAction var1;
				synchronized(ArchiveDiskActionHandler_requestQueue) {
					var1 = (ArchiveDiskAction)ArchiveDiskActionHandler_requestQueue.last();
				}

				if (var1 != null) {
					if (var1.type == 0) {
						var1.archiveDisk.write((int)var1.key, var1.data, var1.data.length);
						synchronized(ArchiveDiskActionHandler_requestQueue) {
							var1.remove();
						}
					} else if (var1.type == 1) {
						var1.data = var1.archiveDisk.read((int)var1.key);
						synchronized(ArchiveDiskActionHandler_requestQueue) {
							ArchiveDiskActionHandler_responseQueue.addFirst(var1);
						}
					}

					synchronized(field4259) {
						if ((field4261 || field4257 <= 1) && ArchiveDiskActionHandler_requestQueue.method6983()) {
							field4257 = 0;
							field4259.notifyAll();
							return;
						}

						field4257 = 600;
					}
				} else {
					PendingSpawn.method2365(100L);
					synchronized(field4259) {
						if ((field4261 || field4257 <= 1) && ArchiveDiskActionHandler_requestQueue.method6983()) {
							field4257 = 0;
							field4259.notifyAll();
							return;
						}

						--field4257;
					}
				}
			}
		} catch (Exception var13) {
			Messages.RunException_sendStackTrace((String)null, var13);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-224365630"
	)
	static void method6647() {
		ItemComposition.field2285 = new int[2000];
		int var0 = 0;
		int var1 = 240;

		int var3;
		for (byte var2 = 12; var0 < 16; var1 -= var2) {
			var3 = ArchiveLoader.method2248((double)((float)var1 / 360.0F), 0.9998999834060669D, (double)((float)var0 * 0.425F / 16.0F + 0.075F));
			ItemComposition.field2285[var0] = var3;
			++var0;
		}

		var1 = 48;

		for (int var5 = var1 / 6; var0 < ItemComposition.field2285.length; var1 -= var5) {
			var3 = var0 * 2;

			for (int var4 = ArchiveLoader.method2248((double)((float)var1 / 360.0F), 0.9998999834060669D, 0.5D); var0 < var3 && var0 < ItemComposition.field2285.length; ++var0) {
				ItemComposition.field2285[var0] = var4;
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "63"
	)
	public static final boolean method6640(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-';
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZB)I",
		garbageValue = "5"
	)
	static int method6645(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.publicChatMode;
			return 1;
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) {
			SoundCache.Interpreter_intStackSize -= 3;
			Client.publicChatMode = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
			class128.privateChatMode = DevicePcmPlayerProvider.method317(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]);
			if (class128.privateChatMode == null) {
				class128.privateChatMode = PrivateChatMode.field5247;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2];
			PacketBufferNode var13 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.CHAT_SETFILTER, Client.packetWriter.isaacCipher);
			var13.packetBuffer.writeByte(Client.publicChatMode);
			var13.packetBuffer.writeByte(class128.privateChatMode.field5246);
			var13.packetBuffer.writeByte(Client.tradeChatMode);
			Client.packetWriter.addNode(var13);
			return 1;
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) {
				var8 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize];
				SoundCache.Interpreter_intStackSize -= 2;
				var7 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
				var6 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.CHAT_SENDABUSEREPORT, Client.packetWriter.isaacCipher);
				var6.packetBuffer.writeByte(AbstractSocket.stringCp1252NullTerminatedByteSize(var8) + 2);
				var6.packetBuffer.writeStringCp1252NullTerminated(var8);
				var6.packetBuffer.writeByte(var7 - 1);
				var6.packetBuffer.writeByte(var9);
				Client.packetWriter.addNode(var6);
				return 1;
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) {
					SoundCache.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
					var7 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
					var5 = AbstractByteArrayCopier.Messages_getByChannelAndID(var3, var7);
					if (var5 != null) {
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var5.count;
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var5.cycle;
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
					} else {
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
						var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
						var4 = class33.Messages_getMessage(var3);
						if (var4 != null) {
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4.type;
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4.cycle;
							Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
							Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
							Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
						} else {
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
						if (class128.privateChatMode == null) {
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class128.privateChatMode.field5246;
						}

						return 1;
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) {
							var8 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize];
							var7 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
							var12 = Actor.method2407(var7, var8, ClanChannelMember.clientLanguage, -1);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) {
							class137.Interpreter_stringStackSize -= 2;
							var8 = Interpreter.Interpreter_stringStack[class137.Interpreter_stringStackSize];
							String var11 = Interpreter.Interpreter_stringStack[class137.Interpreter_stringStackSize + 1];
							var12 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.CHAT_SENDPRIVATE, Client.packetWriter.isaacCipher);
							var12.packetBuffer.writeShort(0);
							int var10 = var12.packetBuffer.offset;
							var12.packetBuffer.writeStringCp1252NullTerminated(var8);
							class216.method4235(var12.packetBuffer, var11);
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) {
							var8 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize];
							SoundCache.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
							var6 = Actor.method2407(var7, var8, ClanChannelMember.clientLanguage, var9);
							Client.packetWriter.addNode(var6);
							return 1;
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) {
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) {
								Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.tradeChatMode;
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
								var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = HorizontalAlignment.Messages_getHistorySize(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) {
								var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = ClientPacket.Messages_getLastChatID(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) {
								var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = ClanChannelMember.method3119(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.DOCHEAT) {
								var8 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize];
								class85.doCheat(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
								Client.field554 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize].toLowerCase().trim();
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
								Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = Client.field554;
								return 1;
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) {
								var8 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize];
								System.out.println(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) {
								SoundCache.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
								var7 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
								var5 = AbstractByteArrayCopier.Messages_getByChannelAndID(var3, var7);
								if (var5 != null) {
									Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var5.count;
									Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var5.cycle;
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
									Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) {
								var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
								var4 = class33.Messages_getMessage(var3);
								if (var4 != null) {
									Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4.type;
									Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4.cycle;
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
									Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else {
								return 2;
							}
						} else {
							if (VarbitComposition.localPlayer != null && VarbitComposition.localPlayer.username != null) {
								var8 = VarbitComposition.localPlayer.username.getName();
							} else {
								var8 = "";
							}

							Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var8;
							return 1;
						}
					}
				}
			}
		}
	}
}
