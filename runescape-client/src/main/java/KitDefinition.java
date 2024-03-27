import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
@Implements("KitDefinition")
public class KitDefinition extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("KitDefinition_archive")
	public static AbstractArchive KitDefinition_archive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("KitDefinition_modelsArchive")
	public static AbstractArchive KitDefinition_modelsArchive;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("KitDefinition_cached")
	static EvictingDualNodeHashTable KitDefinition_cached;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -2095995371
	)
	@Export("bodypartID")
	public int bodypartID;
	@ObfuscatedName("ao")
	@Export("models2")
	int[] models2;
	@ObfuscatedName("ab")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("aw")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("ad")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("al")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("as")
	@Export("models")
	int[] models;
	@ObfuscatedName("ag")
	@Export("nonSelectable")
	public boolean nonSelectable;

	static {
		KitDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	KitDefinition() {
		this.bodypartID = -1;
		this.models = new int[]{-1, -1, -1, -1, -1};
		this.nonSelectable = false;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lur;S)V",
		garbageValue = "-1456"
	)
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lur;II)V",
		garbageValue = "-1126295738"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.bodypartID = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 2) {
				var3 = var1.readUnsignedByte();
				this.models2 = new int[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.models2[var4] = var1.readUnsignedShort();
				}
			} else if (var2 == 3) {
				this.nonSelectable = true;
			} else if (var2 == 40) {
				var3 = var1.readUnsignedByte();
				this.recolorFrom = new short[var3];
				this.recolorTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.recolorFrom[var4] = (short)var1.readUnsignedShort();
					this.recolorTo[var4] = (short)var1.readUnsignedShort();
				}
			} else if (var2 == 41) {
				var3 = var1.readUnsignedByte();
				this.retextureFrom = new short[var3];
				this.retextureTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.retextureFrom[var4] = (short)var1.readUnsignedShort();
					this.retextureTo[var4] = (short)var1.readUnsignedShort();
				}
			} else if (var2 >= 60 && var2 < 70) {
				this.models[var2 - 60] = var1.readUnsignedShort();
			}
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-864799211"
	)
	@Export("ready")
	public boolean ready() {
		if (this.models2 == null) {
			return true;
		} else {
			boolean var1 = true;

			for (int var2 = 0; var2 < this.models2.length; ++var2) {
				if (!KitDefinition_modelsArchive.tryLoadFile(this.models2[var2], 0)) {
					var1 = false;
				}
			}

			return var1;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Ljj;",
		garbageValue = "23"
	)
	@Export("getModelData")
	public ModelData getModelData() {
		if (this.models2 == null) {
			return null;
		} else {
			ModelData[] var1 = new ModelData[this.models2.length];

			for (int var2 = 0; var2 < this.models2.length; ++var2) {
				var1[var2] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models2[var2], 0);
			}

			ModelData var4;
			if (var1.length == 1) {
				var4 = var1[0];
			} else {
				var4 = new ModelData(var1, var1.length);
			}

			int var3;
			if (this.recolorFrom != null) {
				for (var3 = 0; var3 < this.recolorFrom.length; ++var3) {
					var4.recolor(this.recolorFrom[var3], this.recolorTo[var3]);
				}
			}

			if (this.retextureFrom != null) {
				for (var3 = 0; var3 < this.retextureFrom.length; ++var3) {
					var4.retexture(this.retextureFrom[var3], this.retextureTo[var3]);
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-747233225"
	)
	public boolean method3780() {
		boolean var1 = true;

		for (int var2 = 0; var2 < 5; ++var2) {
			if (this.models[var2] != -1 && !KitDefinition_modelsArchive.tryLoadFile(this.models[var2], 0)) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ljj;",
		garbageValue = "412957617"
	)
	@Export("getKitDefinitionModels")
	public ModelData getKitDefinitionModels() {
		ModelData[] var1 = new ModelData[5];
		int var2 = 0;

		for (int var3 = 0; var3 < 5; ++var3) {
			if (this.models[var3] != -1) {
				var1[var2++] = ModelData.ModelData_get(KitDefinition_modelsArchive, this.models[var3], 0);
			}
		}

		ModelData var5 = new ModelData(var1, var2);
		int var4;
		if (this.recolorFrom != null) {
			for (var4 = 0; var4 < this.recolorFrom.length; ++var4) {
				var5.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
			}
		}

		if (this.retextureFrom != null) {
			for (var4 = 0; var4 < this.retextureFrom.length; ++var4) {
				var5.retexture(this.retextureFrom[var4], this.retextureTo[var4]);
			}
		}

		return var5;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([Lpk;IB)Lpk;",
		garbageValue = "99"
	)
	@Export("findEnumerated")
	public static Enum findEnumerated(Enum[] var0, int var1) {
		Enum[] var2 = var0;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			Enum var4 = var2[var3];
			if (var1 == var4.rsOrdinal()) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Loc;B)V",
		garbageValue = "0"
	)
	public static void method3804(AbstractArchive var0) {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-1947071788"
	)
	public static int method3778(CharSequence var0) {
		return class442.method8005(var0, 10, true);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljn;IIIII)Z",
		garbageValue = "29544109"
	)
	static final boolean method3805(Model var0, int var1, int var2, int var3, int var4) {
		if (!Player.method2361()) {
			return false;
		} else {
			int var6;
			int var7;
			int var8;
			int var11;
			int var12;
			int var13;
			int var14;
			int var21;
			int var22;
			if (!ViewportMouse.ViewportMouse_false0) {
				int var5 = Scene.Scene_cameraPitchSine;
				var6 = Scene.Scene_cameraPitchCosine;
				var7 = Scene.Scene_cameraYawSine;
				var8 = Scene.Scene_cameraYawCosine;
				byte var9 = 50;
				short var10 = 3500;
				var11 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.getClipMidX()) * var9 / Rasterizer3D.get3dZoom();
				var12 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.getClipMidY()) * var9 / Rasterizer3D.get3dZoom();
				var13 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.getClipMidX()) * var10 / Rasterizer3D.get3dZoom();
				var14 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.getClipMidY()) * var10 / Rasterizer3D.get3dZoom();
				int var16 = var12 * var6 + var5 * var9 >> 16;
				var21 = HttpRequest.method99(var12, var9, var6, var5);
				int var17 = var14 * var6 + var10 * var5 >> 16;
				var22 = HttpRequest.method99(var14, var10, var6, var5);
				int var15 = IndexCheck.method4316(var11, var21, var8, var7);
				int var18 = var21 * var8 + var7 * var11 >> 16;
				var11 = var15;
				var15 = IndexCheck.method4316(var13, var22, var8, var7);
				int var19 = var8 * var22 + var13 * var7 >> 16;
				ViewportMouse.field2855 = (var15 + var11) / 2;
				ViewportMouse.field2862 = (var17 + var16) / 2;
				class472.field4889 = (var18 + var19) / 2;
				ViewportMouse.field2861 = (var15 - var11) / 2;
				NpcOverrides.field2094 = (var17 - var16) / 2;
				class106.field1375 = (var19 - var18) / 2;
				ViewportMouse.field2859 = Math.abs(ViewportMouse.field2861);
				class127.field1519 = Math.abs(NpcOverrides.field2094);
				class469.field4868 = Math.abs(class106.field1375);
			}

			AABB var20 = (AABB)var0.aabb.get(var1);
			var6 = var2 + var20.xMid;
			var7 = var3 + var20.yMid;
			var8 = var4 + var20.zMid;
			var21 = var20.xMidOffset;
			var22 = var20.yMidOffset;
			var11 = var20.zMidOffset;
			var12 = ViewportMouse.field2855 - var6;
			var13 = ViewportMouse.field2862 - var7;
			var14 = class472.field4889 - var8;
			if (Math.abs(var12) > var21 + ViewportMouse.field2859) {
				return false;
			} else if (Math.abs(var13) > var22 + class127.field1519) {
				return false;
			} else if (Math.abs(var14) > var11 + class469.field4868) {
				return false;
			} else if (Math.abs(var14 * NpcOverrides.field2094 - var13 * class106.field1375) > var22 * class469.field4868 + var11 * class127.field1519) {
				return false;
			} else if (Math.abs(var12 * class106.field1375 - var14 * ViewportMouse.field2861) > var11 * ViewportMouse.field2859 + var21 * class469.field4868) {
				return false;
			} else {
				return Math.abs(var13 * ViewportMouse.field2861 - var12 * NpcOverrides.field2094) <= var21 * class127.field1519 + var22 * ViewportMouse.field2859;
			}
		}
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-843602483"
	)
	static void method3775() {
		if (class93.field1152 == Client.field540) {
			class141.field1669 = WorldMapLabelSize.newArchive(class376.field4402.field4407, false, true, true, false);
			UserComparator6.archive6 = WorldMapLabelSize.newArchive(class376.field4391.field4407, true, true, true, false);
			GameEngine.archive8 = WorldMapLabelSize.newArchive(class376.field4393.field4407, false, true, true, false);
			SpriteMask.archive10 = WorldMapLabelSize.newArchive(class376.field4395.field4407, false, true, true, false);
			LoginState.archive13 = WorldMapLabelSize.newArchive(class376.field4398.field4407, true, false, true, false);
			class93.field1170 = WorldMapLabelSize.newArchive(class376.field4399.field4407, false, true, true, false);
			GraphicsObject.field883 = WorldMapLabelSize.newArchive(class376.field4384.field4407, false, true, true, false);
			HorizontalAlignment.method3850(20, "Connecting to update server");
			ConcurrentMidiTask.method7851(class93.field1155);
		} else {
			int var0;
			byte var43;
			if (class93.field1155 == Client.field540) {
				var43 = 0;
				var0 = var43 + class141.field1669.percentage() * 53 / 100;
				var0 += UserComparator6.archive6.percentage() * 5 / 100;
				var0 += GameEngine.archive8.percentage() * 36 / 100;
				var0 += SpriteMask.archive10.percentage() / 100;
				var0 += LoginState.archive13.percentage() / 100;
				var0 += class93.field1170.percentage() * 3 / 100;
				var0 += GraphicsObject.field883.percentage() / 100;
				if (var0 != 100) {
					if (var0 != 0) {
						HorizontalAlignment.method3850(30, "Checking for updates - " + var0 + "%");
					}

				} else {
					UserComparator6.method2944(class141.field1669, "Sound FX");
					UserComparator6.method2944(UserComparator6.archive6, "Music Tracks");
					UserComparator6.method2944(GameEngine.archive8, "Sprites");
					UserComparator6.method2944(class93.field1170, "Music Samples");
					UserComparator6.method2944(GraphicsObject.field883, "Music Patches");
					HorizontalAlignment.method3850(40, "Loaded update list");
					ConcurrentMidiTask.method7851(class93.field1161);
				}
			} else if (class93.field1161 == Client.field540) {
				boolean var44 = !Client.isLowDetail;
				class472.field4892 = -1623100384;
				PcmPlayer.PcmPlayer_stereo = var44;
				class203.field2080 = 2;
				ArrayList var33 = new ArrayList(3);
				TaskHandler var37 = class350.taskHandler;
				short var39 = 2048;
				if (class472.field4892 * 722468864 == 0) {
					throw new IllegalStateException();
				} else {
					if (var39 < 256) {
						var39 = 256;
					}

					PcmPlayer var38;
					try {
						PcmPlayer var40 = class129.pcmPlayerProvider.player();
						var40.samples = new int[(PcmPlayer.PcmPlayer_stereo ? 2 : 1) * 256];
						var40.field270 = var39;
						var40.init();
						var40.capacity = (var39 & -1024) + 1024;
						if (var40.capacity > 16384) {
							var40.capacity = 16384;
						}

						var40.open(var40.capacity);
						if (class203.field2080 > 0 && PcmPlayer.soundSystem == null) {
							PcmPlayer.soundSystem = new SoundSystem();
							LoginPacket.soundSystemExecutor = Executors.newScheduledThreadPool(1);
							LoginPacket.soundSystemExecutor.scheduleAtFixedRate(PcmPlayer.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
						}

						if (PcmPlayer.soundSystem != null) {
							if (PcmPlayer.soundSystem.players[0] != null) {
								throw new IllegalArgumentException();
							}

							PcmPlayer.soundSystem.players[0] = var40;
						}

						var38 = var40;
					} catch (Throwable var32) {
						var38 = new PcmPlayer();
					}

					class144.pcmPlayer1 = var38;
					HealthBarUpdate.pcmStreamMixer = new PcmStreamMixer();
					PcmStreamMixer var41 = new PcmStreamMixer();
					var41.addSubStream(HealthBarUpdate.pcmStreamMixer);

					for (int var6 = 0; var6 < 3; ++var6) {
						MidiPcmStream var42 = new MidiPcmStream(class144.pcmPlayer1);
						var42.method6009(9, 128);
						var41.addSubStream(var42);
						var33.add(var42);
					}

					class144.pcmPlayer1.setStream(var41);
					class11.method109(GraphicsObject.field883, class93.field1170, class141.field1669, var33);
					class86.decimator = new Decimator(22050, class472.field4892 * 722468864);
					HorizontalAlignment.method3850(60, "Prepared sound engine");
					ConcurrentMidiTask.method7851(class93.field1158);
				}
			} else {
				int var27;
				if (Client.field540 == class93.field1158) {
					if (SecureRandomSSLSocket.field54 == null) {
						SecureRandomSSLSocket.field54 = new Fonts(GameEngine.archive8, LoginState.archive13);
					}

					FontName[] var47 = new FontName[]{FontName.FontName_plain12, FontName.FontName_verdana15, FontName.FontName_plain11, FontName.FontName_verdana13, FontName.FontName_verdana11, FontName.FontName_bold12};
					var27 = var47.length;
					Fonts var35 = SecureRandomSSLSocket.field54;
					FontName[] var36 = new FontName[]{FontName.FontName_plain12, FontName.FontName_verdana15, FontName.FontName_plain11, FontName.FontName_verdana13, FontName.FontName_verdana11, FontName.FontName_bold12};
					Client.fontsMap = var35.createMap(var36);
					if (Client.fontsMap.size() < var27) {
						HorizontalAlignment.method3850(80, "Loading fonts - " + Client.fontsMap.size() * 100 / var27 + "%");
					} else {
						DevicePcmPlayerProvider.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
						class316.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
						DevicePcmPlayerProvider.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
						class166.platformInfo = Client.field621.get();
						HorizontalAlignment.method3850(80, "Loaded fonts");
						ConcurrentMidiTask.method7851(class93.field1159);
					}
				} else if (Client.field540 == class93.field1159) {
					var0 = class17.method254(SpriteMask.archive10, GameEngine.archive8);
					var27 = WorldMapIcon_0.method5598(GameEngine.archive8);
					if (var0 < var27) {
						HorizontalAlignment.method3850(90, "Loading title screen - " + var0 * 100 / var27 + "%");
					} else {
						HorizontalAlignment.method3850(100, "Loaded title screen");
						if (ScriptFrame.field460) {
							FaceNormal.updateGameState(5);
							ConcurrentMidiTask.method7851(class93.field1154);
						} else {
							ConcurrentMidiTask.method7851(class93.field1156);
						}

					}
				} else if (Client.field540 == class93.field1154) {
					FaceNormal.updateGameState(10);
				} else {
					Archive var26;
					if (Client.field540 == class93.field1156) {
						UrlRequester.field1452 = WorldMapLabelSize.newArchive(class376.field4405.field4407, false, true, true, false);
						class17.field75 = WorldMapLabelSize.newArchive(class376.field4386.field4407, false, true, true, false);
						UserComparator9.archive2 = WorldMapLabelSize.newArchive(class376.field4388.field4407, true, false, true, false);
						GrandExchangeOfferOwnWorldComparator.archive4 = WorldMapLabelSize.newArchive(class376.field4397.field4407, false, true, true, false);
						class73.archive9 = WorldMapLabelSize.newArchive(class376.field4390.field4407, true, true, true, false);
						class470.field4874 = WorldMapLabelSize.newArchive(class376.field4392.field4407, false, true, true, false);
						class107.field1377 = WorldMapLabelSize.newArchive(class376.field4394.field4407, false, true, true, false);
						WorldMapScaleHandler.field3167 = WorldMapLabelSize.newArchive(class376.field4400.field4407, false, true, true, false);
						GrandExchangeOfferOwnWorldComparator.archive12 = WorldMapLabelSize.newArchive(class376.field4385.field4407, false, true, true, false);
						SceneTilePaint.field2883 = WorldMapLabelSize.newArchive(class376.field4401.field4407, true, true, true, false);
						PlayerType.field4332 = WorldMapLabelSize.newArchive(class376.field4387.field4407, false, true, true, false);
						SoundCache.field308 = WorldMapLabelSize.newArchive(class376.field4403.field4407, false, true, true, false);
						class153.field1726 = WorldMapLabelSize.newArchive(class376.field4404.field4407, false, true, true, false);
						HttpHeaders.field4743 = WorldMapLabelSize.newArchive(class376.field4396.field4407, false, true, true, false);
						var27 = class376.field4406.field4407;
						ArchiveDisk var34 = null;
						if (JagexCache.JagexCache_dat2File != null) {
							var34 = new ArchiveDisk(var27, JagexCache.JagexCache_dat2File, UserComparator5.JagexCache_idxFiles[var27], 1000000);
						}

						var26 = new Archive(var34, Decimator.masterDisk, ChatChannel.field1023, var27, false, true, true, true, true);
						PcmPlayer.field283 = var26;
						HorizontalAlignment.method3850(20, "Connecting to update server");
						ConcurrentMidiTask.method7851(class93.field1168);
					} else if (class93.field1168 == Client.field540) {
						var43 = 0;
						var0 = var43 + UrlRequester.field1452.percentage() * 5 / 100;
						var0 += class17.field75.percentage() * 2 / 100;
						var0 += UserComparator9.archive2.percentage() / 100;
						var0 += GrandExchangeOfferOwnWorldComparator.archive4.percentage() / 100;
						var0 += class73.archive9.percentage() * 10 / 100;
						var0 += class470.field4874.percentage() * 65 / 100;
						var0 += class107.field1377.percentage() / 100;
						var0 += WorldMapScaleHandler.field3167.percentage() / 100;
						var0 += GrandExchangeOfferOwnWorldComparator.archive12.percentage() * 6 / 100;
						var0 += SoundCache.field308.percentage() / 100;
						var0 += PlayerType.field4332.percentage() * 2 / 100;
						var0 += class153.field1726.percentage() * 2 / 100;
						var0 += HttpHeaders.field4743.percentage() / 100;
						var0 += PcmPlayer.field283.percentage() / 100;
						var0 += SceneTilePaint.field2883.method6907() && SceneTilePaint.field2883.isFullyLoaded() ? 1 : 0;
						if (var0 != 100) {
							if (var0 != 0) {
								HorizontalAlignment.method3850(30, "Checking for updates - " + var0 + "%");
							}

						} else {
							UserComparator6.method2944(UrlRequester.field1452, "Animations");
							UserComparator6.method2944(class17.field75, "Skeletons");
							UserComparator6.method2944(class73.archive9, "Maps");
							UserComparator6.method2944(class470.field4874, "Models");
							UserComparator6.method2944(WorldMapScaleHandler.field3167, "Music Jingles");
							UserComparator6.method2944(SoundCache.field308, "World Map");
							UserComparator6.method2944(PlayerType.field4332, "World Map Geography");
							UserComparator6.method2944(class153.field1726, "World Map Ground");
							class345.field3680 = new GraphicsDefaults();
							class345.field3680.decode(SceneTilePaint.field2883);
							HorizontalAlignment.method3850(30, "Loaded update list");
							ConcurrentMidiTask.method7851(class93.field1164);
						}
					} else if (class93.field1164 == Client.field540) {
						LoginType.scene = new Scene(4, 104, 104, Tiles.Tiles_heights);

						for (var0 = 0; var0 < 4; ++var0) {
							Client.collisionMaps[var0] = new CollisionMap(104, 104);
						}

						Interpreter.sceneMinimapSprite = new SpritePixels(512, 512);
						HorizontalAlignment.method3850(30, "Starting game engine...");
						ConcurrentMidiTask.method7851(class93.field1160);
					} else if (class93.field1160 != Client.field540) {
						if (class93.field1153 == Client.field540) {
							var0 = 0;
							if (FloorDecoration.compass == null) {
								FloorDecoration.compass = GraphicsObject.SpriteBuffer_getSprite(GameEngine.archive8, class345.field3680.field4851, 0);
							} else {
								++var0;
							}

							if (class315.redHintArrowSprite == null) {
								class315.redHintArrowSprite = GraphicsObject.SpriteBuffer_getSprite(GameEngine.archive8, class345.field3680.field4843, 0);
							} else {
								++var0;
							}

							if (CollisionMap.mapSceneSprites == null) {
								CollisionMap.mapSceneSprites = class225.method4272(GameEngine.archive8, class345.field3680.field4842, 0);
							} else {
								++var0;
							}

							if (class91.headIconPkSprites == null) {
								class91.headIconPkSprites = Player.method2379(GameEngine.archive8, class345.field3680.field4845, 0);
							} else {
								++var0;
							}

							if (class334.headIconPrayerSprites == null) {
								class334.headIconPrayerSprites = Player.method2379(GameEngine.archive8, class345.field3680.field4846, 0);
							} else {
								++var0;
							}

							if (class137.headIconHintSprites == null) {
								class137.headIconHintSprites = Player.method2379(GameEngine.archive8, class345.field3680.field4844, 0);
							} else {
								++var0;
							}

							if (class33.mapDotSprites == null) {
								class33.mapDotSprites = Player.method2379(GameEngine.archive8, class345.field3680.field4848, 0);
							} else {
								++var0;
							}

							if (class286.crossSprites == null) {
								class286.crossSprites = Player.method2379(GameEngine.archive8, class345.field3680.field4849, 0);
							} else {
								++var0;
							}

							if (KeyHandler.field115 == null) {
								KeyHandler.field115 = Player.method2379(GameEngine.archive8, class345.field3680.field4850, 0);
							} else {
								++var0;
							}

							if (FriendSystem.scrollBarSprites == null) {
								FriendSystem.scrollBarSprites = class225.method4272(GameEngine.archive8, class345.field3680.field4847, 0);
							} else {
								++var0;
							}

							if (class168.field1834 == null) {
								class168.field1834 = class225.method4272(GameEngine.archive8, class345.field3680.field4852, 0);
							} else {
								++var0;
							}

							if (var0 < 11) {
								HorizontalAlignment.method3850(70, "Loading sprites - " + var0 * 100 / 12 + "%");
							} else {
								AbstractFont.AbstractFont_modIconSprites = class168.field1834;
								class315.redHintArrowSprite.normalize();
								var27 = (int)(Math.random() * 21.0D) - 10;
								int var30 = (int)(Math.random() * 21.0D) - 10;
								int var31 = (int)(Math.random() * 21.0D) - 10;
								int var4 = (int)(Math.random() * 41.0D) - 20;
								CollisionMap.mapSceneSprites[0].shiftColors(var4 + var27, var4 + var30, var31 + var4);
								HorizontalAlignment.method3850(60, "Loaded sprites");
								ConcurrentMidiTask.method7851(class93.field1162);
							}
						} else if (Client.field540 == class93.field1162) {
							if (!class107.field1377.isFullyLoaded()) {
								HorizontalAlignment.method3850(70, "Loading textures - " + "0%");
							} else {
								SpriteMask.textureProvider = new TextureProvider(class107.field1377, GameEngine.archive8, 20, NPC.clientPreferences.getBrightness(), Client.isLowDetail ? 64 : 128);
								Rasterizer3D.method4611(SpriteMask.textureProvider);
								Rasterizer3D.method4564(NPC.clientPreferences.getBrightness());
								ConcurrentMidiTask.method7851(class93.field1163);
							}
						} else if (Client.field540 == class93.field1163) {
							var0 = SpriteMask.textureProvider.getLoadedPercentage();
							if (var0 < 100) {
								HorizontalAlignment.method3850(80, "Loading textures - " + var0 + "%");
							} else {
								HorizontalAlignment.method3850(90, "Loaded textures");
								ConcurrentMidiTask.method7851(class93.field1157);
							}
						} else if (Client.field540 == class93.field1157) {
							Tiles.mouseRecorder = new MouseRecorder();
							class350.taskHandler.newThreadTask(Tiles.mouseRecorder, 10);
							HorizontalAlignment.method3850(92, "Loaded input handler");
							ConcurrentMidiTask.method7851(class93.field1165);
						} else if (class93.field1165 == Client.field540) {
							if (!SpriteMask.archive10.tryLoadFileByNames("huffman", "")) {
								HorizontalAlignment.method3850(94, "Loading wordpack - " + 0 + "%");
							} else {
								Huffman var46 = new Huffman(SpriteMask.archive10.takeFileByNames("huffman", ""));
								class28.method403(var46);
								HorizontalAlignment.method3850(94, "Loaded wordpack");
								ConcurrentMidiTask.method7851(class93.field1166);
							}
						} else if (Client.field540 == class93.field1166) {
							if (!GrandExchangeOfferOwnWorldComparator.archive4.isFullyLoaded()) {
								HorizontalAlignment.method3850(96, "Loading interfaces - " + GrandExchangeOfferOwnWorldComparator.archive4.loadPercent() * 4 / 5 + "%");
							} else if (!PcmPlayer.field283.isFullyLoaded()) {
								HorizontalAlignment.method3850(96, "Loading interfaces - " + PcmPlayer.field283.loadPercent() * 4 / 5 + "%");
							} else if (!GrandExchangeOfferOwnWorldComparator.archive12.isFullyLoaded()) {
								HorizontalAlignment.method3850(96, "Loading interfaces - " + (80 + GrandExchangeOfferOwnWorldComparator.archive12.loadPercent() / 6) + "%");
							} else if (!LoginState.archive13.isFullyLoaded()) {
								HorizontalAlignment.method3850(96, "Loading interfaces - " + (96 + LoginState.archive13.loadPercent() / 50) + "%");
							} else {
								HorizontalAlignment.method3850(98, "Loaded interfaces");
								if (GrandExchangeOfferOwnWorldComparator.archive12.isValidFileName("version.dat", "")) {
									Buffer var45 = new Buffer(GrandExchangeOfferOwnWorldComparator.archive12.takeFileByNames("version.dat", ""));
									var45.readUnsignedShort();
								}

								ConcurrentMidiTask.method7851(class93.field1167);
							}
						} else if (Client.field540 == class93.field1167) {
							if (SoundCache.field308.getGroupCount() > 0 && !SoundCache.field308.tryLoadGroupByName(WorldMapCacheName.field3154.name)) {
								HorizontalAlignment.method3850(100, "Loading world map - " + SoundCache.field308.groupLoadPercentByName(WorldMapCacheName.field3154.name) / 10 + "%");
							} else {
								if (ModeWhere.worldMap == null) {
									ModeWhere.worldMap = new WorldMap();
									ModeWhere.worldMap.init(SoundCache.field308, PlayerType.field4332, class153.field1726, DevicePcmPlayerProvider.fontBold12, Client.fontsMap, CollisionMap.mapSceneSprites);
								}

								HorizontalAlignment.method3850(100, "Loaded world map");
								if (ScriptFrame.field460) {
									ConcurrentMidiTask.method7851(class93.field1169);
								} else {
									ConcurrentMidiTask.method7851(class93.field1154);
								}

								Client.field788 = false;
							}
						} else {
							if (Client.field540 == class93.field1169) {
								class276.field3052 = false;
								FaceNormal.updateGameState(20);
								class102.updateLoginState(LoginState.READ_ACCOUNT_INFO_PACKET_SIZE);
							}

						}
					} else if (!UserComparator9.archive2.isFullyLoaded()) {
						HorizontalAlignment.method3850(40, "Loading config - " + UserComparator9.archive2.loadPercent() + "%");
					} else if (!HttpHeaders.field4743.isFullyLoaded()) {
						HorizontalAlignment.method3850(40, "Loading config - " + (80 + GrandExchangeOfferOwnWorldComparator.archive12.loadPercent() / 6) + "%");
					} else {
						UserComparator10.method2922(UserComparator9.archive2);
						var26 = UserComparator9.archive2;
						FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var26;
						Archive var1 = UserComparator9.archive2;
						Archive var2 = class470.field4874;
						KitDefinition_archive = var1;
						KitDefinition_modelsArchive = var2;
						SecureRandomSSLSocket.KitDefinition_fileCount = KitDefinition_archive.getGroupFileCount(3);
						class103.method2663(UserComparator9.archive2, class470.field4874, Client.isLowDetail);
						Archive var3 = UserComparator9.archive2;
						Archive var28 = class470.field4874;
						class191.NpcDefinition_archive = var3;
						Decimator.field395 = var28;
						Archive var5 = UserComparator9.archive2;
						class559.StructDefinition_archive = var5;
						Archive var29 = UserComparator9.archive2;
						Archive var7 = class470.field4874;
						boolean var8 = Client.isMembersWorld;
						Font var9 = DevicePcmPlayerProvider.fontPlain11;
						ItemComposition.ItemDefinition_archive = var29;
						WorldMapSectionType.ItemDefinition_modelArchive = var7;
						class168.ItemDefinition_inMembersWorld = var8;
						ItemComposition.ItemDefinition_fileCount = ItemComposition.ItemDefinition_archive.getGroupFileCount(10);
						FileSystem.ItemDefinition_fontPlain11 = var9;
						Archive var10 = UserComparator9.archive2;
						Archive var11 = UrlRequester.field1452;
						Archive var12 = class17.field75;
						SequenceDefinition.SequenceDefinition_archive = var10;
						class343.SequenceDefinition_animationsArchive = var11;
						UrlRequest.SequenceDefinition_skeletonsArchive = var12;
						Archive var13 = UserComparator9.archive2;
						Archive var14 = class470.field4874;
						SpotAnimationDefinition.SpotAnimationDefinition_archive = var13;
						SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var14;
						GrandExchangeOfferUnitPriceComparator.method7156(UserComparator9.archive2);
						WorldMap.method8917(UserComparator9.archive2);
						class243.widgetDefinition = new WidgetDefinition(GrandExchangeOfferOwnWorldComparator.archive4, class470.field4874, GameEngine.archive8, LoginState.archive13, PcmPlayer.field283);
						Archive var15 = UserComparator9.archive2;
						InvDefinition.InvDefinition_archive = var15;
						UserComparator5.method2892(UserComparator9.archive2);
						ApproximateRouteStrategy.method1185(UserComparator9.archive2);
						method3804(UserComparator9.archive2);
						class286.method5689(UserComparator9.archive2);
						ModeWhere.method7206(UserComparator9.archive2);
						Archive var16 = UserComparator9.archive2;
						DbRowType.field5175 = var16;
						DevicePcmPlayerProvider.field99 = new class517(HorizontalAlignment.field2089, 54, GraphicsObject.clientLanguage, UserComparator9.archive2);
						Tiles.field1043 = new class517(HorizontalAlignment.field2089, 47, GraphicsObject.clientLanguage, UserComparator9.archive2);
						class130.varcs = new Varcs();
						Archive var17 = UserComparator9.archive2;
						Archive var18 = GameEngine.archive8;
						Archive var19 = LoginState.archive13;
						HitSplatDefinition.HitSplatDefinition_archive = var17;
						HitSplatDefinition.field2219 = var18;
						HitSplatDefinition.HitSplatDefinition_fontsArchive = var19;
						Archive var20 = UserComparator9.archive2;
						Archive var21 = GameEngine.archive8;
						HealthBarDefinition.HealthBarDefinition_archive = var20;
						HealthBarDefinition.field2055 = var21;
						Archive var22 = UserComparator9.archive2;
						Archive var23 = GameEngine.archive8;
						WorldMapElement.WorldMapElement_archive = var23;
						if (var22.isFullyLoaded()) {
							UserComparator1.WorldMapElement_count = var22.getGroupFileCount(35);
							WorldMapElement.WorldMapElement_cached = new WorldMapElement[UserComparator1.WorldMapElement_count];

							for (int var24 = 0; var24 < UserComparator1.WorldMapElement_count; ++var24) {
								byte[] var25 = var22.takeFile(35, var24);
								WorldMapElement.WorldMapElement_cached[var24] = new WorldMapElement(var24);
								if (var25 != null) {
									WorldMapElement.WorldMapElement_cached[var24].decode(new Buffer(var25));
									WorldMapElement.WorldMapElement_cached[var24].method3743();
								}
							}
						}

						HorizontalAlignment.method3850(50, "Loaded config");
						ConcurrentMidiTask.method7851(class93.field1153);
					}
				}
			}
		}
	}
}
