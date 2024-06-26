import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("vj")
public class class551 implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	public static final class551 field5419;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	public static final class551 field5417;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	static final class551 field5422;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	static final class551 field5421;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	static final class551 field5420;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lvj;"
	)
	static final class551 field5418;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -270693175
	)
	final int field5423;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1804310925
	)
	final int field5416;

	static {
		field5419 = new class551(5, 0);
		field5417 = new class551(4, 2);
		field5422 = new class551(0, 5);
		field5421 = new class551(1, 6);
		field5420 = new class551(2, 7);
		field5418 = new class551(3, 8);
	}

	class551(int var1, int var2) {
		this.field5423 = var1;
		this.field5416 = var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5416;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "-7636"
	)
	public boolean method9855() {
		return this == field5417;
	}
}
