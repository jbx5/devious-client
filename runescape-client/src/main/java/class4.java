import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("af")
public final class class4 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("ObjectDefinition_modelsArchive")
	static AbstractArchive ObjectDefinition_modelsArchive;
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = -148860909
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "[Lvc;"
	)
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;
	@ObfuscatedName("qi")
	@ObfuscatedGetter(
		intValue = 549714043
	)
	static int field4;

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "109"
	)
	public static int method17(int var0) {
		return var0 != 0 && var0 != 1 ? -1 : 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;B)I",
		garbageValue = "1"
	)
	static final int method12(long var0, String var2) {
		Random var3 = new Random();
		Buffer var4 = new Buffer(128);
		Buffer var5 = new Buffer(128);
		int[] var6 = new int[]{var3.nextInt(), var3.nextInt(), (int)(var0 >> 32), (int)var0};
		var4.writeByte(10);

		int var7;
		for (var7 = 0; var7 < 4; ++var7) {
			var4.writeInt(var3.nextInt());
		}

		var4.writeInt(var6[0]);
		var4.writeInt(var6[1]);
		var4.writeLong(var0);
		var4.writeLong(0L);

		for (var7 = 0; var7 < 4; ++var7) {
			var4.writeInt(var3.nextInt());
		}

		var4.encryptRsa(class74.field920, class74.field918);
		var5.writeByte(10);

		for (var7 = 0; var7 < 3; ++var7) {
			var5.writeInt(var3.nextInt());
		}

		var5.writeLong(var3.nextLong());
		var5.writeLongMedium(var3.nextLong());
		MouseRecorder.method2331(var5);
		var5.writeLong(var3.nextLong());
		var5.encryptRsa(class74.field920, class74.field918);
		var7 = class432.stringCp1252NullTerminatedByteSize(var2);
		if (var7 % 8 != 0) {
			var7 += 8 - var7 % 8;
		}

		Buffer var8 = new Buffer(var7);
		var8.writeStringCp1252NullTerminated(var2);
		var8.offset = var7;
		var8.xteaEncryptAll(var6);
		Buffer var9 = new Buffer(var4.offset + var5.offset + var8.offset + 5);
		var9.writeByte(2);
		var9.writeByte(var4.offset);
		var9.writeBytes(var4.array, 0, var4.offset);
		var9.writeByte(var5.offset);
		var9.writeBytes(var5.array, 0, var5.offset);
		var9.writeShort(var8.offset);
		var9.writeBytes(var8.array, 0, var8.offset);
		String var10 = class173.base64Encode(var9.array);

		try {
			URL var11 = new URL(class449.method8387("services", false) + "m=accountappeal/login.ws");
			URLConnection var12 = var11.openConnection();
			var12.setDoInput(true);
			var12.setDoOutput(true);
			var12.setConnectTimeout(5000);
			OutputStreamWriter var13 = new OutputStreamWriter(var12.getOutputStream());
			var13.write("data2=" + class91.method2346(var10) + "&dest=" + class91.method2346("passwordchoice.ws"));
			var13.flush();
			InputStream var14 = var12.getInputStream();
			var9 = new Buffer(new byte[1000]);

			do {
				int var15 = var14.read(var9.array, var9.offset, 1000 - var9.offset);
				if (var15 == -1) {
					var13.close();
					var14.close();
					String var16 = new String(var9.array);
					if (var16.startsWith("OFFLINE")) {
						return 4;
					} else if (var16.startsWith("WRONG")) {
						return 7;
					} else if (var16.startsWith("RELOAD")) {
						return 3;
					} else if (var16.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						var9.xteaDecryptAll(var6);

						while (var9.offset > 0 && var9.array[var9.offset - 1] == 0) {
							--var9.offset;
						}

						var16 = new String(var9.array, 0, var9.offset);
						if (SpriteMask.method6499(var16)) {
							class379.openURL(var16, true, false);
							return 2;
						} else {
							return 5;
						}
					}
				}

				var9.offset += var15;
			} while(var9.offset < 1000);

			return 5;
		} catch (Throwable var17) {
			var17.printStackTrace();
			return 5;
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZB)I",
		garbageValue = "10"
	)
	static int method13(int var0, Script var1, boolean var2) {
		if (var0 == 6754) {
			int var5 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
			NPCComposition var6 = class134.getNpcDefinition(var5);
			Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var6 != null ? var6.name : "";
			return 1;
		} else {
			NPCComposition var3;
			if (var0 == 6764) {
				class13.Interpreter_intStackSize -= 2;
				var3 = class134.getNpcDefinition(Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize]);
				int var4 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.method3976(var4);
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.method3978(var4);
				return 1;
			} else if (var0 == 6765) {
				var3 = class134.getNpcDefinition(Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3 != null ? var3.combatLevel : 0;
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(Ldv;B)V",
		garbageValue = "-60"
	)
	static void method15(NPC var0) {
		var0.field1208 = var0.definition.size;
		var0.field1238 = var0.definition.rotation;
		var0.walkSequence = var0.definition.walkSequence;
		var0.walkBackSequence = var0.definition.walkBackSequence;
		var0.walkLeftSequence = var0.definition.walkLeftSequence;
		var0.walkRightSequence = var0.definition.walkRightSequence;
		var0.idleSequence = var0.definition.idleSequence;
		var0.turnLeftSequence = var0.definition.turnLeftSequence;
		var0.turnRightSequence = var0.definition.turnRightSequence;
		var0.runSequence = var0.definition.field2130;
		var0.field1215 = var0.definition.field2131;
		var0.field1225 = var0.definition.field2161;
		var0.field1220 = var0.definition.field2133;
		var0.field1273 = var0.definition.field2134;
		var0.field1206 = var0.definition.field2135;
		var0.field1281 = var0.definition.field2136;
		var0.field1228 = var0.definition.field2124;
	}

	@ObfuscatedName("mp")
	@ObfuscatedSignature(
		descriptor = "(Ldv;IIIII)V",
		garbageValue = "-384431621"
	)
	@Export("addNpcToMenu")
	static final void addNpcToMenu(NPC var0, int var1, int var2, int var3, int var4) {
		NPCComposition var5 = var0.definition;
		if (Client.menuOptionsCount < 400) {
			if (var5.transforms != null) {
				var5 = var5.transform();
			}

			if (var5 != null) {
				if (var5.isInteractable) {
					if (!var5.isFollower || Client.followerIndex == var1) {
						String var6 = var0.method2656();
						int var7;
						if (var5.combatLevel != 0 && var0.field1280 != 0) {
							var7 = var0.field1280 != -1 ? var0.field1280 : var5.combatLevel;
							var6 = var6 + class315.method6164(var7, class17.localPlayer.combatLevel) + " " + " (" + "level-" + var7 + ")";
						}

						if (var5.lowPriorityFollowerOps && Client.followerOpsLowPriority) {
							class194.insertMenuItem("Examine", HttpAuthenticationHeader.colorStartTag(16776960) + var6, 1003, var1, var2, var3, -1, false, var4);
						}

						if (Client.isItemSelected == 1) {
							class194.insertMenuItem("Use", Client.field545 + " " + "->" + " " + HttpAuthenticationHeader.colorStartTag(16776960) + var6, 7, var1, var2, var3, -1, false, var4);
						} else if (Client.isSpellSelected) {
							if ((GrandExchangeOfferUnitPriceComparator.selectedSpellFlags & 2) == 2) {
								class194.insertMenuItem(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + HttpAuthenticationHeader.colorStartTag(16776960) + var6, 8, var1, var2, var3, -1, false, var4);
							}
						} else {
							var7 = var5.lowPriorityFollowerOps && Client.followerOpsLowPriority ? 2000 : 0;
							String[] var8 = var5.actions;
							int var9;
							int var10;
							if (var8 != null) {
								for (var9 = 4; var9 >= 0; --var9) {
									if (var0.method2693(var9) && var8[var9] != null && !var8[var9].equalsIgnoreCase("Attack")) {
										var10 = 0;
										if (var9 == 0) {
											var10 = var7 + 9;
										}

										if (var9 == 1) {
											var10 = var7 + 10;
										}

										if (var9 == 2) {
											var10 = var7 + 11;
										}

										if (var9 == 3) {
											var10 = var7 + 12;
										}

										if (var9 == 4) {
											var10 = var7 + 13;
										}

										class194.insertMenuItem(var8[var9], HttpAuthenticationHeader.colorStartTag(16776960) + var6, var10, var1, var2, var3, -1, false, var4);
									}
								}
							}

							if (var8 != null) {
								for (var9 = 4; var9 >= 0; --var9) {
									if (var0.method2693(var9) && var8[var9] != null && var8[var9].equalsIgnoreCase("Attack")) {
										short var11 = 0;
										if (Client.npcAttackOption != AttackOption.AttackOption_hidden) {
											if (AttackOption.AttackOption_alwaysRightClick == Client.npcAttackOption || AttackOption.AttackOption_dependsOnCombatLevels == Client.npcAttackOption && var5.combatLevel > class17.localPlayer.combatLevel) {
												var11 = 2000;
											}

											var10 = 0;
											if (var9 == 0) {
												var10 = var11 + 9;
											}

											if (var9 == 1) {
												var10 = var11 + 10;
											}

											if (var9 == 2) {
												var10 = var11 + 11;
											}

											if (var9 == 3) {
												var10 = var11 + 12;
											}

											if (var9 == 4) {
												var10 = var11 + 13;
											}

											class194.insertMenuItem(var8[var9], HttpAuthenticationHeader.colorStartTag(16776960) + var6, var10, var1, var2, var3, -1, false, var4);
										}
									}
								}
							}

							if (!var5.lowPriorityFollowerOps || !Client.followerOpsLowPriority) {
								class194.insertMenuItem("Examine", HttpAuthenticationHeader.colorStartTag(16776960) + var6, 1003, var1, var2, var3, -1, false, var4);
							}
						}

					}
				}
			}
		}
	}
}
