import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hm")
public class class188 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("field2023")
	static EvictingDualNodeHashTable field2023;
	@ObfuscatedName("oo")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;

	static {
		field2023 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("aq")
	public static final void method3688(long var0) {
		if (var0 > 0L) {
			if (var0 % 10L == 0L) {
				long var2 = var0 - 1L;

				try {
					Thread.sleep(var2);
				} catch (InterruptedException var8) {
				}

				try {
					Thread.sleep(1L);
				} catch (InterruptedException var7) {
				}
			} else {
				try {
					Thread.sleep(var0);
				} catch (InterruptedException var6) {
				}
			}

		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "-2"
	)
	static int method3687(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1;
		}
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(Lii;IIIZI)V",
		garbageValue = "-210290307"
	)
	static void method3684(SequenceDefinition var0, int var1, int var2, int var3, boolean var4) {
		if (Client.soundEffectCount < 50) {
			if (var0.soundEffects != null && var1 < var0.soundEffects.length && var0.soundEffects[var1] != null) {
				int var5 = var0.soundEffects[var1].field2148 & 31;
				if ((var5 <= 0 || class105.clientPreferences.getAreaSoundEffectsVolume() != 0) && (var5 != 0 || class105.clientPreferences.getSoundEffectsVolume() != 0)) {
					class452.method8354(var0.soundEffects[var1], var2, var3, var4);
				}
			}
		}
	}
}
