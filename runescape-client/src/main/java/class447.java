import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("qk")
public class class447 implements MouseWheel {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lqk;")
	public static final class447 field4756 = new class447(1, 0);

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lqk;")
	public static final class447 field4757 = new class447(3, 2);

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lqk;")
	static final class447 field4758 = new class447(2, 5);

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lqk;")
	static final class447 field4759 = new class447(0, 6);

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lqk;")
	static final class447 field4760 = new class447(4, 7);

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lqk;")
	static final class447 field4761 = new class447(5, 8);

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = -720584093)
	final int field4762;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 1393275291)
	final int field4763;

	class447(int var1, int var2) {
		this.field4762 = var1;
		this.field4763 = var2;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-453738003")
	public boolean method7914() {
		return this == field4757;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "104")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4763;
	}
}