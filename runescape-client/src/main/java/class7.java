import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("l")
public class class7 {
	@ObfuscatedName("v")
	ExecutorService field20;
	@ObfuscatedName("c")
	Future field18;
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Lpi;")

	final Buffer field19;
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Lf;")

	final class3 field17;

	@ObfuscatedSignature(descriptor = 
	"(Lpi;Lf;)V")

	public class7(Buffer var1, class3 var2) {
		this.field20 = Executors.newSingleThreadExecutor();
		this.field19 = var1;
		this.field17 = var2;
		this.method42();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"-254090586")

	public boolean method43() {
		return this.field18.isDone();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"67")

	public void method47() {
		this.field20.shutdown();
		this.field20 = null;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(I)Lpi;", garbageValue = 
	"-2056850231")

	public Buffer method45() {
		try {
			return ((Buffer) (this.field18.get()));
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"0")

	void method42() {
		this.field18 = this.field20.submit(new class1(this, this.field19, this.field17));
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(IIB)I", garbageValue = 
	"6")

	static int method53(int var0, int var1) {
		FloorOverlayDefinition var2 = Clock.method3349(var0);
		if (var2 == null) {
			return var1;
		} else if (var2.secondaryRgb >= 0) {
			return var2.secondaryRgb | (-16777216);
		} else {
			int var3;
			int var4;
			byte var5;
			int var7;
			if (var2.texture >= 0) {
				var4 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture);
				var5 = 96;
				if (var4 == (-2)) {
					var3 = 12345678;
				} else if (var4 == (-1)) {
					if (var5 < 0) {
						var5 = 0;
					} else if (var5 > 127) {
						var5 = 127;
					}

					var7 = 127 - var5;
					var3 = var7;
				} else {
					var7 = (var5 * (var4 & 127)) / 128;
					if (var7 < 2) {
						var7 = 2;
					} else if (var7 > 126) {
						var7 = 126;
					}

					var3 = var7 + (var4 & 65408);
				}

				return Rasterizer3D.Rasterizer3D_colorPalette[var3] | (-16777216);
			} else if (var2.primaryRgb == 16711935) {
				return var1;
			} else {
				var3 = FontName.method7415(var2.hue, var2.saturation, var2.lightness);
				var5 = 96;
				if (var3 == (-2)) {
					var4 = 12345678;
				} else if (var3 == (-1)) {
					if (var5 < 0) {
						var5 = 0;
					} else if (var5 > 127) {
						var5 = 127;
					}

					var7 = 127 - var5;
					var4 = var7;
				} else {
					var7 = (var5 * (var3 & 127)) / 128;
					if (var7 < 2) {
						var7 = 2;
					} else if (var7 > 126) {
						var7 = 126;
					}

					var4 = var7 + (var3 & 65408);
				}

				return Rasterizer3D.Rasterizer3D_colorPalette[var4] | (-16777216);
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(ILbd;ZI)I", garbageValue = 
	"17269568")

	static int method54(int var0, Script var1, boolean var2) {
		int var3 = -1;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			var4 = class127.getWidget(var3);
		} else {
			var4 = (var2) ? WorldMapID.scriptDotWidget : Interpreter.scriptActiveWidget;
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) {
			Interpreter.Interpreter_intStackSize -= 4;
			var4.rawX = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var4.rawY = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			var4.xAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			var4.yAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
			class346.invalidateWidget(var4);
			class127.client.alignWidget(var4);
			if ((var3 != (-1)) && (var4.type == 0)) {
				AbstractByteArrayCopier.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) {
			Interpreter.Interpreter_intStackSize -= 4;
			var4.rawWidth = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var4.rawHeight = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			var4.widthAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			var4.heightAlignment = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
			class346.invalidateWidget(var4);
			class127.client.alignWidget(var4);
			if ((var3 != (-1)) && (var4.type == 0)) {
				AbstractByteArrayCopier.revalidateWidgetScroll(Widget.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) {
			boolean var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
			if (var5 != var4.isHidden) {
				var4.isHidden = var5;
				class346.invalidateWidget(var4);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
			var4.noClickThrough = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}
}