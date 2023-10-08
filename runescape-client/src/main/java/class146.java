import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
public class class146 extends class145 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1371548903
	)
	int field1651;
	@ObfuscatedName("al")
	boolean field1652;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lff;)V"
	)
	class146(class148 var1) {
		this.this$0 = var1;
		this.field1651 = -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "-11659242"
	)
	void vmethod3414(Buffer var1) {
		this.field1651 = var1.readUnsignedShort();
		this.field1652 = var1.readUnsignedByte() == 1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgi;I)V",
		garbageValue = "21847466"
	)
	void vmethod3415(ClanSettings var1) {
		var1.method3249(this.field1651, this.field1652);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1923763150"
	)
	static void method3162(int var0) {
		class464.field4776 = var0;
		class464.field4775 = new class464[var0];
		class464.field4774 = 0;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1925208332"
	)
	public static boolean method3161(int var0) {
		return (var0 & 1) != 0;
	}
}
