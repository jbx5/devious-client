import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService; import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kg")
@Implements("Varps")
public class Varps {
	@ObfuscatedName("v")
	@Export("Varps_masks")
	static int[] Varps_masks;
	@ObfuscatedName("c")
	@Export("Varps_temp")
	public static int[] Varps_temp;
	@ObfuscatedName("i")
	@Export("Varps_main")
	public static int[] Varps_main;
	static 
	{
		Varps_masks = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			Varps_masks[var1] = var0 - 1;
			var0 += var0;
		}

		Varps_temp = new int[4000];
		Varps_main = new int[4000];
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = 
	"(Lff;III)Lay;", garbageValue = 
	"-1753293698")

	public static final PcmPlayer method5523(TaskHandler var0, int var1, int var2) {
		if ((var1 >= 0) && (var1 < 2)) {
			if (var2 < 256) {
				var2 = 256;
			}

			try {
				PcmPlayer var3 = class384.pcmPlayerProvider.player();
				var3.samples = new int[(PcmPlayer.PcmPlayer_stereo ? 2 : 1) * 256];
				var3.field289 = var2;
				var3.init();
				var3.capacity = (var2 & (-1024)) + 1024;
				if (var3.capacity > 16384) {
					var3.capacity = 16384;
				}

				var3.open(var3.capacity);
				if ((PcmPlayer.field295 > 0) && (class6.soundSystem == null)) {
					class6.soundSystem = new SoundSystem();
					WorldMapSection1.soundSystemExecutor = Executors.newScheduledThreadPool(1);
					WorldMapSection1.soundSystemExecutor.scheduleAtFixedRate(class6.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
				}

				if (class6.soundSystem != null) {
					if (class6.soundSystem.players[var1] != null) {
						throw new IllegalArgumentException();
					}

					class6.soundSystem.players[var1] = var3;
				}

				return var3;
			} catch (Throwable var4) {
				return new PcmPlayer();
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}