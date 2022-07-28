import java.applet.Applet;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("dg")
public class class119 implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Ldg;")
	static final class119 field1467 = new class119(0, 0, ((String) (null)), -1, -1);

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Ldg;")
	static final class119 field1466 = new class119(1, 1, ((String) (null)), 0, 2);

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Ldg;")
	static final class119 field1465 = new class119(2, 2, ((String) (null)), 1, 2);

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Ldg;")
	static final class119 field1468 = new class119(3, 3, ((String) (null)), 2, 2);

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Ldg;")
	static final class119 field1470 = new class119(4, 4, ((String) (null)), 3, 1);

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Ldg;")
	static final class119 field1473 = new class119(5, 5, ((String) (null)), 4, 1);

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "Ldg;")
	static final class119 field1471 = new class119(6, 6, ((String) (null)), 5, 1);

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Ldg;")
	static final class119 field1483 = new class119(7, 7, ((String) (null)), 6, 3);

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Ldg;")
	static final class119 field1472 = new class119(8, 8, ((String) (null)), 7, 3);

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "Ldg;")
	static final class119 field1474 = new class119(9, 9, ((String) (null)), 8, 3);

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "Ldg;")
	static final class119 field1475 = new class119(10, 10, ((String) (null)), 0, 7);

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "Ldg;")
	static final class119 field1476 = new class119(11, 11, ((String) (null)), 1, 7);

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "Ldg;")
	static final class119 field1479 = new class119(12, 12, ((String) (null)), 2, 7);

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "Ldg;")
	static final class119 field1478 = new class119(13, 13, ((String) (null)), 3, 7);

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "Ldg;")
	static final class119 field1484 = new class119(14, 14, ((String) (null)), 4, 7);

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "Ldg;")
	static final class119 field1480 = new class119(15, 15, ((String) (null)), 5, 7);

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "Ldg;")
	static final class119 field1481 = new class119(16, 16, ((String) (null)), 0, 5);

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = 993362911)
	final int field1482;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 779109825)
	final int field1477;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 799839629)
	final int field1469;

	@ObfuscatedSignature(descriptor = "(IILjava/lang/String;II)V", garbageValue = "-1")
	class119(int var1, int var2, String var3, int var4, int var5) {
		this.field1482 = var1;
		this.field1477 = var2;
		this.field1469 = var4;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1790946346")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1477;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "930046931")
	int method2818() {
		return this.field1469;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Ljava/applet/Applet;Ljava/lang/String;I)V", garbageValue = "722640609")
	public static void method2814(Applet var0, String var1) {
		class29.field184 = var0;
		if (var1 != null) {
			class29.field182 = var1;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(IIB)I", garbageValue = "-46")
	static int method2817(int var0, int var1) {
		ItemContainer var2 = ((ItemContainer) (ItemContainer.itemContainers.get(((long) (var0)))));
		if (var2 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II)Lqb;", garbageValue = "-1226055422")
	public static PrivateChatMode method2819(int var0) {
		PrivateChatMode[] var1 = SecureRandomFuture.method2010();
		for (int var2 = 0; var2 < var1.length; ++var2) {
			PrivateChatMode var3 = var1[var2];
			if (var0 == var3.field4826) {
				return var3;
			}
		}
		return null;
	}
}