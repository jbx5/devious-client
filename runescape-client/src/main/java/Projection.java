import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ln")
@Implements("Projection")
public abstract class Projection {
	Projection() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lkt;IIIIJ)V"
	)
	@Export("draw")
	abstract void draw(Renderable var1, int var2, int var3, int var4, int var5, long var6);

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lkq;Llt;IIII)V",
		garbageValue = "1938115394"
	)
	@Export("drawTileUnderlay")
	abstract void drawTileUnderlay(Scene var1, SceneTilePaint var2, int var3, int var4, int var5);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lkq;Llw;IIB)V",
		garbageValue = "112"
	)
	@Export("drawTileOverlay")
	abstract void drawTileOverlay(Scene var1, SceneTileModel var2, int var3, int var4);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lkq;Llt;IIIIIIIIIIIIIIB)V",
		garbageValue = "18"
	)
	@Export("drawSceneTilePaint")
	void drawSceneTilePaint(Scene var1, SceneTilePaint var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16) {
		int var17 = Rasterizer3D.getClipMidX() + var5 * Rasterizer3D.get3dZoom() / var13;
		int var18 = Rasterizer3D.getClipMidY() + var9 * Rasterizer3D.get3dZoom() / var13;
		int var19 = Rasterizer3D.getClipMidX() + var6 * Rasterizer3D.get3dZoom() / var14;
		int var20 = Rasterizer3D.getClipMidY() + var10 * Rasterizer3D.get3dZoom() / var14;
		int var21 = Rasterizer3D.getClipMidX() + var7 * Rasterizer3D.get3dZoom() / var15;
		int var22 = Rasterizer3D.getClipMidY() + var11 * Rasterizer3D.get3dZoom() / var15;
		int var23 = Rasterizer3D.getClipMidX() + var8 * Rasterizer3D.get3dZoom() / var16;
		int var24 = Rasterizer3D.getClipMidY() + var12 * Rasterizer3D.get3dZoom() / var16;
		float var25 = class386.method7177(var13);
		float var26 = class386.method7177(var14);
		float var27 = class386.method7177(var15);
		float var28 = class386.method7177(var16);
		Rasterizer3D.clips.field3186 = 0;
		int var29;
		int var30;
		if ((var20 - var24) * (var21 - var23) - (var19 - var23) * (var22 - var24) > 0) {
			Rasterizer3D.clips.field3192 = false;
			var29 = Rasterizer3D.method5258();
			if (var21 < 0 || var23 < 0 || var19 < 0 || var21 > var29 || var23 > var29 || var19 > var29) {
				Rasterizer3D.clips.field3192 = true;
			}

			if (var1.checkClick && Scene.containsBounds(var1.Scene_selectedScreenX, var1.Scene_selectedScreenY, var22, var24, var20, var21, var23, var19)) {
				var1.baseX = var3;
				var1.baseY = var4;
			}

			if (var2.texture == -1) {
				if (var2.neColor != 12345678) {
					Rasterizer3D.rasterGouraud(var22, var24, var20, var21, var23, var19, var27, var28, var26, var2.neColor, var2.nwColor, var2.seColor);
				}
			} else if (!Scene.Scene_isLowDetail) {
				if (var2.isFlat) {
					Rasterizer3D.method5268(var22, var24, var20, var21, var23, var19, var27, var28, var26, var2.neColor, var2.nwColor, var2.seColor, var5, var6, var8, var9, var10, var12, var13, var14, var16, var2.texture);
				} else {
					Rasterizer3D.method5268(var22, var24, var20, var21, var23, var19, var27, var28, var26, var2.neColor, var2.nwColor, var2.seColor, var7, var8, var6, var11, var12, var10, var15, var16, var14, var2.texture);
				}
			} else {
				var30 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture);
				Rasterizer3D.rasterGouraud(var22, var24, var20, var21, var23, var19, var27, var28, var26, Scene.method5643(var30, var2.neColor), Scene.method5643(var30, var2.nwColor), Scene.method5643(var30, var2.seColor));
			}
		}

		if ((var24 - var20) * (var17 - var19) - (var23 - var19) * (var18 - var20) > 0) {
			Rasterizer3D.clips.field3192 = false;
			var29 = Rasterizer3D.method5258();
			if (var17 < 0 || var19 < 0 || var23 < 0 || var17 > var29 || var19 > var29 || var23 > var29) {
				Rasterizer3D.clips.field3192 = true;
			}

			if (var1.checkClick && Scene.containsBounds(var1.Scene_selectedScreenX, var1.Scene_selectedScreenY, var18, var20, var24, var17, var19, var23)) {
				var1.baseX = var3;
				var1.baseY = var4;
			}

			if (var2.texture == -1) {
				if (var2.swColor != 12345678) {
					Rasterizer3D.rasterGouraud(var18, var20, var24, var17, var19, var23, var25, var26, var28, var2.swColor, var2.seColor, var2.nwColor);
				}
			} else if (!Scene.Scene_isLowDetail) {
				Rasterizer3D.method5268(var18, var20, var24, var17, var19, var23, var25, var26, var28, var2.swColor, var2.seColor, var2.nwColor, var5, var6, var8, var9, var10, var12, var13, var14, var16, var2.texture);
			} else {
				var30 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture);
				Rasterizer3D.rasterGouraud(var18, var20, var24, var17, var19, var23, var25, var26, var28, Scene.method5643(var30, var2.swColor), Scene.method5643(var30, var2.seColor), Scene.method5643(var30, var2.nwColor));
			}
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lkq;Llw;III)V",
		garbageValue = "-632574121"
	)
	@Export("drawSceneTileModel")
	void drawSceneTileModel(Scene var1, SceneTileModel var2, int var3, int var4) {
		Rasterizer3D.clips.field3186 = 0;
		int var5 = var2.faceX.length;

		for (int var6 = 0; var6 < var5; ++var6) {
			int var7 = var2.faceX[var6];
			int var8 = var2.faceY[var6];
			int var9 = var2.faceZ[var6];
			int var10 = SceneTileModel.field3065[var7];
			int var11 = SceneTileModel.field3065[var8];
			int var12 = SceneTileModel.field3065[var9];
			int var13 = SceneTileModel.field3073[var7];
			int var14 = SceneTileModel.field3073[var8];
			int var15 = SceneTileModel.field3073[var9];
			float var16 = SceneTileModel.field3072[var7];
			float var17 = SceneTileModel.field3072[var8];
			float var18 = SceneTileModel.field3072[var9];
			if ((var10 - var11) * (var15 - var14) - (var13 - var14) * (var12 - var11) > 0) {
				Rasterizer3D.clips.field3192 = false;
				int var19 = Rasterizer3D.method5258();
				if (var10 < 0 || var11 < 0 || var12 < 0 || var10 > var19 || var11 > var19 || var12 > var19) {
					Rasterizer3D.clips.field3192 = true;
				}

				if (var1.checkClick && Scene.containsBounds(var1.Scene_selectedScreenX, var1.Scene_selectedScreenY, var13, var14, var15, var10, var11, var12)) {
					var1.baseX = var3;
					var1.baseY = var4;
				}

				if (var2.triangleTextureId != null && var2.triangleTextureId[var6] != -1) {
					if (!Scene.Scene_isLowDetail) {
						if (var2.isFlat) {
							Rasterizer3D.method5268(var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.triangleColorA[var6], var2.triangleColorB[var6], var2.triangleColorC[var6], SceneTileModel.field3063[0], SceneTileModel.field3063[1], SceneTileModel.field3063[3], SceneTileModel.field3075[0], SceneTileModel.field3075[1], SceneTileModel.field3075[3], SceneTileModel.field3076[0], SceneTileModel.field3076[1], SceneTileModel.field3076[3], var2.triangleTextureId[var6]);
						} else {
							Rasterizer3D.method5268(var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.triangleColorA[var6], var2.triangleColorB[var6], var2.triangleColorC[var6], SceneTileModel.field3063[var7], SceneTileModel.field3063[var8], SceneTileModel.field3063[var9], SceneTileModel.field3075[var7], SceneTileModel.field3075[var8], SceneTileModel.field3075[var9], SceneTileModel.field3076[var7], SceneTileModel.field3076[var8], SceneTileModel.field3076[var9], var2.triangleTextureId[var6]);
						}
					} else {
						int var20 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.triangleTextureId[var6]);
						Rasterizer3D.rasterGouraud(var13, var14, var15, var10, var11, var12, var16, var17, var18, Scene.method5643(var20, var2.triangleColorA[var6]), Scene.method5643(var20, var2.triangleColorB[var6]), Scene.method5643(var20, var2.triangleColorC[var6]));
					}
				} else if (var2.triangleColorA[var6] != 12345678) {
					Rasterizer3D.rasterGouraud(var13, var14, var15, var10, var11, var12, var16, var17, var18, var2.triangleColorA[var6], var2.triangleColorB[var6], var2.triangleColorC[var6]);
				}
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZB)[B",
		garbageValue = "-80"
	)
	public static byte[] method5745(Object var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var3 = (byte[])((byte[])var0);
			return var1 ? PlayerCompositionColorTextureOverride.method3539(var3) : var3;
		} else if (var0 instanceof AbstractByteArrayCopier) {
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0;
			return var2.get();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "0"
	)
	static void method5744(int var0, int var1, int var2, int var3) {
		Widget var4 = ModeWhere.widgetDefinition.getWidgetChild(var0, var1);
		if (var4 != null && var4.onTargetEnter != null) {
			ScriptEvent var5 = new ScriptEvent();
			var5.widget = var4;
			var5.args = var4.onTargetEnter;
			Projectile.runScriptEvent(var5);
		}

		Client.selectedSpellItemId = var3;
		Client.isSpellSelected = true;
		Message.selectedSpellWidget = var0;
		Client.selectedSpellChildIndex = var1;
		class92.selectedSpellFlags = var2;
		TriBool.invalidateWidget(var4);
	}

	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1618135967"
	)
	static final void method5746(int var0, int var1) {
		if (Client.currentClanChannels[var0] != null) {
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3501()) {
				ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
				if (var2.rank == -1) {
					PacketBufferNode var3 = class170.getPacketBufferNode(ClientPacket.field3286, Client.packetWriter.isaacCipher);
					var3.packetBuffer.writeByte(3 + Actor.stringCp1252NullTerminatedByteSize(var2.username.getName()));
					var3.packetBuffer.writeByte(var0);
					var3.packetBuffer.writeShort(var1);
					var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName());
					Client.packetWriter.addNode(var3);
				}
			}
		}
	}
}
