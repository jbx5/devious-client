import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("q")
	public static short[] field3304;
	@ObfuscatedName("w")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"Lig;")

	@Export("PlayerAppearance_cachedModels")
	public static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
	@ObfuscatedName("hk")
	@ObfuscatedGetter(intValue = 
	-468225065)

	static int field3307;
	@ObfuscatedName("v")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("c")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("i")
	@Export("isFemale")
	public boolean isFemale;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	1661729967)

	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("b")
	@ObfuscatedGetter(longValue = 
	-2450730779169477887L)

	@Export("hash")
	long hash;
	@ObfuscatedName("n")
	@ObfuscatedGetter(longValue = 
	-5318511275487729225L)

	long field3301;
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"[Lfj;")

	class168[] field3302;
	@ObfuscatedName("l")
	boolean field3306;
	static 
	{
		equipmentIndices = new int[]{ 8, 11, 4, 6, 9, 7, 10 };
		PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
	}

	public PlayerComposition() {
		this.field3306 = false;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"([I[Lfj;Z[IZII)V", garbageValue = 
	"-299741271")

	public void method5570(int[] var1, class168[] var2, boolean var3, int[] var4, boolean var5, int var6) {
		this.field3302 = var2;
		this.field3306 = var3;
		this.update(var1, var4, var5, var6);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"([I[IZII)V", garbageValue = 
	"-1061020993")

	@Export("update")
	public void update(int[] var1, int[] var2, boolean var3, int var4) {
		if (var1 == null) {
			var1 = new int[12];

			for (int var5 = 0; var5 < 7; ++var5) {
				for (int var6 = 0; var6 < KitDefinition.KitDefinition_fileCount; ++var6) {
					KitDefinition var7 = WorldMapLabel.KitDefinition_get(var6);
					if (((var7 != null) && (!var7.nonSelectable)) && ((var5 + (var3 ? 7 : 0)) == var7.bodypartID)) {
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(IZI)V", garbageValue = 
	"771015122")

	@Export("changeAppearance")
	public void changeAppearance(int var1, boolean var2) {
		if ((var1 != 1) || (!this.isFemale)) {
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

					var4 = WorldMapLabel.KitDefinition_get(var3);
				} while (((var4 == null) || var4.nonSelectable) || (var4.bodypartID != ((this.isFemale ? 7 : 0) + var1)) );

				this.equipment[equipmentIndices[var1]] = var3 + 256;
				this.setHash();
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(IZI)V", garbageValue = 
	"-730659334")

	public void method5594(int var1, boolean var2) {
		int var3 = this.bodyColors[var1];
		boolean var4;
		if (!var2) {
			do {
				--var3;
				if (var3 < 0) {
					var3 = class144.field1629[var1].length - 1;
				}

				if ((var1 == 4) && (var3 >= 8)) {
					var4 = false;
				} else {
					var4 = true;
				}
			} while (!var4 );
		} else {
			do {
				++var3;
				if (var3 >= class144.field1629[var1].length) {
					var3 = 0;
				}

				if ((var1 == 4) && (var3 >= 8)) {
					var4 = false;
				} else {
					var4 = true;
				}
			} while (!var4 );
		}

		this.bodyColors[var1] = var3;
		this.setHash();
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(ZB)V", garbageValue = 
	"23")

	@Export("changeSex")
	public void changeSex(boolean var1) {
		if (this.isFemale != var1) {
			this.update(((int[]) (null)), this.bodyColors, var1, -1);
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;B)V", garbageValue = 
	"103")

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

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"720689587")

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
			this.hash += ((long) ((this.equipment[0] - 256) >> 4));
		}

		if (this.equipment[1] >= 256) {
			this.hash += ((long) ((this.equipment[1] - 256) >> 8));
		}

		for (var5 = 0; var5 < 5; ++var5) {
			this.hash <<= 3;
			this.hash += ((long) (this.bodyColors[var5]));
		}

		this.hash <<= 1;
		this.hash += ((long) ((this.isFemale) ? 1 : 0));
		this.equipment[5] = var3;
		this.equipment[9] = var4;
		if (((0L != var1) && (var1 != this.hash)) || this.field3306) {
			PlayerAppearance_cachedModels.remove(var1);
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(Lgw;ILgw;II)Liq;", garbageValue = 
	"2065643699")

	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != (-1)) {
			return KeyHandler.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4);
		} else {
			long var5 = this.hash;
			int[] var7 = this.equipment;
			if ((var1 != null) && ((var1.shield >= 0) || (var1.weapon >= 0))) {
				var7 = new int[12];

				for (int var8 = 0; var8 < 12; ++var8) {
					var7[var8] = this.equipment[var8];
				}

				if (var1.shield >= 0) {
					var5 += ((long) ((var1.shield - this.equipment[5]) << 40));
					var7[5] = var1.shield;
				}

				if (var1.weapon >= 0) {
					var5 += ((long) ((var1.weapon - this.equipment[3]) << 48));
					var7[3] = var1.weapon;
				}
			}

			Model var18 = ((Model) (PlayerAppearance_cachedModels.get(var5)));
			if (var18 == null) {
				boolean var9 = false;

				int var11;
				for (int var10 = 0; var10 < 12; ++var10) {
					var11 = var7[var10];
					if (((var11 >= 256) && (var11 < 512)) && (!WorldMapLabel.KitDefinition_get(var11 - 256).ready())) {
						var9 = true;
					}

					if ((var11 >= 512) && (!class19.ItemDefinition_get(var11 - 512).hasNoValidModel(this.isFemale))) {
						var9 = true;
					}
				}

				if (var9) {
					if (this.field3301 != (-1L)) {
						var18 = ((Model) (PlayerAppearance_cachedModels.get(this.field3301)));
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
						if ((var13 >= 256) && (var13 < 512)) {
							ModelData var14 = WorldMapLabel.KitDefinition_get(var13 - 256).getModelData();
							if (var14 != null) {
								var19[var11++] = var14;
							}
						}

						if (var13 >= 512) {
							ItemComposition var22 = class19.ItemDefinition_get(var13 - 512);
							ModelData var15 = var22.method3719(this.isFemale);
							if (var15 != null) {
								if (this.field3302 != null) {
									class168 var16 = this.field3302[var12];
									if (var16 != null) {
										int var17;
										if (((var16.field1791 != null) && (var22.recolorFrom != null)) && (var16.field1791.length == var22.recolorTo.length)) {
											for (var17 = 0; var17 < var22.recolorFrom.length; ++var17) {
												var15.recolor(var22.recolorTo[var17], var16.field1791[var17]);
											}
										}

										if (((var16.field1790 != null) && (var22.retextureFrom != null)) && (var22.retextureTo.length == var16.field1790.length)) {
											for (var17 = 0; var17 < var22.retextureFrom.length; ++var17) {
												var15.retexture(var22.retextureTo[var17], var16.field1790[var17]);
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
						if (this.bodyColors[var13] < class144.field1629[var13].length) {
							var20.recolor(field3304[var13], class144.field1629[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < WorldMapRectangle.field2356[var13].length) {
							var20.recolor(WorldMapIcon_0.field2300[var13], WorldMapRectangle.field2356[var13][this.bodyColors[var13]]);
						}
					}

					var18 = var20.toModel(64, 850, -30, -50, -30);
					PlayerAppearance_cachedModels.put(var18, var5);
					this.field3301 = var5;
				}
			}

			if ((var1 == null) && (var3 == null)) {
				return var18;
			} else {
				Model var21;
				if ((var1 != null) && (var3 != null)) {
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"(I)Lhc;", garbageValue = 
	"-801308505")

	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != (-1)) {
			return KeyHandler.getNpcDefinition(this.npcTransformId).getModelData();
		} else {
			boolean var1 = false;

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) {
				var3 = this.equipment[var2];
				if (((var3 >= 256) && (var3 < 512)) && (!WorldMapLabel.KitDefinition_get(var3 - 256).method3447())) {
					var1 = true;
				}

				if ((var3 >= 512) && (!class19.ItemDefinition_get(var3 - 512).method3723(this.isFemale))) {
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
					if ((var5 >= 256) && (var5 < 512)) {
						var6 = WorldMapLabel.KitDefinition_get(var5 - 256).getKitDefinitionModels();
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}

					if (var5 >= 512) {
						var6 = class19.ItemDefinition_get(var5 - 512).method3718(this.isFemale);
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}
				}

				ModelData var8 = new ModelData(var7, var3);

				for (var5 = 0; var5 < 5; ++var5) {
					if (this.bodyColors[var5] < class144.field1629[var5].length) {
						var8.recolor(field3304[var5], class144.field1629[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < WorldMapRectangle.field2356[var5].length) {
						var8.recolor(WorldMapIcon_0.field2300[var5], WorldMapRectangle.field2356[var5][this.bodyColors[var5]]);
					}
				}

				return var8;
			}
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"1675843128")

	@Export("getChatHeadId")
	public int getChatHeadId() {
		return this.npcTransformId == (-1) ? (((((this.equipment[0] << 15) + this.equipment[1]) + (this.equipment[11] << 5)) + (this.equipment[8] << 10)) + (this.bodyColors[0] << 25)) + (this.bodyColors[4] << 20) : 305419896 + KeyHandler.getNpcDefinition(this.npcTransformId).id;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(Lpz;II)V", garbageValue = 
	"1476146212")

	@Export("readPlayerUpdate")
	static void readPlayerUpdate(PacketBuffer var0, int var1) {
		boolean var2 = var0.readBits(1) == 1;
		if (var2) {
			Players.Players_pendingUpdateIndices[(++Players.Players_pendingUpdateCount) - 1] = var1;
		}

		int var3 = var0.readBits(2);
		Player var4 = Client.players[var1];
		if (var3 == 0) {
			if (var2) {
				var4.field1070 = false;
			} else if (Client.localPlayerIndex == var1) {
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = ((var4.plane << 28) + (((GrandExchangeOfferOwnWorldComparator.baseX + var4.pathX[0]) >> 13) << 14)) + ((VarcInt.baseY + var4.pathY[0]) >> 13);
				if (var4.field1121 != (-1)) {
					Players.Players_orientations[var1] = var4.field1121;
				} else {
					Players.Players_orientations[var1] = var4.orientation;
				}

				Players.Players_targetIndices[var1] = var4.targetIndex;
				Client.players[var1] = null;
				if (var0.readBits(1) != 0) {
					class175.updateExternalPlayer(var0, var1);
				}

			}
		} else {
			int var5;
			int var6;
			int var7;
			if (var3 == 1) {
				var5 = var0.readBits(3);
				var6 = var4.pathX[0];
				var7 = var4.pathY[0];
				if (var5 == 0) {
					--var6;
					--var7;
				} else if (var5 == 1) {
					--var7;
				} else if (var5 == 2) {
					++var6;
					--var7;
				} else if (var5 == 3) {
					--var6;
				} else if (var5 == 4) {
					++var6;
				} else if (var5 == 5) {
					--var6;
					++var7;
				} else if (var5 == 6) {
					++var7;
				} else if (var5 == 7) {
					++var6;
					++var7;
				}

				if ((Client.localPlayerIndex == var1) && ((((var4.x < 1536) || (var4.y < 1536)) || (var4.x >= 11776)) || (var4.y >= 11776))) {
					var4.resetPath(var6, var7);
					var4.field1070 = false;
				} else if (var2) {
					var4.field1070 = true;
					var4.tileX = var6;
					var4.tileY = var7;
				} else {
					var4.field1070 = false;
					var4.method2125(var6, var7, Players.field1286[var1]);
				}

			} else if (var3 == 2) {
				var5 = var0.readBits(4);
				var6 = var4.pathX[0];
				var7 = var4.pathY[0];
				if (var5 == 0) {
					var6 -= 2;
					var7 -= 2;
				} else if (var5 == 1) {
					--var6;
					var7 -= 2;
				} else if (var5 == 2) {
					var7 -= 2;
				} else if (var5 == 3) {
					++var6;
					var7 -= 2;
				} else if (var5 == 4) {
					var6 += 2;
					var7 -= 2;
				} else if (var5 == 5) {
					var6 -= 2;
					--var7;
				} else if (var5 == 6) {
					var6 += 2;
					--var7;
				} else if (var5 == 7) {
					var6 -= 2;
				} else if (var5 == 8) {
					var6 += 2;
				} else if (var5 == 9) {
					var6 -= 2;
					++var7;
				} else if (var5 == 10) {
					var6 += 2;
					++var7;
				} else if (var5 == 11) {
					var6 -= 2;
					var7 += 2;
				} else if (var5 == 12) {
					--var6;
					var7 += 2;
				} else if (var5 == 13) {
					var7 += 2;
				} else if (var5 == 14) {
					++var6;
					var7 += 2;
				} else if (var5 == 15) {
					var6 += 2;
					var7 += 2;
				}

				if ((Client.localPlayerIndex == var1) && ((((var4.x < 1536) || (var4.y < 1536)) || (var4.x >= 11776)) || (var4.y >= 11776))) {
					var4.resetPath(var6, var7);
					var4.field1070 = false;
				} else if (var2) {
					var4.field1070 = true;
					var4.tileX = var6;
					var4.tileY = var7;
				} else {
					var4.field1070 = false;
					var4.method2125(var6, var7, Players.field1286[var1]);
				}

			} else {
				var5 = var0.readBits(1);
				int var8;
				int var9;
				int var10;
				int var11;
				if (var5 == 0) {
					var6 = var0.readBits(12);
					var7 = var6 >> 10;
					var8 = (var6 >> 5) & 31;
					if (var8 > 15) {
						var8 -= 32;
					}

					var9 = var6 & 31;
					if (var9 > 15) {
						var9 -= 32;
					}

					var10 = var8 + var4.pathX[0];
					var11 = var9 + var4.pathY[0];
					if ((Client.localPlayerIndex != var1) || ((((var4.x >= 1536) && (var4.y >= 1536)) && (var4.x < 11776)) && (var4.y < 11776))) {
						if (var2) {
							var4.field1070 = true;
							var4.tileX = var10;
							var4.tileY = var11;
						} else {
							var4.field1070 = false;
							var4.method2125(var10, var11, Players.field1286[var1]);
						}
					} else {
						var4.resetPath(var10, var11);
						var4.field1070 = false;
					}

					var4.plane = ((byte) ((var7 + var4.plane) & 3));
					if (Client.localPlayerIndex == var1) {
						class18.Client_plane = var4.plane;
					}

				} else {
					var6 = var0.readBits(30);
					var7 = var6 >> 28;
					var8 = (var6 >> 14) & 16383;
					var9 = var6 & 16383;
					var10 = (((var8 + GrandExchangeOfferOwnWorldComparator.baseX) + var4.pathX[0]) & 16383) - GrandExchangeOfferOwnWorldComparator.baseX;
					var11 = (((var9 + VarcInt.baseY) + var4.pathY[0]) & 16383) - VarcInt.baseY;
					if ((Client.localPlayerIndex == var1) && ((((var4.x < 1536) || (var4.y < 1536)) || (var4.x >= 11776)) || (var4.y >= 11776))) {
						var4.resetPath(var10, var11);
						var4.field1070 = false;
					} else if (var2) {
						var4.field1070 = true;
						var4.tileX = var10;
						var4.tileY = var11;
					} else {
						var4.field1070 = false;
						var4.method2125(var10, var11, Players.field1286[var1]);
					}

					var4.plane = ((byte) ((var7 + var4.plane) & 3));
					if (Client.localPlayerIndex == var1) {
						class18.Client_plane = var4.plane;
					}

				}
			}
		}
	}
}