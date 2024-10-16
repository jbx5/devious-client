import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kz")
@Implements("WorldMapIcon_1")
public class WorldMapIcon_1 extends AbstractWorldMapIcon {
	@ObfuscatedName("nf")
	@ObfuscatedGetter(
		intValue = 819800615
	)
	static int field3094;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 964069103
	)
	@Export("objectDefId")
	final int objectDefId;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lkb;"
	)
	@Export("region")
	final WorldMapRegion region;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1983110681
	)
	@Export("element")
	int element;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Llp;"
	)
	@Export("label")
	WorldMapLabel label;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -966137573
	)
	@Export("subWidth")
	int subWidth;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 2006396333
	)
	@Export("subHeight")
	int subHeight;

	@ObfuscatedSignature(
		descriptor = "(Lnn;Lnn;ILkb;)V"
	)
	WorldMapIcon_1(Coord var1, Coord var2, int var3, WorldMapRegion var4) {
		super(var1, var2);
		this.objectDefId = var3;
		this.region = var4;
		this.init();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("init")
	void init() {
		this.element = UrlRequest.getObjectDefinition(this.objectDefId).transform().mapIconId;
		this.label = this.region.createMapLabel(AsyncRestClient.WorldMapElement_get(this.element));
		WorldMapElement var1 = AsyncRestClient.WorldMapElement_get(this.getElement());
		SpritePixels var2 = var1.getSpriteBool(false);
		if (var2 != null) {
			this.subWidth = var2.subWidth;
			this.subHeight = var2.subHeight;
		} else {
			this.subWidth = 0;
			this.subHeight = 0;
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-755905144"
	)
	@Export("getElement")
	public int getElement() {
		return this.element;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)Llp;",
		garbageValue = "3125"
	)
	@Export("getLabel")
	WorldMapLabel getLabel() {
		return this.label;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2116199203"
	)
	@Export("getSubWidth")
	int getSubWidth() {
		return this.subWidth;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1767515"
	)
	@Export("getSubHeight")
	int getSubHeight() {
		return this.subHeight;
	}

	@ObfuscatedName("gi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "16777215"
	)
	static void method5888() {
		if (class95.field1165 == Client.field536) {
			ObjectComposition.soundEffectsArchive = WorldMapRenderer.newArchive(class389.field4561.field4579, false, true, true, false);
			MouseHandler.archive6 = WorldMapRenderer.newArchive(class389.field4558.field4579, true, true, true, false);
			class450.archive8 = WorldMapRenderer.newArchive(class389.field4569.field4579, false, true, true, false);
			class1.archive10 = WorldMapRenderer.newArchive(class389.field4567.field4579, false, true, true, false);
			Login.archive13 = WorldMapRenderer.newArchive(class389.field4570.field4579, true, false, true, false);
			class142.field1656 = WorldMapRenderer.newArchive(class389.field4571.field4579, false, true, true, false);
			class319.field3306 = WorldMapRenderer.newArchive(class389.field4572.field4579, false, true, true, false);
			WorldMapLabelSize.method5875(20, "Connecting to update server");
			class434.method8371(class95.field1167);
		} else {
			int var12;
			byte var30;
			if (Client.field536 == class95.field1167) {
				var30 = 0;
				var12 = var30 + ObjectComposition.soundEffectsArchive.percentage() * 53 / 100;
				var12 += MouseHandler.archive6.percentage() * 5 / 100;
				var12 += class450.archive8.percentage() * 36 / 100;
				var12 += class1.archive10.percentage() / 100;
				var12 += Login.archive13.percentage() / 100;
				var12 += class142.field1656.percentage() * 3 / 100;
				var12 += class319.field3306.percentage() / 100;
				if (var12 != 100) {
					if (var12 != 0) {
						WorldMapLabelSize.method5875(30, "Checking for updates - " + var12 + "%");
					}

				} else {
					AsyncRestClient.method182(ObjectComposition.soundEffectsArchive, "Sound FX");
					AsyncRestClient.method182(MouseHandler.archive6, "Music Tracks");
					AsyncRestClient.method182(class450.archive8, "Sprites");
					AsyncRestClient.method182(class142.field1656, "Music Samples");
					AsyncRestClient.method182(class319.field3306, "Music Patches");
					WorldMapLabelSize.method5875(40, "Loaded update list");
					class434.method8371(class95.field1180);
				}
			} else {
				int var3;
				if (Client.field536 == class95.field1180) {
					boolean var31 = !Client.isLowDetail;
					ArchiveLoader.field1059 = -1873395006;
					class550.PcmPlayer_stereo = var31;
					ConcurrentMidiTask.field4886 = 2;
					ArrayList var23 = new ArrayList(3);
					DynamicObject.pcmPlayer1 = AABB.method5243(GameEngine.taskHandler, 0, 2048);
					Widget.pcmStreamMixer = new PcmStreamMixer();
					PcmStreamMixer var26 = new PcmStreamMixer();
					var26.addSubStream(Widget.pcmStreamMixer);

					for (var3 = 0; var3 < 3; ++var3) {
						MidiPcmStream var24 = new MidiPcmStream(DynamicObject.pcmPlayer1);
						var24.method6611(9, 128);
						var26.addSubStream(var24);
						var23.add(var24);
					}

					DynamicObject.pcmPlayer1.setStream(var26);
					class146.method3546(class319.field3306, class142.field1656, ObjectComposition.soundEffectsArchive, var23);
					class333.decimator = new Decimator(22050, ArchiveLoader.field1059 * -336955471);
					WorldMapLabelSize.method5875(60, "Prepared sound engine");
					class434.method8371(class95.field1177);
				} else {
					int var13;
					if (Client.field536 == class95.field1177) {
						if (HttpRequestTask.field76 == null) {
							HttpRequestTask.field76 = new Fonts(class450.archive8, Login.archive13);
						}

						FontName[] var20 = new FontName[]{FontName.FontName_verdana11, FontName.FontName_verdana13, FontName.FontName_plain11, FontName.FontName_plain12, FontName.FontName_verdana15, FontName.FontName_bold12};
						var13 = var20.length;
						Fonts var25 = HttpRequestTask.field76;
						FontName[] var29 = new FontName[]{FontName.FontName_verdana11, FontName.FontName_verdana13, FontName.FontName_plain11, FontName.FontName_plain12, FontName.FontName_verdana15, FontName.FontName_bold12};
						Client.fontsMap = var25.createMap(var29);
						if (Client.fontsMap.size() < var13) {
							WorldMapLabelSize.method5875(80, "Loading fonts - " + Client.fontsMap.size() * 100 / var13 + "%");
						} else {
							class224.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
							UserComparator6.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
							Calendar.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
							AuthenticationScheme.platformInfo = Client.field794.get();
							WorldMapLabelSize.method5875(80, "Loaded fonts");
							class434.method8371(class95.field1171);
						}
					} else if (class95.field1171 == Client.field536) {
						var12 = class229.method4631(class1.archive10, class450.archive8);
						var13 = BoundaryObject.method5596(class450.archive8);
						if (var12 < var13) {
							WorldMapLabelSize.method5875(90, "Loading title screen - " + var12 * 100 / var13 + "%");
						} else {
							WorldMapLabelSize.method5875(100, "Loaded title screen");
							if (Client.field719) {
								BuddyRankComparator.updateGameState(5);
								class434.method8371(class95.field1170);
							} else {
								class434.method8371(class95.field1166);
							}

						}
					} else if (class95.field1170 == Client.field536) {
						BuddyRankComparator.updateGameState(10);
					} else {
						Archive var19;
						if (Client.field536 == class95.field1166) {
							FileSystem.field2400 = WorldMapRenderer.newArchive(class389.field4557.field4579, false, true, true, false);
							class171.field1849 = WorldMapRenderer.newArchive(class389.field4568.field4579, false, true, true, false);
							class59.archive2 = WorldMapRenderer.newArchive(class389.field4559.field4579, true, false, true, false);
							WorldMapRegion.archive4 = WorldMapRenderer.newArchive(class389.field4560.field4579, false, true, true, false);
							EnumComposition.archive9 = WorldMapRenderer.newArchive(class389.field4562.field4579, true, true, true, false);
							class156.field1737 = WorldMapRenderer.newArchive(class389.field4564.field4579, false, true, true, false);
							ModeWhere.field4720 = WorldMapRenderer.newArchive(class389.field4566.field4579, false, true, true, false);
							PlayerComposition.field3818 = WorldMapRenderer.newArchive(class389.field4576.field4579, false, true, true, false);
							class1.archive12 = WorldMapRenderer.newArchive(class389.field4578.field4579, false, true, true, false);
							class195.field2054 = WorldMapRenderer.newArchive(class389.field4573.field4579, true, true, true, false);
							Sound.field1746 = WorldMapRenderer.newArchive(class389.field4574.field4579, false, true, true, false);
							UrlRequester.field1491 = WorldMapRenderer.newArchive(class389.field4575.field4579, false, true, true, false);
							Clock.field2468 = WorldMapRenderer.newArchive(class389.field4556.field4579, false, true, true, false);
							class160.field1759 = WorldMapRenderer.newArchive(class389.field4577.field4579, false, true, true, false);
							var13 = class389.field4563.field4579;
							ArchiveDisk var21 = null;
							if (JagexCache.JagexCache_dat2File != null) {
								var21 = new ArchiveDisk(var13, JagexCache.JagexCache_dat2File, UserComparator6.JagexCache_idxFiles[var13], 1000000);
							}

							var19 = new Archive(var21, WorldMapElement.masterDisk, class376.field4123, var13, false, true, true, true, true);
							Language.field4701 = var19;
							WorldMapLabelSize.method5875(20, "Connecting to update server");
							class434.method8371(class95.field1168);
						} else if (class95.field1168 == Client.field536) {
							var30 = 0;
							var12 = var30 + FileSystem.field2400.percentage() * 5 / 100;
							var12 += class171.field1849.percentage() * 2 / 100;
							var12 += class59.archive2.percentage() / 100;
							var12 += WorldMapRegion.archive4.percentage() / 100;
							var12 += EnumComposition.archive9.percentage() * 10 / 100;
							var12 += class156.field1737.percentage() * 65 / 100;
							var12 += ModeWhere.field4720.percentage() / 100;
							var12 += PlayerComposition.field3818.percentage() / 100;
							var12 += class1.archive12.percentage() * 6 / 100;
							var12 += UrlRequester.field1491.percentage() / 100;
							var12 += Sound.field1746.percentage() * 2 / 100;
							var12 += Clock.field2468.percentage() * 2 / 100;
							var12 += class160.field1759.percentage() / 100;
							var12 += Language.field4701.percentage() / 100;
							var12 += class195.field2054.method7565() && class195.field2054.isFullyLoaded() ? 1 : 0;
							if (var12 != 100) {
								if (var12 != 0) {
									WorldMapLabelSize.method5875(30, "Checking for updates - " + var12 + "%");
								}

							} else {
								AsyncRestClient.method182(FileSystem.field2400, "Animations");
								AsyncRestClient.method182(class171.field1849, "Skeletons");
								AsyncRestClient.method182(EnumComposition.archive9, "Maps");
								AsyncRestClient.method182(class156.field1737, "Models");
								AsyncRestClient.method182(PlayerComposition.field3818, "Music Jingles");
								AsyncRestClient.method182(UrlRequester.field1491, "World Map");
								AsyncRestClient.method182(Sound.field1746, "World Map Geography");
								AsyncRestClient.method182(Clock.field2468, "World Map Ground");
								class164.field1806 = new GraphicsDefaults();
								class164.field1806.decode(class195.field2054);
								WorldMapLabelSize.method5875(30, "Loaded update list");
								class434.method8371(class95.field1164);
							}
						} else if (Client.field536 == class95.field1164) {
							class198.topLevelWorldView = Client.worldViewManager.method2667(104, 104, TaskHandler.clientPreferences.getDrawDistance());
							class344.worldView = class198.topLevelWorldView;
							Decimator.sceneMinimapSprite = new SpritePixels(512, 512);
							WorldMapLabelSize.method5875(30, "Starting game engine...");
							class434.method8371(class95.field1173);
						} else {
							Archive var2;
							if (Client.field536 == class95.field1173) {
								if (!class59.archive2.isFullyLoaded()) {
									WorldMapLabelSize.method5875(40, "Loading config - " + class59.archive2.loadPercent() + "%");
								} else if (!class160.field1759.isFullyLoaded()) {
									WorldMapLabelSize.method5875(40, "Loading config - " + (80 + class1.archive12.loadPercent() / 6) + "%");
								} else {
									HorizontalAlignment.method3987(class59.archive2);
									ApproximateRouteStrategy.method1262(class59.archive2);
									class298.method6297(class59.archive2, class156.field1737);
									class327.method6531(class59.archive2, class156.field1737, Client.isLowDetail);
									var19 = class59.archive2;
									Archive var22 = class156.field1737;
									NPCComposition.NpcDefinition_archive = var19;
									GrandExchangeOfferTotalQuantityComparator.field4643 = var22;
									HttpRequestTask.method288(class59.archive2);
									class144.method3506(class59.archive2, class156.field1737, Client.isMembersWorld, class224.fontPlain11);
									var2 = class59.archive2;
									Archive var16 = FileSystem.field2400;
									Archive var4 = class171.field1849;
									class520.SequenceDefinition_archive = var2;
									class219.SequenceDefinition_animationsArchive = var16;
									class219.SequenceDefinition_skeletonsArchive = var4;
									Archive var27 = class59.archive2;
									Archive var17 = class156.field1737;
									SpotAnimationDefinition.SpotAnimationDefinition_archive = var27;
									SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var17;
									class134.method3428(class59.archive2);
									class364.method7473(class59.archive2);
									class416.widgetDefinition = new WidgetDefinition(WorldMapRegion.archive4, class156.field1737, class450.archive8, Login.archive13, Language.field4701);
									Archive var28 = class59.archive2;
									InvDefinition.InvDefinition_archive = var28;
									Archive var8 = class59.archive2;
									EnumComposition.EnumDefinition_archive = var8;
									PcmPlayer.method839(class59.archive2);
									Login.method2410(class59.archive2);
									Archive var9 = class59.archive2;
									ParamComposition.ParamDefinition_archive = var9;
									PlayerComposition.method6944(class59.archive2);
									FloorDecoration.method4784(class59.archive2);
									AsyncHttpResponse.field66 = new class539(WorldMapRenderer.field3156, 54, WorldMapCacheName.clientLanguage, class59.archive2);
									class59.field406 = new class539(WorldMapRenderer.field3156, 47, WorldMapCacheName.clientLanguage, class59.archive2);
									class508.varcs = new Varcs();
									class160.method3651(class59.archive2, class450.archive8, Login.archive13);
									Archive var10 = class59.archive2;
									Archive var11 = class450.archive8;
									HealthBarDefinition.HealthBarDefinition_archive = var10;
									class53.field341 = var11;
									class1.method10(class59.archive2, class450.archive8);
									WorldMapLabelSize.method5875(50, "Loaded config");
									class434.method8371(class95.field1174);
								}
							} else if (class95.field1174 == Client.field536) {
								var12 = 0;
								if (HttpMethod.compass == null) {
									HttpMethod.compass = class496.SpriteBuffer_getSprite(class450.archive8, class164.field1806.field5109, 0);
								} else {
									++var12;
								}

								if (class424.redHintArrowSprite == null) {
									class424.redHintArrowSprite = class496.SpriteBuffer_getSprite(class450.archive8, class164.field1806.field5100, 0);
								} else {
									++var12;
								}

								IndexedSprite[] var1;
								IndexedSprite[] var5;
								int var6;
								IndexedSprite var7;
								if (class420.mapSceneSprites == null) {
									var2 = class450.archive8;
									var3 = class164.field1806.field5101;
									if (!class53.method1110(var2, var3, 0)) {
										var1 = null;
									} else {
										var5 = new IndexedSprite[SpriteBufferProperties.SpriteBuffer_spriteCount];

										for (var6 = 0; var6 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var6) {
											var7 = var5[var6] = new IndexedSprite();
											var7.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
											var7.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
											var7.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[var6];
											var7.yOffset = class497.SpriteBuffer_yOffsets[var6];
											var7.subWidth = class7.SpriteBuffer_spriteWidths[var6];
											var7.subHeight = SpriteBufferProperties.SpriteBuffer_spriteHeights[var6];
											var7.palette = SpriteBufferProperties.SpriteBuffer_spritePalette;
											var7.pixels = class280.SpriteBuffer_pixels[var6];
										}

										SpriteBufferProperties.SpriteBuffer_xOffsets = null;
										class497.SpriteBuffer_yOffsets = null;
										class7.SpriteBuffer_spriteWidths = null;
										SpriteBufferProperties.SpriteBuffer_spriteHeights = null;
										SpriteBufferProperties.SpriteBuffer_spritePalette = null;
										class280.SpriteBuffer_pixels = null;
										var1 = var5;
									}

									class420.mapSceneSprites = var1;
								} else {
									++var12;
								}

								if (class320.headIconPkSprites == null) {
									class320.headIconPkSprites = UrlRequester.method3231(class450.archive8, class164.field1806.field5102, 0);
								} else {
									++var12;
								}

								if (class539.headIconPrayerSprites == null) {
									class539.headIconPrayerSprites = UrlRequester.method3231(class450.archive8, class164.field1806.field5103, 0);
								} else {
									++var12;
								}

								if (LoginState.headIconHintSprites == null) {
									LoginState.headIconHintSprites = UrlRequester.method3231(class450.archive8, class164.field1806.field5104, 0);
								} else {
									++var12;
								}

								if (class136.mapDotSprites == null) {
									class136.mapDotSprites = UrlRequester.method3231(class450.archive8, class164.field1806.field5105, 0);
								} else {
									++var12;
								}

								if (class278.crossSprites == null) {
									class278.crossSprites = UrlRequester.method3231(class450.archive8, class164.field1806.field5106, 0);
								} else {
									++var12;
								}

								if (GraphicsObject.field892 == null) {
									GraphicsObject.field892 = UrlRequester.method3231(class450.archive8, class164.field1806.field5114, 0);
								} else {
									++var12;
								}

								if (class147.scrollBarSprites == null) {
									var2 = class450.archive8;
									var3 = class164.field1806.field5108;
									if (!class53.method1110(var2, var3, 0)) {
										var1 = null;
									} else {
										var5 = new IndexedSprite[SpriteBufferProperties.SpriteBuffer_spriteCount];

										for (var6 = 0; var6 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var6) {
											var7 = var5[var6] = new IndexedSprite();
											var7.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
											var7.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
											var7.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[var6];
											var7.yOffset = class497.SpriteBuffer_yOffsets[var6];
											var7.subWidth = class7.SpriteBuffer_spriteWidths[var6];
											var7.subHeight = SpriteBufferProperties.SpriteBuffer_spriteHeights[var6];
											var7.palette = SpriteBufferProperties.SpriteBuffer_spritePalette;
											var7.pixels = class280.SpriteBuffer_pixels[var6];
										}

										SpriteBufferProperties.SpriteBuffer_xOffsets = null;
										class497.SpriteBuffer_yOffsets = null;
										class7.SpriteBuffer_spriteWidths = null;
										SpriteBufferProperties.SpriteBuffer_spriteHeights = null;
										SpriteBufferProperties.SpriteBuffer_spritePalette = null;
										class280.SpriteBuffer_pixels = null;
										var1 = var5;
									}

									class147.scrollBarSprites = var1;
								} else {
									++var12;
								}

								if (class491.field5088 == null) {
									var2 = class450.archive8;
									var3 = class164.field1806.field5107;
									if (!class53.method1110(var2, var3, 0)) {
										var1 = null;
									} else {
										var5 = new IndexedSprite[SpriteBufferProperties.SpriteBuffer_spriteCount];

										for (var6 = 0; var6 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var6) {
											var7 = var5[var6] = new IndexedSprite();
											var7.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
											var7.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
											var7.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[var6];
											var7.yOffset = class497.SpriteBuffer_yOffsets[var6];
											var7.subWidth = class7.SpriteBuffer_spriteWidths[var6];
											var7.subHeight = SpriteBufferProperties.SpriteBuffer_spriteHeights[var6];
											var7.palette = SpriteBufferProperties.SpriteBuffer_spritePalette;
											var7.pixels = class280.SpriteBuffer_pixels[var6];
										}

										SpriteBufferProperties.SpriteBuffer_xOffsets = null;
										class497.SpriteBuffer_yOffsets = null;
										class7.SpriteBuffer_spriteWidths = null;
										SpriteBufferProperties.SpriteBuffer_spriteHeights = null;
										SpriteBufferProperties.SpriteBuffer_spritePalette = null;
										class280.SpriteBuffer_pixels = null;
										var1 = var5;
									}

									class491.field5088 = var1;
								} else {
									++var12;
								}

								if (var12 < 11) {
									WorldMapLabelSize.method5875(70, "Loading sprites - " + var12 * 100 / 12 + "%");
								} else {
									AbstractFont.AbstractFont_modIconSprites = class491.field5088;
									class424.redHintArrowSprite.normalize();
									var13 = (int)(Math.random() * 21.0D) - 10;
									int var14 = (int)(Math.random() * 21.0D) - 10;
									var3 = (int)(Math.random() * 21.0D) - 10;
									int var15 = (int)(Math.random() * 41.0D) - 20;
									class420.mapSceneSprites[0].shiftColors(var15 + var13, var15 + var14, var3 + var15);
									WorldMapLabelSize.method5875(60, "Loaded sprites");
									class434.method8371(class95.field1172);
								}
							} else if (class95.field1172 == Client.field536) {
								if (!ModeWhere.field4720.isFullyLoaded()) {
									WorldMapLabelSize.method5875(70, "Loading textures - " + "0%");
								} else {
									class202.textureProvider = new TextureProvider(ModeWhere.field4720, class450.archive8, 20, TaskHandler.clientPreferences.getBrightness(), Client.isLowDetail ? 64 : 128);
									Rasterizer3D.setTextureLoader(class202.textureProvider);
									Rasterizer3D.buildPalette(TaskHandler.clientPreferences.getBrightness());
									class434.method8371(class95.field1175);
								}
							} else if (Client.field536 == class95.field1175) {
								var12 = class202.textureProvider.getLoadedPercentage();
								if (var12 < 100) {
									WorldMapLabelSize.method5875(80, "Loading textures - " + var12 + "%");
								} else {
									WorldMapLabelSize.method5875(90, "Loaded textures");
									class434.method8371(class95.field1176);
								}
							} else if (class95.field1176 == Client.field536) {
								IgnoreList.mouseRecorder = new MouseRecorder();
								GameEngine.taskHandler.newThreadTask(IgnoreList.mouseRecorder, 10);
								WorldMapLabelSize.method5875(92, "Loaded input handler");
								class434.method8371(class95.field1183);
							} else if (class95.field1183 == Client.field536) {
								if (!class1.archive10.tryLoadFileByNames("huffman", "")) {
									WorldMapLabelSize.method5875(94, "Loading wordpack - " + 0 + "%");
								} else {
									Huffman var18 = new Huffman(class1.archive10.takeFileByNames("huffman", ""));
									AbstractWorldMapData.method6283(var18);
									WorldMapLabelSize.method5875(94, "Loaded wordpack");
									class434.method8371(class95.field1169);
								}
							} else if (Client.field536 == class95.field1169) {
								if (!WorldMapRegion.archive4.isFullyLoaded()) {
									WorldMapLabelSize.method5875(96, "Loading interfaces - " + WorldMapRegion.archive4.loadPercent() * 4 / 5 + "%");
								} else if (!Language.field4701.isFullyLoaded()) {
									WorldMapLabelSize.method5875(96, "Loading interfaces - " + Language.field4701.loadPercent() * 4 / 5 + "%");
								} else if (!class1.archive12.isFullyLoaded()) {
									WorldMapLabelSize.method5875(96, "Loading interfaces - " + (80 + class1.archive12.loadPercent() / 6) + "%");
								} else if (!Login.archive13.isFullyLoaded()) {
									WorldMapLabelSize.method5875(96, "Loading interfaces - " + (96 + Login.archive13.loadPercent() / 50) + "%");
								} else {
									WorldMapLabelSize.method5875(98, "Loaded interfaces");
									if (class1.archive12.isValidFileName("version.dat", "")) {
										Buffer var0 = new Buffer(class1.archive12.takeFileByNames("version.dat", ""));
										var0.readUnsignedShort();
									}

									class434.method8371(class95.field1179);
								}
							} else if (Client.field536 == class95.field1179) {
								if (UrlRequester.field1491.getGroupCount() > 0 && !UrlRequester.field1491.tryLoadGroupByName(WorldMapCacheName.field3263.name)) {
									WorldMapLabelSize.method5875(100, "Loading world map - " + UrlRequester.field1491.groupLoadPercentByName(WorldMapCacheName.field3263.name) / 10 + "%");
								} else {
									if (LoginState.worldMap == null) {
										LoginState.worldMap = new WorldMap();
										LoginState.worldMap.init(UrlRequester.field1491, Sound.field1746, Clock.field2468, Calendar.fontBold12, Client.fontsMap, class420.mapSceneSprites);
									}

									WorldMapLabelSize.method5875(100, "Loaded world map");
									if (Client.field719) {
										class434.method8371(class95.field1181);
									} else {
										class434.method8371(class95.field1170);
									}

									Client.field596 = false;
								}
							} else {
								if (Client.field536 == class95.field1181) {
									MilliClock.field2402 = false;
									BuddyRankComparator.updateGameState(20);
									class153.updateLoginState(LoginState.READ_ACCOUNT_INFO_PACKET_SIZE);
								}

							}
						}
					}
				}
			}
		}
	}
}
