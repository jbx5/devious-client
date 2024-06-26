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

@ObfuscatedName("if")
public class class224 {
	@ObfuscatedName("ad")
	String field2404;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1097199299
	)
	int field2405;
	@ObfuscatedName("ak")
	ArrayList field2409;
	@ObfuscatedName("ap")
	ArrayList field2407;
	@ObfuscatedName("an")
	ArrayList field2406;
	@ObfuscatedName("aj")
	String field2403;
	@ObfuscatedName("av")
	float[] field2410;
	@ObfuscatedName("ab")
	Map field2412;
	@ObfuscatedName("ai")
	Map field2408;

	class224() {
		this.field2405 = 0;
		this.field2409 = new ArrayList();
		this.field2407 = new ArrayList();
		this.field2406 = new ArrayList();
		this.field2403 = null;
		this.field2410 = new float[4];
		this.field2412 = new HashMap();
		this.field2408 = new HashMap();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-942660188"
	)
	String method4282() {
		return this.field2404;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1665855192"
	)
	int method4289() {
		return this.field2405;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "104"
	)
	void method4285() {
		this.field2403 = null;
		this.field2410[0] = 0.0F;
		this.field2410[1] = 0.0F;
		this.field2410[2] = 1.0F;
		this.field2410[3] = 1.0F;
		this.field2409.clear();
		this.field2407.clear();
		this.field2406.clear();
		this.field2412.clear();
		this.field2408.clear();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILea;I)Z",
		garbageValue = "18197983"
	)
	boolean method4277(JSONObject var1, int var2, UrlRequester var3) {
		JSONObject var4 = var1;
		if (var2 < 2) {
			try {
				var4 = var4.getJSONObject("message");
			} catch (Exception var13) {
				this.method4285();
				return false;
			}

			try {
				this.method4278(var4.getJSONArray("images"), var3);
			} catch (Exception var12) {
				this.field2407.clear();
			}

			try {
				this.method4280(var4.getJSONArray("labels"));
			} catch (Exception var11) {
				this.field2406.clear();
			}
		} else {
			try {
				this.method4279(var4.getJSONObject("image"), var3);
			} catch (Exception var10) {
				this.field2407.clear();
			}

			try {
				this.method4281(var4.getJSONObject("label"));
			} catch (Exception var9) {
				this.field2406.clear();
			}
		}

		try {
			this.method4300(var4.getJSONObject("behaviour"));
		} catch (Exception var8) {
			this.field2403 = null;
			this.field2410[0] = 0.0F;
			this.field2410[1] = 0.0F;
			this.field2410[2] = 1.0F;
			this.field2410[3] = 1.0F;
			this.field2409.clear();
		}

		try {
			JSONObject var5 = var4.optJSONObject("meta");
			if (var5 != null) {
				this.method4283(var4.getJSONObject("meta"));
			}
		} catch (Exception var7) {
			this.field2412.clear();
			this.field2408.clear();
		}

		if (var2 == 2) {
			try {
				this.field2404 = var4.getString("id");
				this.field2405 = Integer.parseInt(var4.getString("priority"));
			} catch (Exception var6) {
			}
		}

		return true;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Lea;I)V",
		garbageValue = "803825893"
	)
	void method4278(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) {
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				try {
					JSONObject var4 = var1.getJSONObject(var3);
					class214 var5 = new class214(this);
					var5.field2340 = var2.request(new URL(var4.getString("src")));
					var5.field2338 = class324.method6116(var4, "placement");
					this.field2407.add(var5);
				} catch (MalformedURLException var6) {
				}
			}

		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Lea;I)V",
		garbageValue = "1619081491"
	)
	void method4279(JSONObject var1, UrlRequester var2) throws JSONException {
		try {
			class214 var3 = new class214(this);
			var3.field2340 = var2.request(new URL(var1.getString("src")));
			var3.field2338 = class324.method6116(var1, "placement");
			this.field2407.add(var3);
		} catch (MalformedURLException var4) {
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;I)V",
		garbageValue = "731614484"
	)
	void method4280(JSONArray var1) throws JSONException {
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.length(); ++var2) {
				JSONObject var3 = var1.getJSONObject(var2);
				class225 var4 = new class225(this);
				var4.field2417 = var3.getString("text");
				var4.field2418 = class221.method4240(var3.getString("align_x"));
				var4.field2420 = class221.method4240(var3.getString("align_y"));
				var4.field2421 = var3.getInt("font");
				var4.field2415 = class324.method6116(var3, "placement");
				this.field2406.add(var4);
			}

		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "36137201"
	)
	void method4281(JSONObject var1) throws JSONException {
		class225 var2 = new class225(this);
		var2.field2417 = var1.optString("text");
		var2.field2418 = class221.method4240(var1.optString("align_x"));
		var2.field2420 = class221.method4240(var1.optString("align_y"));
		var2.field2421 = var1.optInt("font");
		var2.field2415 = class324.method6116(var1, "placement");
		this.field2406.add(var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "-1778264859"
	)
	void method4300(JSONObject var1) throws JSONException {
		if (var1 != null) {
			this.field2410 = class324.method6116(var1, "clickbounds");
			this.field2403 = var1.getString("endpoint");
			String[] var2 = JSONObject.getNames(var1);

			for (int var3 = 0; var3 < var1.length(); ++var3) {
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
					try {
						int var4 = var1.getInt(var2[var3]);
						this.field2409.add(new class212(this, var2[var3], var4));
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]);
							if (var5.equals("true")) {
								this.field2409.add(new class212(this, var2[var3], 1));
							} else if (var5.equals("false")) {
								this.field2409.add(new class212(this, var2[var3], 0));
							} else {
								this.field2409.add(new class221(this, var2[var3], var5));
							}
						} catch (Exception var7) {
						}
					}
				}
			}

		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "-1661873825"
	)
	void method4283(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1);

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			try {
				int var4 = var1.optInt(var2[var3]);
				this.field2412.put(var2[var3], var4);
			} catch (Exception var8) {
				try {
					String var5 = var1.optString(var2[var3]);
					if (var5.equals("true")) {
						this.field2412.put(var2[var3], 1);
					} else if (var5.equals("false")) {
						this.field2412.put(var2[var3], 0);
					} else {
						this.field2408.put(var2[var3], var5);
					}
				} catch (Exception var7) {
				}
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1137574238"
	)
	static void method4301() {
		Tiles.Tiles_minPlane = 99;
		Tiles.Tiles_underlays = new short[4][104][104];
		Tiles.Tiles_overlays = new short[4][104][104];
		Tiles.Tiles_shapes = new byte[4][104][104];
		class356.field3810 = new byte[4][104][104];
		KeyHandler.field110 = new int[4][105][105];
		WorldMapScaleHandler.Tiles_underlays2 = new byte[4][105][105];
		Tiles.field1039 = new int[105][105];
		Tiles.Tiles_hue = new int[104];
		Tiles.Tiles_saturation = new int[104];
		Canvas.Tiles_lightness = new int[104];
		Tiles.Tiles_hueMultiplier = new int[104];
		class534.field5292 = new int[104];
	}
}
