import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ad")
public class class10 {
	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	static Archive field46;
	@ObfuscatedName("au")
	final HttpsURLConnection field51;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	final class419 field47;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	final class9 field53;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lrf;"
	)
	class461 field49;
	@ObfuscatedName("ac")
	boolean field50;
	@ObfuscatedName("ai")
	boolean field48;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1934831509
	)
	int field52;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Laf;Lqf;Z)V"
	)
	public class10(URL var1, class9 var2, class419 var3, boolean var4) throws IOException {
		this.field50 = false;
		this.field48 = false;
		this.field52 = 300000;
		if (!var2.method65()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method62());
		} else {
			this.field51 = (HttpsURLConnection)var1.openConnection();
			if (!var4) {
				this.field51.setSSLSocketFactory(class15.method179());
			}

			this.field53 = var2;
			this.field47 = var3 != null ? var3 : new class419();
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Laf;Z)V"
	)
	public class10(URL var1, class9 var2, boolean var3) throws IOException {
		this(var1, var2, new class419(), var3);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Lqf;",
		garbageValue = "106"
	)
	public class419 method85() {
		return this.field47;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lrf;B)V",
		garbageValue = "2"
	)
	public void method78(class461 var1) {
		if (!this.field50) {
			if (var1 == null) {
				this.field47.method7752("Content-Type");
				this.field49 = null;
			} else {
				this.field49 = var1;
				if (this.field49.vmethod8346() != null) {
					this.field47.method7726(this.field49.vmethod8346());
				} else {
					this.field47.method7723();
				}

			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2080187114"
	)
	void method79() throws ProtocolException {
		if (!this.field50) {
			this.field51.setRequestMethod(this.field53.method62());
			this.field47.method7715(this.field51);
			if (this.field53.method63() && this.field49 != null) {
				this.field51.setDoOutput(true);
				ByteArrayOutputStream var1 = new ByteArrayOutputStream();

				try {
					var1.write(this.field49.vmethod8344());
					var1.writeTo(this.field51.getOutputStream());
				} catch (IOException var11) {
					var11.printStackTrace();
				} finally {
					try {
						var1.close();
					} catch (IOException var10) {
						var10.printStackTrace();
					}

				}
			}

			this.field51.setConnectTimeout(this.field52);
			this.field51.setInstanceFollowRedirects(this.field48);
			this.field50 = true;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-170543381"
	)
	boolean method81() throws IOException {
		if (!this.field50) {
			this.method79();
		}

		this.field51.connect();
		return this.field51.getResponseCode() == -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Las;",
		garbageValue = "-1418069243"
	)
	class20 method80() {
		try {
			if (!this.field50 || this.field51.getResponseCode() == -1) {
				return new class20("No REST response has been received yet.");
			}
		} catch (IOException var10) {
			this.field51.disconnect();
			return new class20("Error decoding REST response code: " + var10.getMessage());
		}

		class20 var3;
		try {
			class20 var1 = new class20(this.field51);
			return var1;
		} catch (IOException var8) {
			var3 = new class20("Error decoding REST response: " + var8.getMessage());
		} finally {
			this.field51.disconnect();
		}

		return var3;
	}
}
