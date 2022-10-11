import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gy")
@Implements("Texture")
public class Texture extends Node {
	@ObfuscatedName("u")
	@Export("Texture_animatedPixels")
	static int[] Texture_animatedPixels;
	@ObfuscatedName("k")
	@Export("averageRGB")
	int averageRGB;
	@ObfuscatedName("w")
	boolean field2323;
	@ObfuscatedName("s")
	@Export("fileIds")
	int[] fileIds;
	@ObfuscatedName("q")
	int[] field2331;
	@ObfuscatedName("m")
	int[] field2320;
	@ObfuscatedName("x")
	int[] field2327;
	@ObfuscatedName("j")
	@Export("animationDirection")
	int animationDirection;
	@ObfuscatedName("v")
	@Export("animationSpeed")
	int animationSpeed;
	@ObfuscatedName("h")
	@Export("pixels")
	int[] pixels;
	@ObfuscatedName("t")
	@Export("isLoaded")
	boolean isLoaded;

	@ObfuscatedSignature(
		descriptor = "(Lqq;)V"
	)
	Texture(Buffer var1) {
		this.isLoaded = false; // L: 25
		this.averageRGB = var1.readUnsignedShort(); // L: 29
		this.field2323 = var1.readUnsignedByte() == 1; // L: 30
		int var2 = var1.readUnsignedByte(); // L: 31
		if (var2 >= 1 && var2 <= 4) { // L: 32
			this.fileIds = new int[var2]; // L: 35

			int var3;
			for (var3 = 0; var3 < var2; ++var3) { // L: 36
				this.fileIds[var3] = var1.readUnsignedShort();
			}

			if (var2 > 1) { // L: 37
				this.field2331 = new int[var2 - 1]; // L: 38

				for (var3 = 0; var3 < var2 - 1; ++var3) { // L: 39
					this.field2331[var3] = var1.readUnsignedByte();
				}
			}

			if (var2 > 1) { // L: 41
				this.field2320 = new int[var2 - 1]; // L: 42

				for (var3 = 0; var3 < var2 - 1; ++var3) { // L: 43
					this.field2320[var3] = var1.readUnsignedByte();
				}
			}

			this.field2327 = new int[var2]; // L: 45

			for (var3 = 0; var3 < var2; ++var3) { // L: 46
				this.field2327[var3] = var1.readInt();
			}

			this.animationDirection = var1.readUnsignedByte(); // L: 47
			this.animationSpeed = var1.readUnsignedByte(); // L: 48
			this.pixels = null; // L: 49
		} else {
			throw new RuntimeException(); // L: 33
		}
	} // L: 50

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(DILlv;)Z"
	)
	@Export("load")
	boolean load(double var1, int var3, AbstractArchive var4) {
		int var5;
		for (var5 = 0; var5 < this.fileIds.length; ++var5) { // L: 53
			if (var4.getFileFlat(this.fileIds[var5]) == null) { // L: 54
				return false;
			}
		}

		var5 = var3 * var3; // L: 56
		this.pixels = new int[var5]; // L: 57

		for (int var6 = 0; var6 < this.fileIds.length; ++var6) { // L: 58
			int var8 = this.fileIds[var6]; // L: 60
			byte[] var10 = var4.takeFileFlat(var8); // L: 64
			boolean var9;
			if (var10 == null) { // L: 65
				var9 = false; // L: 66
			} else {
				class428.SpriteBuffer_decode(var10); // L: 69
				var9 = true; // L: 70
			}

			IndexedSprite var7;
			if (!var9) { // L: 72
				var7 = null; // L: 73
			} else {
				IndexedSprite var11 = new IndexedSprite(); // L: 78
				var11.width = SecureRandomCallable.SpriteBuffer_spriteWidth; // L: 79
				var11.height = class402.SpriteBuffer_spriteHeight; // L: 80
				var11.xOffset = class458.SpriteBuffer_xOffsets[0]; // L: 81
				var11.yOffset = class458.SpriteBuffer_yOffsets[0]; // L: 82
				var11.subWidth = ApproximateRouteStrategy.SpriteBuffer_spriteWidths[0]; // L: 83
				var11.subHeight = UserComparator9.SpriteBuffer_spriteHeights[0]; // L: 84
				var11.palette = class458.SpriteBuffer_spritePalette; // L: 85
				var11.pixels = FileSystem.SpriteBuffer_pixels[0]; // L: 86
				class458.SpriteBuffer_xOffsets = null; // L: 88
				class458.SpriteBuffer_yOffsets = null; // L: 89
				ApproximateRouteStrategy.SpriteBuffer_spriteWidths = null; // L: 90
				UserComparator9.SpriteBuffer_spriteHeights = null; // L: 91
				class458.SpriteBuffer_spritePalette = null; // L: 92
				FileSystem.SpriteBuffer_pixels = null; // L: 93
				var7 = var11; // L: 97
			}

			var7.normalize(); // L: 100
			var10 = var7.pixels; // L: 101
			int[] var18 = var7.palette; // L: 102
			int var12 = this.field2327[var6]; // L: 103
			if ((var12 & -16777216) == 16777216) { // L: 104
			}

			if ((var12 & -16777216) == 33554432) { // L: 105
			}

			int var13;
			int var14;
			int var15;
			int var16;
			if ((var12 & -16777216) == 50331648) { // L: 106
				var13 = var12 & 16711935; // L: 107
				var14 = var12 >> 8 & 255; // L: 108

				for (var15 = 0; var15 < var18.length; ++var15) { // L: 109
					var16 = var18[var15]; // L: 110
					if (var16 >> 8 == (var16 & 65535)) { // L: 111
						var16 &= 255; // L: 112
						var18[var15] = var13 * var16 >> 8 & 16711935 | var14 * var16 & 65280; // L: 113
					}
				}
			}

			for (var13 = 0; var13 < var18.length; ++var13) { // L: 117
				var18[var13] = Rasterizer3D.Rasterizer3D_brighten(var18[var13], var1);
			}

			if (var6 == 0) { // L: 119
				var13 = 0;
			} else {
				var13 = this.field2331[var6 - 1]; // L: 120
			}

			if (var13 == 0) { // L: 121
				if (var3 == var7.subWidth) { // L: 122
					for (var14 = 0; var14 < var5; ++var14) { // L: 123
						this.pixels[var14] = var18[var10[var14] & 255];
					}
				} else if (var7.subWidth == 64 && var3 == 128) { // L: 125
					var14 = 0; // L: 126

					for (var15 = 0; var15 < var3; ++var15) { // L: 127
						for (var16 = 0; var16 < var3; ++var16) { // L: 128
							this.pixels[var14++] = var18[var10[(var15 >> 1 << 6) + (var16 >> 1)] & 255];
						}
					}
				} else {
					if (var7.subWidth != 128 || var3 != 64) { // L: 131
						throw new RuntimeException(); // L: 138
					}

					var14 = 0; // L: 132

					for (var15 = 0; var15 < var3; ++var15) { // L: 133
						for (var16 = 0; var16 < var3; ++var16) { // L: 134
							this.pixels[var14++] = var18[var10[(var16 << 1) + (var15 << 1 << 7)] & 255];
						}
					}
				}
			}

			if (var13 == 1) { // L: 141
			}

			if (var13 == 2) { // L: 142
			}

			if (var13 == 3) { // L: 143
			}
		}

		return true; // L: 145
	}

	@ObfuscatedName("p")
	@Export("reset")
	void reset() {
		this.pixels = null; // L: 149
	} // L: 150

	@ObfuscatedName("f")
	@Export("animate")
	void animate(int var1) {
		if (this.pixels != null) { // L: 153
			short var2;
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			int[] var10;
			if (this.animationDirection == 1 || this.animationDirection == 3) { // L: 154
				if (Texture_animatedPixels == null || Texture_animatedPixels.length < this.pixels.length) { // L: 155
					Texture_animatedPixels = new int[this.pixels.length];
				}

				if (this.pixels.length == 4096) { // L: 157
					var2 = 64;
				} else {
					var2 = 128; // L: 158
				}

				var3 = this.pixels.length; // L: 159
				var4 = var2 * this.animationSpeed * var1; // L: 160
				var5 = var3 - 1; // L: 161
				if (this.animationDirection == 1) { // L: 162
					var4 = -var4;
				}

				for (var6 = 0; var6 < var3; ++var6) { // L: 163
					var7 = var6 + var4 & var5; // L: 164
					Texture_animatedPixels[var6] = this.pixels[var7]; // L: 165
				}

				var10 = this.pixels; // L: 167
				this.pixels = Texture_animatedPixels; // L: 168
				Texture_animatedPixels = var10; // L: 169
			}

			if (this.animationDirection == 2 || this.animationDirection == 4) { // L: 171
				if (Texture_animatedPixels == null || Texture_animatedPixels.length < this.pixels.length) { // L: 172
					Texture_animatedPixels = new int[this.pixels.length];
				}

				if (this.pixels.length == 4096) { // L: 174
					var2 = 64;
				} else {
					var2 = 128; // L: 175
				}

				var3 = this.pixels.length; // L: 176
				var4 = this.animationSpeed * var1; // L: 177
				var5 = var2 - 1; // L: 178
				if (this.animationDirection == 2) { // L: 179
					var4 = -var4;
				}

				for (var6 = 0; var6 < var3; var6 += var2) { // L: 180
					for (var7 = 0; var7 < var2; ++var7) { // L: 181
						int var8 = var6 + var7; // L: 182
						int var9 = var6 + (var7 + var4 & var5); // L: 183
						Texture_animatedPixels[var8] = this.pixels[var9]; // L: 184
					}
				}

				var10 = this.pixels; // L: 187
				this.pixels = Texture_animatedPixels; // L: 188
				Texture_animatedPixels = var10; // L: 189
			}

		}
	} // L: 191
}
