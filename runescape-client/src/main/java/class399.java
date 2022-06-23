import net.runelite.mapping.ObfuscatedName;
import org.json.JSONException;
import org.json.JSONObject;
import net.runelite.mapping.ObfuscatedSignature;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
@ObfuscatedName("om")
public class class399 implements class398 {
	@ObfuscatedName("q")
	JSONObject field4436;

	public class399(byte[] var1) throws UnsupportedEncodingException {
		this.method7098(var1);
	}

	public class399(String var1) throws UnsupportedEncodingException {
		this.method7099(var1);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)[B", garbageValue = "793389020")
	public byte[] vmethod7114() throws UnsupportedEncodingException {
		return this.field4436 == null ? new byte[0] : this.field4436.toString().getBytes("UTF-8");
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "([BI)V", garbageValue = "-448448712")
	void method7098(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8");
		this.method7099(var2);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "2042516666")
	void method7099(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') {
				this.field4436 = new JSONObject(var1);
			} else {
				if (var1.charAt(0) != '[') {
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
				}
				JSONArray var2 = new JSONArray(var1);
				this.field4436 = new JSONObject();
				this.field4436.put("arrayValues", var2);
			}
		} catch (JSONException var3) {
			throw new UnsupportedEncodingException(var3.getMessage());
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(I)Lorg/json/JSONObject;", garbageValue = "1036463091")
	public JSONObject method7100() {
		return this.field4436;
	}
}