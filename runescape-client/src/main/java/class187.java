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

@ObfuscatedName("hb")
public class class187 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lhb;"
	)
	static final class187 field1962;
	@ObfuscatedName("al")
	Map field1960;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 539899087
	)
	int field1961;

	static {
		field1962 = new class187();
	}

	class187() {
		this.field1960 = new HashMap();
		this.field1961 = 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILeb;I)V",
		garbageValue = "2010923569"
	)
	void method3738(JSONObject var1, int var2, UrlRequester var3) {
		this.field1960.clear();

		JSONObject var4;
		try {
			var4 = var1;
			this.field1961 = var2;
			var1.getLong("lastfullsyncat");
			var1.getLong("lastcardupdatedat");
		} catch (Exception var7) {
			return;
		}

		try {
			this.method3746(var4.getJSONArray("crmcomponents"), this.field1961, var3);
		} catch (Exception var6) {
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;ILeb;I)V",
		garbageValue = "-1407371092"
	)
	void method3746(JSONArray var1, int var2, UrlRequester var3) throws JSONException {
		if (var1 != null) {
			for (int var4 = 0; var4 < var1.length(); ++var4) {
				JSONObject var5 = var1.getJSONObject(var4);
				if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
					String var6 = var5.getString("platform");
					if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
						class185 var7 = new class185();

						try {
							var7.method3698(var5, var2, var3);
						} catch (Exception var9) {
						}

						if (!var7.field1942.isEmpty()) {
							String var8 = var5.getString("location");
							this.field1960.put(var8, var7);
						}
					}
				}
			}

			this.field1960 = this.method3740();
			class129.method3033();
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "-741177481"
	)
	Map method3740() {
		HashMap var1 = new HashMap();
		ArrayList var2 = new ArrayList();
		var2.addAll(this.field1960.entrySet());
		boolean var3 = false;

		while (!var3) {
			var3 = true;

			for (int var7 = 0; var7 < var2.size() - 1; ++var7) {
				if (((class185)((Entry)var2.get(var7)).getValue()).method3696() > ((class185)((Entry)var2.get(var7 + 1)).getValue()).method3696()) {
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lhj;",
		garbageValue = "-1783933882"
	)
	class185 method3748(String var1) {
		return (class185)this.field1960.get(var1);
	}
}
