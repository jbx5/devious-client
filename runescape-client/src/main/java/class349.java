import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nz")
public class class349 {
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1008264913
	)
	static int field3735;
	@ObfuscatedName("ty")
	@ObfuscatedSignature(
		descriptor = "Lbk;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1516055719
	)
	public int field3731;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 600476383
	)
	public int field3732;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1830338123
	)
	public int field3733;

	class349() {
	}

	@ObfuscatedName("lg")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "312360827"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1, int var2) {
		class166.updateItemPile2(ModeWhere.worldView, var0, var1, var2);
	}
}
