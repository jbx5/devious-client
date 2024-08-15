import java.util.ArrayList;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("am")
public enum class6 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lam;"
	)
	field13(0, 0);

	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 750044103
	)
	static int field12;
	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	static Archive field11;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -605890545
	)
	public final int field10;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1258113265
	)
	final int field9;

	class6(int var3, int var4) {
		this.field10 = var3;
		this.field9 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "111"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field9;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Date;",
		garbageValue = "2"
	)
	static Date method39() {
		java.util.Calendar var0 = java.util.Calendar.getInstance();
		var0.set(2, 0);
		var0.set(5, 1);
		var0.set(1, 1900);
		return var0.getTime();
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	static void method36() {
		if (Client.field779 == class94.field1142) {
			Projectile.soundEffectsArchive = WorldMapScaleHandler.newArchive(class386.field4467.field4469, false, true, true, false);
			class33.archive6 = WorldMapScaleHandler.newArchive(class386.field4476.field4469, true, true, true, false);
			class59.archive8 = WorldMapScaleHandler.newArchive(class386.field4478.field4469, false, true, true, false);
			ReflectionCheck.archive10 = WorldMapScaleHandler.newArchive(class386.field4473.field4469, false, true, true, false);
			Actor.archive13 = WorldMapScaleHandler.newArchive(class386.field4471.field4469, true, false, true, false);
			class424.field4678 = WorldMapScaleHandler.newArchive(class386.field4477.field4469, false, true, true, false);
			class167.field1796 = WorldMapScaleHandler.newArchive(class386.field4483.field4469, false, true, true, false);
			ClientPacket.method6153(20, "Connecting to update server");
			GameBuild.method7155(class94.field1144);
		} else {
			byte var22;
			int var37;
			if (class94.field1144 == Client.field779) {
				var22 = 0;
				var37 = var22 + Projectile.soundEffectsArchive.percentage() * 53 / 100;
				var37 += class33.archive6.percentage() * 5 / 100;
				var37 += class59.archive8.percentage() * 36 / 100;
				var37 += ReflectionCheck.archive10.percentage() / 100;
				var37 += Actor.archive13.percentage() / 100;
				var37 += class424.field4678.percentage() * 3 / 100;
				var37 += class167.field1796.percentage() / 100;
				if (var37 != 100) {
					if (var37 != 0) {
						ClientPacket.method6153(30, "Checking for updates - " + var37 + "%");
					}

				} else {
					class130.method3131(Projectile.soundEffectsArchive, "Sound FX");
					class130.method3131(class33.archive6, "Music Tracks");
					class130.method3131(class59.archive8, "Sprites");
					class130.method3131(class424.field4678, "Music Samples");
					class130.method3131(class167.field1796, "Music Patches");
					ClientPacket.method6153(40, "Loaded update list");
					GameBuild.method7155(class94.field1146);
				}
			} else {
				int var2;
				Archive var24;
				Archive var25;
				Archive var26;
				if (Client.field779 == class94.field1146) {
					class327.method6176(22050, !Client.isLowDetail, 2);
					ArrayList var33 = new ArrayList(3);
					class132.pcmPlayer1 = class169.method3596(GameEngine.taskHandler, 0, 2048);
					ScriptFrame.pcmStreamMixer = new PcmStreamMixer();
					PcmStreamMixer var38 = new PcmStreamMixer();
					var38.addSubStream(ScriptFrame.pcmStreamMixer);

					for (var2 = 0; var2 < 3; ++var2) {
						MidiPcmStream var41 = new MidiPcmStream(class132.pcmPlayer1);
						var41.method6252(9, 128);
						var38.addSubStream(var41);
						var33.add(var41);
					}

					class132.pcmPlayer1.setStream(var38);
					var24 = class167.field1796;
					var25 = class424.field4678;
					var26 = Projectile.soundEffectsArchive;
					class288.field3119 = var24;
					class233.field2460 = var25;
					class332.field3572 = var26;
					class332.field3562 = var33;
					class343.decimator = new Decimator(22050, class511.field5136);
					ClientPacket.method6153(60, "Prepared sound engine");
					GameBuild.method7155(class94.field1147);
				} else {
					int var1;
					if (Client.field779 == class94.field1147) {
						if (class459.field4873 == null) {
							class459.field4873 = new Fonts(class59.archive8, Actor.archive13);
						}

						FontName[] var32 = new FontName[]{FontName.FontName_verdana15, FontName.FontName_verdana11, FontName.FontName_verdana13, FontName.FontName_bold12, FontName.FontName_plain11, FontName.FontName_plain12};
						var1 = var32.length;
						Fonts var39 = class459.field4873;
						FontName[] var40 = new FontName[]{FontName.FontName_verdana15, FontName.FontName_verdana11, FontName.FontName_verdana13, FontName.FontName_bold12, FontName.FontName_plain11, FontName.FontName_plain12};
						Client.fontsMap = var39.createMap(var40);
						if (Client.fontsMap.size() < var1) {
							ClientPacket.method6153(80, "Loading fonts - " + Client.fontsMap.size() * 100 / var1 + "%");
						} else {
							Occluder.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
							GrandExchangeOfferUnitPriceComparator.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
							WorldMapLabelSize.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
							WorldMapElement.platformInfo = Client.field787.get();
							ClientPacket.method6153(80, "Loaded fonts");
							GameBuild.method7155(class94.field1148);
						}
					} else {
						int var3;
						Archive var5;
						Archive var23;
						if (class94.field1148 == Client.field779) {
							var23 = ReflectionCheck.archive10;
							var24 = class59.archive8;
							var3 = 0;
							String[] var42 = Login.field935;

							int var27;
							String var34;
							for (var27 = 0; var27 < var42.length; ++var27) {
								var34 = var42[var27];
								if (var23.tryLoadFileByNames(var34, "")) {
									++var3;
								}
							}

							var42 = Login.field940;

							for (var27 = 0; var27 < var42.length; ++var27) {
								var34 = var42[var27];
								if (var24.tryLoadFileByNames(var34, "")) {
									++var3;
								}
							}

							var42 = Login.field923;

							for (var27 = 0; var27 < var42.length; ++var27) {
								var34 = var42[var27];
								if (var24.getGroupId(var34) != -1 && var24.tryLoadFileByNames(var34, "")) {
									++var3;
								}
							}

							var5 = class59.archive8;
							int var28 = Login.field940.length + Login.field935.length;
							String[] var35 = Login.field923;

							for (int var29 = 0; var29 < var35.length; ++var29) {
								String var36 = var35[var29];
								if (var5.getGroupId(var36) != -1) {
									++var28;
								}
							}

							if (var3 < var28) {
								ClientPacket.method6153(90, "Loading title screen - " + var3 * 100 / var28 + "%");
							} else {
								ClientPacket.method6153(100, "Loaded title screen");
								if (class380.field4407) {
									UserComparator3.updateGameState(5);
									GameBuild.method7155(class94.field1155);
								} else {
									GameBuild.method7155(class94.field1143);
								}

							}
						} else if (class94.field1155 == Client.field779) {
							UserComparator3.updateGameState(10);
						} else if (Client.field779 == class94.field1143) {
							WorldView.field1305 = WorldMapScaleHandler.newArchive(class386.field4463.field4469, false, true, true, false);
							LoginScreenAnimation.field1281 = WorldMapScaleHandler.newArchive(class386.field4462.field4469, false, true, true, false);
							SoundSystem.archive2 = WorldMapScaleHandler.newArchive(class386.field4465.field4469, true, false, true, false);
							class60.archive4 = WorldMapScaleHandler.newArchive(class386.field4466.field4469, false, true, true, false);
							ClientPreferences.archive9 = WorldMapScaleHandler.newArchive(class386.field4468.field4469, true, true, true, false);
							KeyHandler.field100 = WorldMapScaleHandler.newArchive(class386.field4470.field4469, false, true, true, false);
							Tile.field1936 = WorldMapScaleHandler.newArchive(class386.field4464.field4469, false, true, true, false);
							Occluder.field2111 = WorldMapScaleHandler.newArchive(class386.field4474.field4469, false, true, true, false);
							RestClientThreadFactory.archive12 = WorldMapScaleHandler.newArchive(class386.field4475.field4469, false, true, true, false);
							ClientPacket.field3331 = WorldMapScaleHandler.newArchive(class386.field4479.field4469, true, true, true, false);
							class33.field152 = WorldMapScaleHandler.newArchive(class386.field4480.field4469, false, true, true, false);
							VarbitComposition.field2680 = WorldMapScaleHandler.newArchive(class386.field4481.field4469, false, true, true, false);
							FriendsChat.field4909 = WorldMapScaleHandler.newArchive(class386.field4482.field4469, false, true, true, false);
							class249.field2637 = WorldMapScaleHandler.newArchive(class386.field4472.field4469, false, true, true, false);
							field11 = HttpResponse.method278(class386.field4484.field4469, false, true, true, true, true);
							ClientPacket.method6153(20, "Connecting to update server");
							GameBuild.method7155(class94.field1145);
						} else if (class94.field1145 != Client.field779) {
							if (class94.field1153 == Client.field779) {
								ConcurrentMidiTask.topLevelWorldView = new WorldView(-1, 104, 104, TileItem.clientPreferences.getDrawDistance(), class173.field1824);
								class328.worldView = ConcurrentMidiTask.topLevelWorldView;
								class91.sceneMinimapSprite = new SpritePixels(512, 512);
								ClientPacket.method6153(30, "Starting game engine...");
								GameBuild.method7155(class94.field1149);
							} else if (class94.field1149 == Client.field779) {
								if (!SoundSystem.archive2.isFullyLoaded()) {
									ClientPacket.method6153(40, "Loading config - " + SoundSystem.archive2.loadPercent() + "%");
								} else if (!class249.field2637.isFullyLoaded()) {
									ClientPacket.method6153(40, "Loading config - " + (80 + RestClientThreadFactory.archive12.loadPercent() / 6) + "%");
								} else {
									Archive var31 = SoundSystem.archive2;
									FloorOverlayDefinition.FloorOverlayDefinition_archive = var31;
									var23 = SoundSystem.archive2;
									FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var23;
									class1.method9(SoundSystem.archive2, KeyHandler.field100);
									Language.method7504(SoundSystem.archive2, KeyHandler.field100, Client.isLowDetail);
									var24 = SoundSystem.archive2;
									var25 = KeyHandler.field100;
									NPCComposition.NpcDefinition_archive = var24;
									NPCComposition.field2575 = var25;
									var26 = SoundSystem.archive2;
									GrandExchangeOfferTotalQuantityComparator.StructDefinition_archive = var26;
									HttpRequest.method84(SoundSystem.archive2, KeyHandler.field100, Client.isMembersWorld, Occluder.fontPlain11);
									var5 = SoundSystem.archive2;
									Archive var6 = WorldView.field1305;
									Archive var7 = LoginScreenAnimation.field1281;
									class536.SequenceDefinition_archive = var5;
									SequenceDefinition.SequenceDefinition_animationsArchive = var6;
									class164.SequenceDefinition_skeletonsArchive = var7;
									Archive var8 = SoundSystem.archive2;
									Archive var9 = KeyHandler.field100;
									SpotAnimationDefinition.SpotAnimationDefinition_archive = var8;
									SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var9;
									Archive var10 = SoundSystem.archive2;
									VarbitComposition.VarbitDefinition_archive = var10;
									Archive var11 = SoundSystem.archive2;
									VarpDefinition.VarpDefinition_archive = var11;
									VarpDefinition.field2453 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16);
									FloorUnderlayDefinition.widgetDefinition = new WidgetDefinition(class60.archive4, KeyHandler.field100, class59.archive8, Actor.archive13, field11);
									Archive var12 = SoundSystem.archive2;
									InvDefinition.InvDefinition_archive = var12;
									Archive var13 = SoundSystem.archive2;
									GrandExchangeOfferUnitPriceComparator.EnumDefinition_archive = var13;
									Archive var14 = SoundSystem.archive2;
									VarcInt.VarcInt_archive = var14;
									class134.method3219(SoundSystem.archive2);
									KitDefinition.method4850(SoundSystem.archive2);
									Archive var15 = SoundSystem.archive2;
									DbTableType.field5307 = var15;
									Archive var16 = SoundSystem.archive2;
									DbRowType.field5321 = var16;
									class1.field2 = new class530(ReflectionCheck.field228, 54, RestClientThreadFactory.clientLanguage, SoundSystem.archive2);
									class373.field4034 = new class530(ReflectionCheck.field228, 47, RestClientThreadFactory.clientLanguage, SoundSystem.archive2);
									ObjectComposition.varcs = new Varcs();
									Archive var17 = SoundSystem.archive2;
									Archive var18 = class59.archive8;
									Archive var19 = Actor.archive13;
									HitSplatDefinition.HitSplatDefinition_archive = var17;
									class139.field1624 = var18;
									HitSplatDefinition.HitSplatDefinition_fontsArchive = var19;
									Archive var20 = SoundSystem.archive2;
									Archive var21 = class59.archive8;
									HealthBarDefinition.HealthBarDefinition_archive = var20;
									HealthBarDefinition.field2518 = var21;
									AABB.method4126(SoundSystem.archive2, class59.archive8);
									ClientPacket.method6153(50, "Loaded config");
									GameBuild.method7155(class94.field1150);
								}
							} else if (class94.field1150 == Client.field779) {
								var37 = 0;
								if (class343.compass == null) {
									class343.compass = class195.SpriteBuffer_getSprite(class59.archive8, class276.field3003.field5005, 0);
								} else {
									++var37;
								}

								if (FileSystem.redHintArrowSprite == null) {
									FileSystem.redHintArrowSprite = class195.SpriteBuffer_getSprite(class59.archive8, class276.field3003.field4996, 0);
								} else {
									++var37;
								}

								if (BufferedSource.mapSceneSprites == null) {
									BufferedSource.mapSceneSprites = ItemContainer.method2397(class59.archive8, class276.field3003.field4997, 0);
								} else {
									++var37;
								}

								if (SecureRandomFuture.headIconPkSprites == null) {
									SecureRandomFuture.headIconPkSprites = Timer.method8427(class59.archive8, class276.field3003.field4998, 0);
								} else {
									++var37;
								}

								if (VertexNormal.headIconPrayerSprites == null) {
									VertexNormal.headIconPrayerSprites = Timer.method8427(class59.archive8, class276.field3003.field4995, 0);
								} else {
									++var37;
								}

								if (class218.headIconHintSprites == null) {
									class218.headIconHintSprites = Timer.method8427(class59.archive8, class276.field3003.field5000, 0);
								} else {
									++var37;
								}

								if (TileItem.mapDotSprites == null) {
									TileItem.mapDotSprites = Timer.method8427(class59.archive8, class276.field3003.field4999, 0);
								} else {
									++var37;
								}

								if (MusicSong.crossSprites == null) {
									MusicSong.crossSprites = Timer.method8427(class59.archive8, class276.field3003.field5002, 0);
								} else {
									++var37;
								}

								if (class269.field2960 == null) {
									class269.field2960 = Timer.method8427(class59.archive8, class276.field3003.field5003, 0);
								} else {
									++var37;
								}

								if (class129.scrollBarSprites == null) {
									class129.scrollBarSprites = ItemContainer.method2397(class59.archive8, class276.field3003.field5001, 0);
								} else {
									++var37;
								}

								if (BufferedFile.field5281 == null) {
									BufferedFile.field5281 = ItemContainer.method2397(class59.archive8, class276.field3003.field5004, 0);
								} else {
									++var37;
								}

								if (var37 < 11) {
									ClientPacket.method6153(70, "Loading sprites - " + var37 * 100 / 12 + "%");
								} else {
									AbstractFont.AbstractFont_modIconSprites = BufferedFile.field5281;
									FileSystem.redHintArrowSprite.normalize();
									var1 = (int)(Math.random() * 21.0D) - 10;
									var2 = (int)(Math.random() * 21.0D) - 10;
									var3 = (int)(Math.random() * 21.0D) - 10;
									int var4 = (int)(Math.random() * 41.0D) - 20;
									BufferedSource.mapSceneSprites[0].shiftColors(var1 + var4, var4 + var2, var4 + var3);
									ClientPacket.method6153(60, "Loaded sprites");
									GameBuild.method7155(class94.field1151);
								}
							} else if (class94.field1151 == Client.field779) {
								if (!Tile.field1936.isFullyLoaded()) {
									ClientPacket.method6153(70, "Loading textures - " + "0%");
								} else {
									class354.textureProvider = new TextureProvider(Tile.field1936, class59.archive8, 20, TileItem.clientPreferences.getBrightness(), Client.isLowDetail ? 64 : 128);
									Rasterizer3D.setTextureLoader(class354.textureProvider);
									Rasterizer3D.buildPalette(TileItem.clientPreferences.getBrightness());
									GameBuild.method7155(class94.field1152);
								}
							} else if (class94.field1152 == Client.field779) {
								var37 = class354.textureProvider.getLoadedPercentage();
								if (var37 < 100) {
									ClientPacket.method6153(80, "Loading textures - " + var37 + "%");
								} else {
									ClientPacket.method6153(90, "Loaded textures");
									GameBuild.method7155(class94.field1156);
								}
							} else if (class94.field1156 == Client.field779) {
								Friend.mouseRecorder = new MouseRecorder();
								GameEngine.taskHandler.newThreadTask(Friend.mouseRecorder, 10);
								ClientPacket.method6153(92, "Loaded input handler");
								GameBuild.method7155(class94.field1157);
							} else if (class94.field1157 == Client.field779) {
								if (!ReflectionCheck.archive10.tryLoadFileByNames("huffman", "")) {
									ClientPacket.method6153(94, "Loading wordpack - " + 0 + "%");
								} else {
									Huffman var30 = new Huffman(ReflectionCheck.archive10.takeFileByNames("huffman", ""));
									class363.huffman = var30;
									ClientPacket.method6153(94, "Loaded wordpack");
									GameBuild.method7155(class94.field1154);
								}
							} else if (Client.field779 == class94.field1154) {
								if (!class60.archive4.isFullyLoaded()) {
									ClientPacket.method6153(96, "Loading interfaces - " + class60.archive4.loadPercent() * 4 / 5 + "%");
								} else if (!field11.isFullyLoaded()) {
									ClientPacket.method6153(96, "Loading interfaces - " + field11.loadPercent() * 4 / 5 + "%");
								} else if (!RestClientThreadFactory.archive12.isFullyLoaded()) {
									ClientPacket.method6153(96, "Loading interfaces - " + (80 + RestClientThreadFactory.archive12.loadPercent() / 6) + "%");
								} else if (!Actor.archive13.isFullyLoaded()) {
									ClientPacket.method6153(96, "Loading interfaces - " + (96 + Actor.archive13.loadPercent() / 50) + "%");
								} else {
									ClientPacket.method6153(98, "Loaded interfaces");
									if (RestClientThreadFactory.archive12.isValidFileName("version.dat", "")) {
										Buffer var0 = new Buffer(RestClientThreadFactory.archive12.takeFileByNames("version.dat", ""));
										var0.readUnsignedShort();
									}

									GameBuild.method7155(class94.field1141);
								}
							} else if (class94.field1141 == Client.field779) {
								if (VarbitComposition.field2680.getGroupCount() > 0 && !VarbitComposition.field2680.tryLoadGroupByName(WorldMapCacheName.field3214.name)) {
									ClientPacket.method6153(100, "Loading world map - " + VarbitComposition.field2680.groupLoadPercentByName(WorldMapCacheName.field3214.name) / 10 + "%");
								} else {
									if (class219.worldMap == null) {
										class219.worldMap = new WorldMap();
										class219.worldMap.init(VarbitComposition.field2680, class33.field152, FriendsChat.field4909, WorldMapLabelSize.fontBold12, Client.fontsMap, BufferedSource.mapSceneSprites);
									}

									ClientPacket.method6153(100, "Loaded world map");
									if (class380.field4407) {
										GameBuild.method7155(class94.field1158);
									} else {
										GameBuild.method7155(class94.field1155);
									}

									Client.field516 = false;
								}
							} else {
								if (Client.field779 == class94.field1158) {
									class155.field1718 = false;
									UserComparator3.updateGameState(20);
									SoundSystem.updateLoginState(LoginState.READ_ACCOUNT_INFO_PACKET_SIZE);
								}

							}
						} else {
							var22 = 0;
							var37 = var22 + WorldView.field1305.percentage() * 5 / 100;
							var37 += LoginScreenAnimation.field1281.percentage() * 2 / 100;
							var37 += SoundSystem.archive2.percentage() / 100;
							var37 += class60.archive4.percentage() / 100;
							var37 += ClientPreferences.archive9.percentage() * 10 / 100;
							var37 += KeyHandler.field100.percentage() * 65 / 100;
							var37 += Tile.field1936.percentage() / 100;
							var37 += Occluder.field2111.percentage() / 100;
							var37 += RestClientThreadFactory.archive12.percentage() * 6 / 100;
							var37 += VarbitComposition.field2680.percentage() / 100;
							var37 += class33.field152.percentage() * 2 / 100;
							var37 += FriendsChat.field4909.percentage() * 2 / 100;
							var37 += class249.field2637.percentage() / 100;
							var37 += field11.percentage() / 100;
							var37 += ClientPacket.field3331.method7194() && ClientPacket.field3331.isFullyLoaded() ? 1 : 0;
							if (var37 != 100) {
								if (var37 != 0) {
									ClientPacket.method6153(30, "Checking for updates - " + var37 + "%");
								}

							} else {
								class130.method3131(WorldView.field1305, "Animations");
								class130.method3131(LoginScreenAnimation.field1281, "Skeletons");
								class130.method3131(ClientPreferences.archive9, "Maps");
								class130.method3131(KeyHandler.field100, "Models");
								class130.method3131(Occluder.field2111, "Music Jingles");
								class130.method3131(VarbitComposition.field2680, "World Map");
								class130.method3131(class33.field152, "World Map Geography");
								class130.method3131(FriendsChat.field4909, "World Map Ground");
								class276.field3003 = new GraphicsDefaults();
								class276.field3003.decode(ClientPacket.field3331);
								ClientPacket.method6153(30, "Loaded update list");
								GameBuild.method7155(class94.field1153);
							}
						}
					}
				}
			}
		}
	}
}
