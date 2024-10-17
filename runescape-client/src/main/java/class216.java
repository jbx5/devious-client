import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("ic")
public class class216 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	class225 field2355;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lik;"
	)
	class227 field2356;
	@ObfuscatedName("an")
	int field2350;
	@ObfuscatedName("ao")
	String field2358;
	@ObfuscatedName("af")
	String field2359;
	@ObfuscatedName("ar")
	String field2354;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	UrlRequest field2360;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -659724977
	)
	int field2362;

	public class216() {
		this.field2350 = 148077623;
		this.field2362 = 0;
	}

	@ObfuscatedSignature(
		descriptor = "(Lic;)V"
	)
	public class216(class216 var1) {
		this.field2350 = 148077623;
		this.field2362 = 0;
		if (var1 != null) {
			this.field2355 = var1.field2355;
			this.field2356 = var1.field2356;
			this.field2350 = var1.field2350;
			this.field2358 = var1.field2358;
			this.field2359 = var1.field2359;
			this.field2354 = var1.field2354;
			this.field2360 = null;
			this.field2362 = var1.field2362;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lit;",
		garbageValue = "2106454159"
	)
	public class225 method4471() {
		return this.field2355;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Lex;I)Z",
		garbageValue = "135497712"
	)
	public boolean method4426(String var1, String var2, UrlRequester var3) {
		if (var1 != null && !var1.isEmpty()) {
			if (var3 == null) {
				return false;
			} else {
				this.method4428();

				try {
					this.field2358 = var1;
					this.field2360 = var3.request(new URL(this.field2358));
					this.field2350 = 0;
				} catch (MalformedURLException var5) {
					this.method4428();
					this.field2350 = -592310492;
					return false;
				}

				if (!var2.isEmpty()) {
					this.field2354 = var2;
				}

				return true;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "2061018491"
	)
	public void method4427(String var1, String var2, String var3) {
		this.field2355 = class417.method8077();
		this.field2359 = var1;
		this.field2355.method4563(this.field2359, var2, var3);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lex;B)V",
		garbageValue = "-40"
	)
	public void method4439(UrlRequester var1) {
		switch(this.field2350 * -1016658311) {
		case 0:
			this.method4440(var1);
			break;
		case 1:
			this.method4478();
			break;
		default:
			return;
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "404998728"
	)
	public int method4429() {
		return this.field2350 * -1016658311;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "96"
	)
	public boolean method4430() {
		return this.field2356 != null;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-126"
	)
	public int method4431(String var1) {
		return this.field2356.field2442.containsKey(var1) ? (Integer)this.field2356.field2442.get(var1) : -1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1914319099"
	)
	public String method4432(String var1) {
		return (String)((String)(this.field2356.field2444.containsKey(var1) ? this.field2356.field2444.get(var1) : null));
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "1328020706"
	)
	public ArrayList method4434() {
		return this.field2356.field2439;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "-1594532376"
	)
	public ArrayList method4462() {
		return this.field2356.field2440;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "7"
	)
	public ArrayList method4472() {
		return this.field2356.field2436;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-57"
	)
	public String method4480() {
		return this.field2356.field2441;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "-82"
	)
	public float[] method4481() {
		return this.field2356.field2443;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1092555771"
	)
	public String method4424() {
		return this.field2356.method4591();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "26121"
	)
	void method4428() {
		this.field2360 = null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lex;I)V",
		garbageValue = "-923157843"
	)
	void method4440(UrlRequester var1) {
		if (this.field2360 != null && this.field2360.isDone()) {
			byte[] var2 = this.field2360.getResponse();
			if (var2 == null) {
				this.method4428();
				this.field2350 = -592310492;
			} else {
				try {
					HttpJsonRequestBody var3 = new HttpJsonRequestBody(var2);
					JSONObject var4 = var3.getBody();
					if (var4 == null) {
						return;
					}

					try {
						this.field2362 = var4.getInt("version");
					} catch (Exception var6) {
						this.method4428();
						this.field2350 = -888465738;
						return;
					}

					if (this.field2362 < 2) {
						if (!this.field2356.method4594(var4, this.field2362, var1)) {
							this.field2350 = -888465738;
						}
					} else if (this.field2362 == 2) {
						class229 var5 = HttpResponse.method292();
						var5.method4628(var4, this.field2362, var1);
						this.field2356 = var5.method4644(this.field2354);
						if (this.field2356 != null) {
							this.method4478();
							this.field2350 = -148077623;
						} else {
							this.field2350 = -1036543361;
						}
					}
				} catch (UnsupportedEncodingException var7) {
					this.method4428();
					this.field2350 = -888465738;
					return;
				}

				if (this.field2356 != null) {
					this.field2350 = (this.field2356.field2439.size() > 0 ? 1 : 2) * -148077623;
				}

				this.field2360 = null;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-107"
	)
	void method4478() {
		Iterator var1 = this.field2356.field2439.iterator();

		class217 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field2356.field2439.iterator();

				while (var1.hasNext()) {
					var2 = (class217)var1.next();
					if (var2.field2364 != null) {
						byte[] var3 = var2.field2364.getResponse();
						if (var3 != null && var3.length > 0) {
							this.field2350 = -296155246;
							return;
						}
					}
				}

				this.method4428();
				this.field2350 = -740388115;
				return;
			}

			var2 = (class217)var1.next();
		} while(var2.field2364 == null || var2.field2364.isDone());

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lex;I)Z",
		garbageValue = "-887985300"
	)
	public boolean method4442(String var1, UrlRequester var2) {
		try {
			JSONObject var3 = (new HttpJsonRequestBody(var1.getBytes())).getBody();

			try {
				this.field2362 = var3.getInt("version");
			} catch (Exception var5) {
				this.method4428();
				this.field2350 = -888465738;
				return false;
			}

			if (!this.field2356.method4594(var3, this.field2362, var2)) {
				this.field2350 = -888465738;
			}

			this.field2350 = (this.field2356.field2439.size() > 0 ? 1 : 2) * -148077623;
		} catch (UnsupportedEncodingException var6) {
			this.field2350 = -888465738;
		}

		return this.field2350 * -1016658311 < 3;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "951099002"
	)
	static final int method4477(int var0, int var1, int var2, int var3) {
		int var4 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var2 * 1024 / var3] >> 1;
		return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16);
	}
}
