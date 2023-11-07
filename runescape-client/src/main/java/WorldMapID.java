import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jd")
@Implements("WorldMapID")
public class WorldMapID {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	static final WorldMapID field2608;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	static final WorldMapID field2607;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 909559475
	)
	@Export("value")
	final int value;

	static {
		field2608 = new WorldMapID(0);
		field2607 = new WorldMapID(1);
	}

	WorldMapID(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "([FIFI)F",
		garbageValue = "-1267695907"
	)
	static float method4936(float[] var0, int var1, float var2) {
		float var3 = var0[var1];

		for (int var4 = var1 - 1; var4 >= 0; --var4) {
			var3 = var0[var4] + var2 * var3;
		}

		return var3;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1945515950"
	)
	public static void method4937(int var0) {
		if (!class316.musicSongs.isEmpty()) {
			Iterator var1 = class316.musicSongs.iterator();

			while (var1.hasNext()) {
				MusicSong var2 = (MusicSong)var1.next();
				if (var2 != null) {
					var2.musicTrackVolume = var0;
				}
			}

			MusicSong var3 = (MusicSong)class316.musicSongs.get(0);
			if (var3 != null && var3.midiPcmStream != null && var3.midiPcmStream.isReady() && !var3.field3530) {
				var3.midiPcmStream.setPcmStreamVolume(var0);
				var3.field3528 = (float)var0;
			}
		}

	}

	@ObfuscatedName("ne")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)Ljava/lang/String;",
		garbageValue = "24"
	)
	static String method4938(String var0, boolean var1) {
		String var2 = var1 ? "https://" : "http://";
		if (Client.gameBuild == 1) {
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) {
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) {
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) {
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) {
			var0 = "local";
		}

		String var3 = "";
		if (MenuAction.field878 != null) {
			var3 = "/p=" + MenuAction.field878;
		}

		String var4 = "runescape.com";
		return var2 + var0 + "." + var4 + "/l=" + class85.clientLanguage + "/a=" + DevicePcmPlayerProvider.field111 + var3 + "/";
	}
}
