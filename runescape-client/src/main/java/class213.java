import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ii")
public class class213 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	static final class213 field2339;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	static final class213 field2334;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	static final class213 field2342;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	public static final class213 field2333;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	static final class213 field2337;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	public static final class213 field2338;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	static final class213 field2340;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	static final class213 field2343;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	static final class213 field2341;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	static final class213 field2335;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	static final class213 field2336;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	public static final class213 field2344;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	static final class213 field2345;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lii;"
	)
	static final class213 field2346;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 541927411
	)
	public final int field2347;

	static {
		field2339 = new class213(0);
		field2334 = new class213(1);
		field2342 = new class213(2);
		field2333 = new class213(3);
		field2337 = new class213(4);
		field2338 = new class213(5);
		field2340 = new class213(6);
		field2343 = new class213(7);
		field2341 = new class213(8);
		field2335 = new class213(9);
		field2336 = new class213(10);
		field2344 = new class213(11);
		field2345 = new class213(12);
		field2346 = new class213(13);
	}

	class213(int var1) {
		this.field2347 = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Z",
		garbageValue = "1834373449"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		boolean var2 = false;
		boolean var3 = false;
		int var4 = 0;
		int var5 = var0.length();
		int var6 = 0;

		boolean var1;
		while (true) {
			if (var6 >= var5) {
				var1 = var3;
				break;
			}

			label86: {
				char var7 = var0.charAt(var6);
				if (var6 == 0) {
					if (var7 == '-') {
						var2 = true;
						break label86;
					}

					if (var7 == '+') {
						break label86;
					}
				}

				int var9;
				if (var7 >= '0' && var7 <= '9') {
					var9 = var7 - '0';
				} else if (var7 >= 'A' && var7 <= 'Z') {
					var9 = var7 - '7';
				} else {
					if (var7 < 'a' || var7 > 'z') {
						var1 = false;
						break;
					}

					var9 = var7 - 'W';
				}

				if (var9 >= 10) {
					var1 = false;
					break;
				}

				if (var2) {
					var9 = -var9;
				}

				int var8 = var4 * 10 + var9;
				if (var4 != var8 / 10) {
					var1 = false;
					break;
				}

				var4 = var8;
				var3 = true;
			}

			++var6;
		}

		return var1;
	}

	@ObfuscatedName("at")
	@Export("Entity_unpackID")
	public static int Entity_unpackID(long var0) {
		return (int)(var0 >>> 17 & 4294967295L);
	}
}
