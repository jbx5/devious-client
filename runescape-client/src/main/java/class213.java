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

@ObfuscatedName("is")
public class class213 {
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	class222 field2335;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	class224 field2331;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1575492419
	)
	int field2332;
	@ObfuscatedName("ah")
	String field2330;
	@ObfuscatedName("az")
	String field2334;
	@ObfuscatedName("ax")
	String field2325;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	UrlRequest field2336;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 407404605
	)
	int field2333;

	public class213() {
		this.field2332 = -1;
		this.field2333 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Lin;",
		garbageValue = "-1443092087"
	)
	public class222 method4120() {
		return this.field2335;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Lea;I)Z",
		garbageValue = "1277915291"
	)
	public boolean method4121(String var1, String var2, UrlRequester var3) {
		if (var1 != null && !var1.isEmpty()) {
			if (var3 == null) {
				return false;
			} else {
				this.method4143();

				try {
					this.field2330 = var1;
					this.field2336 = var3.request(new URL(this.field2330));
					this.field2332 = 0;
				} catch (MalformedURLException var5) {
					this.method4143();
					this.field2332 = 4;
					return false;
				}

				if (!var2.isEmpty()) {
					this.field2325 = var2;
				}

				return true;
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "-41"
	)
	public void method4122(String var1, String var2, String var3) {
		this.field2335 = class433.method8077();
		this.field2334 = var1;
		this.field2335.method4265(this.field2334, var2, var3);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)V",
		garbageValue = "-266925953"
	)
	public void method4123(UrlRequester var1) {
		switch(this.field2332) {
		case 0:
			this.method4138(var1);
			break;
		case 1:
			this.method4135();
			break;
		default:
			return;
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "102"
	)
	public int method4124() {
		return this.field2332;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "-1302658772"
	)
	public int method4125(String var1) {
		return this.field2331.field2412.containsKey(var1) ? (Integer)this.field2331.field2412.get(var1) : -1;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "-599672689"
	)
	public String method4126(String var1) {
		return (String)((String)(this.field2331.field2408.containsKey(var1) ? this.field2331.field2408.get(var1) : null));
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "4"
	)
	public ArrayList method4127() {
		return this.field2331.field2407;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "30"
	)
	public ArrayList method4128() {
		return this.field2331.field2406;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "1151021088"
	)
	public ArrayList method4129() {
		return this.field2331.field2409;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1013855235"
	)
	public String method4130() {
		return this.field2331.field2403;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "-1294460518"
	)
	public float[] method4131() {
		return this.field2331.field2410;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-19"
	)
	public String method4132() {
		return this.field2331.method4282();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "876176854"
	)
	void method4143() {
		this.field2336 = null;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lea;I)V",
		garbageValue = "-1355714398"
	)
	void method4138(UrlRequester var1) {
		if (this.field2336 != null && this.field2336.isDone()) {
			byte[] var2 = this.field2336.getResponse();
			if (var2 == null) {
				this.method4143();
				this.field2332 = 4;
			} else {
				try {
					HttpJsonRequestBody var3 = new HttpJsonRequestBody(var2);
					JSONObject var4 = var3.getBody();
					if (var4 == null) {
						return;
					}

					try {
						this.field2333 = var4.getInt("version");
					} catch (Exception var7) {
						this.method4143();
						this.field2332 = 6;
						return;
					}

					if (this.field2333 < 2) {
						if (!this.field2331.method4277(var4, this.field2333, var1)) {
							this.field2332 = 6;
						}
					} else if (this.field2333 == 2) {
						class226 var5 = class226.field2423;
						var5.method4317(var4, this.field2333, var1);
						this.field2331 = var5.method4310(this.field2325);
						if (this.field2331 != null) {
							this.method4135();
							this.field2332 = 1;
						} else {
							this.field2332 = 7;
						}
					}
				} catch (UnsupportedEncodingException var8) {
					this.method4143();
					this.field2332 = 6;
					return;
				}

				if (this.field2331 != null) {
					this.field2332 = this.field2331.field2407.size() > 0 ? 1 : 2;
				}

				this.field2336 = null;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1081327423"
	)
	void method4135() {
		Iterator var1 = this.field2331.field2407.iterator();

		class214 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field2331.field2407.iterator();

				while (var1.hasNext()) {
					var2 = (class214)var1.next();
					if (var2.field2340 != null) {
						byte[] var3 = var2.field2340.getResponse();
						if (var3 != null && var3.length > 0) {
							this.field2332 = 2;
							return;
						}
					}
				}

				this.method4143();
				this.field2332 = 5;
				return;
			}

			var2 = (class214)var1.next();
		} while(var2.field2340 == null || var2.field2340.isDone());

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lea;S)Z",
		garbageValue = "-31567"
	)
	public boolean method4136(String var1, UrlRequester var2) {
		try {
			JSONObject var3 = (new HttpJsonRequestBody(var1.getBytes())).getBody();

			try {
				this.field2333 = var3.getInt("version");
			} catch (Exception var5) {
				this.method4143();
				this.field2332 = 6;
				return false;
			}

			if (!this.field2331.method4277(var3, this.field2333, var2)) {
				this.field2332 = 6;
			}

			this.field2332 = this.field2331.field2407.size() > 0 ? 1 : 2;
		} catch (UnsupportedEncodingException var6) {
			this.field2332 = 6;
		}

		return this.field2332 < 3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(BI)Ljb;",
		garbageValue = "-1669252935"
	)
	public static class238 method4167(byte var0) {
		class238[] var1 = class238.field2508;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			class238 var3 = var1[var2];
			if (var0 == var3.field2515) {
				return var3;
			}
		}

		throw new RuntimeException("Could not find MoveSpeed with ID " + var0);
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(ZS)V",
		garbageValue = "3284"
	)
	@Export("setAuthenticationScheme")
	static final void setAuthenticationScheme(boolean var0) {
		if (var0) {
			Client.authenticationScheme = Login.rememberUsername ? AuthenticationScheme.TOKEN_REMEMBER : AuthenticationScheme.TOKEN;
		} else {
			Client.authenticationScheme = class105.clientPreferences.containsKey(Login.Login_username) ? AuthenticationScheme.USERNAME_PASSWORD_REMEMBER : AuthenticationScheme.USERNAME_PASSWORD;
		}

	}
}
