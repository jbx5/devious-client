import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iu")
public class class227 {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	static final class227 field2438;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	static final class227 field2436;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	static final class227 field2448;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	static final class227 field2440;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	public static final class227 field2447;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	static final class227 field2437;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	public static final class227 field2441;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	public static final class227 field2442;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	public static final class227 field2443;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	public static final class227 field2444;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	public static final class227 field2445;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	public static final class227 field2446;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	static final class227 field2439;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Liu;"
	)
	static final class227 field2435;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1134406591
	)
	public final int field2449;

	static {
		field2438 = new class227(0);
		field2436 = new class227(1);
		field2448 = new class227(2);
		field2440 = new class227(3);
		field2447 = new class227(4, class213.field2183);
		field2437 = new class227(5);
		field2441 = new class227(6, class213.field2184);
		field2442 = new class227(7, class213.field2186);
		field2443 = new class227(8, class213.field2182);
		field2444 = new class227(9, class213.field2185);
		field2445 = new class227(10, class213.field2188);
		field2446 = new class227(11, class213.field2181);
		field2439 = new class227(12);
		field2435 = new class227(13);
	}

	class227(int var1) {
		this(var1, (class213)null);
	}

	@ObfuscatedSignature(
		descriptor = "(ILig;)V"
	)
	class227(int var1, class213 var2) {
		this.field2449 = var1;
	}

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-587894165"
	)
	@Export("formatItemStacks")
	static final String formatItemStacks(int var0) {
		String var1 = Integer.toString(var0);

		for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
			var1 = var1.substring(0, var2) + "," + var1.substring(var2);
		}

		if (var1.length() > 9) {
			return " " + HttpAuthenticationHeader.colorStartTag(65408) + var1.substring(0, var1.length() - 8) + "M" + " " + " (" + var1 + ")" + "</col>";
		} else {
			return var1.length() > 6 ? " " + HttpAuthenticationHeader.colorStartTag(16777215) + var1.substring(0, var1.length() - 4) + "K" + " " + " (" + var1 + ")" + "</col>" : " " + HttpAuthenticationHeader.colorStartTag(16776960) + var1 + "</col>";
		}
	}
}
