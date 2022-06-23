import net.runelite.mapping.ObfuscatedName;
import java.util.HashMap;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.io.IOException;
import java.io.ByteArrayOutputStream;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
@ObfuscatedName("s")
public class class10 {
	@ObfuscatedName("uu")
	@Export("foundItemIds")
	static short[] foundItemIds;

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "Lfv;")
	@Export("clock")
	static Clock clock;

	@ObfuscatedName("ei")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("archive11")
	static Archive archive11;

	@ObfuscatedName("iv")
	@ObfuscatedGetter(intValue = 2013387747)
	static int field53;

	@ObfuscatedName("c")
	HttpsURLConnection field55;

	@ObfuscatedName("v")
	final Map field43;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Loi;")
	class398 field45;

	@ObfuscatedName("f")
	Map field44;

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Li;")
	final class9 field46;

	@ObfuscatedName("e")
	boolean field41;

	@ObfuscatedName("g")
	boolean field47;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 1112676483)
	int field48;

	@ObfuscatedSignature(descriptor = "(Ljava/net/URL;Li;Z)V")
	public class10(URL var1, class9 var2, boolean var3) throws IOException {
		this.field41 = false;
		this.field47 = false;
		this.field48 = 300000;
		if (!var2.method61()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method64());
		} else {
			this.field55 = ((HttpsURLConnection) (var1.openConnection()));
			if (!var3) {
				HttpsURLConnection var4 = this.field55;
				if (class15.field85 == null) {
					class15.field85 = new class15();
				}
				class15 var5 = class15.field85;
				var4.setSSLSocketFactory(var5);
			}
			this.field46 = var2;
			this.field43 = new HashMap();
			this.field44 = new HashMap();
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;B)V", garbageValue = "34")
	public void method79(String var1, String var2) {
		if (!this.field41) {
			this.field43.put(var1, var2);
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;", garbageValue = "-66")
	String method76() {
		ArrayList var1 = new ArrayList(this.field44.entrySet());
		Collections.sort(var1, new class18(this));
		StringBuilder var2 = new StringBuilder();
		Iterator var3 = var1.iterator();
		while (var3.hasNext()) {
			Entry var4 = ((Entry) (var3.next()));
			if (var2.length() > 0) {
				var2.append(",");
			}
			var2.append(((class397) (var4.getKey())).method7086());
			float var5 = ((Float) (var4.getValue()));
			if (var5 < 1.0F) {
				String var6 = Float.toString(var5).substring(0, 4);
				var2.append(";q=" + var6);
			}
		} 
		return var2.toString();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1821819060")
	void method77() throws ProtocolException {
		if (!this.field41) {
			this.field55.setRequestMethod(this.field46.method64());
			if (!this.field44.isEmpty()) {
				this.field43.put("Accept", this.method76());
			}
			Iterator var1 = this.field43.entrySet().iterator();
			while (var1.hasNext()) {
				Entry var2 = ((Entry) (var1.next()));
				this.field55.setRequestProperty(((String) (var2.getKey())), ((String) (var2.getValue())));
			} 
			if (this.field46.method62() && this.field45 != null) {
				this.field55.setDoOutput(true);
				ByteArrayOutputStream var13 = new ByteArrayOutputStream();
				try {
					var13.write(this.field45.vmethod7114());
					var13.writeTo(this.field55.getOutputStream());
				} catch (IOException var11) {
					var11.printStackTrace();
				} finally {
					if (var13 != null) {
						try {
							var13.close();
						} catch (IOException var10) {
							var10.printStackTrace();
						}
					}
				}
			}
			this.field55.setConnectTimeout(this.field48);
			this.field55.setInstanceFollowRedirects(this.field47);
			this.field41 = true;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "1746167507")
	boolean method78() throws IOException, SocketTimeoutException {
		if (!this.field41) {
			this.method77();
		}
		this.field55.connect();
		return this.field55.getResponseCode() == -1;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(I)Lb;", garbageValue = "2065804848")
	class21 method90() {
		try {
			if (!this.field41 || this.field55.getResponseCode() == -1) {
				return new class21("No REST response has been received yet.");
			}
		} catch (IOException var10) {
			this.field55.disconnect();
			return new class21("Error decoding REST response code: " + var10.getMessage());
		}
		class21 var1 = null;
		class21 var3;
		try {
			var1 = new class21(this.field55);
			return var1;
		} catch (IOException var8) {
			var3 = new class21("Error decoding REST response: " + var8.getMessage());
		} finally {
			this.field55.disconnect();
		}
		return var3;
	}

	@ObfuscatedName("jn")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lkb;B)Ljava/lang/String;", garbageValue = "34")
	static String method74(String var0, Widget var1) {
		if (var0.indexOf("%") != -1) {
			for (int var2 = 1; var2 <= 5; ++var2) {
				while (true) {
					int var3 = var0.indexOf("%" + var2);
					if (var3 == -1) {
						break;
					}
					String var4 = var0.substring(0, var3);
					int var6 = Canvas.method319(var1, var2 - 1);
					String var5;
					if (var6 < 999999999) {
						var5 = Integer.toString(var6);
					} else {
						var5 = "*";
					}
					var0 = var4 + var5 + var0.substring(var3 + 2);
				} 
			}
		}
		return var0;
	}
}