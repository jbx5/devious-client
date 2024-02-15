import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
public class class148 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = 516388591765987837L
	)
	long field1690;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -932184463
	)
	public int field1686;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	IterableNodeDeque field1684;

	@ObfuscatedSignature(
		descriptor = "(Luq;)V"
	)
	public class148(Buffer var1) {
		this.field1686 = -1;
		this.field1684 = new IterableNodeDeque();
		this.method3250(var1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "1872970638"
	)
	void method3250(Buffer var1) {
		this.field1690 = var1.readLong();
		this.field1686 = var1.readInt();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 3) {
				var3 = new class167(this);
			} else if (var2 == 1) {
				var3 = new LoginPacket(this);
			} else if (var2 == 13) {
				var3 = new class160(this);
			} else if (var2 == 4) {
				var3 = new class152(this);
			} else if (var2 == 6) {
				var3 = new class159(this);
			} else if (var2 == 5) {
				var3 = new class144(this);
			} else if (var2 == 2) {
				var3 = new class149(this);
			} else if (var2 == 7) {
				var3 = new class142(this);
			} else if (var2 == 14) {
				var3 = new class146(this);
			} else if (var2 == 8) {
				var3 = new class163(this);
			} else if (var2 == 9) {
				var3 = new class169(this);
			} else if (var2 == 10) {
				var3 = new class155(this);
			} else if (var2 == 11) {
				var3 = new class150(this);
			} else if (var2 == 12) {
				var3 = new class154(this);
			} else {
				if (var2 != 15) {
					throw new RuntimeException("");
				}

				var3 = new class164(this);
			}

			((class145)var3).vmethod3512(var1);
			this.field1684.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "-137780697"
	)
	public void method3245(ClanSettings var1) {
		if (var1.field1744 == this.field1690 && this.field1686 == var1.field1754) {
			for (class145 var2 = (class145)this.field1684.last(); var2 != null; var2 = (class145)this.field1684.previous()) {
				var2.vmethod3513(var1);
			}

			++var1.field1754;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1271412777"
	)
	public static int method3252(int var0, int var1) {
		int var2;
		for (var2 = 1; var1 > 1; var1 >>= 1) {
			if ((var1 & 1) != 0) {
				var2 = var0 * var2;
			}

			var0 *= var0;
		}

		if (var1 == 1) {
			return var0 * var2;
		} else {
			return var2;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([FIFZFZ[FI)I",
		garbageValue = "-176509577"
	)
	public static int method3244(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
		float var7 = 0.0F;

		for (int var8 = 0; var8 < var1 + 1; ++var8) {
			var7 += Math.abs(var0[var8]);
		}

		float var44 = (Math.abs(var2) + Math.abs(var4)) * (float)(var1 + 1) * class128.field1512;
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
				boolean var43 = var5 ? var4 > var6[0] - var44 : var4 > var6[0] + var44;
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
				class471 var11 = new class471(var9, var1);
				float[] var12 = new float[var1 + 1];

				for (int var13 = 1; var13 <= var1; ++var13) {
					var12[var13 - 1] = var9[var13] * (float)var13;
				}

				float[] var41 = new float[var1 + 1];
				int var14 = method3244(var12, var1 - 1, var2, false, var4, false, var41);
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
							var18 = class361.method6995(var9, var1, var2);
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

						var17 = class361.method6995(var9, var1, var19);
						if (var15) {
							var15 = false;
						} else if (Math.abs(var17) < var44) {
							if (var14 != var20 || var5) {
								var6[var10++] = var19;
								var15 = true;
							}
						} else if (var18 < 0.0F && var17 > 0.0F || var18 > 0.0F && var17 < 0.0F) {
							int var22 = var10++;
							float var24 = var16;
							float var25 = var19;
							float var26 = class361.method6995(var11.field4861, var11.field4860, var16);
							float var23;
							if (Math.abs(var26) < class128.field1512) {
								var23 = var16;
							} else {
								float var27 = class361.method6995(var11.field4861, var11.field4860, var19);
								if (Math.abs(var27) < class128.field1512) {
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

										float var38 = class128.field1519 * Math.abs(var25) + 0.0F;
										float var39 = 0.5F * (var28 - var25);
										boolean var40 = Math.abs(var39) > var38 && var27 != 0.0F;
										if (var40) {
											if (Math.abs(var30) >= var38 && Math.abs(var26) > Math.abs(var27)) {
												float var34 = var27 / var26;
												float var31;
												float var32;
												if (var24 == var28) {
													var31 = var39 * 2.0F * var34;
													var32 = 1.0F - var34;
												} else {
													var32 = var26 / var35;
													float var33 = var27 / var35;
													var31 = (var32 * 2.0F * var39 * (var32 - var33) - (var33 - 1.0F) * (var25 - var24)) * var34;
													var32 = (var32 - 1.0F) * (var33 - 1.0F) * (var34 - 1.0F);
												}

												if ((double)var31 > 0.0D) {
													var32 = -var32;
												} else {
													var31 = -var31;
												}

												var34 = var30;
												var30 = var29;
												if (2.0F * var31 < var39 * 3.0F * var32 - Math.abs(var32 * var38) && var31 < Math.abs(0.5F * var34 * var32)) {
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

											var27 = class361.method6995(var11.field4861, var11.field4860, var25);
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
								var6[var10 - 2] = (var6[var10 - 2] + var6[var10 - 1]) * 0.5F;
								--var10;
							}
						}
					}

					return var10;
				}
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgf;",
		garbageValue = "-117"
	)
	@Export("VarpDefinition_get")
	public static VarpDefinition VarpDefinition_get(int var0) {
		VarpDefinition var1 = (VarpDefinition)VarpDefinition.VarpDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarpDefinition.VarpDefinition_archive.takeFile(16, var0);
			var1 = new VarpDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			VarpDefinition.VarpDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1867819672"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		if (!class193.client.containsAccessAndRefreshToken() && !class193.client.method1216() && !class193.client.containsSessionAndCharacterId()) {
			Login.Login_response1 = "";
			Login.Login_response2 = "Enter your username/email & password.";
			Login.Login_response3 = "";
			JagexCache.method4224(2);
			if (var0) {
				Login.Login_password = "";
			}

			LoginPacket.method3203();
			Message.method1182();
		} else {
			JagexCache.method4224(10);
		}
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(IIIIZI)V",
		garbageValue = "-1677901050"
	)
	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) {
			var2 = 1;
		}

		if (var3 < 1) {
			var3 = 1;
		}

		int var5 = var3 - 334;
		int var6;
		if (var5 < 0) {
			var6 = Client.field724;
		} else if (var5 >= 100) {
			var6 = Client.field803;
		} else {
			var6 = (Client.field803 - Client.field724) * var5 / 100 + Client.field724;
		}

		int var7 = var3 * var6 * 512 / (var2 * 334);
		int var8;
		int var9;
		short var14;
		if (var7 < Client.field722) {
			var14 = Client.field722;
			var6 = var14 * var2 * 334 / (var3 * 512);
			if (var6 > Client.field807) {
				var6 = Client.field807;
				var8 = var3 * var6 * 512 / (var14 * 334);
				var9 = (var2 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0 + var2 - var9, var1, var9, var3, -16777216);
				}

				var0 += var9;
				var2 -= var9 * 2;
			}
		} else if (var7 > Client.field809) {
			var14 = Client.field809;
			var6 = var14 * var2 * 334 / (var3 * 512);
			if (var6 < Client.field806) {
				var6 = Client.field806;
				var8 = var14 * var2 * 334 / (var6 * 512);
				var9 = (var3 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var3 + var1 - var9, var2, var9, -16777216);
				}

				var1 += var9;
				var3 -= var9 * 2;
			}
		}

		Client.viewportZoom = var3 * var6 / 334;
		if (var2 != Client.viewportWidth || var3 != Client.viewportHeight) {
			int[] var13 = new int[9];

			for (var9 = 0; var9 < var13.length; ++var9) {
				int var10 = var9 * 32 + 15 + 128;
				int var11 = WorldMapCacheName.method5111(var10);
				int var12 = Rasterizer3D.Rasterizer3D_sine[var10];
				var11 = class127.method2998(var11, var3);
				var13[var9] = var12 * var11 >> 16;
			}

			Scene.Scene_buildVisiblityMap(var13, 500, 800, var2 * 334 / var3, 334);
		}

		Client.viewportOffsetX = var0;
		Client.viewportOffsetY = var1;
		Client.viewportWidth = var2;
		Client.viewportHeight = var3;
	}
}
