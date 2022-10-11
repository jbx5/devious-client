import java.util.Iterator;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
@Implements("WorldMapArea")
public class WorldMapArea {
	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "[Lqu;"
	)
	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 400592753
	)
	@Export("id")
	int id;
	@ObfuscatedName("p")
	@Export("internalName")
	String internalName;
	@ObfuscatedName("f")
	@Export("externalName")
	String externalName;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 823667415
	)
	@Export("backGroundColor")
	int backGroundColor;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -822979577
	)
	@Export("zoom")
	int zoom;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("origin")
	Coord origin;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = 622660925
	)
	@Export("regionLowX")
	int regionLowX;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1974986689
	)
	@Export("regionHighX")
	int regionHighX;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 280680285
	)
	@Export("regionLowY")
	int regionLowY;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1545198049
	)
	@Export("regionHighY")
	int regionHighY;
	@ObfuscatedName("j")
	@Export("isMain")
	boolean isMain;
	@ObfuscatedName("v")
	@Export("sections")
	LinkedList sections;

	public WorldMapArea() {
		this.id = -1; // L: 9
		this.backGroundColor = -1; // L: 12
		this.zoom = -1; // L: 13
		this.origin = null; // L: 14
		this.regionLowX = Integer.MAX_VALUE; // L: 15
		this.regionHighX = 0; // L: 16
		this.regionLowY = Integer.MAX_VALUE; // L: 17
		this.regionHighY = 0; // L: 18
		this.isMain = false; // L: 19
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqq;II)V",
		garbageValue = "-1793066214"
	)
	@Export("read")
	public void read(Buffer var1, int var2) {
		this.id = var2; // L: 23
		this.internalName = var1.readStringCp1252NullTerminated(); // L: 24
		this.externalName = var1.readStringCp1252NullTerminated(); // L: 25
		this.origin = new Coord(var1.readInt()); // L: 26
		this.backGroundColor = var1.readInt(); // L: 27
		var1.readUnsignedByte(); // L: 28
		this.isMain = var1.readUnsignedByte() == 1; // L: 29
		this.zoom = var1.readUnsignedByte(); // L: 30
		int var3 = var1.readUnsignedByte(); // L: 31
		this.sections = new LinkedList(); // L: 32

		for (int var4 = 0; var4 < var3; ++var4) { // L: 33
			this.sections.add(this.readWorldMapSection(var1)); // L: 34
		}

		this.setBounds(); // L: 36
	} // L: 37

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lqq;B)Lis;",
		garbageValue = "43"
	)
	@Export("readWorldMapSection")
	WorldMapSection readWorldMapSection(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 40
		WorldMapSectionType[] var3 = new WorldMapSectionType[]{WorldMapSectionType.WORLDMAPSECTIONTYPE0, WorldMapSectionType.WORLDMAPSECTIONTYPE3, WorldMapSectionType.WORLDMAPSECTIONTYPE1, WorldMapSectionType.WORLDMAPSECTIONTYPE2}; // L: 43
		WorldMapSectionType var4 = (WorldMapSectionType)Varps.findEnumerated(var3, var2); // L: 45
		Object var5 = null; // L: 46
		switch(var4.type) { // L: 47
		case 0:
			var5 = new WorldMapSection1(); // L: 55
			break; // L: 56
		case 1:
			var5 = new WorldMapSection0(); // L: 49
			break;
		case 2:
			var5 = new WorldMapSection2(); // L: 52
			break; // L: 53
		case 3:
			var5 = new class229(); // L: 60
			break;
		default:
			throw new IllegalStateException(""); // L: 58
		}

		((WorldMapSection)var5).read(var1); // L: 63
		return (WorldMapSection)var5; // L: 64
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-2077461769"
	)
	@Export("containsCoord")
	public boolean containsCoord(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator(); // L: 68

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) {
				return false; // L: 76
			}

			var5 = (WorldMapSection)var4.next(); // L: 69
		} while(!var5.containsCoord(var1, var2, var3)); // L: 71

		return true; // L: 72
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-59153460"
	)
	@Export("containsPosition")
	public boolean containsPosition(int var1, int var2) {
		int var3 = var1 / 64; // L: 80
		int var4 = var2 / 64; // L: 81
		if (var3 >= this.regionLowX && var3 <= this.regionHighX) { // L: 82
			if (var4 >= this.regionLowY && var4 <= this.regionHighY) { // L: 83
				Iterator var5 = this.sections.iterator(); // L: 84

				WorldMapSection var6;
				do {
					if (!var5.hasNext()) {
						return false; // L: 92
					}

					var6 = (WorldMapSection)var5.next(); // L: 85
				} while(!var6.containsPosition(var1, var2)); // L: 87

				return true; // L: 88
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "1"
	)
	@Export("position")
	public int[] position(int var1, int var2, int var3) {
		Iterator var4 = this.sections.iterator(); // L: 96

		WorldMapSection var5;
		do {
			if (!var4.hasNext()) {
				return null; // L: 104
			}

			var5 = (WorldMapSection)var4.next(); // L: 97
		} while(!var5.containsCoord(var1, var2, var3)); // L: 99

		return var5.getBorderTileLengths(var1, var2, var3); // L: 100
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(III)Lkz;",
		garbageValue = "700857776"
	)
	@Export("coord")
	public Coord coord(int var1, int var2) {
		Iterator var3 = this.sections.iterator(); // L: 108

		WorldMapSection var4;
		do {
			if (!var3.hasNext()) {
				return null; // L: 116
			}

			var4 = (WorldMapSection)var3.next(); // L: 109
		} while(!var4.containsPosition(var1, var2)); // L: 111

		return var4.coord(var1, var2); // L: 112
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-824642614"
	)
	@Export("setBounds")
	void setBounds() {
		Iterator var1 = this.sections.iterator(); // L: 120

		while (var1.hasNext()) {
			WorldMapSection var2 = (WorldMapSection)var1.next(); // L: 121
			var2.expandBounds(this); // L: 123
		}

	} // L: 126

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-664021074"
	)
	@Export("getId")
	public int getId() {
		return this.id; // L: 129
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1872259243"
	)
	@Export("getIsMain")
	public boolean getIsMain() {
		return this.isMain; // L: 133
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "7"
	)
	@Export("getInternalName")
	public String getInternalName() {
		return this.internalName; // L: 137
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-8855131"
	)
	@Export("getExternalName")
	public String getExternalName() {
		return this.externalName; // L: 141
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1471188853"
	)
	@Export("getBackGroundColor")
	int getBackGroundColor() {
		return this.backGroundColor; // L: 145
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1365898930"
	)
	@Export("getZoom")
	public int getZoom() {
		return this.zoom; // L: 149
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "73"
	)
	@Export("getRegionLowX")
	public int getRegionLowX() {
		return this.regionLowX; // L: 153
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "6"
	)
	@Export("getRegionHighX")
	public int getRegionHighX() {
		return this.regionHighX; // L: 157
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-924051176"
	)
	@Export("getRegionLowY")
	public int getRegionLowY() {
		return this.regionLowY; // L: 161
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1942658021"
	)
	@Export("getRegionHighY")
	public int getRegionHighY() {
		return this.regionHighY; // L: 165
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-5"
	)
	@Export("getOriginX")
	public int getOriginX() {
		return this.origin.x; // L: 169
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1287204919"
	)
	@Export("getOriginPlane")
	public int getOriginPlane() {
		return this.origin.plane; // L: 173
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1899036968"
	)
	@Export("getOriginY")
	public int getOriginY() {
		return this.origin.y; // L: 177
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(B)Lkz;",
		garbageValue = "-114"
	)
	@Export("getOrigin")
	public Coord getOrigin() {
		return new Coord(this.origin); // L: 181
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lgp;[Lgj;I)V",
		garbageValue = "-1670152302"
	)
	static final void method4808(Scene var0, CollisionMap[] var1) {
		int var2;
		int var3;
		int var4;
		int var5;
		for (var2 = 0; var2 < 4; ++var2) { // L: 595
			for (var3 = 0; var3 < 104; ++var3) { // L: 596
				for (var4 = 0; var4 < 104; ++var4) { // L: 597
					if ((Tiles.Tiles_renderFlags[var2][var3][var4] & 1) == 1) { // L: 598
						var5 = var2; // L: 599
						if ((Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) { // L: 600
							var5 = var2 - 1;
						}

						if (var5 >= 0) { // L: 601
							var1[var5].setBlockedByFloor(var3, var4);
						}
					}
				}
			}
		}

		Tiles.rndHue += (int)(Math.random() * 5.0D) - 2; // L: 606
		if (Tiles.rndHue < -8) { // L: 607
			Tiles.rndHue = -8;
		}

		if (Tiles.rndHue > 8) { // L: 608
			Tiles.rndHue = 8;
		}

		Tiles.rndLightness += (int)(Math.random() * 5.0D) - 2; // L: 609
		if (Tiles.rndLightness < -16) { // L: 610
			Tiles.rndLightness = -16;
		}

		if (Tiles.rndLightness > 16) { // L: 611
			Tiles.rndLightness = 16;
		}

		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		int var15;
		int var16;
		int[] var10000;
		int var17;
		int var18;
		for (var2 = 0; var2 < 4; ++var2) { // L: 612
			byte[][] var44 = SoundCache.field328[var2]; // L: 613
			boolean var51 = true; // L: 614
			boolean var52 = true; // L: 615
			boolean var6 = true; // L: 616
			boolean var7 = true; // L: 617
			boolean var8 = true; // L: 618
			var9 = (int)Math.sqrt(5100.0D); // L: 619
			var10 = var9 * 768 >> 8; // L: 620

			int var19;
			int var20;
			for (var11 = 1; var11 < 103; ++var11) { // L: 621
				for (var12 = 1; var12 < 103; ++var12) { // L: 622
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11]; // L: 623
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1]; // L: 624
					var15 = (int)Math.sqrt((double)(var14 * var14 + var13 * var13 + 65536)); // L: 625
					var16 = (var13 << 8) / var15; // L: 626
					var17 = 65536 / var15; // L: 627
					var18 = (var14 << 8) / var15; // L: 628
					var19 = (var16 * -50 + var18 * -50 + var17 * -10) / var10 + 96; // L: 629
					var20 = (var44[var12 - 1][var11] >> 2) + (var44[var12][var11 - 1] >> 2) + (var44[var12 + 1][var11] >> 3) + (var44[var12][var11 + 1] >> 3) + (var44[var12][var11] >> 1); // L: 630
					Tiles.field1002[var12][var11] = var19 - var20; // L: 631
				}
			}

			for (var11 = 0; var11 < 104; ++var11) { // L: 634
				TextureProvider.Tiles_hue[var11] = 0; // L: 635
				FontName.Tiles_saturation[var11] = 0; // L: 636
				class436.Tiles_lightness[var11] = 0; // L: 637
				class434.Tiles_hueMultiplier[var11] = 0; // L: 638
				Tiles.field1008[var11] = 0; // L: 639
			}

			for (var11 = -5; var11 < 109; ++var11) { // L: 641
				for (var12 = 0; var12 < 104; ++var12) { // L: 642
					var13 = var11 + 5; // L: 643
					int var10002;
					if (var13 >= 0 && var13 < 104) { // L: 644
						var14 = class152.Tiles_underlays[var2][var13][var12] & 255; // L: 645
						if (var14 > 0) { // L: 646
							FloorUnderlayDefinition var49 = WorldMapSectionType.method5074(var14 - 1); // L: 647
							var10000 = TextureProvider.Tiles_hue; // L: 648
							var10000[var12] += var49.hue;
							var10000 = FontName.Tiles_saturation; // L: 649
							var10000[var12] += var49.saturation;
							var10000 = class436.Tiles_lightness; // L: 650
							var10000[var12] += var49.lightness;
							var10000 = class434.Tiles_hueMultiplier; // L: 651
							var10000[var12] += var49.hueMultiplier;
							var10002 = Tiles.field1008[var12]++; // L: 652
						}
					}

					var14 = var11 - 5; // L: 655
					if (var14 >= 0 && var14 < 104) { // L: 656
						var15 = class152.Tiles_underlays[var2][var14][var12] & 255; // L: 657
						if (var15 > 0) { // L: 658
							FloorUnderlayDefinition var50 = WorldMapSectionType.method5074(var15 - 1); // L: 659
							var10000 = TextureProvider.Tiles_hue; // L: 660
							var10000[var12] -= var50.hue;
							var10000 = FontName.Tiles_saturation; // L: 661
							var10000[var12] -= var50.saturation;
							var10000 = class436.Tiles_lightness; // L: 662
							var10000[var12] -= var50.lightness;
							var10000 = class434.Tiles_hueMultiplier; // L: 663
							var10000[var12] -= var50.hueMultiplier;
							var10002 = Tiles.field1008[var12]--; // L: 664
						}
					}
				}

				if (var11 >= 1 && var11 < 103) { // L: 668
					var12 = 0; // L: 669
					var13 = 0; // L: 670
					var14 = 0; // L: 671
					var15 = 0; // L: 672
					var16 = 0; // L: 673

					for (var17 = -5; var17 < 109; ++var17) { // L: 674
						var18 = var17 + 5; // L: 675
						if (var18 >= 0 && var18 < 104) { // L: 676
							var12 += TextureProvider.Tiles_hue[var18]; // L: 677
							var13 += FontName.Tiles_saturation[var18]; // L: 678
							var14 += class436.Tiles_lightness[var18]; // L: 679
							var15 += class434.Tiles_hueMultiplier[var18]; // L: 680
							var16 += Tiles.field1008[var18]; // L: 681
						}

						var19 = var17 - 5; // L: 683
						if (var19 >= 0 && var19 < 104) { // L: 684
							var12 -= TextureProvider.Tiles_hue[var19]; // L: 685
							var13 -= FontName.Tiles_saturation[var19]; // L: 686
							var14 -= class436.Tiles_lightness[var19]; // L: 687
							var15 -= class434.Tiles_hueMultiplier[var19]; // L: 688
							var16 -= Tiles.field1008[var19]; // L: 689
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) { // L: 691 692 693 694
							if (var2 < Tiles.Tiles_minPlane) { // L: 697
								Tiles.Tiles_minPlane = var2;
							}

							var20 = class152.Tiles_underlays[var2][var11][var17] & 255; // L: 698
							int var21 = class294.Tiles_overlays[var2][var11][var17] & 255; // L: 699
							if (var20 > 0 || var21 > 0) { // L: 700
								int var22 = Tiles.Tiles_heights[var2][var11][var17]; // L: 701
								int var23 = Tiles.Tiles_heights[var2][var11 + 1][var17]; // L: 702
								int var24 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1]; // L: 703
								int var25 = Tiles.Tiles_heights[var2][var11][var17 + 1]; // L: 704
								int var26 = Tiles.field1002[var11][var17]; // L: 705
								int var27 = Tiles.field1002[var11 + 1][var17]; // L: 706
								int var28 = Tiles.field1002[var11 + 1][var17 + 1]; // L: 707
								int var29 = Tiles.field1002[var11][var17 + 1]; // L: 708
								int var30 = -1; // L: 709
								int var31 = -1; // L: 710
								int var32;
								int var33;
								int var34;
								if (var20 > 0) { // L: 711
									var32 = var12 * 256 / var15; // L: 712
									var33 = var13 / var16; // L: 713
									var34 = var14 / var16; // L: 714
									var30 = Language.hslToRgb(var32, var33, var34); // L: 715
									var32 = var32 + Tiles.rndHue & 255; // L: 716
									var34 += Tiles.rndLightness; // L: 717
									if (var34 < 0) { // L: 718
										var34 = 0;
									} else if (var34 > 255) { // L: 719
										var34 = 255;
									}

									var31 = Language.hslToRgb(var32, var33, var34); // L: 720
								}

								FloorOverlayDefinition var35;
								if (var2 > 0) { // L: 722
									boolean var57 = true; // L: 723
									if (var20 == 0 && Tiles.Tiles_shapes[var2][var11][var17] != 0) { // L: 724
										var57 = false;
									}

									if (var21 > 0) { // L: 725
										var34 = var21 - 1; // L: 727
										var35 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var34); // L: 729
										FloorOverlayDefinition var46;
										if (var35 != null) { // L: 730
											var46 = var35; // L: 731
										} else {
											byte[] var36 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var34); // L: 734
											var35 = new FloorOverlayDefinition(); // L: 735
											if (var36 != null) { // L: 736
												var35.decode(new Buffer(var36), var34);
											}

											var35.postDecode(); // L: 737
											FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var35, (long)var34); // L: 738
											var46 = var35; // L: 739
										}

										if (!var46.hideUnderlay) { // L: 741
											var57 = false;
										}
									}

									if (var57 && var22 == var23 && var24 == var22 && var25 == var22) { // L: 743 744
										var10000 = ChatChannel.field996[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var32 = 0; // L: 747
								if (var31 != -1) { // L: 748
									var32 = Rasterizer3D.Rasterizer3D_colorPalette[class9.method83(var31, 96)];
								}

								if (var21 == 0) { // L: 749
									var0.addTile(var2, var11, var17, 0, 0, -1, var22, var23, var24, var25, class9.method83(var30, var26), class9.method83(var30, var27), class9.method83(var30, var28), class9.method83(var30, var29), 0, 0, 0, 0, var32, 0); // L: 750
								} else {
									var33 = Tiles.Tiles_shapes[var2][var11][var17] + 1; // L: 753
									byte var58 = Tiles.field1001[var2][var11][var17]; // L: 754
									int var47 = var21 - 1; // L: 756
									FloorOverlayDefinition var37 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var47); // L: 758
									if (var37 != null) { // L: 759
										var35 = var37; // L: 760
									} else {
										byte[] var38 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var47); // L: 763
										var37 = new FloorOverlayDefinition(); // L: 764
										if (var38 != null) { // L: 765
											var37.decode(new Buffer(var38), var47);
										}

										var37.postDecode(); // L: 766
										FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var37, (long)var47); // L: 767
										var35 = var37; // L: 768
									}

									int var48 = var35.texture; // L: 771
									int var39;
									int var40;
									int var41;
									int var42;
									if (var48 >= 0) { // L: 774
										var40 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var48); // L: 775
										var39 = -1; // L: 776
									} else if (var35.primaryRgb == 16711935) { // L: 779
										var39 = -2; // L: 780
										var48 = -1; // L: 781
										var40 = -2; // L: 782
									} else {
										var39 = Language.hslToRgb(var35.hue, var35.saturation, var35.lightness); // L: 785
										var41 = var35.hue + Tiles.rndHue & 255; // L: 786
										var42 = var35.lightness + Tiles.rndLightness; // L: 787
										if (var42 < 0) { // L: 788
											var42 = 0;
										} else if (var42 > 255) { // L: 789
											var42 = 255;
										}

										var40 = Language.hslToRgb(var41, var35.saturation, var42); // L: 790
									}

									var41 = 0; // L: 793
									if (var40 != -2) { // L: 794
										var41 = Rasterizer3D.Rasterizer3D_colorPalette[class16.method216(var40, 96)];
									}

									if (var35.secondaryRgb != -1) { // L: 795
										var42 = var35.secondaryHue + Tiles.rndHue & 255; // L: 796
										int var43 = var35.secondaryLightness + Tiles.rndLightness; // L: 797
										if (var43 < 0) { // L: 798
											var43 = 0;
										} else if (var43 > 255) { // L: 799
											var43 = 255;
										}

										var40 = Language.hslToRgb(var42, var35.secondarySaturation, var43); // L: 800
										var41 = Rasterizer3D.Rasterizer3D_colorPalette[class16.method216(var40, 96)]; // L: 801
									}

									var0.addTile(var2, var11, var17, var33, var58, var48, var22, var23, var24, var25, class9.method83(var30, var26), class9.method83(var30, var27), class9.method83(var30, var28), class9.method83(var30, var29), class16.method216(var39, var26), class16.method216(var39, var27), class16.method216(var39, var28), class16.method216(var39, var29), var32, var41); // L: 803
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) { // L: 810
				for (var12 = 1; var12 < 103; ++var12) { // L: 811
					if ((Tiles.Tiles_renderFlags[var2][var12][var11] & 8) != 0) { // L: 818
						var17 = 0; // L: 819
					} else if (var2 > 0 && (Tiles.Tiles_renderFlags[1][var12][var11] & 2) != 0) { // L: 822
						var17 = var2 - 1; // L: 823
					} else {
						var17 = var2; // L: 826
					}

					var0.setTileMinPlane(var2, var12, var11, var17); // L: 828
				}
			}

			class152.Tiles_underlays[var2] = null; // L: 831
			class294.Tiles_overlays[var2] = null; // L: 832
			Tiles.Tiles_shapes[var2] = null; // L: 833
			Tiles.field1001[var2] = null; // L: 834
			SoundCache.field328[var2] = null; // L: 835
		}

		var0.method4290(-50, -10, -50); // L: 837

		for (var2 = 0; var2 < 104; ++var2) { // L: 838
			for (var3 = 0; var3 < 104; ++var3) { // L: 839
				if ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) { // L: 840
					var0.setLinkBelow(var2, var3);
				}
			}
		}

		var2 = 1; // L: 843
		var3 = 2; // L: 844
		var4 = 4; // L: 845

		for (var5 = 0; var5 < 4; ++var5) { // L: 846
			if (var5 > 0) { // L: 847
				var2 <<= 3; // L: 848
				var3 <<= 3; // L: 849
				var4 <<= 3; // L: 850
			}

			for (int var53 = 0; var53 <= var5; ++var53) { // L: 852
				for (int var54 = 0; var54 <= 104; ++var54) { // L: 853
					for (int var55 = 0; var55 <= 104; ++var55) { // L: 854
						short var56;
						if ((ChatChannel.field996[var53][var55][var54] & var2) != 0) { // L: 855
							var9 = var54; // L: 856
							var10 = var54; // L: 857
							var11 = var53; // L: 858

							for (var12 = var53; var9 > 0 && (ChatChannel.field996[var53][var55][var9 - 1] & var2) != 0; --var9) { // L: 859 860
							}

							while (var10 < 104 && (ChatChannel.field996[var53][var55][var10 + 1] & var2) != 0) { // L: 861
								++var10;
							}

							label454:
							while (var11 > 0) { // L: 862
								for (var13 = var9; var13 <= var10; ++var13) { // L: 863
									if ((ChatChannel.field996[var11 - 1][var55][var13] & var2) == 0) {
										break label454;
									}
								}

								--var11; // L: 864
							}

							label443:
							while (var12 < var5) { // L: 866
								for (var13 = var9; var13 <= var10; ++var13) { // L: 867
									if ((ChatChannel.field996[var12 + 1][var55][var13] & var2) == 0) {
										break label443;
									}
								}

								++var12; // L: 868
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 870
							if (var13 >= 8) { // L: 871
								var56 = 240; // L: 872
								var15 = Tiles.Tiles_heights[var12][var55][var9] - var56; // L: 873
								var16 = Tiles.Tiles_heights[var11][var55][var9]; // L: 874
								Scene.Scene_addOccluder(var5, 1, var55 * 128, var55 * 128, var9 * 128, var10 * 128 + 128, var15, var16); // L: 875

								for (var17 = var11; var17 <= var12; ++var17) { // L: 876
									for (var18 = var9; var18 <= var10; ++var18) { // L: 877
										var10000 = ChatChannel.field996[var17][var55];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((ChatChannel.field996[var53][var55][var54] & var3) != 0) { // L: 881
							var9 = var55; // L: 882
							var10 = var55; // L: 883
							var11 = var53; // L: 884

							for (var12 = var53; var9 > 0 && (ChatChannel.field996[var53][var9 - 1][var54] & var3) != 0; --var9) { // L: 885 886
							}

							while (var10 < 104 && (ChatChannel.field996[var53][var10 + 1][var54] & var3) != 0) { // L: 887
								++var10;
							}

							label507:
							while (var11 > 0) { // L: 888
								for (var13 = var9; var13 <= var10; ++var13) { // L: 889
									if ((ChatChannel.field996[var11 - 1][var13][var54] & var3) == 0) {
										break label507;
									}
								}

								--var11; // L: 890
							}

							label496:
							while (var12 < var5) { // L: 892
								for (var13 = var9; var13 <= var10; ++var13) { // L: 893
									if ((ChatChannel.field996[var12 + 1][var13][var54] & var3) == 0) {
										break label496;
									}
								}

								++var12; // L: 894
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11); // L: 896
							if (var13 >= 8) { // L: 897
								var56 = 240; // L: 898
								var15 = Tiles.Tiles_heights[var12][var9][var54] - var56; // L: 899
								var16 = Tiles.Tiles_heights[var11][var9][var54]; // L: 900
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var54 * 128, var54 * 128, var15, var16); // L: 901

								for (var17 = var11; var17 <= var12; ++var17) { // L: 902
									for (var18 = var9; var18 <= var10; ++var18) { // L: 903
										var10000 = ChatChannel.field996[var17][var18];
										var10000[var54] &= ~var3;
									}
								}
							}
						}

						if ((ChatChannel.field996[var53][var55][var54] & var4) != 0) { // L: 907
							var9 = var55; // L: 908
							var10 = var55; // L: 909
							var11 = var54; // L: 910

							for (var12 = var54; var11 > 0 && (ChatChannel.field996[var53][var55][var11 - 1] & var4) != 0; --var11) { // L: 911 912
							}

							while (var12 < 104 && (ChatChannel.field996[var53][var55][var12 + 1] & var4) != 0) { // L: 913
								++var12;
							}

							label560:
							while (var9 > 0) { // L: 914
								for (var13 = var11; var13 <= var12; ++var13) { // L: 915
									if ((ChatChannel.field996[var53][var9 - 1][var13] & var4) == 0) {
										break label560;
									}
								}

								--var9; // L: 916
							}

							label549:
							while (var10 < 104) { // L: 918
								for (var13 = var11; var13 <= var12; ++var13) { // L: 919
									if ((ChatChannel.field996[var53][var10 + 1][var13] & var4) == 0) {
										break label549;
									}
								}

								++var10; // L: 920
							}

							if ((var10 - var9 + 1) * (var12 - var11 + 1) >= 4) { // L: 922
								var13 = Tiles.Tiles_heights[var53][var9][var11]; // L: 923
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13); // L: 924

								for (var14 = var9; var14 <= var10; ++var14) { // L: 925
									for (var15 = var11; var15 <= var12; ++var15) { // L: 926
										var10000 = ChatChannel.field996[var53][var14];
										var10000[var15] &= ~var4;
									}
								}
							}
						}
					}
				}
			}
		}

	} // L: 934
}
