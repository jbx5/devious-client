import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
@Implements("ParamComposition")
public class ParamComposition extends DualNode {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("ParamDefinition_archive")
	static AbstractArchive ParamDefinition_archive;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lle;"
	)
	@Export("ParamDefinition_cached")
	static EvictingDualNodeHashTable ParamDefinition_cached;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -284568135
	)
	static int field2138;
	@ObfuscatedName("ao")
	@Export("type")
	char type;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -490553151
	)
	@Export("defaultInt")
	public int defaultInt;
	@ObfuscatedName("ac")
	@Export("defaultStr")
	public String defaultStr;
	@ObfuscatedName("ai")
	@Export("autoDisable")
	boolean autoDisable;

	static {
		ParamDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	ParamComposition() {
		this.autoDisable = true;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-990843992"
	)
	@Export("postDecode")
	void postDecode() {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ltm;B)V",
		garbageValue = "-59"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ltm;II)V",
		garbageValue = "-1461368185"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.type = ViewportMouse.method4918(var1.readByte());
		} else if (var2 == 2) {
			this.defaultInt = var1.readInt();
		} else if (var2 == 4) {
			this.autoDisable = false;
		} else if (var2 == 5) {
			this.defaultStr = var1.readStringCp1252NullTerminated();
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-785538560"
	)
	@Export("isString")
	public boolean isString() {
		return this.type == 's';
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-50"
	)
	static void method3821() {
		int var28;
		if (Client.field558 == class92.field1169) {
			class130.scene = new Scene(4, 104, 104, Tiles.Tiles_heights);

			for (var28 = 0; var28 < 4; ++var28) {
				Client.collisionMaps[var28] = new CollisionMap(104, 104);
			}

			AbstractUserComparator.sceneMinimapSprite = new SpritePixels(512, 512);
			Login.Login_loadingText = "Starting game engine...";
			Login.Login_loadingPercent = 5;
			Client.field558 = class92.field1159;
		} else if (class92.field1159 == Client.field558) {
			Login.Login_loadingText = "Prepared visibility map";
			Login.Login_loadingPercent = 10;
			Client.field558 = class92.field1168;
		} else if (class92.field1168 == Client.field558) {
			AttackOption.field1351 = class133.newArchive(0, false, true, true, false);
			class318.archive7 = class133.newArchive(1, false, true, true, false);
			class1.archive2 = class133.newArchive(2, true, false, true, false);
			ObjectSound.archive4 = class133.newArchive(3, false, true, true, false);
			class28.field161 = class133.newArchive(4, false, true, true, false);
			class499.archive9 = class133.newArchive(5, true, true, true, false);
			class385.archive6 = class133.newArchive(6, true, true, true, false);
			Message.archive11 = class133.newArchive(7, false, true, true, false);
			PcmPlayer.archive8 = class133.newArchive(8, false, true, true, false);
			class147.field1691 = class133.newArchive(9, false, true, true, false);
			class141.archive10 = class133.newArchive(10, false, true, true, false);
			class388.field4435 = class133.newArchive(11, false, true, true, false);
			GrandExchangeOffer.archive12 = class133.newArchive(12, false, true, true, false);
			Player.archive13 = class133.newArchive(13, true, false, true, false);
			class106.field1371 = class133.newArchive(14, false, true, true, false);
			Tiles.field1038 = class133.newArchive(15, false, true, true, false);
			class10.field46 = class133.newArchive(17, true, true, true, false);
			WorldMapElement.field1964 = class133.newArchive(18, false, true, true, false);
			ClanChannelMember.field1676 = class133.newArchive(19, false, true, true, false);
			class227.field2545 = class133.newArchive(20, false, true, true, false);
			class343.field3869 = class133.newArchive(21, false, true, true, true);
			Login.Login_loadingText = "Connecting to update server";
			Login.Login_loadingPercent = 20;
			Client.field558 = class92.field1161;
		} else if (class92.field1161 == Client.field558) {
			byte var50 = 0;
			var28 = var50 + AttackOption.field1351.percentage() * 4 / 100;
			var28 += class318.archive7.percentage() * 4 / 100;
			var28 += class1.archive2.percentage() * 2 / 100;
			var28 += ObjectSound.archive4.percentage() * 2 / 100;
			var28 += class28.field161.percentage() * 6 / 100;
			var28 += class499.archive9.percentage() * 4 / 100;
			var28 += class385.archive6.percentage() * 2 / 100;
			var28 += Message.archive11.percentage() * 55 / 100;
			var28 += PcmPlayer.archive8.percentage() * 2 / 100;
			var28 += class147.field1691.percentage() * 2 / 100;
			var28 += class141.archive10.percentage() * 2 / 100;
			var28 += class388.field4435.percentage() * 2 / 100;
			var28 += GrandExchangeOffer.archive12.percentage() * 2 / 100;
			var28 += Player.archive13.percentage() * 2 / 100;
			var28 += class106.field1371.percentage() * 2 / 100;
			var28 += Tiles.field1038.percentage() * 2 / 100;
			var28 += ClanChannelMember.field1676.percentage() / 100;
			var28 += WorldMapElement.field1964.percentage() / 100;
			var28 += class227.field2545.percentage() / 100;
			var28 += class343.field3869.percentage() / 100;
			var28 += class10.field46.method6676() && class10.field46.isFullyLoaded() ? 1 : 0;
			if (var28 != 100) {
				if (var28 != 0) {
					Login.Login_loadingText = "Checking for updates - " + var28 + "%";
				}

				Login.Login_loadingPercent = 30;
			} else {
				class466.method8374(AttackOption.field1351, "Animations");
				class466.method8374(class318.archive7, "Skeletons");
				class466.method8374(class28.field161, "Sound FX");
				class466.method8374(class499.archive9, "Maps");
				class466.method8374(class385.archive6, "Music Tracks");
				class466.method8374(Message.archive11, "Models");
				class466.method8374(PcmPlayer.archive8, "Sprites");
				class466.method8374(class388.field4435, "Music Jingles");
				class466.method8374(class106.field1371, "Music Samples");
				class466.method8374(Tiles.field1038, "Music Patches");
				class466.method8374(ClanChannelMember.field1676, "World Map");
				class466.method8374(WorldMapElement.field1964, "World Map Geography");
				class466.method8374(class227.field2545, "World Map Ground");
				class387.field4432 = new GraphicsDefaults();
				class387.field4432.decode(class10.field46);
				Login.Login_loadingText = "Loaded update list";
				Login.Login_loadingPercent = 30;
				Client.field558 = class92.field1162;
			}
		} else {
			int var2;
			Archive var30;
			Archive var31;
			if (class92.field1162 == Client.field558) {
				class504.method8936(22050, !Client.isLowDetail, 2);
				ArrayList var40 = new ArrayList(3);
				AddRequestTask.pcmPlayer1 = TileItem.method2684(GameEngine.taskHandler, 0, 2048);
				class162.pcmStreamMixer = new PcmStreamMixer();
				PcmStreamMixer var45 = new PcmStreamMixer();
				var45.addSubStream(class162.pcmStreamMixer);

				for (var2 = 0; var2 < 3; ++var2) {
					MidiPcmStream var48 = new MidiPcmStream();
					var48.method5811(9, 128);
					var45.addSubStream(var48);
					var40.add(var48);
				}

				AddRequestTask.pcmPlayer1.setStream(var45);
				var30 = Tiles.field1038;
				var31 = class106.field1371;
				Archive var49 = class28.field161;
				class305.field3399 = var30;
				class305.field3400 = var31;
				class305.field3403 = var49;
				class305.field3402 = var40;
				class330.decimator = new Decimator(22050, PcmPlayer.field293);
				Login.Login_loadingText = "Prepared sound engine";
				Login.Login_loadingPercent = 35;
				Client.field558 = class92.field1166;
				PacketBufferNode.field3230 = new Fonts(PcmPlayer.archive8, Player.archive13);
			} else {
				int var1;
				if (Client.field558 == class92.field1166) {
					FontName[] var39 = new FontName[]{FontName.FontName_verdana13, FontName.FontName_verdana11, FontName.FontName_verdana15, FontName.FontName_bold12, FontName.FontName_plain11, FontName.FontName_plain12};
					var1 = var39.length;
					Fonts var46 = PacketBufferNode.field3230;
					FontName[] var47 = new FontName[]{FontName.FontName_verdana13, FontName.FontName_verdana11, FontName.FontName_verdana15, FontName.FontName_bold12, FontName.FontName_plain11, FontName.FontName_plain12};
					Client.fontsMap = var46.createMap(var47);
					if (Client.fontsMap.size() < var1) {
						Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var1 + "%";
						Login.Login_loadingPercent = 40;
					} else {
						HealthBarUpdate.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
						SecureRandomCallable.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
						class59.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
						class18.platformInfo = Client.field671.get();
						Login.Login_loadingText = "Loaded fonts";
						Login.Login_loadingPercent = 40;
						Client.field558 = class92.field1164;
					}
				} else {
					int var3;
					Archive var5;
					Archive var29;
					if (Client.field558 == class92.field1164) {
						var29 = class141.archive10;
						var30 = PcmPlayer.archive8;
						var3 = 0;
						String[] var33 = Login.field946;

						int var34;
						String var42;
						for (var34 = 0; var34 < var33.length; ++var34) {
							var42 = var33[var34];
							if (var29.tryLoadFileByNames(var42, "")) {
								++var3;
							}
						}

						var33 = Login.field967;

						for (var34 = 0; var34 < var33.length; ++var34) {
							var42 = var33[var34];
							if (var30.tryLoadFileByNames(var42, "")) {
								++var3;
							}
						}

						var33 = Login.field971;

						for (var34 = 0; var34 < var33.length; ++var34) {
							var42 = var33[var34];
							if (var30.getGroupId(var42) != -1 && var30.tryLoadFileByNames(var42, "")) {
								++var3;
							}
						}

						var5 = PcmPlayer.archive8;
						int var35 = Login.field946.length + Login.field967.length;
						String[] var43 = Login.field971;

						for (int var36 = 0; var36 < var43.length; ++var36) {
							String var44 = var43[var36];
							if (var5.getGroupId(var44) != -1) {
								++var35;
							}
						}

						if (var3 < var35) {
							Login.Login_loadingText = "Loading title screen - " + var3 * 100 / var35 + "%";
							Login.Login_loadingPercent = 50;
						} else {
							Login.Login_loadingText = "Loaded title screen";
							Login.Login_loadingPercent = 50;
							MusicSong.updateGameState(5);
							Client.field558 = class92.field1165;
						}
					} else if (class92.field1165 == Client.field558) {
						if (!class1.archive2.isFullyLoaded()) {
							Login.Login_loadingText = "Loading config - " + class1.archive2.loadPercent() + "%";
							Login.Login_loadingPercent = 60;
						} else if (!class343.field3869.isFullyLoaded()) {
							Login.Login_loadingText = "Loading config - " + (80 + GrandExchangeOffer.archive12.loadPercent() / 6) + "%";
							Login.Login_loadingPercent = 60;
						} else {
							class326.method6058(class1.archive2);
							SecureRandomFuture.method2163(class1.archive2);
							Archive var38 = class1.archive2;
							var29 = Message.archive11;
							KitDefinition.KitDefinition_archive = var38;
							KitDefinition.KitDefinition_modelsArchive = var29;
							KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
							var30 = class1.archive2;
							var31 = Message.archive11;
							boolean var41 = Client.isLowDetail;
							ObjectComposition.ObjectDefinition_archive = var30;
							ObjectComposition.ObjectDefinition_modelsArchive = var31;
							ObjectComposition.ObjectDefinition_isLowDetail = var41;
							var5 = class1.archive2;
							Archive var6 = Message.archive11;
							NPCComposition.NpcDefinition_archive = var5;
							NPCComposition.field2032 = var6;
							Archive var7 = class1.archive2;
							StructComposition.StructDefinition_archive = var7;
							Archive var8 = class1.archive2;
							Archive var9 = Message.archive11;
							boolean var10 = Client.isMembersWorld;
							Font var11 = HealthBarUpdate.fontPlain11;
							class384.ItemDefinition_archive = var8;
							ItemComposition.ItemDefinition_modelArchive = var9;
							ItemComposition.ItemDefinition_inMembersWorld = var10;
							HealthBar.ItemDefinition_fileCount = class384.ItemDefinition_archive.getGroupFileCount(10);
							class452.ItemDefinition_fontPlain11 = var11;
							class227.method4479(class1.archive2, AttackOption.field1351, class318.archive7);
							Archive var12 = class1.archive2;
							Archive var13 = Message.archive11;
							SpotAnimationDefinition.SpotAnimationDefinition_archive = var12;
							SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var13;
							ServerPacket.method5708(class1.archive2);
							FileSystem.method3488(class1.archive2);
							Archive var14 = ObjectSound.archive4;
							Archive var15 = Message.archive11;
							Archive var16 = PcmPlayer.archive8;
							Archive var17 = Player.archive13;
							int var18 = 0;
							if (var14 != null) {
								Decimator.Widget_archive = var14;
								class47.field352 = var15;
								Language.Widget_spritesArchive = var16;
								class155.Widget_fontsArchive = var17;
								var18 = Decimator.Widget_archive.getGroupCount();
							}

							PacketBufferNode.Widget_interfaceComponents = new Widget[var18][];
							class316.Widget_loadedInterfaces = new boolean[var18];
							ModeWhere.method6955(class1.archive2);
							Archive var32 = class1.archive2;
							EnumComposition.EnumDefinition_archive = var32;
							Archive var19 = class1.archive2;
							VarcInt.VarcInt_archive = var19;
							Archive var20 = class1.archive2;
							class139.method3083(class1.archive2);
							BufferedSource.method8066(class1.archive2);
							ModelData0.method5022(class1.archive2);
							class47.HitSplatDefinition_cachedSprites = new class497(WorldMapSectionType.field2997, 54, ClanChannelMember.clientLanguage, class1.archive2);
							SwapSongTask.HitSplatDefinition_cached = new class497(WorldMapSectionType.field2997, 47, ClanChannelMember.clientLanguage, class1.archive2);
							KeyHandler.varcs = new Varcs();
							Archive var21 = class1.archive2;
							Archive var22 = PcmPlayer.archive8;
							Archive var23 = Player.archive13;
							HitSplatDefinition.HitSplatDefinition_archive = var21;
							HitSplatDefinition.field2146 = var22;
							HitSplatDefinition.HitSplatDefinition_fontsArchive = var23;
							class152.method3168(class1.archive2, PcmPlayer.archive8);
							Archive var24 = class1.archive2;
							Archive var25 = PcmPlayer.archive8;
							WorldMapElement.WorldMapElement_archive = var25;
							if (var24.isFullyLoaded()) {
								WorldMapElement.WorldMapElement_count = var24.getGroupFileCount(35);
								WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count];

								for (int var26 = 0; var26 < WorldMapElement.WorldMapElement_count; ++var26) {
									byte[] var27 = var24.takeFile(35, var26);
									WorldMapElement.WorldMapElement_cached[var26] = new WorldMapElement(var26);
									if (var27 != null) {
										WorldMapElement.WorldMapElement_cached[var26].decode(new Buffer(var27));
										WorldMapElement.WorldMapElement_cached[var26].method3580();
									}
								}
							}

							Login.Login_loadingText = "Loaded config";
							Login.Login_loadingPercent = 60;
							Client.field558 = class92.field1158;
						}
					} else if (Client.field558 == class92.field1158) {
						var28 = 0;
						if (Client.compass == null) {
							Client.compass = Tiles.SpriteBuffer_getSprite(PcmPlayer.archive8, class387.field4432.field4715, 0);
						} else {
							++var28;
						}

						if (class167.redHintArrowSprite == null) {
							class167.redHintArrowSprite = Tiles.SpriteBuffer_getSprite(PcmPlayer.archive8, class387.field4432.field4705, 0);
						} else {
							++var28;
						}

						if (class299.mapSceneSprites == null) {
							class299.mapSceneSprites = class28.method424(PcmPlayer.archive8, class387.field4432.field4708, 0);
						} else {
							++var28;
						}

						if (class178.headIconPkSprites == null) {
							class178.headIconPkSprites = WorldMapArchiveLoader.method8495(PcmPlayer.archive8, class387.field4432.field4707, 0);
						} else {
							++var28;
						}

						if (class502.headIconPrayerSprites == null) {
							class502.headIconPrayerSprites = WorldMapArchiveLoader.method8495(PcmPlayer.archive8, class387.field4432.field4713, 0);
						} else {
							++var28;
						}

						if (ArchiveLoader.headIconHintSprites == null) {
							ArchiveLoader.headIconHintSprites = WorldMapArchiveLoader.method8495(PcmPlayer.archive8, class387.field4432.field4704, 0);
						} else {
							++var28;
						}

						if (Message.mapDotSprites == null) {
							Message.mapDotSprites = WorldMapArchiveLoader.method8495(PcmPlayer.archive8, class387.field4432.field4710, 0);
						} else {
							++var28;
						}

						if (class152.crossSprites == null) {
							class152.crossSprites = WorldMapArchiveLoader.method8495(PcmPlayer.archive8, class387.field4432.field4711, 0);
						} else {
							++var28;
						}

						if (FloorOverlayDefinition.field2289 == null) {
							FloorOverlayDefinition.field2289 = WorldMapArchiveLoader.method8495(PcmPlayer.archive8, class387.field4432.field4712, 0);
						} else {
							++var28;
						}

						if (GrandExchangeOfferOwnWorldComparator.scrollBarSprites == null) {
							GrandExchangeOfferOwnWorldComparator.scrollBarSprites = class28.method424(PcmPlayer.archive8, class387.field4432.field4709, 0);
						} else {
							++var28;
						}

						if (class451.field4755 == null) {
							class451.field4755 = class28.method424(PcmPlayer.archive8, class387.field4432.field4714, 0);
						} else {
							++var28;
						}

						if (var28 < 11) {
							Login.Login_loadingText = "Loading sprites - " + var28 * 100 / 12 + "%";
							Login.Login_loadingPercent = 70;
						} else {
							AbstractFont.AbstractFont_modIconSprites = class451.field4755;
							class167.redHintArrowSprite.normalize();
							var1 = (int)(Math.random() * 21.0D) - 10;
							var2 = (int)(Math.random() * 21.0D) - 10;
							var3 = (int)(Math.random() * 21.0D) - 10;
							int var4 = (int)(Math.random() * 41.0D) - 20;
							class299.mapSceneSprites[0].shiftColors(var4 + var1, var2 + var4, var4 + var3);
							Login.Login_loadingText = "Loaded sprites";
							Login.Login_loadingPercent = 70;
							Client.field558 = class92.field1173;
						}
					} else if (Client.field558 == class92.field1173) {
						if (!class147.field1691.isFullyLoaded()) {
							Login.Login_loadingText = "Loading textures - " + "0%";
							Login.Login_loadingPercent = 90;
						} else {
							class129.textureProvider = new TextureProvider(class147.field1691, PcmPlayer.archive8, 20, class449.clientPreferences.method2505(), Client.isLowDetail ? 64 : 128);
							Rasterizer3D.method4376(class129.textureProvider);
							Rasterizer3D.method4377(class449.clientPreferences.method2505());
							Client.field558 = class92.field1174;
						}
					} else if (class92.field1174 == Client.field558) {
						var28 = class129.textureProvider.getLoadedPercentage();
						if (var28 < 100) {
							Login.Login_loadingText = "Loading textures - " + var28 + "%";
							Login.Login_loadingPercent = 90;
						} else {
							Login.Login_loadingText = "Loaded textures";
							Login.Login_loadingPercent = 90;
							Client.field558 = class92.field1171;
						}
					} else if (Client.field558 == class92.field1171) {
						class126.mouseRecorder = new MouseRecorder();
						GameEngine.taskHandler.newThreadTask(class126.mouseRecorder, 10);
						Login.Login_loadingText = "Loaded input handler";
						Login.Login_loadingPercent = 92;
						Client.field558 = class92.field1170;
					} else if (class92.field1170 == Client.field558) {
						if (!class141.archive10.tryLoadFileByNames("huffman", "")) {
							Login.Login_loadingText = "Loading wordpack - " + 0 + "%";
							Login.Login_loadingPercent = 94;
						} else {
							Huffman var37 = new Huffman(class141.archive10.takeFileByNames("huffman", ""));
							UserComparator9.method2896(var37);
							Login.Login_loadingText = "Loaded wordpack";
							Login.Login_loadingPercent = 94;
							Client.field558 = class92.field1163;
						}
					} else if (class92.field1163 == Client.field558) {
						if (!ObjectSound.archive4.isFullyLoaded()) {
							Login.Login_loadingText = "Loading interfaces - " + ObjectSound.archive4.loadPercent() * 4 / 5 + "%";
							Login.Login_loadingPercent = 96;
						} else if (!GrandExchangeOffer.archive12.isFullyLoaded()) {
							Login.Login_loadingText = "Loading interfaces - " + (80 + GrandExchangeOffer.archive12.loadPercent() / 6) + "%";
							Login.Login_loadingPercent = 96;
						} else if (!Player.archive13.isFullyLoaded()) {
							Login.Login_loadingText = "Loading interfaces - " + (96 + Player.archive13.loadPercent() / 50) + "%";
							Login.Login_loadingPercent = 96;
						} else {
							Login.Login_loadingText = "Loaded interfaces";
							Login.Login_loadingPercent = 98;
							if (GrandExchangeOffer.archive12.isValidFileName("version.dat", "")) {
								Buffer var0 = new Buffer(GrandExchangeOffer.archive12.takeFileByNames("version.dat", ""));
								var0.readUnsignedShort();
							}

							Client.field558 = class92.field1172;
						}
					} else if (Client.field558 == class92.field1172) {
						Login.Login_loadingPercent = 100;
						if (ClanChannelMember.field1676.getGroupCount() > 0 && !ClanChannelMember.field1676.tryLoadGroupByName(WorldMapCacheName.field3068.name)) {
							Login.Login_loadingText = "Loading world map - " + ClanChannelMember.field1676.groupLoadPercentByName(WorldMapCacheName.field3068.name) / 10 + "%";
						} else {
							if (Canvas.worldMap == null) {
								Canvas.worldMap = new WorldMap();
								Canvas.worldMap.init(ClanChannelMember.field1676, WorldMapElement.field1964, class227.field2545, class59.fontBold12, Client.fontsMap, class299.mapSceneSprites);
							}

							Login.Login_loadingText = "Loaded world map";
							Client.field558 = class92.field1160;
						}
					} else {
						if (class92.field1160 == Client.field558) {
							MusicSong.updateGameState(10);
						}

					}
				}
			}
		}
	}
}
