import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
public class class142 extends class145 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lpu;"
	)
	@Export("ItemDefinition_fontPlain11")
	static Font ItemDefinition_fontPlain11;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2093604299
	)
	int field1640;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 236709987
	)
	int field1637;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -496094403
	)
	int field1638;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1123406813
	)
	int field1639;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lff;)V"
	)
	class142(class148 var1) {
		this.this$0 = var1;
		this.field1640 = -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "-11659242"
	)
	void vmethod3414(Buffer var1) {
		this.field1640 = var1.readUnsignedShort();
		this.field1637 = var1.readInt();
		this.field1638 = var1.readUnsignedByte();
		this.field1639 = var1.readUnsignedByte();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgi;I)V",
		garbageValue = "21847466"
	)
	void vmethod3415(ClanSettings var1) {
		var1.method3250(this.field1640, this.field1637, this.field1638, this.field1639);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lom;I)V",
		garbageValue = "1595932932"
	)
	public static void method3135(AbstractArchive var0) {
		StructComposition.StructDefinition_archive = var0;
	}
}
