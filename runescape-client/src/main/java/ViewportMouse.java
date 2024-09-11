import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("jy")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("ac")
	@Export("ViewportMouse_isInViewport")
	public static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -50258285
	)
	@Export("ViewportMouse_x")
	public static int ViewportMouse_x;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -556185469
	)
	@Export("ViewportMouse_y")
	public static int ViewportMouse_y;
	@ObfuscatedName("am")
	@Export("ViewportMouse_false0")
	public static boolean ViewportMouse_false0;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -496618377
	)
	static int field2877;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -130333621
	)
	static int field2878;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1277639787
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
		ViewportMouse_entityCount = 0;
		ViewportMouse_entityTags = new long[1000];
	}
}
