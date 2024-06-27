import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("as")
@Implements("HttpResponse")
public class HttpResponse {
	@ObfuscatedName("gk")
	@Export("worldHost")
	static String worldHost;
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = -1291198787
	)
	static int field94;
	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	@Export("worldView")
	static WorldView worldView;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1477351693
	)
	@Export("responseCode")
	final int responseCode;
	@ObfuscatedName("ad")
	@Export("headerFields")
	final Map headerFields;
	@ObfuscatedName("ag")
	@Export("responseBody")
	final String responseBody;

	HttpResponse(String var1) {
		this.responseCode = 400;
		this.headerFields = null;
		this.responseBody = "";
	}

	HttpResponse(HttpURLConnection var1) throws IOException {
		this.responseCode = var1.getResponseCode();
		var1.getResponseMessage();
		this.headerFields = var1.getHeaderFields();
		StringBuilder var2 = new StringBuilder();
		InputStream var3 = this.responseCode >= 300 ? var1.getErrorStream() : var1.getInputStream();
		if (var3 != null) {
			InputStreamReader var4 = new InputStreamReader(var3);
			BufferedReader var5 = new BufferedReader(var4);

			String var6;
			while ((var6 = var5.readLine()) != null) {
				var2.append(var6);
			}

			var3.close();
		}

		this.responseBody = var2.toString();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2133369689"
	)
	@Export("getResponseCode")
	public int getResponseCode() {
		return this.responseCode;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "1535146674"
	)
	@Export("getHeaderFields")
	public Map getHeaderFields() {
		return this.headerFields;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1290963156"
	)
	@Export("getResponseBody")
	public String getResponseBody() {
		return this.responseBody;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)[Lmd;",
		garbageValue = "2"
	)
	public static class320[] method289() {
		return new class320[]{class320.field3378, class320.field3379, class320.field3380, class320.field3386, class320.field3382, class320.field3384, class320.field3381, class320.field3385, class320.field3383, class320.field3387, class320.field3388};
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "751839570"
	)
	public static void method300(int var0) {
		if (!class330.musicSongs.isEmpty()) {
			Iterator var1 = class330.musicSongs.iterator();

			while (var1.hasNext()) {
				MusicSong var2 = (MusicSong)var1.next();
				if (var2 != null) {
					var2.musicTrackVolume = var0;
				}
			}

			MusicSong var3 = (MusicSong)class330.musicSongs.get(0);
			if (var3 != null && var3.midiPcmStream != null && var3.midiPcmStream.isReady() && !var3.field3715) {
				var3.midiPcmStream.setPcmStreamVolume(var0);
				var3.field3704 = (float)var0;
			}
		}

	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZB)I",
		garbageValue = "1"
	)
	static int method298(int var0, Script var1, boolean var2) {
		String var3;
		int var10;
		if (var0 == ScriptOpcodes.APPEND_NUM) {
			var3 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
			var10 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var3 + var10;
			return 1;
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) {
				class337.Interpreter_stringStackSize -= 2;
				var3 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize];
				var4 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize + 1];
				Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var3 + var4;
				return 1;
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) {
				var3 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
				var10 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var3 + class201.intToString(var10, true);
				return 1;
			} else if (var0 == ScriptOpcodes.LOWERCASE) {
				var3 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
				Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var3.toLowerCase();
				return 1;
			} else {
				int var6;
				int var11;
				if (var0 == ScriptOpcodes.FROMDATE) {
					var11 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
					long var14 = (11745L + (long)var11) * 86400000L;
					Interpreter.Interpreter_calendar.setTime(new Date(var14));
					var6 = Interpreter.Interpreter_calendar.get(5);
					int var17 = Interpreter.Interpreter_calendar.get(2);
					int var8 = Interpreter.Interpreter_calendar.get(1);
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8;
					return 1;
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) {
					if (var0 == ScriptOpcodes.TOSTRING) {
						var11 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = Integer.toString(var11);
						return 1;
					} else if (var0 == ScriptOpcodes.COMPARE) {
						class337.Interpreter_stringStackSize -= 2;
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class216.method4190(class33.compareStrings(Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize + 1], BuddyRankComparator.clientLanguage));
						return 1;
					} else {
						int var9;
						byte[] var12;
						Font var13;
						if (var0 == ScriptOpcodes.PARAHEIGHT) {
							var3 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
							class130.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
							var12 = ChatChannel.archive13.takeFile(var9, 0);
							var13 = new Font(var12);
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var13.lineCount(var3, var10);
							return 1;
						} else if (var0 == ScriptOpcodes.PARAWIDTH) {
							var3 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
							class130.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
							var12 = ChatChannel.archive13.takeFile(var9, 0);
							var13 = new Font(var12);
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var13.lineWidth(var3, var10);
							return 1;
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) {
							class337.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize + 1];
							if (Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize] == 1) {
								Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var4;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ESCAPE) {
							var3 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3);
							return 1;
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
							var10 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var3 + (char)var10;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) {
							var11 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = TextureProvider.isCharPrintable((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) {
							var11 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = VarpDefinition.isAlphaNumeric((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) {
							var11 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class333.isCharAlphabetic((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) {
							var11 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = WorldMapID.isDigit((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) {
							var3 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
							if (var3 != null) {
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.SUBSTRING) {
							var3 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
							class130.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var3.substring(var10, var9);
							return 1;
						} else if (var0 == ScriptOpcodes.REMOVETAGS) {
							var3 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
							StringBuilder var16 = new StringBuilder(var3.length());
							boolean var18 = false;

							for (var6 = 0; var6 < var3.length(); ++var6) {
								char var7 = var3.charAt(var6);
								if (var7 == '<') {
									var18 = true;
								} else if (var7 == '>') {
									var18 = false;
								} else if (!var18) {
									var16.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var16.toString();
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
							var10 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.indexOf(var10);
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) {
							class337.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize + 1];
							var9 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.indexOf(var4, var9);
							return 1;
						} else if (var0 == 4122) {
							var3 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var3.toUpperCase();
							return 1;
						} else if (var0 == 4123) {
							class337.Interpreter_stringStackSize -= 3;
							var3 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize + 1];
							String var5 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize + 2];
							if (SoundCache.localPlayer.appearance == null) {
								Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var5;
								return 1;
							} else {
								switch(SoundCache.localPlayer.appearance.field3783) {
								case 0:
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var3;
									break;
								case 1:
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var4;
									break;
								case 2:
								default:
									Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var5;
								}

								return 1;
							}
						} else if (var0 == 4124) {
							Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = SoundCache.localPlayer.appearance != null ? SoundCache.localPlayer.appearance.field3783 : -1;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					class337.Interpreter_stringStackSize -= 2;
					var3 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize];
					var4 = Interpreter.Interpreter_stringStack[class337.Interpreter_stringStackSize + 1];
					if (SoundCache.localPlayer.appearance != null && SoundCache.localPlayer.appearance.gender != 0) {
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var3;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "1894674942"
	)
	static int method297(int var0, Script var1, boolean var2) {
		return 2;
	}

	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "874155014"
	)
	@Export("getTapToDrop")
	static boolean getTapToDrop() {
		return Client.tapToDrop;
	}
}
