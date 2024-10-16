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

@ObfuscatedName("ib")
public class class229 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lib;"
	)
	static final class229 field2460;
	@ObfuscatedName("mk")
	@ObfuscatedGetter(
		intValue = 718657319
	)
	static int field2458;
	@ObfuscatedName("aw")
	Map field2457;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1343084049
	)
	int field2459;

	static {
		field2460 = new class229();
	}

	class229() {
		this.field2457 = new HashMap();
		this.field2459 = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILex;I)V",
		garbageValue = "-2121827703"
	)
	void method4628(JSONObject var1, int var2, UrlRequester var3) {
		this.field2457.clear();

		JSONObject var4;
		try {
			var4 = var1;
			this.field2459 = var2;
			var1.getLong("lastfullsyncat");
			var1.getLong("lastcardupdatedat");
		} catch (Exception var7) {
			return;
		}

		try {
			this.method4642(var4.getJSONArray("crmcomponents"), this.field2459, var3);
		} catch (Exception var6) {
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;ILex;I)V",
		garbageValue = "-1270313536"
	)
	void method4642(JSONArray var1, int var2, UrlRequester var3) throws JSONException {
		if (var1 != null) {
			for (int var4 = 0; var4 < var1.length(); ++var4) {
				JSONObject var5 = var1.getJSONObject(var4);
				if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
					String var6 = var5.getString("platform");
					if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
						class227 var7 = new class227();

						try {
							var7.method4594(var5, var2, var3);
						} catch (Exception var9) {
						}

						if (!var7.field2441.isEmpty()) {
							String var8 = var5.getString("location");
							this.field2457.put(var8, var7);
						}
					}
				}
			}

			this.field2457 = this.method4630();
			class77.method2338();
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/util/Map;",
		garbageValue = "179"
	)
	Map method4630() {
		HashMap var1 = new HashMap();
		ArrayList var2 = new ArrayList();
		var2.addAll(this.field2457.entrySet());
		boolean var3 = false;

		while (!var3) {
			var3 = true;

			for (int var7 = 0; var7 < var2.size() - 1; ++var7) {
				if (((class227)((Entry)var2.get(var7)).getValue()).method4590() > ((class227)((Entry)var2.get(var7 + 1)).getValue()).method4590()) {
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Lik;",
		garbageValue = "0"
	)
	class227 method4644(String var1) {
		return (class227)this.field2457.get(var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpe;Lpe;I)I",
		garbageValue = "-493309570"
	)
	static int method4631(AbstractArchive var0, AbstractArchive var1) {
		int var2 = 0;
		String[] var3 = Login.field958;

		int var4;
		String var5;
		for (var4 = 0; var4 < var3.length; ++var4) {
			var5 = var3[var4];
			if (var0.tryLoadFileByNames(var5, "")) {
				++var2;
			}
		}

		var3 = Login.field959;

		for (var4 = 0; var4 < var3.length; ++var4) {
			var5 = var3[var4];
			if (var1.tryLoadFileByNames(var5, "")) {
				++var2;
			}
		}

		var3 = Login.field960;

		for (var4 = 0; var4 < var3.length; ++var4) {
			var5 = var3[var4];
			if (var1.getGroupId(var5) != -1 && var1.tryLoadFileByNames(var5, "")) {
				++var2;
			}
		}

		return var2;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILdy;I)Ldn;",
		garbageValue = "-1928971736"
	)
	public static WorldView method4627(int var0, WorldViewManager var1) {
		Iterator var2 = var1.iterator();

		WorldView var3;
		do {
			if (!var2.hasNext()) {
				return var1.method2670();
			}

			var3 = (WorldView)var2.next();
		} while(var3.players[var0] == null || var3.id == -1);

		return var3;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1195419660"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count;
		}
	}
}
