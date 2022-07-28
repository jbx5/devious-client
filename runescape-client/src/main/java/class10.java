import net.runelite.mapping.ObfuscatedName;
import java.util.HashMap;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.io.IOException;
import java.io.ByteArrayOutputStream;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
import javax.net.ssl.HttpsURLConnection;
@ObfuscatedName("d")
public class class10 {
	@ObfuscatedName("ih")
	@ObfuscatedGetter(intValue = -2103251145)
	static int field58;

	@ObfuscatedName("nm")
	@ObfuscatedSignature(descriptor = "Lku;")
	static Widget field59;

	@ObfuscatedName("o")
	HttpsURLConnection field54;

	@ObfuscatedName("q")
	final Map field49;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lox;")
	class399 field48;

	@ObfuscatedName("u")
	Map field51;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "La;")
	final class9 field52;

	@ObfuscatedName("w")
	boolean field55 = false;

	@ObfuscatedName("z")
	boolean field50 = false;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 1068233369)
	int field53 = 300000;

	@ObfuscatedSignature(descriptor = "(Ljava/net/URL;La;Z)V")
	public class10(URL var1, class9 var2, boolean var3) throws IOException {
		if (!var2.method68()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method79());
		} else {
			this.field54 = ((HttpsURLConnection) (var1.openConnection()));
			if (!var3) {
				this.field54.setSSLSocketFactory(class15.method190());
			}
			this.field52 = var2;
			this.field49 = new HashMap();
			this.field51 = new HashMap();
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V", garbageValue = "1915450795")
	public void method84(String var1, String var2) {
		if (!this.field55) {
			this.field49.put(var1, var2);
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "877061987")
	String method85() {
		ArrayList var1 = new ArrayList(this.field51.entrySet());
		Collections.sort(var1, new class18(this));
		StringBuilder var2 = new StringBuilder();
		Iterator var3 = var1.iterator();
		while (var3.hasNext()) {
			Map.Entry var4 = ((Map.Entry) (var3.next()));
			if (var2.length() > 0) {
				var2.append(",");
			}
			var2.append(((class398) (var4.getKey())).method7126());
			float var5 = ((Float) (var4.getValue()));
			if (var5 < 1.0F) {
				String var6 = Float.toString(var5).substring(0, 4);
				var2.append(";q=" + var6);
			}
		} 
		return var2.toString();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "111")
	void method86() throws ProtocolException {
		if (!this.field55) {
			this.field54.setRequestMethod(this.field52.method79());
			if (!this.field51.isEmpty()) {
				this.field49.put("Accept", this.method85());
			}
			Iterator var1 = this.field49.entrySet().iterator();
			while (var1.hasNext()) {
				Map.Entry var2 = ((Map.Entry) (var1.next()));
				this.field54.setRequestProperty(((String) (var2.getKey())), ((String) (var2.getValue())));
			} 
			if (this.field52.method70() && this.field48 != null) {
				this.field54.setDoOutput(true);
				ByteArrayOutputStream var13 = new ByteArrayOutputStream();
				try {
					var13.write(this.field48.vmethod7142());
					var13.writeTo(this.field54.getOutputStream());
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
			this.field54.setConnectTimeout(this.field53);
			this.field54.setInstanceFollowRedirects(this.field50);
			this.field55 = true;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-1451597922")
	boolean method87() throws IOException, SocketTimeoutException {
		if (!this.field55) {
			this.method86();
		}
		this.field54.connect();
		return this.field54.getResponseCode() == -1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)Le;", garbageValue = "-1467171906")
	class21 method88() {
		try {
			if (!this.field55 || this.field54.getResponseCode() == -1) {
				return new class21("No REST response has been received yet.");
			}
		} catch (IOException var10) {
			this.field54.disconnect();
			return new class21("Error decoding REST response code: " + var10.getMessage());
		}
		class21 var1 = null;
		class21 var3;
		try {
			var1 = new class21(this.field54);
			return var1;
		} catch (IOException var8) {
			var3 = new class21("Error decoding REST response: " + var8.getMessage());
		} finally {
			this.field54.disconnect();
		}
		return var3;
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1562727950")
	static void method97() {
		if (Client.combatTargetPlayerIndex >= 0 && Client.players[Client.combatTargetPlayerIndex] != null) {
			Tile.addPlayerToScene(Client.players[Client.combatTargetPlayerIndex], false);
		}
	}
}