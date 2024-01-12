import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
public class class146 {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = -4675098848837362585L
	)
	long field1646;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 228954545
	)
	public int field1645;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	IterableNodeDeque field1647;

	@ObfuscatedSignature(
		descriptor = "(Luk;)V"
	)
	public class146(Buffer var1) {
		this.field1645 = -1;
		this.field1647 = new IterableNodeDeque();
		this.method3252(var1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-116965688"
	)
	void method3252(Buffer var1) {
		this.field1646 = var1.readLong();
		this.field1645 = var1.readInt();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 3) {
				var3 = new class165(this);
			} else if (var2 == 1) {
				var3 = new class141(this);
			} else if (var2 == 13) {
				var3 = new class158(this);
			} else if (var2 == 4) {
				var3 = new class150(this);
			} else if (var2 == 6) {
				var3 = new class157(this);
			} else if (var2 == 5) {
				var3 = new class142(this);
			} else if (var2 == 2) {
				var3 = new class147(this);
			} else if (var2 == 7) {
				var3 = new class140(this);
			} else if (var2 == 14) {
				var3 = new class144(this);
			} else if (var2 == 8) {
				var3 = new class161(this);
			} else if (var2 == 9) {
				var3 = new class167(this);
			} else if (var2 == 10) {
				var3 = new class153(this);
			} else if (var2 == 11) {
				var3 = new class148(this);
			} else if (var2 == 12) {
				var3 = new class152(this);
			} else {
				if (var2 != 15) {
					throw new RuntimeException("");
				}

				var3 = new class162(this);
			}

			((class143)var3).vmethod3531(var1);
			this.field1647.addFirst((Node)var3);
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lfn;S)V",
		garbageValue = "17442"
	)
	public void method3253(ClanSettings var1) {
		if (this.field1646 == var1.field1694 && this.field1645 == var1.field1716) {
			for (class143 var2 = (class143)this.field1647.last(); var2 != null; var2 = (class143)this.field1647.previous()) {
				var2.vmethod3529(var1);
			}

			++var1.field1716;
		} else {
			throw new RuntimeException("");
		}
	}
}
