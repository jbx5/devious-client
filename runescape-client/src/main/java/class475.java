import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sk")
public class class475 implements HttpContent {
	@ObfuscatedName("at")
	final Map field4816;

	public class475(Map var1) {
		this.field4816 = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)Lsi;",
		garbageValue = "-24"
	)
	public HttpContentType type() {
		return null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "0"
	)
	public byte[] vmethod8587() throws UnsupportedEncodingException {
		return this.method8589().getBytes("UTF-8");
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2008716639"
	)
	public String method8589() throws UnsupportedEncodingException {
		StringBuilder var1 = new StringBuilder();
		Iterator var2 = this.field4816.entrySet().iterator();

		while (var2.hasNext()) {
			Entry var3 = (Entry)var2.next();
			String var4 = URLEncoder.encode((String)var3.getKey(), "UTF-8");
			String var5 = URLEncoder.encode((String)var3.getValue(), "UTF-8");
			var1.append(var4).append("=").append(var5).append("&");
		}

		if (var1.length() == 0) {
			return "";
		} else {
			var1.deleteCharAt(var1.length() - 1);
			var1.insert(0, "?");
			return var1.toString();
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IIIB)V",
		garbageValue = "-67"
	)
	public static void method8597(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			String var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;

			for (int var8 = var2; var8 < var3; ++var8) {
				if (var6 == null || var0[var8] != null && var0[var8].compareTo(var6) < (var8 & 1)) {
					String var9 = var0[var8];
					var0[var8] = var0[var5];
					var0[var5] = var9;
					int var10 = var1[var8];
					var1[var8] = var1[var5];
					var1[var5++] = var10;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method8597(var0, var1, var2, var5 - 1);
			method8597(var0, var1, var5 + 1, var3);
		}

	}
}
