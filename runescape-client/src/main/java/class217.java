import java.io.IOException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("ia")
public class class217 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lia;"
	)
	static final class217 field2340;
	@ObfuscatedName("am")
	String field2335;
	@ObfuscatedName("ap")
	String field2336;
	@ObfuscatedName("af")
	String field2332;
	@ObfuscatedName("aj")
	String field2329;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = 2844132262259161439L
	)
	long field2330;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Law;"
	)
	AsyncRestClient field2331;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	AsyncHttpResponse field2326;
	@ObfuscatedName("ao")
	final int field2333;
	@ObfuscatedName("ae")
	final int field2334;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1486415097
	)
	int field2327;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 873198811
	)
	int field2338;
	@ObfuscatedName("az")
	String field2339;

	static {
		field2340 = new class217();
	}

	class217() {
		this.field2335 = "";
		this.field2336 = "";
		this.field2332 = "";
		this.field2329 = "";
		this.field2330 = -1L;
		this.field2333 = 1;
		this.field2334 = 2;
		this.field2327 = 1;
		this.field2338 = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;S)V",
		garbageValue = "24159"
	)
	public void method4280(int var1, String var2) {
		this.field2338 = var1;
		this.field2339 = var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1146779871"
	)
	public void method4281() {
		this.field2331 = new AsyncRestClient("crmsession", 1, 1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "2090067408"
	)
	void method4282(String var1, String var2, String var3) {
		if (this.field2327 != 2) {
			this.field2335 = var1;
			this.field2336 = var2;
			this.field2332 = var3;
			if (!this.field2335.endsWith("/")) {
				this.field2335 = this.field2335 + "/";
			}

			if (!this.field2336.equals("")) {
				String var4 = this.field2335;
				var4 = var4 + "session/open/" + this.field2336;
				if (this.field2332.equals("")) {
				}

				var4 = var4 + "?userHash=" + this.field2332;

				try {
					this.field2326 = this.method4288(var4);
					this.field2330 = UserComparator9.method2973();
				} catch (IOException var6) {
					this.field2326 = null;
					this.field2336 = "";
					this.field2332 = "";
				}

			}
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "19714"
	)
	public void method4283() {
		if (this.field2326 == null) {
			if (!this.field2329.isEmpty() && this.field2327 == 1) {
				long var1 = UserComparator9.method2973();
				long var3 = var1 - this.field2330;
				String var5 = this.field2335;
				var5 = var5 + "session/close/" + this.field2336 + "/" + this.field2329;
				if (this.field2332.isEmpty()) {
					var5 = var5 + "?sessionDuration=" + var3;
				} else {
					var5 = var5 + "?userHash=" + this.field2332 + "&sessionDuration=" + var3;
				}

				try {
					this.field2326 = this.method4288(var5);
				} catch (IOException var7) {
					this.field2327 = 1;
				}
			}

		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-433540191"
	)
	public void method4284() {
		this.field2331.shutdown();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-79"
	)
	void method4285() {
		if (!this.field2329.isEmpty()) {
			String var1 = "";
			switch(this.field2338) {
			case 1:
				var1 = "events/click";
				break;
			case 2:
				var1 = "events/dismissed";
				break;
			case 3:
				var1 = "events/impression";
			}

			if (!this.field2339.isEmpty()) {
				String var2 = this.field2335;
				var2 = var2 + var1 + "/" + this.field2336 + "/" + this.field2329 + "/" + this.field2339 + "?userHash=" + this.field2332;

				try {
					this.field2326 = this.method4288(var2);
				} catch (IOException var4) {
					this.field2327 = 1;
				}

				this.field2327 = 1;
				this.field2338 = 0;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1661390703"
	)
	public void method4286() {
		if (this.field2326 != null && this.field2326.hasFinished()) {
			if (this.field2326.hasFinished() && this.field2326.await().getResponseCode() == 200 && this.field2329.isEmpty()) {
				String var1 = this.field2326.await().getResponseBody();
				if (var1.isEmpty()) {
					return;
				}

				this.field2329 = var1;
			}

			if (this.field2338 != 0) {
				this.method4285();
			}

		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "933249240"
	)
	public boolean method4308(String var1) {
		this.method4280(2, var1);
		return true;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Lay;",
		garbageValue = "-104"
	)
	AsyncHttpResponse method4288(String var1) throws IOException {
		URL var2 = new URL(var1);
		HttpRequest var3 = new HttpRequest(var2, HttpMethod.POST);

		try {
			JSONObject var4 = new JSONObject();
			var3.setPayload(new HttpJsonRequestBody(var4));
		} catch (Exception var5) {
		}

		return this.field2331.submitRequest(var3);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZB)V",
		garbageValue = "-80"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		class353.method6906(var0, var1, "openjs", var2);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Low;III)[Luc;",
		garbageValue = "-52378629"
	)
	public static SpritePixels[] method4289(AbstractArchive var0, int var1, int var2) {
		return !Varcs.method2829(var0, var1, var2) ? null : ItemComposition.method4054();
	}
}
