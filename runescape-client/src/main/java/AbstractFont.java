import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qi")
@Implements("AbstractFont")
public abstract class AbstractFont extends Rasterizer2D {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	@Export("AbstractFont_modIconSprites")
	public static IndexedSprite[] AbstractFont_modIconSprites;
	@ObfuscatedName("aj")
	@Export("AbstractFont_strike")
	static int AbstractFont_strike;
	@ObfuscatedName("af")
	@Export("AbstractFont_underline")
	static int AbstractFont_underline;
	@ObfuscatedName("ax")
	@Export("AbstractFont_previousShadow")
	static int AbstractFont_previousShadow;
	@ObfuscatedName("an")
	@Export("AbstractFont_shadow")
	static int AbstractFont_shadow;
	@ObfuscatedName("ag")
	@Export("AbstractFont_previousColor")
	static int AbstractFont_previousColor;
	@ObfuscatedName("am")
	@Export("AbstractFont_color")
	static int AbstractFont_color;
	@ObfuscatedName("ad")
	@Export("AbstractFont_alpha")
	static int AbstractFont_alpha;
	@ObfuscatedName("at")
	@Export("AbstractFont_justificationTotal")
	static int AbstractFont_justificationTotal;
	@ObfuscatedName("ay")
	@Export("AbstractFont_justificationCurrent")
	static int AbstractFont_justificationCurrent;
	@ObfuscatedName("ae")
	@Export("AbstractFont_random")
	static Random AbstractFont_random;
	@ObfuscatedName("ac")
	@Export("AbstractFont_lines")
	static String[] AbstractFont_lines;
	@ObfuscatedName("aw")
	@Export("pixels")
	byte[][] pixels;
	@ObfuscatedName("al")
	@Export("advances")
	int[] advances;
	@ObfuscatedName("ai")
	@Export("widths")
	int[] widths;
	@ObfuscatedName("ar")
	@Export("heights")
	int[] heights;
	@ObfuscatedName("as")
	@Export("leftBearings")
	int[] leftBearings;
	@ObfuscatedName("aa")
	@Export("topBearings")
	int[] topBearings;
	@ObfuscatedName("az")
	@Export("ascent")
	public int ascent;
	@ObfuscatedName("ao")
	@Export("maxAscent")
	public int maxAscent;
	@ObfuscatedName("au")
	@Export("maxDescent")
	public int maxDescent;
	@ObfuscatedName("ah")
	@Export("kerning")
	byte[] kerning;

	static {
		AbstractFont_strike = -1;
		AbstractFont_underline = -1;
		AbstractFont_previousShadow = -1;
		AbstractFont_shadow = -1;
		AbstractFont_previousColor = 0;
		AbstractFont_color = 0;
		AbstractFont_alpha = 256;
		AbstractFont_justificationTotal = 0;
		AbstractFont_justificationCurrent = 0;
		AbstractFont_random = new Random();
		AbstractFont_lines = new String[100];
	}

	AbstractFont(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
		this.pixels = new byte[256][];
		this.ascent = 0;
		this.leftBearings = var2;
		this.topBearings = var3;
		this.widths = var4;
		this.heights = var5;
		this.readMetrics(var1);
		this.pixels = var7;
		int var8 = Integer.MAX_VALUE;
		int var9 = Integer.MIN_VALUE;

		for (int var10 = 0; var10 < 256; ++var10) {
			if (this.topBearings[var10] < var8 && this.heights[var10] != 0) {
				var8 = this.topBearings[var10];
			}

			if (this.topBearings[var10] + this.heights[var10] > var9) {
				var9 = this.topBearings[var10] + this.heights[var10];
			}
		}

		this.maxAscent = this.ascent - var8;
		this.maxDescent = var9 - this.ascent;
	}

	AbstractFont(byte[] var1) {
		this.pixels = new byte[256][];
		this.ascent = 0;
		this.readMetrics(var1);
	}

	@ObfuscatedName("aq")
	@Export("drawGlyph")
	abstract void drawGlyph(byte[] var1, int var2, int var3, int var4, int var5, int var6);

