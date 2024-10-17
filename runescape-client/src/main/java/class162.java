import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
public class class162 extends class166 {
	@ObfuscatedName("ap")
	String field1792;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -186548891
	)
	int field1791;
	@ObfuscatedName("ak")
	byte field1793;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgg;"
	)
	final class167 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgg;)V"
	)
	class162(class167 var1) {
		this.this$0 = var1;
		this.field1792 = null;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V",
		garbageValue = "-303680000"
	)
	void vmethod3816(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

		this.field1792 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1791 = var1.readUnsignedShort();
		this.field1793 = var1.readByte();
		var1.readLong();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgw;I)V",
		garbageValue = "-152326479"
	)
	void vmethod3817(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember();
		var2.username = new Username(this.field1792);
		var2.world = this.field1791;
		var2.rank = this.field1793;
		var1.addMember(var2);
	}
}
