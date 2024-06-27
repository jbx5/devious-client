import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("il")
public class class226 {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	static final class226 field2423;
	@ObfuscatedName("ad")
	Map field2426;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1357104911
	)
	int field2424;

	static {
		field2423 = new class226();
	}

	class226() {
		this.field2426 = new HashMap();
		this.field2424 = 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILea;I)V",
		garbageValue = "-665193983"
	)
	void method4317(JSONObject var1, int var2, UrlRequester var3) {
		this.field2426.clear();

		JSONObject var4;
		try {
			var4 = var1;
			this.field2424 = var2;
			var1.getLong("lastfullsyncat");
			var1.getLong("lastcardupdatedat");
		} catch (Exception var7) {
			return;
		}

		try {
			this.method4313(var4.getJSONArray("crmcomponents"), this.field2424, var3);
		} catch (Exception var6) {
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;ILea;B)V",
		garbageValue = "-2"
	)
	void method4313(JSONArray var1, int var2, UrlRequester var3) throws JSONException {
		if (var1 != null) {
			for (int var4 = 0; var4 < var1.length(); ++var4) {
				JSONObject var5 = var1.getJSONObject(var4);
				if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
					String var6 = var5.getString("platform");
					if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
						class224 var7 = new class224();

						try {
							var7.method4277(var5, var2, var3);
						} catch (Exception var9) {
						}

						if (!var7.field2403.isEmpty()) {
							String var8 = var5.getString("location");
							this.field2426.put(var8, var7);
						}
					}
				}
			}

			this.field2426 = this.method4309();
			WorldMapData_1.method4861();
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Map;",
		garbageValue = "0"
	)
	Map method4309() {
		HashMap var1 = new HashMap();
		ArrayList var2 = new ArrayList();
		var2.addAll(this.field2426.entrySet());
		boolean var3 = false;

		while (!var3) {
			var3 = true;

			for (int var7 = 0; var7 < var2.size() - 1; ++var7) {
				if (((class224)((Entry)var2.get(var7)).getValue()).method4289() > ((class224)((Entry)var2.get(var7 + 1)).getValue()).method4289()) {
					Entry var4 = (Entry)var2.get(var7);
					var2.set(var7, var2.get(var7 + 1));
					var2.set(var7 + 1, var4);
					var3 = false;
				}
			}
		}

		Iterator var5 = var2.iterator();

		while (var5.hasNext()) {
			Entry var6 = (Entry)var5.next();
			var1.put(var6.getKey(), var6.getValue());
		}

		return var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)Lif;",
		garbageValue = "8221"
	)
	class224 method4310(String var1) {
		return (class224)this.field2426.get(var1);
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "([BS)[B",
		garbageValue = "4008"
	)
	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		int var2 = var1.readUnsignedByte();
		int var3 = var1.readInt();
		if (var3 < 0 || AbstractArchive.field4542 != 0 && var3 > AbstractArchive.field4542) {
			throw new RuntimeException();
		} else if (var2 == 0) {
			byte[] var6 = new byte[var3];
			var1.readBytes(var6, 0, var3);
			return var6;
		} else {
			int var4 = var1.readInt();
			if (var4 >= 0 && (AbstractArchive.field4542 == 0 || var4 <= AbstractArchive.field4542)) {
				byte[] var5 = new byte[var4];
				if (var2 == 1) {
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5);
				}

				return var5;
			} else {
				throw new RuntimeException();
			}
		}
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIIIIII)V",
		garbageValue = "-1758350391"
	)
	static void method4318(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
		var1 = var1 * 128 + 64;
		var2 = var2 * 128 + 64;
		var3 = var3 * 128 + 64;
		var4 = var4 * 128 + 64;
		Projectile var14 = new Projectile(var6, var0, var1, var2, class169.getTileHeight(HttpResponse.worldView, var1, var2, var0) - var7, var9 + Client.cycle, var10 + Client.cycle, var11, var12, var13, var5, var8);
		var14.setDestination(var3, var4, class169.getTileHeight(HttpResponse.worldView, var3, var4, var0) - var8, var9 + Client.cycle);
		HttpResponse.worldView.projectiles.addFirst(var14);
	}
}
