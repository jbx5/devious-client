import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bx")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("bb")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("kl")
	@ObfuscatedGetter(
		intValue = -1784081525
	)
	@Export("cameraZ")
	static int cameraZ;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lbk;"
	)
	@Export("players")
	public volatile PcmPlayer[] players;

	public SoundSystem() {
		this.players = new PcmPlayer[2];
	}

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) {
				PcmPlayer var2 = this.players[var1];
				if (var2 != null) {
					var2.run();
				}
			}
		} catch (Exception var4) {
			class317.RunException_sendStackTrace((String)null, var4);
		}

	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(IIIS)V",
		garbageValue = "13799"
	)
	static void method853(int var0, int var1, int var2) {
		if (var0 != 0) {
			int var3 = var0 >> 8;
			int var4 = var0 >> 4 & 7;
			int var5 = var0 & 15;
			Client.soundEffectIds[Client.soundEffectCount] = var3;
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var4;
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
			Client.soundEffects[Client.soundEffectCount] = null;
			int var6 = (var1 - 64) / 128;
			int var7 = (var2 - 64) / 128;
			Client.soundLocations[Client.soundEffectCount] = var5 + (var7 << 8) + (var6 << 16);
			++Client.soundEffectCount;
		}
	}
}
