import java.io.IOException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("it")
public class class225 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	static final class225 field2425;
	@ObfuscatedName("ap")
	String field2421;
	@ObfuscatedName("aw")
	String field2413;
	@ObfuscatedName("ak")
	String field2412;
	@ObfuscatedName("aj")
	String field2415;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = -2107600156133558187L
	)
	long field2416;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	AsyncRestClient field2419;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	AsyncHttpResponse field2418;
	@ObfuscatedName("ae")
	final int field2424;
	@ObfuscatedName("am")
	final int field2420;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 251311377
	)
	int field2414;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1989593079
	)
	int field2423;
	@ObfuscatedName("ab")
	String field2422;
	@ObfuscatedName("ag")
	boolean field2426;

	static {
		field2425 = new class225();
	}

	class225() {
		this.field2421 = "";
		this.field2413 = "";
		this.field2412 = "";
		this.field2415 = "";
		this.field2416 = -1L;
		this.field2424 = 1;
		this.field2420 = 2;
		this.field2414 = 1;
		this.field2423 = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "-92"
	)
	public void method4561(int var1, String var2) {
		this.field2423 = var1;
		this.field2422 = var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "192519777"
	)
	public void method4589(boolean var1) {
		this.field2426 = var1;
		this.field2419 = new AsyncRestClient("crmsession", 1, 1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1058759662"
	)
	void method4563(String var1, String var2, String var3) {
		if (this.field2414 != 2) {
			this.field2421 = var1;
			this.field2413 = var2;
			this.field2412 = var3;
			if (!this.field2421.endsWith("/")) {
				this.field2421 = this.field2421 + "/";
			}

			if (!this.field2413.equals("")) {
				String var4 = this.field2421;
				var4 = var4 + "session/open/" + this.field2413;
				if (this.field2412.equals("")) {
				}

				var4 = var4 + "?userHash=" + this.field2412;

				try {
					this.field2418 = this.method4569(var4);
					this.field2416 = class77.method2338();
				} catch (IOException var6) {
					this.field2418 = null;
					this.field2413 = "";
					this.field2412 = "";
				}

			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1758962976"
	)
	public void method4572() {
		if (this.field2418 == null) {
			if (!this.field2415.isEmpty() && this.field2414 == 1) {
				long var1 = class77.method2338();
				long var3 = var1 - this.field2416;
				String var5 = this.field2421;
				var5 = var5 + "session/close/" + this.field2413 + "/" + this.field2415;
				if (this.field2412.isEmpty()) {
					var5 = var5 + "?sessionDuration=" + var3;
				} else {
					var5 = var5 + "?userHash=" + this.field2412 + "&sessionDuration=" + var3;
				}

				try {
					this.field2418 = this.method4569(var5);
				} catch (IOException var7) {
					this.field2414 = 1;
				}
			}

		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1201595641"
	)
	public void method4565() {
		if (this.field2419 != null) {
			this.field2419.shutdown();
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1931360034"
	)
	void method4582() {
		if (!this.field2415.isEmpty()) {
			String var1 = "";
			switch(this.field2423) {
			case 1:
				var1 = "events/click";
				break;
			case 2:
				var1 = "events/dismissed";
				break;
			case 3:
				var1 = "events/impression";
			}

			if (!this.field2422.isEmpty()) {
				String var2 = this.field2421;
				var2 = var2 + var1 + "/" + this.field2413 + "/" + this.field2415 + "/" + this.field2422 + "?userHash=" + this.field2412;

				try {
					this.field2418 = this.method4569(var2);
				} catch (IOException var4) {
					this.field2414 = 1;
				}

				this.field2414 = 1;
				this.field2423 = 0;
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	public void method4567() {
		if (this.field2418 != null && this.field2418.hasFinished()) {
			if (this.field2418.hasFinished() && this.field2418.await().getResponseCode() == 200 && this.field2415.isEmpty()) {
				String var1 = this.field2418.await().getResponseBody();
				if (var1.isEmpty()) {
					return;
				}

				this.field2415 = var1;
			}

			if (this.field2423 != 0) {
				this.method4582();
			}

		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "158971362"
	)
	public boolean method4568(String var1) {
		this.method4561(2, var1);
		return true;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lad;",
		garbageValue = "-100585374"
	)
	AsyncHttpResponse method4569(String var1) throws IOException {
		URL var2 = new URL(var1);
		HttpRequest var3 = new HttpRequest(var2, HttpMethod.POST, this.field2426);

		try {
			JSONObject var4 = new JSONObject();
			var3.setPayload(new HttpJsonRequestBody(var4));
		} catch (Exception var5) {
		}

		return this.field2419.submitRequest(var3);
	}
}
