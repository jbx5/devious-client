import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ae")
@Implements("HttpRequest")
public class HttpRequest {
	@ObfuscatedName("cr")
	@ObfuscatedGetter(
		intValue = -1828915477
	)
	static int field58;
	@ObfuscatedName("aq")
	@Export("connection")
	final HttpsURLConnection connection;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lrw;"
	)
	@Export("httpHeaders")
	final HttpHeaders httpHeaders;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	final HttpMethod field53;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	@Export("httpPayload")
	HttpPayload httpPayload;
	@ObfuscatedName("ap")
	@Export("requestInitialized")
	boolean requestInitialized;
	@ObfuscatedName("an")
	@Export("followRedirects")
	boolean followRedirects;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 347953321
	)
	@Export("connectionTimeout")
	int connectionTimeout;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lai;Lrw;Z)V"
	)
	public HttpRequest(URL var1, HttpMethod var2, HttpHeaders var3, boolean var4) throws IOException {
		this.requestInitialized = false;
		this.followRedirects = false;
		this.connectionTimeout = 300000;
		if (!var2.method66()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.getName());
		} else {
			this.connection = (HttpsURLConnection)var1.openConnection();
			if (!var4) {
				this.connection.setSSLSocketFactory(SecureRandomSSLSocketFactory.method197());
			}

			this.field53 = var2;
			this.httpHeaders = var3 != null ? var3 : new HttpHeaders();
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lai;Z)V"
	)
	public HttpRequest(URL var1, HttpMethod var2, boolean var3) throws IOException {
		this(var1, var2, new HttpHeaders(), var3);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Lrw;",
		garbageValue = "1"
	)
	@Export("getHeaders")
	public HttpHeaders getHeaders() {
		return this.httpHeaders;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lsr;I)V",
		garbageValue = "-713727113"
	)
	@Export("setPayload")
	public void setPayload(HttpPayload var1) {
		if (!this.requestInitialized) {
			if (var1 == null) {
				this.httpHeaders.removeHeader("Content-Type");
				this.httpPayload = null;
			} else {
				this.httpPayload = var1;
				if (this.httpPayload.getContentType() != null) {
					this.httpHeaders.contentType(this.httpPayload.getContentType());
				} else {
					this.httpHeaders.removeContentType();
				}

			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "653231409"
	)
	@Export("initializeRequest")
	void initializeRequest() throws ProtocolException {
		if (!this.requestInitialized) {
			this.connection.setRequestMethod(this.field53.getName());
			this.httpHeaders.setRequestProperties(this.connection);
			if (this.field53.method68() && this.httpPayload != null) {
				this.connection.setDoOutput(true);
				ByteArrayOutputStream var1 = new ByteArrayOutputStream();

				try {
					var1.write(this.httpPayload.toBytes());
					var1.writeTo(this.connection.getOutputStream());
				} catch (IOException var11) {
					var11.printStackTrace();
				} finally {
					try {
						var1.close();
					} catch (IOException var10) {
						var10.printStackTrace();
					}

				}
			}

			this.connection.setConnectTimeout(this.connectionTimeout);
			this.connection.setInstanceFollowRedirects(this.followRedirects);
			this.requestInitialized = true;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-202873158"
	)
	@Export("connect")
	boolean connect() throws IOException {
		if (!this.requestInitialized) {
			this.initializeRequest();
		}

		this.connection.connect();
		return this.connection.getResponseCode() == -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Las;",
		garbageValue = "-1"
	)
	@Export("getResponse")
	HttpResponse getResponse() {
		try {
			if (!this.requestInitialized || this.connection.getResponseCode() == -1) {
				return new HttpResponse("No REST response has been received yet.");
			}
		} catch (IOException var10) {
			this.connection.disconnect();
			return new HttpResponse("Error decoding REST response code: " + var10.getMessage());
		}

		HttpResponse var3;
		try {
			HttpResponse var1 = new HttpResponse(this.connection);
			return var1;
		} catch (IOException var8) {
			var3 = new HttpResponse("Error decoding REST response: " + var8.getMessage());
		} finally {
			this.connection.disconnect();
		}

		return var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lho;",
		garbageValue = "2071485688"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0);
			var1 = new ObjectComposition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			if (var1.isSolid) {
				var1.interactType = 0;
				var1.boolean1 = false;
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lug;I)V",
		garbageValue = "-1281612379"
	)
	@Export("performReflectionCheck")
	public static void performReflectionCheck(PacketBuffer var0) {
		ReflectionCheck var1 = (ReflectionCheck)class36.reflectionChecks.last();
		if (var1 != null) {
			int var2 = var0.offset;
			var0.writeInt(var1.id);

			for (int var3 = 0; var3 < var1.size; ++var3) {
				if (var1.creationErrors[var3] != 0) {
					var0.writeByte(var1.creationErrors[var3]);
				} else {
					try {
						int var4 = var1.operations[var3];
						Field var5;
						int var6;
						if (var4 == 0) {
							var5 = var1.fields[var3];
							var6 = Reflection.getInt(var5, (Object)null);
							var0.writeByte(0);
							var0.writeInt(var6);
						} else if (var4 == 1) {
							var5 = var1.fields[var3];
							Reflection.setInt(var5, (Object)null, var1.intReplaceValues[var3]);
							var0.writeByte(0);
						} else if (var4 == 2) {
							var5 = var1.fields[var3];
							var6 = var5.getModifiers();
							var0.writeByte(0);
							var0.writeInt(var6);
						}

						Method var25;
						if (var4 != 3) {
							if (var4 == 4) {
								var25 = var1.methods[var3];
								var6 = var25.getModifiers();
								var0.writeByte(0);
								var0.writeInt(var6);
							}
						} else {
							var25 = var1.methods[var3];
							byte[][] var10 = var1.arguments[var3];
							Object[] var7 = new Object[var10.length];

							for (int var8 = 0; var8 < var10.length; ++var8) {
								ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8]));
								var7[var8] = var9.readObject();
							}

							Object var11 = Reflection.invoke(var25, (Object)null, var7);
							if (var11 == null) {
								var0.writeByte(0);
							} else if (var11 instanceof Number) {
								var0.writeByte(1);
								var0.writeLong(((Number)var11).longValue());
							} else if (var11 instanceof String) {
								var0.writeByte(2);
								var0.writeStringCp1252NullTerminated((String)var11);
							} else {
								var0.writeByte(4);
							}
						}
					} catch (ClassNotFoundException var13) {
						var0.writeByte(-10);
					} catch (InvalidClassException var14) {
						var0.writeByte(-11);
					} catch (StreamCorruptedException var15) {
						var0.writeByte(-12);
					} catch (OptionalDataException var16) {
						var0.writeByte(-13);
					} catch (IllegalAccessException var17) {
						var0.writeByte(-14);
					} catch (IllegalArgumentException var18) {
						var0.writeByte(-15);
					} catch (InvocationTargetException var19) {
						var0.writeByte(-16);
					} catch (SecurityException var20) {
						var0.writeByte(-17);
					} catch (IOException var21) {
						var0.writeByte(-18);
					} catch (NullPointerException var22) {
						var0.writeByte(-19);
					} catch (Exception var23) {
						var0.writeByte(-20);
					} catch (Throwable var24) {
						var0.writeByte(-21);
					}
				}
			}

			var0.writeCrc(var2);
			var1.remove();
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "1862488722"
	)
	static int method98(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.publicChatMode;
			return 1;
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) {
			class130.Interpreter_intStackSize -= 3;
			Client.publicChatMode = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
			class522.privateChatMode = class6.method40(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]);
			if (class522.privateChatMode == null) {
				class522.privateChatMode = PrivateChatMode.field5501;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2];
			PacketBufferNode var13 = class170.getPacketBufferNode(ClientPacket.CHAT_SETFILTER, Client.packetWriter.isaacCipher);
			var13.packetBuffer.writeByte(Client.publicChatMode);
			var13.packetBuffer.writeByte(class522.privateChatMode.field5503);
			var13.packetBuffer.writeByte(Client.tradeChatMode);
			Client.packetWriter.addNode(var13);
			return 1;
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) {
				var8 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
				class130.Interpreter_intStackSize -= 2;
				var7 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
				var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
				var6 = class170.getPacketBufferNode(ClientPacket.CHAT_SENDABUSEREPORT, Client.packetWriter.isaacCipher);
				var6.packetBuffer.writeByte(Actor.stringCp1252NullTerminatedByteSize(var8) + 2);
				var6.packetBuffer.writeStringCp1252NullTerminated(var8);
				var6.packetBuffer.writeByte(var7 - 1);
				var6.packetBuffer.writeByte(var9);
				Client.packetWriter.addNode(var6);
				return 1;
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) {
					class130.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
					var7 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
					var5 = class91.Messages_getByChannelAndID(var3, var7);
					if (var5 != null) {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var5.count;
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var5.cycle;
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
					} else {
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
						var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
						var4 = Frames.Messages_getMessage(var3);
						if (var4 != null) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4.type;
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4.cycle;
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
						} else {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
						if (class522.privateChatMode == null) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class522.privateChatMode.field5503;
						}

						return 1;
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) {
							var8 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
							var7 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
							var12 = WorldEntity.method8675(var7, var8, BuddyRankComparator.clientLanguage, -1);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) {
							class337.Interpreter_stringStackSize -= 2;
							var8 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize];
							String var11 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize + 1];
							var12 = class170.getPacketBufferNode(ClientPacket.CHAT_SENDPRIVATE, Client.packetWriter.isaacCipher);
							var12.packetBuffer.writeShort(0);
							int var10 = var12.packetBuffer.offset;
							var12.packetBuffer.writeStringCp1252NullTerminated(var8);
							class225.method4305(var12.packetBuffer, var11);
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) {
							var8 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
							class130.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
							var6 = WorldEntity.method8675(var7, var8, BuddyRankComparator.clientLanguage, var9);
							Client.packetWriter.addNode(var6);
							return 1;
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) {
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) {
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.tradeChatMode;
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
								var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class53.Messages_getHistorySize(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) {
								var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class36.Messages_getLastChatID(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) {
								var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class74.method2159(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.DOCHEAT) {
								var8 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
								class164.doCheat(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
								Client.field736 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize].toLowerCase().trim();
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
								Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = Client.field736;
								return 1;
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) {
								var8 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
								System.out.println(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYTYPEANDLINE) {
								class130.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
								var7 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
								var5 = class91.Messages_getByChannelAndID(var3, var7);
								if (var5 != null) {
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var5.count;
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var5.cycle;
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var5.sender != null ? var5.sender : "";
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var5.prefix != null ? var5.prefix : "";
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var5.text != null ? var5.text : "";
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var5.isFromFriend() ? 1 : (var5.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYEX_BYUID) {
								var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
								var4 = Frames.Messages_getMessage(var3);
								if (var4 != null) {
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4.type;
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4.cycle;
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var4.sender != null ? var4.sender : "";
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var4.prefix != null ? var4.prefix : "";
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var4.text != null ? var4.text : "";
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4.isFromFriend() ? 1 : (var4.isFromIgnored() ? 2 : 0);
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = "";
									Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
								}

								return 1;
							} else {
								return 2;
							}
						} else {
							if (SoundCache.localPlayer != null && SoundCache.localPlayer.username != null) {
								var8 = SoundCache.localPlayer.username.getName();
							} else {
								var8 = "";
							}

							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var8;
							return 1;
						}
					}
				}
			}
		}
	}
}
