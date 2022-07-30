import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("gf")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("HitSplatDefinition_archive")
	static AbstractArchive HitSplatDefinition_archive;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Llc;")
	static AbstractArchive field2017;

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lia;")
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached = new EvictingDualNodeHashTable(64);

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lia;")
	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64);

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lia;")
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20);

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = -447025333)
	@Export("fontId")
	int fontId = -1;

	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = -165263255)
	@Export("textColor")
	public int textColor = 16777215;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = -415270105)
	public int field2014 = 70;

	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = -1228261471)
	int field2015 = -1;

	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = -1563829945)
	int field2016 = -1;

	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = -451727261)
	int field2023 = -1;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = -1479003505)
	int field2018 = -1;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = -1205062523)
	public int field2019 = 0;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -1272409313)
	public int field2021 = 0;

	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = 1577848177)
	public int field2025 = -1;

	@ObfuscatedName("e")
	String field2022 = "";

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 355377753)
	public int field2007 = -1;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = -2108810599)
	public int field2024 = 0;

	@ObfuscatedName("r")
	@Export("transforms")
	public int[] transforms;

	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = -1684933833)
	@Export("transformVarbit")
	int transformVarbit = -1;

	@ObfuscatedName("ag")
	@ObfuscatedGetter(intValue = -1631680875)
	@Export("transformVarp")
	int transformVarp = -1;

	HitSplatDefinition() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Lqw;I)V", garbageValue = "1178176274")
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(Lqw;II)V", garbageValue = "-2044843073")
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.readNullableLargeSmart();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field2015 = var1.readNullableLargeSmart();
		} else if (var2 == 4) {
			this.field2023 = var1.readNullableLargeSmart();
		} else if (var2 == 5) {
			this.field2016 = var1.readNullableLargeSmart();
		} else if (var2 == 6) {
			this.field2018 = var1.readNullableLargeSmart();
		} else if (var2 == 7) {
			this.field2019 = var1.readShort();
		} else if (var2 == 8) {
			this.field2022 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field2014 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field2021 = var1.readShort();
		} else if (var2 == 11) {
			this.field2025 = 0;
		} else if (var2 == 12) {
			this.field2007 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field2024 = var1.readShort();
		} else if (var2 == 14) {
			this.field2025 = var1.readUnsignedShort();
		} else if (var2 == 17 || var2 == 18) {
			this.transformVarbit = var1.readUnsignedShort();
			if (this.transformVarbit == 65535) {
				this.transformVarbit = -1;
			}
			this.transformVarp = var1.readUnsignedShort();
			if (this.transformVarp == 65535) {
				this.transformVarp = -1;
			}
			int var3 = -1;
			if (var2 == 18) {
				var3 = var1.readUnsignedShort();
				if (var3 == 65535) {
					var3 = -1;
				}
			}
			int var4 = var1.readUnsignedByte();
			this.transforms = new int[var4 + 2];
			for (int var5 = 0; var5 <= var4; ++var5) {
				this.transforms[var5] = var1.readUnsignedShort();
				if (this.transforms[var5] == 65535) {
					this.transforms[var5] = -1;
				}
			}
			this.transforms[var4 + 1] = var3;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)Lgf;", garbageValue = "-1530642645")
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = class271.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}
		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}
		return var2 != -1 ? GrandExchangeOfferOwnWorldComparator.method1095(var2) : null;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(II)Ljava/lang/String;", garbageValue = "1562496023")
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2022;
		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}
			var2 = var2.substring(0, var3) + ModeWhere.intToString(var1, false) + var2.substring(var3 + 2);
		} 
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(I)Lqj;", garbageValue = "-1581395475")
	public SpritePixels method3630() {
		if (this.field2015 < 0) {
			return null;
		} else {
			SpritePixels var1 = ((SpritePixels) (HitSplatDefinition_cachedSprites.get(((long) (this.field2015)))));
			if (var1 != null) {
				return var1;
			} else {
				var1 = SoundSystem.SpriteBuffer_getSprite(field2017, this.field2015, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, ((long) (this.field2015)));
				}
				return var1;
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(I)Lqj;", garbageValue = "-1122708350")
	public SpritePixels method3607() {
		if (this.field2016 < 0) {
			return null;
		} else {
			SpritePixels var1 = ((SpritePixels) (HitSplatDefinition_cachedSprites.get(((long) (this.field2016)))));
			if (var1 != null) {
				return var1;
			} else {
				var1 = SoundSystem.SpriteBuffer_getSprite(field2017, this.field2016, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, ((long) (this.field2016)));
				}
				return var1;
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(I)Lqj;", garbageValue = "1734967846")
	public SpritePixels method3608() {
		if (this.field2023 < 0) {
			return null;
		} else {
			SpritePixels var1 = ((SpritePixels) (HitSplatDefinition_cachedSprites.get(((long) (this.field2023)))));
			if (var1 != null) {
				return var1;
			} else {
				var1 = SoundSystem.SpriteBuffer_getSprite(field2017, this.field2023, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, ((long) (this.field2023)));
				}
				return var1;
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(I)Lqj;", garbageValue = "2040345171")
	public SpritePixels method3609() {
		if (this.field2018 < 0) {
			return null;
		} else {
			SpritePixels var1 = ((SpritePixels) (HitSplatDefinition_cachedSprites.get(((long) (this.field2018)))));
			if (var1 != null) {
				return var1;
			} else {
				var1 = SoundSystem.SpriteBuffer_getSprite(field2017, this.field2018, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, ((long) (this.field2018)));
				}
				return var1;
			}
		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(B)Lmx;", garbageValue = "-7")
	@Export("getFont")
	public Font getFont() {
		if (this.fontId == -1) {
			return null;
		} else {
			Font var1 = ((Font) (HitSplatDefinition_cachedFonts.get(((long) (this.fontId)))));
			if (var1 != null) {
				return var1;
			} else {
				AbstractArchive var3 = field2017;
				AbstractArchive var4 = class290.HitSplatDefinition_fontsArchive;
				int var5 = this.fontId;
				byte[] var7 = var3.takeFile(var5, 0);
				boolean var6;
				if (var7 == null) {
					var6 = false;
				} else {
					class83.SpriteBuffer_decode(var7);
					var6 = true;
				}
				Font var2;
				if (!var6) {
					var2 = null;
				} else {
					var2 = class14.method182(var4.takeFile(var5, 0));
				}
				if (var2 != null) {
					HitSplatDefinition_cachedFonts.put(var2, ((long) (this.fontId)));
				}
				return var2;
			}
		}
	}

	@ObfuscatedName("fy")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "105")
	@Export("load")
	static void load() {
		int var19;
		if (Client.titleLoadingStage == 0) {
			Decimator.scene = new Scene(4, 104, 104, Tiles.Tiles_heights);
			for (var19 = 0; var19 < 4; ++var19) {
				Client.collisionMaps[var19] = new CollisionMap(104, 104);
			}
			SceneTilePaint.sceneMinimapSprite = new SpritePixels(512, 512);
			Login.Login_loadingText = "Starting game engine...";
			Login.Login_loadingPercent = 5;
			Client.titleLoadingStage = 20;
		} else if (Client.titleLoadingStage == 20) {
			Login.Login_loadingText = "Prepared visibility map";
			Login.Login_loadingPercent = 10;
			Client.titleLoadingStage = 30;
		} else if (Client.titleLoadingStage == 30) {
			Calendar.archive5 = MusicPatch.newArchive(0, false, true, true, false);
			Calendar.field3297 = MusicPatch.newArchive(1, false, true, true, false);
			class20.archive2 = MusicPatch.newArchive(2, true, false, true, false);
			Skills.archive7 = MusicPatch.newArchive(3, false, true, true, false);
			WorldMapArchiveLoader.archive4 = MusicPatch.newArchive(4, false, true, true, false);
			class21.archive9 = MusicPatch.newArchive(5, true, true, true, false);
			MouseHandler.archive6 = MusicPatch.newArchive(6, true, true, true, false);
			TaskHandler.archive11 = MusicPatch.newArchive(7, false, true, true, false);
			AbstractWorldMapData.archive8 = MusicPatch.newArchive(8, false, true, true, false);
			class293.field3349 = MusicPatch.newArchive(9, false, true, true, false);
			Actor.archive10 = MusicPatch.newArchive(10, false, true, true, false);
			WorldMapRegion.field2708 = MusicPatch.newArchive(11, false, true, true, false);
			class117.archive12 = MusicPatch.newArchive(12, false, true, true, false);
			class1.archive13 = MusicPatch.newArchive(13, true, false, true, false);
			InvDefinition.archive14 = MusicPatch.newArchive(14, false, true, true, false);
			WorldMapRegion.archive15 = MusicPatch.newArchive(15, false, true, true, false);
			class155.archive17 = MusicPatch.newArchive(17, true, true, true, false);
			class174.archive18 = MusicPatch.newArchive(18, false, true, true, false);
			GrandExchangeOffer.archive19 = MusicPatch.newArchive(19, false, true, true, false);
			ClanSettings.archive20 = MusicPatch.newArchive(20, false, true, true, false);
			BuddyRankComparator.field1380 = MusicPatch.newArchive(21, false, true, true, true);
			Login.Login_loadingText = "Connecting to update server";
			Login.Login_loadingPercent = 20;
			Client.titleLoadingStage = 40;
		} else if (Client.titleLoadingStage != 40) {
			Archive var2;
			Archive var22;
			Archive var30;
			if (Client.titleLoadingStage == 45) {
				class258.method5186(22050, !Client.isLowDetail, 2);
				MidiPcmStream var28 = new MidiPcmStream();
				var28.method5277(9, 128);
				class192.pcmPlayer0 = MusicPatch.method5443(GameEngine.taskHandler, 0, 22050);
				class192.pcmPlayer0.setStream(var28);
				var30 = WorldMapRegion.archive15;
				var2 = InvDefinition.archive14;
				var22 = WorldMapArchiveLoader.archive4;
				class273.musicPatchesArchive = var30;
				class273.musicSamplesArchive = var2;
				class329.soundEffectsArchive = var22;
				class273.midiPcmStream = var28;
				SequenceDefinition.pcmPlayer1 = MusicPatch.method5443(GameEngine.taskHandler, 1, 2048);
				StructComposition.pcmStreamMixer = new PcmStreamMixer();
				SequenceDefinition.pcmPlayer1.setStream(StructComposition.pcmStreamMixer);
				Tiles.decimator = new Decimator(22050, class301.field3595);
				Login.Login_loadingText = "Prepared sound engine";
				Login.Login_loadingPercent = 35;
				Client.titleLoadingStage = 50;
				class136.WorldMapElement_fonts = new Fonts(AbstractWorldMapData.archive8, class1.archive13);
			} else {
				int var20;
				if (Client.titleLoadingStage == 50) {
					FontName[] var27 = new FontName[]{ FontName.FontName_plain12, FontName.FontName_plain11, FontName.FontName_verdana13, FontName.FontName_verdana11, FontName.FontName_verdana15, FontName.FontName_bold12 };
					var20 = var27.length;
					Fonts var29 = class136.WorldMapElement_fonts;
					FontName[] var33 = new FontName[]{ FontName.FontName_plain12, FontName.FontName_plain11, FontName.FontName_verdana13, FontName.FontName_verdana11, FontName.FontName_verdana15, FontName.FontName_bold12 };
					Client.fontsMap = var29.createMap(var33);
					if (Client.fontsMap.size() < var20) {
						Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var20 + "%";
						Login.Login_loadingPercent = 40;
					} else {
						class116.fontPlain11 = ((Font) (Client.fontsMap.get(FontName.FontName_plain11)));
						class149.fontPlain12 = ((Font) (Client.fontsMap.get(FontName.FontName_plain12)));
						class116.fontBold12 = ((Font) (Client.fontsMap.get(FontName.FontName_bold12)));
						class92.platformInfo = Client.platformInfoProvider.get();
						Login.Login_loadingText = "Loaded fonts";
						Login.Login_loadingPercent = 40;
						Client.titleLoadingStage = 60;
					}
				} else {
					int var3;
					int var32;
					if (Client.titleLoadingStage == 60) {
						var30 = Actor.archive10;
						var2 = AbstractWorldMapData.archive8;
						var3 = 0;
						String[] var34 = Login.field930;
						int var24;
						String var25;
						for (var24 = 0; var24 < var34.length; ++var24) {
							var25 = var34[var24];
							if (var30.tryLoadFileByNames(var25, "")) {
								++var3;
							}
						}
						var34 = Login.field907;
						for (var24 = 0; var24 < var34.length; ++var24) {
							var25 = var34[var24];
							if (var2.tryLoadFileByNames(var25, "")) {
								++var3;
							}
						}
						var32 = FaceNormal.method4303();
						if (var3 < var32) {
							Login.Login_loadingText = "Loading title screen - " + var3 * 100 / var32 + "%";
							Login.Login_loadingPercent = 50;
						} else {
							Login.Login_loadingText = "Loaded title screen";
							Login.Login_loadingPercent = 50;
							class82.updateGameState(5);
							Client.titleLoadingStage = 70;
						}
					} else if (Client.titleLoadingStage == 70) {
						if (!class20.archive2.isFullyLoaded()) {
							Login.Login_loadingText = "Loading config - " + class20.archive2.loadPercent() + "%";
							Login.Login_loadingPercent = 60;
						} else if (!BuddyRankComparator.field1380.isFullyLoaded()) {
							Login.Login_loadingText = "Loading config - " + (80 + class117.archive12.loadPercent() / 6) + "%";
							Login.Login_loadingPercent = 60;
						} else {
							class434.method7615(class20.archive2);
							class291.method5561(class20.archive2);
							Archive var26 = class20.archive2;
							var30 = TaskHandler.archive11;
							KitDefinition.KitDefinition_archive = var26;
							KitDefinition.KitDefinition_modelsArchive = var30;
							KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
							AbstractByteArrayCopier.method5501(class20.archive2, TaskHandler.archive11, Client.isLowDetail);
							var2 = class20.archive2;
							var22 = TaskHandler.archive11;
							NPCComposition.NpcDefinition_archive = var2;
							NPCComposition.NpcDefinition_modelArchive = var22;
							UserComparator4.method2655(class20.archive2);
							Archive var23 = class20.archive2;
							Archive var31 = TaskHandler.archive11;
							boolean var6 = Client.isMembersWorld;
							Font var7 = class116.fontPlain11;
							ItemComposition.ItemDefinition_archive = var23;
							ItemComposition.ItemDefinition_modelArchive = var31;
							ItemComposition.ItemDefinition_inMembersWorld = var6;
							Buddy.ItemDefinition_fileCount = ItemComposition.ItemDefinition_archive.getGroupFileCount(10);
							class341.ItemDefinition_fontPlain11 = var7;
							Archive var8 = class20.archive2;
							Archive var9 = Calendar.archive5;
							Archive var10 = Calendar.field3297;
							class343.SequenceDefinition_archive = var8;
							SequenceDefinition.SequenceDefinition_animationsArchive = var9;
							SequenceDefinition.SequenceDefinition_skeletonsArchive = var10;
							ClientPreferences.method2400(class20.archive2, TaskHandler.archive11);
							Archive var11 = class20.archive2;
							VarbitComposition.VarbitDefinition_archive = var11;
							class93.method2463(class20.archive2);
							Archive var12 = Skills.archive7;
							Archive var13 = TaskHandler.archive11;
							Archive var14 = AbstractWorldMapData.archive8;
							Archive var15 = class1.archive13;
							class228.Widget_archive = var12;
							class7.Widget_modelsArchive = var13;
							class192.Widget_spritesArchive = var14;
							JagexCache.Widget_fontsArchive = var15;
							Widget.Widget_interfaceComponents = new Widget[class228.Widget_archive.getGroupCount()][];
							GameObject.Widget_loadedInterfaces = new boolean[class228.Widget_archive.getGroupCount()];
							class162.method3284(class20.archive2);
							class120.method2822(class20.archive2);
							class92.method2442(class20.archive2);
							UserComparator8.method2664(class20.archive2);
							Client.method1321(class20.archive2);
							Archive var16 = class20.archive2;
							DbTableType.field4682 = var16;
							class118.method2810(class20.archive2);
							class398.HitSplatDefinition_cachedSprites = new class428(AbstractByteArrayCopier.field3293, 54, class21.clientLanguage, class20.archive2);
							class6.HitSplatDefinition_cached = new class428(AbstractByteArrayCopier.field3293, 47, class21.clientLanguage, class20.archive2);
							class151.varcs = new Varcs();
							class29.method394(class20.archive2, AbstractWorldMapData.archive8, class1.archive13);
							Archive var17 = class20.archive2;
							Archive var18 = AbstractWorldMapData.archive8;
							HealthBarDefinition.HealthBarDefinition_archive = var17;
							HealthBarDefinition.field1867 = var18;
							PendingSpawn.method2250(class20.archive2, AbstractWorldMapData.archive8);
							Login.Login_loadingText = "Loaded config";
							Login.Login_loadingPercent = 60;
							Client.titleLoadingStage = 80;
						}
					} else if (Client.titleLoadingStage == 80) {
						var19 = 0;
						if (class21.compass == null) {
							class21.compass = SoundSystem.SpriteBuffer_getSprite(AbstractWorldMapData.archive8, class340.spriteIds.compass, 0);
						} else {
							++var19;
						}
						if (LoginPacket.redHintArrowSprite == null) {
							LoginPacket.redHintArrowSprite = SoundSystem.SpriteBuffer_getSprite(AbstractWorldMapData.archive8, class340.spriteIds.field4378, 0);
						} else {
							++var19;
						}
						IndexedSprite[] var1;
						boolean var4;
						byte[] var5;
						if (class270.mapSceneSprites == null) {
							var2 = AbstractWorldMapData.archive8;
							var3 = class340.spriteIds.mapScenes;
							var5 = var2.takeFile(var3, 0);
							if (var5 == null) {
								var4 = false;
							} else {
								class83.SpriteBuffer_decode(var5);
								var4 = true;
							}
							if (!var4) {
								var1 = null;
							} else {
								var1 = class389.method7083();
							}
							class270.mapSceneSprites = var1;
						} else {
							++var19;
						}
						if (class11.headIconPkSprites == null) {
							class11.headIconPkSprites = NPC.method2434(AbstractWorldMapData.archive8, class340.spriteIds.headIconsPk, 0);
						} else {
							++var19;
						}
						if (DirectByteArrayCopier.headIconPrayerSprites == null) {
							DirectByteArrayCopier.headIconPrayerSprites = NPC.method2434(AbstractWorldMapData.archive8, class340.spriteIds.field4381, 0);
						} else {
							++var19;
						}
						if (class92.headIconHintSprites == null) {
							class92.headIconHintSprites = NPC.method2434(AbstractWorldMapData.archive8, class340.spriteIds.field4388, 0);
						} else {
							++var19;
						}
						if (WorldMapSection2.mapMarkerSprites == null) {
							WorldMapSection2.mapMarkerSprites = NPC.method2434(AbstractWorldMapData.archive8, class340.spriteIds.field4377, 0);
						} else {
							++var19;
						}
						if (MouseHandler.crossSprites == null) {
							MouseHandler.crossSprites = NPC.method2434(AbstractWorldMapData.archive8, class340.spriteIds.field4384, 0);
						} else {
							++var19;
						}
						if (class65.mapDotSprites == null) {
							class65.mapDotSprites = NPC.method2434(AbstractWorldMapData.archive8, class340.spriteIds.field4383, 0);
						} else {
							++var19;
						}
						if (MusicPatchNode2.scrollBarSprites == null) {
							var2 = AbstractWorldMapData.archive8;
							var3 = class340.spriteIds.field4386;
							var5 = var2.takeFile(var3, 0);
							if (var5 == null) {
								var4 = false;
							} else {
								class83.SpriteBuffer_decode(var5);
								var4 = true;
							}
							if (!var4) {
								var1 = null;
							} else {
								var1 = class389.method7083();
							}
							MusicPatchNode2.scrollBarSprites = var1;
						} else {
							++var19;
						}
						if (class343.modIconSprites == null) {
							var2 = AbstractWorldMapData.archive8;
							var3 = class340.spriteIds.field4385;
							var5 = var2.takeFile(var3, 0);
							if (var5 == null) {
								var4 = false;
							} else {
								class83.SpriteBuffer_decode(var5);
								var4 = true;
							}
							if (!var4) {
								var1 = null;
							} else {
								var1 = class389.method7083();
							}
							class343.modIconSprites = var1;
						} else {
							++var19;
						}
						if (var19 < 11) {
							Login.Login_loadingText = "Loading sprites - " + var19 * 100 / 12 + "%";
							Login.Login_loadingPercent = 70;
						} else {
							AbstractFont.AbstractFont_modIconSprites = class343.modIconSprites;
							LoginPacket.redHintArrowSprite.normalize();
							var20 = ((int) (Math.random() * 21.0)) - 10;
							int var21 = ((int) (Math.random() * 21.0)) - 10;
							var3 = ((int) (Math.random() * 21.0)) - 10;
							var32 = ((int) (Math.random() * 41.0)) - 20;
							class270.mapSceneSprites[0].shiftColors(var20 + var32, var21 + var32, var32 + var3);
							Login.Login_loadingText = "Loaded sprites";
							Login.Login_loadingPercent = 70;
							Client.titleLoadingStage = 90;
						}
					} else if (Client.titleLoadingStage == 90) {
						if (!class293.field3349.isFullyLoaded()) {
							Login.Login_loadingText = "Loading textures - " + "0%";
							Login.Login_loadingPercent = 90;
						} else {
							UrlRequest.textureProvider = new TextureProvider(class293.field3349, AbstractWorldMapData.archive8, 20, class260.clientPreferences.method2323(), Client.isLowDetail ? 64 : 128);
							Rasterizer3D.Rasterizer3D_setTextureLoader(UrlRequest.textureProvider);
							Rasterizer3D.Rasterizer3D_setBrightness(class260.clientPreferences.method2323());
							Client.titleLoadingStage = 100;
						}
					} else if (Client.titleLoadingStage == 100) {
						var19 = UrlRequest.textureProvider.getLoadedPercentage();
						if (var19 < 100) {
							Login.Login_loadingText = "Loading textures - " + var19 + "%";
							Login.Login_loadingPercent = 90;
						} else {
							Login.Login_loadingText = "Loaded textures";
							Login.Login_loadingPercent = 90;
							Client.titleLoadingStage = 110;
						}
					} else if (Client.titleLoadingStage == 110) {
						class309.mouseRecorder = new MouseRecorder();
						GameEngine.taskHandler.newThreadTask(class309.mouseRecorder, 10);
						Login.Login_loadingText = "Loaded input handler";
						Login.Login_loadingPercent = 92;
						Client.titleLoadingStage = 120;
					} else if (Client.titleLoadingStage == 120) {
						if (!Actor.archive10.tryLoadFileByNames("huffman", "")) {
							Login.Login_loadingText = "Loading wordpack - " + 0 + "%";
							Login.Login_loadingPercent = 94;
						} else {
							Huffman var0 = new Huffman(Actor.archive10.takeFileByNames("huffman", ""));
							class18.huffman = var0;
							Login.Login_loadingText = "Loaded wordpack";
							Login.Login_loadingPercent = 94;
							Client.titleLoadingStage = 130;
						}
					} else if (Client.titleLoadingStage == 130) {
						if (!Skills.archive7.isFullyLoaded()) {
							Login.Login_loadingText = "Loading interfaces - " + Skills.archive7.loadPercent() * 4 / 5 + "%";
							Login.Login_loadingPercent = 96;
						} else if (!class117.archive12.isFullyLoaded()) {
							Login.Login_loadingText = "Loading interfaces - " + (80 + class117.archive12.loadPercent() / 6) + "%";
							Login.Login_loadingPercent = 96;
						} else if (!class1.archive13.isFullyLoaded()) {
							Login.Login_loadingText = "Loading interfaces - " + (96 + class1.archive13.loadPercent() / 50) + "%";
							Login.Login_loadingPercent = 96;
						} else {
							Login.Login_loadingText = "Loaded interfaces";
							Login.Login_loadingPercent = 98;
							Client.titleLoadingStage = 140;
						}
					} else if (Client.titleLoadingStage == 140) {
						Login.Login_loadingPercent = 100;
						if (!GrandExchangeOffer.archive19.tryLoadGroupByName(WorldMapCacheName.field2867.name)) {
							Login.Login_loadingText = "Loading world map - " + GrandExchangeOffer.archive19.groupLoadPercentByName(WorldMapCacheName.field2867.name) / 10 + "%";
						} else {
							if (class344.worldMap == null) {
								class344.worldMap = new WorldMap();
								class344.worldMap.init(GrandExchangeOffer.archive19, class174.archive18, ClanSettings.archive20, class116.fontBold12, Client.fontsMap, class270.mapSceneSprites);
							}
							Login.Login_loadingText = "Loaded world map";
							Client.titleLoadingStage = 150;
						}
					} else if (Client.titleLoadingStage == 150) {
						class82.updateGameState(10);
					}
				}
			}
		} else {
			var19 = 0;
			var19 += Calendar.archive5.percentage() * 4 / 100;
			var19 += Calendar.field3297.percentage() * 4 / 100;
			var19 += class20.archive2.percentage() * 2 / 100;
			var19 += Skills.archive7.percentage() * 2 / 100;
			var19 += WorldMapArchiveLoader.archive4.percentage() * 6 / 100;
			var19 += class21.archive9.percentage() * 4 / 100;
			var19 += MouseHandler.archive6.percentage() * 2 / 100;
			var19 += TaskHandler.archive11.percentage() * 55 / 100;
			var19 += AbstractWorldMapData.archive8.percentage() * 2 / 100;
			var19 += class293.field3349.percentage() * 2 / 100;
			var19 += Actor.archive10.percentage() * 2 / 100;
			var19 += WorldMapRegion.field2708.percentage() * 2 / 100;
			var19 += class117.archive12.percentage() * 2 / 100;
			var19 += class1.archive13.percentage() * 2 / 100;
			var19 += InvDefinition.archive14.percentage() * 2 / 100;
			var19 += WorldMapRegion.archive15.percentage() * 2 / 100;
			var19 += GrandExchangeOffer.archive19.percentage() / 100;
			var19 += class174.archive18.percentage() / 100;
			var19 += ClanSettings.archive20.percentage() / 100;
			var19 += BuddyRankComparator.field1380.percentage() / 100;
			var19 += (class155.archive17.method5802() && class155.archive17.isFullyLoaded()) ? 1 : 0;
			if (var19 != 100) {
				if (var19 != 0) {
					Login.Login_loadingText = "Checking for updates - " + var19 + "%";
				}
				Login.Login_loadingPercent = 30;
			} else {
				class29.method395(Calendar.archive5, "Animations");
				class29.method395(Calendar.field3297, "Skeletons");
				class29.method395(WorldMapArchiveLoader.archive4, "Sound FX");
				class29.method395(class21.archive9, "Maps");
				class29.method395(MouseHandler.archive6, "Music Tracks");
				class29.method395(TaskHandler.archive11, "Models");
				class29.method395(AbstractWorldMapData.archive8, "Sprites");
				class29.method395(WorldMapRegion.field2708, "Music Jingles");
				class29.method395(InvDefinition.archive14, "Music Samples");
				class29.method395(WorldMapRegion.archive15, "Music Patches");
				class29.method395(GrandExchangeOffer.archive19, "World Map");
				class29.method395(class174.archive18, "World Map Geography");
				class29.method395(ClanSettings.archive20, "World Map Ground");
				class340.spriteIds = new GraphicsDefaults();
				class340.spriteIds.decode(class155.archive17);
				Login.Login_loadingText = "Loaded update list";
				Login.Login_loadingPercent = 30;
				Client.titleLoadingStage = 45;
			}
		}
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(descriptor = "(IIB)I", garbageValue = "-96")
	static int method3637(int var0, int var1) {
		int var2 = var1 - 334;
		if (var2 < 0) {
			var2 = 0;
		} else if (var2 > 100) {
			var2 = 100;
		}
		int var3 = (Client.zoomWidth - Client.zoomHeight) * var2 / 100 + Client.zoomHeight;
		return var0 * var3 / 256;
	}
}