import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
public class class131 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(longValue = 
	6041252942062073189L)

	long field1543;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	-13457487)

	int field1542;
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Lld;")

	IterableNodeDeque field1548;

	@ObfuscatedSignature(descriptor = 
	"(Lpd;)V")

	public class131(Buffer var1) {
		this.field1542 = -1;
		this.field1548 = new IterableNodeDeque();
		this.method2854(var1);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;B)V", garbageValue = 
	"71")

	void method2854(Buffer var1) {
		this.field1543 = var1.readLong();
		this.field1542 = var1.readInt();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 3) {
				var3 = new class150(this);
			} else if (var2 == 1) {
				var3 = new class126(this);
			} else if (var2 == 13) {
				var3 = new class143(this);
			} else if (var2 == 4) {
				var3 = new class135(this);
			} else if (var2 == 6) {
				var3 = new class142(this);
			} else if (var2 == 5) {
				var3 = new class127(this);
			} else if (var2 == 2) {
				var3 = new class132(this);
			} else if (var2 == 7) {
				var3 = new class125(this);
			} else if (var2 == 14) {
				var3 = new class129(this);
			} else if (var2 == 8) {
				var3 = new class146(this);
			} else if (var2 == 9) {
				var3 = new class152(this);
			} else if (var2 == 10) {
				var3 = new class138(this);
			} else if (var2 == 11) {
				var3 = new class133(this);
			} else if (var2 == 12) {
				var3 = new class137(this);
			} else {
				if (var2 != 15) {
					throw new RuntimeException("");
				}

				var3 = new class147(this);
			}

			((class128) (var3)).vmethod3107(var1);
			this.field1548.addFirst(((Node) (var3)));
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Leh;I)V", garbageValue = 
	"290065842")

	public void method2851(ClanSettings var1) {
		if ((this.field1543 == var1.field1607) && (this.field1542 == var1.field1598)) {
			for (class128 var2 = ((class128) (this.field1548.last())); var2 != null; var2 = ((class128) (this.field1548.previous()))) {
				var2.vmethod3104(var1);
			}

			++var1.field1598;
		} else {
			throw new RuntimeException("");
		}
	}
}