import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("iy")
public class class210 {
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	class219 field2319;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	class221 field2324;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 48483205
	)
	int field2329;
	@ObfuscatedName("aj")
	String field2326;
	@ObfuscatedName("as")
	String field2323;
	@ObfuscatedName("aw")
	String field2328;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lee;"
	)
	UrlRequest field2327;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 732435735
	)
	int field2330;

	public class210() {
		this.field2329 = -1;
		this.field2330 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Lit;",
		garbageValue = "38"
	)
	public class219 method4551() {
		return this.field2319;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Lex;I)Z",
		garbageValue = "-93933799"
	)
	public boolean method4509(String var1, String var2, UrlRequester var3) {
		if (var1 != null && !var1.isEmpty()) {
			if (var3 == null) {
				return false;
			} else {
				this.method4523();

				try {
					this.field2326 = var1;
					this.field2327 = var3.request(new URL(this.field2326));
					this.field2329 = 0;
				} catch (MalformedURLException var5) {
					this.method4523();
					this.field2329 = 4;
					return false;
				}

				if (!var2.isEmpty()) {
					this.field2328 = var2;
				}

				return true;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "0"
	)
	public void method4510(String var1, String var2, String var3) {
		this.field2319 = AsyncHttpResponse.method265();
		this.field2323 = var1;
		this.field2319.method4624(this.field2323, var2, var3);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lex;I)V",
		garbageValue = "-1007861771"
	)
	public void method4511(UrlRequester var1) {
		switch(this.field2329) {
		case 0:
			this.method4534(var1);
			break;
		case 1:
			this.method4524();
			break;
		default:
			return;
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-18"
	)
	public int method4512() {
		return this.field2329;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1103493515"
	)
	public boolean method4513() {
		return this.field2324 != null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1580654649"
	)
	public int method4514(String var1) {
		return this.field2324.field2407.containsKey(var1) ? (Integer)this.field2324.field2407.get(var1) : -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-86"
	)
	public String method4507(String var1) {
		return (String)((String)(this.field2324.field2408.containsKey(var1) ? this.field2324.field2408.get(var1) : null));
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "-49"
	)
	public ArrayList method4516() {
		return this.field2324.field2399;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "-53"
	)
	public ArrayList method4517() {
		return this.field2324.field2404;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "-1081745726"
	)
	public ArrayList method4515() {
		return this.field2324.field2403;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-894138879"
	)
	public String method4533() {
		return this.field2324.field2405;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "-86"
	)
	public float[] method4525() {
		return this.field2324.field2400;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "671010802"
	)
	public String method4521() {
		return this.field2324.method4660();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-15"
	)
	void method4523() {
		this.field2327 = null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lex;S)V",
		garbageValue = "199"
	)
	void method4534(UrlRequester var1) {
		if (this.field2327 != null && this.field2327.isDone()) {
			byte[] var2 = this.field2327.getResponse();
			if (var2 == null) {
				this.method4523();
				this.field2329 = 4;
			} else {
				try {
					HttpJsonRequestBody var3 = new HttpJsonRequestBody(var2);
					JSONObject var4 = var3.getBody();
					if (var4 == null) {
						return;
					}

					try {
						this.field2330 = var4.getInt("version");
					} catch (Exception var7) {
						this.method4523();
						this.field2329 = 6;
						return;
					}

					if (this.field2330 < 2) {
						if (!this.field2324.method4680(var4, this.field2330, var1)) {
							this.field2329 = 6;
						}
					} else if (this.field2330 == 2) {
						class223 var5 = class223.field2421;
						var5.method4714(var4, this.field2330, var1);
						this.field2324 = var5.method4707(this.field2328);
						if (this.field2324 != null) {
							this.method4524();
							this.field2329 = 1;
						} else {
							this.field2329 = 7;
						}
					}
				} catch (UnsupportedEncodingException var8) {
					this.method4523();
					this.field2329 = 6;
					return;
				}

				if (this.field2324 != null) {
					this.field2329 = this.field2324.field2399.size() > 0 ? 1 : 2;
				}

				this.field2327 = null;
			}
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1738825261"
	)
	void method4524() {
		Iterator var1 = this.field2324.field2399.iterator();

		class211 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field2324.field2399.iterator();

				while (var1.hasNext()) {
					var2 = (class211)var1.next();
					if (var2.field2339 != null) {
						byte[] var3 = var2.field2339.getResponse();
						if (var3 != null && var3.length > 0) {
							this.field2329 = 2;
							return;
						}
					}
				}

				this.method4523();
				this.field2329 = 5;
				return;
			}

			var2 = (class211)var1.next();
		} while(var2.field2339 == null || var2.field2339.isDone());

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lex;I)Z",
		garbageValue = "2000700273"
	)
	public boolean method4547(String var1, UrlRequester var2) {
		try {
			JSONObject var3 = (new HttpJsonRequestBody(var1.getBytes())).getBody();

			try {
				this.field2330 = var3.getInt("version");
			} catch (Exception var5) {
				this.method4523();
				this.field2329 = 6;
				return false;
			}

			if (!this.field2324.method4680(var3, this.field2330, var2)) {
				this.field2329 = 6;
			}

			this.field2329 = this.field2324.field2399.size() > 0 ? 1 : 2;
		} catch (UnsupportedEncodingException var6) {
			this.field2329 = 6;
		}

		return this.field2329 < 3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1152025626"
	)
	static void method4556() {
		if (class137.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
			class28.KeyHandler_keyCodes[186] = 57;
			class28.KeyHandler_keyCodes[187] = 27;
			class28.KeyHandler_keyCodes[188] = 71;
			class28.KeyHandler_keyCodes[189] = 26;
			class28.KeyHandler_keyCodes[190] = 72;
			class28.KeyHandler_keyCodes[191] = 73;
			class28.KeyHandler_keyCodes[192] = 58;
			class28.KeyHandler_keyCodes[219] = 42;
			class28.KeyHandler_keyCodes[220] = 74;
			class28.KeyHandler_keyCodes[221] = 43;
			class28.KeyHandler_keyCodes[222] = 59;
			class28.KeyHandler_keyCodes[223] = 28;
		} else {
			class28.KeyHandler_keyCodes[44] = 71;
			class28.KeyHandler_keyCodes[45] = 26;
			class28.KeyHandler_keyCodes[46] = 72;
			class28.KeyHandler_keyCodes[47] = 73;
			class28.KeyHandler_keyCodes[59] = 57;
			class28.KeyHandler_keyCodes[61] = 27;
			class28.KeyHandler_keyCodes[91] = 42;
			class28.KeyHandler_keyCodes[92] = 74;
			class28.KeyHandler_keyCodes[93] = 43;
			class28.KeyHandler_keyCodes[192] = 28;
			class28.KeyHandler_keyCodes[222] = 58;
			class28.KeyHandler_keyCodes[520] = 59;
		}

	}
}
