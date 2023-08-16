import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("il")
public class class209 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	static final class209 field2331;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	static final class209 field2329;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	static final class209 field2343;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	static final class209 field2337;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	public static final class209 field2332;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	static final class209 field2333;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	public static final class209 field2328;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	public static final class209 field2330;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	public static final class209 field2335;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	public static final class209 field2342;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	public static final class209 field2338;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	public static final class209 field2339;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	static final class209 field2340;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lil;"
	)
	static final class209 field2341;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1460826415
	)
	public final int field2334;

	static {
		field2331 = new class209(0);
		field2329 = new class209(1);
		field2343 = new class209(2);
		field2337 = new class209(3);
		field2332 = new class209(4, class197.field2087);
		field2333 = new class209(5);
		field2328 = new class209(6, class197.field2088);
		field2330 = new class209(7, class197.field2091);
		field2335 = new class209(8, class197.field2093);
		field2342 = new class209(9, class197.field2089);
		field2338 = new class209(10, class197.field2090);
		field2339 = new class209(11, class197.field2086);
		field2340 = new class209(12);
		field2341 = new class209(13);
	}

	class209(int var1) {
		this(var1, (class197)null);
	}

	@ObfuscatedSignature(
		descriptor = "(ILhp;)V"
	)
	class209(int var1, class197 var2) {
		this.field2334 = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "61"
	)
	static int method4072(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1;
		}
	}
}
