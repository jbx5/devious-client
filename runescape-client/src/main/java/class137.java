import java.util.ArrayList;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ft")
class class137 implements Callable {
	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	final class138 this$0;
	// $FF: synthetic field
	final int val$workStart;
	// $FF: synthetic field
	final int val$workEnd;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "[Lff;"
	)
	final class130[] val$curveLoadJobs;

	@ObfuscatedSignature(
		descriptor = "(Lfa;II[Lff;)V"
	)
	class137(class138 var1, int var2, int var3, class130[] var4) {
		this.this$0 = var1;
		this.val$workStart = var2;
		this.val$workEnd = var3;
		this.val$curveLoadJobs = var4;
	}

	public Object call() {
		for (int var1 = this.val$workStart; var1 < this.val$workEnd; ++var1) {
			this.val$curveLoadJobs[var1].call();
		}

		return null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "0"
	)
	static final int method3081(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}

	@ObfuscatedName("if")
	@ObfuscatedSignature(
		descriptor = "(IIS)V",
		garbageValue = "2998"
	)
	static void method3080(int var0, int var1) {
		if (NPC.clientPreferences.getMusicVolume() != 0 && var0 != -1) {
			ArrayList var2 = new ArrayList();
			var2.add(new MusicSong(WorldMapScaleHandler.field3167, var0, 0, NPC.clientPreferences.getMusicVolume(), false));
			Renderable.method4881(var2, 0, 0, 0, 0, true);
			Client.playingJingle = true;
		}

	}
}
