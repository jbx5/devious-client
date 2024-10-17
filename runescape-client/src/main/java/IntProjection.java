import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
@Implements("IntProjection")
public class IntProjection extends Projection {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 280474237
	)
	@Export("cameraX")
	int cameraX;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1972146501
	)
	@Export("cameraY")
	int cameraY;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1360372297
	)
	@Export("cameraZ")
	int cameraZ;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 919856549
	)
	@Export("cameraPitch")
	int cameraPitch;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 2105978325
	)
	@Export("cameraYaw")
	int cameraYaw;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1550738849
	)
	@Export("pitchSin")
	int pitchSin;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1902355461
	)
	@Export("pitchCos")
	int pitchCos;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1762594603
	)
	@Export("yawSin")
	int yawSin;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1012244489
	)
	@Export("yawCos")
	int yawCos;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -74775619
	)
	int field2606;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1650200083
	)
	int field2600;

	IntProjection(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.cameraX = var1;
		this.cameraY = var2;
		this.cameraZ = var3;
		this.cameraPitch = var4;
		this.cameraYaw = var5;
		this.pitchSin = Rasterizer3D.Rasterizer3D_sine[var4];
		this.pitchCos = Rasterizer3D.Rasterizer3D_cosine[var4];
		this.yawSin = Rasterizer3D.Rasterizer3D_sine[var5];
		this.yawCos = Rasterizer3D.Rasterizer3D_cosine[var5];
		this.field2606 = var6;
		this.field2600 = var7;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljv;IIIIJ)V"
	)
	@Export("draw")
	void draw(Renderable var1, int var2, int var3, int var4, int var5, long var6) {
		var1.vmethod5375(var2, this.cameraPitch, this.cameraYaw, var3, var4, var5, this.cameraX, this.cameraY, this.cameraZ, var6, this.field2606, this.field2600, false);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lji;Ljp;IIII)V",
		garbageValue = "1119299330"
	)
	@Export("drawTileUnderlay")
	void drawTileUnderlay(Scene var1, SceneTilePaint var2, int var3, int var4, int var5) {
		int var6;
		int var7 = var6 = (var4 << 7) - this.cameraX;
		int var8;
		int var9 = var8 = (var5 << 7) - this.cameraZ;
		int var10;
		int var11 = var10 = var7 + 128;
		int var12;
		int var13 = var12 = var9 + 128;
		int var14 = var1.tileHeights[var3][var4][var5] - this.cameraY;
		int var15 = var1.tileHeights[var3][var4 + 1][var5] - this.cameraY;
		int var16 = var1.tileHeights[var3][var4 + 1][var5 + 1] - this.cameraY;
		int var17 = var1.tileHeights[var3][var4][var5 + 1] - this.cameraY;
		int var18 = var7 * this.yawCos + var9 * this.yawSin >> 16;
		var9 = var9 * this.yawCos - var7 * this.yawSin >> 16;
		var7 = var18;
		var18 = var14 * this.pitchCos - var9 * this.pitchSin >> 16;
		var9 = var14 * this.pitchSin + var9 * this.pitchCos >> 16;
		var14 = var18;
		if (var9 >= 50) {
			var18 = var8 * this.yawSin + var11 * this.yawCos >> 16;
			var8 = var8 * this.yawCos - var11 * this.yawSin >> 16;
			var11 = var18;
			var18 = var15 * this.pitchCos - var8 * this.pitchSin >> 16;
			var8 = var15 * this.pitchSin + var8 * this.pitchCos >> 16;
			var15 = var18;
			if (var8 >= 50) {
				var18 = var10 * this.yawCos + var13 * this.yawSin >> 16;
				var13 = var13 * this.yawCos - var10 * this.yawSin >> 16;
				var10 = var18;
				var18 = var16 * this.pitchCos - var13 * this.pitchSin >> 16;
				var13 = var16 * this.pitchSin + var13 * this.pitchCos >> 16;
				var16 = var18;
				if (var13 >= 50) {
					var18 = var6 * this.yawCos + var12 * this.yawSin >> 16;
					var12 = var12 * this.yawCos - var6 * this.yawSin >> 16;
					var6 = var18;
					var18 = var17 * this.pitchCos - var12 * this.pitchSin >> 16;
					var12 = var12 * this.pitchCos + var17 * this.pitchSin >> 16;
					if (var12 >= 50) {
						this.drawSceneTilePaint(var1, var2, var4, var5, var7, var11, var10, var6, var14, var15, var16, var18, var9, var8, var13, var12);
					}
				}
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lji;Ljs;IIB)V",
		garbageValue = "81"
	)
	@Export("drawTileOverlay")
	void drawTileOverlay(Scene var1, SceneTileModel var2, int var3, int var4) {
		int var5 = var2.vertexX.length;

		for (int var6 = 0; var6 < var5; ++var6) {
			int var7 = var2.vertexX[var6] - this.cameraX;
			int var8 = var2.vertexY[var6] - this.cameraY;
			int var9 = var2.vertexZ[var6] - this.cameraZ;
			int var10 = var9 * this.yawSin + var7 * this.yawCos >> 16;
			var9 = var9 * this.yawCos - var7 * this.yawSin >> 16;
			var7 = var10;
			var10 = var8 * this.pitchCos - var9 * this.pitchSin >> 16;
			var9 = var8 * this.pitchSin + var9 * this.pitchCos >> 16;
			if (var9 < 50) {
				return;
			}

			if (var2.triangleTextureId != null) {
				SceneTileModel.triangleTexturesX[var6] = var7;
				SceneTileModel.triangleTexturesY[var6] = var10;
				SceneTileModel.triangleTexturesZ[var6] = var9;
			}

			SceneTileModel.verticesX[var6] = Rasterizer3D.getClipMidX() + var7 * Rasterizer3D.get3dZoom() / var9;
			SceneTileModel.verticesY[var6] = Rasterizer3D.getClipMidY() + var10 * Rasterizer3D.get3dZoom() / var9;
			SceneTileModel.verticesZ[var6] = class197.method4057(var9);
		}

		this.drawSceneTileModel(var1, var2, var3, var4);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([FIFZFZ[FI)I",
		garbageValue = "1350563286"
	)
	public static int method4899(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
		float var7 = 0.0F;

		for (int var8 = 0; var8 < var1 + 1; ++var8) {
			var7 += Math.abs(var0[var8]);
		}

		float var44 = (Math.abs(var2) + Math.abs(var4)) * (float)(var1 + 1) * class133.field1547;
		if (var7 <= var44) {
			return -1;
		} else {
			float[] var9 = new float[var1 + 1];

			int var10;
			for (var10 = 0; var10 < var1 + 1; ++var10) {
				var9[var10] = 1.0F / var7 * var0[var10];
			}

			while (Math.abs(var9[var1]) < var44) {
				--var1;
			}

			var10 = 0;
			if (var1 == 0) {
				return var10;
			} else if (var1 == 1) {
				var6[0] = -var9[0] / var9[1];
				boolean var42 = var3 ? var2 < var6[0] + var44 : var2 < var6[0] - var44;
				boolean var43 = var5 ? var4 > var6[0] - var44 : var4 > var44 + var6[0];
				var10 = var42 && var43 ? 1 : 0;
				if (var10 > 0) {
					if (var3 && var6[0] < var2) {
						var6[0] = var2;
					} else if (var5 && var6[0] > var4) {
						var6[0] = var4;
					}
				}

				return var10;
			} else {
				class430 var11 = new class430(var9, var1);
				float[] var12 = new float[var1 + 1];

				for (int var13 = 1; var13 <= var1; ++var13) {
					var12[var13 - 1] = (float)var13 * var9[var13];
				}

				float[] var41 = new float[var1 + 1];
				int var14 = method4899(var12, var1 - 1, var2, false, var4, false, var41);
				if (var14 == -1) {
					return 0;
				} else {
					boolean var15 = false;
					float var17 = 0.0F;
					float var18 = 0.0F;
					float var19 = 0.0F;

					for (int var20 = 0; var20 <= var14; ++var20) {
						if (var10 > var1) {
							return var10;
						}

						float var16;
						if (var20 == 0) {
							var16 = var2;
							var18 = InterfaceParent.method2561(var9, var1, var2);
							if (Math.abs(var18) <= var44 && var3) {
								var6[var10++] = var2;
							}
						} else {
							var16 = var19;
							var18 = var17;
						}

						if (var14 == var20) {
							var19 = var4;
							var15 = false;
						} else {
							var19 = var41[var20];
						}

						var17 = InterfaceParent.method2561(var9, var1, var19);
						if (var15) {
							var15 = false;
						} else if (Math.abs(var17) < var44) {
							if (var20 != var14 || var5) {
								var6[var10++] = var19;
								var15 = true;
							}
						} else if (var18 < 0.0F && var17 > 0.0F || var18 > 0.0F && var17 < 0.0F) {
							int var22 = var10++;
							float var24 = var16;
							float var25 = var19;
							float var26 = InterfaceParent.method2561(var11.field4801, var11.field4800, var16);
							float var23;
							if (Math.abs(var26) < class133.field1547) {
								var23 = var16;
							} else {
								float var27 = InterfaceParent.method2561(var11.field4801, var11.field4800, var19);
								if (Math.abs(var27) < class133.field1547) {
									var23 = var19;
								} else {
									float var28 = 0.0F;
									float var29 = 0.0F;
									float var30 = 0.0F;
									float var35 = 0.0F;
									boolean var36 = true;
									boolean var37 = false;

									do {
										var37 = false;
										if (var36) {
											var28 = var24;
											var35 = var26;
											var29 = var25 - var24;
											var30 = var29;
											var36 = false;
										}

										if (Math.abs(var35) < Math.abs(var27)) {
											var24 = var25;
											var25 = var28;
											var28 = var24;
											var26 = var27;
											var27 = var35;
											var35 = var26;
										}

										float var38 = class133.field1552 * Math.abs(var25) + 0.0F;
										float var39 = 0.5F * (var28 - var25);
										boolean var40 = Math.abs(var39) > var38 && var27 != 0.0F;
										if (var40) {
											if (Math.abs(var30) >= var38 && Math.abs(var26) > Math.abs(var27)) {
												float var34 = var27 / var26;
												float var31;
												float var32;
												if (var28 == var24) {
													var31 = 2.0F * var39 * var34;
													var32 = 1.0F - var34;
												} else {
													var32 = var26 / var35;
													float var33 = var27 / var35;
													var31 = var34 * ((var32 - var33) * var32 * var39 * 2.0F - (var33 - 1.0F) * (var25 - var24));
													var32 = (var33 - 1.0F) * (var32 - 1.0F) * (var34 - 1.0F);
												}

												if ((double)var31 > 0.0D) {
													var32 = -var32;
												} else {
													var31 = -var31;
												}

												var34 = var30;
												var30 = var29;
												if (2.0F * var31 < var32 * 3.0F * var39 - Math.abs(var32 * var38) && var31 < Math.abs(0.5F * var34 * var32)) {
													var29 = var31 / var32;
												} else {
													var29 = var39;
													var30 = var39;
												}
											} else {
												var29 = var39;
												var30 = var39;
											}

											var24 = var25;
											var26 = var27;
											if (Math.abs(var29) > var38) {
												var25 += var29;
											} else if ((double)var39 > 0.0D) {
												var25 += var38;
											} else {
												var25 -= var38;
											}

											var27 = InterfaceParent.method2561(var11.field4801, var11.field4800, var25);
											if ((double)(var27 * (var35 / Math.abs(var35))) > 0.0D) {
												var36 = true;
												var37 = true;
											} else {
												var37 = true;
											}
										}
									} while(var37);

									var23 = var25;
								}
							}

							var6[var22] = var23;
							if (var10 > 1 && var6[var10 - 2] >= var6[var10 - 1] - var44) {
								var6[var10 - 2] = (var6[var10 - 1] + var6[var10 - 2]) * 0.5F;
								--var10;
							}
						}
					}

					return var10;
				}
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "([FI)V",
		garbageValue = "-410409798"
	)
	static void method4900(float[] var0) {
		var0[1] = 1.0F - var0[1];
		if (var0[0] < 0.0F) {
			var0[0] = 0.0F;
		}

		if (var0[1] < 0.0F) {
			var0[1] = 0.0F;
		}

		if (var0[0] > 1.0F || var0[1] > 1.0F) {
			float var1 = var0[0] * (var0[1] + (var0[0] - 2.0F)) + var0[1] * (var0[1] - 2.0F) + 1.0F;
			if (var1 + class133.field1547 > 0.0F) {
				HttpRequestTask.method282(var0);
			}
		}

		var0[1] = 1.0F - var0[1];
	}
}
