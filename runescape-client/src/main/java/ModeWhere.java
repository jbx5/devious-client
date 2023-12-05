import java.util.HashSet;
import java.util.Set;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ok")
@Implements("ModeWhere")
public enum ModeWhere implements Enum
{
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4417("", 0, new class382[]{class382.field4393, class382.field4392}),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4414("", 1, new class382[]{class382.field4390, class382.field4393, class382.field4392}),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4415("", 2, new class382[]{class382.field4390, class382.field4391, class382.field4393}),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4416("", 3, new class382[]{class382.field4390}),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4419("", 4),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4424("", 5, new class382[]{class382.field4390, class382.field4393}),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4431("", 6, new class382[]{class382.field4393}),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4420("", 8, new class382[]{class382.field4390, class382.field4393}),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4421("", 9, new class382[]{class382.field4390, class382.field4391}),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4422("", 10, new class382[]{class382.field4390}),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4423("", 11, new class382[]{class382.field4390}),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4428("", 12, new class382[]{class382.field4390, class382.field4393}),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	field4413("", 13, new class382[]{class382.field4390});

	@ObfuscatedName("bk")
	static String field4426;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -55608669
	)
	@Export("id")
	final int id;
	@ObfuscatedName("ay")
	final Set field4427;

	static {
		method7209();
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I[Lot;)V"
	)
	ModeWhere(String var3, int var4, class382[] var5) {
		this.field4427 = new HashSet();
		this.id = var4;
		class382[] var6 = var5;

		for (int var7 = 0; var7 < var6.length; ++var7) {
			class382 var8 = var6[var7];
			this.field4427.add(var8);
		}

	}

	ModeWhere(String var3, int var4) {
		this.field4427 = new HashSet();
		this.id = var4;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)[Lok;",
		garbageValue = "435699803"
	)
	static ModeWhere[] method7209() {
		return new ModeWhere[]{field4421, field4413, field4428, field4420, field4419, field4415, field4417, field4423, field4424, field4414, field4431, field4422, field4416};
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ldt;",
		garbageValue = "-1608087816"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = class10.method109(var1, var0);
		Script var4 = WorldMapData_1.method4789(var3, var0);
		if (var4 != null) {
			return var4;
		} else {
			int var5 = (-3 - var2 << 8) + var0;
			var4 = WorldMapData_1.method4789(var5, var0);
			if (var4 != null) {
				return var4;
			} else {
				int var6 = var0 + -512;
				var4 = WorldMapData_1.method4789(var6, var0);
				return var4 != null ? var4 : null;
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "277734474"
	)
	public static void method7211() {
		ParamComposition.ParamDefinition_cached.clear();
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-46"
	)
	static final void method7205() {
		LoginScreenAnimation.method2513(false);
		Client.field555 = 0;
		boolean var0 = true;

		int var1;
		for (var1 = 0; var1 < WorldMapData_1.regionLandArchives.length; ++var1) {
			if (UserComparator7.regionMapArchiveIds[var1] != -1 && WorldMapData_1.regionLandArchives[var1] == null) {
				WorldMapData_1.regionLandArchives[var1] = WorldMapSection0.archive9.takeFile(UserComparator7.regionMapArchiveIds[var1], 0);
				if (WorldMapData_1.regionLandArchives[var1] == null) {
					var0 = false;
					++Client.field555;
				}
			}

			if (UserComparator3.regionLandArchiveIds[var1] != -1 && GrandExchangeEvent.regionMapArchives[var1] == null) {
				GrandExchangeEvent.regionMapArchives[var1] = WorldMapSection0.archive9.takeFileEncrypted(UserComparator3.regionLandArchiveIds[var1], 0, Varcs.xteaKeys[var1]);
				if (GrandExchangeEvent.regionMapArchives[var1] == null) {
					var0 = false;
					++Client.field555;
				}
			}
		}

		if (!var0) {
			Client.field559 = 1;
		} else {
			Client.field521 = 0;
			var0 = true;

			int var3;
			int var4;
			for (var1 = 0; var1 < WorldMapData_1.regionLandArchives.length; ++var1) {
				byte[] var17 = GrandExchangeEvent.regionMapArchives[var1];
				if (var17 != null) {
					var3 = (KitDefinition.regions[var1] >> 8) * 64 - NpcOverrides.baseX * 64;
					var4 = (KitDefinition.regions[var1] & 255) * 64 - class101.baseY * 64;
					if (Client.isInInstance) {
						var3 = 10;
						var4 = 10;
					}

					var0 &= class150.method3283(var17, var3, var4);
				}
			}

			if (!var0) {
				Client.field559 = 2;
			} else {
				if (Client.field559 != 0) {
					LoginPacket.drawLoadingMessage("Loading - please wait." + "<br>" + " (" + 100 + "%" + ")", true);
				}

				class102.method2728();
				class36.scene.clear();

				for (var1 = 0; var1 < 4; ++var1) {
					Client.collisionMaps[var1].clear();
				}

				int var2;
				for (var1 = 0; var1 < 4; ++var1) {
					for (var2 = 0; var2 < 104; ++var2) {
						for (var3 = 0; var3 < 104; ++var3) {
							Tiles.Tiles_renderFlags[var1][var2][var3] = 0;
						}
					}
				}

				class102.method2728();
				MidiPcmStream.method6133();
				var1 = WorldMapData_1.regionLandArchives.length;
				WorldMapSectionType.method4888();
				LoginScreenAnimation.method2513(true);
				int var5;
				if (!Client.isInInstance) {
					byte[] var16;
					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (KitDefinition.regions[var2] >> 8) * 64 - NpcOverrides.baseX * 64;
						var4 = (KitDefinition.regions[var2] & 255) * 64 - class101.baseY * 64;
						var16 = WorldMapData_1.regionLandArchives[var2];
						if (var16 != null) {
							class102.method2728();
							class427.method7947(var16, var3, var4, DefaultsGroup.field4740 * 8 - 48, class223.field2367 * 8 - 48, Client.collisionMaps);
						}
					}

					for (var2 = 0; var2 < var1; ++var2) {
						var3 = (KitDefinition.regions[var2] >> 8) * 64 - NpcOverrides.baseX * 64;
						var4 = (KitDefinition.regions[var2] & 255) * 64 - class101.baseY * 64;
						var16 = WorldMapData_1.regionLandArchives[var2];
						if (var16 == null && class223.field2367 < 800) {
							class102.method2728();
							MouseHandler.method670(var3, var4, 64, 64);
						}
					}

					LoginScreenAnimation.method2513(true);

					for (var2 = 0; var2 < var1; ++var2) {
						byte[] var15 = GrandExchangeEvent.regionMapArchives[var2];
						if (var15 != null) {
							var4 = (KitDefinition.regions[var2] >> 8) * 64 - NpcOverrides.baseX * 64;
							var5 = (KitDefinition.regions[var2] & 255) * 64 - class101.baseY * 64;
							class102.method2728();
							class250.method4934(var15, var4, var5, class36.scene, Client.collisionMaps);
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
						class102.method2728();

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

									for (int var12 = 0; var12 < KitDefinition.regions.length; ++var12) {
										if (KitDefinition.regions[var12] == var11 && WorldMapData_1.regionLandArchives[var12] != null) {
											int var13 = (var9 - var3) * 8;
											int var14 = (var10 - var4) * 8;
											GameEngine.method544(WorldMapData_1.regionLandArchives[var12], var2, var3 * 8, var4 * 8, var7, (var9 & 7) * 8, (var10 & 7) * 8, var8, var13, var14, Client.collisionMaps);
											var18 = true;
											break;
										}
									}
								}

								if (!var18) {
									class230.method4458(var2, var3 * 8, var4 * 8);
								}
							}
						}
					}

					for (var2 = 0; var2 < 13; ++var2) {
						for (var3 = 0; var3 < 13; ++var3) {
							var4 = Client.instanceChunkTemplates[0][var2][var3];
							if (var4 == -1) {
								MouseHandler.method670(var2 * 8, var3 * 8, 8, 8);
							}
						}
					}

					LoginScreenAnimation.method2513(true);

					for (var2 = 0; var2 < 4; ++var2) {
						class102.method2728();

						for (var3 = 0; var3 < 13; ++var3) {
							for (var4 = 0; var4 < 13; ++var4) {
								var5 = Client.instanceChunkTemplates[var2][var3][var4];
								if (var5 != -1) {
									var6 = var5 >> 24 & 3;
									var7 = var5 >> 1 & 3;
									var8 = var5 >> 14 & 1023;
									var9 = var5 >> 3 & 2047;
									var10 = (var8 / 8 << 8) + var9 / 8;

									for (var11 = 0; var11 < KitDefinition.regions.length; ++var11) {
										if (KitDefinition.regions[var11] == var10 && GrandExchangeEvent.regionMapArchives[var11] != null) {
											Tiles.method2294(GrandExchangeEvent.regionMapArchives[var11], var2, var3 * 8, var4 * 8, var6, (var8 & 7) * 8, (var9 & 7) * 8, var7, class36.scene, Client.collisionMaps);
											break;
										}
									}
								}
							}
						}
					}
				}

				LoginScreenAnimation.method2513(true);
				class102.method2728();
				class156.method3394(class36.scene, Client.collisionMaps);
				LoginScreenAnimation.method2513(true);
				var2 = Tiles.Tiles_minPlane;
				if (var2 > ItemLayer.Client_plane) {
					var2 = ItemLayer.Client_plane;
				}

				if (var2 < ItemLayer.Client_plane - 1) {
					var2 = ItemLayer.Client_plane - 1;
				}

				if (Client.isLowDetail) {
					class36.scene.init(Tiles.Tiles_minPlane);
				} else {
					class36.scene.init(0);
				}

				for (var3 = 0; var3 < 104; ++var3) {
					for (var4 = 0; var4 < 104; ++var4) {
						ClanSettings.updateItemPile(var3, var4);
					}
				}

				class102.method2728();
				class90.method2384();
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				PacketBufferNode var19;
				if (SpriteMask.client.hasFrame()) {
					var19 = class113.getPacketBufferNode(ClientPacket.DETECT_MODIFIED_CLIENT, Client.packetWriter.isaacCipher);
					var19.packetBuffer.writeInt(1057001181);
					Client.packetWriter.addNode(var19);
				}

				if (!Client.isInInstance) {
					var3 = (DefaultsGroup.field4740 - 6) / 8;
					var4 = (DefaultsGroup.field4740 + 6) / 8;
					var5 = (class223.field2367 - 6) / 8;
					var6 = (class223.field2367 + 6) / 8;

					for (var7 = var3 - 1; var7 <= var4 + 1; ++var7) {
						for (var8 = var5 - 1; var8 <= var6 + 1; ++var8) {
							if (var7 < var3 || var7 > var4 || var8 < var5 || var8 > var6) {
								WorldMapSection0.archive9.loadRegionFromName("m" + var7 + "_" + var8);
								WorldMapSection0.archive9.loadRegionFromName("l" + var7 + "_" + var8);
							}
						}
					}
				}

				WorldMapSection2.updateGameState(30);
				class102.method2728();
				class320.method6187();
				var19 = class113.getPacketBufferNode(ClientPacket.field3198, Client.packetWriter.isaacCipher);
				Client.packetWriter.addNode(var19);
				WorldMapRenderer.method4746();
			}
		}
	}
}
