import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fw")
public class class140 extends class143 {
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -555177957
	)
	static int field1625;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1585899641
	)
	int field1620;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2061170227
	)
	int field1621;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1553349731
	)
	int field1623;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -185810587
	)
	int field1622;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfm;)V"
	)
	class140(class146 var1) {
		this.this$0 = var1;
		this.field1620 = -1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-411371469"
	)
	void vmethod3531(Buffer var1) {
		this.field1620 = var1.readUnsignedShort();
		this.field1621 = var1.readInt();
		this.field1623 = var1.readUnsignedByte();
		this.field1622 = var1.readUnsignedByte();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "1048713263"
	)
	void vmethod3529(ClanSettings var1) {
		var1.method3390(this.field1620, this.field1621, this.field1623, this.field1622);
	}
}
