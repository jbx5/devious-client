import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uz")
public class class535 implements Enum {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Luz;"
	)
	public static final class535 field5235;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Luz;"
	)
	public static final class535 field5233;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Luz;"
	)
	static final class535 field5238;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Luz;"
	)
	static final class535 field5232;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Luz;"
	)
	static final class535 field5236;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Luz;"
	)
	static final class535 field5237;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -62661223
	)
	final int field5239;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1535706971
	)
	final int field5234;

	static {
		field5235 = new class535(2, 0);
		field5233 = new class535(4, 2);
		field5238 = new class535(5, 5);
		field5232 = new class535(0, 6);
		field5236 = new class535(3, 7);
		field5237 = new class535(1, 8);
	}

	class535(int var1, int var2) {
		this.field5239 = var1;
		this.field5234 = var2;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1622267422"
	)
	public boolean method9672() {
		return this == field5233;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-884190501"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5234;
	}
}
