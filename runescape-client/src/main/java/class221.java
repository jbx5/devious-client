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

@ObfuscatedName("ix")
public class class221 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lix;"
	)
	static final class221 field2373;
	@ObfuscatedName("ap")
	Map field2371;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1865511625
	)
	int field2372;

	static {
		field2373 = new class221();
	}

	class221() {
		this.field2371 = new HashMap();
		this.field2372 = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;ILeg;B)V",
		garbageValue = "117"
	)
	void method4351(JSONObject var1, int var2, UrlRequester var3) {
		this.field2371.clear();

		JSONObject var4;
		try {
			var4 = var1;
			this.field2372 = var2;
			var1.getLong("lastfullsyncat");
			var1.getLong("lastcardupdatedat");
		} catch (Exception var7) {
			return;
		}

		try {
			this.method4357(var4.getJSONArray("crmcomponents"), this.field2372, var3);
		} catch (Exception var6) {
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONArray;ILeg;B)V",
		garbageValue = "57"
	)
	void method4357(JSONArray var1, int var2, UrlRequester var3) throws JSONException {
		if (var1 != null) {
			for (int var4 = 0; var4 < var1.length(); ++var4) {
				JSONObject var5 = var1.getJSONObject(var4);
				if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
					String var6 = var5.getString("platform");
					if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
						class219 var7 = new class219();

						try {
							var7.method4319(var5, var2, var3);
						} catch (Exception var9) {
						}

						if (!var7.field2356.isEmpty()) {
							String var8 = var5.getString("location");
							this.field2371.put(var8, var7);
						}
					}
				}
			}

			this.field2371 = this.method4353();
			UserComparator9.method2973();
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(S)Ljava/util/Map;",
		garbageValue = "-15024"
	)
	Map method4353() {
		HashMap var1 = new HashMap();
		ArrayList var2 = new ArrayList();
		var2.addAll(this.field2371.entrySet());
		boolean var3 = false;

		while (!var3) {
			var3 = true;

			for (int var7 = 0; var7 < var2.size() - 1; ++var7) {
				if (((class219)((Entry)var2.get(var7)).getValue()).method4317() > ((class219)((Entry)var2.get(var7 + 1)).getValue()).method4317()) {
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lih;",
		garbageValue = "713553195"
	)
	class219 method4354(String var1) {
		return (class219)this.field2371.get(var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "44"
	)
	static final int method4355(int var0, int var1, int var2, int var3) {
		return var0 * var2 - var3 * var1 >> 16;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Low;II)V",
		garbageValue = "-641761940"
	)
	public static void method4364(AbstractArchive var0, int var1) {
		if (!class319.field3466.isEmpty()) {
			ArrayList var2 = new ArrayList();
			Iterator var3 = class319.field3466.iterator();

			while (var3.hasNext()) {
				MusicSong var4 = (MusicSong)var3.next();
				var4.field3579 = false;
				var4.field3575 = false;
				var4.field3580 = false;
				var4.field3581 = false;
				var4.musicTrackArchive = var0;
				var4.musicTrackVolume = var1;
				var4.field3576 = 0.0F;
				var2.add(var4);
			}

			LoginScreenAnimation.method2528(var2, class319.musicPlayerStatus, class319.field3464, class319.field3465, class319.field3454, false);
		}
	}
}
