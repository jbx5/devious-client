import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("cl")
@Implements("AttackOption")
public enum AttackOption implements MouseWheel {

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lcl;")
	@Export("AttackOption_dependsOnCombatLevels")
	AttackOption_dependsOnCombatLevels(0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lcl;")
	@Export("AttackOption_alwaysRightClick")
	AttackOption_alwaysRightClick(1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lcl;")
	field1282(2),
	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lcl;")
	@Export("AttackOption_hidden")
	AttackOption_hidden(3),
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lcl;")
	field1284(4);
	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -1585335571)
	@Export("id")
	final int id;

	AttackOption(int var3) {
		this.id = var3;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1790946346")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(descriptor = "(ILbc;ZI)I", garbageValue = "-713560133")
	static int method2466(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (ArchiveDiskActionHandler.loadWorlds()) ? 1 : 0;
			return 1;
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) {
				var9 = class127.worldListStart();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
				}
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
				var9 = NPC.getNextWorldListWorld();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
				}
				return 1;
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
					var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
					var7 = null;
					for (var8 = 0; var8 < World.World_count; ++var8) {
						if (var3 == class93.World_worlds[var8].id) {
							var7 = class93.World_worlds[var8];
							break;
						}
					}
					if (var7 != null) {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
					}
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
					TaskHandler.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
					boolean var10 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1] == 1;
					var8 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2];
					boolean var6 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 3] == 1;
					ArchiveLoader.sortWorldList(var3, var10, var8, var6);
					return 1;
				} else if (var0 != 6511) {
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
						return 1;
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) {
							TaskHandler.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
							var5 = class238.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = class125.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class125.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt);
							}
							return 1;
						} else if (var0 == ScriptOpcodes.LC_PARAM) {
							TaskHandler.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
							var5 = class238.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = WorldMapDecoration.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapDecoration.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt);
							}
							return 1;
						} else if (var0 == ScriptOpcodes.OC_PARAM) {
							TaskHandler.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
							var5 = class238.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = class258.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class258.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt);
							}
							return 1;
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
							TaskHandler.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
							var5 = class238.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = class126.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class126.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt);
							}
							return 1;
						} else if (var0 == ScriptOpcodes.ON_MOBILE) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (Client.onMobile) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.clientType;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
							return 1;
						} else if (var0 == 6522) {
							--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize;
							--TaskHandler.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 6523) {
							--GrandExchangeOfferAgeComparator.Interpreter_stringStackSize;
							--TaskHandler.Interpreter_intStackSize;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == 6527) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.field489;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
					if (var3 >= 0 && var3 < World.World_count) {
						var7 = class93.World_worlds[var3];
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
					}
					return 1;
				}
			}
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(descriptor = "(ILkp;ZI)V", garbageValue = "-1388826628")
	static void method2465(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = class273.getWorldMap().getMapArea(var0);
		int var4 = class28.localPlayer.plane;
		int var5 = class300.baseX * 8 + (class28.localPlayer.x >> 7);
		int var6 = Message.baseY * 64 + (class28.localPlayer.y >> 7);
		Coord var7 = new Coord(var4, var5, var6);
		class273.getWorldMap().method7240(var3, var7, var1, var2);
	}

	@ObfuscatedName("gd")
	@ObfuscatedSignature(descriptor = "(Lgc;IIIB)V", garbageValue = "-32")
	static void method2468(SequenceDefinition var0, int var1, int var2, int var3) {
		if (Client.soundEffectCount < 50 && class260.clientPreferences.method2329() != 0) {
			if (var0.field2159 != null && var0.field2159.containsKey(var1)) {
				int var4 = ((Integer) (var0.field2159.get(var1)));
				if (var4 != 0) {
					int var7 = var4 >> 8;
					int var8 = var4 >> 4 & 7;
					int var9 = var4 & 15;
					Client.soundEffectIds[Client.soundEffectCount] = var7;
					Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8;
					Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
					Client.soundEffects[Client.soundEffectCount] = null;
					int var10 = (var2 - 64) / 128;
					int var11 = (var3 - 64) / 128;
					Client.soundLocations[Client.soundEffectCount] = var9 + (var11 << 8) + (var10 << 16);
					++Client.soundEffectCount;
				}
			}
		}
	}
}