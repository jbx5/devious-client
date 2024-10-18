import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("HitSplatDefinition")
public class HitSplatDefinition extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("HitSplatDefinition_archive")
	static AbstractArchive HitSplatDefinition_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	static AbstractArchive field2143;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("HitSplatDefinition_fontsArchive")
	static AbstractArchive HitSplatDefinition_fontsArchive;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("HitSplatDefinition_cached")
	static EvictingDualNodeHashTable HitSplatDefinition_cached;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("HitSplatDefinition_cachedSprites")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedSprites;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("HitSplatDefinition_cachedFonts")
	static EvictingDualNodeHashTable HitSplatDefinition_cachedFonts;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 560526235
	)
	@Export("fontId")
	int fontId;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1959019921
	)
	@Export("textColor")
	public int textColor;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -202531067
	)
	public int field2151;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -388788529
	)
	int field2152;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1205274507
	)
	int field2153;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -122412713
	)
	int field2154;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -353796805
	)
	int field2161;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1278880333
	)
	public int field2156;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -697811871
	)
	public int field2149;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -2048926973
	)
	public int field2142;
	@ObfuscatedName("ax")
	String field2159;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2120711329
	)
	public int field2145;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1207489623
	)
	public int field2158;
	@ObfuscatedName("aa")
	@Export("transforms")
	public int[] transforms;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1191841275
	)
	@Export("transformVarbit")
	int transformVarbit;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -1070845151
	)
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
		this.field2151 = 70;
		this.field2152 = -1;
		this.field2153 = -1;
		this.field2154 = -1;
		this.field2161 = -1;
		this.field2156 = 0;
		this.field2149 = 0;
		this.field2142 = -1;
		this.field2159 = "";
		this.field2145 = -1;
		this.field2158 = 0;
		this.transformVarbit = -1;
		this.transformVarp = -1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lvl;B)V",
		garbageValue = "96"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lvl;II)V",
		garbageValue = "-1981426244"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.fontId = var1.readNullableLargeSmart();
		} else if (var2 == 2) {
			this.textColor = var1.readMedium();
		} else if (var2 == 3) {
			this.field2152 = var1.readNullableLargeSmart();
		} else if (var2 == 4) {
			this.field2154 = var1.readNullableLargeSmart();
		} else if (var2 == 5) {
			this.field2153 = var1.readNullableLargeSmart();
		} else if (var2 == 6) {
			this.field2161 = var1.readNullableLargeSmart();
		} else if (var2 == 7) {
			this.field2156 = var1.readShort();
		} else if (var2 == 8) {
			this.field2159 = var1.readStringCp1252NullCircumfixed();
		} else if (var2 == 9) {
			this.field2151 = var1.readUnsignedShort();
		} else if (var2 == 10) {
			this.field2149 = var1.readShort();
		} else if (var2 == 11) {
			this.field2142 = 0;
		} else if (var2 == 12) {
			this.field2145 = var1.readUnsignedByte();
		} else if (var2 == 13) {
			this.field2158 = var1.readShort();
		} else if (var2 == 14) {
			this.field2142 = var1.readUnsignedShort();
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Lhw;",
		garbageValue = "103"
	)
	@Export("transform")
	public final HitSplatDefinition transform() {
		int var1 = -1;
		if (this.transformVarbit != -1) {
			var1 = Projectile.getVarbit(this.transformVarbit);
		} else if (this.transformVarp != -1) {
			var1 = Varps.Varps_main[this.transformVarp];
		}

		int var2;
		if (var1 >= 0 && var1 < this.transforms.length - 1) {
			var2 = this.transforms[var1];
		} else {
			var2 = this.transforms[this.transforms.length - 1];
		}

		return var2 != -1 ? class551.method10024(var2) : null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "830768582"
	)
	@Export("getString")
	public String getString(int var1) {
		String var2 = this.field2159;

		while (true) {
			int var3 = var2.indexOf("%1");
			if (var3 < 0) {
				return var2;
			}

			var2 = var2.substring(0, var3) + Messages.intToString(var1, false) + var2.substring(var3 + 2);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Lvv;",
		garbageValue = "69"
	)
	public SpritePixels method4180() {
		if (this.field2152 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2152);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class496.SpriteBuffer_getSprite(field2143, this.field2152, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2152);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Lvv;",
		garbageValue = "0"
	)
	public SpritePixels method4181() {
		if (this.field2153 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2153);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class496.SpriteBuffer_getSprite(field2143, this.field2153, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2153);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Lvv;",
		garbageValue = "1690026830"
	)
	public SpritePixels method4182() {
		if (this.field2154 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2154);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class496.SpriteBuffer_getSprite(field2143, this.field2154, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2154);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lvv;",
		garbageValue = "703999436"
	)
	public SpritePixels method4178() {
		if (this.field2161 < 0) {
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HitSplatDefinition_cachedSprites.get((long)this.field2161);
			if (var1 != null) {
				return var1;
			} else {
				var1 = class496.SpriteBuffer_getSprite(field2143, this.field2161, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedSprites.put(var1, (long)this.field2161);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Lqi;",
		garbageValue = "-1482059209"
	)
	@Export("getFont")
	public Font getFont() {
		if (this.fontId == -1) {
			return null;
		} else {
			Font var1 = (Font)HitSplatDefinition_cachedFonts.get((long)this.fontId);
			if (var1 != null) {
				return var1;
			} else {
				var1 = SecureRandomFuture.method2435(field2143, HitSplatDefinition_fontsArchive, this.fontId, 0);
				if (var1 != null) {
					HitSplatDefinition_cachedFonts.put(var1, (long)this.fontId);
				}

				return var1;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lqi;Lqi;B)V",
		garbageValue = "0"
	)
	static void method4211(Font var0, Font var1) {
		if (TriBool.worldSelectBackSprites == null) {
			TriBool.worldSelectBackSprites = PacketWriter.method3205(class450.archive8, "sl_back", "");
		}

		if (Login.worldSelectFlagSprites == null) {
			Login.worldSelectFlagSprites = ArchiveDiskActionHandler.getFont(class450.archive8, "sl_flags", "");
		}

		if (class163.worldSelectArrows == null) {
			class163.worldSelectArrows = ArchiveDiskActionHandler.getFont(class450.archive8, "sl_arrows", "");
		}

		if (Message.worldSelectStars == null) {
			Message.worldSelectStars = ArchiveDiskActionHandler.getFont(class450.archive8, "sl_stars", "");
		}

		if (DesktopPlatformInfoProvider.worldSelectLeftSprite == null) {
			DesktopPlatformInfoProvider.worldSelectLeftSprite = AttackOption.SpriteBuffer_getIndexedSpriteByName(class450.archive8, "leftarrow", "");
		}

		if (class492.worldSelectRightSprite == null) {
			class492.worldSelectRightSprite = AttackOption.SpriteBuffer_getIndexedSpriteByName(class450.archive8, "rightarrow", "");
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
		Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
		var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
		if (Message.worldSelectStars != null) {
			Message.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
			var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
			Message.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
			var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
		}

		int var4;
		int var5;
		if (class163.worldSelectArrows != null) {
			int var2 = Login.xPadding + 280;
			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
				class163.worldSelectArrows[2].drawAt(var2, 4);
			} else {
				class163.worldSelectArrows[0].drawAt(var2, 4);
			}

			if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
				class163.worldSelectArrows[3].drawAt(var2 + 15, 4);
			} else {
				class163.worldSelectArrows[1].drawAt(var2 + 15, 4);
			}

			var0.draw("World", var2 + 32, 17, 16777215, -1);
			int var3 = Login.xPadding + 390;
			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
				class163.worldSelectArrows[2].drawAt(var3, 4);
			} else {
				class163.worldSelectArrows[0].drawAt(var3, 4);
			}

			if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
				class163.worldSelectArrows[3].drawAt(var3 + 15, 4);
			} else {
				class163.worldSelectArrows[1].drawAt(var3 + 15, 4);
			}

			var0.draw("Players", var3 + 32, 17, 16777215, -1);
			var4 = Login.xPadding + 500;
			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
				class163.worldSelectArrows[2].drawAt(var4, 4);
			} else {
				class163.worldSelectArrows[0].drawAt(var4, 4);
			}

			if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
				class163.worldSelectArrows[3].drawAt(var4 + 15, 4);
			} else {
				class163.worldSelectArrows[1].drawAt(var4 + 15, 4);
			}

			var0.draw("Location", var4 + 32, 17, 16777215, -1);
			var5 = Login.xPadding + 610;
			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
				class163.worldSelectArrows[2].drawAt(var5, 4);
			} else {
				class163.worldSelectArrows[0].drawAt(var5, 4);
			}

			if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
				class163.worldSelectArrows[3].drawAt(var5 + 15, 4);
			} else {
				class163.worldSelectArrows[1].drawAt(var5 + 15, 4);
			}

			var0.draw("Type", var5 + 32, 17, 16777215, -1);
		}

		Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
		var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
		Login.hoveredWorldIndex = -1;
		if (TriBool.worldSelectBackSprites != null) {
			byte var23 = 88;
			byte var24 = 19;
			var4 = 765 / (var23 + 1) - 1;
			var5 = 480 / (var24 + 1);

			int var6;
			int var7;
			do {
				var6 = var5;
				var7 = var4;
				if (var5 * (var4 - 1) >= World.World_count) {
					--var4;
				}

				if (var4 * (var5 - 1) >= World.World_count) {
					--var5;
				}

				if (var4 * (var5 - 1) >= World.World_count) {
					--var5;
				}
			} while(var6 != var5 || var7 != var4);

			var6 = (765 - var23 * var4) / (var4 + 1);
			if (var6 > 5) {
				var6 = 5;
			}

			var7 = (480 - var5 * var24) / (var5 + 1);
			if (var7 > 5) {
				var7 = 5;
			}

			int var8 = (765 - var23 * var4 - var6 * (var4 - 1)) / 2;
			int var9 = (480 - var5 * var24 - var7 * (var5 - 1)) / 2;
			int var10 = (var5 + World.World_count - 1) / var5;
			Login.worldSelectPagesCount = var10 - var4;
			if (DesktopPlatformInfoProvider.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
				DesktopPlatformInfoProvider.worldSelectLeftSprite.drawAt(8, class268.canvasHeight / 2 - DesktopPlatformInfoProvider.worldSelectLeftSprite.subHeight / 2);
			}

			if (class492.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
				class492.worldSelectRightSprite.drawAt(HttpRequestTask.canvasWidth - class492.worldSelectRightSprite.subWidth - 8, class268.canvasHeight / 2 - class492.worldSelectRightSprite.subHeight / 2);
			}

			int var11 = var9 + 23;
			int var12 = var8 + Login.xPadding;
			int var13 = 0;
			boolean var14 = false;
			int var15 = Login.worldSelectPage;

			int var16;
			for (var16 = var15 * var5; var16 < World.World_count && var15 - Login.worldSelectPage < var4; ++var16) {
				World var17 = World.World_worlds[var16];
				boolean var18 = true;
				String var19 = Integer.toString(var17.population);
				if (var17.population == -1) {
					var19 = "OFF";
					var18 = false;
				} else if (var17.population > 1980) {
					var19 = "FULL";
					var18 = false;
				}

				class113 var20 = null;
				int var21 = 0;
				if (var17.isBeta()) {
					var20 = var17.isMembersOnly() ? class113.field1435 : class113.field1451;
				} else if (var17.isDeadman()) {
					var20 = var17.isMembersOnly() ? class113.field1450 : class113.field1449;
				} else if (var17.method1962()) {
					var21 = 16711680;
					var20 = var17.isMembersOnly() ? class113.field1452 : class113.field1444;
				} else if (var17.method1964()) {
					var20 = var17.isMembersOnly() ? class113.field1437 : class113.field1443;
				} else if (var17.isPvp()) {
					var20 = var17.isMembersOnly() ? class113.field1438 : class113.field1442;
				} else if (var17.method1965()) {
					var20 = var17.isMembersOnly() ? class113.field1446 : class113.field1445;
				} else if (var17.method1982()) {
					var20 = var17.isMembersOnly() ? class113.field1390 : class113.field1447;
				}

				if (var20 == null || var20.field1440 >= TriBool.worldSelectBackSprites.length) {
					var20 = var17.isMembersOnly() ? class113.field1439 : class113.field1441;
				}

				if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var11 && MouseHandler.MouseHandler_x < var12 + var23 && MouseHandler.MouseHandler_y < var11 + var24 && var18) {
					Login.hoveredWorldIndex = var16;
					TriBool.worldSelectBackSprites[var20.field1440].drawTransOverlayAt(var12, var11, 128, 16777215);
					var14 = true;
				} else {
					TriBool.worldSelectBackSprites[var20.field1440].drawAt(var12, var11);
				}

				if (Login.worldSelectFlagSprites != null) {
					Login.worldSelectFlagSprites[(var17.isMembersOnly() ? 8 : 0) + var17.location].drawAt(var12 + 29, var11);
				}

				var0.drawCentered(Integer.toString(var17.id), var12 + 15, var24 / 2 + var11 + 5, var21, -1);
				var1.drawCentered(var19, var12 + 60, var24 / 2 + var11 + 5, 268435455, -1);
				var11 = var11 + var24 + var7;
				++var13;
				if (var13 >= var5) {
					var11 = var9 + 23;
					var12 = var12 + var23 + var6;
					var13 = 0;
					++var15;
				}
			}

			if (var14) {
				var16 = var1.stringWidth(World.World_worlds[Login.hoveredWorldIndex].activity) + 6;
				int var22 = var1.ascent + 8;
				int var25 = MouseHandler.MouseHandler_y + 25;
				if (var22 + var25 > 480) {
					var25 = MouseHandler.MouseHandler_y - 25 - var22;
				}

				Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var22, 16777120);
				Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var16 / 2, var25, var16, var22, 0);
				var1.drawCentered(World.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var25 + var1.ascent + 4, 0, -1);
			}
		}

	}
}
