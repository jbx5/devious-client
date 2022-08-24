import net.runelite.mapping.ObfuscatedName;
import java.awt.Desktop.Action;
import net.runelite.mapping.ObfuscatedSignature;
import java.awt.Desktop;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONArray;
import org.json.JSONObject;
import java.net.URI;
import net.runelite.mapping.Export;
@ObfuscatedName("oz")
public class class400 implements class399 {
	@ObfuscatedName("w")
	JSONObject field4439;

	public class400(byte[] var1) throws UnsupportedEncodingException {
		this.method7047(var1);
	}

	public class400(String var1) throws UnsupportedEncodingException {
		this.method7050(var1);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(B)[B", garbageValue = "57")
	public byte[] vmethod7057() throws UnsupportedEncodingException {
		return this.field4439 == null ? new byte[0] : this.field4439.toString().getBytes("UTF-8");
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "([BI)V", garbageValue = "1703144575")
	void method7047(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8");
		this.method7050(var2);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "-1297162396")
	void method7050(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') {
				this.field4439 = new JSONObject(var1);
			} else {
				if (var1.charAt(0) != '[') {
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
				}
				JSONArray var2 = new JSONArray(var1);
				this.field4439 = new JSONObject();
				this.field4439.method8392("arrayValues", var2);
			}
		} catch (JSONException var3) {
			throw new UnsupportedEncodingException(var3.getMessage());
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)Lorg/json/JSONObject;", garbageValue = "-108")
	public JSONObject method7049() {
		return this.field4439;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(CI)Z", garbageValue = "-1656748026")
	public static final boolean method7055(char var0) {
		if (Character.isISOControl(var0)) {
			return false;
		} else if (class113.isAlphaNumeric(var0)) {
			return true;
		} else {
			char[] var1 = class424.field4621;
			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}
			var1 = class424.field4619;
			for (var2 = 0; var2 < var1.length; ++var2) {
				var3 = var1[var2];
				if (var0 == var3) {
					return true;
				}
			}
			return false;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;ZZI)V", garbageValue = "348489361")
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		if (var1) {
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var4) {
				}
			}
			if (class29.field167.startsWith("win")) {
				FriendLoginUpdate.method6597(var0, 0, "openjs");
			} else if (class29.field167.startsWith("mac")) {
				FriendLoginUpdate.method6597(var0, 1, "openjs");
			} else {
				FriendLoginUpdate.method6597(var0, 2, "openjs");
			}
		} else {
			FriendLoginUpdate.method6597(var0, 3, "openjs");
		}
	}
}