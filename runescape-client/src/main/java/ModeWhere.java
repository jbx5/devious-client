import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pe")
@Implements("ModeWhere")
public enum ModeWhere implements Enum {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	field4608("", 0, new class398[]{class398.field4589, class398.field4590}),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	field4625("", 1, new class398[]{class398.field4586, class398.field4589, class398.field4590}),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	field4609("", 2, new class398[]{class398.field4586, class398.field4587, class398.field4589}),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	field4611("", 3, new class398[]{class398.field4586}),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	field4612("", 4),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	field4613("", 5, new class398[]{class398.field4586, class398.field4589}),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	field4614("", 6, new class398[]{class398.field4589}),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	field4615("", 8, new class398[]{class398.field4586, class398.field4589}),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	field4616("", 9, new class398[]{class398.field4586, class398.field4587}),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	field4617("", 10, new class398[]{class398.field4586}),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	field4618("", 11, new class398[]{class398.field4586}),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	field4619("", 12, new class398[]{class398.field4586, class398.field4589}),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	field4620("", 13, new class398[]{class398.field4586});

	@ObfuscatedName("jn")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	static class101 field4623;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -478390221
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ae")
	final Set field4622;

	static {
		method7485();
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lpa;)V"
	)
	ModeWhere(String var3, int var4, class398[] var5) {
		this.field4622 = new HashSet();
		this.id = var4;
		class398[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class398 var8 = var6[var7];
			this.field4622.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field4622 = new HashSet();
		this.id = var4;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-311400525"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Lhb;",
		garbageValue = "-2051908125"
	)
	static class187 method7490() {
		return class187.field1962;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lfm;FFFFFFFFI)V",
		garbageValue = "-928078191"
	)
	static void method7489(class133 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
		if (var0 != null) {
			float var9 = var4 - var1;
			if ((double)var9 != 0.0D) {
				float var10 = var2 - var1;
				float var11 = var3 - var1;
				float[] var12 = new float[]{var10 / var9, var11 / var9};
				var0.field1583 = 0.33333334F == var12[0] && 0.6666667F == var12[1];
				float var13 = var12[0];
				float var14 = var12[1];
				if ((double)var12[0] < 0.0D) {
					var12[0] = 0.0F;
				}

				if ((double)var12[1] > 1.0D) {
					var12[1] = 1.0F;
				}

				float var15;
				float var16;
				float var17;
				float var18;
				float var19;
				if ((double)var12[0] > 1.0D || var12[1] < -1.0F) {
					var12[1] = 1.0F - var12[1];
					if (var12[0] < 0.0F) {
						var12[0] = 0.0F;
					}

					if (var12[1] < 0.0F) {
						var12[1] = 0.0F;
					}

					if (var12[0] > 1.0F || var12[1] > 1.0F) {
						var15 = (float)(1.0D + (double)var12[1] * ((double)var12[1] - 2.0D) + (double)(var12[0] * (var12[0] - 2.0F + var12[1])));
						if (var15 + class129.field1541 > 0.0F) {
							if (var12[0] + class129.field1541 < 1.3333334F) {
								var16 = var12[0] - 2.0F;
								var17 = var12[0] - 1.0F;
								var18 = (float)Math.sqrt((double)(var16 * var16 - var17 * 4.0F * var17));
								var19 = (var18 + -var16) * 0.5F;
								if (var12[1] + class129.field1541 > var19) {
									var12[1] = var19 - class129.field1541;
								} else {
									var19 = 0.5F * (-var16 - var18);
									if (var12[1] < var19 + class129.field1541) {
										var12[1] = var19 + class129.field1541;
									}
								}
							} else {
								var12[0] = 1.3333334F - class129.field1541;
								var12[1] = 0.33333334F - class129.field1541;
							}
						}
					}

					var12[1] = 1.0F - var12[1];
				}

				if (var12[0] != var13) {
					var2 = var12[0] * var9 + var1;
					if ((double)var13 != 0.0D) {
						var6 = var5 + (var6 - var5) * var12[0] / var13;
					}
				}

				if (var14 != var12[1]) {
					var3 = var12[1] * var9 + var1;
					if ((double)var14 != 1.0D) {
						var7 = (float)((double)var8 - (1.0D - (double)var12[1]) * (double)(var8 - var7) / (1.0D - (double)var14));
					}
				}

				var0.field1584 = var1;
				var0.field1585 = var4;
				var15 = var12[0];
				var16 = var12[1];
				var17 = var15 - 0.0F;
				var18 = var16 - var15;
				var19 = 1.0F - var16;
				float var20 = var18 - var17;
				var0.field1589 = var19 - var18 - var20;
				var0.field1601 = var20 + var20 + var20;
				var0.field1587 = var17 + var17 + var17;
				var0.field1596 = 0.0F;
				var17 = var6 - var5;
				var18 = var7 - var6;
				var19 = var8 - var7;
				var20 = var18 - var17;
				var0.field1578 = var19 - var18 - var20;
				var0.field1592 = var20 + var20 + var20;
				var0.field1591 = var17 + var17 + var17;
				var0.field1590 = var5;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)[Lpe;",
		garbageValue = "52"
	)
	static ModeWhere[] method7485() {
		return new ModeWhere[]{field4620, field4609, field4611, field4614, field4625, field4612, field4615, field4613, field4608, field4618, field4617, field4619, field4616};
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "16363"
	)
	static final void method7491() {
		int var0;
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		if (Client.oculusOrbState == 0) {
			var0 = Interpreter.field899.vmethod8779();
			var1 = Interpreter.field899.vmethod8773();
			var2 = Interpreter.field899.vmethod8774();
			if (class33.field178 - var0 < -500 || class33.field178 - var0 > 500 || class76.field931 - var1 < -500 || class76.field931 - var1 > 500) {
				class33.field178 = var0;
				class76.field931 = var1;
			}

			if (var0 != class33.field178) {
				class33.field178 += (var0 - class33.field178) / 16;
			}

			if (var1 != class76.field931) {
				class76.field931 += (var1 - class76.field931) / 16;
			}

			var3 = class33.field178 >> 7;
			var4 = class76.field931 >> 7;
			var5 = SoundSystem.method856(class358.scene, class33.field178, class76.field931, var2);
			int var6 = 0;
			int var7;
			if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
				for (var7 = var3 - 4; var7 <= var3 + 4; ++var7) {
					for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
						int var9 = var2;
						if (var2 < 3 && (class358.scene.field1340[1][var7][var8] & 2) == 2) {
							var9 = var2 + 1;
						}

						int var10 = var5 - class358.scene.field1339[var9][var7][var8];
						if (var10 > var6) {
							var6 = var10;
						}
					}
				}
			}

			var7 = var6 * 192;
			if (var7 > 98048) {
				var7 = 98048;
			}

			if (var7 < 32768) {
				var7 = 32768;
			}

			if (var7 > Client.hintArrowNpcIndex) {
				Client.hintArrowNpcIndex += (var7 - Client.hintArrowNpcIndex) / 24;
			} else if (var7 < Client.hintArrowNpcIndex) {
				Client.hintArrowNpcIndex += (var7 - Client.hintArrowNpcIndex) / 80;
			}

			TextureProvider.field2830 = SoundSystem.method856(class358.scene, var0, var1, var2) - Client.camFollowHeight;
		} else if (Client.oculusOrbState == 1) {
			class11.method100();
			short var11 = -1;
			if (Client.indexCheck.isValidIndexInRange(33)) {
				var11 = 0;
			} else if (Client.indexCheck.isValidIndexInRange(49)) {
				var11 = 1024;
			}

			if (Client.indexCheck.isValidIndexInRange(48)) {
				if (var11 == 0) {
					var11 = 1792;
				} else if (var11 == 1024) {
					var11 = 1280;
				} else {
					var11 = 1536;
				}
			} else if (Client.indexCheck.isValidIndexInRange(50)) {
				if (var11 == 0) {
					var11 = 256;
				} else if (var11 == 1024) {
					var11 = 768;
				} else {
					var11 = 512;
				}
			}

			byte var12 = 0;
			if (Client.indexCheck.isValidIndexInRange(35)) {
				var12 = -1;
			} else if (Client.indexCheck.isValidIndexInRange(51)) {
				var12 = 1;
			}

			var2 = 0;
			if (var11 >= 0 || var12 != 0) {
				var2 = Client.indexCheck.isValidIndexInRange(81) ? Client.oculusOrbSlowedSpeed : Client.oculusOrbNormalSpeed;
				var2 *= 16;
				Client.field622 = var11;
				Client.field623 = var12;
			}

			if (Client.field621 < var2) {
				Client.field621 += var2 / 8;
				if (Client.field621 > var2) {
					Client.field621 = var2;
				}
			} else if (Client.field621 > var2) {
				Client.field621 = Client.field621 * 9 / 10;
			}

			if (Client.field621 > 0) {
				var3 = Client.field621 / 16;
				if (Client.field622 >= 0) {
					var0 = Client.field622 - class206.cameraYaw & 2047;
					var4 = Rasterizer3D.Rasterizer3D_sine[var0];
					var5 = Rasterizer3D.Rasterizer3D_cosine[var0];
					class33.field178 += var4 * var3 / 65536;
					class76.field931 += var3 * var5 / 65536;
				}

				if (Client.field623 != 0) {
					TextureProvider.field2830 += var3 * Client.field623;
					if (TextureProvider.field2830 > 0) {
						TextureProvider.field2830 = 0;
					}
				}
			} else {
				Client.field622 = -1;
				Client.field623 = -1;
			}

			if (Client.indexCheck.isValidIndexInRange(13)) {
				ModelData0.method5454();
			}
		}

		if (MouseHandler.MouseHandler_currentButton == 4 && class105.mouseCam) {
			var0 = MouseHandler.MouseHandler_y - Client.field618;
			Client.field616 = var0 * 2;
			Client.field618 = var0 != -1 && var0 != 1 ? (MouseHandler.MouseHandler_y + Client.field618) / 2 : MouseHandler.MouseHandler_y;
			var1 = Client.field826 - MouseHandler.MouseHandler_x;
			Client.field665 = var1 * 2;
			Client.field826 = var1 != -1 && var1 != 1 ? (MouseHandler.MouseHandler_x + Client.field826) / 2 : MouseHandler.MouseHandler_x;
		} else {
			if (Client.indexCheck.isValidIndexInRange(96)) {
				Client.field665 += (-24 - Client.field665) / 2;
			} else if (Client.indexCheck.isValidIndexInRange(97)) {
				Client.field665 += (24 - Client.field665) / 2;
			} else {
				Client.field665 /= 2;
			}

			if (Client.indexCheck.isValidIndexInRange(98)) {
				Client.field616 += (12 - Client.field616) / 2;
			} else if (Client.indexCheck.isValidIndexInRange(99)) {
				Client.field616 += (-12 - Client.field616) / 2;
			} else {
				Client.field616 /= 2;
			}

			Client.field618 = MouseHandler.MouseHandler_y;
			Client.field826 = MouseHandler.MouseHandler_x;
		}

		Client.camAngleY = Client.field665 / 2 + Client.camAngleY & 2047;
		Client.camAngleX += Client.field616 / 2;
		if (Client.camAngleX < 128) {
			Client.camAngleX = 128;
		}

		if (Client.camAngleX > 383) {
			Client.camAngleX = 383;
		}

	}
}
