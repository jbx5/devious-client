import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("fq")
public class class136 implements class126 {
	@ObfuscatedName("am")
	static String[] field1621;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "37"
	)
	public static void method3140() {
		FileSystem.FileSystem_cacheFiles.clear();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfj;",
		garbageValue = "-1038412911"
	)
	static class134[] method3142() {
		return new class134[]{class134.field1595, class134.field1607, class134.field1596, class134.field1613, class134.field1598, class134.field1599, class134.field1600, class134.field1601, class134.field1602, class134.field1603, class134.field1608, class134.field1605, class134.field1606, class134.field1594, class134.field1609, class134.field1604, class134.field1610};
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;I)[F",
		garbageValue = "578085812"
	)
	static float[] method3139(JSONObject var0, String var1) throws JSONException {
		float[] var2 = new float[4];

		try {
			JSONArray var3 = var0.getJSONArray(var1);
			var2[0] = (float)var3.optDouble(0, 0.0D);
			var2[1] = (float)var3.optDouble(1, 0.0D);
			var2[2] = (float)var3.optDouble(2, 1.0D);
			var2[3] = (float)var3.optDouble(3, 1.0D);
		} catch (JSONException var4) {
			var2[0] = 0.0F;
			var2[1] = 0.0F;
			var2[2] = 1.0F;
			var2[3] = 1.0F;
		}

		return var2;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-611768600"
	)
	static int method3143(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : class141.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) {
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETID) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.childIndex;
			return 1;
		} else if (var0 == 1707) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method6895() ? 1 : 0;
			return 1;
		} else if (var0 == 1708) {
			return HttpRequestTask.method258(var3);
		} else {
			return var0 == 1709 ? class371.method7024(var3) : 2;
		}
	}

	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIB)V",
		garbageValue = "0"
	)
	static void method3141(ArrayList var0, int var1, int var2, int var3, int var4) {
		if (!var0.isEmpty()) {
			int var5 = (Integer)var0.get(0);
			if (var5 == -1 && !Client.playingJingle) {
				class169.method3521(0, 0);
			} else if (var5 != -1 && !WorldMapRenderer.method4894(var5) && class30.clientPreferences.getMusicVolume() != 0) {
				ArrayList var6 = new ArrayList();

				for (int var7 = 0; var7 < var0.size(); ++var7) {
					var6.add(new MusicSong(Renderable.archive6, (Integer)var0.get(var7), 0, class30.clientPreferences.getMusicVolume(), false));
				}

				if (Client.playingJingle) {
					class133.method3120(var6, var1, var2, var3, var4);
				} else {
					PacketWriter.method2891(var6, var1, var2, var3, var4, false);
				}
			}

		}
	}
}
