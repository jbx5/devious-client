import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nt")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("ae")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("PlayerAppearance_cachedModels")
	public static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	public static class460 field3758;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 565502609
	)
	public static int field3766;
	@ObfuscatedName("kf")
	@ObfuscatedGetter(
		intValue = -1994887817
	)
	@Export("cameraX")
	static int cameraX;
	@ObfuscatedName("ak")
	int[] field3762;
	@ObfuscatedName("al")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("aj")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1894865247
	)
	public int field3757;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 340358925
	)
	@Export("gender")
	public int gender;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1800504253
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = -1246912684082648107L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = 8795388253495121875L
	)
	long field3761;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lha;"
	)
	@Export("playerCompositionColorTextureOverrides")
	PlayerCompositionColorTextureOverride[] playerCompositionColorTextureOverrides;
	@ObfuscatedName("ao")
	boolean field3754;

	static {
		equipmentIndices = new int[]{class227.field2443.field2449, class227.field2446.field2449, class227.field2447.field2449, class227.field2441.field2449, class227.field2444.field2449, class227.field2442.field2449, class227.field2445.field2449};
		PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
		field3758 = new class460(16, class458.field4877);
		field3766 = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Lnt;)V"
	)
	PlayerComposition(PlayerComposition var1) {
		this.field3757 = -1;
		this.gender = 0;
		this.field3754 = false;
		int[] var2 = Arrays.copyOf(var1.equipment, var1.equipment.length);
		int[] var3 = Arrays.copyOf(var1.field3762, var1.field3762.length);
		PlayerCompositionColorTextureOverride[] var4 = (PlayerCompositionColorTextureOverride[])(var1.playerCompositionColorTextureOverrides != null ? (PlayerCompositionColorTextureOverride[])Arrays.copyOf(var1.playerCompositionColorTextureOverrides, var1.playerCompositionColorTextureOverrides.length) : null);
		int[] var5 = Arrays.copyOf(var1.bodyColors, var1.bodyColors.length);
		this.method6597(var3, var2, var4, false, var5, var1.gender, var1.npcTransformId, var1.field3757);
	}

	public PlayerComposition() {
		this.field3757 = -1;
		this.gender = 0;
		this.field3754 = false;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([I[I[Lha;Z[IIIII)V",
		garbageValue = "1716129592"
	)
	public void method6597(int[] var1, int[] var2, PlayerCompositionColorTextureOverride[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.playerCompositionColorTextureOverrides = var3;
		this.field3754 = var4;
		this.field3757 = var8;
		this.method6566(var1, var2, var5, var6, var7);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([I[I[IIII)V",
		garbageValue = "-1648659338"
	)
	public void method6566(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (var1 == null) {
			var1 = this.method6567(var4);
		}

		if (var2 == null) {
			var2 = this.method6567(var4);
		}

		this.field3762 = var1;
		this.equipment = var2;
		this.bodyColors = var3;
		this.gender = var4;
		this.npcTransformId = var5;
		this.setHash();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "1153713370"
	)
	int[] method6567(int var1) {
		int[] var2 = new int[12];

		for (int var3 = 0; var3 < 7; ++var3) {
			for (int var4 = 0; var4 < class420.KitDefinition_fileCount; ++var4) {
				KitDefinition var5 = class140.KitDefinition_get(var4);
				if (var5 != null && !var5.nonSelectable && var5.bodypartID == (var1 == 1 ? 7 : 0) + var3) {
					var2[equipmentIndices[var3]] = var4 + 256;
					break;
				}
			}
		}

		return var2;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "2094078353"
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
						var3 = class420.KitDefinition_fileCount - 1;
					}
				} else {
					++var3;
					if (var3 >= class420.KitDefinition_fileCount) {
						var3 = 0;
					}
				}

				var4 = class140.KitDefinition_get(var3);
			} while(var4 == null || var4.nonSelectable || (this.gender == 1 ? 7 : 0) + var1 != var4.bodypartID);

			this.equipment[equipmentIndices[var1]] = var3 + 256;
			this.setHash();
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "867227834"
	)
	public void method6569(int var1, boolean var2) {
		int var3 = this.bodyColors[var1];
		if (!var2) {
			do {
				--var3;
				if (var3 < 0) {
					var3 = AddRequestTask.field4780[var1].length - 1;
				}
			} while(!Canvas.method309(var1, var3));
		} else {
			do {
				++var3;
				if (var3 >= AddRequestTask.field4780[var1].length) {
					var3 = 0;
				}
			} while(!Canvas.method309(var1, var3));
		}

		this.bodyColors[var1] = var3;
		this.setHash();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "19"
	)
	public void method6570(int var1) {
		if (this.gender != var1) {
			this.method6566((int[])null, (int[])null, this.bodyColors, var1, -1);
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lua;B)V",
		garbageValue = "1"
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
		garbageValue = "131947725"
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
		this.hash += (long)(this.gender * 437006277) * 340358925L;
		this.equipment[5] = var3;
		this.equipment[9] = var4;
		if (0L != var1 && this.hash != var1 || this.field3754) {
			PlayerAppearance_cachedModels.remove(var1);
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lic;ILic;IB)Lkb;",
		garbageValue = "-120"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) {
			return class134.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4, (NpcOverrides)null);
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
						KitDefinition var20 = class140.KitDefinition_get(var11 - 256);
						if (var20 != null && !var20.ready()) {
							var9 = true;
						}
					}

					if (var11 >= 512 && !KeyHandler.ItemDefinition_get(var11 - 512).method4261(this.gender)) {
						var9 = true;
					}
				}

				if (var9) {
					if (-1L != this.field3761) {
						var18 = (Model)PlayerAppearance_cachedModels.get(this.field3761);
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
							KitDefinition var14 = class140.KitDefinition_get(var13 - 256);
							var15 = null;
							if (var14 != null) {
								var15 = var14.getModelData();
							}

							if (var15 != null) {
								var19[var11++] = var15;
							}
						}

						if (var13 >= 512) {
							ItemComposition var22 = KeyHandler.ItemDefinition_get(var13 - 512);
							var15 = var22.method4298(this.gender);
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
						if (this.bodyColors[var13] < AddRequestTask.field4780[var13].length) {
							var23.recolor(PcmPlayer.field294[var13], AddRequestTask.field4780[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < CollisionMap.field2491[var13].length) {
							var23.recolor(GrandExchangeOfferOwnWorldComparator.field494[var13], CollisionMap.field2491[var13][this.bodyColors[var13]]);
						}
					}

					var18 = var23.toModel(64, 850, -30, -50, -30);
					PlayerAppearance_cachedModels.put(var18, var5);
					this.field3761 = var5;
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Ljb;",
		garbageValue = "-503255243"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) {
			return class134.getNpcDefinition(this.npcTransformId).method3967((NpcOverrides)null);
		} else {
			boolean var1 = false;

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) {
				var3 = this.equipment[var2];
				if (var3 >= 256 && var3 < 512) {
					KitDefinition var9 = class140.KitDefinition_get(var3 - 256);
					if (var9 != null && !var9.method3874()) {
						var1 = true;
					}
				}

				if (var3 >= 512 && !KeyHandler.ItemDefinition_get(var3 - 512).method4244(this.gender)) {
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
						KitDefinition var6 = class140.KitDefinition_get(var5 - 256);
						ModelData var7 = null;
						if (var6 != null) {
							var7 = var6.getKitDefinitionModels();
						}

						if (var7 != null) {
							var8[var3++] = var7;
						}
					}

					if (var5 >= 512) {
						ModelData var10 = KeyHandler.ItemDefinition_get(var5 - 512).method4245(this.gender);
						if (var10 != null) {
							var8[var3++] = var10;
						}
					}
				}

				ModelData var11 = new ModelData(var8, var3);

				for (var5 = 0; var5 < 5; ++var5) {
					if (this.bodyColors[var5] < AddRequestTask.field4780[var5].length) {
						var11.recolor(PcmPlayer.field294[var5], AddRequestTask.field4780[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < CollisionMap.field2491[var5].length) {
						var11.recolor(GrandExchangeOfferOwnWorldComparator.field494[var5], CollisionMap.field2491[var5][this.bodyColors[var5]]);
					}
				}

				return var11;
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2001122653"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		long var1 = this.hash;
		if (this.npcTransformId != -1) {
			var1 = -65536L | (long)this.npcTransformId;
		}

		Integer var3 = (Integer)field3758.method8483(var1);
		if (var3 == null) {
			var3 = ++field3766 - 1;
			field3758.method8488(var1, var3);
			field3766 %= 65535;
		}

		return var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "323087812"
	)
	void method6576() {
		this.method6566(this.field3762, this.equipment, this.bodyColors, this.gender, this.npcTransformId);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "0"
	)
	public static int method6565(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ILnb;IIIII[FI)Lnb;",
		garbageValue = "-627461262"
	)
	static Widget method6580(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget();
		var8.type = var0;
		var8.parentId = var1.id;
		var8.childIndex = var2;
		var8.isIf3 = true;
		var8.xAlignment = var3;
		var8.yAlignment = var4;
		var8.widthAlignment = var5;
		var8.heightAlignment = var6;
		var8.rawX = (int)((float)var1.width * var7[0]);
		var8.rawY = (int)(var7[1] * (float)var1.height);
		var8.rawWidth = (int)((float)var1.width * var7[2]);
		var8.rawHeight = (int)((float)var1.height * var7[3]);
		return var8;
	}

	@ObfuscatedName("jb")
	@ObfuscatedSignature(
		descriptor = "(Ldt;Ldh;I)V",
		garbageValue = "1243672315"
	)
	static final void method6613(class101 var0, Actor var1) {
		int var3;
		int var4;
		int var5;
		if (var1.field1219 != -1) {
			Object var2 = null;
			var3 = 65536;
			if (var1.field1219 < var3) {
				var2 = var0.field1343[var1.field1219];
			} else {
				var2 = var0.field1341[var1.field1219 - var3];
			}

			if (var2 != null) {
				var4 = var1.x - ((Actor)var2).x;
				var5 = var1.y - ((Actor)var2).y;
				if (var4 != 0 || var5 != 0) {
					var1.field1282 = class182.method3653(var4, var5);
				}
			} else if (var1.field1240) {
				var1.field1219 = -1;
				var1.field1240 = false;
			}
		}

		int var8;
		if (var1.field1274 == 0 || var1.field1278 > 0) {
			var8 = -1;
			if (var1.field1242 != -1 && var1.field1243 != -1) {
				var3 = var1.field1242 * 128 - class358.scene.field1337 * 128 + 64;
				var4 = var1.field1243 * 128 - class358.scene.field1333 * 128 + 64;
				var5 = var1.x - var3;
				int var6 = var1.y - var4;
				if (var5 != 0 || var6 != 0) {
					var8 = class182.method3653(var5, var6);
				}
			} else if (var1.field1204 != -1) {
				var8 = var1.field1204;
			}

			if (var8 != -1) {
				var1.field1282 = var8;
				if (var1.field1244) {
					var1.field1209 = var1.field1282;
				}
			}

			var1.method2447();
		}

		var8 = var1.field1282 - var1.field1209 & 2047;
		if (var8 != 0) {
			boolean var9 = true;
			boolean var10 = true;
			++var1.field1272;
			var5 = var8 > 1024 ? -1 : 1;
			var1.field1209 += var5 * var1.field1238;
			boolean var11 = true;
			if (var8 < var1.field1238 || var8 > 2048 - var1.field1238) {
				var1.field1209 = var1.field1282;
				var11 = false;
			}

			if (var1.field1238 > 0 && var1.idleSequence == var1.field1245 && (var1.field1272 > 25 || var11)) {
				if (var5 == -1 && var1.field1241 != -1) {
					var1.field1245 = var1.field1241;
				} else if (var5 == 1 && var1.field1212 != -1) {
					var1.field1245 = var1.field1212;
				} else {
					var1.field1245 = var1.field1213;
				}
			}

			var1.field1209 &= 2047;
		} else {
			if (var1.field1240) {
				var1.field1219 = -1;
				var1.field1240 = false;
			}

			var1.field1272 = 0;
		}

	}
}
