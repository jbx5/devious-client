import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
@Implements("Tiles")
public final class Tiles {
   @ObfuscatedName("h")
   @Export("Tiles_heights")
   static int[][][] Tiles_heights = new int[4][105][105];
   @ObfuscatedName("e")
   @Export("Tiles_renderFlags")
   static byte[][][] Tiles_renderFlags = new byte[4][104][104];
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1062908513
   )
   @Export("Tiles_minPlane")
   static int Tiles_minPlane = 99;
   @ObfuscatedName("x")
   @Export("Tiles_underlays")
   static short[][][] Tiles_underlays;
   @ObfuscatedName("q")
   @Export("Tiles_shapes")
   static byte[][][] Tiles_shapes;
   @ObfuscatedName("u")
   static int[][] field1030;
   @ObfuscatedName("b")
   @Export("Tiles_hue")
   static int[] Tiles_hue;
   @ObfuscatedName("g")
   @Export("Tiles_lightness")
   static int[] Tiles_lightness;
   @ObfuscatedName("l")
   static final int[] field1032 = new int[]{1, 2, 4, 8};
   @ObfuscatedName("t")
   static final int[] field1036 = new int[]{16, 32, 64, 128};
   @ObfuscatedName("c")
   static final int[] field1035 = new int[]{1, 0, -1, 0};
   @ObfuscatedName("p")
   static final int[] field1029 = new int[]{0, -1, 0, 1};
   @ObfuscatedName("d")
   static final int[] field1037 = new int[]{1, -1, -1, 1};
   @ObfuscatedName("y")
   static final int[] field1025 = new int[]{-1, -1, 1, 1};
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 559364671
   )
   @Export("rndHue")
   static int rndHue = (int)(Math.random() * 17.0) - 8;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = -475114795
   )
   @Export("rndLightness")
   static int rndLightness = (int)(Math.random() * 33.0) - 16;

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "([BIIB)Z",
      garbageValue = "-120"
   )
   static final boolean method2214(byte[] var0, int var1, int var2) {
      boolean var3 = true;
      Buffer var4 = new Buffer(var0);
      int var5 = -1;

      label68:
      while(true) {
         int var6 = var4.readIncrSmallSmart();
         if (var6 == 0) {
            return var3;
         }

         var5 += var6;
         int var7 = 0;
         boolean var8 = false;

         while(true) {
            int var9;
            while(!var8) {
               var9 = var4.readUShortSmart();
               if (var9 == 0) {
                  continue label68;
               }

               var7 += var9 - 1;
               int var10 = var7 & 63;
               int var11 = var7 >> 6 & 63;
               int var12 = var4.readUnsignedByte() >> 2;
               int var13 = var11 + var1;
               int var14 = var10 + var2;
               if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
                  ObjectComposition var15 = VarpDefinition.getObjectDefinition(var5);
                  if (var12 != 22 || !Client.isLowDetail || var15.int1 != 0 || var15.interactType == 1 || var15.boolean2) {
                     if (!var15.needsModelFiles()) {
                        ++Client.field786;
                        var3 = false;
                     }

                     var8 = true;
                  }
               }
            }

            var9 = var4.readUShortSmart();
            if (var9 == 0) {
               break;
            }

            var4.readUnsignedByte();
         }
      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "([BIIIIIIILhc;[Lgw;)V"
   )
   static final void method2154(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
      Buffer var10 = new Buffer(var0);
      int var11 = -1;

      while(true) {
         int var12 = var10.readIncrSmallSmart();
         if (var12 == 0) {
            return;
         }

         var11 += var12;
         int var13 = 0;

         while(true) {
            int var14 = var10.readUShortSmart();
            if (var14 == 0) {
               break;
            }

            var13 += var14 - 1;
            int var15 = var13 & 63;
            int var16 = var13 >> 6 & 63;
            int var17 = var13 >> 12;
            int var18 = var10.readUnsignedByte();
            int var19 = var18 >> 2;
            int var20 = var18 & 3;
            if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
               ObjectComposition var21 = VarpDefinition.getObjectDefinition(var11);
               int var22 = var2 + ItemComposition.method3994(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20);
               int var25 = var16 & 7;
               int var26 = var15 & 7;
               int var28 = var21.sizeX;
               int var29 = var21.sizeY;
               int var30;
               if ((var20 & 1) == 1) {
                  var30 = var28;
                  var28 = var29;
                  var29 = var30;
               }

               int var27 = var7 & 3;
               int var24;
               if (var27 == 0) {
                  var24 = var26;
               } else if (var27 == 1) {
                  var24 = 7 - var25 - (var28 - 1);
               } else if (var27 == 2) {
                  var24 = 7 - var26 - (var29 - 1);
               } else {
                  var24 = var25;
               }

               var30 = var3 + var24;
               if (var22 > 0 && var30 > 0 && var22 < 103 && var30 < 103) {
                  int var31 = var1;
                  if ((Tiles_renderFlags[1][var22][var30] & 2) == 2) {
                     var31 = var1 - 1;
                  }

                  CollisionMap var32 = null;
                  if (var31 >= 0) {
                     var32 = var9[var31];
                  }

                  UrlRequester.addObjects(var1, var22, var30, var11, var20 + var7 & 3, var19, var8, var32);
               }
            }
         }
      }
   }

   @ObfuscatedName("gv")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "648133530"
   )
   @Export("load")
   static void load() {
      int var13;
      if (Client.titleLoadingStage == 0) {
         ReflectionCheck.scene = new Scene(4, 104, 104, Tiles_heights);

         for(var13 = 0; var13 < 4; ++var13) {
            Client.collisionMaps[var13] = new CollisionMap(104, 104);
         }

         GameObject.sceneMinimapSprite = new SpritePixels(512, 512);
         Login.Login_loadingText = "Starting game engine...";
         Login.Login_loadingPercent = 5;
         Client.titleLoadingStage = 20;
      } else if (Client.titleLoadingStage == 20) {
         Login.Login_loadingText = "Prepared visibility map";
         Login.Login_loadingPercent = 10;
         Client.titleLoadingStage = 30;
      } else if (Client.titleLoadingStage == 30) {
         HealthBar.field1306 = MusicPatchNode.newArchive(0, false, true, true, false);
         class9.archive7 = MusicPatchNode.newArchive(1, false, true, true, false);
         HitSplatDefinition.archive2 = MusicPatchNode.newArchive(2, true, false, true, false);
         FloorUnderlayDefinition.archive4 = MusicPatchNode.newArchive(3, false, true, true, false);
         WorldMapSection0.field2932 = MusicPatchNode.newArchive(4, false, true, true, false);
         class4.archive9 = MusicPatchNode.newArchive(5, true, true, true, false);
         class162.archive6 = MusicPatchNode.newArchive(6, true, true, true, false);
         class301.archive11 = MusicPatchNode.newArchive(7, false, true, true, false);
         ClientPreferences.archive8 = MusicPatchNode.newArchive(8, false, true, true, false);
         Frames.field2615 = MusicPatchNode.newArchive(9, false, true, true, false);
         ClanChannelMember.archive10 = MusicPatchNode.newArchive(10, false, true, true, false);
         class21.field123 = MusicPatchNode.newArchive(11, false, true, true, false);
         class71.archive12 = MusicPatchNode.newArchive(12, false, true, true, false);
         class358.archive13 = MusicPatchNode.newArchive(13, true, false, true, false);
         VarpDefinition.archive14 = MusicPatchNode.newArchive(14, false, true, true, false);
         class89.archive15 = MusicPatchNode.newArchive(15, false, true, true, false);
         VerticalAlignment.archive17 = MusicPatchNode.newArchive(17, true, true, true, false);
         class170.archive18 = MusicPatchNode.newArchive(18, false, true, true, false);
         FontName.archive19 = MusicPatchNode.newArchive(19, false, true, true, false);
         WorldMapArea.archive20 = MusicPatchNode.newArchive(20, false, true, true, false);
         Ignored.field4539 = MusicPatchNode.newArchive(21, false, true, true, true);
         Login.Login_loadingText = "Connecting to update server";
         Login.Login_loadingPercent = 20;
         Client.titleLoadingStage = 40;
      } else if (Client.titleLoadingStage == 40) {
         byte var24 = 0;
         var13 = var24 + HealthBar.field1306.percentage() * 4 / 100;
         var13 += class9.archive7.percentage() * 4 / 100;
         var13 += HitSplatDefinition.archive2.percentage() * 2 / 100;
         var13 += FloorUnderlayDefinition.archive4.percentage() * 2 / 100;
         var13 += WorldMapSection0.field2932.percentage() * 6 / 100;
         var13 += class4.archive9.percentage() * 4 / 100;
         var13 += class162.archive6.percentage() * 2 / 100;
         var13 += class301.archive11.percentage() * 55 / 100;
         var13 += ClientPreferences.archive8.percentage() * 2 / 100;
         var13 += Frames.field2615.percentage() * 2 / 100;
         var13 += ClanChannelMember.archive10.percentage() * 2 / 100;
         var13 += class21.field123.percentage() * 2 / 100;
         var13 += class71.archive12.percentage() * 2 / 100;
         var13 += class358.archive13.percentage() * 2 / 100;
         var13 += VarpDefinition.archive14.percentage() * 2 / 100;
         var13 += class89.archive15.percentage() * 2 / 100;
         var13 += FontName.archive19.percentage() / 100;
         var13 += class170.archive18.percentage() / 100;
         var13 += WorldMapArea.archive20.percentage() / 100;
         var13 += Ignored.field4539.percentage() / 100;
         var13 += VerticalAlignment.archive17.method6415() && VerticalAlignment.archive17.isFullyLoaded() ? 1 : 0;
         if (var13 != 100) {
            if (var13 != 0) {
               Login.Login_loadingText = "Checking for updates - " + var13 + "%";
            }

            Login.Login_loadingPercent = 30;
         } else {
            class18.method263(HealthBar.field1306, "Animations");
            class18.method263(class9.archive7, "Skeletons");
            class18.method263(WorldMapSection0.field2932, "Sound FX");
            class18.method263(class4.archive9, "Maps");
            class18.method263(class162.archive6, "Music Tracks");
            class18.method263(class301.archive11, "Models");
            class18.method263(ClientPreferences.archive8, "Sprites");
            class18.method263(class21.field123, "Music Jingles");
            class18.method263(VarpDefinition.archive14, "Music Samples");
            class18.method263(class89.archive15, "Music Patches");
            class18.method263(FontName.archive19, "World Map");
            class18.method263(class170.archive18, "World Map Geography");
            class18.method263(WorldMapArea.archive20, "World Map Ground");
            UserComparator5.spriteIds = new GraphicsDefaults();
            UserComparator5.spriteIds.decode(VerticalAlignment.archive17);
            Login.Login_loadingText = "Loaded update list";
            Login.Login_loadingPercent = 30;
            Client.titleLoadingStage = 45;
         }
      } else if (Client.titleLoadingStage == 45) {
         boolean var23 = !Client.isLowDetail;
         PcmPlayer.field325 = 486202500;
         class286.PcmPlayer_stereo = var23;
         class34.field205 = 2;
         MidiPcmStream var21 = new MidiPcmStream();
         var21.method5572(9, 128);
         TileItem.pcmPlayer0 = ScriptFrame.method1168(class242.taskHandler, 0, 22050);
         TileItem.pcmPlayer0.setStream(var21);
         WorldMapDecoration.method5269(class89.archive15, VarpDefinition.archive14, WorldMapSection0.field2932, var21);
         UserComparator8.pcmPlayer1 = ScriptFrame.method1168(class242.taskHandler, 1, 2048);
         ApproximateRouteStrategy.pcmStreamMixer = new PcmStreamMixer();
         UserComparator8.pcmPlayer1.setStream(ApproximateRouteStrategy.pcmStreamMixer);
         DevicePcmPlayerProvider.decimator = new Decimator(22050, PcmPlayer.field325 * 22050);
         Login.Login_loadingText = "Prepared sound engine";
         Login.Login_loadingPercent = 35;
         Client.titleLoadingStage = 50;
         MouseRecorder.WorldMapElement_fonts = new Fonts(ClientPreferences.archive8, class358.archive13);
      } else if (Client.titleLoadingStage == 50) {
         var13 = FontName.method8203().length;
         Client.fontsMap = MouseRecorder.WorldMapElement_fonts.createMap(FontName.method8203());
         if (Client.fontsMap.size() < var13) {
            Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var13 + "%";
            Login.Login_loadingPercent = 40;
         } else {
            class151.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
            AbstractWorldMapData.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
            class146.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
            class213.platformInfo = Client.platformInfoProvider.get();
            Login.Login_loadingText = "Loaded fonts";
            Login.Login_loadingPercent = 40;
            Client.titleLoadingStage = 60;
         }
      } else {
         int var3;
         Archive var15;
         if (Client.titleLoadingStage == 60) {
            var13 = class134.method3051(ClanChannelMember.archive10, ClientPreferences.archive8);
            var15 = ClientPreferences.archive8;
            var3 = Login.field932.length + Login.field934.length;
            String[] var22 = Login.field953;

            for(int var18 = 0; var18 < var22.length; ++var18) {
               String var20 = var22[var18];
               if (var15.getGroupId(var20) != -1) {
                  ++var3;
               }
            }

            if (var13 < var3) {
               Login.Login_loadingText = "Loading title screen - " + var13 * 100 / var3 + "%";
               Login.Login_loadingPercent = 50;
            } else {
               Login.Login_loadingText = "Loaded title screen";
               Login.Login_loadingPercent = 50;
               class140.updateGameState(5);
               Client.titleLoadingStage = 70;
            }
         } else if (Client.titleLoadingStage == 70) {
            if (!HitSplatDefinition.archive2.isFullyLoaded()) {
               Login.Login_loadingText = "Loading config - " + HitSplatDefinition.archive2.loadPercent() + "%";
               Login.Login_loadingPercent = 60;
            } else if (!Ignored.field4539.isFullyLoaded()) {
               Login.Login_loadingText = "Loading config - " + (80 + class71.archive12.loadPercent() / 6) + "%";
               Login.Login_loadingPercent = 60;
            } else {
               Archive var19 = HitSplatDefinition.archive2;
               FloorOverlayDefinition.FloorOverlayDefinition_archive = var19;
               class140.method3098(HitSplatDefinition.archive2);
               Archive var14 = HitSplatDefinition.archive2;
               var15 = class301.archive11;
               KitDefinition.KitDefinition_archive = var14;
               KitDefinition.KitDefinition_modelsArchive = var15;
               class71.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
               UrlRequester.method2770(HitSplatDefinition.archive2, class301.archive11, Client.isLowDetail);
               PacketWriter.method2741(HitSplatDefinition.archive2, class301.archive11, Client.field515 <= 209, UserComparator5.spriteIds.field4585);
               Archive var16 = HitSplatDefinition.archive2;
               StructComposition.StructDefinition_archive = var16;
               class346.method6684(HitSplatDefinition.archive2, class301.archive11, Client.isMembersWorld, class151.fontPlain11);
               WorldMapIcon_1.method4881(HitSplatDefinition.archive2, HealthBar.field1306, class9.archive7);
               WorldMapSectionType.method5233(HitSplatDefinition.archive2, class301.archive11);
               class182.method3627(HitSplatDefinition.archive2);
               Archive var17 = HitSplatDefinition.archive2;
               VarpDefinition.VarpDefinition_archive = var17;
               VarpDefinition.field1922 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16);
               SequenceDefinition.method4063(FloorUnderlayDefinition.archive4, class301.archive11, ClientPreferences.archive8, class358.archive13);
               Messages.method2719(HitSplatDefinition.archive2);
               WorldMapIcon_1.method4880(HitSplatDefinition.archive2);
               Archive var5 = HitSplatDefinition.archive2;
               VarcInt.VarcInt_archive = var5;
               class151.method3273(HitSplatDefinition.archive2);
               HealthBar.method2528(HitSplatDefinition.archive2);
               Ignored.method7606(HitSplatDefinition.archive2);
               class458.method8425(HitSplatDefinition.archive2);
               class137.HitSplatDefinition_cachedSprites = new class451(LoginPacket.field3302, 54, class173.clientLanguage, HitSplatDefinition.archive2);
               class34.HitSplatDefinition_cached = new class451(LoginPacket.field3302, 47, class173.clientLanguage, HitSplatDefinition.archive2);
               WorldMapArea.varcs = new Varcs();
               Archive var6 = HitSplatDefinition.archive2;
               Archive var7 = ClientPreferences.archive8;
               Archive var8 = class358.archive13;
               class18.HitSplatDefinition_archive = var6;
               HitSplatDefinition.field2135 = var7;
               HitSplatDefinition.HitSplatDefinition_fontsArchive = var8;
               class126.method2985(HitSplatDefinition.archive2, ClientPreferences.archive8);
               Archive var9 = HitSplatDefinition.archive2;
               Archive var10 = ClientPreferences.archive8;
               WorldMapElement.WorldMapElement_archive = var10;
               if (var9.isFullyLoaded()) {
                  WorldMapElement.WorldMapElement_count = var9.getGroupFileCount(35);
                  WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count];

                  for(int var11 = 0; var11 < WorldMapElement.WorldMapElement_count; ++var11) {
                     byte[] var12 = var9.takeFile(35, var11);
                     WorldMapElement.WorldMapElement_cached[var11] = new WorldMapElement(var11);
                     if (var12 != null) {
                        WorldMapElement.WorldMapElement_cached[var11].decode(new Buffer(var12));
                        WorldMapElement.WorldMapElement_cached[var11].method3554();
                     }
                  }
               }

               Login.Login_loadingText = "Loaded config";
               Login.Login_loadingPercent = 60;
               Client.titleLoadingStage = 80;
            }
         } else if (Client.titleLoadingStage == 80) {
            var13 = 0;
            if (class201.compass == null) {
               class201.compass = class125.SpriteBuffer_getSprite(ClientPreferences.archive8, UserComparator5.spriteIds.compass, 0);
            } else {
               ++var13;
            }

            if (class139.redHintArrowSprite == null) {
               class139.redHintArrowSprite = class125.SpriteBuffer_getSprite(ClientPreferences.archive8, UserComparator5.spriteIds.field4588, 0);
            } else {
               ++var13;
            }

            if (class32.mapSceneSprites == null) {
               class32.mapSceneSprites = AbstractWorldMapData.method5238(ClientPreferences.archive8, UserComparator5.spriteIds.mapScenes, 0);
            } else {
               ++var13;
            }

            if (World.headIconPkSprites == null) {
               World.headIconPkSprites = SequenceDefinition.method4064(ClientPreferences.archive8, UserComparator5.spriteIds.headIconsPk, 0);
            } else {
               ++var13;
            }

            if (class410.headIconPrayerSprites == null) {
               class410.headIconPrayerSprites = SequenceDefinition.method4064(ClientPreferences.archive8, UserComparator5.spriteIds.field4585, 0);
            } else {
               ++var13;
            }

            if (class358.headIconHintSprites == null) {
               class358.headIconHintSprites = SequenceDefinition.method4064(ClientPreferences.archive8, UserComparator5.spriteIds.field4587, 0);
            } else {
               ++var13;
            }

            if (class144.mapMarkerSprites == null) {
               class144.mapMarkerSprites = SequenceDefinition.method4064(ClientPreferences.archive8, UserComparator5.spriteIds.field4591, 0);
            } else {
               ++var13;
            }

            if (MouseHandler.crossSprites == null) {
               MouseHandler.crossSprites = SequenceDefinition.method4064(ClientPreferences.archive8, UserComparator5.spriteIds.field4589, 0);
            } else {
               ++var13;
            }

            if (class281.mapDotSprites == null) {
               class281.mapDotSprites = SequenceDefinition.method4064(ClientPreferences.archive8, UserComparator5.spriteIds.field4590, 0);
            } else {
               ++var13;
            }

            if (class89.scrollBarSprites == null) {
               class89.scrollBarSprites = AbstractWorldMapData.method5238(ClientPreferences.archive8, UserComparator5.spriteIds.field4586, 0);
            } else {
               ++var13;
            }

            if (Coord.modIconSprites == null) {
               Coord.modIconSprites = AbstractWorldMapData.method5238(ClientPreferences.archive8, UserComparator5.spriteIds.field4592, 0);
            } else {
               ++var13;
            }

            if (var13 < 11) {
               Login.Login_loadingText = "Loading sprites - " + var13 * 100 / 12 + "%";
               Login.Login_loadingPercent = 70;
            } else {
               AbstractFont.AbstractFont_modIconSprites = Coord.modIconSprites;
               class139.redHintArrowSprite.normalize();
               int var1 = (int)(Math.random() * 21.0) - 10;
               int var2 = (int)(Math.random() * 21.0) - 10;
               var3 = (int)(Math.random() * 21.0) - 10;
               int var4 = (int)(Math.random() * 41.0) - 20;
               class32.mapSceneSprites[0].shiftColors(var1 + var4, var2 + var4, var4 + var3);
               Login.Login_loadingText = "Loaded sprites";
               Login.Login_loadingPercent = 70;
               Client.titleLoadingStage = 90;
            }
         } else if (Client.titleLoadingStage == 90) {
            if (!Frames.field2615.isFullyLoaded()) {
               Login.Login_loadingText = "Loading textures - " + "0%";
               Login.Login_loadingPercent = 90;
            } else {
               Skeleton.textureProvider = new TextureProvider(Frames.field2615, ClientPreferences.archive8, 20, StructComposition.clientPreferences.method2422(), Client.isLowDetail ? 64 : 128);
               Rasterizer3D.Rasterizer3D_setTextureLoader(Skeleton.textureProvider);
               Rasterizer3D.Rasterizer3D_setBrightness(StructComposition.clientPreferences.method2422());
               Client.titleLoadingStage = 100;
            }
         } else if (Client.titleLoadingStage == 100) {
            var13 = Skeleton.textureProvider.getLoadedPercentage();
            if (var13 < 100) {
               Login.Login_loadingText = "Loading textures - " + var13 + "%";
               Login.Login_loadingPercent = 90;
            } else {
               Login.Login_loadingText = "Loaded textures";
               Login.Login_loadingPercent = 90;
               Client.titleLoadingStage = 110;
            }
         } else if (Client.titleLoadingStage == 110) {
            class271.mouseRecorder = new MouseRecorder();
            class242.taskHandler.newThreadTask(class271.mouseRecorder, 10);
            Login.Login_loadingText = "Loaded input handler";
            Login.Login_loadingPercent = 92;
            Client.titleLoadingStage = 120;
         } else if (Client.titleLoadingStage == 120) {
            if (!ClanChannelMember.archive10.tryLoadFileByNames("huffman", "")) {
               Login.Login_loadingText = "Loading wordpack - " + 0 + "%";
               Login.Login_loadingPercent = 94;
            } else {
               Huffman var0 = new Huffman(ClanChannelMember.archive10.takeFileByNames("huffman", ""));
               Interpreter.method1960(var0);
               Login.Login_loadingText = "Loaded wordpack";
               Login.Login_loadingPercent = 94;
               Client.titleLoadingStage = 130;
            }
         } else if (Client.titleLoadingStage == 130) {
            if (!FloorUnderlayDefinition.archive4.isFullyLoaded()) {
               Login.Login_loadingText = "Loading interfaces - " + FloorUnderlayDefinition.archive4.loadPercent() * 4 / 5 + "%";
               Login.Login_loadingPercent = 96;
            } else if (!class71.archive12.isFullyLoaded()) {
               Login.Login_loadingText = "Loading interfaces - " + (80 + class71.archive12.loadPercent() / 6) + "%";
               Login.Login_loadingPercent = 96;
            } else if (!class358.archive13.isFullyLoaded()) {
               Login.Login_loadingText = "Loading interfaces - " + (96 + class358.archive13.loadPercent() / 50) + "%";
               Login.Login_loadingPercent = 96;
            } else {
               Login.Login_loadingText = "Loaded interfaces";
               Login.Login_loadingPercent = 98;
               Client.titleLoadingStage = 140;
            }
         } else if (Client.titleLoadingStage == 140) {
            Login.Login_loadingPercent = 100;
            if (!FontName.archive19.tryLoadGroupByName(WorldMapCacheName.field3010.name)) {
               Login.Login_loadingText = "Loading world map - " + FontName.archive19.groupLoadPercentByName(WorldMapCacheName.field3010.name) / 10 + "%";
            } else {
               if (KitDefinition.worldMap == null) {
                  KitDefinition.worldMap = new WorldMap();
                  KitDefinition.worldMap.init(FontName.archive19, class170.archive18, WorldMapArea.archive20, class146.fontBold12, Client.fontsMap, class32.mapSceneSprites);
               }

               Login.Login_loadingText = "Loaded world map";
               Client.titleLoadingStage = 150;
            }
         } else if (Client.titleLoadingStage == 150) {
            class140.updateGameState(10);
         }
      }
   }
}
