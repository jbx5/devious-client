import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jr")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("ap")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1947001953
	)
	@Export("ViewportMouse_x")
	public static int ViewportMouse_x;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 253742759
	)
	@Export("ViewportMouse_y")
	public static int ViewportMouse_y;
	@ObfuscatedName("aj")
	@Export("ViewportMouse_false0")
	public static boolean ViewportMouse_false0;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1803987651
	)
	static int field2892;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -872402463
	)
	static int field2898;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1354270943
	)
	static int field2890;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 671731361
	)
	static int field2894;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -874831979
	)
	static int field2896;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqt;"
	)
	static class426 field2897;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 278912807
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("ab")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;

	static {
		ViewportMouse_isInViewport = false;
		ViewportMouse_x = 0;
		ViewportMouse_y = 0;
		ViewportMouse_false0 = false;
		field2897 = new class426();
		ViewportMouse_entityCount = 0;
		ViewportMouse_entityTags = new long[1000];
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvl;Lkt;III)V",
		garbageValue = "-638484385"
	)
	public static void method5487(Buffer var0, class274 var1, int var2, int var3) {
		var1.method5790(var2, var3);
		var1.method5774(0);
		var1.method5773(0);
		byte var4 = var0.readByte();
		if (var4 != 0) {
			int var5 = class496.method9322(var0, var4, 0);
			int var6 = class496.method9322(var0, var4, 2);
			int var7 = class496.method9322(var0, var4, 4);
			int var8 = class496.method9322(var0, var4, 6);
			var1.method5782(var5, var6, var7, var8);
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "2128422475"
	)
	public static String method5473(CharSequence var0) {
		int var2 = var0.length();
		char[] var3 = new char[var2];

		for (int var4 = 0; var4 < var2; ++var4) {
			var3[var4] = '*';
		}

		String var1 = new String(var3);
		return var1;
	}
}
