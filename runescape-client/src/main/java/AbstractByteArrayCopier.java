import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nn")
@Implements("AbstractByteArrayCopier")
public abstract class AbstractByteArrayCopier {
	@ObfuscatedName("ft")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("archive4")
	static Archive archive4;

	AbstractByteArrayCopier() {
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "1381422717"
	)
	@Export("get")
	abstract byte[] get();

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-2137536013"
	)
	@Export("set")
	public abstract void set(byte[] var1);

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Lfy;",
		garbageValue = "-1206517900"
	)
	static class140 method6759(int var0) {
		class140[] var1 = new class140[]{class140.field1619, class140.field1615, class140.field1614, class140.field1611, class140.field1612, class140.field1616, class140.field1617, class140.field1618, class140.field1613};
		class140 var2 = (class140)SequenceDefinition.findEnumerated(var1, var0);
		if (var2 == null) {
			var2 = class140.field1613;
		}

		return var2;
	}
}
