import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ic")
public class class208 {
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -176004405
	)
	int field2255;
	@ObfuscatedName("az")
	String field2259;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	UrlRequest field2257;
	@ObfuscatedName("av")
	String field2250;
	@ObfuscatedName("ax")
	float[] field2258;
	@ObfuscatedName("as")
	ArrayList field2256;
	@ObfuscatedName("ay")
	ArrayList field2261;
	@ObfuscatedName("ak")
	ArrayList field2266;
	@ObfuscatedName("aj")
	Map field2263;
	@ObfuscatedName("am")
	Map field2264;

	public class208() {
		this.field2255 = -1;
		this.field2250 = null;
		this.field2258 = new float[4];
		this.field2256 = new ArrayList();
		this.field2261 = new ArrayList();
		this.field2266 = new ArrayList();
		this.field2263 = new HashMap();
		this.field2264 = new HashMap();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lel;B)Z",
		garbageValue = "-18"
	)
	public boolean method4161(String var1, UrlRequester var2) {
		if (var1 != null && !var1.isEmpty()) {
			if (var2 == null) {
				return false;
			} else {
				this.method4142();

				try {
					this.field2259 = var1;
					this.field2257 = var2.request(new URL(this.field2259));
					this.field2255 = 0;
					return true;
				} catch (MalformedURLException var4) {
					this.method4142();
					this.field2255 = 100;
					return false;
				}
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lel;I)V",
		garbageValue = "1589272882"
	)
	public void method4115(UrlRequester var1) {
		switch(this.field2255) {
		case 0:
			this.method4116(var1);
			break;
		case 1:
			this.method4134();
			break;
		default:
			return;
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-1"
	)
	public int method4124() {
		return this.field2255;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "256889728"
	)
	public int method4114(String var1) {
		return this.field2263.containsKey(var1) ? (Integer)this.field2263.get(var1) : -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1206229207"
	)
	public String method4118(String var1) {
		return (String)((String)(this.field2264.containsKey(var1) ? this.field2264.get(var1) : null));
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "2021801100"
	)
	public ArrayList method4119() {
		return this.field2261;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "-2096187297"
	)
	public ArrayList method4120() {
		return this.field2266;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-944579598"
	)
	public String method4121() {
		return this.field2250;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "94"
	)
	public float[] method4183() {
		return this.field2258;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "523040657"
	)
	public ArrayList method4123() {
		return this.field2256;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "64156006"
	)
	void method4142() {
		this.field2257 = null;
		this.field2250 = null;
		this.field2258[0] = 0.0F;
		this.field2258[1] = 0.0F;
		this.field2258[2] = 1.0F;
		this.field2258[3] = 1.0F;
		this.field2256.clear();
		this.field2261.clear();
		this.field2266.clear();
		this.field2263.clear();
		this.field2264.clear();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lel;I)V",
		garbageValue = "357044570"
	)
	void method4116(UrlRequester var1) {
		if (this.field2257 != null && this.field2257.isDone()) {
			byte[] var2 = this.field2257.getResponse();
			if (var2 == null) {
				this.method4142();
				this.field2255 = 100;
			} else {
				try {
					this.method4131(new HttpJsonContent(var2), var1);
				} catch (UnsupportedEncodingException var4) {
					this.method4142();
					this.field2255 = 102;
					return;
				}

				this.field2255 = this.field2261.size() > 0 ? 1 : 2;
				this.field2257 = null;
			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-841261467"
	)
	void method4134() {
		Iterator var1 = this.field2261.iterator();

		class214 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field2261.iterator();

				while (var1.hasNext()) {
					var2 = (class214)var1.next();
					if (var2.field2303 != null) {
						byte[] var3 = var2.field2303.getResponse();
						if (var3 != null && var3.length > 0) {
							this.field2255 = 2;
							return;
						}
					}
				}

				this.method4142();
				this.field2255 = 101;
				return;
			}

			var2 = (class214)var1.next();
		} while(var2.field2303 == null || var2.field2303.isDone());

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Lel;I)V",
		garbageValue = "-1649177141"
	)
	void method4147(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) {
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				try {
					JSONObject var4 = var1.getJSONObject(var3);
					class214 var5 = new class214(this);
					var5.field2303 = var2.request(new URL(var4.getString("src")));
					var5.field2300 = class9.method84(var4, "placement");
					this.field2261.add(var5);
				} catch (MalformedURLException var6) {
				}
			}

		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;B)V",
		garbageValue = "1"
	)
	void method4128(JSONArray var1) throws JSONException {
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.length(); ++var2) {
				JSONObject var3 = var1.getJSONObject(var2);
				class215 var4 = new class215(this);
				var4.field2312 = var3.getString("text");
				var4.field2308 = class33.method494(var3.getString("align_x"));
				var4.field2309 = class33.method494(var3.getString("align_y"));
				var4.field2310 = var3.getInt("font");
				var4.field2306 = class9.method84(var3, "placement");
				this.field2266.add(var4);
			}

		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "1286553511"
	)
	void method4129(JSONObject var1) throws JSONException {
		if (var1 != null) {
			this.field2258 = class9.method84(var1, "clickbounds");
			this.field2250 = var1.getString("endpoint");
			String[] var2 = JSONObject.getNames(var1);

			for (int var3 = 0; var3 < var1.length(); ++var3) {
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
					try {
						int var4 = var1.getInt(var2[var3]);
						this.field2256.add(new class216(this, var2[var3], var4));
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]);
							if (var5.equals("true")) {
								this.field2256.add(new class216(this, var2[var3], 1));
							} else if (var5.equals("false")) {
								this.field2256.add(new class216(this, var2[var3], 0));
							} else {
								this.field2256.add(new class207(this, var2[var3], var5));
							}
						} catch (Exception var7) {
						}
					}
				}
			}

		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "-85"
	)
	void method4130(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1);

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			try {
				int var4 = var1.getInt(var2[var3]);
				this.field2263.put(var2[var3], var4);
			} catch (Exception var8) {
				try {
					String var5 = var1.getString(var2[var3]);
					if (var5.equals("true")) {
						this.field2263.put(var2[var3], 1);
					} else if (var5.equals("false")) {
						this.field2263.put(var2[var3], 0);
					} else {
						this.field2264.put(var2[var3], var5);
					}
				} catch (Exception var7) {
				}
			}
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lsv;Lel;I)V",
		garbageValue = "1323384211"
	)
	void method4131(HttpJsonContent var1, UrlRequester var2) {
		JSONObject var3;
		try {
			var3 = var1.getProperties();
			var3 = var3.getJSONObject("message");
		} catch (Exception var9) {
			this.method4142();
			this.field2255 = 102;
			return;
		}

		try {
			this.method4147(var3.getJSONArray("images"), var2);
		} catch (Exception var8) {
			this.field2261.clear();
		}

		try {
			this.method4128(var3.getJSONArray("labels"));
		} catch (Exception var7) {
			this.field2266.clear();
		}

		try {
			this.method4129(var3.getJSONObject("behaviour"));
		} catch (Exception var6) {
			this.field2250 = null;
			this.field2258[0] = 0.0F;
			this.field2258[1] = 0.0F;
			this.field2258[2] = 1.0F;
			this.field2258[3] = 1.0F;
			this.field2256.clear();
		}

		try {
			this.method4130(var3.getJSONObject("meta"));
		} catch (Exception var5) {
			this.field2263.clear();
			this.field2264.clear();
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lel;I)Z",
		garbageValue = "348701890"
	)
	public boolean method4132(String var1, UrlRequester var2) {
		try {
			this.method4131(new HttpJsonContent(var1.getBytes()), var2);
			this.field2255 = this.field2261.size() > 0 ? 1 : 2;
		} catch (UnsupportedEncodingException var4) {
			this.field2255 = 102;
		}

		return this.field2255 < 100;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1432052010"
	)
	public static void method4152() {
		class174.archive7.clear();
	}
}
