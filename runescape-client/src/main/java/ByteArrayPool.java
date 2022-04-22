import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("my")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 
	2043697785)

	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	1060831441)

	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 
	-1175962597)

	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	1771611339)

	static int field4163;
	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 
	-321282309)

	static int field4159;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	-178630953)

	static int field4160;
	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 
	-308081175)

	static int field4161;
	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = 
	889627885)

	static int field4152;
	@ObfuscatedName("w")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("k")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("d")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("m")
	static byte[][] field4162;
	@ObfuscatedName("x")
	static ArrayList field4167;
	@ObfuscatedName("mh")
	@ObfuscatedGetter(intValue = 
	1658529089)

	@Export("menuHeight")
	static int menuHeight;
	static 
	{
		ByteArrayPool_smallCount = 0;
		ByteArrayPool_mediumCount = 0;
		ByteArrayPool_largeCount = 0;
		field4163 = 0;
		field4159 = 1000;
		field4160 = 250;
		field4161 = 100;
		field4152 = 50;
		ByteArrayPool_small = new byte[1000][];
		ByteArrayPool_medium = new byte[250][];
		ByteArrayPool_large = new byte[100][];
		field4162 = new byte[50][];
		field4167 = new ArrayList();
		Login.method1960();
		new HashMap();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(IZB)[B", garbageValue = 
	"-82")

	@Export("ByteArrayPool_getArrayBool")
	static synchronized byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		byte[] var4;
		if (var0 != 100) {
			if (var0 < 100) {
			}
		} else if (ByteArrayPool_smallCount > 0) {
			var4 = ByteArrayPool_small[--ByteArrayPool_smallCount];
			ByteArrayPool_small[ByteArrayPool_smallCount] = null;
			return var4;
		}

		if (var0 != 5000) {
			if (var0 < 5000) {
			}
		} else if (ByteArrayPool_mediumCount > 0) {
			var4 = ByteArrayPool_medium[--ByteArrayPool_mediumCount];
			ByteArrayPool_medium[ByteArrayPool_mediumCount] = null;
			return var4;
		}

		if (var0 != 10000) {
			if (var0 < 10000) {
			}
		} else if (ByteArrayPool_largeCount > 0) {
			var4 = ByteArrayPool_large[--ByteArrayPool_largeCount];
			ByteArrayPool_large[ByteArrayPool_largeCount] = null;
			return var4;
		}

		if (var0 != 30000) {
			if (var0 < 30000) {
			}
		} else if (field4163 > 0) {
			var4 = field4162[--field4163];
			field4162[field4163] = null;
			return var4;
		}

		if (BoundaryObject.ByteArrayPool_arrays != null) {
			for (int var2 = 0; var2 < FloorOverlayDefinition.ByteArrayPool_alternativeSizes.length; ++var2) {
				if (FloorOverlayDefinition.ByteArrayPool_alternativeSizes[var2] != var0) {
					if (var0 < FloorOverlayDefinition.ByteArrayPool_alternativeSizes[var2]) {
					}
				} else if (class128.ByteArrayPool_altSizeArrayCounts[var2] > 0) {
					byte[] var3 = BoundaryObject.ByteArrayPool_arrays[var2][--class128.ByteArrayPool_altSizeArrayCounts[var2]];
					BoundaryObject.ByteArrayPool_arrays[var2][class128.ByteArrayPool_altSizeArrayCounts[var2]] = null;
					return var3;
				}
			}
		}

		return new byte[var0];
	}

	@ObfuscatedName("it")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1492106780")

	@Export("addCancelMenuEntry")
	static void addCancelMenuEntry() {
		Client.menuOptionsCount = 0;
		Client.isMenuOpen = false;
		Client.menuActions[0] = "Cancel";
		Client.menuTargets[0] = "";
		Client.menuOpcodes[0] = 1006;
		Client.menuShiftClick[0] = false;
		Client.menuOptionsCount = 1;
	}
}