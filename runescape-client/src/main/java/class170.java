import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("gq")
public class class170 {
	@ObfuscatedName("ja")
	@Export("regionLandArchiveIds")
	static int[] regionLandArchiveIds;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1852345439
	)
	int field1808;
	@ObfuscatedName("ap")
	String field1817;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	UrlRequest field1805;
	@ObfuscatedName("at")
	String field1811;
	@ObfuscatedName("ah")
	float[] field1812;
	@ObfuscatedName("ax")
	ArrayList field1813;
	@ObfuscatedName("aa")
	ArrayList field1804;
	@ObfuscatedName("au")
	ArrayList field1815;
	@ObfuscatedName("ae")
	Map field1816;
	@ObfuscatedName("ab")
	Map field1814;

	public class170() {
		this.field1808 = -1;
		this.field1811 = null;
		this.field1812 = new float[4];
		this.field1813 = new ArrayList();
		this.field1804 = new ArrayList();
		this.field1815 = new ArrayList();
		this.field1816 = new HashMap();
		this.field1814 = new HashMap();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lej;B)Z",
		garbageValue = "-55"
	)
	public boolean method3431(String var1, UrlRequester var2) {
		if (var1 != null && !var1.isEmpty()) {
			if (var2 == null) {
				return false;
			} else {
				this.method3441();

				try {
					this.field1817 = var1;
					this.field1805 = var2.request(new URL(this.field1817));
					this.field1808 = 0;
					return true;
				} catch (MalformedURLException var4) {
					this.method3441();
					this.field1808 = 100;
					return false;
				}
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lej;B)V",
		garbageValue = "88"
	)
	public void method3472(UrlRequester var1) {
		switch(this.field1808) {
		case 0:
			this.method3442(var1);
			break;
		case 1:
			this.method3446();
			break;
		default:
			return;
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1160046533"
	)
	public int method3438() {
		return this.field1808;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "212756708"
	)
	public int method3434(String var1) {
		return this.field1816.containsKey(var1) ? (Integer)this.field1816.get(var1) : -1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "103576370"
	)
	public String method3435(String var1) {
		return (String)((String)(this.field1814.containsKey(var1) ? this.field1814.get(var1) : null));
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "494222917"
	)
	public ArrayList method3436() {
		return this.field1804;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "35"
	)
	public ArrayList method3437() {
		return this.field1815;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "120"
	)
	public String method3479() {
		return this.field1811;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "1926620523"
	)
	public float[] method3439() {
		return this.field1812;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "88"
	)
	public ArrayList method3487() {
		return this.field1813;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "500"
	)
	void method3441() {
		this.field1805 = null;
		this.field1811 = null;
		this.field1812[0] = 0.0F;
		this.field1812[1] = 0.0F;
		this.field1812[2] = 1.0F;
		this.field1812[3] = 1.0F;
		this.field1813.clear();
		this.field1804.clear();
		this.field1815.clear();
		this.field1816.clear();
		this.field1814.clear();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lej;B)V",
		garbageValue = "0"
	)
	void method3442(UrlRequester var1) {
		if (this.field1805 != null && this.field1805.isDone()) {
			byte[] var2 = this.field1805.getResponse();
			if (var2 == null) {
				this.method3441();
				this.field1808 = 100;
			} else {
				try {
					this.method3448(new class463(var2), var1);
				} catch (UnsupportedEncodingException var4) {
					this.method3441();
					this.field1808 = 102;
					return;
				}

				this.field1808 = this.field1804.size() > 0 ? 1 : 2;
				this.field1805 = null;
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "706475225"
	)
	void method3446() {
		Iterator var1 = this.field1804.iterator();

		class176 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field1804.iterator();

				while (var1.hasNext()) {
					var2 = (class176)var1.next();
					if (var2.field1853 != null) {
						byte[] var3 = var2.field1853.getResponse();
						if (var3 != null && var3.length > 0) {
							this.field1808 = 2;
							return;
						}
					}
				}

				this.method3441();
				this.field1808 = 101;
				return;
			}

			var2 = (class176)var1.next();
		} while(var2.field1853 == null || var2.field1853.isDone());

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Lej;I)V",
		garbageValue = "-506183299"
	)
	void method3457(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) {
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				try {
					JSONObject var4 = var1.getJSONObject(var3);
					class176 var5 = new class176(this);
					var5.field1853 = var2.request(new URL(var4.getString("src")));
					var5.field1849 = class106.method2689(var4, "placement");
					this.field1804.add(var5);
				} catch (MalformedURLException var6) {
				}
			}

		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;I)V",
		garbageValue = "-86694133"
	)
	void method3490(JSONArray var1) throws JSONException {
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.length(); ++var2) {
				JSONObject var3 = var1.getJSONObject(var2);
				class177 var4 = new class177(this);
				var4.field1861 = var3.getString("text");
				var4.field1859 = class27.method422(var3.getString("align_x"));
				var4.field1860 = class27.method422(var3.getString("align_y"));
				var4.field1855 = var3.getInt("font");
				var4.field1858 = class106.method2689(var3, "placement");
				this.field1815.add(var4);
			}

		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;S)V",
		garbageValue = "-18886"
	)
	void method3440(JSONObject var1) throws JSONException {
		if (var1 != null) {
			this.field1812 = class106.method2689(var1, "clickbounds");
			this.field1811 = var1.getString("endpoint");
			String[] var2 = JSONObject.getNames(var1);

			for (int var3 = 0; var3 < var1.length(); ++var3) {
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
					try {
						int var4 = var1.getInt(var2[var3]);
						this.field1813.add(new class178(this, var2[var3], var4));
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]);
							if (var5.equals("true")) {
								this.field1813.add(new class178(this, var2[var3], 1));
							} else if (var5.equals("false")) {
								this.field1813.add(new class178(this, var2[var3], 0));
							} else {
								this.field1813.add(new class169(this, var2[var3], var5));
							}
						} catch (Exception var7) {
						}
					}
				}
			}

		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "357071457"
	)
	void method3447(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1);

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			try {
				int var4 = var1.getInt(var2[var3]);
				this.field1816.put(var2[var3], var4);
			} catch (Exception var8) {
				try {
					String var5 = var1.getString(var2[var3]);
					if (var5.equals("true")) {
						this.field1816.put(var2[var3], 1);
					} else if (var5.equals("false")) {
						this.field1816.put(var2[var3], 0);
					} else {
						this.field1814.put(var2[var3], var5);
					}
				} catch (Exception var7) {
				}
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lre;Lej;B)V",
		garbageValue = "28"
	)
	void method3448(class463 var1, UrlRequester var2) {
		JSONObject var3;
		try {
			var3 = var1.method8398();
			var3 = var3.getJSONObject("message");
		} catch (Exception var9) {
			this.method3441();
			this.field1808 = 102;
			return;
		}

		try {
			this.method3457(var3.getJSONArray("images"), var2);
		} catch (Exception var8) {
			this.field1804.clear();
		}

		try {
			this.method3490(var3.getJSONArray("labels"));
		} catch (Exception var7) {
			this.field1815.clear();
		}

		try {
			this.method3440(var3.getJSONObject("behaviour"));
		} catch (Exception var6) {
			this.field1811 = null;
			this.field1812[0] = 0.0F;
			this.field1812[1] = 0.0F;
			this.field1812[2] = 1.0F;
			this.field1812[3] = 1.0F;
			this.field1813.clear();
		}

		try {
			this.method3447(var3.getJSONObject("meta"));
		} catch (Exception var5) {
			this.field1816.clear();
			this.field1814.clear();
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lej;B)Z",
		garbageValue = "6"
	)
	public boolean method3449(String var1, UrlRequester var2) {
		try {
			this.method3448(new class463(var1.getBytes()), var2);
			this.field1808 = this.field1804.size() > 0 ? 1 : 2;
		} catch (UnsupportedEncodingException var4) {
			this.field1808 = 102;
		}

		return this.field1808 < 100;
	}

	@ObfuscatedName("aw")
	@Export("base37DecodeLong")
	public static String base37DecodeLong(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (var0 % 37L == 0L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; 0L != var3; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) {
					long var6 = var0;
					var0 /= 37L;
					var8 = class389.base37Table[(int)(var6 - var0 * 37L)];
					if (var8 == '_') {
						int var9 = var5.length() - 1;
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
						var8 = 160;
					}
				}

				var5.reverse();
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
				return var5.toString();
			}
		} else {
			return null;
		}
	}
}
