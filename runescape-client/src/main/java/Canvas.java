import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("ac")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1;
	}

	public final void update(Graphics var1) {
		this.component.update(var1);
	}

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(Lif;IIIZI)V",
		garbageValue = "-1741577065"
	)
	static void method318(SequenceDefinition var0, int var1, int var2, int var3, boolean var4) {
		if (Client.soundEffectCount < 50) {
			if (var0.field2310 != null && var0.field2310.containsKey(var1)) {
				Sound var5 = (Sound)var0.field2310.get(var1);
				if (var5 != null) {
					int var6 = var5.field2166 & 31;
					if ((var6 <= 0 || class461.clientPreferences.getAreaSoundEffectsVolume() != 0) && (var6 != 0 || class461.clientPreferences.getSoundEffectsVolume() != 0)) {
						if (var5 != null) {
							if (var5.field2166 == 0) {
								if (!var4) {
									return;
								}

								Client.soundLocations[Client.soundEffectCount] = 0;
							} else {
								int var11 = (var2 - 64) / 128;
								int var12 = (var3 - 64) / 128;
								Client.soundLocations[Client.soundEffectCount] = (var12 << 8) + (var11 << 16) + var5.field2166;
							}

							Client.soundEffectIds[Client.soundEffectCount] = var5.field2168;
							Client.queuedSoundEffectLoops[Client.soundEffectCount] = var5.field2164;
							Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
							Client.soundEffects[Client.soundEffectCount] = null;
							Client.field627[Client.soundEffectCount] = var5.field2167;
							++Client.soundEffectCount;
						}

					}
				}
			}
		}
	}
}
