import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pf")
public class class401 {
	@ObfuscatedName("am")
	static char[] field4493;
	@ObfuscatedName("ap")
	static char[] field4492;
	@ObfuscatedName("af")
	static char[] field4494;
	@ObfuscatedName("aj")
	static int[] field4495;
	@ObfuscatedName("sc")
	@ObfuscatedSignature(
		descriptor = "Lve;"
	)
	@Export("privateChatMode")
	static PrivateChatMode privateChatMode;

	static {
		field4493 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field4493[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4493[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4493[var0] = (char)(var0 + 48 - 52);
		}

		field4493[62] = '+';
		field4493[63] = '/';
		field4492 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4492[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4492[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4492[var0] = (char)(var0 + 48 - 52);
		}

		field4492[62] = '*';
		field4492[63] = '-';
		field4494 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4494[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4494[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4494[var0] = (char)(var0 + 48 - 52);
		}

		field4494[62] = '-';
		field4494[63] = '_';
		field4495 = new int[128];

		for (var0 = 0; var0 < field4495.length; ++var0) {
			field4495[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field4495[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field4495[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field4495[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4495;
		field4495[43] = 62;
		var2[42] = 62;
		int[] var1 = field4495;
		field4495[47] = 63;
		var1[45] = 63;
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "30"
	)
	static final void method7504(int var0, int var1) {
		if (var0 < 128) {
			var0 = 128;
		} else if (var0 > 383) {
			var0 = 383;
		}

		if (UserComparator3.cameraPitch < var0) {
			UserComparator3.cameraPitch = (var0 - UserComparator3.cameraPitch) * class439.field4690 / 1000 + UserComparator3.cameraPitch + class195.field2045;
			if (UserComparator3.cameraPitch > var0) {
				UserComparator3.cameraPitch = var0;
			}
		} else if (UserComparator3.cameraPitch > var0) {
			UserComparator3.cameraPitch -= (UserComparator3.cameraPitch - var0) * class439.field4690 / 1000 + class195.field2045;
			if (UserComparator3.cameraPitch < var0) {
				UserComparator3.cameraPitch = var0;
			}
		}

		var1 &= 2047;
		int var2 = var1 - HealthBarUpdate.cameraYaw;
		if (var2 > 1024) {
			var2 -= 2048;
		} else if (var2 < -1024) {
			var2 += 2048;
		}

		if (var2 > 0) {
			HealthBarUpdate.cameraYaw = HealthBarUpdate.cameraYaw + class195.field2045 + var2 * class439.field4690 / 1000;
			HealthBarUpdate.cameraYaw &= 2047;
		} else if (var2 < 0) {
			HealthBarUpdate.cameraYaw -= -var2 * class439.field4690 / 1000 + class195.field2045;
			HealthBarUpdate.cameraYaw &= 2047;
		}

		int var3 = var1 - HealthBarUpdate.cameraYaw;
		if (var3 > 1024) {
			var3 -= 2048;
		} else if (var3 < -1024) {
			var3 += 2048;
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
			HealthBarUpdate.cameraYaw = var1;
		}

	}

	@ObfuscatedName("nx")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "10"
	)
	static final void method7505(int var0) {
		if (class380.widgetDefinition.loadInterface(var0)) {
			PlayerCompositionColorTextureOverride.drawModelComponents(class380.widgetDefinition.Widget_interfaceComponents[var0], -1);
		}
	}

	@ObfuscatedName("nk")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "122"
	)
	@Export("setMusicVolume")
	static final void setMusicVolume(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != class93.clientPreferences.getMusicVolume()) {
			label61: {
				if (class93.clientPreferences.getMusicVolume() == 0) {
					boolean var1 = !class319.field3466.isEmpty();
					if (var1) {
						class221.method4364(WorldMapSection0.archive6, var0);
						Client.playingJingle = false;
						break label61;
					}
				}

				if (var0 == 0) {
					Actor.method2488(0, 0);
					Client.playingJingle = false;
				} else if (!class319.musicSongs.isEmpty()) {
					Iterator var3 = class319.musicSongs.iterator();

					while (var3.hasNext()) {
						MusicSong var2 = (MusicSong)var3.next();
						if (var2 != null) {
							var2.musicTrackVolume = var0;
						}
					}

					MusicSong var4 = (MusicSong)class319.musicSongs.get(0);
					if (var4 != null && var4.midiPcmStream != null && var4.midiPcmStream.isReady() && !var4.field3580) {
						var4.midiPcmStream.setPcmStreamVolume(var0);
						var4.field3576 = (float)var0;
					}
				}
			}

			class93.clientPreferences.updateMusicVolume(var0);
		}

	}
}
