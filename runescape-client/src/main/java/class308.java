import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lh")
public abstract class class308 implements class310 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -353634511
	)
	protected int field3235;

	@ObfuscatedSignature(
		descriptor = "(Lot;Lpg;I)V"
	)
	protected class308(StudioGame var1, Language var2, int var3) {
		this.field3235 = var3;
	}
}
