import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("il")
public class class210 {
	@ObfuscatedName("ev")
	@ObfuscatedSignature(
		descriptor = "Lrr;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	class219 field2296;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	class221 field2300;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1935079169
	)
	int field2301;
	@ObfuscatedName("aj")
	String field2302;
	@ObfuscatedName("af")
	String field2303;
	@ObfuscatedName("ax")
	String field2304;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	UrlRequest field2307;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 39900149
	)
	int field2305;

	public class210() {
		this.field2301 = -1;
		this.field2305 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Lim;",
		garbageValue = "-502019476"
	)
	public class219 method4161() {
		return this.field2296;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Lel;I)Z",
		garbageValue = "-118439298"
	)
	public boolean method4174(String var1, String var2, UrlRequester var3) {
		if (var1 != null && !var1.isEmpty()) {
			if (var3 == null) {
				return false;
			} else {
				this.method4142();

				try {
					this.field2302 = var1;
					this.field2307 = var3.request(new URL(this.field2302));
					this.field2301 = 0;
				} catch (MalformedURLException var5) {
					this.method4142();
					this.field2301 = 4;
					return false;
				}

				if (!var2.isEmpty()) {
					this.field2304 = var2;
				}

				return true;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "101"
	)
	public void method4129(String var1, String var2, String var3) {
		this.field2296 = VarbitComposition.method3830();
		this.field2303 = var1;
		this.field2296.method4264(this.field2303, var2, var3);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lel;I)V",
		garbageValue = "-809833952"
	)
	public void method4132(UrlRequester var1) {
		switch(this.field2301) {
		case 0:
			this.method4138(var1);
			break;
		case 1:
			this.method4144();
			break;
		default:
			return;
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2049217182"
	)
	public int method4162() {
		return this.field2301;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-121"
	)
	public int method4134(String var1) {
		return this.field2300.field2389.containsKey(var1) ? (Integer)this.field2300.field2389.get(var1) : -1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-1954864910"
	)
	public String method4135(String var1) {
		return (String)((String)(this.field2300.field2388.containsKey(var1) ? this.field2300.field2388.get(var1) : null));
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "-447746548"
	)
	public ArrayList method4136() {
		return this.field2300.field2385;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "111"
	)
	public ArrayList method4146() {
		return this.field2300.field2386;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "-6"
	)
	public ArrayList method4163() {
		return this.field2300.field2384;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "126321540"
	)
	public String method4139() {
		return this.field2300.field2387;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)[F",
		garbageValue = "34"
	)
	public float[] method4140() {
		return this.field2300.field2382;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "112414850"
	)
	public String method4141() {
		return this.field2300.method4315();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2064016499"
	)
	void method4142() {
		this.field2307 = null;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lel;B)V",
		garbageValue = "16"
	)
	void method4138(UrlRequester var1) {
		if (this.field2307 != null && this.field2307.isDone()) {
			byte[] var2 = this.field2307.getResponse();
			if (var2 == null) {
				this.method4142();
				this.field2301 = 4;
			} else {
				try {
					HttpJsonRequestBody var3 = new HttpJsonRequestBody(var2);
					JSONObject var4 = var3.getBody();
					if (var4 == null) {
						return;
					}

					try {
						this.field2305 = var4.getInt("version");
					} catch (Exception var7) {
						this.method4142();
						this.field2301 = 6;
						return;
					}

					if (this.field2305 < 2) {
						if (!this.field2300.method4304(var4, this.field2305, var1)) {
							this.field2301 = 6;
						}
					} else if (this.field2305 == 2) {
						class223 var5 = class223.field2401;
						var5.method4353(var4, this.field2305, var1);
						this.field2300 = var5.method4348(this.field2304);
						if (this.field2300 != null) {
							this.method4144();
							this.field2301 = 1;
						} else {
							this.field2301 = 7;
						}
					}
				} catch (UnsupportedEncodingException var8) {
					this.method4142();
					this.field2301 = 6;
					return;
				}

				if (this.field2300 != null) {
					this.field2301 = this.field2300.field2385.size() > 0 ? 1 : 2;
				}

				this.field2307 = null;
			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method4144() {
		Iterator var1 = this.field2300.field2385.iterator();

		class211 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field2300.field2385.iterator();

				while (var1.hasNext()) {
					var2 = (class211)var1.next();
					if (var2.field2311 != null) {
						byte[] var3 = var2.field2311.getResponse();
						if (var3 != null && var3.length > 0) {
							this.field2301 = 2;
							return;
						}
					}
				}

				this.method4142();
				this.field2301 = 5;
				return;
			}

			var2 = (class211)var1.next();
		} while(var2.field2311 == null || var2.field2311.isDone());

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lel;I)Z",
		garbageValue = "-871874771"
	)
	public boolean method4145(String var1, UrlRequester var2) {
		try {
			JSONObject var3 = (new HttpJsonRequestBody(var1.getBytes())).getBody();

			try {
				this.field2305 = var3.getInt("version");
			} catch (Exception var5) {
				this.method4142();
				this.field2301 = 6;
				return false;
			}

			if (!this.field2300.method4304(var3, this.field2305, var2)) {
				this.field2301 = 6;
			}

			this.field2301 = this.field2300.field2385.size() > 0 ? 1 : 2;
		} catch (UnsupportedEncodingException var6) {
			this.field2301 = 6;
		}

		return this.field2301 < 3;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "625151772"
	)
	static final int method4166(int var0, int var1) {
		int var2 = var1 * 57 + var0;
		var2 ^= var2 << 13;
		int var3 = var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 255;
	}
}
