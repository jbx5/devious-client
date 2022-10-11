import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("eh")
public class class155 extends class166 {
	@ObfuscatedName("c")
	String field1733;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfc;"
	)
	final class156 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfc;Ljava/lang/String;Ljava/lang/String;)V"
	)
	class155(class156 var1, String var2, String var3) {
		super(var1, var2); // L: 372
		this.this$0 = var1; // L: 371
		this.field1733 = var3; // L: 373
	} // L: 374

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-748814320"
	)
	public int vmethod3480() {
		return 1; // L: 377
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "13"
	)
	public String vmethod3481() {
		return this.field1733; // L: 382
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZI)I",
		garbageValue = "-2017635027"
	)
	static int method3341(int var0, Script var1, boolean var2) {
		String var3;
		int var9;
		if (var0 == ScriptOpcodes.APPEND_NUM) { // L: 3239
			var3 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 3240
			var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3241
			Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var3 + var9; // L: 3242
			return 1; // L: 3243
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) { // L: 3245
				VarbitComposition.Interpreter_stringStackSize -= 2; // L: 3246
				var3 = Interpreter.Interpreter_stringStack[VarbitComposition.Interpreter_stringStackSize]; // L: 3247
				var4 = Interpreter.Interpreter_stringStack[VarbitComposition.Interpreter_stringStackSize + 1]; // L: 3248
				Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var3 + var4; // L: 3249
				return 1; // L: 3250
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) { // L: 3252
				var3 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 3253
				var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3254
				Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var3 + class347.intToString(var9, true); // L: 3255
				return 1; // L: 3256
			} else if (var0 == ScriptOpcodes.LOWERCASE) { // L: 3258
				var3 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 3259
				Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var3.toLowerCase(); // L: 3260
				return 1; // L: 3261
			} else {
				int var6;
				int var10;
				if (var0 == ScriptOpcodes.FROMDATE) { // L: 3263
					var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3264
					long var13 = 86400000L * ((long)var10 + 11745L); // L: 3265
					Interpreter.Interpreter_calendar.setTime(new Date(var13)); // L: 3266
					var6 = Interpreter.Interpreter_calendar.get(5); // L: 3267
					int var17 = Interpreter.Interpreter_calendar.get(2); // L: 3268
					int var8 = Interpreter.Interpreter_calendar.get(1); // L: 3269
					Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8; // L: 3270
					return 1; // L: 3271
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) { // L: 3273
					if (var0 == ScriptOpcodes.TOSTRING) { // L: 3281
						var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3282
						Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = Integer.toString(var10); // L: 3283
						return 1; // L: 3284
					} else if (var0 == ScriptOpcodes.COMPARE) { // L: 3286
						VarbitComposition.Interpreter_stringStackSize -= 2; // L: 3287
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferNameComparator.method6147(TileItem.compareStrings(Interpreter.Interpreter_stringStack[VarbitComposition.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[VarbitComposition.Interpreter_stringStackSize + 1], class271.clientLanguage)); // L: 3288
						return 1; // L: 3289
					} else {
						int var5;
						byte[] var11;
						Font var12;
						if (var0 == ScriptOpcodes.PARAHEIGHT) { // L: 3291
							var3 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 3292
							Interpreter.Interpreter_intStackSize -= 2; // L: 3293
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3294
							var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3295
							var11 = UserList.archive13.takeFile(var5, 0); // L: 3296
							var12 = new Font(var11); // L: 3297
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12.lineCount(var3, var9); // L: 3298
							return 1; // L: 3299
						} else if (var0 == ScriptOpcodes.PARAWIDTH) { // L: 3301
							var3 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 3302
							Interpreter.Interpreter_intStackSize -= 2; // L: 3303
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3304
							var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3305
							var11 = UserList.archive13.takeFile(var5, 0); // L: 3306
							var12 = new Font(var11); // L: 3307
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var12.lineWidth(var3, var9); // L: 3308
							return 1; // L: 3309
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) { // L: 3311
							VarbitComposition.Interpreter_stringStackSize -= 2; // L: 3312
							var3 = Interpreter.Interpreter_stringStack[VarbitComposition.Interpreter_stringStackSize]; // L: 3313
							var4 = Interpreter.Interpreter_stringStack[VarbitComposition.Interpreter_stringStackSize + 1]; // L: 3314
							if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) { // L: 3315
								Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var4; // L: 3316
							}

							return 1; // L: 3317
						} else if (var0 == ScriptOpcodes.ESCAPE) { // L: 3319
							var3 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 3320
							Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3); // L: 3321
							return 1; // L: 3322
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) { // L: 3324
							var3 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 3325
							var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3326
							Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var3 + (char)var9; // L: 3327
							return 1; // L: 3328
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) { // L: 3330
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3331
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GrandExchangeEvents.isCharPrintable((char)var10) ? 1 : 0; // L: 3332
							return 1; // L: 3333
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) { // L: 3335
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3336
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = PlayerCompositionColorTextureOverride.isAlphaNumeric((char)var10) ? 1 : 0; // L: 3337
							return 1; // L: 3338
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) { // L: 3340
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3341
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class230.isCharAlphabetic((char)var10) ? 1 : 0; // L: 3342
							return 1; // L: 3343
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) { // L: 3345
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3346
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapRectangle.isDigit((char)var10) ? 1 : 0; // L: 3347
							return 1; // L: 3348
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) { // L: 3350
							var3 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 3351
							if (var3 != null) { // L: 3352
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 3353
							}

							return 1; // L: 3354
						} else if (var0 == ScriptOpcodes.SUBSTRING) { // L: 3356
							var3 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 3357
							Interpreter.Interpreter_intStackSize -= 2; // L: 3358
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 3359
							var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 3360
							Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var3.substring(var9, var5); // L: 3361
							return 1; // L: 3362
						} else if (var0 == ScriptOpcodes.REMOVETAGS) { // L: 3364
							var3 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 3365
							StringBuilder var15 = new StringBuilder(var3.length()); // L: 3366
							boolean var16 = false; // L: 3367

							for (var6 = 0; var6 < var3.length(); ++var6) { // L: 3368
								char var7 = var3.charAt(var6); // L: 3369
								if (var7 == '<') { // L: 3370
									var16 = true;
								} else if (var7 == '>') { // L: 3371
									var16 = false;
								} else if (!var16) { // L: 3372
									var15.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var15.toString(); // L: 3374
							return 1; // L: 3375
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) { // L: 3377
							var3 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 3378
							var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3379
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var9); // L: 3380
							return 1; // L: 3381
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) { // L: 3383
							VarbitComposition.Interpreter_stringStackSize -= 2; // L: 3384
							var3 = Interpreter.Interpreter_stringStack[VarbitComposition.Interpreter_stringStackSize]; // L: 3385
							var4 = Interpreter.Interpreter_stringStack[VarbitComposition.Interpreter_stringStackSize + 1]; // L: 3386
							var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 3387
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var4, var5); // L: 3388
							return 1; // L: 3389
						} else if (var0 == 4122) { // L: 3391
							var3 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 3392
							Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var3.toUpperCase(); // L: 3393
							return 1; // L: 3394
						} else {
							return 2; // L: 3396
						}
					}
				} else {
					VarbitComposition.Interpreter_stringStackSize -= 2; // L: 3274
					var3 = Interpreter.Interpreter_stringStack[VarbitComposition.Interpreter_stringStackSize]; // L: 3275
					var4 = Interpreter.Interpreter_stringStack[VarbitComposition.Interpreter_stringStackSize + 1]; // L: 3276
					if (class67.localPlayer.appearance != null && class67.localPlayer.appearance.isFemale) { // L: 3277
						Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var3; // L: 3278
					}

					return 1; // L: 3279
				}
			}
		}
	}

	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "(Lcl;IIII)V",
		garbageValue = "-1980235642"
	)
	@Export("addPlayerToMenu")
	static final void addPlayerToMenu(Player var0, int var1, int var2, int var3) {
		if (class67.localPlayer != var0) { // L: 9673
			if (Client.menuOptionsCount < 400) { // L: 9674
				String var4;
				int var7;
				if (var0.skillLevel == 0) { // L: 9676
					String var5 = var0.actions[0] + var0.username + var0.actions[1]; // L: 9677
					var7 = var0.combatLevel; // L: 9679
					int var8 = class67.localPlayer.combatLevel; // L: 9680
					int var9 = var8 - var7; // L: 9682
					String var6;
					if (var9 < -9) { // L: 9683
						var6 = SoundCache.colorStartTag(16711680); // L: 9684
					} else if (var9 < -6) { // L: 9687
						var6 = SoundCache.colorStartTag(16723968); // L: 9688
					} else if (var9 < -3) { // L: 9691
						var6 = SoundCache.colorStartTag(16740352); // L: 9692
					} else if (var9 < 0) { // L: 9695
						var6 = SoundCache.colorStartTag(16756736); // L: 9696
					} else if (var9 > 9) { // L: 9699
						var6 = SoundCache.colorStartTag(65280); // L: 9700
					} else if (var9 > 6) { // L: 9703
						var6 = SoundCache.colorStartTag(4259584); // L: 9704
					} else if (var9 > 3) { // L: 9707
						var6 = SoundCache.colorStartTag(8453888); // L: 9708
					} else if (var9 > 0) { // L: 9711
						var6 = SoundCache.colorStartTag(12648192); // L: 9712
					} else {
						var6 = SoundCache.colorStartTag(16776960); // L: 9715
					}

					var4 = var5 + var6 + " " + " (" + "level-" + var0.combatLevel + ")" + var0.actions[2]; // L: 9717
				} else {
					var4 = var0.actions[0] + var0.username + var0.actions[1] + " " + " (" + "skill-" + var0.skillLevel + ")" + var0.actions[2]; // L: 9719
				}

				int var10;
				if (Client.isItemSelected == 1) { // L: 9720
					class135.insertMenuItemNoShift("Use", Client.selectedItemName + " " + "->" + " " + SoundCache.colorStartTag(16777215) + var4, 14, var1, var2, var3); // L: 9721
				} else if (Client.isSpellSelected) { // L: 9724
					if ((UrlRequest.selectedSpellFlags & 8) == 8) { // L: 9725
						class135.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + SoundCache.colorStartTag(16777215) + var4, 15, var1, var2, var3); // L: 9726
					}
				} else {
					for (var10 = 7; var10 >= 0; --var10) { // L: 9731
						if (Client.playerMenuActions[var10] != null) { // L: 9732
							short var11 = 0; // L: 9733
							if (Client.playerMenuActions[var10].equalsIgnoreCase("Attack")) { // L: 9734
								if (AttackOption.AttackOption_hidden == Client.playerAttackOption) { // L: 9735
									continue;
								}

								if (AttackOption.AttackOption_alwaysRightClick == Client.playerAttackOption || AttackOption.AttackOption_dependsOnCombatLevels == Client.playerAttackOption && var0.combatLevel > class67.localPlayer.combatLevel) { // L: 9736
									var11 = 2000; // L: 9737
								}

								if (class67.localPlayer.team != 0 && var0.team != 0) { // L: 9739
									if (var0.team == class67.localPlayer.team) { // L: 9740
										var11 = 2000;
									} else {
										var11 = 0; // L: 9741
									}
								} else if (AttackOption.field1275 == Client.playerAttackOption && var0.isClanMember()) { // L: 9743
									var11 = 2000; // L: 9744
								}
							} else if (Client.playerOptionsPriorities[var10]) { // L: 9747
								var11 = 2000;
							}

							boolean var12 = false; // L: 9748
							var7 = Client.playerMenuOpcodes[var10] + var11; // L: 9749
							class135.insertMenuItemNoShift(Client.playerMenuActions[var10], SoundCache.colorStartTag(16777215) + var4, var7, var1, var2, var3); // L: 9750
						}
					}
				}

				for (var10 = 0; var10 < Client.menuOptionsCount; ++var10) { // L: 9755
					if (Client.menuOpcodes[var10] == 23) { // L: 9756
						Client.menuTargets[var10] = SoundCache.colorStartTag(16777215) + var4; // L: 9757
						break;
					}
				}

			}
		}
	} // L: 9761
}
