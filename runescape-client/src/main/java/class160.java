import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
public class class160 {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		longValue = 2945497093796173499L
	)
	long field1756;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		longValue = 793512225881550387L
	)
	long field1757;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	IterableNodeDeque field1761;

	@ObfuscatedSignature(
		descriptor = "(Lty;)V"
	)
	public class160(Buffer var1) {
		this.field1757 = -1L;
		this.field1761 = new IterableNodeDeque();
		this.method3338(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;I)V",
		garbageValue = "-1382103151"
	)
	void method3338(Buffer var1) {
		this.field1756 = var1.readLong();
		this.field1757 = var1.readLong();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 1) {
				var3 = new class155(this);
			} else if (var2 == 4) {
				var3 = new class166(this);
			} else if (var2 == 3) {
				var3 = new class151(this);
			} else if (var2 == 2) {
				var3 = new class149(this);
			} else {
				if (var2 != 5) {
					throw new RuntimeException("");
				}

				var3 = new class156(this);
			}

			((class159)var3).vmethod3411(var1);
			this.field1761.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgh;I)V",
		garbageValue = "1629184454"
	)
	public void method3339(ClanChannel var1) {
		if (this.field1756 == var1.key && this.field1757 == var1.field1773) {
			for (class159 var2 = (class159)this.field1761.last(); var2 != null; var2 = (class159)this.field1761.previous()) {
				var2.vmethod3404(var1);
			}

			++var1.field1773;
		} else {
			throw new RuntimeException("");
		}
	}
}
