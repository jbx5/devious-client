import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("hm")
public class class182 extends class188 {
	@ObfuscatedName("qd")
	@ObfuscatedGetter(
		intValue = 552008661
	)
	static int field1908;
	@ObfuscatedName("ak")
	String field1910;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lhj;"
	)
	final class185 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lhj;Ljava/lang/String;Ljava/lang/String;)V"
	)
	class182(class185 var1, String var2, String var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field1910 = var3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-435761148"
	)
	public int vmethod3757() {
		return 1;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2073167750"
	)
	public String vmethod3764() {
		return this.field1910;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "32"
	)
	public static int method3653(int var0, int var1) {
		return (int)(Math.atan2((double)var0, (double)var1) * 325.94932345220167D) & 2047;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([BB)V",
		garbageValue = "-46"
	)
	@Export("ByteArrayPool_release")
	public static void ByteArrayPool_release(byte[] var0) {
		synchronized(ByteArrayPool.field4816) {
			if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4819) {
				ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0;
			} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4825) {
				ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0;
			} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4820) {
				ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0;
			} else if (var0.length == 30000 && ByteArrayPool.field4818 < ByteArrayPool.field4822) {
				ByteArrayPool.field4826[++ByteArrayPool.field4818 - 1] = var0;
			} else {
				if (class202.ByteArrayPool_arrays != null) {
					for (int var2 = 0; var2 < class47.ByteArrayPool_alternativeSizes.length; ++var2) {
						if (var0.length == class47.ByteArrayPool_alternativeSizes[var2] && ByteArrayPool.ByteArrayPool_altSizeArrayCounts[var2] < class202.ByteArrayPool_arrays[var2].length) {
							class202.ByteArrayPool_arrays[var2][ByteArrayPool.ByteArrayPool_altSizeArrayCounts[var2]++] = var0;
							return;
						}
					}
				}

			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lor;Ljava/lang/String;Ljava/lang/String;I)[Lvl;",
		garbageValue = "-698046861"
	)
	@Export("getFont")
	public static IndexedSprite[] getFont(AbstractArchive var0, String var1, String var2) {
		if (!var0.isValidFileName(var1, var2)) {
			return null;
		} else {
			int var3 = var0.getGroupId(var1);
			int var4 = var0.getFileId(var3, var2);
			return class426.method7950(var0, var3, var4);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;B)[F",
		garbageValue = "57"
	)
	static float[] method3652(JSONObject var0, String var1) throws JSONException {
		float[] var2 = new float[4];

		try {
			JSONArray var3 = var0.getJSONArray(var1);
			var2[0] = (float)var3.optDouble(0, 0.0D);
			var2[1] = (float)var3.optDouble(1, 0.0D);
			var2[2] = (float)var3.optDouble(2, 1.0D);
			var2[3] = (float)var3.optDouble(3, 1.0D);
		} catch (JSONException var4) {
			var2[0] = 0.0F;
			var2[1] = 0.0F;
			var2[2] = 1.0F;
			var2[3] = 1.0F;
		}

		return var2;
	}
}
