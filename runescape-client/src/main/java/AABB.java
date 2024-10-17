import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jb")
@Implements("AABB")
public class AABB {
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -435318551
	)
	@Export("gameCyclesToDo")
	static int gameCyclesToDo;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -957884077
	)
	@Export("xMid")
	int xMid;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 54225735
	)
	@Export("yMid")
	int yMid;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 423339171
	)
	@Export("zMid")
	int zMid;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -449342943
	)
	@Export("xMidOffset")
	int xMidOffset;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1050702601
	)
	@Export("yMidOffset")
	int yMidOffset;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -2056503993
	)
	@Export("zMidOffset")
	int zMidOffset;

	AABB(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.xMid = var1;
		this.yMid = var2;
		this.zMid = var3;
		this.xMidOffset = var4;
		this.yMidOffset = var5;
		this.zMidOffset = var6;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "4"
	)
	public static void method5246() {
		class190.field2023.clear();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Lqp;",
		garbageValue = "-21"
	)
	public static class427 method5244() {
		synchronized(class427.field4776) {
			if (class427.field4775 == 0) {
				return new class427();
			} else {
				class427.field4776[--class427.field4775].method8223();
				return class427.field4776[class427.field4775];
			}
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2048730036"
	)
	public static void method5245() {
		VarpDefinition.VarpDefinition_cached.clear();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lio;III)Lbm;",
		garbageValue = "1978096240"
	)
	public static final PcmPlayer method5243(TaskHandler var0, int var1, int var2) {
		if (ArchiveLoader.field1059 * -336955471 == 0) {
			throw new IllegalStateException();
		} else if (var1 >= 0 && var1 < 2) {
			if (var2 < 256) {
				var2 = 256;
			}

			try {
				PcmPlayer var3 = PcmPlayer.pcmPlayerProvider.player();
				var3.samples = new int[(class550.PcmPlayer_stereo ? 2 : 1) * 256];
				var3.field263 = var2;
				var3.init();
				var3.capacity = (var2 & -1024) + 1024;
				if (var3.capacity > 16384) {
					var3.capacity = 16384;
				}

				var3.open(var3.capacity);
				if (ConcurrentMidiTask.field4886 > 0 && AccessFile.soundSystem == null) {
					AccessFile.soundSystem = new SoundSystem();
					class6.soundSystemExecutor = Executors.newScheduledThreadPool(1);
					class6.soundSystemExecutor.scheduleAtFixedRate(AccessFile.soundSystem, 0L, 10L, TimeUnit.MILLISECONDS);
				}

				if (AccessFile.soundSystem != null) {
					if (AccessFile.soundSystem.players[var1] != null) {
						throw new IllegalArgumentException();
					}

					AccessFile.soundSystem.players[var1] = var3;
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
