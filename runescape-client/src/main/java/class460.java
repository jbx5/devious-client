import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rb")
public class class460 {
	@ObfuscatedName("at")
	float field4758;
	@ObfuscatedName("ah")
	float field4759;
	@ObfuscatedName("ar")
	float field4760;

	static {
		new class460(0.0F, 0.0F, 0.0F);
		new class460(1.0F, 1.0F, 1.0F);
		new class460(1.0F, 0.0F, 0.0F);
		new class460(0.0F, 1.0F, 0.0F);
		new class460(0.0F, 0.0F, 1.0F);
	}

	class460(float var1, float var2, float var3) {
		this.field4758 = var1;
		this.field4759 = var2;
		this.field4760 = var3;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "56"
	)
	final float method8402() {
		return (float)Math.sqrt((double)(this.field4760 * this.field4760 + this.field4759 * this.field4759 + this.field4758 * this.field4758));
	}

	public String toString() {
		return this.field4758 + ", " + this.field4759 + ", " + this.field4760;
	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-986184126"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (WorldMapIcon_1.clientPreferences.getSoundEffectsVolume() != 0 && var1 != 0 && Client.soundEffectCount < 50) {
			Client.soundEffectIds[Client.soundEffectCount] = var0;
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1;
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
			Client.soundEffects[Client.soundEffectCount] = null;
			Client.soundLocations[Client.soundEffectCount] = 0;
			++Client.soundEffectCount;
		}

	}
}
