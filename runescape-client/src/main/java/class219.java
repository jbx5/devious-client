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

@ObfuscatedName("ih")
public class class219 {
	@ObfuscatedName("ap")
	String field2351;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1939781771
	)
	int field2352;
	@ObfuscatedName("aj")
	ArrayList field2353;
	@ObfuscatedName("aq")
	ArrayList field2354;
	@ObfuscatedName("ar")
	ArrayList field2357;
	@ObfuscatedName("ag")
	String field2356;
	@ObfuscatedName("ao")
	float[] field2358;
	@ObfuscatedName("ae")
	Map field2355;
	@ObfuscatedName("aa")
	Map field2359;

	class219() {
		this.field2352 = 0;
		this.field2353 = new ArrayList();
		this.field2354 = new ArrayList();
		this.field2357 = new ArrayList();
		this.field2356 = null;
		this.field2358 = new float[4];
		this.field2355 = new HashMap();
		this.field2359 = new HashMap();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1590672843"
	)
	String method4316() {
		return this.field2351;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "52"
	)
	int method4317() {
		return this.field2352;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method4346() {
		this.field2356 = null;
		this.field2358[0] = 0.0F;
		this.field2358[1] = 0.0F;
		this.field2358[2] = 1.0F;
		this.field2358[3] = 1.0F;
		this.field2353.clear();
		this.field2354.clear();
		this.field2357.clear();
		this.field2355.clear();
		this.field2359.clear();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILeg;I)Z",
		garbageValue = "981839546"
	)
	boolean method4319(JSONObject var1, int var2, UrlRequester var3) {
		JSONObject var4 = var1;
		if (var2 < 2) {
			try {
				var4 = var4.getJSONObject("message");
			} catch (Exception var13) {
				this.method4346();
				return false;
			}

			try {
				this.method4320(var4.getJSONArray("images"), var3);
			} catch (Exception var12) {
				this.field2354.clear();
			}

			try {
				this.method4322(var4.getJSONArray("labels"));
			} catch (Exception var11) {
				this.field2357.clear();
			}
		} else {
			try {
				this.method4344(var4.getJSONObject("image"), var3);
			} catch (Exception var10) {
				this.field2354.clear();
			}

			try {
				this.method4323(var4.getJSONObject("label"));
			} catch (Exception var9) {
				this.field2357.clear();
			}
		}

		try {
			this.method4330(var4.getJSONObject("behaviour"));
		} catch (Exception var8) {
			this.field2356 = null;
			this.field2358[0] = 0.0F;
			this.field2358[1] = 0.0F;
			this.field2358[2] = 1.0F;
			this.field2358[3] = 1.0F;
			this.field2353.clear();
		}

		try {
			JSONObject var5 = var4.optJSONObject("meta");
			if (var5 != null) {
				this.method4325(var4.getJSONObject("meta"));
			}
		} catch (Exception var7) {
			this.field2355.clear();
			this.field2359.clear();
		}

		if (var2 == 2) {
			try {
				this.field2351 = var4.getString("id");
				this.field2352 = Integer.parseInt(var4.getString("priority"));
			} catch (Exception var6) {
			}
		}

		return true;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Leg;I)V",
		garbageValue = "-1392468030"
	)
	void method4320(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) {
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				try {
					JSONObject var4 = var1.getJSONObject(var3);
					class209 var5 = new class209(this);
					var5.field2284 = var2.request(new URL(var4.getString("src")));
					var5.field2282 = SceneTilePaint.method5787(var4, "placement");
					this.field2354.add(var5);
				} catch (MalformedURLException var6) {
				}
			}

		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Leg;I)V",
		garbageValue = "-2104654392"
	)
	void method4344(JSONObject var1, UrlRequester var2) throws JSONException {
		try {
			class209 var3 = new class209(this);
			var3.field2284 = var2.request(new URL(var1.getString("src")));
			var3.field2282 = SceneTilePaint.method5787(var1, "placement");
			this.field2354.add(var3);
		} catch (MalformedURLException var4) {
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;I)V",
		garbageValue = "-748641331"
	)
	void method4322(JSONArray var1) throws JSONException {
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.length(); ++var2) {
				JSONObject var3 = var1.getJSONObject(var2);
				class220 var4 = new class220(this);
				var4.field2363 = var3.getString("text");
				String var7 = var3.getString("align_x");
				byte var6;
				if (var7.equals("centre")) {
					var6 = 1;
				} else if (!var7.equals("bottom") && !var7.equals("right")) {
					var6 = 0;
				} else {
					var6 = 2;
				}

				var4.field2369 = var6;
				String var10 = var3.getString("align_y");
				byte var9;
				if (var10.equals("centre")) {
					var9 = 1;
				} else if (!var10.equals("bottom") && !var10.equals("right")) {
					var9 = 0;
				} else {
					var9 = 2;
				}

				var4.field2366 = var9;
				var4.field2368 = var3.getInt("font");
				var4.field2364 = SceneTilePaint.method5787(var3, "placement");
				this.field2357.add(var4);
			}

		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "-1049491835"
	)
	void method4323(JSONObject var1) throws JSONException {
		class220 var2 = new class220(this);
		var2.field2363 = var1.optString("text");
		String var5 = var1.optString("align_x");
		byte var4;
		if (var5.equals("centre")) {
			var4 = 1;
		} else if (!var5.equals("bottom") && !var5.equals("right")) {
			var4 = 0;
		} else {
			var4 = 2;
		}

		var2.field2369 = var4;
		String var8 = var1.optString("align_y");
		byte var7;
		if (var8.equals("centre")) {
			var7 = 1;
		} else if (!var8.equals("bottom") && !var8.equals("right")) {
			var7 = 0;
		} else {
			var7 = 2;
		}

		var2.field2366 = var7;
		var2.field2368 = var1.optInt("font");
		var2.field2364 = SceneTilePaint.method5787(var1, "placement");
		this.field2357.add(var2);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "307857906"
	)
	void method4330(JSONObject var1) throws JSONException {
		if (var1 != null) {
			this.field2358 = SceneTilePaint.method5787(var1, "clickbounds");
			this.field2356 = var1.getString("endpoint");
			String[] var2 = JSONObject.getNames(var1);

			for (int var3 = 0; var3 < var1.length(); ++var3) {
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
					try {
						int var4 = var1.getInt(var2[var3]);
						this.field2353.add(new class207(this, var2[var3], var4));
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]);
							if (var5.equals("true")) {
								this.field2353.add(new class207(this, var2[var3], 1));
							} else if (var5.equals("false")) {
								this.field2353.add(new class207(this, var2[var3], 0));
							} else {
								this.field2353.add(new class216(this, var2[var3], var5));
							}
						} catch (Exception var7) {
						}
					}
				}
			}

		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "84238420"
	)
	void method4325(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1);

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			try {
				int var4 = var1.optInt(var2[var3]);
				this.field2355.put(var2[var3], var4);
			} catch (Exception var8) {
				try {
					String var5 = var1.optString(var2[var3]);
					if (var5.equals("true")) {
						this.field2355.put(var2[var3], 1);
					} else if (var5.equals("false")) {
						this.field2355.put(var2[var3], 0);
					} else {
						this.field2359.put(var2[var3], var5);
					}
				} catch (Exception var7) {
				}
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "([I[IIII)V",
		garbageValue = "-1304224005"
	)
	public static void method4339(int[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			int var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;
			int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;

			for (int var9 = var2; var9 < var3; ++var9) {
				if (var0[var9] < (var9 & var8) + var6) {
					int var10 = var0[var9];
					var0[var9] = var0[var5];
					var0[var5] = var10;
					int var11 = var1[var9];
					var1[var9] = var1[var5];
					var1[var5++] = var11;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method4339(var0, var1, var2, var5 - 1);
			method4339(var0, var1, var5 + 1, var3);
		}

	}
}
