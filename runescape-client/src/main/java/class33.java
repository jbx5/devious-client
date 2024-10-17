import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("bp")
public class class33 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1937071875
	)
	int field150;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1882105617
	)
	int field152;

	class33(int var1, int var2) {
		this.field150 = var1;
		this.field152 = var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lbx;I)Z",
		garbageValue = "-1989448184"
	)
	boolean method488(class29 var1) {
		if (var1 == null) {
			return false;
		} else {
			switch(this.field150) {
			case 1:
				return var1.vmethod5644(this.field152);
			case 2:
				return var1.vmethod5668(this.field152);
			case 3:
				return var1.vmethod5646((char)this.field152);
			case 4:
				return var1.vmethod5681(this.field152 == 1);
			default:
				return false;
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;B)[F",
		garbageValue = "10"
	)
	static float[] method491(JSONObject var0, String var1) throws JSONException {
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
}
