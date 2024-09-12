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

@ObfuscatedName("iu")
public class class229 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	static final class229 field2456;
	@ObfuscatedName("qz")
	@ObfuscatedSignature(
		descriptor = "Lei;"
	)
	@Export("varcs")
	static Varcs varcs;
	@ObfuscatedName("ae")
	Map field2454;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1291370009
	)
	int field2453;

	static {
		field2456 = new class229();
	}

	class229() {
		this.field2454 = new HashMap();
		this.field2453 = 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILen;B)V",
		garbageValue = "117"
	)
	void method4596(JSONObject var1, int var2, UrlRequester var3) {
		this.field2454.clear();

		JSONObject var4;
		try {
			var4 = var1;
			this.field2453 = var2;
			var1.getLong("lastfullsyncat");
			var1.getLong("lastcardupdatedat");
		} catch (Exception var7) {
			return;
		}

		try {
			this.method4598(var4.getJSONArray("crmcomponents"), this.field2453, var3);
		} catch (Exception var6) {
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;ILen;I)V",
		garbageValue = "-1465360902"
	)
	void method4598(JSONArray var1, int var2, UrlRequester var3) throws JSONException {
		if (var1 != null) {
			for (int var4 = 0; var4 < var1.length(); ++var4) {
				JSONObject var5 = var1.getJSONObject(var4);
				if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
					String var6 = var5.getString("platform");
					if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
						class227 var7 = new class227();

						try {
							var7.method4556(var5, var2, var3);
						} catch (Exception var9) {
						}

						if (!var7.field2437.isEmpty()) {
							String var8 = var5.getString("location");
							this.field2454.put(var8, var7);
						}
					}
				}
			}

			this.field2454 = this.method4606();
			WorldMapElement.method3843();
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "2095021776"
	)
	Map method4606() {
		HashMap var1 = new HashMap();
		ArrayList var2 = new ArrayList();
		var2.addAll(this.field2454.entrySet());
		boolean var3 = false;

		while (!var3) {
			var3 = true;

			for (int var7 = 0; var7 < var2.size() - 1; ++var7) {
				if (((class227)((Entry)var2.get(var7)).getValue()).method4554() > ((class227)((Entry)var2.get(var7 + 1)).getValue()).method4554()) {
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

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Liy;",
		garbageValue = "-41"
	)
	class227 method4599(String var1) {
		return (class227)this.field2454.get(var1);
	}
}
