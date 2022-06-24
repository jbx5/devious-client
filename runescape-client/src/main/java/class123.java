import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("df")
public enum class123 implements MouseWheel {

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Ldf;")
	field1535(0, 0),
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Ldf;")
	field1529(1, 1),
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Ldf;")
	field1542(2, 2),
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Ldf;")
	field1531(3, 3),
	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Ldf;")
	field1536(4, 4),
	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "Ldf;")
	field1533(5, 5),
	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "Ldf;")
	field1534(6, 6),
	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Ldf;")
	field1532(7, 7),
	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "Ldf;")
	field1528(8, 8);
	@ObfuscatedName("n")
	@Export("userHomeDirectory")
	static String userHomeDirectory;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = -980085823)
	final int field1537;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 1512803197)
	final int field1538;

	class123(int var3, int var4) {
		this.field1537 = var3;
		this.field1538 = var4;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-100")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1538;
	}

	@ObfuscatedName("lk")
	@ObfuscatedSignature(descriptor = "(IB)Lps;", garbageValue = "-5")
	static class436 method2813(int var0) {
		class436 var1 = ((class436) (Client.Widget_cachedModels.get(((long) (var0)))));
		if (var1 == null) {
			var1 = new class436(class132.field1588, class285.method5516(var0), HealthBarUpdate.method2199(var0));
			Client.Widget_cachedModels.put(var1, ((long) (var0)));
		}
		return var1;
	}
}