import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sj")
public class class487 implements class492 {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = -7444871008356671971L
	)
	static long field5014;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Luw;"
	)
	public final class522 field5016;

	@ObfuscatedSignature(
		descriptor = "(Lui;)V"
	)
	class487(class523 var1) {
		this.field5016 = var1;
	}

	@ObfuscatedSignature(
		descriptor = "(Lsg;)V"
	)
	public class487(class488 var1) {
		this(new class523(var1));
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "1"
	)
	public int method8865(int var1) {
		return this.field5016.vmethod9333(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "550336594"
	)
	public static String method8869(CharSequence var0) {
		int var1 = var0.length();
		StringBuilder var2 = new StringBuilder(var1);

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') {
				if (var4 == ' ') {
					var2.append('+');
				} else {
					byte var5 = GrandExchangeOfferNameComparator.charToByteCp1252(var4);
					var2.append('%');
					int var6 = var5 >> 4 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}

					var6 = var5 & 15;
					if (var6 >= 10) {
						var2.append((char)(var6 + 55));
					} else {
						var2.append((char)(var6 + 48));
					}
				}
			} else {
				var2.append(var4);
			}
		}

		return var2.toString();
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "([BIIB)I",
		garbageValue = "21"
	)
	public static int method8868(byte[] var0, int var1, int var2) {
		int var3 = -1;

		for (int var4 = var1; var4 < var2; ++var4) {
			var3 = var3 >>> 8 ^ Buffer.field5384[(var3 ^ var0[var4]) & 255];
		}

		var3 = ~var3;
		return var3;
	}
}
