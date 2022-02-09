import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("be")
@Implements("Decimator")
public class Decimator {
    @ObfuscatedName("j")
    @ObfuscatedGetter(intValue = -370521967)
    static int field412;

    @ObfuscatedName("hy")
    @ObfuscatedSignature(descriptor = "Lgn;")
    @Export("scene")
    static Scene scene;

    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = 1404782287)
    @Export("inputRate")
    int inputRate;

    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = 490458789)
    @Export("outputRate")
    int outputRate;

    @ObfuscatedName("o")
    @Export("table")
    int[][] table;

    public Decimator(int var1, int var2) {
        if (var2 != var1) {
            int var4 = var1;
            int var5 = var2;
            if (var2 > var1) {
                var4 = var2;
                var5 = var1;
            }
            while (var5 != 0) {
                int var6 = var4 % var5;
                var4 = var5;
                var5 = var6;
            } 
            var1 /= var4;
            var2 /= var4;
            this.inputRate = var1;
            this.outputRate = var2;
            this.table = new int[var1][14];
            for (int var7 = 0; var7 < var1; ++var7) {
                int[] var8 = this.table[var7];
                double var9 = (((double) (var7)) / ((double) (var1))) + 6.0;
                int var11 = ((int) (Math.floor(1.0 + (var9 - 7.0))));
                if (var11 < 0) {
                    var11 = 0;
                }
                int var12 = ((int) (Math.ceil(var9 + 7.0)));
                if (var12 > 14) {
                    var12 = 14;
                }
                for (double var13 = ((double) (var2)) / ((double) (var1)); var11 < var12; ++var11) {
                    double var15 = 3.141592653589793 * (((double) (var11)) - var9);
                    double var17 = var13;
                    if ((var15 < (-1.0E-4)) || (var15 > 1.0E-4)) {
                        var17 = var13 * (Math.sin(var15) / var15);
                    }
                    var17 *= 0.54 + (0.46 * Math.cos(0.2243994752564138 * (((double) (var11)) - var9)));
                    var8[var11] = ((int) (Math.floor((65536.0 * var17) + 0.5)));
                }
            }
        }
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "([BI)[B", garbageValue = "-1478670549")
    @Export("resample")
    byte[] resample(byte[] var1) {
        if (this.table != null) {
            int var2 = ((int) ((((long) (var1.length)) * ((long) (this.outputRate))) / ((long) (this.inputRate)))) + 14;
            int[] var3 = new int[var2];
            int var4 = 0;
            int var5 = 0;
            int var6;
            for (var6 = 0; var6 < var1.length; ++var6) {
                byte var7 = var1[var6];
                int[] var8 = this.table[var5];
                int var9;
                for (var9 = 0; var9 < 14; ++var9) {
                    var3[var9 + var4] += var8[var9] * var7;
                }
                var5 += this.outputRate;
                var9 = var5 / this.inputRate;
                var4 += var9;
                var5 -= var9 * this.inputRate;
            }
            var1 = new byte[var2];
            for (var6 = 0; var6 < var2; ++var6) {
                int var10 = (var3[var6] + 32768) >> 16;
                if (var10 < (-128)) {
                    var1[var6] = -128;
                } else if (var10 > 127) {
                    var1[var6] = 127;
                } else {
                    var1[var6] = ((byte) (var10));
                }
            }
        }
        return var1;
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(IB)I", garbageValue = "9")
    @Export("scaleRate")
    int scaleRate(int var1) {
        if (this.table != null) {
            var1 = ((int) ((((long) (var1)) * ((long) (this.outputRate))) / ((long) (this.inputRate))));
        }
        return var1;
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(II)I", garbageValue = "-1294753676")
    @Export("scalePosition")
    int scalePosition(int var1) {
        if (this.table != null) {
            var1 = ((int) ((((long) (var1)) * ((long) (this.outputRate))) / ((long) (this.inputRate)))) + 6;
        }
        return var1;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lkq;Lkq;I)V", garbageValue = "1727162890")
    public static void method1051(AbstractArchive var0, AbstractArchive var1) {
        SpotAnimationDefinition.SpotAnimationDefinition_archive = var0;
        SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var1;
    }

    @ObfuscatedName("fk")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-961463210")
    @Export("load")
    static void load() {
        int var18;
        if (Client.titleLoadingStage == 0) {
            scene = new Scene(4, 104, 104, Tiles.Tiles_heights);
            for (var18 = 0; var18 < 4; ++var18) {
                Client.collisionMaps[var18] = new CollisionMap(104, 104);
            }
            class414.sceneMinimapSprite = new SpritePixels(512, 512);
            Login.Login_loadingText = "Starting game engine...";
            Login.Login_loadingPercent = 5;
            Client.titleLoadingStage = 20;
        } else if (Client.titleLoadingStage == 20) {
            Login.Login_loadingText = "Prepared visibility map";
            Login.Login_loadingPercent = 10;
            Client.titleLoadingStage = 30;
        } else if (Client.titleLoadingStage == 30) {
            class7.archive0 = class140.newArchive(0, false, true, true);
            Client.archive1 = class140.newArchive(1, false, true, true);
            FriendLoginUpdate.archive2 = class140.newArchive(2, true, false, true);
            Tile.archive3 = class140.newArchive(3, false, true, true);
            class403.archive4 = class140.newArchive(4, false, true, true);
            Client.archive5 = class140.newArchive(5, true, true, true);
            WorldMapLabelSize.archive6 = class140.newArchive(6, true, true, true);
            WorldMapLabelSize.archive7 = class140.newArchive(7, false, true, true);
            Message.archive8 = class140.newArchive(8, false, true, true);
            class9.archive9 = class140.newArchive(9, false, true, true);
            Tile.archive10 = class140.newArchive(10, false, true, true);
            class252.archive11 = class140.newArchive(11, false, true, true);
            class148.archive12 = class140.newArchive(12, false, true, true);
            KitDefinition.archive13 = class140.newArchive(13, true, false, true);
            SoundCache.archive14 = class140.newArchive(14, false, true, true);
            FontName.archive15 = class140.newArchive(15, false, true, true);
            Clock.archive17 = class140.newArchive(17, true, true, true);
            UrlRequest.archive18 = class140.newArchive(18, false, true, true);
            WorldMapRegion.archive19 = class140.newArchive(19, false, true, true);
            Varcs.archive20 = class140.newArchive(20, false, true, true);
            Login.Login_loadingText = "Connecting to update server";
            Login.Login_loadingPercent = 20;
            Client.titleLoadingStage = 40;
        } else if (Client.titleLoadingStage == 40) {
            byte var30 = 0;
            var18 = var30 + ((class7.archive0.percentage() * 4) / 100);
            var18 += (Client.archive1.percentage() * 4) / 100;
            var18 += (FriendLoginUpdate.archive2.percentage() * 2) / 100;
            var18 += (Tile.archive3.percentage() * 2) / 100;
            var18 += (class403.archive4.percentage() * 6) / 100;
            var18 += (Client.archive5.percentage() * 4) / 100;
            var18 += (WorldMapLabelSize.archive6.percentage() * 2) / 100;
            var18 += (WorldMapLabelSize.archive7.percentage() * 56) / 100;
            var18 += (Message.archive8.percentage() * 2) / 100;
            var18 += (class9.archive9.percentage() * 2) / 100;
            var18 += (Tile.archive10.percentage() * 2) / 100;
            var18 += (class252.archive11.percentage() * 2) / 100;
            var18 += (class148.archive12.percentage() * 2) / 100;
            var18 += (KitDefinition.archive13.percentage() * 2) / 100;
            var18 += (SoundCache.archive14.percentage() * 2) / 100;
            var18 += (FontName.archive15.percentage() * 2) / 100;
            var18 += WorldMapRegion.archive19.percentage() / 100;
            var18 += UrlRequest.archive18.percentage() / 100;
            var18 += Varcs.archive20.percentage() / 100;
            var18 += (Clock.archive17.method5521() && Clock.archive17.isFullyLoaded()) ? 1 : 0;
            if (var18 != 100) {
                if (var18 != 0) {
                    Login.Login_loadingText = ("Checking for updates - " + var18) + "%";
                }
                Login.Login_loadingPercent = 30;
            } else {
                WorldMapLabel.method4762(class7.archive0, "Animations");
                WorldMapLabel.method4762(Client.archive1, "Skeletons");
                WorldMapLabel.method4762(class403.archive4, "Sound FX");
                WorldMapLabel.method4762(Client.archive5, "Maps");
                WorldMapLabel.method4762(WorldMapLabelSize.archive6, "Music Tracks");
                WorldMapLabel.method4762(WorldMapLabelSize.archive7, "Models");
                WorldMapLabel.method4762(Message.archive8, "Sprites");
                WorldMapLabel.method4762(class252.archive11, "Music Jingles");
                WorldMapLabel.method4762(SoundCache.archive14, "Music Samples");
                WorldMapLabel.method4762(FontName.archive15, "Music Patches");
                WorldMapLabel.method4762(WorldMapRegion.archive19, "World Map");
                WorldMapLabel.method4762(UrlRequest.archive18, "World Map Geography");
                WorldMapLabel.method4762(Varcs.archive20, "World Map Ground");
                class140.spriteIds = new GraphicsDefaults();
                class140.spriteIds.decode(Clock.archive17);
                Login.Login_loadingText = "Loaded update list";
                Login.Login_loadingPercent = 30;
                Client.titleLoadingStage = 45;
            }
        } else if (Client.titleLoadingStage == 45) {
            FriendsList.method6281(22050, !Client.isLowDetail, 2);
            MidiPcmStream var25 = new MidiPcmStream();
            var25.method5043(9, 128);
            PacketBufferNode.pcmPlayer0 = class28.method405(GameEngine.taskHandler, 0, 22050);
            PacketBufferNode.pcmPlayer0.setStream(var25);
            AbstractWorldMapData.method4753(FontName.archive15, SoundCache.archive14, class403.archive4, var25);
            MouseHandler.pcmPlayer1 = class28.method405(GameEngine.taskHandler, 1, 2048);
            class123.pcmStreamMixer = new PcmStreamMixer();
            MouseHandler.pcmPlayer1.setStream(class123.pcmStreamMixer);
            class131.decimator = new Decimator(22050, PcmPlayer.field305);
            Login.Login_loadingText = "Prepared sound engine";
            Login.Login_loadingPercent = 35;
            Client.titleLoadingStage = 50;
            WorldMapRegion.WorldMapElement_fonts = new Fonts(Message.archive8, KitDefinition.archive13);
        } else if (Client.titleLoadingStage == 50) {
            var18 = FontName.method7085().length;
            Client.fontsMap = WorldMapRegion.WorldMapElement_fonts.createMap(FontName.method7085());
            if (Client.fontsMap.size() < var18) {
                Login.Login_loadingText = ("Loading fonts - " + ((Client.fontsMap.size() * 100) / var18)) + "%";
                Login.Login_loadingPercent = 40;
            } else {
                class1.fontPlain11 = ((Font) (Client.fontsMap.get(FontName.FontName_plain11)));
                Players.fontPlain12 = ((Font) (Client.fontsMap.get(FontName.FontName_plain12)));
                class408.fontBold12 = ((Font) (Client.fontsMap.get(FontName.FontName_bold12)));
                MouseHandler.platformInfo = Client.platformInfoProvider.get();
                Login.Login_loadingText = "Loaded fonts";
                Login.Login_loadingPercent = 40;
                Client.titleLoadingStage = 60;
            }
        } else {
            int var19;
            if (Client.titleLoadingStage == 60) {
                var18 = ObjectComposition.method3498(Tile.archive10, Message.archive8);
                var19 = Login.field924.length + Login.field925.length;
                if (var18 < var19) {
                    Login.Login_loadingText = ("Loading title screen - " + ((var18 * 100) / var19)) + "%";
                    Login.Login_loadingPercent = 50;
                } else {
                    Login.Login_loadingText = "Loaded title screen";
                    Login.Login_loadingPercent = 50;
                    class111.updateGameState(5);
                    Client.titleLoadingStage = 70;
                }
            } else {
                Archive var2;
                if (Client.titleLoadingStage == 70) {
                    if (!FriendLoginUpdate.archive2.isFullyLoaded()) {
                        Login.Login_loadingText = ("Loading config - " + FriendLoginUpdate.archive2.loadPercent()) + "%";
                        Login.Login_loadingPercent = 60;
                    } else {
                        Archive var24 = FriendLoginUpdate.archive2;
                        FloorOverlayDefinition.FloorOverlayDefinition_archive = var24;
                        Archive var26 = FriendLoginUpdate.archive2;
                        FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var26;
                        GrandExchangeEvent.method5726(FriendLoginUpdate.archive2, WorldMapLabelSize.archive7);
                        HealthBar.method2248(FriendLoginUpdate.archive2, WorldMapLabelSize.archive7, Client.isLowDetail);
                        WallDecoration.method4296(FriendLoginUpdate.archive2, WorldMapLabelSize.archive7);
                        WorldMapLabelSize.method4325(FriendLoginUpdate.archive2);
                        var2 = FriendLoginUpdate.archive2;
                        Archive var22 = WorldMapLabelSize.archive7;
                        boolean var29 = Client.isMembersWorld;
                        Font var27 = class1.fontPlain11;
                        DefaultsGroup.ItemDefinition_archive = var2;
                        class6.ItemDefinition_modelArchive = var22;
                        MilliClock.ItemDefinition_inMembersWorld = var29;
                        HealthBarUpdate.ItemDefinition_fileCount = DefaultsGroup.ItemDefinition_archive.getGroupFileCount(10);
                        class67.ItemDefinition_fontPlain11 = var27;
                        ModeWhere.method5816(FriendLoginUpdate.archive2, class7.archive0, Client.archive1);
                        method1051(FriendLoginUpdate.archive2, WorldMapLabelSize.archive7);
                        Calendar.method5310(FriendLoginUpdate.archive2);
                        class112.method2558(FriendLoginUpdate.archive2);
                        Archive var23 = Tile.archive3;
                        Archive var28 = WorldMapLabelSize.archive7;
                        Archive var8 = Message.archive8;
                        Archive var9 = KitDefinition.archive13;
                        UserComparator6.Widget_archive = var23;
                        Widget.Widget_modelsArchive = var28;
                        class160.Widget_spritesArchive = var8;
                        class222.Widget_fontsArchive = var9;
                        Widget.Widget_interfaceComponents = new Widget[UserComparator6.Widget_archive.getGroupCount()][];
                        class145.Widget_loadedInterfaces = new boolean[UserComparator6.Widget_archive.getGroupCount()];
                        class129.method2774(FriendLoginUpdate.archive2);
                        SoundSystem.method782(FriendLoginUpdate.archive2);
                        SpriteMask.method5324(FriendLoginUpdate.archive2);
                        ObjectSound.method1743(FriendLoginUpdate.archive2);
                        Archive var10 = FriendLoginUpdate.archive2;
                        ParamComposition.ParamDefinition_archive = var10;
                        class115.HitSplatDefinition_cachedSprites = new class409(HorizontalAlignment.field1846, 54, class122.clientLanguage, FriendLoginUpdate.archive2);
                        FloorOverlayDefinition.HitSplatDefinition_cached = new class409(HorizontalAlignment.field1846, 47, class122.clientLanguage, FriendLoginUpdate.archive2);
                        JagexCache.varcs = new Varcs();
                        Archive var11 = FriendLoginUpdate.archive2;
                        Archive var12 = Message.archive8;
                        Archive var13 = KitDefinition.archive13;
                        HitSplatDefinition.HitSplatDefinition_archive = var11;
                        Frames.field2379 = var12;
                        class413.HitSplatDefinition_fontsArchive = var13;
                        AbstractWorldMapIcon.method4803(FriendLoginUpdate.archive2, Message.archive8);
                        Archive var14 = FriendLoginUpdate.archive2;
                        Archive var15 = Message.archive8;
                        WorldMapElement.WorldMapElement_archive = var15;
                        if (var14.isFullyLoaded()) {
                            WorldMapElement.WorldMapElement_count = var14.getGroupFileCount(35);
                            WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count];
                            for (int var16 = 0; var16 < WorldMapElement.WorldMapElement_count; ++var16) {
                                byte[] var17 = var14.takeFile(35, var16);
                                WorldMapElement.WorldMapElement_cached[var16] = new WorldMapElement(var16);
                                if (var17 != null) {
                                    WorldMapElement.WorldMapElement_cached[var16].decode(new Buffer(var17));
                                    WorldMapElement.WorldMapElement_cached[var16].method3164();
                                }
                            }
                        }
                        Login.Login_loadingText = "Loaded config";
                        Login.Login_loadingPercent = 60;
                        Client.titleLoadingStage = 80;
                    }
                } else if (Client.titleLoadingStage == 80) {
                    var18 = 0;
                    if (class10.compass == null) {
                        class10.compass = class126.SpriteBuffer_getSprite(Message.archive8, class140.spriteIds.compass, 0);
                    } else {
                        ++var18;
                    }
                    if (class78.redHintArrowSprite == null) {
                        class78.redHintArrowSprite = class126.SpriteBuffer_getSprite(Message.archive8, class140.spriteIds.field4210, 0);
                    } else {
                        ++var18;
                    }
                    IndexedSprite[] var1;
                    int var3;
                    IndexedSprite[] var5;
                    int var6;
                    IndexedSprite var7;
                    if (class10.mapSceneSprites == null) {
                        var2 = Message.archive8;
                        var3 = class140.spriteIds.mapScenes;
                        if (!class125.method2744(var2, var3, 0)) {
                            var1 = null;
                        } else {
                            var5 = new IndexedSprite[class434.SpriteBuffer_spriteCount];
                            for (var6 = 0; var6 < class434.SpriteBuffer_spriteCount; ++var6) {
                                var7 = var5[var6] = new IndexedSprite();
                                var7.width = class434.SpriteBuffer_spriteWidth;
                                var7.height = class434.SpriteBuffer_spriteHeight;
                                var7.xOffset = class434.SpriteBuffer_xOffsets[var6];
                                var7.yOffset = class434.SpriteBuffer_yOffsets[var6];
                                var7.subWidth = class434.SpriteBuffer_spriteWidths[var6];
                                var7.subHeight = Fonts.SpriteBuffer_spriteHeights[var6];
                                var7.palette = HealthBarUpdate.SpriteBuffer_spritePalette;
                                var7.pixels = WorldMapLabelSize.SpriteBuffer_pixels[var6];
                            }
                            Canvas.method365();
                            var1 = var5;
                        }
                        class10.mapSceneSprites = var1;
                    } else {
                        ++var18;
                    }
                    if (ObjectSound.headIconPkSprites == null) {
                        ObjectSound.headIconPkSprites = UserList.method6415(Message.archive8, class140.spriteIds.headIconsPk, 0);
                    } else {
                        ++var18;
                    }
                    if (class4.headIconPrayerSprites == null) {
                        class4.headIconPrayerSprites = UserList.method6415(Message.archive8, class140.spriteIds.field4213, 0);
                    } else {
                        ++var18;
                    }
                    if (SequenceDefinition.headIconHintSprites == null) {
                        SequenceDefinition.headIconHintSprites = UserList.method6415(Message.archive8, class140.spriteIds.field4209, 0);
                    } else {
                        ++var18;
                    }
                    if (Varcs.mapMarkerSprites == null) {
                        Varcs.mapMarkerSprites = UserList.method6415(Message.archive8, class140.spriteIds.field4215, 0);
                    } else {
                        ++var18;
                    }
                    if (WorldMapData_1.crossSprites == null) {
                        WorldMapData_1.crossSprites = UserList.method6415(Message.archive8, class140.spriteIds.field4216, 0);
                    } else {
                        ++var18;
                    }
                    if (Huffman.mapDotSprites == null) {
                        Huffman.mapDotSprites = UserList.method6415(Message.archive8, class140.spriteIds.field4214, 0);
                    } else {
                        ++var18;
                    }
                    if (class144.scrollBarSprites == null) {
                        var2 = Message.archive8;
                        var3 = class140.spriteIds.field4218;
                        if (!class125.method2744(var2, var3, 0)) {
                            var1 = null;
                        } else {
                            var5 = new IndexedSprite[class434.SpriteBuffer_spriteCount];
                            for (var6 = 0; var6 < class434.SpriteBuffer_spriteCount; ++var6) {
                                var7 = var5[var6] = new IndexedSprite();
                                var7.width = class434.SpriteBuffer_spriteWidth;
                                var7.height = class434.SpriteBuffer_spriteHeight;
                                var7.xOffset = class434.SpriteBuffer_xOffsets[var6];
                                var7.yOffset = class434.SpriteBuffer_yOffsets[var6];
                                var7.subWidth = class434.SpriteBuffer_spriteWidths[var6];
                                var7.subHeight = Fonts.SpriteBuffer_spriteHeights[var6];
                                var7.palette = HealthBarUpdate.SpriteBuffer_spritePalette;
                                var7.pixels = WorldMapLabelSize.SpriteBuffer_pixels[var6];
                            }
                            Canvas.method365();
                            var1 = var5;
                        }
                        class144.scrollBarSprites = var1;
                    } else {
                        ++var18;
                    }
                    if (Frames.modIconSprites == null) {
                        var2 = Message.archive8;
                        var3 = class140.spriteIds.field4219;
                        if (!class125.method2744(var2, var3, 0)) {
                            var1 = null;
                        } else {
                            var5 = new IndexedSprite[class434.SpriteBuffer_spriteCount];
                            for (var6 = 0; var6 < class434.SpriteBuffer_spriteCount; ++var6) {
                                var7 = var5[var6] = new IndexedSprite();
                                var7.width = class434.SpriteBuffer_spriteWidth;
                                var7.height = class434.SpriteBuffer_spriteHeight;
                                var7.xOffset = class434.SpriteBuffer_xOffsets[var6];
                                var7.yOffset = class434.SpriteBuffer_yOffsets[var6];
                                var7.subWidth = class434.SpriteBuffer_spriteWidths[var6];
                                var7.subHeight = Fonts.SpriteBuffer_spriteHeights[var6];
                                var7.palette = HealthBarUpdate.SpriteBuffer_spritePalette;
                                var7.pixels = WorldMapLabelSize.SpriteBuffer_pixels[var6];
                            }
                            Canvas.method365();
                            var1 = var5;
                        }
                        Frames.modIconSprites = var1;
                    } else {
                        ++var18;
                    }
                    if (var18 < 11) {
                        Login.Login_loadingText = ("Loading sprites - " + ((var18 * 100) / 12)) + "%";
                        Login.Login_loadingPercent = 70;
                    } else {
                        AbstractFont.AbstractFont_modIconSprites = Frames.modIconSprites;
                        class78.redHintArrowSprite.normalize();
                        var19 = ((int) (Math.random() * 21.0)) - 10;
                        int var20 = ((int) (Math.random() * 21.0)) - 10;
                        var3 = ((int) (Math.random() * 21.0)) - 10;
                        int var21 = ((int) (Math.random() * 41.0)) - 20;
                        class10.mapSceneSprites[0].shiftColors(var21 + var19, var21 + var20, var3 + var21);
                        Login.Login_loadingText = "Loaded sprites";
                        Login.Login_loadingPercent = 70;
                        Client.titleLoadingStage = 90;
                    }
                } else if (Client.titleLoadingStage == 90) {
                    if (!class9.archive9.isFullyLoaded()) {
                        Login.Login_loadingText = "Loading textures - " + "0%";
                        Login.Login_loadingPercent = 90;
                    } else {
                        TextureProvider.textureProvider = new TextureProvider(class9.archive9, Message.archive8, 20, class424.clientPreferences.brightness, Client.isLowDetail ? 64 : 128);
                        Rasterizer3D.Rasterizer3D_setTextureLoader(TextureProvider.textureProvider);
                        Rasterizer3D.Rasterizer3D_setBrightness(class424.clientPreferences.brightness);
                        Client.titleLoadingStage = 100;
                    }
                } else if (Client.titleLoadingStage == 100) {
                    var18 = TextureProvider.textureProvider.getLoadedPercentage();
                    if (var18 < 100) {
                        Login.Login_loadingText = ("Loading textures - " + var18) + "%";
                        Login.Login_loadingPercent = 90;
                    } else {
                        Login.Login_loadingText = "Loaded textures";
                        Login.Login_loadingPercent = 90;
                        Client.titleLoadingStage = 110;
                    }
                } else if (Client.titleLoadingStage == 110) {
                    PacketWriter.mouseRecorder = new MouseRecorder();
                    GameEngine.taskHandler.newThreadTask(PacketWriter.mouseRecorder, 10);
                    Login.Login_loadingText = "Loaded input handler";
                    Login.Login_loadingPercent = 92;
                    Client.titleLoadingStage = 120;
                } else if (Client.titleLoadingStage == 120) {
                    if (!Tile.archive10.tryLoadFileByNames("huffman", "")) {
                        Login.Login_loadingText = ("Loading wordpack - " + 0) + "%";
                        Login.Login_loadingPercent = 94;
                    } else {
                        Huffman var0 = new Huffman(Tile.archive10.takeFileByNames("huffman", ""));
                        class9.method82(var0);
                        Login.Login_loadingText = "Loaded wordpack";
                        Login.Login_loadingPercent = 94;
                        Client.titleLoadingStage = 130;
                    }
                } else if (Client.titleLoadingStage == 130) {
                    if (!Tile.archive3.isFullyLoaded()) {
                        Login.Login_loadingText = ("Loading interfaces - " + ((Tile.archive3.loadPercent() * 4) / 5)) + "%";
                        Login.Login_loadingPercent = 96;
                    } else if (!class148.archive12.isFullyLoaded()) {
                        Login.Login_loadingText = ("Loading interfaces - " + (80 + (class148.archive12.loadPercent() / 6))) + "%";
                        Login.Login_loadingPercent = 96;
                    } else if (!KitDefinition.archive13.isFullyLoaded()) {
                        Login.Login_loadingText = ("Loading interfaces - " + (96 + (KitDefinition.archive13.loadPercent() / 50))) + "%";
                        Login.Login_loadingPercent = 96;
                    } else {
                        Login.Login_loadingText = "Loaded interfaces";
                        Login.Login_loadingPercent = 98;
                        Client.titleLoadingStage = 140;
                    }
                } else if (Client.titleLoadingStage == 140) {
                    Login.Login_loadingPercent = 100;
                    if (!WorldMapRegion.archive19.tryLoadGroupByName(WorldMapCacheName.field2793.name)) {
                        Login.Login_loadingText = ("Loading world map - " + (WorldMapRegion.archive19.groupLoadPercentByName(WorldMapCacheName.field2793.name) / 10)) + "%";
                    } else {
                        if (Huffman.worldMap == null) {
                            Huffman.worldMap = new WorldMap();
                            Huffman.worldMap.init(WorldMapRegion.archive19, UrlRequest.archive18, Varcs.archive20, class408.fontBold12, Client.fontsMap, class10.mapSceneSprites);
                        }
                        Login.Login_loadingText = "Loaded world map";
                        Client.titleLoadingStage = 150;
                    }
                } else if (Client.titleLoadingStage == 150) {
                    class111.updateGameState(10);
                }
            }
        }
    }

    @ObfuscatedName("hh")
    @ObfuscatedSignature(descriptor = "(ZLpc;I)V", garbageValue = "1819387298")
    @Export("loadRegions")
    static final void loadRegions(boolean var0, PacketBuffer var1) {
        Client.isInInstance = var0;
        int var2;
        int var3;
        int var5;
        int var6;
        int var7;
        int var8;
        if (!Client.isInInstance) {
            var2 = var1.readUnsignedShortAddLE();
            var3 = var1.readUnsignedShortAddLE();
            int var4 = var1.readUnsignedShort();
            UserComparator8.xteaKeys = new int[var4][4];
            for (var5 = 0; var5 < var4; ++var5) {
                for (var6 = 0; var6 < 4; ++var6) {
                    UserComparator8.xteaKeys[var5][var6] = var1.readInt();
                }
            }
            WorldMapLabel.regions = new int[var4];
            Varcs.regionMapArchiveIds = new int[var4];
            WorldMapData_0.regionLandArchiveIds = new int[var4];
            Friend.regionLandArchives = new byte[var4][];
            ReflectionCheck.regionMapArchives = new byte[var4][];
            boolean var16 = false;
            if (Client.field554) {
                if ((((var3 / 8) == 48) || ((var3 / 8) == 49)) && ((var2 / 8) == 48)) {
                    var16 = true;
                }
                if (((var3 / 8) == 48) && ((var2 / 8) == 148)) {
                    var16 = true;
                }
            }
            var4 = 0;
            for (var6 = (var3 - 6) / 8; var6 <= ((var3 + 6) / 8); ++var6) {
                for (var7 = (var2 - 6) / 8; var7 <= ((var2 + 6) / 8); ++var7) {
                    var8 = var7 + (var6 << 8);
                    if ((!var16) || (((((var7 != 49) && (var7 != 149)) && (var7 != 147)) && (var6 != 50)) && ((var6 != 49) || (var7 != 47)))) {
                        WorldMapLabel.regions[var4] = var8;
                        Varcs.regionMapArchiveIds[var4] = Client.archive5.getGroupId((("m" + var6) + "_") + var7);
                        WorldMapData_0.regionLandArchiveIds[var4] = Client.archive5.getGroupId((("l" + var6) + "_") + var7);
                        ++var4;
                    }
                }
            }
            class265.method5030(var3, var2, true);
        } else {
            var2 = var1.readUnsignedShortLE();
            var3 = var1.readUnsignedShortLE();
            boolean var15 = var1.readUnsignedByteNeg() == 1;
            var5 = var1.readUnsignedShort();
            var1.importIndex();
            int var9;
            for (var6 = 0; var6 < 4; ++var6) {
                for (var7 = 0; var7 < 13; ++var7) {
                    for (var8 = 0; var8 < 13; ++var8) {
                        var9 = var1.readBits(1);
                        if (var9 == 1) {
                            Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26);
                        } else {
                            Client.instanceChunkTemplates[var6][var7][var8] = -1;
                        }
                    }
                }
            }
            var1.exportIndex();
            UserComparator8.xteaKeys = new int[var5][4];
            for (var6 = 0; var6 < var5; ++var6) {
                for (var7 = 0; var7 < 4; ++var7) {
                    UserComparator8.xteaKeys[var6][var7] = var1.readInt();
                }
            }
            WorldMapLabel.regions = new int[var5];
            Varcs.regionMapArchiveIds = new int[var5];
            WorldMapData_0.regionLandArchiveIds = new int[var5];
            Friend.regionLandArchives = new byte[var5][];
            ReflectionCheck.regionMapArchives = new byte[var5][];
            var5 = 0;
            for (var6 = 0; var6 < 4; ++var6) {
                for (var7 = 0; var7 < 13; ++var7) {
                    for (var8 = 0; var8 < 13; ++var8) {
                        var9 = Client.instanceChunkTemplates[var6][var7][var8];
                        if (var9 != (-1)) {
                            int var10 = (var9 >> 14) & 1023;
                            int var11 = (var9 >> 3) & 2047;
                            int var12 = ((var10 / 8) << 8) + (var11 / 8);
                            int var13;
                            for (var13 = 0; var13 < var5; ++var13) {
                                if (WorldMapLabel.regions[var13] == var12) {
                                    var12 = -1;
                                    break;
                                }
                            }
                            if (var12 != (-1)) {
                                WorldMapLabel.regions[var5] = var12;
                                var13 = (var12 >> 8) & 255;
                                int var14 = var12 & 255;
                                Varcs.regionMapArchiveIds[var5] = Client.archive5.getGroupId((("m" + var13) + "_") + var14);
                                WorldMapData_0.regionLandArchiveIds[var5] = Client.archive5.getGroupId((("l" + var13) + "_") + var14);
                                ++var5;
                            }
                        }
                    }
                }
            }
            class265.method5030(var2, var3, !var15);
        }
    }
}