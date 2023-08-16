import java.io.UnsupportedEncodingException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("rl")
public class class462 implements class461 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 608843781
	)
	public static int field4778;
	@ObfuscatedName("ae")
	JSONObject field4775;

	public class462(byte[] var1) throws UnsupportedEncodingException {
		this.method8335(var1);
	}

	public class462(JSONObject var1) {
		this.field4775 = var1;
	}

	public class462(String var1) throws UnsupportedEncodingException {
		this.method8330(var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Lre;",
		garbageValue = "1843960357"
	)
	public class460 vmethod8346() {
		return class460.field4772;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-2012768243"
	)
	public byte[] vmethod8344() throws UnsupportedEncodingException {
		return this.field4775 == null ? new byte[0] : this.field4775.toString().getBytes("UTF-8");
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "-68"
	)
	void method8335(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8");
		this.method8330(var2);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "-32"
	)
	void method8330(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') {
				this.field4775 = new JSONObject(var1);
			} else {
				if (var1.charAt(0) != '[') {
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
				}

				JSONArray var2 = new JSONArray(var1);
				this.field4775 = new JSONObject();
				this.field4775.method8392("arrayValues", var2);
			}

		} catch (JSONException var3) {
			throw new UnsupportedEncodingException(var3.getMessage());
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Lorg/json/JSONObject;",
		garbageValue = "-30"
	)
	public JSONObject method8332() {
		return this.field4775;
	}
}
