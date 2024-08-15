import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pn")
public class class400 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	static final class400 field4585;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	static final class400 field4586;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	static final class400 field4584;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lpn;"
	)
	static final class400 field4583;

	static {
		field4585 = new class400();
		field4586 = new class400();
		field4584 = new class400();
		field4583 = new class400();
	}

	class400() {
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([FIFZFZ[FI)I",
		garbageValue = "-732544317"
	)
	public static int method7482(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
		float var7 = 0.0F;

		for (int var8 = 0; var8 < var1 + 1; ++var8) {
			var7 += Math.abs(var0[var8]);
		}

		float var44 = (Math.abs(var2) + Math.abs(var4)) * (float)(var1 + 1) * class130.field1517;
		if (var7 <= var44) {
			return -1;
		} else {
			float[] var9 = new float[var1 + 1];

			int var10;
			for (var10 = 0; var10 < var1 + 1; ++var10) {
				var9[var10] = var0[var10] * (1.0F / var7);
			}

			while (Math.abs(var9[var1]) < var44) {
				--var1;
			}

			var10 = 0;
			if (var1 == 0) {
				return var10;
			} else if (var1 == 1) {
				var6[0] = -var9[0] / var9[1];
				boolean var42 = var3 ? var2 < var44 + var6[0] : var2 < var6[0] - var44;
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
				class427 var11 = new class427(var9, var1);
				float[] var12 = new float[var1 + 1];

				for (int var13 = 1; var13 <= var1; ++var13) {
					var12[var13 - 1] = (float)var13 * var9[var13];
				}

				float[] var41 = new float[var1 + 1];
				int var14 = method7482(var12, var1 - 1, var2, false, var4, false, var41);
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
							var18 = PcmPlayer.method803(var9, var1, var2);
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

						var17 = PcmPlayer.method803(var9, var1, var19);
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
							float var26 = PcmPlayer.method803(var11.field4705, var11.field4704, var16);
							float var23;
							if (Math.abs(var26) < class130.field1517) {
								var23 = var16;
							} else {
								float var27 = PcmPlayer.method803(var11.field4705, var11.field4704, var19);
								if (Math.abs(var27) < class130.field1517) {
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

										float var38 = class130.field1516 * Math.abs(var25) + 0.0F;
										float var39 = 0.5F * (var28 - var25);
										boolean var40 = Math.abs(var39) > var38 && 0.0F != var27;
										if (var40) {
											if (Math.abs(var30) >= var38 && Math.abs(var26) > Math.abs(var27)) {
												float var34 = var27 / var26;
												float var31;
												float var32;
												if (var24 == var28) {
													var31 = var34 * 2.0F * var39;
													var32 = 1.0F - var34;
												} else {
													var32 = var26 / var35;
													float var33 = var27 / var35;
													var31 = var34 * (var32 * var39 * 2.0F * (var32 - var33) - (var33 - 1.0F) * (var25 - var24));
													var32 = (var33 - 1.0F) * (var32 - 1.0F) * (var34 - 1.0F);
												}

												if ((double)var31 > 0.0D) {
													var32 = -var32;
												} else {
													var31 = -var31;
												}

												var34 = var30;
												var30 = var29;
												if (2.0F * var31 < var39 * 3.0F * var32 - Math.abs(var32 * var38) && var31 < Math.abs(var32 * 0.5F * var34)) {
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

											var27 = PcmPlayer.method803(var11.field4705, var11.field4704, var25);
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
								var6[var10 - 2] = 0.5F * (var6[var10 - 1] + var6[var10 - 2]);
								--var10;
							}
						}
					}

					return var10;
				}
			}
		}
	}

	@ObfuscatedName("id")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-90017435"
	)
	static final void method7483() {
		int var0;
		int var1;
		int var2;
		if (!Client.field759) {
			var0 = class378.method7167(class166.field1793);
			var1 = class378.method7167(class329.field3545);
			var2 = class162.getTileHeight(ConcurrentMidiTask.topLevelWorldView, var0, var1, ConcurrentMidiTask.topLevelWorldView.plane) - Renderable.field2086;
			class524.method9344(var0, var2, var1);
		} else if (Client.field762 != null) {
			class433.cameraX = Client.field762.vmethod9031();
			WorldMapSection0.cameraZ = Client.field762.vmethod9035();
			if (Client.field514) {
				RestClientThreadFactory.cameraY = Client.field762.vmethod9033();
			} else {
				RestClientThreadFactory.cameraY = class162.getTileHeight(ConcurrentMidiTask.topLevelWorldView, class433.cameraX, WorldMapSection0.cameraZ, ConcurrentMidiTask.topLevelWorldView.plane) - Client.field762.vmethod9033();
			}

			Client.field762.method9043();
		}

		if (!Client.field760) {
			var0 = class378.method7167(class156.field1721);
			var1 = class378.method7167(class222.field2417);
			var2 = class162.getTileHeight(ConcurrentMidiTask.topLevelWorldView, var0, var1, ConcurrentMidiTask.topLevelWorldView.plane) - Language.field4602;
			int var3 = var0 - class433.cameraX;
			int var4 = var2 - RestClientThreadFactory.cameraY;
			int var5 = var1 - WorldMapSection0.cameraZ;
			int var6 = (int)Math.sqrt((double)(var3 * var3 + var5 * var5));
			int var7 = (int)(Math.atan2((double)var4, (double)var6) * 325.9490051269531D) & 2047;
			int var8 = (int)(Math.atan2((double)var3, (double)var5) * -325.9490051269531D) & 2047;
			JagNetThread.method7359(var7, var8);
		} else {
			if (Client.field615 != null) {
				UserComparator6.cameraPitch = Client.field615.method9024();
				UserComparator6.cameraPitch = Math.min(Math.max(UserComparator6.cameraPitch, 128), 383);
				Client.field615.method9043();
			}

			if (Client.field517 != null) {
				class264.cameraYaw = Client.field517.method9024() & 2047;
				Client.field517.method9043();
			}
		}

	}
}
