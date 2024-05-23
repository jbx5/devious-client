import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("if")
public class class212 extends DualNode {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("field2022")
	public static EvictingDualNodeHashTable field2022;

	static {
		field2022 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2024737063"
	)
	static final void method4031() {
		if (class137.pcmPlayer1 != null) {
			class137.pcmPlayer1.run();
		}

	}
}
