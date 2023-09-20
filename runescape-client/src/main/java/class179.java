import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gg")
public class class179 {
	@ObfuscatedName("ax")
	public String field1858;
	@ObfuscatedName("ao")
	public float[] field1860;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1924778281
	)
	public int field1862;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1416309461
	)
	public int field1863;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -402545681
	)
	public int field1864;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	final class172 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgr;)V"
	)
	class179(class172 var1) {
		this.this$0 = var1;
		this.field1860 = new float[4];
		this.field1862 = 1;
		this.field1863 = 1;
		this.field1864 = 0;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Lfl;",
		garbageValue = "-1919119231"
	)
	static class134 method3553(int var0) {
		class134[] var1 = new class134[]{class134.field1591, class134.field1573, class134.field1574, class134.field1575, class134.field1576, class134.field1577, class134.field1578, class134.field1587, class134.field1580, class134.field1581, class134.field1583, class134.field1589, class134.field1584, class134.field1585, class134.field1586, class134.field1582, class134.field1579};
		class134 var2 = (class134)SequenceDefinition.findEnumerated(var1, var0);
		if (var2 == null) {
			var2 = class134.field1591;
		}

		return var2;
	}
}
