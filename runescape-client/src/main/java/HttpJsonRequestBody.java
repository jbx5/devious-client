import java.io.UnsupportedEncodingException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("tb")
@Implements("HttpJsonRequestBody")
public class HttpJsonRequestBody implements HttpPayload {
	@ObfuscatedName("cv")
	static String field5091;
	@ObfuscatedName("ae")
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Lte;",
		garbageValue = "-757803973"
	)
	@Export("getContentType")
	public HttpContentType getContentType() {
		return HttpContentType.APPLICATION_JSON;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "-115375452"
	)
	@Export("toBytes")
	public byte[] toBytes() throws UnsupportedEncodingException {
		return this.body == null ? new byte[0] : this.body.toString().getBytes("UTF-8");
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-1417826306"
	)
	@Export("bodyFromBytes")
	void bodyFromBytes(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8");
		this.setBodyFromString(var2);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1369648131"
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lorg/json/JSONObject;",
		garbageValue = "-905290488"
	)
	@Export("getBody")
	public JSONObject getBody() {
		return this.body;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lpo;IIS)Z",
		garbageValue = "180"
	)
	public static boolean method9207(AbstractArchive var0, int var1, int var2) {
		byte[] var3 = var0.takeFile(var1, var2);
		if (var3 == null) {
			return false;
		} else {
			class535.SpriteBuffer_decode(var3);
			return true;
		}
	}
}
