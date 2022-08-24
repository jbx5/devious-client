import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("mr")
public class class342 {
	@ObfuscatedName("s")
	static char[] field4144 = new char[64];

	@ObfuscatedName("h")
	static char[] field4145;

	@ObfuscatedName("w")
	static char[] field4147;

	@ObfuscatedName("v")
	static int[] field4146;

	static {
		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field4144[var0] = ((char) (var0 + 65));
		}
		for (var0 = 26; var0 < 52; ++var0) {
			field4144[var0] = ((char) (var0 + 97 - 26));
		}
		for (var0 = 52; var0 < 62; ++var0) {
			field4144[var0] = ((char) (var0 + 48 - 52));
		}
		field4144[62] = '+';
		field4144[63] = '/';
		field4145 = new char[64];
		for (var0 = 0; var0 < 26; ++var0) {
			field4145[var0] = ((char) (var0 + 65));
		}
		for (var0 = 26; var0 < 52; ++var0) {
			field4145[var0] = ((char) (var0 + 97 - 26));
		}
		for (var0 = 52; var0 < 62; ++var0) {
			field4145[var0] = ((char) (var0 + 48 - 52));
		}
		field4145[62] = '*';
		field4145[63] = '-';
		field4147 = new char[64];
		for (var0 = 0; var0 < 26; ++var0) {
			field4147[var0] = ((char) (var0 + 65));
		}
		for (var0 = 26; var0 < 52; ++var0) {
			field4147[var0] = ((char) (var0 + 97 - 26));
		}
		for (var0 = 52; var0 < 62; ++var0) {
			field4147[var0] = ((char) (var0 + 48 - 52));
		}
		field4147[62] = '-';
		field4147[63] = '_';
		field4146 = new int[128];
		for (var0 = 0; var0 < class342.field4146.length; ++var0) {
			field4146[var0] = -1;
		}
		for (var0 = 65; var0 <= 90; ++var0) {
			field4146[var0] = var0 - 65;
		}
		for (var0 = 97; var0 <= 122; ++var0) {
			field4146[var0] = var0 - 97 + 26;
		}
		for (var0 = 48; var0 <= 57; ++var0) {
			field4146[var0] = var0 - 48 + 52;
		}
		int[] var2 = field4146;
		field4146[43] = 62;
		var2[42] = 62;
		int[] var1 = field4146;
		field4146[47] = 63;
		var1[45] = 63;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-21882073")
	public static final void method6200(int var0, int var1) {
		ViewportMouse.ViewportMouse_x = var0;
		ViewportMouse.ViewportMouse_y = var1;
		ViewportMouse.ViewportMouse_isInViewport = true;
		ViewportMouse.ViewportMouse_entityCount = 0;
		ViewportMouse.ViewportMouse_false0 = false;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Lam;I)V", garbageValue = "-1744938892")
	public static final void method6201(class47 var0) {
		GrandExchangeOfferTotalQuantityComparator.pcmPlayerProvider = var0;
	}
}