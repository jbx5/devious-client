import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gp")
public class class163 extends class166 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -151712853
	)
	int field1804;
	@ObfuscatedName("ae")
	byte field1800;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1334647025
	)
	int field1802;
	@ObfuscatedName("am")
	String field1801;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgj;"
	)
	final class167 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgj;)V"
	)
	class163(class167 var1) {
		this.this$0 = var1;
		this.field1804 = -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lvf;B)V",
		garbageValue = "0"
	)
	void vmethod3761(Buffer var1) {
		var1.readUnsignedByte();
		this.field1804 = var1.readUnsignedShort();
		this.field1800 = var1.readByte();
		this.field1802 = var1.readUnsignedShort();
		var1.readLong();
		this.field1801 = var1.readStringCp1252NullTerminated();
		var1.readUnsignedByte();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lgm;I)V",
		garbageValue = "-1593238865"
	)
	void vmethod3762(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1804);
		var2.rank = this.field1800;
		var2.world = this.field1802;
		var2.username = new Username(this.field1801);
	}
}
