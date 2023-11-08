import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
@Implements("ViewportMouse")
public class ViewportMouse {
	@ObfuscatedName("at")
	@Export("ViewportMouse_isInViewport")
	static boolean ViewportMouse_isInViewport;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1259262891
	)
	@Export("ViewportMouse_x")
	static int ViewportMouse_x;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1166454903
	)
	@Export("ViewportMouse_y")
	static int ViewportMouse_y;
	@ObfuscatedName("ao")
	@Export("ViewportMouse_false0")
	static boolean ViewportMouse_false0;
	@ObfuscatedName("au")
	@Export("Tiles_shapes")
	static byte[][][] Tiles_shapes;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1840865647
	)
	static int field3011;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -446446865
	)
	static int field3013;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1653083147
	)
	static int field3008;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1324042001
	)
	@Export("ViewportMouse_entityCount")
	static int ViewportMouse_entityCount;
	@ObfuscatedName("ay")
	@Export("ViewportMouse_entityTags")
	public static long[] ViewportMouse_entityTags;
	@ObfuscatedName("kx")
	@ObfuscatedGetter(
		intValue = 1224938461
	)
	@Export("cameraX")
	static int cameraX;

	static {
		ViewportMouse_isInViewport = false;
		ViewportMouse_x = 0;
		ViewportMouse_y = 0;
		ViewportMouse_false0 = false;
		ViewportMouse_entityCount = 0;
		ViewportMouse_entityTags = new long[1000];
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lol;I)V",
		garbageValue = "181873849"
	)
	public static void method5697(AbstractArchive var0) {
		VarpDefinition.VarpDefinition_archive = var0;
		VarpDefinition.field1815 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16);
	}
}
