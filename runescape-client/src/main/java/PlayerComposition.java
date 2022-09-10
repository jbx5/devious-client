import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ke")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("h")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("PlayerAppearance_cachedModels")
	public static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
	@ObfuscatedName("c")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("p")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("f")
	@Export("isFemale")
	public boolean isFemale;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -236250689
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		longValue = -8341796319512134019L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		longValue = 7997395669744453289L
	)
	long field3364;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "[Lfi;"
	)
	@Export("playerCompositionColorTextureOverrides")
	PlayerCompositionColorTextureOverride[] playerCompositionColorTextureOverrides;
	@ObfuscatedName("q")
	boolean field3366;

	static {
		equipmentIndices = new int[]{8, 11, 4, 6, 9, 7, 10};
		PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
	}

	public PlayerComposition() {
		this.field3366 = false;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([I[Lfi;Z[IZIB)V",
		garbageValue = "47"
	)
	public void method5727(int[] var1, PlayerCompositionColorTextureOverride[] var2, boolean var3, int[] var4, boolean var5, int var6) {
		this.playerCompositionColorTextureOverrides = var2;
		this.field3366 = var3;
		this.update(var1, var4, var5, var6);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "([I[IZII)V",
		garbageValue = "324153997"
	)
	@Export("update")
	public void update(int[] var1, int[] var2, boolean var3, int var4) {
		if (var1 == null) {
			var1 = new int[12];

			for (int var5 = 0; var5 < 7; ++var5) {
				for (int var6 = 0; var6 < KitDefinition.KitDefinition_fileCount; ++var6) {
					KitDefinition var7 = class10.KitDefinition_get(var6);
					if (var7 != null && !var7.nonSelectable && var7.bodypartID == var5 + (var3 ? 7 : 0)) {
						var1[equipmentIndices[var5]] = var6 + 256; // L: 42
						break;
					}
				}
			}
		}

		this.equipment = var1; // L: 48
		this.bodyColors = var2; // L: 49
		this.isFemale = var3; // L: 50
		this.npcTransformId = var4; // L: 51
		this.setHash(); // L: 52
	} // L: 53

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-346635958"
	)
	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
		if (var1 != 1 || !this.isFemale) { // L: 56
			int var3 = this.equipment[equipmentIndices[var1]]; // L: 57
			if (var3 != 0) { // L: 58
				var3 -= 256; // L: 59

				KitDefinition var4;
				do {
					if (!var2) { // L: 61
						--var3; // L: 62
						if (var3 < 0) { // L: 63
							var3 = KitDefinition.KitDefinition_fileCount - 1;
						}
					} else {
						++var3; // L: 66
						if (var3 >= KitDefinition.KitDefinition_fileCount) {
							var3 = 0; // L: 67
						}
					}

					var4 = class10.KitDefinition_get(var3); // L: 69
				} while(var4 == null || var4.nonSelectable || var4.bodypartID != var1 + (this.isFemale ? 7 : 0)); // L: 70

				this.equipment[equipmentIndices[var1]] = var3 + 256; // L: 72
				this.setHash(); // L: 73
			}
		}
	} // L: 74

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1839610523"
	)
	public void method5730(int var1, boolean var2) {
		int var3 = this.bodyColors[var1]; // L: 77
		if (!var2) { // L: 78
			do {
				--var3;
				if (var3 < 0) {
					var3 = class358.field4279[var1].length - 1;
				}
			} while(!TextureProvider.method4482(var1, var3));
		} else {
			do {
				++var3; // L: 89
				if (var3 >= class358.field4279[var1].length) {
					var3 = 0;
				}
			} while(!TextureProvider.method4482(var1, var3));
		}

		this.bodyColors[var1] = var3; // L: 94
		this.setHash(); // L: 95
	} // L: 96

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1955448033"
	)
	@Export("changeSex")
	public void changeSex(boolean var1) {
		if (this.isFemale != var1) { // L: 99
			this.update((int[])null, this.bodyColors, var1, -1); // L: 100
		}
	} // L: 101

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqq;B)V",
		garbageValue = "-11"
	)
	@Export("write")
	public void write(Buffer var1) {
		var1.writeByte(this.isFemale ? 1 : 0); // L: 104

		int var2;
		for (var2 = 0; var2 < 7; ++var2) { // L: 105
			int var3 = this.equipment[equipmentIndices[var2]]; // L: 106
			if (var3 == 0) { // L: 107
				var1.writeByte(-1);
			} else {
				var1.writeByte(var3 - 256); // L: 108
			}
		}

		for (var2 = 0; var2 < 5; ++var2) { // L: 110
			var1.writeByte(this.bodyColors[var2]);
		}

	} // L: 111

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1974538813"
	)
	@Export("setHash")
	void setHash() {
		long var1 = this.hash; // L: 114
		int var3 = this.equipment[5]; // L: 115
		int var4 = this.equipment[9]; // L: 116
		this.equipment[5] = var4; // L: 117
		this.equipment[9] = var3; // L: 118
		this.hash = 0L; // L: 119

		int var5;
		for (var5 = 0; var5 < 12; ++var5) { // L: 120
			this.hash <<= 4; // L: 121
			if (this.equipment[var5] >= 256) { // L: 122
				this.hash += (long)(this.equipment[var5] - 256);
			}
		}

		if (this.equipment[0] >= 256) { // L: 124
			this.hash += (long)(this.equipment[0] - 256 >> 4);
		}

		if (this.equipment[1] >= 256) { // L: 125
			this.hash += (long)(this.equipment[1] - 256 >> 8);
		}

		for (var5 = 0; var5 < 5; ++var5) { // L: 126
			this.hash <<= 3; // L: 127
			this.hash += (long)this.bodyColors[var5]; // L: 128
		}

		this.hash <<= 1; // L: 130
		this.hash += (long)(this.isFemale ? 1 : 0); // L: 131
		this.equipment[5] = var3; // L: 132
		this.equipment[9] = var4; // L: 133
		if (0L != var1 && this.hash != var1 || this.field3366) { // L: 134
			PlayerAppearance_cachedModels.remove(var1);
		}

	} // L: 135

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lgd;ILgd;IB)Lha;",
		garbageValue = "1"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) { // L: 138
			return class193.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4); // L: 139
		} else {
			long var5 = this.hash; // L: 141
			int[] var7 = this.equipment; // L: 142
			if (var1 != null && (var1.shield >= 0 || var1.weapon >= 0)) { // L: 143
				var7 = new int[12]; // L: 144

				for (int var8 = 0; var8 < 12; ++var8) { // L: 145
					var7[var8] = this.equipment[var8];
				}

				if (var1.shield >= 0) { // L: 146
					var5 += (long)(var1.shield - this.equipment[5] << 40); // L: 147
					var7[5] = var1.shield; // L: 148
				}

				if (var1.weapon >= 0) { // L: 150
					var5 += (long)(var1.weapon - this.equipment[3] << 48); // L: 151
					var7[3] = var1.weapon; // L: 152
				}
			}

			Model var18 = (Model)PlayerAppearance_cachedModels.get(var5); // L: 155
			if (var18 == null) { // L: 156
				boolean var9 = false; // L: 157

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) { // L: 158
					var11 = var7[var10]; // L: 159
					if (var11 >= 256 && var11 < 512 && !class10.KitDefinition_get(var11 - 256).ready()) { // L: 160 161
						var9 = true;
					}

					if (var11 >= 512 && !UserComparator3.ItemDefinition_get(var11 - 512).hasNoValidModel(this.isFemale)) { // L: 163 164
						var9 = true;
					}
				}

				if (var9) { // L: 167
					if (-1L != this.field3364) { // L: 168
						var18 = (Model)PlayerAppearance_cachedModels.get(this.field3364);
					}

					if (var18 == null) { // L: 169
						return null;
					}
				}

				if (var18 == null) { // L: 171
					ModelData[] var19 = new ModelData[12]; // L: 172
					var11 = 0; // L: 173

					int var13;
					for (int var12 = 0; var12 < 12; ++var12) { // L: 174
						var13 = var7[var12]; // L: 175
						if (var13 >= 256 && var13 < 512) { // L: 176
							ModelData var14 = class10.KitDefinition_get(var13 - 256).getModelData(); // L: 177
							if (var14 != null) { // L: 178
								var19[var11++] = var14;
							}
						}

						if (var13 >= 512) { // L: 180
							ItemComposition var22 = UserComparator3.ItemDefinition_get(var13 - 512); // L: 181
							ModelData var15 = var22.method3887(this.isFemale); // L: 182
							if (var15 != null) { // L: 183
								if (this.playerCompositionColorTextureOverrides != null) { // L: 184
									PlayerCompositionColorTextureOverride var16 = this.playerCompositionColorTextureOverrides[var12]; // L: 185
									if (var16 != null) { // L: 186
										int var17;
										if (var16.playerCompositionRecolorTo != null && var22.recolorFrom != null && var16.playerCompositionRecolorTo.length == var22.recolorTo.length) { // L: 187
											for (var17 = 0; var17 < var22.recolorFrom.length; ++var17) { // L: 188
												var15.recolor(var22.recolorTo[var17], var16.playerCompositionRecolorTo[var17]); // L: 189
											}
										}

										if (var16.playerCompositionRetextureTo != null && var22.retextureFrom != null && var22.retextureTo.length == var16.playerCompositionRetextureTo.length) { // L: 192
											for (var17 = 0; var17 < var22.retextureFrom.length; ++var17) { // L: 193
												var15.retexture(var22.retextureTo[var17], var16.playerCompositionRetextureTo[var17]); // L: 194
											}
										}
									}
								}

								var19[var11++] = var15; // L: 199
							}
						}
					}

					ModelData var20 = new ModelData(var19, var11); // L: 203

					for (var13 = 0; var13 < 5; ++var13) { // L: 204
						if (this.bodyColors[var13] < class358.field4279[var13].length) { // L: 205
							var20.recolor(class133.field1589[var13], class358.field4279[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < MusicPatchPcmStream.field3288[var13].length) { // L: 206
							var20.recolor(class239.field2865[var13], MusicPatchPcmStream.field3288[var13][this.bodyColors[var13]]);
						}
					}

					var18 = var20.toModel(64, 850, -30, -50, -30); // L: 208
					PlayerAppearance_cachedModels.put(var18, var5); // L: 209
					this.field3364 = var5; // L: 210
				}
			}

			if (var1 == null && var3 == null) { // L: 214
				return var18;
			} else {
				Model var21;
				if (var1 != null && var3 != null) { // L: 215
					var21 = var1.applyTransformations(var18, var2, var3, var4);
				} else if (var1 != null) { // L: 216
					var21 = var1.transformActorModel(var18, var2);
				} else {
					var21 = var3.transformActorModel(var18, var4); // L: 217
				}

				return var21; // L: 218
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Lgu;",
		garbageValue = "-512727844"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) { // L: 222
			return class193.getNpcDefinition(this.npcTransformId).getModelData(); // L: 223
		} else {
			boolean var1 = false; // L: 225

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) { // L: 226
				var3 = this.equipment[var2]; // L: 227
				if (var3 >= 256 && var3 < 512 && !class10.KitDefinition_get(var3 - 256).method3569()) { // L: 228 229
					var1 = true;
				}

				if (var3 >= 512 && !UserComparator3.ItemDefinition_get(var3 - 512).method3833(this.isFemale)) { // L: 231 232
					var1 = true;
				}
			}

			if (var1) { // L: 235
				return null;
			} else {
				ModelData[] var7 = new ModelData[12]; // L: 236
				var3 = 0; // L: 237

				int var5;
				for (int var4 = 0; var4 < 12; ++var4) { // L: 238
					var5 = this.equipment[var4]; // L: 239
					ModelData var6;
					if (var5 >= 256 && var5 < 512) { // L: 240
						var6 = class10.KitDefinition_get(var5 - 256).getKitDefinitionModels(); // L: 241
						if (var6 != null) { // L: 242
							var7[var3++] = var6;
						}
					}

					if (var5 >= 512) { // L: 244
						var6 = UserComparator3.ItemDefinition_get(var5 - 512).method3845(this.isFemale); // L: 245
						if (var6 != null) { // L: 246
							var7[var3++] = var6;
						}
					}
				}

				ModelData var8 = new ModelData(var7, var3); // L: 249

				for (var5 = 0; var5 < 5; ++var5) { // L: 250
					if (this.bodyColors[var5] < class358.field4279[var5].length) { // L: 251
						var8.recolor(class133.field1589[var5], class358.field4279[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < MusicPatchPcmStream.field3288[var5].length) { // L: 252
						var8.recolor(class239.field2865[var5], MusicPatchPcmStream.field3288[var5][this.bodyColors[var5]]);
					}
				}

				return var8; // L: 254
			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "55"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		return this.npcTransformId == -1 ? (this.equipment[0] << 15) + this.equipment[1] + (this.equipment[11] << 5) + (this.equipment[8] << 10) + (this.bodyColors[0] << 25) + (this.bodyColors[4] << 20) : 305419896 + class193.getNpcDefinition(this.npcTransformId).id; // L: 258 259
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(CI)B",
		garbageValue = "1735848214"
	)
	@Export("charToByteCp1252")
	public static byte charToByteCp1252(char var0) {
		byte var1;
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) { // L: 12
			var1 = (byte)var0;
		} else if (var0 == 8364) { // L: 13
			var1 = -128;
		} else if (var0 == 8218) { // L: 14
			var1 = -126;
		} else if (var0 == 402) { // L: 15
			var1 = -125;
		} else if (var0 == 8222) { // L: 16
			var1 = -124;
		} else if (var0 == 8230) { // L: 17
			var1 = -123;
		} else if (var0 == 8224) { // L: 18
			var1 = -122;
		} else if (var0 == 8225) { // L: 19
			var1 = -121;
		} else if (var0 == 710) { // L: 20
			var1 = -120;
		} else if (var0 == 8240) { // L: 21
			var1 = -119;
		} else if (var0 == 352) { // L: 22
			var1 = -118;
		} else if (var0 == 8249) { // L: 23
			var1 = -117;
		} else if (var0 == 338) { // L: 24
			var1 = -116;
		} else if (var0 == 381) { // L: 25
			var1 = -114;
		} else if (var0 == 8216) { // L: 26
			var1 = -111;
		} else if (var0 == 8217) { // L: 27
			var1 = -110;
		} else if (var0 == 8220) { // L: 28
			var1 = -109;
		} else if (var0 == 8221) {
			var1 = -108;
		} else if (var0 == 8226) {
			var1 = -107;
		} else if (var0 == 8211) {
			var1 = -106;
		} else if (var0 == 8212) {
			var1 = -105;
		} else if (var0 == 732) {
			var1 = -104;
		} else if (var0 == 8482) {
			var1 = -103;
		} else if (var0 == 353) {
			var1 = -102;
		} else if (var0 == 8250) { // L: 36
			var1 = -101;
		} else if (var0 == 339) { // L: 37
			var1 = -100;
		} else if (var0 == 382) { // L: 38
			var1 = -98;
		} else if (var0 == 376) { // L: 39
			var1 = -97;
		} else {
			var1 = 63; // L: 40
		}

		return var1; // L: 41
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(II)Lgz;",
		garbageValue = "1095498227"
	)
	@Export("getObjectDefinition")
	public static ObjectComposition getObjectDefinition(int var0) {
		ObjectComposition var1 = (ObjectComposition)ObjectComposition.ObjectDefinition_cached.get((long)var0); // L: 79
		if (var1 != null) { // L: 80
			return var1;
		} else {
			byte[] var2 = ObjectComposition.ObjectDefinition_archive.takeFile(6, var0); // L: 81
			var1 = new ObjectComposition(); // L: 82
			var1.id = var0; // L: 83
			if (var2 != null) { // L: 84
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 85
			if (var1.isSolid) { // L: 86
				var1.interactType = 0; // L: 87
				var1.boolean1 = false; // L: 88
			}

			ObjectComposition.ObjectDefinition_cached.put(var1, (long)var0); // L: 90
			return var1; // L: 91
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IB)Lfe;",
		garbageValue = "109"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0); // L: 29
		if (var1 != null) { // L: 30
			return var1;
		} else {
			byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0); // L: 31
			var1 = new EnumComposition(); // L: 32
			if (var2 != null) { // L: 33
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0); // L: 34
			return var1; // L: 35
		}
	}
}
