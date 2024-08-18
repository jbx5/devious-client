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

@ObfuscatedName("iw")
public class class223 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Liw;"
	)
	static final class223 field2421;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = -1554786987
	)
	static int field2423;
	@ObfuscatedName("ay")
	Map field2422;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1275250821
	)
	int field2420;

	static {
		field2421 = new class223();
	}

	class223() {
		this.field2422 = new HashMap();
		this.field2420 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILex;I)V",
		garbageValue = "226692602"
	)
	void method4714(JSONObject var1, int var2, UrlRequester var3) {
		this.field2422.clear();

		JSONObject var4;
		try {
			var4 = var1;
			this.field2420 = var2;
			var1.getLong("lastfullsyncat");
			var1.getLong("lastcardupdatedat");
		} catch (Exception var7) {
			return;
		}

		try {
			this.method4705(var4.getJSONArray("crmcomponents"), this.field2420, var3);
		} catch (Exception var6) {
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;ILex;B)V",
		garbageValue = "0"
	)
	void method4705(JSONArray var1, int var2, UrlRequester var3) throws JSONException {
		if (var1 != null) {
			for (int var4 = 0; var4 < var1.length(); ++var4) {
				JSONObject var5 = var1.getJSONObject(var4);
				if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
					String var6 = var5.getString("platform");
					if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
						class221 var7 = new class221();

						try {
							var7.method4680(var5, var2, var3);
						} catch (Exception var9) {
						}

						if (!var7.field2405.isEmpty()) {
							String var8 = var5.getString("location");
							this.field2422.put(var8, var7);
						}
					}
				}
			}

			this.field2422 = this.method4706();
			RouteStrategy.method5439();
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/Map;",
		garbageValue = "2"
	)
	Map method4706() {
		HashMap var1 = new HashMap();
		ArrayList var2 = new ArrayList();
		var2.addAll(this.field2422.entrySet());
		boolean var3 = false;

		while (!var3) {
			var3 = true;

			for (int var7 = 0; var7 < var2.size() - 1; ++var7) {
				if (((class221)((Entry)var2.get(var7)).getValue()).method4668() > ((class221)((Entry)var2.get(var7 + 1)).getValue()).method4668()) {
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

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lii;",
		garbageValue = "495469634"
	)
	class221 method4707(String var1) {
		return (class221)this.field2422.get(var1);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZI)V",
		garbageValue = "-339125798"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var6 = (var0 + var1) / 2;
			int var7 = var0;
			World var8 = class319.World_worlds[var6];
			class319.World_worlds[var6] = class319.World_worlds[var1];
			class319.World_worlds[var1] = var8;

			for (int var9 = var0; var9 < var1; ++var9) {
				World var11 = class319.World_worlds[var9];
				int var12 = class164.compareWorlds(var11, var8, var2, var3);
				int var10;
				if (var12 != 0) {
					if (var3) {
						var10 = -var12;
					} else {
						var10 = var12;
					}
				} else if (var4 == -1) {
					var10 = 0;
				} else {
					int var13 = class164.compareWorlds(var11, var8, var4, var5);
					if (var5) {
						var10 = -var13;
					} else {
						var10 = var13;
					}
				}

				if (var10 <= 0) {
					World var14 = class319.World_worlds[var9];
					class319.World_worlds[var9] = class319.World_worlds[var7];
					class319.World_worlds[var7++] = var14;
				}
			}

			class319.World_worlds[var1] = class319.World_worlds[var7];
			class319.World_worlds[var7] = var8;
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5);
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5);
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIB)V",
		garbageValue = "85"
	)
	public static void method4719(ArrayList var0, int var1, int var2, int var3, int var4) {
		class332.field3565.clear();
		class332.field3565.addAll(var0);
		UserComparator6.method3100(var1, var2, var3, var4);
	}

	@ObfuscatedName("ii")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1404113903"
	)
	static final int method4708(int var0) {
		return Math.min(Math.max(var0, 128), 383);
	}

	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-6"
	)
	static void method4720() {
		if (class139.field1622 != null) {
			Client.field794 = Client.cycle;
			class139.field1622.method7465();

			for (int var0 = 0; var0 < ConcurrentMidiTask.topLevelWorldView.players.length; ++var0) {
				if (ConcurrentMidiTask.topLevelWorldView.players[var0] != null) {
					class139.field1622.method7458((ConcurrentMidiTask.topLevelWorldView.players[var0].x >> 7) + ConcurrentMidiTask.topLevelWorldView.baseX, (ConcurrentMidiTask.topLevelWorldView.players[var0].y >> 7) + ConcurrentMidiTask.topLevelWorldView.baseY);
				}
			}
		}

	}
}
