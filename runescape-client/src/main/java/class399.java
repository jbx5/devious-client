import java.io.UnsupportedEncodingException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("op")
public class class399 implements class398 {
	@ObfuscatedName("i")
	JSONObject field4384;

	public class399(byte[] var1) throws UnsupportedEncodingException {
		this.method7148(var1);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(S)[B", garbageValue = 
	"201")

	public byte[] vmethod7150() throws UnsupportedEncodingException {
		return this.field4384 == null ? new byte[0] : this.field4384.toString().getBytes("UTF-8");
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"([BI)V", garbageValue = 
	"1800116953")

	void method7148(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8");
		this.method7149(var2);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;I)V", garbageValue = 
	"-2059250912")

	void method7149(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') {
				this.field4384 = new JSONObject(var1);
			} else {
				if (var1.charAt(0) != '[') {
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
				}

				JSONArray var2 = new JSONArray(var1);
				this.field4384 = new JSONObject();
				this.field4384.put("arrayValues", var2);
			}

		} catch (JSONException var3) {
			throw new UnsupportedEncodingException(var3.getMessage());
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(I)Lorg/json/JSONObject;", garbageValue = 
	"1611326690")

	public JSONObject method7156() {
		return this.field4384;
	}
}