import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

@ObfuscatedName("ax")
class class12 extends SSLSocket {
	@ObfuscatedName("vq")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "[Luz;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;
	@ObfuscatedName("ln")
	@ObfuscatedGetter(
		intValue = 933165657
	)
	static int field56;
	@ObfuscatedName("at")
	Certificate[] field52;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	final class15 this$0;
	// $FF: synthetic field
	final TlsClientProtocol val$tlsClientProtocol;
	// $FF: synthetic field
	final String val$host;

	@ObfuscatedSignature(
		descriptor = "(Lak;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V"
	)
	class12(class15 var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1;
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream();
	}

	public boolean getEnableSessionCreation() {
		return false;
	}

	public String[] getEnabledCipherSuites() {
		return null;
	}

	public String[] getEnabledProtocols() {
		return null;
	}

	public boolean getNeedClientAuth() {
		return false;
	}

	public SSLSession getSession() {
		return new class17(this);
	}

	public String[] getSupportedProtocols() {
		return null;
	}

	public boolean getUseClientMode() {
		return false;
	}

	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	}

	public void setEnableSessionCreation(boolean var1) {
	}

	public void setEnabledCipherSuites(String[] var1) {
	}

	public void setEnabledProtocols(String[] var1) {
	}

	public void setNeedClientAuth(boolean var1) {
	}

	public void setUseClientMode(boolean var1) {
	}

	public void setWantClientAuth(boolean var1) {
	}

	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class13(this));
	}

	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	}

	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close();
	}

	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream();
	}

	public String[] getSupportedCipherSuites() {
		return null;
	}

	public boolean getWantClientAuth() {
		return false;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([Loj;II)Loj;",
		garbageValue = "-948387119"
	)
	@Export("findEnumerated")
	public static Enum findEnumerated(Enum[] var0, int var1) {
		Enum[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Enum var4 = var2[var3];
			if (var1 == var4.rsOrdinal()) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Llu;",
		garbageValue = "915557708"
	)
	@Export("ServerPacket_values")
	public static ServerPacket[] ServerPacket_values() {
		return new ServerPacket[]{ServerPacket.NPC_INFO_SMALL_VIEWPORT_1, ServerPacket.field3249, ServerPacket.PLAYER_INFO, ServerPacket.IF_SETSCROLLPOS, ServerPacket.VARP_LARGE, ServerPacket.field3370, ServerPacket.IF_MOVESUB, ServerPacket.field3358, ServerPacket.field3256, ServerPacket.IF_SETANGLE, ServerPacket.field3258, ServerPacket.field3259, ServerPacket.field3260, ServerPacket.RUNCLIENTSCRIPT, ServerPacket.UPDATE_REBOOT_TIMER, ServerPacket.NPC_SET_SEQUENCE, ServerPacket.field3289, ServerPacket.MESSAGE_FRIENDS_CHAT, ServerPacket.CHAT_FILTER_SETTINGS, ServerPacket.IF_SETPLAYERHEAD, ServerPacket.field3268, ServerPacket.field3269, ServerPacket.field3270, ServerPacket.CAM_LOOKAT, ServerPacket.MESSAGE_PRIVATE_ECHO, ServerPacket.field3349, ServerPacket.field3274, ServerPacket.VARP_SMALL, ServerPacket.field3308, ServerPacket.HINT_ARROW, ServerPacket.SET_PRIVCHATMODE, ServerPacket.UPDATE_STOCKMARKET_SLOT, ServerPacket.field3280, ServerPacket.field3298, ServerPacket.IF_CLOSESUB, ServerPacket.field3283, ServerPacket.field3284, ServerPacket.field3285, ServerPacket.UPDATE_INV_FULL, ServerPacket.field3373, ServerPacket.field3288, ServerPacket.IF_SETMODEL, ServerPacket.MINIMAP_TOGGLE, ServerPacket.field3291, ServerPacket.CAM_RESET, ServerPacket.field3261, ServerPacket.field3294, ServerPacket.field3295, ServerPacket.IF_SETPOSITION, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.field3316, ServerPacket.UPDATE_INV_CLEAR, ServerPacket.field3300, ServerPacket.field3301, ServerPacket.field3302, ServerPacket.field3303, ServerPacket.field3304, ServerPacket.field3305, ServerPacket.UPDATE_STAT, ServerPacket.SYNC_CLIENT_VARCACHE, ServerPacket.MESSAGE_GAME, ServerPacket.RESET_CLIENT_VARCACHE, ServerPacket.LOGOUT, ServerPacket.UPDATE_FRIENDLIST, ServerPacket.PING_STATISTICS_REQUEST, ServerPacket.field3313, ServerPacket.IF_SETHIDE, ServerPacket.field3321, ServerPacket.field3287, ServerPacket.field3317, ServerPacket.CAM_SETANGLE, ServerPacket.field3319, ServerPacket.MESSAGE_PRIVATE, ServerPacket.field3314, ServerPacket.field3293, ServerPacket.field3323, ServerPacket.UPDATE_UID192, ServerPacket.field3325, ServerPacket.UPDATE_ZONE_FULL_FOLLOWS, ServerPacket.MIDI_SONG, ServerPacket.field3251, ServerPacket.PLAYER_SPOTANIM, ServerPacket.field3330, ServerPacket.field3328, ServerPacket.field3332, ServerPacket.PROJECTILE_SPAWN, ServerPacket.UPDATE_ZONE_PARTIAL_ENCLOSED, ServerPacket.field3335, ServerPacket.field3336, ServerPacket.NPC_SPOTANIM, ServerPacket.UPDATE_INV_STOP_TRANSIT, ServerPacket.field3339, ServerPacket.field3340, ServerPacket.field3341, ServerPacket.field3342, ServerPacket.field3343, ServerPacket.field3344, ServerPacket.field3271, ServerPacket.EVENT_WORLDHOP, ServerPacket.LOGOUT_FULL, ServerPacket.field3296, ServerPacket.GRAPHICSOBJECT_SPAWN, ServerPacket.IF_SETOBJECT, ServerPacket.TRIGGER_ONDIALOG_ABORT, ServerPacket.SET_PLAYER_OP, ServerPacket.field3299, ServerPacket.field3250, ServerPacket.NPC_INFO_LARGE_VIEWPORT_2, ServerPacket.IF_SETNPCHEAD, ServerPacket.UPDATE_IGNORELIST, ServerPacket.field3353, ServerPacket.field3359, ServerPacket.URL_OPEN, ServerPacket.field3297, ServerPacket.DYNAMICOBJECT_SPAWN, ServerPacket.field3248, ServerPacket.field3364, ServerPacket.REBUILD_NORMAL, ServerPacket.field3366, ServerPacket.field3367, ServerPacket.field3306, ServerPacket.REBUILD_REGION, ServerPacket.IF_SETCOLOUR, ServerPacket.field3371, ServerPacket.MINIMAP_FLAG_SET, ServerPacket.field3276, ServerPacket.REFLECTION_CHECKER};
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "1"
	)
	public static boolean method169(int var0) {
		return (var0 >> 20 & 1) != 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1907529408"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IB)V",
		garbageValue = "12"
	)
	static final void method167(String var0, int var1) {
		PacketBufferNode var2 = class113.getPacketBufferNode(ClientPacket.field3179, Client.packetWriter.isaacCipher);
		var2.packetBuffer.writeByte(ClanChannel.stringCp1252NullTerminatedByteSize(var0) + 1);
		var2.packetBuffer.writeStringCp1252NullTerminated(var0);
		var2.packetBuffer.writeByteNeg(var1);
		Client.packetWriter.addNode(var2);
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1724856740"
	)
	static int method131(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Client.publicChatMode;
			return 1;
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) {
			DbTableType.Interpreter_intStackSize -= 3;
			Client.publicChatMode = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
			PlayerCompositionColorTextureOverride.privateChatMode = WorldMapArea.method4580(Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1]);
			if (PlayerCompositionColorTextureOverride.privateChatMode == null) {
				PlayerCompositionColorTextureOverride.privateChatMode = PrivateChatMode.field5280;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 2];
			PacketBufferNode var13 = class113.getPacketBufferNode(ClientPacket.CHAT_SETFILTER, Client.packetWriter.isaacCipher);
			var13.packetBuffer.writeByte(Client.publicChatMode);
			var13.packetBuffer.writeByte(PlayerCompositionColorTextureOverride.privateChatMode.field5279);
			var13.packetBuffer.writeByte(Client.tradeChatMode);
			Client.packetWriter.addNode(var13);
			return 1;
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) {
				var8 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize];
				DbTableType.Interpreter_intStackSize -= 2;
				var7 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
				var9 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
				var6 = class113.getPacketBufferNode(ClientPacket.CHAT_SENDABUSEREPORT, Client.packetWriter.isaacCipher);
				var6.packetBuffer.writeByte(ClanChannel.stringCp1252NullTerminatedByteSize(var8) + 2);
				var6.packetBuffer.writeStringCp1252NullTerminated(var8);
				var6.packetBuffer.writeByte(var7 - 1);
				var6.packetBuffer.writeByte(var9);
				Client.packetWriter.addNode(var6);
				return 1;
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) {
					DbTableType.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
					var7 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
					var5 = class14.Messages_getByChannelAndID(var3, var7);
					if (var5 != null) {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var5.count;
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var5.cycle;
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
					} else {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
						var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
						var4 = class31.Messages_getMessage(var3);
						if (var4 != null) {
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var4.type;
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var4.cycle;
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
						} else {
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
						if (PlayerCompositionColorTextureOverride.privateChatMode == null) {
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = PlayerCompositionColorTextureOverride.privateChatMode.field5279;
						}

						return 1;
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) {
							var8 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize];
							var7 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
							var12 = class544.method9914(var7, var8, class85.clientLanguage, -1);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) {
							class127.Interpreter_stringStackSize -= 2;
							var8 = Interpreter.Interpreter_stringStack[class127.Interpreter_stringStackSize];
							String var11 = Interpreter.Interpreter_stringStack[class127.Interpreter_stringStackSize + 1];
							var12 = class113.getPacketBufferNode(ClientPacket.CHAT_SENDPRIVATE, Client.packetWriter.isaacCipher);
							var12.packetBuffer.writeShort(0);
							int var10 = var12.packetBuffer.offset;
							var12.packetBuffer.writeStringCp1252NullTerminated(var8);
							PcmPlayer.method847(var12.packetBuffer, var11);
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) {
							var8 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize];
							DbTableType.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
							var6 = class544.method9914(var7, var8, class85.clientLanguage, var9);
							Client.packetWriter.addNode(var6);
							return 1;
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) {
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) {
								Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Client.tradeChatMode;
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
								var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Message.Messages_getHistorySize(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) {
								var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Messages_getLastChatID(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) {
								var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = class92.method2446(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.DOCHEAT) {
								var8 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize];
								class9.doCheat(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
								Client.field694 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize].toLowerCase().trim();
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
								Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = Client.field694;
								return 1;
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) {
								var8 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize];
								System.out.println(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) {
								DbTableType.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
								var7 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
								var5 = class14.Messages_getByChannelAndID(var3, var7);
								if (var5 != null) {
									Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var5.count;
									Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var5.cycle;
									Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
									Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
									Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
									Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) {
								var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
								var4 = class31.Messages_getMessage(var3);
								if (var4 != null) {
									Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var4.type;
									Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var4.cycle;
									Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
									Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
									Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
									Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else {
								return 2;
							}
						} else {
							if (class229.localPlayer != null && class229.localPlayer.username != null) {
								var8 = class229.localPlayer.username.getName();
							} else {
								var8 = "";
							}

							Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var8;
							return 1;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "11"
	)
	static int method142(int var0, Script var1, boolean var2) {
		return 2;
	}
}
