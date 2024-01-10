import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ab")
@Implements("HttpResponse")
public class HttpResponse {
	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "[Lut;"
	)
	static IndexedSprite[] field104;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1098722027
	)
	@Export("responseCode")
	final int responseCode;
	@ObfuscatedName("ap")
	@Export("headerFields")
	final Map headerFields;
	@ObfuscatedName("af")
	@Export("responseBody")
	final String responseBody;

	HttpResponse(String var1) {
		this.responseCode = 400;
		this.headerFields = null;
		this.responseBody = "";
	}

	HttpResponse(HttpURLConnection var1) throws IOException {
		this.responseCode = var1.getResponseCode();
		var1.getResponseMessage();
		this.headerFields = var1.getHeaderFields();
		StringBuilder var2 = new StringBuilder();
		InputStream var3 = this.responseCode >= 300 ? var1.getErrorStream() : var1.getInputStream();
		if (var3 != null) {
			InputStreamReader var4 = new InputStreamReader(var3);
			BufferedReader var5 = new BufferedReader(var4);

			String var6;
			while ((var6 = var5.readLine()) != null) {
				var2.append(var6);
			}

			var3.close();
		}

		this.responseBody = var2.toString();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-788361864"
	)
	@Export("getResponseCode")
	public int getResponseCode() {
		return this.responseCode;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "133946093"
	)
	@Export("getHeaderFields")
	public Map getHeaderFields() {
		return this.headerFields;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-957913249"
	)
	@Export("getResponseBody")
	public String getResponseBody() {
		return this.responseBody;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IZIZB)V",
		garbageValue = "93"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (World.World_worlds != null) {
			class171.doWorldSorting(0, World.World_worlds.length - 1, var0, var1, var2, var3);
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1973400038"
	)
	static final int method312() {
		return ViewportMouse.ViewportMouse_x;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "-170541193"
	)
	static int method303(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			UserComparator6.Interpreter_intStackSize -= 2;
			Client.field772 = (short)class330.method6301(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize]);
			if (Client.field772 <= 0) {
				Client.field772 = 256;
			}

			Client.field773 = (short)class330.method6301(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]);
			if (Client.field773 <= 0) {
				Client.field773 = 256;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			UserComparator6.Interpreter_intStackSize -= 2;
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
			if (Client.zoomWidth <= 0) {
				Client.zoomWidth = 320;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			UserComparator6.Interpreter_intStackSize -= 4;
			Client.field776 = (short)Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
			if (Client.field776 <= 0) {
				Client.field776 = 1;
			}

			Client.field596 = (short)Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
			if (Client.field596 <= 0) {
				Client.field596 = 32767;
			} else if (Client.field596 < Client.field776) {
				Client.field596 = Client.field776;
			}

			Client.field778 = (short)Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2];
			if (Client.field778 <= 0) {
				Client.field778 = 1;
			}

			Client.field779 = (short)Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 3];
			if (Client.field779 <= 0) {
				Client.field779 = 32767;
			} else if (Client.field779 < Client.field778) {
				Client.field779 = Client.field778;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (Client.viewportWidget != null) {
				VarbitComposition.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false);
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.viewportWidth;
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.zoomHeight;
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Client.zoomWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = KeyHandler.method386(Client.field772);
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = KeyHandler.method386(Client.field773);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class524.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = GameEngine.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}
}
