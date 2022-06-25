import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedSignature;
import java.net.MalformedURLException;
import net.runelite.mapping.ObfuscatedGetter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
@ObfuscatedName("es")
public class class155 {
	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = -793347601)
	int field1726;

	@ObfuscatedName("i")
	String field1730;

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lct;")
	UrlRequest field1729;

	@ObfuscatedName("t")
	String field1732;

	@ObfuscatedName("z")
	float[] field1733;

	@ObfuscatedName("r")
	ArrayList field1734;

	@ObfuscatedName("u")
	ArrayList field1735;

	@ObfuscatedName("k")
	ArrayList field1736;

	@ObfuscatedName("h")
	Map field1731;

	@ObfuscatedName("x")
	Map field1724;

	public class155() {
		this.field1726 = -1;
		this.field1732 = null;
		this.field1733 = new float[4];
		this.field1734 = new ArrayList();
		this.field1735 = new ArrayList();
		this.field1736 = new ArrayList();
		this.field1731 = new HashMap();
		this.field1724 = new HashMap();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lcd;I)Z", garbageValue = "-34327555")
	public boolean method3174(String var1, UrlRequester var2) {
		if (var1 != null && !var1.isEmpty()) {
			if (var2 == null) {
				return false;
			} else {
				this.method3226();
				try {
					this.field1730 = var1;
					this.field1729 = var2.request(new URL(this.field1730));
					this.field1726 = 0;
					return true;
				} catch (MalformedURLException var4) {
					this.method3226();
					this.field1726 = 100;
					return false;
				}
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Lcd;I)V", garbageValue = "1224527567")
	public void method3175(UrlRequester var1) {
		switch (this.field1726) {
			case 0 :
				this.method3185(var1);
				break;
			case 1 :
				this.method3186();
				break;
			default :
				return;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1504474906")
	public int method3176() {
		return this.field1726;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)I", garbageValue = "-2119043872")
	public int method3196(String var1) {
		return this.field1731.containsKey(var1) ? ((Integer) (this.field1731.get(var1))) : -1;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", garbageValue = "1630145340")
	public String method3178(String var1) {
		return ((String) ((String) (this.field1724.containsKey(var1) ? this.field1724.get(var1) : null)));
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(I)Ljava/util/ArrayList;", garbageValue = "1021496869")
	public ArrayList method3179() {
		return this.field1735;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(B)Ljava/util/ArrayList;", garbageValue = "100")
	public ArrayList method3190() {
		return this.field1736;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "2042009009")
	public String method3201() {
		return this.field1732;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(I)[F", garbageValue = "208203188")
	public float[] method3182() {
		return this.field1733;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(B)Ljava/util/ArrayList;", garbageValue = "1")
	public ArrayList method3183() {
		return this.field1734;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(S)V", garbageValue = "-10689")
	void method3226() {
		this.field1729 = null;
		this.field1732 = null;
		this.field1733[0] = 0.0F;
		this.field1733[1] = 0.0F;
		this.field1733[2] = 1.0F;
		this.field1733[3] = 1.0F;
		this.field1734.clear();
		this.field1735.clear();
		this.field1736.clear();
		this.field1731.clear();
		this.field1724.clear();
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "(Lcd;B)V", garbageValue = "9")
	void method3185(UrlRequester var1) {
		if (this.field1729 != null && this.field1729.isDone()) {
			byte[] var2 = this.field1729.getResponse();
			if (var2 == null) {
				this.method3226();
				this.field1726 = 100;
			} else {
				JSONObject var3;
				try {
					class399 var4 = new class399(var2);
					var3 = var4.method7100();
					var3 = var3.getJSONObject("message");
				} catch (Exception var9) {
					this.method3226();
					this.field1726 = 102;
					return;
				}
				try {
					this.method3202(var3.getJSONArray("images"), var1);
				} catch (Exception var8) {
					this.field1735.clear();
				}
				try {
					this.method3191(var3.getJSONArray("labels"));
				} catch (Exception var7) {
					this.field1736.clear();
				}
				try {
					this.method3177(var3.getJSONObject("behaviour"));
				} catch (Exception var6) {
					this.field1732 = null;
					this.field1733[0] = 0.0F;
					this.field1733[1] = 0.0F;
					this.field1733[2] = 1.0F;
					this.field1733[3] = 1.0F;
					this.field1734.clear();
				}
				try {
					this.method3189(var3.getJSONObject("meta"));
				} catch (Exception var5) {
					this.field1731.clear();
					this.field1724.clear();
				}
				this.field1726 = (this.field1735.size() > 0) ? 1 : 2;
				this.field1729 = null;
			}
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-29")
	void method3186() {
		Iterator var1 = this.field1735.iterator();
		class160 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field1735.iterator();
				while (var1.hasNext()) {
					var2 = ((class160) (var1.next()));
					if (var2.field1772 != null) {
						byte[] var3 = var2.field1772.getResponse();
						if (var3 != null && var3.length > 0) {
							this.field1726 = 2;
							return;
						}
					}
				} 
				this.method3226();
				this.field1726 = 101;
				return;
			}
			var2 = ((class160) (var1.next()));
		} while (var2.field1772 == null || var2.field1772.isDone() );
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(Lorg/json/JSONArray;Lcd;B)V", garbageValue = "1")
	void method3202(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) {
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				try {
					JSONObject var4 = var1.getJSONObject(var3);
					class160 var5 = new class160(this);
					var5.field1772 = var2.request(new URL(var4.getString("src")));
					var5.field1770 = class181.method3566(var4, "placement");
					this.field1735.add(var5);
				} catch (MalformedURLException var6) {
				}
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(Lorg/json/JSONArray;B)V", garbageValue = "112")
	void method3191(JSONArray var1) throws JSONException {
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.length(); ++var2) {
				JSONObject var3 = var1.getJSONObject(var2);
				class161 var4 = new class161(this);
				var4.field1775 = var3.getString("text");
				String var7 = var3.getString("align_x");
				byte var6;
				if (var7.equals("centre")) {
					var6 = 1;
				} else if (!var7.equals("bottom") && !var7.equals("right")) {
					var6 = 0;
				} else {
					var6 = 2;
				}
				var4.field1773 = var6;
				String var10 = var3.getString("align_y");
				byte var9;
				if (var10.equals("centre")) {
					var9 = 1;
				} else if (!var10.equals("bottom") && !var10.equals("right")) {
					var9 = 0;
				} else {
					var9 = 2;
				}
				var4.field1777 = var9;
				var4.field1779 = var3.getInt("font");
				var4.field1776 = class181.method3566(var3, "placement");
				this.field1736.add(var4);
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(Lorg/json/JSONObject;I)V", garbageValue = "-1263600305")
	void method3177(JSONObject var1) throws JSONException {
		if (var1 != null) {
			this.field1733 = class181.method3566(var1, "clickbounds");
			this.field1732 = var1.getString("endpoint");
			String[] var2 = JSONObject.getNames(var1);
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
					try {
						int var4 = var1.getInt(var2[var3]);
						this.field1734.add(new class162(this, var2[var3], var4));
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]);
							if (var5.equals("true")) {
								this.field1734.add(new class162(this, var2[var3], 1));
							} else if (var5.equals("false")) {
								this.field1734.add(new class162(this, var2[var3], 0));
							} else {
								this.field1734.add(new class154(this, var2[var3], var5));
							}
						} catch (Exception var7) {
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Lorg/json/JSONObject;I)V", garbageValue = "-1948226322")
	void method3189(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1);
		for (int var3 = 0; var3 < var1.length(); ++var3) {
			try {
				int var4 = var1.getInt(var2[var3]);
				this.field1731.put(var2[var3], var4);
			} catch (Exception var8) {
				try {
					String var5 = var1.getString(var2[var3]);
					if (var5.equals("true")) {
						this.field1731.put(var2[var3], 1);
					} else if (var5.equals("false")) {
						this.field1731.put(var2[var3], 0);
					} else {
						this.field1724.put(var2[var3], var5);
					}
				} catch (Exception var7) {
				}
			}
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "-1008936985")
	public static int method3194(int var0) {
		return class401.field4443[var0 & 16383];
	}
}