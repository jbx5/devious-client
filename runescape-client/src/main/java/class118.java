import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("dk")
public class class118 implements MouseWheel {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Ldk;")
	static final class118 field1462 = new class118(0, 0, ((String) (null)), 0);

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Ldk;")
	static final class118 field1453 = new class118(1, 1, ((String) (null)), 9);

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Ldk;")
	static final class118 field1454 = new class118(2, 2, ((String) (null)), 3);

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Ldk;")
	static final class118 field1455 = new class118(3, 3, ((String) (null)), 6);

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Ldk;")
	static final class118 field1456 = new class118(4, 4, ((String) (null)), 1);

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Ldk;")
	static final class118 field1452 = new class118(5, 5, ((String) (null)), 3);

	@ObfuscatedName("cs")
	@ObfuscatedSignature(descriptor = "Lql;")
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = -1541541001)
	final int field1458;

	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 1908635299)
	final int field1461;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 643090763)
	final int field1460;

	class118(int var1, int var2, String var3, int var4) {
		this.field1458 = var1;
		this.field1461 = var2;
		this.field1460 = var4;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1790946346")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1461;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1051990773")
	int method2800() {
		return this.field1460;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Llc;I)V", garbageValue = "-1896579808")
	public static void method2810(AbstractArchive var0) {
		DbRowType.field4691 = var0;
	}
}