import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
public class class182 extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("field1864")
	static EvictingDualNodeHashTable field1864;
	@ObfuscatedName("jy")
	@ObfuscatedGetter(
		intValue = -1103350111
	)
	static int field1903;

	static {
		field1864 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-610008942"
	)
	public static void method3872() {
		class333.field3628.clear();
	}

	@ObfuscatedName("nq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1781741316"
	)
	static final void method3869(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		TaskHandler.clientPreferences.updateAreaSoundEffectsVolume(var0);
	}
}
