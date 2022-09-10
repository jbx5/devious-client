import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import netscape.javascript.JSObject;

@ObfuscatedName("ii")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	static final WorldMapID field2873;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	static final WorldMapID field2868;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -362664165
	)
	static int field2870;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 943758061
	)
	static int field2874;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -414282509
	)
	@Export("value")
	final int value;

	static {
		field2873 = new WorldMapID(0); // L: 4
		field2868 = new WorldMapID(1); // L: 5
	}

	WorldMapID(int var1) {
		this.value = var1; // L: 9
	} // L: 10

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Llb;II)V",
		garbageValue = "-1011889815"
	)
	public static void method5123(Archive var0, int var1) {
		MilliClock.field1810.offset = var1 * 8 + 5; // L: 137
		if (MilliClock.field1810.offset >= MilliClock.field1810.array.length) { // L: 138
			if (var0.field4028) { // L: 139
				var0.method5983(); // L: 140
			} else {
				throw new RuntimeException(""); // L: 143
			}
		} else {
			int var2 = MilliClock.field1810.readInt(); // L: 145
			int var3 = MilliClock.field1810.readInt(); // L: 146
			var0.loadIndex(var2, var3); // L: 147
		}
	} // L: 141 148

	@ObfuscatedName("mx")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-501668566"
	)
	static void method5124(String var0) {
		AttackOption.field1279 = var0; // L: 12065

		try {
			String var1 = IgnoreList.client.getParameter(Integer.toString(18)); // L: 12067
			String var2 = IgnoreList.client.getParameter(Integer.toString(13)); // L: 12068
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2; // L: 12069
			if (var0.length() == 0) { // L: 12070
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var3 = var3 + "; Expires=" + IgnoreList.method6781(Language.method6232() + 94608000000L) + "; Max-Age=" + 94608000L; // L: 12071
			}

			Client var4 = IgnoreList.client; // L: 12072
			String var5 = "document.cookie=\"" + var3 + "\""; // L: 12073
			JSObject.getWindow(var4).eval(var5); // L: 12076
		} catch (Throwable var6) { // L: 12079
		}

	} // L: 12080
}
