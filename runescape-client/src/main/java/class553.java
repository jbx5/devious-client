import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vk")
public class class553 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	public static final class553 field5435;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	public static final class553 field5434;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	static final class553 field5440;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	static final class553 field5436;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	static final class553 field5437;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lvk;"
	)
	static final class553 field5438;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -94501395
	)
	final int field5439;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -267232427
	)
	final int field5433;

	static {
		field5435 = new class553(2, 0);
		field5434 = new class553(4, 2);
		field5440 = new class553(5, 5);
		field5436 = new class553(0, 6);
		field5437 = new class553(3, 7);
		field5438 = new class553(1, 8);
	}

	class553(int var1, int var2) {
		this.field5439 = var1;
		this.field5433 = var2;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "111"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5433;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2100978975"
	)
	public boolean method9903() {
		return this == field5434;
	}
}
