import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ar")
@Implements("HttpResponse")
public class HttpResponse {
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1621894699
	)
	static int field78;
	@ObfuscatedName("gx")
	@Export("characterId")
	static String characterId;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1426113819
	)
	@Export("responseCode")
	final int responseCode;
	@ObfuscatedName("ay")
	@Export("headerFields")
	final Map headerFields;
	@ObfuscatedName("an")
	@Export("responseBody")
	final String responseBody;

	HttpResponse(String var1) {
		this.responseCode = 400;
		this.headerFields = null;
		this.responseBody = "";
	}

	HttpResponse(HttpURLConnection var1) throws IOException {
		this.responseCode = var1.getResponseCode();
		var1.getResponseMessage();
		this.headerFields = var1.getHeaderFields();
		StringBuilder var2 = new StringBuilder();
		InputStream var3 = this.responseCode >= 300 ? var1.getErrorStream() : var1.getInputStream();
		if (var3 != null) {
			InputStreamReader var4 = new InputStreamReader(var3);
			BufferedReader var5 = new BufferedReader(var4);

			String var6;
			while ((var6 = var5.readLine()) != null) {
				var2.append(var6);
			}

			var3.close();
		}

		this.responseBody = var2.toString();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1166379354"
	)
	@Export("getResponseCode")
	public int getResponseCode() {
		return this.responseCode;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "14403567"
	)
	@Export("getHeaderFields")
	public Map getHeaderFields() {
		return this.headerFields;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2067815802"
	)
	@Export("getResponseBody")
	public String getResponseBody() {
		return this.responseBody;
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(IZZZZZB)Loj;",
		garbageValue = "16"
	)
	static Archive method278(int var0, boolean var1, boolean var2, boolean var3, boolean var4, boolean var5) {
		ArchiveDisk var6 = null;
		if (JagexCache.JagexCache_dat2File != null) {
			var6 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, ItemContainer.JagexCache_idxFiles[var0], 1000000);
		}

		return new Archive(var6, class92.masterDisk, SecureRandomFuture.field980, var0, var1, var2, var3, var4, var5);
	}
}
