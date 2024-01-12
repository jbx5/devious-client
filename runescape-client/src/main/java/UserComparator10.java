import java.util.Collections;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
@Implements("UserComparator10")
public class UserComparator10 extends AbstractUserComparator {
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("loginType")
	static LoginType loginType;
	@ObfuscatedName("am")
	@Export("reversed")
	final boolean reversed;

	public UserComparator10(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lrj;Lrj;B)I",
		garbageValue = "1"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) {
			return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([I[II)V",
		garbageValue = "1119204610"
	)
	public static void method2989(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) {
			class208.ByteArrayPool_alternativeSizes = var0;
			FileSystem.ByteArrayPool_altSizeArrayCounts = new int[var0.length];
			class155.ByteArrayPool_arrays = new byte[var0.length][][];

			for (int var2 = 0; var2 < class208.ByteArrayPool_alternativeSizes.length; ++var2) {
				class155.ByteArrayPool_arrays[var2] = new byte[var1[var2]][];
				ByteArrayPool.field4627.add(var0[var2]);
			}

			Collections.sort(ByteArrayPool.field4627);
		} else {
			class208.ByteArrayPool_alternativeSizes = null;
			FileSystem.ByteArrayPool_altSizeArrayCounts = null;
			class155.ByteArrayPool_arrays = null;
			ByteArrayPool.field4627.clear();
			ByteArrayPool.field4627.add(100);
			ByteArrayPool.field4627.add(5000);
			ByteArrayPool.field4627.add(10000);
			ByteArrayPool.field4627.add(30000);
		}
	}
}
