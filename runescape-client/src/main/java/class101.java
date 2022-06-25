import java.net.HttpURLConnection;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import java.io.IOException;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
@ObfuscatedName("cl")
public class class101 extends UrlRequester {
	@ObfuscatedName("df")
	static boolean field1366;

	@ObfuscatedName("lb")
	@ObfuscatedSignature(descriptor = "Lci;")
	@Export("localPlayer")
	static Player localPlayer;

	@ObfuscatedName("j")
	final boolean field1364;

	public class101(boolean var1, int var2) {
		super(var2);
		this.field1364 = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lct;I)V", garbageValue = "1538294108")
	void vmethod2537(UrlRequest var1) throws IOException {
		URLConnection var2 = null;
		try {
			String var3 = var1.url.getProtocol();
			if (var3.equals("http")) {
				var2 = this.method2548(var1);
			} else {
				if (!var3.equals("https")) {
					var1.isDone0 = true;
					return;
				}
				var2 = this.method2540(var1);
			}
			this.method2522(var2, var1);
		} catch (IOException var7) {
		} finally {
			var1.isDone0 = true;
			if (var2 != null) {
				if (var2 instanceof HttpURLConnection) {
					((HttpURLConnection) (var2)).disconnect();
				} else if (var2 instanceof HttpsURLConnection) {
					((HttpsURLConnection) (var2)).disconnect();
				}
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(Lct;S)Ljava/net/URLConnection;", garbageValue = "6416")
	URLConnection method2548(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.url.openConnection();
		this.method2520(var2);
		return var2;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Lct;I)Ljava/net/URLConnection;", garbageValue = "2028242666")
	URLConnection method2540(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = ((HttpsURLConnection) (var1.url.openConnection()));
		if (!this.field1364) {
			if (class15.field85 == null) {
				class15.field85 = new class15();
			}
			class15 var4 = class15.field85;
			var2.setSSLSocketFactory(var4);
		}
		this.method2520(var2);
		return var2;
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(IIIIIIII)Z", garbageValue = "-585632517")
	static final boolean method2549(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = ViewportMouse.ViewportMouse_y + var6;
		if (var7 < var0 && var7 < var1 && var7 < var2) {
			return false;
		} else {
			var7 = ViewportMouse.ViewportMouse_y - var6;
			if (var7 > var0 && var7 > var1 && var7 > var2) {
				return false;
			} else {
				var7 = ViewportMouse.ViewportMouse_x + var6;
				if (var7 < var3 && var7 < var4 && var7 < var5) {
					return false;
				} else {
					var7 = ViewportMouse.ViewportMouse_x - var6;
					return var7 <= var3 || var7 <= var4 || var7 <= var5;
				}
			}
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(ZB)V", garbageValue = "1")
	static void method2547(boolean var0) {
		byte var1 = 0;
		boolean var2 = class19.clientPreferences.method2266() >= Client.field482;
		if (!var2) {
			var1 = 12;
		} else if (class353.client.method1102() || class353.client.method1103()) {
			var1 = 10;
		}
		WorldMapData_1.method4872(var1);
		if (var0) {
			Login.Login_username = "";
			Login.Login_password = "";
			class240.field2846 = 0;
			World.otp = "";
		}
		KeyHandler.method286();
		class29.method357();
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V", garbageValue = "0")
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0;
		Login.Login_response2 = var1;
		Login.Login_response3 = var2;
	}
}