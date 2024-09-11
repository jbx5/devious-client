import java.io.IOException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("ib")
public class class225 {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	static final class225 field2424;
	@ObfuscatedName("ac")
	String field2426;
	@ObfuscatedName("ae")
	String field2415;
	@ObfuscatedName("ag")
	String field2416;
	@ObfuscatedName("am")
	String field2417;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		longValue = 1789175676779998945L
	)
	long field2418;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	AsyncRestClient field2419;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	AsyncHttpResponse field2422;
	@ObfuscatedName("at")
	final int field2421;
	@ObfuscatedName("au")
	final int field2420;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -476456891
	)
	int field2423;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1519499759
	)
	int field2414;
	@ObfuscatedName("az")
	String field2425;
	@ObfuscatedName("ai")
	boolean field2427;

	static {
		field2424 = new class225();
	}

	class225() {
		this.field2426 = "";
		this.field2415 = "";
		this.field2416 = "";
		this.field2417 = "";
		this.field2418 = -1L;
		this.field2421 = 1;
		this.field2420 = 2;
		this.field2423 = 1;
		this.field2414 = 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "113"
	)
	public void method4517(int var1, String var2) {
		this.field2414 = var1;
		this.field2425 = var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "-49"
	)
	public void method4518(boolean var1) {
		this.field2427 = var1;
		this.field2419 = new AsyncRestClient("crmsession", 1, 1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "2066128673"
	)
	void method4519(String var1, String var2, String var3) {
		if (this.field2423 != 2) {
			this.field2426 = var1;
			this.field2415 = var2;
			this.field2416 = var3;
			if (!this.field2426.endsWith("/")) {
				this.field2426 = this.field2426 + "/";
			}

			if (!this.field2415.equals("")) {
				String var4 = this.field2426;
				var4 = var4 + "session/open/" + this.field2415;
				if (this.field2416.equals("")) {
				}

				var4 = var4 + "?userHash=" + this.field2416;

				try {
					this.field2422 = this.method4525(var4);
					this.field2418 = WorldMapElement.method3843();
				} catch (IOException var6) {
					this.field2422 = null;
					this.field2415 = "";
					this.field2416 = "";
				}

			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-20"
	)
	public void method4520() {
		if (this.field2422 == null) {
			if (!this.field2417.isEmpty() && this.field2423 == 1) {
				long var1 = WorldMapElement.method3843();
				long var3 = var1 - this.field2418;
				String var5 = this.field2426;
				var5 = var5 + "session/close/" + this.field2415 + "/" + this.field2417;
				if (this.field2416.isEmpty()) {
					var5 = var5 + "?sessionDuration=" + var3;
				} else {
					var5 = var5 + "?userHash=" + this.field2416 + "&sessionDuration=" + var3;
				}

				try {
					this.field2422 = this.method4525(var5);
				} catch (IOException var7) {
					this.field2423 = 1;
				}
			}

		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "83"
	)
	public void method4535() {
		if (this.field2419 != null) {
			this.field2419.shutdown();
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "755244946"
	)
	void method4522() {
		if (!this.field2417.isEmpty()) {
			String var1 = "";
			switch(this.field2414) {
			case 1:
				var1 = "events/click";
				break;
			case 2:
				var1 = "events/dismissed";
				break;
			case 3:
				var1 = "events/impression";
			}

			if (!this.field2425.isEmpty()) {
				String var2 = this.field2426;
				var2 = var2 + var1 + "/" + this.field2415 + "/" + this.field2417 + "/" + this.field2425 + "?userHash=" + this.field2416;

				try {
					this.field2422 = this.method4525(var2);
				} catch (IOException var4) {
					this.field2423 = 1;
				}

				this.field2423 = 1;
				this.field2414 = 0;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "81"
	)
	public void method4547() {
		if (this.field2422 != null && this.field2422.hasFinished()) {
			if (this.field2422.hasFinished() && this.field2422.await().getResponseCode() == 200 && this.field2417.isEmpty()) {
				String var1 = this.field2422.await().getResponseBody();
				if (var1.isEmpty()) {
					return;
				}

				this.field2417 = var1;
			}

			if (this.field2414 != 0) {
				this.method4522();
			}

		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Z",
		garbageValue = "-13"
	)
	public boolean method4524(String var1) {
		this.method4517(2, var1);
		return true;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lao;",
		garbageValue = "-6369778"
	)
	AsyncHttpResponse method4525(String var1) throws IOException {
		URL var2 = new URL(var1);
		HttpRequest var3 = new HttpRequest(var2, HttpMethod.POST, this.field2427);

		try {
			JSONObject var4 = new JSONObject();
			var3.setPayload(new HttpJsonRequestBody(var4));
		} catch (Exception var5) {
		}

		return this.field2419.submitRequest(var3);
	}

	@ObfuscatedName("ag")
	public static boolean method4527(long var0) {
		boolean var2 = 0L != var0;
		if (var2) {
			boolean var3 = (int)(var0 >>> 16 & 1L) == 1;
			var2 = !var3;
		}

		return var2;
	}
}
