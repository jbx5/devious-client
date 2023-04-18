import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("az")
@Implements("DevicePcmPlayerProvider")
public class DevicePcmPlayerProvider implements class50 {
   @ObfuscatedName("dk")
   @ObfuscatedSignature(
      descriptor = "[Ltc;"
   )
   @Export("worldSelectArrows")
   static IndexedSprite[] worldSelectArrows;
   @ObfuscatedName("fd")
   @ObfuscatedSignature(
      descriptor = "Lnd;"
   )
   static Archive field117;
   @ObfuscatedName("gi")
   @ObfuscatedGetter(
      intValue = 1874484435
   )
   static int field118;

   DevicePcmPlayerProvider() {
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)Lbu;",
      garbageValue = "1183188913"
   )
   @Export("player")
   public PcmPlayer player() {
      return new DevicePcmPlayer();
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIFFFIIIIIIIIIIIIIS)V",
      garbageValue = "16635"
   )
   static void method322(int var0, int var1, int var2, int var3, int var4, int var5, float var6, float var7, float var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20, int var21) {
      Rasterizer3D.field2519.vmethod5007(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21);
   }

   @ObfuscatedName("hs")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1827465123"
   )
   @Export("load")
   static void load() {
      int var12;
      if (Client.titleLoadingStage == 0) {
         class31.scene = new Scene(4, 104, 104, Tiles.Tiles_heights);

         for(var12 = 0; var12 < 4; ++var12) {
            Client.collisionMaps[var12] = new CollisionMap(104, 104);
         }

         UrlRequester.sceneMinimapSprite = new SpritePixels(512, 512);
         Login.Login_loadingText = "Starting game engine...";
         Login.Login_loadingPercent = 5;
         Client.titleLoadingStage = 20;
      } else if (Client.titleLoadingStage == 20) {
         Login.Login_loadingText = "Prepared visibility map";
         Login.Login_loadingPercent = 10;
         Client.titleLoadingStage = 30;
      } else if (Client.titleLoadingStage == 30) {
         field117 = WorldMapLabelSize.newArchive(0, false, true, true, false);
         GameBuild.archive7 = WorldMapLabelSize.newArchive(1, false, true, true, false);
         class85.archive2 = WorldMapLabelSize.newArchive(2, true, false, true, false);
         class85.archive4 = WorldMapLabelSize.newArchive(3, false, true, true, false);
         class426.field4687 = WorldMapLabelSize.newArchive(4, false, true, true, false);
         GrandExchangeOfferTotalQuantityComparator.archive9 = WorldMapLabelSize.newArchive(5, true, true, true, false);
         class399.archive6 = WorldMapLabelSize.newArchive(6, true, true, true, false);
         FloorUnderlayDefinition.archive11 = WorldMapLabelSize.newArchive(7, false, true, true, false);
         class452.archive8 = WorldMapLabelSize.newArchive(8, false, true, true, false);
         WorldMapLabelSize.field2868 = WorldMapLabelSize.newArchive(9, false, true, true, false);
         NetFileRequest.archive10 = WorldMapLabelSize.newArchive(10, false, true, true, false);
         class195.field2101 = WorldMapLabelSize.newArchive(11, false, true, true, false);
         class126.archive12 = WorldMapLabelSize.newArchive(12, false, true, true, false);
         class128.archive13 = WorldMapLabelSize.newArchive(13, true, false, true, false);
         class230.archive14 = WorldMapLabelSize.newArchive(14, false, true, true, false);
         class126.archive15 = WorldMapLabelSize.newArchive(15, false, true, true, false);
         class168.archive17 = WorldMapLabelSize.newArchive(17, true, true, true, false);
         GrandExchangeOfferUnitPriceComparator.archive18 = WorldMapLabelSize.newArchive(18, false, true, true, false);
         class28.archive19 = WorldMapLabelSize.newArchive(19, false, true, true, false);
         class205.archive20 = WorldMapLabelSize.newArchive(20, false, true, true, false);
         PcmPlayer.field316 = WorldMapLabelSize.newArchive(21, false, true, true, true);
         Login.Login_loadingText = "Connecting to update server";
         Login.Login_loadingPercent = 20;
         Client.titleLoadingStage = 40;
      } else if (Client.titleLoadingStage != 40) {
         if (Client.titleLoadingStage == 45) {
            boolean var25 = !Client.isLowDetail;
            PcmPlayer.field306 = 22050;
            PcmPlayer.PcmPlayer_stereo = var25;
            UrlRequest.field1410 = 2;
            MidiPcmStream var23 = new MidiPcmStream();
            var23.method5772(9, 128);
            class28.pcmPlayer0 = class148.method3290(GameEngine.taskHandler, 0, 22050);
            class28.pcmPlayer0.setStream(var23);
            ParamComposition.method3900(class126.archive15, class230.archive14, class426.field4687, var23);
            HorizontalAlignment.pcmPlayer1 = class148.method3290(GameEngine.taskHandler, 1, 2048);
            class130.pcmStreamMixer = new PcmStreamMixer();
            HorizontalAlignment.pcmPlayer1.setStream(class130.pcmStreamMixer);
            WorldMapSectionType.decimator = new Decimator(22050, PcmPlayer.field306 * 586337296);
            Login.Login_loadingText = "Prepared sound engine";
            Login.Login_loadingPercent = 35;
            Client.titleLoadingStage = 50;
            class357.WorldMapElement_fonts = new Fonts(class452.archive8, class128.archive13);
         } else if (Client.titleLoadingStage == 50) {
            var12 = FontName.method8671().length;
            Client.fontsMap = class357.WorldMapElement_fonts.createMap(FontName.method8671());
            if (Client.fontsMap.size() < var12) {
               Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var12 + "%";
               Login.Login_loadingPercent = 40;
            } else {
               Language.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
               WallDecoration.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
               class137.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
               UserComparator10.platformInfo = Client.platformInfoProvider.get();
               Login.Login_loadingText = "Loaded fonts";
               Login.Login_loadingPercent = 40;
               Client.titleLoadingStage = 60;
            }
         } else {
            int var3;
            int var4;
            Archive var13;
            if (Client.titleLoadingStage == 60) {
               var13 = NetFileRequest.archive10;
               Archive var16 = class452.archive8;
               var3 = 0;
               String[] var24 = Login.field924;

               int var17;
               String var22;
               for(var17 = 0; var17 < var24.length; ++var17) {
                  var22 = var24[var17];
                  if (var13.tryLoadFileByNames(var22, "")) {
                     ++var3;
                  }
               }

               var24 = Login.field925;

               for(var17 = 0; var17 < var24.length; ++var17) {
                  var22 = var24[var17];
                  if (var16.tryLoadFileByNames(var22, "")) {
                     ++var3;
                  }
               }

               var24 = Login.field926;

               for(var17 = 0; var17 < var24.length; ++var17) {
                  var22 = var24[var17];
                  if (var16.getGroupId(var22) != -1 && var16.tryLoadFileByNames(var22, "")) {
                     ++var3;
                  }
               }

               var4 = GrandExchangeOfferOwnWorldComparator.method1229(class452.archive8);
               if (var3 < var4) {
                  Login.Login_loadingText = "Loading title screen - " + var3 * 100 / var4 + "%";
                  Login.Login_loadingPercent = 50;
               } else {
                  Login.Login_loadingText = "Loaded title screen";
                  Login.Login_loadingPercent = 50;
                  class138.updateGameState(5);
                  Client.titleLoadingStage = 70;
               }
            } else if (Client.titleLoadingStage == 70) {
               if (!class85.archive2.isFullyLoaded()) {
                  Login.Login_loadingText = "Loading config - " + class85.archive2.loadPercent() + "%";
                  Login.Login_loadingPercent = 60;
               } else if (!PcmPlayer.field316.isFullyLoaded()) {
                  Login.Login_loadingText = "Loading config - " + (80 + class126.archive12.loadPercent() / 6) + "%";
                  Login.Login_loadingPercent = 60;
               } else {
                  EnumComposition.method3738(class85.archive2);
                  World.method1828(class85.archive2);
                  Client.method1770(class85.archive2, FloorUnderlayDefinition.archive11);
                  Interpreter.method1987(class85.archive2, FloorUnderlayDefinition.archive11, Client.isLowDetail);
                  MenuAction.method2040(class85.archive2, FloorUnderlayDefinition.archive11);
                  class85.method2277(class85.archive2);
                  Archive var20 = class85.archive2;
                  var13 = FloorUnderlayDefinition.archive11;
                  boolean var21 = Client.isMembersWorld;
                  Font var14 = Language.fontPlain11;
                  class355.ItemDefinition_archive = var20;
                  ItemComposition.ItemDefinition_modelArchive = var13;
                  FileSystem.ItemDefinition_inMembersWorld = var21;
                  MouseRecorder.ItemDefinition_fileCount = class355.ItemDefinition_archive.getGroupFileCount(10);
                  class124.ItemDefinition_fontPlain11 = var14;
                  class152.method3374(class85.archive2, field117, GameBuild.archive7);
                  BuddyRankComparator.method2958(class85.archive2, FloorUnderlayDefinition.archive11);
                  MenuAction.method2043(class85.archive2);
                  Archive var15 = class85.archive2;
                  VarpDefinition.VarpDefinition_archive = var15;
                  VarpDefinition.field1908 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16);
                  class4.method21(class85.archive4, FloorUnderlayDefinition.archive11, class452.archive8, class128.archive13);
                  NPC.method2627(class85.archive2);
                  MidiPcmStream.method5891(class85.archive2);
                  Archive var5 = class85.archive2;
                  class294.VarcInt_archive = var5;
                  Archive var6 = class85.archive2;
                  class195.method3873(class85.archive2);
                  ReflectionCheck.method724(class85.archive2);
                  class327.method6574(class85.archive2);
                  class160.HitSplatDefinition_cachedSprites = new class473(Client.field490, 54, ClanSettings.clientLanguage, class85.archive2);
                  MenuAction.HitSplatDefinition_cached = new class473(Client.field490, 47, ClanSettings.clientLanguage, class85.archive2);
                  class373.varcs = new Varcs();
                  Archive var7 = class85.archive2;
                  Archive var8 = class452.archive8;
                  Archive var9 = class128.archive13;
                  HitSplatDefinition.HitSplatDefinition_archive = var7;
                  HitSplatDefinition.field2131 = var8;
                  HitSplatDefinition.HitSplatDefinition_fontsArchive = var9;
                  Archive var10 = class85.archive2;
                  Archive var11 = class452.archive8;
                  HealthBarDefinition.HealthBarDefinition_archive = var10;
                  HealthBarDefinition.field1960 = var11;
                  class33.method509(class85.archive2, class452.archive8);
                  Login.Login_loadingText = "Loaded config";
                  Login.Login_loadingPercent = 60;
                  Client.titleLoadingStage = 80;
               }
            } else if (Client.titleLoadingStage == 80) {
               var12 = 0;
               if (ChatChannel.compass == null) {
                  ChatChannel.compass = class484.SpriteBuffer_getSprite(class452.archive8, Varcs.spriteIds.compass, 0);
               } else {
                  ++var12;
               }

               if (LoginScreenAnimation.redHintArrowSprite == null) {
                  LoginScreenAnimation.redHintArrowSprite = class484.SpriteBuffer_getSprite(class452.archive8, Varcs.spriteIds.field4636, 0);
               } else {
                  ++var12;
               }

               if (class333.mapSceneSprites == null) {
                  class333.mapSceneSprites = class68.method2030(class452.archive8, Varcs.spriteIds.mapScenes, 0);
               } else {
                  ++var12;
               }

               if (class36.headIconPkSprites == null) {
                  class36.headIconPkSprites = UserComparator3.method2923(class452.archive8, Varcs.spriteIds.headIconsPk, 0);
               } else {
                  ++var12;
               }

               if (class425.headIconPrayerSprites == null) {
                  class425.headIconPrayerSprites = UserComparator3.method2923(class452.archive8, Varcs.spriteIds.field4644, 0);
               } else {
                  ++var12;
               }

               if (KitDefinition.headIconHintSprites == null) {
                  KitDefinition.headIconHintSprites = UserComparator3.method2923(class452.archive8, Varcs.spriteIds.field4641, 0);
               } else {
                  ++var12;
               }

               if (Players.mapMarkerSprites == null) {
                  Players.mapMarkerSprites = UserComparator3.method2923(class452.archive8, Varcs.spriteIds.field4642, 0);
               } else {
                  ++var12;
               }

               if (class173.crossSprites == null) {
                  class173.crossSprites = UserComparator3.method2923(class452.archive8, Varcs.spriteIds.field4640, 0);
               } else {
                  ++var12;
               }

               if (class477.mapDotSprites == null) {
                  class477.mapDotSprites = UserComparator3.method2923(class452.archive8, Varcs.spriteIds.field4643, 0);
               } else {
                  ++var12;
               }

               if (HealthBar.scrollBarSprites == null) {
                  HealthBar.scrollBarSprites = class68.method2030(class452.archive8, Varcs.spriteIds.field4645, 0);
               } else {
                  ++var12;
               }

               if (class31.modIconSprites == null) {
                  class31.modIconSprites = class68.method2030(class452.archive8, Varcs.spriteIds.field4637, 0);
               } else {
                  ++var12;
               }

               if (var12 < 11) {
                  Login.Login_loadingText = "Loading sprites - " + var12 * 100 / 12 + "%";
                  Login.Login_loadingPercent = 70;
               } else {
                  AbstractFont.AbstractFont_modIconSprites = class31.modIconSprites;
                  LoginScreenAnimation.redHintArrowSprite.normalize();
                  int var1 = (int)(Math.random() * 21.0) - 10;
                  int var2 = (int)(Math.random() * 21.0) - 10;
                  var3 = (int)(Math.random() * 21.0) - 10;
                  var4 = (int)(Math.random() * 41.0) - 20;
                  class333.mapSceneSprites[0].shiftColors(var4 + var1, var4 + var2, var3 + var4);
                  Login.Login_loadingText = "Loaded sprites";
                  Login.Login_loadingPercent = 70;
                  Client.titleLoadingStage = 90;
               }
            } else if (Client.titleLoadingStage == 90) {
               if (!WorldMapLabelSize.field2868.isFullyLoaded()) {
                  Login.Login_loadingText = "Loading textures - " + "0%";
                  Login.Login_loadingPercent = 90;
               } else {
                  class7.textureProvider = new TextureProvider(WorldMapLabelSize.field2868, class452.archive8, 20, class20.clientPreferences.method2459(), Client.isLowDetail ? 64 : 128);
                  TextureProvider var19 = class7.textureProvider;
                  Rasterizer3D.field2514.Rasterizer3D_textureLoader = var19;
                  class18.method285(class20.clientPreferences.method2459());
                  Client.titleLoadingStage = 100;
               }
            } else if (Client.titleLoadingStage == 100) {
               var12 = class7.textureProvider.getLoadedPercentage();
               if (var12 < 100) {
                  Login.Login_loadingText = "Loading textures - " + var12 + "%";
                  Login.Login_loadingPercent = 90;
               } else {
                  Login.Login_loadingText = "Loaded textures";
                  Login.Login_loadingPercent = 90;
                  Client.titleLoadingStage = 110;
               }
            } else if (Client.titleLoadingStage == 110) {
               UserComparator6.mouseRecorder = new MouseRecorder();
               GameEngine.taskHandler.newThreadTask(UserComparator6.mouseRecorder, 10);
               Login.Login_loadingText = "Loaded input handler";
               Login.Login_loadingPercent = 92;
               Client.titleLoadingStage = 120;
            } else if (Client.titleLoadingStage == 120) {
               if (!NetFileRequest.archive10.tryLoadFileByNames("huffman", "")) {
                  Login.Login_loadingText = "Loading wordpack - " + 0 + "%";
                  Login.Login_loadingPercent = 94;
               } else {
                  Huffman var18 = new Huffman(NetFileRequest.archive10.takeFileByNames("huffman", ""));
                  class154.method3385(var18);
                  Login.Login_loadingText = "Loaded wordpack";
                  Login.Login_loadingPercent = 94;
                  Client.titleLoadingStage = 130;
               }
            } else if (Client.titleLoadingStage == 130) {
               if (!class85.archive4.isFullyLoaded()) {
                  Login.Login_loadingText = "Loading interfaces - " + class85.archive4.loadPercent() * 4 / 5 + "%";
                  Login.Login_loadingPercent = 96;
               } else if (!class126.archive12.isFullyLoaded()) {
                  Login.Login_loadingText = "Loading interfaces - " + (80 + class126.archive12.loadPercent() / 6) + "%";
                  Login.Login_loadingPercent = 96;
               } else if (!class128.archive13.isFullyLoaded()) {
                  Login.Login_loadingText = "Loading interfaces - " + (96 + class128.archive13.loadPercent() / 50) + "%";
                  Login.Login_loadingPercent = 96;
               } else {
                  Login.Login_loadingText = "Loaded interfaces";
                  Login.Login_loadingPercent = 98;
                  if (class126.archive12.isValidFileName("version.dat", "")) {
                     Buffer var0 = new Buffer(class126.archive12.takeFileByNames("version.dat", ""));
                     var0.readUnsignedShort();
                  }

                  Client.titleLoadingStage = 140;
               }
            } else if (Client.titleLoadingStage == 140) {
               Login.Login_loadingPercent = 100;
               if (class28.archive19.getGroupCount() > 0 && !class28.archive19.tryLoadGroupByName(WorldMapCacheName.field3054.name)) {
                  Login.Login_loadingText = "Loading world map - " + class28.archive19.groupLoadPercentByName(WorldMapCacheName.field3054.name) / 10 + "%";
               } else {
                  if (class126.worldMap == null) {
                     class126.worldMap = new WorldMap();
                     class126.worldMap.init(class28.archive19, GrandExchangeOfferUnitPriceComparator.archive18, class205.archive20, class137.fontBold12, Client.fontsMap, class333.mapSceneSprites);
                  }

                  Login.Login_loadingText = "Loaded world map";
                  Client.titleLoadingStage = 150;
               }
            } else if (Client.titleLoadingStage == 150) {
               class138.updateGameState(10);
            }
         }
      } else {
         var12 = 0;
         var12 += field117.percentage() * 4 / 100;
         var12 += GameBuild.archive7.percentage() * 4 / 100;
         var12 += class85.archive2.percentage() * 2 / 100;
         var12 += class85.archive4.percentage() * 2 / 100;
         var12 += class426.field4687.percentage() * 6 / 100;
         var12 += GrandExchangeOfferTotalQuantityComparator.archive9.percentage() * 4 / 100;
         var12 += class399.archive6.percentage() * 2 / 100;
         var12 += FloorUnderlayDefinition.archive11.percentage() * 55 / 100;
         var12 += class452.archive8.percentage() * 2 / 100;
         var12 += WorldMapLabelSize.field2868.percentage() * 2 / 100;
         var12 += NetFileRequest.archive10.percentage() * 2 / 100;
         var12 += class195.field2101.percentage() * 2 / 100;
         var12 += class126.archive12.percentage() * 2 / 100;
         var12 += class128.archive13.percentage() * 2 / 100;
         var12 += class230.archive14.percentage() * 2 / 100;
         var12 += class126.archive15.percentage() * 2 / 100;
         var12 += class28.archive19.percentage() / 100;
         var12 += GrandExchangeOfferUnitPriceComparator.archive18.percentage() / 100;
         var12 += class205.archive20.percentage() / 100;
         var12 += PcmPlayer.field316.percentage() / 100;
         var12 += class168.archive17.method6635() && class168.archive17.isFullyLoaded() ? 1 : 0;
         if (var12 != 100) {
            if (var12 != 0) {
               Login.Login_loadingText = "Checking for updates - " + var12 + "%";
            }

            Login.Login_loadingPercent = 30;
         } else {
            UserComparator5.method2920(field117, "Animations");
            UserComparator5.method2920(GameBuild.archive7, "Skeletons");
            UserComparator5.method2920(class426.field4687, "Sound FX");
            UserComparator5.method2920(GrandExchangeOfferTotalQuantityComparator.archive9, "Maps");
            UserComparator5.method2920(class399.archive6, "Music Tracks");
            UserComparator5.method2920(FloorUnderlayDefinition.archive11, "Models");
            UserComparator5.method2920(class452.archive8, "Sprites");
            UserComparator5.method2920(class195.field2101, "Music Jingles");
            UserComparator5.method2920(class230.archive14, "Music Samples");
            UserComparator5.method2920(class126.archive15, "Music Patches");
            UserComparator5.method2920(class28.archive19, "World Map");
            UserComparator5.method2920(GrandExchangeOfferUnitPriceComparator.archive18, "World Map Geography");
            UserComparator5.method2920(class205.archive20, "World Map Ground");
            Varcs.spriteIds = new GraphicsDefaults();
            Varcs.spriteIds.decode(class168.archive17);
            Login.Login_loadingText = "Loaded update list";
            Login.Login_loadingPercent = 30;
            Client.titleLoadingStage = 45;
         }
      }
   }

   @ObfuscatedName("oz")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "329326313"
   )
   static void method323(int var0) {
      SequenceDefinition var1 = ItemContainer.SequenceDefinition_get(var0);
      if (var1.isCachedModelIdSet()) {
         if (class20.method304(var1.SequenceDefinition_cachedModelId) == 2) {
            Client.field782.add(var1.SequenceDefinition_cachedModelId);
         }

      }
   }
}
