import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lj")
public abstract class class295 implements class297 {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -666783679
	)
	protected int field3140;

	@ObfuscatedSignature(
		descriptor = "(Lnd;Lol;I)V"
	)
	protected class295(StudioGame var1, Language var2, int var3) {
		this.field3140 = var3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1572612801"
	)
	public static int method5903(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
		var0 = var0 + (var0 >>> 4) & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 255;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ltb;IIS)I",
		garbageValue = "8801"
	)
	static int method5902(IterableNodeHashTable var0, int var1, int var2) {
		if (var0 == null) {
			return var2;
		} else {
			IntegerNode var3 = (IntegerNode)var0.get((long)var1);
			return var3 == null ? var2 : var3.integer;
		}
	}
}
