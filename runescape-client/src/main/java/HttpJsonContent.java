import java.io.UnsupportedEncodingException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("sv")
@Implements("HttpJsonContent")
public class HttpJsonContent implements HttpContent {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lorg/json/JSONObject;"
	)
	@Export("properties")
	JSONObject properties;

	public HttpJsonContent(byte[] var1) throws UnsupportedEncodingException {
		this.method8574(var1);
	}

	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;)V"
	)
	public HttpJsonContent(JSONObject var1) {
		this.properties = var1;
	}

	public HttpJsonContent(String var1) throws UnsupportedEncodingException {
		this.method8575(var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Lsi;",
		garbageValue = "-24"
	)
	@Export("type")
	public HttpContentType type() {
		return HttpContentType.APPLICATION_JSON;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "0"
	)
	public byte[] vmethod8587() throws UnsupportedEncodingException {
		return this.properties == null ? new byte[0] : this.properties.toString().getBytes("UTF-8");
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-1436694020"
	)
	void method8574(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8");
		this.method8575(var2);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1963139059"
	)
	void method8575(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') {
				this.properties = new JSONObject(var1);
			} else {
				if (var1.charAt(0) != '[') {
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
				}

				JSONArray var2 = new JSONArray(var1);
				this.properties = new JSONObject();
				this.properties.method8392("arrayValues", var2);
			}

		} catch (JSONException var3) {
			throw new UnsupportedEncodingException(var3.getMessage());
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Lorg/json/JSONObject;",
		garbageValue = "70"
	)
	@Export("getProperties")
	public JSONObject getProperties() {
		return this.properties;
	}
}
