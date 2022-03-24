import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
public class class127 extends class128 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-1168568969)

	int field1531;

	@ObfuscatedSignature(descriptor = 
	"Lee;")

	final class131 this$0;

	@ObfuscatedSignature(descriptor = 
	"(Lee;)V")

	class127(class131 var1) {
		this.this$0 = var1;
		this.field1531 = -1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;B)V", garbageValue = 
	"-73")

	void vmethod3107(Buffer var1) {
		this.field1531 = var1.readUnsignedShort();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Leh;I)V", garbageValue = 
	"-1228032820")

	void vmethod3104(ClanSettings var1) {
		var1.method2919(this.field1531);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(IB)I", garbageValue = 
	"-81")

	public static int method2831(int var0) {
		return class400.field4389[var0 & 16383];
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;IIIIIII)V", garbageValue = 
	"1671310726")

	@Export("loadTerrain")
	static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		if ((((var2 >= 0) && (var2 < 104)) && (var3 >= 0)) && (var3 < 104)) {
			Tiles.Tiles_renderFlags[var1][var2][var3] = 0;

			while (true) {
				var7 = var0.readUnsignedByte();
				if (var7 == 0) {
					if (var1 == 0) {
						int[] var14 = Tiles.Tiles_heights[0][var2];
						int var11 = (var2 + var4) + 932731;
						int var12 = (var3 + var5) + 556238;
						int var13 = ((UserComparator6.method2631(45365 + var11, 91923 + var12, 4) - 128) + ((UserComparator6.method2631(10294 + var11, 37821 + var12, 2) - 128) >> 1)) + ((UserComparator6.method2631(var11, var12, 1) - 128) >> 2);
						var13 = ((int) (((double) (var13)) * 0.3)) + 35;
						if (var13 < 10) {
							var13 = 10;
						} else if (var13 > 60) {
							var13 = 60;
						}

						var14[var3] = (-var13) * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240;
					}
					break;
				}

				if (var7 == 1) {
					int var8 = var0.readUnsignedByte();
					if (var8 == 1) {
						var8 = 0;
					}

					if (var1 == 0) {
						Tiles.Tiles_heights[0][var2][var3] = (-var8) * 8;
					} else {
						Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - (var8 * 8);
					}
					break;
				}

				if (var7 <= 49) {
					Tiles.Tiles_overlays[var1][var2][var3] = var0.readByte();
					Tiles.Tiles_shapes[var1][var2][var3] = ((byte) ((var7 - 2) / 4));
					RunException.field4754[var1][var2][var3] = ((byte) (((var7 - 2) + var6) & 3));
				} else if (var7 <= 81) {
					Tiles.Tiles_renderFlags[var1][var2][var3] = ((byte) (var7 - 49));
				} else {
					Tiles.Tiles_underlays[var1][var2][var3] = ((byte) (var7 - 81));
				}
			} 
		} else {
			while (true) {
				var7 = var0.readUnsignedByte();
				if (var7 == 0) {
					break;
				}

				if (var7 == 1) {
					var0.readUnsignedByte();
					break;
				}

				if (var7 <= 49) {
					var0.readUnsignedByte();
				}
			} 
		}

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"(ZB)V", garbageValue = 
	"0")

	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		Login.Login_response1 = "";
		Login.Login_response2 = "Enter your username/email & password.";
		Login.Login_response3 = "";
		class150.method3089(2);
		if (var0) {
			Login.Login_password = "";
		}

		if ((Login.Login_username == null) || (Login.Login_username.length() <= 0)) {
			if (Interpreter.clientPreferences.method2273() != null) {
				Login.Login_username = Interpreter.clientPreferences.method2273();
				Client.Login_isUsernameRemembered = true;
			} else {
				Client.Login_isUsernameRemembered = false;
			}
		}

		if ((Client.Login_isUsernameRemembered && (Login.Login_username != null)) && (Login.Login_username.length() > 0)) {
			Login.currentLoginField = 1;
		} else {
			Login.currentLoginField = 0;
		}

	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(descriptor = 
	"(IIIIIII)V", garbageValue = 
	"-1828922441")

	static final void method2827(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0;
		int var7 = var3 - var1;
		int var8 = (var6 >= 0) ? var6 : -var6;
		int var9 = (var7 >= 0) ? var7 : -var7;
		int var10 = var8;
		if (var8 < var9) {
			var10 = var9;
		}

		if (var10 != 0) {
			int var11 = (var6 << 16) / var10;
			int var12 = (var7 << 16) / var10;
			if (var12 <= var11) {
				var11 = -var11;
			} else {
				var12 = -var12;
			}

			int var13 = (var5 * var12) >> 17;
			int var14 = ((var5 * var12) + 1) >> 17;
			int var15 = (var5 * var11) >> 17;
			int var16 = ((var5 * var11) + 1) >> 17;
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
			int var17 = var0 + var13;
			int var18 = var0 - var14;
			int var19 = (var0 + var6) - var14;
			int var20 = (var0 + var6) + var13;
			int var21 = var15 + var1;
			int var22 = var1 - var16;
			int var23 = (var7 + var1) - var16;
			int var24 = (var15 + var7) + var1;
			Rasterizer3D.method4024(var17, var18, var19);
			Rasterizer3D.method4007(var21, var22, var23, var17, var18, var19, var4);
			Rasterizer3D.method4024(var17, var19, var20);
			Rasterizer3D.method4007(var21, var23, var24, var17, var19, var20, var4);
		}
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"-1923735470")

	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (MusicPatchNode2.loadInterface(var0)) {
			Widget[] var1 = EnumComposition.Widget_interfaceComponents[var0];

			for (int var2 = 0; var2 < var1.length; ++var2) {
				Widget var3 = var1[var2];
				if (var3 != null) {
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
				}
			}

		}
	}
}