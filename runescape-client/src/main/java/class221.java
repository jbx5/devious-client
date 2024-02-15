import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("it")
public class class221 {
	@ObfuscatedName("aw")
	String field2391;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -751552941
	)
	int field2383;
	@ObfuscatedName("ai")
	ArrayList field2384;
	@ObfuscatedName("ar")
	ArrayList field2385;
	@ObfuscatedName("as")
	ArrayList field2386;
	@ObfuscatedName("aa")
	String field2387;
	@ObfuscatedName("az")
	float[] field2382;
	@ObfuscatedName("ao")
	Map field2389;
	@ObfuscatedName("au")
	Map field2388;

	class221() {
		this.field2383 = 0;
		this.field2384 = new ArrayList();
		this.field2385 = new ArrayList();
		this.field2386 = new ArrayList();
		this.field2387 = null;
		this.field2382 = new float[4];
		this.field2389 = new HashMap();
		this.field2388 = new HashMap();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "78"
	)
	String method4315() {
		return this.field2391;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-93251573"
	)
	int method4336() {
		return this.field2383;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-158880452"
	)
	void method4300() {
		this.field2387 = null;
		this.field2382[0] = 0.0F;
		this.field2382[1] = 0.0F;
		this.field2382[2] = 1.0F;
		this.field2382[3] = 1.0F;
		this.field2384.clear();
		this.field2385.clear();
		this.field2386.clear();
		this.field2389.clear();
		this.field2388.clear();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILel;I)Z",
		garbageValue = "952427396"
	)
	boolean method4304(JSONObject var1, int var2, UrlRequester var3) {
		JSONObject var4 = var1;
		if (var2 < 2) {
			try {
				var4 = var4.getJSONObject("message");
			} catch (Exception var13) {
				this.method4300();
				return false;
			}

			try {
				this.method4339(var4.getJSONArray("images"), var3);
			} catch (Exception var12) {
				this.field2385.clear();
			}

			try {
				this.method4307(var4.getJSONArray("labels"));
			} catch (Exception var11) {
				this.field2386.clear();
			}
		} else {
			try {
				this.method4312(var4.getJSONObject("image"), var3);
			} catch (Exception var10) {
				this.field2385.clear();
			}

			try {
				this.method4308(var4.getJSONObject("label"));
			} catch (Exception var9) {
				this.field2386.clear();
			}
		}

		try {
			this.method4309(var4.getJSONObject("behaviour"));
		} catch (Exception var8) {
			this.field2387 = null;
			this.field2382[0] = 0.0F;
			this.field2382[1] = 0.0F;
			this.field2382[2] = 1.0F;
			this.field2382[3] = 1.0F;
			this.field2384.clear();
		}

		try {
			JSONObject var5 = var4.optJSONObject("meta");
			if (var5 != null) {
				this.method4310(var4.getJSONObject("meta"));
			}
		} catch (Exception var7) {
			this.field2389.clear();
			this.field2388.clear();
		}

		if (var2 == 2) {
			try {
				this.field2391 = var4.getString("id");
				this.field2383 = Integer.parseInt(var4.getString("priority"));
			} catch (Exception var6) {
			}
		}

		return true;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Lel;I)V",
		garbageValue = "-293909434"
	)
	void method4339(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) {
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				try {
					JSONObject var4 = var1.getJSONObject(var3);
					class211 var5 = new class211(this);
					var5.field2311 = var2.request(new URL(var4.getString("src")));
					var5.field2309 = class136.method3139(var4, "placement");
					this.field2385.add(var5);
				} catch (MalformedURLException var6) {
				}
			}

		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Lel;B)V",
		garbageValue = "62"
	)
	void method4312(JSONObject var1, UrlRequester var2) throws JSONException {
		try {
			class211 var3 = new class211(this);
			var3.field2311 = var2.request(new URL(var1.getString("src")));
			var3.field2309 = class136.method3139(var1, "placement");
			this.field2385.add(var3);
		} catch (MalformedURLException var4) {
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;I)V",
		garbageValue = "-2032707420"
	)
	void method4307(JSONArray var1) throws JSONException {
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.length(); ++var2) {
				JSONObject var3 = var1.getJSONObject(var2);
				class222 var4 = new class222(this);
				var4.field2394 = var3.getString("text");
				var4.field2395 = class226.method4395(var3.getString("align_x"));
				var4.field2396 = class226.method4395(var3.getString("align_y"));
				var4.field2397 = var3.getInt("font");
				var4.field2399 = class136.method3139(var3, "placement");
				this.field2386.add(var4);
			}

		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "-105"
	)
	void method4308(JSONObject var1) throws JSONException {
		class222 var2 = new class222(this);
		var2.field2394 = var1.optString("text");
		var2.field2395 = class226.method4395(var1.optString("align_x"));
		var2.field2396 = class226.method4395(var1.optString("align_y"));
		var2.field2397 = var1.optInt("font");
		var2.field2399 = class136.method3139(var1, "placement");
		this.field2386.add(var2);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "1473148449"
	)
	void method4309(JSONObject var1) throws JSONException {
		if (var1 != null) {
			this.field2382 = class136.method3139(var1, "clickbounds");
			this.field2387 = var1.getString("endpoint");
			String[] var2 = JSONObject.getNames(var1);

			for (int var3 = 0; var3 < var1.length(); ++var3) {
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
					try {
						int var4 = var1.getInt(var2[var3]);
						this.field2384.add(new class209(this, var2[var3], var4));
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]);
							if (var5.equals("true")) {
								this.field2384.add(new class209(this, var2[var3], 1));
							} else if (var5.equals("false")) {
								this.field2384.add(new class209(this, var2[var3], 0));
							} else {
								this.field2384.add(new class218(this, var2[var3], var5));
							}
						} catch (Exception var7) {
						}
					}
				}
			}

		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "2100109315"
	)
	void method4310(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1);

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			try {
				int var4 = var1.optInt(var2[var3]);
				this.field2389.put(var2[var3], var4);
			} catch (Exception var8) {
				try {
					String var5 = var1.optString(var2[var3]);
					if (var5.equals("true")) {
						this.field2389.put(var2[var3], 1);
					} else if (var5.equals("false")) {
						this.field2389.put(var2[var3], 0);
					} else {
						this.field2388.put(var2[var3], var5);
					}
				} catch (Exception var7) {
				}
			}
		}

	}
}
