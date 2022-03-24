import java.util.HashMap; import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
@Implements("HorizontalAlignment")
public enum HorizontalAlignment implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lfg;")

	field1900(0, 0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Lfg;")

	@Export("HorizontalAlignment_centered")
	HorizontalAlignment_centered(1, 1),
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Lfg;")

	field1904(2, 2);

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"Lqx;")

	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 
	819776149)

	@Export("value")
	public final int value;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	66971335)

	@Export("id")
	final int id;

	HorizontalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"15")

	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(II)Lkn;", garbageValue = 
	"2113988657")

	@Export("getWidget")
	public static Widget getWidget(int var0) {
		int var1 = var0 >> 16;
		int var2 = var0 & 65535;
		if ((EnumComposition.Widget_interfaceComponents[var1] == null) || (EnumComposition.Widget_interfaceComponents[var1][var2] == null)) {
			boolean var3 = MusicPatchNode2.loadInterface(var1);
			if (!var3) {
				return null;
			}
		}

		return EnumComposition.Widget_interfaceComponents[var1][var2];
	}

	@ObfuscatedName("fz")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"22")

	@Export("load")
	static void load() {
		int var23;
		if (Client.titleLoadingStage == 0) {
			FriendSystem.scene = new Scene(4, 104, 104, Tiles.Tiles_heights);

			for (var23 = 0; var23 < 4; ++var23) {
				Client.collisionMaps[var23] = new CollisionMap(104, 104);
			}

			MusicPatchNode2.sceneMinimapSprite = new SpritePixels(512, 512);
			Login.Login_loadingText = "Starting game engine...";
			Login.Login_loadingPercent = 5;
			Client.titleLoadingStage = 20;
		} else if (Client.titleLoadingStage == 20) {
			Login.Login_loadingText = "Prepared visibility map";
			Login.Login_loadingPercent = 10;
			Client.titleLoadingStage = 30;
		} else if (Client.titleLoadingStage == 30) {
			TileItem.archive0 = GrandExchangeEvent.newArchive(0, false, true, true);
			class321.archive1 = GrandExchangeEvent.newArchive(1, false, true, true);
			FloorOverlayDefinition.archive2 = GrandExchangeEvent.newArchive(2, true, false, true);
			class121.archive3 = GrandExchangeEvent.newArchive(3, false, true, true);
			MouseHandler.archive4 = GrandExchangeEvent.newArchive(4, false, true, true);
			class302.archive5 = GrandExchangeEvent.newArchive(5, true, true, true);
			ArchiveLoader.archive6 = GrandExchangeEvent.newArchive(6, true, true, true);
			class145.archive7 = GrandExchangeEvent.newArchive(7, false, true, true);
			WorldMapData_1.archive8 = GrandExchangeEvent.newArchive(8, false, true, true);
			class132.archive9 = GrandExchangeEvent.newArchive(9, false, true, true);
			World.archive10 = GrandExchangeEvent.newArchive(10, false, true, true);
			class268.archive11 = GrandExchangeEvent.newArchive(11, false, true, true);
			class135.archive12 = GrandExchangeEvent.newArchive(12, false, true, true);
			class4.archive13 = GrandExchangeEvent.newArchive(13, true, false, true);
			DevicePcmPlayerProvider.archive14 = GrandExchangeEvent.newArchive(14, false, true, true);
			ViewportMouse.archive15 = GrandExchangeEvent.newArchive(15, false, true, true);
			ArchiveLoader.archive17 = GrandExchangeEvent.newArchive(17, true, true, true);
			JagexCache.archive18 = GrandExchangeEvent.newArchive(18, false, true, true);
			class202.archive19 = GrandExchangeEvent.newArchive(19, false, true, true);
			ReflectionCheck.archive20 = GrandExchangeEvent.newArchive(20, false, true, true);
			Login.Login_loadingText = "Connecting to update server";
			Login.Login_loadingPercent = 20;
			Client.titleLoadingStage = 40;
		} else if (Client.titleLoadingStage == 40) {
			byte var33 = 0;
			var23 = var33 + ((TileItem.archive0.percentage() * 4) / 100);
			var23 += (class321.archive1.percentage() * 4) / 100;
			var23 += (FloorOverlayDefinition.archive2.percentage() * 2) / 100;
			var23 += (class121.archive3.percentage() * 2) / 100;
			var23 += (MouseHandler.archive4.percentage() * 6) / 100;
			var23 += (class302.archive5.percentage() * 4) / 100;
			var23 += (ArchiveLoader.archive6.percentage() * 2) / 100;
			var23 += (class145.archive7.percentage() * 56) / 100;
			var23 += (WorldMapData_1.archive8.percentage() * 2) / 100;
			var23 += (class132.archive9.percentage() * 2) / 100;
			var23 += (World.archive10.percentage() * 2) / 100;
			var23 += (class268.archive11.percentage() * 2) / 100;
			var23 += (class135.archive12.percentage() * 2) / 100;
			var23 += (class4.archive13.percentage() * 2) / 100;
			var23 += (DevicePcmPlayerProvider.archive14.percentage() * 2) / 100;
			var23 += (ViewportMouse.archive15.percentage() * 2) / 100;
			var23 += class202.archive19.percentage() / 100;
			var23 += JagexCache.archive18.percentage() / 100;
			var23 += ReflectionCheck.archive20.percentage() / 100;
			var23 += (ArchiveLoader.archive17.method5819() && ArchiveLoader.archive17.isFullyLoaded()) ? 1 : 0;
			if (var23 != 100) {
				if (var23 != 0) {
					Login.Login_loadingText = ("Checking for updates - " + var23) + "%";
				}

				Login.Login_loadingPercent = 30;
			} else {
				ItemLayer.method3895(TileItem.archive0, "Animations");
				ItemLayer.method3895(class321.archive1, "Skeletons");
				ItemLayer.method3895(MouseHandler.archive4, "Sound FX");
				ItemLayer.method3895(class302.archive5, "Maps");
				ItemLayer.method3895(ArchiveLoader.archive6, "Music Tracks");
				ItemLayer.method3895(class145.archive7, "Models");
				ItemLayer.method3895(WorldMapData_1.archive8, "Sprites");
				ItemLayer.method3895(class268.archive11, "Music Jingles");
				ItemLayer.method3895(DevicePcmPlayerProvider.archive14, "Music Samples");
				ItemLayer.method3895(ViewportMouse.archive15, "Music Patches");
				ItemLayer.method3895(class202.archive19, "World Map");
				ItemLayer.method3895(JagexCache.archive18, "World Map Geography");
				ItemLayer.method3895(ReflectionCheck.archive20, "World Map Ground");
				PendingSpawn.spriteIds = new GraphicsDefaults();
				PendingSpawn.spriteIds.decode(ArchiveLoader.archive17);
				Login.Login_loadingText = "Loaded update list";
				Login.Login_loadingPercent = 30;
				Client.titleLoadingStage = 45;
			}
		} else {
			Archive var24;
			Archive var25;
			Archive var26;
			if (Client.titleLoadingStage == 45) {
				class67.method1881(22050, !Client.isLowDetail, 2);
				MidiPcmStream var30 = new MidiPcmStream();
				var30.method5281(9, 128);
				class290.pcmPlayer0 = AbstractWorldMapData.method4986(class434.taskHandler, 0, 22050);
				class290.pcmPlayer0.setStream(var30);
				var24 = ViewportMouse.archive15;
				var25 = DevicePcmPlayerProvider.archive14;
				var26 = MouseHandler.archive4;
				class273.musicPatchesArchive = var24;
				class273.musicSamplesArchive = var25;
				class273.soundEffectsArchive = var26;
				WorldMapEvent.midiPcmStream = var30;
				class182.pcmPlayer1 = AbstractWorldMapData.method4986(class434.taskHandler, 1, 2048);
				WorldMapIcon_1.pcmStreamMixer = new PcmStreamMixer();
				class182.pcmPlayer1.setStream(WorldMapIcon_1.pcmStreamMixer);
				LoginScreenAnimation.decimator = new Decimator(22050, SecureRandomFuture.field949);
				Login.Login_loadingText = "Prepared sound engine";
				Login.Login_loadingPercent = 35;
				Client.titleLoadingStage = 50;
				class267.WorldMapElement_fonts = new Fonts(WorldMapData_1.archive8, class4.archive13);
			} else {
				int var1;
				if (Client.titleLoadingStage == 50) {
					FontName[] var29 = new FontName[]{ FontName.FontName_bold12, FontName.FontName_verdana11, FontName.FontName_verdana13, FontName.FontName_plain11, FontName.FontName_verdana15, FontName.FontName_plain12 };
					var1 = var29.length;
					Fonts var31 = class267.WorldMapElement_fonts;
					FontName[] var32 = new FontName[]{ FontName.FontName_bold12, FontName.FontName_verdana11, FontName.FontName_verdana13, FontName.FontName_plain11, FontName.FontName_verdana15, FontName.FontName_plain12 };
					Client.fontsMap = var31.createMap(var32);
					if (Client.fontsMap.size() < var1) {
						Login.Login_loadingText = ("Loading fonts - " + ((Client.fontsMap.size() * 100) / var1)) + "%";
						Login.Login_loadingPercent = 40;
					} else {
						TextureProvider.fontPlain11 = ((Font) (Client.fontsMap.get(FontName.FontName_plain11)));
						ViewportMouse.fontPlain12 = ((Font) (Client.fontsMap.get(FontName.FontName_plain12)));
						FloorOverlayDefinition.fontBold12 = ((Font) (Client.fontsMap.get(FontName.FontName_bold12)));
						UserComparator2.platformInfo = Client.platformInfoProvider.get();
						Login.Login_loadingText = "Loaded fonts";
						Login.Login_loadingPercent = 40;
						Client.titleLoadingStage = 60;
					}
				} else if (Client.titleLoadingStage == 60) {
					var23 = Skeleton.method4118(World.archive10, WorldMapData_1.archive8);
					var1 = BufferedFile.method7626();
					if (var23 < var1) {
						Login.Login_loadingText = ("Loading title screen - " + ((var23 * 100) / var1)) + "%";
						Login.Login_loadingPercent = 50;
					} else {
						Login.Login_loadingText = "Loaded title screen";
						Login.Login_loadingPercent = 50;
						InterfaceParent.updateGameState(5);
						Client.titleLoadingStage = 70;
					}
				} else if (Client.titleLoadingStage == 70) {
					if (!FloorOverlayDefinition.archive2.isFullyLoaded()) {
						Login.Login_loadingText = ("Loading config - " + FloorOverlayDefinition.archive2.loadPercent()) + "%";
						Login.Login_loadingPercent = 60;
					} else {
						NetFileRequest.method5867(FloorOverlayDefinition.archive2);
						HealthBarUpdate.method2217(FloorOverlayDefinition.archive2);
						Archive var28 = FloorOverlayDefinition.archive2;
						var24 = class145.archive7;
						KitDefinition.KitDefinition_archive = var28;
						KitDefinition.KitDefinition_modelsArchive = var24;
						KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
						GrandExchangeOfferUnitPriceComparator.method6081(FloorOverlayDefinition.archive2, class145.archive7, Client.isLowDetail);
						class299.method5766(FloorOverlayDefinition.archive2, class145.archive7);
						class166.method3310(FloorOverlayDefinition.archive2);
						Login.method1944(FloorOverlayDefinition.archive2, class145.archive7, Client.isMembersWorld, TextureProvider.fontPlain11);
						var25 = FloorOverlayDefinition.archive2;
						var26 = TileItem.archive0;
						Archive var27 = class321.archive1;
						class282.SequenceDefinition_archive = var25;
						SequenceDefinition.SequenceDefinition_animationsArchive = var26;
						DevicePcmPlayerProvider.SequenceDefinition_skeletonsArchive = var27;
						Archive var5 = FloorOverlayDefinition.archive2;
						Archive var6 = class145.archive7;
						SpotAnimationDefinition.SpotAnimationDefinition_archive = var5;
						SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var6;
						Archive var7 = FloorOverlayDefinition.archive2;
						VarbitComposition.VarbitDefinition_archive = var7;
						Archive var8 = FloorOverlayDefinition.archive2;
						VarpDefinition.VarpDefinition_archive = var8;
						VarpDefinition.VarpDefinition_fileCount = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16);
						Archive var9 = class121.archive3;
						Archive var10 = class145.archive7;
						Archive var11 = WorldMapData_1.archive8;
						Archive var12 = class4.archive13;
						class122.Widget_archive = var9;
						BoundaryObject.Widget_modelsArchive = var10;
						WorldMapLabel.Widget_spritesArchive = var11;
						Client.Widget_fontsArchive = var12;
						EnumComposition.Widget_interfaceComponents = new Widget[class122.Widget_archive.getGroupCount()][];
						Frames.Widget_loadedInterfaces = new boolean[class122.Widget_archive.getGroupCount()];
						StudioGame.method5783(FloorOverlayDefinition.archive2);
						Archive var13 = FloorOverlayDefinition.archive2;
						JagexCache.EnumDefinition_archive = var13;
						class268.method5226(FloorOverlayDefinition.archive2);
						class115.method2685(FloorOverlayDefinition.archive2);
						Canvas.method390(FloorOverlayDefinition.archive2);
						ScriptEvent.HitSplatDefinition_cachedSprites = new class426(Login.field917, 54, FriendSystem.clientLanguage, FloorOverlayDefinition.archive2);
						FontName.HitSplatDefinition_cached = new class426(Login.field917, 47, FriendSystem.clientLanguage, FloorOverlayDefinition.archive2);
						JagexCache.varcs = new Varcs();
						Archive var14 = FloorOverlayDefinition.archive2;
						Archive var15 = WorldMapData_1.archive8;
						Archive var16 = class4.archive13;
						HitSplatDefinition.HitSplatDefinition_archive = var14;
						class20.field101 = var15;
						HitSplatDefinition.HitSplatDefinition_fontsArchive = var16;
						Archive var17 = FloorOverlayDefinition.archive2;
						Archive var18 = WorldMapData_1.archive8;
						HealthBarDefinition.HealthBarDefinition_archive = var17;
						HealthBarDefinition.field1867 = var18;
						Archive var19 = FloorOverlayDefinition.archive2;
						Archive var20 = WorldMapData_1.archive8;
						WorldMapElement.WorldMapElement_archive = var20;
						if (var19.isFullyLoaded()) {
							class132.WorldMapElement_count = var19.getGroupFileCount(35);
							WorldMapElement.WorldMapElement_cached = new WorldMapElement[class132.WorldMapElement_count];

							for (int var21 = 0; var21 < class132.WorldMapElement_count; ++var21) {
								byte[] var22 = var19.takeFile(35, var21);
								WorldMapElement.WorldMapElement_cached[var21] = new WorldMapElement(var21);
								if (var22 != null) {
									WorldMapElement.WorldMapElement_cached[var21].decode(new Buffer(var22));
									WorldMapElement.WorldMapElement_cached[var21].method3383();
								}
							}
						}

						Login.Login_loadingText = "Loaded config";
						Login.Login_loadingPercent = 60;
						Client.titleLoadingStage = 80;
					}
				} else if (Client.titleLoadingStage == 80) {
					var23 = 0;
					if (class14.compass == null) {
						class14.compass = InterfaceParent.SpriteBuffer_getSprite(WorldMapData_1.archive8, PendingSpawn.spriteIds.compass, 0);
					} else {
						++var23;
					}

					if (Huffman.redHintArrowSprite == null) {
						Huffman.redHintArrowSprite = InterfaceParent.SpriteBuffer_getSprite(WorldMapData_1.archive8, PendingSpawn.spriteIds.field4315, 0);
					} else {
						++var23;
					}

					if (Message.mapSceneSprites == null) {
						Message.mapSceneSprites = WallDecoration.method4516(WorldMapData_1.archive8, PendingSpawn.spriteIds.mapScenes, 0);
					} else {
						++var23;
					}

					if (Bounds.headIconPkSprites == null) {
						Bounds.headIconPkSprites = UserList.method6853(WorldMapData_1.archive8, PendingSpawn.spriteIds.headIconsPk, 0);
					} else {
						++var23;
					}

					if (DynamicObject.headIconPrayerSprites == null) {
						DynamicObject.headIconPrayerSprites = UserList.method6853(WorldMapData_1.archive8, PendingSpawn.spriteIds.field4318, 0);
					} else {
						++var23;
					}

					if (VarpDefinition.headIconHintSprites == null) {
						VarpDefinition.headIconHintSprites = UserList.method6853(WorldMapData_1.archive8, PendingSpawn.spriteIds.field4319, 0);
					} else {
						++var23;
					}

					if (class17.mapMarkerSprites == null) {
						class17.mapMarkerSprites = UserList.method6853(WorldMapData_1.archive8, PendingSpawn.spriteIds.field4320, 0);
					} else {
						++var23;
					}

					if (Client.crossSprites == null) {
						Client.crossSprites = UserList.method6853(WorldMapData_1.archive8, PendingSpawn.spriteIds.field4321, 0);
					} else {
						++var23;
					}

					if (class142.mapDotSprites == null) {
						class142.mapDotSprites = UserList.method6853(WorldMapData_1.archive8, PendingSpawn.spriteIds.field4317, 0);
					} else {
						++var23;
					}

					if (class268.scrollBarSprites == null) {
						class268.scrollBarSprites = WallDecoration.method4516(WorldMapData_1.archive8, PendingSpawn.spriteIds.field4314, 0);
					} else {
						++var23;
					}

					if (UserComparator8.modIconSprites == null) {
						UserComparator8.modIconSprites = WallDecoration.method4516(WorldMapData_1.archive8, PendingSpawn.spriteIds.field4324, 0);
					} else {
						++var23;
					}

					if (var23 < 11) {
						Login.Login_loadingText = ("Loading sprites - " + ((var23 * 100) / 12)) + "%";
						Login.Login_loadingPercent = 70;
					} else {
						AbstractFont.AbstractFont_modIconSprites = UserComparator8.modIconSprites;
						Huffman.redHintArrowSprite.normalize();
						var1 = ((int) (Math.random() * 21.0)) - 10;
						int var2 = ((int) (Math.random() * 21.0)) - 10;
						int var3 = ((int) (Math.random() * 21.0)) - 10;
						int var4 = ((int) (Math.random() * 41.0)) - 20;
						Message.mapSceneSprites[0].shiftColors(var1 + var4, var4 + var2, var4 + var3);
						Login.Login_loadingText = "Loaded sprites";
						Login.Login_loadingPercent = 70;
						Client.titleLoadingStage = 90;
					}
				} else if (Client.titleLoadingStage == 90) {
					if (!class132.archive9.isFullyLoaded()) {
						Login.Login_loadingText = "Loading textures - " + "0%";
						Login.Login_loadingPercent = 90;
					} else {
						class33.textureProvider = new TextureProvider(class132.archive9, WorldMapData_1.archive8, 20, Interpreter.clientPreferences.method2266(), Client.isLowDetail ? 64 : 128);
						Rasterizer3D.Rasterizer3D_textureLoader(class33.textureProvider);
						Rasterizer3D.Rasterizer3D_setBrightness(Interpreter.clientPreferences.method2266());
						Client.titleLoadingStage = 100;
					}
				} else if (Client.titleLoadingStage == 100) {
					var23 = class33.textureProvider.getLoadedPercentage();
					if (var23 < 100) {
						Login.Login_loadingText = ("Loading textures - " + var23) + "%";
						Login.Login_loadingPercent = 90;
					} else {
						Login.Login_loadingText = "Loaded textures";
						Login.Login_loadingPercent = 90;
						Client.titleLoadingStage = 110;
					}
				} else if (Client.titleLoadingStage == 110) {
					BuddyRankComparator.mouseRecorder = new MouseRecorder();
					class434.taskHandler.newThreadTask(BuddyRankComparator.mouseRecorder, 10);
					Login.Login_loadingText = "Loaded input handler";
					Login.Login_loadingPercent = 92;
					Client.titleLoadingStage = 120;
				} else if (Client.titleLoadingStage == 120) {
					if (!World.archive10.tryLoadFileByNames("huffman", "")) {
						Login.Login_loadingText = ("Loading wordpack - " + 0) + "%";
						Login.Login_loadingPercent = 94;
					} else {
						Huffman var0 = new Huffman(World.archive10.takeFileByNames("huffman", ""));
						VertexNormal.method4496(var0);
						Login.Login_loadingText = "Loaded wordpack";
						Login.Login_loadingPercent = 94;
						Client.titleLoadingStage = 130;
					}
				} else if (Client.titleLoadingStage == 130) {
					if (!class121.archive3.isFullyLoaded()) {
						Login.Login_loadingText = ("Loading interfaces - " + ((class121.archive3.loadPercent() * 4) / 5)) + "%";
						Login.Login_loadingPercent = 96;
					} else if (!class135.archive12.isFullyLoaded()) {
						Login.Login_loadingText = ("Loading interfaces - " + (80 + (class135.archive12.loadPercent() / 6))) + "%";
						Login.Login_loadingPercent = 96;
					} else if (!class4.archive13.isFullyLoaded()) {
						Login.Login_loadingText = ("Loading interfaces - " + (96 + (class4.archive13.loadPercent() / 50))) + "%";
						Login.Login_loadingPercent = 96;
					} else {
						Login.Login_loadingText = "Loaded interfaces";
						Login.Login_loadingPercent = 98;
						Client.titleLoadingStage = 140;
					}
				} else if (Client.titleLoadingStage == 140) {
					Login.Login_loadingPercent = 100;
					if (!class202.archive19.tryLoadGroupByName(WorldMapCacheName.field2849.name)) {
						Login.Login_loadingText = ("Loading world map - " + (class202.archive19.groupLoadPercentByName(WorldMapCacheName.field2849.name) / 10)) + "%";
					} else {
						if (ClanChannel.worldMap == null) {
							ClanChannel.worldMap = new WorldMap();
							ClanChannel.worldMap.init(class202.archive19, JagexCache.archive18, ReflectionCheck.archive20, FloorOverlayDefinition.fontBold12, Client.fontsMap, Message.mapSceneSprites);
						}

						Login.Login_loadingText = "Loaded world map";
						Client.titleLoadingStage = 150;
					}
				} else if (Client.titleLoadingStage == 150) {
					InterfaceParent.updateGameState(10);
				}
			}
		}
	}}