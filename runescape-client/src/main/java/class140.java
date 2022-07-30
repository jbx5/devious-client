import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
@ObfuscatedName("eu")
public class class140 extends class144 {
	@ObfuscatedName("o")
	String field1637;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 1006898047)
	int field1638;

	@ObfuscatedName("f")
	byte field1639;

	@ObfuscatedSignature(descriptor = "Let;")
	final class145 this$0;

	@ObfuscatedSignature(descriptor = "(Let;)V")
	class140(class145 var1) {
		this.this$0 = var1;
		this.field1637 = null;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lqw;I)V", garbageValue = "-1897546377")
	void vmethod3146(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}
		this.field1637 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1638 = var1.readUnsignedShort();
		this.field1639 = var1.readByte();
		var1.readLong();
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Ley;I)V", garbageValue = "-406744366")
	void vmethod3145(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember();
		var2.username = new Username(this.field1637);
		var2.world = this.field1638;
		var2.rank = this.field1639;
		var1.addMember(var2);
	}
}