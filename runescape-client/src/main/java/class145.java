import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
public class class145 {
	@ObfuscatedName("eh")
	@ObfuscatedSignature(descriptor = 
	"Llu;")

	@Export("archive7")
	static Archive archive7;
	@ObfuscatedName("v")
	@ObfuscatedGetter(longValue = 
	-7880473209241660409L)

	long field1651;
	@ObfuscatedName("o")
	@ObfuscatedGetter(longValue = 
	7161139519803830859L)

	long field1644;
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Lld;")

	IterableNodeDeque field1647;

	@ObfuscatedSignature(descriptor = 
	"(Lpd;)V")

	public class145(Buffer var1) {
		this.field1644 = -1L;
		this.field1647 = new IterableNodeDeque();
		this.method3024(var1);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;I)V", garbageValue = 
	"1820436577")

	void method3024(Buffer var1) {
		this.field1651 = var1.readLong();
		this.field1644 = var1.readLong();

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
			Object var3;
			if (var2 == 1) {
				var3 = new class140(this);
			} else if (var2 == 4) {
				var3 = new class151(this);
			} else if (var2 == 3) {
				var3 = new class136(this);
			} else if (var2 == 2) {
				var3 = new class134(this);
			} else {
				if (var2 != 5) {
					throw new RuntimeException("");
				}

				var3 = new class141(this);
			}

			((class144) (var3)).vmethod3096(var1);
			this.field1647.addFirst(((Node) (var3)));
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Ley;I)V", garbageValue = 
	"451732035")

	public void method3030(ClanChannel var1) {
		if ((this.field1651 == var1.key) && (var1.field1664 == this.field1644)) {
			for (class144 var2 = ((class144) (this.field1647.last())); var2 != null; var2 = ((class144) (this.field1647.previous()))) {
				var2.vmethod3093(var1);
			}

			++var1.field1664;
		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(descriptor = 
	"(III)V", garbageValue = 
	"1527642591")

	static void method3032(int var0, int var1) {
		if ((Interpreter.clientPreferences.method2288() != 0) && (var0 != (-1))) {
			WorldMapSection2.method4561(class268.archive11, var0, 0, Interpreter.clientPreferences.method2288(), false);
			Client.field731 = true;
		}

	}
}