import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qy")
@Implements("HttpHeaders")
public class HttpHeaders {
	@ObfuscatedName("fn")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	static Archive field4743;
	@ObfuscatedName("at")
	@Export("headers")
	final Map headers;
	@ObfuscatedName("an")
	@Export("acceptHeaderValues")
	final Map acceptHeaderValues;
	@ObfuscatedName("ao")
	@Export("decimalFormat")
	final DecimalFormat decimalFormat;

	public HttpHeaders() {
		this.headers = new HashMap();
		this.acceptHeaderValues = new HashMap();
		this.decimalFormat = new DecimalFormat();
		this.decimalFormat.setMaximumFractionDigits(2);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljavax/net/ssl/HttpsURLConnection;I)V",
		garbageValue = "1542041279"
	)
	@Export("setRequestProperties")
	public void setRequestProperties(HttpsURLConnection var1) {
		Iterator var2 = this.headers.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next();
			var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue());
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Map;",
		garbageValue = "1"
	)
	@Export("getHeaders")
	public Map getHeaders() {
		return this.headers;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "-49"
	)
	@Export("header")
	public void header(String var1, String var2) {
		if (var1 != null && !var1.isEmpty()) {
			this.headers.put(var1, var2 != null ? var2 : "");
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "1"
	)
	@Export("removeHeader")
	public void removeHeader(String var1) {
		if (var1 != null && !var1.isEmpty()) {
			this.headers.remove(var1);
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lqg;Ljava/lang/String;I)V",
		garbageValue = "-371767513"
	)
	@Export("authenticationHeader")
	void authenticationHeader(HttpAuthenticationHeader var1, String var2) {
		String var3 = String.format("%s %s", var1.getKey(), var2);
		this.header("Authorization", var3);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-15"
	)
	@Export("basicAuthentication")
	public void basicAuthentication(String var1) {
		this.authenticationHeader(HttpAuthenticationHeader.BASIC, var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1950319585"
	)
	@Export("bearerToken")
	public void bearerToken(String var1) {
		this.authenticationHeader(HttpAuthenticationHeader.BEARER, var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lsv;I)V",
		garbageValue = "-100061078"
	)
	@Export("contentType")
	public void contentType(HttpContentType var1) {
		this.headers.put("Content-Type", var1.getValue());
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1012118567"
	)
	@Export("removeContentType")
	public void removeContentType() {
		this.headers.remove("Content-Type");
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lsv;I)V",
		garbageValue = "315819894"
	)
	@Export("accept")
	public void accept(HttpContentType var1) {
		this.acceptWithFactor(var1, 1.0F);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lsv;FI)V",
		garbageValue = "1680282612"
	)
	@Export("acceptWithFactor")
	void acceptWithFactor(HttpContentType var1, float var2) {
		this.acceptHeaderValues.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
		this.updateAcceptHeader();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-90"
	)
	@Export("updateAcceptHeader")
	void updateAcceptHeader() {
		this.headers.remove("Accept");
		if (!this.acceptHeaderValues.isEmpty()) {
			this.headers.put("Accept", this.getAcceptHeaderValue());
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1125389390"
	)
	@Export("getAcceptHeaderValue")
	String getAcceptHeaderValue() {
		ArrayList var1 = new ArrayList(this.acceptHeaderValues.entrySet());
		Collections.sort(var1, new class440(this));
		StringBuilder var2 = new StringBuilder();
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			Entry var4 = (Entry)var3.next();
			if (var2.length() > 0) {
				var2.append(",");
			}

			var2.append(((HttpContentType)var4.getKey()).getValue());
			float var5 = (Float)var4.getValue();
			if (var5 < 1.0F) {
				String var6 = this.decimalFormat.format((double)var5);
				var2.append(";q=").append(var6);
			}
		}

		return var2.toString();
	}
}
