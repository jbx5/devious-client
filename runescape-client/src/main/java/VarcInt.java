import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fc")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("uy")
	@ObfuscatedSignature(descriptor = 
	"Llf;")

	public static class326 field1841;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lig;")

	@Export("VarcInt_cached")
	static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("ho")
	@ObfuscatedGetter(intValue = 
	-248717599)

	@Export("baseY")
	static int baseY;
	@ObfuscatedName("i")
	@Export("persist")
	public boolean persist;
	static 
	{
		VarcInt_cached = new EvictingDualNodeHashTable(64);
	}

	VarcInt() {
		this.persist = false;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;I)V", garbageValue = 
	"-400441754")

	void method3414(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method3407(var1, var2);
		} 
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;IB)V", garbageValue = 
	"114")

	void method3407(Buffer var1, int var2) {
		if (var2 == 2) {
			this.persist = true;
		}

	}
}