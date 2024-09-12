import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("br")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Lcr;"
	)
	@Export("World_worlds")
	static World[] World_worlds;
	@ObfuscatedName("ah")
	static int[][][] field294;
	@ObfuscatedName("ee")
	@ObfuscatedGetter(
		longValue = 7406170264784209279L
	)
	static long field298;
	@ObfuscatedName("fm")
	static boolean field293;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lbz;"
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
			class171.RunException_sendStackTrace((String)null, var4);
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1634953732"
	)
	@Export("isCharPrintable")
	public static boolean isCharPrintable(char var0) {
		if (var0 >= ' ' && var0 <= '~') {
			return true;
		} else if (var0 >= 160 && var0 <= 255) {
			return true;
		} else {
			return var0 == 8364 || var0 == 338 || var0 == 8212 || var0 == 339 || var0 == 376;
		}
	}
}
