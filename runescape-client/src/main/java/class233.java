import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
public enum class233 implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	field2471((byte)-1),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	field2469((byte)0),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	field2470((byte)1),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	field2472((byte)2);

	@ObfuscatedName("ar")
	public byte field2473;

	class233(byte var3) {
		this.field2473 = var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field2473;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(Lhe;I)Z",
		garbageValue = "1258060610"
	)
	static boolean method4568(ObjectComposition var0) {
		if (var0.transforms != null) {
			int[] var1 = var0.transforms;

			for (int var2 = 0; var2 < var1.length; ++var2) {
				int var3 = var1[var2];
				ObjectComposition var4 = class127.getObjectDefinition(var3);
				if (var4.mapIconId != -1) {
					return true;
				}
			}
		} else if (var0.mapIconId != -1) {
			return true;
		}

		return false;
	}
}
