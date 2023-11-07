import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ca")
@Implements("ObjectSound")
public final class ObjectSound extends Node {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("objectSounds")
	static NodeDeque objectSounds;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -69802151
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -621731961
	)
	@Export("x")
	int x;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -695019648
	)
	@Export("y")
	int y;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 197368448
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1177906816
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1736475093
	)
	int field824;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 4042297
	)
	@Export("soundEffectId")
	int soundEffectId;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lbb;"
	)
	@Export("stream1")
	RawPcmStream stream1;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 2032217193
	)
	int field827;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1837221441
	)
	int field828;
	@ObfuscatedName("av")
	@Export("soundEffectIds")
	int[] soundEffectIds;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1799658609
	)
	int field832;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lbb;"
	)
	@Export("stream2")
	RawPcmStream stream2;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lhs;"
	)
	@Export("obj")
	ObjectComposition obj;

	static {
		objectSounds = new NodeDeque();
	}

	ObjectSound() {
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "12079465"
	)
	@Export("set")
	void set() {
		int var1 = this.soundEffectId;
		ObjectComposition var2 = this.obj.transform();
		if (var2 != null) {
			this.soundEffectId = var2.ambientSoundId;
			this.field824 = var2.int7 * 16384;
			this.field827 = var2.int5;
			this.field828 = var2.int6;
			this.soundEffectIds = var2.soundEffectIds;
		} else {
			this.soundEffectId = -1;
			this.field824 = 0;
			this.field827 = 0;
			this.field828 = 0;
			this.soundEffectIds = null;
		}

		if (var1 != this.soundEffectId && this.stream1 != null) {
			LoginScreenAnimation.pcmStreamMixer.removeSubStream(this.stream1);
			this.stream1 = null;
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-737174701"
	)
	static int method1978(int var0, int var1) {
		for (int var2 = 0; var2 < 8; ++var2) {
			if (var1 <= var0 + 30) {
				return var2;
			}

			var0 += 30;
			var0 += var2 != 1 && var2 != 3 ? 5 : 20;
		}

		return 0;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "2"
	)
	static int method1973(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) {
			var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = class214.ItemDefinition_get(var3).name;
			return 1;
		} else {
			ItemComposition var5;
			int var6;
			if (var0 == ScriptOpcodes.OC_OP) {
				DbTableType.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
				var6 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
				var5 = class214.ItemDefinition_get(var3);
				if (var6 >= 1 && var6 <= 5 && var5.groundActions[var6 - 1] != null) {
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var5.groundActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_IOP) {
				DbTableType.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
				var6 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
				var5 = class214.ItemDefinition_get(var3);
				if (var6 >= 1 && var6 <= 5 && var5.inventoryActions[var6 - 1] != null) {
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var5.inventoryActions[var6 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_COST) {
				var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = class214.ItemDefinition_get(var3).price;
				return 1;
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) {
				var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = class214.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0;
				return 1;
			} else {
				ItemComposition var4;
				if (var0 == ScriptOpcodes.OC_CERT) {
					var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
					var4 = class214.ItemDefinition_get(var3);
					if (var4.noteTemplate == -1 && var4.note >= 0) {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNCERT) {
					var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
					var4 = class214.ItemDefinition_get(var3);
					if (var4.noteTemplate >= 0 && var4.note >= 0) {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) {
					var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = class214.ItemDefinition_get(var3).isMembersOnly ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
					var4 = class214.ItemDefinition_get(var3);
					if (var4.placeholderTemplate == -1 && var4.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
					var4 = class214.ItemDefinition_get(var3);
					if (var4.placeholderTemplate >= 0 && var4.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_FIND) {
					String var7 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize];
					var6 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
					UrlRequest.findItemDefinitions(var7, var6 == 1);
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = BuddyRankComparator.foundItemIdCount;
					return 1;
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) {
					if (var0 == ScriptOpcodes.OC_FINDRESET) {
						ApproximateRouteStrategy.foundItemIndex = 0;
						return 1;
					} else if (var0 == 4213) {
						var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
						var6 = class214.ItemDefinition_get(var3).getShiftClickIndex();
						if (var6 == -1) {
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var6;
						} else {
							Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var6 + 1;
						}

						return 1;
					} else if (var0 == 4214) {
						var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = class214.ItemDefinition_get(var3).maleModel;
						return 1;
					} else if (var0 == 4215) {
						var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = class214.ItemDefinition_get(var3).maleModel1;
						return 1;
					} else if (var0 == 4216) {
						var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = class214.ItemDefinition_get(var3).maleModel2;
						return 1;
					} else if (var0 == 4217) {
						var3 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
						var4 = class214.ItemDefinition_get(var3);
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var4.field2181;
						return 1;
					} else {
						return 2;
					}
				} else {
					if (MusicPatchNode.foundItemIds != null && ApproximateRouteStrategy.foundItemIndex < BuddyRankComparator.foundItemIdCount) {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = MusicPatchNode.foundItemIds[++ApproximateRouteStrategy.foundItemIndex - 1] & '\uffff';
					} else {
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = -1;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("hv")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-16844"
	)
	static final void method1980() {
		class72.method2136();
		class184.field2023.clear();
		InvDefinition.method3530();
		KitDefinition.method3631();
		DbTableType.DBTableType_cache.clear();
		EnumComposition.EnumDefinition_cached.clear();
		class138.method3158();
		class172.method3534();
		AttackOption.method2751();
		Client.method1848();
		class145.method3247();
		HitSplatDefinition.method3858();
		InvDefinition.InvDefinition_cached.clear();
		class267.method5275();
		WorldMapElement.HitSplatDefinition_cached.clear();
		class185.field2026.clear();
		InterfaceParent.method2352();
		ItemComposition.ItemDefinition_cached.clear();
		ItemComposition.ItemDefinition_cachedModels.clear();
		ItemComposition.ItemDefinition_cachedSprites.clear();
		ModeWhere.method7211();
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
		SequenceDefinition.SequenceDefinition_cachedModel.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
		WorldMapElement.method3589();
		class252.method4944();
		class399.Widget_cachedModels.method9078();
		Players.Widget_cachedFonts.method9078();
		class189.Widget_cachedSpriteMasks.clear();
		class191.field2100.clear();
		VarcInt.VarcInt_cached.clear();
		VarcInt.method3601();
		class171.field1909.clear();
		class208.method4152();
		class197.archive4.clear();
		LoginPacket.method5936();
		class195.field2136.clear();
		Client.DBTableIndex_cache.clear();
		Client.archive11.clear();
		RouteStrategy.method4389();
		HealthBarDefinition.widgetDefinition.method6288();
		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).clear();
		Canvas.method329();
		Client.field779.clearFiles();
		UserComparator7.field1441.clearFiles();
		class145.field1643.clearFiles();
		WorldMapDecorationType.archive10.clearFiles();
		class47.archive12.clearFiles();
		class344.archive2.clearFiles();
		class267.field2778.clearFiles();
		SoundSystem.field298.clearFiles();
		VarbitComposition.archive13.clearFiles();
		class313.archive4.clearFiles();
		WorldMapAreaData.field2641.clearFiles();
		Language.field4412.clearFiles();
		PcmPlayer.field281.clearFiles();
		WorldMapSection0.archive9.clearFiles();
		class514.archive6.clearFiles();
		class19.field92.clearFiles();
		class7.field25.clearFiles();
		GrandExchangeOfferOwnWorldComparator.archive8.clearFiles();
		Canvas.field114.clearFiles();
		StructComposition.field2041.clearFiles();
		WorldMapData_0.field2426.clearFiles();
		BuddyRankComparator.field1460.clearFiles();
		SpotAnimationDefinition.field2007.clearFiles();
	}
}
