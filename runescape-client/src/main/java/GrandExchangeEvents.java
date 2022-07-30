import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import java.util.ArrayList;
import net.runelite.mapping.Implements;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;
import net.runelite.mapping.Export;
@ObfuscatedName("ll")
@Implements("GrandExchangeEvents")
public class GrandExchangeEvents {
	@ObfuscatedName("q")
	@Export("GrandExchangeEvents_ageComparator")
	public static Comparator GrandExchangeEvents_ageComparator = new GrandExchangeOfferAgeComparator();

	@ObfuscatedName("f")
	@Export("GrandExchangeEvents_priceComparator")
	public static Comparator GrandExchangeEvents_priceComparator;

	@ObfuscatedName("u")
	@Export("GrandExchangeEvents_nameComparator")
	public static Comparator GrandExchangeEvents_nameComparator;

	@ObfuscatedName("c")
	@Export("GrandExchangeEvents_quantityComparator")
	public static Comparator GrandExchangeEvents_quantityComparator;

	@ObfuscatedName("o")
	@Export("events")
	public final List events;

	static {
		new GrandExchangeOfferWorldComparator();
		GrandExchangeEvents_priceComparator = new GrandExchangeOfferUnitPriceComparator();
		GrandExchangeEvents_nameComparator = new GrandExchangeOfferNameComparator();
		GrandExchangeEvents_quantityComparator = new GrandExchangeOfferTotalQuantityComparator();
	}

	@ObfuscatedSignature(descriptor = "(Lqw;Z)V", garbageValue = "1")
	public GrandExchangeEvents(Buffer var1, boolean var2) {
		int var3 = var1.readUnsignedShort();
		boolean var4 = var1.readUnsignedByte() == 1;
		byte var5;
		if (var4) {
			var5 = 1;
		} else {
			var5 = 0;
		}
		int var6 = var1.readUnsignedShort();
		this.events = new ArrayList(var6);
		for (int var7 = 0; var7 < var6; ++var7) {
			this.events.add(new GrandExchangeEvent(var1, var5, var3));
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Ljava/util/Comparator;ZI)V", garbageValue = "894465251")
	@Export("sort")
	public void sort(Comparator var1, boolean var2) {
		if (var2) {
			Collections.sort(this.events, var1);
		} else {
			Collections.sort(this.events, Collections.reverseOrder(var1));
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(CLlj;I)C", garbageValue = "-1912727100")
	@Export("standardizeChar")
	static char standardizeChar(char var0, Language var1) {
		if (var0 >= 192 && var0 <= 255) {
			if (var0 >= 192 && var0 <= 198) {
				return 'A';
			}
			if (var0 == 199) {
				return 'C';
			}
			if (var0 >= 200 && var0 <= 203) {
				return 'E';
			}
			if (var0 >= 204 && var0 <= 207) {
				return 'I';
			}
			if (var0 == 209 && var1 != Language.Language_ES) {
				return 'N';
			}
			if (var0 >= 210 && var0 <= 214) {
				return 'O';
			}
			if (var0 >= 217 && var0 <= 220) {
				return 'U';
			}
			if (var0 == 221) {
				return 'Y';
			}
			if (var0 == 223) {
				return 's';
			}
			if (var0 >= 224 && var0 <= 230) {
				return 'a';
			}
			if (var0 == 231) {
				return 'c';
			}
			if (var0 >= 232 && var0 <= 235) {
				return 'e';
			}
			if (var0 >= 236 && var0 <= 239) {
				return 'i';
			}
			if (var0 == 241 && var1 != Language.Language_ES) {
				return 'n';
			}
			if (var0 >= 242 && var0 <= 246) {
				return 'o';
			}
			if (var0 >= 249 && var0 <= 252) {
				return 'u';
			}
			if (var0 == 253 || var0 == 255) {
				return 'y';
			}
		}
		if (var0 == 338) {
			return 'O';
		} else if (var0 == 339) {
			return 'o';
		} else if (var0 == 376) {
			return 'Y';
		} else {
			return var0;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;II[BII)I", garbageValue = "-482290355")
	@Export("encodeStringCp1252")
	public static int encodeStringCp1252(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var5 = var2 - var1;
		for (int var6 = 0; var6 < var5; ++var6) {
			char var7 = var0.charAt(var6 + var1);
			if (var7 > 0 && var7 < 128 || var7 >= 160 && var7 <= 255) {
				var3[var6 + var4] = ((byte) (var7));
			} else if (var7 == 8364) {
				var3[var6 + var4] = -128;
			} else if (var7 == 8218) {
				var3[var6 + var4] = -126;
			} else if (var7 == 402) {
				var3[var6 + var4] = -125;
			} else if (var7 == 8222) {
				var3[var6 + var4] = -124;
			} else if (var7 == 8230) {
				var3[var6 + var4] = -123;
			} else if (var7 == 8224) {
				var3[var6 + var4] = -122;
			} else if (var7 == 8225) {
				var3[var6 + var4] = -121;
			} else if (var7 == 710) {
				var3[var6 + var4] = -120;
			} else if (var7 == 8240) {
				var3[var6 + var4] = -119;
			} else if (var7 == 352) {
				var3[var6 + var4] = -118;
			} else if (var7 == 8249) {
				var3[var6 + var4] = -117;
			} else if (var7 == 338) {
				var3[var6 + var4] = -116;
			} else if (var7 == 381) {
				var3[var6 + var4] = -114;
			} else if (var7 == 8216) {
				var3[var6 + var4] = -111;
			} else if (var7 == 8217) {
				var3[var6 + var4] = -110;
			} else if (var7 == 8220) {
				var3[var6 + var4] = -109;
			} else if (var7 == 8221) {
				var3[var6 + var4] = -108;
			} else if (var7 == 8226) {
				var3[var6 + var4] = -107;
			} else if (var7 == 8211) {
				var3[var6 + var4] = -106;
			} else if (var7 == 8212) {
				var3[var6 + var4] = -105;
			} else if (var7 == 732) {
				var3[var6 + var4] = -104;
			} else if (var7 == 8482) {
				var3[var6 + var4] = -103;
			} else if (var7 == 353) {
				var3[var6 + var4] = -102;
			} else if (var7 == 8250) {
				var3[var6 + var4] = -101;
			} else if (var7 == 339) {
				var3[var6 + var4] = -100;
			} else if (var7 == 382) {
				var3[var6 + var4] = -98;
			} else if (var7 == 376) {
				var3[var6 + var4] = -97;
			} else {
				var3[var6 + var4] = 63;
			}
		}
		return var5;
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(descriptor = "(ZI)V", garbageValue = "-1540462723")
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0;
	}
}