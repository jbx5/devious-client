import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ks")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("am")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -2060820501
	)
	@Export("ViewportMouse_x")
	static int ViewportMouse_x;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1618414729
	)
	@Export("ViewportMouse_y")
	static int ViewportMouse_y;
	@ObfuscatedName("aj")
	@Export("ViewportMouse_false0")
	static boolean ViewportMouse_false0;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 120211727
	)
	static int field3063;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 834556407
	)
	static int field3054;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1800620077
	)
	static int field3055;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 957714839
	)
	@Export("ItemDefinition_fileCount")
	public static int ItemDefinition_fileCount;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1748635223
	)
	@Export("ViewportMouse_entityCount")
	public static int ViewportMouse_entityCount;
	@ObfuscatedName("aw")
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
}
