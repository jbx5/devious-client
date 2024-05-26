import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bm")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("we")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Lbd;"
	)
	@Export("players")
	volatile PcmPlayer[] players;

	SoundSystem() {
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
			BufferedSink.RunException_sendStackTrace((String)null, var4);
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1676746541"
	)
	public static void method855() {
		class218.field1909.clear();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1301917324"
	)
	public static void method851() {
		class329.field3579.clear();
	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(Ldt;IIIB)I",
		garbageValue = "-84"
	)
	@Export("getTileHeight")
	static final int getTileHeight(WorldView var0, int var1, int var2, int var3) {
		int var4 = var1 >> 7;
		int var5 = var2 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 < var0.tileSettings[0].length && var5 < var0.tileSettings[0][0].length) {
			int var6 = var3;
			if (var3 < 3 && (var0.tileSettings[1][var4][var5] & 2) == 2) {
				var6 = var3 + 1;
			}

			int var7 = var1 & 127;
			int var8 = var2 & 127;
			int var9 = var7 * var0.tileHeights[var6][var4 + 1][var5] + var0.tileHeights[var6][var4][var5] * (128 - var7) >> 7;
			int var10 = var7 * var0.tileHeights[var6][var4 + 1][var5 + 1] + var0.tileHeights[var6][var4][var5 + 1] * (128 - var7) >> 7;
			return var8 * var10 + var9 * (128 - var8) >> 7;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("px")
	@ObfuscatedSignature(
		descriptor = "(Lca;I)V",
		garbageValue = "-143017937"
	)
	@Export("updateLoginState")
	static void updateLoginState(LoginState var0) {
		if (Tiles.loginState != var0) {
			Tiles.loginState = var0;
		}
	}
}
