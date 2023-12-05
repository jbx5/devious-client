import HttpJsonContent.HttpJsonRequestBody;
import org.json.HTTP;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.UnsupportedEncodingException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sv")
<<<<<<<< HEAD:runescape-client/src/main/java/HttpJsonContent.java
@Implements("HttpJsonContent")
public class HttpJsonContent implements HttpContent {
========
@Implements("HttpJsonRequestBody")
public class HttpJsonRequestBody implements HttpPayload
{
>>>>>>>> a06dc409d1 (rs-client: Added mappings (mostly HTTP-client related)):runescape-client/src/main/java/HttpJsonRequestBody.java
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lorg/json/JSONObject;"
	)
<<<<<<<< HEAD:runescape-client/src/main/java/HttpJsonContent.java
	@Export("properties")
	JSONObject properties;

	public HttpJsonContent(byte[] var1) throws UnsupportedEncodingException {
		this.method8574(var1);
========
	@Export("body")
	JSONObject body;

	public HttpJsonRequestBody(byte[] var1) throws UnsupportedEncodingException {
		this.bodyFromBytes(var1);
>>>>>>>> a06dc409d1 (rs-client: Added mappings (mostly HTTP-client related)):runescape-client/src/main/java/HttpJsonRequestBody.java
	}

	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;)V"
	)
<<<<<<<< HEAD:runescape-client/src/main/java/HttpJsonContent.java
	public HttpJsonContent(JSONObject var1) {
		this.properties = var1;
	}

	public HttpJsonContent(String var1) throws UnsupportedEncodingException {
		this.method8575(var1);
========
	public HttpJsonRequestBody(JSONObject var1) {
		this.body = var1;
	}

	public HttpJsonRequestBody(String var1) throws UnsupportedEncodingException {
		this.bodyFromString(var1);
>>>>>>>> a06dc409d1 (rs-client: Added mappings (mostly HTTP-client related)):runescape-client/src/main/java/HttpJsonRequestBody.java
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Lsi;",
		garbageValue = "-24"
	)
<<<<<<<< HEAD:runescape-client/src/main/java/HttpJsonContent.java
	@Export("type")
	public HttpContentType type() {
========
	public HttpContentType getContentType() {
>>>>>>>> a06dc409d1 (rs-client: Added mappings (mostly HTTP-client related)):runescape-client/src/main/java/HttpJsonRequestBody.java
		return HttpContentType.APPLICATION_JSON;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "0"
	)
<<<<<<<< HEAD:runescape-client/src/main/java/HttpJsonContent.java
	public byte[] vmethod8587() throws UnsupportedEncodingException {
		return this.properties == null ? new byte[0] : this.properties.toString().getBytes("UTF-8");
========
	public byte[] toBytes() throws UnsupportedEncodingException {
		return this.body == null ? new byte[0] : this.body.toString().getBytes("UTF-8");
>>>>>>>> a06dc409d1 (rs-client: Added mappings (mostly HTTP-client related)):runescape-client/src/main/java/HttpJsonRequestBody.java
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-1436694020"
	)
	@Export("bodyFromBytes")
	void bodyFromBytes(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8");
		this.bodyFromString(var2);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1963139059"
	)
	@Export("setBodyFromString")
	void bodyFromString(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') {
<<<<<<<< HEAD:runescape-client/src/main/java/HttpJsonContent.java
				this.properties = new JSONObject(var1);
========
				this.body = new JSONObject(var1);
>>>>>>>> a06dc409d1 (rs-client: Added mappings (mostly HTTP-client related)):runescape-client/src/main/java/HttpJsonRequestBody.java
			} else {
				if (var1.charAt(0) != '[') {
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
				}

				JSONArray var2 = new JSONArray(var1);
<<<<<<<< HEAD:runescape-client/src/main/java/HttpJsonContent.java
				this.properties = new JSONObject();
				this.properties.method8392("arrayValues", var2);
========
				this.body = new JSONObject();
				this.body.method8392("arrayValues", var2);
>>>>>>>> a06dc409d1 (rs-client: Added mappings (mostly HTTP-client related)):runescape-client/src/main/java/HttpJsonRequestBody.java
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
<<<<<<<< HEAD:runescape-client/src/main/java/HttpJsonContent.java
	@Export("getProperties")
	public JSONObject getProperties() {
		return this.properties;
========
	@Export("getBody")
	public JSONObject getBody() {
		return this.body;
>>>>>>>> a06dc409d1 (rs-client: Added mappings (mostly HTTP-client related)):runescape-client/src/main/java/HttpJsonRequestBody.java
	}
}
