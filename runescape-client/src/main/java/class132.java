import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eo")
public class class132 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		longValue = -6674799221148244799L
	)
	long field1581;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 304285101
	)
	int field1576;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Llz;"
	)
	IterableNodeDeque field1577;

	@ObfuscatedSignature(
		descriptor = "(Lqq;)V"
	)
	public class132(Buffer var1) {
		this.field1576 = -1; // L: 9
		this.field1577 = new IterableNodeDeque(); // L: 10
		this.method3030(var1); // L: 28
	} // L: 29

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqq;I)V",
		garbageValue = "-2121541233"
	)
	void method3030(Buffer var1) {
		this.field1581 = var1.readLong(); // L: 32
		this.field1576 = var1.readInt(); // L: 33

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 34 35 55
			Object var3;
			if (var2 == 3) { // L: 37
				var3 = new class151(this);
			} else if (var2 == 1) { // L: 38
				var3 = new class127(this);
			} else if (var2 == 13) { // L: 39
				var3 = new class144(this);
			} else if (var2 == 4) { // L: 40
				var3 = new class136(this);
			} else if (var2 == 6) { // L: 41
				var3 = new class143(this);
			} else if (var2 == 5) { // L: 42
				var3 = new class128(this);
			} else if (var2 == 2) { // L: 43
				var3 = new class133(this);
			} else if (var2 == 7) { // L: 44
				var3 = new class126(this);
			} else if (var2 == 14) { // L: 45
				var3 = new class130(this);
			} else if (var2 == 8) { // L: 46
				var3 = new class147(this);
			} else if (var2 == 9) { // L: 47
				var3 = new class153(this);
			} else if (var2 == 10) {
				var3 = new class139(this); // L: 48
			} else if (var2 == 11) { // L: 49
				var3 = new class134(this);
			} else if (var2 == 12) { // L: 50
				var3 = new class138(this);
			} else {
				if (var2 != 15) { // L: 51
					throw new RuntimeException(""); // L: 52
				}

				var3 = new class148(this);
			}

			((class129)var3).vmethod3320(var1); // L: 53
			this.field1577.addFirst((Node)var3); // L: 54
		}

	} // L: 57

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Led;B)V",
		garbageValue = "-61"
	)
	public void method3028(ClanSettings var1) {
		if (var1.field1626 == this.field1581 && this.field1576 == var1.field1630) { // L: 60
			for (class129 var2 = (class129)this.field1577.last(); var2 != null; var2 = (class129)this.field1577.previous()) { // L: 61
				var2.vmethod3313(var1); // L: 62
			}

			++var1.field1630; // L: 64
		} else {
			throw new RuntimeException("");
		}
	} // L: 65
}
