import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("gr")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Llh;")
	@Export("HitSplatDefinition_archive")
	public static AbstractArchive HitSplatDefinition_archive;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Llh;")
	public static AbstractArchive field2017;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lii;")
	@Export("HitSplatDefinition_cached")
	public static EvictingDualNodeHashTable HitSplatDefinition_cached;

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Lii;")
	@Export("HitSplatDefinition_cachedSprites")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "Lii;")
	@Export("HitSplatDefinition_cachedFonts")
	public static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;

	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = -592555797)
	@Export("fontId")
	int fontId;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = -1722715223)
	@Export("textColor")
	public int textColor;

	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 860140195)
	public int field2026;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 332626063)
	int field2021;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = -161678465)
	int field2016;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = -1426101485)
	int field2029;

	@ObfuscatedName("x")
	@ObfuscatedGetter(intValue = 195385179)
	int field2027;

	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 1489450415)
	public int field2031;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = -2109795173)
	public int field2032;

	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = 247260053)
	public int field2030;

	@ObfuscatedName("b")
	String field2034;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 242554481)
	public int field2035;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 1781397165)
	public int field2019;

	@ObfuscatedName("m")
	@Export("transforms")
	public int[] transforms;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = -1586306339)
	@Export("transformVarbit")
	int transformVarbit;

	@ObfuscatedName("ad")
	@ObfuscatedGetter(intValue = 837589615)
	@Export("transformVarp")
	int transformVarp;

	static {
		HitSplatDefinition_cached = new EvictingDualNodeHashTable(64);
		HitSplatDefinition_cachedSprites = new EvictingDualNodeHashTable(64);
		HitSplatDefinition_cachedFonts = new EvictingDualNodeHashTable(20);
	}

	HitSplatDefinition() {
		this.fontId = -1;
		this.textColor = 16777215;
		this.field2026 = 70;
		this.field2021 = -1;
		this.field2016 = -1;
		this.field2029 = -1;
		this.field2027 = -1;
		this.field2031 = 0;
		this.field2032 = 0;
		this.field2030 = -1;
		this.field2034 = "";
		this.field2035 = -1;
		this.field2019 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Lqt;I)V", garbageValue = "-905711242")
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lqt;II)V", garbageValue = "1685495726")
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.readNullableLargeSmart();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field2021 = var1.readNullableLargeSmart();
		} else if (var2 == 4) {
			this.field2029 = var1.readNullableLargeSmart();
		} else if (var2 == 5) {
			this.field2016 = var1.readNullableLargeSmart();
		} else if (var2 == 6) {
			this.field2027 = var1.readNullableLargeSmart();
		} else if (var2 == 7) {
			this.field2031 = var1.readShort();
		} else if (var2 == 8) {
			this.field2034 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field2026 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field2032 = var1.readShort();
		} else if (var2 == 11) {
			this.field2030 = 0;
		} else if (var2 == 12) {
			this.field2035 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field2019 = var1.readShort();
		} else if (var2 == 14) {
			this.field2030 = var1.readUnsignedShort();
		} else if (var2 == 17 || var2 == 18) {
			this.transformVarbit = var1.readUnsignedShort();
			if (this.transformVarbit == 65535) {
				this.transformVarbit = -1;
			}
			this.transformVarp = var1.readUnsignedShort();
			if (this.transformVarp == 65535) {
				this.transformVarp = -1;
			}
			int var3 = -1;
			if (var2 == 18) {
				var3 = var1.readUnsignedShort();
				if (var3 == 65535) {
					var3 = -1;
				}
			}
			int var4 = var1.readUnsignedByte();
			this.transforms = new int[var4 + 2];
			for (int var5 = 0; var5 <= var4; ++var5) {
				this.transforms[var5] = var1.readUnsignedShort();
				if (this.transforms[var5] == 65535) {
					this.transforms[var5] = -1;
				}
			}
			this.transforms[var4 + 1] = var3;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)Lgr;", garbageValue = "-303621175")
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = class388.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}
		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}
		return var2 != -1 ? class122.method2800(var2) : null;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(II)Ljava/lang/String;", garbageValue = "1527850435")
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2034;
		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}
			var2 = var2.substring(0, var3) + Tile.intToString(var1, false) + var2.substring(var3 + 2);
		} 
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(I)Lqe;", garbageValue = "-2128633016")
	public SpritePixels method3623() {
		if (this.field2021 < 0) {
			return null;
		} else {
			SpritePixels var1 = ((SpritePixels) (HitSplatDefinition_cachedSprites.get(((long) (this.field2021)))));
			if (var1 != null) {
				return var1;
			} else {
				var1 = class7.SpriteBuffer_getSprite(field2017, this.field2021, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, ((long) (this.field2021)));
				}
				return var1;
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(B)Lqe;", garbageValue = "10")
	public SpritePixels method3643() {
		if (this.field2016 < 0) {
			return null;
		} else {
			SpritePixels var1 = ((SpritePixels) (HitSplatDefinition_cachedSprites.get(((long) (this.field2016)))));
			if (var1 != null) {
				return var1;
			} else {
				var1 = class7.SpriteBuffer_getSprite(field2017, this.field2016, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, ((long) (this.field2016)));
				}
				return var1;
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(B)Lqe;", garbageValue = "33")
	public SpritePixels method3625() {
		if (this.field2029 < 0) {
			return null;
		} else {
			SpritePixels var1 = ((SpritePixels) (HitSplatDefinition_cachedSprites.get(((long) (this.field2029)))));
			if (var1 != null) {
				return var1;
			} else {
				var1 = class7.SpriteBuffer_getSprite(field2017, this.field2029, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, ((long) (this.field2029)));
				}
				return var1;
			}
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(B)Lqe;", garbageValue = "1")
	public SpritePixels method3626() {
		if (this.field2027 < 0) {
			return null;
		} else {
			SpritePixels var1 = ((SpritePixels) (HitSplatDefinition_cachedSprites.get(((long) (this.field2027)))));
			if (var1 != null) {
				return var1;
			} else {
				var1 = class7.SpriteBuffer_getSprite(field2017, this.field2027, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, ((long) (this.field2027)));
				}
				return var1;
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(S)Lmt;", garbageValue = "9601")
	@Export("getFont")
	public Font getFont() {
		if (this.fontId == -1) {
			return null;
		} else {
			Font var1 = ((Font) (HitSplatDefinition_cachedFonts.get(((long) (this.fontId)))));
			if (var1 != null) {
				return var1;
			} else {
				AbstractArchive var3 = field2017;
				AbstractArchive var4 = class4.HitSplatDefinition_fontsArchive;
				int var5 = this.fontId;
				Font var2;
				if (!Ignored.method6774(var3, var5, 0)) {
					var2 = null;
				} else {
					byte[] var7 = var4.takeFile(var5, 0);
					Font var6;
					if (var7 == null) {
						var6 = null;
					} else {
						Font var8 = new Font(var7, class426.SpriteBuffer_xOffsets, class142.SpriteBuffer_yOffsets, class359.SpriteBuffer_spriteWidths, class456.SpriteBuffer_spriteHeights, class13.SpriteBuffer_spritePalette, class421.SpriteBuffer_pixels);
						class426.SpriteBuffer_xOffsets = null;
						class142.SpriteBuffer_yOffsets = null;
						class359.SpriteBuffer_spriteWidths = null;
						class456.SpriteBuffer_spriteHeights = null;
						class13.SpriteBuffer_spritePalette = null;
						class421.SpriteBuffer_pixels = null;
						var6 = var8;
					}
					var2 = var6;
				}
				if (var2 != null) {
					HitSplatDefinition_cachedFonts.put(var2, ((long) (this.fontId)));
				}
				return var2;
			}
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(IB)Ljava/lang/String;", garbageValue = "44")
	static final String method3632(int var0) {
		if (var0 < 100000) {
			return "<col=ffff00>" + var0 + "</col>";
		} else {
			return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>";
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(Lmt;Lmt;Lmt;I)V", garbageValue = "1695432560")
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (Script.canvasWidth - 765) / 2;
		Login.loginBoxX = Login.xPadding + 202;
		Canvas.loginBoxCenter = Login.loginBoxX + 180;
		byte var3;
		int var4;
		int var7;
		int var25;
		int var32;
		int var45;
		if (Login.worldSelectOpen) {
			Archive var46;
			if (ScriptFrame.worldSelectBackSprites == null) {
				var46 = class304.archive8;
				var45 = var46.getGroupId("sl_back");
				var25 = var46.getFileId(var45, "");
				SpritePixels[] var50 = class430.method7547(var46, var45, var25);
				ScriptFrame.worldSelectBackSprites = var50;
			}
			IndexedSprite[] var51;
			if (class126.worldSelectFlagSprites == null) {
				var46 = class304.archive8;
				var45 = var46.getGroupId("sl_flags");
				var25 = var46.getFileId(var45, "");
				var51 = ClanChannelMember.method2867(var46, var45, var25);
				class126.worldSelectFlagSprites = var51;
			}
			if (FriendSystem.worldSelectArrows == null) {
				var46 = class304.archive8;
				var45 = var46.getGroupId("sl_arrows");
				var25 = var46.getFileId(var45, "");
				var51 = ClanChannelMember.method2867(var46, var45, var25);
				FriendSystem.worldSelectArrows = var51;
			}
			if (class220.worldSelectStars == null) {
				var46 = class304.archive8;
				var45 = var46.getGroupId("sl_stars");
				var25 = var46.getFileId(var45, "");
				var51 = ClanChannelMember.method2867(var46, var45, var25);
				class220.worldSelectStars = var51;
			}
			if (class266.worldSelectLeftSprite == null) {
				class266.worldSelectLeftSprite = class421.SpriteBuffer_getIndexedSpriteByName(class304.archive8, "leftarrow", "");
			}
			if (SceneTilePaint.worldSelectRightSprite == null) {
				SceneTilePaint.worldSelectRightSprite = class421.SpriteBuffer_getIndexedSpriteByName(class304.archive8, "rightarrow", "");
			}
			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
			if (class220.worldSelectStars != null) {
				class220.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
				class220.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
			}
			if (FriendSystem.worldSelectArrows != null) {
				var32 = Login.xPadding + 280;
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
					FriendSystem.worldSelectArrows[2].drawAt(var32, 4);
				} else {
					FriendSystem.worldSelectArrows[0].drawAt(var32, 4);
				}
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
					FriendSystem.worldSelectArrows[3].drawAt(var32 + 15, 4);
				} else {
					FriendSystem.worldSelectArrows[1].drawAt(var32 + 15, 4);
				}
				var0.draw("World", var32 + 32, 17, 16777215, -1);
				var4 = Login.xPadding + 390;
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
					FriendSystem.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					FriendSystem.worldSelectArrows[0].drawAt(var4, 4);
				}
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
					FriendSystem.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					FriendSystem.worldSelectArrows[1].drawAt(var4 + 15, 4);
				}
				var0.draw("Players", var4 + 32, 17, 16777215, -1);
				var45 = Login.xPadding + 500;
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
					FriendSystem.worldSelectArrows[2].drawAt(var45, 4);
				} else {
					FriendSystem.worldSelectArrows[0].drawAt(var45, 4);
				}
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
					FriendSystem.worldSelectArrows[3].drawAt(var45 + 15, 4);
				} else {
					FriendSystem.worldSelectArrows[1].drawAt(var45 + 15, 4);
				}
				var0.draw("Location", var45 + 32, 17, 16777215, -1);
				var25 = Login.xPadding + 610;
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
					FriendSystem.worldSelectArrows[2].drawAt(var25, 4);
				} else {
					FriendSystem.worldSelectArrows[0].drawAt(var25, 4);
				}
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
					FriendSystem.worldSelectArrows[3].drawAt(var25 + 15, 4);
				} else {
					FriendSystem.worldSelectArrows[1].drawAt(var25 + 15, 4);
				}
				var0.draw("Type", var25 + 32, 17, 16777215, -1);
			}
			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
			var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
			Login.hoveredWorldIndex = -1;
			if (ScriptFrame.worldSelectBackSprites != null) {
				var3 = 88;
				byte var41 = 19;
				var45 = 765 / (var3 + 1) - 1;
				var25 = 480 / (var41 + 1);
				int var35;
				do {
					var7 = var25;
					var35 = var45;
					if (var25 * (var45 - 1) >= World.World_count) {
						--var45;
					}
					if (var45 * (var25 - 1) >= World.World_count) {
						--var25;
					}
					if (var45 * (var25 - 1) >= World.World_count) {
						--var25;
					}
				} while (var25 != var7 || var45 != var35 );
				var7 = (765 - var3 * var45) / (var45 + 1);
				if (var7 > 5) {
					var7 = 5;
				}
				var35 = (480 - var25 * var41) / (var25 + 1);
				if (var35 > 5) {
					var35 = 5;
				}
				int var37 = (765 - var3 * var45 - var7 * (var45 - 1)) / 2;
				int var38 = (480 - var25 * var41 - var35 * (var25 - 1)) / 2;
				int var28 = (var25 + World.World_count - 1) / var25;
				Login.worldSelectPagesCount = var28 - var45;
				if (class266.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
					class266.worldSelectLeftSprite.drawAt(8, class78.canvasHeight / 2 - class266.worldSelectLeftSprite.subHeight / 2);
				}
				if (SceneTilePaint.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
					SceneTilePaint.worldSelectRightSprite.drawAt(Script.canvasWidth - SceneTilePaint.worldSelectRightSprite.subWidth - 8, class78.canvasHeight / 2 - SceneTilePaint.worldSelectRightSprite.subHeight / 2);
				}
				int var29 = var38 + 23;
				int var39 = var37 + Login.xPadding;
				int var40 = 0;
				boolean var42 = false;
				int var43 = Login.worldSelectPage;
				int var17;
				for (var17 = var25 * var43; var17 < World.World_count && var43 - Login.worldSelectPage < var45; ++var17) {
					World var18 = class362.World_worlds[var17];
					boolean var19 = true;
					String var20 = Integer.toString(var18.population);
					if (var18.population == -1) {
						var20 = "OFF";
						var19 = false;
					} else if (var18.population > 1980) {
						var20 = "FULL";
						var19 = false;
					}
					int var22 = 0;
					byte var21;
					if (var18.isBeta()) {
						if (var18.isMembersOnly()) {
							var21 = 7;
						} else {
							var21 = 6;
						}
					} else if (var18.isDeadman()) {
						var22 = 16711680;
						if (var18.isMembersOnly()) {
							var21 = 5;
						} else {
							var21 = 4;
						}
					} else if (var18.method1597()) {
						if (var18.isMembersOnly()) {
							var21 = 9;
						} else {
							var21 = 8;
						}
					} else if (var18.isPvp()) {
						if (var18.isMembersOnly()) {
							var21 = 3;
						} else {
							var21 = 2;
						}
					} else if (var18.isMembersOnly()) {
						var21 = 1;
					} else {
						var21 = 0;
					}
					if (MouseHandler.MouseHandler_x >= var39 && MouseHandler.MouseHandler_y >= var29 && MouseHandler.MouseHandler_x < var3 + var39 && MouseHandler.MouseHandler_y < var41 + var29 && var19) {
						Login.hoveredWorldIndex = var17;
						ScriptFrame.worldSelectBackSprites[var21].drawTransOverlayAt(var39, var29, 128, 16777215);
						var42 = true;
					} else {
						ScriptFrame.worldSelectBackSprites[var21].drawAt(var39, var29);
					}
					if (class126.worldSelectFlagSprites != null) {
						class126.worldSelectFlagSprites[(var18.isMembersOnly() ? 8 : 0) + var18.location].drawAt(var39 + 29, var29);
					}
					var0.drawCentered(Integer.toString(var18.id), var39 + 15, var41 / 2 + var29 + 5, var22, -1);
					var1.drawCentered(var20, var39 + 60, var41 / 2 + var29 + 5, 268435455, -1);
					var29 = var29 + var41 + var35;
					++var40;
					if (var40 >= var25) {
						var29 = var38 + 23;
						var39 = var39 + var7 + var3;
						var40 = 0;
						++var43;
					}
				}
				if (var42) {
					var17 = var1.stringWidth(class362.World_worlds[Login.hoveredWorldIndex].activity) + 6;
					int var30 = var1.ascent + 8;
					int var44 = MouseHandler.MouseHandler_y + 25;
					if (var30 + var44 > 480) {
						var44 = MouseHandler.MouseHandler_y - 25 - var30;
					}
					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var17 / 2, var44, var17, var30, 16777120);
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var17 / 2, var44, var17, var30, 0);
					var1.drawCentered(class362.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var44 + var1.ascent + 4, 0, -1);
				}
			}
			Message.rasterProvider.drawFull(0, 0);
		} else {
			class16.leftTitleSprite.drawAt(Login.xPadding, 0);
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
			if (Client.gameState == 0 || Client.gameState == 5) {
				var3 = 20;
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1);
				var4 = 253 - var3;
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409);
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150 + Login.Login_loadingPercent * 3, var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0);
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1);
			}
			String var5;
			String var6;
			short var31;
			short var33;
			if (Client.gameState == 20) {
				class4.titleboxSprite.drawAt(Login.loginBoxX + 180 - class4.titleboxSprite.subWidth / 2, 271 - class4.titleboxSprite.subHeight / 2);
				var31 = 201;
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0);
				var32 = var31 + 15;
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0);
				var32 += 15;
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0);
				var32 += 15;
				var32 += 7;
				if (Login.loginIndex != 4 && Login.loginIndex != 10) {
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var32, 16777215, 0);
					var33 = 200;
					for (var5 = class125.method2829(); var0.stringWidth(var5) > var33; var5 = var5.substring(0, var5.length() - 1)) {
					}
					var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var32, 16777215, 0);
					var32 += 15;
					for (var6 = NetCache.method5952(Login.Login_password); var0.stringWidth(var6) > var33; var6 = var6.substring(1)) {
					}
					var0.draw("Password: " + var6, Login.loginBoxX + 180 - 108, var32, 16777215, 0);
					var32 += 15;
				}
			}
			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) {
				class4.titleboxSprite.drawAt(Login.loginBoxX, 171);
				short var23;
				if (Login.loginIndex == 0) {
					var31 = 251;
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var31, 16776960, 0);
					var32 = var31 + 30;
					var4 = Login.loginBoxX + 180 - 80;
					var23 = 291;
					class6.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var4 = Login.loginBoxX + 180 + 80;
					class6.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Login.loginIndex == 1) {
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
					var31 = 236;
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16777215, 0);
					var32 = var31 + 15;
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16777215, 0);
					var32 += 15;
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16777215, 0);
					var32 += 15;
					var4 = Login.loginBoxX + 180 - 80;
					var23 = 321;
					class6.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180 + 80;
					class6.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0);
				} else if (Login.loginIndex == 2) {
					var31 = 201;
					var0.drawCentered(Login.Login_response1, Canvas.loginBoxCenter, var31, 16776960, 0);
					var32 = var31 + 15;
					var0.drawCentered(Login.Login_response2, Canvas.loginBoxCenter, var32, 16776960, 0);
					var32 += 15;
					var0.drawCentered(Login.Login_response3, Canvas.loginBoxCenter, var32, 16776960, 0);
					var32 += 15;
					var32 += 7;
					var0.draw("Login: ", Canvas.loginBoxCenter - 110, var32, 16777215, 0);
					var33 = 200;
					for (var5 = class125.method2829(); var0.stringWidth(var5) > var33; var5 = var5.substring(1)) {
					}
					var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? class122.colorStartTag(16776960) + "|" : ""), Canvas.loginBoxCenter - 70, var32, 16777215, 0);
					var32 += 15;
					for (var6 = NetCache.method5952(Login.Login_password); var0.stringWidth(var6) > var33; var6 = var6.substring(1)) {
					}
					var0.draw("Password: " + var6 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? class122.colorStartTag(16776960) + "|" : ""), Canvas.loginBoxCenter - 108, var32, 16777215, 0);
					var32 += 15;
					var31 = 277;
					var7 = Canvas.loginBoxCenter + -117;
					boolean var9 = Client.Login_isUsernameRemembered;
					boolean var10 = Login.field912;
					IndexedSprite var26 = (var9) ? var10 ? DynamicObject.field979 : class228.options_buttons_2Sprite : var10 ? class113.field1427 : class345.options_buttons_0Sprite;
					var26.drawAt(var7, var31);
					var7 = var7 + var26.subWidth + 5;
					var1.draw("Remember username", var7, var31 + 13, 16776960, 0);
					var7 = Canvas.loginBoxCenter + 24;
					boolean var13 = class19.clientPreferences.method2247();
					boolean var14 = Login.field913;
					IndexedSprite var12 = (var13) ? var14 ? DynamicObject.field979 : class228.options_buttons_2Sprite : var14 ? class113.field1427 : class345.options_buttons_0Sprite;
					var12.drawAt(var7, var31);
					var7 = var7 + var12.subWidth + 5;
					var1.draw("Hide username", var7, var31 + 13, 16776960, 0);
					var32 = var31 + 15;
					int var15 = Canvas.loginBoxCenter - 80;
					short var16 = 321;
					class6.titlebuttonSprite.drawAt(var15 - 73, var16 - 20);
					var0.drawCentered("Login", var15, var16 + 5, 16777215, 0);
					var15 = Canvas.loginBoxCenter + 80;
					class6.titlebuttonSprite.drawAt(var15 - 73, var16 - 20);
					var0.drawCentered("Cancel", var15, var16 + 5, 16777215, 0);
					var31 = 357;
					switch (Login.field902) {
						case 2 :
							TileItem.field1299 = "Having trouble logging in?";
							break;
						default :
							TileItem.field1299 = "Can't login? Click here.";
					}
					ArchiveLoader.field1022 = new Bounds(Canvas.loginBoxCenter, var31, var1.stringWidth(TileItem.field1299), 11);
					PcmPlayer.field294 = new Bounds(Canvas.loginBoxCenter, var31, var1.stringWidth("Still having trouble logging in?"), 11);
					var1.drawCentered(TileItem.field1299, Canvas.loginBoxCenter, var31, 16777215, 0);
				} else if (Login.loginIndex == 3) {
					var31 = 201;
					var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var31, 16776960, 0);
					var32 = var31 + 20;
					var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var32, 16776960, 0);
					var32 += 15;
					var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var32, 16776960, 0);
					var32 += 15;
					var4 = Login.loginBoxX + 180;
					var23 = 276;
					class6.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180;
					var23 = 326;
					class6.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0);
				} else {
					short var8;
					if (Login.loginIndex == 4) {
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
						var31 = 236;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16777215, 0);
						var32 = var31 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16777215, 0);
						var32 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16777215, 0);
						var32 += 15;
						var0.draw("PIN: " + NetCache.method5952(World.otp) + (Client.cycle % 40 < 20 ? class122.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var32, 16777215, 0);
						var32 -= 8;
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var32, 16776960, 0);
						var32 += 15;
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var32, 16776960, 0);
						var4 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15;
						var45 = var32 - var0.ascent;
						IndexedSprite var34;
						if (Login.field895) {
							var34 = class228.options_buttons_2Sprite;
						} else {
							var34 = class345.options_buttons_0Sprite;
						}
						var34.drawAt(var4, var45);
						var32 += 15;
						var7 = Login.loginBoxX + 180 - 80;
						var8 = 321;
						class6.titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
						var0.drawCentered("Continue", var7, var8 + 5, 16777215, 0);
						var7 = Login.loginBoxX + 180 + 80;
						class6.titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
						var0.drawCentered("Cancel", var7, var8 + 5, 16777215, 0);
						var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var8 + 36, 255, 0);
					} else if (Login.loginIndex == 5) {
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
						var31 = 221;
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 15;
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var32 += 14;
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var32, 16777215, 0);
						var33 = 174;
						for (var5 = class125.method2829(); var0.stringWidth(var5) > var33; var5 = var5.substring(1)) {
						}
						var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? class122.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var32, 16777215, 0);
						var32 += 15;
						var25 = Login.loginBoxX + 180 - 80;
						short var36 = 321;
						class6.titlebuttonSprite.drawAt(var25 - 73, var36 - 20);
						var0.drawCentered("Recover", var25, var36 + 5, 16777215, 0);
						var25 = Login.loginBoxX + 180 + 80;
						class6.titlebuttonSprite.drawAt(var25 - 73, var36 - 20);
						var0.drawCentered("Back", var25, var36 + 5, 16777215, 0);
						var36 = 356;
						var1.drawCentered("Still having trouble logging in?", Canvas.loginBoxCenter, var36, 268435455, 0);
					} else if (Login.loginIndex == 6) {
						var31 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var4 = Login.loginBoxX + 180;
						var23 = 321;
						class6.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 7) {
						if (VarpDefinition.field1821 && !Client.onMobile) {
							var31 = 201;
							var0.drawCentered(Login.Login_response1, Canvas.loginBoxCenter, var31, 16776960, 0);
							var32 = var31 + 15;
							var0.drawCentered(Login.Login_response2, Canvas.loginBoxCenter, var32, 16776960, 0);
							var32 += 15;
							var0.drawCentered(Login.Login_response3, Canvas.loginBoxCenter, var32, 16776960, 0);
							var4 = Canvas.loginBoxCenter - 150;
							var32 += 10;
							for (var45 = 0; var45 < 8; ++var45) {
								class6.titlebuttonSprite.method8135(var4, var32, 30, 40);
								boolean var47 = var45 == Login.field910 & Client.cycle % 40 < 20;
								var0.draw((Login.field911[var45] == null ? "" : Login.field911[var45]) + (var47 ? class122.colorStartTag(16776960) + "|" : ""), var4 + 10, var32 + 27, 16777215, 0);
								if (var45 != 1 && var45 != 3) {
									var4 += 35;
								} else {
									var4 += 50;
									var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var32 + 27, 16777215, 0);
								}
							}
							var45 = Canvas.loginBoxCenter - 80;
							short var48 = 321;
							class6.titlebuttonSprite.drawAt(var45 - 73, var48 - 20);
							var0.drawCentered("Submit", var45, var48 + 5, 16777215, 0);
							var45 = Canvas.loginBoxCenter + 80;
							class6.titlebuttonSprite.drawAt(var45 - 73, var48 - 20);
							var0.drawCentered("Cancel", var45, var48 + 5, 16777215, 0);
						} else {
							var31 = 216;
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var31, 16776960, 0);
							var32 = var31 + 15;
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var32, 16776960, 0);
							var32 += 15;
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var32, 16776960, 0);
							var32 += 15;
							var4 = Login.loginBoxX + 180 - 80;
							var23 = 321;
							class6.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180 + 80;
							class6.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
						}
					} else if (Login.loginIndex == 8) {
						var31 = 216;
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 15;
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var4 = Login.loginBoxX + 180 - 80;
						var23 = 321;
						class6.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						class6.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 9) {
						var31 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 25;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 25;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0);
						var4 = Login.loginBoxX + 180;
						var23 = 311;
						class6.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 10) {
						var32 = Login.loginBoxX + 180;
						var33 = 209;
						var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var33, 16776960, 0);
						var4 = var33 + 20;
						Login.field914.drawAt(var32 - 109, var4);
						IgnoreList.field4284.drawAt(var32 - 48, var4 + 18);
					} else if (Login.loginIndex == 12) {
						var32 = Canvas.loginBoxCenter;
						var33 = 216;
						var2.drawCentered("Before using this app, please read and accept our", var32, var33, 16777215, 0);
						var4 = var33 + 17;
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var32, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var32, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("By accepting, you agree to these documents.", var32, var4, 16777215, 0);
						var32 = Canvas.loginBoxCenter - 80;
						var33 = 311;
						class6.titlebuttonSprite.drawAt(var32 - 73, var33 - 20);
						var0.drawCentered("Accept", var32, var33 + 5, 16777215, 0);
						var32 = Canvas.loginBoxCenter + 80;
						class6.titlebuttonSprite.drawAt(var32 - 73, var33 - 20);
						var0.drawCentered("Decline", var32, var33 + 5, 16777215, 0);
					} else if (Login.loginIndex == 13) {
						var31 = 231;
						var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var31, 16777215, 0);
						var32 = var31 + 20;
						var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var32, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var31 = 311;
						class6.titlebuttonSprite.drawAt(var4 - 73, var31 - 20);
						var0.drawCentered("Back", var4, var31 + 5, 16777215, 0);
					} else if (Login.loginIndex == 14) {
						var31 = 201;
						String var24 = "";
						var5 = "";
						var6 = "";
						switch (Login.field897) {
							case 0 :
								var24 = "Your account has been disabled.";
								var5 = Strings.field3670;
								var6 = "";
								break;
							case 1 :
								var24 = "Account locked as we suspect it has been stolen.";
								var5 = Strings.field3709;
								var6 = "";
								break;
							default :
								class135.Login_promptCredentials(false);
						}
						var0.drawCentered(var24, Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 15;
						var2.drawCentered(var5, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var2.drawCentered(var6, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var7 = Login.loginBoxX + 180;
						var8 = 276;
						class6.titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
						var0.drawCentered("Support Page", var7, var8 + 5, 16777215, 0);
						var7 = Login.loginBoxX + 180;
						var8 = 326;
						class6.titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
						var0.drawCentered("Back", var7, var8 + 5, 16777215, 0);
					} else if (Login.loginIndex == 24) {
						var31 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16777215, 0);
						var32 = var31 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16777215, 0);
						var32 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16777215, 0);
						var32 += 15;
						var4 = Login.loginBoxX + 180;
						var23 = 301;
						class6.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Ok", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 26) {
						var31 = 216;
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 15;
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var4 = Login.loginBoxX + 180 - 80;
						var23 = 321;
						class6.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						class6.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					}
				}
			}
			if (Client.gameState >= 10) {
				int[] var27 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var27);
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class78.canvasHeight);
				Login.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
				Login.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
				Rasterizer2D.Rasterizer2D_setClipArray(var27);
			}
			class145.title_muteSprite[class19.clientPreferences.method2317() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
			if (Client.gameState > 5 && Language.Language_EN == class134.clientLanguage) {
				if (UserComparator5.field1385 != null) {
					var32 = Login.xPadding + 5;
					var33 = 463;
					byte var52 = 100;
					byte var49 = 35;
					UserComparator5.field1385.drawAt(var32, var33);
					var0.drawCentered("World" + " " + Client.worldId, var52 / 2 + var32, var49 / 2 + var33 - 2, 16777215, 0);
					if (class174.World_request != null) {
						var1.drawCentered("Loading...", var52 / 2 + var32, var49 / 2 + var33 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var52 / 2 + var32, var49 / 2 + var33 + 12, 16777215, 0);
					}
				} else {
					UserComparator5.field1385 = class421.SpriteBuffer_getIndexedSpriteByName(class304.archive8, "sl_button", "");
				}
			}
		}
	}

	@ObfuscatedName("lx")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "-17")
	static void method3624(int var0) {
		if (var0 != Client.loginState) {
			Client.loginState = var0;
		}
	}
}