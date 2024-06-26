import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("mn")
public class class324 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "([BZB)Ljava/lang/Object;",
		garbageValue = "94"
	)
	public static Object method6114(byte[] var0, boolean var1) {
		if (var0 == null) {
			return null;
		} else if (var0.length > 136) {
			DirectByteArrayCopier var2 = new DirectByteArrayCopier();
			var2.set(var0);
			return var2;
		} else {
			return var0;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-41"
	)
	public static boolean method6117(int var0) {
		return var0 >= WorldMapDecorationType.field4029.id && var0 <= WorldMapDecorationType.field4030.id;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;B)[F",
		garbageValue = "-125"
	)
	static float[] method6116(JSONObject var0, String var1) throws JSONException {
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

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lnx;B)I",
		garbageValue = "-1"
	)
	static int method6115(Widget var0) {
		if (var0.type != 11) {
			--class337.Interpreter_stringStackSize;
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--class337.Interpreter_stringStackSize];
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var0.method6879(var1);
			return 1;
		}
	}
}
