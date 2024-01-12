import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jb")
public class class253 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	static final class253 field2648;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Ljb;"
	)
	static final class253 field2645;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -184002213
	)
	@Export("value")
	final int value;

	static {
		field2648 = new class253(0);
		field2645 = new class253(1);
	}

	class253(int var1) {
		this.value = var1;
	}
}
