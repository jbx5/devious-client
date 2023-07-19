import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hd")
public class class197 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	static final class197 field2058;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	static final class197 field2052;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	static final class197 field2053;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	static final class197 field2054;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	static final class197 field2057;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	static final class197 field2056;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lhd;"
	)
	static final class197 field2055;
	@ObfuscatedName("fj")
	@ObfuscatedGetter(
		longValue = -4902417916876254953L
	)
	static long field2059;
	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("archive2")
	static Archive archive2;

	static {
		field2058 = new class197(0, class210.field2294);
		field2052 = new class197(1, class210.field2297);
		field2053 = new class197(2, class210.field2290);
		field2054 = new class197(3, class210.field2301);
		field2057 = new class197(4, class210.field2300);
		field2056 = new class197(5, class210.field2293);
		field2055 = new class197(6, class210.field2296);
	}

	@ObfuscatedSignature(
		descriptor = "(ILis;)V"
	)
	class197(int var1, class210 var2) {
	}

	@ObfuscatedName("am")
	public static int method3772(long var0) {
		return (int)(var0 >>> 7 & 127L);
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(Lny;Ljava/lang/String;I)V",
		garbageValue = "1681789978"
	)
	static void method3771(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1);
		Client.archiveLoaders.add(var2);
		Client.field814 += var2.groupCount;
	}

	@ObfuscatedName("ie")
	@ObfuscatedSignature(
		descriptor = "(Ldx;I)V",
		garbageValue = "-971627157"
	)
	static final void method3773(Actor var0) {
		boolean var1 = var0.field1239 == Client.cycle || var0.sequence == -1 || var0.sequenceDelay != 0;
		if (!var1) {
			SequenceDefinition var2 = class135.SequenceDefinition_get(var0.sequence);
			if (var2 != null && !var2.isCachedModelIdSet()) {
				var1 = var0.sequenceFrameCycle + 1 > var2.frameLengths[var0.sequenceFrame];
			} else {
				var1 = true;
			}
		}

		if (var1) {
			int var8 = var0.field1239 - var0.spotAnimation;
			int var3 = Client.cycle - var0.spotAnimation;
			int var4 = var0.field1234 * 128 + var0.field1223 * 64;
			int var5 = var0.field1236 * 128 + var0.field1223 * 64;
			int var6 = var0.field1196 * 128 + var0.field1223 * 64;
			int var7 = var0.field1224 * 128 + var0.field1223 * 64;
			var0.x = (var3 * var6 + var4 * (var8 - var3)) / var8;
			var0.y = (var7 * var3 + var5 * (var8 - var3)) / var8;
		}

		var0.field1256 = 0;
		var0.orientation = var0.field1232;
		var0.rotation = var0.orientation;
	}
}
