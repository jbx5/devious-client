import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("he")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("c")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 953565199)
	@Export("ViewportMouse_x")
	public static int ViewportMouse_x;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 573466939)
	@Export("ViewportMouse_y")
	public static int ViewportMouse_y;

	@ObfuscatedName("f")
	@Export("ViewportMouse_false0")
	public static boolean ViewportMouse_false0;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = -1554423405)
	static int field2588;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 1684293485)
	static int field2589;

	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = 285393075)
	static int field2590;

	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 435239719)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;

	@ObfuscatedName("u")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;

	@ObfuscatedName("jc")
	@ObfuscatedGetter(intValue = 1467826843)
	@Export("cameraPitch")
	static int cameraPitch;

	@ObfuscatedName("ms")
	@ObfuscatedGetter(intValue = 863753987)
	@Export("menuY")
	static int menuY;

	static {
		ViewportMouse_isInViewport = false;
		ViewportMouse_x = 0;
		ViewportMouse_y = 0;
		ViewportMouse_false0 = false;
		ViewportMouse_entityCount = 0;
		ViewportMouse_entityTags = new long[1000];
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "(ILbi;ZI)I", garbageValue = "1768529211")
	static int method4514(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = class140.getWidget(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]);
		} else {
			var3 = (var2) ? class124.scriptDotWidget : GrandExchangeOfferOwnWorldComparator.scriptActiveWidget;
		}
		String var4 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
		int[] var5 = null;
		if (var4.length() > 0 && var4.charAt(var4.length() - 1) == 'Y') {
			int var6 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
			if (var6 > 0) {
				for (var5 = new int[var6]; var6-- > 0; var5[var6] = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]) {
				}
			}
			var4 = var4.substring(0, var4.length() - 1);
		}
		Object[] var8 = new Object[var4.length() + 1];
		int var7;
		for (var7 = var8.length - 1; var7 >= 1; --var7) {
			if (var4.charAt(var7 - 1) == 's') {
				var8[var7] = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
			} else {
				var8[var7] = new Integer(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]);
			}
		}
		var7 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
		if (var7 != -1) {
			var8[0] = new Integer(var7);
		} else {
			var8 = null;
		}
		if (var0 == ScriptOpcodes.CC_SETONCLICK) {
			var3.onClick = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) {
			var3.onHold = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) {
			var3.onRelease = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) {
			var3.onMouseOver = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) {
			var3.onMouseLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) {
			var3.onDrag = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) {
			var3.onTargetLeave = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) {
			var3.onVarTransmit = var8;
			var3.varTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) {
			var3.onTimer = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) {
			var3.onOp = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) {
			var3.onDragComplete = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) {
			var3.onClickRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) {
			var3.onMouseRepeat = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) {
			var3.onInvTransmit = var8;
			var3.invTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) {
			var3.onStatTransmit = var8;
			var3.statTransmitTriggers = var5;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) {
			var3.onTargetEnter = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) {
			var3.onScroll = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) {
			var3.onChatTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) {
			var3.onKey = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) {
			var3.onFriendTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) {
			var3.onClanTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) {
			var3.onMiscTransmit = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) {
			var3.onDialogAbort = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) {
			var3.onSubChange = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) {
			var3.onStockTransmit = var8;
		} else if (var0 == 1426) {
			var3.field3494 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) {
			var3.onResize = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) {
			var3.field3365 = var8;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) {
			var3.field3353 = var8;
		} else if (var0 == 1430) {
			var3.field3516 = var8;
		} else if (var0 == 1431) {
			var3.field3513 = var8;
		} else {
			if (var0 != 1434) {
				return 2;
			}
			var3.field3495 = var8;
		}
		var3.hasListener = true;
		return 1;
	}

	@ObfuscatedName("fl")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "3487029")
	@Export("load")
	static void load() {
		int var26;
		if (Client.titleLoadingStage == 0) {
			class356.scene = new Scene(4, 104, 104, Tiles.Tiles_heights);
			for (var26 = 0; var26 < 4; ++var26) {
				Client.collisionMaps[var26] = new CollisionMap(104, 104);
			}
			FloorUnderlayDefinition.sceneMinimapSprite = new SpritePixels(512, 512);
			Login.Login_loadingText = "Starting game engine...";
			Login.Login_loadingPercent = 5;
			Client.titleLoadingStage = 20;
		} else if (Client.titleLoadingStage == 20) {
			Login.Login_loadingText = "Prepared visibility map";
			Login.Login_loadingPercent = 10;
			Client.titleLoadingStage = 30;
		} else if (Client.titleLoadingStage == 30) {
			Varcs.archive5 = ModeWhere.newArchive(0, false, true, true, false);
			WorldMapEvent.field2882 = ModeWhere.newArchive(1, false, true, true, false);
			class140.archive2 = ModeWhere.newArchive(2, true, false, true, false);
			class341.archive7 = ModeWhere.newArchive(3, false, true, true, false);
			Client.archive4 = ModeWhere.newArchive(4, false, true, true, false);
			WorldMapSectionType.archive9 = ModeWhere.newArchive(5, true, true, true, false);
			class121.archive6 = ModeWhere.newArchive(6, true, true, true, false);
			class10.archive11 = ModeWhere.newArchive(7, false, true, true, false);
			class304.archive8 = ModeWhere.newArchive(8, false, true, true, false);
			Language.field4098 = ModeWhere.newArchive(9, false, true, true, false);
			ApproximateRouteStrategy.archive10 = ModeWhere.newArchive(10, false, true, true, false);
			UserComparator7.field1383 = ModeWhere.newArchive(11, false, true, true, false);
			class267.archive12 = ModeWhere.newArchive(12, false, true, true, false);
			AbstractByteArrayCopier.archive13 = ModeWhere.newArchive(13, true, false, true, false);
			WorldMapSprite.archive14 = ModeWhere.newArchive(14, false, true, true, false);
			class67.archive15 = ModeWhere.newArchive(15, false, true, true, false);
			class6.archive17 = ModeWhere.newArchive(17, true, true, true, false);
			AbstractUserComparator.archive18 = ModeWhere.newArchive(18, false, true, true, false);
			MouseHandler.archive19 = ModeWhere.newArchive(19, false, true, true, false);
			class4.archive20 = ModeWhere.newArchive(20, false, true, true, false);
			class132.field1588 = ModeWhere.newArchive(21, false, true, true, true);
			Login.Login_loadingText = "Connecting to update server";
			Login.Login_loadingPercent = 20;
			Client.titleLoadingStage = 40;
		} else if (Client.titleLoadingStage != 40) {
			Archive var20;
			Archive var21;
			Archive var22;
			if (Client.titleLoadingStage == 45) {
				KitDefinition.method3438(22050, !Client.isLowDetail, 2);
				MidiPcmStream var25 = new MidiPcmStream();
				var25.method5304(9, 128);
				AttackOption.pcmPlayer0 = BufferedNetSocket.method6849(GameEngine.taskHandler, 0, 22050);
				AttackOption.pcmPlayer0.setStream(var25);
				var20 = class67.archive15;
				var21 = WorldMapSprite.archive14;
				var22 = Client.archive4;
				class272.musicPatchesArchive = var20;
				class272.musicSamplesArchive = var21;
				class28.soundEffectsArchive = var22;
				class272.midiPcmStream = var25;
				class238.pcmPlayer1 = BufferedNetSocket.method6849(GameEngine.taskHandler, 1, 2048);
				class21.pcmStreamMixer = new PcmStreamMixer();
				class238.pcmPlayer1.setStream(class21.pcmStreamMixer);
				WorldMapRegion.decimator = new Decimator(22050, PcmPlayer.field287);
				Login.Login_loadingText = "Prepared sound engine";
				Login.Login_loadingPercent = 35;
				Client.titleLoadingStage = 50;
				class272.WorldMapElement_fonts = new Fonts(class304.archive8, AbstractByteArrayCopier.archive13);
			} else if (Client.titleLoadingStage == 50) {
				var26 = FontName.method7382().length;
				Client.fontsMap = class272.WorldMapElement_fonts.createMap(FontName.method7382());
				if (Client.fontsMap.size() < var26) {
					Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var26 + "%";
					Login.Login_loadingPercent = 40;
				} else {
					MouseHandler.fontPlain11 = ((Font) (Client.fontsMap.get(FontName.FontName_plain11)));
					DevicePcmPlayerProvider.fontPlain12 = ((Font) (Client.fontsMap.get(FontName.FontName_plain12)));
					TileItem.fontBold12 = ((Font) (Client.fontsMap.get(FontName.FontName_bold12)));
					Occluder.platformInfo = Client.platformInfoProvider.get();
					Login.Login_loadingText = "Loaded fonts";
					Login.Login_loadingPercent = 40;
					Client.titleLoadingStage = 60;
				}
			} else {
				int var1;
				if (Client.titleLoadingStage == 60) {
					var26 = HealthBarUpdate.method2203(ApproximateRouteStrategy.archive10, class304.archive8);
					var1 = Login.field924.length + Login.field916.length;
					if (var26 < var1) {
						Login.Login_loadingText = "Loading title screen - " + var26 * 100 / var1 + "%";
						Login.Login_loadingPercent = 50;
					} else {
						Login.Login_loadingText = "Loaded title screen";
						Login.Login_loadingPercent = 50;
						HealthBarUpdate.updateGameState(5);
						Client.titleLoadingStage = 70;
					}
				} else if (Client.titleLoadingStage == 70) {
					if (!class140.archive2.isFullyLoaded()) {
						Login.Login_loadingText = "Loading config - " + class140.archive2.loadPercent() + "%";
						Login.Login_loadingPercent = 60;
					} else if (!class132.field1588.isFullyLoaded()) {
						Login.Login_loadingText = "Loading config - " + (80 + class267.archive12.loadPercent() / 6) + "%";
						Login.Login_loadingPercent = 60;
					} else {
						class146.method3082(class140.archive2);
						Archive var24 = class140.archive2;
						FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var24;
						var20 = class140.archive2;
						var21 = class10.archive11;
						KitDefinition.KitDefinition_archive = var20;
						KitDefinition.KitDefinition_modelsArchive = var21;
						KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
						PacketWriter.method2517(class140.archive2, class10.archive11, Client.isLowDetail);
						var22 = class140.archive2;
						Archive var23 = class10.archive11;
						NPCComposition.NpcDefinition_archive = var22;
						NPCComposition.NpcDefinition_modelArchive = var23;
						GrandExchangeOfferNameComparator.method5979(class140.archive2);
						class114.method2636(class140.archive2, class10.archive11, Client.isMembersWorld, MouseHandler.fontPlain11);
						SoundCache.method762(class140.archive2, Varcs.archive5, WorldMapEvent.field2882);
						Archive var5 = class140.archive2;
						Archive var6 = class10.archive11;
						SpotAnimationDefinition.SpotAnimationDefinition_archive = var5;
						class147.SpotAnimationDefinition_modelArchive = var6;
						Archive var7 = class140.archive2;
						VarbitComposition.VarbitDefinition_archive = var7;
						Archive var8 = class140.archive2;
						VarpDefinition.VarpDefinition_archive = var8;
						VarpDefinition.field1822 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16);
						Archive var9 = class341.archive7;
						Archive var10 = class10.archive11;
						Archive var11 = class304.archive8;
						Archive var12 = AbstractByteArrayCopier.archive13;
						MusicPatchPcmStream.Widget_archive = var9;
						class126.Widget_modelsArchive = var10;
						StructComposition.Widget_spritesArchive = var11;
						MilliClock.Widget_fontsArchive = var12;
						SoundCache.Widget_interfaceComponents = new Widget[MusicPatchPcmStream.Widget_archive.getGroupCount()][];
						class228.Widget_loadedInterfaces = new boolean[MusicPatchPcmStream.Widget_archive.getGroupCount()];
						LoginScreenAnimation.method2233(class140.archive2);
						WorldMapSection0.method4936(class140.archive2);
						WorldMapLabel.method5000(class140.archive2);
						Renderable.method4342(class140.archive2);
						Archive var13 = class140.archive2;
						ParamComposition.ParamDefinition_archive = var13;
						class138.method2948(class140.archive2);
						class116.method2700(class140.archive2);
						AbstractWorldMapData.HitSplatDefinition_cachedSprites = new class427(class285.field3313, 54, class134.clientLanguage, class140.archive2);
						ModeWhere.HitSplatDefinition_cached = new class427(class285.field3313, 47, class134.clientLanguage, class140.archive2);
						class308.varcs = new Varcs();
						Archive var14 = class140.archive2;
						Archive var15 = class304.archive8;
						Archive var16 = AbstractByteArrayCopier.archive13;
						HitSplatDefinition.HitSplatDefinition_archive = var14;
						HitSplatDefinition.field2017 = var15;
						class4.HitSplatDefinition_fontsArchive = var16;
						Archive var17 = class140.archive2;
						Archive var18 = class304.archive8;
						HealthBarDefinition.HealthBarDefinition_archive = var17;
						HealthBarDefinition.field1877 = var18;
						class115.method2691(class140.archive2, class304.archive8);
						Login.Login_loadingText = "Loaded config";
						Login.Login_loadingPercent = 60;
						Client.titleLoadingStage = 80;
					}
				} else if (Client.titleLoadingStage == 80) {
					var26 = 0;
					if (class267.compass == null) {
						class267.compass = class7.SpriteBuffer_getSprite(class304.archive8, LoginScreenAnimation.spriteIds.compass, 0);
					} else {
						++var26;
					}
					if (class344.redHintArrowSprite == null) {
						class344.redHintArrowSprite = class7.SpriteBuffer_getSprite(class304.archive8, LoginScreenAnimation.spriteIds.field4367, 0);
					} else {
						++var26;
					}
					if (class13.mapSceneSprites == null) {
						class13.mapSceneSprites = ClanChannelMember.method2867(class304.archive8, LoginScreenAnimation.spriteIds.mapScenes, 0);
					} else {
						++var26;
					}
					if (Message.headIconPkSprites == null) {
						Message.headIconPkSprites = class430.method7547(class304.archive8, LoginScreenAnimation.spriteIds.headIconsPk, 0);
					} else {
						++var26;
					}
					if (class28.headIconPrayerSprites == null) {
						class28.headIconPrayerSprites = class430.method7547(class304.archive8, LoginScreenAnimation.spriteIds.field4374, 0);
					} else {
						++var26;
					}
					if (UserComparator4.headIconHintSprites == null) {
						UserComparator4.headIconHintSprites = class430.method7547(class304.archive8, LoginScreenAnimation.spriteIds.field4373, 0);
					} else {
						++var26;
					}
					if (DynamicObject.mapMarkerSprites == null) {
						DynamicObject.mapMarkerSprites = class430.method7547(class304.archive8, LoginScreenAnimation.spriteIds.field4372, 0);
					} else {
						++var26;
					}
					if (BuddyRankComparator.crossSprites == null) {
						BuddyRankComparator.crossSprites = class430.method7547(class304.archive8, LoginScreenAnimation.spriteIds.field4368, 0);
					} else {
						++var26;
					}
					if (class9.mapDotSprites == null) {
						class9.mapDotSprites = class430.method7547(class304.archive8, LoginScreenAnimation.spriteIds.field4371, 0);
					} else {
						++var26;
					}
					if (class126.scrollBarSprites == null) {
						class126.scrollBarSprites = ClanChannelMember.method2867(class304.archive8, LoginScreenAnimation.spriteIds.field4375, 0);
					} else {
						++var26;
					}
					if (ClientPreferences.modIconSprites == null) {
						ClientPreferences.modIconSprites = ClanChannelMember.method2867(class304.archive8, LoginScreenAnimation.spriteIds.field4376, 0);
					} else {
						++var26;
					}
					if (var26 < 11) {
						Login.Login_loadingText = "Loading sprites - " + var26 * 100 / 12 + "%";
						Login.Login_loadingPercent = 70;
					} else {
						AbstractFont.AbstractFont_modIconSprites = ClientPreferences.modIconSprites;
						class344.redHintArrowSprite.normalize();
						var1 = ((int) (Math.random() * 21.0)) - 10;
						int var2 = ((int) (Math.random() * 21.0)) - 10;
						int var3 = ((int) (Math.random() * 21.0)) - 10;
						int var4 = ((int) (Math.random() * 41.0)) - 20;
						class13.mapSceneSprites[0].shiftColors(var4 + var1, var4 + var2, var3 + var4);
						Login.Login_loadingText = "Loaded sprites";
						Login.Login_loadingPercent = 70;
						Client.titleLoadingStage = 90;
					}
				} else if (Client.titleLoadingStage == 90) {
					if (!Language.field4098.isFullyLoaded()) {
						Login.Login_loadingText = "Loading textures - " + "0%";
						Login.Login_loadingPercent = 90;
					} else {
						class12.textureProvider = new TextureProvider(Language.field4098, class304.archive8, 20, class19.clientPreferences.method2254(), Client.isLowDetail ? 64 : 128);
						Rasterizer3D.Rasterizer3D_setTextureLoader(class12.textureProvider);
						Rasterizer3D.Rasterizer3D_setBrightness(class19.clientPreferences.method2254());
						Client.titleLoadingStage = 100;
					}
				} else if (Client.titleLoadingStage == 100) {
					var26 = class12.textureProvider.getLoadedPercentage();
					if (var26 < 100) {
						Login.Login_loadingText = "Loading textures - " + var26 + "%";
						Login.Login_loadingPercent = 90;
					} else {
						Login.Login_loadingText = "Loaded textures";
						Login.Login_loadingPercent = 90;
						Client.titleLoadingStage = 110;
					}
				} else if (Client.titleLoadingStage == 110) {
					ItemLayer.mouseRecorder = new MouseRecorder();
					GameEngine.taskHandler.newThreadTask(ItemLayer.mouseRecorder, 10);
					Login.Login_loadingText = "Loaded input handler";
					Login.Login_loadingPercent = 92;
					Client.titleLoadingStage = 120;
				} else if (Client.titleLoadingStage == 120) {
					if (!ApproximateRouteStrategy.archive10.tryLoadFileByNames("huffman", "")) {
						Login.Login_loadingText = "Loading wordpack - " + 0 + "%";
						Login.Login_loadingPercent = 94;
					} else {
						Huffman var0 = new Huffman(ApproximateRouteStrategy.archive10.takeFileByNames("huffman", ""));
						class281.huffman = var0;
						Login.Login_loadingText = "Loaded wordpack";
						Login.Login_loadingPercent = 94;
						Client.titleLoadingStage = 130;
					}
				} else if (Client.titleLoadingStage == 130) {
					if (!class341.archive7.isFullyLoaded()) {
						Login.Login_loadingText = "Loading interfaces - " + class341.archive7.loadPercent() * 4 / 5 + "%";
						Login.Login_loadingPercent = 96;
					} else if (!class267.archive12.isFullyLoaded()) {
						Login.Login_loadingText = "Loading interfaces - " + (80 + class267.archive12.loadPercent() / 6) + "%";
						Login.Login_loadingPercent = 96;
					} else if (!AbstractByteArrayCopier.archive13.isFullyLoaded()) {
						Login.Login_loadingText = "Loading interfaces - " + (96 + AbstractByteArrayCopier.archive13.loadPercent() / 50) + "%";
						Login.Login_loadingPercent = 96;
					} else {
						Login.Login_loadingText = "Loaded interfaces";
						Login.Login_loadingPercent = 98;
						Client.titleLoadingStage = 140;
					}
				} else if (Client.titleLoadingStage == 140) {
					Login.Login_loadingPercent = 100;
					if (!MouseHandler.archive19.tryLoadGroupByName(WorldMapCacheName.field2867.name)) {
						Login.Login_loadingText = "Loading world map - " + MouseHandler.archive19.groupLoadPercentByName(WorldMapCacheName.field2867.name) / 10 + "%";
					} else {
						if (class121.worldMap == null) {
							class121.worldMap = new WorldMap();
							class121.worldMap.init(MouseHandler.archive19, AbstractUserComparator.archive18, class4.archive20, TileItem.fontBold12, Client.fontsMap, class13.mapSceneSprites);
						}
						Login.Login_loadingText = "Loaded world map";
						Client.titleLoadingStage = 150;
					}
				} else if (Client.titleLoadingStage == 150) {
					HealthBarUpdate.updateGameState(10);
				}
			}
		} else {
			byte var19 = 0;
			var26 = var19 + Varcs.archive5.percentage() * 4 / 100;
			var26 += WorldMapEvent.field2882.percentage() * 4 / 100;
			var26 += class140.archive2.percentage() * 2 / 100;
			var26 += class341.archive7.percentage() * 2 / 100;
			var26 += Client.archive4.percentage() * 6 / 100;
			var26 += WorldMapSectionType.archive9.percentage() * 4 / 100;
			var26 += class121.archive6.percentage() * 2 / 100;
			var26 += class10.archive11.percentage() * 55 / 100;
			var26 += class304.archive8.percentage() * 2 / 100;
			var26 += Language.field4098.percentage() * 2 / 100;
			var26 += ApproximateRouteStrategy.archive10.percentage() * 2 / 100;
			var26 += UserComparator7.field1383.percentage() * 2 / 100;
			var26 += class267.archive12.percentage() * 2 / 100;
			var26 += AbstractByteArrayCopier.archive13.percentage() * 2 / 100;
			var26 += WorldMapSprite.archive14.percentage() * 2 / 100;
			var26 += class67.archive15.percentage() * 2 / 100;
			var26 += MouseHandler.archive19.percentage() / 100;
			var26 += AbstractUserComparator.archive18.percentage() / 100;
			var26 += class4.archive20.percentage() / 100;
			var26 += class132.field1588.percentage() / 100;
			var26 += (class6.archive17.method5795() && class6.archive17.isFullyLoaded()) ? 1 : 0;
			if (var26 != 100) {
				if (var26 != 0) {
					Login.Login_loadingText = "Checking for updates - " + var26 + "%";
				}
				Login.Login_loadingPercent = 30;
			} else {
				HealthBarUpdate.method2202(Varcs.archive5, "Animations");
				HealthBarUpdate.method2202(WorldMapEvent.field2882, "Skeletons");
				HealthBarUpdate.method2202(Client.archive4, "Sound FX");
				HealthBarUpdate.method2202(WorldMapSectionType.archive9, "Maps");
				HealthBarUpdate.method2202(class121.archive6, "Music Tracks");
				HealthBarUpdate.method2202(class10.archive11, "Models");
				HealthBarUpdate.method2202(class304.archive8, "Sprites");
				HealthBarUpdate.method2202(UserComparator7.field1383, "Music Jingles");
				HealthBarUpdate.method2202(WorldMapSprite.archive14, "Music Samples");
				HealthBarUpdate.method2202(class67.archive15, "Music Patches");
				HealthBarUpdate.method2202(MouseHandler.archive19, "World Map");
				HealthBarUpdate.method2202(AbstractUserComparator.archive18, "World Map Geography");
				HealthBarUpdate.method2202(class4.archive20, "World Map Ground");
				LoginScreenAnimation.spriteIds = new GraphicsDefaults();
				LoginScreenAnimation.spriteIds.decode(class6.archive17);
				Login.Login_loadingText = "Loaded update list";
				Login.Login_loadingPercent = 30;
				Client.titleLoadingStage = 45;
			}
		}
	}
}