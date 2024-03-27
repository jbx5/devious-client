import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nq")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("ai")
	public static short[] field3682;
	@ObfuscatedName("ar")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("PlayerAppearance_cachedModels")
	public static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lrt;"
	)
	public static class443 field3691;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -2112554485
	)
	public static int field3688;
	@ObfuscatedName("az")
	int[] field3695;
	@ObfuscatedName("ah")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("af")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1320896867
	)
	public int field3685;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1990618721
	)
	@Export("gender")
	public int gender;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -196311875
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 2846450048819873737L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = -4831100458946757933L
	)
	long field3689;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "[Lhv;"
	)
	@Export("playerCompositionColorTextureOverrides")
	PlayerCompositionColorTextureOverride[] playerCompositionColorTextureOverrides;
	@ObfuscatedName("al")
	boolean field3687;

	static {
		equipmentIndices = new int[]{class225.field2404.field2415, class225.field2407.field2415, class225.field2409.field2415, class225.field2401.field2415, class225.field2410.field2415, class225.field2408.field2415, class225.field2411.field2415};
		PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
		field3691 = new class443(16, class441.field4748);
		field3688 = 0;
	}

	public PlayerComposition() {
		this.field3685 = -1;
		this.gender = 0;
		this.field3687 = false;
	}

	@ObfuscatedSignature(
		descriptor = "(Lnq;)V"
	)
	PlayerComposition(PlayerComposition var1) {
		this.field3685 = -1;
		this.gender = 0;
		this.field3687 = false;
		int[] var2 = Arrays.copyOf(var1.equipment, var1.equipment.length);
		int[] var3 = Arrays.copyOf(var1.field3695, var1.field3695.length);
		PlayerCompositionColorTextureOverride[] var4 = (PlayerCompositionColorTextureOverride[])(var1.playerCompositionColorTextureOverrides != null ? (PlayerCompositionColorTextureOverride[])Arrays.copyOf(var1.playerCompositionColorTextureOverrides, var1.playerCompositionColorTextureOverrides.length) : null);
		int[] var5 = Arrays.copyOf(var1.bodyColors, var1.bodyColors.length);
		this.method6321(var3, var2, var4, false, var5, var1.gender, var1.npcTransformId, var1.field3685);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([I[I[Lhv;Z[IIIII)V",
		garbageValue = "1919445139"
	)
	public void method6321(int[] var1, int[] var2, PlayerCompositionColorTextureOverride[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.playerCompositionColorTextureOverrides = var3;
		this.field3687 = var4;
		this.field3685 = var8;
		this.method6322(var1, var2, var5, var6, var7);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([I[I[IIIB)V",
		garbageValue = "-127"
	)
	public void method6322(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (var1 == null) {
			var1 = this.method6327(var4);
		}

		if (var2 == null) {
			var2 = this.method6327(var4);
		}

		this.field3695 = var1;
		this.equipment = var2;
		this.bodyColors = var3;
		this.gender = var4;
		this.npcTransformId = var5;
		this.setHash();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)[I",
		garbageValue = "0"
	)
	int[] method6327(int var1) {
		int[] var2 = new int[12];

		for (int var3 = 0; var3 < 7; ++var3) {
			HitSplatDefinition.method4073(var1, var2, var3);
		}

		return var2;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "-14"
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
						var3 = SecureRandomSSLSocket.KitDefinition_fileCount - 1;
					}
				} else {
					++var3;
					if (var3 >= SecureRandomSSLSocket.KitDefinition_fileCount) {
						var3 = 0;
					}
				}

				var4 = class195.KitDefinition_get(var3);
			} while(var4 == null || var4.nonSelectable || var1 + (this.gender == 1 ? 7 : 0) != var4.bodypartID);

			this.equipment[equipmentIndices[var1]] = var3 + 256;
			this.setHash();
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "2063718045"
	)
	public void method6325(int var1, boolean var2) {
		int var3 = this.bodyColors[var1];
		boolean var4;
		if (!var2) {
			do {
				--var3;
				if (var3 < 0) {
					var3 = UrlRequester.field1454[var1].length - 1;
				}

				if (var1 == 4 && var3 >= 8) {
					var4 = false;
				} else {
					var4 = true;
				}
			} while(!var4);
		} else {
			do {
				++var3;
				if (var3 >= UrlRequester.field1454[var1].length) {
					var3 = 0;
				}

				if (var1 == 4 && var3 >= 8) {
					var4 = false;
				} else {
					var4 = true;
				}
			} while(!var4);
		}

		this.bodyColors[var1] = var3;
		this.setHash();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "880079772"
	)
	public void method6326(int var1) {
		if (this.gender != var1) {
			this.method6322((int[])null, (int[])null, this.bodyColors, var1, -1);
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lur;B)V",
		garbageValue = "65"
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1818181200"
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
		this.hash += (long)(this.gender * 1435153825) * 1990618721L;
		this.equipment[5] = var3;
		this.equipment[9] = var4;
		if (var1 != 0L && var1 != this.hash || this.field3687) {
			PlayerAppearance_cachedModels.remove(var1);
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lig;ILig;II)Ljn;",
		garbageValue = "1553363278"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) {
			return UserComparator10.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4, (NpcOverrides)null);
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
						KitDefinition var20 = class195.KitDefinition_get(var11 - 256);
						if (var20 != null && !var20.ready()) {
							var9 = true;
						}
					}

					if (var11 >= 512 && !HttpRequest.ItemDefinition_get(var11 - 512).method4141(this.gender)) {
						var9 = true;
					}
				}

				if (var9) {
					if (-1L != this.field3689) {
						var18 = (Model)PlayerAppearance_cachedModels.get(this.field3689);
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
							KitDefinition var14 = class195.KitDefinition_get(var13 - 256);
							var15 = null;
							if (var14 != null) {
								var15 = var14.getModelData();
							}

							if (var15 != null) {
								var19[var11++] = var15;
							}
						}

						if (var13 >= 512) {
							ItemComposition var22 = HttpRequest.ItemDefinition_get(var13 - 512);
							var15 = var22.method4142(this.gender);
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

					ModelData var23 = new ModelData(var19, var11);

					for (var13 = 0; var13 < 5; ++var13) {
						if (this.bodyColors[var13] < UrlRequester.field1454[var13].length) {
							var23.recolor(class172.field1858[var13], UrlRequester.field1454[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < class1.field6[var13].length) {
							var23.recolor(field3682[var13], class1.field6[var13][this.bodyColors[var13]]);
						}
					}

					var18 = var23.toModel(64, 850, -30, -50, -30);
					PlayerAppearance_cachedModels.put(var18, var5);
					this.field3689 = var5;
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljj;",
		garbageValue = "-2059098099"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) {
			return UserComparator10.getNpcDefinition(this.npcTransformId).method3864((NpcOverrides)null);
		} else {
			boolean var1 = false;

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) {
				var3 = this.equipment[var2];
				if (var3 >= 256 && var3 < 512) {
					KitDefinition var9 = class195.KitDefinition_get(var3 - 256);
					if (var9 != null && !var9.method3780()) {
						var1 = true;
					}
				}

				if (var3 >= 512 && !HttpRequest.ItemDefinition_get(var3 - 512).method4143(this.gender)) {
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
						KitDefinition var6 = class195.KitDefinition_get(var5 - 256);
						ModelData var7 = null;
						if (var6 != null) {
							var7 = var6.getKitDefinitionModels();
						}

						if (var7 != null) {
							var8[var3++] = var7;
						}
					}

					if (var5 >= 512) {
						ModelData var10 = HttpRequest.ItemDefinition_get(var5 - 512).method4162(this.gender);
						if (var10 != null) {
							var8[var3++] = var10;
						}
					}
				}

				ModelData var11 = new ModelData(var8, var3);

				for (var5 = 0; var5 < 5; ++var5) {
					if (this.bodyColors[var5] < UrlRequester.field1454[var5].length) {
						var11.recolor(class172.field1858[var5], UrlRequester.field1454[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < class1.field6[var5].length) {
						var11.recolor(field3682[var5], class1.field6[var5][this.bodyColors[var5]]);
					}
				}

				return var11;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1594754470"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		long var1 = this.hash;
		if (this.npcTransformId != -1) {
			var1 = -65536L | (long)this.npcTransformId;
		}

		Integer var3 = (Integer)field3691.method8015(var1);
		if (var3 == null) {
			var3 = ++field3688 - 1;
			field3691.method8008(var1, var3);
			field3688 %= 65535;
		}

		return var3;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-561820634"
	)
	void method6332() {
		this.method6322(this.field3695, this.equipment, this.bodyColors, this.gender, this.npcTransformId);
	}
}
