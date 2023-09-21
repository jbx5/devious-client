import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qy")
public class class432 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)Lng;",
		garbageValue = "-17"
	)
	public static GameBuild method7855(int var0) {
		GameBuild[] var1 = class209.method3850();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			GameBuild var3 = var1[var2];
			if (var0 == var3.buildId) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Lte;I)Ljava/lang/String;",
		garbageValue = "1990083355"
	)
	public static String method7856(CharSequence var0, LoginType var1) {
		if (var0 == null) {
			return null;
		} else {
			int var2 = 0;

			int var3;
			for (var3 = var0.length(); var2 < var3 && DevicePcmPlayerProvider.method313(var0.charAt(var2)); ++var2) {
			}

			while (var3 > var2 && DevicePcmPlayerProvider.method313(var0.charAt(var3 - 1))) {
				--var3;
			}

			int var4 = var3 - var2;
			if (var4 >= 1) {
				byte var6;
				if (var1 == null) {
					var6 = 12;
				} else {
					switch(var1.field5036) {
					case 8:
						var6 = 20;
						break;
					default:
						var6 = 12;
					}
				}

				if (var4 <= var6) {
					StringBuilder var10 = new StringBuilder(var4);

					for (int var11 = var2; var11 < var3; ++var11) {
						char var7 = var0.charAt(var11);
						if (class410.method7606(var7)) {
							char var8;
							switch(var7) {
							case ' ':
							case '-':
							case '_':
							case ' ':
								var8 = '_';
								break;
							case '#':
							case '[':
							case ']':
								var8 = var7;
								break;
							case 'À':
							case 'Á':
							case 'Â':
							case 'Ã':
							case 'Ä':
							case 'à':
							case 'á':
							case 'â':
							case 'ã':
							case 'ä':
								var8 = 'a';
								break;
							case 'Ç':
							case 'ç':
								var8 = 'c';
								break;
							case 'È':
							case 'É':
							case 'Ê':
							case 'Ë':
							case 'è':
							case 'é':
							case 'ê':
							case 'ë':
								var8 = 'e';
								break;
							case 'Í':
							case 'Î':
							case 'Ï':
							case 'í':
							case 'î':
							case 'ï':
								var8 = 'i';
								break;
							case 'Ñ':
							case 'ñ':
								var8 = 'n';
								break;
							case 'Ò':
							case 'Ó':
							case 'Ô':
							case 'Õ':
							case 'Ö':
							case 'ò':
							case 'ó':
							case 'ô':
							case 'õ':
							case 'ö':
								var8 = 'o';
								break;
							case 'Ù':
							case 'Ú':
							case 'Û':
							case 'Ü':
							case 'ù':
							case 'ú':
							case 'û':
							case 'ü':
								var8 = 'u';
								break;
							case 'ß':
								var8 = 'b';
								break;
							case 'ÿ':
							case 'Ÿ':
								var8 = 'y';
								break;
							default:
								var8 = Character.toLowerCase(var7);
							}

							if (var8 != 0) {
								var10.append(var8);
							}
						}
					}

					if (var10.length() == 0) {
						return null;
					}

					return var10.toString();
				}
			}

			return null;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1639340549"
	)
	static final int method7853(int var0, int var1, int var2) {
		int var3 = var0 / var2;
		int var4 = var0 & var2 - 1;
		int var5 = var1 / var2;
		int var6 = var1 & var2 - 1;
		int var7 = Login.method2140(var3, var5);
		int var8 = Login.method2140(var3 + 1, var5);
		int var9 = Login.method2140(var3, var5 + 1);
		int var10 = Login.method2140(var3 + 1, var5 + 1);
		int var12 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1;
		int var11 = ((65536 - var12) * var7 >> 16) + (var8 * var12 >> 16);
		int var14 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var4 * 1024 / var2] >> 1;
		int var13 = ((65536 - var14) * var9 >> 16) + (var14 * var10 >> 16);
		int var16 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var6 * 1024 / var2] >> 1;
		int var15 = ((65536 - var16) * var11 >> 16) + (var16 * var13 >> 16);
		return var15;
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-2048863537"
	)
	@Export("drawEntities")
	static final void drawEntities(int var0, int var1, int var2, int var3) {
		++Client.viewportDrawCount;
		if (TextureProvider.localPlayer.x >> 7 == Client.destinationX && TextureProvider.localPlayer.y >> 7 == Client.destinationY) {
			Client.destinationX = 0;
		}

		if (Client.field648) {
			class199.addPlayerToScene(TextureProvider.localPlayer, false);
		}

		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) {
			class199.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false);
		}

		TileItem.addNpcsToScene(true);
		WorldMapArchiveLoader.method8643();
		TileItem.addNpcsToScene(false);
		class471.method8460();

		for (GraphicsObject var4 = (GraphicsObject)Client.graphicsObjects.last(); var4 != null; var4 = (GraphicsObject)Client.graphicsObjects.previous()) {
			if (var4.plane == class87.Client_plane && !var4.isFinished) {
				if (Client.cycle >= var4.cycleStart) {
					var4.advance(Client.graphicsCycle);
					if (var4.isFinished) {
						var4.remove();
					} else {
						class10.scene.drawEntity(var4.plane, var4.x, var4.y, var4.z, 60, var4, 0, -1L, false);
					}
				}
			} else {
				var4.remove();
			}
		}

		class53.setViewportShape(var0, var1, var2, var3, true);
		var0 = Client.viewportOffsetX;
		var1 = Client.viewportOffsetY;
		var2 = Client.viewportWidth;
		var3 = Client.viewportHeight;
		Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
		Rasterizer3D.method4535();
		Rasterizer2D.method9547();
		int var37 = Client.camAngleX;
		if (Client.field621 / 256 > var37) {
			var37 = Client.field621 / 256;
		}

		if (Client.field786[4] && Client.field680[4] + 128 > var37) {
			var37 = Client.field680[4] + 128;
		}

		int var5 = Client.camAngleY & 2047;
		int var6 = ChatChannel.oculusOrbFocalPointX;
		int var7 = class433.field4639;
		int var8 = AbstractWorldMapData.oculusOrbFocalPointY;
		int var9 = var37 * 3 + 600;
		int var12 = var3 - 334;
		if (var12 < 0) {
			var12 = 0;
		} else if (var12 > 100) {
			var12 = 100;
		}

		int var13 = (Client.zoomWidth - Client.zoomHeight) * var12 / 100 + Client.zoomHeight;
		int var11 = var13 * var9 / 256;
		var12 = 2048 - var37 & 2047;
		var13 = 2048 - var5 & 2047;
		int var14 = 0;
		int var15 = 0;
		int var16 = var11;
		int var17;
		int var18;
		int var19;
		if (var12 != 0) {
			var17 = Rasterizer3D.Rasterizer3D_sine[var12];
			var18 = Rasterizer3D.Rasterizer3D_cosine[var12];
			var19 = var18 * var15 - var17 * var11 >> 16;
			var16 = var18 * var11 + var15 * var17 >> 16;
			var15 = var19;
		}

		if (var13 != 0) {
			var17 = Rasterizer3D.Rasterizer3D_sine[var13];
			var18 = Rasterizer3D.Rasterizer3D_cosine[var13];
			var19 = var17 * var16 + var14 * var18 >> 16;
			var16 = var18 * var16 - var14 * var17 >> 16;
			var14 = var19;
		}

		if (Client.isCameraLocked) {
			AbstractUserComparator.field4701 = var6 - var14;
			TriBool.field4718 = var7 - var15;
			JagexCache.field1844 = var8 - var16;
			class14.field76 = var37;
			GrandExchangeOfferOwnWorldComparator.field516 = var5;
		} else {
			Client.cameraX = var6 - var14;
			class17.cameraY = var7 - var15;
			WorldMapArea.cameraZ = var8 - var16;
			class365.cameraPitch = var37;
			WallDecoration.cameraYaw = var5;
		}

		if (Client.oculusOrbState == 1 && Client.staffModLevel >= 2 && Client.cycle % 50 == 0 && (ChatChannel.oculusOrbFocalPointX >> 7 != TextureProvider.localPlayer.x >> 7 || AbstractWorldMapData.oculusOrbFocalPointY >> 7 != TextureProvider.localPlayer.y >> 7)) {
			var17 = TextureProvider.localPlayer.plane;
			var18 = class20.baseX * 64 + (ChatChannel.oculusOrbFocalPointX >> 7);
			var19 = class19.baseY * 64 + (AbstractWorldMapData.oculusOrbFocalPointY >> 7);
			PacketBufferNode var20 = ClanChannelMember.getPacketBufferNode(ClientPacket.field3154, Client.packetWriter.isaacCipher);
			var20.packetBuffer.writeShortAddLE(var18);
			var20.packetBuffer.writeShortLE(var19);
			var20.packetBuffer.writeInt(Client.field547);
			var20.packetBuffer.writeByteAdd(var17);
			Client.packetWriter.addNode(var20);
		}

		if (!Client.isCameraLocked) {
			var11 = class136.method3078();
		} else {
			var11 = class232.method4410();
		}

		var12 = Client.cameraX;
		var13 = class17.cameraY;
		var14 = WorldMapArea.cameraZ;
		var15 = class365.cameraPitch;
		var16 = WallDecoration.cameraYaw;

		for (var17 = 0; var17 < 5; ++var17) {
			if (Client.field786[var17]) {
				var18 = (int)(Math.random() * (double)(Client.field787[var17] * 2 + 1) - (double)Client.field787[var17] + Math.sin((double)Client.field707[var17] * ((double)Client.field789[var17] / 100.0D)) * (double)Client.field680[var17]);
				if (var17 == 0) {
					Client.cameraX += var18;
				}

				if (var17 == 1) {
					class17.cameraY += var18;
				}

				if (var17 == 2) {
					WorldMapArea.cameraZ += var18;
				}

				if (var17 == 3) {
					WallDecoration.cameraYaw = var18 + WallDecoration.cameraYaw & 2047;
				}

				if (var17 == 4) {
					class365.cameraPitch += var18;
					if (class365.cameraPitch < 128) {
						class365.cameraPitch = 128;
					}

					if (class365.cameraPitch > 383) {
						class365.cameraPitch = 383;
					}
				}
			}
		}

		var17 = MouseHandler.MouseHandler_x;
		var18 = MouseHandler.MouseHandler_y;
		if (MouseHandler.MouseHandler_lastButton != 0) {
			var17 = MouseHandler.MouseHandler_lastPressedX;
			var18 = MouseHandler.MouseHandler_lastPressedY;
		}

		if (var17 >= var0 && var17 < var0 + var2 && var18 >= var1 && var18 < var3 + var1) {
			class16.method197(var17 - var0, var18 - var1);
		} else {
			SpotAnimationDefinition.method3868();
		}

		class313.method5891();
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
		class313.method5891();
		var19 = Rasterizer3D.get3dZoom();
		Rasterizer3D.method4518(class159.client.field190);
		Rasterizer3D.clips.field2830 = Client.viewportZoom;
		class10.scene.draw(Client.cameraX, class17.cameraY, WorldMapArea.cameraZ, class365.cameraPitch, WallDecoration.cameraYaw, var11);
		Rasterizer3D.method4518(false);
		if (Client.renderSelf) {
			Rasterizer2D.method9539();
		}

		Rasterizer3D.clips.field2830 = var19;
		class313.method5891();
		class10.scene.clearTempGameObjects();
		Client.overheadTextCount = 0;
		boolean var38 = false;
		int var21 = -1;
		int var22 = -1;
		int var23 = Players.Players_count;
		int[] var24 = Players.Players_indices;

		int var25;
		for (var25 = 0; var25 < var23 + Client.npcCount; ++var25) {
			Object var40;
			if (var25 < var23) {
				var40 = Client.players[var24[var25]];
				if (var24[var25] == Client.combatTargetPlayerIndex) {
					var38 = true;
					var21 = var25;
					continue;
				}

				if (var40 == TextureProvider.localPlayer) {
					var22 = var25;
					continue;
				}
			} else {
				var40 = Client.npcs[Client.npcIndices[var25 - var23]];
			}

			class232.drawActor2d((Actor)var40, var25, var0, var1, var2, var3);
		}

		if (Client.field648 && var22 != -1) {
			class232.drawActor2d(TextureProvider.localPlayer, var22, var0, var1, var2, var3);
		}

		if (var38) {
			class232.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var21, var0, var1, var2, var3);
		}

		for (var25 = 0; var25 < Client.overheadTextCount; ++var25) {
			int var26 = Client.overheadTextXs[var25];
			int var27 = Client.overheadTextYs[var25];
			int var28 = Client.overheadTextXOffsets[var25];
			int var29 = Client.overheadTextAscents[var25];
			boolean var30 = true;

			while (var30) {
				var30 = false;

				for (int var39 = 0; var39 < var25; ++var39) {
					if (var27 + 2 > Client.overheadTextYs[var39] - Client.overheadTextAscents[var39] && var27 - var29 < Client.overheadTextYs[var39] + 2 && var26 - var28 < Client.overheadTextXOffsets[var39] + Client.overheadTextXs[var39] && var28 + var26 > Client.overheadTextXs[var39] - Client.overheadTextXOffsets[var39] && Client.overheadTextYs[var39] - Client.overheadTextAscents[var39] < var27) {
						var27 = Client.overheadTextYs[var39] - Client.overheadTextAscents[var39];
						var30 = true;
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var25];
			Client.viewportTempY = Client.overheadTextYs[var25] = var27;
			String var31 = Client.overheadText[var25];
			if (Client.chatEffects == 0) {
				int var32 = 16776960;
				if (Client.overheadTextColors[var25] < 6) {
					var32 = Client.field749[Client.overheadTextColors[var25]];
				}

				if (Client.overheadTextColors[var25] == 6) {
					var32 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var25] == 7) {
					var32 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var25] == 8) {
					var32 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var33;
				if (Client.overheadTextColors[var25] == 9) {
					var33 = 150 - Client.overheadTextCyclesRemaining[var25];
					if (var33 < 50) {
						var32 = var33 * 1280 + 16711680;
					} else if (var33 < 100) {
						var32 = 16776960 - (var33 - 50) * 327680;
					} else if (var33 < 150) {
						var32 = (var33 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var25] == 10) {
					var33 = 150 - Client.overheadTextCyclesRemaining[var25];
					if (var33 < 50) {
						var32 = var33 * 5 + 16711680;
					} else if (var33 < 100) {
						var32 = 16711935 - (var33 - 50) * 327680;
					} else if (var33 < 150) {
						var32 = (var33 - 100) * 327680 + 255 - (var33 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var25] == 11) {
					var33 = 150 - Client.overheadTextCyclesRemaining[var25];
					if (var33 < 50) {
						var32 = 16777215 - var33 * 327685;
					} else if (var33 < 100) {
						var32 = (var33 - 50) * 327685 + 65280;
					} else if (var33 < 150) {
						var32 = 16777215 - (var33 - 100) * 327680;
					}
				}

				int var34;
				if (Client.overheadTextColors[var25] == 12 && Client.field630[var25] == null) {
					var33 = var31.length();
					Client.field630[var25] = new int[var33];

					for (var34 = 0; var34 < var33; ++var34) {
						int var35 = (int)(64.0F * ((float)var34 / (float)var33));
						int var36 = var35 << 10 | 896 | 64;
						Client.field630[var25][var34] = class481.field4838[var36];
					}
				}

				if (Client.overheadTextEffects[var25] == 0) {
					SoundCache.fontBold12.method7626(var31, var0 + Client.viewportTempX, Client.viewportTempY + var1, var32, 0, Client.field630[var25]);
				}

				if (Client.overheadTextEffects[var25] == 1) {
					SoundCache.fontBold12.method7622(var31, var0 + Client.viewportTempX, Client.viewportTempY + var1, var32, 0, Client.viewportDrawCount, Client.field630[var25]);
				}

				if (Client.overheadTextEffects[var25] == 2) {
					SoundCache.fontBold12.method7627(var31, var0 + Client.viewportTempX, Client.viewportTempY + var1, var32, 0, Client.viewportDrawCount, Client.field630[var25]);
				}

				if (Client.overheadTextEffects[var25] == 3) {
					SoundCache.fontBold12.method7628(var31, var0 + Client.viewportTempX, Client.viewportTempY + var1, var32, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var25], Client.field630[var25]);
				}

				if (Client.overheadTextEffects[var25] == 4) {
					var33 = (150 - Client.overheadTextCyclesRemaining[var25]) * (SoundCache.fontBold12.stringWidth(var31) + 100) / 150;
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1);
					SoundCache.fontBold12.method7656(var31, var0 + Client.viewportTempX + 50 - var33, Client.viewportTempY + var1, var32, 0, Client.field630[var25]);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}

				if (Client.overheadTextEffects[var25] == 5) {
					var33 = 150 - Client.overheadTextCyclesRemaining[var25];
					var34 = 0;
					if (var33 < 25) {
						var34 = var33 - 25;
					} else if (var33 > 125) {
						var34 = var33 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - SoundCache.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5);
					SoundCache.fontBold12.method7626(var31, var0 + Client.viewportTempX, var34 + Client.viewportTempY + var1, var32, 0, Client.field630[var25]);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}
			} else {
				SoundCache.fontBold12.drawCentered(var31, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0);
			}
		}

		HealthBarDefinition.method3711(var0, var1);
		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).animate(Client.graphicsCycle);
		ConcurrentMidiTask.method7778();
		Client.cameraX = var12;
		class17.cameraY = var13;
		WorldMapArea.cameraZ = var14;
		class365.cameraPitch = var15;
		WallDecoration.cameraYaw = var16;
		if (Client.isLoading && class59.field452.method7007(true, false) == 0) {
			Client.isLoading = false;
		}

		if (Client.isLoading) {
			Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var3, 0);
			class427.drawLoadingMessage("Loading - please wait.", false);
		}

	}
}
