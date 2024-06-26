import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("no")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("aq")
	@Export("Varps_masks")
	static int[] Varps_masks;
	@ObfuscatedName("ag")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("ak")
	@Export("Varps_main")
	public static int[] Varps_main;

	static {
		Varps_masks = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			Varps_masks[var1] = var0 - 1;
			var0 += var0;
		}

		Varps_temp = new int[5000];
		Varps_main = new int[5000];
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "50"
	)
	public static boolean method6452(int var0, int var1) {
		return (var0 >> var1 + 1 & 1) != 0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ldu;III)V",
		garbageValue = "2102354700"
	)
	@Export("runScript")
	static void runScript(ScriptEvent var0, int var1, int var2) {
		Object[] var3 = var0.args;
		Script var4;
		if (class186.isWorldMapEvent(var0.type)) {
			TilesProjection.worldMapEvent = (WorldMapEvent)var3[0];
			WorldMapElement var6 = class165.WorldMapElement_get(TilesProjection.worldMapEvent.mapElement);
			var4 = Clock.getWorldMapScript(var0.type, var6.objectId, var6.category);
		} else {
			int var5 = (Integer)var3[0];
			var4 = class195.getScript(var5);
		}

		if (var4 != null) {
			PacketBufferNode.runScriptLogic(var0, var4, var1, var2);
		}

	}

	@ObfuscatedName("ht")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1341635037"
	)
	static void method6456() {
		if (Client.field535 == class94.field1157) {
			class424.field4703 = class221.newArchive(class385.field4516.field4518, false, true, true, false);
			class199.archive6 = class221.newArchive(class385.field4519.field4518, true, true, true, false);
			class7.archive8 = class221.newArchive(class385.field4500.field4518, false, true, true, false);
			WorldMapSection1.archive10 = class221.newArchive(class385.field4506.field4518, false, true, true, false);
			ChatChannel.archive13 = class221.newArchive(class385.field4512.field4518, true, false, true, false);
			class239.field2524 = class221.newArchive(class385.field4509.field4518, false, true, true, false);
			Tile.field2872 = class221.newArchive(class385.field4502.field4518, false, true, true, false);
			Login.method2185(20, "Connecting to update server");
			UserComparator7.method3008(class94.field1151);
		} else {
			int var0;
			byte var39;
			if (class94.field1151 == Client.field535) {
				var39 = 0;
				var0 = var39 + class424.field4703.percentage() * 53 / 100;
				var0 += class199.archive6.percentage() * 5 / 100;
				var0 += class7.archive8.percentage() * 36 / 100;
				var0 += WorldMapSection1.archive10.percentage() / 100;
				var0 += ChatChannel.archive13.percentage() / 100;
				var0 += class239.field2524.percentage() * 3 / 100;
				var0 += Tile.field2872.percentage() / 100;
				if (var0 != 100) {
					if (var0 != 0) {
						Login.method2185(30, "Checking for updates - " + var0 + "%");
					}

				} else {
					UserComparator10.method3025(class424.field4703, "Sound FX");
					UserComparator10.method3025(class199.archive6, "Music Tracks");
					UserComparator10.method3025(class7.archive8, "Sprites");
					UserComparator10.method3025(class239.field2524, "Music Samples");
					UserComparator10.method3025(Tile.field2872, "Music Patches");
					Login.method2185(40, "Loaded update list");
					UserComparator7.method3008(class94.field1153);
				}
			} else {
				int var33;
				if (Client.field535 == class94.field1153) {
					HorizontalAlignment.method3698(22050, !Client.isLowDetail, 2);
					ArrayList var42 = new ArrayList(3);
					TaskHandler var29 = GameEngine.taskHandler;
					short var32 = 2048;
					if (PcmPlayer.field263 == 0) {
						throw new IllegalStateException();
					} else {
						if (var32 < 256) {
							var32 = 256;
						}

						PcmPlayer var30;
						try {
							PcmPlayer var34 = MenuAction.pcmPlayerProvider.player();
							var34.samples = new int[256 * (SecureRandomFuture.PcmPlayer_stereo ? 2 : 1)];
							var34.field270 = var32;
							var34.init();
							var34.capacity = (var32 & -1024) + 1024;
							if (var34.capacity > 16384) {
								var34.capacity = 16384;
							}

							var34.open(var34.capacity);
							if (class379.field4434 > 0 && PcmPlayer.soundSystem == null) {
								PcmPlayer.soundSystem = new SoundSystem();
								PcmPlayer.soundSystemExecutor = Executors.newScheduledThreadPool(1);
								PcmPlayer.soundSystemExecutor.scheduleAtFixedRate(PcmPlayer.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
							}

							if (PcmPlayer.soundSystem != null) {
								if (PcmPlayer.soundSystem.players[0] != null) {
									throw new IllegalArgumentException();
								}

								PcmPlayer.soundSystem.players[0] = var34;
							}

							var30 = var34;
						} catch (Throwable var27) {
							var30 = new PcmPlayer();
						}

						Projectile.pcmPlayer1 = var30;
						class238.pcmStreamMixer = new PcmStreamMixer();
						PcmStreamMixer var35 = new PcmStreamMixer();
						var35.addSubStream(class238.pcmStreamMixer);

						for (var33 = 0; var33 < 3; ++var33) {
							MidiPcmStream var37 = new MidiPcmStream(Projectile.pcmPlayer1);
							var37.method6195(9, 128);
							var35.addSubStream(var37);
							var42.add(var37);
						}

						Projectile.pcmPlayer1.setStream(var35);
						ArchiveDiskActionHandler.method7122(Tile.field2872, class239.field2524, class424.field4703, var42);
						class177.decimator = new Decimator(22050, PcmPlayer.field263);
						Login.method2185(60, "Prepared sound engine");
						UserComparator7.method3008(class94.field1154);
					}
				} else if (class94.field1154 == Client.field535) {
					if (ReflectionCheck.field236 == null) {
						ReflectionCheck.field236 = new Fonts(class7.archive8, ChatChannel.archive13);
					}

					var0 = FontName.method9217().length;
					Client.fontsMap = ReflectionCheck.field236.createMap(FontName.method9217());
					if (Client.fontsMap.size() < var0) {
						Login.method2185(80, "Loading fonts - " + Client.fontsMap.size() * 100 / var0 + "%");
					} else {
						GrandExchangeOfferOwnWorldComparator.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
						FloorUnderlayDefinition.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
						ParamComposition.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
						class28.platformInfo = Client.field656.get();
						Login.method2185(80, "Loaded fonts");
						UserComparator7.method3008(class94.field1160);
					}
				} else {
					Archive var2;
					int var3;
					int var21;
					Archive var28;
					if (class94.field1160 == Client.field535) {
						var28 = WorldMapSection1.archive10;
						var2 = class7.archive8;
						var3 = 0;
						String[] var31 = Login.field955;

						String var36;
						for (var33 = 0; var33 < var31.length; ++var33) {
							var36 = var31[var33];
							if (var28.tryLoadFileByNames(var36, "")) {
								++var3;
							}
						}

						var31 = Login.field940;

						for (var33 = 0; var33 < var31.length; ++var33) {
							var36 = var31[var33];
							if (var2.tryLoadFileByNames(var36, "")) {
								++var3;
							}
						}

						var31 = Login.field942;

						for (var33 = 0; var33 < var31.length; ++var33) {
							var36 = var31[var33];
							if (var2.getGroupId(var36) != -1 && var2.tryLoadFileByNames(var36, "")) {
								++var3;
							}
						}

						var21 = class243.method4565(class7.archive8);
						if (var3 < var21) {
							Login.method2185(90, "Loading title screen - " + var3 * 100 / var21 + "%");
						} else {
							Login.method2185(100, "Loaded title screen");
							if (class4.field9) {
								ClanChannelMember.updateGameState(5);
								UserComparator7.method3008(class94.field1164);
							} else {
								UserComparator7.method3008(class94.field1148);
							}

						}
					} else if (class94.field1164 == Client.field535) {
						ClanChannelMember.updateGameState(10);
					} else if (class94.field1148 == Client.field535) {
						LoginState.field497 = class221.newArchive(class385.field4496.field4518, false, true, true, false);
						class498.field5069 = class221.newArchive(class385.field4497.field4518, false, true, true, false);
						ApproximateRouteStrategy.archive2 = class221.newArchive(class385.field4498.field4518, true, false, true, false);
						LoginScreenAnimation.archive4 = class221.newArchive(class385.field4499.field4518, false, true, true, false);
						class157.archive9 = class221.newArchive(class385.field4511.field4518, true, true, true, false);
						WorldMapSectionType.field2665 = class221.newArchive(class385.field4503.field4518, false, true, true, false);
						class195.field2052 = class221.newArchive(class385.field4505.field4518, false, true, true, false);
						JagNetThread.field4545 = class221.newArchive(class385.field4507.field4518, false, true, true, false);
						WorldEntity.archive12 = class221.newArchive(class385.field4508.field4518, false, true, true, false);
						VarpDefinition.field1881 = class221.newArchive(class385.field4504.field4518, true, true, true, false);
						class151.field1715 = class221.newArchive(class385.field4510.field4518, false, true, true, false);
						LoginPacket.field1684 = class221.newArchive(class385.field4514.field4518, false, true, true, false);
						PlayerComposition.field3785 = class221.newArchive(class385.field4515.field4518, false, true, true, false);
						AbstractWorldMapData.field2675 = class221.newArchive(class385.field4495.field4518, false, true, true, false);
						ObjectSound.field856 = class212.method4118(class385.field4517.field4518, false, true, true, true, true);
						Login.method2185(20, "Connecting to update server");
						UserComparator7.method3008(class94.field1155);
					} else if (class94.field1155 == Client.field535) {
						var39 = 0;
						var0 = var39 + LoginState.field497.percentage() * 5 / 100;
						var0 += class498.field5069.percentage() * 2 / 100;
						var0 += ApproximateRouteStrategy.archive2.percentage() / 100;
						var0 += LoginScreenAnimation.archive4.percentage() / 100;
						var0 += class157.archive9.percentage() * 10 / 100;
						var0 += WorldMapSectionType.field2665.percentage() * 65 / 100;
						var0 += class195.field2052.percentage() / 100;
						var0 += JagNetThread.field4545.percentage() / 100;
						var0 += WorldEntity.archive12.percentage() * 6 / 100;
						var0 += LoginPacket.field1684.percentage() / 100;
						var0 += class151.field1715.percentage() * 2 / 100;
						var0 += PlayerComposition.field3785.percentage() * 2 / 100;
						var0 += AbstractWorldMapData.field2675.percentage() / 100;
						var0 += ObjectSound.field856.percentage() / 100;
						var0 += VarpDefinition.field1881.method7128() && VarpDefinition.field1881.isFullyLoaded() ? 1 : 0;
						if (var0 != 100) {
							if (var0 != 0) {
								Login.method2185(30, "Checking for updates - " + var0 + "%");
							}

						} else {
							UserComparator10.method3025(LoginState.field497, "Animations");
							UserComparator10.method3025(class498.field5069, "Skeletons");
							UserComparator10.method3025(class157.archive9, "Maps");
							UserComparator10.method3025(WorldMapSectionType.field2665, "Models");
							UserComparator10.method3025(JagNetThread.field4545, "Music Jingles");
							UserComparator10.method3025(LoginPacket.field1684, "World Map");
							UserComparator10.method3025(class151.field1715, "World Map Geography");
							UserComparator10.method3025(PlayerComposition.field3785, "World Map Ground");
							RouteStrategy.field2497 = new GraphicsDefaults();
							RouteStrategy.field2497.decode(VarpDefinition.field1881);
							Login.method2185(30, "Loaded update list");
							UserComparator7.method3008(class94.field1159);
						}
					} else if (class94.field1159 == Client.field535) {
						class511.topLevelWorldView = new WorldView(-1, 104, 104, class105.clientPreferences.getDrawDistance());
						HttpResponse.worldView = class511.topLevelWorldView;
						class196.sceneMinimapSprite = new SpritePixels(512, 512);
						Login.method2185(30, "Starting game engine...");
						UserComparator7.method3008(class94.field1156);
					} else if (Client.field535 == class94.field1156) {
						if (!ApproximateRouteStrategy.archive2.isFullyLoaded()) {
							Login.method2185(40, "Loading config - " + ApproximateRouteStrategy.archive2.loadPercent() + "%");
						} else if (!AbstractWorldMapData.field2675.isFullyLoaded()) {
							Login.method2185(40, "Loading config - " + (80 + WorldEntity.archive12.loadPercent() / 6) + "%");
						} else {
							Archive var41 = ApproximateRouteStrategy.archive2;
							FloorOverlayDefinition.FloorOverlayDefinition_archive = var41;
							class160.method3426(ApproximateRouteStrategy.archive2);
							var28 = ApproximateRouteStrategy.archive2;
							var2 = WorldMapSectionType.field2665;
							KitDefinition.KitDefinition_archive = var28;
							KitDefinition.KitDefinition_modelsArchive = var2;
							class333.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
							Archive var22 = ApproximateRouteStrategy.archive2;
							Archive var4 = WorldMapSectionType.field2665;
							boolean var5 = Client.isLowDetail;
							ObjectComposition.ObjectDefinition_archive = var22;
							ObjectComposition.ObjectDefinition_modelsArchive = var4;
							ObjectComposition.ObjectDefinition_isLowDetail = var5;
							Archive var6 = ApproximateRouteStrategy.archive2;
							Archive var38 = WorldMapSectionType.field2665;
							class416.NpcDefinition_archive = var6;
							NPCComposition.field1985 = var38;
							Archive var8 = ApproximateRouteStrategy.archive2;
							StructComposition.StructDefinition_archive = var8;
							BuddyRankComparator.method3031(ApproximateRouteStrategy.archive2, WorldMapSectionType.field2665, Client.isMembersWorld, GrandExchangeOfferOwnWorldComparator.fontPlain11);
							ArchiveLoader.method2357(ApproximateRouteStrategy.archive2, LoginState.field497, class498.field5069);
							Language.method7424(ApproximateRouteStrategy.archive2, WorldMapSectionType.field2665);
							Archive var9 = ApproximateRouteStrategy.archive2;
							VarbitComposition.VarbitDefinition_archive = var9;
							Archive var10 = ApproximateRouteStrategy.archive2;
							VarpDefinition.VarpDefinition_archive = var10;
							VarpDefinition.field1874 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16);
							ModeWhere.widgetDefinition = new WidgetDefinition(LoginScreenAnimation.archive4, WorldMapSectionType.field2665, class7.archive8, ChatChannel.archive13, ObjectSound.field856);
							class141.method3201(ApproximateRouteStrategy.archive2);
							Archive var11 = ApproximateRouteStrategy.archive2;
							EnumComposition.EnumDefinition_archive = var11;
							Archive var12 = ApproximateRouteStrategy.archive2;
							class333.VarcInt_archive = var12;
							class74.method2158(ApproximateRouteStrategy.archive2);
							PcmPlayer.method855(ApproximateRouteStrategy.archive2);
							class87.method2374(ApproximateRouteStrategy.archive2);
							Archive var13 = ApproximateRouteStrategy.archive2;
							DbRowType.field5305 = var13;
							class176.field1863 = new class529(class109.field1400, 54, BuddyRankComparator.clientLanguage, ApproximateRouteStrategy.archive2);
							PlayerType.field4444 = new class529(class109.field1400, 47, BuddyRankComparator.clientLanguage, ApproximateRouteStrategy.archive2);
							Archive.varcs = new Varcs();
							ArchiveDiskAction.method7104(ApproximateRouteStrategy.archive2, class7.archive8, ChatChannel.archive13);
							Archive var14 = ApproximateRouteStrategy.archive2;
							Archive var15 = class7.archive8;
							HealthBarDefinition.HealthBarDefinition_archive = var14;
							HealthBarDefinition.field1929 = var15;
							Archive var16 = ApproximateRouteStrategy.archive2;
							Archive var17 = class7.archive8;
							WorldMapElement.WorldMapElement_archive = var17;
							if (var16.isFullyLoaded()) {
								WorldMapElement.WorldMapElement_count = var16.getGroupFileCount(35);
								WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count];

								for (int var18 = 0; var18 < WorldMapElement.WorldMapElement_count; ++var18) {
									byte[] var19 = var16.takeFile(35, var18);
									WorldMapElement.WorldMapElement_cached[var18] = new WorldMapElement(var18);
									if (var19 != null) {
										WorldMapElement.WorldMapElement_cached[var18].decode(new Buffer(var19));
										WorldMapElement.WorldMapElement_cached[var18].method3584();
									}
								}
							}

							Login.method2185(50, "Loaded config");
							UserComparator7.method3008(class94.field1149);
						}
					} else if (class94.field1149 == Client.field535) {
						var0 = 0;
						if (World.compass == null) {
							World.compass = ArchiveDiskActionHandler.SpriteBuffer_getSprite(class7.archive8, RouteStrategy.field2497.field5022, 0);
						} else {
							++var0;
						}

						if (class74.redHintArrowSprite == null) {
							class74.redHintArrowSprite = ArchiveDiskActionHandler.SpriteBuffer_getSprite(class7.archive8, RouteStrategy.field2497.field5014, 0);
						} else {
							++var0;
						}

						IndexedSprite[] var1;
						IndexedSprite var7;
						IndexedSprite[] var23;
						int var24;
						if (class418.mapSceneSprites == null) {
							var2 = class7.archive8;
							var3 = RouteStrategy.field2497.field5015;
							if (!class146.method3260(var2, var3, 0)) {
								var1 = null;
							} else {
								var23 = new IndexedSprite[SpriteBufferProperties.SpriteBuffer_spriteCount];

								for (var24 = 0; var24 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var24) {
									var7 = var23[var24] = new IndexedSprite();
									var7.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
									var7.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
									var7.xOffset = UserComparator4.SpriteBuffer_xOffsets[var24];
									var7.yOffset = LoginPacket.SpriteBuffer_yOffsets[var24];
									var7.subWidth = SpriteBufferProperties.SpriteBuffer_spriteWidths[var24];
									var7.subHeight = class315.SpriteBuffer_spriteHeights[var24];
									var7.palette = SpriteBufferProperties.SpriteBuffer_spritePalette;
									var7.pixels = SpriteBufferProperties.SpriteBuffer_pixels[var24];
								}

								Calendar.method7029();
								var1 = var23;
							}

							class418.mapSceneSprites = var1;
						} else {
							++var0;
						}

						if (FaceNormal.headIconPkSprites == null) {
							FaceNormal.headIconPkSprites = ClanMate.method8542(class7.archive8, RouteStrategy.field2497.field5016, 0);
						} else {
							++var0;
						}

						if (ArchiveDiskActionHandler.headIconPrayerSprites == null) {
							ArchiveDiskActionHandler.headIconPrayerSprites = ClanMate.method8542(class7.archive8, RouteStrategy.field2497.field5013, 0);
						} else {
							++var0;
						}

						if (class337.headIconHintSprites == null) {
							class337.headIconHintSprites = ClanMate.method8542(class7.archive8, RouteStrategy.field2497.field5018, 0);
						} else {
							++var0;
						}

						if (KeyHandler.mapDotSprites == null) {
							KeyHandler.mapDotSprites = ClanMate.method8542(class7.archive8, RouteStrategy.field2497.field5019, 0);
						} else {
							++var0;
						}

						if (PlayerUpdateManager.crossSprites == null) {
							PlayerUpdateManager.crossSprites = ClanMate.method8542(class7.archive8, RouteStrategy.field2497.field5020, 0);
						} else {
							++var0;
						}

						if (class446.field4821 == null) {
							class446.field4821 = ClanMate.method8542(class7.archive8, RouteStrategy.field2497.field5017, 0);
						} else {
							++var0;
						}

						if (UrlRequest.scrollBarSprites == null) {
							var2 = class7.archive8;
							var3 = RouteStrategy.field2497.field5021;
							if (!class146.method3260(var2, var3, 0)) {
								var1 = null;
							} else {
								var23 = new IndexedSprite[SpriteBufferProperties.SpriteBuffer_spriteCount];

								for (var24 = 0; var24 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var24) {
									var7 = var23[var24] = new IndexedSprite();
									var7.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
									var7.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
									var7.xOffset = UserComparator4.SpriteBuffer_xOffsets[var24];
									var7.yOffset = LoginPacket.SpriteBuffer_yOffsets[var24];
									var7.subWidth = SpriteBufferProperties.SpriteBuffer_spriteWidths[var24];
									var7.subHeight = class315.SpriteBuffer_spriteHeights[var24];
									var7.palette = SpriteBufferProperties.SpriteBuffer_spritePalette;
									var7.pixels = SpriteBufferProperties.SpriteBuffer_pixels[var24];
								}

								Calendar.method7029();
								var1 = var23;
							}

							UrlRequest.scrollBarSprites = var1;
						} else {
							++var0;
						}

						if (class240.field2526 == null) {
							class240.field2526 = class330.method6173(class7.archive8, RouteStrategy.field2497.field5023, 0);
						} else {
							++var0;
						}

						if (var0 < 11) {
							Login.method2185(70, "Loading sprites - " + var0 * 100 / 12 + "%");
						} else {
							AbstractFont.AbstractFont_modIconSprites = class240.field2526;
							class74.redHintArrowSprite.normalize();
							int var25 = (int)(Math.random() * 21.0D) - 10;
							int var26 = (int)(Math.random() * 21.0D) - 10;
							var3 = (int)(Math.random() * 21.0D) - 10;
							var21 = (int)(Math.random() * 41.0D) - 20;
							class418.mapSceneSprites[0].shiftColors(var25 + var21, var21 + var26, var21 + var3);
							Login.method2185(60, "Loaded sprites");
							UserComparator7.method3008(class94.field1158);
						}
					} else if (class94.field1158 == Client.field535) {
						if (!class195.field2052.isFullyLoaded()) {
							Login.method2185(70, "Loading textures - " + "0%");
						} else {
							class105.textureProvider = new TextureProvider(class195.field2052, class7.archive8, 20, class105.clientPreferences.getBrightness(), Client.isLowDetail ? 64 : 128);
							Rasterizer3D.method5309(class105.textureProvider);
							Rasterizer3D.method5248(class105.clientPreferences.getBrightness());
							UserComparator7.method3008(class94.field1150);
						}
					} else if (Client.field535 == class94.field1150) {
						var0 = class105.textureProvider.getLoadedPercentage();
						if (var0 < 100) {
							Login.method2185(80, "Loading textures - " + var0 + "%");
						} else {
							Login.method2185(90, "Loaded textures");
							UserComparator7.method3008(class94.field1152);
						}
					} else if (class94.field1152 == Client.field535) {
						Client.mouseRecorder = new MouseRecorder();
						GameEngine.taskHandler.newThreadTask(Client.mouseRecorder, 10);
						Login.method2185(92, "Loaded input handler");
						UserComparator7.method3008(class94.field1161);
					} else if (class94.field1161 == Client.field535) {
						if (!WorldMapSection1.archive10.tryLoadFileByNames("huffman", "")) {
							Login.method2185(94, "Loading wordpack - " + 0 + "%");
						} else {
							Huffman var40 = new Huffman(WorldMapSection1.archive10.takeFileByNames("huffman", ""));
							class365.huffman = var40;
							Login.method2185(94, "Loaded wordpack");
							UserComparator7.method3008(class94.field1162);
						}
					} else if (class94.field1162 == Client.field535) {
						if (!LoginScreenAnimation.archive4.isFullyLoaded()) {
							Login.method2185(96, "Loading interfaces - " + LoginScreenAnimation.archive4.loadPercent() * 4 / 5 + "%");
						} else if (!ObjectSound.field856.isFullyLoaded()) {
							Login.method2185(96, "Loading interfaces - " + ObjectSound.field856.loadPercent() * 4 / 5 + "%");
						} else if (!WorldEntity.archive12.isFullyLoaded()) {
							Login.method2185(96, "Loading interfaces - " + (80 + WorldEntity.archive12.loadPercent() / 6) + "%");
						} else if (!ChatChannel.archive13.isFullyLoaded()) {
							Login.method2185(96, "Loading interfaces - " + (96 + ChatChannel.archive13.loadPercent() / 50) + "%");
						} else {
							Login.method2185(98, "Loaded interfaces");
							if (WorldEntity.archive12.isValidFileName("version.dat", "")) {
								Buffer var20 = new Buffer(WorldEntity.archive12.takeFileByNames("version.dat", ""));
								var20.readUnsignedShort();
							}

							UserComparator7.method3008(class94.field1163);
						}
					} else if (Client.field535 == class94.field1163) {
						if (LoginPacket.field1684.getGroupCount() > 0 && !LoginPacket.field1684.tryLoadGroupByName(WorldMapCacheName.field2740.name)) {
							Login.method2185(100, "Loading world map - " + LoginPacket.field1684.groupLoadPercentByName(WorldMapCacheName.field2740.name) / 10 + "%");
						} else {
							if (VertexNormal.worldMap == null) {
								VertexNormal.worldMap = new WorldMap();
								VertexNormal.worldMap.init(LoginPacket.field1684, class151.field1715, PlayerComposition.field3785, ParamComposition.fontBold12, Client.fontsMap, class418.mapSceneSprites);
							}

							Login.method2185(100, "Loaded world map");
							if (class4.field9) {
								UserComparator7.method3008(class94.field1165);
							} else {
								UserComparator7.method3008(class94.field1164);
							}

							Client.field739 = false;
						}
					} else {
						if (class94.field1165 == Client.field535) {
							FloorUnderlayDefinition.field2095 = false;
							ClanChannelMember.updateGameState(20);
							class28.updateLoginState(LoginState.READ_ACCOUNT_INFO_PACKET_SIZE);
						}

					}
				}
			}
		}
	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(
		descriptor = "(I)Lpr;",
		garbageValue = "115971243"
	)
	public static NodeDeque method6447() {
		return Client.scriptEvents;
	}
}
