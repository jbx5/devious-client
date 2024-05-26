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

@ObfuscatedName("rt")
@Implements("HttpHeaders")
public class HttpHeaders {
	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "Lsm;"
	)
	static AbstractSocket field4870;
	@ObfuscatedName("az")
	@Export("headers")
	final Map headers;
	@ObfuscatedName("af")
	@Export("acceptHeaderValues")
	final Map acceptHeaderValues;
	@ObfuscatedName("aa")
	@Export("decimalFormat")
	final DecimalFormat decimalFormat;

	public HttpHeaders() {
		this.headers = new HashMap();
		this.acceptHeaderValues = new HashMap();
		this.decimalFormat = new DecimalFormat();
		this.decimalFormat.setMaximumFractionDigits(2);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljavax/net/ssl/HttpsURLConnection;I)V",
		garbageValue = "1732915704"
	)
	@Export("setRequestProperties")
	public void setRequestProperties(HttpsURLConnection var1) {
		Iterator var2 = this.headers.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next();
			var1.setRequestProperty((String)var3.getKey(), (String)var3.getValue());
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "1731059521"
	)
	@Export("getHeaders")
	public Map getHeaders() {
		return this.headers;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "749395743"
	)
	@Export("header")
	public void header(String var1, String var2) {
		if (var1 != null && !var1.isEmpty()) {
			this.headers.put(var1, var2 != null ? var2 : "");
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "47"
	)
	@Export("removeHeader")
	public void removeHeader(String var1) {
		if (var1 != null && !var1.isEmpty()) {
			this.headers.remove(var1);
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lru;Ljava/lang/String;I)V",
		garbageValue = "477709979"
	)
	@Export("authenticationHeader")
	void authenticationHeader(HttpAuthenticationHeader var1, String var2) {
		String var3 = String.format("%s %s", var1.getKey(), var2);
		this.header("Authorization", var3);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "989310656"
	)
	@Export("basicAuthentication")
	public void basicAuthentication(String var1) {
		this.authenticationHeader(HttpAuthenticationHeader.BASIC, var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "87"
	)
	@Export("bearerToken")
	public void bearerToken(String var1) {
		this.authenticationHeader(HttpAuthenticationHeader.BEARER, var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lsd;B)V",
		garbageValue = "3"
	)
	@Export("contentType")
	public void contentType(HttpContentType var1) {
		this.headers.put("Content-Type", var1.getValue());
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "204193528"
	)
	@Export("removeContentType")
	public void removeContentType() {
		this.headers.remove("Content-Type");
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lsd;I)V",
		garbageValue = "1454521706"
	)
	@Export("accept")
	public void accept(HttpContentType var1) {
		this.acceptWithFactor(var1, 1.0F);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lsd;FI)V",
		garbageValue = "-1301857869"
	)
	@Export("acceptWithFactor")
	void acceptWithFactor(HttpContentType var1, float var2) {
		this.acceptHeaderValues.put(var1, Math.max(0.0F, Math.min(1.0F, var2)));
		this.updateAcceptHeader();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "7"
	)
	@Export("updateAcceptHeader")
	void updateAcceptHeader() {
		this.headers.remove("Accept");
		if (!this.acceptHeaderValues.isEmpty()) {
			this.headers.put("Accept", this.getAcceptHeaderValue());
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "20"
	)
	@Export("getAcceptHeaderValue")
	String getAcceptHeaderValue() {
		ArrayList var1 = new ArrayList(this.acceptHeaderValues.entrySet());
		Collections.sort(var1, new class457(this));
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
