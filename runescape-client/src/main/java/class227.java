import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("iy")
public class class227 {
	@ObfuscatedName("ae")
	String field2438;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1734312339
	)
	int field2439;
	@ObfuscatedName("am")
	ArrayList field2440;
	@ObfuscatedName("ax")
	ArrayList field2443;
	@ObfuscatedName("aq")
	ArrayList field2442;
	@ObfuscatedName("af")
	String field2437;
	@ObfuscatedName("at")
	float[] field2444;
	@ObfuscatedName("au")
	Map field2445;
	@ObfuscatedName("ar")
	Map field2446;

	class227() {
		this.field2439 = 0;
		this.field2440 = new ArrayList();
		this.field2443 = new ArrayList();
		this.field2442 = new ArrayList();
		this.field2437 = null;
		this.field2444 = new float[4];
		this.field2445 = new HashMap();
		this.field2446 = new HashMap();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1708007929"
	)
	String method4568() {
		return this.field2438;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-568209220"
	)
	int method4554() {
		return this.field2439;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "25"
	)
	void method4555() {
		this.field2437 = null;
		this.field2444[0] = 0.0F;
		this.field2444[1] = 0.0F;
		this.field2444[2] = 1.0F;
		this.field2444[3] = 1.0F;
		this.field2440.clear();
		this.field2443.clear();
		this.field2442.clear();
		this.field2445.clear();
		this.field2446.clear();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILen;I)Z",
		garbageValue = "-1584686347"
	)
	boolean method4556(JSONObject var1, int var2, UrlRequester var3) {
		JSONObject var4 = var1;
		if (var2 < 2) {
			try {
				var4 = var4.getJSONObject("message");
			} catch (Exception var13) {
				this.method4555();
				return false;
			}

			try {
				this.method4557(var4.getJSONArray("images"), var3);
			} catch (Exception var12) {
				this.field2443.clear();
			}

			try {
				this.method4552(var4.getJSONArray("labels"));
			} catch (Exception var11) {
				this.field2442.clear();
			}
		} else {
			try {
				this.method4558(var4.getJSONObject("image"), var3);
			} catch (Exception var10) {
				this.field2443.clear();
			}

			try {
				this.method4582(var4.getJSONObject("label"));
			} catch (Exception var9) {
				this.field2442.clear();
			}
		}

		try {
			this.method4561(var4.getJSONObject("behaviour"));
		} catch (Exception var8) {
			this.field2437 = null;
			this.field2444[0] = 0.0F;
			this.field2444[1] = 0.0F;
			this.field2444[2] = 1.0F;
			this.field2444[3] = 1.0F;
			this.field2440.clear();
		}

		try {
			JSONObject var5 = var4.optJSONObject("meta");
			if (var5 != null) {
				this.method4562(var4.getJSONObject("meta"));
			}
		} catch (Exception var7) {
			this.field2445.clear();
			this.field2446.clear();
		}

		if (var2 == 2) {
			try {
				this.field2438 = var4.getString("id");
				this.field2439 = Integer.parseInt(var4.getString("priority"));
			} catch (Exception var6) {
			}
		}

		return true;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Len;I)V",
		garbageValue = "2009493505"
	)
	void method4557(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) {
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				try {
					JSONObject var4 = var1.getJSONObject(var3);
					class217 var5 = new class217(this);
					var5.field2369 = var2.request(new URL(var4.getString("src")));
					var5.field2368 = WorldMapSectionType.method6140(var4, "placement");
					this.field2443.add(var5);
				} catch (MalformedURLException var6) {
				}
			}

		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Len;I)V",
		garbageValue = "1003725143"
	)
	void method4558(JSONObject var1, UrlRequester var2) throws JSONException {
		try {
			class217 var3 = new class217(this);
			var3.field2369 = var2.request(new URL(var1.getString("src")));
			var3.field2368 = WorldMapSectionType.method6140(var1, "placement");
			this.field2443.add(var3);
		} catch (MalformedURLException var4) {
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;I)V",
		garbageValue = "1580188755"
	)
	void method4552(JSONArray var1) throws JSONException {
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.length(); ++var2) {
				JSONObject var3 = var1.getJSONObject(var2);
				class228 var4 = new class228(this);
				var4.field2451 = var3.getString("text");
				var4.field2449 = JagexCache.method4475(var3.getString("align_x"));
				var4.field2450 = JagexCache.method4475(var3.getString("align_y"));
				var4.field2447 = var3.getInt("font");
				var4.field2448 = WorldMapSectionType.method6140(var3, "placement");
				this.field2442.add(var4);
			}

		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "30"
	)
	void method4582(JSONObject var1) throws JSONException {
		class228 var2 = new class228(this);
		var2.field2451 = var1.optString("text");
		String var5 = var1.optString("align_x");
		byte var4;
		if (var5.equals("centre")) {
			var4 = 1;
		} else if (!var5.equals("bottom") && !var5.equals("right")) {
			var4 = 0;
		} else {
			var4 = 2;
		}

		var2.field2449 = var4;
		var2.field2450 = JagexCache.method4475(var1.optString("align_y"));
		var2.field2447 = var1.optInt("font");
		var2.field2448 = WorldMapSectionType.method6140(var1, "placement");
		this.field2442.add(var2);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "0"
	)
	void method4561(JSONObject var1) throws JSONException {
		if (var1 != null) {
			this.field2444 = WorldMapSectionType.method6140(var1, "clickbounds");
			this.field2437 = var1.getString("endpoint");
			String[] var2 = JSONObject.getNames(var1);

			for (int var3 = 0; var3 < var1.length(); ++var3) {
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
					try {
						int var4 = var1.getInt(var2[var3]);
						this.field2440.add(new class215(this, var2[var3], var4));
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]);
							if (var5.equals("true")) {
								this.field2440.add(new class215(this, var2[var3], 1));
							} else if (var5.equals("false")) {
								this.field2440.add(new class215(this, var2[var3], 0));
							} else {
								this.field2440.add(new class224(this, var2[var3], var5));
							}
						} catch (Exception var7) {
						}
					}
				}
			}

		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "952411922"
	)
	void method4562(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1);

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			try {
				int var4 = var1.optInt(var2[var3]);
				this.field2445.put(var2[var3], var4);
			} catch (Exception var8) {
				try {
					String var5 = var1.optString(var2[var3]);
					if (var5.equals("true")) {
						this.field2445.put(var2[var3], 1);
					} else if (var5.equals("false")) {
						this.field2445.put(var2[var3], 0);
					} else {
						this.field2446.put(var2[var3], var5);
					}
				} catch (Exception var7) {
				}
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Liu;",
		garbageValue = "7"
	)
	static class229 method4553() {
		return class229.field2456;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lcr;Lcr;IZB)I",
		garbageValue = "12"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) {
			int var4 = var0.population;
			int var5 = var1.population;
			if (!var3) {
				if (var4 == -1) {
					var4 = 2001;
				}

				if (var5 == -1) {
					var5 = 2001;
				}
			}

			return var4 - var5;
		} else if (var2 == 2) {
			return var0.location - var1.location;
		} else if (var2 == 3) {
			if (var0.activity.equals("-")) {
				if (var1.activity.equals("-")) {
					return 0;
				} else {
					return var3 ? -1 : 1;
				}
			} else if (var1.activity.equals("-")) {
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity);
			}
		} else if (var2 == 4) {
			return var0.method1930() ? (var1.method1930() ? 0 : 1) : (var1.method1930() ? -1 : 0);
		} else if (var2 == 5) {
			return var0.method1933() ? (var1.method1933() ? 0 : 1) : (var1.method1933() ? -1 : 0);
		} else if (var2 == 6) {
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) {
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id;
		}
	}
}
