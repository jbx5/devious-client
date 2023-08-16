import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
public class class150 extends class143 {
	@ObfuscatedName("au")
	boolean field1709;
	@ObfuscatedName("ae")
	byte field1706;
	@ObfuscatedName("ao")
	byte field1707;
	@ObfuscatedName("at")
	byte field1705;
	@ObfuscatedName("ac")
	byte field1708;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfn;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfn;)V"
	)
	class150(class146 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V",
		garbageValue = "209179459"
	)
	void vmethod3337(Buffer var1) {
		this.field1709 = var1.readUnsignedByte() == 1;
		this.field1706 = var1.readByte();
		this.field1707 = var1.readByte();
		this.field1705 = var1.readByte();
		this.field1708 = var1.readByte();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lfi;B)V",
		garbageValue = "73"
	)
	void vmethod3339(ClanSettings var1) {
		var1.allowGuests = this.field1709;
		var1.field1746 = this.field1706;
		var1.field1734 = this.field1707;
		var1.field1735 = this.field1705;
		var1.field1736 = this.field1708;
	}
}
