import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mt")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("al")
	public static short[] field3578;
	@ObfuscatedName("an")
	public static short[][] field3586;
	@ObfuscatedName("ar")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("PlayerAppearance_cachedModels")
	public static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	static class423 field3582;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1525916171
	)
	static int field3583;
	@ObfuscatedName("au")
	int[] field3584;
	@ObfuscatedName("ae")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("ao")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -34466909
	)
	public int field3574;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1305081315
	)
	@Export("gender")
	public int gender;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1253753061
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = -4990962188091480033L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = 8032241556888834061L
	)
	long field3575;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[Lho;"
	)
	@Export("playerCompositionColorTextureOverrides")
	PlayerCompositionColorTextureOverride[] playerCompositionColorTextureOverrides;
	@ObfuscatedName("af")
	boolean field3577;

	static {
		equipmentIndices = new int[]{class209.field2335.field2334, class209.field2339.field2334, class209.field2332.field2334, class209.field2328.field2334, class209.field2342.field2334, class209.field2330.field2334, class209.field2338.field2334};
		PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
		field3582 = new class423(16, class421.field4606);
		field3583 = 0;
	}

	public PlayerComposition() {
		this.field3574 = -1;
		this.gender = 0;
		this.field3577 = false;
	}

	@ObfuscatedSignature(
		descriptor = "(Lmt;)V"
	)
	PlayerComposition(PlayerComposition var1) {
		this.field3574 = -1;
		this.gender = 0;
		this.field3577 = false;
		int[] var2 = Arrays.copyOf(var1.equipment, var1.equipment.length);
		int[] var3 = Arrays.copyOf(var1.field3584, var1.field3584.length);
		PlayerCompositionColorTextureOverride[] var4 = (PlayerCompositionColorTextureOverride[])(var1.playerCompositionColorTextureOverrides != null ? (PlayerCompositionColorTextureOverride[])Arrays.copyOf(var1.playerCompositionColorTextureOverrides, var1.playerCompositionColorTextureOverrides.length) : null);
		int[] var5 = Arrays.copyOf(var1.bodyColors, var1.bodyColors.length);
		this.method6061(var3, var2, var4, false, var5, var1.gender, var1.npcTransformId, var1.field3574);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([I[I[Lho;Z[IIIII)V",
		garbageValue = "-1866336930"
	)
	public void method6061(int[] var1, int[] var2, PlayerCompositionColorTextureOverride[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.playerCompositionColorTextureOverrides = var3;
		this.field3577 = var4;
		this.field3574 = var8;
		this.method6080(var1, var2, var5, var6, var7);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([I[I[IIII)V",
		garbageValue = "1458257561"
	)
	public void method6080(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (var1 == null) {
			var1 = this.method6063(var4);
		}

		if (var2 == null) {
			var2 = this.method6063(var4);
		}

		this.field3584 = var1;
		this.equipment = var2;
		this.bodyColors = var3;
		this.gender = var4;
		this.npcTransformId = var5;
		this.setHash();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)[I",
		garbageValue = "13"
	)
	int[] method6063(int var1) {
		int[] var2 = new int[12];

		for (int var3 = 0; var3 < 7; ++var3) {
			for (int var4 = 0; var4 < KitDefinition.KitDefinition_fileCount; ++var4) {
				KitDefinition var5 = ClanChannel.KitDefinition_get(var4);
				if (var5 != null && !var5.nonSelectable && var3 + (var1 == 1 ? 7 : 0) == var5.bodypartID) {
					var2[equipmentIndices[var3]] = var4 + 256;
					break;
				}
			}
		}

		return var2;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-1083968287"
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

				var4 = ClanChannel.KitDefinition_get(var3);
			} while(var4 == null || var4.nonSelectable || (this.gender == 1 ? 7 : 0) + var1 != var4.bodypartID);

			this.equipment[equipmentIndices[var1]] = var3 + 256;
			this.setHash();
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "8"
	)
	public void method6065(int var1, boolean var2) {
		int var3 = this.bodyColors[var1];
		boolean var4;
		if (!var2) {
			do {
				--var3;
				if (var3 < 0) {
					var3 = class140.field1659[var1].length - 1;
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
				if (var3 >= class140.field1659[var1].length) {
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-782377094"
	)
	public void method6084(int var1) {
		if (this.gender != var1) {
			this.method6080((int[])null, (int[])null, this.bodyColors, var1, -1);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V",
		garbageValue = "-544852329"
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "12"
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
		this.hash += -1305081315L * (long)(this.gender * 72026165);
		this.equipment[5] = var3;
		this.equipment[9] = var4;
		if (var1 != 0L && var1 != this.hash || this.field3577) {
			PlayerAppearance_cachedModels.remove(var1);
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lib;ILib;II)Ljr;",
		garbageValue = "955721951"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) {
			return class90.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4, (NpcOverrides)null);
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
					if (var11 >= 256 && var11 < 512 && !ClanChannel.KitDefinition_get(var11 - 256).ready()) {
						var9 = true;
					}

					if (var11 >= 512 && !InvDefinition.ItemDefinition_get(var11 - 512).method3947(this.gender)) {
						var9 = true;
					}
				}

				if (var9) {
					if (-1L != this.field3575) {
						var18 = (Model)PlayerAppearance_cachedModels.get(this.field3575);
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
							ModelData var14 = ClanChannel.KitDefinition_get(var13 - 256).getModelData();
							if (var14 != null) {
								var19[var11++] = var14;
							}
						}

						if (var13 >= 512) {
							ItemComposition var22 = InvDefinition.ItemDefinition_get(var13 - 512);
							ModelData var15 = var22.method3948(this.gender);
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
						if (this.bodyColors[var13] < class140.field1659[var13].length) {
							var20.recolor(UrlRequest.field1458[var13], class140.field1659[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < field3586[var13].length) {
							var20.recolor(field3578[var13], field3586[var13][this.bodyColors[var13]]);
						}
					}

					var18 = var20.toModel(64, 850, -30, -50, -30);
					PlayerAppearance_cachedModels.put(var18, var5);
					this.field3575 = var5;
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lic;",
		garbageValue = "-812517450"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) {
			return class90.getNpcDefinition(this.npcTransformId).method3692((NpcOverrides)null);
		} else {
			boolean var1 = false;

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) {
				var3 = this.equipment[var2];
				if (var3 >= 256 && var3 < 512 && !ClanChannel.KitDefinition_get(var3 - 256).method3637()) {
					var1 = true;
				}

				if (var3 >= 512 && !InvDefinition.ItemDefinition_get(var3 - 512).method3949(this.gender)) {
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
						var6 = ClanChannel.KitDefinition_get(var5 - 256).getKitDefinitionModels();
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}

					if (var5 >= 512) {
						var6 = InvDefinition.ItemDefinition_get(var5 - 512).method3952(this.gender);
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}
				}

				ModelData var8 = new ModelData(var7, var3);

				for (var5 = 0; var5 < 5; ++var5) {
					if (this.bodyColors[var5] < class140.field1659[var5].length) {
						var8.recolor(UrlRequest.field1458[var5], class140.field1659[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < field3586[var5].length) {
						var8.recolor(field3578[var5], field3586[var5][this.bodyColors[var5]]);
					}
				}

				return var8;
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "14"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		long var1 = this.hash;
		if (this.npcTransformId != -1) {
			var1 = -65536L | (long)this.npcTransformId;
		}

		Integer var3 = (Integer)field3582.method7781(var1);
		if (var3 == null) {
			var3 = ++field3583 - 1;
			field3582.method7782(var1, var3);
			field3583 %= 65535;
		}

		return var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1158771729"
	)
	void method6072() {
		this.method6080(this.field3584, this.equipment, this.bodyColors, this.gender, this.npcTransformId);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(CLon;B)C",
		garbageValue = "1"
	)
	@Export("standardizeChar")
	static char standardizeChar(char var0, Language var1) {
		if (var0 >= 192 && var0 <= 255) {
			if (var0 >= 192 && var0 <= 198) {
				return 'A';
			}

			if (var0 == 199) {
				return 'C';
			}

			if (var0 >= 200 && var0 <= 203) {
				return 'E';
			}

			if (var0 >= 204 && var0 <= 207) {
				return 'I';
			}

			if (var0 == 209 && var1 != Language.Language_ES) {
				return 'N';
			}

			if (var0 >= 210 && var0 <= 214) {
				return 'O';
			}

			if (var0 >= 217 && var0 <= 220) {
				return 'U';
			}

			if (var0 == 221) {
				return 'Y';
			}

			if (var0 == 223) {
				return 's';
			}

			if (var0 >= 224 && var0 <= 230) {
				return 'a';
			}

			if (var0 == 231) {
				return 'c';
			}

			if (var0 >= 232 && var0 <= 235) {
				return 'e';
			}

			if (var0 >= 236 && var0 <= 239) {
				return 'i';
			}

			if (var0 == 241 && var1 != Language.Language_ES) {
				return 'n';
			}

			if (var0 >= 242 && var0 <= 246) {
				return 'o';
			}

			if (var0 >= 249 && var0 <= 252) {
				return 'u';
			}

			if (var0 == 253 || var0 == 255) {
				return 'y';
			}
		}

		if (var0 == 338) {
			return 'O';
		} else if (var0 == 339) {
			return 'o';
		} else if (var0 == 376) {
			return 'Y';
		} else {
			return var0;
		}
	}
}
