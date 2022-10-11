import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("fc")
public class class156 {
	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("fontPlain11")
	static Font fontPlain11;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -677819103
	)
	int field1745;
	@ObfuscatedName("x")
	String field1740;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lcm;"
	)
	UrlRequest field1741;
	@ObfuscatedName("v")
	String field1742;
	@ObfuscatedName("h")
	float[] field1743;
	@ObfuscatedName("t")
	ArrayList field1734;
	@ObfuscatedName("u")
	ArrayList field1744;
	@ObfuscatedName("d")
	ArrayList field1736;
	@ObfuscatedName("b")
	Map field1749;
	@ObfuscatedName("a")
	Map field1748;

	public class156() {
		this.field1745 = -1; // L: 24
		this.field1742 = null; // L: 27
		this.field1743 = new float[4]; // L: 28
		this.field1734 = new ArrayList(); // L: 29
		this.field1744 = new ArrayList(); // L: 30
		this.field1736 = new ArrayList(); // L: 31
		this.field1749 = new HashMap(); // L: 32
		this.field1748 = new HashMap(); // L: 33
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lch;B)Z",
		garbageValue = "6"
	)
	public boolean method3374(String var1, UrlRequester var2) {
		if (var1 != null && !var1.isEmpty()) { // L: 36
			if (var2 == null) { // L: 39
				return false; // L: 40
			} else {
				this.method3354(); // L: 42

				try {
					this.field1740 = var1; // L: 44
					this.field1741 = var2.request(new URL(this.field1740)); // L: 45
					this.field1745 = 0; // L: 46
					return true; // L: 47
				} catch (MalformedURLException var4) { // L: 49
					this.method3354(); // L: 50
					this.field1745 = 100; // L: 51
					return false; // L: 52
				}
			}
		} else {
			return false; // L: 37
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lch;I)V",
		garbageValue = "2063306110"
	)
	public void method3345(UrlRequester var1) {
		switch(this.field1745) { // L: 57
		case 0:
			this.method3358(var1);
			break; // L: 64
		case 1:
			this.method3356(); // L: 59
			break;
		default:
			return; // L: 62
		}

	} // L: 67

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "94"
	)
	public int method3346() {
		return this.field1745; // L: 70
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)I",
		garbageValue = "-91"
	)
	public int method3347(String var1) {
		return this.field1749.containsKey(var1) ? (Integer)this.field1749.get(var1) : -1; // L: 74
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "16"
	)
	public String method3398(String var1) {
		return (String)((String)(this.field1748.containsKey(var1) ? this.field1748.get(var1) : null)); // L: 78
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/util/ArrayList;",
		garbageValue = "18519"
	)
	public ArrayList method3369() {
		return this.field1744; // L: 82
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/ArrayList;",
		garbageValue = "0"
	)
	public ArrayList method3350() {
		return this.field1736; // L: 86
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-1540585633"
	)
	public String method3408() {
		return this.field1742; // L: 90
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)[F",
		garbageValue = "643585474"
	)
	public float[] method3352() {
		return this.field1743; // L: 94
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/ArrayList;",
		garbageValue = "1464603360"
	)
	public ArrayList method3353() {
		return this.field1734; // L: 98
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "101"
	)
	void method3354() {
		this.field1741 = null; // L: 102
		this.field1742 = null; // L: 103
		this.field1743[0] = 0.0F; // L: 104
		this.field1743[1] = 0.0F; // L: 105
		this.field1743[2] = 1.0F; // L: 106
		this.field1743[3] = 1.0F; // L: 107
		this.field1734.clear(); // L: 108
		this.field1744.clear(); // L: 109
		this.field1736.clear(); // L: 110
		this.field1749.clear(); // L: 111
		this.field1748.clear(); // L: 112
	} // L: 113

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lch;I)V",
		garbageValue = "-1243026809"
	)
	void method3358(UrlRequester var1) {
		if (this.field1741 != null && this.field1741.isDone()) { // L: 116
			byte[] var2 = this.field1741.getResponse(); // L: 119
			if (var2 == null) { // L: 120
				this.method3354(); // L: 121
				this.field1745 = 100; // L: 122
			} else {
				JSONObject var3;
				try {
					class401 var4 = new class401(var2); // L: 127
					var3 = var4.method7307(); // L: 128
					var3 = var3.getJSONObject("message"); // L: 129
				} catch (Exception var9) { // L: 131
					this.method3354(); // L: 132
					this.field1745 = 102; // L: 133
					return; // L: 134
				}

				try {
					this.method3357(var3.getJSONArray("images"), var1); // L: 137
				} catch (Exception var8) { // L: 139
					this.field1744.clear(); // L: 140
				}

				try {
					this.method3406(var3.getJSONArray("labels")); // L: 143
				} catch (Exception var7) { // L: 145
					this.field1736.clear(); // L: 146
				}

				try {
					this.method3359(var3.getJSONObject("behaviour")); // L: 149
				} catch (Exception var6) { // L: 151
					this.field1742 = null; // L: 152
					this.field1743[0] = 0.0F; // L: 153
					this.field1743[1] = 0.0F; // L: 154
					this.field1743[2] = 1.0F; // L: 155
					this.field1743[3] = 1.0F; // L: 156
					this.field1734.clear(); // L: 157
				}

				try {
					this.method3373(var3.getJSONObject("meta")); // L: 160
				} catch (Exception var5) { // L: 162
					this.field1749.clear(); // L: 163
					this.field1748.clear(); // L: 164
				}

				this.field1745 = this.field1744.size() > 0 ? 1 : 2; // L: 166
				this.field1741 = null; // L: 167
			}
		}
	} // L: 117 123 168

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	void method3356() {
		Iterator var1 = this.field1744.iterator(); // L: 171

		class161 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field1744.iterator(); // L: 179

				while (var1.hasNext()) {
					var2 = (class161)var1.next(); // L: 180
					if (var2.field1786 != null) { // L: 182
						byte[] var3 = var2.field1786.getResponse(); // L: 183
						if (var3 != null && var3.length > 0) { // L: 184
							this.field1745 = 2; // L: 185
							return; // L: 186
						}
					}
				}

				this.method3354(); // L: 191
				this.field1745 = 101; // L: 192
				return; // L: 193
			}

			var2 = (class161)var1.next(); // L: 172
		} while(var2.field1786 == null || var2.field1786.isDone()); // L: 174

	} // L: 175

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;Lch;B)V",
		garbageValue = "-40"
	)
	void method3357(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) { // L: 196
			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 197
				try {
					JSONObject var4 = var1.getJSONObject(var3); // L: 199
					class161 var5 = new class161(this); // L: 200
					var5.field1786 = var2.request(new URL(var4.getString("src"))); // L: 201
					var5.field1781 = EnumComposition.method3622(var4, "placement"); // L: 202
					this.field1744.add(var5); // L: 203
				} catch (MalformedURLException var6) { // L: 205
				}
			}

		}
	} // L: 207

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;S)V",
		garbageValue = "-6900"
	)
	void method3406(JSONArray var1) throws JSONException {
		if (var1 != null) { // L: 210
			for (int var2 = 0; var2 < var1.length(); ++var2) { // L: 211
				JSONObject var3 = var1.getJSONObject(var2); // L: 212
				class162 var4 = new class162(this); // L: 213
				var4.field1788 = var3.getString("text"); // L: 214
				var4.field1792 = JagexCache.method3441(var3.getString("align_x")); // L: 215
				var4.field1793 = JagexCache.method3441(var3.getString("align_y")); // L: 216
				var4.field1794 = var3.getInt("font"); // L: 217
				var4.field1791 = EnumComposition.method3622(var3, "placement"); // L: 218
				this.field1736.add(var4); // L: 219
			}

		}
	} // L: 221

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "1343260933"
	)
	void method3359(JSONObject var1) throws JSONException {
		if (var1 != null) { // L: 224
			this.field1743 = EnumComposition.method3622(var1, "clickbounds"); // L: 225
			this.field1742 = var1.getString("endpoint"); // L: 226
			String[] var2 = JSONObject.getNames(var1); // L: 227

			for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 228
				if (!var2[var3].equals("clickbounds") && !var2[var3].equals("endpoint")) { // L: 229
					try {
						int var4 = var1.getInt(var2[var3]); // L: 231
						this.field1734.add(new class163(this, var2[var3], var4)); // L: 232
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]); // L: 236
							if (var5.equals("true")) { // L: 237
								this.field1734.add(new class163(this, var2[var3], 1)); // L: 238
							} else if (var5.equals("false")) { // L: 240
								this.field1734.add(new class163(this, var2[var3], 0)); // L: 241
							} else {
								this.field1734.add(new class155(this, var2[var3], var5)); // L: 244
							}
						} catch (Exception var7) { // L: 247
						}
					}
				}
			}

		}
	} // L: 251

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;I)V",
		garbageValue = "-389541572"
	)
	void method3373(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1); // L: 254

		for (int var3 = 0; var3 < var1.length(); ++var3) { // L: 255
			try {
				int var4 = var1.getInt(var2[var3]); // L: 257
				this.field1749.put(var2[var3], var4); // L: 258
			} catch (Exception var8) {
				try {
					String var5 = var1.getString(var2[var3]); // L: 262
					if (var5.equals("true")) { // L: 263
						this.field1749.put(var2[var3], 1); // L: 264
					} else if (var5.equals("false")) { // L: 266
						this.field1749.put(var2[var3], 0); // L: 267
					} else {
						this.field1748.put(var2[var3], var5); // L: 270
					}
				} catch (Exception var7) { // L: 273
				}
			}
		}

	} // L: 276

	@ObfuscatedName("w")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L); // L: 69
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1805450282"
	)
	static final int method3395() {
		if (Player.clientPreferences.method2452()) { // L: 4781
			return Tiles.Client_plane;
		} else {
			int var0 = class120.getTileHeight(TaskHandler.cameraX, ApproximateRouteStrategy.cameraZ, Tiles.Client_plane); // L: 4782
			return var0 - SecureRandomFuture.cameraY < 800 && (Tiles.Tiles_renderFlags[Tiles.Client_plane][TaskHandler.cameraX >> 7][ApproximateRouteStrategy.cameraZ >> 7] & 4) != 0 ? Tiles.Client_plane : 3; // L: 4783 4784
		}
	}

	@ObfuscatedName("jl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1115779957"
	)
	static final int method3411() {
		return Client.menuOptionsCount - 1; // L: 9397
	}
}