	@ObfuscatedName("aw")
	@Export("drawGlyphAlpha")
	abstract void drawGlyphAlpha(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

	@ObfuscatedName("ao")
	@Export("readMetrics")
	void readMetrics(byte[] var1) {
		this.advances = new int[256];
		int var2;
		if (var1.length == 257) {
			for (var2 = 0; var2 < this.advances.length; ++var2) {
				this.advances[var2] = var1[var2] & 255;
			}

			this.ascent = var1[256] & 255;
		} else {
			var2 = 0;

			for (int var3 = 0; var3 < 256; ++var3) {
				this.advances[var3] = var1[var2++] & 255;
			}

			int[] var10 = new int[256];
			int[] var4 = new int[256];

			int var5;
			for (var5 = 0; var5 < 256; ++var5) {
				var10[var5] = var1[var2++] & 255;
			}

			for (var5 = 0; var5 < 256; ++var5) {
				var4[var5] = var1[var2++] & 255;
			}

			byte[][] var11 = new byte[256][];

			int var8;
			for (int var6 = 0; var6 < 256; ++var6) {
				var11[var6] = new byte[var10[var6]];
				byte var7 = 0;

				for (var8 = 0; var8 < var11[var6].length; ++var8) {
					var7 += var1[var2++];
					var11[var6][var8] = var7;
				}
			}

			byte[][] var12 = new byte[256][];

			int var13;
			for (var13 = 0; var13 < 256; ++var13) {
				var12[var13] = new byte[var10[var13]];
				byte var14 = 0;

				for (int var9 = 0; var9 < var12[var13].length; ++var9) {
					var14 += var1[var2++];
					var12[var13][var9] = var14;
				}
			}

			this.kerning = new byte[65536];

			for (var13 = 0; var13 < 256; ++var13) {
				if (var13 != 32 && var13 != 160) {
					for (var8 = 0; var8 < 256; ++var8) {
						if (var8 != 32 && var8 != 160) {
							this.kerning[var8 + (var13 << 8)] = (byte)method7952(var11, var12, var4, this.advances, var10, var13, var8);
						}
					}
				}
			}

			this.ascent = var4[32] + var10[32];
		}

	}

	@ObfuscatedName("ak")
	@Export("charWidth")
	public int charWidth(char var1) {
		if (var1 == 160) {
			var1 = ' ';
		}

		return this.advances[class226.charToByteCp1252(var1) & 255];
	}

	@ObfuscatedName("ah")
	@Export("stringWidth")
	public int stringWidth(String var1) {
		if (var1 == null) {
			return 0;
		} else {
			int var2 = -1;
			int var3 = -1;
			int var4 = 0;

			for (int var5 = 0; var5 < var1.length(); ++var5) {
				char var6 = var1.charAt(var5);
				if (var6 == '<') {
					var2 = var5;
				} else {
					if (var6 == '>' && var2 != -1) {
						String var7 = var1.substring(var2 + 1, var5);
						var2 = -1;
						if (var7.equals("lt")) {
							var6 = '<';
						} else {
							if (!var7.equals("gt")) {
								if (var7.startsWith("img=")) {
									try {
										int var8 = class129.method3066(var7.substring(4));
										var4 += AbstractFont_modIconSprites[var8].width;
										var3 = -1;
									} catch (Exception var10) {
									}
								}
								continue;
							}

							var6 = '>';
						}
					}

					if (var6 == 160) {
						var6 = ' ';
					}

					if (var2 == -1) {
						var4 += this.advances[(char)(class226.charToByteCp1252(var6) & 255)];
						if (this.kerning != null && var3 != -1) {
							var4 += this.kerning[var6 + (var3 << 8)];
						}

						var3 = var6;
					}
				}
			}

			return var4;
		}
	}

	@ObfuscatedName("aj")
	@Export("breakLines")
	public int breakLines(String var1, int[] var2, String[] var3) {
		if (var1 == null) {
			return 0;
		} else {
			int var4 = 0;
			int var5 = 0;
			StringBuilder var6 = new StringBuilder(100);
			int var7 = -1;
			int var8 = 0;
			byte var9 = 0;
			int var10 = -1;
			char var11 = 0;
			int var12 = 0;
			int var13 = var1.length();

			for (int var14 = 0; var14 < var13; ++var14) {
				char var15 = var1.charAt(var14);
				if (var15 == '<') {
					var10 = var14;
				} else {
					if (var15 == '>' && var10 != -1) {
						String var16 = var1.substring(var10 + 1, var14);
						var10 = -1;
						var6.append('<');
						var6.append(var16);
						var6.append('>');
						if (var16.equals("br")) {
							var3[var12] = var6.toString().substring(var5, var6.length());
							++var12;
							var5 = var6.length();
							var4 = 0;
							var7 = -1;
							var11 = 0;
						} else if (var16.equals("lt")) {
							var4 += this.charWidth('<');
							if (this.kerning != null && var11 != -1) {
								var4 += this.kerning[(var11 << '\b') + 60];
							}

							var11 = '<';
						} else if (var16.equals("gt")) {
							var4 += this.charWidth('>');
							if (this.kerning != null && var11 != -1) {
								var4 += this.kerning[(var11 << '\b') + 62];
							}

							var11 = '>';
						} else if (var16.startsWith("img=")) {
							try {
								int var17 = class129.method3066(var16.substring(4));
								var4 += AbstractFont_modIconSprites[var17].width;
								var11 = 0;
							} catch (Exception var20) {
							}
						}

						var15 = 0;
					}

					if (var10 == -1) {
						if (var15 != 0) {
							var6.append(var15);
							var4 += this.charWidth(var15);
							if (this.kerning != null && var11 != -1) {
								var4 += this.kerning[var15 + (var11 << '\b')];
							}

							var11 = var15;
						}

						if (var15 == ' ') {
							var7 = var6.length();
							var8 = var4;
							var9 = 1;
						}

						if (var2 != null && var4 > var2[var12 < var2.length ? var12 : var2.length - 1] && var7 >= 0) {
							var3[var12] = var6.toString().substring(var5, var7 - var9);
							++var12;
							var5 = var7;
							var7 = -1;
							var4 -= var8;
							var11 = 0;
						}

						if (var15 == '-') {
							var7 = var6.length();
							var8 = var4;
							var9 = 0;
						}
					}
				}
			}

			String var19 = var6.toString();
			if (var19.length() > var5) {
				var3[var12++] = var19.substring(var5, var19.length());
			}

			return var12;
		}
	}

	@ObfuscatedName("af")
	@Export("lineWidth")
	public int lineWidth(String var1, int var2) {
		int var3 = this.breakLines(var1, new int[]{var2}, AbstractFont_lines);
		int var4 = 0;

		for (int var5 = 0; var5 < var3; ++var5) {
			int var6 = this.stringWidth(AbstractFont_lines[var5]);
			if (var6 > var4) {
				var4 = var6;
			}
		}

		return var4;
	}

	@ObfuscatedName("ax")
	@Export("lineCount")
	public int lineCount(String var1, int var2) {
		return this.breakLines(var1, new int[]{var2}, AbstractFont_lines);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)Lrc;"
	)
	public Bounds method7882(int var1, int var2, String var3, int var4, int var5) {
		if (var3 != null && var3.length() >= var2 + var1) {
			int var6 = var4 - this.stringWidth(var3) / 2;
			var6 += this.stringWidth(var3.substring(0, var1));
			int var7 = var5 - this.maxAscent;
			int var8 = this.stringWidth(var3.substring(var1, var2 + var1));
			int var9 = this.maxAscent + this.maxDescent;
			return new Bounds(var6, var7, var8, var9);
		} else {
			return new Bounds(var4, var5, 0, 0);
		}
	}

