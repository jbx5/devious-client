import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("ub")
	@ObfuscatedSignature(
		descriptor = "Lbr;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("c")
	@Export("Varps_masks")
	static int[] Varps_masks;
	@ObfuscatedName("p")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("f")
	@Export("Varps_main")
	public static int[] Varps_main;

	static {
		Varps_masks = new int[32]; // L: 6
		int var0 = 2; // L: 9

		for (int var1 = 0; var1 < 32; ++var1) { // L: 10
			Varps_masks[var1] = var0 - 1; // L: 11
			var0 += var0; // L: 12
		}

		Varps_temp = new int[4000]; // L: 16
		Varps_main = new int[4000];
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "([Llq;II)Llq;",
		garbageValue = "-1925758966"
	)
	@Export("findEnumerated")
	public static MouseWheel findEnumerated(MouseWheel[] var0, int var1) {
		MouseWheel[] var2 = var0; // L: 17

		for (int var3 = 0; var3 < var2.length; ++var3) { // L: 18
			MouseWheel var4 = var2[var3]; // L: 19
			if (var1 == var4.rsOrdinal()) {
				return var4; // L: 21
			}
		}

		return null; // L: 25
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1558722409"
	)
	static int method5699(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 59
		if (var1 == null) { // L: 60
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count; // L: 61 62
		}
	}
}
