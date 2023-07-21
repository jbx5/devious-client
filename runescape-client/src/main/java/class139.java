import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
public enum class139 implements MouseWheel {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	field1634(3, 0),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	field1628(1, 1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	field1629(2, 2),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	field1630(4, 3),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	field1631(0, 4);

	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = -1552511079
	)
	static int field1627;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1364431959
	)
	public final int field1632;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 665629367
	)
	@Export("id")
	final int id;

	class139(int var3, int var4) {
		this.field1632 = var3;
		this.id = var4;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1644350448"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Lnd;IZI)Ljm;",
		garbageValue = "-1006656334"
	)
	public static Frames method3103(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true;
		int[] var5 = var0.getGroupFileIds(var2);

		for (int var6 = 0; var6 < var5.length; ++var6) {
			byte[] var7 = var0.getFile(var2, var5[var6]);
			if (var7 == null) {
				var4 = false;
			} else {
				int var8 = (var7[0] & 255) << 8 | var7[1] & 255;
				byte[] var9;
				if (var3) {
					var9 = var1.getFile(0, var8);
				} else {
					var9 = var1.getFile(var8, 0);
				}

				if (var9 == null) {
					var4 = false;
				}
			}
		}

		if (!var4) {
			return null;
		} else {
			try {
				return new Frames(var0, var1, var2, var3);
			} catch (Exception var11) {
				return null;
			}
		}
	}
}
