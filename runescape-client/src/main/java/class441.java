import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pq")
public class class441 implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lpq;")

	public static final class441 field4678;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lpq;")

	public static final class441 field4671;
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Lpq;")

	static final class441 field4673;
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Lpq;")

	static final class441 field4674;
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"Lpq;")

	static final class441 field4677;
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Lpq;")

	static final class441 field4676;
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 
	489938793)

	final int field4675;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	464620871)

	final int field4672;
	static 
	{
		field4678 = new class441(2, 0);
		field4671 = new class441(4, 2);
		field4673 = new class441(0, 5);
		field4674 = new class441(3, 6);
		field4677 = new class441(1, 7);
		field4676 = new class441(5, 8);
	}

	class441(int var1, int var2) {
		this.field4675 = var1;
		this.field4672 = var2;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"16")

	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4672;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"1052027203")

	public boolean method7928() {
		return this == field4671;
	}
}