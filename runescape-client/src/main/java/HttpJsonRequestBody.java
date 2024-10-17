import java.io.UnsupportedEncodingException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ts")
@Implements("HttpJsonRequestBody")
public class HttpJsonRequestBody implements HttpPayload {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1120652913
	)
	@Export("RunException_revision")
	public static int RunException_revision;
	@ObfuscatedName("aw")
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Ltz;",
		garbageValue = "1116588540"
	)
	@Export("getContentType")
	public HttpContentType getContentType() {
		return HttpContentType.APPLICATION_JSON;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "60"
	)
	@Export("toBytes")
	public byte[] toBytes() throws UnsupportedEncodingException {
		return this.body == null ? new byte[0] : this.body.toString().getBytes("UTF-8");
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "32"
	)
	@Export("bodyFromBytes")
	void bodyFromBytes(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8");
		this.setBodyFromString(var2);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-65962554"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Lorg/json/JSONObject;",
		garbageValue = "1253705820"
	)
	@Export("getBody")
	public JSONObject getBody() {
		return this.body;
	}
}
