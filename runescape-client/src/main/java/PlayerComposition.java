import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("an")
	public static short[][] field3646;
	@ObfuscatedName("ad")
	public static short[] field3648;
	@ObfuscatedName("aw")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("PlayerAppearance_cachedModels")
	static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lqj;"
	)
	static class439 field3651;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -177001297
	)
	static int field3652;
	@ObfuscatedName("am")
	int[] field3643;
	@ObfuscatedName("ap")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("af")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1371357529
	)
	public int field3639;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 2080622051
	)
	@Export("gender")
	public int gender;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1192849673
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = -5117144179831570855L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		longValue = 300192240701935017L
	)
	long field3647;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lgb;"
	)
	@Export("playerCompositionColorTextureOverrides")
	PlayerCompositionColorTextureOverride[] playerCompositionColorTextureOverrides;
	@ObfuscatedName("aa")
	boolean field3645;

	static {
		equipmentIndices = new int[]{class205.field2255.field2259, class205.field2257.field2259, class205.field2251.field2259, class205.field2253.field2259, class205.field2261.field2259, class205.field2254.field2259, class205.field2256.field2259};
		PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
		field3651 = new class439(16, class437.field4677);
		field3652 = 0;
	}

	public PlayerComposition() {
		this.field3639 = -1;
		this.gender = 0;
		this.field3645 = false;
	}

	@ObfuscatedSignature(
		descriptor = "(Lnz;)V"
	)
	PlayerComposition(PlayerComposition var1) {
		this.field3639 = -1;
		this.gender = 0;
		this.field3645 = false;
		int[] var2 = Arrays.copyOf(var1.equipment, var1.equipment.length);
		int[] var3 = Arrays.copyOf(var1.field3643, var1.field3643.length);
		PlayerCompositionColorTextureOverride[] var4 = (PlayerCompositionColorTextureOverride[])(var1.playerCompositionColorTextureOverrides != null ? (PlayerCompositionColorTextureOverride[])Arrays.copyOf(var1.playerCompositionColorTextureOverrides, var1.playerCompositionColorTextureOverrides.length) : null);
		int[] var5 = Arrays.copyOf(var1.bodyColors, var1.bodyColors.length);
		this.method6372(var3, var2, var4, false, var5, var1.gender, var1.npcTransformId, var1.field3639);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([I[I[Lgb;Z[IIIII)V",
		garbageValue = "629052239"
	)
	public void method6372(int[] var1, int[] var2, PlayerCompositionColorTextureOverride[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.playerCompositionColorTextureOverrides = var3;
		this.field3645 = var4;
		this.field3639 = var8;
		this.method6373(var1, var2, var5, var6, var7);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([I[I[IIII)V",
		garbageValue = "-2050509235"
	)
	public void method6373(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (var1 == null) {
			var1 = this.method6374(var4);
		}

		if (var2 == null) {
			var2 = this.method6374(var4);
		}

		this.field3643 = var1;
		this.equipment = var2;
		this.bodyColors = var3;
		this.gender = var4;
		this.npcTransformId = var5;
		this.setHash();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "-1941026920"
	)
	int[] method6374(int var1) {
		int[] var2 = new int[12];

		for (int var3 = 0; var3 < 7; ++var3) {
			for (int var4 = 0; var4 < KitDefinition.KitDefinition_fileCount; ++var4) {
				KitDefinition var5 = PlayerType.KitDefinition_get(var4);
				if (var5 != null && !var5.nonSelectable && (var1 == 1 ? 7 : 0) + var3 == var5.bodypartID) {
					var2[equipmentIndices[var3]] = var4 + 256;
					break;
				}
			}
		}

		return var2;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-914027039"
	)
	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
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

				var4 = PlayerType.KitDefinition_get(var3);
			} while(var4 == null || var4.nonSelectable || (this.gender == 1 ? 7 : 0) + var1 != var4.bodypartID);

			this.equipment[equipmentIndices[var1]] = var3 + 256;
			this.setHash();
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "751474737"
	)
	public void method6388(int var1, boolean var2) {
		int var3 = this.bodyColors[var1];
		if (!var2) {
			do {
				--var3;
				if (var3 < 0) {
					var3 = field3646[var1].length - 1;
				}
			} while(!VarcInt.method3635(var1, var3));
		} else {
			do {
				++var3;
				if (var3 >= field3646[var1].length) {
					var3 = 0;
				}
			} while(!VarcInt.method3635(var1, var3));
		}

		this.bodyColors[var1] = var3;
		this.setHash();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "424550326"
	)
	public void method6386(int var1) {
		if (this.gender != var1) {
			this.method6373((int[])null, (int[])null, this.bodyColors, var1, -1);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Luk;B)V",
		garbageValue = "-18"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.gender);

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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1718369552"
	)
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
				this.hash += (long)(this.equipment[var5] - 256);
			}
		}

		if (this.equipment[0] >= 256) {
			this.hash += (long)(this.equipment[0] - 256 >> 4);
		}

		if (this.equipment[1] >= 256) {
			this.hash += (long)(this.equipment[1] - 256 >> 8);
		}

		for (var5 = 0; var5 < 5; ++var5) {
			this.hash <<= 3;
			this.hash += (long)this.bodyColors[var5];
		}

		this.hash <<= 1;
		this.hash += 2080622051L * (long)(this.gender * -1386633269);
		this.equipment[5] = var3;
		this.equipment[9] = var4;
		if (0L != var1 && var1 != this.hash || this.field3645) {
			PlayerAppearance_cachedModels.remove(var1);
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lhl;ILhl;IB)Lko;",
		garbageValue = "-50"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) {
			return Script.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4, (NpcOverrides)null);
		} else {
			long var5 = this.hash;
			int[] var7 = this.equipment;
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) {
				var7 = new int[12];

				for (int var8 = 0; var8 < 12; ++var8) {
					var7[var8] = this.equipment[var8];
				}

				if (var1.shield >= 0) {
					var5 += (long)(var1.shield - this.equipment[5] << 40);
					var7[5] = var1.shield;
				}

				if (var1.weapon >= 0) {
					var5 += (long)(var1.weapon - this.equipment[3] << 48);
					var7[3] = var1.weapon;
				}
			}

			Model var18 = (Model)PlayerAppearance_cachedModels.get(var5);
			if (var18 == null) {
				boolean var9 = false;

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) {
					var11 = var7[var10];
					if (var11 >= 256 && var11 < 512 && !PlayerType.KitDefinition_get(var11 - 256).ready()) {
						var9 = true;
					}

					if (var11 >= 512 && !class341.ItemDefinition_get(var11 - 512).method3994(this.gender)) {
						var9 = true;
					}
				}

				if (var9) {
					if (-1L != this.field3647) {
						var18 = (Model)PlayerAppearance_cachedModels.get(this.field3647);
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
							ModelData var14 = PlayerType.KitDefinition_get(var13 - 256).getModelData();
							if (var14 != null) {
								var19[var11++] = var14;
							}
						}

						if (var13 >= 512) {
							ItemComposition var22 = class341.ItemDefinition_get(var13 - 512);
							ModelData var15 = var22.method3989(this.gender);
							if (var15 != null) {
								if (this.playerCompositionColorTextureOverrides != null) {
									PlayerCompositionColorTextureOverride var16 = this.playerCompositionColorTextureOverrides[var12];
									if (var16 != null) {
										int var17;
										if (var16.playerCompositionRecolorTo != null && var22.recolorFrom != null && var16.playerCompositionRecolorTo.length == var22.recolorTo.length) {
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
						if (this.bodyColors[var13] < field3646[var13].length) {
							var20.recolor(class539.field5245[var13], field3646[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < DevicePcmPlayerProvider.field113[var13].length) {
							var20.recolor(field3648[var13], DevicePcmPlayerProvider.field113[var13][this.bodyColors[var13]]);
						}
					}

					var18 = var20.toModel(64, 850, -30, -50, -30);
					PlayerAppearance_cachedModels.put(var18, var5);
					this.field3647 = var5;
				}
			}

			Model var21;
			if (var1 == null && var3 == null) {
				var21 = var18.toSharedSequenceModel(true);
			} else if (var1 != null && var3 != null) {
				var21 = var1.applyTransformations(var18, var2, var3, var4);
			} else if (var1 != null) {
				var21 = var1.transformActorModel(var18, var2);
			} else {
				var21 = var3.transformActorModel(var18, var4);
			}

			return var21;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lkm;",
		garbageValue = "1938215856"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) {
			return Script.getNpcDefinition(this.npcTransformId).method3720((NpcOverrides)null);
		} else {
			boolean var1 = false;

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) {
				var3 = this.equipment[var2];
				if (var3 >= 256 && var3 < 512 && !PlayerType.KitDefinition_get(var3 - 256).method3665()) {
					var1 = true;
				}

				if (var3 >= 512 && !class341.ItemDefinition_get(var3 - 512).method4018(this.gender)) {
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
						var6 = PlayerType.KitDefinition_get(var5 - 256).getKitDefinitionModels();
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}

					if (var5 >= 512) {
						var6 = class341.ItemDefinition_get(var5 - 512).method3997(this.gender);
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}
				}

				ModelData var8 = new ModelData(var7, var3);

				for (var5 = 0; var5 < 5; ++var5) {
					if (this.bodyColors[var5] < field3646[var5].length) {
						var8.recolor(class539.field5245[var5], field3646[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < DevicePcmPlayerProvider.field113[var5].length) {
						var8.recolor(field3648[var5], DevicePcmPlayerProvider.field113[var5][this.bodyColors[var5]]);
					}
				}

				return var8;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2102105717"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		long var1 = this.hash;
		if (this.npcTransformId != -1) {
			var1 = -65536L | (long)this.npcTransformId;
		}

		Integer var3 = (Integer)field3651.method8139(var1);
		if (var3 == null) {
			var3 = ++field3652 - 1;
			field3651.method8146(var1, var3);
			field3652 %= 65535;
		}

		return var3;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1817630974"
	)
	void method6383() {
		this.method6373(this.field3643, this.equipment, this.bodyColors, this.gender, this.npcTransformId);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-538084723"
	)
	public static void method6414() {
		SequenceDefinition.SequenceDefinition_cached.clear();
		SequenceDefinition.SequenceDefinition_cachedFrames.clear();
		SequenceDefinition.SequenceDefinition_cachedModel.clear();
	}
}
