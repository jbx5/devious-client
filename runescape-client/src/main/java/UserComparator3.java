import java.lang.reflect.Field;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.lang.reflect.Method;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.rs.Reflection;
import java.util.Date;
import net.runelite.mapping.Export;
@ObfuscatedName("dr")
@Implements("UserComparator3")
public class UserComparator3 extends AbstractUserComparator {
	@ObfuscatedName("tv")
	@ObfuscatedGetter(intValue = -120700993)
	static int field1391;

	@ObfuscatedName("mc")
	@ObfuscatedGetter(intValue = 761312471)
	@Export("menuX")
	static int menuX;

	@ObfuscatedName("c")
	@Export("reversed")
	final boolean reversed;

	public UserComparator3(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lnm;Lnm;B)I", garbageValue = "-18")
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.world != var1.world) {
			return this.reversed ? var1.world - var2.world : var2.world - var1.world;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy(((Buddy) (var1)), ((Buddy) (var2)));
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Lqt;IB)V", garbageValue = "22")
	@Export("readReflectionCheck")
	public static void readReflectionCheck(Buffer var0, int var1) {
		ReflectionCheck var2 = new ReflectionCheck();
		var2.size = var0.readUnsignedByte();
		var2.id = var0.readInt();
		var2.operations = new int[var2.size];
		var2.creationErrors = new int[var2.size];
		var2.fields = new Field[var2.size];
		var2.intReplaceValues = new int[var2.size];
		var2.methods = new Method[var2.size];
		var2.arguments = new byte[var2.size][][];
		for (int var3 = 0; var3 < var2.size; ++var3) {
			try {
				int var4 = var0.readUnsignedByte();
				String var5;
				String var6;
				int var7;
				if (var4 != 0 && var4 != 1 && var4 != 2) {
					if (var4 == 3 || var4 == 4) {
						var5 = var0.readStringCp1252NullTerminated();
						var6 = var0.readStringCp1252NullTerminated();
						var7 = var0.readUnsignedByte();
						String[] var8 = new String[var7];
						for (int var9 = 0; var9 < var7; ++var9) {
							var8[var9] = var0.readStringCp1252NullTerminated();
						}
						String var20 = var0.readStringCp1252NullTerminated();
						byte[][] var10 = new byte[var7][];
						int var12;
						if (var4 == 3) {
							for (int var11 = 0; var11 < var7; ++var11) {
								var12 = var0.readInt();
								var10[var11] = new byte[var12];
								var0.readBytes(var10[var11], 0, var12);
							}
						}
						var2.operations[var3] = var4;
						Class[] var21 = new Class[var7];
						for (var12 = 0; var12 < var7; ++var12) {
							var21[var12] = WorldMapRectangle.loadClassFromDescriptor(var8[var12]);
						}
						Class var22 = WorldMapRectangle.loadClassFromDescriptor(var20);
						if (WorldMapRectangle.loadClassFromDescriptor(var5).getClassLoader() == null) {
							throw new SecurityException();
						}
						Method[] var13 = WorldMapRectangle.loadClassFromDescriptor(var5).getDeclaredMethods();
						Method[] var14 = var13;
						for (int var15 = 0; var15 < var14.length; ++var15) {
							Method var16 = var14[var15];
							if (Reflection.getMethodName(var16).equals(var6)) {
								Class[] var17 = Reflection.getParameterTypes(var16);
								if (var17.length == var21.length) {
									boolean var18 = true;
									for (int var19 = 0; var19 < var21.length; ++var19) {
										if (var21[var19] != var17[var19]) {
											var18 = false;
											break;
										}
									}
									if (var18 && var22 == var16.getReturnType()) {
										var2.methods[var3] = var16;
									}
								}
							}
						}
						var2.arguments[var3] = var10;
					}
				} else {
					var5 = var0.readStringCp1252NullTerminated();
					var6 = var0.readStringCp1252NullTerminated();
					var7 = 0;
					if (var4 == 1) {
						var7 = var0.readInt();
					}
					var2.operations[var3] = var4;
					var2.intReplaceValues[var3] = var7;
					if (WorldMapRectangle.loadClassFromDescriptor(var5).getClassLoader() == null) {
						throw new SecurityException();
					}
					var2.fields[var3] = Reflection.findField(WorldMapRectangle.loadClassFromDescriptor(var5), var6);
				}
			} catch (ClassNotFoundException var24) {
				var2.creationErrors[var3] = -1;
			} catch (SecurityException var25) {
				var2.creationErrors[var3] = -2;
			} catch (NullPointerException var26) {
				var2.creationErrors[var3] = -3;
			} catch (Exception var27) {
				var2.creationErrors[var3] = -4;
			} catch (Throwable var28) {
				var2.creationErrors[var3] = -5;
			}
		}
		class33.reflectionChecks.addFirst(var2);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = "(ILbi;ZB)I", garbageValue = "13")
	static int method2592(int var0, Script var1, boolean var2) {
		String var3;
		int var9;
		if (var0 == ScriptOpcodes.APPEND_NUM) {
			var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
			var9 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + var9;
			return 1;
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) {
				Interpreter.Interpreter_stringStackSize -= 2;
				var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
				var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + var4;
				return 1;
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) {
				var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
				var9 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + Tile.intToString(var9, true);
				return 1;
			} else if (var0 == ScriptOpcodes.LOWERCASE) {
				var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.toLowerCase();
				return 1;
			} else {
				int var6;
				int var10;
				if (var0 == ScriptOpcodes.FROMDATE) {
					var10 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
					long var13 = 86400000L * (11745L + ((long) (var10)));
					Interpreter.Interpreter_calendar.setTime(new Date(var13));
					var6 = Interpreter.Interpreter_calendar.get(5);
					int var17 = Interpreter.Interpreter_calendar.get(2);
					int var8 = Interpreter.Interpreter_calendar.get(1);
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8;
					return 1;
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) {
					if (var0 == ScriptOpcodes.TOSTRING) {
						var10 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = Integer.toString(var10);
						return 1;
					} else if (var0 == ScriptOpcodes.COMPARE) {
						Interpreter.Interpreter_stringStackSize -= 2;
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Tile.method4019(WorldMapSection0.compareStrings(Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1], class134.clientLanguage));
						return 1;
					} else {
						int var5;
						byte[] var11;
						Font var12;
						if (var0 == ScriptOpcodes.PARAHEIGHT) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							class446.Interpreter_intStackSize -= 2;
							var9 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
							var11 = AbstractByteArrayCopier.archive13.takeFile(var5, 0);
							var12 = new Font(var11);
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var12.lineCount(var3, var9);
							return 1;
						} else if (var0 == ScriptOpcodes.PARAWIDTH) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							class446.Interpreter_intStackSize -= 2;
							var9 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
							var11 = AbstractByteArrayCopier.archive13.takeFile(var5, 0);
							var12 = new Font(var11);
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var12.lineWidth(var3, var9);
							return 1;
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) {
							Interpreter.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
							if (Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4;
							}
							return 1;
						} else if (var0 == ScriptOpcodes.ESCAPE) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3);
							return 1;
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							var9 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3 + ((char) (var9));
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) {
							var10 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (StudioGame.isCharPrintable(((char) (var10)))) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) {
							var10 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (FloorOverlayDefinition.isAlphaNumeric(((char) (var10)))) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) {
							var10 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (WorldMapDecorationType.isCharAlphabetic(((char) (var10)))) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) {
							var10 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (class83.isDigit(((char) (var10)))) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							if (var3 != null) {
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
							}
							return 1;
						} else if (var0 == ScriptOpcodes.SUBSTRING) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							class446.Interpreter_intStackSize -= 2;
							var9 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
							var5 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.substring(var9, var5);
							return 1;
						} else if (var0 == ScriptOpcodes.REMOVETAGS) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
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
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var15.toString();
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							var9 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.indexOf(var9);
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) {
							Interpreter.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
							var5 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var3.indexOf(var4, var5);
							return 1;
						} else if (var0 == 4122) {
							var3 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.toUpperCase();
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					Interpreter.Interpreter_stringStackSize -= 2;
					var3 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize];
					var4 = Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize + 1];
					if (class101.localPlayer.appearance != null && class101.localPlayer.appearance.isFemale) {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3;
					}
					return 1;
				}
			}
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(descriptor = "(ILbi;ZB)I", garbageValue = "62")
	static int method2590(int var0, Script var1, boolean var2) {
		if (var0 == 7600) {
			--Interpreter.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7601) {
			--Interpreter.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7602) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 7603) {
			--class446.Interpreter_intStackSize;
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else if (var0 == 7604) {
			--Interpreter.Interpreter_stringStackSize;
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 7605) {
			--class446.Interpreter_intStackSize;
			return 1;
		} else if (var0 == 7606) {
			class446.Interpreter_intStackSize -= 2;
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 7607) {
			return 1;
		} else if (var0 == 7608) {
			--Interpreter.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7609) {
			--Interpreter.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7610) {
			--Interpreter.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7611) {
			--class446.Interpreter_intStackSize;
			return 1;
		} else if (var0 == 7612) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 7613) {
			--class446.Interpreter_intStackSize;
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else if (var0 == 7614) {
			return 1;
		} else if (var0 == 7615) {
			--Interpreter.Interpreter_stringStackSize;
			return 1;
		} else if (var0 == 7616) {
			--Interpreter.Interpreter_stringStackSize;
			class446.Interpreter_intStackSize -= 2;
			return 1;
		} else if (var0 == 7617) {
			--Interpreter.Interpreter_stringStackSize;
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else {
			return 2;
		}
	}
}