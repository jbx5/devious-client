import java.io.IOException;
import java.net.URL;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("it")
public class class219 {
	@ObfuscatedName("wy")
	@ObfuscatedSignature(
		descriptor = "Ltb;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	static final class219 field2375;
	@ObfuscatedName("ug")
	@ObfuscatedGetter(
		intValue = -1548377285
	)
	static int field2387;
	@ObfuscatedName("ab")
	String field2380;
	@ObfuscatedName("ay")
	String field2376;
	@ObfuscatedName("an")
	String field2377;
	@ObfuscatedName("au")
	String field2385;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		longValue = 989609258048853115L
	)
	long field2374;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Law;"
	)
	AsyncRestClient field2378;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	AsyncHttpResponse field2379;
	@ObfuscatedName("ac")
	final int field2373;
	@ObfuscatedName("ae")
	final int field2381;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1236279591
	)
	int field2382;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 787495125
	)
	int field2383;
	@ObfuscatedName("af")
	String field2384;
	@ObfuscatedName("ah")
	boolean field2386;

	static {
		field2375 = new class219();
	}

	class219() {
		this.field2380 = "";
		this.field2376 = "";
		this.field2377 = "";
		this.field2385 = "";
		this.field2374 = -1L;
		this.field2373 = 1;
		this.field2381 = 2;
		this.field2382 = 1;
		this.field2383 = 0;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;B)V",
		garbageValue = "42"
	)
	public void method4622(int var1, String var2) {
		this.field2383 = var1;
		this.field2384 = var2;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "39"
	)
	public void method4623(boolean var1) {
		this.field2386 = var1;
		this.field2378 = new AsyncRestClient("crmsession", 1, 1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "807826783"
	)
	void method4624(String var1, String var2, String var3) {
		if (this.field2382 != 2) {
			this.field2380 = var1;
			this.field2376 = var2;
			this.field2377 = var3;
			if (!this.field2380.endsWith("/")) {
				this.field2380 = this.field2380 + "/";
			}

			if (!this.field2376.equals("")) {
				String var4 = this.field2380;
				var4 = var4 + "session/open/" + this.field2376;
				if (this.field2377.equals("")) {
				}

				var4 = var4 + "?userHash=" + this.field2377;

				try {
					this.field2379 = this.method4629(var4);
					this.field2374 = RouteStrategy.method5439();
				} catch (IOException var6) {
					this.field2379 = null;
					this.field2376 = "";
					this.field2377 = "";
				}

			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2134039678"
	)
	public void method4625() {
		if (this.field2379 == null) {
			if (!this.field2385.isEmpty() && this.field2382 == 1) {
				long var1 = RouteStrategy.method5439();
				long var3 = var1 - this.field2374;
				String var5 = this.field2380;
				var5 = var5 + "session/close/" + this.field2376 + "/" + this.field2385;
				if (this.field2377.isEmpty()) {
					var5 = var5 + "?sessionDuration=" + var3;
				} else {
					var5 = var5 + "?userHash=" + this.field2377 + "&sessionDuration=" + var3;
				}

				try {
					this.field2379 = this.method4629(var5);
				} catch (IOException var7) {
					this.field2382 = 1;
				}
			}

		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1829770167"
	)
	public void method4626() {
		if (this.field2378 != null) {
			this.field2378.shutdown();
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-124"
	)
	void method4654() {
		if (!this.field2385.isEmpty()) {
			String var1 = "";
			switch(this.field2383) {
			case 1:
				var1 = "events/click";
				break;
			case 2:
				var1 = "events/dismissed";
				break;
			case 3:
				var1 = "events/impression";
			}

			if (!this.field2384.isEmpty()) {
				String var2 = this.field2380;
				var2 = var2 + var1 + "/" + this.field2376 + "/" + this.field2385 + "/" + this.field2384 + "?userHash=" + this.field2377;

				try {
					this.field2379 = this.method4629(var2);
				} catch (IOException var4) {
					this.field2382 = 1;
				}

				this.field2382 = 1;
				this.field2383 = 0;
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2068563090"
	)
	public void method4648() {
		if (this.field2379 != null && this.field2379.hasFinished()) {
			if (this.field2379.hasFinished() && this.field2379.await().getResponseCode() == 200 && this.field2385.isEmpty()) {
				String var1 = this.field2379.await().getResponseBody();
				if (var1.isEmpty()) {
					return;
				}

				this.field2385 = var1;
			}

			if (this.field2383 != 0) {
				this.method4654();
			}

		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "444075278"
	)
	public boolean method4628(String var1) {
		this.method4622(2, var1);
		return true;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lag;",
		garbageValue = "572554103"
	)
	AsyncHttpResponse method4629(String var1) throws IOException {
		URL var2 = new URL(var1);
		HttpRequest var3 = new HttpRequest(var2, HttpMethod.POST, this.field2386);

		try {
			JSONObject var4 = new JSONObject();
			var3.setPayload(new HttpJsonRequestBody(var4));
		} catch (Exception var5) {
		}

		return this.field2378.submitRequest(var3);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Date;I)Z",
		garbageValue = "-201811719"
	)
	static boolean method4650(Date var0) {
		Date var1 = class6.method39();
		return var0.after(var1);
	}
}
