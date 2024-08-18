import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oi")
public class class376 {
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "7"
	)
	public static void method7162() {
		FloorOverlayDefinition.FloorOverlayDefinition_cached.clear();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2062292523"
	)
	@Export("Messages_getHistorySize")
	static int Messages_getHistorySize(int var0) {
		ChatChannel var1 = (ChatChannel)Messages.Messages_channels.get(var0);
		return var1 == null ? 0 : var1.size();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-315766189"
	)
	static void method7164(boolean var0) {
		if (var0) {
			WorldMapLabelSize.method5532();
		} else {
			for (int var1 = 0; var1 < class332.musicSongs.size(); ++var1) {
				MusicSong var2 = (MusicSong)class332.musicSongs.get(var1);
				if (var2 == null) {
					class332.musicSongs.remove(var1);
					--var1;
				} else if (var2.field3681) {
					if (var2.midiPcmStream.field3604 > 0) {
						--var2.midiPcmStream.field3604;
					}

					var2.midiPcmStream.clear();
					var2.midiPcmStream.method6247();
					var2.midiPcmStream.setPcmStreamVolume(0);
					class332.musicSongs.remove(var1);
					--var1;
				} else {
					var2.field3681 = true;
				}
			}
		}

	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "20"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0;
		if (ParamComposition.garbageCollector == null || !ParamComposition.garbageCollector.isValid()) {
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next();
					if (var2.isValid()) {
						ParamComposition.garbageCollector = var2;
						GameEngine.garbageCollectorLastCheckTimeMs = -1L;
						GameEngine.garbageCollectorLastCollectionTime = -1L;
					}
				}
			} catch (Throwable var11) {
			}
		}

		if (ParamComposition.garbageCollector != null) {
			long var9 = RouteStrategy.method5439();
			long var3 = ParamComposition.garbageCollector.getCollectionTime();
			if (-1L != GameEngine.garbageCollectorLastCollectionTime) {
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime;
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs;
				if (0L != var7) {
					var0 = (int)(var5 * 100L / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3;
			GameEngine.garbageCollectorLastCheckTimeMs = var9;
		}

		return var0;
	}
}
