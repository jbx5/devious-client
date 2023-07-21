import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ik")
@Implements("Skeleton")
public class Skeleton extends Node {
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1860912073
	)
	@Export("id")
	int id;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1969948055
	)
	@Export("count")
	int count;
	@ObfuscatedName("az")
	@Export("transformTypes")
	int[] transformTypes;
	@ObfuscatedName("av")
	@Export("labels")
	int[][] labels;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Liv;"
	)
	class228 field2533;

	public Skeleton(int var1, byte[] var2) {
		this.id = var1;
		Buffer var3 = new Buffer(var2);
		this.count = var3.readUnsignedByte();
		this.transformTypes = new int[this.count];
		this.labels = new int[this.count][];

		int var4;
		for (var4 = 0; var4 < this.count; ++var4) {
			this.transformTypes[var4] = var3.readUnsignedByte();
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			this.labels[var4] = new int[var3.readUnsignedByte()];
		}

		for (var4 = 0; var4 < this.count; ++var4) {
			for (int var5 = 0; var5 < this.labels[var4].length; ++var5) {
				this.labels[var4][var5] = var3.readUnsignedByte();
			}
		}

		if (var3.offset < var3.array.length) {
			var4 = var3.readUnsignedShort();
			if (var4 > 0) {
				this.field2533 = new class228(var3, var4);
			}
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2119821577"
	)
	public int method4554() {
		return this.count;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Liv;",
		garbageValue = "632962128"
	)
	public class228 method4549() {
		return this.field2533;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Z",
		garbageValue = "-442215173"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		return UserComparator10.method2902(var0, 10, true);
	}

	@ObfuscatedName("hz")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "85"
	)
	static void method4557() {
		int var0;
		if (class92.field1144 == Client.field547) {
			UserComparator5.scene = new Scene(4, 104, 104, Tiles.Tiles_heights);

			for (var0 = 0; var0 < 4; ++var0) {
				Client.collisionMaps[var0] = new CollisionMap(104, 104);
			}

			Frames.sceneMinimapSprite = new SpritePixels(512, 512);
			Login.Login_loadingText = "Starting game engine...";
			Login.Login_loadingPercent = 5;
			Client.field547 = class92.field1146;
		} else if (class92.field1146 == Client.field547) {
			Login.Login_loadingText = "Prepared visibility map";
			Login.Login_loadingPercent = 10;
			Client.field547 = class92.field1143;
		} else if (class92.field1143 == Client.field547) {
			class151.field1694 = PendingSpawn.newArchive(0, false, true, true, false);
			TileItem.archive7 = PendingSpawn.newArchive(1, false, true, true, false);
			class197.archive2 = PendingSpawn.newArchive(2, true, false, true, false);
			class253.archive4 = PendingSpawn.newArchive(3, false, true, true, false);
			class149.field1676 = PendingSpawn.newArchive(4, false, true, true, false);
			Canvas.archive9 = PendingSpawn.newArchive(5, true, true, true, false);
			class13.archive6 = PendingSpawn.newArchive(6, true, true, true, false);
			class7.archive11 = PendingSpawn.newArchive(7, false, true, true, false);
			class386.archive8 = PendingSpawn.newArchive(8, false, true, true, false);
			class148.field1670 = PendingSpawn.newArchive(9, false, true, true, false);
			class131.archive10 = PendingSpawn.newArchive(10, false, true, true, false);
			GrandExchangeOfferOwnWorldComparator.field511 = PendingSpawn.newArchive(11, false, true, true, false);
			class126.archive12 = PendingSpawn.newArchive(12, false, true, true, false);
			FontName.archive13 = PendingSpawn.newArchive(13, true, false, true, false);
			ReflectionCheck.field273 = PendingSpawn.newArchive(14, false, true, true, false);
			class191.field1970 = PendingSpawn.newArchive(15, false, true, true, false);
			World.field829 = PendingSpawn.newArchive(17, true, true, true, false);
			class106.field1358 = PendingSpawn.newArchive(18, false, true, true, false);
			Varcs.field1402 = PendingSpawn.newArchive(19, false, true, true, false);
			Interpreter.field885 = PendingSpawn.newArchive(20, false, true, true, false);
			class176.field1852 = PendingSpawn.newArchive(21, false, true, true, true);
			Login.Login_loadingText = "Connecting to update server";
			Login.Login_loadingPercent = 20;
			Client.field547 = class92.field1155;
		} else if (Client.field547 == class92.field1155) {
			byte var47 = 0;
			var0 = var47 + class151.field1694.percentage() * 4 / 100;
			var0 += TileItem.archive7.percentage() * 4 / 100;
			var0 += class197.archive2.percentage() * 2 / 100;
			var0 += class253.archive4.percentage() * 2 / 100;
			var0 += class149.field1676.percentage() * 6 / 100;
			var0 += Canvas.archive9.percentage() * 4 / 100;
			var0 += class13.archive6.percentage() * 2 / 100;
			var0 += class7.archive11.percentage() * 55 / 100;
			var0 += class386.archive8.percentage() * 2 / 100;
			var0 += class148.field1670.percentage() * 2 / 100;
			var0 += class131.archive10.percentage() * 2 / 100;
			var0 += GrandExchangeOfferOwnWorldComparator.field511.percentage() * 2 / 100;
			var0 += class126.archive12.percentage() * 2 / 100;
			var0 += FontName.archive13.percentage() * 2 / 100;
			var0 += ReflectionCheck.field273.percentage() * 2 / 100;
			var0 += class191.field1970.percentage() * 2 / 100;
			var0 += Varcs.field1402.percentage() / 100;
			var0 += class106.field1358.percentage() / 100;
			var0 += Interpreter.field885.percentage() / 100;
			var0 += class176.field1852.percentage() / 100;
			var0 += World.field829.method6723() && World.field829.isFullyLoaded() ? 1 : 0;
			if (var0 != 100) {
				if (var0 != 0) {
					Login.Login_loadingText = "Checking for updates - " + var0 + "%";
				}

				Login.Login_loadingPercent = 30;
			} else {
				class197.method3771(class151.field1694, "Animations");
				class197.method3771(TileItem.archive7, "Skeletons");
				class197.method3771(class149.field1676, "Sound FX");
				class197.method3771(Canvas.archive9, "Maps");
				class197.method3771(class13.archive6, "Music Tracks");
				class197.method3771(class7.archive11, "Models");
				class197.method3771(class386.archive8, "Sprites");
				class197.method3771(GrandExchangeOfferOwnWorldComparator.field511, "Music Jingles");
				class197.method3771(ReflectionCheck.field273, "Music Samples");
				class197.method3771(class191.field1970, "Music Patches");
				class197.method3771(Varcs.field1402, "World Map");
				class197.method3771(class106.field1358, "World Map Geography");
				class197.method3771(Interpreter.field885, "World Map Ground");
				class350.field3888 = new GraphicsDefaults();
				class350.field3888.decode(World.field829);
				Login.Login_loadingText = "Loaded update list";
				Login.Login_loadingPercent = 30;
				Client.field547 = class92.field1145;
			}
		} else {
			int var5;
			if (Client.field547 == class92.field1145) {
				WorldMapRenderer.method5356(22050, !Client.isLowDetail, 2);
				ArrayList var52 = new ArrayList(3);
				TaskHandler var36 = GameEngine.taskHandler;
				short var44 = 2048;
				if (var44 < 256) {
					var44 = 256;
				}

				PcmPlayer var41;
				try {
					PcmPlayer var42 = class309.pcmPlayerProvider.player();
					var42.samples = new int[(class373.PcmPlayer_stereo ? 2 : 1) * 256];
					var42.field304 = var44;
					var42.init();
					var42.capacity = (var44 & -1024) + 1024;
					if (var42.capacity > 16384) {
						var42.capacity = 16384;
					}

					var42.open(var42.capacity);
					if (PlayerCompositionColorTextureOverride.field1886 > 0 && WorldMapSectionType.soundSystem == null) {
						WorldMapSectionType.soundSystem = new SoundSystem();
						class273.soundSystemExecutor = Executors.newScheduledThreadPool(1);
						class273.soundSystemExecutor.scheduleAtFixedRate(WorldMapSectionType.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
					}

					if (WorldMapSectionType.soundSystem != null) {
						if (WorldMapSectionType.soundSystem.players[0] != null) {
							throw new IllegalArgumentException();
						}

						WorldMapSectionType.soundSystem.players[0] = var42;
					}

					var41 = var42;
				} catch (Throwable var34) {
					var41 = new PcmPlayer();
				}

				VerticalAlignment.pcmPlayer1 = var41;
				SecureRandomCallable.pcmStreamMixer = new PcmStreamMixer();
				PcmStreamMixer var43 = new PcmStreamMixer();
				var43.addSubStream(SecureRandomCallable.pcmStreamMixer);

				for (var5 = 0; var5 < 3; ++var5) {
					MidiPcmStream var48 = new MidiPcmStream();
					var48.method5825(9, 128);
					var43.addSubStream(var48);
					var52.add(var48);
				}

				VerticalAlignment.pcmPlayer1.setStream(var43);
				WorldMapCacheName.method5575(class191.field1970, ReflectionCheck.field273, class149.field1676, var52);
				SoundCache.decimator = new Decimator(22050, PcmPlayer.field314);
				Login.Login_loadingText = "Prepared sound engine";
				Login.Login_loadingPercent = 35;
				Client.field547 = class92.field1141;
				Tile.field2504 = new Fonts(class386.archive8, FontName.archive13);
			} else if (Client.field547 == class92.field1141) {
				var0 = FontName.method8739().length;
				Fonts var40 = Tile.field2504;
				FontName[] var35 = new FontName[]{FontName.FontName_verdana15, FontName.FontName_bold12, FontName.FontName_verdana13, FontName.FontName_plain11, FontName.FontName_plain12, FontName.FontName_verdana11};
				Client.fontsMap = var40.createMap(var35);
				if (Client.fontsMap.size() < var0) {
					Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var0 + "%";
					Login.Login_loadingPercent = 40;
				} else {
					ItemComposition.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
					class113.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
					Calendar.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
					NPCComposition.platformInfo = Client.field803.get();
					Login.Login_loadingText = "Loaded fonts";
					Login.Login_loadingPercent = 40;
					Client.field547 = class92.field1147;
				}
			} else {
				Archive var2;
				int var3;
				Archive var37;
				int var54;
				if (class92.field1147 == Client.field547) {
					var37 = class131.archive10;
					var2 = class386.archive8;
					var3 = 0;
					String[] var38 = Login.field919;

					String var46;
					for (var5 = 0; var5 < var38.length; ++var5) {
						var46 = var38[var5];
						if (var37.tryLoadFileByNames(var46, "")) {
							++var3;
						}
					}

					var38 = Login.field954;

					for (var5 = 0; var5 < var38.length; ++var5) {
						var46 = var38[var5];
						if (var2.tryLoadFileByNames(var46, "")) {
							++var3;
						}
					}

					var38 = Login.field934;

					for (var5 = 0; var5 < var38.length; ++var5) {
						var46 = var38[var5];
						if (var2.getGroupId(var46) != -1 && var2.tryLoadFileByNames(var46, "")) {
							++var3;
						}
					}

					var54 = GameBuild.method6651(class386.archive8);
					if (var3 < var54) {
						Login.Login_loadingText = "Loading title screen - " + var3 * 100 / var54 + "%";
						Login.Login_loadingPercent = 50;
					} else {
						Login.Login_loadingText = "Loaded title screen";
						Login.Login_loadingPercent = 50;
						class129.updateGameState(5);
						Client.field547 = class92.field1148;
					}
				} else if (Client.field547 == class92.field1148) {
					if (!class197.archive2.isFullyLoaded()) {
						Login.Login_loadingText = "Loading config - " + class197.archive2.loadPercent() + "%";
						Login.Login_loadingPercent = 60;
					} else if (!class176.field1852.isFullyLoaded()) {
						Login.Login_loadingText = "Loading config - " + (80 + class126.archive12.loadPercent() / 6) + "%";
						Login.Login_loadingPercent = 60;
					} else {
						class149.method3186(class197.archive2);
						Archive var51 = class197.archive2;
						FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var51;
						UserComparator7.method2873(class197.archive2, class7.archive11);
						var37 = class197.archive2;
						var2 = class7.archive11;
						boolean var39 = Client.isLowDetail;
						ObjectComposition.ObjectDefinition_archive = var37;
						ObjectComposition.ObjectDefinition_modelsArchive = var2;
						ObjectComposition.ObjectDefinition_isLowDetail = var39;
						Archive var4 = class197.archive2;
						Archive var53 = class7.archive11;
						IntHashTable.NpcDefinition_archive = var4;
						NPCComposition.field1997 = var53;
						class20.method292(class197.archive2);
						Interpreter.method2070(class197.archive2, class7.archive11, Client.isMembersWorld, ItemComposition.fontPlain11);
						SongTask.method7667(class197.archive2, class151.field1694, TileItem.archive7);
						Archive var45 = class197.archive2;
						Archive var7 = class7.archive11;
						SpotAnimationDefinition.SpotAnimationDefinition_archive = var45;
						class53.SpotAnimationDefinition_modelArchive = var7;
						ReflectionCheck.method697(class197.archive2);
						Archive var49 = class197.archive2;
						VarpDefinition.VarpDefinition_archive = var49;
						VarpDefinition.field1904 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16);
						Archive var9 = class253.archive4;
						Archive var10 = class7.archive11;
						Archive var11 = class386.archive8;
						Archive var12 = FontName.archive13;
						int var13 = 0;
						if (var9 != null) {
							ArchiveLoader.Widget_archive = var9;
							BoundaryObject.field2818 = var10;
							UserComparator10.Widget_spritesArchive = var11;
							WallDecoration.Widget_fontsArchive = var12;
							var13 = ArchiveLoader.Widget_archive.getGroupCount();
						}

						ArchiveLoader.Widget_interfaceComponents = new Widget[var13][];
						Widget.Widget_loadedInterfaces = new boolean[var13];
						Archive var30 = class197.archive2;
						InvDefinition.InvDefinition_archive = var30;
						Archive var14 = class197.archive2;
						EnumComposition.EnumDefinition_archive = var14;
						Archive var15 = class197.archive2;
						VarcInt.VarcInt_archive = var15;
						Archive var16 = class197.archive2;
						Archive var17 = class197.archive2;
						ParamComposition.ParamDefinition_archive = var17;
						StartSongTask.method7637(class197.archive2);
						Language.method6993(class197.archive2);
						class293.HitSplatDefinition_cachedSprites = new class498(KeyHandler.field138, 54, Interpreter.clientLanguage, class197.archive2);
						class344.HitSplatDefinition_cached = new class498(KeyHandler.field138, 47, Interpreter.clientLanguage, class197.archive2);
						PendingSpawn.varcs = new Varcs();
						Archive var18 = class197.archive2;
						Archive var19 = class386.archive8;
						Archive var20 = FontName.archive13;
						HitSplatDefinition.HitSplatDefinition_archive = var18;
						class387.field4438 = var19;
						HitSplatDefinition.HitSplatDefinition_fontsArchive = var20;
						Archive var21 = class197.archive2;
						Archive var22 = class386.archive8;
						HealthBarDefinition.HealthBarDefinition_archive = var21;
						HealthBarDefinition.field1954 = var22;
						Archive var23 = class197.archive2;
						Archive var24 = class386.archive8;
						WorldMapElement.WorldMapElement_archive = var24;
						if (var23.isFullyLoaded()) {
							Decimator.WorldMapElement_count = var23.getGroupFileCount(35);
							class335.WorldMapElement_cached = new WorldMapElement[Decimator.WorldMapElement_count];

							for (int var25 = 0; var25 < Decimator.WorldMapElement_count; ++var25) {
								byte[] var26 = var23.takeFile(35, var25);
								class335.WorldMapElement_cached[var25] = new WorldMapElement(var25);
								if (var26 != null) {
									class335.WorldMapElement_cached[var25].decode(new Buffer(var26));
									class335.WorldMapElement_cached[var25].method3612();
								}
							}
						}

						Login.Login_loadingText = "Loaded config";
						Login.Login_loadingPercent = 60;
						Client.field547 = class92.field1151;
					}
				} else if (Client.field547 == class92.field1151) {
					var0 = 0;
					if (class10.compass == null) {
						class10.compass = WorldMap.SpriteBuffer_getSprite(class386.archive8, class350.field3888.field4715, 0);
					} else {
						++var0;
					}

					if (SoundCache.redHintArrowSprite == null) {
						SoundCache.redHintArrowSprite = WorldMap.SpriteBuffer_getSprite(class386.archive8, class350.field3888.field4708, 0);
					} else {
						++var0;
					}

					IndexedSprite[] var1;
					IndexedSprite[] var6;
					IndexedSprite var8;
					boolean var28;
					byte[] var29;
					int var31;
					if (class282.mapSceneSprites == null) {
						var2 = class386.archive8;
						var3 = class350.field3888.field4709;
						var29 = var2.takeFile(var3, 0);
						if (var29 == null) {
							var28 = false;
						} else {
							VarbitComposition.SpriteBuffer_decode(var29);
							var28 = true;
						}

						if (!var28) {
							var1 = null;
						} else {
							var6 = new IndexedSprite[class528.SpriteBuffer_spriteCount];

							for (var31 = 0; var31 < class528.SpriteBuffer_spriteCount; ++var31) {
								var8 = var6[var31] = new IndexedSprite();
								var8.width = class528.SpriteBuffer_spriteWidth;
								var8.height = class528.SpriteBuffer_spriteHeight;
								var8.xOffset = class492.SpriteBuffer_xOffsets[var31];
								var8.yOffset = class134.SpriteBuffer_yOffsets[var31];
								var8.subWidth = class172.SpriteBuffer_spriteWidths[var31];
								var8.subHeight = class528.SpriteBuffer_spriteHeights[var31];
								var8.palette = class528.SpriteBuffer_spritePalette;
								var8.pixels = ArchiveDiskAction.SpriteBuffer_pixels[var31];
							}

							DbTableType.method8985();
							var1 = var6;
						}

						class282.mapSceneSprites = var1;
					} else {
						++var0;
					}

					if (DbTableType.headIconPkSprites == null) {
						DbTableType.headIconPkSprites = class453.method8339(class386.archive8, class350.field3888.field4710, 0);
					} else {
						++var0;
					}

					if (class17.headIconPrayerSprites == null) {
						class17.headIconPrayerSprites = class453.method8339(class386.archive8, class350.field3888.field4712, 0);
					} else {
						++var0;
					}

					if (class345.headIconHintSprites == null) {
						class345.headIconHintSprites = class453.method8339(class386.archive8, class350.field3888.field4707, 0);
					} else {
						++var0;
					}

					if (DynamicObject.field1014 == null) {
						DynamicObject.field1014 = class453.method8339(class386.archive8, class350.field3888.field4713, 0);
					} else {
						++var0;
					}

					if (class211.crossSprites == null) {
						class211.crossSprites = class453.method8339(class386.archive8, class350.field3888.field4714, 0);
					} else {
						++var0;
					}

					if (MusicPatchNode2.mapDotSprites == null) {
						MusicPatchNode2.mapDotSprites = class453.method8339(class386.archive8, class350.field3888.field4711, 0);
					} else {
						++var0;
					}

					if (class302.scrollBarSprites == null) {
						var2 = class386.archive8;
						var3 = class350.field3888.field4716;
						var29 = var2.takeFile(var3, 0);
						if (var29 == null) {
							var28 = false;
						} else {
							VarbitComposition.SpriteBuffer_decode(var29);
							var28 = true;
						}

						if (!var28) {
							var1 = null;
						} else {
							var6 = new IndexedSprite[class528.SpriteBuffer_spriteCount];

							for (var31 = 0; var31 < class528.SpriteBuffer_spriteCount; ++var31) {
								var8 = var6[var31] = new IndexedSprite();
								var8.width = class528.SpriteBuffer_spriteWidth;
								var8.height = class528.SpriteBuffer_spriteHeight;
								var8.xOffset = class492.SpriteBuffer_xOffsets[var31];
								var8.yOffset = class134.SpriteBuffer_yOffsets[var31];
								var8.subWidth = class172.SpriteBuffer_spriteWidths[var31];
								var8.subHeight = class528.SpriteBuffer_spriteHeights[var31];
								var8.palette = class528.SpriteBuffer_spritePalette;
								var8.pixels = ArchiveDiskAction.SpriteBuffer_pixels[var31];
							}

							DbTableType.method8985();
							var1 = var6;
						}

						class302.scrollBarSprites = var1;
					} else {
						++var0;
					}

					if (AbstractWorldMapIcon.field3044 == null) {
						var2 = class386.archive8;
						var3 = class350.field3888.field4717;
						var29 = var2.takeFile(var3, 0);
						if (var29 == null) {
							var28 = false;
						} else {
							VarbitComposition.SpriteBuffer_decode(var29);
							var28 = true;
						}

						if (!var28) {
							var1 = null;
						} else {
							var6 = new IndexedSprite[class528.SpriteBuffer_spriteCount];

							for (var31 = 0; var31 < class528.SpriteBuffer_spriteCount; ++var31) {
								var8 = var6[var31] = new IndexedSprite();
								var8.width = class528.SpriteBuffer_spriteWidth;
								var8.height = class528.SpriteBuffer_spriteHeight;
								var8.xOffset = class492.SpriteBuffer_xOffsets[var31];
								var8.yOffset = class134.SpriteBuffer_yOffsets[var31];
								var8.subWidth = class172.SpriteBuffer_spriteWidths[var31];
								var8.subHeight = class528.SpriteBuffer_spriteHeights[var31];
								var8.palette = class528.SpriteBuffer_spritePalette;
								var8.pixels = ArchiveDiskAction.SpriteBuffer_pixels[var31];
							}

							DbTableType.method8985();
							var1 = var6;
						}

						AbstractWorldMapIcon.field3044 = var1;
					} else {
						++var0;
					}

					if (var0 < 11) {
						Login.Login_loadingText = "Loading sprites - " + var0 * 100 / 12 + "%";
						Login.Login_loadingPercent = 70;
					} else {
						AbstractFont.AbstractFont_modIconSprites = AbstractWorldMapIcon.field3044;
						SoundCache.redHintArrowSprite.normalize();
						int var32 = (int)(Math.random() * 21.0D) - 10;
						int var33 = (int)(Math.random() * 21.0D) - 10;
						var3 = (int)(Math.random() * 21.0D) - 10;
						var54 = (int)(Math.random() * 41.0D) - 20;
						class282.mapSceneSprites[0].shiftColors(var54 + var32, var33 + var54, var3 + var54);
						Login.Login_loadingText = "Loaded sprites";
						Login.Login_loadingPercent = 70;
						Client.field547 = class92.field1150;
					}
				} else if (Client.field547 == class92.field1150) {
					if (!class148.field1670.isFullyLoaded()) {
						Login.Login_loadingText = "Loading textures - " + "0%";
						Login.Login_loadingPercent = 90;
					} else {
						class113.textureProvider = new TextureProvider(class148.field1670, class386.archive8, 20, class150.clientPreferences.method2476(), Client.isLowDetail ? 64 : 128);
						Rasterizer3D.method4404(class113.textureProvider);
						Rasterizer3D.method4405(class150.clientPreferences.method2476());
						Client.field547 = class92.field1149;
					}
				} else if (Client.field547 == class92.field1149) {
					var0 = class113.textureProvider.getLoadedPercentage();
					if (var0 < 100) {
						Login.Login_loadingText = "Loading textures - " + var0 + "%";
						Login.Login_loadingPercent = 90;
					} else {
						Login.Login_loadingText = "Loaded textures";
						Login.Login_loadingPercent = 90;
						Client.field547 = class92.field1152;
					}
				} else if (Client.field547 == class92.field1152) {
					class497.mouseRecorder = new MouseRecorder();
					GameEngine.taskHandler.newThreadTask(class497.mouseRecorder, 10);
					Login.Login_loadingText = "Loaded input handler";
					Login.Login_loadingPercent = 92;
					Client.field547 = class92.field1153;
				} else if (Client.field547 == class92.field1153) {
					if (!class131.archive10.tryLoadFileByNames("huffman", "")) {
						Login.Login_loadingText = "Loading wordpack - " + 0 + "%";
						Login.Login_loadingPercent = 94;
					} else {
						Huffman var50 = new Huffman(class131.archive10.takeFileByNames("huffman", ""));
						class335.huffman = var50;
						Login.Login_loadingText = "Loaded wordpack";
						Login.Login_loadingPercent = 94;
						Client.field547 = class92.field1154;
					}
				} else if (class92.field1154 == Client.field547) {
					if (!class253.archive4.isFullyLoaded()) {
						Login.Login_loadingText = "Loading interfaces - " + class253.archive4.loadPercent() * 4 / 5 + "%";
						Login.Login_loadingPercent = 96;
					} else if (!class126.archive12.isFullyLoaded()) {
						Login.Login_loadingText = "Loading interfaces - " + (80 + class126.archive12.loadPercent() / 6) + "%";
						Login.Login_loadingPercent = 96;
					} else if (!FontName.archive13.isFullyLoaded()) {
						Login.Login_loadingText = "Loading interfaces - " + (96 + FontName.archive13.loadPercent() / 50) + "%";
						Login.Login_loadingPercent = 96;
					} else {
						Login.Login_loadingText = "Loaded interfaces";
						Login.Login_loadingPercent = 98;
						if (class126.archive12.isValidFileName("version.dat", "")) {
							Buffer var27 = new Buffer(class126.archive12.takeFileByNames("version.dat", ""));
							var27.readUnsignedShort();
						}

						Client.field547 = class92.field1142;
					}
				} else if (Client.field547 == class92.field1142) {
					Login.Login_loadingPercent = 100;
					if (Varcs.field1402.getGroupCount() > 0 && !Varcs.field1402.tryLoadGroupByName(WorldMapCacheName.field3050.name)) {
						Login.Login_loadingText = "Loading world map - " + Varcs.field1402.groupLoadPercentByName(WorldMapCacheName.field3050.name) / 10 + "%";
					} else {
						if (class127.worldMap == null) {
							class127.worldMap = new WorldMap();
							class127.worldMap.init(Varcs.field1402, class106.field1358, Interpreter.field885, Calendar.fontBold12, Client.fontsMap, class282.mapSceneSprites);
						}

						Login.Login_loadingText = "Loaded world map";
						Client.field547 = class92.field1156;
					}
				} else {
					if (class92.field1156 == Client.field547) {
						class129.updateGameState(10);
					}

				}
			}
		}
	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-2127910071"
	)
	static final void method4553(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
			if (Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
				Client.field718[var4] = true;
			}
		}

	}

	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("Clan_leaveChat")
	static final void Clan_leaveChat() {
		PacketBufferNode var0 = class503.getPacketBufferNode(ClientPacket.field3109, Client.packetWriter.isaacCipher);
		var0.packetBuffer.writeByte(0);
		Client.packetWriter.addNode(var0);
	}
}
