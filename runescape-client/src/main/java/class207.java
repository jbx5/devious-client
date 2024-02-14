import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hz")
public class class207 {
	@ObfuscatedName("wq")
	@ObfuscatedGetter(
		intValue = 1951750999
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	static final class207 field2290;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	static final class207 field2276;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	static final class207 field2277;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	static final class207 field2286;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	public static final class207 field2279;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	static final class207 field2275;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	public static final class207 field2287;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	public static final class207 field2281;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	public static final class207 field2283;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	public static final class207 field2284;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	public static final class207 field2285;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	public static final class207 field2280;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	static final class207 field2278;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	static final class207 field2288;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1269733693
	)
	public final int field2289;

	static {
		field2290 = new class207(0);
		field2276 = new class207(1);
		field2277 = new class207(2);
		field2286 = new class207(3);
		field2279 = new class207(4, class193.field2027);
		field2275 = new class207(5);
		field2287 = new class207(6, class193.field2028);
		field2281 = new class207(7, class193.field2025);
		field2283 = new class207(8, class193.field2030);
		field2284 = new class207(9, class193.field2029);
		field2285 = new class207(10, class193.field2031);
		field2280 = new class207(11, class193.field2026);
		field2278 = new class207(12);
		field2288 = new class207(13);
	}

	class207(int var1) {
		this(var1, (class193)null);
	}

	@ObfuscatedSignature(
		descriptor = "(ILhx;)V"
	)
	class207(int var1, class193 var2) {
		this.field2289 = var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "2078236639"
	)
	static String method4107() {
		return class30.clientPreferences.isUsernameHidden() ? class368.method7012(Login.Login_username) : Login.Login_username;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)[Ldd;",
		garbageValue = "3"
	)
	static class90[] method4106() {
		return new class90[]{class90.field1116, class90.field1122, class90.field1118, class90.field1117, class90.field1115};
	}
}
