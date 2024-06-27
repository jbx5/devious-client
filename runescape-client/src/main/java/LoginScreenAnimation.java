import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dj")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lvv;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("aj")
	int[] field1280;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1310190489
	)
	int field1281;
	@ObfuscatedName("ab")
	int[] field1282;
	@ObfuscatedName("ai")
	int[] field1289;
	@ObfuscatedName("ae")
	int[] field1291;
	@ObfuscatedName("au")
	int[] field1288;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1601274563
	)
	int field1286;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1587381431
	)
	int field1287;
	@ObfuscatedName("ax")
	int[] field1278;
	@ObfuscatedName("ac")
	int[] field1283;
	@ObfuscatedName("al")
	int[] field1290;
	@ObfuscatedName("ay")
	int[] field1275;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -632961439
	)
	int field1292;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1194897524
	)
	int field1285;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1230032791
	)
	int field1294;

	@ObfuscatedSignature(
		descriptor = "([Lvv;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1280 = new int[256];
		this.field1281 = 0;
		this.field1286 = 0;
		this.field1287 = 0;
		this.field1292 = 0;
		this.field1285 = 0;
		this.field1294 = 0;
		this.sprites = var1;
		this.initColors();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "410645251"
	)
	@Export("initColors")
	void initColors() {
		this.field1289 = new int[256];

		int var1;
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1289[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1289[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1289[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1289[var1 + 192] = 16777215;
		}

		this.field1291 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1291[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1291[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1291[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1291[var1 + 192] = 16777215;
		}

		this.field1288 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1288[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1288[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1288[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1288[var1 + 192] = 16777215;
		}

		this.field1282 = new int[256];
		this.field1292 = 0;
		this.field1290 = new int[32768];
		this.field1275 = new int[32768];
		this.method2543((IndexedSprite)null);
		this.field1278 = new int[32768];
		this.field1283 = new int[32768];
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1515385056"
	)
	void method2566() {
		this.field1289 = null;
		this.field1291 = null;
		this.field1288 = null;
		this.field1282 = null;
		this.field1290 = null;
		this.field1275 = null;
		this.field1278 = null;
		this.field1283 = null;
		this.field1292 = 0;
		this.field1285 = 0;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1588657219"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1278 == null) {
			this.initColors();
		}

		if (this.field1294 == 0) {
			this.field1294 = var2;
		}

		int var3 = var2 - this.field1294;
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1294 = var2;
		if (var3 > 0) {
			this.method2538(var3);
		}

		this.method2540(var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "13162537"
	)
	final void method2538(int var1) {
		this.field1292 += 128 * var1;
		int var2;
		if (this.field1292 > this.field1290.length) {
			this.field1292 -= this.field1290.length;
			var2 = (int)(Math.random() * 12.0D);
			this.method2543(this.sprites[var2]);
		}

		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1278[var2 + var3] - this.field1290[var2 + this.field1292 & this.field1290.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.field1278[var2++] = var6;
		}

		byte var15 = 10;
		var6 = 128 - var15;

		int var7;
		int var10;
		for (var7 = 256 - var1; var7 < 256; ++var7) {
			int var8 = var7 * 128;

			for (int var9 = 0; var9 < 128; ++var9) {
				var10 = (int)(Math.random() * 100.0D);
				if (var10 < 50 && var9 > var15 && var9 < var6) {
					this.field1278[var9 + var8] = 255;
				} else {
					this.field1278[var8 + var9] = 0;
				}
			}
		}

		if (this.field1286 * 16 > 0) {
			this.field1286 = this.field1286 * 16 - var1 * 4;
		}

		if (this.field1287 * 16 > 0) {
			this.field1287 = this.field1287 * 16 - var1 * 4;
		}

		if (this.field1286 * 16 == 0 && this.field1287 * 16 == 0) {
			var7 = (int)(Math.random() * (double)(2000 / var1));
			if (var7 == 0) {
				this.field1286 = 1024;
			}

			if (var7 == 1) {
				this.field1287 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) {
			this.field1280[var7] = this.field1280[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1280[var7] = (int)(Math.sin((double)this.field1281 / 14.0D) * 16.0D + Math.sin((double)this.field1281 / 15.0D) * 14.0D + Math.sin((double)this.field1281 / 16.0D) * 12.0D);
			++this.field1281;
		}

		this.field1285 = this.field1285 * 10000 + var1 * 100;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = 128 - var17 - var17;

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1285 * 10000; ++var11) {
				var12 = (int)(Math.random() * (double)var10) + var17;
				var13 = (int)(Math.random() * (double)var16) + var16;
				this.field1278[var12 + (var13 << 7)] = 192;
			}

			this.field1285 = 0;

			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;

				for (var14 = -var7; var14 < 128; ++var14) {
					if (var14 + var7 < 128) {
						var12 += this.field1278[var13 + var14 + var7];
					}

					if (var14 - (var7 + 1) >= 0) {
						var12 -= this.field1278[var13 + var14 - (var7 + 1)];
					}

					if (var14 >= 0) {
						this.field1283[var14 + var13] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;

				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var7 + var13 < 256) {
						var12 += this.field1283[var11 + var14 + var7 * 128];
					}

					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1283[var14 + var11 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1278[var11 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-1490646676"
	)
	final int method2539(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) + (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) >> 8;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1146996789"
	)
	final void method2540(int var1) {
		int var2 = this.field1282.length;
		if (this.field1286 * 16 > 0) {
			this.method2541(this.field1286 * 16, this.field1291);
		} else if (this.field1287 * 16 > 0) {
			this.method2541(this.field1287 * 16, this.field1288);
		} else {
			for (int var3 = 0; var3 < var2; ++var3) {
				this.field1282[var3] = this.field1289[var3];
			}
		}

		this.method2542(var1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I[II)V",
		garbageValue = "1700924358"
	)
	final void method2541(int var1, int[] var2) {
		int var3 = this.field1282.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1282[var4] = this.method2539(this.field1289[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1282[var4] = var2[var4];
			} else {
				this.field1282[var4] = this.method2539(var2[var4], this.field1289[var4], 256 - var1);
			}
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1393612384"
	)
	final void method2542(int var1) {
		int var2 = 0;

		for (int var3 = 1; var3 < 255; ++var3) {
			int var4 = (256 - var3) * this.field1280[var3] / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}

			if (var5 + 128 >= class434.rasterProvider.width) {
				var7 = class434.rasterProvider.width - var5;
			}

			int var8 = var5 + (var3 + 8) * class434.rasterProvider.width;
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1278[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1282[var10];
					int var14 = class434.rasterProvider.pixels[var8];
					class434.rasterProvider.pixels[var8++] = -16777216 | (var12 * (var10 & 65280) + var13 * (var14 & 65280) & 16711680) + ((var14 & 16711935) * var13 + (var10 & 16711935) * var12 & -16711936) >> 8;
				} else {
					++var8;
				}
			}

			var2 += 128 - var7;
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvv;I)V",
		garbageValue = "641317882"
	)
	final void method2543(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1290.length; ++var2) {
			this.field1290[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1290[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1275[var5] = (this.field1290[var5 - 128] + this.field1290[var5 + 1] + this.field1290[var5 + 128] + this.field1290[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1290;
			this.field1290 = this.field1275;
			this.field1275 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1290[var7] = 0;
					}
				}
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lok;Lok;ZII)V",
		garbageValue = "1328682198"
	)
	static void method2563(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) {
			if (var3 == 4) {
				class163.updateLoginIndex(4);
			}

		} else {
			if (var3 == 0) {
				UserComparator8.updateLoginStatusUsernameRemembered(var2);
			} else {
				class163.updateLoginIndex(var3);
			}

			Rasterizer2D.Rasterizer2D_clear();
			byte[] var4 = var0.takeFileByNames("title.jpg", "");
			Login.leftTitleSprite = class199.readSpritePixelsFromBytes(var4);
			class189.rightTitleSprite = Login.leftTitleSprite.mirrorHorizontally();
			int var5 = Client.worldProperties;
			if ((var5 & class542.field5320.rsOrdinal()) != 0) {
				ArchiveDiskActionHandler.logoSprite = ModeWhere.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
			} else if ((var5 & class542.field5347.rsOrdinal()) != 0) {
				ArchiveDiskActionHandler.logoSprite = ModeWhere.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
			} else if ((var5 & class542.field5325.rsOrdinal()) != 0) {
				ArchiveDiskActionHandler.logoSprite = ModeWhere.SpriteBuffer_getIndexedSpriteByName(var1, "logo_speedrunning", "");
			} else {
				ArchiveDiskActionHandler.logoSprite = ModeWhere.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
			}

			class486.titleboxSprite = ModeWhere.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			Fonts.titlebuttonSprite = ModeWhere.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			UserComparator9.field1506 = ModeWhere.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
			Login.field922 = ModeWhere.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
			ModeWhere.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
			class261.runesSprite = WorldMapArchiveLoader.getFont(var1, "runes", "");
			class428.title_muteSprite = WorldMapArchiveLoader.getFont(var1, "title_mute", "");
			class141.options_buttons_0Sprite = ModeWhere.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			Login.field945 = ModeWhere.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			Login.options_buttons_2Sprite = ModeWhere.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			class341.field3699 = ModeWhere.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			class522.field5244 = class141.options_buttons_0Sprite.subWidth;
			HttpRequest.field58 = class141.options_buttons_0Sprite.subHeight;
			class91.loginScreenRunesAnimation = new LoginScreenAnimation(class261.runesSprite);
			if (var2) {
				Login.Login_username = "";
				Login.Login_password = "";
				Login.field941 = new String[8];
				Login.field950 = 0;
			}

			class6.otpMedium = 0;
			class146.otp = "";
			Login.rememberUsername = true;
			Login.worldSelectOpen = false;
			class47.method900();
			WorldMapIcon_1.method4578();
			class147.method3269().method7271(false);
			Login.clearLoginScreen = true;
			Login.xPadding = (class74.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			Login.loginBoxCenter = Login.loginBoxX + 180;
			Login.leftTitleSprite.drawAt(Login.xPadding, 0);
			class189.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			ArchiveDiskActionHandler.logoSprite.drawAt(Login.xPadding + 382 - ArchiveDiskActionHandler.logoSprite.subWidth / 2, 18);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "2017824549"
	)
	static ArrayList method2564() {
		ArrayList var0 = new ArrayList();
		Iterator var1 = class330.musicSongs.iterator();

		while (var1.hasNext()) {
			MusicSong var2 = (MusicSong)var1.next();
			var0.add(var2);
		}

		return var0;
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1563247861"
	)
	static void method2551(int var0, int var1) {
		if (class105.clientPreferences.getMusicVolume() != 0 && var0 != -1) {
			ArrayList var2 = new ArrayList();
			var2.add(new MusicSong(JagNetThread.field4545, var0, 0, class105.clientPreferences.getMusicVolume(), false));
			FontName.method9220(var2, 0, 0, 0, 0, true);
			Client.playingJingle = true;
		}

	}
}
