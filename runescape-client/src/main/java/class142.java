import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fy")
public class class142 extends class145 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1582818177
	)
	int field1655;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 922464915
	)
	int field1657;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1710401271
	)
	int field1656;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -650869497
	)
	int field1660;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfg;"
	)
	final class148 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfg;)V"
	)
	class142(class148 var1) {
		this.this$0 = var1;
		this.field1655 = -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "584073694"
	)
	void vmethod3512(Buffer var1) {
		this.field1655 = var1.readUnsignedShort();
		this.field1657 = var1.readInt();
		this.field1656 = var1.readUnsignedByte();
		this.field1660 = var1.readUnsignedByte();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgt;I)V",
		garbageValue = "406847376"
	)
	void vmethod3513(ClanSettings var1) {
		var1.method3391(this.field1655, this.field1657, this.field1656, this.field1660);
	}
}
