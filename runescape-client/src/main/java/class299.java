import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lx")
public class class299 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	static final class299 field3232;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Llx;"
	)
	static final class299 field3227;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1922922687
	)
	@Export("value")
	final int value;

	static {
		field3232 = new class299(0);
		field3227 = new class299(1);
	}

	class299(int var1) {
		this.value = var1;
	}
}
