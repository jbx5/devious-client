import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
public class class180 extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("field1851")
	static EvictingDualNodeHashTable field1851;

	static {
		field1851 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-73"
	)
	public static int method3805(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIZB)V",
		garbageValue = "-65"
	)
	public static void method3804(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (!var0.isEmpty()) {
			class334.field3621.clear();
			class334.field3620.clear();
			class151.method3482(var5);
			class1.method6(var0, var5);
			if (!class334.field3621.isEmpty()) {
				class433.method8269(var1, var2, var3, var4);
				class334.field3620.add(new AddRequestTask((SongTask)null));
				class334.field3620.add(new class449((SongTask)null, class334.field3618, class334.field3615, class456.field4891));
				ArrayList var6 = new ArrayList();
				var6.add(new class444(new FadeInTask((SongTask)null, 0, true, class334.field3625)));
				if (!class334.musicSongs.isEmpty()) {
					ArrayList var7 = new ArrayList();
					var7.add(new DelayFadeTask(new ConcurrentMidiTask((SongTask)null, var6), class334.field3624));
					ArrayList var9 = new ArrayList();
					Iterator var10 = class334.musicSongs.iterator();

					while (var10.hasNext()) {
						MusicSong var11 = (MusicSong)var10.next();
						var9.add(var11);
					}

					var7.add(new DelayFadeTask(new FadeOutTask(new class442((SongTask)null, var9), 0, false, class334.field3614), class334.musicPlayerStatus));
					class334.field3620.add(new ConcurrentMidiTask((SongTask)null, var7));
				} else {
					class334.field3620.add(new DelayFadeTask((SongTask)null, class334.field3624));
					class334.field3620.add(new ConcurrentMidiTask((SongTask)null, var6));
				}

			}
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "([FI)V",
		garbageValue = "-2113900874"
	)
	static void method3807(float[] var0) {
		if (class133.field1561 + var0[0] < 1.3333334F) {
			float var1 = var0[0] - 2.0F;
			float var2 = var0[0] - 1.0F;
			float var3 = (float)Math.sqrt((double)(var1 * var1 - var2 * 4.0F * var2));
			float var4 = 0.5F * (var3 + -var1);
			if (class133.field1561 + var0[1] > var4) {
				var0[1] = var4 - class133.field1561;
			} else {
				var4 = (-var1 - var3) * 0.5F;
				if (var0[1] < var4 + class133.field1561) {
					var0[1] = class133.field1561 + var4;
				}
			}
		} else {
			var0[0] = 1.3333334F - class133.field1561;
			var0[1] = 0.33333334F - class133.field1561;
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1468407111"
	)
	public static void method3808() {
		ParamComposition.ParamDefinition_cached.clear();
	}
}
