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

@ObfuscatedName("ik")
public class class227 {
	@ObfuscatedName("aw")
	String field2438;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 317672541
	)
	int field2437;
	@ObfuscatedName("aj")
	ArrayList field2436;
	@ObfuscatedName("ai")
	ArrayList field2439;
	@ObfuscatedName("ay")
	ArrayList field2440;
	@ObfuscatedName("as")
	String field2441;
	@ObfuscatedName("ae")
	float[] field2443;
	@ObfuscatedName("am")
	Map field2442;
	@ObfuscatedName("at")
	Map field2444;

	class227() {
		this.field2437 = 0;
		this.field2436 = new ArrayList();
		this.field2439 = new ArrayList();
		this.field2440 = new ArrayList();
		this.field2441 = null;
		this.field2443 = new float[4];
		this.field2442 = new HashMap();
		this.field2444 = new HashMap();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1030966088"
	)
	String method4591() {
		return this.field2438;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1558594739"
	)
	int method4590() {
		return this.field2437;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "67"
	)
	void method4593() {
		this.field2441 = null;
		this.field2443[0] = 0.0F;
		this.field2443[1] = 0.0F;
		this.field2443[2] = 1.0F;
		this.field2443[3] = 1.0F;
		this.field2436.clear();
		this.field2439.clear();
		this.field2440.clear();
		this.field2442.clear();
		this.field2444.clear();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILex;I)Z",
		garbageValue = "-1957963474"
	)
	boolean method4594(JSONObject var1, int var2, UrlRequester var3) {
		JSONObject var4 = var1;
		if (var2 < 2) {
			try {
				var4 = var4.getJSONObject("message");
			} catch (Exception var13) {
				this.method4593();
				return false;
			}

			try {
				this.method4613(var4.getJSONArray("images"), var3);
			} catch (Exception var12) {
				this.field2439.clear();
			}

			try {
				this.method4597(var4.getJSONArray("labels"));
			} catch (Exception var11) {
				this.field2440.clear();
			}
		} else {
			try {
				this.method4625(var4.getJSONObject("image"), var3);
			} catch (Exception var10) {
				this.field2439.clear();
			}

			try {
				this.method4598(var4.getJSONObject("label"));
			} catch (Exception var9) {
				this.field2440.clear();
			}
		}

		try {
			this.method4599(var4.getJSONObject("behaviour"));
		} catch (Exception var8) {
			this.field2441 = null;
			this.field2443[0] = 0.0F;
			this.field2443[1] = 0.0F;
			this.field2443[2] = 1.0F;
			this.field2443[3] = 1.0F;
			this.field2436.clear();
		}

		try {
			JSONObject var5 = var4.optJSONObject("meta");
			if (var5 != null) {
				this.method4600(var4.getJSONObject("meta"));
			}
		} catch (Exception var7) {
			this.field2442.clear();
			this.field2444.clear();
		}

		if (var2 == 2) {
			try {
				this.field2438 = var4.getString("id");
				this.field2437 = Integer.parseInt(var4.getString("priority"));
			} catch (Exception var6) {
			}
		}

		return true;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Lex;I)V",
		garbageValue = "-52703290"
	)
	void method4613(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) {
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				try {
					JSONObject var4 = var1.getJSONObject(var3);
					class217 var5 = new class217(this);
					var5.field2364 = var2.request(new URL(var4.getString("src")));
					var5.field2365 = class33.method491(var4, "placement");
					this.field2439.add(var5);
				} catch (MalformedURLException var6) {
				}
			}

		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Lex;B)V",
		garbageValue = "13"
	)
	void method4625(JSONObject var1, UrlRequester var2) throws JSONException {
		try {
			class217 var3 = new class217(this);
			var3.field2364 = var2.request(new URL(var1.getString("src")));
			var3.field2365 = class33.method491(var1, "placement");
			this.field2439.add(var3);
		} catch (MalformedURLException var4) {
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;B)V",
		garbageValue = "0"
	)
	void method4597(JSONArray var1) throws JSONException {
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.length(); ++var2) {
				JSONObject var3 = var1.getJSONObject(var2);
				class228 var4 = new class228(this);
				var4.field2449 = var3.getString("text");
				var4.field2450 = class443.method8703(var3.getString("align_x"));
				var4.field2447 = class443.method8703(var3.getString("align_y"));
				var4.field2453 = var3.getInt("font");
				var4.field2451 = class33.method491(var3, "placement");
				this.field2440.add(var4);
			}

		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "1709285856"
	)
	void method4598(JSONObject var1) throws JSONException {
		class228 var2 = new class228(this);
		var2.field2449 = var1.optString("text");
		var2.field2450 = class443.method8703(var1.optString("align_x"));
		var2.field2447 = class443.method8703(var1.optString("align_y"));
		var2.field2453 = var1.optInt("font");
		var2.field2451 = class33.method491(var1, "placement");
		this.field2440.add(var2);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "1100670350"
	)
	void method4599(JSONObject var1) throws JSONException {
		if (var1 != null) {
			this.field2443 = class33.method491(var1, "clickbounds");
			this.field2441 = var1.getString("endpoint");
			String[] var2 = JSONObject.getNames(var1);

			for (int var3 = 0; var3 < var1.length(); ++var3) {
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
					try {
						int var4 = var1.getInt(var2[var3]);
						this.field2436.add(new class215(this, var2[var3], var4));
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]);
							if (var5.equals("true")) {
								this.field2436.add(new class215(this, var2[var3], 1));
							} else if (var5.equals("false")) {
								this.field2436.add(new class215(this, var2[var3], 0));
							} else {
								this.field2436.add(new class224(this, var2[var3], var5));
							}
						} catch (Exception var7) {
						}
					}
				}
			}

		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "13"
	)
	void method4600(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1);

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			try {
				int var4 = var1.optInt(var2[var3]);
				this.field2442.put(var2[var3], var4);
			} catch (Exception var8) {
				try {
					String var5 = var1.optString(var2[var3]);
					if (var5.equals("true")) {
						this.field2442.put(var2[var3], 1);
					} else if (var5.equals("false")) {
						this.field2442.put(var2[var3], 0);
					} else {
						this.field2444.put(var2[var3], var5);
					}
				} catch (Exception var7) {
				}
			}
		}

	}

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(Lng;I)Ljava/lang/String;",
		garbageValue = "-513487987"
	)
	@Export("Widget_getSpellActionName")
	static String Widget_getSpellActionName(Widget var0) {
		if (class93.Widget_unpackTargetMask(class171.getWidgetFlags(var0)) == 0) {
			return null;
		} else {
			return var0.spellActionName != null && var0.spellActionName.trim().length() != 0 ? var0.spellActionName : null;
		}
	}
}
