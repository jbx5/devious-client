




import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.Implements; import net.runelite.mapping.ObfuscatedGetter; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ka")
@Implements("PlayerType")
public enum PlayerType implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lka;")

	@Export("PlayerType_normal")
	PlayerType_normal(0, -1, true, false, true),
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lka;")

	@Export("PlayerType_playerModerator")
	PlayerType_playerModerator(1, 0, true, true, true),
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Lka;")

	@Export("PlayerType_jagexModerator")
	PlayerType_jagexModerator(2, 1, true, true, false),
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Lka;")

	@Export("PlayerType_ironman")
	PlayerType_ironman(3, 2, false, false, true),
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"Lka;")

	@Export("PlayerType_ultimateIronman")
	PlayerType_ultimateIronman(4, 3, false, false, true),
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Lka;")

	@Export("PlayerType_hardcoreIronman")
	PlayerType_hardcoreIronman(5, 10, false, false, true),
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"Lka;")

	field3923(6, 22, false, false, true),
	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"Lka;")

	field3927(7, 41, false, false, true),
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"Lka;")

	field3920(8, 42, false, false, true);

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	1109984117)

	@Export("id")
	final int id;
	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 
	571102393)

	@Export("modIcon")
	public final int modIcon;
	@ObfuscatedName("p")
	@Export("isPrivileged")
	public final boolean isPrivileged;
	@ObfuscatedName("w")
	@Export("isUser")
	public final boolean isUser;

	PlayerType(int var3, int var4, boolean var5, boolean var6, boolean var7) {
		this.id = var3;
		this.modIcon = var4;
		this.isPrivileged = var6;
		this.isUser = var7;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"16")

	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Llo;I)I", garbageValue = 
	"-380323275")

	@Export("compareStrings")
	public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
		int var3 = var0.length();
		int var4 = var1.length();
		int var5 = 0;
		int var6 = 0;
		byte var7 = 0;
		byte var8 = 0;

		while (((var5 - var7) < var3) || ((var6 - var8) < var4)) {
			if ((var5 - var7) >= var3) {
				return -1;
			}

			if ((var6 - var8) >= var4) {
				return 1;
			}

			char var9;
			if (var7 != 0) {
				var9 = ((char) (var7));
				boolean var14 = false;
			} else {
				var9 = var0.charAt(var5++);
			}

			char var10;
			if (var8 != 0) {
				var10 = ((char) (var8));
				boolean var15 = false;
			} else {
				var10 = var1.charAt(var6++);
			}

			byte var11;
			if (var9 == 198) {
				var11 = 69;
			} else if (var9 == 230) {
				var11 = 101;
			} else if (var9 == 223) {
				var11 = 115;
			} else if (var9 == 338) {
				var11 = 69;
			} else if (var9 == 339) {
				var11 = 101;
			} else {
				var11 = 0;
			}

			var7 = var11;
			byte var12;
			if (var10 == 198) {
				var12 = 69;
			} else if (var10 == 230) {
				var12 = 101;
			} else if (var10 == 223) {
				var12 = 115;
			} else if (var10 == 338) {
				var12 = 69;
			} else if (var10 == 339) {
				var12 = 101;
			} else {
				var12 = 0;
			}

			var8 = var12;
			var9 = class291.standardizeChar(var9, var2);
			var10 = class291.standardizeChar(var10, var2);
			if ((var10 != var9) && (Character.toUpperCase(var9) != Character.toUpperCase(var10))) {
				var9 = Character.toLowerCase(var9);
				var10 = Character.toLowerCase(var10);
				if (var10 != var9) {
					return SecureRandomCallable.lowercaseChar(var9, var2) - SecureRandomCallable.lowercaseChar(var10, var2);
				}
			}
		} 

		int var16 = Math.min(var3, var4);

		int var17;
		char var20;
		for (var17 = 0; var17 < var16; ++var17) {
			if (var2 == Language.Language_FR) {
				var5 = (var3 - 1) - var17;
				var6 = (var4 - 1) - var17;
			} else {
				var6 = var17;
				var5 = var17;
			}

			char var18 = var0.charAt(var5);
			var20 = var1.charAt(var6);
			if ((var20 != var18) && (Character.toUpperCase(var18) != Character.toUpperCase(var20))) {
				var18 = Character.toLowerCase(var18);
				var20 = Character.toLowerCase(var20);
				if (var18 != var20) {
					return SecureRandomCallable.lowercaseChar(var18, var2) - SecureRandomCallable.lowercaseChar(var20, var2);
				}
			}
		}

		var17 = var3 - var4;
		if (var17 != 0) {
			return var17;
		} else {
			for (int var19 = 0; var19 < var16; ++var19) {
				var20 = var0.charAt(var19);
				char var13 = var1.charAt(var19);
				if (var13 != var20) {
					return SecureRandomCallable.lowercaseChar(var20, var2) - SecureRandomCallable.lowercaseChar(var13, var2);
				}
			}

			return 0;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = 
	"(ILbd;ZI)I", garbageValue = 
	"1428968028")

	static int method5803(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.SOUND_SYNTH) {
			Interpreter.Interpreter_intStackSize -= 3;
			Actor.queueSoundEffect(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]);
			return 1;
		} else if (var0 == ScriptOpcodes.SOUND_SONG) {
			SoundCache.playSong(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
			return 1;
		} else if (var0 == ScriptOpcodes.SOUND_JINGLE) {
			Interpreter.Interpreter_intStackSize -= 2;
			Players.method2419(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
			return 1;
		} else {
			class83 var3;
			class82 var4;
			int var5;
			int var6;
			String var7;
			if (((((((var0 != 3212) && (var0 != 3213)) && (var0 != 3209)) && (var0 != 3181)) && (var0 != 3203)) && (var0 != 3205)) && (var0 != 3207)) {
				if (((((((var0 != 3214) && (var0 != 3215)) && (var0 != 3210)) && (var0 != 3182)) && (var0 != 3204)) && (var0 != 3206)) && (var0 != 3208)) {
					return var0 == 3211 ? 1 : 2;
				} else {
					var3 = class83.field1064;
					var4 = class82.field1055;
					boolean var8 = false;
					if (var0 == 3214) {
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var3 = ((class83) (MusicPatchPcmStream.findEnumerated(SpotAnimationDefinition.method3549(), var6)));
						if (var3 == null) {
							throw new RuntimeException(String.format("Unrecognized device option %d", var6));
						}
					}

					if (var0 == 3215) {
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var4 = ((class82) (MusicPatchPcmStream.findEnumerated(ArchiveDisk.method6935(), var6)));
						if (var4 == null) {
							throw new RuntimeException(String.format("Unrecognized game option %d", var6));
						}
					}

					if (var0 == 3210) {
						var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						var3 = ((class83) (MusicPatchPcmStream.findEnumerated(SpotAnimationDefinition.method3549(), var6)));
						if (var3 == null) {
							var4 = ((class82) (MusicPatchPcmStream.findEnumerated(ArchiveDisk.method6935(), var6)));
							if (var4 == null) {
								throw new RuntimeException(String.format("Unrecognized client option %d", var6));
							}
						}
					} else if (var0 == 3182) {
						var3 = class83.field1065;
					} else if (var0 == 3204) {
						var4 = class82.field1059;
					} else if (var0 == 3206) {
						var4 = class82.field1057;
					} else if (var0 == 3208) {
						var4 = class82.field1056;
					}

					if (var4 == class82.field1055) {
						switch (var3.field1060) {
							case 1 :
								var5 = (class131.clientPreferences.method2317()) ? 1 : 0;
								break;
							case 2 :
								var5 = (class131.clientPreferences.method2279()) ? 1 : 0;
								break;
							case 3 :
								var5 = (class131.clientPreferences.method2236()) ? 1 : 0;
								break;
							case 4 :
								var5 = class131.clientPreferences.method2238();
								break;
							case 5 :
								var5 = VarbitComposition.method3578();
								break;
							default :
								var7 = String.format("Unkown device option: %s.", var3.toString());
								throw new RuntimeException(var7);}

					} else {
						switch (var4.field1054) {
							case 1 :
								var5 = (class131.clientPreferences.method2263()) ? 1 : 0;
								break;
							case 2 :
								var6 = class131.clientPreferences.method2321();
								var5 = Math.round(((float) (var6 * 100)) / 255.0F);
								break;
							case 3 :
								var6 = class131.clientPreferences.method2243();
								var5 = Math.round(((float) (var6 * 100)) / 127.0F);
								break;
							case 4 :
								var6 = class131.clientPreferences.method2270();
								var5 = Math.round(((float) (var6 * 100)) / 127.0F);
								break;
							default :
								var7 = String.format("Unkown game option: %s.", var4.toString());
								throw new RuntimeException(var7);}

					}

					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var5;
					return 1;
				}
			} else {
				var3 = class83.field1064;
				var4 = class82.field1055;
				var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (var0 == 3212) {
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					var3 = ((class83) (MusicPatchPcmStream.findEnumerated(SpotAnimationDefinition.method3549(), var6)));
					if (var3 == null) {
						throw new RuntimeException(String.format("Unrecognized device option %d", var6));
					}
				}

				if (var0 == 3213) {
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					var4 = ((class82) (MusicPatchPcmStream.findEnumerated(ArchiveDisk.method6935(), var6)));
					if (var4 == null) {
						throw new RuntimeException(String.format("Unrecognized game option %d", var6));
					}
				}

				if (var0 == 3209) {
					var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					var3 = ((class83) (MusicPatchPcmStream.findEnumerated(SpotAnimationDefinition.method3549(), var6)));
					if (var3 == null) {
						var4 = ((class82) (MusicPatchPcmStream.findEnumerated(ArchiveDisk.method6935(), var6)));
						if (var4 == null) {
							throw new RuntimeException(String.format("Unrecognized client option %d", var6));
						}
					}
				} else if (var0 == 3181) {
					var3 = class83.field1065;
				} else if (var0 == 3203) {
					var4 = class82.field1059;
				} else if (var0 == 3205) {
					var4 = class82.field1057;
				} else if (var0 == 3207) {
					var4 = class82.field1056;
				}

				if (var4 == class82.field1055) {
					switch (var3.field1060) {
						case 1 :
							class131.clientPreferences.method2230(var5 == 1);
							break;
						case 2 :
							class131.clientPreferences.method2237(var5 == 1);
							break;
						case 3 :
							class131.clientPreferences.method2234(var5 == 1);
							break;
						case 4 :
							if (var5 < 0) {
								var5 = 0;
							}

							class131.clientPreferences.method2260(var5);
							break;
						case 5 :
							class113.method2650(var5);
							break;
						default :
							var7 = String.format("Unkown device option: %s.", var3.toString());
							throw new RuntimeException(var7);}

				} else {
					switch (var4.field1054) {
						case 1 :
							class131.clientPreferences.method2246(var5 == 1);
							break;
						case 2 :
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round(((float) (var5 * 255)) / 100.0F);
							class1.method11(var6);
							break;
						case 3 :
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round(((float) (var5 * 127)) / 100.0F);
							class126.method2824(var6);
							break;
						case 4 :
							var5 = Math.min(Math.max(var5, 0), 100);
							var6 = Math.round(((float) (var5 * 127)) / 100.0F);
							class127.method2830(var6);
							break;
						default :
							var7 = String.format("Unkown game option: %s.", var4.toString());
							throw new RuntimeException(var7);}

				}

				return 1;
			}
		}
	}}