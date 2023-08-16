import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fr")
public enum class139 implements MouseWheel {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	field1650(0, 0),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	field1647(2, 1),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	field1653(3, 2),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	field1646(4, 3),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	field1648(1, 4);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	@Export("loginScreenRunesAnimation")
	static LoginScreenAnimation loginScreenRunesAnimation;
	@ObfuscatedName("km")
	@ObfuscatedGetter(
		intValue = 1907020251
	)
	@Export("cameraZ")
	static int cameraZ;
	@ObfuscatedName("rj")
	@ObfuscatedSignature(
		descriptor = "Lrs;"
	)
	static class454 field1654;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -726683121
	)
	public final int field1651;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 456464061
	)
	@Export("id")
	final int id;

	class139(int var3, int var4) {
		this.field1651 = var3;
		this.id = var4;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnu;I)V",
		garbageValue = "-1677394683"
	)
	public static void method3083(AbstractArchive var0) {
		ParamComposition.ParamDefinition_archive = var0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lch;Lch;IZI)I",
		garbageValue = "548586770"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) {
			int var4 = var0.population;
			int var5 = var1.population;
			if (!var3) {
				if (var4 == -1) {
					var4 = 2001;
				}

				if (var5 == -1) {
					var5 = 2001;
				}
			}

			return var4 - var5;
		} else if (var2 == 2) {
			return var0.location - var1.location;
		} else if (var2 == 3) {
			if (var0.activity.equals("-")) {
				if (var1.activity.equals("-")) {
					return 0;
				} else {
					return var3 ? -1 : 1;
				}
			} else if (var1.activity.equals("-")) {
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity);
			}
		} else if (var2 == 4) {
			return var0.method1817() ? (var1.method1817() ? 0 : 1) : (var1.method1817() ? -1 : 0);
		} else if (var2 == 5) {
			return var0.method1805() ? (var1.method1805() ? 0 : 1) : (var1.method1805() ? -1 : 0);
		} else if (var2 == 6) {
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) {
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id;
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "-808541663"
	)
	static int method3084(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class125.loadWorlds() ? 1 : 0;
			return 1;
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) {
				var9 = class18.worldListStart();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
				var9 = VarcInt.getNextWorldListWorld();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
					var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
					var7 = null;

					for (var8 = 0; var8 < World.World_count; ++var8) {
						if (var3 == class176.World_worlds[var8].id) {
							var7 = class176.World_worlds[var8];
							break;
						}
					}

					if (var7 != null) {
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
					SoundCache.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
					boolean var10 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1] == 1;
					var8 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2];
					boolean var6 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 3] == 1;
					class131.sortWorldList(var3, var10, var8, var6);
					return 1;
				} else if (var0 != 6511) {
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1;
						return 1;
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) {
							SoundCache.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
							var5 = PlayerCompositionColorTextureOverride.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = class90.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class90.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.LC_PARAM) {
							SoundCache.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
							var5 = PlayerCompositionColorTextureOverride.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = WorldMapElement.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = WorldMapElement.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.OC_PARAM) {
							SoundCache.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
							var5 = PlayerCompositionColorTextureOverride.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = InvDefinition.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = InvDefinition.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
							SoundCache.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
							var5 = PlayerCompositionColorTextureOverride.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = Players.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Players.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ON_MOBILE) {
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) {
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.clientType;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
							return 1;
						} else if (var0 == 6522) {
							--class137.Interpreter_stringStackSize;
							--SoundCache.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 6523) {
							--class137.Interpreter_stringStackSize;
							--SoundCache.Interpreter_intStackSize;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) {
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) {
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) {
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == 6527) {
							Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.field544;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
					if (var3 >= 0 && var3 < World.World_count) {
						var7 = class176.World_worlds[var3];
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				}
			}
		}
	}
}
