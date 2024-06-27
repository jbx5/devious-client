import java.io.UnsupportedEncodingException;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("tj")
@Implements("HttpJsonRequestBody")
public class HttpJsonRequestBody implements HttpPayload {
	@ObfuscatedName("qa")
	@ObfuscatedGetter(
		intValue = 1349223169
	)
	@Export("widgetDragDuration")
	static int widgetDragDuration;
	@ObfuscatedName("ad")
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Lsb;",
		garbageValue = "12"
	)
	@Export("getContentType")
	public HttpContentType getContentType() {
		return HttpContentType.APPLICATION_JSON;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "524737236"
	)
	@Export("toBytes")
	public byte[] toBytes() throws UnsupportedEncodingException {
		return this.body == null ? new byte[0] : this.body.toString().getBytes("UTF-8");
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "2040345982"
	)
	@Export("bodyFromBytes")
	void bodyFromBytes(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8");
		this.setBodyFromString(var2);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1272300325"
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Lorg/json/JSONObject;",
		garbageValue = "89"
	)
	@Export("getBody")
	public JSONObject getBody() {
		return this.body;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;Luu;I)Ljava/lang/String;",
		garbageValue = "-27269583"
	)
	public static String method8866(CharSequence var0, LoginType var1) {
		if (var0 == null) {
			return null;
		} else {
			int var2 = 0;

			int var3;
			boolean var4;
			char var5;
			for (var3 = var0.length(); var2 < var3; ++var2) {
				var5 = var0.charAt(var2);
				var4 = var5 == 160 || var5 == ' ' || var5 == '_' || var5 == '-';
				if (!var4) {
					break;
				}
			}

			while (var3 > var2) {
				var5 = var0.charAt(var3 - 1);
				var4 = var5 == 160 || var5 == ' ' || var5 == '_' || var5 == '-';
				if (!var4) {
					break;
				}

				--var3;
			}

			int var14 = var3 - var2;
			if (var14 >= 1) {
				byte var6;
				if (var1 == null) {
					var6 = 12;
				} else {
					switch(var1.field5249) {
					case 0:
						var6 = 20;
						break;
					default:
						var6 = 12;
					}
				}

				if (var14 <= var6) {
					StringBuilder var12 = new StringBuilder(var14);

					for (int var15 = var2; var15 < var3; ++var15) {
						char var7 = var0.charAt(var15);
						boolean var8;
						if (Character.isISOControl(var7)) {
							var8 = false;
						} else if (VarpDefinition.isAlphaNumeric(var7)) {
							var8 = true;
						} else {
							char[] var9 = class525.field5259;
							int var10 = 0;

							label120:
							while (true) {
								char var11;
								if (var10 >= var9.length) {
									var9 = class525.field5258;

									for (var10 = 0; var10 < var9.length; ++var10) {
										var11 = var9[var10];
										if (var11 == var7) {
											var8 = true;
											break label120;
										}
									}

									var8 = false;
									break;
								}

								var11 = var9[var10];
								if (var11 == var7) {
									var8 = true;
									break;
								}

								++var10;
							}
						}

						if (var8) {
							char var13;
							switch(var7) {
							case ' ':
							case '-':
							case '_':
							case ' ':
								var13 = '_';
								break;
							case '#':
							case '[':
							case ']':
								var13 = var7;
								break;
							case 'À':
							case 'Á':
							case 'Â':
							case 'Ã':
							case 'Ä':
							case 'à':
							case 'á':
							case 'â':
							case 'ã':
							case 'ä':
								var13 = 'a';
								break;
							case 'Ç':
							case 'ç':
								var13 = 'c';
								break;
							case 'È':
							case 'É':
							case 'Ê':
							case 'Ë':
							case 'è':
							case 'é':
							case 'ê':
							case 'ë':
								var13 = 'e';
								break;
							case 'Í':
							case 'Î':
							case 'Ï':
							case 'í':
							case 'î':
							case 'ï':
								var13 = 'i';
								break;
							case 'Ñ':
							case 'ñ':
								var13 = 'n';
								break;
							case 'Ò':
							case 'Ó':
							case 'Ô':
							case 'Õ':
							case 'Ö':
							case 'ò':
							case 'ó':
							case 'ô':
							case 'õ':
							case 'ö':
								var13 = 'o';
								break;
							case 'Ù':
							case 'Ú':
							case 'Û':
							case 'Ü':
							case 'ù':
							case 'ú':
							case 'û':
							case 'ü':
								var13 = 'u';
								break;
							case 'ß':
								var13 = 'b';
								break;
							case 'ÿ':
							case 'Ÿ':
								var13 = 'y';
								break;
							default:
								var13 = Character.toLowerCase(var7);
							}

							if (var13 != 0) {
								var12.append(var13);
							}
						}
					}

					if (var12.length() == 0) {
						return null;
					}

					return var12.toString();
				}
			}

			return null;
		}
	}
}
