import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dy")
public class class102 {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -663291201
	)
	int field1325;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1464924907
	)
	int field1320;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1085336523
	)
	int field1323;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 480284071
	)
	int field1326;

	class102(int var1, int var2, int var3, int var4) {
		this.field1325 = var1;
		this.field1320 = var2;
		this.field1323 = var3;
		this.field1326 = var4;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "112345757"
	)
	int method2727() {
		return this.field1325;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-936199967"
	)
	int method2729() {
		return this.field1320;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1235918691"
	)
	int method2728() {
		return this.field1323;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1179665689"
	)
	int method2730() {
		return this.field1326;
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-409949693"
	)
	static void method2736() {
		int var0;
		if (class92.field1139 == Client.field528) {
			GrandExchangeOfferOwnWorldComparator.scene = new Scene(4, 104, 104, Tiles.Tiles_heights);

			for (var0 = 0; var0 < 4; ++var0) {
				Client.collisionMaps[var0] = new CollisionMap(104, 104);
			}

			class482.sceneMinimapSprite = new SpritePixels(512, 512);
			Login.Login_loadingText = "Starting game engine...";
			Login.Login_loadingPercent = 5;
			Client.field528 = class92.field1129;
		} else if (class92.field1129 == Client.field528) {
			Login.Login_loadingText = "Prepared visibility map";
			Login.Login_loadingPercent = 10;
			Client.field528 = class92.field1130;
		} else {
			Archive var22;
			if (class92.field1130 == Client.field528) {
				DirectByteArrayCopier.field3862 = ChatChannel.newArchive(0, false, true, true, false);
				AABB.field2907 = ChatChannel.newArchive(1, false, true, true, false);
				class36.archive2 = ChatChannel.newArchive(2, true, false, true, false);
				class173.archive4 = ChatChannel.newArchive(3, false, true, true, false);
				HttpContentType.field4844 = ChatChannel.newArchive(4, false, true, true, false);
				class30.archive9 = ChatChannel.newArchive(5, true, true, true, false);
				WorldMapSection0.archive6 = ChatChannel.newArchive(6, true, true, true, false);
				MusicPatchNode.field3548 = ChatChannel.newArchive(7, false, true, true, false);
				HttpRequestTask.archive8 = ChatChannel.newArchive(8, false, true, true, false);
				class127.field1489 = ChatChannel.newArchive(9, false, true, true, false);
				class189.archive10 = ChatChannel.newArchive(10, false, true, true, false);
				WorldMapDecoration.field2627 = ChatChannel.newArchive(11, false, true, true, false);
				WorldMapDecorationType.archive12 = ChatChannel.newArchive(12, false, true, true, false);
				HitSplatDefinition.archive13 = ChatChannel.newArchive(13, true, false, true, false);
				class314.field3428 = ChatChannel.newArchive(14, false, true, true, false);
				DynamicObject.field994 = ChatChannel.newArchive(15, false, true, true, false);
				class189.field1999 = ChatChannel.newArchive(17, true, true, true, false);
				class130.field1521 = ChatChannel.newArchive(18, false, true, true, false);
				PacketBufferNode.field3284 = ChatChannel.newArchive(19, false, true, true, false);
				class142.field1632 = ChatChannel.newArchive(20, false, true, true, false);
				AsyncHttpResponse.field80 = ChatChannel.newArchive(21, false, true, true, false);
				ArchiveDisk var32 = null;
				if (JagexCache.JagexCache_dat2File != null) {
					var32 = new ArchiveDisk(22, JagexCache.JagexCache_dat2File, JagexCache.JagexCache_idxFiles[22], 1000000);
				}

				var22 = new Archive(var32, class357.masterDisk, UrlRequester.field1418, 22, false, true, true, true, true);
				class208.field2281 = var22;
				Login.Login_loadingText = "Connecting to update server";
				Login.Login_loadingPercent = 20;
				Client.field528 = class92.field1144;
			} else if (Client.field528 == class92.field1144) {
				byte var43 = 0;
				var0 = var43 + DirectByteArrayCopier.field3862.percentage() * 4 / 100;
				var0 += AABB.field2907.percentage() * 4 / 100;
				var0 += class36.archive2.percentage() * 2 / 100;
				var0 += class173.archive4.percentage() * 2 / 100;
				var0 += HttpContentType.field4844.percentage() * 6 / 100;
				var0 += class30.archive9.percentage() * 4 / 100;
				var0 += WorldMapSection0.archive6.percentage() * 2 / 100;
				var0 += MusicPatchNode.field3548.percentage() * 54 / 100;
				var0 += HttpRequestTask.archive8.percentage() * 2 / 100;
				var0 += class127.field1489.percentage() * 2 / 100;
				var0 += class189.archive10.percentage() * 2 / 100;
				var0 += WorldMapDecoration.field2627.percentage() * 2 / 100;
				var0 += WorldMapDecorationType.archive12.percentage() * 2 / 100;
				var0 += HitSplatDefinition.archive13.percentage() * 2 / 100;
				var0 += class314.field3428.percentage() * 2 / 100;
				var0 += DynamicObject.field994.percentage() * 2 / 100;
				var0 += PacketBufferNode.field3284.percentage() / 100;
				var0 += class130.field1521.percentage() / 100;
				var0 += class142.field1632.percentage() / 100;
				var0 += AsyncHttpResponse.field80.percentage() / 100;
				var0 += class208.field2281.percentage() / 100;
				var0 += class189.field1999.method6983() && class189.field1999.isFullyLoaded() ? 1 : 0;
				if (var0 != 100) {
					if (var0 != 0) {
						Login.Login_loadingText = "Checking for updates - " + var0 + "%";
					}

					Login.Login_loadingPercent = 30;
				} else {
					HealthBarUpdate.method2491(DirectByteArrayCopier.field3862, "Animations");
					HealthBarUpdate.method2491(AABB.field2907, "Skeletons");
					HealthBarUpdate.method2491(HttpContentType.field4844, "Sound FX");
					HealthBarUpdate.method2491(class30.archive9, "Maps");
					HealthBarUpdate.method2491(WorldMapSection0.archive6, "Music Tracks");
					HealthBarUpdate.method2491(MusicPatchNode.field3548, "Models");
					HealthBarUpdate.method2491(HttpRequestTask.archive8, "Sprites");
					HealthBarUpdate.method2491(WorldMapDecoration.field2627, "Music Jingles");
					HealthBarUpdate.method2491(class314.field3428, "Music Samples");
					HealthBarUpdate.method2491(DynamicObject.field994, "Music Patches");
					HealthBarUpdate.method2491(PacketBufferNode.field3284, "World Map");
					HealthBarUpdate.method2491(class130.field1521, "World Map Geography");
					HealthBarUpdate.method2491(class142.field1632, "World Map Ground");
					class322.field3517 = new GraphicsDefaults();
					class322.field3517.decode(class189.field1999);
					Login.Login_loadingText = "Loaded update list";
					Login.Login_loadingPercent = 30;
					Client.field528 = class92.field1132;
				}
			} else {
				Archive var7;
				Archive var23;
				if (class92.field1132 == Client.field528) {
					boolean var42 = !Client.isLowDetail;
					class189.field1993 = 486202500;
					class462.PcmPlayer_stereo = var42;
					HttpRequestTask.field99 = 2;
					ArrayList var31 = new ArrayList(3);
					TaskHandler var36 = GameEngine.taskHandler;
					short var38 = 2048;
					if (var38 < 256) {
						var38 = 256;
					}

					PcmPlayer var34;
					try {
						PcmPlayer var39 = BoundaryObject.pcmPlayerProvider.player();
						var39.samples = new int[256 * (class462.PcmPlayer_stereo ? 2 : 1)];
						var39.field288 = var38;
						var39.init();
						var39.capacity = (var38 & -1024) + 1024;
						if (var39.capacity > 16384) {
							var39.capacity = 16384;
						}

						var39.open(var39.capacity);
						if (HttpRequestTask.field99 > 0 && PcmPlayer.soundSystem == null) {
							PcmPlayer.soundSystem = new SoundSystem();
							PcmPlayer.soundSystemExecutor = Executors.newScheduledThreadPool(1);
							PcmPlayer.soundSystemExecutor.scheduleAtFixedRate(PcmPlayer.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
						}

						if (PcmPlayer.soundSystem != null) {
							if (PcmPlayer.soundSystem.players[0] != null) {
								throw new IllegalArgumentException();
							}

							PcmPlayer.soundSystem.players[0] = var39;
						}

						var34 = var39;
					} catch (Throwable var30) {
						var34 = new PcmPlayer();
					}

					WorldMap.pcmPlayer1 = var34;
					ClanSettings.pcmStreamMixer = new PcmStreamMixer();
					PcmStreamMixer var40 = new PcmStreamMixer();
					var40.addSubStream(ClanSettings.pcmStreamMixer);

					for (int var6 = 0; var6 < 3; ++var6) {
						MidiPcmStream var41 = new MidiPcmStream();
						var41.method6080(9, 128);
						var40.addSubStream(var41);
						var31.add(var41);
					}

					WorldMap.pcmPlayer1.setStream(var40);
					var23 = DynamicObject.field994;
					var7 = class314.field3428;
					Archive var8 = HttpContentType.field4844;
					class319.field3458 = var23;
					class319.field3455 = var7;
					class319.field3456 = var8;
					class319.field3457 = var31;
					UrlRequest.decimator = new Decimator(22050, class189.field1993 * 22050);
					Login.Login_loadingText = "Prepared sound engine";
					Login.Login_loadingPercent = 35;
					Client.field528 = class92.field1136;
					WorldMapData_1.field2557 = new Fonts(HttpRequestTask.archive8, HitSplatDefinition.archive13);
				} else {
					int var24;
					if (Client.field528 == class92.field1136) {
						FontName[] var46 = new FontName[]{FontName.FontName_verdana11, FontName.FontName_plain12, FontName.FontName_verdana13, FontName.FontName_plain11, FontName.FontName_verdana15, FontName.FontName_bold12};
						var24 = var46.length;
						Fonts var33 = WorldMapData_1.field2557;
						FontName[] var35 = new FontName[]{FontName.FontName_verdana11, FontName.FontName_plain12, FontName.FontName_verdana13, FontName.FontName_plain11, FontName.FontName_verdana15, FontName.FontName_bold12};
						Client.fontsMap = var33.createMap(var35);
						if (Client.fontsMap.size() < var24) {
							Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var24 + "%";
							Login.Login_loadingPercent = 40;
						} else {
							UserComparator5.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
							class339.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
							class90.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
							FriendSystem.platformInfo = Client.field529.get();
							Login.Login_loadingText = "Loaded fonts";
							Login.Login_loadingPercent = 40;
							Client.field528 = class92.field1133;
						}
					} else {
						Archive var1;
						Archive var2;
						int var25;
						int var37;
						if (class92.field1133 == Client.field528) {
							var1 = class189.archive10;
							var2 = HttpRequestTask.archive8;
							var25 = 0;
							String[] var26 = Login.field941;

							int var27;
							String var47;
							for (var27 = 0; var27 < var26.length; ++var27) {
								var47 = var26[var27];
								if (var1.tryLoadFileByNames(var47, "")) {
									++var25;
								}
							}

							var26 = Login.field942;

							for (var27 = 0; var27 < var26.length; ++var27) {
								var47 = var26[var27];
								if (var2.tryLoadFileByNames(var47, "")) {
									++var25;
								}
							}

							var26 = Login.field943;

							for (var27 = 0; var27 < var26.length; ++var27) {
								var47 = var26[var27];
								if (var2.getGroupId(var47) != -1 && var2.tryLoadFileByNames(var47, "")) {
									++var25;
								}
							}

							var37 = class373.method7026(HttpRequestTask.archive8);
							if (var25 < var37) {
								Login.Login_loadingText = "Loading title screen - " + var25 * 100 / var37 + "%";
								Login.Login_loadingPercent = 50;
							} else {
								Login.Login_loadingText = "Loaded title screen";
								Login.Login_loadingPercent = 50;
								class131.updateGameState(5);
								Client.field528 = class92.field1135;
							}
						} else if (Client.field528 != class92.field1135) {
							if (Client.field528 == class92.field1140) {
								var0 = 0;
								if (WallDecoration.compass == null) {
									WallDecoration.compass = class135.SpriteBuffer_getSprite(HttpRequestTask.archive8, class322.field3517.field4779, 0);
								} else {
									++var0;
								}

								if (class149.redHintArrowSprite == null) {
									class149.redHintArrowSprite = class135.SpriteBuffer_getSprite(HttpRequestTask.archive8, class322.field3517.field4777, 0);
								} else {
									++var0;
								}

								if (WorldMapLabelSize.mapSceneSprites == null) {
									WorldMapLabelSize.mapSceneSprites = class197.method3853(HttpRequestTask.archive8, class322.field3517.field4778, 0);
								} else {
									++var0;
								}

								if (Actor.headIconPkSprites == null) {
									Actor.headIconPkSprites = class217.method4289(HttpRequestTask.archive8, class322.field3517.field4780, 0);
								} else {
									++var0;
								}

								if (class13.headIconPrayerSprites == null) {
									class13.headIconPrayerSprites = class217.method4289(HttpRequestTask.archive8, class322.field3517.field4781, 0);
								} else {
									++var0;
								}

								if (GrandExchangeOfferOwnWorldComparator.headIconHintSprites == null) {
									GrandExchangeOfferOwnWorldComparator.headIconHintSprites = class217.method4289(HttpRequestTask.archive8, class322.field3517.field4782, 0);
								} else {
									++var0;
								}

								if (class365.mapDotSprites == null) {
									class365.mapDotSprites = class217.method4289(HttpRequestTask.archive8, class322.field3517.field4783, 0);
								} else {
									++var0;
								}

								if (Players.crossSprites == null) {
									Players.crossSprites = class217.method4289(HttpRequestTask.archive8, class322.field3517.field4784, 0);
								} else {
									++var0;
								}

								if (class142.field1634 == null) {
									class142.field1634 = class217.method4289(HttpRequestTask.archive8, class322.field3517.field4785, 0);
								} else {
									++var0;
								}

								if (class359.scrollBarSprites == null) {
									class359.scrollBarSprites = class197.method3853(HttpRequestTask.archive8, class322.field3517.field4786, 0);
								} else {
									++var0;
								}

								if (HttpResponse.field104 == null) {
									HttpResponse.field104 = class197.method3853(HttpRequestTask.archive8, class322.field3517.field4787, 0);
								} else {
									++var0;
								}

								if (var0 < 11) {
									Login.Login_loadingText = "Loading sprites - " + var0 * 100 / 12 + "%";
									Login.Login_loadingPercent = 70;
								} else {
									AbstractFont.AbstractFont_modIconSprites = HttpResponse.field104;
									class149.redHintArrowSprite.normalize();
									var24 = (int)(Math.random() * 21.0D) - 10;
									int var29 = (int)(Math.random() * 21.0D) - 10;
									var25 = (int)(Math.random() * 21.0D) - 10;
									var37 = (int)(Math.random() * 41.0D) - 20;
									WorldMapLabelSize.mapSceneSprites[0].shiftColors(var37 + var24, var29 + var37, var25 + var37);
									Login.Login_loadingText = "Loaded sprites";
									Login.Login_loadingPercent = 70;
									Client.field528 = class92.field1131;
								}
							} else if (class92.field1131 == Client.field528) {
								if (!class127.field1489.isFullyLoaded()) {
									Login.Login_loadingText = "Loading textures - " + "0%";
									Login.Login_loadingPercent = 90;
								} else {
									ItemContainer.textureProvider = new TextureProvider(class127.field1489, HttpRequestTask.archive8, 20, class93.clientPreferences.getBrightness(), Client.isLowDetail ? 64 : 128);
									Rasterizer3D.method5248(ItemContainer.textureProvider);
									Rasterizer3D.method5296(class93.clientPreferences.getBrightness());
									Client.field528 = class92.field1137;
								}
							} else if (Client.field528 == class92.field1137) {
								var0 = ItemContainer.textureProvider.getLoadedPercentage();
								if (var0 < 100) {
									Login.Login_loadingText = "Loading textures - " + var0 + "%";
									Login.Login_loadingPercent = 90;
								} else {
									Login.Login_loadingText = "Loaded textures";
									Login.Login_loadingPercent = 90;
									Client.field528 = class92.field1141;
								}
							} else if (Client.field528 == class92.field1141) {
								Canvas.mouseRecorder = new MouseRecorder();
								GameEngine.taskHandler.newThreadTask(Canvas.mouseRecorder, 10);
								Login.Login_loadingText = "Loaded input handler";
								Login.Login_loadingPercent = 92;
								Client.field528 = class92.field1128;
							} else if (Client.field528 == class92.field1128) {
								if (!class189.archive10.tryLoadFileByNames("huffman", "")) {
									Login.Login_loadingText = "Loading wordpack - " + 0 + "%";
									Login.Login_loadingPercent = 94;
								} else {
									Huffman var45 = new Huffman(class189.archive10.takeFileByNames("huffman", ""));
									class211.method4228(var45);
									Login.Login_loadingText = "Loaded wordpack";
									Login.Login_loadingPercent = 94;
									Client.field528 = class92.field1138;
								}
							} else if (Client.field528 == class92.field1138) {
								if (!class173.archive4.isFullyLoaded()) {
									Login.Login_loadingText = "Loading interfaces - " + class173.archive4.loadPercent() * 4 / 5 + "%";
									Login.Login_loadingPercent = 96;
								} else if (!class208.field2281.isFullyLoaded()) {
									Login.Login_loadingText = "Loading interfaces - " + class208.field2281.loadPercent() * 4 / 5 + "%";
									Login.Login_loadingPercent = 96;
								} else if (!WorldMapDecorationType.archive12.isFullyLoaded()) {
									Login.Login_loadingText = "Loading interfaces - " + (80 + WorldMapDecorationType.archive12.loadPercent() / 6) + "%";
									Login.Login_loadingPercent = 96;
								} else if (!HitSplatDefinition.archive13.isFullyLoaded()) {
									Login.Login_loadingText = "Loading interfaces - " + (96 + HitSplatDefinition.archive13.loadPercent() / 50) + "%";
									Login.Login_loadingPercent = 96;
								} else {
									Login.Login_loadingText = "Loaded interfaces";
									Login.Login_loadingPercent = 98;
									if (WorldMapDecorationType.archive12.isValidFileName("version.dat", "")) {
										Buffer var44 = new Buffer(WorldMapDecorationType.archive12.takeFileByNames("version.dat", ""));
										var44.readUnsignedShort();
									}

									Client.field528 = class92.field1142;
								}
							} else if (class92.field1142 == Client.field528) {
								Login.Login_loadingPercent = 100;
								if (PacketBufferNode.field3284.getGroupCount() > 0 && !PacketBufferNode.field3284.tryLoadGroupByName(WorldMapCacheName.field2669.name)) {
									Login.Login_loadingText = "Loading world map - " + PacketBufferNode.field3284.groupLoadPercentByName(WorldMapCacheName.field2669.name) / 10 + "%";
								} else {
									if (GrandExchangeOfferUnitPriceComparator.worldMap == null) {
										GrandExchangeOfferUnitPriceComparator.worldMap = new WorldMap();
										GrandExchangeOfferUnitPriceComparator.worldMap.init(PacketBufferNode.field3284, class130.field1521, class142.field1632, class90.fontBold12, Client.fontsMap, WorldMapLabelSize.mapSceneSprites);
									}

									Login.Login_loadingText = "Loaded world map";
									Client.field528 = class92.field1143;
								}
							} else {
								if (Client.field528 == class92.field1143) {
									class131.updateGameState(10);
								}

							}
						} else if (!class36.archive2.isFullyLoaded()) {
							Login.Login_loadingText = "Loading config - " + class36.archive2.loadPercent() + "%";
							Login.Login_loadingPercent = 60;
						} else if (!AsyncHttpResponse.field80.isFullyLoaded()) {
							Login.Login_loadingText = "Loading config - " + (80 + WorldMapDecorationType.archive12.loadPercent() / 6) + "%";
							Login.Login_loadingPercent = 60;
						} else {
							ArchiveLoader.method2326(class36.archive2);
							HitSplatDefinition.method3901(class36.archive2);
							var22 = class36.archive2;
							var1 = MusicPatchNode.field3548;
							KitDefinition.KitDefinition_archive = var22;
							KitDefinition.KitDefinition_modelsArchive = var1;
							KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
							var2 = class36.archive2;
							Archive var3 = MusicPatchNode.field3548;
							boolean var4 = Client.isLowDetail;
							ObjectComposition.ObjectDefinition_archive = var2;
							ObjectComposition.ObjectDefinition_modelsArchive = var3;
							ObjectComposition.ObjectDefinition_isLowDetail = var4;
							class13.method171(class36.archive2, MusicPatchNode.field3548);
							Archive var5 = class36.archive2;
							StructComposition.StructDefinition_archive = var5;
							var23 = class36.archive2;
							var7 = MusicPatchNode.field3548;
							boolean var28 = Client.isMembersWorld;
							Font var9 = UserComparator5.fontPlain11;
							ItemComposition.ItemDefinition_archive = var23;
							class166.ItemDefinition_modelArchive = var7;
							class507.ItemDefinition_inMembersWorld = var28;
							ViewportMouse.ItemDefinition_fileCount = ItemComposition.ItemDefinition_archive.getGroupFileCount(10);
							ItemComposition.ItemDefinition_fontPlain11 = var9;
							NpcOverrides.method3715(class36.archive2, DirectByteArrayCopier.field3862, AABB.field2907);
							class127.method3027(class36.archive2, MusicPatchNode.field3548);
							GrandExchangeOfferOwnWorldComparator.method1248(class36.archive2);
							DynamicObject.method2255(class36.archive2);
							class380.widgetDefinition = new WidgetDefinition(class173.archive4, MusicPatchNode.field3548, HttpRequestTask.archive8, HitSplatDefinition.archive13, class208.field2281);
							AbstractSocket.method8404(class36.archive2);
							Archive var10 = class36.archive2;
							EnumComposition.EnumDefinition_archive = var10;
							Archive var11 = class36.archive2;
							VarcInt.VarcInt_archive = var11;
							MusicPatchNode2.method6040(class36.archive2);
							class309.method5984(class36.archive2);
							Archive var12 = class36.archive2;
							DbTableType.field5118 = var12;
							class436.method8118(class36.archive2);
							Language.Widget_cachedModels = new class513(class1.field3, 54, class92.clientLanguage, class36.archive2);
							class176.Widget_cachedFonts = new class513(class1.field3, 47, class92.clientLanguage, class36.archive2);
							ClientPreferences.varcs = new Varcs();
							Archive var13 = class36.archive2;
							Archive var14 = HttpRequestTask.archive8;
							Archive var15 = HitSplatDefinition.archive13;
							HitSplatDefinition.HitSplatDefinition_archive = var13;
							GrandExchangeOfferWorldComparator.field4417 = var14;
							HitSplatDefinition.HitSplatDefinition_fontsArchive = var15;
							Archive var16 = class36.archive2;
							Archive var17 = HttpRequestTask.archive8;
							HealthBarDefinition.HealthBarDefinition_archive = var16;
							HealthBarDefinition.field1884 = var17;
							Archive var18 = class36.archive2;
							Archive var19 = HttpRequestTask.archive8;
							WorldMapElement.WorldMapElement_archive = var19;
							if (var18.isFullyLoaded()) {
								class152.WorldMapElement_count = var18.getGroupFileCount(35);
								WorldMapElement.WorldMapElement_cached = new WorldMapElement[class152.WorldMapElement_count];

								for (int var20 = 0; var20 < class152.WorldMapElement_count; ++var20) {
									byte[] var21 = var18.takeFile(35, var20);
									WorldMapElement.WorldMapElement_cached[var20] = new WorldMapElement(var20);
									if (var21 != null) {
										WorldMapElement.WorldMapElement_cached[var20].decode(new Buffer(var21));
										WorldMapElement.WorldMapElement_cached[var20].method3594();
									}
								}
							}

							Login.Login_loadingText = "Loaded config";
							Login.Login_loadingPercent = 60;
							Client.field528 = class92.field1140;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-832468918"
	)
	static final void method2732(int var0, int var1, int var2, int var3) {
		Client.overheadTextCount = 0;
		boolean var4 = false;
		int var5 = -1;
		int var6 = -1;
		int var7 = Players.Players_count;
		int[] var8 = Players.Players_indices;

		int var9;
		for (var9 = 0; var9 < var7 + Client.npcCount; ++var9) {
			Object var22;
			if (var9 < var7) {
				var22 = Client.players[var8[var9]];
				if (var8[var9] == Client.combatTargetPlayerIndex) {
					var4 = true;
					var5 = var9;
					continue;
				}

				if (var22 == KeyHandler.localPlayer) {
					var6 = var9;
					continue;
				}
			} else {
				var22 = Client.npcs[Client.npcIndices[var9 - var7]];
			}

			class386.drawActor2d((Actor)var22, var9, var0, var1, var2, var3);
		}

		if (Client.renderSelf && var6 != -1) {
			class386.drawActor2d(KeyHandler.localPlayer, var6, var0, var1, var2, var3);
		}

		if (var4) {
			class386.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var5, var0, var1, var2, var3);
		}

		for (var9 = 0; var9 < Client.overheadTextCount; ++var9) {
			int var10 = Client.overheadTextXs[var9];
			int var11 = Client.overheadTextYs[var9];
			int var12 = Client.overheadTextXOffsets[var9];
			int var13 = Client.overheadTextAscents[var9];
			boolean var14 = true;

			while (var14) {
				var14 = false;

				for (int var21 = 0; var21 < var9; ++var21) {
					if (var11 + 2 > Client.overheadTextYs[var21] - Client.overheadTextAscents[var21] && var11 - var13 < Client.overheadTextYs[var21] + 2 && var10 - var12 < Client.overheadTextXOffsets[var21] + Client.overheadTextXs[var21] && var10 + var12 > Client.overheadTextXs[var21] - Client.overheadTextXOffsets[var21] && Client.overheadTextYs[var21] - Client.overheadTextAscents[var21] < var11) {
						var11 = Client.overheadTextYs[var21] - Client.overheadTextAscents[var21];
						var14 = true;
					}
				}
			}

			Client.viewportTempX = Client.overheadTextXs[var9];
			Client.viewportTempY = Client.overheadTextYs[var9] = var11;
			String var15 = Client.overheadText[var9];
			if (Client.chatEffects == 0) {
				int var16 = 16776960;
				if (Client.overheadTextColors[var9] < 6) {
					var16 = Client.field656[Client.overheadTextColors[var9]];
				}

				if (Client.overheadTextColors[var9] == 6) {
					var16 = Client.viewportDrawCount % 20 < 10 ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var9] == 7) {
					var16 = Client.viewportDrawCount % 20 < 10 ? 255 : '\uffff';
				}

				if (Client.overheadTextColors[var9] == 8) {
					var16 = Client.viewportDrawCount % 20 < 10 ? '뀀' : 8454016;
				}

				int var17;
				if (Client.overheadTextColors[var9] == 9) {
					var17 = 150 - Client.overheadTextCyclesRemaining[var9];
					if (var17 < 50) {
						var16 = var17 * 1280 + 16711680;
					} else if (var17 < 100) {
						var16 = 16776960 - (var17 - 50) * 327680;
					} else if (var17 < 150) {
						var16 = (var17 - 100) * 5 + 65280;
					}
				}

				if (Client.overheadTextColors[var9] == 10) {
					var17 = 150 - Client.overheadTextCyclesRemaining[var9];
					if (var17 < 50) {
						var16 = var17 * 5 + 16711680;
					} else if (var17 < 100) {
						var16 = 16711935 - (var17 - 50) * 327680;
					} else if (var17 < 150) {
						var16 = (var17 - 100) * 327680 + 255 - (var17 - 100) * 5;
					}
				}

				if (Client.overheadTextColors[var9] == 11) {
					var17 = 150 - Client.overheadTextCyclesRemaining[var9];
					if (var17 < 50) {
						var16 = 16777215 - var17 * 327685;
					} else if (var17 < 100) {
						var16 = (var17 - 50) * 327685 + 65280;
					} else if (var17 < 150) {
						var16 = 16777215 - (var17 - 100) * 327680;
					}
				}

				int var18;
				if (Client.overheadTextColors[var9] == 12 && Client.field609[var9] == null) {
					var17 = var15.length();
					Client.field609[var9] = new int[var17];

					for (var18 = 0; var18 < var17; ++var18) {
						int var19 = (int)((float)var18 / (float)var17 * 64.0F);
						int var20 = var19 << 10 | 896 | 64;
						Client.field609[var9][var18] = class482.field4871[var20];
					}
				}

				if (Client.overheadTextEffects[var9] == 0) {
					class90.fontBold12.method7854(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.field609[var9]);
				}

				if (Client.overheadTextEffects[var9] == 1) {
					class90.fontBold12.method7769(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, Client.field609[var9]);
				}

				if (Client.overheadTextEffects[var9] == 2) {
					class90.fontBold12.method7770(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, Client.field609[var9]);
				}

				if (Client.overheadTextEffects[var9] == 3) {
					class90.fontBold12.method7771(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var9], Client.field609[var9]);
				}

				if (Client.overheadTextEffects[var9] == 4) {
					var17 = (150 - Client.overheadTextCyclesRemaining[var9]) * (class90.fontBold12.stringWidth(var15) + 100) / 150;
					Rasterizer2D.Rasterizer2D_expandClip(var0 + Client.viewportTempX - 50, var1, var0 + Client.viewportTempX + 50, var3 + var1);
					class90.fontBold12.method7773(var15, var0 + Client.viewportTempX + 50 - var17, Client.viewportTempY + var1, var16, 0, Client.field609[var9]);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}

				if (Client.overheadTextEffects[var9] == 5) {
					var17 = 150 - Client.overheadTextCyclesRemaining[var9];
					var18 = 0;
					if (var17 < 25) {
						var18 = var17 - 25;
					} else if (var17 > 125) {
						var18 = var17 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, Client.viewportTempY + var1 - class90.fontBold12.ascent - 1, var0 + var2, Client.viewportTempY + var1 + 5);
					class90.fontBold12.method7854(var15, var0 + Client.viewportTempX, var18 + Client.viewportTempY + var1, var16, 0, Client.field609[var9]);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}
			} else {
				class90.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0);
			}
		}

	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1846118605"
	)
	static final void method2738(int var0) {
		int[] var1 = class482.sceneMinimapSprite.pixels;
		int var2 = var1.length;

		int var3;
		for (var3 = 0; var3 < var2; ++var3) {
			var1[var3] = 0;
		}

		int var4;
		int var5;
		for (var3 = 1; var3 < 103; ++var3) {
			var4 = (103 - var3) * 2048 + 24628;

			for (var5 = 1; var5 < 103; ++var5) {
				if ((Tiles.Tiles_renderFlags[var0][var5][var3] & 24) == 0) {
					GrandExchangeOfferOwnWorldComparator.scene.drawTileMinimap(var1, var4, 512, var0, var5, var3);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var5][var3] & 8) != 0) {
					GrandExchangeOfferOwnWorldComparator.scene.drawTileMinimap(var1, var4, 512, var0 + 1, var5, var3);
				}

				var4 += 4;
			}
		}

		var3 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
		var4 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
		class482.sceneMinimapSprite.setRaster();

		int var6;
		for (var5 = 1; var5 < 103; ++var5) {
			for (var6 = 1; var6 < 103; ++var6) {
				if ((Tiles.Tiles_renderFlags[var0][var6][var5] & 24) == 0) {
					drawObject(var0, var6, var5, var3, var4);
				}

				if (var0 < 3 && (Tiles.Tiles_renderFlags[var0 + 1][var6][var5] & 8) != 0) {
					drawObject(var0 + 1, var6, var5, var3, var4);
				}
			}
		}

		Client.mapIconCount = 0;

		for (var5 = 0; var5 < 104; ++var5) {
			for (var6 = 0; var6 < 104; ++var6) {
				long var7 = GrandExchangeOfferOwnWorldComparator.scene.getFloorDecorationTag(SecureUrlRequester.Client_plane, var5, var6);
				if (var7 != 0L) {
					int var9 = class167.Entity_unpackID(var7);
					int var10 = class137.getObjectDefinition(var9).mapIconId;
					if (var10 >= 0 && ConcurrentMidiTask.WorldMapElement_get(var10).field1849) {
						Client.mapIcons[Client.mapIconCount] = ConcurrentMidiTask.WorldMapElement_get(var10).getSpriteBool(false);
						Client.mapIconXs[Client.mapIconCount] = var5;
						Client.mapIconYs[Client.mapIconCount] = var6;
						++Client.mapIconCount;
					}
				}
			}
		}

		WorldMapData_1.rasterProvider.apply();
	}

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-1163234687"
	)
	@Export("drawObject")
	static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
		long var5 = GrandExchangeOfferOwnWorldComparator.scene.getBoundaryObjectTag(var0, var1, var2);
		int var7;
		int var8;
		int var9;
		int var10;
		int var12;
		int var13;
		if (var5 != 0L) {
			var7 = GrandExchangeOfferOwnWorldComparator.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = var3;
			if (ByteArrayPool.method8033(var5)) {
				var10 = var4;
			}

			int[] var11 = class482.sceneMinimapSprite.pixels;
			var12 = var1 * 4 + (103 - var2) * 2048 + 24624;
			var13 = class167.Entity_unpackID(var5);
			ObjectComposition var14 = class137.getObjectDefinition(var13);
			if (var14.mapSceneId != -1) {
				IndexedSprite var15 = WorldMapLabelSize.mapSceneSprites[var14.mapSceneId];
				if (var15 != null) {
					int var16 = (var14.sizeX * 4 - var15.subWidth) / 2;
					int var17 = (var14.sizeY * 4 - var15.subHeight) / 2;
					var15.drawAt(var16 + var1 * 4 + 48, (104 - var2 - var14.sizeY) * 4 + var17 + 48);
				}
			} else {
				if (var9 == 0 || var9 == 2) {
					if (var8 == 0) {
						var11[var12] = var10;
						var11[var12 + 512] = var10;
						var11[var12 + 1024] = var10;
						var11[var12 + 1536] = var10;
					} else if (var8 == 1) {
						var11[var12] = var10;
						var11[var12 + 1] = var10;
						var11[var12 + 2] = var10;
						var11[var12 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 3] = var10;
						var11[var12 + 512 + 3] = var10;
						var11[var12 + 1024 + 3] = var10;
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var11[var12 + 1536] = var10;
						var11[var12 + 1536 + 1] = var10;
						var11[var12 + 1536 + 2] = var10;
						var11[var12 + 1536 + 3] = var10;
					}
				}

				if (var9 == 3) {
					if (var8 == 0) {
						var11[var12] = var10;
					} else if (var8 == 1) {
						var11[var12 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 3) {
						var11[var12 + 1536] = var10;
					}
				}

				if (var9 == 2) {
					if (var8 == 3) {
						var11[var12] = var10;
						var11[var12 + 512] = var10;
						var11[var12 + 1024] = var10;
						var11[var12 + 1536] = var10;
					} else if (var8 == 0) {
						var11[var12] = var10;
						var11[var12 + 1] = var10;
						var11[var12 + 2] = var10;
						var11[var12 + 3] = var10;
					} else if (var8 == 1) {
						var11[var12 + 3] = var10;
						var11[var12 + 512 + 3] = var10;
						var11[var12 + 1024 + 3] = var10;
						var11[var12 + 1536 + 3] = var10;
					} else if (var8 == 2) {
						var11[var12 + 1536] = var10;
						var11[var12 + 1536 + 1] = var10;
						var11[var12 + 1536 + 2] = var10;
						var11[var12 + 1536 + 3] = var10;
					}
				}
			}
		}

		var5 = GrandExchangeOfferOwnWorldComparator.scene.getGameObjectTag(var0, var1, var2);
		if (var5 != 0L) {
			var7 = GrandExchangeOfferOwnWorldComparator.scene.getObjectFlags(var0, var1, var2, var5);
			var8 = var7 >> 6 & 3;
			var9 = var7 & 31;
			var10 = class167.Entity_unpackID(var5);
			ObjectComposition var24 = class137.getObjectDefinition(var10);
			int var19;
			if (var24.mapSceneId != -1) {
				IndexedSprite var20 = WorldMapLabelSize.mapSceneSprites[var24.mapSceneId];
				if (var20 != null) {
					var13 = (var24.sizeX * 4 - var20.subWidth) / 2;
					var19 = (var24.sizeY * 4 - var20.subHeight) / 2;
					var20.drawAt(var1 * 4 + var13 + 48, var19 + (104 - var2 - var24.sizeY) * 4 + 48);
				}
			} else if (var9 == 9) {
				var12 = 15658734;
				if (ByteArrayPool.method8033(var5)) {
					var12 = 15597568;
				}

				int[] var18 = class482.sceneMinimapSprite.pixels;
				var19 = var1 * 4 + (103 - var2) * 2048 + 24624;
				if (var8 != 0 && var8 != 2) {
					var18[var19] = var12;
					var18[var19 + 1 + 512] = var12;
					var18[var19 + 1024 + 2] = var12;
					var18[var19 + 1536 + 3] = var12;
				} else {
					var18[var19 + 1536] = var12;
					var18[var19 + 1 + 1024] = var12;
					var18[var19 + 512 + 2] = var12;
					var18[var19 + 3] = var12;
				}
			}
		}

		var5 = GrandExchangeOfferOwnWorldComparator.scene.getFloorDecorationTag(var0, var1, var2);
		if (0L != var5) {
			var7 = class167.Entity_unpackID(var5);
			ObjectComposition var21 = class137.getObjectDefinition(var7);
			if (var21.mapSceneId != -1) {
				IndexedSprite var22 = WorldMapLabelSize.mapSceneSprites[var21.mapSceneId];
				if (var22 != null) {
					var10 = (var21.sizeX * 4 - var22.subWidth) / 2;
					int var23 = (var21.sizeY * 4 - var22.subHeight) / 2;
					var22.drawAt(var1 * 4 + var10 + 48, var23 + (104 - var2 - var21.sizeY) * 4 + 48);
				}
			}
		}

	}

	@ObfuscatedName("pg")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "94"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var2 = new short[16];
		int var3 = 0;

		for (int var4 = 0; var4 < ViewportMouse.ItemDefinition_fileCount; ++var4) {
			ItemComposition var9 = class341.ItemDefinition_get(var4);
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) {
				if (var3 >= 250) {
					class31.foundItemIdCount = -1;
					class317.foundItemIds = null;
					return;
				}

				if (var3 >= var2.length) {
					short[] var6 = new short[var2.length * 2];

					for (int var7 = 0; var7 < var3; ++var7) {
						var6[var7] = var2[var7];
					}

					var2 = var6;
				}

				var2[var3++] = (short)var4;
			}
		}

		class317.foundItemIds = var2;
		AsyncHttpResponse.foundItemIndex = 0;
		class31.foundItemIdCount = var3;
		String[] var8 = new String[class31.foundItemIdCount];

		for (int var5 = 0; var5 < class31.foundItemIdCount; ++var5) {
			var8[var5] = class341.ItemDefinition_get(var2[var5]).name;
		}

		short[] var10 = class317.foundItemIds;
		class142.sortItemsByName(var8, var10, 0, var8.length - 1);
	}
}
