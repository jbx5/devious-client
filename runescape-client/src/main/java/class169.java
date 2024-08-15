import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
public class class169 {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "963632768"
	)
	public static void method3598() {
		synchronized(ArchiveDiskActionHandler.field4440) {
			if (ArchiveDiskActionHandler.field4438 != 0) {
				ArchiveDiskActionHandler.field4438 = 1;
				ArchiveDiskActionHandler.field4441 = true;

				try {
					ArchiveDiskActionHandler.field4440.wait();
				} catch (InterruptedException var3) {
				}
			}

		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lig;III)Lbi;",
		garbageValue = "1426461447"
	)
	public static final PcmPlayer method3596(TaskHandler var0, int var1, int var2) {
		if (var1 >= 0 && var1 < 2) {
			if (var2 < 256) {
				var2 = 256;
			}

			try {
				PcmPlayer var3 = Login.pcmPlayerProvider.player();
				var3.samples = new int[256 * (HttpContentType.PcmPlayer_stereo ? 2 : 1)];
				var3.field263 = var2;
				var3.init();
				var3.capacity = (var2 & -1024) + 1024;
				if (var3.capacity > 16384) {
					var3.capacity = 16384;
				}

				var3.open(var3.capacity);
				if (PcmPlayer.field256 > 0 && PcmPlayer.soundSystem == null) {
					PcmPlayer.soundSystem = new SoundSystem();
					WorldMapRectangle.soundSystemExecutor = Executors.newScheduledThreadPool(1);
					WorldMapRectangle.soundSystemExecutor.scheduleAtFixedRate(PcmPlayer.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
				}

				if (PcmPlayer.soundSystem != null) {
					if (PcmPlayer.soundSystem.players[var1] != null) {
						throw new IllegalArgumentException();
					}

					PcmPlayer.soundSystem.players[var1] = var3;
				}

				return var3;
			} catch (Throwable var4) {
				return new PcmPlayer();
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILdp;ZI)I",
		garbageValue = "-654229557"
	)
	static int method3597(int var0, Script var1, boolean var2) {
		if (var0 == 7463) {
			boolean var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1;
			ReflectionCheck.method674(var3);
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIB)V",
		garbageValue = "56"
	)
	static void method3599(ArrayList var0, int var1, int var2, int var3, int var4) {
		if (!var0.isEmpty()) {
			int var5 = (Integer)var0.get(0);
			if (var5 == -1 && !Client.playingJingle) {
				class92.method2440(0, 0);
			} else if (var5 != -1) {
				boolean var6;
				if (class332.field3565.isEmpty()) {
					var6 = false;
				} else {
					MusicSong var7 = (MusicSong)class332.field3565.get(0);
					var6 = var7 != null && var5 == var7.musicTrackGroupId;
				}

				if (!var6 && TileItem.clientPreferences.getMusicVolume() != 0) {
					ArrayList var9 = new ArrayList();

					for (int var8 = 0; var8 < var0.size(); ++var8) {
						var9.add(new MusicSong(class33.archive6, (Integer)var0.get(var8), 0, TileItem.clientPreferences.getMusicVolume(), false));
					}

					if (Client.playingJingle) {
						class223.method4719(var9, var1, var2, var3, var4);
					} else {
						class53.method1051(var9, var1, var2, var3, var4, false);
					}
				}
			}

		}
	}
}
