import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hk")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("HealthBarDefinition_archive")
	public static AbstractArchive HealthBarDefinition_archive;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	public static AbstractArchive field1952;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("HealthBarDefinition_cached")
	public static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 296559381
	)
	public int field1945;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -2120019959
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1158830341
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 43170911
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 12307307
	)
	public int field1950;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -2025303453
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -839645375
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 180879959
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 847552475
	)
	@Export("width")
	public int width;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1339586751
	)
	@Export("widthPadding")
	public int widthPadding;

	static {
		HealthBarDefinition_cached = new EvictingDualNodeHashTable(64);
		HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
	}

	HealthBarDefinition() {
		this.int1 = 255;
		this.int2 = 255;
		this.int3 = -1;
		this.field1950 = 1;
		this.int5 = 70;
		this.frontSpriteID = -1;
		this.backSpriteID = -1;
		this.width = 30;
		this.widthPadding = 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvf;B)V",
		garbageValue = "10"
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lvf;IB)V",
		garbageValue = "30"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) {
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) {
			this.int3 = 0;
		} else if (var2 == 5) {
			this.int5 = var1.readUnsignedShort();
		} else if (var2 == 6) {
			var1.readUnsignedByte();
		} else if (var2 == 7) {
			this.frontSpriteID = var1.readNullableLargeSmart();
		} else if (var2 == 8) {
			this.backSpriteID = var1.readNullableLargeSmart();
		} else if (var2 == 11) {
			this.int3 = var1.readUnsignedShort();
		} else if (var2 == 14) {
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) {
			this.widthPadding = var1.readUnsignedByte();
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Lvv;",
		garbageValue = "355231067"
	)
	@Export("getFrontSprite")
	public SpritePixels getFrontSprite() {
		if (this.frontSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = AbstractUserComparator.SpriteBuffer_getSprite(field1952, this.frontSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Lvv;",
		garbageValue = "499567492"
	)
	@Export("getBackSprite")
	public SpritePixels getBackSprite() {
		if (this.backSpriteID < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID);
			if (var1 != null) {
				return var1;
			} else {
				var1 = AbstractUserComparator.SpriteBuffer_getSprite(field1952, this.backSpriteID, 0);
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lcr;",
		garbageValue = "2073100837"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0;
		return class47.getNextWorldListWorld();
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "-1580516412"
	)
	static int method3913(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == ScriptOpcodes.OC_NAME) {
			var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = MouseRecorder.ItemDefinition_get(var3).name;
			return 1;
		} else {
			int var8;
			ItemComposition var10;
			if (var0 == ScriptOpcodes.OC_OP) {
				class320.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
				var8 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
				var10 = MouseRecorder.ItemDefinition_get(var3);
				if (var8 >= 1 && var8 <= 5 && var10.groundActions[var8 - 1] != null) {
					Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var10.groundActions[var8 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_IOP) {
				class320.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
				var8 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
				var10 = MouseRecorder.ItemDefinition_get(var3);
				if (var8 >= 1 && var8 <= 5 && var10.inventoryActions[var8 - 1] != null) {
					Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var10.inventoryActions[var8 - 1];
				} else {
					Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
				}

				return 1;
			} else if (var0 == 4222) {
				class320.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
				var8 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 2];
				ItemComposition var6 = MouseRecorder.ItemDefinition_get(var3);
				String var7 = null;
				if (var8 >= 1 && var8 <= 5 && var6.inventoryActions[var8 - 1] != null && var6.field2254 != null && var6.field2254[var8 - 1] != null && var5 >= 1 && var5 <= var6.field2254[var8 - 1].length) {
					var7 = var6.field2254[var8 - 1][var5 - 1];
				}

				Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var7 != null ? var7 : "";
				return 1;
			} else if (var0 == ScriptOpcodes.OC_COST) {
				var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = MouseRecorder.ItemDefinition_get(var3).price;
				return 1;
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) {
				var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = MouseRecorder.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0;
				return 1;
			} else {
				ItemComposition var4;
				if (var0 == ScriptOpcodes.OC_CERT) {
					var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
					var4 = MouseRecorder.ItemDefinition_get(var3);
					if (var4.noteTemplate == -1 && var4.note >= 0) {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNCERT) {
					var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
					var4 = MouseRecorder.ItemDefinition_get(var3);
					if (var4.noteTemplate >= 0 && var4.note >= 0) {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var4.note;
					} else {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) {
					var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = MouseRecorder.ItemDefinition_get(var3).isMembersOnly ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
					var4 = MouseRecorder.ItemDefinition_get(var3);
					if (var4.placeholderTemplate == -1 && var4.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) {
					var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
					var4 = MouseRecorder.ItemDefinition_get(var3);
					if (var4.placeholderTemplate >= 0 && var4.placeholder >= 0) {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var4.placeholder;
					} else {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var3;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_FIND) {
					String var9 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
					var8 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
					Player.findItemDefinitions(var9, var8 == 1);
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = WorldMapArea.foundItemIdCount;
					return 1;
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) {
					if (var0 == ScriptOpcodes.OC_FINDRESET) {
						class139.foundItemIndex = 0;
						return 1;
					} else if (var0 == 4213) {
						var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
						var8 = MouseRecorder.ItemDefinition_get(var3).getShiftClickIndex();
						if (var8 == -1) {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var8;
						} else {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var8 + 1;
						}

						return 1;
					} else if (var0 == 4214) {
						var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = MouseRecorder.ItemDefinition_get(var3).maleModel;
						return 1;
					} else if (var0 == 4215) {
						var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = MouseRecorder.ItemDefinition_get(var3).maleModel1;
						return 1;
					} else if (var0 == 4216) {
						var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = MouseRecorder.ItemDefinition_get(var3).maleModel2;
						return 1;
					} else if (var0 == 4217) {
						var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
						var4 = MouseRecorder.ItemDefinition_get(var3);
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var4.field2278;
						return 1;
					} else if (var0 == 4218) {
						var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = MouseRecorder.ItemDefinition_get(var3).examine;
						return 1;
					} else {
						return 2;
					}
				} else {
					if (class165.foundItemIds != null && class139.foundItemIndex < WorldMapArea.foundItemIdCount) {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = class165.foundItemIds[++class139.foundItemIndex - 1] & '\uffff';
					} else {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = -1;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("kh")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "2140685831"
	)
	static final void method3907(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		var5 = UrlRequester.method3141(var5, var6);
		int var7 = 2048 - var3 & 2047;
		int var8 = 2048 - var4 & 2047;
		int var9 = 0;
		int var10 = 0;
		int var11 = var5;
		int var12;
		int var13;
		int var14;
		if (var7 != 0) {
			var12 = Rasterizer3D.Rasterizer3D_sine[var7];
			var13 = Rasterizer3D.Rasterizer3D_cosine[var7];
			var14 = var13 * var10 - var12 * var5 >> 16;
			var11 = var13 * var5 + var12 * var10 >> 16;
			var10 = var14;
		}

		if (var8 != 0) {
			var12 = Rasterizer3D.Rasterizer3D_sine[var8];
			var13 = Rasterizer3D.Rasterizer3D_cosine[var8];
			var14 = var12 * var11 + var9 * var13 >> 16;
			var11 = var11 * var13 - var9 * var12 >> 16;
			var9 = var14;
		}

		if (Client.isCameraLocked) {
			HttpAuthenticationHeader.field4918 = var0 - var9;
			Player.field1170 = var1 - var10;
			Strings.field4450 = var2 - var11;
			SoundCache.field303 = var3;
			class53.field353 = var4;
		} else {
			class301.cameraX = var0 - var9;
			ArchiveLoader.cameraY = var1 - var10;
			class33.cameraZ = var2 - var11;
			class463.cameraPitch = var3;
			class267.cameraYaw = var4;
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (UserComparator6.oculusOrbFocalPointX >> 7 != AddRequestTask.localPlayer.x >> 7 || AsyncHttpResponse.oculusOrbFocalPointY >> 7 != AddRequestTask.localPlayer.y >> 7)) {
			var12 = AddRequestTask.localPlayer.plane;
			var13 = (UserComparator6.oculusOrbFocalPointX >> 7) + ClientPreferences.topLevelWorldView.baseX;
			var14 = (AsyncHttpResponse.oculusOrbFocalPointY >> 7) + ClientPreferences.topLevelWorldView.baseY;
			class537.method9777(var13, var14, var12, true);
		}

	}

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1403926436"
	)
	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		Client.menu.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		Client.menu.menuWorldViewIds[0] = -1;
		Client.menu.menuActions[0] = "Cancel";
		Client.menu.menuTargets[0] = "";
		Client.menu.menuOpcodes[0] = 1006;
		Client.menu.menuShiftClick[0] = false;
		Client.menu.subMenus[0] = null;
		Client.menu.menuOptionsCount = 1;
	}
}
