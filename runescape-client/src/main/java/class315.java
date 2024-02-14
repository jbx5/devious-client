import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mr")
public class class315 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V",
		garbageValue = "50"
	)
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = "";
				if (var1 != null) {
					Throwable var4 = var1;
					String var5;
					if (var1 instanceof RunException) {
						RunException var6 = (RunException)var1;
						var5 = var6.message + " | ";
						var4 = var6.throwable;
					} else {
						var5 = "";
					}

					StringWriter var18 = new StringWriter();
					PrintWriter var7 = new PrintWriter(var18);
					var4.printStackTrace(var7);
					var7.close();
					String var8 = var18.toString();
					BufferedReader var9 = new BufferedReader(new StringReader(var8));
					String var10 = var9.readLine();

					label63:
					while (true) {
						while (true) {
							String var11 = var9.readLine();
							if (var11 == null) {
								var5 = var5 + "| " + var10;
								var2 = var5;
								break label63;
							}

							int var12 = var11.indexOf(40);
							int var13 = var11.indexOf(41, var12 + 1);
							if (var12 >= 0 && var13 >= 0) {
								String var14 = var11.substring(var12 + 1, var13);
								int var15 = var14.indexOf(".java:");
								if (var15 >= 0) {
									var14 = var14.substring(0, var15) + var14.substring(var15 + 5);
									var5 = var5 + var14 + ' ';
									continue;
								}

								var11 = var11.substring(0, var12);
							}

							var11 = var11.trim();
							var11 = var11.substring(var11.lastIndexOf(32) + 1);
							var11 = var11.substring(var11.lastIndexOf(9) + 1);
							var5 = var5 + var11 + ' ';
						}
					}
				}

				if (var0 != null) {
					if (var1 != null) {
						var2 = var2 + " | ";
					}

					var2 = var2 + var0;
				}

				System.out.println("Error: " + var2);
				var2 = var2.replace(':', '.');
				var2 = var2.replace('@', '_');
				var2 = var2.replace('&', '_');
				var2 = var2.replace('#', '_');
				if (RunException.RunException_applet == null) {
					return;
				}

				URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?cv=" + RunException.RunException_revision + "&cs=" + RunException.field5366 + "&u=" + RunException.field5364 + "&v1=" + GrandExchangeOfferUnitPriceComparator.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + RunException.field5367 + "&e=" + var2);
				DataInputStream var17 = new DataInputStream(var3.openStream());
				var17.read();
				var17.close();
			} catch (Exception var16) {
			}

		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-993663836"
	)
	public static int method6060(int var0) {
		return class319.field3463[var0];
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2132677932"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var1 == null ? 0 : var1.size();
	}

	@ObfuscatedName("ij")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1036586879"
	)
	static final void method6061() {
		int var0;
		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		if (Client.oculusOrbState == 0) {
			var0 = VarpDefinition.localPlayer.x;
			var1 = VarpDefinition.localPlayer.y;
			if (Friend.oculusOrbFocalPointX - var0 < -500 || Friend.oculusOrbFocalPointX - var0 > 500 || class59.oculusOrbFocalPointY - var1 < -500 || class59.oculusOrbFocalPointY - var1 > 500) {
				Friend.oculusOrbFocalPointX = var0;
				class59.oculusOrbFocalPointY = var1;
			}

			if (var0 != Friend.oculusOrbFocalPointX) {
				Friend.oculusOrbFocalPointX += (var0 - Friend.oculusOrbFocalPointX) / 16;
			}

			if (var1 != class59.oculusOrbFocalPointY) {
				class59.oculusOrbFocalPointY += (var1 - class59.oculusOrbFocalPointY) / 16;
			}

			var2 = Friend.oculusOrbFocalPointX >> 7;
			var3 = class59.oculusOrbFocalPointY >> 7;
			var4 = class272.getTileHeight(Friend.oculusOrbFocalPointX, class59.oculusOrbFocalPointY, class473.Client_plane);
			var5 = 0;
			int var6;
			if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
				for (var6 = var2 - 4; var6 <= var2 + 4; ++var6) {
					for (int var7 = var3 - 4; var7 <= var3 + 4; ++var7) {
						int var8 = class473.Client_plane;
						if (var8 < 3 && (Tiles.Tiles_renderFlags[1][var6][var7] & 2) == 2) {
							++var8;
						}

						int var9 = var4 - Tiles.Tiles_heights[var8][var6][var7];
						if (var9 > var5) {
							var5 = var9;
						}
					}
				}
			}

			var6 = var5 * 192;
			if (var6 > 98048) {
				var6 = 98048;
			}

			if (var6 < 32768) {
				var6 = 32768;
			}

			if (var6 > Client.field795) {
				Client.field795 += (var6 - Client.field795) / 24;
			} else if (var6 < Client.field795) {
				Client.field795 += (var6 - Client.field795) / 80;
			}

			GrandExchangeOfferWorldComparator.field4449 = class272.getTileHeight(VarpDefinition.localPlayer.x, VarpDefinition.localPlayer.y, class473.Client_plane) - Client.camFollowHeight;
		} else if (Client.oculusOrbState == 1) {
			class518.method9298();
			short var10 = -1;
			if (Client.field792.method4466(33)) {
				var10 = 0;
			} else if (Client.field792.method4466(49)) {
				var10 = 1024;
			}

			if (Client.field792.method4466(48)) {
				if (var10 == 0) {
					var10 = 1792;
				} else if (var10 == 1024) {
					var10 = 1280;
				} else {
					var10 = 1536;
				}
			} else if (Client.field792.method4466(50)) {
				if (var10 == 0) {
					var10 = 256;
				} else if (var10 == 1024) {
					var10 = 768;
				} else {
					var10 = 512;
				}
			}

			byte var11 = 0;
			if (Client.field792.method4466(35)) {
				var11 = -1;
			} else if (Client.field792.method4466(51)) {
				var11 = 1;
			}

			var2 = 0;
			if (var10 >= 0 || var11 != 0) {
				var2 = Client.field792.method4466(81) ? Client.oculusOrbSlowedSpeed : Client.oculusOrbNormalSpeed;
				var2 *= 16;
				Client.field620 = var10;
				Client.field577 = var11;
			}

			if (Client.field619 < var2) {
				Client.field619 += var2 / 8;
				if (Client.field619 > var2) {
					Client.field619 = var2;
				}
			} else if (Client.field619 > var2) {
				Client.field619 = Client.field619 * 9 / 10;
			}

			if (Client.field619 > 0) {
				var3 = Client.field619 / 16;
				if (Client.field620 >= 0) {
					var0 = Client.field620 - Script.cameraYaw & 2047;
					var4 = Rasterizer3D.Rasterizer3D_sine[var0];
					var5 = Rasterizer3D.Rasterizer3D_cosine[var0];
					Friend.oculusOrbFocalPointX += var3 * var4 / 65536;
					class59.oculusOrbFocalPointY += var3 * var5 / 65536;
				}

				if (Client.field577 != 0) {
					GrandExchangeOfferWorldComparator.field4449 += var3 * Client.field577;
					if (GrandExchangeOfferWorldComparator.field4449 > 0) {
						GrandExchangeOfferWorldComparator.field4449 = 0;
					}
				}
			} else {
				Client.field620 = -1;
				Client.field577 = -1;
			}

			if (Client.field792.method4466(13)) {
				Client.packetWriter.addNode(ViewportMouse.getPacketBufferNode(ClientPacket.field3194, Client.packetWriter.isaacCipher));
				Client.oculusOrbState = 0;
			}
		}

		if (MouseHandler.MouseHandler_currentButton == 4 && DbTableType.mouseCam) {
			var0 = MouseHandler.MouseHandler_y - Client.mouseCamClickedY;
			Client.camAngleDX = var0 * 2;
			Client.mouseCamClickedY = var0 != -1 && var0 != 1 ? (Client.mouseCamClickedY + MouseHandler.MouseHandler_y) / 2 : MouseHandler.MouseHandler_y;
			var1 = Client.field615 - MouseHandler.MouseHandler_x;
			Client.camAngleDY = var1 * 2;
			Client.field615 = var1 != -1 && var1 != 1 ? (Client.field615 + MouseHandler.MouseHandler_x) / 2 : MouseHandler.MouseHandler_x;
		} else {
			if (Client.field792.method4466(96)) {
				Client.camAngleDY += (-24 - Client.camAngleDY) / 2;
			} else if (Client.field792.method4466(97)) {
				Client.camAngleDY += (24 - Client.camAngleDY) / 2;
			} else {
				Client.camAngleDY /= 2;
			}

			if (Client.field792.method4466(98)) {
				Client.camAngleDX += (12 - Client.camAngleDX) / 2;
			} else if (Client.field792.method4466(99)) {
				Client.camAngleDX += (-12 - Client.camAngleDX) / 2;
			} else {
				Client.camAngleDX /= 2;
			}

			Client.mouseCamClickedY = MouseHandler.MouseHandler_y;
			Client.field615 = MouseHandler.MouseHandler_x;
		}

		Client.camAngleY = Client.camAngleDY / 2 + Client.camAngleY & 2047;
		Client.camAngleX += Client.camAngleDX / 2;
		if (Client.camAngleX < 128) {
			Client.camAngleX = 128;
		}

		if (Client.camAngleX > 383) {
			Client.camAngleX = 383;
		}

	}
}
