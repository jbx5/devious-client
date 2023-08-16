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

@ObfuscatedName("gf")
public class class170 {
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1468015305
	)
	int field1837;
	@ObfuscatedName("af")
	String field1838;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Let;"
	)
	UrlRequest field1839;
	@ObfuscatedName("aq")
	String field1840;
	@ObfuscatedName("al")
	float[] field1841;
	@ObfuscatedName("an")
	ArrayList field1836;
	@ObfuscatedName("ar")
	ArrayList field1844;
	@ObfuscatedName("ab")
	ArrayList field1834;
	@ObfuscatedName("ag")
	Map field1845;
	@ObfuscatedName("am")
	Map field1846;

	public class170() {
		this.field1837 = -1;
		this.field1840 = null;
		this.field1841 = new float[4];
		this.field1836 = new ArrayList();
		this.field1844 = new ArrayList();
		this.field1834 = new ArrayList();
		this.field1845 = new HashMap();
		this.field1846 = new HashMap();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lev;I)Z",
		garbageValue = "-117070837"
	)
	public boolean method3365(String var1, UrlRequester var2) {
		if (var1 != null && !var1.isEmpty()) {
			if (var2 == null) {
				return false;
			} else {
				this.method3375();

				try {
					this.field1838 = var1;
					this.field1839 = var2.request(new URL(this.field1838));
					this.field1837 = 0;
					return true;
				} catch (MalformedURLException var4) {
					this.method3375();
					this.field1837 = 100;
					return false;
				}
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lev;I)V",
		garbageValue = "-1262385396"
	)
	public void method3413(UrlRequester var1) {
		switch(this.field1837) {
		case 0:
			this.method3376(var1);
			break;
		case 1:
			this.method3377();
			break;
		default:
			return;
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1206059947"
	)
	public int method3367() {
		return this.field1837;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-63404292"
	)
	public int method3368(String var1) {
		return this.field1845.containsKey(var1) ? (Integer)this.field1845.get(var1) : -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1647715363"
	)
	public String method3417(String var1) {
		return (String)((String)(this.field1846.containsKey(var1) ? this.field1846.get(var1) : null));
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "-87"
	)
	public ArrayList method3370() {
		return this.field1844;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "88"
	)
	public ArrayList method3418() {
		return this.field1834;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1756409477"
	)
	public String method3372() {
		return this.field1840;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-2115403959"
	)
	public float[] method3371() {
		return this.field1841;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "-78"
	)
	public ArrayList method3374() {
		return this.field1836;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "22"
	)
	void method3375() {
		this.field1839 = null;
		this.field1840 = null;
		this.field1841[0] = 0.0F;
		this.field1841[1] = 0.0F;
		this.field1841[2] = 1.0F;
		this.field1841[3] = 1.0F;
		this.field1836.clear();
		this.field1844.clear();
		this.field1834.clear();
		this.field1845.clear();
		this.field1846.clear();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lev;B)V",
		garbageValue = "-76"
	)
	void method3376(UrlRequester var1) {
		if (this.field1839 != null && this.field1839.isDone()) {
			byte[] var2 = this.field1839.getResponse();
			if (var2 == null) {
				this.method3375();
				this.field1837 = 100;
			} else {
				try {
					this.method3382(new class462(var2), var1);
				} catch (UnsupportedEncodingException var4) {
					this.method3375();
					this.field1837 = 102;
					return;
				}

				this.field1837 = this.field1844.size() > 0 ? 1 : 2;
				this.field1839 = null;
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2026180069"
	)
	void method3377() {
		Iterator var1 = this.field1844.iterator();

		class176 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field1844.iterator();

				while (var1.hasNext()) {
					var2 = (class176)var1.next();
					if (var2.field1879 != null) {
						byte[] var3 = var2.field1879.getResponse();
						if (var3 != null && var3.length > 0) {
							this.field1837 = 2;
							return;
						}
					}
				}

				this.method3375();
				this.field1837 = 101;
				return;
			}

			var2 = (class176)var1.next();
		} while(var2.field1879 == null || var2.field1879.isDone());

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Lev;B)V",
		garbageValue = "-22"
	)
	void method3415(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) {
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				try {
					JSONObject var4 = var1.getJSONObject(var3);
					class176 var5 = new class176(this);
					var5.field1879 = var2.request(new URL(var4.getString("src")));
					var5.field1880 = UserComparator5.method2889(var4, "placement");
					this.field1844.add(var5);
				} catch (MalformedURLException var6) {
				}
			}

		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;I)V",
		garbageValue = "205832282"
	)
	void method3379(JSONArray var1) throws JSONException {
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.length(); ++var2) {
				JSONObject var3 = var1.getJSONObject(var2);
				class177 var4 = new class177(this);
				var4.field1892 = var3.getString("text");
				String var7 = var3.getString("align_x");
				byte var6;
				if (var7.equals("centre")) {
					var6 = 1;
				} else if (!var7.equals("bottom") && !var7.equals("right")) {
					var6 = 0;
				} else {
					var6 = 2;
				}

				var4.field1886 = var6;
				String var10 = var3.getString("align_y");
				byte var9;
				if (var10.equals("centre")) {
					var9 = 1;
				} else if (!var10.equals("bottom") && !var10.equals("right")) {
					var9 = 0;
				} else {
					var9 = 2;
				}

				var4.field1887 = var9;
				var4.field1884 = var3.getInt("font");
				var4.field1885 = UserComparator5.method2889(var3, "placement");
				this.field1834.add(var4);
			}

		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "3730991"
	)
	void method3397(JSONObject var1) throws JSONException {
		if (var1 != null) {
			this.field1841 = UserComparator5.method2889(var1, "clickbounds");
			this.field1840 = var1.getString("endpoint");
			String[] var2 = JSONObject.getNames(var1);

			for (int var3 = 0; var3 < var1.length(); ++var3) {
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
					try {
						int var4 = var1.getInt(var2[var3]);
						this.field1836.add(new class178(this, var2[var3], var4));
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]);
							if (var5.equals("true")) {
								this.field1836.add(new class178(this, var2[var3], 1));
							} else if (var5.equals("false")) {
								this.field1836.add(new class178(this, var2[var3], 0));
							} else {
								this.field1836.add(new class169(this, var2[var3], var5));
							}
						} catch (Exception var7) {
						}
					}
				}
			}

		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "-60"
	)
	void method3439(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1);

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			try {
				int var4 = var1.getInt(var2[var3]);
				this.field1845.put(var2[var3], var4);
			} catch (Exception var8) {
				try {
					String var5 = var1.getString(var2[var3]);
					if (var5.equals("true")) {
						this.field1845.put(var2[var3], 1);
					} else if (var5.equals("false")) {
						this.field1845.put(var2[var3], 0);
					} else {
						this.field1846.put(var2[var3], var5);
					}
				} catch (Exception var7) {
				}
			}
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lrl;Lev;B)V",
		garbageValue = "80"
	)
	void method3382(class462 var1, UrlRequester var2) {
		JSONObject var3;
		try {
			var3 = var1.method8332();
			var3 = var3.getJSONObject("message");
		} catch (Exception var9) {
			this.method3375();
			this.field1837 = 102;
			return;
		}

		try {
			this.method3415(var3.getJSONArray("images"), var2);
		} catch (Exception var8) {
			this.field1844.clear();
		}

		try {
			this.method3379(var3.getJSONArray("labels"));
		} catch (Exception var7) {
			this.field1834.clear();
		}

		try {
			this.method3397(var3.getJSONObject("behaviour"));
		} catch (Exception var6) {
			this.field1840 = null;
			this.field1841[0] = 0.0F;
			this.field1841[1] = 0.0F;
			this.field1841[2] = 1.0F;
			this.field1841[3] = 1.0F;
			this.field1836.clear();
		}

		try {
			this.method3439(var3.getJSONObject("meta"));
		} catch (Exception var5) {
			this.field1845.clear();
			this.field1846.clear();
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lev;I)Z",
		garbageValue = "1404178579"
	)
	public boolean method3383(String var1, UrlRequester var2) {
		try {
			this.method3382(new class462(var1.getBytes()), var2);
			this.field1837 = this.field1844.size() > 0 ? 1 : 2;
		} catch (UnsupportedEncodingException var4) {
			this.field1837 = 102;
		}

		return this.field1837 < 100;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "1176704124"
	)
	static int method3441(int var0, Script var1, boolean var2) {
		return 2;
	}
}
