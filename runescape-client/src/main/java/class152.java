import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
public class class152 extends class145 {
	@ObfuscatedName("jq")
	@Export("regions")
	static int[] regions;
	@ObfuscatedName("ac")
	boolean field1689;
	@ObfuscatedName("al")
	byte field1687;
	@ObfuscatedName("ak")
	byte field1684;
	@ObfuscatedName("ax")
	byte field1685;
	@ObfuscatedName("ao")
	byte field1686;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lff;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lff;)V"
	)
	class152(class148 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lul;I)V",
		garbageValue = "-11659242"
	)
	void vmethod3414(Buffer var1) {
		this.field1689 = var1.readUnsignedByte() == 1;
		this.field1687 = var1.readByte();
		this.field1684 = var1.readByte();
		this.field1685 = var1.readByte();
		this.field1686 = var1.readByte();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgi;I)V",
		garbageValue = "21847466"
	)
	void vmethod3415(ClanSettings var1) {
		var1.allowGuests = this.field1689;
		var1.field1709 = this.field1687;
		var1.field1723 = this.field1684;
		var1.field1710 = this.field1685;
		var1.field1700 = this.field1686;
	}
}
