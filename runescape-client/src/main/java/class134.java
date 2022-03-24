import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
public class class134 extends class144 {
	@ObfuscatedName("rc")
	@ObfuscatedSignature(descriptor = 
	"Leh;")

	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 
	-1229066847)

	@Export("gameCyclesToDo")
	static int gameCyclesToDo;
	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 
	1626167143)

	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-1869646227)

	int field1566;
	@ObfuscatedName("o")
	byte field1564;
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	-1456142123)

	int field1565;
	@ObfuscatedName("g")
	String field1567;

	@ObfuscatedSignature(descriptor = 
	"Lez;")

	final class145 this$0;

	@ObfuscatedSignature(descriptor = 
	"(Lez;)V")

	class134(class145 var1) {
		this.this$0 = var1;
		this.field1566 = -1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;S)V", garbageValue = 
	"3239")

	void vmethod3096(Buffer var1) {
		this.field1566 = var1.readUnsignedShort();
		this.field1564 = var1.readByte();
		this.field1565 = var1.readUnsignedShort();
		var1.readLong();
		this.field1567 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Ley;B)V", garbageValue = 
	"26")

	void vmethod3093(ClanChannel var1) {
		ClanChannelMember var2 = ((ClanChannelMember) (var1.members.get(this.field1566)));
		var2.rank = this.field1564;
		var2.world = this.field1565;
		var2.username = new Username(this.field1567);
	}
}