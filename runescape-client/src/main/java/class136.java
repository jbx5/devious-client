import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fh")
public class class136 implements Callable {
	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "[Lvv;"
	)
	@Export("mapDotSprites")
	static SpritePixels[] mapDotSprites;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class137 field1587;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	final class138 field1591;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class139 field1589;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1200861523
	)
	final int field1590;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	final class145 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfr;Lfv;Lfl;Lfn;I)V"
	)
	class136(class145 var1, class137 var2, class138 var3, class139 var4, int var5) {
		this.this$0 = var1;
		this.field1587 = var2;
		this.field1591 = var3;
		this.field1589 = var4;
		this.field1590 = var5;
	}

	public Object call() {
		this.field1587.method3444();
		class137[][] var1;
		if (this.field1591 == class138.field1616) {
			var1 = this.this$0.field1661;
		} else {
			var1 = this.this$0.field1660;
		}

		var1[this.field1590][this.field1589.method3485()] = this.field1587;
		return null;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZB)I",
		garbageValue = "-66"
	)
	static int method3441(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			class96.Interpreter_intStackSize -= 2;
			Client.field587 = (short)class53.method1103(Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize]);
			if (Client.field587 <= 0) {
				Client.field587 = 256;
			}

			Client.field579 = (short)class53.method1103(Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1]);
			if (Client.field579 <= 0) {
				Client.field579 = 256;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			class96.Interpreter_intStackSize -= 2;
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
			if (Client.zoomWidth <= 0) {
				Client.zoomWidth = 320;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			class96.Interpreter_intStackSize -= 4;
			Client.field774 = (short)Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
			if (Client.field774 <= 0) {
				Client.field774 = 1;
			}

			Client.field762 = (short)Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
			if (Client.field762 <= 0) {
				Client.field762 = 32767;
			} else if (Client.field762 < Client.field774) {
				Client.field762 = Client.field774;
			}

			Client.field776 = (short)Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 2];
			if (Client.field776 <= 0) {
				Client.field776 = 1;
			}

			Client.field777 = (short)Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 3];
			if (Client.field777 <= 0) {
				Client.field777 = 32767;
			} else if (Client.field777 < Client.field776) {
				Client.field777 = Client.field776;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (Client.viewportWidget != null) {
				UserComparator7.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false);
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Client.viewportWidth;
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Client.viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = -1;
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Client.zoomHeight;
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Client.zoomWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = class402.method7822(Client.field587);
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = class402.method7822(Client.field579);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = HttpRequestTask.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = class268.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "74"
	)
	static void method3436(int var0, int var1, int var2, int var3, int var4) {
		NodeDeque var5 = class344.worldView.groundItems[var0][var1][var2];
		if (var5 != null) {
			for (TileItem var6 = (TileItem)var5.last(); var6 != null; var6 = (TileItem)var5.previous()) {
				if ((var3 & 32767) == var6.id && var4 == var6.quantity) {
					var6.remove();
					break;
				}
			}

			if (var5.last() == null) {
				class344.worldView.groundItems[var0][var1][var2] = null;
			}

			class397.updateItemPile(var0, var1, var2);
		}

	}
}
