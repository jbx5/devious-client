import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nb")
@Implements("PlayerComposition")
public class PlayerComposition {
	@ObfuscatedName("as")
	public static short[][] field3606;
	@ObfuscatedName("ay")
	@Export("equipmentIndices")
	static final int[] equipmentIndices;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Llk;"
	)
	@Export("PlayerAppearance_cachedModels")
	static EvictingDualNodeHashTable PlayerAppearance_cachedModels;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	static class435 field3599;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -971246219
	)
	static int field3611;
	@ObfuscatedName("at")
	int[] field3596;
	@ObfuscatedName("ah")
	@Export("equipment")
	int[] equipment;
	@ObfuscatedName("ar")
	@Export("bodyColors")
	int[] bodyColors;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 267402299
	)
	public int field3598;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -857831361
	)
	@Export("gender")
	public int gender;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1418794423
	)
	@Export("npcTransformId")
	public int npcTransformId;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		longValue = -122798719749358227L
	)
	@Export("hash")
	long hash;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = 1369544555335042193L
	)
	long field3608;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lgx;"
	)
	@Export("playerCompositionColorTextureOverrides")
	PlayerCompositionColorTextureOverride[] playerCompositionColorTextureOverrides;
	@ObfuscatedName("az")
	boolean field3603;

	static {
		equipmentIndices = new int[]{class205.field2242.field2245, class205.field2231.field2245, class205.field2235.field2245, class205.field2237.field2245, class205.field2240.field2245, class205.field2236.field2245, class205.field2241.field2245};
		PlayerAppearance_cachedModels = new EvictingDualNodeHashTable(260);
		field3599 = new class435(16, class433.field4645);
		field3611 = 0;
	}

	public PlayerComposition() {
		this.field3598 = -1;
		this.gender = 0;
		this.field3603 = false;
	}

	@ObfuscatedSignature(
		descriptor = "(Lnb;)V"
	)
	PlayerComposition(PlayerComposition var1) {
		this.field3598 = -1;
		this.gender = 0;
		this.field3603 = false;
		int[] var2 = Arrays.copyOf(var1.equipment, var1.equipment.length);
		int[] var3 = Arrays.copyOf(var1.field3596, var1.field3596.length);
		PlayerCompositionColorTextureOverride[] var4 = (PlayerCompositionColorTextureOverride[])(var1.playerCompositionColorTextureOverrides != null ? (PlayerCompositionColorTextureOverride[])Arrays.copyOf(var1.playerCompositionColorTextureOverrides, var1.playerCompositionColorTextureOverrides.length) : null);
		int[] var5 = Arrays.copyOf(var1.bodyColors, var1.bodyColors.length);
		this.method6313(var3, var2, var4, false, var5, var1.gender, var1.npcTransformId, var1.field3598);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([I[I[Lgx;Z[IIIII)V",
		garbageValue = "-712663226"
	)
	public void method6313(int[] var1, int[] var2, PlayerCompositionColorTextureOverride[] var3, boolean var4, int[] var5, int var6, int var7, int var8) {
		this.playerCompositionColorTextureOverrides = var3;
		this.field3603 = var4;
		this.field3598 = var8;
		this.method6314(var1, var2, var5, var6, var7);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([I[I[IIIB)V",
		garbageValue = "-107"
	)
	public void method6314(int[] var1, int[] var2, int[] var3, int var4, int var5) {
		if (var1 == null) {
			var1 = this.method6318(var4);
		}

		if (var2 == null) {
			var2 = this.method6318(var4);
		}

		this.field3596 = var1;
		this.equipment = var2;
		this.bodyColors = var3;
		this.gender = var4;
		this.npcTransformId = var5;
		this.setHash();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)[I",
		garbageValue = "45"
	)
	int[] method6318(int var1) {
		int[] var2 = new int[12];

		for (int var3 = 0; var3 < 7; ++var3) {
			class228.method4438(var1, var2, var3);
		}

		return var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1628205152"
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
						var3 = class348.KitDefinition_fileCount - 1;
					}
				} else {
					++var3;
					if (var3 >= class348.KitDefinition_fileCount) {
						var3 = 0;
					}
				}

				var4 = class1.KitDefinition_get(var3);
			} while(var4 == null || var4.nonSelectable || var4.bodypartID != var1 + (this.gender == 1 ? 7 : 0));

			this.equipment[equipmentIndices[var1]] = var3 + 256;
			this.setHash();
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "-58"
	)
	public void method6317(int var1, boolean var2) {
		int var3 = this.bodyColors[var1];
		if (!var2) {
			do {
				--var3;
				if (var3 < 0) {
					var3 = class90.field1094[var1].length - 1;
				}
			} while(!class90.method2382(var1, var3));
		} else {
			do {
				++var3;
				if (var3 >= class90.field1094[var1].length) {
					var3 = 0;
				}
			} while(!class90.method2382(var1, var3));
		}

		this.bodyColors[var1] = var3;
		this.setHash();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-530024953"
	)
	public void method6322(int var1) {
		if (this.gender != var1) {
			this.method6314((int[])null, (int[])null, this.bodyColors, var1, -1);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Luj;B)V",
		garbageValue = "0"
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "226179138"
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
		this.hash += -857831361L * (long)(this.gender * -249993281);
		this.equipment[5] = var3;
		this.equipment[9] = var4;
		if (0L != var1 && this.hash != var1 || this.field3603) {
			PlayerAppearance_cachedModels.remove(var1);
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lhx;ILhx;II)Lka;",
		garbageValue = "1048858154"
	)
	@Export("getModel")
	public Model getModel(SequenceDefinition var1, int var2, SequenceDefinition var3, int var4) {
		if (this.npcTransformId != -1) {
			return VerticalAlignment.getNpcDefinition(this.npcTransformId).getModel(var1, var2, var3, var4, (NpcOverrides)null);
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
					if (var11 >= 256 && var11 < 512 && !class1.KitDefinition_get(var11 - 256).ready()) {
						var9 = true;
					}

					if (var11 >= 512 && !class214.ItemDefinition_get(var11 - 512).method3958(this.gender)) {
						var9 = true;
					}
				}

				if (var9) {
					if (this.field3608 != -1L) {
						var18 = (Model)PlayerAppearance_cachedModels.get(this.field3608);
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
							ModelData var14 = class1.KitDefinition_get(var13 - 256).getModelData();
							if (var14 != null) {
								var19[var11++] = var14;
							}
						}

						if (var13 >= 512) {
							ItemComposition var22 = class214.ItemDefinition_get(var13 - 512);
							ModelData var15 = var22.method3961(this.gender);
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

					ModelData var20 = new ModelData(var19, var11);

					for (var13 = 0; var13 < 5; ++var13) {
						if (this.bodyColors[var13] < class90.field1094[var13].length) {
							var20.recolor(WorldMapLabelSize.field2440[var13], class90.field1094[var13][this.bodyColors[var13]]);
						}

						if (this.bodyColors[var13] < field3606[var13].length) {
							var20.recolor(class503.field5015[var13], field3606[var13][this.bodyColors[var13]]);
						}
					}

					var18 = var20.toModel(64, 850, -30, -50, -30);
					PlayerAppearance_cachedModels.put(var18, var5);
					this.field3608 = var5;
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lkq;",
		garbageValue = "-468638043"
	)
	@Export("getModelData")
	ModelData getModelData() {
		if (this.npcTransformId != -1) {
			return VerticalAlignment.getNpcDefinition(this.npcTransformId).method3696((NpcOverrides)null);
		} else {
			boolean var1 = false;

			int var3;
			for (int var2 = 0; var2 < 12; ++var2) {
				var3 = this.equipment[var2];
				if (var3 >= 256 && var3 < 512 && !class1.KitDefinition_get(var3 - 256).method3607()) {
					var1 = true;
				}

				if (var3 >= 512 && !class214.ItemDefinition_get(var3 - 512).method3960(this.gender)) {
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
						var6 = class1.KitDefinition_get(var5 - 256).getKitDefinitionModels();
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}

					if (var5 >= 512) {
						var6 = class214.ItemDefinition_get(var5 - 512).method3986(this.gender);
						if (var6 != null) {
							var7[var3++] = var6;
						}
					}
				}

				ModelData var8 = new ModelData(var7, var3);

				for (var5 = 0; var5 < 5; ++var5) {
					if (this.bodyColors[var5] < class90.field1094[var5].length) {
						var8.recolor(WorldMapLabelSize.field2440[var5], class90.field1094[var5][this.bodyColors[var5]]);
					}

					if (this.bodyColors[var5] < field3606[var5].length) {
						var8.recolor(class503.field5015[var5], field3606[var5][this.bodyColors[var5]]);
					}
				}

				return var8;
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1257035370"
	)
	@Export("getChatHeadId")
	public int getChatHeadId() {
		long var1 = this.hash;
		if (this.npcTransformId != -1) {
			var1 = -65536L | (long)this.npcTransformId;
		}

		Integer var3 = (Integer)field3599.method8022(var1);
		if (var3 == null) {
			var3 = ++field3611 - 1;
			field3599.method8037(var1, var3);
			field3611 %= 65535;
		}

		return var3;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1823719371"
	)
	void method6323() {
		this.method6314(this.field3596, this.equipment, this.bodyColors, this.gender, this.npcTransformId);
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "21"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount;
		class92.method2447();
		class320.method6188();
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) {
			AccessFile.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false);
		}

		class18.addNpcsToScene(true);
		int var4 = Players.Players_count;
		int[] var5 = Players.Players_indices;

		int var6;
		for (var6 = 0; var6 < var4; ++var6) {
			if (var5[var6] != Client.combatTargetPlayerIndex && var5[var6] != Client.localPlayerIndex) {
				AccessFile.addPlayerToScene(Client.players[var5[var6]], true);
			}
		}

		class18.addNpcsToScene(false);
		class327.method6247();

		for (GraphicsObject var36 = (GraphicsObject)Client.graphicsObjects.last(); var36 != null; var36 = (GraphicsObject)Client.graphicsObjects.previous()) {
			if (var36.plane == ItemLayer.Client_plane && !var36.isFinished) {
				if (Client.cycle >= var36.cycleStart) {
					var36.advance(Client.graphicsCycle);
					if (var36.isFinished) {
						var36.remove();
					} else {
						class36.scene.drawEntity(var36.plane, var36.x, var36.y, var36.z, 60, var36, 0, -1L, false);
					}
				}
			} else {
				var36.remove();
			}
		}

		class348.setViewportShape(var0, var1, var2, var3, true);
		var0 = Client.viewportOffsetX;
		var1 = Client.viewportOffsetY;
		var2 = Client.viewportWidth;
		var3 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
		Rasterizer3D.resetRasterClipping();
		Rasterizer2D.method9630();
		var4 = Client.camAngleX;
		if (Client.field759 / 256 > var4) {
			var4 = Client.field759 / 256;
		}

		if (Client.field755[4] && Client.field704[4] + 128 > var4) {
			var4 = Client.field704[4] + 128;
		}

		int var37 = Client.camAngleY & 2047;
		var6 = LoginScreenAnimation.oculusOrbFocalPointX;
		int var7 = class12.field56;
		int var8 = ScriptFrame.oculusOrbFocalPointY;
		int var9 = class158.method3414(var4);
		var9 = class395.method7401(var9, var3);
		int var10 = 2048 - var4 & 2047;
		int var11 = 2048 - var37 & 2047;
		int var12 = 0;
		int var13 = 0;
		int var14 = var9;
		int var15;
		int var16;
		int var17;
		if (var10 != 0) {
			var15 = Rasterizer3D.Rasterizer3D_sine[var10];
			var16 = Rasterizer3D.Rasterizer3D_cosine[var10];
			var17 = var16 * var13 - var9 * var15 >> 16;
			var14 = var16 * var9 + var15 * var13 >> 16;
			var13 = var17;
		}

		if (var11 != 0) {
			var15 = Rasterizer3D.Rasterizer3D_sine[var11];
			var16 = Rasterizer3D.Rasterizer3D_cosine[var11];
			var17 = var16 * var12 + var14 * var15 >> 16;
			var14 = var16 * var14 - var12 * var15 >> 16;
			var12 = var17;
		}

		if (Client.isCameraLocked) {
			FloorOverlayDefinition.field2194 = var6 - var12;
			class323.field3490 = var7 - var13;
			Projectile.field937 = var8 - var14;
			class127.field1494 = var4;
			CollisionMap.field2370 = var37;
		} else {
			ViewportMouse.cameraX = var6 - var12;
			SecureRandomFuture.cameraY = var7 - var13;
			class36.cameraZ = var8 - var14;
			Varcs.cameraPitch = var4;
			class192.cameraYaw = var37;
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (LoginScreenAnimation.oculusOrbFocalPointX >> 7 != class229.localPlayer.x >> 7 || ScriptFrame.oculusOrbFocalPointY >> 7 != class229.localPlayer.y >> 7)) {
			var15 = class229.localPlayer.plane;
			var16 = NpcOverrides.baseX * 64 + (LoginScreenAnimation.oculusOrbFocalPointX >> 7);
			var17 = class101.baseY * 64 + (ScriptFrame.oculusOrbFocalPointY >> 7);
			PacketBufferNode var18 = class113.getPacketBufferNode(ClientPacket.field3223, Client.packetWriter.isaacCipher);
			var18.packetBuffer.writeInt(Client.field584);
			var18.packetBuffer.writeShortAddLE(var16);
			var18.packetBuffer.writeShortAddLE(var17);
			var18.packetBuffer.writeByte(var15);
			Client.packetWriter.addNode(var18);
		}

		if (!Client.isCameraLocked) {
			var10 = class306.method5913();
		} else {
			if (WorldMapIcon_1.clientPreferences.isRoofsHidden()) {
				var11 = ItemLayer.Client_plane;
			} else {
				var12 = WorldMapDecorationType.getTileHeight(ViewportMouse.cameraX, class36.cameraZ, ItemLayer.Client_plane);
				if (var12 - SecureRandomFuture.cameraY < 800 && (Tiles.Tiles_renderFlags[ItemLayer.Client_plane][ViewportMouse.cameraX >> 7][class36.cameraZ >> 7] & 4) != 0) {
					var11 = ItemLayer.Client_plane;
				} else {
					var11 = 3;
				}
			}

			var10 = var11;
		}

		var11 = ViewportMouse.cameraX;
		var12 = SecureRandomFuture.cameraY;
		var13 = class36.cameraZ;
		var14 = Varcs.cameraPitch;
		var15 = class192.cameraYaw;

		for (var16 = 0; var16 < 5; ++var16) {
			if (Client.field755[var16]) {
				var17 = (int)(Math.random() * (double)(Client.field756[var16] * 2 + 1) - (double)Client.field756[var16] + Math.sin((double)Client.field728[var16] * ((double)Client.field758[var16] / 100.0D)) * (double)Client.field704[var16]);
				if (var16 == 0) {
					ViewportMouse.cameraX += var17;
				}

				if (var16 == 1) {
					SecureRandomFuture.cameraY += var17;
				}

				if (var16 == 2) {
					class36.cameraZ += var17;
				}

				if (var16 == 3) {
					class192.cameraYaw = var17 + class192.cameraYaw & 2047;
				}

				if (var16 == 4) {
					Varcs.cameraPitch += var17;
					if (Varcs.cameraPitch < 128) {
						Varcs.cameraPitch = 128;
					}

					if (Varcs.cameraPitch > 383) {
						Varcs.cameraPitch = 383;
					}
				}
			}
		}

		var16 = MouseHandler.MouseHandler_x;
		var17 = MouseHandler.MouseHandler_y;
		if (MouseHandler.MouseHandler_lastButton != 0) {
			var16 = MouseHandler.MouseHandler_lastPressedX;
			var17 = MouseHandler.MouseHandler_lastPressedY;
		}

		if (var16 >= var0 && var16 < var0 + var2 && var17 >= var1 && var17 < var3 + var1) {
			class301.method5905(var16 - var0, var17 - var1);
		} else {
			class410.method7802();
		}

		class102.method2728();
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
		class102.method2728();
		int var38 = Rasterizer3D.get3dZoom();
		Rasterizer3D.method5189(SpriteMask.client.field170);
		Rasterizer3D.clips.field3041 = Client.viewportZoom;
		class36.scene.draw(ViewportMouse.cameraX, SecureRandomFuture.cameraY, class36.cameraZ, Varcs.cameraPitch, class192.cameraYaw, var10);
		Rasterizer3D.method5189(false);
		if (Client.z) {
			Rasterizer2D.method9664();
		}

		Rasterizer3D.clips.field3041 = var38;
		class102.method2728();
		class36.scene.clearTempGameObjects();
		Client.overheadTextCount = 0;
		boolean var19 = false;
		int var20 = -1;
		int var21 = -1;
		int var22 = Players.Players_count;
		int[] var23 = Players.Players_indices;

		int var24;
		for (var24 = 0; var24 < var22 + Client.npcCount; ++var24) {
			Object var40;
			if (var24 < var22) {
				var40 = Client.players[var23[var24]];
				if (var23[var24] == Client.combatTargetPlayerIndex) {
					var19 = true;
					var20 = var24;
					continue;
				}

				if (var40 == class229.localPlayer) {
					var21 = var24;
					continue;
				}
			} else {
				var40 = Client.npcs[Client.npcIndices[var24 - var22]];
			}

			class171.drawActor2d((Actor)var40, var24, var0, var1, var2, var3);
		}

		if (Client.renderSelf && var21 != -1) {
			class171.drawActor2d(class229.localPlayer, var21, var0, var1, var2, var3);
		}

		if (var19) {
			class171.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var20, var0, var1, var2, var3);
		}

		for (var24 = 0; var24 < Client.overheadTextCount; ++var24) {
			int var25 = Client.overheadTextXs[var24];
			int var26 = Client.overheadTextYs[var24];
			int var27 = Client.overheadTextXOffsets[var24];
			int var28 = Client.overheadTextAscents[var24];
			boolean var29 = true;

			while (var29) {
				var29 = false;

				for (int var39 = 0; var39 < var24; ++var39) {
					if (var26 + 2 > Client.overheadTextYs[var39] - Client.overheadTextAscents[var39] && var26 - var28 < Client.overheadTextYs[var39] + 2 && var25 - var27 < Client.overheadTextXOffsets[var39] + Client.overheadTextXs[var39] && var27 + var25 > Client.overheadTextXs[var39] - Client.overheadTextXOffsets[var39] && Client.overheadTextYs[var39] - Client.overheadTextAscents[var39] < var26) {
						var26 = Client.overheadTextYs[var39] - Client.overheadTextAscents[var39];
						var29 = true;
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var24];
			Client.viewportTempY = Client.overheadTextYs[var24] = var26;
			String var30 = Client.overheadText[var24];
			if (Client.chatEffects == 0) {
				int var31 = 16776960;
				if (Client.overheadTextColors[var24] < 6) {
					var31 = Client.field483[Client.overheadTextColors[var24]];
				}

				if (Client.overheadTextColors[var24] == 6) {
					var31 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var24] == 7) {
					var31 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var24] == 8) {
					var31 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var32;
				if (Client.overheadTextColors[var24] == 9) {
					var32 = 150 - Client.overheadTextCyclesRemaining[var24];
					if (var32 < 50) {
						var31 = var32 * 1280 + 16711680;
					} else if (var32 < 100) {
						var31 = 16776960 - (var32 - 50) * 327680;
					} else if (var32 < 150) {
						var31 = (var32 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var24] == 10) {
					var32 = 150 - Client.overheadTextCyclesRemaining[var24];
					if (var32 < 50) {
						var31 = var32 * 5 + 16711680;
					} else if (var32 < 100) {
						var31 = 16711935 - (var32 - 50) * 327680;
					} else if (var32 < 150) {
						var31 = (var32 - 100) * 327680 + 255 - (var32 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var24] == 11) {
					var32 = 150 - Client.overheadTextCyclesRemaining[var24];
					if (var32 < 50) {
						var31 = 16777215 - var32 * 327685;
					} else if (var32 < 100) {
						var31 = (var32 - 50) * 327685 + 65280;
					} else if (var32 < 150) {
						var31 = 16777215 - (var32 - 100) * 327680;
					}
				}

				int var33;
				if (Client.overheadTextColors[var24] == 12 && Client.field597[var24] == null) {
					var32 = var30.length();
					Client.field597[var24] = new int[var32];

					for (var33 = 0; var33 < var32; ++var33) {
						int var34 = (int)((float)var33 / (float)var32 * 64.0F);
						int var35 = var34 << 10 | 896 | 64;
						Client.field597[var24][var33] = class478.field4836[var35];
					}
				}

				if (Client.overheadTextEffects[var24] == 0) {
					GrandExchangeOfferTotalQuantityComparator.fontBold12.method7678(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, var31, 0, Client.field597[var24]);
				}

				if (Client.overheadTextEffects[var24] == 1) {
					GrandExchangeOfferTotalQuantityComparator.fontBold12.method7709(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, var31, 0, Client.viewportDrawCount, Client.field597[var24]);
				}

				if (Client.overheadTextEffects[var24] == 2) {
					GrandExchangeOfferTotalQuantityComparator.fontBold12.method7676(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, var31, 0, Client.viewportDrawCount, Client.field597[var24]);
				}

				if (Client.overheadTextEffects[var24] == 3) {
					GrandExchangeOfferTotalQuantityComparator.fontBold12.method7677(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, var31, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var24], Client.field597[var24]);
				}

				if (Client.overheadTextEffects[var24] == 4) {
					var32 = (150 - Client.overheadTextCyclesRemaining[var24]) * (GrandExchangeOfferTotalQuantityComparator.fontBold12.stringWidth(var30) + 100) / 150;
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1);
					GrandExchangeOfferTotalQuantityComparator.fontBold12.method7679(var30, var0 + Client.viewportTempX + 50 - var32, Client.viewportTempY + var1, var31, 0, Client.field597[var24]);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}

				if (Client.overheadTextEffects[var24] == 5) {
					var32 = 150 - Client.overheadTextCyclesRemaining[var24];
					var33 = 0;
					if (var32 < 25) {
						var33 = var32 - 25;
					} else if (var32 > 125) {
						var33 = var32 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - GrandExchangeOfferTotalQuantityComparator.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5);
					GrandExchangeOfferTotalQuantityComparator.fontBold12.method7678(var30, var0 + Client.viewportTempX, var33 + Client.viewportTempY + var1, var31, 0, Client.field597[var24]);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}
			} else {
				GrandExchangeOfferTotalQuantityComparator.fontBold12.drawCentered(var30, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0);
			}
		}

		if (Client.hintArrowType == 2) {
			class514.worldToScreen((Client.hintArrowX - NpcOverrides.baseX * 64 << 7) + Client.hintArrowSubX * 4096, Client.hintArrowSubY * 64 + (Client.hintArrowY - class101.baseY * 64 << 7), Client.hintArrowHeight * 4);
			if (Client.viewportTempX > -1 && Client.cycle % 20 < 10) {
				class60.headIconHintSprites[0].drawTransBgAt(var0 + Client.viewportTempX - 12, Client.viewportTempY + var1 - 28);
			}
		}

		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).animate(Client.graphicsCycle);
		Client.field736 = 0;
		int var41 = NpcOverrides.baseX * 64 + (class229.localPlayer.x >> 7);
		var20 = class101.baseY * 64 + (class229.localPlayer.y >> 7);
		if (var41 >= 3053 && var41 <= 3156 && var20 >= 3056 && var20 <= 3136) {
			Client.field736 = 1;
		}

		if (var41 >= 3072 && var41 <= 3118 && var20 >= 9492 && var20 <= 9535) {
			Client.field736 = 1;
		}

		if (Client.field736 == 1 && var41 >= 3139 && var41 <= 3199 && var20 >= 3008 && var20 <= 3062) {
			Client.field736 = 0;
		}

		ViewportMouse.cameraX = var11;
		SecureRandomFuture.cameraY = var12;
		class36.cameraZ = var13;
		Varcs.cameraPitch = var14;
		class192.cameraYaw = var15;
		if (Client.isLoading && WorldMapSectionType.field2556.method7052(true, false) == 0) {
			Client.isLoading = false;
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
			LoginPacket.drawLoadingMessage("Loading - please wait.", false);
		}

	}
}
