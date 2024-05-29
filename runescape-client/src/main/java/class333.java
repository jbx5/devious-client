import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("my")
public class class333 {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lgc;"
	)
	static ClanSettings field3642;
	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	static Archive field3643;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 435230045
	)
	int field3639;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lck;"
	)
	class53 field3640;

	@ObfuscatedSignature(
		descriptor = "(ILck;)V"
	)
	class333(int var1, class53 var2) {
		this.field3639 = var1;
		this.field3640 = var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lor;Lor;IZI)Lfo;",
		garbageValue = "421206246"
	)
	public static class141 method6434(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true;
		byte[] var5 = var0.getFile(var2 >> 16 & 65535, var2 & 65535);
		if (var5 == null) {
			var4 = false;
			return null;
		} else {
			int var6 = (var5[1] & 255) << 8 | var5[2] & 255;
			byte[] var7;
			if (var3) {
				var7 = var1.getFile(0, var6);
			} else {
				var7 = var1.getFile(var6, 0);
			}

			if (var7 == null) {
				var4 = false;
			}

			if (!var4) {
				return null;
			} else {
				if (PcmPlayer.field279 == null) {
					class141.field1649 = Runtime.getRuntime().availableProcessors();
					PcmPlayer.field279 = new ThreadPoolExecutor(0, class141.field1649, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class141.field1649 * 100 + 100), new class138());
				}

				try {
					return new class141(var0, var1, var2, var3);
				} catch (Exception var9) {
					return null;
				}
			}
		}
	}
}
