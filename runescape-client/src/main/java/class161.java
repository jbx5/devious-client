import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
public class class161 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = -3329713020240726457L
	)
	long field1756;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = 756066404053775467L
	)
	public long field1752;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lpm;"
	)
	IterableNodeDeque field1753;

	@ObfuscatedSignature(
		descriptor = "(Luj;)V"
	)
	public class161(Buffer var1) {
		this.field1752 = -1L;
		this.field1753 = new IterableNodeDeque();
		this.method3436(var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luj;B)V",
		garbageValue = "-62"
	)
	void method3436(Buffer var1) {
		this.field1756 = var1.readLong();
		this.field1752 = var1.readLong();

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

			((class160)var3).vmethod3497(var1);
			this.field1753.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgn;I)V",
		garbageValue = "1259262891"
	)
	public void method3437(ClanChannel var1) {
		if (var1.key == this.field1756 && this.field1752 == var1.field1772) {
			for (class160 var2 = (class160)this.field1753.last(); var2 != null; var2 = (class160)this.field1753.previous()) {
				var2.vmethod3501(var1);
			}

			++var1.field1772;
		} else {
			throw new RuntimeException("");
		}
	}
}
