import java.net.HttpURLConnection;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("b")
public class class21 {
	@ObfuscatedName("sr")
	@ObfuscatedSignature(descriptor = "Lam;")
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "Liy;")
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;

	@ObfuscatedName("fa")
	static String field122;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -1937379027)
	final int field117;

	@ObfuscatedName("v")
	final String field116;

	class21(String var1) {
		this.field117 = 400;
		this.field116 = "";
	}

	class21(HttpURLConnection var1) throws IOException {
		this.field117 = var1.getResponseCode();
		var1.getResponseMessage();
		var1.getHeaderFields();
		StringBuilder var2 = new StringBuilder();
		InputStream var3 = (this.field117 >= 300) ? var1.getErrorStream() : var1.getInputStream();
		if (var3 != null) {
			InputStreamReader var4 = new InputStreamReader(var3);
			BufferedReader var5 = new BufferedReader(var4);
			String var6;
			while ((var6 = var5.readLine()) != null) {
				var2.append(var6);
			} 
			var3.close();
		}
		this.field116 = var2.toString();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "115")
	public int method258() {
		return this.field117;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "-1470500279")
	public String method262() {
		return this.field116;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(IIII)I", garbageValue = "2085250923")
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}
		if (var2 > 192) {
			var1 /= 2;
		}
		if (var2 > 217) {
			var1 /= 2;
		}
		if (var2 > 243) {
			var1 /= 2;
		}
		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(descriptor = "(ILbi;ZI)I", garbageValue = "1464198346")
	static int method264(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) {
			Client.logoutTimer = 250;
			return 1;
		} else if (var0 != 5631 && var0 != 5633) {
			if (var0 == 5632) {
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 26;
				return 1;
			} else {
				return 2;
			}
		} else {
			Interpreter.Interpreter_stringStackSize -= 2;
			return 1;
		}
	}
}