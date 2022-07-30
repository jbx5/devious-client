import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.security.SecureRandom;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("cq")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("tt")
	@ObfuscatedGetter(intValue = -179224576)
	static int field1233;

	@ObfuscatedName("pz")
	@ObfuscatedGetter(intValue = -1154483311)
	@Export("widgetDragDuration")
	static int widgetDragDuration;

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "[Lql;")
	@Export("sprites")
	IndexedSprite[] sprites;

	@ObfuscatedName("z")
	int[] field1218 = new int[256];

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 1486098233)
	int field1219 = 0;

	@ObfuscatedName("h")
	int[] field1220;

	@ObfuscatedName("a")
	int[] field1229;

	@ObfuscatedName("d")
	int[] field1222;

	@ObfuscatedName("n")
	int[] field1223;

	@ObfuscatedName("x")
	int field1224 = 0;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 1905612583)
	int field1225 = 0;

	@ObfuscatedName("p")
	int[] field1226;

	@ObfuscatedName("b")
	int[] field1227;

	@ObfuscatedName("l")
	int[] field1214;

	@ObfuscatedName("y")
	int[] field1213;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = -78773531)
	int field1215 = 0;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -1400814000)
	int field1231 = 0;

	@ObfuscatedName("t")
	@ObfuscatedGetter(intValue = -576484813)
	int field1228 = 0;

	@ObfuscatedSignature(descriptor = "([Lql;)V")
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.sprites = var1;
		this.initColors();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1253946128")
	@Export("initColors")
	void initColors() {
		this.field1229 = new int[256];
		int var1;
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1229[var1] = var1 * 262144;
		}
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1229[var1 + 64] = var1 * 1024 + 16711680;
		}
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1229[var1 + 128] = var1 * 4 + 16776960;
		}
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1229[var1 + 192] = 16777215;
		}
		this.field1222 = new int[256];
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1222[var1] = var1 * 1024;
		}
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1222[var1 + 64] = var1 * 4 + '＀';
		}
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1222[var1 + 128] = var1 * 262144 + '￿';
		}
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1222[var1 + 192] = 16777215;
		}
		this.field1223 = new int[256];
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1223[var1] = var1 * 4;
		}
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1223[var1 + 64] = var1 * 262144 + 255;
		}
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1223[var1 + 128] = var1 * 1024 + 16711935;
		}
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1223[var1 + 192] = 16777215;
		}
		this.field1220 = new int[256];
		this.field1215 = 0;
		this.field1214 = new int['耀'];
		this.field1213 = new int['耀'];
		this.method2283(((IndexedSprite) (null)));
		this.field1226 = new int['耀'];
		this.field1227 = new int['耀'];
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "325280497")
	void method2275() {
		this.field1229 = null;
		this.field1222 = null;
		this.field1223 = null;
		this.field1220 = null;
		this.field1214 = null;
		this.field1213 = null;
		this.field1226 = null;
		this.field1227 = null;
		this.field1215 = 0;
		this.field1231 = 0;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(IIS)V", garbageValue = "-27976")
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1226 == null) {
			this.initColors();
		}
		if (this.field1228 == 0) {
			this.field1228 = var2;
		}
		int var3 = var2 - this.field1228;
		if (var3 >= 256) {
			var3 = 0;
		}
		this.field1228 = var2;
		if (var3 > 0) {
			this.method2292(var3);
		}
		this.method2300(var1);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "-112")
	final void method2292(int var1) {
		this.field1215 += 128 * var1;
		int var2;
		if (this.field1215 > this.field1214.length) {
			this.field1215 -= this.field1214.length;
			var2 = ((int) (Math.random() * 12.0));
			this.method2283(this.sprites[var2]);
		}
		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;
		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1226[var2 + var3] - this.field1214[var2 + this.field1215 & this.field1214.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}
			this.field1226[var2++] = var6;
		}
		byte var15 = 10;
		var6 = 128 - var15;
		int var7;
		int var10;
		for (var7 = 256 - var1; var7 < 256; ++var7) {
			int var8 = var7 * 128;
			for (int var9 = 0; var9 < 128; ++var9) {
				var10 = ((int) (Math.random() * 100.0));
				if (var10 < 50 && var9 > var15 && var9 < var6) {
					this.field1226[var9 + var8] = 255;
				} else {
					this.field1226[var8 + var9] = 0;
				}
			}
		}
		if (this.field1224 * 359650093 > 0) {
			this.field1224 -= var1 * -273772;
		}
		if (this.field1225 * 16 > 0) {
			this.field1225 = this.field1225 * 16 - var1 * 4;
		}
		if (this.field1224 * 359650093 == 0 && this.field1225 * 16 == 0) {
			var7 = ((int) (Math.random() * ((double) (2000 / var1))));
			if (var7 == 0) {
				this.field1224 = -70085632;
			}
			if (var7 == 1) {
				this.field1225 = 1024;
			}
		}
		for (var7 = 0; var7 < 256 - var1; ++var7) {
			this.field1218[var7] = this.field1218[var7 + var1];
		}
		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1218[var7] = ((int) (Math.sin(((double) (this.field1219)) / 14.0) * 16.0 + Math.sin(((double) (this.field1219)) / 15.0) * 14.0 + Math.sin(((double) (this.field1219)) / 16.0) * 12.0));
			++this.field1219;
		}
		this.field1231 = this.field1231 * 10000 + var1 * 10000;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = 128 - var17 - var17;
			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1231 * 100; ++var11) {
				var12 = ((int) (Math.random() * ((double) (var10)))) + var17;
				var13 = ((int) (Math.random() * ((double) (var16)))) + var16;
				this.field1226[var12 + (var13 << 7)] = 192;
			}
			this.field1231 = 0;
			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;
				for (var14 = -var7; var14 < 128; ++var14) {
					if (var14 + var7 < 128) {
						var12 += this.field1226[var13 + var14 + var7];
					}
					if (var14 - (var7 + 1) >= 0) {
						var12 -= this.field1226[var14 + var13 - (var7 + 1)];
					}
					if (var14 >= 0) {
						this.field1227[var13 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}
			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;
				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var13 + var7 < 256) {
						var12 += this.field1227[var7 * 128 + var11 + var14];
					}
					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1227[var14 + var11 - (var7 + 1) * 128];
					}
					if (var13 >= 0) {
						this.field1226[var14 + var11] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(IIII)I", garbageValue = "-1438143565")
	final int method2280(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var4 * (var1 & '＀') + var3 * (var2 & '＀') & 16711680) + (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) >> 8;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "50")
	final void method2300(int var1) {
		int var2 = this.field1220.length;
		if (this.field1224 * 359650093 > 0) {
			this.method2297(this.field1224 * 359650093, this.field1222);
		} else if (this.field1225 * 16 > 0) {
			this.method2297(this.field1225 * 16, this.field1223);
		} else {
			for (int var3 = 0; var3 < var2; ++var3) {
				this.field1220[var3] = this.field1229[var3];
			}
		}
		this.method2281(var1);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(I[II)V", garbageValue = "-571629794")
	final void method2297(int var1, int[] var2) {
		int var3 = this.field1220.length;
		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1220[var4] = this.method2280(this.field1229[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1220[var4] = var2[var4];
			} else {
				this.field1220[var4] = this.method2280(var2[var4], this.field1229[var4], 256 - var1);
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "-103")
	final void method2281(int var1) {
		int var2 = 0;
		for (int var3 = 1; var3 < 255; ++var3) {
			int var4 = (256 - var3) * this.field1218[var3] / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}
			if (var5 + 128 >= class268.rasterProvider.width) {
				var7 = class268.rasterProvider.width - var5;
			}
			int var8 = var5 + (var3 + 8) * class268.rasterProvider.width;
			var2 += var6;
			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1226[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1220[var10];
					int var14 = class268.rasterProvider.pixels[var8];
					class268.rasterProvider.pixels[var8++] = -16777216 | ((var14 & 16711935) * var13 + (var10 & 16711935) * var12 & -16711936) + (var13 * (var14 & '＀') + var12 * (var10 & '＀') & 16711680) >> 8;
				} else {
					++var8;
				}
			}
			var2 += 128 - var7;
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Lql;I)V", garbageValue = "-1405909757")
	final void method2283(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1214.length; ++var2) {
			this.field1214[var2] = 0;
		}
		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = ((int) (Math.random() * 128.0 * 256.0));
			this.field1214[var3] = ((int) (Math.random() * 256.0));
		}
		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1213[var5] = (this.field1214[var5 + 1] + this.field1214[var5 - 128] + this.field1214[var5 + 128] + this.field1214[var5 - 1]) / 4;
				}
			}
			int[] var8 = this.field1214;
			this.field1214 = this.field1213;
			this.field1213 = var8;
		}
		if (var1 != null) {
			var2 = 0;
			for (var3 = 0; var3 < var1.subHeight; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1214[var7] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)Ljava/security/SecureRandom;", garbageValue = "482402081")
	static SecureRandom method2306() {
		SecureRandom var0 = new SecureRandom();
		var0.nextInt();
		return var0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(II)Ldg;", garbageValue = "1649345102")
	static class119 method2305(int var0) {
		class119[] var1 = new class119[]{ class119.field1467, class119.field1466, class119.field1465, class119.field1468, class119.field1470, class119.field1473, class119.field1471, class119.field1483, class119.field1472, class119.field1474, class119.field1475, class119.field1476, class119.field1479, class119.field1478, class119.field1484, class119.field1480, class119.field1481 };
		class119 var2 = ((class119) (class271.findEnumerated(var1, var0)));
		if (var2 == null) {
			var2 = class119.field1467;
		}
		return var2;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "443414989")
	static final void method2279(String var0) {
		FileSystem.addGameMessage(30, "", var0);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(ILbc;ZI)I", garbageValue = "-2138590712")
	static int method2307(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) {
				var7 = (var2) ? VertexNormal.scriptDotWidget : class321.scriptActiveWidget;
				var4 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
				if (var4 >= 1 && var4 <= 10) {
					class93 var8 = new class93(var4, var7.id, var7.childIndex, var7.itemId);
					Interpreter.field841.add(var8);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) {
				TaskHandler.Interpreter_intStackSize -= 3;
				int var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2];
				if (var5 >= 1 && var5 <= 10) {
					class93 var6 = new class93(var5, var3, var4, FloorUnderlayDefinition.getWidget(var3).itemId);
					Interpreter.field841.add(var6);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (Interpreter.field844 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var7 = FloorUnderlayDefinition.getWidget(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]);
			} else {
				var7 = (var2) ? VertexNormal.scriptDotWidget : class321.scriptActiveWidget;
			}
			if (var7.onResize == null) {
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent();
				var9.widget = var7;
				var9.args = var7.onResize;
				var9.field1049 = Interpreter.field844 + 1;
				Client.scriptEvents.addFirst(var9);
				return 1;
			}
		}
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(descriptor = "(IIIIIIS)V", garbageValue = "128")
	static final void method2304(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0;
		int var7 = var3 - var1;
		int var8 = (var6 >= 0) ? var6 : -var6;
		int var9 = (var7 >= 0) ? var7 : -var7;
		int var10 = var8;
		if (var8 < var9) {
			var10 = var9;
		}
		if (var10 != 0) {
			int var11 = (var6 << 16) / var10;
			int var12 = (var7 << 16) / var10;
			if (var12 <= var11) {
				var11 = -var11;
			} else {
				var12 = -var12;
			}
			int var13 = var5 * var12 >> 17;
			int var14 = var5 * var12 + 1 >> 17;
			int var15 = var5 * var11 >> 17;
			int var16 = var5 * var11 + 1 >> 17;
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
			int var17 = var0 + var13;
			int var18 = var0 - var14;
			int var19 = var0 + var6 - var14;
			int var20 = var0 + var6 + var13;
			int var21 = var15 + var1;
			int var22 = var1 - var16;
			int var23 = var7 + var1 - var16;
			int var24 = var7 + var15 + var1;
			Rasterizer3D.method4008(var17, var18, var19);
			Rasterizer3D.method4009(var21, var22, var23, var17, var18, var19, var4);
			Rasterizer3D.method4008(var17, var19, var20);
			Rasterizer3D.method4009(var21, var23, var24, var17, var19, var20, var4);
		}
	}
}