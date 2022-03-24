import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ff")
public class class168 {
	@ObfuscatedName("h")
	public short[] field1804;
	@ObfuscatedName("g")
	public short[] field1805;

	public class168(int var1) {
		ItemComposition var2 = class67.ItemDefinition_get(var1);
		if (var2.method3763()) {
			this.field1804 = new short[var2.recolorTo.length];
			System.arraycopy(var2.recolorTo, 0, this.field1804, 0, this.field1804.length);
		}

		if (var2.method3711()) {
			this.field1805 = new short[var2.retextureTo.length];
			System.arraycopy(var2.retextureTo, 0, this.field1805, 0, this.field1805.length);
		}

	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"-1915861434")

	static final int method3324() {
		return Client.menuOptionsCount - 1;
	}
}