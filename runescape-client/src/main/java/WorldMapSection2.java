import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ky")
@Implements("WorldMapSection2")
public class WorldMapSection2 implements WorldMapSection {
	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "Lqb;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1175493055
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 67806907
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1274329653
	)
	@Export("regionStartX")
	int regionStartX;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1017322657
	)
	@Export("regionStartY")
	int regionStartY;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1093060133
	)
	@Export("regionEndX")
	int regionEndX;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -2090173435
	)
	@Export("regionEndY")
	int regionEndY;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1674055677
	)
	int field3058;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 701348013
	)
	int field3063;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1838745981
	)
	int field3065;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1496156289
	)
	int field3066;

	WorldMapSection2() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lkz;I)V",
		garbageValue = "45239804"
	)
	@Export("expandBounds")
	public void expandBounds(WorldMapArea var1) {
		if (var1.regionLowX > this.field3058) {
			var1.regionLowX = this.field3058;
		}

		if (var1.regionHighX < this.field3065) {
			var1.regionHighX = this.field3065;
		}

		if (var1.regionLowY > this.field3063) {
			var1.regionLowY = this.field3063;
		}

		if (var1.regionHighY < this.field3066) {
			var1.regionHighY = this.field3066;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1685132689"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		if (var1 >= this.minPlane && var1 < this.minPlane + this.planes) {
			return var2 >> 6 >= this.regionStartX && var2 >> 6 <= this.regionEndX && var3 >> 6 >= this.regionStartY && var3 >> 6 <= this.regionEndY;
		} else {
			return false;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1460062086"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		return var1 >> 6 >= this.field3058 && var1 >> 6 <= this.field3065 && var2 >> 6 >= this.field3063 && var2 >> 6 <= this.field3066;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-1177670631"
	)
	@Export("getBorderTileLengths")
	public int[] getBorderTileLengths(int var1, int var2, int var3) {
		if (!this.containsCoord(var1, var2, var3)) {
			return null;
		} else {
			int[] var4 = new int[]{this.field3058 * 64 - this.regionStartX * 64 + var2, var3 + (this.field3063 * 64 - this.regionStartY * 64)};
			return var4;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)Lnj;",
		garbageValue = "-2141859493"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		if (!this.containsPosition(var1, var2)) {
			return null;
		} else {
			int var3 = this.regionStartX * 64 - this.field3058 * 64 + var1;
			int var4 = this.regionStartY * 64 - this.field3063 * 64 + var2;
			return new Coord(this.minPlane, var3, var4);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lua;B)V",
		garbageValue = "-78"
	)
	@Export("read")
	public void read(Buffer var1) {
		this.minPlane = var1.readUnsignedByte();
		this.planes = var1.readUnsignedByte();
		this.regionStartX = var1.readUnsignedShort();
		this.regionStartY = var1.readUnsignedShort();
		this.regionEndX = var1.readUnsignedShort();
		this.regionEndY = var1.readUnsignedShort();
		this.field3058 = var1.readUnsignedShort();
		this.field3063 = var1.readUnsignedShort();
		this.field3065 = var1.readUnsignedShort();
		this.field3066 = var1.readUnsignedShort();
		this.postRead();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("postRead")
	void postRead() {
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(BI)Ljv;",
		garbageValue = "-1789162897"
	)
	public static class237 method5520(byte var0) {
		class237[] var1 = class237.field2533;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class237 var3 = var1[var2];
			if (var0 == var3.field2532) {
				return var3;
			}
		}

		throw new RuntimeException("Could not find MoveSpeed with ID " + var0);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-535233451"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0;
		Login.Login_response2 = var1;
		Login.Login_response3 = var2;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1795635529"
	)
	static int method5549(int var0) {
		return (int)((Math.log((double)var0) / Interpreter.field894 - 7.0D) * 256.0D);
	}

	@ObfuscatedName("kc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("loadRegion")
	static final void loadRegion() {
		HttpRequest.method99(false);
		Client.field595 = 0;
		boolean var0 = true;

		int var1;
		for (var1 = 0; var1 < class140.regionLandArchives.length; ++var1) {
			if (class157.regionMapArchiveIds[var1] != -1 && class140.regionLandArchives[var1] == null) {
				class140.regionLandArchives[var1] = SceneTilePaint.archive9.takeFile(class157.regionMapArchiveIds[var1], 0);
				if (class140.regionLandArchives[var1] == null) {
					var0 = false;
					++Client.field595;
				}
			}

			if (DesktopPlatformInfoProvider.regionLandArchiveIds[var1] != -1 && WorldMapArchiveLoader.regionMapArchives[var1] == null) {
				WorldMapArchiveLoader.regionMapArchives[var1] = SceneTilePaint.archive9.takeFileEncrypted(DesktopPlatformInfoProvider.regionLandArchiveIds[var1], 0, class17.xteaKeys[var1]);
				if (WorldMapArchiveLoader.regionMapArchives[var1] == null) {
					var0 = false;
					++Client.field595;
				}
			}
		}

		if (!var0) {
			Client.field584 = 1;
		} else {
			Client.field699 = 0;
			var0 = true;

			int var3;
			int var4;
			for (var1 = 0; var1 < class140.regionLandArchives.length; ++var1) {
				byte[] var17 = WorldMapArchiveLoader.regionMapArchives[var1];
				if (var17 != null) {
					var3 = (Client.regions[var1] >> 8) * 64 - class358.topLevelWorldView.baseX;
					var4 = (Client.regions[var1] & 255) * 64 - class358.topLevelWorldView.baseY;
					if (Client.isInInstance) {
						var3 = 10;
						var4 = 10;
					}

					var0 &= AbstractSocket.method8801(var17, var3, var4);
				}
			}

			if (!var0) {
				Client.field584 = 2;
			} else {
				if (Client.field584 != 0) {
					IgnoreList.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				class212.method4031();
				class358.topLevelWorldView.scene.clearTempGameObjects();

				for (var1 = 0; var1 < 4; ++var1) {
					class358.topLevelWorldView.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) {
					for (var2 = 0; var2 < 104; ++var2) {
						for (var3 = 0; var3 < 104; ++var3) {
							class358.topLevelWorldView.tileSettings[var1][var2][var3] = 0;
						}
					}
				}

				class212.method4031();
				GrandExchangeOfferNameComparator.method7382();
				var1 = class140.regionLandArchives.length;
				class151.method3270();
				HttpRequest.method99(true);
				int var5;
				if (!Client.isInInstance) {
					byte[] var16;
					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (Client.regions[var2] >> 8) * 64 - class358.topLevelWorldView.baseX;
						var4 = (Client.regions[var2] & 255) * 64 - class358.topLevelWorldView.baseY;
						var16 = class140.regionLandArchives[var2];
						if (var16 != null) {
							class212.method4031();
							class485.method8896(class358.topLevelWorldView, var16, var3, var4, class485.field5007 * 8 - 48, DelayFadeTask.field4786 * 8 - 48);
						}
					}

					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (Client.regions[var2] >> 8) * 64 - class358.topLevelWorldView.baseX;
						var4 = (Client.regions[var2] & 255) * 64 - class358.topLevelWorldView.baseY;
						var16 = class140.regionLandArchives[var2];
						if (var16 == null && DelayFadeTask.field4786 < 800) {
							class212.method4031();
							class232.method4489(class358.topLevelWorldView, var3, var4, 64, 64);
						}
					}

					HttpRequest.method99(true);

					for (var2 = 0; var2 < var1; ++var2) {
						byte[] var15 = WorldMapArchiveLoader.regionMapArchives[var2];
						if (var15 != null) {
							var4 = (Client.regions[var2] >> 8) * 64 - class358.topLevelWorldView.baseX;
							var5 = (Client.regions[var2] & 255) * 64 - class358.topLevelWorldView.baseY;
							class212.method4031();
							class134.method3113(class358.topLevelWorldView, var15, var4, var5);
						}
					}
				}

				int var6;
				int var7;
				int var8;
				if (Client.isInInstance) {
					int var9;
					int var10;
					int var11;
					for (var2 = 0; var2 < 4; ++var2) {
						class212.method4031();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								boolean var18 = false;
								var6 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var6 != -1) {
									var7 = var6 >> 24 & 3;
									var8 = var6 >> 1 & 3;
									var9 = var6 >> 14 & 1023;
									var10 = var6 >> 3 & 2047;
									var11 = (var9 / 8 << 8) + var10 / 8;

									for (int var12 = 0; var12 < Client.regions.length; ++var12) {
										if (Client.regions[var12] == var11 && class140.regionLandArchives[var12] != null) {
											int var13 = (var9 - var3) * 8;
											int var14 = (var10 - var4) * 8;
											UserComparator10.method2998(class358.topLevelWorldView, class140.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14);
											var18 = true;
											break;
										}
									}
								}

								if (!var18) {
									SequenceDefinition.method4373(class358.topLevelWorldView.tileHeights, var2, var3 * 8, var4 * 8);
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) {
						for (var3 = 0; var3 < 13; ++var3) {
							var4 = Client.instanceChunkTemplates[0][var2][var3];
							if (var4 == -1) {
								class232.method4489(class358.topLevelWorldView, var2 * 8, var3 * 8, 8, 8);
							}
						}
					}

					HttpRequest.method99(true);

					for (var2 = 0; var2 < 4; ++var2) {
						class212.method4031();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								var5 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var5 != -1) {
									var6 = var5 >> 24 & 3;
									var7 = var5 >> 1 & 3;
									var8 = var5 >> 14 & 1023;
									var9 = var5 >> 3 & 2047;
									var10 = (var8 / 8 << 8) + var9 / 8;

									for (var11 = 0; var11 < Client.regions.length; ++var11) {
										if (Client.regions[var11] == var10 && WorldMapArchiveLoader.regionMapArchives[var11] != null) {
											Tiles.method2249(class358.topLevelWorldView, WorldMapArchiveLoader.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7);
											break;
										}
									}
								}
							}
						}
					}
				}

				HttpRequest.method99(true);
				class212.method4031();
				class533.method9517(class358.topLevelWorldView);
				HttpRequest.method99(true);
				var2 = Tiles.Tiles_minPlane;
				if (var2 > class358.topLevelWorldView.plane) {
					var2 = class358.topLevelWorldView.plane;
				}

				if (var2 < class358.topLevelWorldView.plane - 1) {
					var2 = class358.topLevelWorldView.plane - 1;
				}

				if (Client.isLowDetail) {
					class358.topLevelWorldView.scene.init(Tiles.Tiles_minPlane);
				} else {
					class358.topLevelWorldView.scene.init(0);
				}

				for (var3 = 0; var3 < 104; ++var3) {
					for (var4 = 0; var4 < 104; ++var4) {
						WorldMapLabelSize.method5493(class358.topLevelWorldView, var3, var4);
					}
				}

				class212.method4031();
				class451.method8409();
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				PacketBufferNode var19;
				if (class188.client.hasFrame()) {
					var19 = WorldMapElement.getPacketBufferNode(ClientPacket.field3363, Client.packetWriter.isaacCipher);
					var19.packetBuffer.writeInt(1057001181);
					Client.packetWriter.addNode(var19);
				}

				if (!Client.isInInstance) {
					var3 = (class485.field5007 - 6) / 8;
					var4 = (class485.field5007 + 6) / 8;
					var5 = (DelayFadeTask.field4786 - 6) / 8;
					var6 = (DelayFadeTask.field4786 + 6) / 8;

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) {
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) {
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) {
								SceneTilePaint.archive9.loadRegionFromName("m" + var7 + "_" + var8);
								SceneTilePaint.archive9.loadRegionFromName("l" + var7 + "_" + var8);
							}
						}
					}
				}

				class212.method4031();
				UserComparator6.method3016();
				var19 = WorldMapElement.getPacketBufferNode(ClientPacket.field3292, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var19);
				Canvas.method311();
				Client.field527 = false;
			}
		}
	}
}
