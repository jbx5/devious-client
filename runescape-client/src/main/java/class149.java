import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import org.json.JSONException;
import org.json.JSONArray;
import org.json.JSONObject;
import net.runelite.mapping.Export;
@ObfuscatedName("ey")
public class class149 {
	@ObfuscatedName("nu")
	@ObfuscatedGetter(intValue = -1532835829)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1391954033")
	public static void method3062() {
		HitSplatDefinition.HitSplatDefinition_cached.clear();
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear();
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear();
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;I)[F", garbageValue = "1087479406")
	static float[] method3061(JSONObject var0, String var1) throws JSONException {
		float[] var2 = new float[4];
		try {
			JSONArray var3 = var0.getJSONArray(var1);
			var2[0] = ((float) (var3.optDouble(0, 0.0)));
			var2[1] = ((float) (var3.optDouble(1, 0.0)));
			var2[2] = ((float) (var3.optDouble(2, 1.0)));
			var2[3] = ((float) (var3.optDouble(3, 1.0)));
		} catch (JSONException var4) {
			var2[0] = 0.0F;
			var2[1] = 0.0F;
			var2[2] = 1.0F;
			var2[3] = 1.0F;
		}
		return var2;
	}
}