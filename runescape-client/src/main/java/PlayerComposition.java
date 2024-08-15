import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nt")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("PlayerAppearance_cachedModels")
	public static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lrz;"
	)
	public static class462 field3753;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1938952621
	)
	public static int field3755;
	@ObfuscatedName("ab")
	int[] field3742;
	@ObfuscatedName("ay")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("an")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1679952395
	)
	public int field3741;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1510071115
	)
	@Export("gender")
	public int gender;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1341181861
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = -5008107326758205095L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -6813510075488761279L
	)
	long field3745;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "[Lid;"
	)
	@Export("playerCompositionColorTextureOverrides")
	PlayerCompositionColorTextureOverride[] playerCompositionColorTextureOverrides;
	@ObfuscatedName("ad")
	boolean field3747;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1337168761
	)
	final int field3750;

	static {
		PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
		field3753 = new class462(16, class460.field4876);
		field3755 = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Lnt;)V"
	)
	PlayerComposition(PlayerComposition var1) {
		this.field3741 = -1;
		this.gender = 0;
		this.field3747 = false;
		this.field3750 = class546.field5371 < 224 ? 512 : 2048;
		int[] var2 = Arrays.copyOf(var1.equipment, var1.equipment.length);
		int[] var3 = Arrays.copyOf(var1.field3742, var1.field3742.length);
		PlayerCompositionColorTextureOverride[] var4 = (PlayerCompositionColorTextureOverride[])(var1.playerCompositionColorTextureOverrides != null ? (PlayerCompositionColorTextureOverride[])Arrays.copyOf(var1.playerCompositionColorTextureOverrides, var1.playerCompositionColorTextureOverrides.length) : null);
		int[] var5 = Arrays.copyOf(var1.bodyColors, var1.bodyColors.length);
		this.method6576(var3, var2, var4, false, var5, var1.gender, var1.npcTransformId, var1.field3741);
	}

	public PlayerComposition() {
		this.field3741 = -1;
		this.gender = 0;
		this.field3747 = false;
		this.field3750 = class546.field5371 < 224 ? 512 : 2048;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([I[I[Lid;Z[IIIII)V",
		garbageValue = "1644678246"
	)
	public void method6576(int[] var1, int[] var2, PlayerCompositionColorTextureOverride[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.playerCompositionColorTextureOverrides = var3;
		this.field3747 = var4;
		this.field3741 = var8;
		this.method6605(var1, var2, var5, var6, var7);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([I[I[IIII)V",
		garbageValue = "1653056405"
	)
	public void method6605(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (var1 == null) {
			var1 = this.method6578(var4);
		}

		if (var2 == null) {
			var2 = this.method6578(var4);
		}

		this.field3742 = var1;
		this.equipment = var2;
		this.bodyColors = var3;
		this.gender = var4;
		this.npcTransformId = var5;
		this.setHash();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "-1248861610"
	)
	int[] method6578(int var1) {
		int[] var2 = new int[12];

		for (int var3 = 0; var3 < 7; ++var3) {
			for (int var4 = 0; var4 < class211.KitDefinition_fileCount; ++var4) {
				KitDefinition var5 = ItemLayer.KitDefinition_get(var4);
				if (var5 != null && !var5.nonSelectable && var5.method4827(var3, var1)) {
					if (class249.field2636 == null) {
						class249.field2636 = new int[7];
						class249.field2636[class249.field2633.field2635] = class264.field2895.field2901;
						class249.field2636[class249.field2628.field2635] = class264.field2898.field2901;
						class249.field2636[class249.field2629.field2635] = class264.field2896.field2901;
						class249.field2636[class249.field2630.field2635] = class264.field2893.field2901;
						class249.field2636[class249.field2631.field2635] = class264.field2897.field2901;
						class249.field2636[class249.field2632.field2635] = class264.field2894.field2901;
						class249.field2636[class249.field2627.field2635] = class264.field2902.field2901;
					}

					int var7 = class249.field2636[var3];
					var2[var7] = var4 + 256;
					break;
				}
			}
		}

		return var2;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-839502089"
	)
	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
		int[] var3 = this.equipment;
		if (class249.field2636 == null) {
			class249.field2636 = new int[7];
			class249.field2636[class249.field2633.field2635] = class264.field2895.field2901;
			class249.field2636[class249.field2628.field2635] = class264.field2898.field2901;
			class249.field2636[class249.field2629.field2635] = class264.field2896.field2901;
			class249.field2636[class249.field2630.field2635] = class264.field2893.field2901;
			class249.field2636[class249.field2631.field2635] = class264.field2897.field2901;
			class249.field2636[class249.field2632.field2635] = class264.field2894.field2901;
			class249.field2636[class249.field2627.field2635] = class264.field2902.field2901;
		}

		int var4 = class249.field2636[var1];
		int var6 = var3[var4];
		if (var6 != 0) {
			var6 -= 256;

			KitDefinition var7;
			do {
				if (!var2) {
					--var6;
					if (var6 < 0) {
						var6 = class211.KitDefinition_fileCount - 1;
					}
				} else {
					++var6;
					if (var6 >= class211.KitDefinition_fileCount) {
						var6 = 0;
					}
				}

				var7 = ItemLayer.KitDefinition_get(var6);
			} while(var7 == null || var7.nonSelectable || !var7.method4827(var1, this.gender));

			int[] var10 = this.equipment;
			if (class249.field2636 == null) {
				class249.field2636 = new int[7];
				class249.field2636[class249.field2633.field2635] = class264.field2895.field2901;
				class249.field2636[class249.field2628.field2635] = class264.field2898.field2901;
				class249.field2636[class249.field2629.field2635] = class264.field2896.field2901;
				class249.field2636[class249.field2630.field2635] = class264.field2893.field2901;
				class249.field2636[class249.field2631.field2635] = class264.field2897.field2901;
				class249.field2636[class249.field2632.field2635] = class264.field2894.field2901;
				class249.field2636[class249.field2627.field2635] = class264.field2902.field2901;
			}

			int var8 = class249.field2636[var1];
			var10[var8] = var6 + 256;
			this.setHash();
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "87"
	)
	public void method6580(int var1, boolean var2) {
		int var3 = this.bodyColors[var1];
		boolean var4;
		if (!var2) {
			do {
				--var3;
				if (var3 < 0) {
					var3 = HorizontalAlignment.field2553[var1].length - 1;
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
				if (var3 >= HorizontalAlignment.field2553[var1].length) {
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "331745613"
	)
	public void method6581(int var1) {
		if (this.gender != var1) {
			this.method6605((int[])null, (int[])null, this.bodyColors, var1, -1);
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lvg;B)V",
		garbageValue = "42"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.gender);

		int var2;
		for (var2 = 0; var2 < 7; ++var2) {
			int[] var3 = this.equipment;
			if (class249.field2636 == null) {
				class249.field2636 = new int[7];
				class249.field2636[class249.field2633.field2635] = class264.field2895.field2901;
				class249.field2636[class249.field2628.field2635] = class264.field2898.field2901;
				class249.field2636[class249.field2629.field2635] = class264.field2896.field2901;
				class249.field2636[class249.field2630.field2635] = class264.field2893.field2901;
				class249.field2636[class249.field2631.field2635] = class264.field2897.field2901;
				class249.field2636[class249.field2632.field2635] = class264.field2894.field2901;
				class249.field2636[class249.field2627.field2635] = class264.field2902.field2901;
			}

			int var4 = class249.field2636[var2];
			int var6 = var3[var4];
			if (class546.field5371 >= 224) {
				if (var6 == 0) {
					var1.writeShort(-1);
				} else {
					var1.writeShort(var6 - 256);
				}
			} else if (var6 == 0) {
				var1.writeByte(-1);
			} else {
				var1.writeByte(var6 - 256);
			}
		}

		for (var2 = 0; var2 < 5; ++var2) {
			var1.writeByte(this.bodyColors[var2]);
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2095815575"
	)
	@Export("setHash")
	void setHash() {
		long var1 = this.hash;
		long[] var3 = Buffer.field5378;
		this.hash = -1L;

		int var4;
		for (var4 = 0; var4 < 12; ++var4) {
			this.hash = this.hash >>> 8 ^ var3[(int)((this.hash ^ (long)(this.equipment[var4] >> 24)) & 255L)];
			this.hash = this.hash >>> 8 ^ var3[(int)((this.hash ^ (long)(this.equipment[var4] >> 16)) & 255L)];
			this.hash = this.hash >>> 8 ^ var3[(int)((this.hash ^ (long)(this.equipment[var4] >> 8)) & 255L)];
			this.hash = this.hash >>> 8 ^ var3[(int)((this.hash ^ (long)this.equipment[var4]) & 255L)];
		}

		if (this.playerCompositionColorTextureOverrides != null) {
			for (var4 = 0; var4 < this.playerCompositionColorTextureOverrides.length; ++var4) {
				if (this.playerCompositionColorTextureOverrides[var4] != null) {
					int var5;
					if (this.playerCompositionColorTextureOverrides[var4].playerCompositionRecolorTo != null) {
						for (var5 = 0; var5 < this.playerCompositionColorTextureOverrides[var4].playerCompositionRecolorTo.length; ++var5) {
							this.hash = this.hash >>> 8 ^ var3[(int)((this.hash ^ (long)(this.playerCompositionColorTextureOverrides[var4].playerCompositionRecolorTo[var5] >> 8)) & 255L)];
							this.hash = this.hash >>> 8 ^ var3[(int)((this.hash ^ (long)this.playerCompositionColorTextureOverrides[var4].playerCompositionRecolorTo[var5]) & 255L)];
						}
					}

					if (this.playerCompositionColorTextureOverrides[var4].playerCompositionRetextureTo != null) {
						for (var5 = 0; var5 < this.playerCompositionColorTextureOverrides[var4].playerCompositionRetextureTo.length; ++var5) {
							this.hash = this.hash >>> 8 ^ var3[(int)((this.hash ^ (long)(this.playerCompositionColorTextureOverrides[var4].playerCompositionRetextureTo[var5] >> 8)) & 255L)];
							this.hash = this.hash >>> 8 ^ var3[(int)((this.hash ^ (long)this.playerCompositionColorTextureOverrides[var4].playerCompositionRetextureTo[var5]) & 255L)];
						}
					}
				}
			}
		}

		for (var4 = 0; var4 < 5; ++var4) {
			this.hash = this.hash >>> 8 ^ var3[(int)((this.hash ^ (long)this.bodyColors[var4]) & 255L)];
		}

		this.hash = this.hash >>> 8 ^ var3[(int)((this.hash ^ (long)this.gender) & 255L)];
		if (var1 != 0L && var1 != this.hash || this.field3747) {
			PlayerAppearance_cachedModels.remove(var1);
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lkr;ILkr;II)Lhr;",
		garbageValue = "-1325536999"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) {
			return UserComparator8.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4, (NpcOverrides)null);
		} else {
			long var5 = this.hash;
			int[] var7 = this.equipment;
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) {
				var7 = new int[12];
				System.arraycopy(this.equipment, 0, var7, 0, var7.length);
				if (var1.shield >= 0) {
					var5 ^= (long)(var1.shield - this.equipment[class264.field2892.field2901]) << 40;
					var7[class264.field2892.field2901] = this.method6595(var1.shield);
				}

				if (var1.weapon >= 0) {
					var5 ^= (long)(var1.weapon - this.equipment[class264.field2890.field2901]) << 48;
					var7[class264.field2890.field2901] = this.method6595(var1.weapon);
				}
			}

			Model var8 = (Model)PlayerAppearance_cachedModels.get(var5);
			if (var8 == null) {
				boolean var9 = false;

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) {
					var11 = var7[var10];
					if (this.method6591(var11)) {
						KitDefinition var19 = this.method6592(var11);
						if (var19 != null && !var19.ready()) {
							var9 = true;
						}
					}

					if (this.method6593(var11) && !this.method6575(var11).method5173(this.gender)) {
						var9 = true;
					}
				}

				if (var9) {
					if (-1L != this.field3745) {
						var8 = (Model)PlayerAppearance_cachedModels.get(this.field3745);
					}

					if (var8 == null) {
						return null;
					}
				}

				if (var8 == null) {
					ModelData[] var18 = new ModelData[12];
					var11 = 0;

					int var13;
					for (int var12 = 0; var12 < 12; ++var12) {
						var13 = var7[var12];
						ModelData var15;
						if (this.method6591(var13)) {
							KitDefinition var14 = this.method6592(var13);
							var15 = null;
							if (var14 != null) {
								var15 = var14.getModelData();
							}

							if (var15 != null) {
								var18[var11++] = var15;
							}
						}

						if (this.method6593(var13)) {
							ItemComposition var21 = this.method6575(var13);
							var15 = var21.method5174(this.gender);
							if (var15 != null) {
								if (this.playerCompositionColorTextureOverrides != null) {
									PlayerCompositionColorTextureOverride var16 = this.playerCompositionColorTextureOverrides[var12];
									if (var16 != null) {
										int var17;
										if (var16.playerCompositionRecolorTo != null && var21.recolorFrom != null && var21.recolorTo.length == var16.playerCompositionRecolorTo.length) {
											for (var17 = 0; var17 < var21.recolorFrom.length; ++var17) {
												var15.recolor(var21.recolorTo[var17], var16.playerCompositionRecolorTo[var17]);
											}
										}

										if (var16.playerCompositionRetextureTo != null && var21.retextureFrom != null && var21.retextureTo.length == var16.playerCompositionRetextureTo.length) {
											for (var17 = 0; var17 < var21.retextureFrom.length; ++var17) {
												var15.retexture(var21.retextureTo[var17], var16.playerCompositionRetextureTo[var17]);
											}
										}
									}
								}

								var18[var11++] = var15;
							}
						}
					}

					ModelData var22 = new ModelData(var18, var11);

					for (var13 = 0; var13 < 5; ++var13) {
						if (this.bodyColors[var13] < HorizontalAlignment.field2553[var13].length) {
							var22.recolor(AbstractRasterProvider.field5460[var13], HorizontalAlignment.field2553[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < class109.field1390[var13].length) {
							var22.recolor(class499.field5063[var13], class109.field1390[var13][this.bodyColors[var13]]);
						}
					}

					var8 = var22.toModel(64, 850, -30, -50, -30);
					PlayerAppearance_cachedModels.put(var8, var5);
					this.field3745 = var5;
				}
			}

			Model var20;
			if (var1 == null && var3 == null) {
				var20 = var8.toSharedSequenceModel(true);
			} else if (var1 != null && var3 != null) {
				var20 = var1.applyTransformations(var8, var2, var3, var4);
			} else if (var1 != null) {
				var20 = var1.transformActorModel(var8, var2);
			} else {
				var20 = var3.transformActorModel(var8, var4);
			}

			return var20;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)Lgm;",
		garbageValue = "-1982467986"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) {
			return UserComparator8.getNpcDefinition(this.npcTransformId).method4917((NpcOverrides)null);
		} else {
			boolean var1 = false;

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) {
				var3 = this.equipment[var2];
				if (this.method6591(var3)) {
					KitDefinition var9 = this.method6592(var3);
					if (var9 != null && !var9.method4839()) {
						var1 = true;
					}
				}

				if (this.method6593(var3) && !this.method6575(var3).method5227(this.gender)) {
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
					if (this.method6591(var5)) {
						KitDefinition var6 = this.method6592(var5);
						ModelData var7 = null;
						if (var6 != null) {
							var7 = var6.getKitDefinitionModels();
						}

						if (var7 != null) {
							var8[var3++] = var7;
						}
					}

					if (this.method6593(var5)) {
						ModelData var10 = this.method6575(var5).method5176(this.gender);
						if (var10 != null) {
							var8[var3++] = var10;
						}
					}
				}

				ModelData var11 = new ModelData(var8, var3);

				for (var5 = 0; var5 < 5; ++var5) {
					if (this.bodyColors[var5] < HorizontalAlignment.field2553[var5].length) {
						var11.recolor(AbstractRasterProvider.field5460[var5], HorizontalAlignment.field2553[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < class109.field1390[var5].length) {
						var11.recolor(class499.field5063[var5], class109.field1390[var5][this.bodyColors[var5]]);
					}
				}

				return var11;
			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "484382774"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		long var1 = this.hash;
		if (this.npcTransformId != -1) {
			var1 = -65536L | (long)this.npcTransformId;
		}

		Integer var3 = (Integer)field3753.method8501(var1);
		if (var3 == null) {
			var3 = ++field3755 - 1;
			field3753.method8499(var1, var3);
			field3755 %= 65535;
		}

		return var3;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-84"
	)
	void method6586() {
		this.method6605(this.field3742, this.equipment, this.bodyColors, this.gender, this.npcTransformId);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "-30194"
	)
	public void method6587(int var1, int var2) {
		boolean var3 = var2 != this.gender;
		this.gender = var2;
		if (var3) {
			int var4;
			int var5;
			if (this.gender == var1) {
				for (var4 = 0; var4 < 7; ++var4) {
					if (class249.field2636 == null) {
						class249.field2636 = new int[7];
						class249.field2636[class249.field2633.field2635] = class264.field2895.field2901;
						class249.field2636[class249.field2628.field2635] = class264.field2898.field2901;
						class249.field2636[class249.field2629.field2635] = class264.field2896.field2901;
						class249.field2636[class249.field2630.field2635] = class264.field2893.field2901;
						class249.field2636[class249.field2631.field2635] = class264.field2897.field2901;
						class249.field2636[class249.field2632.field2635] = class264.field2894.field2901;
						class249.field2636[class249.field2627.field2635] = class264.field2902.field2901;
					}

					var5 = class249.field2636[var4];
					if (this.equipment[var5] > 0 && this.equipment[var5] < this.field3750) {
						this.equipment[var5] = this.field3742[var5];
					}
				}
			} else {
				if (this.equipment[0] < this.field3750 || this.method6588()) {
					this.equipment[class264.field2898.field2901] = 1;
				}

				for (var4 = 0; var4 < 7; ++var4) {
					if (class249.field2636 == null) {
						class249.field2636 = new int[7];
						class249.field2636[class249.field2633.field2635] = class264.field2895.field2901;
						class249.field2636[class249.field2628.field2635] = class264.field2898.field2901;
						class249.field2636[class249.field2629.field2635] = class264.field2896.field2901;
						class249.field2636[class249.field2630.field2635] = class264.field2893.field2901;
						class249.field2636[class249.field2631.field2635] = class264.field2897.field2901;
						class249.field2636[class249.field2632.field2635] = class264.field2894.field2901;
						class249.field2636[class249.field2627.field2635] = class264.field2902.field2901;
					}

					var5 = class249.field2636[var4];
					if (this.equipment[var5] > 0 && this.equipment[var5] < this.field3750) {
						int[] var8 = this.equipment;

						for (int var9 = 0; var9 < class211.KitDefinition_fileCount; ++var9) {
							KitDefinition var10 = ItemLayer.KitDefinition_get(var9);
							if (var10 != null && !var10.nonSelectable && var10.method4827(var4, var2)) {
								if (class249.field2636 == null) {
									class249.field2636 = new int[7];
									class249.field2636[class249.field2633.field2635] = class264.field2895.field2901;
									class249.field2636[class249.field2628.field2635] = class264.field2898.field2901;
									class249.field2636[class249.field2629.field2635] = class264.field2896.field2901;
									class249.field2636[class249.field2630.field2635] = class264.field2893.field2901;
									class249.field2636[class249.field2631.field2635] = class264.field2897.field2901;
									class249.field2636[class249.field2632.field2635] = class264.field2894.field2901;
									class249.field2636[class249.field2627.field2635] = class264.field2902.field2901;
								}

								int var12 = class249.field2636[var4];
								var8[var12] = var9 + 256;
								break;
							}
						}
					}
				}
			}
		}

		this.method6586();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-50"
	)
	boolean method6588() {
		if (!this.method6593(this.equipment[0])) {
			return false;
		} else {
			ItemComposition var1 = this.method6575(this.equipment[0]);
			return var1.maleModel1 != class264.field2898.field2901 && var1.maleModel2 != class264.field2898.field2901;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1967131783"
	)
	public void method6589(int var1, int var2) {
		this.bodyColors[var1] = var2;
		this.method6586();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1522250419"
	)
	public void method6590(int var1) {
		ItemComposition var2 = Player.ItemDefinition_get(var1);
		this.equipment[var2.maleModel] = this.field3750 + var1;
		if (var2.maleModel1 != -1) {
			this.equipment[var2.maleModel1] = 0;
		}

		if (var2.maleModel2 != -1) {
			this.equipment[var2.maleModel2] = 0;
		}

		this.method6586();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1357923970"
	)
	boolean method6591(int var1) {
		return var1 >= 256 && var1 < this.field3750;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Ljr;",
		garbageValue = "-821076658"
	)
	KitDefinition method6592(int var1) {
		return ItemLayer.KitDefinition_get(var1 - 256);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1906742487"
	)
	boolean method6593(int var1) {
		return var1 >= this.field3750;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)Lkm;",
		garbageValue = "1025359026"
	)
	ItemComposition method6575(int var1) {
		return Player.ItemDefinition_get(var1 - this.field3750);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2032116280"
	)
	int method6595(int var1) {
		return var1 - 512 + this.field3750;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILdp;ZI)I",
		garbageValue = "296306602"
	)
	static int method6628(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) {
				var7 = var2 ? class238.scriptDotWidget : class428.scriptActiveWidget;
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (var4 >= 1 && var4 <= 10) {
					class105 var8 = new class105(var4, var7.id, var7.childIndex, var7.itemId);
					Interpreter.field862.add(var8);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) {
				Interpreter.Interpreter_intStackSize -= 3;
				int var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
				if (var5 >= 1 && var5 <= 10) {
					class105 var6 = new class105(var5, var3, var4, FloorUnderlayDefinition.widgetDefinition.method6544(var3).itemId);
					Interpreter.field862.add(var6);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (Interpreter.field863 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var7 = FloorUnderlayDefinition.widgetDefinition.method6544(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
			} else {
				var7 = var2 ? class238.scriptDotWidget : class428.scriptActiveWidget;
			}

			if (var7.onResize == null) {
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent();
				var9.widget = var7;
				var9.args = var7.onResize;
				var9.field1066 = Interpreter.field863 + 1;
				Client.scriptEvents.addFirst(var9);
				return 1;
			}
		}
	}
}
