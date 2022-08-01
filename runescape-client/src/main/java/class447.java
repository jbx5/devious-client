import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("qp")
public class class447 implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lqp;")
	public static final class447 field4766 = new class447(2, 0);

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lqp;")
	public static final class447 field4761 = new class447(5, 2);

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lqp;")
	static final class447 field4762 = new class447(0, 5);

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lqp;")
	static final class447 field4763 = new class447(1, 6);

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lqp;")
	static final class447 field4760 = new class447(4, 7);

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lqp;")
	static final class447 field4764 = new class447(3, 8);

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 1894720743)
	final int field4765;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = -1010952331)
	final int field4767;

	class447(int var1, int var2) {
		this.field4765 = var1;
		this.field4767 = var2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1790946346")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4767;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "1046857985")
	public boolean method8024() {
		return this == field4761;
	}
}