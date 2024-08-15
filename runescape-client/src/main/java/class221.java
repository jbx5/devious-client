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

@ObfuscatedName("ii")
public class class221 {
	@ObfuscatedName("ay")
	String field2406;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 2124123947
	)
	int field2401;
	@ObfuscatedName("au")
	ArrayList field2403;
	@ObfuscatedName("ax")
	ArrayList field2399;
	@ObfuscatedName("ao")
	ArrayList field2404;
	@ObfuscatedName("am")
	String field2405;
	@ObfuscatedName("ac")
	float[] field2400;
	@ObfuscatedName("ae")
	Map field2407;
	@ObfuscatedName("ad")
	Map field2408;

	class221() {
		this.field2401 = 0;
		this.field2403 = new ArrayList();
		this.field2399 = new ArrayList();
		this.field2404 = new ArrayList();
		this.field2405 = null;
		this.field2400 = new float[4];
		this.field2407 = new HashMap();
		this.field2408 = new HashMap();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1816290754"
	)
	String method4660() {
		return this.field2406;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1766663554"
	)
	int method4668() {
		return this.field2401;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1001544300"
	)
	void method4662() {
		this.field2405 = null;
		this.field2400[0] = 0.0F;
		this.field2400[1] = 0.0F;
		this.field2400[2] = 1.0F;
		this.field2400[3] = 1.0F;
		this.field2403.clear();
		this.field2399.clear();
		this.field2404.clear();
		this.field2407.clear();
		this.field2408.clear();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILex;I)Z",
		garbageValue = "1255668392"
	)
	boolean method4680(JSONObject var1, int var2, UrlRequester var3) {
		JSONObject var4 = var1;
		if (var2 < 2) {
			try {
				var4 = var4.getJSONObject("message");
			} catch (Exception var13) {
				this.method4662();
				return false;
			}

			try {
				this.method4664(var4.getJSONArray("images"), var3);
			} catch (Exception var12) {
				this.field2399.clear();
			}

			try {
				this.method4666(var4.getJSONArray("labels"));
			} catch (Exception var11) {
				this.field2404.clear();
			}
		} else {
			try {
				this.method4665(var4.getJSONObject("image"), var3);
			} catch (Exception var10) {
				this.field2399.clear();
			}

			try {
				this.method4678(var4.getJSONObject("label"));
			} catch (Exception var9) {
				this.field2404.clear();
			}
		}

		try {
			this.method4667(var4.getJSONObject("behaviour"));
		} catch (Exception var8) {
			this.field2405 = null;
			this.field2400[0] = 0.0F;
			this.field2400[1] = 0.0F;
			this.field2400[2] = 1.0F;
			this.field2400[3] = 1.0F;
			this.field2403.clear();
		}

		try {
			JSONObject var5 = var4.optJSONObject("meta");
			if (var5 != null) {
				this.method4669(var4.getJSONObject("meta"));
			}
		} catch (Exception var7) {
			this.field2407.clear();
			this.field2408.clear();
		}

		if (var2 == 2) {
			try {
				this.field2406 = var4.getString("id");
				this.field2401 = Integer.parseInt(var4.getString("priority"));
			} catch (Exception var6) {
			}
		}

		return true;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Lex;I)V",
		garbageValue = "1823714802"
	)
	void method4664(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) {
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				try {
					JSONObject var4 = var1.getJSONObject(var3);
					class211 var5 = new class211(this);
					var5.field2339 = var2.request(new URL(var4.getString("src")));
					var5.field2334 = Canvas.method300(var4, "placement");
					this.field2399.add(var5);
				} catch (MalformedURLException var6) {
				}
			}

		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Lex;B)V",
		garbageValue = "-52"
	)
	void method4665(JSONObject var1, UrlRequester var2) throws JSONException {
		try {
			class211 var3 = new class211(this);
			var3.field2339 = var2.request(new URL(var1.getString("src")));
			var3.field2334 = Canvas.method300(var1, "placement");
			this.field2399.add(var3);
		} catch (MalformedURLException var4) {
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;B)V",
		garbageValue = "-55"
	)
	void method4666(JSONArray var1) throws JSONException {
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.length(); ++var2) {
				JSONObject var3 = var1.getJSONObject(var2);
				class222 var4 = new class222(this);
				var4.field2415 = var3.getString("text");
				var4.field2410 = class195.method4210(var3.getString("align_x"));
				var4.field2416 = class195.method4210(var3.getString("align_y"));
				var4.field2409 = var3.getInt("font");
				var4.field2413 = Canvas.method300(var3, "placement");
				this.field2404.add(var4);
			}

		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "-888800674"
	)
	void method4678(JSONObject var1) throws JSONException {
		class222 var2 = new class222(this);
		var2.field2415 = var1.optString("text");
		var2.field2410 = class195.method4210(var1.optString("align_x"));
		var2.field2416 = class195.method4210(var1.optString("align_y"));
		var2.field2409 = var1.optInt("font");
		var2.field2413 = Canvas.method300(var1, "placement");
		this.field2404.add(var2);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "1749563338"
	)
	void method4667(JSONObject var1) throws JSONException {
		if (var1 != null) {
			this.field2400 = Canvas.method300(var1, "clickbounds");
			this.field2405 = var1.getString("endpoint");
			String[] var2 = JSONObject.getNames(var1);

			for (int var3 = 0; var3 < var1.length(); ++var3) {
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
					try {
						int var4 = var1.getInt(var2[var3]);
						this.field2403.add(new class209(this, var2[var3], var4));
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]);
							if (var5.equals("true")) {
								this.field2403.add(new class209(this, var2[var3], 1));
							} else if (var5.equals("false")) {
								this.field2403.add(new class209(this, var2[var3], 0));
							} else {
								this.field2403.add(new class218(this, var2[var3], var5));
							}
						} catch (Exception var7) {
						}
					}
				}
			}

		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "-856058747"
	)
	void method4669(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1);

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			try {
				int var4 = var1.optInt(var2[var3]);
				this.field2407.put(var2[var3], var4);
			} catch (Exception var8) {
				try {
					String var5 = var1.optString(var2[var3]);
					if (var5.equals("true")) {
						this.field2407.put(var2[var3], 1);
					} else if (var5.equals("false")) {
						this.field2407.put(var2[var3], 0);
					} else {
						this.field2408.put(var2[var3], var5);
					}
				} catch (Exception var7) {
				}
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-118859584"
	)
	public static void method4700() {
		class242.field2026.clear();
	}
}
