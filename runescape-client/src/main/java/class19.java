import java.util.Date;
import java.util.concurrent.Future;




import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.ObfuscatedGetter; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("m")
public class class19 {
	@ObfuscatedName("cp")
	@ObfuscatedSignature(descriptor = 
	"Lqx;")

	static IndexedSprite field96;
	@ObfuscatedName("lc")
	@ObfuscatedSignature(descriptor = 
	"Lcw;")

	@Export("localPlayer")
	static Player localPlayer;
	@ObfuscatedName("nd")
	@ObfuscatedGetter(intValue = 
	-436115997)

	@Export("selectedItemSlot")
	static int selectedItemSlot;
	@ObfuscatedName("v")
	Future field95;
	@ObfuscatedName("o")
	String field94;

	class19(Future var1) {
		this.field95 = var1;
	}

	class19(String var1) {
		this.method298(var1);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;I)V", garbageValue = 
	"-1411610741")

	void method298(String var1) {
		if (var1 == null) {
			var1 = "";
		}

		this.field94 = var1;
		if (this.field95 != null) {
			this.field95.cancel(true);
			this.field95 = null;
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(I)Ljava/lang/String;", garbageValue = 
	"1502014240")

	public final String method299() {
		return this.field94;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"3")

	public boolean method316() {
		return (this.field94 != null) || (this.field95 == null);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(B)Z", garbageValue = 
	"39")

	public final boolean method303() {
		return this.method316() ? true : this.field95.isDone();
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(B)Ly;", garbageValue = 
	"34")

	public final class21 method301() {
		if (this.method316()) {
			return new class21(this.field94);
		} else if (!this.method303()) {
			return null;
		} else {
			try {
				return ((class21) (this.field95.get()));
			} catch (Exception var3) {
				String var2 = "Error retrieving REST request reply";
				System.err.println((var2 + "\r\n") + var3);
				this.method298(var2);
				return new class21(var2);
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(IB)Lfs;", garbageValue = 
	"1")

	@Export("WorldMapElement_get")
	public static WorldMapElement WorldMapElement_get(int var0) {
		return ((var0 >= 0) && (var0 < WorldMapElement.WorldMapElement_cached.length)) && (WorldMapElement.WorldMapElement_cached[var0] != null) ? WorldMapElement.WorldMapElement_cached[var0] : new WorldMapElement(var0);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(Lpq;ILjava/lang/String;I)Ljava/lang/String;", garbageValue = 
	"-1591862796")

	static String method315(IterableNodeHashTable var0, int var1, String var2) {
		if (var0 == null) {
			return var2;
		} else {
			ObjectNode var3 = ((ObjectNode) (var0.get(((long) (var1)))));
			return var3 == null ? var2 : ((String) (var3.obj));
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(Llq;Llq;III)Lmr;", garbageValue = 
	"-757685375")

	public static Font method319(AbstractArchive var0, AbstractArchive var1, int var2, int var3) {
		if (!GrandExchangeEvent.method6045(var0, var2, var3)) {
			return null;
		} else {
			byte[] var5 = var1.takeFile(var2, var3);
			Font var4;
			if (var5 == null) {
				var4 = null;
			} else {
				Font var6 = new Font(var5, class451.SpriteBuffer_xOffsets, class451.SpriteBuffer_yOffsets, class451.SpriteBuffer_spriteWidths, class451.SpriteBuffer_spriteHeights, GrandExchangeOfferUnitPriceComparator.SpriteBuffer_spritePalette, class460.SpriteBuffer_pixels);
				RouteStrategy.method3872();
				var4 = var6;
			}

			return var4;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = 
	"(ILbo;ZB)I", garbageValue = 
	"-1")

	static int method314(int var0, Script var1, boolean var2) {
		String var3;
		int var9;
		if (var0 == ScriptOpcodes.APPEND_NUM) {
			var3 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
			var9 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var3 + var9;
			return 1;
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) {
				ChatChannel.Interpreter_stringStackSize -= 2;
				var3 = Interpreter.Interpreter_stringStack[ChatChannel.Interpreter_stringStackSize];
				var4 = Interpreter.Interpreter_stringStack[ChatChannel.Interpreter_stringStackSize + 1];
				Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var3 + var4;
				return 1;
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) {
				var3 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
				var9 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var3 + JagexCache.intToString(var9, true);
				return 1;
			} else if (var0 == ScriptOpcodes.LOWERCASE) {
				var3 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
				Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var3.toLowerCase();
				return 1;
			} else {
				int var6;
				int var10;
				if (var0 == ScriptOpcodes.FROMDATE) {
					var10 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
					long var13 = (((long) (var10)) + 11745L) * 86400000L;
					Interpreter.Interpreter_calendar.setTime(new Date(var13));
					var6 = Interpreter.Interpreter_calendar.get(5);
					int var17 = Interpreter.Interpreter_calendar.get(2);
					int var8 = Interpreter.Interpreter_calendar.get(1);
					Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = (((var6 + "-") + Interpreter.Interpreter_MONTHS[var17]) + "-") + var8;
					return 1;
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) {
					if (var0 == ScriptOpcodes.TOSTRING) {
						var10 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = Integer.toString(var10);
						return 1;
					} else if (var0 == ScriptOpcodes.COMPARE) {
						ChatChannel.Interpreter_stringStackSize -= 2;
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = UserComparator4.method2566(class118.compareStrings(Interpreter.Interpreter_stringStack[ChatChannel.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[ChatChannel.Interpreter_stringStackSize + 1], FriendSystem.clientLanguage));
						return 1;
					} else {
						int var5;
						byte[] var11;
						Font var12;
						if (var0 == ScriptOpcodes.PARAHEIGHT) {
							var3 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
							class295.Interpreter_intStackSize -= 2;
							var9 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
							var11 = class4.archive13.takeFile(var5, 0);
							var12 = new Font(var11);
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var12.lineCount(var3, var9);
							return 1;
						} else if (var0 == ScriptOpcodes.PARAWIDTH) {
							var3 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
							class295.Interpreter_intStackSize -= 2;
							var9 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
							var11 = class4.archive13.takeFile(var5, 0);
							var12 = new Font(var11);
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var12.lineWidth(var3, var9);
							return 1;
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) {
							ChatChannel.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[ChatChannel.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[ChatChannel.Interpreter_stringStackSize + 1];
							if (Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1) {
								Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var4;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ESCAPE) {
							var3 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = AbstractFont.escapeBrackets(var3);
							return 1;
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
							var9 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
							Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var3 + ((char) (var9));
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) {
							var10 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (RouteStrategy.isCharPrintable(((char) (var10)))) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) {
							var10 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (NetFileRequest.isAlphaNumeric(((char) (var10)))) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) {
							var10 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (class345.isCharAlphabetic(((char) (var10)))) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) {
							var10 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (class117.isDigit(((char) (var10)))) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) {
							var3 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
							if (var3 != null) {
								Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.SUBSTRING) {
							var3 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
							class295.Interpreter_intStackSize -= 2;
							var9 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
							Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var3.substring(var9, var5);
							return 1;
						} else if (var0 == ScriptOpcodes.REMOVETAGS) {
							var3 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
							StringBuilder var15 = new StringBuilder(var3.length());
							boolean var16 = false;

							for (var6 = 0; var6 < var3.length(); ++var6) {
								char var7 = var3.charAt(var6);
								if (var7 == '<') {
									var16 = true;
								} else if (var7 == '>') {
									var16 = false;
								} else if (!var16) {
									var15.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var15.toString();
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
							var9 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3.indexOf(var9);
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) {
							ChatChannel.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[ChatChannel.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[ChatChannel.Interpreter_stringStackSize + 1];
							var5 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var3.indexOf(var4, var5);
							return 1;
						} else if (var0 == 4122) {
							var3 = Interpreter.Interpreter_stringStack[--ChatChannel.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var3.toUpperCase();
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					ChatChannel.Interpreter_stringStackSize -= 2;
					var3 = Interpreter.Interpreter_stringStack[ChatChannel.Interpreter_stringStackSize];
					var4 = Interpreter.Interpreter_stringStack[ChatChannel.Interpreter_stringStackSize + 1];
					if ((class19.localPlayer.appearance != null) && class19.localPlayer.appearance.isFemale) {
						Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var4;
					} else {
						Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var3;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("fk")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"-109")

	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		GameObject.logOut();
		switch (var0) {
			case 1 :
				StudioGame.method5785();
				break;
			case 2 :
				class150.method3089(24);
				GrandExchangeEvent.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");}


	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(descriptor = 
	"(III)V", garbageValue = 
	"1974520943")

	static final void method307(int var0, int var1) {
		ClanChannel var2 = (var0 >= 0) ? Client.currentClanChannels[var0] : class83.guestClanChannel;
		if (((var2 != null) && (var1 >= 0)) && (var1 < var2.method3056())) {
			ClanChannelMember var3 = ((ClanChannelMember) (var2.members.get(var1)));
			if (var3.rank == (-1)) {
				String var4 = var3.username.getName();
				PacketBufferNode var5 = ItemContainer.getPacketBufferNode(ClientPacket.field2952, Client.packetWriter.isaacCipher);
				var5.packetBuffer.writeByte(3 + ItemLayer.stringCp1252NullTerminatedByteSize(var4));
				var5.packetBuffer.writeByte(var0);
				var5.packetBuffer.writeShort(var1);
				var5.packetBuffer.writeStringCp1252NullTerminated(var4);
				Client.packetWriter.addNode(var5);
			}
		}
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"-246418962")

	static void method318(int var0) {
		for (IntegerNode var1 = ((IntegerNode) (Client.widgetFlags.first())); var1 != null; var1 = ((IntegerNode) (Client.widgetFlags.next()))) {
			if (((var1.key >> 48) & 65535L) == ((long) (var0))) {
				var1.remove();
			}
		}

	}
}