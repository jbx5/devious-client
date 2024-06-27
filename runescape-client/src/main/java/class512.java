import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tq")
public abstract class class512 {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1131756953
	)
	int field5138;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -932997329
	)
	int field5140;
	@ObfuscatedName("ai")
	double field5139;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -386333095
	)
	int field5141;

	class512(int var1, int var2) {
		this.field5138 = 0;
		this.field5140 = 0;
		this.field5139 = 0.0D;
		this.field5141 = 0;
		this.field5138 = var1;
		this.field5140 = 0;
		this.field5141 = var2 >= 0 && var2 <= 27 ? var2 : 0;
		this.field5139 = HttpHeaders.method8363(this.field5140, this.field5138, this.field5141);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2145790593"
	)
	public void method8974() {
		if (this.field5140 < this.field5138) {
			++this.field5140;
			this.field5139 = HttpHeaders.method8363(this.field5140, this.field5138, this.field5141);
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)D",
		garbageValue = "1207550874"
	)
	double method8971() {
		return this.field5139;
	}

	@ObfuscatedName("ow")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	static void method8981(int var0) {
		for (IntegerNode var1 = (IntegerNode)Client.widgetFlags.first(); var1 != null; var1 = (IntegerNode)Client.widgetFlags.next()) {
			if ((var1.key >> 48 & 65535L) == (long)var0) {
				var1.remove();
			}
		}

	}
}
