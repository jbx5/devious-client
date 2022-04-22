import java.util.HashMap; import java.util.zip.CRC32;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lx")
@Implements("Archive")
public class Archive extends AbstractArchive {
	@ObfuscatedName("q")
	@Export("Archive_crc")
	static CRC32 Archive_crc;
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Lnw;")

	@Export("archiveDisk")
	ArchiveDisk archiveDisk;
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Lnw;")

	@Export("masterDisk")
	ArchiveDisk masterDisk;
	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 
	1229527393)

	@Export("index")
	int index;
	@ObfuscatedName("n")
	volatile boolean field3952;
	@ObfuscatedName("s")
	boolean field3953;
	@ObfuscatedName("l")
	@Export("validGroups")
	volatile boolean[] validGroups;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	-359474927)

	@Export("indexCrc")
	int indexCrc;
	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 
	-1182663877)

	@Export("indexVersion")
	int indexVersion;
	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = 
	-523880279)

	int field3947;
	static 
	{
		Archive_crc = new CRC32();
	}

	@ObfuscatedSignature(descriptor = 
	"(Lnw;Lnw;IZZZ)V")

	public Archive(ArchiveDisk var1, ArchiveDisk var2, int var3, boolean var4, boolean var5, boolean var6) {
		super(var4, var5);
		this.field3952 = false;
		this.field3953 = false;
		this.field3947 = -1;
		this.archiveDisk = var1;
		this.masterDisk = var2;
		this.index = var3;
		this.field3953 = var6;
		int var8 = this.index;
		if (Huffman.NetCache_reference != null) {
			Huffman.NetCache_reference.offset = (var8 * 8) + 5;
			int var9 = Huffman.NetCache_reference.readInt();
			int var10 = Huffman.NetCache_reference.readInt();
			this.loadIndex(var9, var10);
		} else {
			Language.requestNetFile(((Archive) (null)), 255, 255, 0, ((byte) (0)), true);
			NetCache.NetCache_archives[var8] = this;
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"1338724730")

	public boolean method5815() {
		return this.field3952;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"-101")

	@Export("percentage")
	public int percentage() {
		if (this.field3952) {
			return 100;
		} else if (super.groups != null) {
			return 99;
		} else {
			int var2 = this.index;
			long var3 = ((long) (var2 + 16711680));
			int var1;
			if ((class271.NetCache_currentResponse != null) && (class271.NetCache_currentResponse.key == var3)) {
				var1 = ((class194.NetCache_responseArchiveBuffer.offset * 99) / (class194.NetCache_responseArchiveBuffer.array.length - class271.NetCache_currentResponse.padding)) + 1;
			} else {
				var1 = 0;
			}

			int var5 = var1;
			if (var1 >= 100) {
				var5 = 99;
			}

			return var5;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"2136943756")

	@Export("loadRegionFromGroup")
	void loadRegionFromGroup(int var1) {
		Projectile.method1975(this.index, var1);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"0")

	@Export("loadGroup")
	void loadGroup(int var1) {
		if (((this.archiveDisk != null) && (this.validGroups != null)) && this.validGroups[var1]) {
			class17.method256(var1, this.archiveDisk, this);
		} else {
			Language.requestNetFile(this, this.index, var1, super.groupCrcs[var1], ((byte) (2)), true);
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(III)V", garbageValue = 
	"-2075639401")

	@Export("loadIndex")
	public void loadIndex(int var1, int var2) {
		this.indexCrc = var1;
		this.indexVersion = var2;
		if (this.masterDisk != null) {
			class17.method256(this.index, this.masterDisk, this);
		} else {
			Language.requestNetFile(this, 255, this.index, this.indexCrc, ((byte) (0)), true);
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(I[BZZI)V", garbageValue = 
	"2057711923")

	@Export("write")
	public void write(int var1, byte[] var2, boolean var3, boolean var4) {
		if (var3) {
			if (this.field3952) {
				throw new RuntimeException();
			}

			if (this.masterDisk != null) {
				int var5 = this.index;
				ArchiveDisk var6 = this.masterDisk;
				ArchiveDiskAction var7 = new ArchiveDiskAction();
				var7.type = 0;
				var7.key = ((long) (var5));
				var7.data = var2;
				var7.archiveDisk = var6;
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var7);
				}

				TileItem.method2395();
			}

			this.decodeIndex(var2);
			this.loadAllLocal();
		} else {
			var2[var2.length - 2] = ((byte) (super.groupVersions[var1] >> 8));
			var2[var2.length - 1] = ((byte) (super.groupVersions[var1]));
			if (this.archiveDisk != null) {
				ArchiveDisk var11 = this.archiveDisk;
				ArchiveDiskAction var14 = new ArchiveDiskAction();
				var14.type = 0;
				var14.key = ((long) (var1));
				var14.data = var2;
				var14.archiveDisk = var11;
				synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
					ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var14);
				}

				TileItem.method2395();
				this.validGroups[var1] = true;
			}

			if (var4) {
				super.groups[var1] = InterfaceParent.method2084(var2, false);
			}
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(Lnw;I[BZB)V", garbageValue = 
	"82")

	@Export("load")
	public void load(ArchiveDisk var1, int var2, byte[] var3, boolean var4) {
		int var5;
		if (var1 == this.masterDisk) {
			if (this.field3952) {
				throw new RuntimeException();
			}

			if (var3 == null) {
				Language.requestNetFile(this, 255, this.index, this.indexCrc, ((byte) (0)), true);
				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length);
			var5 = ((int) (Archive_crc.getValue()));
			if (var5 != this.indexCrc) {
				Language.requestNetFile(this, 255, this.index, this.indexCrc, ((byte) (0)), true);
				return;
			}

			Buffer var9 = new Buffer(Actor.decompressBytes(var3));
			int var7 = var9.readUnsignedByte();
			if ((var7 != 5) && (var7 != 6)) {
				throw new RuntimeException((((var7 + ",") + this.index) + ",") + var2);
			}

			int var8 = 0;
			if (var7 >= 6) {
				var8 = var9.readInt();
			}

			if (var8 != this.indexVersion) {
				Language.requestNetFile(this, 255, this.index, this.indexCrc, ((byte) (0)), true);
				return;
			}

			this.decodeIndex(var3);
			this.loadAllLocal();
		} else {
			if ((!var4) && (var2 == this.field3947)) {
				this.field3952 = true;
			}

			if ((var3 == null) || (var3.length <= 2)) {
				this.validGroups[var2] = false;
				if (this.field3953 || var4) {
					Language.requestNetFile(this, this.index, var2, super.groupCrcs[var2], ((byte) (2)), var4);
				}

				return;
			}

			Archive_crc.reset();
			Archive_crc.update(var3, 0, var3.length - 2);
			var5 = ((int) (Archive_crc.getValue()));
			int var6 = ((var3[var3.length - 2] & 255) << 8) + (var3[var3.length - 1] & 255);
			if ((var5 != super.groupCrcs[var2]) || (var6 != super.groupVersions[var2])) {
				this.validGroups[var2] = false;
				if (this.field3953 || var4) {
					Language.requestNetFile(this, this.index, var2, super.groupCrcs[var2], ((byte) (2)), var4);
				}

				return;
			}

			this.validGroups[var2] = true;
			if (var4) {
				super.groups[var2] = InterfaceParent.method2084(var3, false);
			}
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"8")

	@Export("loadAllLocal")
	void loadAllLocal() {
		this.validGroups = new boolean[super.groups.length];

		int var1;
		for (var1 = 0; var1 < this.validGroups.length; ++var1) {
			this.validGroups[var1] = false;
		}

		if (this.archiveDisk == null) {
			this.field3952 = true;
		} else {
			this.field3947 = -1;

			for (var1 = 0; var1 < this.validGroups.length; ++var1) {
				if (super.fileCounts[var1] > 0) {
					ArchiveDisk var2 = this.archiveDisk;
					ArchiveDiskAction var4 = new ArchiveDiskAction();
					var4.type = 1;
					var4.key = ((long) (var1));
					var4.archiveDisk = var2;
					var4.archive = this;
					synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
						ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var4);
					}

					TileItem.method2395();
					this.field3947 = var1;
				}
			}

			if (this.field3947 == (-1)) {
				this.field3952 = true;
			}

		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"(II)I", garbageValue = 
	"-1034622346")

	@Export("groupLoadPercent")
	int groupLoadPercent(int var1) {
		if (super.groups[var1] != null) {
			return 100;
		} else if (this.validGroups[var1]) {
			return 100;
		} else {
			int var3 = this.index;
			long var4 = ((long) ((var3 << 16) + var1));
			int var2;
			if ((class271.NetCache_currentResponse != null) && (class271.NetCache_currentResponse.key == var4)) {
				var2 = ((class194.NetCache_responseArchiveBuffer.offset * 99) / (class194.NetCache_responseArchiveBuffer.array.length - class271.NetCache_currentResponse.padding)) + 1;
			} else {
				var2 = 0;
			}

			return var2;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(II)Z", garbageValue = 
	"1922129831")

	public boolean method5814(int var1) {
		return this.validGroups[var1];
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(II)Z", garbageValue = 
	"-1391440725")

	public boolean method5824(int var1) {
		return this.getGroupFileIds(var1) != null;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"118")

	@Export("loadPercent")
	public int loadPercent() {
		int var1 = 0;
		int var2 = 0;

		int var3;
		for (var3 = 0; var3 < super.groups.length; ++var3) {
			if (super.fileCounts[var3] > 0) {
				var1 += 100;
				var2 += this.groupLoadPercent(var3);
			}
		}

		if (var1 == 0) {
			return 100;
		} else {
			var3 = (var2 * 100) / var1;
			return var3;
		}
	}

	@ObfuscatedName("fa")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"875632133")

	@Export("load")
	static void load() {
		int var14;
		if (Client.titleLoadingStage == 0) {
			ArchiveLoader.scene = new Scene(4, 104, 104, Tiles.Tiles_heights);

			for (var14 = 0; var14 < 4; ++var14) {
				Client.collisionMaps[var14] = new CollisionMap(104, 104);
			}

			HealthBarUpdate.sceneMinimapSprite = new SpritePixels(512, 512);
			Login.Login_loadingText = "Starting game engine...";
			Login.Login_loadingPercent = 5;
			Client.titleLoadingStage = 20;
		} else if (Client.titleLoadingStage == 20) {
			Login.Login_loadingText = "Prepared visibility map";
			Login.Login_loadingPercent = 10;
			Client.titleLoadingStage = 30;
		} else if (Client.titleLoadingStage == 30) {
			KeyHandler.archive0 = WorldMapID.newArchive(0, false, true, true);
			UserComparator8.archive1 = WorldMapID.newArchive(1, false, true, true);
			class10.archive2 = WorldMapID.newArchive(2, true, false, true);
			BufferedNetSocket.archive3 = WorldMapID.newArchive(3, false, true, true);
			class182.archive4 = WorldMapID.newArchive(4, false, true, true);
			Players.archive5 = WorldMapID.newArchive(5, true, true, true);
			class16.archive6 = WorldMapID.newArchive(6, true, true, true);
			LoginScreenAnimation.archive7 = WorldMapID.newArchive(7, false, true, true);
			class145.archive8 = WorldMapID.newArchive(8, false, true, true);
			WorldMapDecorationType.archive9 = WorldMapID.newArchive(9, false, true, true);
			JagexCache.archive10 = WorldMapID.newArchive(10, false, true, true);
			Message.archive11 = WorldMapID.newArchive(11, false, true, true);
			class152.archive12 = WorldMapID.newArchive(12, false, true, true);
			class166.archive13 = WorldMapID.newArchive(13, true, false, true);
			class291.archive14 = WorldMapID.newArchive(14, false, true, true);
			class28.archive15 = WorldMapID.newArchive(15, false, true, true);
			class54.archive17 = WorldMapID.newArchive(17, true, true, true);
			WorldMapRectangle.archive18 = WorldMapID.newArchive(18, false, true, true);
			ObjectSound.archive19 = WorldMapID.newArchive(19, false, true, true);
			ApproximateRouteStrategy.archive20 = WorldMapID.newArchive(20, false, true, true);
			Login.Login_loadingText = "Connecting to update server";
			Login.Login_loadingPercent = 20;
			Client.titleLoadingStage = 40;
		} else if (Client.titleLoadingStage == 40) {
			byte var33 = 0;
			var14 = var33 + ((KeyHandler.archive0.percentage() * 4) / 100);
			var14 += (UserComparator8.archive1.percentage() * 4) / 100;
			var14 += (class10.archive2.percentage() * 2) / 100;
			var14 += (BufferedNetSocket.archive3.percentage() * 2) / 100;
			var14 += (class182.archive4.percentage() * 6) / 100;
			var14 += (Players.archive5.percentage() * 4) / 100;
			var14 += (class16.archive6.percentage() * 2) / 100;
			var14 += (LoginScreenAnimation.archive7.percentage() * 56) / 100;
			var14 += (class145.archive8.percentage() * 2) / 100;
			var14 += (WorldMapDecorationType.archive9.percentage() * 2) / 100;
			var14 += (JagexCache.archive10.percentage() * 2) / 100;
			var14 += (Message.archive11.percentage() * 2) / 100;
			var14 += (class152.archive12.percentage() * 2) / 100;
			var14 += (class166.archive13.percentage() * 2) / 100;
			var14 += (class291.archive14.percentage() * 2) / 100;
			var14 += (class28.archive15.percentage() * 2) / 100;
			var14 += ObjectSound.archive19.percentage() / 100;
			var14 += WorldMapRectangle.archive18.percentage() / 100;
			var14 += ApproximateRouteStrategy.archive20.percentage() / 100;
			var14 += (class54.archive17.method5815() && class54.archive17.isFullyLoaded()) ? 1 : 0;
			if (var14 != 100) {
				if (var14 != 0) {
					Login.Login_loadingText = ("Checking for updates - " + var14) + "%";
				}

				Login.Login_loadingPercent = 30;
			} else {
				class1.method8(KeyHandler.archive0, "Animations");
				class1.method8(UserComparator8.archive1, "Skeletons");
				class1.method8(class182.archive4, "Sound FX");
				class1.method8(Players.archive5, "Maps");
				class1.method8(class16.archive6, "Music Tracks");
				class1.method8(LoginScreenAnimation.archive7, "Models");
				class1.method8(class145.archive8, "Sprites");
				class1.method8(Message.archive11, "Music Jingles");
				class1.method8(class291.archive14, "Music Samples");
				class1.method8(class28.archive15, "Music Patches");
				class1.method8(ObjectSound.archive19, "World Map");
				class1.method8(WorldMapRectangle.archive18, "World Map Geography");
				class1.method8(ApproximateRouteStrategy.archive20, "World Map Ground");
				Language.spriteIds = new GraphicsDefaults();
				Language.spriteIds.decode(class54.archive17);
				Login.Login_loadingText = "Loaded update list";
				Login.Login_loadingPercent = 30;
				Client.titleLoadingStage = 45;
			}
		} else if (Client.titleLoadingStage == 45) {
			class78.method2082(22050, !Client.isLowDetail, 2);
			MidiPcmStream var24 = new MidiPcmStream();
			var24.method5248(9, 128);
			KeyHandler.pcmPlayer0 = Varps.method5523(GameEngine.taskHandler, 0, 22050);
			KeyHandler.pcmPlayer0.setStream(var24);
			AbstractWorldMapData.method4342(class28.archive15, class291.archive14, class182.archive4, var24);
			ViewportMouse.pcmPlayer1 = Varps.method5523(GameEngine.taskHandler, 1, 2048);
			StructComposition.pcmStreamMixer = new PcmStreamMixer();
			ViewportMouse.pcmPlayer1.setStream(StructComposition.pcmStreamMixer);
			WorldMapRectangle.decimator = new Decimator(22050, PcmPlayer.field268);
			Login.Login_loadingText = "Prepared sound engine";
			Login.Login_loadingPercent = 35;
			Client.titleLoadingStage = 50;
			AbstractWorldMapData.WorldMapElement_fonts = new Fonts(class145.archive8, class166.archive13);
		} else {
			int var15;
			if (Client.titleLoadingStage == 50) {
				FontName[] var23 = new FontName[]{ FontName.FontName_plain11, FontName.FontName_verdana11, FontName.FontName_verdana15, FontName.FontName_plain12, FontName.FontName_bold12, FontName.FontName_verdana13 };
				var15 = var23.length;
				Fonts var25 = AbstractWorldMapData.WorldMapElement_fonts;
				FontName[] var31 = new FontName[]{ FontName.FontName_plain11, FontName.FontName_verdana11, FontName.FontName_verdana15, FontName.FontName_plain12, FontName.FontName_bold12, FontName.FontName_verdana13 };
				Client.fontsMap = var25.createMap(var31);
				if (Client.fontsMap.size() < var15) {
					Login.Login_loadingText = ("Loading fonts - " + ((Client.fontsMap.size() * 100) / var15)) + "%";
					Login.Login_loadingPercent = 40;
				} else {
					class113.fontPlain11 = ((Font) (Client.fontsMap.get(FontName.FontName_plain11)));
					class13.fontPlain12 = ((Font) (Client.fontsMap.get(FontName.FontName_plain12)));
					RouteStrategy.fontBold12 = ((Font) (Client.fontsMap.get(FontName.FontName_bold12)));
					class263.platformInfo = Client.platformInfoProvider.get();
					Login.Login_loadingText = "Loaded fonts";
					Login.Login_loadingPercent = 40;
					Client.titleLoadingStage = 60;
				}
			} else {
				Archive var2;
				int var3;
				Archive var26;
				int var29;
				if (Client.titleLoadingStage == 60) {
					var26 = JagexCache.archive10;
					var2 = class145.archive8;
					var3 = 0;
					String[] var32 = Login.field917;

					int var21;
					String var28;
					for (var21 = 0; var21 < var32.length; ++var21) {
						var28 = var32[var21];
						if (var26.tryLoadFileByNames(var28, "")) {
							++var3;
						}
					}

					var32 = Login.field918;

					for (var21 = 0; var21 < var32.length; ++var21) {
						var28 = var32[var21];
						if (var2.tryLoadFileByNames(var28, "")) {
							++var3;
						}
					}

					var29 = Login.field917.length + Login.field918.length;
					if (var3 < var29) {
						Login.Login_loadingText = ("Loading title screen - " + ((var3 * 100) / var29)) + "%";
						Login.Login_loadingPercent = 50;
					} else {
						Login.Login_loadingText = "Loaded title screen";
						Login.Login_loadingPercent = 50;
						Decimator.updateGameState(5);
						Client.titleLoadingStage = 70;
					}
				} else if (Client.titleLoadingStage == 70) {
					if (!class10.archive2.isFullyLoaded()) {
						Login.Login_loadingText = ("Loading config - " + class10.archive2.loadPercent()) + "%";
						Login.Login_loadingPercent = 60;
					} else {
						Archive var22 = class10.archive2;
						FloorOverlayDefinition.FloorOverlayDefinition_archive = var22;
						var26 = class10.archive2;
						FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var26;
						var2 = class10.archive2;
						Archive var17 = LoginScreenAnimation.archive7;
						KitDefinition.KitDefinition_archive = var2;
						class147.KitDefinition_modelsArchive = var17;
						KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3);
						Archive var18 = class10.archive2;
						Archive var27 = LoginScreenAnimation.archive7;
						boolean var19 = Client.isLowDetail;
						WorldMapData_0.ObjectDefinition_archive = var18;
						ObjectComposition.ObjectDefinition_modelsArchive = var27;
						ObjectComposition.ObjectDefinition_isLowDetail = var19;
						KitDefinition.method3452(class10.archive2, LoginScreenAnimation.archive7);
						Archive var20 = class10.archive2;
						StructComposition.StructDefinition_archive = var20;
						class163.method3318(class10.archive2, LoginScreenAnimation.archive7, Client.isMembersWorld, class113.fontPlain11);
						class125.method2811(class10.archive2, KeyHandler.archive0, UserComparator8.archive1);
						Archive var30 = class10.archive2;
						Archive var9 = LoginScreenAnimation.archive7;
						SpotAnimationDefinition.SpotAnimationDefinition_archive = var30;
						SpotAnimationDefinition.SpotAnimationDefinition_modelArchive = var9;
						Archive var10 = class10.archive2;
						class11.VarbitDefinition_archive = var10;
						Archive var11 = class10.archive2;
						VarpDefinition.VarpDefinition_archive = var11;
						VarpDefinition.VarpDefinition_fileCount = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16);
						Renderable.method4917(BufferedNetSocket.archive3, LoginScreenAnimation.archive7, class145.archive8, class166.archive13);
						WorldMapEvent.method4506(class10.archive2);
						Canvas.method357(class10.archive2);
						Archive var12 = class10.archive2;
						class384.VarcInt_archive = var12;
						Bounds.method6969(class10.archive2);
						Archive var13 = class10.archive2;
						ParamComposition.ParamDefinition_archive = var13;
						ReflectionCheck.HitSplatDefinition_cachedSprites = new class426(Messages.field1305, 54, Skills.clientLanguage, class10.archive2);
						DirectByteArrayCopier.HitSplatDefinition_cached = new class426(Messages.field1305, 47, Skills.clientLanguage, class10.archive2);
						class160.varcs = new Varcs();
						UserComparator7.method2590(class10.archive2, class145.archive8, class166.archive13);
						UserComparator5.method2592(class10.archive2, class145.archive8);
						class152.method3170(class10.archive2, class145.archive8);
						Login.Login_loadingText = "Loaded config";
						Login.Login_loadingPercent = 60;
						Client.titleLoadingStage = 80;
					}
				} else if (Client.titleLoadingStage == 80) {
					var14 = 0;
					if (class14.compass == null) {
						class14.compass = class6.SpriteBuffer_getSprite(class145.archive8, Language.spriteIds.compass, 0);
					} else {
						++var14;
					}

					if (Canvas.redHintArrowSprite == null) {
						Canvas.redHintArrowSprite = class6.SpriteBuffer_getSprite(class145.archive8, Language.spriteIds.field4314, 0);
					} else {
						++var14;
					}

					IndexedSprite[] var1;
					boolean var4;
					byte[] var5;
					IndexedSprite[] var6;
					int var7;
					IndexedSprite var8;
					if (GraphicsDefaults.mapSceneSprites == null) {
						var2 = class145.archive8;
						var3 = Language.spriteIds.mapScenes;
						var5 = var2.takeFile(var3, 0);
						if (var5 == null) {
							var4 = false;
						} else {
							WorldMapArea.SpriteBuffer_decode(var5);
							var4 = true;
						}

						if (!var4) {
							var1 = null;
						} else {
							var6 = new IndexedSprite[class451.SpriteBuffer_spriteCount];

							for (var7 = 0; var7 < class451.SpriteBuffer_spriteCount; ++var7) {
								var8 = var6[var7] = new IndexedSprite();
								var8.width = class451.SpriteBuffer_spriteWidth;
								var8.height = class451.SpriteBuffer_spriteHeight;
								var8.xOffset = class451.SpriteBuffer_xOffsets[var7];
								var8.yOffset = class271.SpriteBuffer_yOffsets[var7];
								var8.subWidth = class451.SpriteBuffer_spriteWidths[var7];
								var8.subHeight = class451.SpriteBuffer_spriteHeights[var7];
								var8.palette = NetFileRequest.SpriteBuffer_spritePalette;
								var8.pixels = FriendLoginUpdate.SpriteBuffer_pixels[var7];
							}

							ArchiveDiskActionHandler.method5813();
							var1 = var6;
						}

						GraphicsDefaults.mapSceneSprites = var1;
					} else {
						++var14;
					}

					if (class150.headIconPkSprites == null) {
						class150.headIconPkSprites = class429.method7568(class145.archive8, Language.spriteIds.headIconsPk, 0);
					} else {
						++var14;
					}

					if (WallDecoration.headIconPrayerSprites == null) {
						WallDecoration.headIconPrayerSprites = class429.method7568(class145.archive8, Language.spriteIds.field4322, 0);
					} else {
						++var14;
					}

					if (InvDefinition.headIconHintSprites == null) {
						InvDefinition.headIconHintSprites = class429.method7568(class145.archive8, Language.spriteIds.field4318, 0);
					} else {
						++var14;
					}

					if (WorldMapLabelSize.mapMarkerSprites == null) {
						WorldMapLabelSize.mapMarkerSprites = class429.method7568(class145.archive8, Language.spriteIds.field4319, 0);
					} else {
						++var14;
					}

					if (class11.crossSprites == null) {
						class11.crossSprites = class429.method7568(class145.archive8, Language.spriteIds.field4320, 0);
					} else {
						++var14;
					}

					if (class54.mapDotSprites == null) {
						class54.mapDotSprites = class429.method7568(class145.archive8, Language.spriteIds.field4321, 0);
					} else {
						++var14;
					}

					if (class29.scrollBarSprites == null) {
						var2 = class145.archive8;
						var3 = Language.spriteIds.field4315;
						var5 = var2.takeFile(var3, 0);
						if (var5 == null) {
							var4 = false;
						} else {
							WorldMapArea.SpriteBuffer_decode(var5);
							var4 = true;
						}

						if (!var4) {
							var1 = null;
						} else {
							var6 = new IndexedSprite[class451.SpriteBuffer_spriteCount];

							for (var7 = 0; var7 < class451.SpriteBuffer_spriteCount; ++var7) {
								var8 = var6[var7] = new IndexedSprite();
								var8.width = class451.SpriteBuffer_spriteWidth;
								var8.height = class451.SpriteBuffer_spriteHeight;
								var8.xOffset = class451.SpriteBuffer_xOffsets[var7];
								var8.yOffset = class271.SpriteBuffer_yOffsets[var7];
								var8.subWidth = class451.SpriteBuffer_spriteWidths[var7];
								var8.subHeight = class451.SpriteBuffer_spriteHeights[var7];
								var8.palette = NetFileRequest.SpriteBuffer_spritePalette;
								var8.pixels = FriendLoginUpdate.SpriteBuffer_pixels[var7];
							}

							ArchiveDiskActionHandler.method5813();
							var1 = var6;
						}

						class29.scrollBarSprites = var1;
					} else {
						++var14;
					}

					if (PcmPlayer.modIconSprites == null) {
						var2 = class145.archive8;
						var3 = Language.spriteIds.field4323;
						var5 = var2.takeFile(var3, 0);
						if (var5 == null) {
							var4 = false;
						} else {
							WorldMapArea.SpriteBuffer_decode(var5);
							var4 = true;
						}

						if (!var4) {
							var1 = null;
						} else {
							var6 = new IndexedSprite[class451.SpriteBuffer_spriteCount];

							for (var7 = 0; var7 < class451.SpriteBuffer_spriteCount; ++var7) {
								var8 = var6[var7] = new IndexedSprite();
								var8.width = class451.SpriteBuffer_spriteWidth;
								var8.height = class451.SpriteBuffer_spriteHeight;
								var8.xOffset = class451.SpriteBuffer_xOffsets[var7];
								var8.yOffset = class271.SpriteBuffer_yOffsets[var7];
								var8.subWidth = class451.SpriteBuffer_spriteWidths[var7];
								var8.subHeight = class451.SpriteBuffer_spriteHeights[var7];
								var8.palette = NetFileRequest.SpriteBuffer_spritePalette;
								var8.pixels = FriendLoginUpdate.SpriteBuffer_pixels[var7];
							}

							ArchiveDiskActionHandler.method5813();
							var1 = var6;
						}

						PcmPlayer.modIconSprites = var1;
					} else {
						++var14;
					}

					if (var14 < 11) {
						Login.Login_loadingText = ("Loading sprites - " + ((var14 * 100) / 12)) + "%";
						Login.Login_loadingPercent = 70;
					} else {
						AbstractFont.AbstractFont_modIconSprites = PcmPlayer.modIconSprites;
						Canvas.redHintArrowSprite.normalize();
						var15 = ((int) (Math.random() * 21.0)) - 10;
						int var16 = ((int) (Math.random() * 21.0)) - 10;
						var3 = ((int) (Math.random() * 21.0)) - 10;
						var29 = ((int) (Math.random() * 41.0)) - 20;
						GraphicsDefaults.mapSceneSprites[0].shiftColors(var15 + var29, var29 + var16, var29 + var3);
						Login.Login_loadingText = "Loaded sprites";
						Login.Login_loadingPercent = 70;
						Client.titleLoadingStage = 90;
					}
				} else if (Client.titleLoadingStage == 90) {
					if (!WorldMapDecorationType.archive9.isFullyLoaded()) {
						Login.Login_loadingText = "Loading textures - " + "0%";
						Login.Login_loadingPercent = 90;
					} else {
						class138.textureProvider = new TextureProvider(WorldMapDecorationType.archive9, class145.archive8, 20, class131.clientPreferences.method2240(), Client.isLowDetail ? 64 : 128);
						Rasterizer3D.Rasterizer3D_setTextureLoader(class138.textureProvider);
						Rasterizer3D.Rasterizer3D_setBrightness(class131.clientPreferences.method2240());
						Client.titleLoadingStage = 100;
					}
				} else if (Client.titleLoadingStage == 100) {
					var14 = class138.textureProvider.getLoadedPercentage();
					if (var14 < 100) {
						Login.Login_loadingText = ("Loading textures - " + var14) + "%";
						Login.Login_loadingPercent = 90;
					} else {
						Login.Login_loadingText = "Loaded textures";
						Login.Login_loadingPercent = 90;
						Client.titleLoadingStage = 110;
					}
				} else if (Client.titleLoadingStage == 110) {
					class120.mouseRecorder = new MouseRecorder();
					GameEngine.taskHandler.newThreadTask(class120.mouseRecorder, 10);
					Login.Login_loadingText = "Loaded input handler";
					Login.Login_loadingPercent = 92;
					Client.titleLoadingStage = 120;
				} else if (Client.titleLoadingStage == 120) {
					if (!JagexCache.archive10.tryLoadFileByNames("huffman", "")) {
						Login.Login_loadingText = ("Loading wordpack - " + 0) + "%";
						Login.Login_loadingPercent = 94;
					} else {
						Huffman var0 = new Huffman(JagexCache.archive10.takeFileByNames("huffman", ""));
						class282.huffman = var0;
						Login.Login_loadingText = "Loaded wordpack";
						Login.Login_loadingPercent = 94;
						Client.titleLoadingStage = 130;
					}
				} else if (Client.titleLoadingStage == 130) {
					if (!BufferedNetSocket.archive3.isFullyLoaded()) {
						Login.Login_loadingText = ("Loading interfaces - " + ((BufferedNetSocket.archive3.loadPercent() * 4) / 5)) + "%";
						Login.Login_loadingPercent = 96;
					} else if (!class152.archive12.isFullyLoaded()) {
						Login.Login_loadingText = ("Loading interfaces - " + (80 + (class152.archive12.loadPercent() / 6))) + "%";
						Login.Login_loadingPercent = 96;
					} else if (!class166.archive13.isFullyLoaded()) {
						Login.Login_loadingText = ("Loading interfaces - " + (96 + (class166.archive13.loadPercent() / 50))) + "%";
						Login.Login_loadingPercent = 96;
					} else {
						Login.Login_loadingText = "Loaded interfaces";
						Login.Login_loadingPercent = 98;
						Client.titleLoadingStage = 140;
					}
				} else if (Client.titleLoadingStage == 140) {
					Login.Login_loadingPercent = 100;
					if (!ObjectSound.archive19.tryLoadGroupByName(WorldMapCacheName.field2413.name)) {
						Login.Login_loadingText = ("Loading world map - " + (ObjectSound.archive19.groupLoadPercentByName(WorldMapCacheName.field2413.name) / 10)) + "%";
					} else {
						if (ScriptFrame.worldMap == null) {
							ScriptFrame.worldMap = new WorldMap();
							ScriptFrame.worldMap.init(ObjectSound.archive19, WorldMapRectangle.archive18, ApproximateRouteStrategy.archive20, RouteStrategy.fontBold12, Client.fontsMap, GraphicsDefaults.mapSceneSprites);
						}

						Login.Login_loadingText = "Loaded world map";
						Client.titleLoadingStage = 150;
					}
				} else if (Client.titleLoadingStage == 150) {
					Decimator.updateGameState(10);
				}
			}
		}
	}
}