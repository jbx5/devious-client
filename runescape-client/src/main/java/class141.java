import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ed")
public class class141 extends class144 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-705325855)

	int field1616;
	@ObfuscatedName("c")
	byte field1617;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	-1660871845)

	int field1618;
	@ObfuscatedName("f")
	String field1619;

	@ObfuscatedSignature(descriptor = 
	"Ler;")

	final class145 this$0;

	@ObfuscatedSignature(descriptor = 
	"(Ler;)V")

	class141(class145 var1) {
		this.this$0 = var1;
		this.field1616 = -1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;B)V", garbageValue = 
	"23")

	void vmethod3152(Buffer var1) {
		var1.readUnsignedByte();
		this.field1616 = var1.readUnsignedShort();
		this.field1617 = var1.readByte();
		this.field1618 = var1.readUnsignedShort();
		var1.readLong();
		this.field1619 = var1.readStringCp1252NullTerminated();
		var1.readUnsignedByte();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Lea;I)V", garbageValue = 
	"1764669808")

	void vmethod3153(ClanChannel var1) {
		ClanChannelMember var2 = ((ClanChannelMember) (var1.members.get(this.field1616)));
		var2.rank = this.field1617;
		var2.world = this.field1618;
		var2.username = new Username(this.field1619);
	}
}