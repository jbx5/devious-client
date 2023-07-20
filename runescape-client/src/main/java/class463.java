import java.io.UnsupportedEncodingException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("re")
public class class463 implements class462 {
	@ObfuscatedName("ay")
	JSONObject field4779;

	public class463(byte[] var1) throws UnsupportedEncodingException {
		this.method8395(var1);
	}

	public class463(JSONObject var1) {
		this.field4779 = var1;
	}

	public class463(String var1) throws UnsupportedEncodingException {
		this.method8396(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Lrs;",
		garbageValue = "186741716"
	)
	public class461 vmethod8417() {
		return class461.field4777;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-587379873"
	)
	public byte[] vmethod8412() throws UnsupportedEncodingException {
		return this.field4779 == null ? new byte[0] : this.field4779.toString().getBytes("UTF-8");
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-957035381"
	)
	void method8395(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8");
		this.method8396(var2);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "42"
	)
	void method8396(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') {
				this.field4779 = new JSONObject(var1);
			} else {
				if (var1.charAt(0) != '[') {
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
				}

				JSONArray var2 = new JSONArray(var1);
				this.field4779 = new JSONObject();
				this.field4779.method8392("arrayValues", var2);
			}

		} catch (JSONException var3) {
			throw new UnsupportedEncodingException(var3.getMessage());
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Lorg/json/JSONObject;",
		garbageValue = "0"
	)
	public JSONObject method8398() {
		return this.field4779;
	}
}
