import java.util.BitSet;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nv")
public class class347 extends Node {
	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static Archive field3742;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -327851605
	)
	int field3740;
	@ObfuscatedName("ae")
	BitSet field3741;

	class347(int var1) {
		this.field3740 = var1;
		this.field3741 = new BitSet(128);
	}
}
