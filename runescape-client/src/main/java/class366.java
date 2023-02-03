import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ne")
public final class class366 {
   @ObfuscatedName("f")
   @Export("base37Table")
   public static final char[] base37Table = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
   @ObfuscatedName("w")
   static long[] field4373 = new long[12];
   @ObfuscatedName("jv")
   @ObfuscatedGetter(
      intValue = -689139107
   )
   @Export("cameraZ")
   static int cameraZ;
   @ObfuscatedName("pi")
   @ObfuscatedGetter(
      intValue = 1745792545
   )
   static int field4370;

   static {
      for(int var0 = 0; var0 < field4373.length; ++var0) {
         field4373[var0] = (long)Math.pow(37.0, (double)var0);
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "-77"
   )
   public static int method7028(int var0) {
      var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
      var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
      var0 = var0 + (var0 >>> 4) & 252645135;
      var0 += var0 >>> 8;
      var0 += var0 >>> 16;
      return var0 & 255;
   }

   @ObfuscatedName("fw")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "8"
   )
   @Export("load")
   static void load() {
      int var22;
      if (Client.titleLoadingStage == 0) {
         WorldMapAreaData.scene = new Scene(4, 104, 104, Tiles.Tiles_heights);

         for(var22 = 0; var22 < 4; ++var22) {
            Client.collisionMaps[var22] = new CollisionMap(104, 104);
         }

         class31.sceneMinimapSprite = new SpritePixels(512, 512);
         Login.Login_loadingText = "Starting game engine...";
         Login.Login_loadingPercent = 5;
         Client.titleLoadingStage = 20;
      } else if (Client.titleLoadingStage == 20) {
         Login.Login_loadingText = "Prepared visibility map";
         Login.Login_loadingPercent = 10;
         Client.titleLoadingStage = 30;
      } else if (Client.titleLoadingStage == 30) {
         class13.field70 = ReflectionCheck.newArchive(0, false, true, true, false);
         FriendsChat.archive7 = ReflectionCheck.newArchive(1, false, true, true, false);
         class372.archive2 = ReflectionCheck.newArchive(2, true, false, true, false);
         class144.archive4 = ReflectionCheck.newArchive(3, false, true, true, false);
         DynamicObject.field1001 = ReflectionCheck.newArchive(4, false, true, true, false);
         NetCache.archive9 = ReflectionCheck.newArchive(5, true, true, true, false);
         class153.archive6 = ReflectionCheck.newArchive(6, true, true, true, false);
         class151.archive11 = ReflectionCheck.newArchive(7, false, true, true, false);
         WorldMapEvent.archive8 = ReflectionCheck.newArchive(8, false, true, true, false);
         class148.field1704 = ReflectionCheck.newArchive(9, false, true, true, false);
         ApproximateRouteStrategy.archive10 = ReflectionCheck.newArchive(10, false, true, true, false);
         MusicPatchNode.field3448 = ReflectionCheck.newArchive(11, false, true, true, false);
         class12.archive12 = ReflectionCheck.newArchive(12, false, true, true, false);
         PendingSpawn.archive13 = ReflectionCheck.newArchive(13, true, false, true, false);
         class174.archive14 = ReflectionCheck.newArchive(14, false, true, true, false);
         class286.archive15 = ReflectionCheck.newArchive(15, false, true, true, false);
         CollisionMap.archive17 = ReflectionCheck.newArchive(17, true, true, true, false);
         class419.archive18 = ReflectionCheck.newArchive(18, false, true, true, false);
         GameEngine.archive19 = ReflectionCheck.newArchive(19, false, true, true, false);
         class27.archive20 = ReflectionCheck.newArchive(20, false, true, true, false);
         Canvas.field132 = ReflectionCheck.newArchive(21, false, true, true, true);
         Login.Login_loadingText = "Connecting to update server";
         Login.Login_loadingPercent = 20;
         Client.titleLoadingStage = 40;
      } else if (Client.titleLoadingStage == 40) {
         byte var36 = 0;
         var22 = var36 + class13.field70.percentage() * 4 / 100;
         var22 += FriendsChat.archive7.percentage() * 4 / 100;
         var22 += class372.archive2.percentage() * 2 / 100;
         var22 += class144.archive4.percentage() * 2 / 100;
         var22 += DynamicObject.field1001.percentage() * 6 / 100;
         var22 += NetCache.archive9.percentage() * 4 / 100;
         var22 += class153.archive6.percentage() * 2 / 100;
         var22 += class151.archive11.percentage() * 55 / 100;
         var22 += WorldMapEvent.archive8.percentage() * 2 / 100;
         var22 += class148.field1704.percentage() * 2 / 100;
         var22 += ApproximateRouteStrategy.archive10.percentage() * 2 / 100;
         var22 += MusicPatchNode.field3448.percentage() * 2 / 100;
         var22 += class12.archive12.percentage() * 2 / 100;
         var22 += PendingSpawn.archive13.percentage() * 2 / 100;
         var22 += class174.archive14.percentage() * 2 / 100;
         var22 += class286.archive15.percentage() * 2 / 100;
         var22 += GameEngine.archive19.percentage() / 100;
         var22 += class419.archive18.percentage() / 100;
         var22 += class27.archive20.percentage() / 100;
         var22 += Canvas.field132.percentage() / 100;
         var22 += CollisionMap.archive17.method6473() && CollisionMap.archive17.isFullyLoaded() ? 1 : 0;
         if (var22 != 100) {
            if (var22 != 0) {
               Login.Login_loadingText = "Checking for updates - " + var22 + "%";
            }

            Login.Login_loadingPercent = 30;
         } else {
            WorldMapSprite.method5337(class13.field70, "Animations");
            WorldMapSprite.method5337(FriendsChat.archive7, "Skeletons");
            WorldMapSprite.method5337(DynamicObject.field1001, "Sound FX");
            WorldMapSprite.method5337(NetCache.archive9, "Maps");
            WorldMapSprite.method5337(class153.archive6, "Music Tracks");
            WorldMapSprite.method5337(class151.archive11, "Models");
            WorldMapSprite.method5337(WorldMapEvent.archive8, "Sprites");
            WorldMapSprite.method5337(MusicPatchNode.field3448, "Music Jingles");
            WorldMapSprite.method5337(class174.archive14, "Music Samples");
            WorldMapSprite.method5337(class286.archive15, "Music Patches");
            WorldMapSprite.method5337(GameEngine.archive19, "World Map");
            WorldMapSprite.method5337(class419.archive18, "World Map Geography");
            WorldMapSprite.method5337(class27.archive20, "World Map Ground");
            ScriptFrame.spriteIds = new GraphicsDefaults();
            ScriptFrame.spriteIds.decode(CollisionMap.archive17);
            Login.Login_loadingText = "Loaded update list";
            Login.Login_loadingPercent = 30;
            Client.titleLoadingStage = 45;
         }
      } else {
         Archive var2;
         Archive var26;
         Archive var31;
         if (Client.titleLoadingStage == 45) {
            class348.method6767(22050, !Client.isLowDetail, 2);
            MidiPcmStream var30 = new MidiPcmStream();
            var30.method5622(9, 128);
            SoundSystem.pcmPlayer0 = ObjectSound.method1911(GameEngine.taskHandler, 0, 22050);
            SoundSystem.pcmPlayer0.setStream(var30);
            var31 = class286.archive15;
            var2 = class174.archive14;
            var26 = DynamicObject.field1001;
            class290.musicPatchesArchive = var31;
            class290.musicSamplesArchive = var2;
            class290.soundEffectsArchive = var26;
            class290.midiPcmStream = var30;
            WorldMapSectionType.pcmPlayer1 = ObjectSound.method1911(GameEngine.taskHandler, 1, 2048);
            class209.pcmStreamMixer = new PcmStreamMixer();
            WorldMapSectionType.pcmPlayer1.setStream(class209.pcmStreamMixer);
            class257.decimator = new Decimator(22050, class284.field3321);
            Login.Login_loadingText = "Prepared sound engine";
            Login.Login_loadingPercent = 35;
            Client.titleLoadingStage = 50;
            class165.WorldMapElement_fonts = new Fonts(WorldMapEvent.archive8, PendingSpawn.archive13);
         } else if (Client.titleLoadingStage == 50) {
            var22 = FontName.method8319().length;
            Client.fontsMap = class165.WorldMapElement_fonts.createMap(FontName.method8319());
            if (Client.fontsMap.size() < var22) {
               Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var22 + "%";
               Login.Login_loadingPercent = 40;
            } else {
               class276.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
               MenuAction.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
               class19.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
               UserComparator9.platformInfo = Client.platformInfoProvider.get();
               Login.Login_loadingText = "Loaded fonts";
               Login.Login_loadingPercent = 40;
               Client.titleLoadingStage = 60;
            }
         } else {
            int var3;
            if (Client.titleLoadingStage == 60) {
               var22 = WorldMapSectionType.method5295(ApproximateRouteStrategy.archive10, WorldMapEvent.archive8);
               var2 = WorldMapEvent.archive8;
               var3 = Login.field941.length + Login.field942.length;
               String[] var32 = Login.field902;

               for(int var34 = 0; var34 < var32.length; ++var34) {
                  String var35 = var32[var34];
                  if (var2.getGroupId(var35) != -1) {
                     ++var3;
                  }
               }

               if (var22 < var3) {
                  Login.Login_loadingText = "Loading title screen - " + var22 * 100 / var3 + "%";
                  Login.Login_loadingPercent = 50;
               } else {
                  Login.Login_loadingText = "Loaded title screen";
                  Login.Login_loadingPercent = 50;
                  class246.updateGameState(5);
                  Client.titleLoadingStage = 70;
               }
            } else if (Client.titleLoadingStage == 70) {
               if (!class372.archive2.isFullyLoaded()) {
                  Login.Login_loadingText = "Loading config - " + class372.archive2.loadPercent() + "%";
                  Login.Login_loadingPercent = 60;
               } else if (!Canvas.field132.isFullyLoaded()) {
                  Login.Login_loadingText = "Loading config - " + (80 + class12.archive12.loadPercent() / 6) + "%";
                  Login.Login_loadingPercent = 60;
               } else {
                  class88.method2412(class372.archive2);
                  Archive var29 = class372.archive2;
                  FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var29;
                  var31 = class372.archive2;
                  var2 = class151.archive11;
                  KitDefinition.KitDefinition_archive = var31;
                  KitDefinition.KitDefinition_modelsArchive = var2;
                  KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
                  var26 = class372.archive2;
                  Archive var4 = class151.archive11;
                  boolean var27 = Client.isLowDetail;
                  ObjectComposition.ObjectDefinition_archive = var26;
                  ObjectComposition.ObjectDefinition_modelsArchive = var4;
                  ObjectComposition.ObjectDefinition_isLowDetail = var27;
                  WorldMapSprite.method5338(class372.archive2, class151.archive11);
                  Archive var28 = class372.archive2;
                  StructComposition.StructDefinition_archive = var28;
                  Archive var33 = class372.archive2;
                  Archive var8 = class151.archive11;
                  boolean var9 = Client.isMembersWorld;
                  Font var10 = class276.fontPlain11;
                  class4.ItemDefinition_archive = var33;
                  ItemComposition.ItemDefinition_modelArchive = var8;
                  ItemComposition.ItemDefinition_inMembersWorld = var9;
                  ItemComposition.ItemDefinition_fileCount = class4.ItemDefinition_archive.getGroupFileCount(10);
                  class138.ItemDefinition_fontPlain11 = var10;
                  class6.method50(class372.archive2, class13.field70, FriendsChat.archive7);
                  Archive var11 = class372.archive2;
                  Archive var12 = class151.archive11;
                  SpotAnimationDefinition.SpotAnimationDefinition_archive = var11;
                  SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var12;
                  class9.method81(class372.archive2);
                  WorldMapIcon_0.method5264(class372.archive2);
                  Archive var13 = class144.archive4;
                  Archive var14 = class151.archive11;
                  Archive var15 = WorldMapEvent.archive8;
                  Archive var16 = PendingSpawn.archive13;
                  UserComparator8.Widget_archive = var13;
                  class145.field1689 = var14;
                  World.Widget_spritesArchive = var15;
                  Script.Widget_fontsArchive = var16;
                  WorldMapLabel.Widget_interfaceComponents = new Widget[UserComparator8.Widget_archive.getGroupCount()][];
                  class431.Widget_loadedInterfaces = new boolean[UserComparator8.Widget_archive.getGroupCount()];
                  Archive var17 = class372.archive2;
                  InvDefinition.InvDefinition_archive = var17;
                  class81.method2307(class372.archive2);
                  class68.method2074(class372.archive2);
                  class153.method3315(class372.archive2);
                  Archive var18 = class372.archive2;
                  ParamComposition.ParamDefinition_archive = var18;
                  DevicePcmPlayerProvider.method324(class372.archive2);
                  ObjectComposition.method3949(class372.archive2);
                  class491.HitSplatDefinition_cachedSprites = new class458(class134.field1606, 54, class36.clientLanguage, class372.archive2);
                  class208.HitSplatDefinition_cached = new class458(class134.field1606, 47, class36.clientLanguage, class372.archive2);
                  class9.varcs = new Varcs();
                  Archive var19 = class372.archive2;
                  Archive var20 = WorldMapEvent.archive8;
                  Archive var21 = PendingSpawn.archive13;
                  class498.HitSplatDefinition_archive = var19;
                  HitSplatDefinition.field2136 = var20;
                  HitSplatDefinition.HitSplatDefinition_fontsArchive = var21;
                  Login.method2166(class372.archive2, WorldMapEvent.archive8);
                  class85.method2337(class372.archive2, WorldMapEvent.archive8);
                  Login.Login_loadingText = "Loaded config";
                  Login.Login_loadingPercent = 60;
                  Client.titleLoadingStage = 80;
               }
            } else if (Client.titleLoadingStage == 80) {
               var22 = 0;
               if (SoundSystem.compass == null) {
                  SoundSystem.compass = BZip2State.SpriteBuffer_getSprite(WorldMapEvent.archive8, ScriptFrame.spriteIds.compass, 0);
               } else {
                  ++var22;
               }

               if (PacketBufferNode.redHintArrowSprite == null) {
                  PacketBufferNode.redHintArrowSprite = BZip2State.SpriteBuffer_getSprite(WorldMapEvent.archive8, ScriptFrame.spriteIds.field4621, 0);
               } else {
                  ++var22;
               }

               IndexedSprite[] var1;
               IndexedSprite[] var5;
               int var6;
               IndexedSprite var7;
               if (VarpDefinition.mapSceneSprites == null) {
                  var2 = WorldMapEvent.archive8;
                  var3 = ScriptFrame.spriteIds.mapScenes;
                  if (!Buffer.method8892(var2, var3, 0)) {
                     var1 = null;
                  } else {
                     var5 = new IndexedSprite[class488.SpriteBuffer_spriteCount];

                     for(var6 = 0; var6 < class488.SpriteBuffer_spriteCount; ++var6) {
                        var7 = var5[var6] = new IndexedSprite();
                        var7.width = class488.SpriteBuffer_spriteWidth;
                        var7.height = class488.SpriteBuffer_spriteHeight;
                        var7.xOffset = class488.SpriteBuffer_xOffsets[var6];
                        var7.yOffset = ApproximateRouteStrategy.SpriteBuffer_yOffsets[var6];
                        var7.subWidth = FriendsList.SpriteBuffer_spriteWidths[var6];
                        var7.subHeight = class132.SpriteBuffer_spriteHeights[var6];
                        var7.palette = class100.SpriteBuffer_spritePalette;
                        var7.pixels = class140.SpriteBuffer_pixels[var6];
                     }

                     class100.method2724();
                     var1 = var5;
                  }

                  VarpDefinition.mapSceneSprites = var1;
               } else {
                  ++var22;
               }

               if (ClanChannel.headIconPkSprites == null) {
                  ClanChannel.headIconPkSprites = AABB.method4629(WorldMapEvent.archive8, ScriptFrame.spriteIds.headIconsPk, 0);
               } else {
                  ++var22;
               }

               if (class367.headIconPrayerSprites == null) {
                  class367.headIconPrayerSprites = AABB.method4629(WorldMapEvent.archive8, ScriptFrame.spriteIds.field4616, 0);
               } else {
                  ++var22;
               }

               if (WorldMapSectionType.headIconHintSprites == null) {
                  WorldMapSectionType.headIconHintSprites = AABB.method4629(WorldMapEvent.archive8, ScriptFrame.spriteIds.field4617, 0);
               } else {
                  ++var22;
               }

               if (UserComparator6.mapMarkerSprites == null) {
                  UserComparator6.mapMarkerSprites = AABB.method4629(WorldMapEvent.archive8, ScriptFrame.spriteIds.field4620, 0);
               } else {
                  ++var22;
               }

               if (Calendar.crossSprites == null) {
                  Calendar.crossSprites = AABB.method4629(WorldMapEvent.archive8, ScriptFrame.spriteIds.field4619, 0);
               } else {
                  ++var22;
               }

               if (UrlRequest.mapDotSprites == null) {
                  UrlRequest.mapDotSprites = AABB.method4629(WorldMapEvent.archive8, ScriptFrame.spriteIds.field4622, 0);
               } else {
                  ++var22;
               }

               if (InvDefinition.scrollBarSprites == null) {
                  var2 = WorldMapEvent.archive8;
                  var3 = ScriptFrame.spriteIds.field4613;
                  if (!Buffer.method8892(var2, var3, 0)) {
                     var1 = null;
                  } else {
                     var5 = new IndexedSprite[class488.SpriteBuffer_spriteCount];

                     for(var6 = 0; var6 < class488.SpriteBuffer_spriteCount; ++var6) {
                        var7 = var5[var6] = new IndexedSprite();
                        var7.width = class488.SpriteBuffer_spriteWidth;
                        var7.height = class488.SpriteBuffer_spriteHeight;
                        var7.xOffset = class488.SpriteBuffer_xOffsets[var6];
                        var7.yOffset = ApproximateRouteStrategy.SpriteBuffer_yOffsets[var6];
                        var7.subWidth = FriendsList.SpriteBuffer_spriteWidths[var6];
                        var7.subHeight = class132.SpriteBuffer_spriteHeights[var6];
                        var7.palette = class100.SpriteBuffer_spritePalette;
                        var7.pixels = class140.SpriteBuffer_pixels[var6];
                     }

                     class100.method2724();
                     var1 = var5;
                  }

                  InvDefinition.scrollBarSprites = var1;
               } else {
                  ++var22;
               }

               if (PlayerType.modIconSprites == null) {
                  var2 = WorldMapEvent.archive8;
                  var3 = ScriptFrame.spriteIds.field4624;
                  if (!Buffer.method8892(var2, var3, 0)) {
                     var1 = null;
                  } else {
                     var5 = new IndexedSprite[class488.SpriteBuffer_spriteCount];

                     for(var6 = 0; var6 < class488.SpriteBuffer_spriteCount; ++var6) {
                        var7 = var5[var6] = new IndexedSprite();
                        var7.width = class488.SpriteBuffer_spriteWidth;
                        var7.height = class488.SpriteBuffer_spriteHeight;
                        var7.xOffset = class488.SpriteBuffer_xOffsets[var6];
                        var7.yOffset = ApproximateRouteStrategy.SpriteBuffer_yOffsets[var6];
                        var7.subWidth = FriendsList.SpriteBuffer_spriteWidths[var6];
                        var7.subHeight = class132.SpriteBuffer_spriteHeights[var6];
                        var7.palette = class100.SpriteBuffer_spritePalette;
                        var7.pixels = class140.SpriteBuffer_pixels[var6];
                     }

                     class100.method2724();
                     var1 = var5;
                  }

                  PlayerType.modIconSprites = var1;
               } else {
                  ++var22;
               }

               if (var22 < 11) {
                  Login.Login_loadingText = "Loading sprites - " + var22 * 100 / 12 + "%";
                  Login.Login_loadingPercent = 70;
               } else {
                  AbstractFont.AbstractFont_modIconSprites = PlayerType.modIconSprites;
                  PacketBufferNode.redHintArrowSprite.normalize();
                  int var23 = (int)(Math.random() * 21.0) - 10;
                  int var24 = (int)(Math.random() * 21.0) - 10;
                  var3 = (int)(Math.random() * 21.0) - 10;
                  int var25 = (int)(Math.random() * 41.0) - 20;
                  VarpDefinition.mapSceneSprites[0].shiftColors(var25 + var23, var25 + var24, var3 + var25);
                  Login.Login_loadingText = "Loaded sprites";
                  Login.Login_loadingPercent = 70;
                  Client.titleLoadingStage = 90;
               }
            } else if (Client.titleLoadingStage == 90) {
               if (!class148.field1704.isFullyLoaded()) {
                  Login.Login_loadingText = "Loading textures - " + "0%";
                  Login.Login_loadingPercent = 90;
               } else {
                  GameBuild.textureProvider = new TextureProvider(class148.field1704, WorldMapEvent.archive8, 20, PacketWriter.clientPreferences.method2557(), Client.isLowDetail ? 64 : 128);
                  Rasterizer3D.Rasterizer3D_setTextureLoader(GameBuild.textureProvider);
                  Rasterizer3D.Rasterizer3D_setBrightness(PacketWriter.clientPreferences.method2557());
                  Client.titleLoadingStage = 100;
               }
            } else if (Client.titleLoadingStage == 100) {
               var22 = GameBuild.textureProvider.getLoadedPercentage();
               if (var22 < 100) {
                  Login.Login_loadingText = "Loading textures - " + var22 + "%";
                  Login.Login_loadingPercent = 90;
               } else {
                  Login.Login_loadingText = "Loaded textures";
                  Login.Login_loadingPercent = 90;
                  Client.titleLoadingStage = 110;
               }
            } else if (Client.titleLoadingStage == 110) {
               class36.mouseRecorder = new MouseRecorder();
               GameEngine.taskHandler.newThreadTask(class36.mouseRecorder, 10);
               Login.Login_loadingText = "Loaded input handler";
               Login.Login_loadingPercent = 92;
               Client.titleLoadingStage = 120;
            } else if (Client.titleLoadingStage == 120) {
               if (!ApproximateRouteStrategy.archive10.tryLoadFileByNames("huffman", "")) {
                  Login.Login_loadingText = "Loading wordpack - " + 0 + "%";
                  Login.Login_loadingPercent = 94;
               } else {
                  Huffman var0 = new Huffman(ApproximateRouteStrategy.archive10.takeFileByNames("huffman", ""));
                  class312.huffman = var0;
                  Login.Login_loadingText = "Loaded wordpack";
                  Login.Login_loadingPercent = 94;
                  Client.titleLoadingStage = 130;
               }
            } else if (Client.titleLoadingStage == 130) {
               if (!class144.archive4.isFullyLoaded()) {
                  Login.Login_loadingText = "Loading interfaces - " + class144.archive4.loadPercent() * 4 / 5 + "%";
                  Login.Login_loadingPercent = 96;
               } else if (!class12.archive12.isFullyLoaded()) {
                  Login.Login_loadingText = "Loading interfaces - " + (80 + class12.archive12.loadPercent() / 6) + "%";
                  Login.Login_loadingPercent = 96;
               } else if (!PendingSpawn.archive13.isFullyLoaded()) {
                  Login.Login_loadingText = "Loading interfaces - " + (96 + PendingSpawn.archive13.loadPercent() / 50) + "%";
                  Login.Login_loadingPercent = 96;
               } else {
                  Login.Login_loadingText = "Loaded interfaces";
                  Login.Login_loadingPercent = 98;
                  Client.titleLoadingStage = 140;
               }
            } else if (Client.titleLoadingStage == 140) {
               Login.Login_loadingPercent = 100;
               if (!GameEngine.archive19.tryLoadGroupByName(WorldMapCacheName.field3013.name)) {
                  Login.Login_loadingText = "Loading world map - " + GameEngine.archive19.groupLoadPercentByName(WorldMapCacheName.field3013.name) / 10 + "%";
               } else {
                  if (GrandExchangeOfferUnitPriceComparator.worldMap == null) {
                     GrandExchangeOfferUnitPriceComparator.worldMap = new WorldMap();
                     GrandExchangeOfferUnitPriceComparator.worldMap.init(GameEngine.archive19, class419.archive18, class27.archive20, class19.fontBold12, Client.fontsMap, VarpDefinition.mapSceneSprites);
                  }

                  Login.Login_loadingText = "Loaded world map";
                  Client.titleLoadingStage = 150;
               }
            } else if (Client.titleLoadingStage == 150) {
               class246.updateGameState(10);
            }
         }
      }
   }
}
