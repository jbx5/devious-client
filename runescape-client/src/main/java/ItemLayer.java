import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1091610659
	)
	@Export("z")
	int z;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 2108686336
	)
	@Export("x")
	int x;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -697043463
	)
	@Export("y")
	int y;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		longValue = -2233441093947553815L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 810270927
	)
	@Export("height")
	int height;

	ItemLayer() {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1029444021"
	)
	public static void method4476() {
		if (MouseHandler.MouseHandler_instance != null) {
			synchronized(MouseHandler.MouseHandler_instance) {
				MouseHandler.MouseHandler_instance = null;
			}
		}

	}
}
