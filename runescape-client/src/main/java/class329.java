import java.util.ArrayList;
import java.util.HashMap;
import java.util.TimeZone;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mf")
public final class class329 {
	@ObfuscatedName("ag")
	static final HashMap field3591;

	static {
		field3591 = new HashMap();
		TimeZone var0;
		synchronized(field3591) {
			TimeZone var2 = (TimeZone)field3591.get("Europe/London");
			if (var2 == null) {
				var2 = TimeZone.getTimeZone("Europe/London");
				field3591.put("Europe/London", var2);
			}

			var0 = var2;
		}

		java.util.Calendar.getInstance(var0);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lne;I)V",
		garbageValue = "-582509116"
	)
	public static void method6421(class340 var0) {
		if (!class334.field3623.contains(var0)) {
			class334.field3623.add(var0);
		}

	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1115801313"
	)
	static void method6422() {
		if (class95.field1174 == Client.field603) {
			class60.soundEffectsArchive = class92.newArchive(class388.field4531.field4541, false, true, true, false);
			HorizontalAlignment.archive6 = class92.newArchive(class388.field4533.field4541, true, true, true, false);
			ApproximateRouteStrategy.archive8 = class92.newArchive(class388.field4527.field4541, false, true, true, false);
			class216.archive10 = class92.newArchive(class388.field4529.field4541, false, true, true, false);
			BuddyRankComparator.archive13 = class92.newArchive(class388.field4532.field4541, true, false, true, false);
			class134.field1578 = class92.newArchive(class388.field4519.field4541, false, true, true, false);
			KeyHandler.field112 = class92.newArchive(class388.field4525.field4541, false, true, true, false);
			class150.method3480(20, "Connecting to update server");
			class324.method6405(class95.field1184);
		} else {
			int var0;
			byte var38;
			if (Client.field603 == class95.field1184) {
				var38 = 0;
				var0 = var38 + class60.soundEffectsArchive.percentage() * 53 / 100;
				var0 += HorizontalAlignment.archive6.percentage() * 5 / 100;
				var0 += ApproximateRouteStrategy.archive8.percentage() * 36 / 100;
				var0 += class216.archive10.percentage() / 100;
				var0 += BuddyRankComparator.archive13.percentage() / 100;
				var0 += class134.field1578.percentage() * 3 / 100;
				var0 += KeyHandler.field112.percentage() / 100;
				if (var0 != 100) {
					if (var0 != 0) {
						class150.method3480(30, "Checking for updates - " + var0 + "%");
					}

				} else {
					MusicSong.method6768(class60.soundEffectsArchive, "Sound FX");
					MusicSong.method6768(HorizontalAlignment.archive6, "Music Tracks");
					MusicSong.method6768(ApproximateRouteStrategy.archive8, "Sprites");
					MusicSong.method6768(class134.field1578, "Music Samples");
					MusicSong.method6768(KeyHandler.field112, "Music Patches");
					class150.method3480(40, "Loaded update list");
					class324.method6405(class95.field1178);
				}
			} else {
				int var5;
				if (class95.field1178 == Client.field603) {
					class164.method3670(22050, !Client.isLowDetail, 2);
					ArrayList var42 = new ArrayList(3);
					TaskHandler var30 = GameEngine.taskHandler;
					short var34 = 2048;
					if (PcmPlayer.field270 == 0) {
						throw new IllegalStateException();
					} else {
						if (var34 < 256) {
							var34 = 256;
						}

						PcmPlayer var32;
						try {
							PcmPlayer var33 = PcmPlayer.pcmPlayerProvider.player();
							var33.samples = new int[256 * (PcmPlayer.PcmPlayer_stereo ? 2 : 1)];
							var33.field279 = var34;
							var33.init();
							var33.capacity = (var34 & -1024) + 1024;
							if (var33.capacity > 16384) {
								var33.capacity = 16384;
							}

							var33.open(var33.capacity);
							if (RunException.field5583 > 0 && ConcurrentMidiTask.soundSystem == null) {
								ConcurrentMidiTask.soundSystem = new SoundSystem();
								PcmPlayer.soundSystemExecutor = Executors.newScheduledThreadPool(1);
								PcmPlayer.soundSystemExecutor.scheduleAtFixedRate(ConcurrentMidiTask.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
							}

							if (ConcurrentMidiTask.soundSystem != null) {
								if (ConcurrentMidiTask.soundSystem.players[0] != null) {
									throw new IllegalArgumentException();
								}

								ConcurrentMidiTask.soundSystem.players[0] = var33;
							}

							var32 = var33;
						} catch (Throwable var27) {
							var32 = new PcmPlayer();
						}

						HealthBarConfig.pcmPlayer1 = var32;
						GameEngine.pcmStreamMixer = new PcmStreamMixer();
						PcmStreamMixer var35 = new PcmStreamMixer();
						var35.addSubStream(GameEngine.pcmStreamMixer);

						for (var5 = 0; var5 < 3; ++var5) {
							MidiPcmStream var37 = new MidiPcmStream(HealthBarConfig.pcmPlayer1);
							var37.method6515(9, 128);
							var35.addSubStream(var37);
							var42.add(var37);
						}

						HealthBarConfig.pcmPlayer1.setStream(var35);
						class369.method7415(KeyHandler.field112, class134.field1578, class60.soundEffectsArchive, var42);
						DevicePcmPlayerProvider.decimator = new Decimator(22050, PcmPlayer.field270);
						class150.method3480(60, "Prepared sound engine");
						class324.method6405(class95.field1179);
					}
				} else {
					int var22;
					if (class95.field1179 == Client.field603) {
						if (class370.field4031 == null) {
							class370.field4031 = new Fonts(ApproximateRouteStrategy.archive8, BuddyRankComparator.archive13);
						}

						FontName[] var41 = new FontName[]{FontName.FontName_plain11, FontName.FontName_plain12, FontName.FontName_verdana11, FontName.FontName_verdana13, FontName.FontName_verdana15, FontName.FontName_bold12};
						var22 = var41.length;
						Fonts var29 = class370.field4031;
						FontName[] var43 = new FontName[]{FontName.FontName_plain11, FontName.FontName_plain12, FontName.FontName_verdana11, FontName.FontName_verdana13, FontName.FontName_verdana15, FontName.FontName_bold12};
						Client.fontsMap = var29.createMap(var43);
						if (Client.fontsMap.size() < var22) {
							class150.method3480(80, "Loading fonts - " + Client.fontsMap.size() * 100 / var22 + "%");
						} else {
							class169.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
							UserComparator9.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
							class33.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
							CollisionMap.platformInfo = Client.field801.get();
							class150.method3480(80, "Loaded fonts");
							class324.method6405(class95.field1190);
						}
					} else {
						Archive var1;
						Archive var2;
						int var3;
						int var24;
						if (Client.field603 == class95.field1190) {
							var1 = class216.archive10;
							var2 = ApproximateRouteStrategy.archive8;
							var3 = 0;
							String[] var31 = Login.field983;

							String var36;
							for (var5 = 0; var5 < var31.length; ++var5) {
								var36 = var31[var5];
								if (var1.tryLoadFileByNames(var36, "")) {
									++var3;
								}
							}

							var31 = Login.field984;

							for (var5 = 0; var5 < var31.length; ++var5) {
								var36 = var31[var5];
								if (var2.tryLoadFileByNames(var36, "")) {
									++var3;
								}
							}

							var31 = Login.field985;

							for (var5 = 0; var5 < var31.length; ++var5) {
								var36 = var31[var5];
								if (var2.getGroupId(var36) != -1 && var2.tryLoadFileByNames(var36, "")) {
									++var3;
								}
							}

							var24 = MouseHandler.method698(ApproximateRouteStrategy.archive8);
							if (var3 < var24) {
								class150.method3480(90, "Loading title screen - " + var3 * 100 / var24 + "%");
							} else {
								class150.method3480(100, "Loaded title screen");
								if (class492.field5083) {
									class464.updateGameState(5);
									class324.method6405(class95.field1189);
								} else {
									class324.method6405(class95.field1175);
								}

							}
						} else if (Client.field603 == class95.field1189) {
							class464.updateGameState(10);
						} else if (class95.field1175 == Client.field603) {
							KeyHandler.field110 = class92.newArchive(class388.field4522.field4541, false, true, true, false);
							VertexNormal.field2888 = class92.newArchive(class388.field4520.field4541, false, true, true, false);
							class53.archive2 = class92.newArchive(class388.field4521.field4541, true, false, true, false);
							class327.archive4 = class92.newArchive(class388.field4523.field4541, false, true, true, false);
							Bounds.archive9 = class92.newArchive(class388.field4524.field4541, true, true, true, false);
							class358.field3790 = class92.newArchive(class388.field4526.field4541, false, true, true, false);
							PendingSpawn.field1213 = class92.newArchive(class388.field4528.field4541, false, true, true, false);
							MusicPatch.field3690 = class92.newArchive(class388.field4540.field4541, false, true, true, false);
							class187.archive12 = class92.newArchive(class388.field4518.field4541, false, true, true, false);
							ScriptFrame.field460 = class92.newArchive(class388.field4534.field4541, true, true, true, false);
							Login.field986 = class92.newArchive(class388.field4536.field4541, false, true, true, false);
							class347.field3742 = class92.newArchive(class388.field4537.field4541, false, true, true, false);
							class464.field4946 = class92.newArchive(class388.field4538.field4541, false, true, true, false);
							class156.field1738 = class92.newArchive(class388.field4539.field4541, false, true, true, false);
							UserComparator9.field1534 = AbstractByteArrayCopier.method7402(class388.field4530.field4541, false, true, true, true, true);
							class150.method3480(20, "Connecting to update server");
							class324.method6405(class95.field1183);
						} else if (class95.field1183 == Client.field603) {
							var38 = 0;
							var0 = var38 + KeyHandler.field110.percentage() * 5 / 100;
							var0 += VertexNormal.field2888.percentage() * 2 / 100;
							var0 += class53.archive2.percentage() / 100;
							var0 += class327.archive4.percentage() / 100;
							var0 += Bounds.archive9.percentage() * 10 / 100;
							var0 += class358.field3790.percentage() * 65 / 100;
							var0 += PendingSpawn.field1213.percentage() / 100;
							var0 += MusicPatch.field3690.percentage() / 100;
							var0 += class187.archive12.percentage() * 6 / 100;
							var0 += class347.field3742.percentage() / 100;
							var0 += Login.field986.percentage() * 2 / 100;
							var0 += class464.field4946.percentage() * 2 / 100;
							var0 += class156.field1738.percentage() / 100;
							var0 += UserComparator9.field1534.percentage() / 100;
							var0 += ScriptFrame.field460.method7474() && ScriptFrame.field460.isFullyLoaded() ? 1 : 0;
							if (var0 != 100) {
								if (var0 != 0) {
									class150.method3480(30, "Checking for updates - " + var0 + "%");
								}

							} else {
								MusicSong.method6768(KeyHandler.field110, "Animations");
								MusicSong.method6768(VertexNormal.field2888, "Skeletons");
								MusicSong.method6768(Bounds.archive9, "Maps");
								MusicSong.method6768(class358.field3790, "Models");
								MusicSong.method6768(MusicPatch.field3690, "Music Jingles");
								MusicSong.method6768(class347.field3742, "World Map");
								MusicSong.method6768(Login.field986, "World Map Geography");
								MusicSong.method6768(class464.field4946, "World Map Ground");
								class155.field1731 = new GraphicsDefaults();
								class155.field1731.decode(ScriptFrame.field460);
								class150.method3480(30, "Loaded update list");
								class324.method6405(class95.field1177);
							}
						} else if (class95.field1177 == Client.field603) {
							ClientPreferences.topLevelWorldView = Client.worldViewManager.method2614(104, 104, class461.clientPreferences.getDrawDistance());
							class162.worldView = ClientPreferences.topLevelWorldView;
							Tiles.sceneMinimapSprite = new SpritePixels(512, 512);
							class150.method3480(30, "Starting game engine...");
							class324.method6405(class95.field1176);
						} else if (class95.field1176 != Client.field603) {
							if (Client.field603 == class95.field1182) {
								var0 = 0;
								if (UrlRequest.compass == null) {
									UrlRequest.compass = AbstractUserComparator.SpriteBuffer_getSprite(ApproximateRouteStrategy.archive8, class155.field1731.field5057, 0);
								} else {
									++var0;
								}

								if (ClanSettings.redHintArrowSprite == null) {
									ClanSettings.redHintArrowSprite = AbstractUserComparator.SpriteBuffer_getSprite(ApproximateRouteStrategy.archive8, class155.field1731.field5055, 0);
								} else {
									++var0;
								}

								IndexedSprite[] var28;
								if (class281.mapSceneSprites == null) {
									var2 = ApproximateRouteStrategy.archive8;
									var3 = class155.field1731.field5056;
									if (!HttpJsonRequestBody.method9207(var2, var3, 0)) {
										var28 = null;
									} else {
										var28 = TileItem.method2983();
									}

									class281.mapSceneSprites = var28;
								} else {
									++var0;
								}

								if (class531.headIconPkSprites == null) {
									class531.headIconPkSprites = BuddyRankComparator.method3234(ApproximateRouteStrategy.archive8, class155.field1731.field5068, 0);
								} else {
									++var0;
								}

								if (UserComparator3.headIconPrayerSprites == null) {
									UserComparator3.headIconPrayerSprites = BuddyRankComparator.method3234(ApproximateRouteStrategy.archive8, class155.field1731.field5069, 0);
								} else {
									++var0;
								}

								if (class301.headIconHintSprites == null) {
									class301.headIconHintSprites = BuddyRankComparator.method3234(ApproximateRouteStrategy.archive8, class155.field1731.field5059, 0);
								} else {
									++var0;
								}

								if (class160.mapDotSprites == null) {
									class160.mapDotSprites = BuddyRankComparator.method3234(ApproximateRouteStrategy.archive8, class155.field1731.field5060, 0);
								} else {
									++var0;
								}

								if (WorldMapData_0.crossSprites == null) {
									WorldMapData_0.crossSprites = BuddyRankComparator.method3234(ApproximateRouteStrategy.archive8, class155.field1731.field5065, 0);
								} else {
									++var0;
								}

								if (class135.field1593 == null) {
									class135.field1593 = BuddyRankComparator.method3234(ApproximateRouteStrategy.archive8, class155.field1731.field5062, 0);
								} else {
									++var0;
								}

								if (JagexCache.scrollBarSprites == null) {
									var2 = ApproximateRouteStrategy.archive8;
									var3 = class155.field1731.field5063;
									if (!HttpJsonRequestBody.method9207(var2, var3, 0)) {
										var28 = null;
									} else {
										var28 = TileItem.method2983();
									}

									JagexCache.scrollBarSprites = var28;
								} else {
									++var0;
								}

								if (ModeWhere.field4673 == null) {
									var2 = ApproximateRouteStrategy.archive8;
									var3 = class155.field1731.field5064;
									if (!HttpJsonRequestBody.method9207(var2, var3, 0)) {
										var28 = null;
									} else {
										var28 = TileItem.method2983();
									}

									ModeWhere.field4673 = var28;
								} else {
									++var0;
								}

								if (var0 < 11) {
									class150.method3480(70, "Loading sprites - " + var0 * 100 / 12 + "%");
								} else {
									AbstractFont.AbstractFont_modIconSprites = ModeWhere.field4673;
									ClanSettings.redHintArrowSprite.normalize();
									var22 = (int)(Math.random() * 21.0D) - 10;
									int var26 = (int)(Math.random() * 21.0D) - 10;
									var3 = (int)(Math.random() * 21.0D) - 10;
									var24 = (int)(Math.random() * 41.0D) - 20;
									class281.mapSceneSprites[0].shiftColors(var22 + var24, var26 + var24, var3 + var24);
									class150.method3480(60, "Loaded sprites");
									class324.method6405(class95.field1186);
								}
							} else if (Client.field603 == class95.field1186) {
								if (!PendingSpawn.field1213.isFullyLoaded()) {
									class150.method3480(70, "Loading textures - " + "0%");
								} else {
									MenuAction.textureProvider = new TextureProvider(PendingSpawn.field1213, ApproximateRouteStrategy.archive8, 20, class461.clientPreferences.getBrightness(), Client.isLowDetail ? 64 : 128);
									Rasterizer3D.setTextureLoader(MenuAction.textureProvider);
									Rasterizer3D.buildPalette(class461.clientPreferences.getBrightness());
									class324.method6405(class95.field1180);
								}
							} else if (class95.field1180 == Client.field603) {
								var0 = MenuAction.textureProvider.getLoadedPercentage();
								if (var0 < 100) {
									class150.method3480(80, "Loading textures - " + var0 + "%");
								} else {
									class150.method3480(90, "Loaded textures");
									class324.method6405(class95.field1185);
								}
							} else if (Client.field603 == class95.field1185) {
								LoginScreenAnimation.mouseRecorder = new MouseRecorder();
								GameEngine.taskHandler.newThreadTask(LoginScreenAnimation.mouseRecorder, 10);
								class150.method3480(92, "Loaded input handler");
								class324.method6405(class95.field1181);
							} else if (class95.field1181 == Client.field603) {
								if (!class216.archive10.tryLoadFileByNames("huffman", "")) {
									class150.method3480(94, "Loading wordpack - " + 0 + "%");
								} else {
									Huffman var40 = new Huffman(class216.archive10.takeFileByNames("huffman", ""));
									class449.method8620(var40);
									class150.method3480(94, "Loaded wordpack");
									class324.method6405(class95.field1187);
								}
							} else if (Client.field603 == class95.field1187) {
								if (!class327.archive4.isFullyLoaded()) {
									class150.method3480(96, "Loading interfaces - " + class327.archive4.loadPercent() * 4 / 5 + "%");
								} else if (!UserComparator9.field1534.isFullyLoaded()) {
									class150.method3480(96, "Loading interfaces - " + UserComparator9.field1534.loadPercent() * 4 / 5 + "%");
								} else if (!class187.archive12.isFullyLoaded()) {
									class150.method3480(96, "Loading interfaces - " + (80 + class187.archive12.loadPercent() / 6) + "%");
								} else if (!BuddyRankComparator.archive13.isFullyLoaded()) {
									class150.method3480(96, "Loading interfaces - " + (96 + BuddyRankComparator.archive13.loadPercent() / 50) + "%");
								} else {
									class150.method3480(98, "Loaded interfaces");
									if (class187.archive12.isValidFileName("version.dat", "")) {
										Buffer var39 = new Buffer(class187.archive12.takeFileByNames("version.dat", ""));
										var39.readUnsignedShort();
									}

									class324.method6405(class95.field1188);
								}
							} else if (Client.field603 == class95.field1188) {
								if (class347.field3742.getGroupCount() > 0 && !class347.field3742.tryLoadGroupByName(WorldMapCacheName.field3261.name)) {
									class150.method3480(100, "Loading world map - " + class347.field3742.groupLoadPercentByName(WorldMapCacheName.field3261.name) / 10 + "%");
								} else {
									if (UserComparator8.worldMap == null) {
										UserComparator8.worldMap = new WorldMap();
										UserComparator8.worldMap.init(class347.field3742, Login.field986, class464.field4946, class33.fontBold12, Client.fontsMap, class281.mapSceneSprites);
									}

									class150.method3480(100, "Loaded world map");
									if (class492.field5083) {
										class324.method6405(class95.field1173);
									} else {
										class324.method6405(class95.field1189);
									}

									Client.field575 = false;
								}
							} else {
								if (Client.field603 == class95.field1173) {
									SoundSystem.field293 = false;
									class464.updateGameState(20);
									class166.updateLoginState(LoginState.READ_ACCOUNT_INFO_PACKET_SIZE);
								}

							}
						} else if (!class53.archive2.isFullyLoaded()) {
							class150.method3480(40, "Loading config - " + class53.archive2.loadPercent() + "%");
						} else if (!class156.field1738.isFullyLoaded()) {
							class150.method3480(40, "Loading config - " + (80 + class187.archive12.loadPercent() / 6) + "%");
						} else {
							Archive var21 = class53.archive2;
							FloorOverlayDefinition.FloorOverlayDefinition_archive = var21;
							KitDefinition.method3872(class53.archive2);
							var1 = class53.archive2;
							var2 = class358.field3790;
							KitDefinition.KitDefinition_archive = var1;
							KitDefinition.KitDefinition_modelsArchive = var2;
							KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
							class155.method3525(class53.archive2, class358.field3790, Client.isLowDetail);
							Archive var23 = class53.archive2;
							Archive var4 = class358.field3790;
							NPCComposition.NpcDefinition_archive = var23;
							NPCComposition.field2043 = var4;
							Archive var25 = class53.archive2;
							StructComposition.StructDefinition_archive = var25;
							Archive var6 = class53.archive2;
							Archive var7 = class358.field3790;
							boolean var8 = Client.isMembersWorld;
							Font var9 = class169.fontPlain11;
							class341.ItemDefinition_archive = var6;
							ItemComposition.ItemDefinition_modelArchive = var7;
							class191.ItemDefinition_inMembersWorld = var8;
							class167.ItemDefinition_fileCount = class341.ItemDefinition_archive.getGroupFileCount(10);
							class338.ItemDefinition_fontPlain11 = var9;
							class279.method5736(class53.archive2, KeyHandler.field110, VertexNormal.field2888);
							HorizontalAlignment.method3957(class53.archive2, class358.field3790);
							VarcInt.method3860(class53.archive2);
							class501.method9232(class53.archive2);
							TaskHandler.widgetDefinition = new WidgetDefinition(class327.archive4, class358.field3790, ApproximateRouteStrategy.archive8, BuddyRankComparator.archive13, UserComparator9.field1534);
							Archive var10 = class53.archive2;
							InvDefinition.InvDefinition_archive = var10;
							Archive var11 = class53.archive2;
							EnumComposition.EnumDefinition_archive = var11;
							JagexCache.method4487(class53.archive2);
							Archive var12 = class53.archive2;
							AbstractWorldMapIcon.method6255(class53.archive2);
							Archive var13 = class53.archive2;
							DbTableType.field5348 = var13;
							Archive var14 = class53.archive2;
							DbRowType.field5356 = var14;
							FriendSystem.field841 = new class532(class332.field3603, 54, LoginScreenAnimation.clientLanguage, class53.archive2);
							ApproximateRouteStrategy.field477 = new class532(class332.field3603, 47, LoginScreenAnimation.clientLanguage, class53.archive2);
							class229.varcs = new Varcs();
							class88.method2504(class53.archive2, ApproximateRouteStrategy.archive8, BuddyRankComparator.archive13);
							Archive var15 = class53.archive2;
							Archive var16 = ApproximateRouteStrategy.archive8;
							HealthBarDefinition.HealthBarDefinition_archive = var15;
							HealthBarDefinition.field1952 = var16;
							Archive var17 = class53.archive2;
							Archive var18 = ApproximateRouteStrategy.archive8;
							class142.WorldMapElement_archive = var18;
							if (var17.isFullyLoaded()) {
								class463.WorldMapElement_count = var17.getGroupFileCount(35);
								WorldMapElement.WorldMapElement_cached = new WorldMapElement[class463.WorldMapElement_count];

								for (int var19 = 0; var19 < class463.WorldMapElement_count; ++var19) {
									byte[] var20 = var17.takeFile(35, var19);
									WorldMapElement.WorldMapElement_cached[var19] = new WorldMapElement(var19);
									if (var20 != null) {
										WorldMapElement.WorldMapElement_cached[var19].decode(new Buffer(var20));
										WorldMapElement.WorldMapElement_cached[var19].method3824();
									}
								}
							}

							class150.method3480(50, "Loaded config");
							class324.method6405(class95.field1182);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "(Lny;IIIIIIB)V",
		garbageValue = "118"
	)
	static final void method6423(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field587) {
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0;
		}

		Client.field587 = false;
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !Varcs.mouseCam && MouseHandler.MouseHandler_currentButton == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.scrollY -= 4;
				SecureRandomCallable.invalidateWidget(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
				var0.scrollY += 4;
				SecureRandomCallable.invalidateWidget(var0);
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
				var7 = var3 * (var3 - 32) / var4;
				if (var7 < 8) {
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2;
				int var9 = var3 - 32 - var7;
				var0.scrollY = var8 * (var4 - var3) / var9;
				SecureRandomCallable.invalidateWidget(var0);
				Client.field587 = true;
			}
		}

		if (Client.mouseWheelRotation != 0) {
			var7 = var0.width;
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
				var0.scrollY += Client.mouseWheelRotation * 45;
				SecureRandomCallable.invalidateWidget(var0);
			}
		}

	}
}
