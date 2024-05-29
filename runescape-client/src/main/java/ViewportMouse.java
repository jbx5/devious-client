import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("ak")
	@Export("ViewportMouse_isInViewport")
	static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -2068561419
	)
	@Export("ViewportMouse_x")
	static int ViewportMouse_x;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -291553027
	)
	@Export("ViewportMouse_y")
	static int ViewportMouse_y;
	@ObfuscatedName("az")
	@Export("ViewportMouse_false0")
	static boolean ViewportMouse_false0;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1189565193
	)
	static int field2947;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1637450235
	)
	static int field2944;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -801708007
	)
	static int field2950;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 629882969
	)
	static int field2951;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -101648395
	)
	static int field2952;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -369508143
	)
	static int field2953;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 960707977
	)
	@Export("ViewportMouse_entityCount")
	static int ViewportMouse_entityCount;
	@ObfuscatedName("ae")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;

	static {
		ViewportMouse_isInViewport = false;
		ViewportMouse_x = 0;
		ViewportMouse_y = 0;
		ViewportMouse_false0 = false;
		ViewportMouse_entityCount = 0;
		ViewportMouse_entityTags = new long[1000];
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1475136830"
	)
	public static void method5347() {
		class197.field1864.clear();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2002918647"
	)
	public static boolean method5348(int var0) {
		return var0 >= WorldMapDecorationType.field4013.id && var0 <= WorldMapDecorationType.field4014.id;
	}
}
