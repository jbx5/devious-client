import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fc")
public class class134 implements class125 {
	@ObfuscatedName("gb")
	@Export("sessionId")
	static String sessionId;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;II[BII)I",
		garbageValue = "-1827607701"
	)
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1;

		for (int var6 = 0; var6 < var5; ++var6) {
			char var7 = var0.charAt(var6 + var1);
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) {
				var3[var6 + var4] = (byte)var7;
			} else if (var7 == 8364) {
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) {
				var3[var6 + var4] = -126;
			} else if (var7 == 402) {
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) {
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) {
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) {
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) {
				var3[var6 + var4] = -121;
			} else if (var7 == 710) {
				var3[var6 + var4] = -120;
			} else if (var7 == 8240) {
				var3[var6 + var4] = -119;
			} else if (var7 == 352) {
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) {
				var3[var6 + var4] = -117;
			} else if (var7 == 338) {
				var3[var6 + var4] = -116;
			} else if (var7 == 381) {
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) {
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) {
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) {
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) {
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) {
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) {
				var3[var6 + var4] = -106;
			} else if (var7 == 8212) {
				var3[var6 + var4] = -105;
			} else if (var7 == 732) {
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) {
				var3[var6 + var4] = -103;
			} else if (var7 == 353) {
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) {
				var3[var6 + var4] = -101;
			} else if (var7 == 339) {
				var3[var6 + var4] = -100;
			} else if (var7 == 382) {
				var3[var6 + var4] = -98;
			} else if (var7 == 376) {
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63;
			}
		}

		return var5;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZB)I",
		garbageValue = "32"
	)
	static int method3072(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) {
			HttpRequestTask.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
			EnumComposition var10 = class162.getEnum(var3);
			if (var10.outputType != 's') {
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) {
				if (var9 == var10.keys[var6]) {
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var10.strVals[var6];
					var10 = null;
					break;
				}
			}

			if (var10 != null) {
				Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1;
		} else if (var0 != ScriptOpcodes.ENUM) {
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) {
				var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
				EnumComposition var4 = class162.getEnum(var3);
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var4.size();
				return 1;
			} else {
				return 2;
			}
		} else {
			HttpRequestTask.Interpreter_intStackSize -= 4;
			var3 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
			var9 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 2];
			var6 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 3];
			EnumComposition var7 = class162.getEnum(var5);
			if (var3 == var7.inputType && var9 == var7.outputType) {
				for (int var8 = 0; var8 < var7.outputCount; ++var8) {
					if (var6 == var7.keys[var8]) {
						if (var9 == 115) {
							Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var7.intVals[var8];
						}

						var7 = null;
						break;
					}
				}

				if (var7 != null) {
					if (var9 == 115) {
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var7.defaultInt;
					}
				}

				return 1;
			} else {
				if (var9 == 115) {
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "54"
	)
	static final void method3073(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : HttpRequestTask.guestClanChannel;
		if (var2 != null && var1 >= 0 && var1 < var2.method3394()) {
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1);
			if (var3.rank == -1) {
				String var4 = var3.username.getName();
				PacketBufferNode var5 = FadeInTask.getPacketBufferNode(ClientPacket.field3250, Client.packetWriter.isaacCipher);
				var5.packetBuffer.writeByte(3 + SequenceDefinition.stringCp1252NullTerminatedByteSize(var4));
				var5.packetBuffer.writeByte(var0);
				var5.packetBuffer.writeShort(var1);
				var5.packetBuffer.writeStringCp1252NullTerminated(var4);
				Client.packetWriter.addNode(var5);
			}
		}
	}
}
