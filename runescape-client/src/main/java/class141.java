import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
public class class141 extends class145 {
	@ObfuscatedName("c")
	String field1654;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = 1572942225
	)
	int field1657;
	@ObfuscatedName("f")
	byte field1656;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lem;)V"
	)
	class141(class146 var1) {
		this.this$0 = var1;
		this.field1654 = null; // L: 55
	} // L: 59

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqq;I)V",
		garbageValue = "-64301329"
	)
	void vmethod3300(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 62
			--var1.offset; // L: 63
			var1.readLong(); // L: 64
		}

		this.field1654 = var1.readStringCp1252NullTerminatedOrNull(); // L: 66
		this.field1657 = var1.readUnsignedShort(); // L: 67
		this.field1656 = var1.readByte(); // L: 68
		var1.readLong(); // L: 69
	} // L: 70

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ler;B)V",
		garbageValue = "97"
	)
	void vmethod3302(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember(); // L: 73
		var2.username = new Username(this.field1654); // L: 74
		var2.world = this.field1657; // L: 75
		var2.rank = this.field1656; // L: 76
		var1.addMember(var2); // L: 77
	} // L: 78
}
