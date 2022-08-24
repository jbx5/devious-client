import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("kk")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("o")
	public static short[] field3333;

	@ObfuscatedName("a")
	public static short[][] field3331;

	@ObfuscatedName("m")
	@Export("equipmentIndices")
	static final int[] equipmentIndices = new int[]{ 8, 11, 4, 6, 9, 7, 10 };

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Liz;")
	@Export("PlayerAppearance_cachedModels")
	static EvictingDualNodeHashTable PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);

	@ObfuscatedName("s")
	@Export("equipment")
	int[] equipment;

	@ObfuscatedName("h")
	@Export("bodyColors")
	int[] bodyColors;

	@ObfuscatedName("w")
	@Export("isFemale")
	public boolean isFemale;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 498090761)
	@Export("npcTransformId")
	public int npcTransformId;

	@ObfuscatedName("c")
	@ObfuscatedGetter(longValue = 9056698069051954845L)
	@Export("hash")
	long hash;

	@ObfuscatedName("q")
	@ObfuscatedGetter(longValue = 4728249697680037065L)
	long field3337;

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "[Lfx;")
	@Export("playerCompositionColorTextureOverrides")
	PlayerCompositionColorTextureOverride[] playerCompositionColorTextureOverrides;

	@ObfuscatedName("k")
	boolean field3332 = false;

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "([I[Lfx;Z[IZIB)V", garbageValue = "36")
	public void method5494(int[] var1, PlayerCompositionColorTextureOverride[] var2, boolean var3, int[] var4, boolean var5, int var6) {
		this.playerCompositionColorTextureOverrides = var2;
		this.field3332 = var3;
		this.update(var1, var4, var5, var6);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "([I[IZIB)V", garbageValue = "9")
	@Export("update")
	public void update(int[] var1, int[] var2, boolean var3, int var4) {
		if (var1 == null) {
			var1 = new int[12];
			for (int var5 = 0; var5 < 7; ++var5) {
				for (int var6 = 0; var6 < KitDefinition.KitDefinition_fileCount; ++var6) {
					KitDefinition var7 = class17.KitDefinition_get(var6);
					if (var7 != null && !var7.nonSelectable && var7.bodypartID == var5 + (var3 ? 7 : 0)) {
						var1[equipmentIndices[var5]] = var6 + 256;
						break;
					}
				}
			}
		}
		this.equipment = var1;
		this.bodyColors = var2;
		this.isFemale = var3;
		this.npcTransformId = var4;
		this.setHash();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(IZI)V", garbageValue = "613289258")
	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
		if (var1 != 1 || !this.isFemale) {
			int var3 = this.equipment[equipmentIndices[var1]];
			if (var3 != 0) {
				var3 -= 256;
				KitDefinition var4;
				do {
					if (!var2) {
						--var3;
						if (var3 < 0) {
							var3 = KitDefinition.KitDefinition_fileCount - 1;
						}
					} else {
						++var3;
						if (var3 >= KitDefinition.KitDefinition_fileCount) {
							var3 = 0;
						}
					}
					var4 = class17.KitDefinition_get(var3);
				} while (var4 == null || var4.nonSelectable || var1 + (this.isFemale ? 7 : 0) != var4.bodypartID );
				this.equipment[equipmentIndices[var1]] = var3 + 256;
				this.setHash();
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(IZI)V", garbageValue = "-2110095496")
	public void method5497(int var1, boolean var2) {
		int var3 = this.bodyColors[var1];
		boolean var4;
		if (!var2) {
			do {
				--var3;
				if (var3 < 0) {
					var3 = FloorDecoration.field2275[var1].length - 1;
				}
				if (var1 == 4 && var3 >= 8) {
					var4 = false;
				} else {
					var4 = true;
				}
			} while (!var4 );
		} else {
			do {
				++var3;
				if (var3 >= FloorDecoration.field2275[var1].length) {
					var3 = 0;
				}
				if (var1 == 4 && var3 >= 8) {
					var4 = false;
				} else {
					var4 = true;
				}
			} while (!var4 );
		}
		this.bodyColors[var1] = var3;
		this.setHash();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(ZI)V", garbageValue = "1895720961")
	@Export("changeSex")
	public void changeSex(boolean var1) {
		if (this.isFemale != var1) {
			this.update(((int[]) (null)), this.bodyColors, var1, -1);
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lqr;B)V", garbageValue = "0")
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.isFemale ? 1 : 0);
		int var2;
		for (var2 = 0; var2 < 7; ++var2) {
			int var3 = this.equipment[equipmentIndices[var2]];
			if (var3 == 0) {
				var1.writeByte(-1);
			} else {
				var1.writeByte(var3 - 256);
			}
		}
		for (var2 = 0; var2 < 5; ++var2) {
			var1.writeByte(this.bodyColors[var2]);
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "0")
	@Export("setHash")
	void setHash() {
		long var1 = this.hash;
		int var3 = this.equipment[5];
		int var4 = this.equipment[9];
		this.equipment[5] = var4;
		this.equipment[9] = var3;
		this.hash = 0L;
		int var5;
		for (var5 = 0; var5 < 12; ++var5) {
			this.hash <<= 4;
			if (this.equipment[var5] >= 256) {
				this.hash += ((long) (this.equipment[var5] - 256));
			}
		}
		if (this.equipment[0] >= 256) {
			this.hash += ((long) (this.equipment[0] - 256 >> 4));
		}
		if (this.equipment[1] >= 256) {
			this.hash += ((long) (this.equipment[1] - 256 >> 8));
		}
		for (var5 = 0; var5 < 5; ++var5) {
			this.hash <<= 3;
			this.hash += ((long) (this.bodyColors[var5]));
		}
		this.hash <<= 1;
		this.hash += ((long) ((this.isFemale) ? 1 : 0));
		this.equipment[5] = var3;
		this.equipment[9] = var4;
		if (0L != var1 && var1 != this.hash || this.field3332) {
			PlayerAppearance_cachedModels.remove(var1);
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(Lgh;ILgh;II)Lhp;", garbageValue = "2043268960")
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) {
			return class119.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4);
		} else {
			long var5 = this.hash;
			int[] var7 = this.equipment;
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) {
				var7 = new int[12];
				for (int var8 = 0; var8 < 12; ++var8) {
					var7[var8] = this.equipment[var8];
				}
				if (var1.shield >= 0) {
					var5 += ((long) (var1.shield - this.equipment[5] << 40));
					var7[5] = var1.shield;
				}
				if (var1.weapon >= 0) {
					var5 += ((long) (var1.weapon - this.equipment[3] << 48));
					var7[3] = var1.weapon;
				}
			}
			Model var18 = ((Model) (PlayerAppearance_cachedModels.get(var5)));
			if (var18 == null) {
				boolean var9 = false;
				int var11;
				for (int var10 = 0; var10 < 12; ++var10) {
					var11 = var7[var10];
					if (var11 >= 256 && var11 < 512 && !class17.KitDefinition_get(var11 - 256).ready()) {
						var9 = true;
					}
					if (var11 >= 512 && !AttackOption.ItemDefinition_get(var11 - 512).hasNoValidModel(this.isFemale)) {
						var9 = true;
					}
				}
				if (var9) {
					if (-1L != this.field3337) {
						var18 = ((Model) (PlayerAppearance_cachedModels.get(this.field3337)));
					}
					if (var18 == null) {
						return null;
					}
				}
				if (var18 == null) {
					ModelData[] var19 = new ModelData[12];
					var11 = 0;
					int var13;
					for (int var12 = 0; var12 < 12; ++var12) {
						var13 = var7[var12];
						if (var13 >= 256 && var13 < 512) {
							ModelData var14 = class17.KitDefinition_get(var13 - 256).getModelData();
							if (var14 != null) {
								var19[var11++] = var14;
							}
						}
						if (var13 >= 512) {
							ItemComposition var22 = AttackOption.ItemDefinition_get(var13 - 512);
							ModelData var15 = var22.method3635(this.isFemale);
							if (var15 != null) {
								if (this.playerCompositionColorTextureOverrides != null) {
									PlayerCompositionColorTextureOverride var16 = this.playerCompositionColorTextureOverrides[var12];
									if (var16 != null) {
										int var17;
										if (var16.playerCompositionRecolorTo != null && var22.recolorFrom != null && var22.recolorTo.length == var16.playerCompositionRecolorTo.length) {
											for (var17 = 0; var17 < var22.recolorFrom.length; ++var17) {
												var15.recolor(var22.recolorTo[var17], var16.playerCompositionRecolorTo[var17]);
											}
										}
										if (var16.playerCompositionRetextureTo != null && var22.retextureFrom != null && var16.playerCompositionRetextureTo.length == var22.retextureTo.length) {
											for (var17 = 0; var17 < var22.retextureFrom.length; ++var17) {
												var15.retexture(var22.retextureTo[var17], var16.playerCompositionRetextureTo[var17]);
											}
										}
									}
								}
								var19[var11++] = var15;
							}
						}
					}
					ModelData var20 = new ModelData(var19, var11);
					for (var13 = 0; var13 < 5; ++var13) {
						if (this.bodyColors[var13] < FloorDecoration.field2275[var13].length) {
							var20.recolor(field3333[var13], FloorDecoration.field2275[var13][this.bodyColors[var13]]);
						}
						if (this.bodyColors[var13] < field3331[var13].length) {
							var20.recolor(class220.field2674[var13], field3331[var13][this.bodyColors[var13]]);
						}
					}
					var18 = var20.toModel(64, 850, -30, -50, -30);
					PlayerAppearance_cachedModels.put(var18, var5);
					this.field3337 = var5;
				}
			}
			if (var1 == null && var3 == null) {
				return var18;
			} else {
				Model var21;
				if (var1 != null && var3 != null) {
					var21 = var1.applyTransformations(var18, var2, var3, var4);
				} else if (var1 != null) {
					var21 = var1.transformActorModel(var18, var2);
				} else {
					var21 = var3.transformActorModel(var18, var4);
				}
				return var21;
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(B)Lgp;", garbageValue = "-54")
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) {
			return class119.getNpcDefinition(this.npcTransformId).getModelData();
		} else {
			boolean var1 = false;
			int var3;
			for (int var2 = 0; var2 < 12; ++var2) {
				var3 = this.equipment[var2];
				if (var3 >= 256 && var3 < 512 && !class17.KitDefinition_get(var3 - 256).method3351()) {
					var1 = true;
				}
				if (var3 >= 512 && !AttackOption.ItemDefinition_get(var3 - 512).method3630(this.isFemale)) {
					var1 = true;
				}
			}
			if (var1) {
				return null;
			} else {
				ModelData[] var7 = new ModelData[12];
				var3 = 0;
				int var5;
				for (int var4 = 0; var4 < 12; ++var4) {
					var5 = this.equipment[var4];
					ModelData var6;
					if (var5 >= 256 && var5 < 512) {
						var6 = class17.KitDefinition_get(var5 - 256).getKitDefinitionModels();
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}
					if (var5 >= 512) {
						var6 = AttackOption.ItemDefinition_get(var5 - 512).method3637(this.isFemale);
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}
				}
				ModelData var8 = new ModelData(var7, var3);
				for (var5 = 0; var5 < 5; ++var5) {
					if (this.bodyColors[var5] < FloorDecoration.field2275[var5].length) {
						var8.recolor(field3333[var5], FloorDecoration.field2275[var5][this.bodyColors[var5]]);
					}
					if (this.bodyColors[var5] < field3331[var5].length) {
						var8.recolor(class220.field2674[var5], field3331[var5][this.bodyColors[var5]]);
					}
				}
				return var8;
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-98669892")
	@Export("getChatHeadId")
	public int getChatHeadId() {
		return this.npcTransformId == -1 ? (this.equipment[0] << 15) + this.equipment[1] + (this.equipment[11] << 5) + (this.equipment[8] << 10) + (this.bodyColors[0] << 25) + (this.bodyColors[4] << 20) : 305419896 + class119.getNpcDefinition(this.npcTransformId).id;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(IIB)V", garbageValue = "-14")
	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4];
		int[] var3 = new int[4];
		var2[0] = var0;
		var3[0] = var1;
		int var4 = 1;
		for (int var5 = 0; var5 < 4; ++var5) {
			if (World.World_sortOption1[var5] != var0) {
				var2[var4] = World.World_sortOption1[var5];
				var3[var4] = World.World_sortOption2[var5];
				++var4;
			}
		}
		World.World_sortOption1 = var2;
		World.World_sortOption2 = var3;
		WorldMapData_1.sortWorlds(World.World_worlds, 0, World.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(IIS)I", garbageValue = "7901")
	static int method5528(int var0, int var1) {
		long var2 = ((long) ((var0 << 16) + var1));
		return MenuAction.NetCache_currentResponse != null && var2 == MenuAction.NetCache_currentResponse.key ? ClientPreferences.NetCache_responseArchiveBuffer.offset * 99 / (ClientPreferences.NetCache_responseArchiveBuffer.array.length - MenuAction.NetCache_currentResponse.padding) + 1 : 0;
	}
}