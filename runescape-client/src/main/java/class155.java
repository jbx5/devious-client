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

@ObfuscatedName("ef")
public class class155 {
	@ObfuscatedName("ul")
	@ObfuscatedSignature(descriptor = 
	"Lbc;")

	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 
	-636798581)

	int field1702;
	@ObfuscatedName("r")
	String field1714;
	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"Lct;")

	UrlRequest field1710;
	@ObfuscatedName("x")
	String field1711;
	@ObfuscatedName("c")
	float[] field1712;
	@ObfuscatedName("j")
	ArrayList field1717;
	@ObfuscatedName("p")
	ArrayList field1713;
	@ObfuscatedName("s")
	ArrayList field1708;
	@ObfuscatedName("b")
	Map field1716;
	@ObfuscatedName("w")
	Map field1709;

	public class155() {
		this.field1702 = -1;
		this.field1711 = null;
		this.field1712 = new float[4];
		this.field1717 = new ArrayList();
		this.field1713 = new ArrayList();
		this.field1708 = new ArrayList();
		this.field1716 = new HashMap();
		this.field1709 = new HashMap();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;Lci;I)Z", garbageValue = 
	"1113383001")

	public boolean method3131(String var1, UrlRequester var2) {
		if ((var1 != null) && (!var1.isEmpty())) {
			if (var2 == null) {
				return false;
			} else {
				this.method3143();

				try {
					this.field1714 = var1;
					this.field1710 = var2.request(new URL(this.field1714));
					this.field1702 = 0;
					return true;
				} catch (MalformedURLException var4) {
					this.method3143();
					this.field1702 = 100;
					return false;
				}
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Lci;I)V", garbageValue = 
	"2095270255")

	public void method3165(UrlRequester var1) {
		switch (this.field1702) {
			case 0 :
				this.method3142(var1);
				break;
			case 1 :
				this.method3135();
				break;
			default :
				return;}


	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"14")

	public int method3141() {
		return this.field1702;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;B)I", garbageValue = 
	"8")

	public int method3134(String var1) {
		return this.field1716.containsKey(var1) ? ((Integer) (this.field1716.get(var1))) : -1;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;S)Ljava/lang/String;", garbageValue = 
	"24966")

	public String method3144(String var1) {
		return ((String) ((String) (this.field1709.containsKey(var1) ? this.field1709.get(var1) : null)));
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(I)Ljava/util/ArrayList;", garbageValue = 
	"1155378703")

	public ArrayList method3130() {
		return this.field1713;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(I)Ljava/util/ArrayList;", garbageValue = 
	"1265617281")

	public ArrayList method3137() {
		return this.field1708;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(I)Ljava/lang/String;", garbageValue = 
	"1734627976")

	public String method3138() {
		return this.field1711;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"(B)[F", garbageValue = 
	"35")

	public float[] method3146() {
		return this.field1712;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(I)Ljava/util/ArrayList;", garbageValue = 
	"-937062700")

	public ArrayList method3140() {
		return this.field1717;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-2017672764")

	void method3143() {
		this.field1710 = null;
		this.field1711 = null;
		this.field1712[0] = 0.0F;
		this.field1712[1] = 0.0F;
		this.field1712[2] = 1.0F;
		this.field1712[3] = 1.0F;
		this.field1717.clear();
		this.field1713.clear();
		this.field1708.clear();
		this.field1716.clear();
		this.field1709.clear();
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = 
	"(Lci;B)V", garbageValue = 
	"-74")

	void method3142(UrlRequester var1) {
		if ((this.field1710 != null) && this.field1710.isDone()) {
			byte[] var2 = this.field1710.getResponse();
			if (var2 == null) {
				this.method3143();
				this.field1702 = 100;
			} else {
				JSONObject var3;
				try {
					class399 var4 = new class399(var2);
					var3 = var4.method7225();
					var3 = var3.getJSONObject("message");
				} catch (Exception var9) {
					this.method3143();
					this.field1702 = 102;
					return;
				}

				try {
					this.method3133(var3.getJSONArray("images"), var1);
				} catch (Exception var8) {
					this.field1713.clear();
				}

				try {
					this.method3145(var3.getJSONArray("labels"));
				} catch (Exception var7) {
					this.field1708.clear();
				}

				try {
					this.method3161(var3.getJSONObject("behaviour"));
				} catch (Exception var6) {
					this.field1711 = null;
					this.field1712[0] = 0.0F;
					this.field1712[1] = 0.0F;
					this.field1712[2] = 1.0F;
					this.field1712[3] = 1.0F;
					this.field1717.clear();
				}

				try {
					this.method3147(var3.getJSONObject("meta"));
				} catch (Exception var5) {
					this.field1716.clear();
					this.field1709.clear();
				}

				this.field1702 = (this.field1713.size() > 0) ? 1 : 2;
				this.field1710 = null;
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-111140225")

	void method3135() {
		Iterator var1 = this.field1713.iterator();

		class160 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field1713.iterator();

				while (var1.hasNext()) {
					var2 = ((class160) (var1.next()));
					if (var2.field1749 != null) {
						byte[] var3 = var2.field1749.getResponse();
						if ((var3 != null) && (var3.length > 0)) {
							this.field1702 = 2;
							return;
						}
					}
				} 

				this.method3143();
				this.field1702 = 101;
				return;
			}

			var2 = ((class160) (var1.next()));
		} while ((var2.field1749 == null) || var2.field1749.isDone() );

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = 
	"(Lorg/json/JSONArray;Lci;B)V", garbageValue = 
	"-122")

	void method3133(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) {
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				try {
					JSONObject var4 = var1.getJSONObject(var3);
					class160 var5 = new class160(this);
					var5.field1749 = var2.request(new URL(var4.getString("src")));
					var5.field1748 = class14.method186(var4, "placement");
					this.field1713.add(var5);
				} catch (MalformedURLException var6) {
				}
			}

		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"(Lorg/json/JSONArray;I)V", garbageValue = 
	"-1894946604")

	void method3145(JSONArray var1) throws JSONException {
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.length(); ++var2) {
				JSONObject var3 = var1.getJSONObject(var2);
				class162 var4 = new class162(this);
				var4.field1771 = var3.getString("text");
				String var7 = var3.getString("align_x");
				byte var6;
				if (var7.equals("centre")) {
					var6 = 1;
				} else if ((!var7.equals("bottom")) && (!var7.equals("right"))) {
					var6 = 0;
				} else {
					var6 = 2;
				}

				var4.field1770 = var6;
				String var10 = var3.getString("align_y");
				byte var9;
				if (var10.equals("centre")) {
					var9 = 1;
				} else if ((!var10.equals("bottom")) && (!var10.equals("right"))) {
					var9 = 0;
				} else {
					var9 = 2;
				}

				var4.field1776 = var9;
				var4.field1772 = var3.getInt("font");
				var4.field1769 = class14.method186(var3, "placement");
				this.field1708.add(var4);
			}

		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(Lorg/json/JSONObject;B)V", garbageValue = 
	"64")

	void method3161(JSONObject var1) throws JSONException {
		if (var1 != null) {
			this.field1712 = class14.method186(var1, "clickbounds");
			this.field1711 = var1.getString("endpoint");
			String[] var2 = JSONObject.getNames(var1);

			for (int var3 = 0; var3 < var1.length(); ++var3) {
				if ((!var2[var3].equals("clickbounds")) && (!var2[var3].equals("endpoint"))) {
					try {
						int var4 = var1.getInt(var2[var3]);
						this.field1717.add(new class163(this, var2[var3], var4));
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]);
							if (var5.equals("true")) {
								this.field1717.add(new class163(this, var2[var3], 1));
							} else if (var5.equals("false")) {
								this.field1717.add(new class163(this, var2[var3], 0));
							} else {
								this.field1717.add(new class154(this, var2[var3], var5));
							}
						} catch (Exception var7) {
						}
					}
				}
			}

		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(Lorg/json/JSONObject;S)V", garbageValue = 
	"1459")

	void method3147(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1);

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			try {
				int var4 = var1.getInt(var2[var3]);
				this.field1716.put(var2[var3], var4);
			} catch (Exception var8) {
				try {
					String var5 = var1.getString(var2[var3]);
					if (var5.equals("true")) {
						this.field1716.put(var2[var3], 1);
					} else if (var5.equals("false")) {
						this.field1716.put(var2[var3], 0);
					} else {
						this.field1709.put(var2[var3], var5);
					}
				} catch (Exception var7) {
				}
			}
		}

	}
}