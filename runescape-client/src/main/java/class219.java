import java.io.IOException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("im")
public class class219 {
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lim;"
	)
	static final class219 field2371;
	@ObfuscatedName("aq")
	String field2367;
	@ObfuscatedName("aw")
	String field2360;
	@ObfuscatedName("al")
	String field2365;
	@ObfuscatedName("ai")
	String field2358;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = -1510457450721933301L
	)
	long field2362;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	AsyncRestClient field2363;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	AsyncHttpResponse field2364;
	@ObfuscatedName("az")
	final int field2368;
	@ObfuscatedName("ao")
	final int field2359;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 597965763
	)
	int field2366;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1018674229
	)
	int field2369;
	@ObfuscatedName("an")
	String field2370;
	@ObfuscatedName("am")
	boolean field2372;

	static {
		field2371 = new class219();
	}

	class219() {
		this.field2367 = "";
		this.field2360 = "";
		this.field2365 = "";
		this.field2358 = "";
		this.field2362 = -1L;
		this.field2368 = 1;
		this.field2359 = 2;
		this.field2366 = 1;
		this.field2369 = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "1018900511"
	)
	public void method4262(int var1, String var2) {
		this.field2369 = var1;
		this.field2370 = var2;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1351678430"
	)
	public void method4263(boolean var1) {
		this.field2372 = var1;
		this.field2363 = new AsyncRestClient("crmsession", 1, 1);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1191721460"
	)
	void method4264(String var1, String var2, String var3) {
		if (this.field2366 != 2) {
			this.field2367 = var1;
			this.field2360 = var2;
			this.field2365 = var3;
			if (!this.field2367.endsWith("/")) {
				this.field2367 = this.field2367 + "/";
			}

			if (!this.field2360.equals("")) {
				String var4 = this.field2367;
				var4 = var4 + "session/open/" + this.field2360;
				if (this.field2365.equals("")) {
				}

				var4 = var4 + "?userHash=" + this.field2365;

				try {
					this.field2364 = this.method4277(var4);
					this.field2362 = SecureRandomCallable.method2320();
				} catch (IOException var6) {
					this.field2364 = null;
					this.field2360 = "";
					this.field2365 = "";
				}

			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1886033696"
	)
	public void method4265() {
		if (this.field2364 == null) {
			if (!this.field2358.isEmpty() && this.field2366 == 1) {
				long var1 = SecureRandomCallable.method2320();
				long var3 = var1 - this.field2362;
				String var5 = this.field2367;
				var5 = var5 + "session/close/" + this.field2360 + "/" + this.field2358;
				if (this.field2365.isEmpty()) {
					var5 = var5 + "?sessionDuration=" + var3;
				} else {
					var5 = var5 + "?userHash=" + this.field2365 + "&sessionDuration=" + var3;
				}

				try {
					this.field2364 = this.method4277(var5);
				} catch (IOException var7) {
					this.field2366 = 1;
				}
			}

		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	public void method4266() {
		if (this.field2363 != null) {
			this.field2363.shutdown();
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1756755184"
	)
	void method4289() {
		if (!this.field2358.isEmpty()) {
			String var1 = "";
			switch(this.field2369) {
			case 1:
				var1 = "events/click";
				break;
			case 2:
				var1 = "events/dismissed";
				break;
			case 3:
				var1 = "events/impression";
			}

			if (!this.field2370.isEmpty()) {
				String var2 = this.field2367;
				var2 = var2 + var1 + "/" + this.field2360 + "/" + this.field2358 + "/" + this.field2370 + "?userHash=" + this.field2365;

				try {
					this.field2364 = this.method4277(var2);
				} catch (IOException var4) {
					this.field2366 = 1;
				}

				this.field2366 = 1;
				this.field2369 = 0;
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "996137810"
	)
	public void method4268() {
		if (this.field2364 != null && this.field2364.hasFinished()) {
			if (this.field2364.hasFinished() && this.field2364.await().getResponseCode() == 200 && this.field2358.isEmpty()) {
				String var1 = this.field2364.await().getResponseBody();
				if (var1.isEmpty()) {
					return;
				}

				this.field2358 = var1;
			}

			if (this.field2369 != 0) {
				this.method4289();
			}

		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "1524563464"
	)
	public boolean method4274(String var1) {
		this.method4262(2, var1);
		return true;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Lad;",
		garbageValue = "-25"
	)
	AsyncHttpResponse method4277(String var1) throws IOException {
		URL var2 = new URL(var1);
		HttpRequest var3 = new HttpRequest(var2, HttpMethod.POST, this.field2372);

		try {
			JSONObject var4 = new JSONObject();
			var3.setPayload(new HttpJsonRequestBody(var4));
		} catch (Exception var5) {
		}

		return this.field2363.submitRequest(var3);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2011298012"
	)
	static int method4299(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 127) {
				var1 = 127;
			}

			var1 = 127 - var1;
			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}
}
