import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rz")
@Implements("BufferedNetSocket")
public class BufferedNetSocket extends AbstractSocket {
	@ObfuscatedName("ae")
	@Export("osName")
	static String osName;
	@ObfuscatedName("aq")
	@Export("socket")
	Socket socket;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	@Export("source")
	BufferedSource source;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lri;"
	)
	@Export("sink")
	BufferedSink sink;

	public BufferedNetSocket(Socket var1, int var2, int var3) throws IOException {
		this.socket = var1;
		this.socket.setSoTimeout(30000);
		this.socket.setTcpNoDelay(true);
		this.socket.setReceiveBufferSize(65536);
		this.socket.setSendBufferSize(65536);
		this.source = new BufferedSource(this.socket.getInputStream(), var2);
		this.sink = new BufferedSink(this.socket.getOutputStream(), var3);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "854871960"
	)
	@Export("isAvailable")
	public boolean isAvailable(int var1) throws IOException {
		return this.source.isAvailable(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1869781257"
	)
	@Export("available")
	public int available() throws IOException {
		return this.source.available();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1680246450"
	)
	@Export("readUnsignedByte")
	public int readUnsignedByte() throws IOException {
		return this.source.readUnsignedByte();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([BIIS)I",
		garbageValue = "230"
	)
	@Export("read")
	public int read(byte[] var1, int var2, int var3) throws IOException {
		return this.source.read(var1, var2, var3);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([BIII)V",
		garbageValue = "437315408"
	)
	@Export("write")
	public void write(byte[] var1, int var2, int var3) throws IOException {
		this.sink.write(var1, var2, var3);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "33"
	)
	@Export("close")
	public void close() {
		this.sink.close();

		try {
			this.socket.close();
		} catch (IOException var2) {
		}

		this.source.close();
	}

	protected void finalize() {
		this.close();
	}

	@ObfuscatedName("hg")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2019836049"
	)
	static void method8501() {
		if (Client.field553 == class93.field1165) {
			class376.field4387 = ScriptFrame.newArchive(4, false, true, true, false);
			Renderable.archive6 = ScriptFrame.newArchive(6, true, true, true, false);
			class311.archive8 = ScriptFrame.newArchive(8, false, true, true, false);
			ScriptFrame.archive10 = ScriptFrame.newArchive(10, false, true, true, false);
			KeyHandler.archive13 = ScriptFrame.newArchive(13, true, false, true, false);
			class391.field4483 = ScriptFrame.newArchive(14, false, true, true, false);
			class86.field1084 = ScriptFrame.newArchive(15, false, true, true, false);
			class128.method3018(20, "Connecting to update server");
			WorldMapDecoration.method5033(class93.field1167);
		} else {
			int var28;
			byte var44;
			if (Client.field553 == class93.field1167) {
				var44 = 0;
				var28 = var44 + class376.field4387.percentage() * 53 / 100;
				var28 += Renderable.archive6.percentage() * 5 / 100;
				var28 += class311.archive8.percentage() * 36 / 100;
				var28 += ScriptFrame.archive10.percentage() / 100;
				var28 += KeyHandler.archive13.percentage() / 100;
				var28 += class391.field4483.percentage() * 3 / 100;
				var28 += class86.field1084.percentage() / 100;
				if (var28 != 100) {
					if (var28 != 0) {
						class128.method3018(30, "Checking for updates - " + var28 + "%");
					}

				} else {
					Login.method2168(class376.field4387, "Sound FX");
					Login.method2168(Renderable.archive6, "Music Tracks");
					Login.method2168(class311.archive8, "Sprites");
					Login.method2168(class391.field4483, "Music Samples");
					Login.method2168(class86.field1084, "Music Patches");
					class128.method3018(40, "Loaded update list");
					WorldMapDecoration.method5033(class93.field1177);
				}
			} else {
				Archive var2;
				int var30;
				if (Client.field553 == class93.field1177) {
					SoundSystem.method805(22050, !Client.isLowDetail, 2);
					ArrayList var36 = new ArrayList(3);
					AuthenticationScheme.pcmPlayer1 = class228.method4433(GameEngine.taskHandler, 0, 2048);
					SceneTilePaint.pcmStreamMixer = new PcmStreamMixer();
					PcmStreamMixer var38 = new PcmStreamMixer();
					var38.addSubStream(SceneTilePaint.pcmStreamMixer);

					for (var30 = 0; var30 < 3; ++var30) {
						MidiPcmStream var33 = new MidiPcmStream(AuthenticationScheme.pcmPlayer1);
						var33.method6230(9, 128);
						var38.addSubStream(var33);
						var36.add(var33);
					}

					AuthenticationScheme.pcmPlayer1.setStream(var38);
					var2 = class86.field1084;
					Archive var43 = class391.field4483;
					Archive var4 = class376.field4387;
					class321.field3480 = var2;
					class321.field3475 = var43;
					class321.field3477 = var4;
					class321.field3479 = var36;
					class73.decimator = new Decimator(22050, PcmPlayer.field295);
					class128.method3018(60, "Prepared sound engine");
					WorldMapDecoration.method5033(class93.field1170);
				} else if (Client.field553 == class93.field1170) {
					if (class183.field1925 == null) {
						class183.field1925 = new Fonts(class311.archive8, KeyHandler.archive13);
					}

					var28 = FontName.method9110().length;
					Client.fontsMap = class183.field1925.createMap(FontName.method9110());
					if (Client.fontsMap.size() < var28) {
						class128.method3018(80, "Loading fonts - " + Client.fontsMap.size() * 100 / var28 + "%");
					} else {
						class60.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
						class141.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
						class166.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
						class31.platformInfo = Client.field818.get();
						class128.method3018(80, "Loaded fonts");
						WorldMapDecoration.method5033(class93.field1173);
					}
				} else {
					int var29;
					if (Client.field553 == class93.field1173) {
						var28 = class234.method4589(ScriptFrame.archive10, class311.archive8);
						var29 = MouseHandler.method629(class311.archive8);
						if (var28 < var29) {
							class128.method3018(90, "Loading title screen - " + var28 * 100 / var29 + "%");
						} else {
							class128.method3018(100, "Loaded title screen");
							if (WorldMapScaleHandler.field2696) {
								Interpreter.updateGameState(5);
								WorldMapDecoration.method5033(class93.field1169);
							} else {
								WorldMapDecoration.method5033(class93.field1166);
							}

						}
					} else if (Client.field553 == class93.field1169) {
						Interpreter.updateGameState(10);
					} else if (Client.field553 == class93.field1166) {
						class154.field1724 = ScriptFrame.newArchive(0, false, true, true, false);
						Client.field556 = ScriptFrame.newArchive(1, false, true, true, false);
						HttpRequestTask.archive2 = ScriptFrame.newArchive(2, true, false, true, false);
						ScriptFrame.archive4 = ScriptFrame.newArchive(3, false, true, true, false);
						JagexCache.archive9 = ScriptFrame.newArchive(5, true, true, true, false);
						class198.field2070 = ScriptFrame.newArchive(7, false, true, true, false);
						Varcs.field1417 = ScriptFrame.newArchive(9, false, true, true, false);
						WorldMapSectionType.field2612 = ScriptFrame.newArchive(11, false, true, true, false);
						WorldMapSectionType.archive12 = ScriptFrame.newArchive(12, false, true, true, false);
						SecureRandomSSLSocket.field52 = ScriptFrame.newArchive(17, true, true, true, false);
						SpotAnimationDefinition.field2045 = ScriptFrame.newArchive(18, false, true, true, false);
						PlayerCompositionColorTextureOverride.field1832 = ScriptFrame.newArchive(19, false, true, true, false);
						class362.field3958 = ScriptFrame.newArchive(20, false, true, true, false);
						class150.field1703 = ScriptFrame.newArchive(21, false, true, true, false);
						MouseHandler.field239 = class186.method3684(22, false, true, true, true, true);
						class128.method3018(20, "Connecting to update server");
						WorldMapDecoration.method5033(class93.field1168);
					} else if (class93.field1168 == Client.field553) {
						var44 = 0;
						var28 = var44 + class154.field1724.percentage() * 5 / 100;
						var28 += Client.field556.percentage() * 2 / 100;
						var28 += HttpRequestTask.archive2.percentage() / 100;
						var28 += ScriptFrame.archive4.percentage() / 100;
						var28 += JagexCache.archive9.percentage() * 10 / 100;
						var28 += class198.field2070.percentage() * 65 / 100;
						var28 += Varcs.field1417.percentage() / 100;
						var28 += WorldMapSectionType.field2612.percentage() / 100;
						var28 += WorldMapSectionType.archive12.percentage() * 6 / 100;
						var28 += PlayerCompositionColorTextureOverride.field1832.percentage() / 100;
						var28 += SpotAnimationDefinition.field2045.percentage() * 2 / 100;
						var28 += class362.field3958.percentage() * 2 / 100;
						var28 += class150.field1703.percentage() / 100;
						var28 += MouseHandler.field239.percentage() / 100;
						var28 += SecureRandomSSLSocket.field52.method7049() && SecureRandomSSLSocket.field52.isFullyLoaded() ? 1 : 0;
						if (var28 != 100) {
							if (var28 != 0) {
								class128.method3018(30, "Checking for updates - " + var28 + "%");
							}

						} else {
							Login.method2168(class154.field1724, "Animations");
							Login.method2168(Client.field556, "Skeletons");
							Login.method2168(JagexCache.archive9, "Maps");
							Login.method2168(class198.field2070, "Models");
							Login.method2168(WorldMapSectionType.field2612, "Music Jingles");
							Login.method2168(PlayerCompositionColorTextureOverride.field1832, "World Map");
							Login.method2168(SpotAnimationDefinition.field2045, "World Map Geography");
							Login.method2168(class362.field3958, "World Map Ground");
							class128.field1514 = new GraphicsDefaults();
							class128.field1514.decode(SecureRandomSSLSocket.field52);
							class128.method3018(30, "Loaded update list");
							WorldMapDecoration.method5033(class93.field1171);
						}
					} else if (Client.field553 == class93.field1171) {
						Actor.scene = new Scene(4, 104, 104, Tiles.Tiles_heights);

						for (var28 = 0; var28 < 4; ++var28) {
							Client.collisionMaps[var28] = new CollisionMap(104, 104);
						}

						KeyHandler.sceneMinimapSprite = new SpritePixels(512, 512);
						class128.method3018(30, "Starting game engine...");
						WorldMapDecoration.method5033(class93.field1172);
					} else if (Client.field553 == class93.field1172) {
						if (!HttpRequestTask.archive2.isFullyLoaded()) {
							class128.method3018(40, "Loading config - " + HttpRequestTask.archive2.loadPercent() + "%");
						} else if (!class150.field1703.isFullyLoaded()) {
							class128.method3018(40, "Loading config - " + (80 + WorldMapSectionType.archive12.loadPercent() / 6) + "%");
						} else {
							ItemComposition.method4029(HttpRequestTask.archive2);
							Archive var35 = HttpRequestTask.archive2;
							FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var35;
							class417.method7969(HttpRequestTask.archive2, class198.field2070);
							Archive var37 = HttpRequestTask.archive2;
							var2 = class198.field2070;
							boolean var39 = Client.isLowDetail;
							boolean var42 = Client.field530 >= 220;
							ObjectComposition.ObjectDefinition_archive = var37;
							ObjectComposition.ObjectDefinition_modelsArchive = var2;
							ObjectComposition.ObjectDefinition_isLowDetail = var39;
							ObjectComposition.ObjectDefinition_isRev220SoundData = var42;
							Archive var40 = HttpRequestTask.archive2;
							Archive var32 = class198.field2070;
							NPCComposition.NpcDefinition_archive = var40;
							NPCComposition.field1964 = var32;
							Archive var41 = HttpRequestTask.archive2;
							StructComposition.StructDefinition_archive = var41;
							Archive var8 = HttpRequestTask.archive2;
							Archive var9 = class198.field2070;
							boolean var10 = Client.isMembersWorld;
							Font var11 = class60.fontPlain11;
							ItemComposition.ItemDefinition_archive = var8;
							ItemComposition.ItemDefinition_modelArchive = var9;
							HealthBarUpdate.ItemDefinition_inMembersWorld = var10;
							ItemComposition.ItemDefinition_fileCount = ItemComposition.ItemDefinition_archive.getGroupFileCount(10);
							Decimator.ItemDefinition_fontPlain11 = var11;
							Archive var12 = HttpRequestTask.archive2;
							Archive var13 = class154.field1724;
							Archive var14 = Client.field556;
							boolean var15 = Client.field530 >= 220;
							class149.SequenceDefinition_archive = var12;
							class135.SequenceDefinition_animationsArchive = var13;
							class138.SequenceDefinition_skeletonsArchive = var14;
							SequenceDefinition.field2250 = var15;
							Archive var16 = HttpRequestTask.archive2;
							Archive var17 = class198.field2070;
							SpotAnimationDefinition.SpotAnimationDefinition_archive = var16;
							SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var17;
							WorldMapSection2.method4667(HttpRequestTask.archive2);
							Login.method2192(HttpRequestTask.archive2);
							ArchiveLoader.widgetDefinition = new WidgetDefinition(ScriptFrame.archive4, class198.field2070, class311.archive8, KeyHandler.archive13, MouseHandler.field239);
							FontName.method9114(HttpRequestTask.archive2);
							DefaultsGroup.method8542(HttpRequestTask.archive2);
							PacketWriter.method2892(HttpRequestTask.archive2);
							Archive var18 = HttpRequestTask.archive2;
							class36.method660(HttpRequestTask.archive2);
							HealthBarUpdate.method2495(HttpRequestTask.archive2);
							class91.method2383(HttpRequestTask.archive2);
							EnumComposition.field1931 = new class516(class28.field151, 54, WorldMapCacheName.clientLanguage, HttpRequestTask.archive2);
							ApproximateRouteStrategy.field488 = new class516(class28.field151, 47, WorldMapCacheName.clientLanguage, HttpRequestTask.archive2);
							ScriptFrame.varcs = new Varcs();
							Archive var19 = HttpRequestTask.archive2;
							Archive var20 = class311.archive8;
							Archive var21 = KeyHandler.archive13;
							HitSplatDefinition.HitSplatDefinition_archive = var19;
							class17.field81 = var20;
							HitSplatDefinition.HitSplatDefinition_fontsArchive = var21;
							Archive var22 = HttpRequestTask.archive2;
							Archive var23 = class311.archive8;
							HealthBarDefinition.HealthBarDefinition_archive = var22;
							HealthBarDefinition.field1907 = var23;
							Archive var24 = HttpRequestTask.archive2;
							Archive var25 = class311.archive8;
							WorldMapElement.WorldMapElement_archive = var25;
							if (var24.isFullyLoaded()) {
								WorldMapElement.WorldMapElement_count = var24.getGroupFileCount(35);
								WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count];

								for (int var26 = 0; var26 < WorldMapElement.WorldMapElement_count; ++var26) {
									byte[] var27 = var24.takeFile(35, var26);
									WorldMapElement.WorldMapElement_cached[var26] = new WorldMapElement(var26);
									if (var27 != null) {
										WorldMapElement.WorldMapElement_cached[var26].decode(new Buffer(var27));
										WorldMapElement.WorldMapElement_cached[var26].method3590();
									}
								}
							}

							class128.method3018(50, "Loaded config");
							WorldMapDecoration.method5033(class93.field1175);
						}
					} else if (class93.field1175 == Client.field553) {
						var28 = 0;
						if (Varps.compass == null) {
							Varps.compass = FileSystem.SpriteBuffer_getSprite(class311.archive8, class128.field1514.field4819, 0);
						} else {
							++var28;
						}

						if (ItemComposition.redHintArrowSprite == null) {
							ItemComposition.redHintArrowSprite = FileSystem.SpriteBuffer_getSprite(class311.archive8, class128.field1514.field4810, 0);
						} else {
							++var28;
						}

						IndexedSprite[] var1;
						int var3;
						IndexedSprite[] var5;
						int var6;
						IndexedSprite var7;
						if (AbstractSocket.mapSceneSprites == null) {
							var2 = class311.archive8;
							var3 = class128.field1514.field4812;
							if (!class130.method3074(var2, var3, 0)) {
								var1 = null;
							} else {
								var5 = new IndexedSprite[SpriteBufferProperties.SpriteBuffer_spriteCount];

								for (var6 = 0; var6 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var6) {
									var7 = var5[var6] = new IndexedSprite();
									var7.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
									var7.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
									var7.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[var6];
									var7.yOffset = SpriteBufferProperties.SpriteBuffer_yOffsets[var6];
									var7.subWidth = class235.SpriteBuffer_spriteWidths[var6];
									var7.subHeight = SpriteBufferProperties.SpriteBuffer_spriteHeights[var6];
									var7.palette = AbstractSocket.SpriteBuffer_spritePalette;
									var7.pixels = SpriteBufferProperties.SpriteBuffer_pixels[var6];
								}

								SpriteBufferProperties.SpriteBuffer_xOffsets = null;
								SpriteBufferProperties.SpriteBuffer_yOffsets = null;
								class235.SpriteBuffer_spriteWidths = null;
								SpriteBufferProperties.SpriteBuffer_spriteHeights = null;
								AbstractSocket.SpriteBuffer_spritePalette = null;
								SpriteBufferProperties.SpriteBuffer_pixels = null;
								var1 = var5;
							}

							AbstractSocket.mapSceneSprites = var1;
						} else {
							++var28;
						}

						if (class13.headIconPkSprites == null) {
							class13.headIconPkSprites = class138.method3146(class311.archive8, class128.field1514.field4813, 0);
						} else {
							++var28;
						}

						if (class168.headIconPrayerSprites == null) {
							class168.headIconPrayerSprites = class138.method3146(class311.archive8, class128.field1514.field4814, 0);
						} else {
							++var28;
						}

						if (ChatChannel.headIconHintSprites == null) {
							ChatChannel.headIconHintSprites = class138.method3146(class311.archive8, class128.field1514.field4815, 0);
						} else {
							++var28;
						}

						if (Players.mapDotSprites == null) {
							Players.mapDotSprites = class138.method3146(class311.archive8, class128.field1514.field4822, 0);
						} else {
							++var28;
						}

						if (GrandExchangeOfferOwnWorldComparator.crossSprites == null) {
							GrandExchangeOfferOwnWorldComparator.crossSprites = class138.method3146(class311.archive8, class128.field1514.field4817, 0);
						} else {
							++var28;
						}

						if (class246.field2581 == null) {
							class246.field2581 = class138.method3146(class311.archive8, class128.field1514.field4818, 0);
						} else {
							++var28;
						}

						if (ClanChannelMember.scrollBarSprites == null) {
							var2 = class311.archive8;
							var3 = class128.field1514.field4816;
							if (!class130.method3074(var2, var3, 0)) {
								var1 = null;
							} else {
								var5 = new IndexedSprite[SpriteBufferProperties.SpriteBuffer_spriteCount];

								for (var6 = 0; var6 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var6) {
									var7 = var5[var6] = new IndexedSprite();
									var7.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
									var7.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
									var7.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[var6];
									var7.yOffset = SpriteBufferProperties.SpriteBuffer_yOffsets[var6];
									var7.subWidth = class235.SpriteBuffer_spriteWidths[var6];
									var7.subHeight = SpriteBufferProperties.SpriteBuffer_spriteHeights[var6];
									var7.palette = AbstractSocket.SpriteBuffer_spritePalette;
									var7.pixels = SpriteBufferProperties.SpriteBuffer_pixels[var6];
								}

								SpriteBufferProperties.SpriteBuffer_xOffsets = null;
								SpriteBufferProperties.SpriteBuffer_yOffsets = null;
								class235.SpriteBuffer_spriteWidths = null;
								SpriteBufferProperties.SpriteBuffer_spriteHeights = null;
								AbstractSocket.SpriteBuffer_spritePalette = null;
								SpriteBufferProperties.SpriteBuffer_pixels = null;
								var1 = var5;
							}

							ClanChannelMember.scrollBarSprites = var1;
						} else {
							++var28;
						}

						if (WorldMapCacheName.field2685 == null) {
							var2 = class311.archive8;
							var3 = class128.field1514.field4820;
							if (!class130.method3074(var2, var3, 0)) {
								var1 = null;
							} else {
								var5 = new IndexedSprite[SpriteBufferProperties.SpriteBuffer_spriteCount];

								for (var6 = 0; var6 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var6) {
									var7 = var5[var6] = new IndexedSprite();
									var7.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
									var7.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
									var7.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[var6];
									var7.yOffset = SpriteBufferProperties.SpriteBuffer_yOffsets[var6];
									var7.subWidth = class235.SpriteBuffer_spriteWidths[var6];
									var7.subHeight = SpriteBufferProperties.SpriteBuffer_spriteHeights[var6];
									var7.palette = AbstractSocket.SpriteBuffer_spritePalette;
									var7.pixels = SpriteBufferProperties.SpriteBuffer_pixels[var6];
								}

								SpriteBufferProperties.SpriteBuffer_xOffsets = null;
								SpriteBufferProperties.SpriteBuffer_yOffsets = null;
								class235.SpriteBuffer_spriteWidths = null;
								SpriteBufferProperties.SpriteBuffer_spriteHeights = null;
								AbstractSocket.SpriteBuffer_spritePalette = null;
								SpriteBufferProperties.SpriteBuffer_pixels = null;
								var1 = var5;
							}

							WorldMapCacheName.field2685 = var1;
						} else {
							++var28;
						}

						if (var28 < 11) {
							class128.method3018(70, "Loading sprites - " + var28 * 100 / 12 + "%");
						} else {
							AbstractFont.AbstractFont_modIconSprites = WorldMapCacheName.field2685;
							ItemComposition.redHintArrowSprite.normalize();
							var29 = (int)(Math.random() * 21.0D) - 10;
							var30 = (int)(Math.random() * 21.0D) - 10;
							var3 = (int)(Math.random() * 21.0D) - 10;
							int var31 = (int)(Math.random() * 41.0D) - 20;
							AbstractSocket.mapSceneSprites[0].shiftColors(var31 + var29, var30 + var31, var3 + var31);
							class128.method3018(60, "Loaded sprites");
							WorldMapDecoration.method5033(class93.field1178);
						}
					} else if (Client.field553 == class93.field1178) {
						if (!Varcs.field1417.isFullyLoaded()) {
							class128.method3018(70, "Loading textures - " + "0%");
						} else {
							class159.textureProvider = new TextureProvider(Varcs.field1417, class311.archive8, 20, class30.clientPreferences.getBrightness(), Client.isLowDetail ? 64 : 128);
							Rasterizer3D.method5344(class159.textureProvider);
							Rasterizer3D.method5280(class30.clientPreferences.getBrightness());
							WorldMapDecoration.method5033(class93.field1164);
						}
					} else if (Client.field553 == class93.field1164) {
						var28 = class159.textureProvider.getLoadedPercentage();
						if (var28 < 100) {
							class128.method3018(80, "Loading textures - " + var28 + "%");
						} else {
							class128.method3018(90, "Loaded textures");
							WorldMapDecoration.method5033(class93.field1176);
						}
					} else if (class93.field1176 == Client.field553) {
						ByteArrayPool.mouseRecorder = new MouseRecorder();
						GameEngine.taskHandler.newThreadTask(ByteArrayPool.mouseRecorder, 10);
						class128.method3018(92, "Loaded input handler");
						WorldMapDecoration.method5033(class93.field1174);
					} else if (Client.field553 == class93.field1174) {
						if (!ScriptFrame.archive10.tryLoadFileByNames("huffman", "")) {
							class128.method3018(94, "Loading wordpack - " + 0 + "%");
						} else {
							Huffman var34 = new Huffman(ScriptFrame.archive10.takeFileByNames("huffman", ""));
							class405.huffman = var34;
							class128.method3018(94, "Loaded wordpack");
							WorldMapDecoration.method5033(class93.field1180);
						}
					} else if (class93.field1180 == Client.field553) {
						if (!ScriptFrame.archive4.isFullyLoaded()) {
							class128.method3018(96, "Loading interfaces - " + ScriptFrame.archive4.loadPercent() * 4 / 5 + "%");
						} else if (!MouseHandler.field239.isFullyLoaded()) {
							class128.method3018(96, "Loading interfaces - " + MouseHandler.field239.loadPercent() * 4 / 5 + "%");
						} else if (!WorldMapSectionType.archive12.isFullyLoaded()) {
							class128.method3018(96, "Loading interfaces - " + (80 + WorldMapSectionType.archive12.loadPercent() / 6) + "%");
						} else if (!KeyHandler.archive13.isFullyLoaded()) {
							class128.method3018(96, "Loading interfaces - " + (96 + KeyHandler.archive13.loadPercent() / 50) + "%");
						} else {
							class128.method3018(98, "Loaded interfaces");
							if (WorldMapSectionType.archive12.isValidFileName("version.dat", "")) {
								Buffer var0 = new Buffer(WorldMapSectionType.archive12.takeFileByNames("version.dat", ""));
								var0.readUnsignedShort();
							}

							WorldMapDecoration.method5033(class93.field1179);
						}
					} else if (Client.field553 == class93.field1179) {
						if (PlayerCompositionColorTextureOverride.field1832.getGroupCount() > 0 && !PlayerCompositionColorTextureOverride.field1832.tryLoadGroupByName(WorldMapCacheName.field2680.name)) {
							class128.method3018(100, "Loading world map - " + PlayerCompositionColorTextureOverride.field1832.groupLoadPercentByName(WorldMapCacheName.field2680.name) / 10 + "%");
						} else {
							if (Tiles.worldMap == null) {
								Tiles.worldMap = new WorldMap();
								Tiles.worldMap.init(PlayerCompositionColorTextureOverride.field1832, SpotAnimationDefinition.field2045, class362.field3958, class166.fontBold12, Client.fontsMap, AbstractSocket.mapSceneSprites);
							}

							class128.method3018(100, "Loaded world map");
							if (WorldMapScaleHandler.field2696) {
								WorldMapDecoration.method5033(class93.field1181);
							} else {
								WorldMapDecoration.method5033(class93.field1169);
							}

							Client.field718 = false;
						}
					} else {
						if (class93.field1181 == Client.field553) {
							VarbitComposition.field2061 = false;
							Interpreter.updateGameState(20);
							class407.updateLoginState(LoginState.field514);
						}

					}
				}
			}
		}
	}
}
