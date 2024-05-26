import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1141870315
	)
	@Export("id")
	int id;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -665831153
	)
	@Export("size")
	int size;
	@ObfuscatedName("aj")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("az")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("af")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("aa")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("at")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("ab")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1592168406"
	)
	public static void method701() {
		class205.field2023.clear();
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "637411635"
	)
	static void method699() {
		if (class94.field1166 == Client.field561) {
			class135.field1637 = InterfaceParent.newArchive(class384.field4475.field4493, false, true, true, false);
			GameObject.archive6 = InterfaceParent.newArchive(class384.field4477.field4493, true, true, true, false);
			class177.archive8 = InterfaceParent.newArchive(class384.field4479.field4493, false, true, true, false);
			class138.archive10 = InterfaceParent.newArchive(class384.field4481.field4493, false, true, true, false);
			class104.archive13 = InterfaceParent.newArchive(class384.field4484.field4493, true, false, true, false);
			class332.field3638 = InterfaceParent.newArchive(class384.field4483.field4493, false, true, true, false);
			class141.field1656 = InterfaceParent.newArchive(class384.field4491.field4493, false, true, true, false);
			class175.method3576(20, "Connecting to update server");
			UserComparator6.method3020(class94.field1181);
		} else {
			byte var18;
			int var28;
			if (class94.field1181 == Client.field561) {
				var18 = 0;
				var28 = var18 + class135.field1637.percentage() * 53 / 100;
				var28 += GameObject.archive6.percentage() * 5 / 100;
				var28 += class177.archive8.percentage() * 36 / 100;
				var28 += class138.archive10.percentage() / 100;
				var28 += class104.archive13.percentage() / 100;
				var28 += class332.field3638.percentage() * 3 / 100;
				var28 += class141.field1656.percentage() / 100;
				if (var28 != 100) {
					if (var28 != 0) {
						class175.method3576(30, "Checking for updates - " + var28 + "%");
					}

				} else {
					class155.method3303(class135.field1637, "Sound FX");
					class155.method3303(GameObject.archive6, "Music Tracks");
					class155.method3303(class177.archive8, "Sprites");
					class155.method3303(class332.field3638, "Music Samples");
					class155.method3303(class141.field1656, "Music Patches");
					class175.method3576(40, "Loaded update list");
					UserComparator6.method3020(class94.field1183);
				}
			} else {
				int var3;
				Archive var5;
				Archive var21;
				Archive var22;
				if (Client.field561 == class94.field1183) {
					boolean var35 = !Client.isLowDetail;
					UserComparator5.field1508 = 22050;
					JagexCache.PcmPlayer_stereo = var35;
					class253.field2792 = 2;
					ArrayList var29 = new ArrayList(3);
					class137.pcmPlayer1 = HttpRequest.method96(GameEngine.taskHandler, 0, 2048);
					class349.pcmStreamMixer = new PcmStreamMixer();
					PcmStreamMixer var31 = new PcmStreamMixer();
					var31.addSubStream(class349.pcmStreamMixer);

					for (var3 = 0; var3 < 3; ++var3) {
						MidiPcmStream var34 = new MidiPcmStream(class137.pcmPlayer1);
						var34.method6265(9, 128);
						var31.addSubStream(var34);
						var29.add(var34);
					}

					class137.pcmPlayer1.setStream(var31);
					var21 = class141.field1656;
					var22 = class332.field3638;
					var5 = class135.field1637;
					class415.field4660 = var21;
					class329.field3586 = var22;
					LoginPacket.field1682 = var5;
					class329.field3577 = var29;
					HealthBar.decimator = new Decimator(22050, UserComparator5.field1508);
					class175.method3576(60, "Prepared sound engine");
					UserComparator6.method3020(class94.field1171);
				} else {
					int var1;
					if (class94.field1171 == Client.field561) {
						if (StudioGame.field4063 == null) {
							StudioGame.field4063 = new Fonts(class177.archive8, class104.archive13);
						}

						FontName[] var26 = new FontName[]{FontName.FontName_verdana11, FontName.FontName_bold12, FontName.FontName_plain11, FontName.FontName_verdana13, FontName.FontName_verdana15, FontName.FontName_plain12};
						var1 = var26.length;
						Fonts var30 = StudioGame.field4063;
						FontName[] var32 = new FontName[]{FontName.FontName_verdana11, FontName.FontName_bold12, FontName.FontName_plain11, FontName.FontName_verdana13, FontName.FontName_verdana15, FontName.FontName_plain12};
						Client.fontsMap = var30.createMap(var32);
						if (Client.fontsMap.size() < var1) {
							class175.method3576(80, "Loading fonts - " + Client.fontsMap.size() * 100 / var1 + "%");
						} else {
							class554.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
							WorldMapSection2.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
							WorldMapRenderer.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
							class350.platformInfo = Client.field816.get();
							class175.method3576(80, "Loaded fonts");
							UserComparator6.method3020(class94.field1172);
						}
					} else {
						int var4;
						Archive var19;
						Archive var20;
						if (class94.field1172 == Client.field561) {
							var19 = class138.archive10;
							var20 = class177.archive8;
							var3 = 0;
							String[] var33 = Login.field974;

							int var23;
							String var27;
							for (var23 = 0; var23 < var33.length; ++var23) {
								var27 = var33[var23];
								if (var19.tryLoadFileByNames(var27, "")) {
									++var3;
								}
							}

							var33 = Login.field956;

							for (var23 = 0; var23 < var33.length; ++var23) {
								var27 = var33[var23];
								if (var20.tryLoadFileByNames(var27, "")) {
									++var3;
								}
							}

							var33 = Login.field942;

							for (var23 = 0; var23 < var33.length; ++var23) {
								var27 = var33[var23];
								if (var20.getGroupId(var27) != -1 && var20.tryLoadFileByNames(var27, "")) {
									++var3;
								}
							}

							var4 = WorldMapRegion.method5705(class177.archive8);
							if (var3 < var4) {
								class175.method3576(90, "Loading title screen - " + var3 * 100 / var4 + "%");
							} else {
								class175.method3576(100, "Loaded title screen");
								if (GraphicsObject.field902) {
									class105.updateGameState(5);
									UserComparator6.method3020(class94.field1180);
								} else {
									UserComparator6.method3020(class94.field1170);
								}

							}
						} else if (Client.field561 == class94.field1180) {
							class105.updateGameState(10);
						} else if (class94.field1170 == Client.field561) {
							WorldMapRegion.field3093 = InterfaceParent.newArchive(class384.field4471.field4493, false, true, true, false);
							class324.field3552 = InterfaceParent.newArchive(class384.field4486.field4493, false, true, true, false);
							Projection.archive2 = InterfaceParent.newArchive(class384.field4485.field4493, true, false, true, false);
							LoginState.archive4 = InterfaceParent.newArchive(class384.field4474.field4493, false, true, true, false);
							SceneTilePaint.archive9 = InterfaceParent.newArchive(class384.field4476.field4493, true, true, true, false);
							Varcs.field1452 = InterfaceParent.newArchive(class384.field4478.field4493, false, true, true, false);
							HttpResponse.field105 = InterfaceParent.newArchive(class384.field4482.field4493, false, true, true, false);
							class333.field3643 = InterfaceParent.newArchive(class384.field4489.field4493, false, true, true, false);
							class438.archive12 = InterfaceParent.newArchive(class384.field4480.field4493, false, true, true, false);
							ClientPacket.field3374 = InterfaceParent.newArchive(class384.field4487.field4493, true, true, true, false);
							class53.field370 = InterfaceParent.newArchive(class384.field4470.field4493, false, true, true, false);
							class327.field3564 = InterfaceParent.newArchive(class384.field4488.field4493, false, true, true, false);
							class133.field1602 = InterfaceParent.newArchive(class384.field4490.field4493, false, true, true, false);
							HealthBar.field1357 = InterfaceParent.newArchive(class384.field4472.field4493, false, true, true, false);
							DynamicObject.field1038 = ObjectSound.method1963(class384.field4492.field4493, false, true, true, true, true);
							class175.method3576(20, "Connecting to update server");
							UserComparator6.method3020(class94.field1173);
						} else if (class94.field1173 != Client.field561) {
							if (Client.field561 == class94.field1167) {
								class358.topLevelWorldView = new WorldView(-1, 104, 104, class459.clientPreferences.method2577());
								ModeWhere.worldView = class358.topLevelWorldView;
								HealthBarUpdate.sceneMinimapSprite = new SpritePixels(512, 512);
								class175.method3576(30, "Starting game engine...");
								UserComparator6.method3020(class94.field1165);
							} else if (Client.field561 == class94.field1165) {
								if (!Projection.archive2.isFullyLoaded()) {
									class175.method3576(40, "Loading config - " + Projection.archive2.loadPercent() + "%");
								} else if (!HealthBar.field1357.isFullyLoaded()) {
									class175.method3576(40, "Loading config - " + (80 + class438.archive12.loadPercent() / 6) + "%");
								} else {
									UserComparator4.method2955(Projection.archive2);
									Archive var25 = Projection.archive2;
									FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var25;
									var19 = Projection.archive2;
									var20 = Varcs.field1452;
									KitDefinition.KitDefinition_archive = var19;
									class156.KitDefinition_modelsArchive = var20;
									class420.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
									PcmPlayer.method838(Projection.archive2, Varcs.field1452, Client.isLowDetail);
									var21 = Projection.archive2;
									var22 = Varcs.field1452;
									NPCComposition.NpcDefinition_archive = var21;
									class30.field158 = var22;
									Archive.method7224(Projection.archive2);
									ItemContainer.method2314(Projection.archive2, Varcs.field1452, Client.isMembersWorld, class554.fontPlain11);
									var5 = Projection.archive2;
									Archive var6 = WorldMapRegion.field3093;
									Archive var7 = class324.field3552;
									SequenceDefinition.SequenceDefinition_archive = var5;
									SequenceDefinition.SequenceDefinition_animationsArchive = var6;
									SequenceDefinition.SequenceDefinition_skeletonsArchive = var7;
									Archive var8 = Projection.archive2;
									Archive var9 = Varcs.field1452;
									class202.SpotAnimationDefinition_archive = var8;
									SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var9;
									ClanChannelMember.method3250(Projection.archive2);
									InvDefinition.method3783(Projection.archive2);
									AsyncRestClient.widgetDefinition = new WidgetDefinition(LoginState.archive4, Varcs.field1452, class177.archive8, class104.archive13, DynamicObject.field1038);
									Archive var10 = Projection.archive2;
									InvDefinition.InvDefinition_archive = var10;
									Archive var11 = Projection.archive2;
									EnumComposition.EnumDefinition_archive = var11;
									HttpResponse.method272(Projection.archive2);
									ItemLayer.method4586(Projection.archive2);
									class87.method2317(Projection.archive2);
									WorldMapScaleHandler.method6049(Projection.archive2);
									Archive var12 = Projection.archive2;
									DbRowType.field5288 = var12;
									Tile.field2639 = new class528(class111.field1431, 54, class188.clientLanguage, Projection.archive2);
									ApproximateRouteStrategy.field491 = new class528(class111.field1431, 47, class188.clientLanguage, Projection.archive2);
									WorldMapCacheName.varcs = new Varcs();
									Archive var13 = Projection.archive2;
									Archive var14 = class177.archive8;
									Archive var15 = class104.archive13;
									HitSplatDefinition.HitSplatDefinition_archive = var13;
									class332.field3636 = var14;
									HitSplatDefinition.HitSplatDefinition_fontsArchive = var15;
									Archive var16 = Projection.archive2;
									Archive var17 = class177.archive8;
									HealthBarDefinition.HealthBarDefinition_archive = var16;
									HealthBarDefinition.field2064 = var17;
									Renderable.method5097(Projection.archive2, class177.archive8);
									class175.method3576(50, "Loaded config");
									UserComparator6.method3020(class94.field1174);
								}
							} else if (Client.field561 == class94.field1174) {
								var28 = 0;
								if (ClanMate.compass == null) {
									ClanMate.compass = class542.SpriteBuffer_getSprite(class177.archive8, WorldMapRenderer.field3112.field4996, 0);
								} else {
									++var28;
								}

								if (class17.redHintArrowSprite == null) {
									class17.redHintArrowSprite = class542.SpriteBuffer_getSprite(class177.archive8, WorldMapRenderer.field3112.field4988, 0);
								} else {
									++var28;
								}

								if (AsyncRestClient.mapSceneSprites == null) {
									AsyncRestClient.mapSceneSprites = class426.method7950(class177.archive8, WorldMapRenderer.field3112.field4987, 0);
								} else {
									++var28;
								}

								if (class4.headIconPkSprites == null) {
									class4.headIconPkSprites = WorldMapSection1.method5980(class177.archive8, WorldMapRenderer.field3112.field4989, 0);
								} else {
									++var28;
								}

								if (HttpMethod.headIconPrayerSprites == null) {
									HttpMethod.headIconPrayerSprites = WorldMapSection1.method5980(class177.archive8, WorldMapRenderer.field3112.field4991, 0);
								} else {
									++var28;
								}

								if (class369.headIconHintSprites == null) {
									class369.headIconHintSprites = WorldMapSection1.method5980(class177.archive8, WorldMapRenderer.field3112.field4992, 0);
								} else {
									++var28;
								}

								if (Varcs.mapDotSprites == null) {
									Varcs.mapDotSprites = WorldMapSection1.method5980(class177.archive8, WorldMapRenderer.field3112.field4993, 0);
								} else {
									++var28;
								}

								if (class237.crossSprites == null) {
									class237.crossSprites = WorldMapSection1.method5980(class177.archive8, WorldMapRenderer.field3112.field4990, 0);
								} else {
									++var28;
								}

								if (SequenceDefinition.field2434 == null) {
									SequenceDefinition.field2434 = WorldMapSection1.method5980(class177.archive8, WorldMapRenderer.field3112.field4995, 0);
								} else {
									++var28;
								}

								if (UrlRequest.scrollBarSprites == null) {
									UrlRequest.scrollBarSprites = class426.method7950(class177.archive8, WorldMapRenderer.field3112.field4994, 0);
								} else {
									++var28;
								}

								if (class30.field156 == null) {
									class30.field156 = class426.method7950(class177.archive8, WorldMapRenderer.field3112.field4997, 0);
								} else {
									++var28;
								}

								if (var28 < 11) {
									class175.method3576(70, "Loading sprites - " + var28 * 100 / 12 + "%");
								} else {
									AbstractFont.AbstractFont_modIconSprites = class30.field156;
									class17.redHintArrowSprite.normalize();
									var1 = (int)(Math.random() * 21.0D) - 10;
									int var2 = (int)(Math.random() * 21.0D) - 10;
									var3 = (int)(Math.random() * 21.0D) - 10;
									var4 = (int)(Math.random() * 41.0D) - 20;
									AsyncRestClient.mapSceneSprites[0].shiftColors(var4 + var1, var4 + var2, var3 + var4);
									class175.method3576(60, "Loaded sprites");
									UserComparator6.method3020(class94.field1175);
								}
							} else if (class94.field1175 == Client.field561) {
								if (!HttpResponse.field105.isFullyLoaded()) {
									class175.method3576(70, "Loading textures - " + "0%");
								} else {
									Clock.textureProvider = new TextureProvider(HttpResponse.field105, class177.archive8, 20, class459.clientPreferences.getBrightness(), Client.isLowDetail ? 64 : 128);
									Rasterizer3D.method4680(Clock.textureProvider);
									Rasterizer3D.method4681(class459.clientPreferences.getBrightness());
									UserComparator6.method3020(class94.field1176);
								}
							} else if (class94.field1176 == Client.field561) {
								var28 = Clock.textureProvider.getLoadedPercentage();
								if (var28 < 100) {
									class175.method3576(80, "Loading textures - " + var28 + "%");
								} else {
									class175.method3576(90, "Loaded textures");
									UserComparator6.method3020(class94.field1177);
								}
							} else if (class94.field1177 == Client.field561) {
								Message.mouseRecorder = new MouseRecorder();
								GameEngine.taskHandler.newThreadTask(Message.mouseRecorder, 10);
								class175.method3576(92, "Loaded input handler");
								UserComparator6.method3020(class94.field1178);
							} else if (Client.field561 == class94.field1178) {
								if (!class138.archive10.tryLoadFileByNames("huffman", "")) {
									class175.method3576(94, "Loading wordpack - " + 0 + "%");
								} else {
									Huffman var24 = new Huffman(class138.archive10.takeFileByNames("huffman", ""));
									class360.huffman = var24;
									class175.method3576(94, "Loaded wordpack");
									UserComparator6.method3020(class94.field1179);
								}
							} else if (Client.field561 == class94.field1179) {
								if (!LoginState.archive4.isFullyLoaded()) {
									class175.method3576(96, "Loading interfaces - " + LoginState.archive4.loadPercent() * 4 / 5 + "%");
								} else if (!DynamicObject.field1038.isFullyLoaded()) {
									class175.method3576(96, "Loading interfaces - " + DynamicObject.field1038.loadPercent() * 4 / 5 + "%");
								} else if (!class438.archive12.isFullyLoaded()) {
									class175.method3576(96, "Loading interfaces - " + (80 + class438.archive12.loadPercent() / 6) + "%");
								} else if (!class104.archive13.isFullyLoaded()) {
									class175.method3576(96, "Loading interfaces - " + (96 + class104.archive13.loadPercent() / 50) + "%");
								} else {
									class175.method3576(98, "Loaded interfaces");
									if (class438.archive12.isValidFileName("version.dat", "")) {
										Buffer var0 = new Buffer(class438.archive12.takeFileByNames("version.dat", ""));
										var0.readUnsignedShort();
									}

									UserComparator6.method3020(class94.field1169);
								}
							} else if (Client.field561 == class94.field1169) {
								if (class327.field3564.getGroupCount() > 0 && !class327.field3564.tryLoadGroupByName(WorldMapCacheName.field3236.name)) {
									class175.method3576(100, "Loading world map - " + class327.field3564.groupLoadPercentByName(WorldMapCacheName.field3236.name) / 10 + "%");
								} else {
									if (class6.worldMap == null) {
										class6.worldMap = new WorldMap();
										class6.worldMap.init(class327.field3564, class53.field370, class133.field1602, WorldMapRenderer.fontBold12, Client.fontsMap, AsyncRestClient.mapSceneSprites);
									}

									class175.method3576(100, "Loaded world map");
									if (GraphicsObject.field902) {
										UserComparator6.method3020(class94.field1182);
									} else {
										UserComparator6.method3020(class94.field1180);
									}

									Client.field540 = false;
								}
							} else {
								if (Client.field561 == class94.field1182) {
									class527.field5252 = false;
									class105.updateGameState(20);
									SoundSystem.updateLoginState(LoginState.READ_ACCOUNT_INFO_PACKET_SIZE);
								}

							}
						} else {
							var18 = 0;
							var28 = var18 + WorldMapRegion.field3093.percentage() * 5 / 100;
							var28 += class324.field3552.percentage() * 2 / 100;
							var28 += Projection.archive2.percentage() / 100;
							var28 += LoginState.archive4.percentage() / 100;
							var28 += SceneTilePaint.archive9.percentage() * 10 / 100;
							var28 += Varcs.field1452.percentage() * 65 / 100;
							var28 += HttpResponse.field105.percentage() / 100;
							var28 += class333.field3643.percentage() / 100;
							var28 += class438.archive12.percentage() * 6 / 100;
							var28 += class327.field3564.percentage() / 100;
							var28 += class53.field370.percentage() * 2 / 100;
							var28 += class133.field1602.percentage() * 2 / 100;
							var28 += HealthBar.field1357.percentage() / 100;
							var28 += DynamicObject.field1038.percentage() / 100;
							var28 += ClientPacket.field3374.method7177() && ClientPacket.field3374.isFullyLoaded() ? 1 : 0;
							if (var28 != 100) {
								if (var28 != 0) {
									class175.method3576(30, "Checking for updates - " + var28 + "%");
								}

							} else {
								class155.method3303(WorldMapRegion.field3093, "Animations");
								class155.method3303(class324.field3552, "Skeletons");
								class155.method3303(SceneTilePaint.archive9, "Maps");
								class155.method3303(Varcs.field1452, "Models");
								class155.method3303(class333.field3643, "Music Jingles");
								class155.method3303(class327.field3564, "World Map");
								class155.method3303(class53.field370, "World Map Geography");
								class155.method3303(class133.field1602, "World Map Ground");
								WorldMapRenderer.field3112 = new GraphicsDefaults();
								WorldMapRenderer.field3112.decode(ClientPacket.field3374);
								class175.method3576(30, "Loaded update list");
								UserComparator6.method3020(class94.field1167);
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("pw")
	@ObfuscatedSignature(
		descriptor = "(II)Lum;",
		garbageValue = "1180876877"
	)
	@Export("getDbTable")
	static DbTable getDbTable(int var0) {
		DbTable var1 = (DbTable)Client.DBTableIndex_cache.get((long)var0);
		if (var1 == null) {
			var1 = new DbTable(HealthBar.field1357, Huffman.method7070(var0), class133.method3101(var0));
			Client.DBTableIndex_cache.put(var1, (long)var0);
		}

		return var1;
	}
}
