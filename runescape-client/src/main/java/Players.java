import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
@Implements("Players")
public class Players {
	@ObfuscatedName("i")
	static byte[] field1283;
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"[Lgm;")

	static class193[] field1286;
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"[Lpi;")

	static Buffer[] field1276;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	1248043757)

	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("s")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	-1950904155)

	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("q")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("o")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("r")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("p")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 
	-2045827781)

	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("k")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"Lpi;")

	static Buffer field1273;
	@ObfuscatedName("ef")
	@ObfuscatedSignature(descriptor = 
	"Llx;")

	@Export("archive5")
	static Archive archive5;
	static 
	{
		field1283 = new byte[2048];
		field1286 = new class193[2048];
		field1276 = new Buffer[2048];
		Players_count = 0;
		Players_indices = new int[2048];
		Players_emptyIdxCount = 0;
		Players_emptyIndices = new int[2048];
		Players_regions = new int[2048];
		Players_orientations = new int[2048];
		Players_targetIndices = new int[2048];
		Players_pendingUpdateCount = 0;
		Players_pendingUpdateIndices = new int[2048];
		field1273 = new Buffer(new byte[5000]);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(IB)I", garbageValue = 
	"124")

	public static int method2420(int var0) {
		return (var0 >> 17) & 7;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(IIB)V", garbageValue = 
	"-54")

	@Export("changeWorldSelectSorting")
	static void changeWorldSelectSorting(int var0, int var1) {
		int[] var2 = new int[4];
		int[] var3 = new int[4];
		var2[0] = var0;
		var3[0] = var1;
		int var4 = 1;

		for (int var5 = 0; var5 < 4; ++var5) {
			if (World.World_sortOption1[var5] != var0) {
				var2[var4] = World.World_sortOption1[var5];
				var3[var4] = World.World_sortOption2[var5];
				++var4;
			}
		}

		World.World_sortOption1 = var2;
		World.World_sortOption2 = var3;
		class127.sortWorlds(DevicePcmPlayerProvider.World_worlds, 0, DevicePcmPlayerProvider.World_worlds.length - 1, World.World_sortOption1, World.World_sortOption2);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1709005821")

	static void method2421() {
		if ((Login.Login_username == null) || (Login.Login_username.length() <= 0)) {
			if (class131.clientPreferences.method2247() != null) {
				Login.Login_username = class131.clientPreferences.method2247();
				Client.Login_isUsernameRemembered = true;
			} else {
				Client.Login_isUsernameRemembered = false;
			}

		}
	}

	@ObfuscatedName("fk")
	@ObfuscatedSignature(descriptor = 
	"(III)V", garbageValue = 
	"2053593928")

	static void method2419(int var0, int var1) {
		if ((class131.clientPreferences.method2321() != 0) && (var0 != (-1))) {
			class18.method266(Message.archive11, var0, 0, class131.clientPreferences.method2321(), false);
			Client.field746 = true;
		}

	}
}