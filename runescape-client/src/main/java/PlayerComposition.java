import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nr")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("al")
	public static short[] field3801;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("PlayerAppearance_cachedModels")
	public static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lry;"
	)
	public static class464 field3805;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1717967179
	)
	public static int field3806;
	@ObfuscatedName("ac")
	int[] field3804;
	@ObfuscatedName("ae")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("ag")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1161513301
	)
	public int field3794;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 2024464609
	)
	@Export("gender")
	public int gender;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1618042977
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = 971960971779926143L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = -6368619070362511553L
	)
	long field3798;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lgv;"
	)
	@Export("playerCompositionColorTextureOverrides")
	PlayerCompositionColorTextureOverride[] playerCompositionColorTextureOverrides;
	@ObfuscatedName("ar")
	boolean field3800;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -2023519509
	)
	final int field3799;

	static {
		PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
		field3805 = new class464(16, class462.field4931);
		field3806 = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Lnr;)V"
	)
	PlayerComposition(PlayerComposition var1) {
		this.field3794 = -1;
		this.gender = 0;
		this.field3800 = false;
		this.field3799 = class548.field5407 < 224 ? 512 : 2048;
		int[] var2 = Arrays.copyOf(var1.equipment, var1.equipment.length);
		int[] var3 = Arrays.copyOf(var1.field3804, var1.field3804.length);
		PlayerCompositionColorTextureOverride[] var4 = (PlayerCompositionColorTextureOverride[])(var1.playerCompositionColorTextureOverrides != null ? (PlayerCompositionColorTextureOverride[])Arrays.copyOf(var1.playerCompositionColorTextureOverrides, var1.playerCompositionColorTextureOverrides.length) : null);
		int[] var5 = Arrays.copyOf(var1.bodyColors, var1.bodyColors.length);
		this.method6912(var3, var2, var4, false, var5, var1.gender, var1.npcTransformId, var1.field3794);
	}

	public PlayerComposition() {
		this.field3794 = -1;
		this.gender = 0;
		this.field3800 = false;
		this.field3799 = class548.field5407 < 224 ? 512 : 2048;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([I[I[Lgv;Z[IIIII)V",
		garbageValue = "-1616407631"
	)
	public void method6912(int[] var1, int[] var2, PlayerCompositionColorTextureOverride[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.playerCompositionColorTextureOverrides = var3;
		this.field3800 = var4;
		this.field3794 = var8;
		this.method6914(var1, var2, var5, var6, var7);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([I[I[IIIB)V",
		garbageValue = "-118"
	)
	public void method6914(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (var1 == null) {
			var1 = this.method6881(var4);
		}

		if (var2 == null) {
			var2 = this.method6881(var4);
		}

		this.field3804 = var1;
		this.equipment = var2;
		this.bodyColors = var3;
		this.gender = var4;
		this.npcTransformId = var5;
		this.setHash();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)[I",
		garbageValue = "-68"
	)
	int[] method6881(int var1) {
		int[] var2 = new int[12];

		for (int var3 = 0; var3 < 7; ++var3) {
			for (int var4 = 0; var4 < KitDefinition.KitDefinition_fileCount; ++var4) {
				KitDefinition var5 = JagexCache.KitDefinition_get(var4);
				if (var5 != null && !var5.nonSelectable && var5.method3866(var3, var1)) {
					if (class198.field2072 == null) {
						class198.method4025();
					}

					int var7 = class198.field2072[var3];
					var2[var7] = var4 + 256;
					break;
				}
			}
		}

		return var2;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-1360021285"
	)
	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
		int[] var3 = this.equipment;
		if (class198.field2072 == null) {
			class198.method4025();
		}

		int var4 = class198.field2072[var1];
		int var5 = var3[var4];
		if (var5 != 0) {
			var5 -= 256;

			KitDefinition var6;
			do {
				if (!var2) {
					--var5;
					if (var5 < 0) {
						var5 = KitDefinition.KitDefinition_fileCount - 1;
					}
				} else {
					++var5;
					if (var5 >= KitDefinition.KitDefinition_fileCount) {
						var5 = 0;
					}
				}

				var6 = JagexCache.KitDefinition_get(var5);
			} while(var6 == null || var6.nonSelectable || !var6.method3866(var1, this.gender));

			int[] var8 = this.equipment;
			if (class198.field2072 == null) {
				class198.method4025();
			}

			int var7 = class198.field2072[var1];
			var8[var7] = var5 + 256;
			this.setHash();
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1488978092"
	)
	public void method6929(int var1, boolean var2) {
		int var3 = this.bodyColors[var1];
		boolean var4;
		if (!var2) {
			do {
				--var3;
				if (var3 < 0) {
					var3 = Projection.field2769[var1].length - 1;
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
				if (var3 >= Projection.field2769[var1].length) {
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1782937947"
	)
	public void method6916(int var1) {
		if (this.gender != var1) {
			this.method6914((int[])null, (int[])null, this.bodyColors, var1, -1);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lvf;B)V",
		garbageValue = "-13"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.gender);

		int var2;
		for (var2 = 0; var2 < 7; ++var2) {
			int[] var3 = this.equipment;
			if (class198.field2072 == null) {
				class198.method4025();
			}

			int var4 = class198.field2072[var2];
			int var5 = var3[var4];
			if (class548.field5407 >= 224) {
				if (var5 == 0) {
					var1.writeShort(-1);
				} else {
					var1.writeShort(var5 - 256);
				}
			} else if (var5 == 0) {
				var1.writeByte(-1);
			} else {
				var1.writeByte(var5 - 256);
			}
		}

		for (var2 = 0; var2 < 5; ++var2) {
			var1.writeByte(this.bodyColors[var2]);
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-124"
	)
	@Export("setHash")
	void setHash() {
		long var1 = this.hash;
		long[] var3 = Buffer.field5413;
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
		if (var1 != 0L && var1 != this.hash || this.field3800) {
			PlayerAppearance_cachedModels.remove(var1);
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lif;ILif;II)Ljm;",
		garbageValue = "1990172323"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) {
			return class168.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4, (NpcOverrides)null);
		} else {
			long var5 = this.hash;
			int[] var7 = this.equipment;
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) {
				var7 = new int[12];
				System.arraycopy(this.equipment, 0, var7, 0, var7.length);
				if (var1.shield >= 0) {
					var5 ^= (long)(var1.shield - this.equipment[class213.field2338.field2347]) << 40;
					var7[class213.field2338.field2347] = this.method6907(var1.shield);
				}

				if (var1.weapon >= 0) {
					var5 ^= (long)(var1.weapon - this.equipment[class213.field2333.field2347]) << 48;
					var7[class213.field2333.field2347] = this.method6907(var1.weapon);
				}
			}

			Model var8 = (Model)PlayerAppearance_cachedModels.get(var5);
			if (var8 == null) {
				boolean var9 = false;

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) {
					var11 = var7[var10];
					if (this.method6895(var11)) {
						KitDefinition var19 = this.method6896(var11);
						if (var19 != null && !var19.ready()) {
							var9 = true;
						}
					}

					if (this.method6897(var11) && !this.method6898(var11).method4284(this.gender)) {
						var9 = true;
					}
				}

				if (var9) {
					if (-1L != this.field3798) {
						var8 = (Model)PlayerAppearance_cachedModels.get(this.field3798);
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
						if (this.method6895(var13)) {
							KitDefinition var14 = this.method6896(var13);
							var15 = null;
							if (var14 != null) {
								var15 = var14.getModelData();
							}

							if (var15 != null) {
								var18[var11++] = var15;
							}
						}

						if (this.method6897(var13)) {
							ItemComposition var21 = this.method6898(var13);
							var15 = var21.method4224(this.gender);
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
						if (this.bodyColors[var13] < Projection.field2769[var13].length) {
							var22.recolor(field3801[var13], Projection.field2769[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < HttpRequest.field48[var13].length) {
							var22.recolor(TextureProvider.field2768[var13], HttpRequest.field48[var13][this.bodyColors[var13]]);
						}
					}

					var8 = var22.toModel(64, 850, -30, -50, -30);
					PlayerAppearance_cachedModels.put(var8, var5);
					this.field3798 = var5;
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ljv;",
		garbageValue = "1556100052"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) {
			return class168.getNpcDefinition(this.npcTransformId).method3966((NpcOverrides)null);
		} else {
			boolean var1 = false;

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) {
				var3 = this.equipment[var2];
				if (this.method6895(var3)) {
					KitDefinition var9 = this.method6896(var3);
					if (var9 != null && !var9.method3869()) {
						var1 = true;
					}
				}

				if (this.method6897(var3) && !this.method6898(var3).method4225(this.gender)) {
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
					if (this.method6895(var5)) {
						KitDefinition var6 = this.method6896(var5);
						ModelData var7 = null;
						if (var6 != null) {
							var7 = var6.getKitDefinitionModels();
						}

						if (var7 != null) {
							var8[var3++] = var7;
						}
					}

					if (this.method6897(var5)) {
						ModelData var10 = this.method6898(var5).method4226(this.gender);
						if (var10 != null) {
							var8[var3++] = var10;
						}
					}
				}

				ModelData var11 = new ModelData(var8, var3);

				for (var5 = 0; var5 < 5; ++var5) {
					if (this.bodyColors[var5] < Projection.field2769[var5].length) {
						var11.recolor(field3801[var5], Projection.field2769[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < HttpRequest.field48[var5].length) {
						var11.recolor(TextureProvider.field2768[var5], HttpRequest.field48[var5][this.bodyColors[var5]]);
					}
				}

				return var11;
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-77"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		long var1 = this.hash;
		if (this.npcTransformId != -1) {
			var1 = -65536L | (long)this.npcTransformId;
		}

		Integer var3 = (Integer)field3805.method8754(var1);
		if (var3 == null) {
			var3 = ++field3806 - 1;
			field3805.method8755(var1, var3);
			field3806 %= 65535;
		}

		return var3;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "119580921"
	)
	void method6890() {
		this.method6914(this.field3804, this.equipment, this.bodyColors, this.gender, this.npcTransformId);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2030636546"
	)
	public void method6891(int var1, int var2) {
		boolean var3 = var2 != this.gender;
		this.gender = var2;
		if (var3) {
			int var4;
			int var5;
			if (this.gender == var1) {
				for (var4 = 0; var4 < 7; ++var4) {
					if (class198.field2072 == null) {
						class198.method4025();
					}

					var5 = class198.field2072[var4];
					if (this.equipment[var5] > 0 && this.equipment[var5] < this.field3799) {
						this.equipment[var5] = this.field3804[var5];
					}
				}
			} else {
				if (this.equipment[0] < this.field3799 || this.method6892()) {
					this.equipment[class213.field2344.field2347] = 1;
				}

				for (var4 = 0; var4 < 7; ++var4) {
					if (class198.field2072 == null) {
						class198.method4025();
					}

					var5 = class198.field2072[var4];
					if (this.equipment[var5] > 0 && this.equipment[var5] < this.field3799) {
						int[] var7 = this.equipment;

						for (int var8 = 0; var8 < KitDefinition.KitDefinition_fileCount; ++var8) {
							KitDefinition var9 = JagexCache.KitDefinition_get(var8);
							if (var9 != null && !var9.nonSelectable && var9.method3866(var4, var2)) {
								if (class198.field2072 == null) {
									class198.method4025();
								}

								int var11 = class198.field2072[var4];
								var7[var11] = var8 + 256;
								break;
							}
						}
					}
				}
			}
		}

		this.method6890();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-43"
	)
	boolean method6892() {
		if (!this.method6897(this.equipment[0])) {
			return false;
		} else {
			ItemComposition var1 = this.method6898(this.equipment[0]);
			return var1.maleModel1 != class213.field2344.field2347 && var1.maleModel2 != class213.field2344.field2347;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "675896737"
	)
	public void method6893(int var1, int var2) {
		this.bodyColors[var1] = var2;
		this.method6890();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "470269704"
	)
	public void method6894(int var1) {
		ItemComposition var2 = MouseRecorder.ItemDefinition_get(var1);
		this.equipment[var2.maleModel] = this.field3799 + var1;
		if (var2.maleModel1 != -1) {
			this.equipment[var2.maleModel1] = 0;
		}

		if (var2.maleModel2 != -1) {
			this.equipment[var2.maleModel2] = 0;
		}

		this.method6890();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-246196412"
	)
	boolean method6895(int var1) {
		return var1 >= 256 && var1 < this.field3799;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Lhr;",
		garbageValue = "374022250"
	)
	KitDefinition method6896(int var1) {
		return JagexCache.KitDefinition_get(var1 - 256);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1043235106"
	)
	boolean method6897(int var1) {
		return var1 >= this.field3799;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IS)Lis;",
		garbageValue = "25364"
	)
	ItemComposition method6898(int var1) {
		return MouseRecorder.ItemDefinition_get(var1 - this.field3799);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-933331327"
	)
	int method6907(int var1) {
		return var1 - 512 + this.field3799;
	}
}
