import java.util.BitSet;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ml")
public class class329 extends Node {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 530272663
	)
	int field3539;
	@ObfuscatedName("ah")
	BitSet field3540;

	class329(int var1) {
		this.field3539 = var1;
		this.field3540 = new BitSet(128);
	}
}
