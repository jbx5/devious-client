import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ne")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("ax")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("PlayerAppearance_cachedModels")
	static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lrb;"
	)
	static class461 field3781;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -317003185
	)
	static int field3784;
	@ObfuscatedName("fc")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field3785;
	@ObfuscatedName("aq")
	int[] field3771;
	@ObfuscatedName("ad")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("ag")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -140367159
	)
	public int field3783;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1570243249
	)
	@Export("gender")
	public int gender;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 984502449
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = -3664344773530448641L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		longValue = 7978463832893938461L
	)
	long field3778;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lgz;"
	)
	@Export("playerCompositionColorTextureOverrides")
	PlayerCompositionColorTextureOverride[] playerCompositionColorTextureOverrides;
	@ObfuscatedName("ai")
	boolean field3780;

	static {
		equipmentIndices = new int[]{class210.field2314.field2311, class210.field2307.field2311, class210.field2317.field2311, class210.field2312.field2311, class210.field2315.field2311, class210.field2320.field2311, class210.field2310.field2311};
		PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
		field3781 = new class461(16, class459.field4897);
		field3784 = 0;
	}

	public PlayerComposition() {
		this.field3783 = -1;
		this.gender = 0;
		this.field3780 = false;
	}

	@ObfuscatedSignature(
		descriptor = "(Lne;)V"
	)
	PlayerComposition(PlayerComposition var1) {
		this.field3783 = -1;
		this.gender = 0;
		this.field3780 = false;
		int[] var2 = Arrays.copyOf(var1.equipment, var1.equipment.length);
		int[] var3 = Arrays.copyOf(var1.field3771, var1.field3771.length);
		PlayerCompositionColorTextureOverride[] var4 = (PlayerCompositionColorTextureOverride[])(var1.playerCompositionColorTextureOverrides != null ? (PlayerCompositionColorTextureOverride[])Arrays.copyOf(var1.playerCompositionColorTextureOverrides, var1.playerCompositionColorTextureOverrides.length) : null);
		int[] var5 = Arrays.copyOf(var1.bodyColors, var1.bodyColors.length);
		this.method6572(var3, var2, var4, false, var5, var1.gender, var1.npcTransformId, var1.field3783);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([I[I[Lgz;Z[IIIIB)V",
		garbageValue = "0"
	)
	public void method6572(int[] var1, int[] var2, PlayerCompositionColorTextureOverride[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.playerCompositionColorTextureOverrides = var3;
		this.field3780 = var4;
		this.field3783 = var8;
		this.method6541(var1, var2, var5, var6, var7);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "([I[I[IIII)V",
		garbageValue = "1635546182"
	)
	public void method6541(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (var1 == null) {
			var1 = this.method6549(var4);
		}

		if (var2 == null) {
			var2 = this.method6549(var4);
		}

		this.field3771 = var1;
		this.equipment = var2;
		this.bodyColors = var3;
		this.gender = var4;
		this.npcTransformId = var5;
		this.setHash();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "192662519"
	)
	int[] method6549(int var1) {
		int[] var2 = new int[12];

		for (int var3 = 0; var3 < 7; ++var3) {
			class325.method6121(var1, var2, var3);
		}

		return var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1685912193"
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
						var3 = class333.KitDefinition_fileCount - 1;
					}
				} else {
					++var3;
					if (var3 >= class333.KitDefinition_fileCount) {
						var3 = 0;
					}
				}

				var4 = PcmPlayer.KitDefinition_get(var3);
			} while(var4 == null || var4.nonSelectable || var4.bodypartID != var1 + (this.gender == 1 ? 7 : 0));

			this.equipment[equipmentIndices[var1]] = var3 + 256;
			this.setHash();
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1899201076"
	)
	public void method6558(int var1, boolean var2) {
		int var3 = this.bodyColors[var1];
		if (!var2) {
			do {
				--var3;
				if (var3 < 0) {
					var3 = class105.field1371[var1].length - 1;
				}
			} while(!class4.method15(var1, var3));
		} else {
			do {
				++var3;
				if (var3 >= class105.field1371[var1].length) {
					var3 = 0;
				}
			} while(!class4.method15(var1, var3));
		}

		this.bodyColors[var1] = var3;
		this.setHash();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-771169671"
	)
	public void method6544(int var1) {
		if (this.gender != var1) {
			this.method6541((int[])null, (int[])null, this.bodyColors, var1, -1);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "942005621"
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1995277363"
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
		this.hash += (long)(this.gender * 1073281455) * -1570243249L;
		this.equipment[5] = var3;
		this.equipment[9] = var4;
		if (0L != var1 && this.hash != var1 || this.field3780) {
			PlayerAppearance_cachedModels.remove(var1);
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lii;ILii;II)Llv;",
		garbageValue = "626505664"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) {
			return class76.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4, (NpcOverrides)null);
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
					if (var11 >= 256 && var11 < 512) {
						KitDefinition var20 = PcmPlayer.KitDefinition_get(var11 - 256);
						if (var20 != null && !var20.ready()) {
							var9 = true;
						}
					}

					if (var11 >= 512 && !class164.ItemDefinition_get(var11 - 512).method3967(this.gender)) {
						var9 = true;
					}
				}

				if (var9) {
					if (this.field3778 != -1L) {
						var18 = (Model)PlayerAppearance_cachedModels.get(this.field3778);
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
						ModelData var15;
						if (var13 >= 256 && var13 < 512) {
							KitDefinition var14 = PcmPlayer.KitDefinition_get(var13 - 256);
							var15 = null;
							if (var14 != null) {
								var15 = var14.getModelData();
							}

							if (var15 != null) {
								var19[var11++] = var15;
							}
						}

						if (var13 >= 512) {
							ItemComposition var22 = class164.ItemDefinition_get(var13 - 512);
							var15 = var22.method3972(this.gender);
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

										if (var16.playerCompositionRetextureTo != null && var22.retextureFrom != null && var22.retextureTo.length == var16.playerCompositionRetextureTo.length) {
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

					ModelData var23 = new ModelData(var19, var11);

					for (var13 = 0; var13 < 5; ++var13) {
						if (this.bodyColors[var13] < class105.field1371[var13].length) {
							var23.recolor(class452.field4862[var13], class105.field1371[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < MouseRecorder.field1098[var13].length) {
							var23.recolor(FriendSystem.field829[var13], MouseRecorder.field1098[var13][this.bodyColors[var13]]);
						}
					}

					var18 = var23.toModel(64, 850, -30, -50, -30);
					PlayerAppearance_cachedModels.put(var18, var5);
					this.field3778 = var5;
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Lkr;",
		garbageValue = "98"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) {
			return class76.getNpcDefinition(this.npcTransformId).method3706((NpcOverrides)null);
		} else {
			boolean var1 = false;

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) {
				var3 = this.equipment[var2];
				if (var3 >= 256 && var3 < 512) {
					KitDefinition var9 = PcmPlayer.KitDefinition_get(var3 - 256);
					if (var9 != null && !var9.method3625()) {
						var1 = true;
					}
				}

				if (var3 >= 512 && !class164.ItemDefinition_get(var3 - 512).method3983(this.gender)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			} else {
				ModelData[] var8 = new ModelData[12];
				var3 = 0;

				int var5;
				for (int var4 = 0; var4 < 12; ++var4) {
					var5 = this.equipment[var4];
					if (var5 >= 256 && var5 < 512) {
						KitDefinition var6 = PcmPlayer.KitDefinition_get(var5 - 256);
						ModelData var7 = null;
						if (var6 != null) {
							var7 = var6.getKitDefinitionModels();
						}

						if (var7 != null) {
							var8[var3++] = var7;
						}
					}

					if (var5 >= 512) {
						ModelData var10 = class164.ItemDefinition_get(var5 - 512).method4014(this.gender);
						if (var10 != null) {
							var8[var3++] = var10;
						}
					}
				}

				ModelData var11 = new ModelData(var8, var3);

				for (var5 = 0; var5 < 5; ++var5) {
					if (this.bodyColors[var5] < class105.field1371[var5].length) {
						var11.recolor(class452.field4862[var5], class105.field1371[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < MouseRecorder.field1098[var5].length) {
						var11.recolor(FriendSystem.field829[var5], MouseRecorder.field1098[var5][this.bodyColors[var5]]);
					}
				}

				return var11;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-106"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		long var1 = this.hash;
		if (this.npcTransformId != -1) {
			var1 = -65536L | (long)this.npcTransformId;
		}

		Integer var3 = (Integer)field3781.method8418(var1);
		if (var3 == null) {
			var3 = ++field3784 - 1;
			field3781.method8419(var1, var3);
			field3784 %= 65535;
		}

		return var3;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2106894088"
	)
	void method6538() {
		this.method6541(this.field3771, this.equipment, this.bodyColors, this.gender, this.npcTransformId);
	}
}
