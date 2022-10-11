import java.io.UnsupportedEncodingException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("om")
public class class401 implements class400 {
	@ObfuscatedName("f")
	JSONObject field4474;

	public class401(byte[] var1) throws UnsupportedEncodingException {
		this.method7308(var1); // L: 17
	} // L: 18

	public class401(String var1) throws UnsupportedEncodingException {
		this.method7306(var1); // L: 13
	} // L: 14

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-606305433"
	)
	public byte[] vmethod7323() throws UnsupportedEncodingException {
		return this.field4474 == null ? new byte[0] : this.field4474.toString().getBytes("UTF-8"); // L: 50 51 53
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-65625485"
	)
	void method7308(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8"); // L: 21
		this.method7306(var2); // L: 22
	} // L: 23

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2069444703"
	)
	void method7306(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') { // L: 27
				this.field4474 = new JSONObject(var1); // L: 28
			} else {
				if (var1.charAt(0) != '[') { // L: 30
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder."); // L: 36
				}

				JSONArray var2 = new JSONArray(var1); // L: 31
				this.field4474 = new JSONObject(); // L: 32
				this.field4474.method8392("arrayValues", var2); // L: 33
			}

		} catch (JSONException var3) { // L: 39
			throw new UnsupportedEncodingException(var3.getMessage()); // L: 40
		}
	} // L: 42

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Lorg/json/JSONObject;",
		garbageValue = "611549048"
	)
	public JSONObject method7307() {
		return this.field4474; // L: 45
	}
}
