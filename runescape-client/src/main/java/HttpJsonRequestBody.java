import java.io.UnsupportedEncodingException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("sx")
@Implements("HttpJsonRequestBody")
public class HttpJsonRequestBody implements HttpPayload {
	@ObfuscatedName("av")
	@Export("ByteArrayPool_arrays")
	static byte[][][] ByteArrayPool_arrays;
	@ObfuscatedName("ah")
	@Export("body")
	@ObfuscatedSignature(
		descriptor = "Lorg/json/JSONObject;"
	)
	JSONObject body;

	public HttpJsonRequestBody(byte[] var1) throws UnsupportedEncodingException {
		this.bodyFromBytes(var1);
	}

	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;)V"
	)
	public HttpJsonRequestBody(JSONObject var1) {
		this.body = var1;
	}

	public HttpJsonRequestBody(String var1) throws UnsupportedEncodingException {
		this.setBodyFromString(var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Lsv;",
		garbageValue = "-2007074756"
	)
	@Export("getContentType")
	public HttpContentType getContentType() {
		return HttpContentType.APPLICATION_JSON;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "-87"
	)
	@Export("toBytes")
	public byte[] toBytes() throws UnsupportedEncodingException {
		return this.body == null ? new byte[0] : this.body.toString().getBytes("UTF-8");
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-277028595"
	)
	@Export("bodyFromBytes")
	void bodyFromBytes(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8");
		this.setBodyFromString(var2);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1666101591"
	)
	@Export("setBodyFromString")
	void setBodyFromString(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') {
				this.body = new JSONObject(var1);
			} else {
				if (var1.charAt(0) != '[') {
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
				}

				JSONArray var2 = new JSONArray(var1);
				this.body = new JSONObject();
				this.body.setProperty("arrayValues", var2);
			}

		} catch (JSONException var3) {
			throw new UnsupportedEncodingException(var3.getMessage());
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Lorg/json/JSONObject;",
		garbageValue = "40"
	)
	@Export("getBody")
	public JSONObject getBody() {
		return this.body;
	}
}
