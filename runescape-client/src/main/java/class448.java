import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("rj")
public class class448 {
	@ObfuscatedName("au")
	float field4726;
	@ObfuscatedName("ae")
	float field4725;
	@ObfuscatedName("ao")
	float field4727;

	static {
		new class448(0.0F, 0.0F, 0.0F);
		new class448(1.0F, 1.0F, 1.0F);
		new class448(1.0F, 0.0F, 0.0F);
		new class448(0.0F, 1.0F, 0.0F);
		new class448(0.0F, 0.0F, 1.0F);
		WorldMapArea.method5176(100);
	}

	class448(float var1, float var2, float var3) {
		this.field4726 = var1;
		this.field4725 = var2;
		this.field4727 = var3;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "36"
	)
	final float method8152() {
		return (float)Math.sqrt((double)(this.field4726 * this.field4726 + this.field4725 * this.field4725 + this.field4727 * this.field4727));
	}

	public String toString() {
		return this.field4726 + ", " + this.field4725 + ", " + this.field4727;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "853635809"
	)
	static int method8160(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			SoundCache.Interpreter_intStackSize -= 2;
			Client.field800 = (short)class155.method3248(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]);
			if (Client.field800 <= 0) {
				Client.field800 = 256;
			}

			Client.field685 = (short)class155.method3248(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]);
			if (Client.field685 <= 0) {
				Client.field685 = 256;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			SoundCache.Interpreter_intStackSize -= 2;
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
			if (Client.zoomWidth <= 0) {
				Client.zoomWidth = 320;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			SoundCache.Interpreter_intStackSize -= 4;
			Client.field804 = (short)Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
			if (Client.field804 <= 0) {
				Client.field804 = 1;
			}

			Client.field635 = (short)Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
			if (Client.field635 <= 0) {
				Client.field635 = 32767;
			} else if (Client.field635 < Client.field804) {
				Client.field635 = Client.field804;
			}

			Client.field806 = (short)Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2];
			if (Client.field806 <= 0) {
				Client.field806 = 1;
			}

			Client.field807 = (short)Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 3];
			if (Client.field807 <= 0) {
				Client.field807 = 32767;
			} else if (Client.field807 < Client.field806) {
				Client.field807 = Client.field806;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (Client.viewportWidget != null) {
				GrandExchangeOfferOwnWorldComparator.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false);
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.viewportWidth;
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1;
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.zoomHeight;
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Client.zoomWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class332.method6542(Client.field800);
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class332.method6542(Client.field685);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class113.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class177.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}
}
