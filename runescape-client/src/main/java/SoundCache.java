import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import java.util.Date;
import net.runelite.mapping.Export;
@ObfuscatedName("ap")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("tt")
	@ObfuscatedGetter(intValue = -350003391)
	static int field323;

	@ObfuscatedName("i")
	@Export("SpriteBuffer_spriteHeights")
	public static int[] SpriteBuffer_spriteHeights;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = -1871604293)
	static int field322;

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lls;")
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lls;")
	@Export("musicSampleIndex")
	AbstractArchive musicSampleIndex;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lpa;")
	@Export("musicSamples")
	NodeHashTable musicSamples = new NodeHashTable(256);

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lpa;")
	@Export("rawSounds")
	NodeHashTable rawSounds = new NodeHashTable(256);

	@ObfuscatedSignature(descriptor = "(Lls;Lls;)V")
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		this.soundEffectIndex = var1;
		this.musicSampleIndex = var2;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(II[II)Lag;", garbageValue = "1853906698")
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & '￿' | var1 >>> 12);
		var4 |= var1 << 16;
		long var5 = ((long) (var4));
		RawSound var7 = ((RawSound) (this.rawSounds.get(var5)));
		if (var7 != null) {
			return var7;
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			SoundEffect var8 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2);
			if (var8 == null) {
				return null;
			} else {
				var7 = var8.toRawSound();
				this.rawSounds.put(var7, var5);
				if (var3 != null) {
					var3[0] -= var7.samples.length;
				}
				return var7;
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(II[II)Lag;", garbageValue = "-2091085778")
	@Export("getMusicSample0")
	RawSound getMusicSample0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & '￿' | var1 >>> 12);
		var4 |= var1 << 16;
		long var5 = ((long) (var4)) ^ 4294967296L;
		RawSound var7 = ((RawSound) (this.rawSounds.get(var5)));
		if (var7 != null) {
			return var7;
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			VorbisSample var8 = ((VorbisSample) (this.musicSamples.get(var5)));
			if (var8 == null) {
				var8 = VorbisSample.readMusicSample(this.musicSampleIndex, var1, var2);
				if (var8 == null) {
					return null;
				}
				this.musicSamples.put(var8, var5);
			}
			var7 = var8.toRawSound(var3);
			if (var7 == null) {
				return null;
			} else {
				var8.remove();
				this.rawSounds.put(var7, var5);
				return var7;
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(I[II)Lag;", garbageValue = "-1831147556")
	@Export("getSoundEffect")
	public RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) {
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I[II)Lag;", garbageValue = "-1611201037")
	@Export("getMusicSample")
	public RawSound getMusicSample(int var1, int[] var2) {
		if (this.musicSampleIndex.getGroupCount() == 1) {
			return this.getMusicSample0(0, var1, var2);
		} else if (this.musicSampleIndex.getGroupFileCount(var1) == 1) {
			return this.getMusicSample0(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(descriptor = "(ILbz;ZI)I", garbageValue = "1629817495")
	static int method744(int var0, Script var1, boolean var2) {
		String var3;
		int var9;
		if (var0 == ScriptOpcodes.APPEND_NUM) {
			var3 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
			var9 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var3 + var9;
			return 1;
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) {
				UserComparator8.Interpreter_stringStackSize -= 2;
				var3 = Interpreter.Interpreter_stringStack[UserComparator8.Interpreter_stringStackSize];
				var4 = Interpreter.Interpreter_stringStack[UserComparator8.Interpreter_stringStackSize + 1];
				Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var3 + var4;
				return 1;
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) {
				var3 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
				var9 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var3 + Archive.intToString(var9, true);
				return 1;
			} else if (var0 == ScriptOpcodes.LOWERCASE) {
				var3 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
				Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var3.toLowerCase();
				return 1;
			} else {
				int var6;
				int var10;
				if (var0 == ScriptOpcodes.FROMDATE) {
					var10 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
					long var13 = 86400000L * (11745L + ((long) (var10)));
					Interpreter.Interpreter_calendar.setTime(new Date(var13));
					var6 = Interpreter.Interpreter_calendar.get(5);
					int var17 = Interpreter.Interpreter_calendar.get(2);
					int var8 = Interpreter.Interpreter_calendar.get(1);
					Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8;
					return 1;
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) {
					if (var0 == ScriptOpcodes.TOSTRING) {
						var10 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = Integer.toString(var10);
						return 1;
					} else if (var0 == ScriptOpcodes.COMPARE) {
						UserComparator8.Interpreter_stringStackSize -= 2;
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = ScriptEvent.method2064(WorldMapIcon_0.compareStrings(Interpreter.Interpreter_stringStack[UserComparator8.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[UserComparator8.Interpreter_stringStackSize + 1], MilliClock.clientLanguage));
						return 1;
					} else {
						int var5;
						byte[] var11;
						Font var12;
						if (var0 == ScriptOpcodes.PARAHEIGHT) {
							var3 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
							User.Interpreter_intStackSize -= 2;
							var9 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
							var11 = MouseRecorder.archive13.takeFile(var5, 0);
							var12 = new Font(var11);
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var12.lineCount(var3, var9);
							return 1;
						} else if (var0 == ScriptOpcodes.PARAWIDTH) {
							var3 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
							User.Interpreter_intStackSize -= 2;
							var9 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
							var11 = MouseRecorder.archive13.takeFile(var5, 0);
							var12 = new Font(var11);
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var12.lineWidth(var3, var9);
							return 1;
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) {
							UserComparator8.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[UserComparator8.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[UserComparator8.Interpreter_stringStackSize + 1];
							if (Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1) {
								Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var4;
							}
							return 1;
						} else if (var0 == ScriptOpcodes.ESCAPE) {
							var3 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3);
							return 1;
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
							var9 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var3 + ((char) (var9));
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) {
							var10 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (class124.isCharPrintable(((char) (var10)))) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) {
							var10 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (class113.isAlphaNumeric(((char) (var10)))) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) {
							var10 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (class78.isCharAlphabetic(((char) (var10)))) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) {
							var10 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (UserComparator9.isDigit(((char) (var10)))) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) {
							var3 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
							if (var3 != null) {
								Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
							}
							return 1;
						} else if (var0 == ScriptOpcodes.SUBSTRING) {
							var3 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
							User.Interpreter_intStackSize -= 2;
							var9 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var3.substring(var9, var5);
							return 1;
						} else if (var0 == ScriptOpcodes.REMOVETAGS) {
							var3 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
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
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var15.toString();
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
							var9 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.indexOf(var9);
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) {
							UserComparator8.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[UserComparator8.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[UserComparator8.Interpreter_stringStackSize + 1];
							var5 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var3.indexOf(var4, var5);
							return 1;
						} else if (var0 == 4122) {
							var3 = Interpreter.Interpreter_stringStack[--UserComparator8.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var3.toUpperCase();
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					UserComparator8.Interpreter_stringStackSize -= 2;
					var3 = Interpreter.Interpreter_stringStack[UserComparator8.Interpreter_stringStackSize];
					var4 = Interpreter.Interpreter_stringStack[UserComparator8.Interpreter_stringStackSize + 1];
					if (ScriptFrame.localPlayer.appearance != null && ScriptFrame.localPlayer.appearance.isFemale) {
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var3;
					}
					return 1;
				}
			}
		}
	}

	@ObfuscatedName("gl")
	@ObfuscatedSignature(descriptor = "(Lcx;II)V", garbageValue = "170435945")
	static final void method757(Actor var0, int var1) {
		Bounds.worldToScreen(var0.x, var0.y, var1);
	}
}