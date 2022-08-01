import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("ax")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "Lql;")
	static IndexedSprite field321;

	@ObfuscatedName("hu")
	@ObfuscatedGetter(intValue = -966158451)
	static int field319;

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "[Lat;")
	@Export("players")
	volatile PcmPlayer[] players = new PcmPlayer[2];

	SoundSystem() {
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
			class359.RunException_sendStackTrace(((String) (null)), var4);
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Llc;IIB)Lqj;", garbageValue = "-16")
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2);
		boolean var3;
		if (var4 == null) {
			var3 = false;
		} else {
			class83.SpriteBuffer_decode(var4);
			var3 = true;
		}
		return !var3 ? null : class362.method6608();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(S)V", garbageValue = "255")
	static void method768() {
		UserComparator6.method2701(24);
		HealthBarUpdate.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");
	}
}