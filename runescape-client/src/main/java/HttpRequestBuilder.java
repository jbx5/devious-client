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

@ObfuscatedName("qf")
@Implements("HttpRequestBuilder")
public class HttpRequestBuilder
{
	@ObfuscatedName("ao")
	@Export("headers")
	final Map<String, String> headers;
	@ObfuscatedName("ab")
	@Export("acceptHeaderValues")
	final Map<HttpContentType, Float> acceptHeaderValues;
	@ObfuscatedName("au")
	@Export("decimalFormat")
	final DecimalFormat decimalFormat;

	public HttpRequestBuilder() {
		this.headers = new HashMap<>();
		this.acceptHeaderValues = new HashMap<>();
		this.decimalFormat = new DecimalFormat();
		this.decimalFormat.setMaximumFractionDigits(2);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljavax/net/ssl/HttpsURLConnection;I)V",
		garbageValue = "514712825"
	)
	@Export("setRequestProperties")
	public void setRequestProperties(HttpsURLConnection connection) {
		Iterator var2 = this.headers.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next();
			connection.setRequestProperty((String)var3.getKey(), (String)var3.getValue());
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "289317846"
	)
	@Export("getHeaders")
	public Map<String, String> getHeaders() {
		return this.headers;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1068565867"
	)
	@Export("header")
	public void header(String key, String value) {
		if (key != null && !key.isEmpty()) {
			this.headers.put(key, value != null ? value : "");
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "90"
	)
	@Export("removeHeader")
	public void removeHeader(String header) {
		if (header != null && !header.isEmpty()) {
			this.headers.remove(header);
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lqr;Ljava/lang/String;I)V",
		garbageValue = "-1582767971"
	)
	@Export("authenticationHeader")
	void authenticationHeader(HttpAuthenticationHeader header, String value) {
		String var3 = String.format("%s %s", header.getKey(), value);
		this.header("Authorization", var3);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)V",
		garbageValue = "1431"
	)
	@Export("basicAuthentication")
	public void basicAuthentication(String credentials) {
		this.authenticationHeader(HttpAuthenticationHeader.BASIC, credentials);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1155653800"
	)
	@Export("bearerToken")
	public void bearerToken(String token) {
		this.authenticationHeader(HttpAuthenticationHeader.BEARER, token);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsi;B)V",
		garbageValue = "-85"
	)
	@Export("contentType")
	public void contentType(HttpContentType contentType) {
		this.headers.put("Content-Type", contentType.getValue());
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "37"
	)
	@Export("removeContentType")
	public void removeContentType() {
		this.headers.remove("Content-Type");
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lsi;B)V",
		garbageValue = "4"
	)
	@Export("accept")
	public void accept(HttpContentType contentType) {
		this.acceptWithFactor(contentType, 1.0F);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lsi;FI)V",
		garbageValue = "-974878647"
	)
	@Export("acceptWithFactor")
	void acceptWithFactor(HttpContentType contentType, float relativeQualityFactor) {
		this.acceptHeaderValues.put(contentType, Math.max(0.0F, Math.min(1.0F, relativeQualityFactor)));
		this.updateAcceptHeader();
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1694240959"
	)
	@Export("updateAcceptHeader")
	void updateAcceptHeader() {
		this.headers.remove("Accept");
		if (!this.acceptHeaderValues.isEmpty()) {
			this.headers.put("Accept", this.getAcceptHeaderValue());
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1880009483"
	)
	@Export("getAcceptHeaderValue")
	String getAcceptHeaderValue() {
		ArrayList var1 = new ArrayList(this.acceptHeaderValues.entrySet());
		Collections.sort(var1, new class432(this));
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
