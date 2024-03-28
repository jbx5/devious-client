import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("hp")
public class class184 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lhp;"
	)
	static final class184 field1950;
	@ObfuscatedName("ah")
	Map field1949;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 110298369
	)
	int field1947;

	static {
		field1950 = new class184();
	}

	class184() {
		this.field1949 = new HashMap();
		this.field1947 = 0;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILea;B)V",
		garbageValue = "52"
	)
	void method3642(JSONObject var1, int var2, UrlRequester var3) {
		this.field1949.clear();

		JSONObject var4;
		try {
			var4 = var1;
			this.field1947 = var2;
			var1.getLong("lastfullsyncat");
			var1.getLong("lastcardupdatedat");
		} catch (Exception var7) {
			return;
		}

		try {
			this.method3653(var4.getJSONArray("crmcomponents"), this.field1947, var3);
		} catch (Exception var6) {
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;ILea;I)V",
		garbageValue = "-1679305152"
	)
	void method3653(JSONArray var1, int var2, UrlRequester var3) throws JSONException {
		if (var1 != null) {
			for (int var4 = 0; var4 < var1.length(); ++var4) {
				JSONObject var5 = var1.getJSONObject(var4);
				if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
					String var6 = var5.getString("platform");
					if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
						class182 var7 = new class182();

						try {
							var7.method3632(var5, var2, var3);
						} catch (Exception var9) {
						}

						if (!var7.field1932.isEmpty()) {
							String var8 = var5.getString("location");
							this.field1949.put(var8, var7);
						}
					}
				}
			}

			this.field1949 = this.method3644();
			VerticalAlignment.method3924();
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "-106898828"
	)
	Map method3644() {
		HashMap var1 = new HashMap();
		ArrayList var2 = new ArrayList();
		var2.addAll(this.field1949.entrySet());
		boolean var3 = false;

		while (!var3) {
			var3 = true;

			for (int var7 = 0; var7 < var2.size() - 1; ++var7) {
				if (((class182)((Entry)var2.get(var7)).getValue()).method3598() > ((class182)((Entry)var2.get(var7 + 1)).getValue()).method3598()) {
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lhq;",
		garbageValue = "981160288"
	)
	class182 method3645(String var1) {
		return (class182)this.field1949.get(var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1416050896"
	)
	static int method3662(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1;
		}
	}
}
