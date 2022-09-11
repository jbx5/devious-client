import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;

@ObfuscatedName("y")
public class class21 {
	@ObfuscatedName("ty")
	@ObfuscatedGetter(
		intValue = 472202037
	)
	static int field120;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 356851383
	)
	final int field117;
	@ObfuscatedName("p")
	final String field119;

	class21(String var1) {
		this.field117 = 400;
		this.field119 = "";
	}

	class21(HttpURLConnection var1) throws IOException {
		this.field117 = var1.getResponseCode(); // L: 14
		var1.getResponseMessage();
		var1.getHeaderFields();
		StringBuilder var2 = new StringBuilder();
		InputStream var3 = this.field117 >= 300 ? var1.getErrorStream() : var1.getInputStream();
		if (var3 != null) { // L: 19
			InputStreamReader var4 = new InputStreamReader(var3);
			BufferedReader var5 = new BufferedReader(var4);

			String var6;
			while ((var6 = var5.readLine()) != null) {
				var2.append(var6);
			}

			var3.close();
		}

		this.field119 = var2.toString();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-399879300"
	)
	public int method306() {
		return this.field117;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1536201796"
	)
	public String method307() {
		return this.field119;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2006980388"
	)
	static void method323() {
		if (TaskHandler.javaVendor.toLowerCase().indexOf("microsoft") != -1) { // L: 124
			KeyHandler.KeyHandler_keyCodes[186] = 57; // L: 125
			KeyHandler.KeyHandler_keyCodes[187] = 27;
			KeyHandler.KeyHandler_keyCodes[188] = 71;
			KeyHandler.KeyHandler_keyCodes[189] = 26; // L: 128
			KeyHandler.KeyHandler_keyCodes[190] = 72; // L: 129
			KeyHandler.KeyHandler_keyCodes[191] = 73;
			KeyHandler.KeyHandler_keyCodes[192] = 58;
			KeyHandler.KeyHandler_keyCodes[219] = 42;
			KeyHandler.KeyHandler_keyCodes[220] = 74; // L: 133
			KeyHandler.KeyHandler_keyCodes[221] = 43; // L: 134
			KeyHandler.KeyHandler_keyCodes[222] = 59;
			KeyHandler.KeyHandler_keyCodes[223] = 28;
		} else {
			KeyHandler.KeyHandler_keyCodes[44] = 71;
			KeyHandler.KeyHandler_keyCodes[45] = 26;
			KeyHandler.KeyHandler_keyCodes[46] = 72; // L: 141
			KeyHandler.KeyHandler_keyCodes[47] = 73; // L: 142
			KeyHandler.KeyHandler_keyCodes[59] = 57;
			KeyHandler.KeyHandler_keyCodes[61] = 27; // L: 144
			KeyHandler.KeyHandler_keyCodes[91] = 42;
			KeyHandler.KeyHandler_keyCodes[92] = 74; // L: 146
			KeyHandler.KeyHandler_keyCodes[93] = 43;
			KeyHandler.KeyHandler_keyCodes[192] = 28; // L: 148
			KeyHandler.KeyHandler_keyCodes[222] = 58; // L: 149
			KeyHandler.KeyHandler_keyCodes[520] = 59; // L: 150
		}

	} // L: 152

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([BB)Lqi;",
		garbageValue = "-103"
	)
	public static final SpritePixels method322(byte[] var0) {
		BufferedImage var1 = null;

		try {
			Class var2 = ImageIO.class;
			synchronized(ImageIO.class) {
				var1 = ImageIO.read(new ByteArrayInputStream(var0));
			}

			int var6 = var1.getWidth();
			int var7 = var1.getHeight();
			int[] var4 = new int[var6 * var7];
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var6, var7, var4, 0, var6);
			var5.grabPixels();
			return new SpritePixels(var4, var6, var7);
		} catch (IOException var9) {
		} catch (InterruptedException var10) {
		}

		return new SpritePixels(0, 0);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1429839613"
	)
	static int method319(int var0, int var1) {
		if (var0 == -2) { // L: 15
			return 12345678;
		} else if (var0 == -1) { // L: 16
			if (var1 < 0) { // L: 17
				var1 = 0; // L: 18
			} else if (var1 > 127) { // L: 20
				var1 = 127; // L: 21
			}

			var1 = 127 - var1;
			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) { // L: 27
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/io/File;",
		garbageValue = "1092228930"
	)
	@Export("getFile")
	static File getFile(String var0) {
		if (!FileSystem.FileSystem_hasPermissions) { // L: 22
			throw new RuntimeException("");
		} else {
			File var1 = (File)FileSystem.FileSystem_cacheFiles.get(var0); // L: 23
			if (var1 != null) { // L: 24
				return var1;
			} else {
				File var2 = new File(FileSystem.FileSystem_cacheDir, var0); // L: 25
				RandomAccessFile var3 = null; // L: 26

				try {
					File var4 = new File(var2.getParent()); // L: 28
					if (!var4.exists()) { // L: 29
						throw new RuntimeException("");
					} else {
						var3 = new RandomAccessFile(var2, "rw"); // L: 30
						int var5 = var3.read(); // L: 31
						var3.seek(0L); // L: 32
						var3.write(var5); // L: 33
						var3.seek(0L); // L: 34
						var3.close(); // L: 35
						FileSystem.FileSystem_cacheFiles.put(var0, var2); // L: 36
						return var2; // L: 37
					}
				} catch (Exception var8) {
					try {
						if (var3 != null) { // L: 41
							var3.close(); // L: 42
							var3 = null; // L: 43
						}
					} catch (Exception var7) { // L: 46
					}

					throw new RuntimeException(); // L: 48
				}
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)Ljava/lang/Class;",
		garbageValue = "251"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) { // L: 218
			return Byte.TYPE;
		} else if (var0.equals("I")) { // L: 219
			return Integer.TYPE;
		} else if (var0.equals("S")) { // L: 220
			return Short.TYPE;
		} else if (var0.equals("J")) {
			return Long.TYPE; // L: 221
		} else if (var0.equals("Z")) { // L: 222
			return Boolean.TYPE;
		} else if (var0.equals("F")) { // L: 223
			return Float.TYPE;
		} else if (var0.equals("D")) { // L: 224
			return Double.TYPE;
		} else if (var0.equals("C")) {
			return Character.TYPE; // L: 225
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0); // L: 226 227
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIII[Lgj;B)V",
		garbageValue = "-33"
	)
	static final void method315(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, CollisionMap[] var8) {
		int var10;
		for (int var9 = 0; var9 < 8; ++var9) { // L: 111
			for (var10 = 0; var10 < 8; ++var10) { // L: 112
				if (var9 + var2 > 0 && var9 + var2 < 103 && var3 + var10 > 0 && var3 + var10 < 103) { // L: 113
					int[] var10000 = var8[var1].flags[var9 + var2];
					var10000[var10 + var3] &= -16777217;
				}
			}
		}

		Buffer var21 = new Buffer(var0); // L: 116

		for (var10 = 0; var10 < 4; ++var10) { // L: 117
			for (int var11 = 0; var11 < 64; ++var11) { // L: 118
				for (int var12 = 0; var12 < 64; ++var12) { // L: 119
					if (var10 == var4 && var11 >= var5 && var11 < var5 + 8 && var12 >= var6 && var12 < var6 + 8) { // L: 120
						int var15 = var2 + class1.method13(var11 & 7, var12 & 7, var7); // L: 123
						int var18 = var11 & 7; // L: 126
						int var19 = var12 & 7; // L: 127
						int var20 = var7 & 3; // L: 130
						int var17;
						if (var20 == 0) { // L: 131
							var17 = var19; // L: 132
						} else if (var20 == 1) { // L: 135
							var17 = 7 - var18; // L: 136
						} else if (var20 == 2) { // L: 139
							var17 = 7 - var19; // L: 140
						} else {
							var17 = var18; // L: 143
						}

						VarbitComposition.loadTerrain(var21, var1, var15, var17 + var3, 0, 0, var7); // L: 145
					} else {
						VarbitComposition.loadTerrain(var21, 0, -1, -1, 0, 0, 0); // L: 147
					}
				}
			}
		}

	} // L: 151

	@ObfuscatedName("fy")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-1966674441"
	)
	static long method313() {
		return Client.field498; // L: 2890
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "2023780384"
	)
	static final void method321(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0; // L: 10248
		int var7 = var3 - var1; // L: 10249
		int var8 = var6 >= 0 ? var6 : -var6; // L: 10250
		int var9 = var7 >= 0 ? var7 : -var7; // L: 10251
		int var10 = var8; // L: 10252
		if (var8 < var9) { // L: 10253
			var10 = var9;
		}

		if (var10 != 0) { // L: 10254
			int var11 = (var6 << 16) / var10; // L: 10255
			int var12 = (var7 << 16) / var10; // L: 10256
			if (var12 <= var11) { // L: 10257
				var11 = -var11;
			} else {
				var12 = -var12; // L: 10258
			}

			int var13 = var5 * var12 >> 17; // L: 10259
			int var14 = var5 * var12 + 1 >> 17; // L: 10260
			int var15 = var5 * var11 >> 17; // L: 10261
			int var16 = var5 * var11 + 1 >> 17; // L: 10262
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart; // L: 10263
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart; // L: 10264
			int var17 = var0 + var13; // L: 10265
			int var18 = var0 - var14; // L: 10266
			int var19 = var0 + var6 - var14; // L: 10267
			int var20 = var0 + var13 + var6; // L: 10268
			int var21 = var15 + var1; // L: 10269
			int var22 = var1 - var16; // L: 10270
			int var23 = var7 + var1 - var16; // L: 10271
			int var24 = var15 + var7 + var1; // L: 10272
			Rasterizer3D.method4139(var17, var18, var19); // L: 10273
			Rasterizer3D.method4173(var21, var22, var23, var17, var18, var19, var4); // L: 10274
			Rasterizer3D.method4139(var17, var19, var20); // L: 10275
			Rasterizer3D.method4173(var21, var23, var24, var17, var19, var20, var4); // L: 10276
		}
	} // L: 10277

	@ObfuscatedName("ln")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "51"
	)
	static final void method318() {
		PacketBufferNode var0 = class120.getPacketBufferNode(ClientPacket.field2953, Client.packetWriter.isaacCipher); // L: 11712
		Client.packetWriter.addNode(var0); // L: 11713
		Interpreter.field833 = true; // L: 11714

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) { // L: 11715
			if (var1.type == 0 || var1.type == 3) { // L: 11716
				class120.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) { // L: 11718
			class403.invalidateWidget(Client.meslayerContinueWidget); // L: 11719
			Client.meslayerContinueWidget = null; // L: 11720
		}

		Interpreter.field833 = false; // L: 11722
	} // L: 11723

	@ObfuscatedName("lv")
	@ObfuscatedSignature(
		descriptor = "(Lkw;IIII)V",
		garbageValue = "732948591"
	)
	@Export("drawMinimap")
	static final void drawMinimap(Widget var0, int var1, int var2, int var3) {
		class14.playPcmPlayers(); // L: 11783
		SpriteMask var4 = var0.getSpriteMask(false); // L: 11784
		if (var4 != null) { // L: 11785
			Rasterizer2D.Rasterizer2D_setClip(var1, var2, var4.width + var1, var2 + var4.height); // L: 11786
			if (Client.minimapState != 2 && Client.minimapState != 5) { // L: 11787
				int var5 = Client.camAngleY & 2047; // L: 11788
				int var6 = class67.localPlayer.x / 32 + 48; // L: 11789
				int var7 = 464 - class67.localPlayer.y / 32; // L: 11790
				class11.sceneMinimapSprite.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, var6, var7, var5, 256, var4.xStarts, var4.xWidths); // L: 11791

				int var8;
				int var10;
				int var16;
				for (var8 = 0; var8 < Client.mapIconCount; ++var8) { // L: 11792
					var16 = Client.mapIconXs[var8] * 4 + 2 - class67.localPlayer.x / 32; // L: 11793
					var10 = Client.mapIconYs[var8] * 4 + 2 - class67.localPlayer.y / 32; // L: 11794
					class146.drawSpriteOnMinimap(var1, var2, var16, var10, Client.mapIcons[var8], var4); // L: 11795
				}

				int var11;
				int var12;
				for (var8 = 0; var8 < 104; ++var8) { // L: 11797
					for (var16 = 0; var16 < 104; ++var16) { // L: 11798
						NodeDeque var14 = Client.groundItems[Tiles.Client_plane][var8][var16]; // L: 11799
						if (var14 != null) { // L: 11800
							var11 = var8 * 4 + 2 - class67.localPlayer.x / 32; // L: 11801
							var12 = var16 * 4 + 2 - class67.localPlayer.y / 32; // L: 11802
							class146.drawSpriteOnMinimap(var1, var2, var11, var12, class296.mapDotSprites[0], var4); // L: 11803
						}
					}
				}

				for (var8 = 0; var8 < Client.npcCount; ++var8) { // L: 11807
					NPC var9 = Client.npcs[Client.npcIndices[var8]]; // L: 11808
					if (var9 != null && var9.isVisible()) { // L: 11809
						NPCComposition var18 = var9.definition; // L: 11810
						if (var18 != null && var18.transforms != null) { // L: 11811
							var18 = var18.transform();
						}

						if (var18 != null && var18.drawMapDot && var18.isInteractable) { // L: 11812
							var11 = var9.x / 32 - class67.localPlayer.x / 32; // L: 11813
							var12 = var9.y / 32 - class67.localPlayer.y / 32; // L: 11814
							class146.drawSpriteOnMinimap(var1, var2, var11, var12, class296.mapDotSprites[1], var4); // L: 11815
						}
					}
				}

				var8 = Players.Players_count; // L: 11819
				int[] var17 = Players.Players_indices; // L: 11820

				for (var10 = 0; var10 < var8; ++var10) { // L: 11821
					Player var15 = Client.players[var17[var10]]; // L: 11822
					if (var15 != null && var15.isVisible() && !var15.isHidden && var15 != class67.localPlayer) { // L: 11823
						var12 = var15.x / 32 - class67.localPlayer.x / 32; // L: 11824
						int var13 = var15.y / 32 - class67.localPlayer.y / 32; // L: 11825
						if (var15.isFriend()) { // L: 11826
							class146.drawSpriteOnMinimap(var1, var2, var12, var13, class296.mapDotSprites[3], var4);
						} else if (class67.localPlayer.team != 0 && var15.team != 0 && var15.team == class67.localPlayer.team) { // L: 11827
							class146.drawSpriteOnMinimap(var1, var2, var12, var13, class296.mapDotSprites[4], var4);
						} else if (var15.isFriendsChatMember()) { // L: 11828
							class146.drawSpriteOnMinimap(var1, var2, var12, var13, class296.mapDotSprites[5], var4);
						} else if (var15.isClanMember()) { // L: 11829
							class146.drawSpriteOnMinimap(var1, var2, var12, var13, class296.mapDotSprites[6], var4);
						} else {
							class146.drawSpriteOnMinimap(var1, var2, var12, var13, class296.mapDotSprites[2], var4); // L: 11830
						}
					}
				}

				if (Client.hintArrowType != 0 && Client.cycle % 20 < 10) { // L: 11833
					if (Client.hintArrowType == 1 && Client.hintArrowNpcIndex >= 0 && Client.hintArrowNpcIndex < Client.npcs.length) { // L: 11834
						NPC var19 = Client.npcs[Client.hintArrowNpcIndex]; // L: 11835
						if (var19 != null) { // L: 11836
							var11 = var19.x / 32 - class67.localPlayer.x / 32; // L: 11837
							var12 = var19.y / 32 - class67.localPlayer.y / 32; // L: 11838
							UrlRequest.worldToMinimap(var1, var2, var11, var12, class97.mapMarkerSprites[1], var4); // L: 11839
						}
					}

					if (Client.hintArrowType == 2) { // L: 11842
						var10 = Client.hintArrowX * 4 - class128.baseX * 256 + 2 - class67.localPlayer.x / 32; // L: 11843
						var11 = Client.hintArrowY * 4 - WorldMapData_1.baseY * 256 + 2 - class67.localPlayer.y / 32; // L: 11844
						UrlRequest.worldToMinimap(var1, var2, var10, var11, class97.mapMarkerSprites[1], var4); // L: 11845
					}

					if (Client.hintArrowType == 10 && Client.hintArrowPlayerIndex >= 0 && Client.hintArrowPlayerIndex < Client.players.length) { // L: 11847
						Player var20 = Client.players[Client.hintArrowPlayerIndex]; // L: 11848
						if (var20 != null) { // L: 11849
							var11 = var20.x / 32 - class67.localPlayer.x / 32; // L: 11850
							var12 = var20.y / 32 - class67.localPlayer.y / 32; // L: 11851
							UrlRequest.worldToMinimap(var1, var2, var11, var12, class97.mapMarkerSprites[1], var4); // L: 11852
						}
					}
				}

				if (Client.destinationX != 0) { // L: 11856
					var10 = Client.destinationX * 4 + 2 - class67.localPlayer.x / 32; // L: 11857
					var11 = Client.destinationY * 4 + 2 - class67.localPlayer.y / 32; // L: 11858
					class146.drawSpriteOnMinimap(var1, var2, var10, var11, class97.mapMarkerSprites[0], var4); // L: 11859
				}

				if (!class67.localPlayer.isHidden) { // L: 11861
					Rasterizer2D.Rasterizer2D_fillRectangle(var4.width / 2 + var1 - 1, var4.height / 2 + var2 - 1, 3, 3, 16777215);
				}
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 11863
			}

			Client.field556[var3] = true; // L: 11864
		}
	} // L: 11865

	@ObfuscatedName("lh")
	@ObfuscatedSignature(
		descriptor = "(Lkw;IIIB)V",
		garbageValue = "1"
	)
	@Export("drawCompass")
	static final void drawCompass(Widget var0, int var1, int var2, int var3) {
		SpriteMask var4 = var0.getSpriteMask(false); // L: 11868
		if (var4 != null) { // L: 11869
			if (Client.minimapState < 3) { // L: 11870
				class14.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
			} else {
				Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths); // L: 11871
			}

		}
	} // L: 11872
}
