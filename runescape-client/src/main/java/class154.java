import java.applet.Applet;
import java.net.URL;




import netscape.javascript.JSObject; import net.runelite.mapping.Export; import net.runelite.mapping.ObfuscatedGetter; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
public class class154 extends class166 {
	@ObfuscatedName("ns")
	@ObfuscatedGetter(intValue = 
	-1435820145)

	@Export("selectedSpellFlags")
	static int selectedSpellFlags;
	@ObfuscatedName("v")
	String field1695;

	@ObfuscatedSignature(descriptor = 
	"Lef;")

	final class155 this$0;

	@ObfuscatedSignature(descriptor = 
	"(Lef;Ljava/lang/String;Ljava/lang/String;)V")

	class154(class155 var1, String var2, String var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field1695 = var3;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"695673663")

	public int vmethod3297() {
		return 1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(I)Ljava/lang/String;", garbageValue = 
	"1251344393")

	public String vmethod3296() {
		return this.field1695;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"([FIFZFZ[FB)I", garbageValue = 
	"1")

	public static int method3129(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
		float var7 = 0.0F;

		for (int var8 = 0; var8 < (var1 + 1); ++var8) {
			var7 += Math.abs(var0[var8]);
		}

		float var24 = ((Math.abs(var2) + Math.abs(var4)) * ((float) (var1 + 1))) * class114.field1396;
		if (var7 <= var24) {
			return -1;
		} else {
			float[] var9 = new float[var1 + 1];

			int var10;
			for (var10 = 0; var10 < (var1 + 1); ++var10) {
				var9[var10] = var0[var10] * (1.0F / var7);
			}

			while (Math.abs(var9[var1]) < var24) {
				--var1;
			} 

			var10 = 0;
			if (var1 == 0) {
				return var10;
			} else if (var1 == 1) {
				var6[0] = (-var9[0]) / var9[1];
				boolean var22 = (var3) ? var2 < (var6[0] + var24) : var2 < (var6[0] - var24);
				boolean var23 = (var5) ? var4 > (var6[0] - var24) : var4 > (var6[0] + var24);
				var10 = (var22 && var23) ? 1 : 0;
				if (var10 > 0) {
					if (var3 && (var6[0] < var2)) {
						var6[0] = var2;
					} else if (var5 && (var6[0] > var4)) {
						var6[0] = var4;
					}
				}

				return var10;
			} else {
				class389 var11 = new class389(var9, var1);
				float[] var12 = new float[var1 + 1];

				for (int var13 = 1; var13 <= var1; ++var13) {
					var12[var13 - 1] = var9[var13] * ((float) (var13));
				}

				float[] var21 = new float[var1 + 1];
				int var14 = method3129(var12, var1 - 1, var2, false, var4, false, var21);
				if (var14 == (-1)) {
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
							var18 = MidiPcmStream.method5405(var9, var1, var2);
							if ((Math.abs(var18) <= var24) && var3) {
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
							var19 = var21[var20];
						}

						var17 = MidiPcmStream.method5405(var9, var1, var19);
						if (var15) {
							var15 = false;
						} else if (Math.abs(var17) < var24) {
							if ((var14 != var20) || var5) {
								var6[var10++] = var19;
								var15 = true;
							}
						} else if (((var18 < 0.0F) && (var17 > 0.0F)) || ((var18 > 0.0F) && (var17 < 0.0F))) {
							var6[var10++] = UserList.method6823(var11, var16, var19, 0.0F);
							if ((var10 > 1) && (var6[var10 - 2] >= (var6[var10 - 1] - var24))) {
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

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;ILjava/lang/String;B)Z", garbageValue = 
	"0")

	static boolean method3128(String var0, int var1, String var2) {
		if (var1 == 0) {
			try {
				if (!class29.field169.startsWith("win")) {
					throw new Exception();
				} else if ((!var0.startsWith("http://")) && (!var0.startsWith("https://"))) {
					throw new Exception();
				} else {
					String var11 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

					for (int var4 = 0; var4 < var0.length(); ++var4) {
						if (var11.indexOf(var0.charAt(var4)) == (-1)) {
							throw new Exception();
						}
					}

					Runtime.getRuntime().exec(("cmd /c start \"j\" \"" + var0) + "\"");
					return true;
				}
			} catch (Throwable var5) {
				return false;
			}
		} else if (var1 == 1) {
			try {
				Object var10 = class27.method412(class29.field168, var2, new Object[]{ new URL(class29.field168.getCodeBase(), var0).toString() });
				return var10 != null;
			} catch (Throwable var6) {
				return false;
			}
		} else if (var1 == 2) {
			try {
				class29.field168.getAppletContext().showDocument(new URL(class29.field168.getCodeBase(), var0), "_blank");
				return true;
			} catch (Exception var7) {
				return false;
			}
		} else if (var1 == 3) {
			try {
				Applet var3 = class29.field168;
				JSObject.getWindow(var3).call("loggedout", ((Object[]) (null)));
			} catch (Throwable var9) {
			}

			try {
				class29.field168.getAppletContext().showDocument(new URL(class29.field168.getCodeBase(), var0), "_top");
				return true;
			} catch (Exception var8) {
				return false;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-2051712033")

	static void method3127() {
		if (ClanChannel.worldMap != null) {
			ClanChannel.worldMap.method7313(class160.Client_plane, (class19.localPlayer.x >> 7) + ApproximateRouteStrategy.baseX, (class19.localPlayer.y >> 7) + class250.baseY, false);
			ClanChannel.worldMap.loadCache();
		}

	}
}