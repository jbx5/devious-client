import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
@Implements("SoundSystem")
public class SoundSystem implements Runnable {
	@ObfuscatedName("wh")
	@ObfuscatedGetter(
		intValue = 1375841409
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	static GameBuild field325;
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("up")
	@ObfuscatedGetter(
		intValue = 1072135185
	)
	static int field323;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lbu;"
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
			class190.RunException_sendStackTrace((String)null, var4);
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "13012"
	)
	public static void method846() {
		class201.field2023.clear();
	}
}
