import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ei")
@Implements("Players")
public class Players {
	@ObfuscatedName("ak")
	static byte[] field1377;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Lip;"
	)
	static class231[] field1370;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Lul;"
	)
	static Buffer[] field1373;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1030271551
	)
	@Export("Players_count")
	static int Players_count;
	@ObfuscatedName("ar")
	@Export("Players_indices")
	static int[] Players_indices;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1755360327
	)
	@Export("Players_emptyIdxCount")
	static int Players_emptyIdxCount;
	@ObfuscatedName("am")
	@Export("Players_emptyIndices")
	static int[] Players_emptyIndices;
	@ObfuscatedName("av")
	@Export("Players_regions")
	static int[] Players_regions;
	@ObfuscatedName("ag")
	@Export("Players_orientations")
	static int[] Players_orientations;
	@ObfuscatedName("aa")
	@Export("Players_targetIndices")
	static int[] Players_targetIndices;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 734156083
	)
	@Export("Players_pendingUpdateCount")
	static int Players_pendingUpdateCount;
	@ObfuscatedName("ay")
	@Export("Players_pendingUpdateIndices")
	static int[] Players_pendingUpdateIndices;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lul;"
	)
	static Buffer field1371;

	static {
		field1377 = new byte[2048];
		field1370 = new class231[2048];
		field1373 = new Buffer[2048];
		Players_count = 0;
		Players_indices = new int[2048];
		Players_emptyIdxCount = 0;
		Players_emptyIndices = new int[2048];
		Players_regions = new int[2048];
		Players_orientations = new int[2048];
		Players_targetIndices = new int[2048];
		Players_pendingUpdateCount = 0;
		Players_pendingUpdateIndices = new int[2048];
		field1371 = new Buffer(new byte[5000]);
	}

	@ObfuscatedName("ac")
	public static final void method2741(long var0) {
		if (var0 > 0L) {
			if (0L == var0 % 10L) {
				long var2 = var0 - 1L;

				try {
					Thread.sleep(var2);
				} catch (InterruptedException var8) {
				}

				try {
					Thread.sleep(1L);
				} catch (InterruptedException var7) {
				}
			} else {
				try {
					Thread.sleep(var0);
				} catch (InterruptedException var6) {
				}
			}

		}
	}
}
