import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("gf")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Llh;")
	@Export("ParamDefinition_archive")
	public static AbstractArchive ParamDefinition_archive;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lii;")
	@Export("ParamDefinition_cached")
	static EvictingDualNodeHashTable ParamDefinition_cached;

	@ObfuscatedName("q")
	@Export("type")
	char type;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -480942967)
	@Export("defaultInt")
	public int defaultInt;

	@ObfuscatedName("j")
	@Export("defaultStr")
	public String defaultStr;

	@ObfuscatedName("e")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	ParamComposition() {
		this.autoDisable = true;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "20")
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lqt;B)V", garbageValue = "0")
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}
			this.decodeNext(var1, var2);
		} 
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Lqt;II)V", garbageValue = "-1779670866")
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.type = class289.method5560(var1.readByte());
		} else if (var2 == 2) {
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) {
			this.autoDisable = false;
		} else if (var2 == 5) {
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "35")
	@Export("isString")
	public boolean isString() {
		return this.type == 's';
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(II)Lgh;", garbageValue = "273043499")
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = ((Frames) (SequenceDefinition.SequenceDefinition_cachedFrames.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			var1 = Calendar.method5499(SequenceDefinition.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, var0, false);
			if (var1 != null) {
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var1, ((long) (var0)));
			}
			return var1;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(descriptor = "(ILbi;ZB)I", garbageValue = "126")
	static int method3574(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (class136.loadWorlds()) ? 1 : 0;
			return 1;
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) {
				var9 = class151.worldListStart();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				}
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
				var9 = Interpreter.getNextWorldListWorld();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				}
				return 1;
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
					var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
					var7 = null;
					for (var8 = 0; var8 < World.World_count; ++var8) {
						if (var3 == class362.World_worlds[var8].id) {
							var7 = class362.World_worlds[var8];
							break;
						}
					}
					if (var7 != null) {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
					class446.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
					boolean var10 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1] == 1;
					var8 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 2];
					boolean var6 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 3] == 1;
					class138.sortWorldList(var3, var10, var8, var6);
					return 1;
				} else if (var0 != 6511) {
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
						return 1;
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) {
							class446.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
							var5 = class174.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = BuddyRankComparator.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = BuddyRankComparator.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt);
							}
							return 1;
						} else if (var0 == ScriptOpcodes.LC_PARAM) {
							class446.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
							var5 = class174.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = class162.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class162.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt);
							}
							return 1;
						} else if (var0 == ScriptOpcodes.OC_PARAM) {
							class446.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
							var5 = class174.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = EnumComposition.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = EnumComposition.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt);
							}
							return 1;
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
							class446.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1];
							var5 = class174.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = WorldMapIcon_1.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = WorldMapIcon_1.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt);
							}
							return 1;
						} else if (var0 == ScriptOpcodes.ON_MOBILE) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (Client.onMobile) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.clientType;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
							return 1;
						} else if (var0 == 6522) {
							--Interpreter.Interpreter_stringStackSize;
							--class446.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 6523) {
							--Interpreter.Interpreter_stringStackSize;
							--class446.Interpreter_intStackSize;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == 6527) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = Client.field484;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
					if (var3 >= 0 && var3 < World.World_count) {
						var7 = class362.World_worlds[var3];
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					}
					return 1;
				}
			}
		}
	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(descriptor = "(IIIILqe;Lkp;I)V", garbageValue = "1077753678")
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) {
			int var6 = Client.camAngleY & 2047;
			int var7 = var3 * var3 + var2 * var2;
			if (var7 <= 6400) {
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6];
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6];
				int var10 = var3 * var8 + var9 * var2 >> 16;
				int var11 = var3 * var9 - var8 * var2 >> 16;
				if (var7 > 2500) {
					var4.method8270(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths);
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2);
				}
			}
		}
	}
}