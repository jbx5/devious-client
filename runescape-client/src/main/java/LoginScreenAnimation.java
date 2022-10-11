import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "[Lqu;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("s")
	int[] field1212;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 352288685
	)
	int field1216;
	@ObfuscatedName("m")
	int[] field1217;
	@ObfuscatedName("x")
	int[] field1218;
	@ObfuscatedName("j")
	int[] field1219;
	@ObfuscatedName("v")
	int[] field1220;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -706104967
	)
	int field1213;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -400222839
	)
	int field1222;
	@ObfuscatedName("u")
	int[] field1223;
	@ObfuscatedName("d")
	int[] field1224;
	@ObfuscatedName("b")
	int[] field1214;
	@ObfuscatedName("a")
	int[] field1215;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = -92322127
	)
	int field1221;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1619933712
	)
	int field1228;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 990926517
	)
	int field1229;

	@ObfuscatedSignature(
		descriptor = "([Lqu;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1212 = new int[256]; // L: 13
		this.field1216 = 0; // L: 14
		this.field1213 = 0; // L: 19
		this.field1222 = 0; // L: 20
		this.field1221 = 0; // L: 25
		this.field1228 = 0; // L: 26
		this.field1229 = 0; // L: 27
		this.sprites = var1; // L: 30
		this.initColors(); // L: 31
	} // L: 32

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "255"
	)
	@Export("initColors")
	void initColors() {
		this.field1218 = new int[256]; // L: 35

		int var1;
		for (var1 = 0; var1 < 64; ++var1) { // L: 36
			this.field1218[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 37
			this.field1218[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 38
			this.field1218[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 39
			this.field1218[var1 + 192] = 16777215;
		}

		this.field1219 = new int[256]; // L: 40

		for (var1 = 0; var1 < 64; ++var1) { // L: 41
			this.field1219[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 42
			this.field1219[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 43
			this.field1219[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 44
			this.field1219[var1 + 192] = 16777215;
		}

		this.field1220 = new int[256]; // L: 45

		for (var1 = 0; var1 < 64; ++var1) { // L: 46
			this.field1220[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 47
			this.field1220[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 48
			this.field1220[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) { // L: 49
			this.field1220[var1 + 192] = 16777215;
		}

		this.field1217 = new int[256]; // L: 50
		this.field1221 = 0; // L: 51
		this.field1214 = new int[32768]; // L: 52
		this.field1215 = new int[32768]; // L: 53
		this.method2357((IndexedSprite)null); // L: 54
		this.field1223 = new int[32768]; // L: 55
		this.field1224 = new int[32768]; // L: 56
	} // L: 57

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	void method2356() {
		this.field1218 = null; // L: 60
		this.field1219 = null; // L: 61
		this.field1220 = null; // L: 62
		this.field1217 = null; // L: 63
		this.field1214 = null; // L: 64
		this.field1215 = null; // L: 65
		this.field1223 = null; // L: 66
		this.field1224 = null; // L: 67
		this.field1221 = 0; // L: 68
		this.field1228 = 0; // L: 69
	} // L: 70

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1216071083"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1223 == null) { // L: 73
			this.initColors(); // L: 74
		}

		if (this.field1229 == 0) { // L: 76
			this.field1229 = var2; // L: 77
		}

		int var3 = var2 - this.field1229; // L: 79
		if (var3 >= 256) { // L: 80
			var3 = 0;
		}

		this.field1229 = var2; // L: 81
		if (var3 > 0) { // L: 82
			this.method2358(var3); // L: 83
		}

		this.method2382(var1); // L: 85
	} // L: 86

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-66"
	)
	final void method2358(int var1) {
		this.field1221 += 128 * var1; // L: 89
		int var2;
		if (this.field1221 > this.field1214.length) { // L: 90
			this.field1221 -= this.field1214.length; // L: 91
			var2 = (int)(Math.random() * 12.0D); // L: 92
			this.method2357(this.sprites[var2]); // L: 93
		}

		var2 = 0; // L: 95
		int var3 = var1 * 128; // L: 96
		int var4 = (256 - var1) * 128; // L: 97

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) { // L: 98
			var6 = this.field1223[var2 + var3] - this.field1214[var2 + this.field1221 & this.field1214.length - 1] * var1 / 6; // L: 99
			if (var6 < 0) { // L: 100
				var6 = 0;
			}

			this.field1223[var2++] = var6; // L: 101
		}

		byte var15 = 10; // L: 103
		var6 = 128 - var15; // L: 104

		int var7;
		int var10;
		for (var7 = 256 - var1; var7 < 256; ++var7) { // L: 105
			int var8 = var7 * 128; // L: 106

			for (int var9 = 0; var9 < 128; ++var9) { // L: 107
				var10 = (int)(Math.random() * 100.0D); // L: 108
				if (var10 < 50 && var9 > var15 && var9 < var6) { // L: 109
					this.field1223[var9 + var8] = 255;
				} else {
					this.field1223[var9 + var8] = 0; // L: 110
				}
			}
		}

		if (this.field1213 * 16 > 0) { // L: 113
			this.field1213 = this.field1213 * 16 - var1 * 4;
		}

		if (this.field1222 * 16 > 0) { // L: 114
			this.field1222 = this.field1222 * 16 - var1 * 4;
		}

		if (this.field1213 * 16 == 0 && this.field1222 * 16 == 0) { // L: 115
			var7 = (int)(Math.random() * (double)(2000 / var1)); // L: 116
			if (var7 == 0) { // L: 117
				this.field1213 = 1024;
			}

			if (var7 == 1) { // L: 118
				this.field1222 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) { // L: 120
			this.field1212[var7] = this.field1212[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) { // L: 121
			this.field1212[var7] = (int)(Math.sin((double)this.field1216 / 14.0D) * 16.0D + Math.sin((double)this.field1216 / 15.0D) * 14.0D + Math.sin((double)this.field1216 / 16.0D) * 12.0D); // L: 122
			++this.field1216; // L: 123
		}

		this.field1228 = this.field1228 * 10000 + var1 * 10000; // L: 125
		var7 = ((Client.cycle & 1) + var1) / 2; // L: 126
		if (var7 > 0) { // L: 127
			short var16 = 128; // L: 128
			byte var17 = 2; // L: 129
			var10 = 128 - var17 - var17; // L: 130

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1228 * 100; ++var11) { // L: 131
				var12 = (int)(Math.random() * (double)var10) + var17; // L: 132
				var13 = (int)(Math.random() * (double)var16) + var16; // L: 133
				this.field1223[var12 + (var13 << 7)] = 192; // L: 134
			}

			this.field1228 = 0; // L: 136

			int var14;
			for (var11 = 0; var11 < 256; ++var11) { // L: 137
				var12 = 0; // L: 138
				var13 = var11 * 128; // L: 139

				for (var14 = -var7; var14 < 128; ++var14) { // L: 140
					if (var7 + var14 < 128) { // L: 141
						var12 += this.field1223[var14 + var13 + var7];
					}

					if (var14 - (var7 + 1) >= 0) { // L: 142
						var12 -= this.field1223[var14 + var13 - (var7 + 1)];
					}

					if (var14 >= 0) { // L: 143
						this.field1224[var14 + var13] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) { // L: 146
				var12 = 0; // L: 147

				for (var13 = -var7; var13 < 256; ++var13) { // L: 148
					var14 = var13 * 128; // L: 149
					if (var13 + var7 < 256) { // L: 150
						var12 += this.field1224[var14 + var11 + var7 * 128];
					}

					if (var13 - (var7 + 1) >= 0) { // L: 151
						var12 -= this.field1224[var11 + var14 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1223[var11 + var14] = var12 / (var7 * 2 + 1); // L: 152
					}
				}
			}
		}

	} // L: 156

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1448503937"
	)
	final int method2359(int var1, int var2, int var3) {
		int var4 = 256 - var3; // L: 159
		return (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) + (var3 * (var2 & 16711935) + var4 * (var1 & 16711935) & -16711936) >> 8; // L: 160
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "98"
	)
	final void method2382(int var1) {
		int var2 = this.field1217.length; // L: 164
		if (this.field1213 * 16 > 0) { // L: 165
			this.method2360(this.field1213 * 16, this.field1219); // L: 166
		} else if (this.field1222 * 16 > 0) { // L: 168
			this.method2360(this.field1222 * 16, this.field1220); // L: 169
		} else {
			for (int var3 = 0; var3 < var2; ++var3) { // L: 172
				this.field1217[var3] = this.field1218[var3];
			}
		}

		this.method2361(var1); // L: 174
	} // L: 175

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I[IB)V",
		garbageValue = "37"
	)
	final void method2360(int var1, int[] var2) {
		int var3 = this.field1217.length; // L: 178

		for (int var4 = 0; var4 < var3; ++var4) { // L: 179
			if (var1 > 768) { // L: 180
				this.field1217[var4] = this.method2359(this.field1218[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1217[var4] = var2[var4]; // L: 181
			} else {
				this.field1217[var4] = this.method2359(var2[var4], this.field1218[var4], 256 - var1); // L: 182
			}
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "46"
	)
	final void method2361(int var1) {
		int var2 = 0; // L: 187

		for (int var3 = 1; var3 < 255; ++var3) {
			int var4 = (256 - var3) * this.field1212[var3] / 256; // L: 189
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128; // L: 192
			if (var5 < 0) { // L: 193
				var6 = -var5;
				var5 = 0; // L: 195
			}

			if (var5 + 128 >= class20.rasterProvider.width) {
				var7 = class20.rasterProvider.width - var5;
			}

			int var8 = var5 + (var3 + 8) * class20.rasterProvider.width;
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1223[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1217[var10];
					int var14 = class20.rasterProvider.pixels[var8];
					class20.rasterProvider.pixels[var8++] = -16777216 | ((var10 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + (var13 * (var14 & 65280) + var12 * (var10 & 65280) & 16711680) >> 8;
				} else {
					++var8;
				}
			}

			var2 += 128 - var7;
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(Lqu;I)V",
		garbageValue = "192117785"
	)
	final void method2357(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1214.length; ++var2) {
			this.field1214[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) { // L: 220
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1214[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7); // L: 227
					this.field1215[var5] = (this.field1214[var5 - 128] + this.field1214[var5 + 1] + this.field1214[var5 + 128] + this.field1214[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1214;
			this.field1214 = this.field1215;
			this.field1215 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) { // L: 238
					if (var1.pixels[var2++] != 0) { // L: 239
						var5 = var4 + var1.xOffset + 16; // L: 240
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1214[var7] = 0;
					}
				}
			}
		}

	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Llv;Llv;ZII)V",
		garbageValue = "1346716690"
	)
	static void method2375(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) { // L: 184
			if (var3 == 4) { // L: 185
				class139.method3101(4); // L: 186
			}

		} else {
			if (var3 == 0) { // L: 190
				ObjectSound.method1848(var2); // L: 191
			} else {
				class139.method3101(var3); // L: 194
			}

			Rasterizer2D.Rasterizer2D_clear(); // L: 196
			byte[] var4 = var0.takeFileByNames("title.jpg", ""); // L: 197
			TextureProvider.leftTitleSprite = class21.method322(var4); // L: 198
			PcmPlayer.rightTitleSprite = TextureProvider.leftTitleSprite.mirrorHorizontally(); // L: 199
			Player.method2322(var1, Client.worldProperties); // L: 200
			Login.titleboxSprite = WorldMapCacheName.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", ""); // L: 201
			Login.titlebuttonSprite = WorldMapCacheName.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", ""); // L: 202
			Calendar.field3331 = WorldMapCacheName.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", ""); // L: 203
			class147.field1693 = WorldMapCacheName.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", ""); // L: 204
			WorldMapCacheName.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", ""); // L: 205
			DevicePcmPlayerProvider.runesSprite = SpriteMask.method5693(var1, "runes", ""); // L: 206
			LoginType.title_muteSprite = SpriteMask.method5693(var1, "title_mute", ""); // L: 207
			WorldMapDecoration.options_buttons_0Sprite = WorldMapCacheName.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", ""); // L: 208
			SoundSystem.field324 = WorldMapCacheName.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", ""); // L: 209
			UserComparator7.options_buttons_2Sprite = WorldMapCacheName.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", ""); // L: 210
			class116.field1428 = WorldMapCacheName.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", ""); // L: 211
			ReflectionCheck.field256 = WorldMapDecoration.options_buttons_0Sprite.subWidth; // L: 212
			WorldMapID.field2874 = WorldMapDecoration.options_buttons_0Sprite.subHeight; // L: 213
			VertexNormal.loginScreenRunesAnimation = new LoginScreenAnimation(DevicePcmPlayerProvider.runesSprite); // L: 214
			if (var2) { // L: 215
				Login.Login_username = ""; // L: 216
				Login.Login_password = ""; // L: 217
				Login.field907 = new String[8]; // L: 218
				Login.field891 = 0; // L: 219
			}

			class347.field4201 = 0; // L: 221
			class28.otp = ""; // L: 222
			Login.field916 = true; // L: 223
			Login.worldSelectOpen = false; // L: 224
			if (!Player.clientPreferences.method2393()) { // L: 225
				Archive var5 = class14.archive6; // L: 226
				int var6 = var5.getGroupId("scape main"); // L: 228
				int var7 = var5.getFileId(var6, ""); // L: 229
				class274.musicPlayerStatus = 1; // L: 231
				class274.musicTrackArchive = var5; // L: 232
				class274.musicTrackGroupId = var6; // L: 233
				StructComposition.musicTrackFileId = var7; // L: 234
				class269.musicTrackVolume = 255; // L: 235
				TriBool.musicTrackBoolean = false; // L: 236
				VarcInt.pcmSampleLength = 2; // L: 237
			} else {
				TaskHandler.method3435(2); // L: 241
			}

			class117.method2859(false); // L: 242
			Login.clearLoginScreen = true; // L: 243
			Login.xPadding = (class123.canvasWidth - 765) / 2; // L: 244
			Login.loginBoxX = Login.xPadding + 202; // L: 245
			ModeWhere.loginBoxCenter = Login.loginBoxX + 180; // L: 246
			TextureProvider.leftTitleSprite.drawAt(Login.xPadding, 0); // L: 247
			PcmPlayer.rightTitleSprite.drawAt(Login.xPadding + 382, 0); // L: 248
			MilliClock.logoSprite.drawAt(Login.xPadding + 382 - MilliClock.logoSprite.subWidth / 2, 18); // L: 249
		}
	} // L: 188 250

	@ObfuscatedName("go")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2068729513"
	)
	static void method2379() {
		if (Decimator.worldMap != null) { // L: 4227
			Decimator.worldMap.method7508(Tiles.Client_plane, class128.baseX * 64 + (class67.localPlayer.x >> 7), WorldMapData_1.baseY * 64 + (class67.localPlayer.y >> 7), false); // L: 4228
			Decimator.worldMap.loadCache(); // L: 4229
		}

	} // L: 4231
}
