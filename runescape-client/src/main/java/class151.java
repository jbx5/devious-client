import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;



import net.runelite.rs.Reflection;
import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
public class class151 extends class144 {
	@ObfuscatedName("v")
	String field1678;
	@ObfuscatedName("c")
	byte field1677;
	@ObfuscatedName("i")
	byte field1676;

	@ObfuscatedSignature(descriptor = 
	"Ler;")

	final class145 this$0;

	@ObfuscatedSignature(descriptor = 
	"(Ler;)V")

	class151(class145 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;B)V", garbageValue = 
	"23")

	void vmethod3152(Buffer var1) {
		this.field1678 = var1.readStringCp1252NullTerminatedOrNull();
		if (this.field1678 != null) {
			var1.readUnsignedByte();
			this.field1677 = var1.readByte();
			this.field1676 = var1.readByte();
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Lea;I)V", garbageValue = 
	"1764669808")

	void vmethod3153(ClanChannel var1) {
		var1.name = this.field1678;
		if (this.field1678 != null) {
			var1.field1654 = this.field1677;
			var1.field1659 = this.field1676;
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(II)Lgn;", garbageValue = 
	"-462688597")

	@Export("getParamDefinition")
	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = ((ParamComposition) (ParamComposition.ParamDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ParamComposition.ParamDefinition_archive.takeFile(11, var0);
			var1 = new ParamComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			ParamComposition.ParamDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(Lpz;I)V", garbageValue = 
	"960704527")

	@Export("performReflectionCheck")
	public static void performReflectionCheck(PacketBuffer var0) {
		ReflectionCheck var1 = ((ReflectionCheck) (class54.reflectionChecks.last()));
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
							var6 = Reflection.getInt(var5, ((Object) (null)));
							var0.writeByte(0);
							var0.writeInt(var6);
						} else if (var4 == 1) {
							var5 = var1.fields[var3];
							Reflection.setInt(var5, ((Object) (null)), var1.intReplaceValues[var3]);
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

							Object var11 = Reflection.invoke(var25, ((Object) (null)), var7);
							if (var11 == null) {
								var0.writeByte(0);
							} else if (var11 instanceof Number) {
								var0.writeByte(1);
								var0.writeLong(((Number) (var11)).longValue());
							} else if (var11 instanceof String) {
								var0.writeByte(2);
								var0.writeStringCp1252NullTerminated(((String) (var11)));
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(descriptor = 
	"(ILbd;ZI)I", garbageValue = 
	"1004666991")

	static int method3159(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.publicChatMode;
			return 1;
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) {
			Interpreter.Interpreter_intStackSize -= 3;
			Client.publicChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			GameEngine.privateChatMode = class166.method3343(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
			if (GameEngine.privateChatMode == null) {
				GameEngine.privateChatMode = PrivateChatMode.field4739;
			}

			Client.tradeChatMode = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			PacketBufferNode var13 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2916, Client.packetWriter.isaacCipher);
			var13.packetBuffer.writeByte(Client.publicChatMode);
			var13.packetBuffer.writeByte(GameEngine.privateChatMode.field4740);
			var13.packetBuffer.writeByte(Client.tradeChatMode);
			Client.packetWriter.addNode(var13);
			return 1;
		} else {
			PacketBufferNode var6;
			int var7;
			String var8;
			int var9;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) {
				var8 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
				Interpreter.Interpreter_intStackSize -= 2;
				var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var6 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2928, Client.packetWriter.isaacCipher);
				var6.packetBuffer.writeByte(class425.stringCp1252NullTerminatedByteSize(var8) + 2);
				var6.packetBuffer.writeStringCp1252NullTerminated(var8);
				var6.packetBuffer.writeByte(var7 - 1);
				var6.packetBuffer.writeByte(var9);
				Client.packetWriter.addNode(var6);
				return 1;
			} else {
				int var3;
				Message var5;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) {
					Interpreter.Interpreter_intStackSize -= 2;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
					var5 = class291.Messages_getByChannelAndID(var3, var7);
					if (var5 != null) {
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var5.count;
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var5.cycle;
						Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = (var5.sender != null) ? var5.sender : "";
						Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = (var5.prefix != null) ? var5.prefix : "";
						Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = (var5.text != null) ? var5.text : "";
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (var5.isFromFriend()) ? 1 : var5.isFromIgnored() ? 2 : 0;
					} else {
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
						Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
						Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
						Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
						Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
					}

					return 1;
				} else {
					Message var4;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
						var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var4 = TileItem.Messages_getMessage(var3);
						if (var4 != null) {
							Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var4.type;
							Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var4.cycle;
							Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = (var4.sender != null) ? var4.sender : "";
							Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = (var4.prefix != null) ? var4.prefix : "";
							Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = (var4.text != null) ? var4.text : "";
							Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (var4.isFromFriend()) ? 1 : var4.isFromIgnored() ? 2 : 0;
						} else {
							Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
							Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
							Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
							Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
							Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
							Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
						if (GameEngine.privateChatMode == null) {
							Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = GameEngine.privateChatMode.field4740;
						}

						return 1;
					} else {
						PacketBufferNode var12;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) {
							var8 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							var12 = BufferedSource.method6908(var7, var8, Skills.clientLanguage, -1);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) {
							class122.Interpreter_stringStackSize -= 2;
							var8 = Interpreter.Interpreter_stringStack[class122.Interpreter_stringStackSize];
							String var11 = Interpreter.Interpreter_stringStack[class122.Interpreter_stringStackSize + 1];
							var12 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2907, Client.packetWriter.isaacCipher);
							var12.packetBuffer.writeShort(0);
							int var10 = var12.packetBuffer.offset;
							var12.packetBuffer.writeStringCp1252NullTerminated(var8);
							class282.method5489(var12.packetBuffer, var11);
							var12.packetBuffer.writeLengthShort(var12.packetBuffer.offset - var10);
							Client.packetWriter.addNode(var12);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) {
							var8 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
							Interpreter.Interpreter_intStackSize -= 2;
							var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var6 = BufferedSource.method6908(var7, var8, Skills.clientLanguage, var9);
							Client.packetWriter.addNode(var6);
							return 1;
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) {
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) {
								Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Client.tradeChatMode;
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = HitSplatDefinition.Messages_getHistorySize(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) {
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = WorldMapSectionType.Messages_getLastChatID(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) {
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = SoundCache.method779(var3);
								return 1;
							} else if (var0 == ScriptOpcodes.DOCHEAT) {
								var8 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
								class420.doCheat(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
								Client.field728 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize].toLowerCase().trim();
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
								Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = Client.field728;
								return 1;
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) {
								var8 = Interpreter.Interpreter_stringStack[--class122.Interpreter_stringStackSize];
								System.out.println(var8);
								return 1;
							} else if (var0 == 5024) {
								--Interpreter.Interpreter_intStackSize;
								return 1;
							} else if (var0 == 5025) {
								++Interpreter.Interpreter_intStackSize;
								return 1;
							} else if (var0 == 5030) {
								Interpreter.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
								var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
								var5 = class291.Messages_getByChannelAndID(var3, var7);
								if (var5 != null) {
									Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var5.count;
									Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var5.cycle;
									Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = (var5.sender != null) ? var5.sender : "";
									Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = (var5.prefix != null) ? var5.prefix : "";
									Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = (var5.text != null) ? var5.text : "";
									Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (var5.isFromFriend()) ? 1 : var5.isFromIgnored() ? 2 : 0;
									Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
									Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
									Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
									Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
									Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
									Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
									Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
									Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
									Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
								}

								return 1;
							} else if (var0 == 5031) {
								var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
								var4 = TileItem.Messages_getMessage(var3);
								if (var4 != null) {
									Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var4.type;
									Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var4.cycle;
									Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = (var4.sender != null) ? var4.sender : "";
									Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = (var4.prefix != null) ? var4.prefix : "";
									Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = (var4.text != null) ? var4.text : "";
									Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (var4.isFromFriend()) ? 1 : var4.isFromIgnored() ? 2 : 0;
									Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
									Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
								} else {
									Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
									Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
									Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
									Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
									Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
									Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
									Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
									Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
								}

								return 1;
							} else {
								return 2;
							}
						} else {
							if ((GrandExchangeEvents.localPlayer != null) && (GrandExchangeEvents.localPlayer.username != null)) {
								var8 = GrandExchangeEvents.localPlayer.username.getName();
							} else {
								var8 = "";
							}

							Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = var8;
							return 1;
						}
					}
				}
			}
		}
	}
}