import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
public class class157 extends class161 {
	@ObfuscatedName("aq")
	String field1760;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 254804219
	)
	int field1761;
	@ObfuscatedName("al")
	byte field1759;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lga;"
	)
	final class162 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lga;)V"
	)
	class157(class162 var1) {
		this.this$0 = var1;
		this.field1760 = null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "1174207862"
	)
	void vmethod3504(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

		this.field1760 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1761 = var1.readUnsignedShort();
		this.field1759 = var1.readByte();
		var1.readLong();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "378355771"
	)
	void vmethod3509(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember();
		var2.username = new Username(this.field1760);
		var2.world = this.field1761;
		var2.rank = this.field1759;
		var1.addMember(var2);
	}

	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1551771971"
	)
	static void method3399(boolean var0) {
		Client.leftClickOpensMenu = var0;
	}
}
