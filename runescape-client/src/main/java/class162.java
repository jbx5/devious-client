import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
@ObfuscatedName("fp")
public class class162 extends class165 {
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = -1686330275)
	int field1762;

	@ObfuscatedSignature(descriptor = "Leu;")
	final class155 this$0;

	@ObfuscatedSignature(descriptor = "(Leu;Ljava/lang/String;I)V")
	class162(class155 var1, String var2, int var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field1762 = var3;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-2051475580")
	public int vmethod3237() {
		return 0;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1570944667")
	public int vmethod3239() {
		return this.field1762;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "(Lfu;IIB)Laf;", garbageValue = "0")
	public static final PcmPlayer method3227(TaskHandler var0, int var1, int var2) {
		if (class344.field4152 * -449918071 == 0) {
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) {
			if (var2 < 256) {
				var2 = 256;
			}
			try {
				PcmPlayer var3 = GrandExchangeOfferTotalQuantityComparator.pcmPlayerProvider.player();
				var3.samples = new int[256 * (PcmPlayer.PcmPlayer_stereo ? 2 : 1)];
				var3.field300 = var2;
				var3.init();
				var3.capacity = (var2 & -1024) + 1024;
				if (var3.capacity > 16384) {
					var3.capacity = 16384;
				}
				var3.open(var3.capacity);
				if (PcmPlayer.field279 > 0 && TaskHandler.soundSystem == null) {
					TaskHandler.soundSystem = new SoundSystem();
					PcmPlayer.soundSystemExecutor = Executors.newScheduledThreadPool(1);
					PcmPlayer.soundSystemExecutor.scheduleAtFixedRate(TaskHandler.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
				}
				if (TaskHandler.soundSystem != null) {
					if (TaskHandler.soundSystem.players[var1] != null) {
						throw new IllegalArgumentException();
					}
					TaskHandler.soundSystem.players[var1] = var3;
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