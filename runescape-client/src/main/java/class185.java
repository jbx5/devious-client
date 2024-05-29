import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("hj")
public class class185 {
	@ObfuscatedName("al")
	String field1937;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -988627865
	)
	int field1938;
	@ObfuscatedName("az")
	ArrayList field1939;
	@ObfuscatedName("af")
	ArrayList field1940;
	@ObfuscatedName("aa")
	ArrayList field1943;
	@ObfuscatedName("at")
	String field1942;
	@ObfuscatedName("ab")
	float[] field1941;
	@ObfuscatedName("ac")
	Map field1946;
	@ObfuscatedName("ao")
	Map field1945;

	class185() {
		this.field1938 = 0;
		this.field1939 = new ArrayList();
		this.field1940 = new ArrayList();
		this.field1943 = new ArrayList();
		this.field1942 = null;
		this.field1941 = new float[4];
		this.field1946 = new HashMap();
		this.field1945 = new HashMap();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1355011770"
	)
	String method3706() {
		return this.field1937;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	int method3696() {
		return this.field1938;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2057375033"
	)
	void method3697() {
		this.field1942 = null;
		this.field1941[0] = 0.0F;
		this.field1941[1] = 0.0F;
		this.field1941[2] = 1.0F;
		this.field1941[3] = 1.0F;
		this.field1939.clear();
		this.field1940.clear();
		this.field1943.clear();
		this.field1946.clear();
		this.field1945.clear();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILeb;B)Z",
		garbageValue = "16"
	)
	boolean method3698(JSONObject var1, int var2, UrlRequester var3) {
		JSONObject var4 = var1;
		if (var2 < 2) {
			try {
				var4 = var4.getJSONObject("message");
			} catch (Exception var13) {
				this.method3697();
				return false;
			}

			try {
				this.method3718(var4.getJSONArray("images"), var3);
			} catch (Exception var12) {
				this.field1940.clear();
			}

			try {
				this.method3695(var4.getJSONArray("labels"));
			} catch (Exception var11) {
				this.field1943.clear();
			}
		} else {
			try {
				this.method3700(var4.getJSONObject("image"), var3);
			} catch (Exception var10) {
				this.field1940.clear();
			}

			try {
				this.method3713(var4.getJSONObject("label"));
			} catch (Exception var9) {
				this.field1943.clear();
			}
		}

		try {
			this.method3703(var4.getJSONObject("behaviour"));
		} catch (Exception var8) {
			this.field1942 = null;
			this.field1941[0] = 0.0F;
			this.field1941[1] = 0.0F;
			this.field1941[2] = 1.0F;
			this.field1941[3] = 1.0F;
			this.field1939.clear();
		}

		try {
			JSONObject var5 = var4.optJSONObject("meta");
			if (var5 != null) {
				this.method3704(var4.getJSONObject("meta"));
			}
		} catch (Exception var7) {
			this.field1946.clear();
			this.field1945.clear();
		}

		if (var2 == 2) {
			try {
				this.field1937 = var4.getString("id");
				this.field1938 = Integer.parseInt(var4.getString("priority"));
			} catch (Exception var6) {
			}
		}

		return true;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Leb;I)V",
		garbageValue = "1134747047"
	)
	void method3718(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) {
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				try {
					JSONObject var4 = var1.getJSONObject(var3);
					class175 var5 = new class175(this);
					var5.field1867 = var2.request(new URL(var4.getString("src")));
					var5.field1866 = class182.method3652(var4, "placement");
					this.field1940.add(var5);
				} catch (MalformedURLException var6) {
				}
			}

		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Leb;I)V",
		garbageValue = "-1685090311"
	)
	void method3700(JSONObject var1, UrlRequester var2) throws JSONException {
		try {
			class175 var3 = new class175(this);
			var3.field1867 = var2.request(new URL(var1.getString("src")));
			var3.field1866 = class182.method3652(var1, "placement");
			this.field1940.add(var3);
		} catch (MalformedURLException var4) {
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;I)V",
		garbageValue = "-910637523"
	)
	void method3695(JSONArray var1) throws JSONException {
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.length(); ++var2) {
				JSONObject var3 = var1.getJSONObject(var2);
				class186 var4 = new class186(this);
				var4.field1952 = var3.getString("text");
				var4.field1951 = GameObject.method5474(var3.getString("align_x"));
				var4.field1957 = GameObject.method5474(var3.getString("align_y"));
				var4.field1953 = var3.getInt("font");
				var4.field1949 = class182.method3652(var3, "placement");
				this.field1943.add(var4);
			}

		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;B)V",
		garbageValue = "-59"
	)
	void method3713(JSONObject var1) throws JSONException {
		class186 var2 = new class186(this);
		var2.field1952 = var1.optString("text");
		var2.field1951 = GameObject.method5474(var1.optString("align_x"));
		var2.field1957 = GameObject.method5474(var1.optString("align_y"));
		var2.field1953 = var1.optInt("font");
		var2.field1949 = class182.method3652(var1, "placement");
		this.field1943.add(var2);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "-1924064917"
	)
	void method3703(JSONObject var1) throws JSONException {
		if (var1 != null) {
			this.field1941 = class182.method3652(var1, "clickbounds");
			this.field1942 = var1.getString("endpoint");
			String[] var2 = JSONObject.getNames(var1);

			for (int var3 = 0; var3 < var1.length(); ++var3) {
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) {
					try {
						int var4 = var1.getInt(var2[var3]);
						this.field1939.add(new class173(this, var2[var3], var4));
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]);
							if (var5.equals("true")) {
								this.field1939.add(new class173(this, var2[var3], 1));
							} else if (var5.equals("false")) {
								this.field1939.add(new class173(this, var2[var3], 0));
							} else {
								this.field1939.add(new class182(this, var2[var3], var5));
							}
						} catch (Exception var7) {
						}
					}
				}
			}

		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "86525450"
	)
	void method3704(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1);

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			try {
				int var4 = var1.optInt(var2[var3]);
				this.field1946.put(var2[var3], var4);
			} catch (Exception var8) {
				try {
					String var5 = var1.optString(var2[var3]);
					if (var5.equals("true")) {
						this.field1946.put(var2[var3], 1);
					} else if (var5.equals("false")) {
						this.field1946.put(var2[var3], 0);
					} else {
						this.field1945.put(var2[var3], var5);
					}
				} catch (Exception var7) {
				}
			}
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-556406407"
	)
	static int method3708(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-829713781"
	)
	@Export("iLog")
	public static int iLog(int var0) {
		int var1 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var1 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var1 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var1 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var1 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var1;
		}

		return var0 + var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-148338218"
	)
	@Export("SpriteBuffer_decode")
	static void SpriteBuffer_decode(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		var1.offset = var0.length - 2;
		SpriteBufferProperties.SpriteBuffer_spriteCount = var1.readUnsignedShort();
		SpriteBufferProperties.SpriteBuffer_xOffsets = new int[SpriteBufferProperties.SpriteBuffer_spriteCount];
		SpriteBufferProperties.SpriteBuffer_yOffsets = new int[SpriteBufferProperties.SpriteBuffer_spriteCount];
		SpriteBufferProperties.SpriteBuffer_spriteWidths = new int[SpriteBufferProperties.SpriteBuffer_spriteCount];
		SpriteBufferProperties.SpriteBuffer_spriteHeights = new int[SpriteBufferProperties.SpriteBuffer_spriteCount];
		PlayerCompositionColorTextureOverride.SpriteBuffer_pixels = new byte[SpriteBufferProperties.SpriteBuffer_spriteCount][];
		var1.offset = var0.length - 7 - SpriteBufferProperties.SpriteBuffer_spriteCount * 8;
		SpriteBufferProperties.SpriteBuffer_spriteWidth = var1.readUnsignedShort();
		class351.SpriteBuffer_spriteHeight = var1.readUnsignedShort();
		int var2 = (var1.readUnsignedByte() & 255) + 1;

		int var3;
		for (var3 = 0; var3 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var3) {
			SpriteBufferProperties.SpriteBuffer_xOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var3) {
			SpriteBufferProperties.SpriteBuffer_yOffsets[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var3) {
			SpriteBufferProperties.SpriteBuffer_spriteWidths[var3] = var1.readUnsignedShort();
		}

		for (var3 = 0; var3 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var3) {
			SpriteBufferProperties.SpriteBuffer_spriteHeights[var3] = var1.readUnsignedShort();
		}

		var1.offset = var0.length - 7 - SpriteBufferProperties.SpriteBuffer_spriteCount * 8 - (var2 - 1) * 3;
		UrlRequest.SpriteBuffer_spritePalette = new int[var2];

		for (var3 = 1; var3 < var2; ++var3) {
			UrlRequest.SpriteBuffer_spritePalette[var3] = var1.readMedium();
			if (UrlRequest.SpriteBuffer_spritePalette[var3] == 0) {
				UrlRequest.SpriteBuffer_spritePalette[var3] = 1;
			}
		}

		var1.offset = 0;

		for (var3 = 0; var3 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var3) {
			int var4 = SpriteBufferProperties.SpriteBuffer_spriteWidths[var3];
			int var5 = SpriteBufferProperties.SpriteBuffer_spriteHeights[var3];
			int var6 = var5 * var4;
			byte[] var7 = new byte[var6];
			PlayerCompositionColorTextureOverride.SpriteBuffer_pixels[var3] = var7;
			int var8 = var1.readUnsignedByte();
			int var9;
			if (var8 == 0) {
				for (var9 = 0; var9 < var6; ++var9) {
					var7[var9] = var1.readByte();
				}
			} else if (var8 == 1) {
				for (var9 = 0; var9 < var4; ++var9) {
					for (int var10 = 0; var10 < var5; ++var10) {
						var7[var9 + var10 * var4] = var1.readByte();
					}
				}
			}
		}

	}

	@ObfuscatedName("nq")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1266356904"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0;
	}
}
