import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
public class class159 extends class163 {
	@ObfuscatedName("ak")
	String field1788;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1051872717
	)
	int field1790;
	@ObfuscatedName("aj")
	byte field1786;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgx;"
	)
	final class164 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgx;)V"
	)
	class159(class164 var1) {
		this.this$0 = var1;
		this.field1788 = null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lua;I)V",
		garbageValue = "-406894472"
	)
	void vmethod3479(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

		this.field1788 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1790 = var1.readUnsignedShort();
		this.field1786 = var1.readByte();
		var1.readLong();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lgo;I)V",
		garbageValue = "-472458599"
	)
	void vmethod3480(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember();
		var2.username = new Username(this.field1788);
		var2.world = this.field1790;
		var2.rank = this.field1786;
		var1.addMember(var2);
	}
}
