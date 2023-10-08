import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ag")
public class class10 {
	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("scene")
	static Scene scene;
	@ObfuscatedName("qq")
	@ObfuscatedGetter(
		intValue = 91869067
	)
	static int field48;
	@ObfuscatedName("ac")
	final HttpsURLConnection field54;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lqv;"
	)
	final class434 field50;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lav;"
	)
	final class9 field47;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lsd;"
	)
	class476 field46;
	@ObfuscatedName("ao")
	boolean field49;
	@ObfuscatedName("ah")
	boolean field45;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 188434511
	)
	int field51;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lav;Lqv;Z)V"
	)
	public class10(URL var1, class9 var2, class434 var3, boolean var4) throws IOException {
		this.field49 = false;
		this.field45 = false;
		this.field51 = 300000;
		if (!var2.method69()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method70());
		} else {
			this.field54 = (HttpsURLConnection)var1.openConnection();
			if (!var4) {
				HttpsURLConnection var5 = this.field54;
				if (class15.field82 == null) {
					class15.field82 = new class15();
				}

				class15 var6 = class15.field82;
				var5.setSSLSocketFactory(var6);
			}

			this.field47 = var2;
			this.field50 = var3 != null ? var3 : new class434();
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lav;Z)V"
	)
	public class10(URL var1, class9 var2, boolean var3) throws IOException {
		this(var1, var2, new class434(), var3);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Lqv;",
		garbageValue = "1852518909"
	)
	public class434 method102() {
		return this.field50;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lsd;I)V",
		garbageValue = "-1455589333"
	)
	public void method86(class476 var1) {
		if (!this.field49) {
			if (var1 == null) {
				this.field50.method7864("Content-Type");
				this.field46 = null;
			} else {
				this.field46 = var1;
				if (this.field46.vmethod8518() != null) {
					this.field50.method7868(this.field46.vmethod8518());
				} else {
					this.field50.method7869();
				}

			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "937101739"
	)
	void method87() throws ProtocolException {
		if (!this.field49) {
			this.field54.setRequestMethod(this.field47.method70());
			this.field50.method7861(this.field54);
			if (this.field47.method68() && this.field46 != null) {
				this.field54.setDoOutput(true);
				ByteArrayOutputStream var1 = new ByteArrayOutputStream();

				try {
					var1.write(this.field46.vmethod8509());
					var1.writeTo(this.field54.getOutputStream());
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

			this.field54.setConnectTimeout(this.field51);
			this.field54.setInstanceFollowRedirects(this.field45);
			this.field49 = true;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2097496739"
	)
	boolean method88() throws IOException {
		if (!this.field49) {
			this.method87();
		}

		this.field54.connect();
		return this.field54.getResponseCode() == -1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Law;",
		garbageValue = "1182023619"
	)
	class20 method89() {
		try {
			if (!this.field49 || this.field54.getResponseCode() == -1) {
				return new class20("No REST response has been received yet.");
			}
		} catch (IOException var10) {
			this.field54.disconnect();
			return new class20("Error decoding REST response code: " + var10.getMessage());
		}

		class20 var3;
		try {
			class20 var1 = new class20(this.field54);
			return var1;
		} catch (IOException var8) {
			var3 = new class20("Error decoding REST response: " + var8.getMessage());
		} finally {
			this.field54.disconnect();
		}

		return var3;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIII)I",
		garbageValue = "-1751398414"
	)
	static final int method83(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([FI)V",
		garbageValue = "-1762235426"
	)
	static void method104(float[] var0) {
		if (class128.field1501 + var0[0] < 1.3333334F) {
			float var1 = var0[0] - 2.0F;
			float var2 = var0[0] - 1.0F;
			float var3 = (float)Math.sqrt((double)(var1 * var1 - var2 * var2 * 4.0F));
			float var4 = (var3 + -var1) * 0.5F;
			if (var0[1] + class128.field1501 > var4) {
				var0[1] = var4 - class128.field1501;
			} else {
				var4 = (-var1 - var3) * 0.5F;
				if (var0[1] < class128.field1501 + var4) {
					var0[1] = var4 + class128.field1501;
				}
			}
		} else {
			var0[0] = 1.3333334F - class128.field1501;
			var0[1] = 0.33333334F - class128.field1501;
		}

	}
}
