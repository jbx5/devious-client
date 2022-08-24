import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("en")
public class class151 extends class144 {
	@ObfuscatedName("s")
	String field1692;

	@ObfuscatedName("h")
	byte field1688;

	@ObfuscatedName("w")
	byte field1689;

	@ObfuscatedSignature(descriptor = "Let;")
	final class145 this$0;

	@ObfuscatedSignature(descriptor = "(Let;)V")
	class151(class145 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lqr;I)V", garbageValue = "1539485988")
	void vmethod3074(Buffer var1) {
		this.field1692 = var1.readStringCp1252NullTerminatedOrNull();
		if (this.field1692 != null) {
			var1.readUnsignedByte();
			this.field1688 = var1.readByte();
			this.field1689 = var1.readByte();
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Lec;I)V", garbageValue = "-1270425284")
	void vmethod3073(ClanChannel var1) {
		var1.name = this.field1692;
		if (this.field1692 != null) {
			var1.field1666 = this.field1688;
			var1.field1669 = this.field1689;
		}
	}
}