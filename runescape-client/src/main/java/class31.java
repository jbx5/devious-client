import java.applet.Applet;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bn")
public class class31 {
	@ObfuscatedName("ak")
	public static Applet field165;
	@ObfuscatedName("al")
	public static String field162;
	@ObfuscatedName("ul")
	@ObfuscatedGetter(
		intValue = 1294966735
	)
	static int field166;

	static {
		field165 = null;
		field162 = "";
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "313617622"
	)
	static int method451(int var0, int var1) {
		for (int var2 = 0; var2 < 8; ++var2) {
			if (var1 <= var0 + 30) {
				return var2;
			}

			var0 += 30;
			var0 += var2 != 1 && var2 != 3 ? 5 : 20;
		}

		return 0;
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		descriptor = "(Lic;IIILdh;I)V",
		garbageValue = "1368002724"
	)
	static void method448(SequenceDefinition var0, int var1, int var2, int var3, Actor var4) {
		if (Client.soundEffectCount < 50) {
			if (var0.field2415 != null && var0.field2415.containsKey(var1)) {
				Sound var5 = (Sound)var0.field2415.get(var1);
				if (var5 != null) {
					int var6 = var5.field2271 & 31;
					if ((var6 <= 0 || class459.clientPreferences.getAreaSoundEffectsVolume() != 0) && (var6 != 0 || class459.clientPreferences.getSoundEffectsVolume() != 0)) {
						boolean var10 = var4 == class17.localPlayer;
						if (var5 != null) {
							if (var5.field2271 == 0) {
								if (!var10) {
									return;
								}

								Client.soundLocations[Client.soundEffectCount] = 0;
							} else {
								int var11 = (var2 - 64) / 128;
								int var12 = (var3 - 64) / 128;
								Client.soundLocations[Client.soundEffectCount] = (var12 << 8) + (var11 << 16) + var5.field2271;
							}

							Client.soundEffectIds[Client.soundEffectCount] = var5.field2272;
							Client.queuedSoundEffectLoops[Client.soundEffectCount] = var5.field2269;
							Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
							Client.soundEffects[Client.soundEffectCount] = null;
							Client.field785[Client.soundEffectCount] = var5.field2273;
							++Client.soundEffectCount;
						}

					}
				}
			}
		}
	}

	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "82"
	)
	static final void method449(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class459.clientPreferences.updateSoundEffectVolume(var0);
	}
}