	@ObfuscatedName("am")
	@Export("draw")
	public void draw(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.reset(var4, var5);
			this.draw0(var1, var2, var3);
		}
	}

	@ObfuscatedName("ad")
	@Export("drawAlpha")
	public void drawAlpha(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			this.reset(var4, var5);
			AbstractFont_alpha = var6;
			this.draw0(var1, var2, var3);
		}
	}

	@ObfuscatedName("at")
	@Export("drawRightAligned")
	public void drawRightAligned(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.reset(var4, var5);
			this.draw0(var1, var2 - this.stringWidth(var1), var3);
		}
	}

	@ObfuscatedName("ay")
	@Export("drawCentered")
	public void drawCentered(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.reset(var4, var5);
			this.draw0(var1, var2 - this.stringWidth(var1) / 2, var3);
		}
	}

	@ObfuscatedName("ae")
	@Export("drawLines")
	public int drawLines(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		return this.drawWidgetText(var1, var2, var3, var4, var5, var6, var7, 256, var8, var9, var10);
	}

	@ObfuscatedName("ac")
	@Export("drawWidgetText")
	public int drawWidgetText(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		if (var1 == null) {
			return 0;
		} else {
			if (var8 == 255) {
				var8 = 256;
			}

			this.reset(var6, var7);
			AbstractFont_alpha = var8;
			if (var11 == 0) {
				var11 = this.ascent;
			}

			int[] var12 = new int[]{var4};
			if (var5 < var11 + this.maxAscent + this.maxDescent && var5 < var11 + var11) {
				var12 = null;
			}

			int var13 = this.breakLines(var1, var12, AbstractFont_lines);
			if (var10 == 3 && var13 == 1) {
				var10 = 1;
			}

			int var14;
			int var15;
			if (var10 == 0) {
				var14 = var3 + this.maxAscent;
			} else if (var10 == 1) {
				var14 = var3 + this.maxAscent + (var5 - this.maxAscent - this.maxDescent - var11 * (var13 - 1)) / 2;
			} else if (var10 == 2) {
				var14 = var3 + var5 - this.maxDescent - var11 * (var13 - 1);
			} else {
				var15 = (var5 - this.maxAscent - this.maxDescent - var11 * (var13 - 1)) / (var13 + 1);
				if (var15 < 0) {
					var15 = 0;
				}

				var14 = var3 + var15 + this.maxAscent;
				var11 += var15;
			}

			for (var15 = 0; var15 < var13; ++var15) {
				if (var9 == 0) {
					this.draw0(AbstractFont_lines[var15], var2, var14);
				} else if (var9 == 1) {
					this.draw0(AbstractFont_lines[var15], var2 + (var4 - this.stringWidth(AbstractFont_lines[var15])) / 2, var14);
				} else if (var9 == 2) {
					this.draw0(AbstractFont_lines[var15], var2 + var4 - this.stringWidth(AbstractFont_lines[var15]), var14);
				} else if (var15 == var13 - 1) {
					this.draw0(AbstractFont_lines[var15], var2, var14);
				} else {
					this.calculateLineJustification(AbstractFont_lines[var15], var4);
					this.draw0(AbstractFont_lines[var15], var2, var14);
					AbstractFont_justificationTotal = 0;
				}

				var14 += var11;
			}

			return var13;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lqz;IIIII)Lth;"
	)
	public class504 method7849(class417 var1, int var2, int var3, int var4, int var5, int var6) {
		if (!var1.method7956()) {
			this.reset(var4, var5);
			var3 -= this.ascent;

			for (int var7 = 0; var7 < var1.method7957(); ++var7) {
				class415 var8 = var1.method7971(var7);
				if (var6 != -1 && var8.field4585 > var6) {
					return new class504(var8.field4584, var8.field4585);
				}

				char var9 = var8.field4583;
				if (var9 != '\n') {
					if (var1.method7955(var7)) {
						var9 = '*';
					}

					if (var9 != '\t') {
						if (var9 == 160) {
							var9 = ' ';
						}

						int var10 = var2 + var8.field4584;
						int var11 = var3 + var8.field4585;
						int var12 = this.widths[var9];
						int var13 = this.heights[var9];
						if (AbstractFont_shadow != -1) {
							this.drawGlyph(this.pixels[var9], var10 + this.leftBearings[var9] + 1, var11 + this.topBearings[var9] + 1, var12, var13, AbstractFont_shadow);
						}

						this.drawGlyph(this.pixels[var9], var10 + this.leftBearings[var9], var11 + this.topBearings[var9], var12, var13, AbstractFont_color);
					}
				}
			}
		}

		return var1.method7963();
	}

	@ObfuscatedName("av")
	public void method7850(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
		if (var1 != null) {
			this.reset(var4, var5);
			int[] var8 = null;
			if (var7 != null) {
				var8 = this.method7897(var7, var1.length());
			}

			int[] var9 = new int[var1.length()];

			for (int var10 = 0; var10 < var1.length(); ++var10) {
				var9[var10] = (int)(Math.sin((double)var10 / 2.0D + (double)var6 / 5.0D) * 5.0D);
			}

			this.method7935(var1, var2 - this.stringWidth(var1) / 2, var3, var8, (int[])null, var9);
		}
	}

	@ObfuscatedName("ap")
	public void method7883(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
		if (var1 != null) {
			this.reset(var4, var5);
			int[] var8 = null;
			if (var7 != null) {
				var8 = this.method7897(var7, var1.length());
			}

			int[] var9 = new int[var1.length()];
			int[] var10 = new int[var1.length()];

			for (int var11 = 0; var11 < var1.length(); ++var11) {
				var9[var11] = (int)(Math.sin((double)var11 / 5.0D + (double)var6 / 5.0D) * 5.0D);
				var10[var11] = (int)(Math.sin((double)var11 / 3.0D + (double)var6 / 5.0D) * 5.0D);
			}

			this.method7935(var1, var2 - this.stringWidth(var1) / 2, var3, var8, var9, var10);
		}
	}

	@ObfuscatedName("bu")
	public void method7852(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8) {
		if (var1 != null) {
			this.reset(var4, var5);
			int[] var9 = null;
			if (var8 != null) {
				var9 = this.method7897(var8, var1.length());
			}

			double var10 = 7.0D - (double)var7 / 8.0D;
			if (var10 < 0.0D) {
				var10 = 0.0D;
			}

			int[] var12 = new int[var1.length()];

			for (int var13 = 0; var13 < var1.length(); ++var13) {
				var12[var13] = (int)(Math.sin((double)var13 / 1.5D + (double)var6 / 1.0D) * var10);
			}

			this.method7935(var1, var2 - this.stringWidth(var1) / 2, var3, var9, (int[])null, var12);
		}
	}

	@ObfuscatedName("bo")
	public void method7917(String var1, int var2, int var3, int var4, int var5, int[] var6) {
		if (var1 != null) {
			this.reset(var4, var5);
			int[] var7 = null;
			if (var6 != null) {
				var7 = this.method7897(var6, var1.length());
			}

			this.method7935(var1, var2 - this.stringWidth(var1) / 2, var3, var7, (int[])null, (int[])null);
		}
	}

	@ObfuscatedName("bd")
	public void method7854(String var1, int var2, int var3, int var4, int var5, int[] var6) {
		if (var1 != null) {
			this.reset(var4, var5);
			int[] var7 = null;
			if (var6 != null) {
				var7 = this.method7897(var6, var1.length());
			}

			this.method7935(var1, var2, var3, var7, (int[])null, (int[])null);
		}
	}

	@ObfuscatedName("bi")
	int[] method7897(int[] var1, int var2) {
		if (var2 == 0) {
			return null;
		} else {
			int[] var3 = new int[var2];
			float var4 = (float)var1.length / (float)var2;

			for (int var5 = 0; var5 < var2; ++var5) {
				var3[var5] = var1[(int)((float)var5 * var4)];
			}

			return var3;
		}
	}

	@ObfuscatedName("bq")
	@Export("drawRandomAlphaAndSpacing")
	public void drawRandomAlphaAndSpacing(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			this.reset(var4, var5);
			AbstractFont_random.setSeed((long)var6);
			AbstractFont_alpha = 192 + (AbstractFont_random.nextInt() & 31);
			int[] var7 = new int[var1.length()];
			int var8 = 0;

			for (int var9 = 0; var9 < var1.length(); ++var9) {
				var7[var9] = var8;
				if ((AbstractFont_random.nextInt() & 3) == 0) {
					++var8;
				}
			}

			this.method7935(var1, var2, var3, (int[])null, var7, (int[])null);
		}
	}

	@ObfuscatedName("ba")
	@Export("reset")
	void reset(int var1, int var2) {
		AbstractFont_strike = -1;
		AbstractFont_underline = -1;
		AbstractFont_previousShadow = var2;
		AbstractFont_shadow = var2;
		AbstractFont_previousColor = var1;
		AbstractFont_color = var1;
		AbstractFont_alpha = 256;
		AbstractFont_justificationTotal = 0;
		AbstractFont_justificationCurrent = 0;
	}

	@ObfuscatedName("bt")
	@Export("decodeTag")
	void decodeTag(String var1) {
		try {
			if (var1.startsWith("col=")) {
				AbstractFont_color = WorldMapID.method5045(var1.substring(4), 16);
			} else if (var1.equals("/col")) {
				AbstractFont_color = AbstractFont_previousColor;
			} else if (var1.startsWith("str=")) {
				AbstractFont_strike = WorldMapID.method5045(var1.substring(4), 16);
			} else if (var1.equals("str")) {
				AbstractFont_strike = 8388608;
			} else if (var1.equals("/str")) {
				AbstractFont_strike = -1;
			} else if (var1.startsWith("u=")) {
				AbstractFont_underline = WorldMapID.method5045(var1.substring(2), 16);
			} else if (var1.equals("u")) {
				AbstractFont_underline = 0;
			} else if (var1.equals("/u")) {
				AbstractFont_underline = -1;
			} else if (var1.startsWith("shad=")) {
				AbstractFont_shadow = WorldMapID.method5045(var1.substring(5), 16);
			} else if (var1.equals("shad")) {
				AbstractFont_shadow = 0;
			} else if (var1.equals("/shad")) {
				AbstractFont_shadow = AbstractFont_previousShadow;
			} else if (var1.equals("br")) {
				this.reset(AbstractFont_previousColor, AbstractFont_previousShadow);
			}
		} catch (Exception var3) {
		}

	}

	@ObfuscatedName("bk")
	@Export("calculateLineJustification")
	void calculateLineJustification(String var1, int var2) {
		int var3 = 0;
		boolean var4 = false;

		for (int var5 = 0; var5 < var1.length(); ++var5) {
			char var6 = var1.charAt(var5);
			if (var6 == '<') {
				var4 = true;
			} else if (var6 == '>') {
				var4 = false;
			} else if (!var4 && var6 == ' ') {
				++var3;
			}
		}

		if (var3 > 0) {
			AbstractFont_justificationTotal = (var2 - this.stringWidth(var1) << 8) / var3;
		}

	}

	@ObfuscatedName("bm")
	@Export("draw0")
	void draw0(String var1, int var2, int var3) {
		var3 -= this.ascent;
		int var4 = -1;
		int var5 = -1;

		for (int var6 = 0; var6 < var1.length(); ++var6) {
			if (var1.charAt(var6) != 0) {
				char var7 = (char)(class226.charToByteCp1252(var1.charAt(var6)) & 255);
				if (var7 == '<') {
					var4 = var6;
				} else {
					int var9;
					if (var7 == '>' && var4 != -1) {
						String var8 = var1.substring(var4 + 1, var6);
						var4 = -1;
						if (var8.equals("lt")) {
							var7 = '<';
						} else {
							if (!var8.equals("gt")) {
								if (var8.startsWith("img=")) {
									try {
										var9 = class129.method3066(var8.substring(4));
										IndexedSprite var10 = AbstractFont_modIconSprites[var9];
										var10.drawAt(var2, var3 + this.ascent - var10.height);
										var2 += var10.width;
										var5 = -1;
									} catch (Exception var14) {
									}
								} else {
									this.decodeTag(var8);
								}
								continue;
							}

							var7 = '>';
						}
					}

					if (var7 == 160) {
						var7 = ' ';
					}

					if (var4 == -1) {
						if (this.kerning != null && var5 != -1) {
							var2 += this.kerning[var7 + (var5 << 8)];
						}

						int var12 = this.widths[var7];
						var9 = this.heights[var7];
						if (var7 != ' ') {
							if (AbstractFont_alpha == 256) {
								if (AbstractFont_shadow != -1) {
									AbstractFont_drawGlyph(this.pixels[var7], var2 + this.leftBearings[var7] + 1, var3 + this.topBearings[var7] + 1, var12, var9, AbstractFont_shadow);
								}

								this.drawGlyph(this.pixels[var7], var2 + this.leftBearings[var7], var3 + this.topBearings[var7], var12, var9, AbstractFont_color);
							} else {
								if (AbstractFont_shadow != -1) {
									AbstractFont_drawGlyphAlpha(this.pixels[var7], var2 + this.leftBearings[var7] + 1, var3 + this.topBearings[var7] + 1, var12, var9, AbstractFont_shadow, AbstractFont_alpha);
								}

								this.drawGlyphAlpha(this.pixels[var7], var2 + this.leftBearings[var7], var3 + this.topBearings[var7], var12, var9, AbstractFont_color, AbstractFont_alpha);
							}
						} else if (AbstractFont_justificationTotal > 0) {
							AbstractFont_justificationCurrent += AbstractFont_justificationTotal;
							var2 += AbstractFont_justificationCurrent >> 8;
							AbstractFont_justificationCurrent &= 255;
						}

						int var13 = this.advances[var7];
						if (AbstractFont_strike != -1) {
							Rasterizer2D.Rasterizer2D_drawHorizontalLine(var2, var3 + (int)((double)this.ascent * 0.7D), var13, AbstractFont_strike);
						}

						if (AbstractFont_underline != -1) {
							Rasterizer2D.Rasterizer2D_drawHorizontalLine(var2, var3 + this.ascent + 1, var13, AbstractFont_underline);
						}

						var2 += var13;
						var5 = var7;
					}
				}
			}
		}

	}

	@ObfuscatedName("bw")
	void method7935(String var1, int var2, int var3, int[] var4, int[] var5, int[] var6) {
		var3 -= this.ascent;
		int var7 = -1;
		int var8 = -1;
		int var9 = 0;

		for (int var10 = 0; var10 < var1.length(); ++var10) {
			if (var1.charAt(var10) != 0) {
				char var11 = (char)(class226.charToByteCp1252(var1.charAt(var10)) & 255);
				if (var11 == '<') {
					var7 = var10;
				} else {
					int var13;
					int var14;
					int var15;
					if (var11 == '>' && var7 != -1) {
						String var12 = var1.substring(var7 + 1, var10);
						var7 = -1;
						if (var12.equals("lt")) {
							var11 = '<';
						} else {
							if (!var12.equals("gt")) {
								if (var12.startsWith("img=")) {
									try {
										if (var5 != null) {
											var13 = var5[var9];
										} else {
											var13 = 0;
										}

										if (var6 != null) {
											var14 = var6[var9];
										} else {
											var14 = 0;
										}

										++var9;
										var15 = class129.method3066(var12.substring(4));
										IndexedSprite var16 = AbstractFont_modIconSprites[var15];
										var16.drawAt(var13 + var2, var14 + (var3 + this.ascent - var16.height));
										var2 += var16.width;
										var8 = -1;
									} catch (Exception var21) {
									}
								} else {
									this.decodeTag(var12);
								}
								continue;
							}

							var11 = '>';
						}
					}

					if (var11 == 160) {
						var11 = ' ';
					}

					if (var7 == -1) {
						if (this.kerning != null && var8 != -1) {
							var2 += this.kerning[var11 + (var8 << 8)];
						}

						int var19 = this.widths[var11];
						var13 = this.heights[var11];
						if (var5 != null) {
							var14 = var5[var9];
						} else {
							var14 = 0;
						}

						if (var6 != null) {
							var15 = var6[var9];
						} else {
							var15 = 0;
						}

						int var20;
						if (var4 != null) {
							var20 = var4[var9];
						} else {
							var20 = AbstractFont_color;
						}

						++var9;
						if (var11 != ' ') {
							if (AbstractFont_alpha == 256) {
								if (AbstractFont_shadow != -1) {
									AbstractFont_drawGlyph(this.pixels[var11], var14 + var2 + this.leftBearings[var11] + 1, var3 + var15 + this.topBearings[var11] + 1, var19, var13, AbstractFont_shadow);
								}

								this.drawGlyph(this.pixels[var11], var14 + var2 + this.leftBearings[var11], var3 + var15 + this.topBearings[var11], var19, var13, var20);
							} else {
								if (AbstractFont_shadow != -1) {
									AbstractFont_drawGlyphAlpha(this.pixels[var11], var14 + var2 + this.leftBearings[var11] + 1, var3 + var15 + this.topBearings[var11] + 1, var19, var13, AbstractFont_shadow, AbstractFont_alpha);
								}

								this.drawGlyphAlpha(this.pixels[var11], var14 + var2 + this.leftBearings[var11], var3 + var15 + this.topBearings[var11], var19, var13, var20, AbstractFont_alpha);
							}
						} else if (AbstractFont_justificationTotal > 0) {
							AbstractFont_justificationCurrent += AbstractFont_justificationTotal;
							var2 += AbstractFont_justificationCurrent >> 8;
							AbstractFont_justificationCurrent &= 255;
						}

						int var17 = this.advances[var11];
						if (AbstractFont_strike != -1) {
							Rasterizer2D.Rasterizer2D_drawHorizontalLine(var2, var3 + (int)((double)this.ascent * 0.7D), var17, AbstractFont_strike);
						}

						if (AbstractFont_underline != -1) {
							Rasterizer2D.Rasterizer2D_drawHorizontalLine(var2, var3 + this.ascent, var17, AbstractFont_underline);
						}

						var2 += var17;
						var8 = var11;
					}
				}
			}
		}

	}

	@ObfuscatedName("au")
	static int method7952(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
		int var7 = var2[var5];
		int var8 = var7 + var4[var5];
		int var9 = var2[var6];
		int var10 = var9 + var4[var6];
		int var11 = var7;
		if (var9 > var7) {
			var11 = var9;
		}

		int var12 = var8;
		if (var10 < var8) {
			var12 = var10;
		}

		int var13 = var3[var5];
		if (var3[var6] < var13) {
			var13 = var3[var6];
		}

		byte[] var14 = var1[var5];
		byte[] var15 = var0[var6];
		int var16 = var11 - var7;
		int var17 = var11 - var9;

		for (int var18 = var11; var18 < var12; ++var18) {
			int var19 = var14[var16++] + var15[var17++];
			if (var19 < var13) {
				var13 = var19;
			}
		}

		return -var13;
	}

	@ObfuscatedName("an")
	@Export("escapeBrackets")
	public static String escapeBrackets(String var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if (var4 == '<' || var4 == '>') {
				var2 += 3;
			}
		}

		StringBuilder var6 = new StringBuilder(var1 + var2);

		for (int var7 = 0; var7 < var1; ++var7) {
			char var5 = var0.charAt(var7);
			if (var5 == '<') {
				var6.append("<lt>");
			} else if (var5 == '>') {
				var6.append("<gt>");
			} else {
				var6.append(var5);
			}
		}

		return var6.toString();
	}

	@ObfuscatedName("bv")
	@Export("AbstractFont_drawGlyph")
	static void AbstractFont_drawGlyph(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var1 + var2 * Rasterizer2D.Rasterizer2D_width;
		int var7 = Rasterizer2D.Rasterizer2D_width - var3;
		int var8 = 0;
		int var9 = 0;
		int var10;
		if (var2 < Rasterizer2D.Rasterizer2D_yClipStart) {
			var10 = Rasterizer2D.Rasterizer2D_yClipStart - var2;
			var4 -= var10;
			var2 = Rasterizer2D.Rasterizer2D_yClipStart;
			var9 += var3 * var10;
			var6 += var10 * Rasterizer2D.Rasterizer2D_width;
		}

		if (var2 + var4 > Rasterizer2D.Rasterizer2D_yClipEnd) {
			var4 -= var2 + var4 - Rasterizer2D.Rasterizer2D_yClipEnd;
		}

		if (var1 < Rasterizer2D.Rasterizer2D_xClipStart) {
			var10 = Rasterizer2D.Rasterizer2D_xClipStart - var1;
			var3 -= var10;
			var1 = Rasterizer2D.Rasterizer2D_xClipStart;
			var9 += var10;
			var6 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (var3 + var1 > Rasterizer2D.Rasterizer2D_xClipEnd) {
			var10 = var3 + var1 - Rasterizer2D.Rasterizer2D_xClipEnd;
			var3 -= var10;
			var8 += var10;
			var7 += var10;
		}

		if (var3 > 0 && var4 > 0) {
			AbstractFont_placeGlyph(Rasterizer2D.Rasterizer2D_pixels, var0, var5, var9, var6, var3, var4, var7, var8);
		}
	}

	@ObfuscatedName("by")
	@Export("AbstractFont_placeGlyph")
	static void AbstractFont_placeGlyph(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; ++var10) {
			int var11;
			for (var11 = var9; var11 < 0; ++var11) {
				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			for (var11 = var5; var11 < 0; ++var11) {
				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	@ObfuscatedName("bb")
	@Export("AbstractFont_drawGlyphAlpha")
	static void AbstractFont_drawGlyphAlpha(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var1 + var2 * Rasterizer2D.Rasterizer2D_width;
		int var8 = Rasterizer2D.Rasterizer2D_width - var3;
		int var9 = 0;
		int var10 = 0;
		int var11;
		if (var2 < Rasterizer2D.Rasterizer2D_yClipStart) {
			var11 = Rasterizer2D.Rasterizer2D_yClipStart - var2;
			var4 -= var11;
			var2 = Rasterizer2D.Rasterizer2D_yClipStart;
			var10 += var3 * var11;
			var7 += var11 * Rasterizer2D.Rasterizer2D_width;
		}

		if (var2 + var4 > Rasterizer2D.Rasterizer2D_yClipEnd) {
			var4 -= var2 + var4 - Rasterizer2D.Rasterizer2D_yClipEnd;
		}

		if (var1 < Rasterizer2D.Rasterizer2D_xClipStart) {
			var11 = Rasterizer2D.Rasterizer2D_xClipStart - var1;
			var3 -= var11;
			var1 = Rasterizer2D.Rasterizer2D_xClipStart;
			var10 += var11;
			var7 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (var3 + var1 > Rasterizer2D.Rasterizer2D_xClipEnd) {
			var11 = var3 + var1 - Rasterizer2D.Rasterizer2D_xClipEnd;
			var3 -= var11;
			var9 += var11;
			var8 += var11;
		}

		if (var3 > 0 && var4 > 0) {
			AbstractFont_placeGlyphAlpha(Rasterizer2D.Rasterizer2D_pixels, var0, var5, var10, var7, var3, var4, var8, var9, var6);
		}
	}

	@ObfuscatedName("bn")
	@Export("AbstractFont_placeGlyphAlpha")
	static void AbstractFont_placeGlyphAlpha(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		var2 = ((var2 & 65280) * var9 & 16711680) + (var9 * (var2 & 16711935) & -16711936) >> 8;
		var9 = 256 - var9;

		for (int var10 = -var6; var10 < 0; ++var10) {
			for (int var11 = -var5; var11 < 0; ++var11) {
				if (var1[var3++] != 0) {
					int var12 = var0[var4];
					var0[var4++] = (((var12 & 65280) * var9 & 16711680) + ((var12 & 16711935) * var9 & -16711936) >> 8) + var2;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}
}
