import java.math.BigInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bk")
public class class65 {
	@ObfuscatedName("k")
	static final BigInteger field870;
	@ObfuscatedName("w")
	static final BigInteger field862;
	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "[Lqu;"
	)
	@Export("modIconSprites")
	static IndexedSprite[] modIconSprites;

	static {
		field870 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
		field862 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683"); // L: 21
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-431817012"
	)
	@Export("addGameMessage")
	static void addGameMessage(int var0, String var1, String var2) {
		class120.addChatMessage(var0, var1, var2, (String)null); // L: 19
	} // L: 20

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-436013202"
	)
	public static boolean method2027() {
		try {
			if (class274.musicPlayerStatus == 2) { // L: 53
				if (class274.musicTrack == null) { // L: 54
					class274.musicTrack = MusicTrack.readTrack(class274.musicTrackArchive, class274.musicTrackGroupId, StructComposition.musicTrackFileId); // L: 55
					if (class274.musicTrack == null) { // L: 56
						return false;
					}
				}

				if (class29.soundCache == null) { // L: 58
					class29.soundCache = new SoundCache(class274.soundEffectsArchive, class274.musicSamplesArchive);
				}

				if (class139.midiPcmStream.loadMusicTrack(class274.musicTrack, class274.musicPatchesArchive, class29.soundCache, 22050)) { // L: 59
					class139.midiPcmStream.clearAll(); // L: 60
					class139.midiPcmStream.setPcmStreamVolume(class269.musicTrackVolume); // L: 61
					class139.midiPcmStream.setMusicTrack(class274.musicTrack, TriBool.musicTrackBoolean); // L: 62
					class274.musicPlayerStatus = 0; // L: 63
					class274.musicTrack = null; // L: 64
					class29.soundCache = null; // L: 65
					class274.musicTrackArchive = null; // L: 66
					return true; // L: 67
				}
			}
		} catch (Exception var1) { // L: 71
			var1.printStackTrace(); // L: 72
			class139.midiPcmStream.clear(); // L: 73
			class274.musicPlayerStatus = 0; // L: 74
			class274.musicTrack = null; // L: 75
			class29.soundCache = null; // L: 76
			class274.musicTrackArchive = null; // L: 77
		}

		return false; // L: 79
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1670893838"
	)
	public static boolean method2028(int var0) {
		return var0 == WorldMapDecorationType.field3581.id; // L: 51
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "106"
	)
	static void method2029() {
		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 295
			Login.currentLoginField = 1; // L: 296
		} else {
			Login.currentLoginField = 0; // L: 299
		}

	} // L: 301
}
