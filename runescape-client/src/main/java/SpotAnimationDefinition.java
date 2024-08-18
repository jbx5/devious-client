import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jn")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	@Export("SpotAnimationDefinition_archive")
	public static AbstractArchive SpotAnimationDefinition_archive;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lob;"
	)
	@Export("SpotAnimationDefinition_modelArchive")
	public static AbstractArchive SpotAnimationDefinition_modelArchive;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("SpotAnimationDefinition_cached")
	public static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("SpotAnimationDefinition_cachedModels")
	public static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 448938209
	)
	@Export("id")
	int id;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1657832987
	)
	@Export("archive")
	int archive;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 704081159
	)
	@Export("sequence")
	public int sequence;
	@ObfuscatedName("ac")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("ae")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("ad")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("aq")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 527365683
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1065767889
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1422069197
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -181270803
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -528149603
	)
	@Export("contrast")
	int contrast;

	static {
		SpotAnimationDefinition_cached = new EvictingDualNodeHashTable(64);
		SpotAnimationDefinition_cachedModels = new EvictingDualNodeHashTable(30);
	}

	SpotAnimationDefinition() {
		this.sequence = -1;
		this.widthScale = 128;
		this.heightScale = 128;
		this.orientation = 0;
		this.ambient = 0;
		this.contrast = 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvg;B)V",
		garbageValue = "118"
	)
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvg;II)V",
		garbageValue = "2031998501"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.archive = var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.sequence = var1.readUnsignedShort();
		} else if (var2 == 4) {
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 5) {
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 6) {
			this.orientation = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.ambient = var1.readUnsignedByte();
		} else if (var2 == 8) {
			this.contrast = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 40) {
				var3 = var1.readUnsignedByte();
				this.recolorFrom = new short[var3];
				this.recolorTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.recolorFrom[var4] = (short)var1.readUnsignedShort();
					this.recolorTo[var4] = (short)var1.readUnsignedShort();
				}
			} else if (var2 == 41) {
				var3 = var1.readUnsignedByte();
				this.retextureFrom = new short[var3];
				this.retextureTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.retextureFrom[var4] = (short)var1.readUnsignedShort();
					this.retextureTo[var4] = (short)var1.readUnsignedShort();
				}
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Lhr;",
		garbageValue = "31258242"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		Model var2 = this.method4985();
		if (var2 == null) {
			return null;
		} else {
			Model var3;
			if (this.sequence != -1 && var1 != -1) {
				var3 = class182.SequenceDefinition_get(this.sequence).transformSpotAnimationModel(var2, var1);
			} else {
				var3 = var2.toSharedSpotAnimationModel(true);
			}

			if (this.widthScale != 128 || this.heightScale != 128) {
				var3.scale(this.widthScale, this.heightScale, this.widthScale);
			}

			if (this.orientation != 0) {
				if (this.orientation == 90) {
					var3.rotateY90Ccw();
				}

				if (this.orientation == 180) {
					var3.rotateY90Ccw();
					var3.rotateY90Ccw();
				}

				if (this.orientation == 270) {
					var3.rotateY90Ccw();
					var3.rotateY90Ccw();
					var3.rotateY90Ccw();
				}
			}

			return var3;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)Lhr;",
		garbageValue = "25"
	)
	public final Model method4985() {
		Model var1 = (Model)SpotAnimationDefinition_cachedModels.get((long)this.id);
		if (var1 == null) {
			ModelData var2 = ModelData.ModelData_get(SpotAnimationDefinition_modelArchive, this.archive, 0);
			if (var2 == null) {
				return null;
			}

			int var3;
			if (this.recolorFrom != null) {
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) {
					var2.recolor(this.recolorFrom[var3], this.recolorTo[var3]);
				}
			}

			if (this.retextureFrom != null) {
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) {
					var2.retexture(this.retextureFrom[var3], this.retextureTo[var3]);
				}
			}

			var1 = var2.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30);
			SpotAnimationDefinition_cachedModels.put(var1, (long)this.id);
		}

		return var1;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ILdp;ZB)I",
		garbageValue = "0"
	)
	static int method4983(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class222.loadWorlds() ? 1 : 0;
			return 1;
		} else {
			World var9;
			if (var0 == ScriptOpcodes.WORLDLIST_START) {
				var9 = class4.worldListStart();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
				var9 = class92.getNextWorldListWorld();
				if (var9 != null) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.id;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.properties;
					Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = var9.activity;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.location;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9.population;
					Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = var9.host;
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = "";
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else {
				int var3;
				World var7;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					var7 = null;

					for (var8 = 0; var8 < World.World_count; ++var8) {
						if (var3 == class319.World_worlds[var8].id) {
							var7 = class319.World_worlds[var8];
							break;
						}
					}

					if (var7 != null) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
					Interpreter.Interpreter_intStackSize -= 4;
					var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
					boolean var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1] == 1;
					var8 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
					boolean var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3] == 1;
					WorldMapElement.sortWorldList(var3, var10, var8, var6);
					return 1;
				} else if (var0 != 6511) {
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
						Client.followerOpsLowPriority = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
						return 1;
					} else {
						int var4;
						ParamComposition var5;
						if (var0 == ScriptOpcodes.NC_PARAM) {
							Interpreter.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var5 = ObjectSound.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = UserComparator8.getNpcDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = UserComparator8.getNpcDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.LC_PARAM) {
							Interpreter.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var5 = ObjectSound.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = class222.getObjectDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class222.getObjectDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.OC_PARAM) {
							Interpreter.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var5 = ObjectSound.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = Player.ItemDefinition_get(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Player.ItemDefinition_get(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
							Interpreter.Interpreter_intStackSize -= 2;
							var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var5 = ObjectSound.getParamDefinition(var4);
							if (var5.isString()) {
								Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = class269.StructDefinition_getStructDefinition(var3).getStringParam(var4, var5.defaultStr);
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class269.StructDefinition_getStructDefinition(var3).getIntParam(var4, var5.defaultInt);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ON_MOBILE) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.onMobile ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.clientType;
							return 1;
						} else if (var0 == 6520) {
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
							return 1;
						} else if (var0 == 6522) {
							--class230.Interpreter_stringStackSize;
							--Interpreter.Interpreter_intStackSize;
							return 1;
						} else if (var0 == 6523) {
							--class230.Interpreter_stringStackSize;
							--Interpreter.Interpreter_intStackSize;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
							return 1;
						} else if (var0 == 6527) {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.field509;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					if (var3 >= 0 && var3 < World.World_count) {
						var7 = class319.World_worlds[var3];
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.id;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.properties;
						Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = var7.activity;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.location;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.population;
						Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = var7.host;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = "";
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
						Interpreter.Interpreter_stringStack[++class230.Interpreter_stringStackSize - 1] = "";
					}

					return 1;
				}
			}
		}
	}
}
