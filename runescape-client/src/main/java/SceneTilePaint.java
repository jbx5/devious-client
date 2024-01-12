import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("kh")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1107319853
	)
	@Export("swColor")
	int swColor;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1339424929
	)
	@Export("seColor")
	int seColor;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -418227247
	)
	@Export("neColor")
	int neColor;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1160273677
	)
	@Export("nwColor")
	int nwColor;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -78371499
	)
	@Export("texture")
	int texture;
	@ObfuscatedName("ar")
	@Export("isFlat")
	boolean isFlat;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1192930527
	)
	@Export("rgb")
	int rgb;

	SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.isFlat = true;
		this.swColor = var1;
		this.seColor = var2;
		this.neColor = var3;
		this.nwColor = var4;
		this.texture = var5;
		this.rgb = var6;
		this.isFlat = var7;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)[Loc;",
		garbageValue = "1713026222"
	)
	public static class367[] method5788() {
		return new class367[]{class367.field4286, class367.field4288, class367.field4287, class367.field4289};
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;B)[F",
		garbageValue = "-53"
	)
	static float[] method5787(JSONObject var0, String var1) throws JSONException {
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

	@ObfuscatedName("pz")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "191"
	)
	static void method5786() {
		if (Varps.field3599 != null) {
			Client.field758 = Client.cycle;
			Varps.field3599.method7264();

			for (int var0 = 0; var0 < Client.players.length; ++var0) {
				if (Client.players[var0] != null) {
					Varps.field3599.method7252(HealthBarDefinition.baseX * 64 + (Client.players[var0].x >> 7), WorldMapScaleHandler.baseY * 64 + (Client.players[var0].y >> 7));
				}
			}
		}

	}
}
