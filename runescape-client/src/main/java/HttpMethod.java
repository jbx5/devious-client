import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ar")
@Implements("HttpMethod")
public class HttpMethod implements Enum {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	@Export("POST")
	public static final HttpMethod POST;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	@Export("GET")
	public static final HttpMethod GET;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	@Export("PUT")
	static final HttpMethod PUT;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	@Export("PATCH")
	static final HttpMethod PATCH;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	@Export("DELETE")
	static final HttpMethod DELETE;
	@ObfuscatedName("uw")
	@ObfuscatedGetter(
		intValue = 2028666475
	)
	static int field29;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -890811729
	)
	int field31;
	@ObfuscatedName("af")
	@Export("name")
	String name;
	@ObfuscatedName("at")
	boolean field33;
	@ObfuscatedName("au")
	boolean field34;

	static {
		POST = new HttpMethod(0, "POST", true, true);
		GET = new HttpMethod(1, "GET", true, false);
		PUT = new HttpMethod(2, "PUT", false, true);
		PATCH = new HttpMethod(3, "PATCH", false, true);
		DELETE = new HttpMethod(4, "DELETE", false, true);
	}

	HttpMethod(int var1, String var2, boolean var3, boolean var4) {
		this.field31 = var1;
		this.name = var2;
		this.field33 = var3;
		this.field34 = var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-350930589"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field31;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1331741957"
	)
	boolean method71() {
		return this.field33;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2074778080"
	)
	@Export("getName")
	public String getName() {
		return this.name;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "30553"
	)
	boolean method75() {
		return this.field34;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1174068986"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">";
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[IIIB)V",
		garbageValue = "0"
	)
	@Export("quicksortStringsWithCorrespondingIntegers")
	static void quicksortStringsWithCorrespondingIntegers(String[] var0, int[] var1, int var2, int var3) {
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
			quicksortStringsWithCorrespondingIntegers(var0, var1, var2, var5 - 1);
			quicksortStringsWithCorrespondingIntegers(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("pl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-727187947"
	)
	static void method81(int var0) {
		SequenceDefinition var1 = HealthBarUpdate.SequenceDefinition_get(var0);
		if (var1.isCachedModelIdSet()) {
			if (UserComparator6.method3243(var1.SequenceDefinition_cachedModelId) == 2) {
				Client.field809.add(var1.SequenceDefinition_cachedModelId);
			}

		}
	}
}
