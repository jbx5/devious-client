import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cx")
@Implements("Decimator")
public class Decimator {
	@ObfuscatedName("wm")
	static Iterator field425;
	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("Widget_archive")
	public static AbstractArchive Widget_archive;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1787207085
	)
	@Export("inputRate")
	int inputRate;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1799047063
	)
	@Export("outputRate")
	int outputRate;
	@ObfuscatedName("ai")
	@Export("table")
	int[][] table;

	public Decimator(int var1, int var2) {
		if (var2 != var1) {
			int var4 = var1;
			int var5 = var2;
			if (var2 > var1) {
				var4 = var2;
				var5 = var1;
			}

			while (var5 != 0) {
				int var6 = var4 % var5;
				var4 = var5;
				var5 = var6;
			}

			var1 /= var4;
			var2 /= var4;
			this.inputRate = var1;
			this.outputRate = var2;
			this.table = new int[var1][14];

			for (int var7 = 0; var7 < var1; ++var7) {
				int[] var8 = this.table[var7];
				double var9 = 6.0D + (double)var7 / (double)var1;
				int var11 = (int)Math.floor(1.0D + (var9 - 7.0D));
				if (var11 < 0) {
					var11 = 0;
				}

				int var12 = (int)Math.ceil(var9 + 7.0D);
				if (var12 > 14) {
					var12 = 14;
				}

				for (double var13 = (double)var2 / (double)var1; var11 < var12; ++var11) {
					double var15 = ((double)var11 - var9) * 3.141592653589793D;
					double var17 = var13;
					if (var15 < -1.0E-4D || var15 > 1.0E-4D) {
						var17 = var13 * (Math.sin(var15) / var15);
					}

					var17 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double)var11 - var9));
					var8[var11] = (int)Math.floor(0.5D + var17 * 65536.0D);
				}
			}

		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([BS)[B",
		garbageValue = "31853"
	)
	@Export("resample")
	byte[] resample(byte[] var1) {
		if (this.table != null) {
			int var2 = (int)((long)this.outputRate * (long)var1.length / (long)this.inputRate) + 14;
			int[] var3 = new int[var2];
			int var4 = 0;
			int var5 = 0;

			int var6;
			for (var6 = 0; var6 < var1.length; ++var6) {
				byte var7 = var1[var6];
				int[] var8 = this.table[var5];

				int var9;
				for (var9 = 0; var9 < 14; ++var9) {
					var3[var9 + var4] += var7 * var8[var9];
				}

				var5 += this.outputRate;
				var9 = var5 / this.inputRate;
				var4 += var9;
				var5 -= var9 * this.inputRate;
			}

			var1 = new byte[var2];

			for (var6 = 0; var6 < var2; ++var6) {
				int var10 = var3[var6] + 32768 >> 16;
				if (var10 < -128) {
					var1[var6] = -128;
				} else if (var10 > 127) {
					var1[var6] = 127;
				} else {
					var1[var6] = (byte)var10;
				}
			}
		}

		return var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "1"
	)
	@Export("scaleRate")
	int scaleRate(int var1) {
		if (this.table != null) {
			var1 = (int)((long)var1 * (long)this.outputRate / (long)this.inputRate);
		}

		return var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "429071526"
	)
	@Export("scalePosition")
	int scalePosition(int var1) {
		if (this.table != null) {
			var1 = (int)((long)var1 * (long)this.outputRate / (long)this.inputRate) + 6;
		}

		return var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;Lsf;I)Lsf;",
		garbageValue = "-738926216"
	)
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte();
		int var3;
		if (var1 == null) {
			var3 = WorldMapIcon_1.method5088(var2);
			var1 = new IterableNodeHashTable(var3);
		}

		for (var3 = 0; var3 < var2; ++var3) {
			boolean var4 = var0.readUnsignedByte() == 1;
			int var5 = var0.readMedium();
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
			} else {
				var6 = new IntegerNode(var0.readInt());
			}

			var1.put((Node)var6, (long)var5);
		}

		return var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)Ltu;",
		garbageValue = "1734618555"
	)
	@Export("getPreferencesFile")
	public static AccessFile getPreferencesFile(String var0, String var1, boolean var2) {
		File var3 = new File(JagexCache.cacheDir, "preferences" + var0 + ".dat");
		if (var3.exists()) {
			try {
				AccessFile var10 = new AccessFile(var3, "rw", 10000L);
				return var10;
			} catch (IOException var9) {
			}
		}

		String var4 = "";
		if (JagexCache.cacheGamebuild == 33) {
			var4 = "_rc";
		} else if (JagexCache.cacheGamebuild == 34) {
			var4 = "_wip";
		}

		File var5 = new File(class36.userHomeDirectory, "jagex_" + var1 + "_preferences" + var0 + var4 + ".dat");
		AccessFile var6;
		if (!var2 && var5.exists()) {
			try {
				var6 = new AccessFile(var5, "rw", 10000L);
				return var6;
			} catch (IOException var8) {
			}
		}

		try {
			var6 = new AccessFile(var3, "rw", 10000L);
			return var6;
		} catch (IOException var7) {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "88"
	)
	static final boolean method1135() {
		return ViewportMouse.ViewportMouse_isInViewport;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lnu;IB)Z",
		garbageValue = "0"
	)
	public static boolean method1129(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1);
		if (var2 == null) {
			return false;
		} else {
			class137.SpriteBuffer_decode(var2);
			return true;
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZB)I",
		garbageValue = "-94"
	)
	static int method1133(int var0, Script var1, boolean var2) {
		String var3;
		int var10;
		if (var0 == ScriptOpcodes.APPEND_NUM) {
			var3 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize];
			var10 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var3 + var10;
			return 1;
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) {
				class137.Interpreter_stringStackSize -= 2;
				var3 = Interpreter.Interpreter_stringStack[class137.Interpreter_stringStackSize];
				var4 = Interpreter.Interpreter_stringStack[class137.Interpreter_stringStackSize + 1];
				Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var3 + var4;
				return 1;
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) {
				var3 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize];
				var10 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var3 + class60.intToString(var10, true);
				return 1;
			} else if (var0 == ScriptOpcodes.LOWERCASE) {
				var3 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize];
				Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var3.toLowerCase();
				return 1;
			} else {
				int var6;
				int var11;
				if (var0 == ScriptOpcodes.FROMDATE) {
					var11 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
					long var14 = 86400000L * ((long)var11 + 11745L);
					Interpreter.Interpreter_calendar.setTime(new Date(var14));
					var6 = Interpreter.Interpreter_calendar.get(5);
					int var17 = Interpreter.Interpreter_calendar.get(2);
					int var8 = Interpreter.Interpreter_calendar.get(1);
					Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8;
					return 1;
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) {
					if (var0 == ScriptOpcodes.TOSTRING) {
						var11 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = Integer.toString(var11);
						return 1;
					} else if (var0 == ScriptOpcodes.COMPARE) {
						class137.Interpreter_stringStackSize -= 2;
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = ItemComposition.method4006(StudioGame.compareStrings(Interpreter.Interpreter_stringStack[class137.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[class137.Interpreter_stringStackSize + 1], ClanChannelMember.clientLanguage));
						return 1;
					} else {
						int var9;
						byte[] var12;
						Font var13;
						if (var0 == ScriptOpcodes.PARAHEIGHT) {
							var3 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize];
							SoundCache.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
							var12 = Player.archive13.takeFile(var9, 0);
							var13 = new Font(var12);
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var13.lineCount(var3, var10);
							return 1;
						} else if (var0 == ScriptOpcodes.PARAWIDTH) {
							var3 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize];
							SoundCache.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
							var12 = Player.archive13.takeFile(var9, 0);
							var13 = new Font(var12);
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var13.lineWidth(var3, var10);
							return 1;
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) {
							class137.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[class137.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[class137.Interpreter_stringStackSize + 1];
							if (Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1) {
								Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var4;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ESCAPE) {
							var3 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3);
							return 1;
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize];
							var10 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
							Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var3 + (char)var10;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) {
							var11 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = GrandExchangeOfferOwnWorldComparator.isCharPrintable((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) {
							var11 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = WorldMapLabel.isAlphaNumeric((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) {
							var11 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class200.isCharAlphabetic((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) {
							var11 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class330.isDigit((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) {
							var3 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize];
							if (var3 != null) {
								Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.SUBSTRING) {
							var3 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize];
							SoundCache.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
							Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var3.substring(var10, var9);
							return 1;
						} else if (var0 == ScriptOpcodes.REMOVETAGS) {
							var3 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize];
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

							Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var16.toString();
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize];
							var10 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.indexOf(var10);
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) {
							class137.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[class137.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[class137.Interpreter_stringStackSize + 1];
							var9 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.indexOf(var4, var9);
							return 1;
						} else if (var0 == 4122) {
							var3 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var3.toUpperCase();
							return 1;
						} else if (var0 == 4123) {
							class137.Interpreter_stringStackSize -= 3;
							var3 = Interpreter.Interpreter_stringStack[class137.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[class137.Interpreter_stringStackSize + 1];
							String var5 = Interpreter.Interpreter_stringStack[class137.Interpreter_stringStackSize + 2];
							if (VarbitComposition.localPlayer.appearance == null) {
								Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var5;
								return 1;
							} else {
								switch(VarbitComposition.localPlayer.appearance.field3574) {
								case 0:
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var3;
									break;
								case 1:
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var4;
									break;
								case 2:
								default:
									Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var5;
								}

								return 1;
							}
						} else {
							return 2;
						}
					}
				} else {
					class137.Interpreter_stringStackSize -= 2;
					var3 = Interpreter.Interpreter_stringStack[class137.Interpreter_stringStackSize];
					var4 = Interpreter.Interpreter_stringStack[class137.Interpreter_stringStackSize + 1];
					if (VarbitComposition.localPlayer.appearance != null && VarbitComposition.localPlayer.appearance.gender != 0) {
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var3;
					}

					return 1;
				}
			}
		}
	}
}
