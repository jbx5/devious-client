import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gt")
public class class161 {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		longValue = 2768228157651656441L
	)
	long field1780;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = -310999304387576023L
	)
	public long field1781;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpr;"
	)
	IterableNodeDeque field1786;

	@ObfuscatedSignature(
		descriptor = "(Lur;)V"
	)
	public class161(Buffer var1) {
		this.field1781 = -1L;
		this.field1786 = new IterableNodeDeque();
		this.method3356(var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;B)V",
		garbageValue = "79"
	)
	void method3356(Buffer var1) {
		this.field1780 = var1.readLong();
		this.field1781 = var1.readLong();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 1) {
				var3 = new class156(this);
			} else if (var2 == 4) {
				var3 = new class167(this);
			} else if (var2 == 3) {
				var3 = new class152(this);
			} else if (var2 == 2) {
				var3 = new class150(this);
			} else {
				if (var2 != 5) {
					throw new RuntimeException("");
				}

				var3 = new class157(this);
			}

			((class160)var3).vmethod3414(var1);
			this.field1786.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgi;B)V",
		garbageValue = "2"
	)
	public void method3357(ClanChannel var1) {
		if (this.field1780 == var1.key && this.field1781 == var1.field1795) {
			for (class160 var2 = (class160)this.field1786.last(); var2 != null; var2 = (class160)this.field1786.previous()) {
				var2.vmethod3413(var1);
			}

			++var1.field1795;
		} else {
			throw new RuntimeException("");
		}
	}
}
