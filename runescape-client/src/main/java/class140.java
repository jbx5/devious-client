import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("en")
public class class140 extends class144 {
	@ObfuscatedName("v")
	String field1623;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	1314589285)

	int field1625;
	@ObfuscatedName("h")
	byte field1624;

	@ObfuscatedSignature(descriptor = 
	"Lez;")

	final class145 this$0;

	@ObfuscatedSignature(descriptor = 
	"(Lez;)V")

	class140(class145 var1) {
		this.this$0 = var1;
		this.field1623 = null;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;S)V", garbageValue = 
	"3239")

	void vmethod3096(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

		this.field1623 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1625 = var1.readUnsignedShort();
		this.field1624 = var1.readByte();
		var1.readLong();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Ley;B)V", garbageValue = 
	"26")

	void vmethod3093(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember();
		var2.username = new Username(this.field1623);
		var2.world = this.field1625;
		var2.rank = this.field1624;
		var1.addMember(var2);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1416883390")

	public static void method2985() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5);
	}
}