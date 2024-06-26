import java.io.IOException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("in")
public class class222 {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lin;"
	)
	static final class222 field2393;
	@ObfuscatedName("aq")
	String field2388;
	@ObfuscatedName("ad")
	String field2394;
	@ObfuscatedName("ag")
	String field2381;
	@ObfuscatedName("ak")
	String field2382;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = 5566748389036813035L
	)
	long field2383;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	AsyncRestClient field2384;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lao;"
	)
	AsyncHttpResponse field2385;
	@ObfuscatedName("av")
	final int field2386;
	@ObfuscatedName("ab")
	final int field2387;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1131252391
	)
	int field2391;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1825791855
	)
	int field2389;
	@ObfuscatedName("ac")
	String field2392;
	@ObfuscatedName("ay")
	boolean field2380;

	static {
		field2393 = new class222();
	}

	class222() {
		this.field2388 = "";
		this.field2394 = "";
		this.field2381 = "";
		this.field2382 = "";
		this.field2383 = -1L;
		this.field2386 = 1;
		this.field2387 = 2;
		this.field2391 = 1;
		this.field2389 = 0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "2051417236"
	)
	public void method4244(int var1, String var2) {
		this.field2389 = var1;
		this.field2392 = var2;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1200789998"
	)
	public void method4268(boolean var1) {
		this.field2380 = var1;
		this.field2384 = new AsyncRestClient("crmsession", 1, 1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1863245478"
	)
	void method4265(String var1, String var2, String var3) {
		if (this.field2391 != 2) {
			this.field2388 = var1;
			this.field2394 = var2;
			this.field2381 = var3;
			if (!this.field2388.endsWith("/")) {
				this.field2388 = this.field2388 + "/";
			}

			if (!this.field2394.equals("")) {
				String var4 = this.field2388;
				var4 = var4 + "session/open/" + this.field2394;
				if (this.field2381.equals("")) {
				}

				var4 = var4 + "?userHash=" + this.field2381;

				try {
					this.field2385 = this.method4251(var4);
					this.field2383 = WorldMapData_1.method4861();
				} catch (IOException var6) {
					this.field2385 = null;
					this.field2394 = "";
					this.field2381 = "";
				}

			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "101"
	)
	public void method4247() {
		if (this.field2385 == null) {
			if (!this.field2382.isEmpty() && this.field2391 == 1) {
				long var1 = WorldMapData_1.method4861();
				long var3 = var1 - this.field2383;
				String var5 = this.field2388;
				var5 = var5 + "session/close/" + this.field2394 + "/" + this.field2382;
				if (this.field2381.isEmpty()) {
					var5 = var5 + "?sessionDuration=" + var3;
				} else {
					var5 = var5 + "?userHash=" + this.field2381 + "&sessionDuration=" + var3;
				}

				try {
					this.field2385 = this.method4251(var5);
				} catch (IOException var7) {
					this.field2391 = 1;
				}
			}

		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1098012235"
	)
	public void method4248() {
		if (this.field2384 != null) {
			this.field2384.shutdown();
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-81"
	)
	void method4266() {
		if (!this.field2382.isEmpty()) {
			String var1 = "";
			switch(this.field2389) {
			case 1:
				var1 = "events/click";
				break;
			case 2:
				var1 = "events/dismissed";
				break;
			case 3:
				var1 = "events/impression";
			}

			if (!this.field2392.isEmpty()) {
				String var2 = this.field2388;
				var2 = var2 + var1 + "/" + this.field2394 + "/" + this.field2382 + "/" + this.field2392 + "?userHash=" + this.field2381;

				try {
					this.field2385 = this.method4251(var2);
				} catch (IOException var4) {
					this.field2391 = 1;
				}

				this.field2391 = 1;
				this.field2389 = 0;
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	public void method4261() {
		if (this.field2385 != null && this.field2385.hasFinished()) {
			if (this.field2385.hasFinished() && this.field2385.await().getResponseCode() == 200 && this.field2382.isEmpty()) {
				String var1 = this.field2385.await().getResponseBody();
				if (var1.isEmpty()) {
					return;
				}

				this.field2382 = var1;
			}

			if (this.field2389 != 0) {
				this.method4266();
			}

		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "-1205574720"
	)
	public boolean method4250(String var1) {
		this.method4244(2, var1);
		return true;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lao;",
		garbageValue = "-576200562"
	)
	AsyncHttpResponse method4251(String var1) throws IOException {
		URL var2 = new URL(var1);
		HttpRequest var3 = new HttpRequest(var2, HttpMethod.POST, this.field2380);

		try {
			JSONObject var4 = new JSONObject();
			var3.setPayload(new HttpJsonRequestBody(var4));
		} catch (Exception var5) {
		}

		return this.field2384.submitRequest(var3);
	}
}
