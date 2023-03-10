import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lsp;"
   )
   static IndexedSprite field478;
   @ObfuscatedName("jw")
   @Export("regionLandArchives")
   static byte[][] regionLandArchives;
   @ObfuscatedName("ln")
   @ObfuscatedGetter(
      intValue = 1542416247
   )
   @Export("oculusOrbFocalPointX")
   static int oculusOrbFocalPointX;
   @ObfuscatedName("aj")
   @Export("filterWorlds")
   boolean filterWorlds;

   GrandExchangeOfferOwnWorldComparator() {
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lnv;Lnv;B)I",
      garbageValue = "-66"
   )
   @Export("compare_bridged")
   int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
      if (var2.world == var1.world) {
         return 0;
      } else {
         if (this.filterWorlds) {
            if (Client.worldId == var1.world) {
               return -1;
            }

            if (var2.world == Client.worldId) {
               return 1;
            }
         }

         return var1.world < var2.world ? -1 : 1;
      }
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   public int compare(Object var1, Object var2) {
      return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)[Lho;",
      garbageValue = "-870490677"
   )
   static HorizontalAlignment[] method1210() {
      return new HorizontalAlignment[]{HorizontalAlignment.field1977, HorizontalAlignment.field1975, HorizontalAlignment.HorizontalAlignment_centered};
   }

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "(ILcv;ZB)I",
      garbageValue = "11"
   )
   static int method1208(int var0, Script var1, boolean var2) {
      if (var0 == 6809) {
         int var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         ObjectComposition var4 = WallDecoration.getObjectDefinition(var3);
         Interpreter.Interpreter_stringStack[++HealthBar.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : "";
         return 1;
      } else {
         return 2;
      }
   }

   @ObfuscatedName("gi")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "780329650"
   )
   @Export("load")
   static void load() {
      int var26;
      if (Client.titleLoadingStage == 0) {
         class1.scene = new Scene(4, 104, 104, Tiles.Tiles_heights);

         for(var26 = 0; var26 < 4; ++var26) {
            Client.collisionMaps[var26] = new CollisionMap(104, 104);
         }

         class188.sceneMinimapSprite = new SpritePixels(512, 512);
         Login.Login_loadingText = "Starting game engine...";
         Login.Login_loadingPercent = 5;
         Client.titleLoadingStage = 20;
      } else if (Client.titleLoadingStage == 20) {
         Login.Login_loadingText = "Prepared visibility map";
         Login.Login_loadingPercent = 10;
         Client.titleLoadingStage = 30;
      } else if (Client.titleLoadingStage == 30) {
         UserComparator5.field1419 = class72.newArchive(0, false, true, true, false);
         class290.archive7 = class72.newArchive(1, false, true, true, false);
         class258.archive2 = class72.newArchive(2, true, false, true, false);
         class135.archive4 = class72.newArchive(3, false, true, true, false);
         class175.field1841 = class72.newArchive(4, false, true, true, false);
         ClientPreferences.archive9 = class72.newArchive(5, true, true, true, false);
         class308.archive6 = class72.newArchive(6, true, true, true, false);
         Clock.archive11 = class72.newArchive(7, false, true, true, false);
         class143.archive8 = class72.newArchive(8, false, true, true, false);
         class20.field113 = class72.newArchive(9, false, true, true, false);
         AABB.archive10 = class72.newArchive(10, false, true, true, false);
         class36.field239 = class72.newArchive(11, false, true, true, false);
         class167.archive12 = class72.newArchive(12, false, true, true, false);
         TextureProvider.archive13 = class72.newArchive(13, true, false, true, false);
         class90.archive14 = class72.newArchive(14, false, true, true, false);
         MusicPatchPcmStream.archive15 = class72.newArchive(15, false, true, true, false);
         class127.archive17 = class72.newArchive(17, true, true, true, false);
         class376.archive18 = class72.newArchive(18, false, true, true, false);
         MusicPatchNode.archive19 = class72.newArchive(19, false, true, true, false);
         class475.archive20 = class72.newArchive(20, false, true, true, false);
         class320.field3708 = class72.newArchive(21, false, true, true, true);
         Login.Login_loadingText = "Connecting to update server";
         Login.Login_loadingPercent = 20;
         Client.titleLoadingStage = 40;
      } else if (Client.titleLoadingStage != 40) {
         if (Client.titleLoadingStage == 45) {
            class98.method2629(22050, !Client.isLowDetail, 2);
            MidiPcmStream var31 = new MidiPcmStream();
            var31.method5530(9, 128);
            Interpreter.pcmPlayer0 = class128.method3014(GameEngine.taskHandler, 0, 22050);
            Interpreter.pcmPlayer0.setStream(var31);
            class288.method5482(MusicPatchPcmStream.archive15, class90.archive14, class175.field1841, var31);
            ViewportMouse.pcmPlayer1 = class128.method3014(GameEngine.taskHandler, 1, 2048);
            class323.pcmStreamMixer = new PcmStreamMixer();
            ViewportMouse.pcmPlayer1.setStream(class323.pcmStreamMixer);
            TaskHandler.decimator = new Decimator(22050, PcmPlayer.field292);
            Login.Login_loadingText = "Prepared sound engine";
            Login.Login_loadingPercent = 35;
            Client.titleLoadingStage = 50;
            AbstractSocket.WorldMapElement_fonts = new Fonts(class143.archive8, TextureProvider.archive13);
         } else if (Client.titleLoadingStage == 50) {
            var26 = FontName.method8254().length;
            Client.fontsMap = AbstractSocket.WorldMapElement_fonts.createMap(FontName.method8254());
            if (Client.fontsMap.size() < var26) {
               Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var26 + "%";
               Login.Login_loadingPercent = 40;
            } else {
               Calendar.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
               class420.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
               class7.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
               HealthBarUpdate.platformInfo = Client.platformInfoProvider.get();
               Login.Login_loadingText = "Loaded fonts";
               Login.Login_loadingPercent = 40;
               Client.titleLoadingStage = 60;
            }
         } else {
            int var1;
            if (Client.titleLoadingStage == 60) {
               var26 = class419.method7811(AABB.archive10, class143.archive8);
               var1 = class174.method3492(class143.archive8);
               if (var26 < var1) {
                  Login.Login_loadingText = "Loading title screen - " + var26 * 100 / var1 + "%";
                  Login.Login_loadingPercent = 50;
               } else {
                  Login.Login_loadingText = "Loaded title screen";
                  Login.Login_loadingPercent = 50;
                  class19.updateGameState(5);
                  Client.titleLoadingStage = 70;
               }
            } else if (Client.titleLoadingStage == 70) {
               if (!class258.archive2.isFullyLoaded()) {
                  Login.Login_loadingText = "Loading config - " + class258.archive2.loadPercent() + "%";
                  Login.Login_loadingPercent = 60;
               } else if (!class320.field3708.isFullyLoaded()) {
                  Login.Login_loadingText = "Loading config - " + (80 + class167.archive12.loadPercent() / 6) + "%";
                  Login.Login_loadingPercent = 60;
               } else {
                  class145.method3141(class258.archive2);
                  class16.method208(class258.archive2);
                  Archive var30 = class258.archive2;
                  Archive var27 = Clock.archive11;
                  GrandExchangeOfferTotalQuantityComparator.KitDefinition_archive = var30;
                  KitDefinition.KitDefinition_modelsArchive = var27;
                  KitDefinition.KitDefinition_fileCount = GrandExchangeOfferTotalQuantityComparator.KitDefinition_archive.getGroupFileCount(3);
                  Archive var28 = class258.archive2;
                  Archive var29 = Clock.archive11;
                  boolean var32 = Client.isLowDetail;
                  ObjectComposition.ObjectDefinition_archive = var28;
                  ObjectComposition.ObjectDefinition_modelsArchive = var29;
                  ObjectComposition.ObjectDefinition_isLowDetail = var32;
                  Archive var5 = class258.archive2;
                  Archive var6 = Clock.archive11;
                  NPCComposition.NpcDefinition_archive = var5;
                  NPCComposition.field1988 = var6;
                  class137.method3086(class258.archive2);
                  Archive var7 = class258.archive2;
                  Archive var8 = Clock.archive11;
                  boolean var9 = Client.isMembersWorld;
                  Font var10 = Calendar.fontPlain11;
                  class290.ItemDefinition_archive = var7;
                  ItemComposition.ItemDefinition_modelArchive = var8;
                  VarcInt.ItemDefinition_inMembersWorld = var9;
                  ChatChannel.ItemDefinition_fileCount = class290.ItemDefinition_archive.getGroupFileCount(10);
                  ItemComposition.ItemDefinition_fontPlain11 = var10;
                  Archive var11 = class258.archive2;
                  Archive var12 = UserComparator5.field1419;
                  Archive var13 = class290.archive7;
                  HealthBar.SequenceDefinition_archive = var11;
                  SequenceDefinition.SequenceDefinition_animationsArchive = var12;
                  SequenceDefinition.SequenceDefinition_skeletonsArchive = var13;
                  Archive var14 = class258.archive2;
                  Archive var15 = Clock.archive11;
                  SpotAnimationDefinition.SpotAnimationDefinition_archive = var14;
                  SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var15;
                  class248.method5135(class258.archive2);
                  WorldMapData_1.method5111(class258.archive2);
                  class123.method2911(class135.archive4, Clock.archive11, class143.archive8, TextureProvider.archive13);
                  UserComparator4.method2842(class258.archive2);
                  PlayerCompositionColorTextureOverride.method3538(class258.archive2);
                  Archive var16 = class258.archive2;
                  VarcInt.VarcInt_archive = var16;
                  Archive var17 = class258.archive2;
                  Archive var18 = class258.archive2;
                  class368.ParamDefinition_archive = var18;
                  Archive var19 = class258.archive2;
                  DbTableType.field4874 = var19;
                  Archive var20 = class258.archive2;
                  DbRowType.field4881 = var20;
                  KitDefinition.HitSplatDefinition_cachedSprites = new class462(DbTableType.field4870, 54, class69.clientLanguage, class258.archive2);
                  Messages.HitSplatDefinition_cached = new class462(DbTableType.field4870, 47, class69.clientLanguage, class258.archive2);
                  class248.varcs = new Varcs();
                  Archive var21 = class258.archive2;
                  Archive var22 = class143.archive8;
                  Archive var23 = TextureProvider.archive13;
                  class102.HitSplatDefinition_archive = var21;
                  HitSplatDefinition.field2101 = var22;
                  SecureRandomFuture.HitSplatDefinition_fontsArchive = var23;
                  Archive var24 = class258.archive2;
                  Archive var25 = class143.archive8;
                  HealthBarDefinition.HealthBarDefinition_archive = var24;
                  HealthBarDefinition.field1947 = var25;
                  MouseRecorder.method2272(class258.archive2, class143.archive8);
                  Login.Login_loadingText = "Loaded config";
                  Login.Login_loadingPercent = 60;
                  Client.titleLoadingStage = 80;
               }
            } else if (Client.titleLoadingStage == 80) {
               var26 = 0;
               if (class149.compass == null) {
                  class149.compass = WorldMapScaleHandler.SpriteBuffer_getSprite(class143.archive8, PcmPlayer.spriteIds.compass, 0);
               } else {
                  ++var26;
               }

               if (class136.redHintArrowSprite == null) {
                  class136.redHintArrowSprite = WorldMapScaleHandler.SpriteBuffer_getSprite(class143.archive8, PcmPlayer.spriteIds.field4575, 0);
               } else {
                  ++var26;
               }

               if (LoginScreenAnimation.mapSceneSprites == null) {
                  LoginScreenAnimation.mapSceneSprites = class456.method8334(class143.archive8, PcmPlayer.spriteIds.mapScenes, 0);
               } else {
                  ++var26;
               }

               if (class315.headIconPkSprites == null) {
                  class315.headIconPkSprites = class70.method2046(class143.archive8, PcmPlayer.spriteIds.headIconsPk, 0);
               } else {
                  ++var26;
               }

               if (class287.headIconPrayerSprites == null) {
                  class287.headIconPrayerSprites = class70.method2046(class143.archive8, PcmPlayer.spriteIds.field4572, 0);
               } else {
                  ++var26;
               }

               if (EnumComposition.headIconHintSprites == null) {
                  EnumComposition.headIconHintSprites = class70.method2046(class143.archive8, PcmPlayer.spriteIds.field4576, 0);
               } else {
                  ++var26;
               }

               if (AbstractWorldMapData.mapMarkerSprites == null) {
                  AbstractWorldMapData.mapMarkerSprites = class70.method2046(class143.archive8, PcmPlayer.spriteIds.field4577, 0);
               } else {
                  ++var26;
               }

               if (Friend.crossSprites == null) {
                  Friend.crossSprites = class70.method2046(class143.archive8, PcmPlayer.spriteIds.field4578, 0);
               } else {
                  ++var26;
               }

               if (class157.mapDotSprites == null) {
                  class157.mapDotSprites = class70.method2046(class143.archive8, PcmPlayer.spriteIds.field4573, 0);
               } else {
                  ++var26;
               }

               if (AbstractWorldMapData.scrollBarSprites == null) {
                  AbstractWorldMapData.scrollBarSprites = class456.method8334(class143.archive8, PcmPlayer.spriteIds.field4580, 0);
               } else {
                  ++var26;
               }

               if (class36.modIconSprites == null) {
                  class36.modIconSprites = class456.method8334(class143.archive8, PcmPlayer.spriteIds.field4581, 0);
               } else {
                  ++var26;
               }

               if (var26 < 11) {
                  Login.Login_loadingText = "Loading sprites - " + var26 * 100 / 12 + "%";
                  Login.Login_loadingPercent = 70;
               } else {
                  AbstractFont.AbstractFont_modIconSprites = class36.modIconSprites;
                  class136.redHintArrowSprite.normalize();
                  var1 = (int)(Math.random() * 21.0) - 10;
                  int var2 = (int)(Math.random() * 21.0) - 10;
                  int var3 = (int)(Math.random() * 21.0) - 10;
                  int var4 = (int)(Math.random() * 41.0) - 20;
                  LoginScreenAnimation.mapSceneSprites[0].shiftColors(var1 + var4, var4 + var2, var3 + var4);
                  Login.Login_loadingText = "Loaded sprites";
                  Login.Login_loadingPercent = 70;
                  Client.titleLoadingStage = 90;
               }
            } else if (Client.titleLoadingStage == 90) {
               if (!class20.field113.isFullyLoaded()) {
                  Login.Login_loadingText = "Loading textures - " + "0%";
                  Login.Login_loadingPercent = 90;
               } else {
                  FriendSystem.textureProvider = new TextureProvider(class20.field113, class143.archive8, 20, WorldMapSectionType.clientPreferences.method2438(), Client.isLowDetail ? 64 : 128);
                  Rasterizer3D.Rasterizer3D_setTextureLoader(FriendSystem.textureProvider);
                  Rasterizer3D.Rasterizer3D_setBrightness(WorldMapSectionType.clientPreferences.method2438());
                  Client.titleLoadingStage = 100;
               }
            } else if (Client.titleLoadingStage == 100) {
               var26 = FriendSystem.textureProvider.getLoadedPercentage();
               if (var26 < 100) {
                  Login.Login_loadingText = "Loading textures - " + var26 + "%";
                  Login.Login_loadingPercent = 90;
               } else {
                  Login.Login_loadingText = "Loaded textures";
                  Login.Login_loadingPercent = 90;
                  Client.titleLoadingStage = 110;
               }
            } else if (Client.titleLoadingStage == 110) {
               class212.mouseRecorder = new MouseRecorder();
               GameEngine.taskHandler.newThreadTask(class212.mouseRecorder, 10);
               Login.Login_loadingText = "Loaded input handler";
               Login.Login_loadingPercent = 92;
               Client.titleLoadingStage = 120;
            } else if (Client.titleLoadingStage == 120) {
               if (!AABB.archive10.tryLoadFileByNames("huffman", "")) {
                  Login.Login_loadingText = "Loading wordpack - " + 0 + "%";
                  Login.Login_loadingPercent = 94;
               } else {
                  Huffman var0 = new Huffman(AABB.archive10.takeFileByNames("huffman", ""));
                  WorldMapScaleHandler.method5372(var0);
                  Login.Login_loadingText = "Loaded wordpack";
                  Login.Login_loadingPercent = 94;
                  Client.titleLoadingStage = 130;
               }
            } else if (Client.titleLoadingStage == 130) {
               if (!class135.archive4.isFullyLoaded()) {
                  Login.Login_loadingText = "Loading interfaces - " + class135.archive4.loadPercent() * 4 / 5 + "%";
                  Login.Login_loadingPercent = 96;
               } else if (!class167.archive12.isFullyLoaded()) {
                  Login.Login_loadingText = "Loading interfaces - " + (80 + class167.archive12.loadPercent() / 6) + "%";
                  Login.Login_loadingPercent = 96;
               } else if (!TextureProvider.archive13.isFullyLoaded()) {
                  Login.Login_loadingText = "Loading interfaces - " + (96 + TextureProvider.archive13.loadPercent() / 50) + "%";
                  Login.Login_loadingPercent = 96;
               } else {
                  Login.Login_loadingText = "Loaded interfaces";
                  Login.Login_loadingPercent = 98;
                  Client.titleLoadingStage = 140;
               }
            } else if (Client.titleLoadingStage == 140) {
               Login.Login_loadingPercent = 100;
               if (!MusicPatchNode.archive19.tryLoadGroupByName(WorldMapCacheName.field3019.name)) {
                  Login.Login_loadingText = "Loading world map - " + MusicPatchNode.archive19.groupLoadPercentByName(WorldMapCacheName.field3019.name) / 10 + "%";
               } else {
                  if (WorldMapData_1.worldMap == null) {
                     WorldMapData_1.worldMap = new WorldMap();
                     WorldMapData_1.worldMap.init(MusicPatchNode.archive19, class376.archive18, class475.archive20, class7.fontBold12, Client.fontsMap, LoginScreenAnimation.mapSceneSprites);
                  }

                  Login.Login_loadingText = "Loaded world map";
                  Client.titleLoadingStage = 150;
               }
            } else if (Client.titleLoadingStage == 150) {
               class19.updateGameState(10);
            }
         }
      } else {
         var26 = 0;
         var26 += UserComparator5.field1419.percentage() * 4 / 100;
         var26 += class290.archive7.percentage() * 4 / 100;
         var26 += class258.archive2.percentage() * 2 / 100;
         var26 += class135.archive4.percentage() * 2 / 100;
         var26 += class175.field1841.percentage() * 6 / 100;
         var26 += ClientPreferences.archive9.percentage() * 4 / 100;
         var26 += class308.archive6.percentage() * 2 / 100;
         var26 += Clock.archive11.percentage() * 55 / 100;
         var26 += class143.archive8.percentage() * 2 / 100;
         var26 += class20.field113.percentage() * 2 / 100;
         var26 += AABB.archive10.percentage() * 2 / 100;
         var26 += class36.field239.percentage() * 2 / 100;
         var26 += class167.archive12.percentage() * 2 / 100;
         var26 += TextureProvider.archive13.percentage() * 2 / 100;
         var26 += class90.archive14.percentage() * 2 / 100;
         var26 += MusicPatchPcmStream.archive15.percentage() * 2 / 100;
         var26 += MusicPatchNode.archive19.percentage() / 100;
         var26 += class376.archive18.percentage() / 100;
         var26 += class475.archive20.percentage() / 100;
         var26 += class320.field3708.percentage() / 100;
         var26 += class127.archive17.method6424() && class127.archive17.isFullyLoaded() ? 1 : 0;
         if (var26 != 100) {
            if (var26 != 0) {
               Login.Login_loadingText = "Checking for updates - " + var26 + "%";
            }

            Login.Login_loadingPercent = 30;
         } else {
            Players.method2676(UserComparator5.field1419, "Animations");
            Players.method2676(class290.archive7, "Skeletons");
            Players.method2676(class175.field1841, "Sound FX");
            Players.method2676(ClientPreferences.archive9, "Maps");
            Players.method2676(class308.archive6, "Music Tracks");
            Players.method2676(Clock.archive11, "Models");
            Players.method2676(class143.archive8, "Sprites");
            Players.method2676(class36.field239, "Music Jingles");
            Players.method2676(class90.archive14, "Music Samples");
            Players.method2676(MusicPatchPcmStream.archive15, "Music Patches");
            Players.method2676(MusicPatchNode.archive19, "World Map");
            Players.method2676(class376.archive18, "World Map Geography");
            Players.method2676(class475.archive20, "World Map Ground");
            PcmPlayer.spriteIds = new GraphicsDefaults();
            PcmPlayer.spriteIds.decode(class127.archive17);
            Login.Login_loadingText = "Loaded update list";
            Login.Login_loadingPercent = 30;
            Client.titleLoadingStage = 45;
         }
      }
   }

   @ObfuscatedName("hr")
   @ObfuscatedSignature(
      descriptor = "(Lhx;IIIB)V",
      garbageValue = "1"
   )
   static void method1216(SequenceDefinition var0, int var1, int var2, int var3) {
      if (Client.soundEffectCount < 50 && WorldMapSectionType.clientPreferences.method2463() != 0) {
         if (var0.field2273 != null && var0.field2273.containsKey(var1)) {
            int var4 = (Integer)var0.field2273.get(var1);
            if (var4 != 0) {
               int var7 = var4 >> 8;
               int var8 = var4 >> 4 & 7;
               int var9 = var4 & 15;
               Client.soundEffectIds[Client.soundEffectCount] = var7;
               Client.queuedSoundEffectLoops[Client.soundEffectCount] = var8;
               Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
               Client.soundEffects[Client.soundEffectCount] = null;
               int var10 = (var2 - 64) / 128;
               int var11 = (var3 - 64) / 128;
               Client.soundLocations[Client.soundEffectCount] = var9 + (var11 << 8) + (var10 << 16);
               ++Client.soundEffectCount;
            }

         }
      }
   }

   @ObfuscatedName("ka")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIII)V",
      garbageValue = "1311164641"
   )
   @Export("drawWidgets")
   static final void drawWidgets(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (GrandExchangeEvent.loadInterface(var0)) {
         class146.field1660 = null;
         Widget.drawInterface(class155.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6, var7);
         if (class146.field1660 != null) {
            Widget.drawInterface(class146.field1660, -1412584499, var1, var2, var3, var4, ItemLayer.field2360, WorldMapAreaData.field3024, var7);
            class146.field1660 = null;
         }

      } else {
         if (var7 != -1) {
            Client.field722[var7] = true;
         } else {
            for(int var8 = 0; var8 < 100; ++var8) {
               Client.field722[var8] = true;
            }
         }

      }
   }
}
