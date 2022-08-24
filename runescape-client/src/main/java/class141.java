import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
@ObfuscatedName("ex")
public class class141 extends class144 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 1063144767)
	static int field1634;

	@ObfuscatedName("bp")
	@ObfuscatedGetter(intValue = -1823717349)
	static int field1635;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = -283678157)
	int field1633;

	@ObfuscatedName("h")
	byte field1632;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 93816935)
	int field1631;

	@ObfuscatedName("v")
	String field1630;

	@ObfuscatedSignature(descriptor = "Let;")
	final class145 this$0;

	@ObfuscatedSignature(descriptor = "(Let;)V")
	class141(class145 var1) {
		this.this$0 = var1;
		this.field1633 = -1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lqr;I)V", garbageValue = "1539485988")
	void vmethod3074(Buffer var1) {
		var1.readUnsignedByte();
		this.field1633 = var1.readUnsignedShort();
		this.field1632 = var1.readByte();
		this.field1631 = var1.readUnsignedShort();
		var1.readLong();
		this.field1630 = var1.readStringCp1252NullTerminated();
		var1.readUnsignedByte();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Lec;I)V", garbageValue = "-1270425284")
	void vmethod3073(ClanChannel var1) {
		ClanChannelMember var2 = ((ClanChannelMember) (var1.members.get(this.field1633)));
		var2.rank = this.field1632;
		var2.world = this.field1631;
		var2.username = new Username(this.field1630);
	}
}