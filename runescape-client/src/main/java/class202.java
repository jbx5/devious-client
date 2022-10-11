import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
public class class202 {
	@ObfuscatedName("hs")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "[Ldj;"
	)
	class116[] field2398;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -130963285
	)
	int field2399;

	@ObfuscatedSignature(
		descriptor = "(Lqq;I)V"
	)
	class202(Buffer var1, int var2) {
		this.field2398 = new class116[var2]; // L: 13
		this.field2399 = var1.readUnsignedByte(); // L: 14

		for (int var3 = 0; var3 < this.field2398.length; ++var3) { // L: 15
			class116 var4 = new class116(this.field2399, var1, false); // L: 16
			this.field2398[var3] = var4; // L: 17
		}

		this.method4246(); // L: 19
	} // L: 20

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "383"
	)
	void method4246() {
		class116[] var1 = this.field2398; // L: 24

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 25
			class116 var3 = var1[var2]; // L: 26
			if (var3.field1435 >= 0) { // L: 28
				var3.field1429 = this.field2398[var3.field1435]; // L: 29
			}
		}

	} // L: 34

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-35"
	)
	public int method4231() {
		return this.field2398.length; // L: 37
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IB)Ldj;",
		garbageValue = "-119"
	)
	class116 method4232(int var1) {
		return var1 >= this.method4231() ? null : this.field2398[var1]; // L: 41 42 44
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)[Ldj;",
		garbageValue = "-93858276"
	)
	class116[] method4241() {
		return this.field2398; // L: 48
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ldy;II)V",
		garbageValue = "1751066855"
	)
	void method4230(class123 var1, int var2) {
		this.method4235(var1, var2, (boolean[])null, false); // L: 52
	} // L: 53

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ldy;I[ZZI)V",
		garbageValue = "1903455852"
	)
	void method4235(class123 var1, int var2, boolean[] var3, boolean var4) {
		int var5 = var1.method2945(); // L: 56
		int var6 = 0; // L: 57
		class116[] var7 = this.method4241(); // L: 59

		for (int var8 = 0; var8 < var7.length; ++var8) { // L: 60
			class116 var9 = var7[var8]; // L: 61
			if (var3 == null || var4 == var3[var6]) { // L: 63
				var1.method2930(var2, var9, var6, var5); // L: 64
			}

			++var6; // L: 66
		}

	} // L: 70

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ILkz;ZB)V",
		garbageValue = "10"
	)
	static void method4236(int var0, Coord var1, boolean var2) {
		WorldMapArea var3 = UserComparator10.getWorldMap().getMapArea(var0); // L: 4650
		int var4 = class67.localPlayer.plane; // L: 4651
		int var5 = class128.baseX * 64 + (class67.localPlayer.x >> 7); // L: 4652
		int var6 = WorldMapData_1.baseY * 64 + (class67.localPlayer.y >> 7); // L: 4653
		Coord var7 = new Coord(var4, var5, var6); // L: 4654
		UserComparator10.getWorldMap().method7430(var3, var7, var1, var2); // L: 4655
	} // L: 4656

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2088105953"
	)
	@Export("load")
	static void load() {
		int var23;
		if (Client.titleLoadingStage == 0) { // L: 1503
			MusicPatchNode.scene = new Scene(4, 104, 104, Tiles.Tiles_heights); // L: 1504

			for (var23 = 0; var23 < 4; ++var23) { // L: 1505
				Client.collisionMaps[var23] = new CollisionMap(104, 104);
			}

			class11.sceneMinimapSprite = new SpritePixels(512, 512); // L: 1506
			Login.Login_loadingText = "Starting game engine..."; // L: 1507
			Login.Login_loadingPercent = 5; // L: 1508
			Client.titleLoadingStage = 20; // L: 1509
		} else if (Client.titleLoadingStage == 20) { // L: 1512
			Login.Login_loadingText = "Prepared visibility map"; // L: 1513
			Login.Login_loadingPercent = 10; // L: 1514
			Client.titleLoadingStage = 30; // L: 1515
		} else if (Client.titleLoadingStage == 30) { // L: 1518
			DevicePcmPlayerProvider.archive5 = class440.newArchive(0, false, true, true, false); // L: 1519
			HorizontalAlignment.field1926 = class440.newArchive(1, false, true, true, false); // L: 1520
			class119.archive2 = class440.newArchive(2, true, false, true, false); // L: 1521
			class301.archive7 = class440.newArchive(3, false, true, true, false); // L: 1522
			UserComparator10.archive4 = class440.newArchive(4, false, true, true, false); // L: 1523
			class434.archive9 = class440.newArchive(5, true, true, true, false); // L: 1524
			class14.archive6 = class440.newArchive(6, true, true, true, false); // L: 1525
			FaceNormal.archive11 = class440.newArchive(7, false, true, true, false); // L: 1526
			ChatChannel.archive8 = class440.newArchive(8, false, true, true, false); // L: 1527
			class83.field1081 = class440.newArchive(9, false, true, true, false); // L: 1528
			class163.archive10 = class440.newArchive(10, false, true, true, false); // L: 1529
			class283.field3325 = class440.newArchive(11, false, true, true, false); // L: 1530
			class102.archive12 = class440.newArchive(12, false, true, true, false); // L: 1531
			UserList.archive13 = class440.newArchive(13, true, false, true, false); // L: 1532
			class14.archive14 = class440.newArchive(14, false, true, true, false); // L: 1533
			class19.archive15 = class440.newArchive(15, false, true, true, false); // L: 1534
			HealthBar.archive17 = class440.newArchive(17, true, true, true, false); // L: 1535
			class67.archive18 = class440.newArchive(18, false, true, true, false); // L: 1536
			UserComparator10.archive19 = class440.newArchive(19, false, true, true, false); // L: 1537
			Huffman.archive20 = class440.newArchive(20, false, true, true, false); // L: 1538
			PcmPlayer.field308 = class440.newArchive(21, false, true, true, true); // L: 1539
			Login.Login_loadingText = "Connecting to update server"; // L: 1540
			Login.Login_loadingPercent = 20; // L: 1541
			Client.titleLoadingStage = 40; // L: 1542
		} else if (Client.titleLoadingStage == 40) { // L: 1545
			byte var33 = 0; // L: 1546
			var23 = var33 + DevicePcmPlayerProvider.archive5.percentage() * 4 / 100; // L: 1547
			var23 += HorizontalAlignment.field1926.percentage() * 4 / 100; // L: 1548
			var23 += class119.archive2.percentage() * 2 / 100; // L: 1549
			var23 += class301.archive7.percentage() * 2 / 100; // L: 1550
			var23 += UserComparator10.archive4.percentage() * 6 / 100; // L: 1551
			var23 += class434.archive9.percentage() * 4 / 100; // L: 1552
			var23 += class14.archive6.percentage() * 2 / 100; // L: 1553
			var23 += FaceNormal.archive11.percentage() * 55 / 100; // L: 1554
			var23 += ChatChannel.archive8.percentage() * 2 / 100; // L: 1555
			var23 += class83.field1081.percentage() * 2 / 100; // L: 1556
			var23 += class163.archive10.percentage() * 2 / 100; // L: 1557
			var23 += class283.field3325.percentage() * 2 / 100; // L: 1558
			var23 += class102.archive12.percentage() * 2 / 100; // L: 1559
			var23 += UserList.archive13.percentage() * 2 / 100; // L: 1560
			var23 += class14.archive14.percentage() * 2 / 100; // L: 1561
			var23 += class19.archive15.percentage() * 2 / 100; // L: 1562
			var23 += UserComparator10.archive19.percentage() / 100; // L: 1563
			var23 += class67.archive18.percentage() / 100; // L: 1564
			var23 += Huffman.archive20.percentage() / 100; // L: 1565
			var23 += PcmPlayer.field308.percentage() / 100; // L: 1566
			var23 += HealthBar.archive17.method5963() && HealthBar.archive17.isFullyLoaded() ? 1 : 0; // L: 1567
			if (var23 != 100) { // L: 1568
				if (var23 != 0) { // L: 1569
					Login.Login_loadingText = "Checking for updates - " + var23 + "%";
				}

				Login.Login_loadingPercent = 30; // L: 1570
			} else {
				class122.method2926(DevicePcmPlayerProvider.archive5, "Animations"); // L: 1573
				class122.method2926(HorizontalAlignment.field1926, "Skeletons"); // L: 1574
				class122.method2926(UserComparator10.archive4, "Sound FX"); // L: 1575
				class122.method2926(class434.archive9, "Maps"); // L: 1576
				class122.method2926(class14.archive6, "Music Tracks"); // L: 1577
				class122.method2926(FaceNormal.archive11, "Models"); // L: 1578
				class122.method2926(ChatChannel.archive8, "Sprites"); // L: 1579
				class122.method2926(class283.field3325, "Music Jingles"); // L: 1580
				class122.method2926(class14.archive14, "Music Samples"); // L: 1581
				class122.method2926(class19.archive15, "Music Patches"); // L: 1582
				class122.method2926(UserComparator10.archive19, "World Map"); // L: 1583
				class122.method2926(class67.archive18, "World Map Geography"); // L: 1584
				class122.method2926(Huffman.archive20, "World Map Ground"); // L: 1585
				class271.spriteIds = new GraphicsDefaults(); // L: 1586
				class271.spriteIds.decode(HealthBar.archive17); // L: 1587
				Login.Login_loadingText = "Loaded update list"; // L: 1588
				Login.Login_loadingPercent = 30; // L: 1589
				Client.titleLoadingStage = 45; // L: 1590
			}
		} else {
			Archive var24;
			Archive var25;
			Archive var26;
			if (Client.titleLoadingStage == 45) { // L: 1593
				class166.method3490(22050, !Client.isLowDetail, 2); // L: 1594
				MidiPcmStream var30 = new MidiPcmStream(); // L: 1595
				var30.method5495(9, 128); // L: 1596
				class241.pcmPlayer0 = WorldMapSection0.method5064(class11.taskHandler, 0, 22050); // L: 1597
				class241.pcmPlayer0.setStream(var30); // L: 1598
				var24 = class19.archive15; // L: 1599
				var25 = class14.archive14; // L: 1600
				var26 = UserComparator10.archive4; // L: 1601
				class274.musicPatchesArchive = var24; // L: 1603
				class274.musicSamplesArchive = var25; // L: 1604
				class274.soundEffectsArchive = var26; // L: 1605
				class139.midiPcmStream = var30; // L: 1606
				Client.pcmPlayer1 = WorldMapSection0.method5064(class11.taskHandler, 1, 2048); // L: 1608
				class16.pcmStreamMixer = new PcmStreamMixer(); // L: 1609
				Client.pcmPlayer1.setStream(class16.pcmStreamMixer); // L: 1610
				class327.decimator = new Decimator(22050, PcmPlayer.field307); // L: 1611
				Login.Login_loadingText = "Prepared sound engine"; // L: 1612
				Login.Login_loadingPercent = 35; // L: 1613
				Client.titleLoadingStage = 50; // L: 1614
				FloorOverlayDefinition.WorldMapElement_fonts = new Fonts(ChatChannel.archive8, UserList.archive13); // L: 1615
			} else {
				int var1;
				if (Client.titleLoadingStage == 50) { // L: 1618
					FontName[] var29 = new FontName[]{FontName.FontName_bold12, FontName.FontName_plain12, FontName.FontName_plain11, FontName.FontName_verdana11, FontName.FontName_verdana15, FontName.FontName_verdana13}; // L: 1621
					var1 = var29.length; // L: 1623
					Fonts var31 = FloorOverlayDefinition.WorldMapElement_fonts; // L: 1624
					FontName[] var32 = new FontName[]{FontName.FontName_bold12, FontName.FontName_plain12, FontName.FontName_plain11, FontName.FontName_verdana11, FontName.FontName_verdana15, FontName.FontName_verdana13}; // L: 1627
					Client.fontsMap = var31.createMap(var32); // L: 1629
					if (Client.fontsMap.size() < var1) { // L: 1630
						Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var1 + "%"; // L: 1631
						Login.Login_loadingPercent = 40; // L: 1632
					} else {
						class156.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11); // L: 1635
						class1.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12); // L: 1636
						class29.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12); // L: 1637
						class9.platformInfo = Client.platformInfoProvider.get(); // L: 1638
						Login.Login_loadingText = "Loaded fonts"; // L: 1639
						Login.Login_loadingPercent = 40; // L: 1640
						Client.titleLoadingStage = 60; // L: 1641
					}
				} else if (Client.titleLoadingStage == 60) { // L: 1644
					var23 = class33.method642(class163.archive10, ChatChannel.archive8); // L: 1645
					var1 = Login.field896.length + Login.field927.length; // L: 1648
					if (var23 < var1) { // L: 1651
						Login.Login_loadingText = "Loading title screen - " + var23 * 100 / var1 + "%"; // L: 1652
						Login.Login_loadingPercent = 50; // L: 1653
					} else {
						Login.Login_loadingText = "Loaded title screen"; // L: 1656
						Login.Login_loadingPercent = 50; // L: 1657
						Coord.updateGameState(5); // L: 1658
						Client.titleLoadingStage = 70; // L: 1659
					}
				} else if (Client.titleLoadingStage != 70) { // L: 1662
					if (Client.titleLoadingStage == 80) { // L: 1770
						var23 = 0; // L: 1771
						if (class14.compass == null) { // L: 1772
							class14.compass = class114.SpriteBuffer_getSprite(ChatChannel.archive8, class271.spriteIds.compass, 0);
						} else {
							++var23; // L: 1773
						}

						if (GraphicsObject.redHintArrowSprite == null) { // L: 1774
							GraphicsObject.redHintArrowSprite = class114.SpriteBuffer_getSprite(ChatChannel.archive8, class271.spriteIds.field4408, 0);
						} else {
							++var23; // L: 1775
						}

						if (WorldMapArea.mapSceneSprites == null) { // L: 1776
							WorldMapArea.mapSceneSprites = class390.method7253(ChatChannel.archive8, class271.spriteIds.mapScenes, 0);
						} else {
							++var23; // L: 1777
						}

						if (class6.headIconPkSprites == null) { // L: 1778
							class6.headIconPkSprites = AbstractRasterProvider.method8301(ChatChannel.archive8, class271.spriteIds.headIconsPk, 0);
						} else {
							++var23; // L: 1779
						}

						if (class28.headIconPrayerSprites == null) { // L: 1780
							class28.headIconPrayerSprites = AbstractRasterProvider.method8301(ChatChannel.archive8, class271.spriteIds.field4411, 0);
						} else {
							++var23; // L: 1781
						}

						if (class135.headIconHintSprites == null) { // L: 1782
							class135.headIconHintSprites = AbstractRasterProvider.method8301(ChatChannel.archive8, class271.spriteIds.field4417, 0);
						} else {
							++var23; // L: 1783
						}

						if (class97.mapMarkerSprites == null) { // L: 1784
							class97.mapMarkerSprites = AbstractRasterProvider.method8301(ChatChannel.archive8, class271.spriteIds.field4407, 0);
						} else {
							++var23; // L: 1785
						}

						if (SpotAnimationDefinition.crossSprites == null) { // L: 1786
							SpotAnimationDefinition.crossSprites = AbstractRasterProvider.method8301(ChatChannel.archive8, class271.spriteIds.field4413, 0);
						} else {
							++var23; // L: 1787
						}

						if (class296.mapDotSprites == null) { // L: 1788
							class296.mapDotSprites = AbstractRasterProvider.method8301(ChatChannel.archive8, class271.spriteIds.field4414, 0);
						} else {
							++var23; // L: 1789
						}

						if (ChatChannel.scrollBarSprites == null) { // L: 1790
							ChatChannel.scrollBarSprites = class390.method7253(ChatChannel.archive8, class271.spriteIds.field4416, 0);
						} else {
							++var23; // L: 1791
						}

						if (class65.modIconSprites == null) { // L: 1792
							class65.modIconSprites = class390.method7253(ChatChannel.archive8, class271.spriteIds.field4415, 0);
						} else {
							++var23; // L: 1793
						}

						if (var23 < 11) { // L: 1794
							Login.Login_loadingText = "Loading sprites - " + var23 * 100 / 12 + "%"; // L: 1795
							Login.Login_loadingPercent = 70; // L: 1796
						} else {
							AbstractFont.AbstractFont_modIconSprites = class65.modIconSprites; // L: 1799
							GraphicsObject.redHintArrowSprite.normalize(); // L: 1800
							var1 = (int)(Math.random() * 21.0D) - 10; // L: 1801
							int var2 = (int)(Math.random() * 21.0D) - 10; // L: 1802
							int var3 = (int)(Math.random() * 21.0D) - 10; // L: 1803
							int var4 = (int)(Math.random() * 41.0D) - 20; // L: 1804
							WorldMapArea.mapSceneSprites[0].shiftColors(var4 + var1, var4 + var2, var4 + var3); // L: 1805
							Login.Login_loadingText = "Loaded sprites"; // L: 1806
							Login.Login_loadingPercent = 70; // L: 1807
							Client.titleLoadingStage = 90; // L: 1808
						}
					} else if (Client.titleLoadingStage == 90) { // L: 1811
						if (!class83.field1081.isFullyLoaded()) { // L: 1812
							Login.Login_loadingText = "Loading textures - " + "0%"; // L: 1813
							Login.Login_loadingPercent = 90; // L: 1814
						} else {
							class130.textureProvider = new TextureProvider(class83.field1081, ChatChannel.archive8, 20, Player.clientPreferences.method2387(), Client.isLowDetail ? 64 : 128); // L: 1817
							Rasterizer3D.Rasterizer3D_setTextureLoader(class130.textureProvider); // L: 1818
							Rasterizer3D.Rasterizer3D_setBrightness(Player.clientPreferences.method2387()); // L: 1819
							Client.titleLoadingStage = 100; // L: 1820
						}
					} else if (Client.titleLoadingStage == 100) { // L: 1823
						var23 = class130.textureProvider.getLoadedPercentage(); // L: 1824
						if (var23 < 100) { // L: 1825
							Login.Login_loadingText = "Loading textures - " + var23 + "%"; // L: 1826
							Login.Login_loadingPercent = 90; // L: 1827
						} else {
							Login.Login_loadingText = "Loaded textures"; // L: 1830
							Login.Login_loadingPercent = 90; // L: 1831
							Client.titleLoadingStage = 110; // L: 1832
						}
					} else if (Client.titleLoadingStage == 110) { // L: 1835
						class268.mouseRecorder = new MouseRecorder(); // L: 1836
						class11.taskHandler.newThreadTask(class268.mouseRecorder, 10); // L: 1837
						Login.Login_loadingText = "Loaded input handler"; // L: 1838
						Login.Login_loadingPercent = 92; // L: 1839
						Client.titleLoadingStage = 120; // L: 1840
					} else if (Client.titleLoadingStage == 120) { // L: 1843
						if (!class163.archive10.tryLoadFileByNames("huffman", "")) { // L: 1844
							Login.Login_loadingText = "Loading wordpack - " + 0 + "%"; // L: 1845
							Login.Login_loadingPercent = 94; // L: 1846
						} else {
							Huffman var28 = new Huffman(class163.archive10.takeFileByNames("huffman", "")); // L: 1849
							class283.huffman = var28; // L: 1851
							Login.Login_loadingText = "Loaded wordpack"; // L: 1853
							Login.Login_loadingPercent = 94; // L: 1854
							Client.titleLoadingStage = 130; // L: 1855
						}
					} else if (Client.titleLoadingStage == 130) { // L: 1858
						if (!class301.archive7.isFullyLoaded()) { // L: 1859
							Login.Login_loadingText = "Loading interfaces - " + class301.archive7.loadPercent() * 4 / 5 + "%"; // L: 1860
							Login.Login_loadingPercent = 96; // L: 1861
						} else if (!class102.archive12.isFullyLoaded()) { // L: 1864
							Login.Login_loadingText = "Loading interfaces - " + (80 + class102.archive12.loadPercent() / 6) + "%"; // L: 1865
							Login.Login_loadingPercent = 96; // L: 1866
						} else if (!UserList.archive13.isFullyLoaded()) { // L: 1869
							Login.Login_loadingText = "Loading interfaces - " + (96 + UserList.archive13.loadPercent() / 50) + "%"; // L: 1870
							Login.Login_loadingPercent = 96; // L: 1871
						} else {
							Login.Login_loadingText = "Loaded interfaces"; // L: 1874
							Login.Login_loadingPercent = 98; // L: 1875
							Client.titleLoadingStage = 140; // L: 1876
						}
					} else if (Client.titleLoadingStage == 140) { // L: 1879
						Login.Login_loadingPercent = 100; // L: 1880
						if (!UserComparator10.archive19.tryLoadGroupByName(WorldMapCacheName.field2896.name)) { // L: 1881
							Login.Login_loadingText = "Loading world map - " + UserComparator10.archive19.groupLoadPercentByName(WorldMapCacheName.field2896.name) / 10 + "%"; // L: 1882
						} else {
							if (Decimator.worldMap == null) { // L: 1885
								Decimator.worldMap = new WorldMap(); // L: 1886
								Decimator.worldMap.init(UserComparator10.archive19, class67.archive18, Huffman.archive20, class29.fontBold12, Client.fontsMap, WorldMapArea.mapSceneSprites); // L: 1887
							}

							Login.Login_loadingText = "Loaded world map"; // L: 1889
							Client.titleLoadingStage = 150; // L: 1890
						}
					} else if (Client.titleLoadingStage == 150) { // L: 1893
						Coord.updateGameState(10); // L: 1894
					}
				} else if (!class119.archive2.isFullyLoaded()) { // L: 1663
					Login.Login_loadingText = "Loading config - " + class119.archive2.loadPercent() + "%"; // L: 1664
					Login.Login_loadingPercent = 60; // L: 1665
				} else if (!PcmPlayer.field308.isFullyLoaded()) { // L: 1668
					Login.Login_loadingText = "Loading config - " + (80 + class102.archive12.loadPercent() / 6) + "%"; // L: 1669
					Login.Login_loadingPercent = 60; // L: 1670
				} else {
					class12.method178(class119.archive2); // L: 1673
					Archive var0 = class119.archive2; // L: 1674
					FloorUnderlayDefinition.FloorUnderlayDefinition_archive = var0; // L: 1676
					var24 = class119.archive2; // L: 1678
					var25 = FaceNormal.archive11; // L: 1679
					KitDefinition.KitDefinition_archive = var24; // L: 1681
					class431.KitDefinition_modelsArchive = var25; // L: 1682
					KitDefinition.KitDefinition_fileCount = KitDefinition.KitDefinition_archive.getGroupFileCount(3); // L: 1683
					TaskHandler.method3429(class119.archive2, FaceNormal.archive11, Client.isLowDetail); // L: 1685
					var26 = class119.archive2; // L: 1686
					Archive var27 = FaceNormal.archive11; // L: 1687
					NPCComposition.NpcDefinition_archive = var26; // L: 1689
					NPCComposition.NpcDefinition_modelArchive = var27; // L: 1690
					class124.method2964(class119.archive2); // L: 1692
					FloorUnderlayDefinition.method3700(class119.archive2, FaceNormal.archive11, Client.isMembersWorld, class156.fontPlain11); // L: 1693
					Archive var5 = class119.archive2; // L: 1694
					Archive var6 = DevicePcmPlayerProvider.archive5; // L: 1695
					Archive var7 = HorizontalAlignment.field1926; // L: 1696
					SequenceDefinition.SequenceDefinition_archive = var5; // L: 1698
					JagexCache.SequenceDefinition_animationsArchive = var6; // L: 1699
					SequenceDefinition.SequenceDefinition_skeletonsArchive = var7; // L: 1700
					class28.method415(class119.archive2, FaceNormal.archive11); // L: 1702
					Archive var8 = class119.archive2; // L: 1703
					VarbitComposition.VarbitDefinition_archive = var8; // L: 1705
					Archive var9 = class119.archive2; // L: 1707
					VarpDefinition.VarpDefinition_archive = var9; // L: 1709
					VarpDefinition.field1841 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16); // L: 1710
					Archive var10 = class301.archive7; // L: 1712
					Archive var11 = FaceNormal.archive11; // L: 1713
					Archive var12 = ChatChannel.archive8; // L: 1714
					Archive var13 = UserList.archive13; // L: 1715
					MouseHandler.Widget_archive = var10; // L: 1717
					WorldMapSection2.Widget_modelsArchive = var11; // L: 1718
					Widget.Widget_spritesArchive = var12; // L: 1719
					class161.Widget_fontsArchive = var13; // L: 1720
					Calendar.Widget_interfaceComponents = new Widget[MouseHandler.Widget_archive.getGroupCount()][]; // L: 1721
					class83.Widget_loadedInterfaces = new boolean[MouseHandler.Widget_archive.getGroupCount()]; // L: 1722
					class182.method3702(class119.archive2); // L: 1724
					class7.method69(class119.archive2); // L: 1725
					Varcs.method2633(class119.archive2); // L: 1726
					Archive var14 = class119.archive2; // L: 1727
					Archive var15 = class119.archive2; // L: 1729
					ParamComposition.ParamDefinition_archive = var15; // L: 1731
					class399.method7302(class119.archive2); // L: 1733
					class11.method120(class119.archive2); // L: 1734
					class127.HitSplatDefinition_cachedSprites = new class429(class153.field1729, 54, class271.clientLanguage, class119.archive2); // L: 1735
					class150.HitSplatDefinition_cached = new class429(class153.field1729, 47, class271.clientLanguage, class119.archive2); // L: 1736
					LoginType.varcs = new Varcs(); // L: 1737
					Archive var16 = class119.archive2; // L: 1738
					Archive var17 = ChatChannel.archive8; // L: 1739
					Archive var18 = UserList.archive13; // L: 1740
					HitSplatDefinition.HitSplatDefinition_archive = var16; // L: 1742
					HitSplatDefinition.field2049 = var17; // L: 1743
					Username.HitSplatDefinition_fontsArchive = var18; // L: 1744
					ArchiveLoader.method2211(class119.archive2, ChatChannel.archive8); // L: 1746
					Archive var19 = class119.archive2; // L: 1747
					Archive var20 = ChatChannel.archive8; // L: 1748
					WorldMapElement.WorldMapElement_archive = var20; // L: 1750
					if (var19.isFullyLoaded()) { // L: 1751
						WorldMapElement.WorldMapElement_count = var19.getGroupFileCount(35); // L: 1754
						WorldMapElement.WorldMapElement_cached = new WorldMapElement[WorldMapElement.WorldMapElement_count]; // L: 1755

						for (int var21 = 0; var21 < WorldMapElement.WorldMapElement_count; ++var21) { // L: 1756
							byte[] var22 = var19.takeFile(35, var21); // L: 1757
							WorldMapElement.WorldMapElement_cached[var21] = new WorldMapElement(var21); // L: 1758
							if (var22 != null) { // L: 1759
								WorldMapElement.WorldMapElement_cached[var21].decode(new Buffer(var22)); // L: 1760
								WorldMapElement.WorldMapElement_cached[var21].method3538(); // L: 1761
							}
						}
					}

					Login.Login_loadingText = "Loaded config"; // L: 1765
					Login.Login_loadingPercent = 60; // L: 1766
					Client.titleLoadingStage = 80; // L: 1767
				}
			}
		}
	} // L: 1510 1516 1543 1571 1591 1616 1633 1642 1654 1660 1666 1671 1768 1797 1809 1815 1821 1828 1833 1841 1847 1856 1862 1867 1872 1877 1883 1891 1895 1897
}
